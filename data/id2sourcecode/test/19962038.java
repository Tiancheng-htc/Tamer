    private static final void makeWF_BasicRubyWriterFormat_jwf(Hashtable pWriterFormats) {
        pWriterFormats.put("BasicRubyWriterFormat.jwf", "!<header>\n\n\n\n!<{import># section:import\n!<import>!<}import>\n\n\n\n!<{require># section:require\n!<require>!<}require>\n\n\n\nclass $<main.CodeWriter> $<{ruby.CodeWriter.extends> < $<ruby.CodeWriter.extends> $<}ruby.CodeWriter.extends> \n  \n  # Constants << #\n   \n  # Command line arguments\n  WRITER__ARGUMENT_CONTROL_PREFIX         = \"$<main.CodeWriter.argument.ControlPrefix>\"\n  WRITER__ARGUMENT_OutputFolder           = \"$<main.CodeWriter.argument.name.OutputFolder>\"\n  WRITER__ARGUMENT_MetaPropFile           = \"$<main.CodeWriter.argument.name.MetaPropFile>\"\n  WRITER__ARGUMENT_BackupFolder           = \"$<main.CodeWriter.argument.name.BackupFolder>\"\n  WRITER__ARGUMENT_NoBackup               = \"$<main.CodeWriter.argument.name.NoBackup>\"\n  \n  # User Interface text message parts\n  WRITER__UITEXT_Method                   = \"method \"\n  WRITER__UITEXT_Main                     = \"main \"\n  WRITER__UITEXT_ExceptionIn              = \"Exception in \"\n  WRITER__UITEXT_ColonNewLine             = \":\\n\"\n  WRITER__UITEXT_NewLine                  = \"\\n\"\n  WRITER__UITEXT_Section                  = \"section \"\n  WRITER__UITEXT_SavedFile                = \"Saved file:       \"\n  WRITER__UITEXT_UnableToSaveFile         = \"Unable to save file: \"\n  WRITER__UITEXT_UnableToBackupFile       = \"Unable to backup file: \"\n  WRITER__UITEXT_ToBackupFolder           = \" to backup folder: \"\n  WRITER__UITEXT_BackupFolderColon        = \"Backup folder: \"\n  WRITER__UITEXT_BackupFolderExistFailure = \" does not exist and cannot be created.\"\n  WRITER__UITEXT_BackupFolderNotAFolder   = \" is not a folder.\"\n  WRITER__UITEXT_BackupFolderNotWritable  = \" is not writable.\"\n  WRITER__UITEXT_CodeWriterState          = \"Code Writer State: \"\n  WRITER__UITEXT_GetFileIndexEquals       = \"\\n_getFileIndex()    = \"\n  WRITER__UITEXT_GetFullFileNameEquals    = \"\\n_getFullFileName() = \"\n  WRITER__UITEXT_GetOutputFolderEquals    = \"\\n_getOutputFolder() = \"\n  WRITER__UITEXT_ErrorHeader              = \"\\n\\n--- CodeWriter Error Description Start ---\\n\\n\"\n  WRITER__UITEXT_ErrorFooter              = \"\\n--- CodeWriter Error Description End -----\\n\\n\"\n  WRITER__UITEXT_UnableToLoadMetaProps    = \"Unable to load metadata from file: \"\n  WRITER__UITEXT_PlaceHolderException     = \"This placeholder Exception should never be thrown: there is an error in the WriterFormat.\"\n\n  # String constants\n  WRITER__STRING_empty                    = \"\"\n  WRITER__STRING_dot                      = \".\"\n  WRITER__STRING_separator                = \"$<\\jostraca.system.fileSeparator>\"\n\n  # Constants >> #\n  \n\n  \n  \n  # Writer Variables << #\n  \n  def writer__initInstanceVars()\n    @writer__iFileNameRoots         = []                    # generated file name roots\n    @writer__iNumFiles              = 0                     # number of generated files\n    \n    @writer__iFileNamePrefix        = WRITER__STRING_empty  # failsafe default\n    @writer__iFileNameSuffix        = WRITER__STRING_empty  # failsafe default\n  \n    @writer__iBackupPrefix          = WRITER__STRING_empty  # failsafe default\n    @writer__iBackupSuffix          = WRITER__STRING_empty  # failsafe default\n  \n    @writer__iCurrentText           = WRITER__STRING_empty  # current text\n    @writer__iCurrentFileIndex      = 0                     # current file index\n  \n    @writer__iArgs                  = []                    # cmd line args\n    @writer__iNumArgs               = 0                     # number of cmd line args\n    @writer__iUserArgs              = []                    # user cmd line args\n    @writer__iNumUserArgs           = 0                     # number of user cmd line args\n  \n    @writer__iSave                  = true                  # save generated code to disk\n    @writer__iBackup                = true                  # make backups\n  \n    @writer__iOutputFolder          = WRITER__STRING_dot    # written code is output to this folder\n    @writer__iBackupFolder          = WRITER__STRING_dot    # overwritten files are placed here\n    @writer__iMetaPropFile          = WRITER__STRING_empty  # metadata properties file path\n\n    @writer__iProperties            = {}                    # lookup table for compile time properties\n    @writer__iPropertiesInit        = false                 # true => lookup table initialiased\n  end  \n\n  # Writer Variables >> #\n  \n  \n\n  \n  !<{support># version 0.1 compatibility # section:support\n  !<support>!<}support>\n\n\n\n  !<{declare># section:declare\n  !<declare>!<}declare>\n  \n    \n  \n  # Execute.\n  def $<main.CodeWriter>.main( pArgs )\n    begin\n      codeWriter = $<main.CodeWriter>.new\n      codeWriter.writer__initialize()\n      codeWriter.writer__handleArgs( pArgs )\n      codeWriter.writer__write()\n    rescue\n      codeWriter.writer__handleException( WRITER__UITEXT_ExceptionIn + WRITER__UITEXT_Method + WRITER__UITEXT_Main, $! )      \n    end\n  end\n\n\n\n\n  # Writer Services << #\n  \n  # Initialize.\n  def writer__initialize()\n    @writer__iCurrentFileIndex = 0\n    writer__initInstanceVars()\n    writer__setDefaults()\n  end\n  \n  \n\n  # Main file generation loop. Template script is placed here in the body section.\n  def writer__write()\n\n    # initialize\n    writer__currentSection = \"init\"\n  \n  \n    begin\n  \n      !<{init># section:init\n      !<init>!<}init> \n  \n  \n      # write files loop\n      writer__numFiles = _getNumFiles()\n      writer__fileI    = 0\n      for writer__fileI in 0...writer__numFiles\n\n        begin\n  \n          !<{prewrite># section:prewrite\n          writer__currentSection = \"prewrite\"\n          !<prewrite>!<}prewrite> \n  \n  \n          if ! writer__startFile()\n            next\n          end\n  \n  \n          !<{body># section:body\n          writer__currentSection = \"body\"\n          !<body>!<}body> \n  \n  \n          if ! writer__endFile()\n            next\n          end\n  \n  \n          !<{postwrite># section:postwrite\n          writer__currentSection = \"postwrite\"\n          !<postwrite>!<}postwrite> \n  \n  \n        rescue\n          writer__handleException( WRITER__UITEXT_ExceptionIn + WRITER__UITEXT_Section + writer__currentSection, $! )\n        end\n  \n        writer__nextFile()       \n      end\n   \n  \n        !<{cleanup># section:cleanup \n        writer__currentSection = \"cleanup\"\n        !<cleanup>!<}cleanup> \n  \n    rescue\n      writer__handleException( WRITER__UITEXT_ExceptionIn + WRITER__UITEXT_Section + writer__currentSection, $! )\n    end\n  end\n  \n  \n  \n  # Start writing a file.\n  def writer__startFile()\n    @writer__iCurrentText = WRITER__STRING_empty\n    return true\n  end\n  \n  \n  \n  # End writing a file.\n  def writer__endFile()\n    endOK = true\n  \n    fileName = _getFullFileName()\n    filePath = _getOutputFolder() + WRITER__STRING_separator + fileName # CP!\n\n    if @writer__iBackup\n      begin\n        writer__backup( filePath, fileName, @writer__iBackupFolder )\n      rescue\n        writer__handleException( WRITER__UITEXT_UnableToBackupFile + filePath + WRITER__UITEXT_ToBackupFolder + @writer__iBackupFolder, $! )\n        endOK = false\n      end\n    end\n\n    if( endOK && @writer__iSave )\n      begin\n        _saveTextFile( filePath, @writer__iCurrentText )\n        writer__userMessage( WRITER__UITEXT_SavedFile + filePath + WRITER__UITEXT_NewLine, false )\n  \n      rescue\n        writer__handleException( WRITER__UITEXT_UnableToSaveFile + filePath, $! )\n        endOK = false\n      end\n    end\n  \n    return endOK\n  end\n  \n  \n  \n  # Move to next file.\n  def writer__nextFile()\n    @writer__iCurrentFileIndex = @writer__iCurrentFileIndex + 1\n  end\n  \n  \n  \n  # Handle command line arguments to CodeWriter.\n  def writer__handleArgs( pArgs )\n  \n    # set arg names\n    argName_OutputFolder           = WRITER__ARGUMENT_CONTROL_PREFIX + WRITER__ARGUMENT_OutputFolder\n    argName_MetaPropFile           = WRITER__ARGUMENT_CONTROL_PREFIX + WRITER__ARGUMENT_MetaPropFile\n    argName_BackupFolder           = WRITER__ARGUMENT_CONTROL_PREFIX + WRITER__ARGUMENT_BackupFolder\n    argName_NoBackup               = WRITER__ARGUMENT_CONTROL_PREFIX + WRITER__ARGUMENT_NoBackup\n  \n    # parse args\n    # ...\n  \n    numArgs = pArgs.length\n    argI    = 0\n    for argI in 0...numArgs\n      if( pArgs[argI] =~ /^#{argName_OutputFolder}(.*)/ )\n        _setOutputFolder( $1 )\n\n      elsif( pArgs[argI] =~ /^#{argName_MetaPropFile}(.*)/ )\n        _setMetaPropFile( $1 )\n\n      elsif( pArgs[argI] =~ /^#{argName_BackupFolder}(.*)/ )\n        _setBackupFolder( $1 )\n\n      elsif( argName_NoBackup = pArgs[argI] )\n        _backup( $<lang.FalseString> ); ## NOTE: -B => don't make backups\n      end\n    end\n  \n    writer__initArgs( pArgs.length, pArgs )\n  \n  end\n  \n  \n  \n  # Set defaults from configuration property set.\n  def writer__setDefaults()\n\n    $<{main.FileNameRoot>_setFileNameRoot( \"$<\\main.FileNameRoot>\" );$<}main.FileNameRoot>\n    $<{main.FileNamePrefix>_setFileNamePrefix( \"$<\\main.FileNamePrefix>\" );$<}main.FileNamePrefix>\n    $<{main.FileNameSuffix>_setFileNameSuffix( \"$<\\main.FileNameSuffix>\" );$<}main.FileNameSufffix>\n\n    $<{main.OutputFolder>_setOutputFolder( \"$<\\main.OutputFolder>\" );$<}main.OutputFolder>\n\n    $<{main.BackupFolder>_setBackupFolder( \"$<\\main.BackupFolder>\" );$<}main.BackupFolder>\n    $<{main.BackupPrefix>_setBackupPrefix( \"$<\\main.BackupPrefix>\" );$<}main.BackupPrefix>\n    $<{main.BackupSuffix>_setBackupSuffix( \"$<\\main.BackupSuffix>\" );$<}main.BackupSufffix>\n    _backup( \"$<lang.TrueString>\" == \"$<jostraca.MakeBackup>\" );\n\n  end\n  \n  \n  # Initialize command line arguments.\n  def writer__initArgs( pNumArgs, pArgs )\n    argI     = 0\n    userArgI = 0\n\n    @writer__iNumArgs     = pNumArgs\n    @writer__iArgs        = pArgs\n    @writer__iNumUserArgs = @writer__iNumArgs\n\n    for argI in 0...@writer__iNumArgs\n      if( @writer__iArgs[argI] =~ /^#{WRITER__ARGUMENT_CONTROL_PREFIX}/ )\n        @writer__iNumUserArgs = @writer__iNumUserArgs - 1;\n      end\n    end\n\n    for argI in 0...@writer__iNumArgs\n      if( @writer__iArgs[argI] =~ /^#{WRITER__ARGUMENT_CONTROL_PREFIX}/ )\n        next;\n      else \n        @writer__iUserArgs[ userArgI ] = @writer__iArgs[ argI ];\n        userArgI = userArgI + 1;\n      end\n    end     \n  end\n  \n  \n  # Print a user readable message.\n  def writer__userMessage( pMessage, pError )\n    if( pError )\n      $stderr.print( pMessage )\n    else \n    print( pMessage )\n  end\n  end\n  \n  \n  \n  # Handle exceptions: print an explanation for user.\n  def writer__handleException( pMessage, pException )\n  \n    userMsg = WRITER__UITEXT_ErrorHeader\n\n    # CP!\n    writerState = WRITER__STRING_empty\n    begin\n      writerState = writer__describeState()\n    rescue \n      # leave empty\n    end\n\n    userMsg = userMsg + writerState + pMessage + WRITER__UITEXT_ColonNewLine\n    userMsg = userMsg + pException.message + WRITER__UITEXT_NewLine\n    userMsg = userMsg + pException.backtrace.join( WRITER__UITEXT_NewLine )\n    userMsg = userMsg + WRITER__UITEXT_ErrorFooter\n  \n    writer__userMessage( userMsg, true )\n  end\n  \n  \n  \n  # Provide a concise description of the state of the CodeWriter.\n  def writer__describeState()\n    currentState                                                     \\\n      = WRITER__UITEXT_CodeWriterState                               \\\n      + WRITER__UITEXT_GetFileIndexEquals    + _getFileIndex().to_s  \\\n      + WRITER__UITEXT_GetFullFileNameEquals + _getFullFileName()    \\\n      + WRITER__UITEXT_GetOutputFolderEquals + _getOutputFolder()    \\\n      + WRITER__UITEXT_NewLine\n           \n    return currentState\n  end\n\n  \n    \n  # Backup overwritten files, if they exist.\n  # Backups have the format: [YYYYMMDDhhmmss][prefix][filename][suffix].\n  def writer__backup( pFilePath, pFileName, pBackupFolder )\n  \n    backupFolder = pBackupFolder\n\n    # check backup folder ( create if necessary )\n    if( !( FileTest.exist?(backupFolder) ) )\n      if( !( Dir.mkdir( backupFolder, 0700 ) ) )\n        raise( WRITER__UITEXT_BackupFolderColon + backupFolder + WRITER__UITEXT_BackupFolderExistFailure )\n      end\n    end\n    if( !( FileTest.directory?(backupFolder) ) )\n      raise( WRITER__UITEXT_BackupFolderColon + backupFolder + WRITER__UITEXT_BackupFolderNotAFolder )\n    end\n    if( !( FileTest.writable?(backupFolder) ) )\n      raise( WRITER__UITEXT_BackupFolderColon + backupFolder + WRITER__UITEXT_BackupFolderNotWritable )\n    end\n  \n\n    # create backup file path\n    calendar = Time.new\n\n    year_yyyy = _align( calendar.year   ,\"0\", 4, 'r' )\n    month_mm  = _align( calendar.month  ,\"0\", 2, 'r' )\n    day_dd    = _align( calendar.day    ,\"0\", 2, 'r' )\n    hour_hh   = _align( calendar.hour   ,\"0\", 2, 'r' )\n    minute_mm = _align( calendar.min    ,\"0\", 2, 'r' )\n    second_ss = _align( calendar.sec    ,\"0\", 2, 'r' )\n    dateTime  = year_yyyy + month_mm + day_dd + hour_hh + minute_mm + second_ss\n\n    backupFileName = dateTime + @writer__iBackupPrefix + pFileName + @writer__iBackupSuffix\n    backupFilePath = backupFolder + WRITER__STRING_separator + backupFileName # CP!\n      \n    # save backup file\n    if( FileTest.exist?( pFilePath ) )\n      fileContents = _loadTextFile( pFilePath )\n      _saveTextFile( backupFilePath, fileContents )\n    end\n  end\n  \n  \n  \n  # Set compile time properties.\n  def writer__initProperties()\n    metaPropFile = _getMetaPropFile()\n\n    if( \"\" != metaPropFile)\n      @writer__iProperties = {}    \n\n      begin\n        content  = _loadTextFile( metaPropFile )\n\n        content = content.gsub( /\\r\\n/, \"\\n\" )\n        content = content.gsub( /\\r/, \"\\n\" )\n\n        content.scan( /\\n\\s*(.*?)\\s*[=:]\\s*((\\\\\\s*\\n|.)*)/ ) {\n          |name,value| \n          value = value.strip\n          value = value.gsub( /\\\\\\s*\\n/, '' )\n          value = value.gsub( /\\n/, '' )\n          @writer__iProperties[name] = value    \n        }\n\n        @writer__iPropertiesInit = $<lang.TrueString>\n\n      rescue\n        self.writer__handleException( self.WRITER__UITEXT_UnableToLoadMetaProps+self._getMetaPropFile() )\n      end\n    end\n  end\n  \n  # Writer Services >> #\n  \n  \n\n\n  # Template Services (File Generation) << #\n  \n  # Set the prefix of the files to be generated. \n  def _setFileNamePrefix( pPrefix )\n    @writer__iFileNamePrefix = pPrefix\n  end\n  \n  \n\n  # Get prefix of files to be generated.\n  def _getFileNamePrefix()\n    return @writer__iFileNamePrefix\n  end\n  \n  \n  \n  # Set the suffix of the files to be generated.\n  def _setFileNameSuffix( pSuffix )\n    @writer__iFileNameSuffix = pSuffix\n  end\n  \n  \n  \n  # Get suffix of files to be generated.\n  def _getFileNameSuffix()\n    return @writer__iFileNameSuffix\n  end\n  \n  \n  \n  # Set the full name of the file to be generated. \n  # Prefix and Suffix are set to empty.\n  def _setFullFileName( pName )\n    _setFileNamePrefix( WRITER__STRING_empty )\n    _setFileNameRoot(   pName )\n    _setFileNameSuffix( WRITER__STRING_empty )\n  end\n  \n  \n\n  # Get the full name of current file being generated.\n  def _getFullFileName()\n      return _getFileNamePrefix() + _getFileNameRoot() + _getFileNameSuffix()\n  end\n  \n  \n  \n  # Set the names of the files to be generated. \n  # Prefix and Suffix are set to empty.\n  def _setFullFileNames( pNames )\n      _setFileNamePrefix( WRITER__STRING_empty )\n      _setFileNameRoots(  pNames )\n      _setFileNameSuffix( WRITER__STRING_empty )\n  end\n  \n  \n\n  # Get the full names of the files to be generated.\n  def _getFullFileNames()\n  \n      fileNameRoots  = _getFileNameRoots()\n      numFiles       = fileNameRoots.length\n      fullFileNames  = []\n      fileNamePrefix = _getFileNamePrefix()\n      fileNameSuffix = _getFileNameSuffix()\n  \n      fileI = 0\n      for fileI in 0...numFiles\n        fullFileNames[ fileI ] = fileNamePrefix + fileNameRoots[ fileI ] + fileNameSuffix\n      end\n  \n      return fullFileNames\n  end\n  \n  \n\n  # Set the root of the name of the file to be generated. \n  def _setFileNameRoot( pFileNameRoot )\n    _setFileNameRoots( [ pFileNameRoot ] )\n  end\n  \n  \n\n  # Get the root of the name of current file being generated.\n  def _getFileNameRoot()\n    if( nil == @writer__iFileNameRoots ) \n      return WRITER__STRING_empty\n    else\n      return @writer__iFileNameRoots[ @writer__iCurrentFileIndex ]\n    end\n  end\n\n\n\n  # Set the roots of the names of the files to be generated. \n  def _setFileNameRoots( pFileNameRoots )\n    @writer__iFileNameRoots = pFileNameRoots\n    @writer__iNumFiles      = @writer__iFileNameRoots.length\n  end\n\n  \n\n  # Get roots of the names of files to be generated.\n  def _getFileNameRoots()\n    return @writer__iFileNameRoots\n  end\n  \n  \n  \n  # Get index of file currently being generated. \n  def _getFileIndex()\n    return @writer__iCurrentFileIndex\n  end\n  \n  \n\n  # Get number of files to generate.\n  def _getNumFiles\n    return @writer__iNumFiles;\n  end\n\n\n\n  # Set output folder.\n  def _setOutputFolder( pOutputFolder )\n    @writer__iOutputFolder = pOutputFolder\n  end\n  \n  \n  \n  # Get output folder.\n  def _getOutputFolder()\n    return @writer__iOutputFolder\n  end\n  \n  \n  \n  # Set backup folder.\n  def _setBackupFolder( pBackupFolder )\n    @writer__iBackupFolder = pBackupFolder\n  end\n  \n  \n  \n  # Get backup folder.\n  def _getBackupFolder()\n    return @writer__iBackupFolder\n  end\n  \n  \n  \n  # Set the prefix of backup files.\n  def _setBackupPrefix( pBackupPrefix )\n    @writer__iBackupPrefix = pBackupPrefix\n  end\n\n\n\n  # Set the suffix of backup files.\n  def _setBackupSuffix( pBackupSuffix )\n    @writer__iBackupSuffix = pBackupSuffix\n  end\n  \n  \n\n  # Set to true if generated files are to be backed up to disk automatically.   \n  def _backup( pBackup )\n    @writer__iBackup = pBackup\n  end\n\n\n  \n  # Set to true if generated files are to be saved to disk automatically. \n  def _save( pSave )\n    @writer__iSave = pSave\n  end\n  \n  \n\n  # Save a text file.\n  def _saveTextFile( pFilePath, pContent ) \n    file = open( pFilePath, \"w\" )\n  \tfile.print pContent\n    file.close()\n  end\n  \n  \n\n  # Load a text file.\n  def _loadTextFile( pFilePath )\n    content = ''\n    file    = open( pFilePath, 'r' )\n    file.readlines.each { |line| content += line }\n    file.close\n    return content\n  end\n\n\n  # Set build properties file.\n  def _setMetaPropFile( pMetaPropFile )\n    @writer__iMetaPropFile   = pMetaPropFile\n    @writer__iPropertiesInit = $<lang.FalseString>\n  end\n\n\n  # Get build properties file.\n  def _getMetaPropFile()\n     return @writer__iMetaPropFile\n  end\n\n\n  # Template Services (File Generation) >> #\n\n\n\n\n  # Template Services (Control) << #\n\n  # Get the value of a compile-time property.\n  def _getProperty( pName )\n  \n    if ! @writer__iPropertiesInit\n      writer__initProperties()\n    end\n  \n    return @writer__iProperties[ pName ]\n  end\n  \n  \n  \n  # Get first user arg.\n  def _getFirstUserArg()\n    return _getUserArg( 0 )\n  end\n  \n  \n  \n  # Get second user arg.\n  def _getSecondUserArg()\n    return _getUserArg( 1 )\n  end\n  \n  \n  \n  # Get third user arg.\n  def _getThirdUserArg()\n    return _getUserArg( 2 )\n  end\n  \n  \n  \n  # Get nth (n=0,1,2,...) user arg (the nth arg with no WRITER__ARGUMENT_CONTROL_PREFIX).\n  def _getUserArg( pOrdinal )\n    if pOrdinal < _getNumUserArgs()\n      userargs = _getUserArgs();\n      return userargs[ pOrdinal ];\n    else \n      return writer__STRING_empty;\n    end\n  end\n  \n  \n  \n  # Get user command line arguments to CodeWriter.\n  def _getUserArgs()\n    return @writer__iUserArgs;\n  end\n\n\n\n  # Get number of user command line arguments to CodeWriter.\n  def _getNumUserArgs()\n    return @writer__iNumUserArgs;\n  end\n\n\n\n  # Get command line arguments to CodeWriter. \n  def _getArgs()\n    return @writer__iArgs\n  end\n  \n  \n  \n  # Get number of command line arguments to CodeWriter.\n  def _getNumArgs()\n    return @writer__iNumArgs\n  end\n  \n  # Template Services (Control) >> #\n  \n\n\n\n  # Template Services (Text Production) << #\n\n  # Insert text into generated file. \n  def _insert( pText )\n    text = pText.to_s\n    @writer__iCurrentText = @writer__iCurrentText + text\n  end\n  \n  \n  \n  # Create a String containing specified number of spaces.\n  def _spaces( pNumSpaces )\n    numSpaces = pNumSpaces.to_i\n    return ' ' * numSpaces.abs\n  end\n  \n  \n  \n  # Left align String with spaces. \n  def _left( pText, pColWidth )\n    return _align( pText, \" \", pColWidth, 'l' )\n  end \n  \n  \n  \n  # Right align String with spaces. \n  def _right( pText, pColWidth )\n    return _align( pText, \" \", pColWidth, 'r' )\n  end \n  \n  \n  \n  # Center align String with spaces. \n  def _center( pText, pColWidth )\n    return _align( pText, \" \", pColWidth, 'c' )\n  end \n  \n  \n  \n  # Align text within background text with specified column width.\n  # Alignment can be 'l': left, 'c': center, 'r': right\n  def _align( pText, pBackText, pColWidth, pAlignment )\n    text     = pText.to_s\n    backText = pBackText.to_s\n\n    result   = text\n \n    begin\n      textLen = text.length\n      if( pColWidth > textLen ) then\n        backTextLen     = backText.length\n        remainWidth     = pColWidth - textLen\n        backTextRepeats = remainWidth / backTextLen;\n        backTextRemain  = remainWidth % backTextLen;\n        back            = WRITER__STRING_empty\n        backTextI       = 0\n        for backTextI in 0...backTextRepeats\n          back += backText\n        end\n        back += backText[0...backTextRemain];\n        \n        if( 'l' == pAlignment ) then\n          result = result + back\n          \n        elsif( 'c' == pAlignment ) then\n          result = back[0...((back.length)/2)] + result + back[ (((back.length)/2))...back.length ];\n\n        elsif( 'r' == pAlignment ) then\n          result = back + result;\n\n        end\n      end\n    rescue\n      result = text\n    end\n\n    return result\n  end\n\n\n\n  # Set text of file currently being generated.\n  def _setText( pCurrentText )\n    @writer__iCurrentText = pCurrentText\n  end\n\n\n\n  # Get text of file currently being generated.\n  def _getText()\n    return @writer__iCurrentText\n  end\n\n  # Template Services (Text Production) >> */\n\nend\n\n\n\n\n# Start execution.\n$<main.CodeWriter>.main( ARGV )\nexit( 0 )\n\n\n\n!<footer>\n");
    }