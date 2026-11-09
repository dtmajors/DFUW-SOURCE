/*
 * Decompiled with CFR.
 */
public class kxg {
    public final ldv aDk;
    private final ldv GUID;
    private final String ResourceName;
    private final int ResourceType;

    public kxg(ldv ldv2, ldv ldv3, String string, int n) {
        this.aDk = ldv2;
        this.GUID = ldv3;
        this.ResourceName = string;
        this.ResourceType = n;
    }

    public int az() {
        return this.ResourceType;
    }

    public ldv getGUID() {
        return this.GUID;
    }
}

