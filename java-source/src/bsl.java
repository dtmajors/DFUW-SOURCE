/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bsl
implements bsh {
    private ldv GUID = null;
    private ldv aXQ = null;
    private ldv aXR = null;
    private ldv dAu = null;
    private int ResourceType = 0;
    private int asi = 0;
    private cak.c bpW = null;
    private alc.a brQ;
    private int aCJ = -1;
    private boolean aXT = true;
    private String DisplayName = null;
    private ej[] DR = null;
    private long aXU = 0L;

    public bsl() {
    }

    public bsl(bsl bsl2) {
        this.GUID = bsl2.GUID;
        this.ResourceType = bsl2.ResourceType;
        this.b(bsl2);
    }

    @Override
    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    @Override
    public ldv AW() {
        return this.aXQ;
    }

    public void iD(ldv ldv2) {
        this.aXQ = ldv2;
    }

    public ldv AV() {
        return this.aXR;
    }

    public void cJ(ldv ldv2) {
        this.aXR = ldv2;
    }

    @Override
    public ldv avU() {
        return this.dAu;
    }

    public void js(ldv ldv2) {
        this.dAu = ldv2;
    }

    @Override
    public long AQ() {
        return this.aXU;
    }

    public void u(long l2) {
        this.aXU = l2;
    }

    @Override
    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    @Override
    public int vf() {
        return this.asi;
    }

    public void do(int n) {
        this.asi = n;
    }

    @Override
    public cak.c auO() {
        return this.bpW;
    }

    public void b(cak.c c2) {
        this.bpW = c2;
    }

    @Override
    public alc.a awF() {
        return this.brQ;
    }

    public void d(alc.a a2) {
        this.brQ = a2;
    }

    @Override
    public int AR() {
        return this.aCJ;
    }

    public void fc(int n) {
        this.aCJ = n;
    }

    @Override
    public boolean AT() {
        return this.aXT;
    }

    public void aN(boolean bl2) {
        this.aXT = bl2;
    }

    public String getDisplayName() {
        return this.DisplayName;
    }

    public void setDisplayName(String string) {
        this.DisplayName = string;
    }

    public void b(bsl bsl2) {
        assert (bsl2 != null);
        assert (this.GUID.equals(bsl2.getGUID()));
        assert (this.ResourceType == bsl2.az());
        this.aXQ = bsl2.AW();
        this.aXR = bsl2.AV();
        this.dAu = bsl2.avU();
        this.asi = bsl2.vf();
        this.bpW = bsl2.bpW;
        this.aCJ = bsl2.AR();
        this.brQ = bsl2.awF();
        this.aXT = bsl2.AT();
        this.DisplayName = bsl2.getDisplayName();
        this.aXU = bsl2.AQ();
        this.DR = new ej[bsl2.DR.length];
        int n = this.DR.length;
        for (int i = 0; i < n; ++i) {
            this.DR[i] = bsl2.DR[i].fm();
        }
    }

    public final boolean c(bsl bsl2) {
        return this.GUID.equals(bsl2.GUID);
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof bsl) {
            return this.c((bsl)object);
        }
        lfn.b(0, "SFResourceItem", "equals() Comparing to different object: " + object.getClass().getName());
        assert (false);
        return false;
    }

    public String Eg() {
        return this.bpW.name();
    }

    @Override
    public final bsm awx() {
        bsm bsm2 = lea.acl(this.ResourceType);
        if (bsm2 == null) {
            lfn.b(5, "SFResourceItem", "getResourceItemClass() No ResourceItemClass found for item " + this.GUID + " with resourcetype=" + this.ResourceType);
            assert (false);
        }
        return bsm2;
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public boolean awU() {
        bsm bsm2 = this.awx();
        if (bsm2 == null) {
            lfn.b(5, "SFResourceItem", "isAttachable() No ResourceItemClass found for item " + this.GUID + " with resourcetype=" + this.ResourceType);
            return false;
        }
        return bsm2.awU();
    }

    public boolean Uu() {
        return this.aCJ >= 0;
    }

    public boolean auV() {
        return this.brQ != null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFResourceItem: ");
        stringBuilder.append("GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(" ");
        stringBuilder.append(this.pa());
        if (this.awx().auW()) {
            stringBuilder.append(" (");
            stringBuilder.append(this.asi);
            stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }

    public String art() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFResourceItem: ");
        stringBuilder.append("GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' Quantity=");
        stringBuilder.append(this.asi);
        return stringBuilder.toString();
    }

    @Override
    public ej[] arJ() {
        return this.DR;
    }

    @Override
    public boolean ad(int n) {
        if (n <= 0) {
            lfn.b(5, "SFResourceItem", "containsAttribute() AttributeType is invalid.");
            return false;
        }
        if (this.DR == null) {
            return false;
        }
        return this.mh(n) != null;
    }

    public ej ae(int n) {
        if (n <= 0) {
            lfn.b(5, "SFResourceItem", "getAttribute() AttributeType is invalid.");
            return null;
        }
        return this.mh(n);
    }

    public et ah(int n) {
        if (n <= 0) {
            lfn.b(5, "SFResourceItem", "getFloatAttribute() AttributeType is invalid.");
            return null;
        }
        return (et)this.mh(n);
    }

    public float al(int n) {
        et et2 = this.ah(n);
        if (et2 == null) {
            lfn.b(0, "SFResourceItem", "getFloatAttributeValue() Attribute '" + ep.aM((int)n) + "' was not found.");
            return 0.0f;
        }
        return et2.fN();
    }

    public ew ao(int n) {
        if (n <= 0) {
            lfn.b(5, "SFResourceItem", "getIntegerAttribute() AttributeType is invalid.");
            return null;
        }
        return (ew)this.mh(n);
    }

    public void c(int n, float f2) {
        et et2 = this.ah(n);
        if (et2 == null) {
            et2 = new et();
            et2.setType(n);
            et2.o(f2);
            this.b(et2);
        } else {
            et2.o(f2);
        }
    }

    public void g(ej ej2) {
        if (ej2 == null) {
            lfn.b(5, "SFResourceItem", "updateAttribute() Attribute is null.");
            return;
        }
        switch (ej2.getDataType()) {
            case 1: {
                this.a((es)ej2);
                break;
            }
            case 2: {
                this.e((et)ej2);
                break;
            }
            case 3: {
                this.a((ew)ej2);
                break;
            }
            case 6: {
                this.a((fh)ej2);
                break;
            }
            case 7: {
                this.a((ff)ej2);
                break;
            }
            default: {
                lfn.b(5, "SFResourceItem", "updateAttribute() Unhandled datatype provided: '" + ej2.fl() + "'");
                return;
            }
        }
    }

    private void b(ej ej2) {
        if (ej2 == null) {
            lfn.b(5, "SFResourceItem", "addAttribute() Attribute is null.");
            return;
        }
        if (this.ad(ej2.getType())) {
            lfn.b(5, "SFResourceItem", "addAttribute() Item " + this.GUID + " already contains attribute '" + ej2.getName() + "'");
            this.g(ej2);
            return;
        }
        if (this.DR == null) {
            this.DR = new ej[1];
            this.DR[0] = ej2;
            return;
        }
        ej[] ejArray = new ej[this.DR.length + 1];
        for (ej ejArray[var3_3] : this.DR) {
        }
        ejArray[this.DR.length] = ej2;
        this.DR = ejArray;
    }

    private ej mh(int n) {
        assert (n > 0);
        if (this.DR == null) {
            return null;
        }
        int n2 = this.DR.length;
        for (int i = 0; i < n2; ++i) {
            if (this.DR[i].getType() != n) continue;
            return this.DR[i];
        }
        return null;
    }

    private void a(es es2) {
        assert (es2 != null);
        es es3 = (es)this.ae(es2.getType());
        if (es3 == null) {
            this.b(es2);
            return;
        }
        lfn.b(0, "SFResourceItem", "updateEnchantmentAttribute() Updating attribute '" + es2.getName() + "' with enchantment " + es2.fJ() + "'");
        lfn.b(0, "SFResourceItem", "updateEnchantmentAttribute() Updating strength from " + es3.fE() + " to " + es2.fE());
        es3.bf(es2.fD());
        es3.m(es2.fE());
        es3.a(es2.fF());
    }

    private void e(et et2) {
        assert (et2 != null);
        et et3 = this.ah(et2.getType());
        if (et3 == null) {
            this.b(et2);
            return;
        }
        et3.o(et2.fN());
    }

    private void a(ew ew2) {
        assert (ew2 != null);
        ew ew3 = this.ao(ew2.getType());
        if (ew3 == null) {
            this.b(ew2);
            return;
        }
        ew3.bi(ew2.fQ());
    }

    private void a(ff ff2) {
        assert (ff2 != null);
        ff ff3 = (ff)this.ae(ff2.getType());
        if (ff3 == null) {
            this.b(ff2);
            return;
        }
        lfn.b(0, "SFResourceItem", "updateStringAttribute() Updating Attribute '" + ff2.getName() + "' from " + ff3.getStringValue() + " to " + ff2.getStringValue());
        ff3.av(ff2.getStringValue());
    }

    private void a(fh fh2) {
        assert (fh2 != null);
        fh fh3 = (fh)this.ae(fh2.getType());
        if (fh3 == null) {
            this.b(fh2);
            return;
        }
        lfn.b(0, "SFResourceItem", "updateVector3Attribute() Updating Attribute '" + fh2.getName() + "' from " + fh3.gy() + " to " + fh2.gy());
        fh3.L(fh2.gy());
    }

    @Override
    public bsf awy() {
        return new bsl(this);
    }

    @Override
    public String awz() {
        return this.awx().getName();
    }

    @Override
    public lip awA() {
        return new ljg(this.DisplayName);
    }

    @Override
    public float awB() {
        return this.al(1104);
    }

    @Override
    public boolean awD() {
        return true;
    }

    @Override
    public bsg awE() {
        return this.awx();
    }

    @Override
    public float Bb() {
        for (ej ej2 : this.DR) {
            if (ej2.getType() != 1552) continue;
            et et2 = (et)ej2;
            return et2.fN();
        }
        return 0.0f;
    }
}

