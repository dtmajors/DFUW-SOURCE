/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  lcr
 */
import java.util.Map;

public class ccb
extends cbx
implements bto {
    protected Map<ldv, ldv> ekW = lcn.emw();
    protected int ekX = Integer.MAX_VALUE;
    private ljq bYY = new ljq();
    private ljq ekY = new ljq();
    private ljq ekZ = new ljq();
    protected boolean ela = false;
    protected amm elb = null;

    public int ry() {
        return -1;
    }

    public amm aIB() {
        return this.elb;
    }

    public void a(amm amm2) {
        this.elb = amm2;
    }

    public ljq aIC() {
        return this.ekZ;
    }

    public boolean kq(ldv ldv2) {
        return this.ekW.isEmpty() ? false : this.ekW.containsKey(ldv2);
    }

    public int aID() {
        return this.ekW.size();
    }

    public int aIE() {
        return this.ekX;
    }

    public void oO(int n) {
        this.ekX = n;
    }

    public boolean aIF() {
        return this.ekW.size() >= this.ekX;
    }

    public ljq aIG() {
        return this.bYY;
    }

    public void bh(ljq ljq2) {
        this.bYY = ljq2;
    }

    public boolean aIH() {
        return this.ela;
    }

    public void fz(boolean bl) {
        this.ela = bl;
    }

    public ccb(boolean bl) {
        super(bl);
    }

    protected void aII() {
    }

    protected void aIJ() {
    }

    public ccf kr(ldv ldv2) {
        if (!this.kq(ldv2)) {
            return ccf.ely;
        }
        if (this.ekW.remove(ldv2) != null) {
            this.aIJ();
            return ccf.elu;
        }
        return ccf.elE;
    }

    public void M(ldv ldv2, ldv ldv3) {
        assert (!this.kq(ldv2));
        ldv3 = ldv3 == null ? lcr.qAC : ldv3;
        this.ekW.put(ldv2, ldv3);
        this.aII();
    }

    public ccf a(eat eat2) {
        if (this.ry() == 1) {
            assert (cce.oQ(this.az()));
            if (!cce.aB(this.az(), eat2.bFe())) {
                return ccf.els;
            }
        }
        if (this.aIF()) {
            return ccf.elp;
        }
        if (this.kq(eat2.bFc())) {
            return ccf.elq;
        }
        return ccf.elo;
    }

    protected void aIw() {
        super.aIw();
        assert (this.aAG() != null);
        Map<String, eh> map = ei.ao(this.aAG().getFileName());
        assert (map != null);
        eh eh2 = map.get("AttachPoint_Player_Spawn_Location");
        assert (eh2 != null);
        assert (this.aAG().aw() != null);
        this.ekY = this.aAG().aw().eq(eh2.fb());
        this.ekZ = new ljq(this.aIG());
        this.ekZ.es(this.ekY);
        amm amm2 = lea.eoN().get(this.az());
        if (amm2 == null) {
            return;
        }
        this.a(amm2);
    }

    public void aIK() {
        this.aIw();
    }
}

