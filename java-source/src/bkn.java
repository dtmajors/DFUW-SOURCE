/*
 * Decompiled with CFR.
 */
public class bkn {
    public final ldv Ui;
    public final ljq Position;
    public final int ResourceType;
    public boolean dti = true;
    public ldv dtj = null;
    public double dsE = 0.0;
    public int dtk = 0;
    public int dtl = 0;
    public ldv[] dtm = null;
    public int dtn = 0;
    public int dto = 0;
    public ldv[] dtp = null;

    public bkn(ldv ldv2, ljq ljq2, int n) {
        this.Ui = ldv2;
        this.Position = ljq2;
        this.ResourceType = n;
    }

    public boolean arm() {
        if (this.dtk > 0) {
            return false;
        }
        if (this.dtl > 0) {
            return false;
        }
        if (this.dtn > 0) {
            return false;
        }
        return this.dto <= 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFAreaTargetInfo: MeshObjectGUID=");
        stringBuilder.append(this.Ui);
        stringBuilder.append(" Position=");
        stringBuilder.append(this.Position);
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(lea.enW().getName(this.ResourceType));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

