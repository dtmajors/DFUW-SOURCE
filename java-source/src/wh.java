/*
 * Decompiled with CFR.
 */
public class wh
extends wf {
    public ldv GUID = null;
    public ldv aXQ = null;
    public ldv aXR = null;
    public int ResourceType = 0;
    public int asi = 0;
    public float aXy = 0.0f;
    public short aYy = (short)-1;
    public short aYz = (short)-1;
    public boolean aXT = false;
    public long aXU = 0L;

    public wh() {
        super((byte)9);
    }

    @Override
    protected void d(uk uk2) {
        super.d(uk2);
        vi vi2 = (vi)uk2;
        vi2.GUID = this.GUID;
        vi2.aXQ = this.aXQ;
        vi2.aXR = this.aXR;
        vi2.ResourceType = this.ResourceType;
        vi2.asi = this.asi;
        vi2.aXy = this.aXy;
        vi2.aCJ = this.aYy;
        vi2.aXS = this.aYz;
        vi2.aXT = this.aXT;
        vi2.aXU = this.aXU;
    }

    @Override
    protected void c(uk uk2) {
        super.c(uk2);
        vi vi2 = (vi)uk2;
        this.GUID = vi2.GUID;
        this.aXQ = vi2.aXQ;
        this.aXR = vi2.aXR;
        this.ResourceType = vi2.ResourceType;
        this.asi = vi2.asi;
        this.aXy = vi2.aXy;
        this.aYy = (short)vi2.aCJ;
        this.aYz = (short)vi2.aXS;
        this.aXT = vi2.aXT;
        this.aXU = vi2.aXU;
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        vi vi2 = (vi)uk2;
        if (!this.k(this.GUID, vi2.GUID)) {
            return false;
        }
        if (!this.k(this.aXQ, vi2.aXQ)) {
            return false;
        }
        if (!this.k(this.aXR, vi2.aXR)) {
            return false;
        }
        if (this.ResourceType != vi2.ResourceType) {
            return false;
        }
        if (this.asi != vi2.asi) {
            return false;
        }
        if (this.aXy != vi2.aXy) {
            return false;
        }
        if (this.aYy != vi2.aCJ) {
            return false;
        }
        if (this.aYz != vi2.aXS) {
            return false;
        }
        if (this.aXT != vi2.aXT) {
            return false;
        }
        return this.aXU == vi2.aXU;
    }

    private boolean k(ldv ldv2, ldv ldv3) {
        if (ldv2 == null != (ldv3 == null)) {
            return false;
        }
        if (ldv2 == null) {
            return true;
        }
        return ldv2.equals(ldv3);
    }
}

