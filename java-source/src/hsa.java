/*
 * Decompiled with CFR.
 */
public class hsa
extends hrz {
    private String fFC;
    private lgg kIl;
    private lgg kec;
    private boolean lbd = true;
    private boolean eKX = true;

    public hsa(hsi hsi2, String string) {
        super(hsi2, string, 1, 64, 0);
    }

    public final void setName(String string) {
        assert (this.cxi());
        assert (string.length() > 0);
        if (this.fFC.equals(string)) {
            return;
        }
        this.fFC = string;
        this.Ok(8);
    }

    public final void O(lgg lgg2) {
        assert (this.cxi());
        if (this.kIl.T(lgg2)) {
            return;
        }
        this.kIl = lgg2;
        this.Ok(2);
    }

    public final void P(lgg lgg2) {
        if (this.kec.T(lgg2)) {
            return;
        }
        this.kec = lgg2;
        this.Ok(4);
    }

    public final void oC(boolean bl) {
        if (this.lbd == bl) {
            return;
        }
        this.lbd = bl;
        this.Ok(32);
    }

    public final void eq(boolean bl) {
        if (this.eKX == bl) {
            return;
        }
        this.eKX = bl;
        this.Ok(16);
    }

    @Override
    protected void cxd() {
        assert (this.fFC.length() > 0);
        knp knp2 = (knp)this.Oj(263);
        int n = this.cxf();
        if ((n & 1) != 0) {
            knp2.wD(true);
        }
        knp2.Type = n;
        if ((n & 1) != 0) {
            knp2.wD(true);
        }
        if ((n & 5) != 0) {
            knp2.pQE = this.kec.cf;
            knp2.pQF = this.kec.cg;
        }
        if ((n & 0x21) != 0) {
            knp2.lbd = this.lbd;
        }
        if ((n & 3) != 0) {
            knp2.pQC = this.kIl.cf;
            knp2.pQD = this.kIl.cg;
        }
        if ((n & 9) != 0) {
            knp2.fFC = this.fFC;
        }
        if ((n & 0x11) != 0) {
            knp2.Visible = this.eKX;
        }
        this.b(knp2);
    }

    @Override
    protected void b(ktl ktl2, knt knt2) {
        if (knt2 instanceof knp) {
            knp knp2 = (knp)knt2;
            if ((knp2.Type & 1) != 0) {
                switch (ktl2.getResult()) {
                    case 0: {
                        this.cxg();
                        return;
                    }
                    case -1: {
                        if (knp2.fFC.equals(this.jDE.lbS)) {
                            return;
                        }
                        this.fFC = this.jDE.lbS;
                        this.cxh();
                        return;
                    }
                }
            }
        }
        super.b(ktl2, knt2);
    }

    private boolean cxi() {
        return (this.cxf() & 1) != 0;
    }
}

