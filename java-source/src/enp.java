/*
 * Decompiled with CFR.
 */
public class enp
extends emr {
    private ldv ade = null;
    private int ivI = bcr.cXg.ordinal();

    public ldv iG() {
        return this.ade;
    }

    public void ch(ldv ldv2) {
        this.ade = ldv2;
    }

    public bcr bJA() {
        return bcr.getValueByOrdinal(this.ivI);
    }

    public void d(bcr bcr2) {
        this.ivI = bcr2 == null ? this.ivI : bcr2.ordinal();
    }

    enp() {
        super(13898);
    }
}

