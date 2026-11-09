/*
 * Decompiled with CFR.
 */
public class iqg
extends inz {
    private ipx lWE;

    public iqg(String string, String string2, ioa ioa2, joa joa2) {
        super(string, string2, ioa2, joa2, 3, 2);
        this.a(iod.moE);
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dhJ().a(irl.dnr());
        this.dhJ().W(this.cMs());
        this.lWE = this.dmN();
        this.dhJ().W(this.lWE);
        this.pack();
    }

    protected ipf cMs() {
        return null;
    }

    protected ipx dmN() {
        return new ipx(this, iqo.dmT()){
            final /* synthetic */ iqg mtI;
            {
                this.mtI = iqg2;
                super(iqz2);
            }

            public boolean dN(int n, int n2) {
                super.dN(n, n2);
                iqg.a(this.mtI);
                return true;
            }
        };
    }

    protected ipx dmO() {
        return this.lWE;
    }

    @Override
    protected void e(int n, int n2, String string) {
        super.e(n, n2, string);
        this.cGR();
    }

    static /* synthetic */ void a(iqg iqg2) {
        iqg2.cGR();
    }
}

