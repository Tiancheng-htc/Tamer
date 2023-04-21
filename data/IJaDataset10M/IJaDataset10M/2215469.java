package org.sablecc.objectmacro.syntax3.node;

import org.sablecc.objectmacro.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TRPar extends Token {

    public TRPar() {
        super.setText(")");
    }

    public TRPar(int line, int pos) {
        super.setText(")");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone() {
        return new TRPar(getLine(), getPos());
    }

    public void apply(Switch sw) {
        ((Analysis) sw).caseTRPar(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text) {
        throw new RuntimeException("Cannot change TRPar text.");
    }
}