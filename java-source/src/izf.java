/*
 * Decompiled with CFR.
 */
import java.util.List;

public class izf
extends ipx {
    private List<ipi> mDb = lcn.emv();
    private lie lBo;
    private ist lUb;

    public izf() {
        this.a(irl.dnr());
        this.W(this.cGT());
        this.W(this.cGU());
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.dcJ();
    }

    public void start() {
        this.dtP();
        this.setVisible(true);
    }

    public void stop() {
        this.dcJ();
        this.setVisible(false);
    }

    public void dv(double d2) {
        d2 = lew.i(0.0, d2 * 100.0, 100.0);
        this.lUb.setText(jny.dC(Math.round(d2)) + "%");
    }

    private ipf cGT() {
        ipk ipk2 = new ipk(0);
        ipk2.hz(0.75f);
        return ipk2;
    }

    private ipf cGU() {
        ipx ipx2 = ipx.d(new ipf[0]);
        ipx2.W(this.dtO());
        ipx2.W(this.cUo());
        return ipx2;
    }

    private ipf dtO() {
        int n = 64;
        int n2 = 8;
        ipx ipx2 = ipx.a(n, n, new ipf[0]);
        for (double d2 = 0.0; d2 < 360.0; d2 += 22.5) {
            double d3 = Math.toRadians(d2);
            double d4 = (double)(n / 2) + Math.cos(d3) * (double)n / 2.0;
            double d5 = (double)(n / 2) - Math.sin(d3) * (double)n / 2.0;
            ipi ipi2 = new ipi(0xABABAB, n2, n2);
            this.mDb.add(ipi2);
            ipx2.W(ipx.d((int)d4, (int)d5, ipi2));
        }
        float f2 = 1.0f / (float)this.mDb.size();
        for (int i = 0; i < this.mDb.size(); ++i) {
            this.mDb.get(i).hz(1.0f - f2 * (float)i);
        }
        return ipx2;
    }

    private void dtP() {
        if (this.lBo == null) {
            this.lBo = new lie(this, 0.3, true){
                final /* synthetic */ izf mDc;
                {
                    this.mDc = izf2;
                    super(d2, bl);
                }

                public void dh(double d2) {
                    for (int i = 0; i < izf.a(this.mDc).size(); ++i) {
                        ipi ipi2 = (ipi)izf.a(this.mDc).get(i);
                        float f2 = ipi2.getAlpha();
                        if ((f2 -= 1.0f / (float)izf.a(this.mDc).size()) <= 0.0f) {
                            f2 = 1.0f;
                        }
                        ((ipi)izf.a(this.mDc).get(i)).hz(f2);
                    }
                }
            };
            this.lBo.e(this.djE().getMessageDelegator());
        }
    }

    private void dcJ() {
        if (this.lBo != null) {
            this.lBo.stop();
            this.lBo = null;
        }
    }

    private ipf cUo() {
        this.lUb = new ist(isf.mwN, 15, 0xABABAB);
        this.lUb.a(isu.mxO);
        this.lUb.sv(false);
        this.lUb.a((iqz)null);
        this.lUb.setSize(100, 50);
        this.lUb.a(isx.myo);
        this.lUb.a(ite.myG);
        return this.lUb;
    }

    static /* synthetic */ List a(izf izf2) {
        return izf2.mDb;
    }
}

