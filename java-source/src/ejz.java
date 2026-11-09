/*
 * Decompiled with CFR.
 */
public class ejz
extends emr {
    public static final int isH = 0;
    public static final int isI = 1;
    private int gKV = -1;
    private ldv YN = null;
    private ldv ade = null;

    public int getReason() {
        return this.gKV;
    }

    public ldv ach() {
        return this.YN;
    }

    public ldv iG() {
        return this.ade;
    }

    ejz() {
        super(13901);
    }

    public void ac(ldv ldv2, ldv ldv3) {
        this.gKV = 0;
        this.YN = ldv2;
        this.ade = ldv3;
    }

    public void ad(ldv ldv2, ldv ldv3) {
        this.gKV = 1;
        this.YN = ldv2;
        this.ade = ldv3;
    }
}

