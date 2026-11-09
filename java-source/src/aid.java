/*
 * Decompiled with CFR.
 */
public class aid
extends agx {
    private lgj[] bnd = new lgj[3];
    private int bne = 0;
    private lgj bnf = null;
    public int bng = -1;
    private int bnh = 0;

    public aid() {
        super(6);
        this.bls = ahu.c.bmL;
        this.blA = 5;
    }

    public aid(int n) {
        super(n);
        this.bls = ahu.c.bmL;
        this.blA = 5;
    }

    public lgj[] BL() {
        return this.bnd;
    }

    public int BM() {
        return this.bne;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 5: {
                return "PositionalData";
            }
        }
        return super.eB(n);
    }

    public final uk BN() {
        if (this.bnf == null) {
            return this.G(5, -1);
        }
        uj uj2 = new uj();
        uj2.Uo = 5;
        uj2.aWo = this.bnf;
        return uj2;
    }

    @Override
    public void a(gym gym2, int n) {
        if (gym2.bEz() != 12041) {
            lfn.b(5, "SFStreamingMeshStateObject", "handleUpdateMessage() Invalid UpdateMessage received: " + gym2.getClass().getName());
            return;
        }
        gyl gyl2 = (gyl)gym2;
        boolean bl = false;
        if ((gyl2.ija & 4) > 0) {
            assert (gyl2.dTY != null);
            lgj lgj2 = gyl2.dTY;
            lgj2.aWg = n;
            if (lgj2.aZa <= this.bnh) {
                return;
            }
            this.bnh = lgj2.aZa;
            this.bnd[this.bne++] = lgj2;
            if (this.bne == 3) {
                this.bne = 0;
            }
            this.L(5, n);
            this.bnf = lgj2;
            bl = true;
        }
        if ((gyl2.ija & 1) > 0) {
            lfn.b(5, "SFStreamingMeshStateObject", "handleUpdateMessage() Should not update position or rotation properties.");
            lfn.b(5, "SFStreamingMeshStateObject", "handleUpdateMessage() FileName='" + this.FileName + "'");
            super.a(gym2, n);
        }
        if ((gyl2.ija & 2) > 0) {
            super.a(gym2, n);
        }
        if (bl) {
            this.BE();
        }
    }

    @Override
    protected ljq Bc() {
        if (this.bnf == null) {
            return super.Bc();
        }
        return this.bnf.eqI();
    }

    @Override
    protected lgl Bd() {
        if (this.bnf == null) {
            return super.Bd();
        }
        return this.bnf.eqK();
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 5: {
                uj uj2 = new uj();
                uj2.Uo = n;
                if (this.bnf != null) {
                    if (this.bnf.aWg <= n2) {
                        return null;
                    }
                    uj2.aWo = this.bnf;
                }
                return uj2;
            }
        }
        return super.G(n, n2);
    }
}

