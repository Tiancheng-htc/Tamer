    @Override
    public void execute() throws BuildException {
        try {
            Integer.parseInt(version);
        } catch (NumberFormatException e) {
            throw new BuildException("Error: 'version' property must only contain digits");
        }
        if (destfile == null) {
            throw new BuildException("Error: 'destfile' property must be set.");
        }
        if (modulename == null) {
            modulename = new File(destfile).getName().toUpperCase();
            if (modulename.endsWith(".MAR")) {
                modulename = modulename.substring(0, modulename.length() - 4);
            }
        } else {
            modulename = modulename.toUpperCase();
        }
        if (parts.size() == 0) {
            throw new BuildException("Error: at least on 'part' task must exists in a mar configuration.");
        }
        String partsString = parts.get(0).getName();
        for (int i = 1; i < parts.size(); i++) {
            partsString += "," + parts.get(i).getName();
        }
        if (verbose) {
            System.out.println("Generating Module Archive : " + modulename);
            System.out.println("  Version                 : " + version);
            System.out.println("  Default Description     : " + (description == null ? "" : description));
            System.out.println("  Destination             : " + destfile);
            System.out.println("  Parts                   : " + partsString);
            System.out.println("");
        }
        Properties desc = new Properties();
        desc.setProperty(MARFileParser.MARDESCRIPTOR_VERSION, version);
        if (description != null) {
            desc.setProperty(MARFileParser.MARDESCRIPTOR_DEFAULTDESCRIPTION, description);
        }
        desc.setProperty(MARFileParser.MARDESCRIPTOR_MODULENAME, modulename);
        desc.setProperty(MARFileParser.MARDESCRIPTOR_PARTS, partsString);
        try {
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(destfile));
            out.putNextEntry(new ZipEntry(MARFileParser.MARDESCRIPTOR_PATH));
            desc.store(out, "MAR Descriptor generated by ANT task.");
            out.closeEntry();
            for (PartAntTask part : parts) {
                zipFilesInPart(out, part);
            }
            out.close();
        } catch (IOException e) {
            throw new BuildException("Error: IO Exception when generated MAR file : " + e.getMessage());
        }
        super.execute();
    }