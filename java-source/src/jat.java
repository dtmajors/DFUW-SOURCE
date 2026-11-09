/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jat
extends ipx
implements iua {
    private static final isf mLD = isf.mwM;
    private static final int mLE = 14;
    private static final int mLF = 0x5A5A5A;
    private static final int mLG = 0xABABAB;
    private static final isu mLH = isu.mxP;
    private static final isf mLI = isf.mwM;
    private static final int mLJ = 14;
    private static final int mLK = 0x5A5A5A;
    private static final int mLL = 0xABABAB;
    private static final isu mLM = isu.mxR;
    private ist lqp;
    private ist lqq;
    private iok mKT;
    private iok mLN;
    private iok mLO;
    private final jap mLP;
    private final ldv Ri;
    private final boolean adc;
    private double mLQ;

    public jat(ldv ldv2, String string, float f2, boolean bl, boolean bl2, boolean bl3, jap jap2) {
        this.adc = bl2;
        this.Ri = ldv2;
        this.mLP = jap2;
        this.a(iqo.dmT());
        this.W(ipx.a(1, 8, new ipf[0]));
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(5, 1, new ipf[0]));
        this.lqp = new ist();
        this.lqp.a(mLD, 14);
        this.lqp.Rk(bl2 ? 0xABABAB : 0x5A5A5A);
        this.lqp.a(mLH);
        this.lqp.setText(string);
        ipx2.W(ipx.c(new ipf[]{this.lqp}));
        ipx2.W(new ipk(0x313131, 1, 21));
        if (bl) {
            this.lqq = new ist();
            this.lqq.a(mLI, 14);
            this.lqq.Rk(bl2 ? 0xABABAB : 0x5A5A5A);
            this.lqq.a(mLM);
            this.lqq.setText(String.valueOf((int)f2));
            ipx2.W(ipx.a(43, 21, this.lqq));
        }
        this.mKT = this.dvS();
        this.mLN = this.dvT();
        this.mLO = this.sT(bl3);
        ipx ipx3 = ipx.l(new ipf[0]);
        if (this.mKT != null) {
            this.mKT.rF(bl2);
            ipx3.W(new ipk(0x313131, 1, 21));
            ipx3.W(ipx.c(5, 2, 5, 2, this.mKT));
        }
        if (this.mLN != null) {
            this.mLN.rF(bl2);
            ipx3.W(new ipk(0x313131, 1, 21));
            ipx3.W(ipx.c(5, 2, 5, 2, this.mLN));
        }
        if (this.mLO != null) {
            ipx3.W(new ipk(0x313131, 1, 21));
            ipx3.W(ipx.c(5, 2, 5, 2, this.mLO));
        }
        ipx2.W(ipx.a(78, 1, ipx3));
        this.W(ipx2);
        this.W(ipx.b(1, 8, new ipf[0]));
        this.W(ipx.d(new ipk(0x313131, 200, 1)));
    }

    private void a(a a2) {
        this.mLP.a(this.Ri, this.lqp.getText(), a2);
    }

    public void a(a a2, boolean bl) {
        switch (a2) {
            case mLU: {
                this.mLN.rF(bl);
                break;
            }
            case mLT: {
                this.mKT.rF(bl);
                break;
            }
            case mLV: {
                this.mLO.rF(bl);
            }
        }
    }

    public iok dvS() {
        return new iok(this, "WhisperButtonDisabled", "WhisperButtonNormal", "WhisperButtonHover", "WhisperButtonPushing"){
            final /* synthetic */ jat mLR;
            {
                this.mLR = jat2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                jat.a(this.mLR, a.mLT);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(jat.a(this.mLR) ? lxk.tse.bD(new Object[0]).exA() : lxk.tsl.bD(new Object[0]).exA());
            }
        };
    }

    public iok dvT() {
        return new iok(this, "SummonButtonDisabled", "SummonButtonNormal", "SummonButtonHover", "SummonButtonPushing"){
            final /* synthetic */ jat mLR;
            {
                this.mLR = jat2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                jat.a(this.mLR, a.mLU);
            }

            public hyn dd(int n, int n2) {
                if (jat.b(this.mLR) > 0.0) {
                    return iae.oJ(lxk.tsg.bD(jat.b(this.mLR)).exA());
                }
                return iae.oJ(jat.a(this.mLR) ? lxk.tsf.bD(new Object[0]).exA() : lxk.tsl.bD(new Object[0]).exA());
            }
        };
    }

    public iok sT(boolean bl) {
        iok iok2 = new iok(this, "RemoveButtonDisabled", "RemoveButtonNormal", "RemoveButtonHover", "RemoveButtonPushing", bl){
            final /* synthetic */ boolean mLS;
            final /* synthetic */ jat mLR;
            {
                this.mLR = jat2;
                this.mLS = bl;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                jat.a(this.mLR, a.mLV);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(this.mLS ? lxk.tsh.bD(new Object[0]).exA() : lxk.tsi.bD(new Object[0]).exA());
            }
        };
        iok2.rF(bl);
        return iok2;
    }

    @Override
    public boolean getSelected() {
        return false;
    }

    @Override
    public void setSelected(boolean bl) {
    }

    public void a(float f2, double d2) {
        this.mLN.rF(f2 <= 0.0f);
        this.mLQ = d2;
    }

    public void sU(boolean bl) {
        this.mLN.rF(bl);
    }

    static /* synthetic */ void a(jat jat2, a a2) {
        jat2.a(a2);
    }

    static /* synthetic */ boolean a(jat jat2) {
        return jat2.adc;
    }

    static /* synthetic */ double b(jat jat2) {
        return jat2.mLQ;
    }
}

