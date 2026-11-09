/*
 * Decompiled with CFR.
 */
public class iaj
extends ioa {
    private static final double lBm = 10.0;
    private int lBn;
    private int loG;
    private int loH;
    private lie lBo;
    private boolean lBp = false;
    private ist lBq;
    private irr lBr;

    public iaj(int n, int n2, int n3) {
        super("ActionBarKeybindDefinitionWindow", "J2FWindow.swf");
        this.OQ(jnz.nGz);
        this.a(hya.lmp, true);
        this.a(hya.lmt, true);
        this.lBn = n;
        this.loG = n2;
        this.loH = n3;
    }

    @Override
    public boolean a(jmf jmf2) {
        if (super.a(jmf2)) {
            return true;
        }
        if (iaj.cyJ().cHH().a(jmf2)) {
            if (this.lBq != null) {
                this.lBq.setText(lxx.tAR.bD(this.cKn()).exA());
                this.cKo();
            }
            return true;
        }
        return false;
    }

    public void czn() {
        if (this.lBp) {
            iaj.cyJ().cHH().czn();
        }
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dhJ().a(irl.dnr());
        this.dhJ().W(new izq());
        this.dhJ().W(this.cGU());
        this.pack();
        this.lBo = new lie(this, 1.0, true){
            final /* synthetic */ iaj lBs;
            {
                this.lBs = iaj2;
                super(d2, bl);
            }

            public void dh(double d2) {
                if (d2 >= 10.0) {
                    iaj.a(this.lBs);
                }
                iaj.b(this.lBs).setProgress((float)lew.i(0.0, d2 / 10.0, 1.0));
            }
        };
        this.lBo.e(this.getMessageDelegator());
    }

    @Override
    protected void cKg() {
        float f = (float)this.loG - this.getWidth() / 2.0f;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f + this.getWidth() > hso.cxK().cxY().W) {
            f = hso.cxK().cxY().W - this.getWidth();
        }
        float f2 = (float)this.loH - this.getHeight();
        this.R(f, f2);
    }

    @Override
    protected boolean oN(String string) {
        if (string.equals("ESCAPE")) {
            this.cKo();
            return true;
        }
        return false;
    }

    @Override
    protected void cKh() {
        this.cEZ();
        this.cFc();
        this.cqF();
        int n = this.lBn / jej.mUd;
        int n2 = this.lBn % jej.mUd;
        String string = "GUI.Select" + (n == 0 ? "Left" : "Right") + "RadialSlot" + (n2 + 1);
        iaj.cyJ().cHH().StartAcceptingInputObjectStateChanges(string);
        this.lBp = true;
    }

    private ipf cGU() {
        ipx ipx2 = ipx.c(18, 28, 18, 28, new ipf[0]);
        ipx2.W(this.cKi());
        return ipx2;
    }

    private ipf cKi() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.d(this.cKj()));
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(ipx.d(this.cKk()));
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(ipx.d(this.cKl()));
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(ipx.d(this.cKm()));
        return ipx2;
    }

    private ipf cKj() {
        return new ist(isf.mwO, 16, 12357465, lxx.tAP.bD(this.lBn + 1).exA());
    }

    private ipf cKk() {
        return new ist(isf.mwO, 14, 0xFFFFFF, lxx.tAQ.bD(new Object[0]).exA());
    }

    private ipf cKl() {
        this.lBq = new ist(isf.mwO, 14, 0xFFFFFF, lxx.tAR.bD(this.cKn()).exA());
        return this.lBq;
    }

    private ipf cKm() {
        this.lBr = new ixf();
        return this.lBr;
    }

    private String cKn() {
        int n = this.lBn / jej.mUd;
        int n2 = this.lBn % jej.mUd;
        int n3 = n == 0 ? jmq.nAs.ordinal() : jmq.nAC.ordinal();
        int n4 = n3 + n2;
        jmq jmq2 = jmq.values()[n4];
        String string = jjd.i(jmq2);
        return "[" + (string != null ? string : "    ") + "]";
    }

    private void cKo() {
        this.cFa();
        this.cFd();
        iaj.cyJ().cHH().dIf();
        this.lBo.stop();
        this.getMessageDelegator().hd(this.getGUID());
        iaj.cFj().a(jnz.nFI);
    }

    static /* synthetic */ void a(iaj iaj2) {
        iaj2.cKo();
    }

    static /* synthetic */ irr b(iaj iaj2) {
        return iaj2.lBr;
    }
}

