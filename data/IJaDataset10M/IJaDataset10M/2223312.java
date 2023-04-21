package org.fudaa.dodico.corba.curvi;

public class _IParametresCurviStub extends org.omg.CORBA.portable.ObjectImpl implements org.fudaa.dodico.corba.curvi.IParametresCurvi {

    public org.fudaa.dodico.corba.curvi.SParametresCurviINP parametresINP() {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("_get_parametresINP", true);
            $in = _invoke($out);
            org.fudaa.dodico.corba.curvi.SParametresCurviINP $result = org.fudaa.dodico.corba.curvi.SParametresCurviINPHelper.read($in);
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return parametresINP();
        } finally {
            _releaseReply($in);
        }
    }

    public void parametresINP(org.fudaa.dodico.corba.curvi.SParametresCurviINP newParametresINP) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("_set_parametresINP", true);
            org.fudaa.dodico.corba.curvi.SParametresCurviINPHelper.write($out, newParametresINP);
            $in = _invoke($out);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            parametresINP(newParametresINP);
        } finally {
            _releaseReply($in);
        }
    }

    public org.fudaa.dodico.corba.curvi.SParametresCurviASC parametresASC() {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("_get_parametresASC", true);
            $in = _invoke($out);
            org.fudaa.dodico.corba.curvi.SParametresCurviASC $result = org.fudaa.dodico.corba.curvi.SParametresCurviASCHelper.read($in);
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return parametresASC();
        } finally {
            _releaseReply($in);
        }
    }

    public void parametresASC(org.fudaa.dodico.corba.curvi.SParametresCurviASC newParametresASC) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("_set_parametresASC", true);
            org.fudaa.dodico.corba.curvi.SParametresCurviASCHelper.write($out, newParametresASC);
            $in = _invoke($out);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            parametresASC(newParametresASC);
        } finally {
            _releaseReply($in);
        }
    }

    public void dispose() {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("dispose", true);
            $in = _invoke($out);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            dispose();
        } finally {
            _releaseReply($in);
        }
    }

    public void initialise(org.fudaa.dodico.corba.objet.IObjet o) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("initialise", true);
            org.fudaa.dodico.corba.objet.IObjetHelper.write($out, o);
            $in = _invoke($out);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            initialise(o);
        } finally {
            _releaseReply($in);
        }
    }

    public void reconnecte(String nom) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("reconnecte", true);
            org.fudaa.dodico.corba.base.ChaineHelper.write($out, nom);
            $in = _invoke($out);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            reconnecte(nom);
        } finally {
            _releaseReply($in);
        }
    }

    public org.fudaa.dodico.corba.objet.IObjet creeClone() {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("creeClone", true);
            $in = _invoke($out);
            org.fudaa.dodico.corba.objet.IObjet $result = org.fudaa.dodico.corba.objet.IObjetHelper.read($in);
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return creeClone();
        } finally {
            _releaseReply($in);
        }
    }

    public String moduleCorba() {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("moduleCorba", true);
            $in = _invoke($out);
            String $result = org.fudaa.dodico.corba.base.ChaineHelper.read($in);
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return moduleCorba();
        } finally {
            _releaseReply($in);
        }
    }

    public String[] interfacesCorba() {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("interfacesCorba", true);
            $in = _invoke($out);
            String $result[] = org.fudaa.dodico.corba.base.VChaineHelper.read($in);
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return interfacesCorba();
        } finally {
            _releaseReply($in);
        }
    }

    public boolean egale(org.fudaa.dodico.corba.objet.IObjet o) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("egale", true);
            org.fudaa.dodico.corba.objet.IObjetHelper.write($out, o);
            $in = _invoke($out);
            boolean $result = org.fudaa.dodico.corba.base.BooleenHelper.read($in);
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return egale(o);
        } finally {
            _releaseReply($in);
        }
    }

    public int codeHachage() {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("codeHachage", true);
            $in = _invoke($out);
            int $result = org.fudaa.dodico.corba.base.EntierHelper.read($in);
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return codeHachage();
        } finally {
            _releaseReply($in);
        }
    }

    public String enChaine() {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("enChaine", true);
            $in = _invoke($out);
            String $result = org.fudaa.dodico.corba.base.ChaineHelper.read($in);
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return enChaine();
        } finally {
            _releaseReply($in);
        }
    }

    private static String[] __ids = { "IDL:curvi/IParametresCurvi:1.0", "IDL:calcul/IParametres:1.0", "IDL:objet/IObjet:1.0" };

    public String[] _ids() {
        return (String[]) __ids.clone();
    }

    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException {
        String str = s.readUTF();
        String[] args = null;
        java.util.Properties props = null;
        org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init(args, props).string_to_object(str);
        org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate();
        _set_delegate(delegate);
    }

    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
        String[] args = null;
        java.util.Properties props = null;
        String str = org.omg.CORBA.ORB.init(args, props).object_to_string(this);
        s.writeUTF(str);
    }
}