/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  ep
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bqs
extends brm {
    private int ResourceType = 0;
    private int asi = 0;
    private cak.c bpW = null;
    private int aXS = -1;
    private int aCJ = -1;
    private ldv bWM = null;
    private boolean aXT = true;
    private boolean dFl = false;
    private List<ej> dFm = null;
    private long aXU = 0L;

    public bqs() {
        this.setWeight(0.0f);
        this.mg(-1);
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public int vf() {
        return this.asi;
    }

    public void do(int n) {
        assert (this.asi >= 0);
        if (n < 0) {
            lfn.b(5, "SFInventoryItem", "setQuantity() Quantity is invalid: " + n);
            lfn.b(5, "SFInventoryItem", "setQuantity() " + this.toString());
            assert (false);
            return;
        }
        this.asi = n;
    }

    public cak.c auO() {
        return this.bpW;
    }

    public void b(cak.c c2) {
        this.bpW = c2;
    }

    public int AS() {
        return this.aXS;
    }

    public void fd(int n) {
        this.aXS = n;
    }

    public int AR() {
        return this.aCJ;
    }

    public void fc(int n) {
        this.aCJ = n;
    }

    public ldv auP() {
        return this.bWM;
    }

    public void iT(ldv ldv2) {
        this.bWM = ldv2;
    }

    public boolean AT() {
        return this.aXT;
    }

    public void aN(boolean bl2) {
        this.aXT = bl2;
    }

    public boolean auQ() {
        return this.dFl;
    }

    public void dQ(boolean bl2) {
        this.dFl = bl2;
    }

    @Override
    public final brm aue() {
        bqs bqs2 = new bqs();
        bqs2.setGUID(this.GUID);
        bqs2.l(this.ResourceType);
        bqs2.do(this.asi);
        bqs2.b(this.bpW);
        bqs2.fd(-1);
        bqs2.fc(-1);
        bqs2.aN(true);
        bqs2.dQ(false);
        bqs2.u(this.aXU);
        et et2 = this.ah(1104);
        if (et2 != null) {
            bqs2.g(et2.fn());
        }
        if (cug.uz((int)this.ResourceType)) {
            et2 = this.ah(1232);
            if (et2 != null) {
                bqs2.g(et2.fn());
            }
            if ((et2 = this.ah(1234)) != null) {
                bqs2.g(et2.fn());
            }
        }
        return bqs2;
    }

    public final bqs dR(boolean bl2) {
        et et2;
        bqs bqs2 = new bqs();
        bqs2.setGUID(this.GUID);
        bqs2.l(this.ResourceType);
        bqs2.do(this.asi);
        bqs2.b(this.bpW);
        bqs2.fd(-1);
        bqs2.fc(-1);
        bqs2.aN(true);
        bqs2.dQ(false);
        if (bl2) {
            bqs2.u(this.aXU);
        }
        if ((et2 = this.ah(1104)) != null) {
            bqs2.g(et2.fn());
        }
        if (cug.uz((int)this.ResourceType)) {
            et2 = this.ah(1232);
            if (et2 != null) {
                bqs2.g(et2.fn());
            }
            if ((et2 = this.ah(1234)) != null) {
                bqs2.g(et2.fn());
            }
        }
        return bqs2;
    }

    public bsl auR() {
        bsl bsl2 = new bsl();
        bsl2.setGUID(this.GUID);
        bsl2.l(this.ResourceType);
        bsl2.do(this.asi);
        bsl2.b(this.bpW);
        bsl2.u(this.aXU);
        if (this.aXS >= 0) {
            alc.a a2 = alc.a.getEnchantmentSlotType(this.aXS);
            bsl2.d(a2);
        }
        bsl2.fc(this.aCJ);
        bsl2.aN(this.aXT);
        bsl2.setDisplayName(this.ave());
        if (this.dFm != null) {
            int n = this.dFm.size();
            for (int i = 0; i < n; ++i) {
                ej ej2 = this.dFm.get(i);
                bsl2.g(ej2.fm());
            }
        }
        bsl2.iD(this.AW());
        bsl2.cJ(this.AV());
        bsl2.js(this.avU());
        return bsl2;
    }

    public boolean equals(Object object) {
        if (object instanceof bqs) {
            bqs bqs2 = (bqs)object;
            return ldv.au(this.GUID, bqs2.getGUID());
        }
        return false;
    }

    public int hashCode() {
        int n = 1;
        if (this.GUID != null) {
            n = n * 31 + this.GUID.hashCode();
        }
        return n;
    }

    public bro dS(boolean bl2) {
        assert (this.ResourceType > 0);
        assert (this.asi >= 0);
        return new bro(this.ResourceType, this.asi, bl2);
    }

    public brp auS() {
        assert (this.ResourceType > 0);
        assert (this.asi >= 0);
        brp brp2 = new brp();
        brp2.GUID = this.GUID;
        brp2.ResourceType = this.ResourceType;
        brp2.asi = this.asi;
        brp2.aXU = this.aXU;
        return brp2;
    }

    public String getDisplayName() {
        String string = ((lgw)lea.enW().acv(this.ResourceType)).awO().esy();
        ff ff2 = (ff)this.ae(1328);
        if (ff2 == null || ff2.getStringValue() == null) {
            return string;
        }
        if (string.equals(ff2.getStringValue())) {
            return string;
        }
        return ff2.getStringValue();
    }

    public lip auT() {
        return new ljk(this.getDisplayName());
    }

    public String Eg() {
        if (this.bpW != null) {
            return this.bpW.name();
        }
        return "null";
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public float getWeight() {
        return this.al(1104);
    }

    public boolean Uu() {
        return this.aCJ >= 0;
    }

    public boolean auU() {
        assert (this.ResourceType > 0);
        return lea.enW().isDescendant(this.ResourceType, cug.fjP);
    }

    public boolean auV() {
        return this.aXS >= 0;
    }

    public final boolean auW() {
        return cug.vQ((int)this.ResourceType);
    }

    public final boolean auX() {
        return !this.aXT;
    }

    public void auY() {
        this.aXS = -1;
    }

    public void auZ() {
        this.aCJ = -1;
    }

    public void ava() {
        this.auY();
        this.auZ();
    }

    public void setWeight(float f2) {
        this.m(1104, f2);
    }

    public void mg(int n) {
        this.ap(11280, n);
    }

    public long AQ() {
        return this.aXU;
    }

    @Deprecated
    public void u(long l2) {
        this.aXU = l2;
    }

    public void O(long l2) {
        this.aXU = l2;
    }

    public void avb() {
        assert (lcw.enc() || lcw.enb()) : "Attempt to Assign Persistent ID on Non-Server Node!!!";
        assert (this.aXU == 0L) : "Attempt to Assign Persistent ID to Item That Already Has An ID Set!!!";
        this.aXU = mx.si();
    }

    public void P(long l2) {
        this.aXU = l2;
    }

    public void Q(long l2) {
        assert (lcw.ena() || lcw.emZ() || lcw.enb()) : "Attempt to Update Persistent ID from Non-Client (or Non-AI) Node!!!";
        this.aXU = l2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.art());
        stringBuilder.append(" LayerType='");
        stringBuilder.append(this.Eg());
        stringBuilder.append("'");
        if (this.Uu()) {
            stringBuilder.append(" LayerSlotNumber=");
            stringBuilder.append(this.aCJ);
        } else if (this.auV()) {
            stringBuilder.append(" EnchantmentSlotNumber=");
            stringBuilder.append(this.aXS);
        }
        stringBuilder.append(" DatabasePersistentID=" + this.aXU);
        return stringBuilder.toString();
    }

    public String art() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' Quantity=");
        stringBuilder.append(this.asi);
        return stringBuilder.toString();
    }

    public boolean validate() {
        if (this.GUID == null) {
            lfn.b(5, "SFInventoryItem", "validate() GUID is null.");
            return false;
        }
        if (this.ResourceType <= 0) {
            lfn.b(5, "SFInventoryItem", "validate() ResourceType is invalid.");
            return false;
        }
        if (this.asi <= 0) {
            lfn.b(5, "SFInventoryItem", "validate() Quantity is invalid.");
            return false;
        }
        if (!this.ad(1104)) {
            lfn.b(5, "SFInventoryItem", "validate() Attribute 'Weight' was not found.");
            return false;
        }
        if (this.aXU <= 0L) {
            lfn.b(5, "SFInventoryItem", "validate() Database Persistent ID Not Set!!!");
            return false;
        }
        return true;
    }

    public ej[] avc() {
        if (this.dFm == null) {
            return null;
        }
        ej[] ejArray = new ej[this.dFm.size()];
        this.dFm.toArray(ejArray);
        return ejArray;
    }

    public List<ej> getAttributes() {
        return this.dFm;
    }

    public boolean ad(int n) {
        if (n <= 0) {
            lfn.b(5, "SFInventoryItem", "containsAttribute() AttributeType is invalid.");
            return false;
        }
        if (this.dFm == null) {
            return false;
        }
        return this.mh(n) != null;
    }

    public ej ae(int n) {
        if (n <= 0) {
            lfn.b(5, "SFInventoryItem", "getAttribute() AttributeType is invalid.");
            return null;
        }
        return this.mh(n);
    }

    public float avd() {
        float f2 = this.al(1232);
        float f3 = this.al(1234);
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return f2 / f3;
    }

    public et ah(int n) {
        if (n <= 0) {
            return null;
        }
        return (et)this.mh(n);
    }

    public float al(int n) {
        et et2 = this.ah(n);
        if (et2 == null) {
            return 0.0f;
        }
        return et2.fN();
    }

    public ew ao(int n) {
        if (n <= 0) {
            lfn.b(5, "SFInventoryItem", "getIntegerAttribute() AttributeType is invalid.");
            return null;
        }
        return (ew)this.mh(n);
    }

    public int ap(int n) {
        ew ew2 = this.ao(n);
        if (ew2 == null) {
            return 0;
        }
        return ew2.fQ();
    }

    public void removeAttribute(int n) {
        if (this.dFm != null) {
            int n2 = this.dFm.size();
            for (int i = 0; i < n2; ++i) {
                ej ej2 = this.dFm.get(i);
                if (ej2.getType() != n) continue;
                this.dFm.remove(i);
                return;
            }
        }
        lfn.b(5, "SFInventoryItem", "removeAttribute() Could not find attribute '" + ep.aM((int)n) + "'");
    }

    public void m(int n, float f2) {
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

    public void ap(int n, int n2) {
        ew ew2 = this.ao(n);
        if (ew2 == null) {
            ew2 = new ew();
            ew2.setType(n);
            ew2.bi(n2);
            this.b(ew2);
        } else {
            ew2.bi(n2);
        }
    }

    public void g(ej ej2) {
        if (ej2 == null) {
            lfn.b(5, "SFInventoryItem", "updateAttribute() Attribute is null.");
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
                lfn.b(5, "SFInventoryItem", "updateAttribute() Unhandled datatype provided: '" + ej2.fl() + "'");
                return;
            }
        }
    }

    private void b(ej ej2) {
        if (ej2 == null) {
            lfn.b(5, "SFInventoryItem", "addAttribute() Attribute is null.");
            return;
        }
        if (this.ad(ej2.getType())) {
            lfn.b(5, "SFInventoryItem", "addAttribute() Item " + this.GUID + " already contains attribute '" + ej2.getName() + "'");
            this.g(ej2);
            return;
        }
        if (this.dFm == null) {
            this.dFm = new ArrayList<ej>(2);
        }
        this.dFm.add(ej2);
    }

    private String ave() {
        String string = this.getDisplayName();
        if (lea.enW().isDescendant(this.ResourceType, cug.fqM)) {
            ew ew2 = (ew)this.ae(10384);
            if (ew2 != null) {
                string = string + " for " + cxd.xu((int)ew2.fQ());
            }
            return string;
        }
        if (!cug.uy((int)this.ResourceType)) {
            return string;
        }
        es es2 = (es)this.ae(1440);
        if (es2 != null && es2.fH() != null) {
            string = es2.fH().PrefixName + " " + string;
        }
        if ((es2 = (es)this.ae(1600)) != null && es2.fH() != null) {
            string = es2.fH().PrefixName + " " + string;
        }
        if ((es2 = (es)this.ae(1584)) != null && es2.fH() != null) {
            string = string + " " + es2.fH().PostfixName;
        }
        return string;
    }

    private ej mh(int n) {
        assert (n > 0);
        if (this.dFm != null) {
            int n2 = this.dFm.size();
            for (int i = 0; i < n2; ++i) {
                ej ej2 = this.dFm.get(i);
                if (ej2.getType() != n) continue;
                return ej2;
            }
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
        ff3.av(ff2.getStringValue());
    }

    private void a(fh fh2) {
        assert (fh2 != null);
        fh fh3 = (fh)this.ae(fh2.getType());
        if (fh3 == null) {
            this.b(fh2);
            return;
        }
        fh3.L(fh2.gy());
    }
}

