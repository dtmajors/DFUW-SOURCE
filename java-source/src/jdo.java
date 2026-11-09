/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jdo
extends ipx {
    private jch mSc;
    private ach mTi;
    private int mHq;
    private ipb mcc;

    public jdo(jch jch2, ach ach2) {
        this.mSc = jch2;
        this.mTi = ach2;
        this.mHq = ach2.getID();
        this.a(irl.dnr());
        this.W(ipx.d(new ipt(0x202020, 42, 42)));
        this.W(ipx.d(ipx.a(42, 42, this.cGU())));
    }

    public void dyK() {
        this.mcc.qP(this.dyL());
    }

    @Override
    public hyn dd(int n, int n2) {
        loz loz2 = this.mTi.isLocked() ? this.mTi.yK() : this.mTi.yL();
        loz loz3 = this.mTi.isLocked() ? this.mTi.yM() : this.mTi.yN();
        return iae.I(loz2.exA(), loz3.exA());
    }

    private ipf cGU() {
        this.mcc = new ipb(this.dyL());
        return this.mcc;
    }

    private String dyL() {
        return "/dfdata/texture/gui/runtime/quest_items/" + this.dyM().getImageFileName();
    }

    private ach dyM() {
        return xe.baL.z(this.mSc.wF().getID(), this.mHq);
    }
}

