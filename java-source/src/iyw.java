/*
 * Decompiled with CFR.
 */
public class iyw
extends ipx {
    private int mCJ;
    private int mCK;
    private ist mCL;
    private ios mCM;
    private ios mCN;

    public iyw(int n, int n2) {
        this.mCJ = n;
        this.mCK = n2;
        this.a(iqo.dmS());
        this.mCL = ist.a(isf.mwO, 16, 0xABABAB);
        this.W(ipx.d(this.mCL));
        this.eZ(n, n2);
        this.mCM = this.dtH();
        if (this.mCM != null) {
            this.W(ipx.a(10, 1, new ipf[0]));
            this.W(ipx.d(new ipk(0x313131, 1, 20)));
            this.W(ipx.a(6, 1, new ipf[0]));
            this.W(ipx.d(this.mCM));
        }
        this.mCN = this.dtI();
        if (this.mCN != null) {
            this.W(ipx.a(6, 1, new ipf[0]));
            this.W(ipx.d(new ipk(0x313131, 1, 20)));
            this.W(ipx.a(6, 1, new ipf[0]));
            this.W(ipx.d(this.mCN));
        }
    }

    public void sM(boolean bl) {
        this.mCN.rF(bl);
    }

    public ios dtH() {
        return new ivx(this){
            final /* synthetic */ iyw mCO;
            {
                this.mCO = iyw2;
            }

            public void cLq() {
                this.mCO.dtJ();
            }
        };
    }

    public ios dtI() {
        return new iwf(this){
            final /* synthetic */ iyw mCO;
            {
                this.mCO = iyw2;
            }

            public void cLq() {
                this.mCO.cvR();
            }
        };
    }

    public void dtJ() {
    }

    public void cvR() {
    }

    private void eZ(int n, int n2) {
        this.mCL.setText(n + "/" + n2);
    }
}

