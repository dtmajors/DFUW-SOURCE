/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  cdb
 *  cew
 *  cex
 *  cug
 *  en
 *  lcw
 */
public abstract class bqv
extends btk {
    public static final int dFr = 24;
    public static final int dFs = 12;
    private static final String dFt = "^.*[^-#_()a-zA-Z0-9 ].*$";
    protected brb dBP;
    protected bqn dFu = null;
    protected boolean dFv = true;
    protected boolean dFw = true;
    protected boolean dFx = true;
    protected boolean dFy = true;
    protected double dFz = 0.0;
    protected double dFA = 0.0;
    protected double dFB = 0.0;

    public final brb auk() {
        return this.dBP;
    }

    public final bqn avk() {
        return this.dFu;
    }

    public final void a(brb brb2) {
        this.dBP = brb2;
        this.dFv = this.dBP instanceof cdb;
        if (this.asf() != null) {
            this.asf().a(this.dBP);
        }
        if (this.dBP != null && this.dBP instanceof cew) {
            this.dFu = new bqo(this);
            this.dFu.initialize();
        }
    }

    public void g(boolean bl2, boolean bl3) {
        this.dFx = bl2;
        this.dFy = bl3;
        this.dFw = bl2 || bl3;
    }

    public abstract bqk asf();

    public abstract void b(bqk var1);

    @Override
    public final void addRelation(dul dul2) {
        if (dul2 == null) {
            lfn.b(5, "SFInventoryManager", "addRelation() NewRelation is null.");
            return;
        }
        if (dul2.Bq().equals(this.GUID) && dul2.Br().equals(this.GUID)) {
            lfn.b(5, "SFInventoryManager", "addRelation() Both relation startpoint and endpoint equals GUID: " + this.GUID);
            return;
        }
        switch (dul2.getRelationType()) {
            case 1031: {
                bqk bqk2 = (bqk)this.MessageDelegator.d(dul2.Br());
                if (bqk2 == null) {
                    lfn.b(5, "SFInventoryManager", "addRelation() Inventory " + dul2.Br() + " was not found.");
                    return;
                }
                if (this.asf() == null) {
                    this.b(bqk2);
                    this.asf().a(this.dBP);
                    break;
                }
                if (this.asf().getGUID().equals(bqk2.getGUID())) {
                    lfn.b(5, "SFInventoryManager", "addRelation() Object already contains inventory " + bqk2.getGUID());
                    break;
                }
                this.b(bqk2);
                this.asf().a(this.dBP);
                break;
            }
            default: {
                super.addRelation(dul2);
            }
        }
    }

    private float a(ej ej2, float f2) {
        if (ej2 instanceof ez) {
            return ((ez)ej2).gl();
        }
        if (ej2 instanceof et) {
            return ((et)ej2).fN();
        }
        return f2;
    }

    public loz ja(ldv ldv2) {
        Object object;
        brb brb2;
        if (ctg.ffk) {
            return null;
        }
        if (ldv2 == null) {
            return null;
        }
        bqs bqs2 = this.iK(ldv2);
        if (bqs2 == null) {
            return null;
        }
        if (!(this.dBP instanceof cex) && !(this.dBP instanceof cew)) {
            return null;
        }
        cev cev2 = (cev)((Object)this.dBP);
        el el2 = cev2.fi();
        if (el2 == null) {
            return null;
        }
        cur cur2 = lea.eos().get(bqs2.pa());
        if (cur2 == null) {
            return null;
        }
        if (this.isServerObject() && (brb2 = this.auk()) instanceof cex && (object = (cex)brb2).mp()) {
            return null;
        }
        int n = cjv.getConnectionAttribute(bqs2.az());
        if (n != -1) {
            object = el2.ao(n);
            if (object == null) {
                return mce.usC.bD(new Object[0]);
            }
            et et2 = el2.ah(((ew)object).fQ());
            if (et2 == null) {
                return mce.usC.bD(new Object[0]);
            }
            float f2 = this.a(et2, cur2.fye);
            if (f2 < cur2.fye) {
                return mce.usw.bD((int)cur2.fye, et2.getType());
            }
            return null;
        }
        if (lcw.enb()) {
            return null;
        }
        int n2 = ckh.getWeaponTypeConnectedAttribute(bqs2.az());
        if (n2 == -1) {
            return null;
        }
        ew ew2 = el2.ao(n2);
        if (ew2 == null) {
            return mce.usC.bD(new Object[0]);
        }
        et et3 = el2.ah(ew2.fQ());
        if (et3 == null) {
            return mce.usC.bD(new Object[0]);
        }
        float f3 = this.a(et3, cur2.fye);
        if (f3 < cur2.fye) {
            return mce.usw.bD((int)cur2.fye, et3.getType());
        }
        return null;
    }

    public loz jb(ldv ldv2) {
        if (ctg.ffk) {
            return null;
        }
        if (ldv2 == null) {
            return null;
        }
        bqs bqs2 = this.iK(ldv2);
        if (bqs2 == null) {
            return null;
        }
        if (!(this.dBP instanceof cex) && !(this.dBP instanceof cew)) {
            return null;
        }
        if (!this.mi(bqs2.az())) {
            return mce.usv.bD(new Object[0]);
        }
        cur cur2 = lea.eos().get(bqs2.pa());
        if (cur2 == null) {
            return null;
        }
        cev cev2 = (cev)((Object)this.dBP);
        el el2 = cev2.fi();
        if (el2 == null) {
            return null;
        }
        ej ej2 = el2.ae(cur2.fyd);
        ej ej3 = el2.ae(cur2.fyf);
        if (ej2 == null && ej3 == null) {
            return null;
        }
        float f2 = this.a(ej2, cur2.fye);
        float f3 = this.a(ej3, cur2.fyg);
        if (ej2 != null) {
            if (f2 >= cur2.fye) {
                return null;
            }
            if (ej3 != null) {
                if (f3 >= cur2.fyg) {
                    return null;
                }
                return mce.usx.bD((int)cur2.fye, ej2.getType(), (int)cur2.fyg, ej3.getType());
            }
            return mce.usw.bD((int)cur2.fye, ej2.getType());
        }
        return null;
    }

    public boolean mi(int n) {
        if (!this.isServerObject()) {
            return true;
        }
        if (this.dBP == null || !(this.dBP instanceof cex)) {
            return true;
        }
        if (!lea.enW().isDescendant(n, cug.fjl) && !lea.enW().isDescendant(n, cug.fjr)) {
            return true;
        }
        ff ff2 = (ff)cug.bh((int)n, (int)11024);
        if (ff2 == null) {
            return true;
        }
        String string = ff2.getStringValue();
        if (string == null) {
            return true;
        }
        cjv cjv2 = cjv.getValueByName(string);
        if (cjv2 == null) {
            return true;
        }
        cex cex2 = (cex)this.dBP;
        en en2 = cex2.jm();
        if (en2 == null) {
            return true;
        }
        ff ff3 = (ff)en2.ae(11552);
        if (ff3 == null) {
            return true;
        }
        String string2 = ff3.getStringValue();
        if (string2 == null) {
            return true;
        }
        cjx cjx2 = lea.epx().hu(string2);
        if (cjx2 == null) {
            return true;
        }
        return cjv2.ordinal() == cjx2.aQv().ordinal();
    }

    @Override
    public void cleanUp() {
        if (this.dFu != null) {
            this.dFu.cleanUp();
        }
    }

    public abstract bqs iK(ldv var1);

    @Override
    public void initialize() {
        super.initialize();
        if (this.dBP != null && this.dBP instanceof cex) {
            this.dFu = new bqp(this);
            this.dFu.initialize();
        }
    }

    public abstract boolean isServerObject();

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bED()) {
            case 7936: {
                this.a((fmm)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public final void removeRelation(dul dul2) {
        if (dul2 == null) {
            lfn.b(5, "SFInventoryManager", "removeRelation() Relation is null.");
            return;
        }
        if (dul2.Bq().equals(this.GUID) && dul2.Br().equals(this.GUID)) {
            lfn.b(5, "SFInventoryManager", "removeRelation() Both relation startpoint and endpoint equals GUID: " + this.GUID);
            return;
        }
        switch (dul2.getRelationType()) {
            case 1031: {
                if (this.asf() == null) {
                    lfn.b(5, "SFInventoryManager", "removeRelation() Inventory is null for object " + this.GUID);
                    return;
                }
                if (!this.asf().getGUID().equals(dul2.Br())) {
                    lfn.b(5, "SFInventoryManager", "removeRelation() " + this.GUID + " is not connected to inventory " + dul2.Br() + " but to " + this.asf().getGUID());
                    return;
                }
                this.asf().a(null);
                this.b(null);
                break;
            }
            default: {
                super.removeRelation(dul2);
            }
        }
    }

    protected final boolean a(ldv ldv2, bqm.b b2) {
        assert (ldv2 != null);
        bqs bqs2 = this.iK(ldv2);
        if (bqs2 == null) {
            lfn.b(5, "SFInventoryManager", "canMoveItemFromBackpack() Could not find item " + ldv2);
            return false;
        }
        if (cug.vL((int)bqs2.az())) {
            return false;
        }
        if (cug.ws((int)bqs2.az()) && (b2 == null || !b2.mf(bqs2.az()))) {
            return false;
        }
        if (cug.wu((int)bqs2.az()) && (b2 == null || b2 == bqm.b.dEr)) {
            return false;
        }
        if (cug.wA((int)bqs2.az()) && b2 == bqm.b.dEJ) {
            return false;
        }
        if (bqs2.az() == cug.ftZ && b2 != bqm.b.dEn && b2 != bqm.b.dEP) {
            return false;
        }
        return cug.wd((int)bqs2.az());
    }

    protected void a(fmm fmm2) {
        switch (fmm2.bEz()) {
            default: 
        }
        this.asf().receiveMessage((dxq)fmm2);
    }

    protected final boolean avl() {
        cdb cdb2;
        byv byv2;
        brb brb2 = this.auk();
        return brb2 instanceof cdb && !(byv2 = (cdb2 = (cdb)brb2).aJD().aEP()).isAlive();
    }

    protected final boolean avm() {
        if (this.dBP.Ux()) {
            return false;
        }
        if (this.asf().alX() != bqm.b.dEr && this.asf().alX() != bqm.b.dEq) {
            return false;
        }
        double d2 = this.MessageDelegator.arc().rgz;
        return d2 < this.dFA + 0.1;
    }

    protected final boolean avn() {
        if (this.dBP.Ux()) {
            return false;
        }
        double d2 = this.MessageDelegator.arc().rgz;
        return d2 < this.dFB + 0.1;
    }

    protected final boolean I(ldv ldv2, ldv ldv3) {
        brz brz2 = this.asf().aun().awc();
        if (brz2 != null) {
            if (ldv2.equals(brz2.getGUID())) {
                return true;
            }
            if (ldv3.equals(brz2.getGUID())) {
                return true;
            }
        }
        return false;
    }

    protected final boolean gf(String string) {
        int n;
        if (string == null) {
            return false;
        }
        if ((string = string.trim()).isEmpty()) {
            return false;
        }
        int n2 = n = lcw.emW() ? 12 : 24;
        if (string.length() > n) {
            return false;
        }
        for (int i = 0; i < string.length(); ++i) {
            char c2 = string.charAt(i);
            if (Character.isLetter(c2) || Character.isDigit(c2) || Character.isWhitespace(c2)) continue;
            return false;
        }
        return true;
    }

    public static int avo() {
        return lcw.emW() ? 12 : 24;
    }
}

