/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public abstract class cpu
extends cbx
implements bto {
    private int bnm = 0;
    protected bnx dwJ = null;

    public cpu(boolean bl) {
        super(bl);
        this.setObjectType(96);
    }

    public final int atS() {
        return this.bnm;
    }

    public final void fx(int n) {
        this.bnm = n;
    }

    public final bnx aYl() {
        return this.dwJ;
    }

    public final void b(bnx bnx2) {
        this.dwJ = bnx2;
    }

    public final void addRelation(dul dul2) {
        switch (dul2.getRelationType()) {
            case 1033: {
                amf amf2 = this.MessageDelegator.d(dul2.Br());
                if (amf2 == null) {
                    return;
                }
                if (!(amf2 instanceof bnx)) {
                    return;
                }
                if (this.dwJ == null) {
                    this.dwJ = (bnx)amf2;
                    break;
                }
                if (this.dwJ.getGUID().equals(amf2.getGUID())) break;
                this.dwJ = (bnx)amf2;
                break;
            }
            default: {
                super.addRelation(dul2);
            }
        }
    }

    public final void removeRelation(dul dul2) {
        switch (dul2.getRelationType()) {
            case 1033: {
                if (this.dwJ == null) {
                    return;
                }
                if (!this.dwJ.getGUID().equals(dul2.Br())) {
                    return;
                }
                this.dwJ = null;
                break;
            }
            default: {
                super.removeRelation(dul2);
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
    }
}

