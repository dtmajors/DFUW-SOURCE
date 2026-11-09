/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cdb
 *  cew
 *  cex
 *  lcw
 */
public abstract class cev
extends cdb
implements bzz {
    public static int erz = 0;
    private double erA = -1.0;
    protected final bzf eot;
    public static cev erB = null;

    public cev(boolean bl) {
        super(bl);
        this.ObjectType = 114;
        this.eot = this.dwG ? new bzh((cex)this) : new bzg((cew)this);
    }

    public final bzf aLU() {
        return this.eot;
    }

    public abstract caq aKu();

    public abstract void a(caq var1);

    public abstract cwc aLV();

    public abstract hc jT();

    public final void addRelation(dul dul2) {
        if (dul2 == null) {
            return;
        }
        if (dul2.Bq().equals(this.GUID) && dul2.Br().equals(this.GUID)) {
            return;
        }
        switch (dul2.getRelationType()) {
            case 1034: {
                amf amf2 = this.MessageDelegator.d(dul2.Br());
                if (amf2 == null) {
                    return;
                }
                if (!(amf2 instanceof caq)) {
                    return;
                }
                if (this.aKu() == null) {
                    this.a((caq)amf2);
                    this.aKu().a(this);
                    break;
                }
                if (this.aKu().getGUID().equals(amf2.getGUID())) {
                    return;
                }
                this.a((caq)amf2);
                this.aKu().a(this);
                break;
            }
            default: {
                super.addRelation(dul2);
            }
        }
    }

    public void cleanUp() {
        super.cleanUp();
        if (lcw.emZ()) {
            --erz;
        }
    }

    public ckg aLW() {
        if (!ctg.ffN || lcw.aQH()) {
            return null;
        }
        ff ff2 = this.fi().aq(11552);
        assert (ff2 != null);
        ckg ckg2 = null;
        if (ff2 != null && this.emK != null) {
            cjx cjx2 = lea.epx().hu(ff2.getStringValue());
            assert (cjx2 != null);
            if (cjx2 != null) {
                ckg2 = cjx2.aQy().get((Object)this.emK.bki());
                assert (ckg2 != null);
            }
        }
        return ckg2;
    }

    public float eq(float f2) {
        if (!ctg.ffN || lcw.aQH()) {
            return 0.0f;
        }
        ew ew2 = this.fi().ao(9872);
        if (ew2 == null) {
            return 0.0f;
        }
        int n = ew2.fQ();
        ff ff2 = this.fi().aq(11552);
        assert (ff2 != null);
        ckg ckg2 = null;
        if (ff2 != null && this.emK != null) {
            cjx cjx2 = lea.epx().hu(ff2.getStringValue());
            assert (cjx2 != null);
            if (cjx2 != null && this.emK.bki() != null && (ckg2 = cjx2.aQy().get((Object)this.emK.bki())) != null) {
                float f3 = 0.0f;
                if (n == 0) {
                    f3 = ckg2.eGo;
                } else if (n == 1) {
                    f3 = ckg2.eGp;
                } else if (n == 2) {
                    f3 = ckg2.eGq;
                }
                return f3 *= 1.0f - lew.A(ckg2.eGw == 0.0f ? 1.0f : (f2 - ckg2.eGv) / ckg2.eGw, 0.0f, 1.0f);
            }
        }
        if (n == 1) {
            return 0.004f;
        }
        if (n == 2) {
            return 0.008f;
        }
        return 0.0f;
    }

    private void fP(boolean bl) {
        if (!ctg.ffN || lcw.aQH()) {
            return;
        }
        this.erA = -1.0;
        if (!this.isServerObject()) {
            return;
        }
        ew ew2 = this.fi().ao(9872);
        if (ew2 == null) {
            return;
        }
        int n = 0;
        int n2 = ew2.fQ();
        if (this.emK != null && (this.emK.bki() == bqm.d.BOW || this.emK.bki() == bqm.d.MAGIC_STAFF || this.emK.bki() == bqm.d.THROWABLE_WEAPON)) {
            if (this.aJD().aEP().aEB()) {
                n = 2;
            } else if (this.aJD().aEP().aEE()) {
                n = 2;
            } else if (this.aJD().aEP().Ow()) {
                n = 1;
            }
        } else {
            bl = true;
        }
        if (n > n2) {
            ew2.bi(n);
        }
        if (n < n2) {
            if (bl) {
                ew2.bi(n);
            } else {
                ckg ckg2 = this.aLW();
                float f2 = 0.4f;
                if (ckg2 != null) {
                    f2 = ckg2.eGu;
                }
                this.erA = this.MessageDelegator.arc().rgz + (double)f2;
            }
        }
    }

    public void b(byv byv2, boolean bl) {
        super.b(byv2, bl);
        this.fP(false);
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.aJC() != null) {
            this.aJC().avk().doTick(ldz2);
        }
        this.eot.doTick(ldz2);
        if (this.erA > 0.0 && this.erA < ldz2.rgz) {
            this.fP(true);
        }
    }

    public final cef aLX() {
        return (cef)((Object)this.aJM());
    }

    public final byx aJD() {
        return this.eot;
    }

    public void initialize() {
        super.initialize();
        this.eot.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eot);
        if (lcw.emZ()) {
            ++erz;
        }
    }

    public final boolean aIq() {
        return this.fi().ag(10928);
    }

    public final boolean UB() {
        return true;
    }

    public cif aLY() {
        return null;
    }

    public final void removeRelation(dul dul2) {
        if (dul2 == null) {
            return;
        }
        if (dul2.Bq().equals(this.GUID) && dul2.Br().equals(this.GUID)) {
            return;
        }
        switch (dul2.getRelationType()) {
            case 1034: {
                if (this.aKu() == null) {
                    return;
                }
                if (!this.aKu().getGUID().equals(dul2.Br())) {
                    return;
                }
                this.a(null);
                break;
            }
            default: {
                super.removeRelation(dul2);
            }
        }
    }

    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        this.eot.setActive(false);
        this.MessageDelegator.hd(this.eot.getGUID());
    }

    @Override
    public void i(boolean bl, boolean bl2) {
    }

    protected void p(cbx cbx2) {
        super.p(cbx2);
        cev cev2 = (cev)cbx2;
        this.eot.b(cev2.aLU());
    }

    protected void aIx() {
        super.aIx();
        if (!this.dwG) {
            ((bzg)this.eot).aFm();
        }
    }

    public void aLZ() {
        this.aJR();
    }

    public void fQ(boolean bl) {
        this.fF(bl);
    }

    public void aMa() {
        this.aJS();
    }

    public void aMb() {
        this.aJT();
    }

    public void aMc() {
        this.aJU();
    }

    public void aMd() {
        this.aJV();
    }
}

