/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class ije
extends ipx
implements iua {
    private ijc mcy;
    private ikd mcH;
    private iox mcI;
    private ist lTZ;
    private ixq mcJ;

    public ije(ijc ijc2, ikd ikd2, boolean bl) {
        this.mcy = ijc2;
        this.mcH = ikd2;
        this.a(iqo.dmT());
        this.W(ipx.a(1, 9, new ipf[0]));
        this.W(this.cVh());
        if (bl) {
            this.W(ipx.a(1, 9, new ipf[0]));
            this.W(this.daZ());
        }
        this.W(ipx.a(1, 4, new ipf[0]));
    }

    public ije(ijc ijc2, ikd ikd2) {
        this(ijc2, ikd2, true);
    }

    @Override
    public boolean getSelected() {
        return false;
    }

    @Override
    public void setSelected(boolean bl) {
    }

    public ikd daf() {
        return this.mcH;
    }

    public iox daR() {
        return this.mcI;
    }

    public ist daS() {
        return this.lTZ;
    }

    public ixq daT() {
        return this.mcJ;
    }

    public void qv(boolean bl) {
        this.mcI.rF(!bl);
    }

    protected float daU() {
        return 0.2f;
    }

    protected float daV() {
        return 1.0f;
    }

    protected ipf daW() {
        return ipx.l(ipx.a(14, 1, new ipf[0]), new ipk(0x313131, 267, 1));
    }

    private ipf cVh() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.d(this.cVi()));
        ipx2.W(ipx.c(new ipf[0]));
        if (this.mcy.djS()) {
            ipx2.W(ipx.d(this.daX()));
        }
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 19)));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.daY()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        return ipx2;
    }

    private ipf daX() {
        ivq ivq2 = new ivq(this){
            final /* synthetic */ ije mcK;
            {
                this.mcK = ije2;
            }

            public void cLq() {
                ije.a(this.mcK).cqF();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tKi.bD(new Object[0]).exA());
            }
        };
        return ivq2;
    }

    private ipf daY() {
        this.mcI = new ivu(this){
            final /* synthetic */ ije mcK;
            {
                this.mcK = ije2;
            }

            public void pn(boolean bl) {
                ije.a(this.mcK).qs(bl);
            }

            public hyn dd(int n, int n2) {
                return this.djR() ? iae.oJ(lyu.tKj.bD(new Object[0]).exA()) : super.dd(n, n2);
            }
        };
        this.mcI.hX(this.mcy.cZt());
        return this.mcI;
    }

    private ipf cVi() {
        this.lTZ = new ist(isf.mwO, 18, 12357465, "");
        return this.lTZ;
    }

    private ipf daZ() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(20, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dba()));
        ipx2.W(ipx.a(32, 1, new ipf[0]));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(ipx.a(128, 8, this.dbb())));
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dba() {
        return new ist(isf.mwO, 14, 0xABABAB, lwx.tkz.bD(new Object[0]));
    }

    private ipf dbb() {
        this.mcJ = new ixq(this){
            final /* synthetic */ ije mcK;
            {
                this.mcK = ije2;
            }

            public void Rb(int n) {
                ije.a(this.mcK).kI((float)n / 100.0f);
            }
        };
        this.mcJ.a((int)(this.daU() * 100.0f), (int)(this.mcy.daE() * 100.0f), (int)(this.daV() * 100.0f), 1, 10, false);
        return this.mcJ;
    }

    static /* synthetic */ ijc a(ije ije2) {
        return ije2.mcy;
    }
}

