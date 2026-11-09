/*
 * Decompiled with CFR.
 */
public class lv
extends lw {
    private ldv awo;
    private long awp;
    private long awv;

    public lv(ldv ldv2, ldv ldv3, long l, long l2) {
        this.awo = ldv2;
        this.Ri = ldv3;
        this.awp = l;
        this.awv = l2;
    }

    public void b(boolean bl, String string, String string2) {
        this.adc = bl;
        this.FirstName = string;
        this.LastName = string2;
    }

    public final void j(long l) {
        this.awv = l;
    }

    public final long qc() {
        return this.awv;
    }

    public final void k(long l) {
        this.awp = l;
    }

    public final long pM() {
        return this.awp;
    }

    public String toString() {
        return "GUID : " + this.Ri + ", Name " + this.FirstName + " " + this.LastName + " MentorGUID : " + this.awo + ", Registration time : " + ldz.b(this.awp, true) + ", Completion time : " + ldz.b(this.awv, true);
    }
}

