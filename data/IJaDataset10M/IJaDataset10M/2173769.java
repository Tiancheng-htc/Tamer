package com.k_int.codec.comp;

public class ASTMacroDefinition extends SimpleNode {

    public ASTMacroDefinition(int id) {
        super(id);
    }

    public ASTMacroDefinition(AsnParser p, int id) {
        super(p, id);
    }
}