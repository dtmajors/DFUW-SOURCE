/*
 * Decompiled with CFR.
 */
public class jds
extends ipx {
    private jch mSc;
    private jcf mTp;
    private iso myJ;

    public jds(jch jch2, jcf jcf2) {
        this(jch2, jcf2, jcf2.aND());
    }

    public jds(loz loz2) {
        this(null, null, loz2);
    }

    public jds(jch jch2, jcf jcf2, loz loz2) {
        this.mSc = jch2;
        this.mTp = jcf2;
        this.a(iqo.dmT());
        this.W(ipx.a(1, 2, new ipf[0]));
        this.W(ipx.l(ipx.a(8, 1, new ipf[0]), this.E(loz2), ipx.a(8, 1, new ipf[0])));
        this.W(ipx.a(1, 2, new ipf[0]));
        this.rG(false);
    }

    @Override
    public boolean du(int n, int n2) {
        if (this.mSc != null && this.mSc.wF().vY()) {
            jcc.dwT().a(this.mSc.wF().getID(), this.mTp);
            return true;
        }
        return false;
    }

    @Override
    public void cND() {
        if (this.mSc != null && this.mSc.wF().vY()) {
            if (this.dkb()) {
                this.myJ.Rk(0xC0C0C0);
            } else {
                this.myJ.Rk(0xABABAB);
            }
        }
    }

    private ipf E(loz loz2) {
        this.myJ = new iso();
        this.myJ.a(isf.mwN, 13);
        this.myJ.Rk(0xABABAB);
        this.myJ.a(isu.mxP);
        this.myJ.setWidth(484);
        this.myJ.o(loz2);
        return this.myJ;
    }
}

