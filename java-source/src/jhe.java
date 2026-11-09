/*
 * Decompiled with CFR.
 */
public class jhe
extends ihy {
    public jhe(String string, String string2, ihs ihs2, joa joa2, float f2) {
        super(string, string2, ihs2, joa2, 1.0f, f2);
    }

    public jhe(ihs ihs2, joa joa2, float f2) {
        this(ihs2.aDa + "WindowFrameOptions", ihs2.loi, ihs2, joa2, f2);
    }

    @Override
    public void cCu() {
        super.cCu();
        a a2 = new a(this, null);
        a2.a(0, (int)(hso.cxK().cxT().dJf().dLM() * 100.0f), 100, 1, 10, true);
        super.a(lyh.tEh, a2);
    }

    @Override
    protected lox cYL() {
        return lyh.tEi;
    }
}

