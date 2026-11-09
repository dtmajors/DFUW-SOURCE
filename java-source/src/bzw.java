/*
 * Decompiled with CFR.
 */
public class bzw {
    public String byk = null;
    public ldv Ui = null;
    public ldv eev = null;
    public cak.c bpW = null;

    public boolean equals(Object object) {
        assert (this.byk != null);
        assert (this.Ui != null);
        assert (this.eev != null);
        if (object instanceof bzw) {
            bzw bzw2 = (bzw)object;
            if (!this.byk.equals(bzw2.byk)) {
                return false;
            }
            if (!this.Ui.equals(bzw2.Ui)) {
                return false;
            }
            if (!this.eev.equals(bzw2.eev)) {
                return false;
            }
            return this.bpW == null || this.bpW.equals((Object)bzw2.bpW);
        }
        return false;
    }

    public String toString() {
        assert (this.byk != null);
        assert (this.Ui != null);
        assert (this.eev != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFAttachmentInfo: AttachPointName='");
        stringBuilder.append(this.byk);
        stringBuilder.append("' MeshObjectGUID=");
        stringBuilder.append(this.Ui);
        stringBuilder.append(" PositionalRelationGUID=");
        stringBuilder.append(this.eev);
        if (this.bpW != null) {
            stringBuilder.append(" '");
            stringBuilder.append(this.bpW.name());
            stringBuilder.append("'");
        }
        return stringBuilder.toString();
    }
}

