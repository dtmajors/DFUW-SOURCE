/*
 * Decompiled with CFR.
 */
public abstract class agt
extends agj {
    protected ldv GUID = null;
    private agu bik = null;
    private ldv aXR = null;

    public agt(ahu.b b2) {
        super(b2);
    }

    public final ldv getGUID() {
        return this.GUID;
    }

    public final void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public final agu AU() {
        return this.bik;
    }

    public final void b(agu agu2) {
        this.bik = agu2;
    }

    public final ldv AV() {
        return this.aXR;
    }

    public final void cJ(ldv ldv2) {
        this.aXR = ldv2;
    }

    public boolean equals(Object object) {
        assert (this.GUID != null);
        if (object instanceof agt) {
            agt agt2 = (agt)object;
            return this.GUID.equals(agt2.getGUID());
        }
        return false;
    }

    public final ldv AW() {
        assert (this.bik != null);
        return this.bik.AX().AZ().getGUID();
    }
}

