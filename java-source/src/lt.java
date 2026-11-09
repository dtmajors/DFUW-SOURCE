/*
 * Decompiled with CFR.
 */
public class lt
extends lw {
    private ldv awo;
    private float adf;
    private long awp;

    public lt(ldv ldv2, ldv ldv3, long l) {
        this.awo = ldv2;
        this.Ri = ldv3;
        this.awp = l;
    }

    public lt(ldv ldv2, ldv ldv3, boolean bl, String string, String string2, float f, long l) {
        this.awo = ldv2;
        this.Ri = ldv3;
        this.adc = bl;
        this.FirstName = string;
        this.LastName = string2;
        this.adf = f;
        this.awp = l;
    }

    public void a(boolean bl, String string, String string2, float f) {
        this.adc = bl;
        this.FirstName = string;
        this.LastName = string2;
        this.adf = f;
    }

    public final long pM() {
        return this.awp;
    }

    public final float pN() {
        return this.adf;
    }

    public final void K(float f) {
        this.adf = f;
    }

    public String toString() {
        return "GUID : " + this.Ri + ", Name " + this.FirstName + " " + this.LastName + " MentorGUID : " + this.awo + ", Registration time : " + ldz.b(this.awp, true);
    }
}

