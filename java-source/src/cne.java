/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  lcr
 */
public abstract class cne
extends cbx
implements brb,
bto {
    private ldv eNG;

    public cne(boolean bl) {
        super(bl);
        this.setObjectType(40);
    }

    public void lc(ldv ldv2) {
        this.eNG = ldv2;
    }

    @Override
    public final ldv asa() {
        if (this.eNG == null) {
            return this.getGUID();
        }
        return this.eNG;
    }

    @Override
    public int asb() {
        return 0;
    }

    public abstract bqv aJC();

    public abstract void b(bqv var1);

    public final void addRelation(dul dul2) {
        switch (dul2.getRelationType()) {
            case 1032: {
                amf amf2 = this.MessageDelegator.d(dul2.Br());
                if (amf2 == null) {
                    return;
                }
                if (!(amf2 instanceof bqv)) {
                    return;
                }
                if (this.aJC() == null) {
                    this.b((bqv)amf2);
                    this.aJC().a(this);
                    break;
                }
                if (this.aJC().getGUID().equals(amf2.getGUID())) break;
                this.b((bqv)amf2);
                this.aJC().a(this);
                break;
            }
            default: {
                super.addRelation(dul2);
            }
        }
    }

    public final void removeRelation(dul dul2) {
        switch (dul2.getRelationType()) {
            case 1032: {
                if (this.aJC() == null) {
                    return;
                }
                if (!this.aJC().getGUID().equals(dul2.Br())) {
                    return;
                }
                this.aJC().a((brb)null);
                this.b(null);
                break;
            }
            default: {
                super.removeRelation(dul2);
            }
        }
    }

    protected final ldv i(ldv ldv2, int n, int n2) {
        if (n2 != 0) {
            return lcr.p((ldv)ldv2, (int)n, (int)n2);
        }
        return lcr.ak((ldv)ldv2, (int)n);
    }
}

