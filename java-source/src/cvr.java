/*
 * Decompiled with CFR.
 */
class cvr {
    public a fAQ = a.fAW;
    public ldv Ui = null;
    public ldv dtj = null;
    public int ResourceType = 0;
    public int aqs = -1;
    public int[] fAR = null;
    public boolean fAS = false;
    public boolean fAT = false;
    public boolean fAU = false;
    public gaw fAV = null;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFContextSession: MeshObjectGUID=");
        stringBuilder.append(this.Ui);
        stringBuilder.append(" PhysicalObjectGUID=");
        stringBuilder.append(this.dtj);
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(lea.enW().getName(this.ResourceType));
        stringBuilder.append("'");
        if (this.fAR != null) {
            stringBuilder.append(" Commands=[");
            int n = this.fAR.length;
            for (int i = 0; i < n; ++i) {
                if (i > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append((Object)cvq.a.getContextCommandType(this.fAR[i]));
            }
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }
}

