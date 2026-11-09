/*
 * Decompiled with CFR.
 */
public class ene
extends emr
implements dxu {
    private int aqs = -1;
    private int ew = bce.cVx.ordinal();
    private bcc[] ivp = null;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public bce bJa() {
        return bce.getValueByOrdinal(this.ew);
    }

    public void a(bce bce2) {
        this.ew = bce2 == null ? this.ew : bce2.ordinal();
    }

    public bcc[] bJb() {
        return this.ivp;
    }

    public void a(bcc[] bccArray) {
        this.ivp = bccArray;
    }

    ene() {
        super(13879);
    }
}

