/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class jaf
extends jac {
    private static final int mFz = 30;
    private static final int mFA = 200;
    private static final int mFW = 170;
    protected static final int mEW = 15;
    protected static final int mEX = 400;
    protected static final int mEY = 390;

    @Override
    public loz aNA() {
        return lxh.tpI.bD(new Object[0]);
    }

    @Override
    protected String duk() {
        return "/dfdata/texture/gui/j2f/leaderboards/winners/";
    }

    public jaf(jab jab2) {
        super(jab2);
    }

    @Override
    protected void dum() {
        this.a(irl.dnr());
        ipx ipx2 = ipx.j(ipx.dmu());
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx3.W(ipx.a(8, 1, new ipf[0]));
        ist ist2 = new ist(mEG, 16, 12357465, lxh.tpN.bD(new Object[0]));
        ipx3.W(ist2);
        ipx3.W(ipx.c(new ipf[0]));
        ipx2.W(ipx3);
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx ipx4 = ipx.l(new ipf[0]);
        ipx4.W(ipx.a(4, 1, new ipf[0]));
        ist ist3 = new ist(mEJ, 13, 12357465, lxh.tpT.bD(new Object[0]));
        ipx4.W(ipx.a(30, 1, ipx.d(ist3)));
        ipx4.W(ipx.d(new ipk(0x313131, 1, 20)));
        ist ist4 = new ist(mEJ, 13, 12357465, lxh.tpS.bD(new Object[0]));
        ipx4.W(ipx.a(200, 1, ipx.d(ist4)));
        ipx4.W(ipx.d(new ipk(0x313131, 1, 20)));
        ist ist5 = new ist(mEJ, 13, 12357465, lxh.tqd.bD(new Object[0]));
        ipx4.W(ipx.a(170, 1, ipx.d(ist5)));
        ipx4.W(ipx.d(new ipk(0x313131, 1, 20)));
        ipx2.W(ipx4);
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.duq());
        for (int i = 0; i < 15; ++i) {
            this.mFo.c(new a(this, i));
        }
        this.W(ipx2);
    }

    private void Tl(int n) {
        String string = lxh.sXM.bD(new Object[0]).exA();
        for (int i = 0; i < 15; ++i) {
            ((a)this.mFo.SY(i)).O(i == 0 ? string : null, -1);
        }
    }

    private void a(String[] stringArray, int[] nArray) {
        for (int i = 0; i < 15; ++i) {
            if (i < stringArray.length) {
                ((a)this.mFo.SY(i)).O(stringArray[i], nArray[i]);
                continue;
            }
            ((a)this.mFo.SY(i)).O(null, -1);
        }
    }

    @Override
    protected ipx duq() {
        this.mFo = new jac.b(this);
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(new ipb("/dfdata/texture/gui/j2f/leaderboards/leaderboards_gold_line.png"));
        ipx2.W(ipx.a(400, 390, this.mFo));
        ipx2.W(new ipb("/dfdata/texture/gui/j2f/leaderboards/leaderboards_gold_line.png"));
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        return ipx2;
    }

    @Override
    protected void dun() {
        this.duz();
    }

    private gnc duy() {
        if (this.mFl == null || this.mFl.getMessageDelegator() == null || this.mFl.getGUID() == null) {
            return null;
        }
        return (gnc)this.mFl.getMessageDelegator().h(3617, this.mFl.getGUID(), lcr.qEl);
    }

    private void duz() {
        gnc gnc2 = this.duy();
        if (gnc2 == null) {
            return;
        }
        gnc2.Ke(15);
        this.mFl.getMessageDelegator().F(gnc2);
    }

    @Override
    public boolean l(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3618: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3618: {
                this.a((gnd)dxq2);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    private void a(gnd gnd2) {
        this.a(gnd2.bWt(), gnd2.bWu());
        this.dup();
    }
}

