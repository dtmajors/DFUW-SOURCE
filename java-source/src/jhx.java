/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jhx {
    private ciw nga;
    private jia ngb = jia.ngn;
    private jhy ngc;

    public jhx(ciw ciw2, jhy jhy2) {
        this.nga = ciw2;
        this.ngc = jhy2;
        this.dGU();
    }

    public jia dGP() {
        return this.ngb;
    }

    public void a(jia jia2) {
        if (jia2 == this.ngb) {
            return;
        }
        this.ngb = jia2;
        jid.dHb().ngx.V(this);
    }

    public loz aND() {
        return lxf.tod.bD(this.nga.az());
    }

    public boolean a(jhw jhw2) {
        return !(!jhw2.nfY.isEmpty() && !jhw.a(jhw2.nfY, this.nga.BP()) || !jhw2.mQq.isEmpty() && !jhw2.mQq.contains((Object)this.ngb) || !jhw2.nfZ.isEmpty() && !jhw2.nfZ.contains((Object)this.dGQ()));
    }

    public boolean a(jib jib2) {
        if (jib2.ngs == null || jib2.ngs.isEmpty() || this.aND().exA().toLowerCase().contains(jib2.ngs.toLowerCase())) {
            return true;
        }
        String string = jid.dHb().e(this.nga.BP()).dGX().exA().toLowerCase();
        return string.contains(jib2.ngs.toLowerCase());
    }

    public jhz dGQ() {
        return this.nga.aPC() ? jhz.ngk : jhz.ngj;
    }

    public aim dGR() {
        return jid.dHb().UL(this.nga.az());
    }

    public String cCU() {
        boolean bl = this.nga instanceof ciy;
        int n = bl ? ((ciy)this.nga).aPN() : this.nga.az();
        lgw lgw2 = (lgw)lea.enW().acv(n);
        String string = "/dfdata/texture/dds/" + lgw2.atw().Name;
        return string;
    }

    public static hyn a(ciw ciw2) {
        lgw lgw2 = (lgw)lea.enW().acv(ciw2.az());
        return new iac(new hwo(lgw2), hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc(), false, true, false);
    }

    public hyn dGS() {
        return jhx.a(this.nga);
    }

    public jhy dGT() {
        return this.ngc;
    }

    private void dGU() {
        aim aim2 = this.dGR();
        if (aim2 == null) {
            this.ngb = jia.ngn;
        } else if (!aim2.isSelected()) {
            this.ngb = jia.ngo;
        } else if (aim2.isSelected()) {
            this.ngb = jia.ngp;
        }
    }
}

