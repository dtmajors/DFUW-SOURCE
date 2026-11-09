/*
 * Decompiled with CFR.
 */
public enum bat {
    cOo(mat.rXy),
    cOp(mat.uec),
    cOq(mat.rXy),
    cOr(mat.ued),
    cOs(mat.ubr),
    cOt(mat.uee),
    cOu(mat.uef),
    cOv(mat.ueg),
    cOw(mat.ueh),
    cOx(mat.uei),
    cOy(mat.uej),
    cOz(mat.uek),
    cOA(mat.uel),
    cOB(mat.uem),
    cOC(mat.uen),
    cOD(mat.ueo),
    cOE(mat.uep),
    cOF(mat.ueq),
    cOG(mat.uer),
    cOH(mat.ues),
    cOI(mat.uet),
    cOJ(mat.ueu),
    cOK(mat.uev),
    cOL(mat.uew),
    cOM(mat.udP),
    cON(mat.uex),
    cOO(mat.uey),
    cOP(mat.ueA);

    private lox cOQ = null;

    public boolean vA() {
        return this == cON;
    }

    public lox aiS() {
        return this.cOQ;
    }

    private bat(lox lox2) {
        this.cOQ = lox2;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < bat.values().length;
    }

    public static final bat getValueByOrdinal(int n) {
        return bat.isValidOrdinal(n) ? bat.values()[n] : cOo;
    }
}

