/*
 * Decompiled with CFR.
 */
public class bzx {
    private static final boolean dtQ = false;
    public ldv eew = null;
    public ldv eex = null;
    private bzw[] eey = null;

    public final void a(bzw bzw2) {
        if (bzw2 == null) {
            lfn.b(5, "SFAttachmentInfoHandler", "addAttachmentInfo() AttachmentInfo is null.");
            return;
        }
        assert (bzw2.byk != null);
        assert (bzw2.bpW != null);
        if (this.b(bzw2.byk, bzw2.bpW) >= 0) {
            lfn.b(5, "SFAttachmentInfoHandler", "addAttachmentInfo() " + bzw2 + " already exists.");
            return;
        }
        if (this.eey == null) {
            this.eey = new bzw[]{bzw2};
            return;
        }
        assert (this.eey.length > 0);
        bzw[] bzwArray = new bzw[this.eey.length + 1];
        for (bzw bzwArray[var3_3] : this.eey) {
        }
        bzwArray[this.eey.length] = bzw2;
        this.eey = bzwArray;
    }

    public final boolean aFG() {
        return this.eey != null;
    }

    public final bzw a(String string, cak.c c2) {
        if (string == null) {
            lfn.b(5, "SFAttachmentInfoHandler", "getAttachmentInfo() AttachPointName is null.");
            return null;
        }
        if (c2 == null) {
            lfn.b(5, "SFAttachmentInfoHandler", "getAttachmentInfo() LayerType is null.");
            return null;
        }
        int n = this.b(string, c2);
        if (n < 0) {
            return null;
        }
        return this.eey[n];
    }

    public final void b(bzw bzw2) {
        if (bzw2 == null) {
            lfn.b(5, "SFAttachmentInfoHandler", "removeAttachmentInfo() AttachmentInfo is null.");
            return;
        }
        assert (bzw2.byk != null);
        assert (bzw2.bpW != null);
        int n = this.b(bzw2.byk, bzw2.bpW);
        if (n < 0) {
            lfn.b(5, "SFAttachmentInfoHandler", "removeAttachmentInfo() " + bzw2 + " was not found.");
            return;
        }
        if (this.eey.length == 1) {
            this.eey = null;
            return;
        }
        this.eey[n] = null;
        bzw[] bzwArray = new bzw[this.eey.length - 1];
        n = 0;
        int n2 = this.eey.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.eey[i2] == null) continue;
            bzwArray[n] = this.eey[i2];
            ++n;
        }
        this.eey = bzwArray;
    }

    private int b(String string, cak.c c2) {
        assert (string != null);
        assert (c2 != null);
        if (this.eey != null) {
            int n = this.eey.length;
            for (int i2 = 0; i2 < n; ++i2) {
                if (!this.eey[i2].byk.equals(string) || this.eey[i2].bpW != c2) continue;
                return i2;
            }
        }
        return -1;
    }

    public bzw[] aFH() {
        return this.eey;
    }
}

