package org.fudaa.dodico.corba.mascaret;

/**
* org/fudaa/dodico/corba/mascaret/VSParametresPtHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/devel/fudaa/fudaa_devel/dodico/idl/code/mascaret.idl
* mercredi 14 janvier 2009 02 h 05 CET
*/
public abstract class VSParametresPtHelper {

    private static String _id = "IDL:mascaret/VSParametresPt:1.0";

    public static void insert(org.omg.CORBA.Any a, org.fudaa.dodico.corba.mascaret.SParametresPt[] that) {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
        a.type(type());
        write(out, that);
        a.read_value(out.create_input_stream(), type());
    }

    public static org.fudaa.dodico.corba.mascaret.SParametresPt[] extract(org.omg.CORBA.Any a) {
        return read(a.create_input_stream());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;

    public static synchronized org.omg.CORBA.TypeCode type() {
        if (__typeCode == null) {
            __typeCode = org.fudaa.dodico.corba.mascaret.SParametresPtHelper.type();
            __typeCode = org.omg.CORBA.ORB.init().create_sequence_tc(0, __typeCode);
            __typeCode = org.omg.CORBA.ORB.init().create_alias_tc(org.fudaa.dodico.corba.mascaret.VSParametresPtHelper.id(), "VSParametresPt", __typeCode);
        }
        return __typeCode;
    }

    public static String id() {
        return _id;
    }

    public static org.fudaa.dodico.corba.mascaret.SParametresPt[] read(org.omg.CORBA.portable.InputStream istream) {
        org.fudaa.dodico.corba.mascaret.SParametresPt value[] = null;
        int _len0 = istream.read_long();
        value = new org.fudaa.dodico.corba.mascaret.SParametresPt[_len0];
        for (int _o1 = 0; _o1 < value.length; ++_o1) value[_o1] = org.fudaa.dodico.corba.mascaret.SParametresPtHelper.read(istream);
        return value;
    }

    public static void write(org.omg.CORBA.portable.OutputStream ostream, org.fudaa.dodico.corba.mascaret.SParametresPt[] value) {
        ostream.write_long(value.length);
        for (int _i0 = 0; _i0 < value.length; ++_i0) org.fudaa.dodico.corba.mascaret.SParametresPtHelper.write(ostream, value[_i0]);
    }
}