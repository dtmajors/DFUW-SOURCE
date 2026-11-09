/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class irr
extends ipx {
    private irs mvg;
    private float mvh = 0.0f;
    private float mvi = 0.0f;
    private boolean bGn = false;
    private ipb lLM = null;
    private List<iqa> mvj = null;
    private List<ipb> mvk = null;
    private List<ipk> mvl = null;
    private List<ipb> mvm = null;
    private List<ipb> mvn = null;
    private Map<ipf, lfs<Double, Boolean>> mvo = null;
    private ipb mvp;
    private ist mvq;
    private int mvr = -1;
    private static iqz mvs = new iqz(){

        public void e(ipf ipf2) {
            irr irr2 = (irr)ipf2;
            if (irr.a(irr2) != null) {
                irr2.setSize(irr.a(irr2).getWidth(), irr.a(irr2).getHeight());
            } else if (irr.b(irr2).size() >= 1) {
                iqa iqa2 = (iqa)irr.b(irr2).get(0);
                irr2.setSize(iqa2.getWidth(), iqa2.getHeight());
            } else {
                ipf2.setSize(0, 0);
            }
        }

        public void i(ipf ipf2) {
            irr irr2 = (irr)ipf2;
            ira.c(irr2);
            for (iqa iqa2 : irr.b(irr2)) {
                irr.a((irr)ipf2, iqa2);
            }
            if (irr.c(irr2).dnT() > 0) {
                int n = ((iqa)irr.b(irr2).get(0)).dju() / (irr.c(irr2).dnT() + 1);
                int n2 = ((iqa)irr.b(irr2).get(0)).getX() + n;
                int n3 = irr.c(irr2).dnW() == 0 ? ((iqa)irr.b(irr2).get(0)).djv() : irr.c(irr2).dnW();
                for (int i = 0; i < irr.d(irr2).size(); ++i) {
                    ((ipk)irr.d(irr2).get(i)).r(n2 - irr.c(irr2).dnV() / 2, (irr2.getHeight() - n3) / 2, irr.c(irr2).dnV(), n3);
                    if (irr.e(irr2) != null) {
                        ipb ipb2 = (ipb)irr.e(irr2).get(i);
                        ipb2.ek(n2 - ipb2.dju() / 2, (irr2.getHeight() - ipb2.djv()) / 2);
                    }
                    n2 += n;
                }
            }
            if (irr.c(irr2).doc()) {
                ((ipb)irr.g(irr2).get(irr.f(irr2))).RH(irr.c(irr2).doi() ? ((iqa)irr.b(irr2).get(irr.f(irr2))).getX() : ((iqa)irr.b(irr2).get(irr.f(irr2))).getX() + ((iqa)irr.b(irr2).get(irr.f(irr2))).getWidth() - ((ipb)irr.g(irr2).get(irr.f(irr2))).getWidth() / 2);
            }
            irr.a(irr2, true);
        }
    };
    private a mvt = null;
    private b mvu;

    public irr() {
        this(new irs());
    }

    public irr(irs irs2) {
        this.a(mvs);
        if (irs2 != null) {
            this.mvg = irs2;
            this.mvg.doo();
            this.dnD();
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.dnL();
        this.dnN();
    }

    protected void a(irs irs2) {
        this.mvg = irs2;
        this.mvg.doo();
        this.dnD();
    }

    private void dnD() {
        ipf ipf2;
        int n;
        if (this.mvg.dcO() != null) {
            this.lLM = new ipb(this.mvg.dcO());
            this.W(this.lLM);
        }
        this.mvj = lcn.emv();
        for (n = 0; n < this.mvg.dnS(); ++n) {
            ipf2 = new iqa(this.mvg.dnO() != null ? this.mvg.dnO() + (this.mvg.dnS() > 1 ? Integer.toString(n) : "") : null, 2, 2, 2, 2);
            this.mvj.add((iqa)ipf2);
            this.W(ipf2);
        }
        if (this.mvg.dnX()) {
            this.mvk = lcn.emv();
            for (n = 0; n < this.mvg.dnS(); ++n) {
                ipf2 = new ipb(this.mvg.dnP() + (this.mvg.dnS() > 1 ? Integer.toString(n) : ""));
                ipf2.hz(0.0f);
                this.mvk.add((ipb)ipf2);
                this.W(ipf2);
            }
        }
        if (this.mvg.dnT() > 0) {
            this.mvl = lcn.emv();
            for (n = 0; n < this.mvg.dnT(); ++n) {
                ipf2 = new ipk(this.mvg.dnU());
                ipf2.a((iqz)null);
                this.mvl.add((ipk)ipf2);
                this.W(ipf2);
            }
            if (this.mvg.dnZ() || this.mvg.doa()) {
                this.mvm = lcn.emv();
                for (n = 0; n < this.mvg.dnT(); ++n) {
                    ipf2 = new ipb(this.mvg.dnQ());
                    ipf2.hz(0.0f);
                    this.mvm.add((ipb)ipf2);
                    this.W(ipf2);
                }
            }
        }
        if (this.mvg.doc()) {
            this.mvn = lcn.emv();
            for (n = 0; n < this.mvg.dnS(); ++n) {
                ipf2 = new ipb(this.mvg.dnR() + (this.mvg.dnS() > 1 ? Integer.toString(n) : ""));
                ipf2.hz(this.mvg.dod() > 0.0 ? 0.0f : 1.0f);
                this.mvn.add((ipb)ipf2);
                this.W(ipf2);
            }
        }
        if (this.mvg.dnX() || this.mvg.dnT() > 0 && (this.mvg.doa() || this.mvg.dnZ()) || this.mvg.doc() && this.mvg.dod() > 0.0) {
            this.mvo = lcn.emw();
        }
        this.OI(0);
        if (this.mvg.doj()) {
            if (!lhn.isEmpty(this.mvg.don())) {
                this.mvp = new ipb(this.mvg.don());
                this.W(this.mvp);
            }
            this.mvq = new ist(this.mvg.dok(), this.mvg.dol(), this.mvg.dom(), "0%");
            this.W(this.mvq);
        }
    }

    @Override
    public void kh(float f) {
        if (this.lLM != null) {
            this.lLM.hz(f);
        }
    }

    public boolean dnE() {
        return this.mvq != null ? this.mvq.djL() : false;
    }

    public void sd(boolean bl) {
        if (this.mvp != null) {
            this.mvp.setVisible(bl);
        }
        if (this.mvq != null) {
            this.mvq.setVisible(bl);
        }
    }

    public iqa Sm(int n) {
        return this.mvj.get(n);
    }

    public void OI(int n) {
        int n2;
        if (n < 0 || n >= this.mvg.dnS() || n == this.mvr) {
            return;
        }
        for (n2 = 0; n2 < this.mvj.size(); ++n2) {
            this.mvj.get(n2).hz(n == n2 ? 1.0f : 0.0f);
        }
        if (this.mvg.dnX() && this.mvr >= 0 && this.mvo.containsKey(this.mvk.get(this.mvr))) {
            lfs<Double, Boolean> lfs2 = this.mvo.remove(this.mvk.get(this.mvr));
            this.mvk.get(n).hz(this.mvk.get(this.mvr).getAlpha());
            this.mvk.get(this.mvr).hz(0.0f);
            this.mvo.put(this.mvk.get(n), lfs2);
        }
        if (this.mvg.doc() && this.mvg.dod() > 0.0 && this.mvr >= 0) {
            if (this.mvo.containsKey(this.mvn.get(this.mvr))) {
                lfs<Double, Boolean> lfs3 = this.mvo.remove(this.mvn.get(this.mvr));
                this.mvn.get(n).hz(this.mvn.get(this.mvr).getAlpha());
                this.mvn.get(n).RH(this.mvn.get(this.mvr).getX());
                this.mvn.get(this.mvr).hz(0.0f);
                this.mvo.put(this.mvn.get(n), lfs3);
            }
        } else if (this.mvg.doc()) {
            for (n2 = 0; n2 < this.mvj.size(); ++n2) {
                this.mvn.get(n2).hz(n2 == n ? 1.0f : 0.0f);
            }
        }
        this.mvr = n;
    }

    public void setProgress(int n, int n2, int n3) {
        this.setProgress((float)n, (float)n2, (float)n3);
    }

    public void setProgress(float f, float f2, float f3) {
        this.setProgress(f / (f3 - f2));
    }

    public void setProgress(float f) {
        float f2 = this.bGn ? this.mvh : (f < 0.0f ? 0.0f : (this.mvi = f > 1.0f ? 1.0f : f));
        float f3 = f < 0.0f ? 0.0f : (this.mvh = f > 1.0f ? 1.0f : f);
        if (this.mvh == this.mvi) {
            if (this.mvg.doj()) {
                int n = Math.max(0, Math.min(Math.round(this.mvh * 100.0f), 100));
                this.mvq.setText(n + "%");
            }
            return;
        }
        this.dnF();
    }

    public void doTick(ldz ldz2) {
        if (!this.bGn) {
            return;
        }
        if (this.mvo == null || this.mvo.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<ipf, lfs<Double, Boolean>>> iterator = this.mvo.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<ipf, lfs<Double, Boolean>> entry = iterator.next();
            float f = entry.getKey().getAlpha() + (float)(ldz2.qwh / ((Double)entry.getValue().reX * 0.5) * ((Boolean)entry.getValue().reY != false ? 1.0 : -1.0));
            if (f > 1.0f) {
                f = 1.0f - (f - 1.0f);
                entry.getValue().reY = Boolean.FALSE;
            }
            if (f < 0.0f) {
                f = 0.0f;
                iterator.remove();
            }
            entry.getKey().hz(f);
        }
    }

    private void dnF() {
        if (!this.bGn) {
            return;
        }
        if (this.dnG() && this.mvu == null) {
            this.dnH();
            this.dnI();
            this.dnJ();
            this.dnK();
        }
        if (this.mvg.doj()) {
            int n = Math.max(0, Math.min(Math.round(this.mvh * 100.0f), 100));
            this.mvq.setText(n + "%");
        }
    }

    private boolean dnG() {
        for (iqa iqa2 : this.mvj) {
            this.c(iqa2);
        }
        return true;
    }

    private void dnH() {
        if (!this.mvg.dnX()) {
            return;
        }
        if (this.mvh < 1.0f) {
            return;
        }
        if (!this.mvo.containsKey(this.mvk.get(this.mvr))) {
            this.mvo.put(this.mvk.get(this.mvr), new lfs<Double, Boolean>(this.mvg.dnY(), Boolean.TRUE));
        }
    }

    private void dnI() {
        if (this.mvg.dnT() == 0) {
            return;
        }
        if (this.mvh > this.mvi && !this.mvg.dnZ() || this.mvh < this.mvi && !this.mvg.doa()) {
            return;
        }
        for (int i = 0; i < this.mvl.size(); ++i) {
            ipk ipk2 = this.mvl.get(i);
            float f = ((float)ipk2.getX() + (float)ipk2.getWidth() / 2.0f - (float)this.mvj.get(this.mvr).getX()) / (float)this.mvj.get(this.mvr).dju();
            boolean bl = false;
            if (this.mvg.dnZ() && this.mvh > this.mvi) {
                bl = this.mvi < f && this.mvh >= f;
            } else if (this.mvg.doa() && this.mvh < this.mvi) {
                boolean bl2 = bl = this.mvi > f && this.mvh <= f;
            }
            if (!bl || this.mvo.containsKey(this.mvm.get(i))) continue;
            this.mvo.put(this.mvm.get(i), new lfs<Double, Boolean>(this.mvg.dob(), Boolean.TRUE));
        }
    }

    private void dnJ() {
        if (!this.mvg.doc()) {
            return;
        }
        if (this.mvh == 1.0f) {
            if (this.mvg.dod() > 0.0) {
                this.mvo.remove(this.mvn.get(this.mvr));
            } else {
                this.mvn.get(this.mvr).hz(0.0f);
            }
        } else {
            this.mvn.get(this.mvr).RH(this.mvg.doi() ? this.mvj.get(this.mvr).getX() - 1 : this.mvj.get(this.mvr).getX() + this.mvj.get(this.mvr).getWidth() + 1);
            if (this.mvg.dod() > 0.0) {
                if (this.mvo.containsKey(this.mvn.get(this.mvr))) {
                    return;
                }
                this.mvo.put(this.mvn.get(this.mvr), new lfs<Double, Boolean>(this.mvg.dod(), Boolean.TRUE));
            } else {
                boolean bl = (this.mvg.dof() ? this.mvh >= 0.0f : this.mvh > 0.0f) && (this.mvg.doe() ? this.mvh <= 1.0f : this.mvh < 1.0f);
                this.mvn.get(this.mvr).hz(bl ? 1.0f : 0.0f);
            }
        }
    }

    private void c(iqa iqa2) {
        int n = Math.round((float)iqa2.dju() * lew.E(0.0f, this.mvh, 1.0f));
        int n2 = (this.getWidth() - iqa2.dju()) / 2;
        int n3 = !this.mvg.doi() ? n2 : this.getWidth() - n2 - n;
        int n4 = (this.getHeight() - iqa2.djv()) / 2;
        iqa2.r(n3, n4, n, iqa2.djv());
    }

    private void dnK() {
        if (this.mvo == null || this.mvo.isEmpty() || this.mvt != null) {
            return;
        }
        this.mvt = new a(this, null);
        irr.czy().a(this.mvt);
    }

    private void dnL() {
        if (this.mvt == null) {
            return;
        }
        if (irr.czy() != null) {
            irr.czy().b(this.mvt);
        }
        this.mvt = null;
    }

    @Override
    public void dkq() {
        super.dkq();
        this.dnM();
    }

    public void dnM() {
        this.dnN();
        if (this.djM() && this.djS() && this.mvg.dog()) {
            this.mvu = new b(this, null);
            irr.czy().a(this.mvu);
        }
    }

    public void dnN() {
        if (this.mvu == null) {
            return;
        }
        if (irr.czy() != null) {
            irr.czy().b(this.mvu);
        }
        this.mvu = null;
    }

    static /* synthetic */ ipb a(irr irr2) {
        return irr2.lLM;
    }

    static /* synthetic */ List b(irr irr2) {
        return irr2.mvj;
    }

    static /* synthetic */ void a(irr irr2, iqa iqa2) {
        irr2.c(iqa2);
    }

    static /* synthetic */ irs c(irr irr2) {
        return irr2.mvg;
    }

    static /* synthetic */ List d(irr irr2) {
        return irr2.mvl;
    }

    static /* synthetic */ List e(irr irr2) {
        return irr2.mvm;
    }

    static /* synthetic */ int f(irr irr2) {
        return irr2.mvr;
    }

    static /* synthetic */ List g(irr irr2) {
        return irr2.mvn;
    }

    static /* synthetic */ boolean a(irr irr2, boolean bl) {
        irr2.bGn = bl;
        return irr2.bGn;
    }

    static /* synthetic */ Map h(irr irr2) {
        return irr2.mvo;
    }

    static /* synthetic */ void i(irr irr2) {
        irr2.dnL();
    }

    static /* synthetic */ float j(irr irr2) {
        return irr2.mvh;
    }
}

