/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jcr
extends ihm {
    private jby mRN;

    public jcr(ioa ioa2, joa joa2, jby jby2) {
        super("QuestOptionsWindow", "QuestsWindow.swf", ioa2, joa2, 2, 3);
        this.mRN = jby2;
    }

    @Override
    public void cCu() {
        super.cCu();
        this.cKJ();
        this.p(34, 0, 25, 50);
        this.cXE().a(iqo.dmT());
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(new ist(isf.mwO, 18, 12357465, lxu.tyb.bD(new Object[0])));
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(ipx.l(ipx.a(10, 1, new ipf[0]), ipx.c(this.dxZ()), ipx.a(20, 1, new ipf[0])));
        this.cXE().W(ipx.a(1, 8, new ipf[0]));
        this.cXE().W(this.dfb());
    }

    @Override
    protected ipf cMs() {
        return ipx.j(ipx.a(1, 29, new ipf[0]), ipx.l(ipx.a(12, 1, new ipf[0]), new ipb("/dfdata/texture/gui/j2f/quests/backgrounds/quest_bg_options.png")));
    }

    protected void b(jby jby2) {
    }

    private void cKJ() {
        this.cXC().z(lxu.tya.bD(new Object[0]));
    }

    private ipf dxZ() {
        iuz iuz2 = new iuz(this, isf.mwO, 14, 0xABABAB, lxu.tyc.bD(new Object[0]), 0x313131, 21){
            final /* synthetic */ jcr mRO;
            {
                this.mRO = jcr2;
                super(isf2, n, n2, loz2, n3, n4);
            }

            public void pn(boolean bl) {
                jcr.a((jcr)this.mRO).mQi = bl;
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxu.tyN.bD(new Object[0]).exA().toUpperCase());
            }
        };
        iuz2.hX(this.mRN.mQi);
        return iuz2;
    }

    private ipf dfb() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(this.cZn()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dya()));
        ipx2.W(ipx.a(12, 1, new ipf[0]));
        return ipx2;
    }

    private ipf cZn() {
        iur iur2 = new iur(this){
            final /* synthetic */ jcr mRO;
            {
                this.mRO = jcr2;
            }

            public void cLq() {
                this.mRO.close();
                this.mRO.b(jcr.a(this.mRO));
            }
        };
        return iur2;
    }

    private ipf dya() {
        ivc ivc2 = new ivc(this){
            final /* synthetic */ jcr mRO;
            {
                this.mRO = jcr2;
            }

            public void cLq() {
                this.mRO.close();
            }
        };
        return ivc2;
    }

    static /* synthetic */ jby a(jcr jcr2) {
        return jcr2.mRN;
    }
}

