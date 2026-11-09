/*
 * Decompiled with CFR.
 */
public class jec
extends ipx {
    private jci mSI;
    private jcf mTp;
    private boolean mTC;
    private iso myJ;

    public jec(jci jci2, jcf jcf2, boolean bl) {
        this.mSI = jci2;
        this.mTp = jcf2;
        this.mTC = bl;
        this.a(iqo.dmT());
        this.W(ipx.a(1, 2, new ipf[0]));
        this.W(ipx.l(ipx.a(8, 1, new ipf[0]), this.cPo(), ipx.a(8, 1, new ipf[0])));
        this.W(ipx.a(1, 2, new ipf[0]));
        this.rG(false);
    }

    @Override
    public boolean du(int n, int n2) {
        if (this.mSI != null && this.mSI.vY()) {
            jcc.dwT().a(this.mSI.vS().getID(), this.mTp);
            return true;
        }
        return false;
    }

    @Override
    public void cND() {
        if (this.mSI != null && this.mSI.vY()) {
            this.myJ.setText(this.dpz());
        }
    }

    private ipf cPo() {
        this.myJ = new isn();
        this.myJ.a(isu.mxP);
        this.myJ.setWidth(484);
        this.myJ.setText(this.dpz());
        return this.myJ;
    }

    private String dpz() {
        String string = this.mTp.aND().exA();
        int n = this.dkb() ? 0xC0C0C0 : 0xABABAB;
        string = this.mTC ? isg.b(isf.mwO, 14, 12357465, string.substring(0, 1)) + isg.b(isf.mwN, 13, n, string.substring(1)) : isg.b(isf.mwN, 13, n, string);
        string = "    " + string;
        return string;
    }
}

