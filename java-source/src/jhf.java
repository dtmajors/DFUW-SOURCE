/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.Map;

public abstract class jhf
extends jhi {
    public static final String nep = "Feat";
    private ign lUf;
    private Map<ign, igu> lUi;
    private ipb neq;
    private ipx ner;
    private ipx nes;
    private ipb net;

    public jhf(ign ign2) {
        this.lUf = ign2;
        this.dFU();
    }

    public ign cUF() {
        return this.lUf;
    }

    @Override
    public int dFz() {
        return this.lUf.getId();
    }

    @Override
    public String dFA() {
        return nep;
    }

    public ipb dFB() {
        return this.neq;
    }

    public void m(ign ign2) {
        igu igu2;
        if (this.lUi != null && (igu2 = this.lUi.get(ign2)) != null) {
            igu2.aTg();
            return;
        }
    }

    @Override
    public void g(iph iph2) {
        this.neq = new ipb("/dfdata/" + this.lUf.cTI().cTo());
        this.ner = ipx.a(24, 24, this.neq);
        this.nes = ipx.d(this.ner);
        iph2.W(this.nes);
    }

    @Override
    public loz dFC() {
        return this.lUf.cTE();
    }

    @Override
    public int dFD() {
        return this.lUf.cTu();
    }

    @Override
    public int dFE() {
        return this.lUf.cTt();
    }

    @Override
    public ipf UF(int n) {
        ipx ipx2 = null;
        boolean bl = this.lUf.a(igp.lTz);
        boolean bl2 = this.lUf.a(igp.lTA);
        boolean bl3 = this.lUf.a(igp.lTB);
        if (bl || bl2 || bl3) {
            ipx2 = ipx.a(n, 1, new ipf[0]);
            ipx ipx3 = ipx.j(new ipf[0]);
            ipx2.W(ipx3);
            if (bl) {
                ipx3.W(ipx.c(new ipf[0]));
                ipx3.W(ipx.d(ipx.a(24, 24, new ipb("button_tag_daily_off_normal"))));
            }
            if (bl2) {
                ipx3.W(ipx.c(new ipf[0]));
                ipx3.W(ipx.d(ipx.a(24, 24, new ipb("button_tag_weekly_off_normal"))));
            }
            if (bl3) {
                ipx3.W(ipx.c(new ipf[0]));
                ipx3.W(ipx.d(new ipb("button_tag_party_off_normal")));
            }
            ipx3.W(ipx.c(new ipf[0]));
        }
        return ipx2;
    }

    @Override
    public String dFF() {
        return this.lUf.getDescription();
    }

    @Override
    public ipf UG(int n) {
        return ipx.a(n, 1, ipx.d(new ipb("feat_ea_goals")));
    }

    @Override
    public ipf dFG() {
        HashSet<ign> hashSet = this.lUf.cTz();
        for (ign object2 : hashSet) {
            if (object2.cTM()) continue;
            if (this.lUi == null) {
                this.lUi = lcn.emw();
            }
            this.lUi.put(object2, new igu(object2, 12));
        }
        Object object = null;
        if (this.lUi != null) {
            object = ipx.c(8, 8, 8, 8, new ipf[0]);
            ipx ipx2 = ipx.j(new ipf[0]);
            ((iph)object).W(ipx.d(ipx2));
            for (igu igu2 : this.lUi.values()) {
                ipx2.W(igu2);
                igu2.aTg();
            }
        }
        return object;
    }

    @Override
    public boolean du(int n, int n2) {
        if (super.du(n, n2)) {
            return true;
        }
        this.djE();
        ioa.cyJ().cIJ().q(this.lUf);
        return true;
    }

    @Override
    public void dFH() {
        if (this.djE() == null) {
            return;
        }
        this.net = new ipb("category_framed_progress_glow");
        this.nes.W(this.net);
        this.ner.a(new iqu(32, 32));
        super.dFH();
    }

    @Override
    public void dy(double d2) {
        super.dy(d2);
        if (d2 >= 1.0 && this.net != null) {
            float f2 = (float)(1.0 - 1.0 * ((d2 - 1.0) / 0.5));
            this.net.hz(f2);
        }
    }

    @Override
    public void dFI() {
        super.dFI();
        this.net.removeFromParent();
        this.net = null;
        this.ner.a(new iqu(24, 24));
    }

    protected ipx dFJ() {
        return this.nes;
    }

    protected Map<ign, igu> dFK() {
        return this.lUi;
    }
}

