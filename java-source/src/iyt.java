/*
 * Decompiled with CFR.
 */
import java.util.EnumSet;

public abstract class iyt
extends ipz {
    private static final String mBU = "FiltersToolbarBackground";
    private static final int mBV = 150;
    private static final int mBW = 22;
    private static final int mBX = 0x444444;
    private static final int mBY = 1;
    private static final int mBZ = 18;
    private static final int mCa = 2;
    private iqa mfL = null;
    private izz mCb = null;
    private ipx mCc = null;
    private iox mCd = null;
    private iox mCe = null;
    private ipx mCf = null;
    private iox[] mCg = null;
    private ist mCh = null;
    private ipx mCi = null;
    private iza mCj = null;
    private ios mCk = null;
    private ios mCl = null;
    private ipx mCm = null;
    private EnumSet<h> mCn = null;
    protected String mCo = null;
    protected iyu mCp = null;
    private int mCq = 0;

    public iyt(EnumSet<h> enumSet) {
        ipx ipx2;
        this.mCn = enumSet;
        this.a(iqo.dmS());
        this.W(ipx.c(new ipf[0]));
        ipx ipx3 = ipx.h(new ipf[0]);
        this.W(ipx3);
        this.mfL = new iqa(this.dcO(), 2, 2, 2, 2, iqb.mtp);
        ipx3.W(ipx.c(this.mfL));
        ipx ipx4 = ipx.l(new ipf[0]);
        ipx3.W(ipx4);
        ipx ipx5 = this.dtb();
        if (ipx5 != null) {
            ipx4.W(ipx5);
        }
        if (this.mCn.contains((Object)h.mCt) && (ipx2 = this.dth()) != null) {
            ipx4.W(ipx2);
        }
        if (this.mCn.contains((Object)h.mCu) && (ipx2 = this.dtl()) != null) {
            ipx4.W(ipx2);
        }
        if (this.mCn.contains((Object)h.mCv) && (ipx2 = this.dtt()) != null) {
            ipx4.W(ipx2);
        }
        if (this.mCn.contains((Object)h.mCw) && (ipx2 = this.dtw()) != null) {
            ipx4.W(ipx2);
        }
        this.W(ipx.a(16, 1, new ipf[0]));
        if (this.dsX()) {
            this.setVisible(false);
        }
    }

    public boolean dsX() {
        return true;
    }

    public iox dsY() {
        return new g(this, null);
    }

    protected void sH(boolean bl) {
        this.setVisible(bl);
    }

    protected String dcO() {
        return mBU;
    }

    private ipx dsZ() {
        ipk ipk2 = new ipk();
        ipk2.setColor(this.dnU());
        ipk2.a((iqz)null);
        ipk2.setSize(this.dnV(), this.dnW());
        return ipx.l(ipx.a(this.dta(), 1, new ipf[0]), ipx.d(ipk2), ipx.a(this.dta(), 1, new ipf[0]));
    }

    protected int dnU() {
        return 0x444444;
    }

    protected int dnV() {
        return 1;
    }

    protected int dnW() {
        return 18;
    }

    protected int dta() {
        return 2;
    }

    private ipx dtb() {
        if (!this.mCn.contains((Object)h.mCs)) {
            return null;
        }
        this.mCb = this.dtf();
        this.mCd = this.dtc();
        if (this.mCb == null || this.mCd == null) {
            this.mCn.remove((Object)h.mCs);
            this.mCb = null;
            this.mCd = null;
            return null;
        }
        this.mCc = ipx.l(new ipf[0]);
        this.mCc.W(ipx.d(ipx.a(this.dtd(), this.dte(), this.mCb)));
        this.mCc.W(ipx.a(this.dta(), 1, new ipf[0]));
        this.mCc.setVisible(false);
        return ipx.l(this.mCc, ipx.d(this.mCd));
    }

    protected iox dtc() {
        return new d(this, null);
    }

    protected void sI(boolean bl) {
        this.mCc.setVisible(bl);
        this.pack();
        this.dlx();
    }

    protected int dtd() {
        return 150;
    }

    protected int dte() {
        return 22;
    }

    protected izz dtf() {
        return new c(this, null);
    }

    protected void rE(String string) {
        this.mCo = string == null || string.trim().isEmpty() ? null : string;
        this.dty();
    }

    protected boolean dtg() {
        return this.mCo != null;
    }

    private ipx dth() {
        return null;
    }

    protected iox dti() {
        return new f(this, null);
    }

    protected iox[] dtj() {
        return null;
    }

    protected boolean dtk() {
        return false;
    }

    protected void sJ(boolean bl) {
        this.mCf.setVisible(bl);
    }

    private ipx dtl() {
        if (!this.mCn.contains((Object)h.mCu)) {
            return null;
        }
        this.mCp = this.dtm();
        if (this.mCp == null) {
            this.mCn.remove((Object)h.mCu);
            return null;
        }
        this.mCj = this.dtn();
        if (this.mCj == null) {
            this.mCn.remove((Object)h.mCu);
            this.mCp = null;
            return null;
        }
        this.mCj.hX(this.mCp.dtC() != this.mCp.dtB());
        this.mCj.sN(this.mCp.dtD());
        this.mCh = this.dto();
        if (this.mCh == null) {
            this.mCn.remove((Object)h.mCu);
            this.mCp = null;
            this.mCj = null;
            return null;
        }
        this.mCh.g(this.mCp.wp());
        this.mCh.zY(14);
        this.mCh.Rk(0xABABAB);
        this.mCi = ipx.l(new ipf[0]);
        this.mCi.W(this.mCh);
        this.mCi.W(ipx.a(this.dta(), 1, new ipf[0]));
        this.mCi.setVisible(this.mCp.dtB() == null || this.mCp.dtC() != this.mCp.dtB());
        return ipx.l(this.dsZ(), ipx.d(this.mCi), ipx.d(this.mCj));
    }

    protected iyu dtm() {
        return null;
    }

    protected iza dtn() {
        return new e(this, null);
    }

    protected ist dto() {
        return new ist();
    }

    protected void dtp() {
        if (this.mCp != null && this.mCj != null) {
            ioc ioc2 = this.mCj.eo(0, 0);
            this.mCp.a(this.djE(), new joa(ioc2.cf, ioc2.cg, this.mCj.getWidth(), this.mCj.getHeight()));
        }
    }

    public void dtq() {
        if (this.mCp.dtC() == this.mCp.dtB()) {
            this.mCh.setText("");
            this.mCi.setVisible(false);
            this.mCj.hX(false);
        } else {
            this.mCh.g(this.mCp.wp());
            this.mCi.setVisible(true);
            this.mCj.hX(true);
        }
        this.pack();
        this.dlx();
    }

    public void dtr() {
        this.mCj.sN(this.mCp.dtD());
    }

    protected boolean dts() {
        return this.mCp.dtB() != null && this.mCp.dtC() != this.mCp.dtB();
    }

    private ipx dtt() {
        if (!this.mCn.contains((Object)h.mCv)) {
            return null;
        }
        this.mCk = this.dtu();
        if (this.mCk == null) {
            this.mCn.remove((Object)h.mCv);
            return null;
        }
        this.mCk.rF(this.mCq > 0);
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(this.dsZ());
        ipx2.W(ipx.d(this.mCk));
        return ipx2;
    }

    protected ios dtu() {
        return new b(this, null);
    }

    public void sK(boolean bl) {
        if (this.mCn.contains((Object)h.mCv)) {
            this.mCq += bl ? 1 : -1;
            if (this.mCk != null) {
                this.mCk.rF(this.mCq > 0);
            }
        }
    }

    protected void dtv() {
    }

    private ipx dtw() {
        if (!this.mCn.contains((Object)h.mCw)) {
            return null;
        }
        this.mCl = this.dtx();
        if (this.mCl == null) {
            this.mCn.remove((Object)h.mCw);
            return null;
        }
        this.mCm = ipx.l(new ipf[0]);
        this.mCm.W(this.dsZ());
        this.mCm.W(ipx.d(this.mCl));
        this.mCm.setVisible(this.dtg() || this.dts() || this.dtk());
        return this.mCm;
    }

    protected ios dtx() {
        return new a(this);
    }

    private void dty() {
        if (this.mCn.contains((Object)h.mCw) && this.mCm != null) {
            this.mCm.setVisible(this.dtg() || this.dts() || this.dtk());
        }
    }

    protected void dtz() {
        if (this.mCn.contains((Object)h.mCs) && this.dtg()) {
            this.mCb.setText("");
            this.rE("");
            this.mCd.hX(false);
            this.mCc.setVisible(false);
        }
        if (this.mCn.contains((Object)h.mCu) && this.dts()) {
            this.mCp.b(this.mCp.dtB());
            this.mCj.hX(false);
            this.mCi.setVisible(false);
        }
        if (this.mCn.contains((Object)h.mCt) && this.dtk()) {
            for (int i = 0; i < this.mCg.length; ++i) {
                this.mCg[i].hX(false);
            }
            this.mCe.hX(false);
            this.mCf.setVisible(false);
        }
        this.pack();
        this.dlx();
    }

    public void kN(float f2) {
        if (this.mfL != null) {
            this.mfL.hz(f2);
        }
    }
}

