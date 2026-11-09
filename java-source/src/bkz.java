/*
 * Decompiled with CFR.
 */
class bkz {
    public ldv Ui = null;
    public ldv dtj = null;
    public ldv[] dtB = null;
    public ljq Position = null;
    public int ResourceType = 0;
    public double dtC = 0.0;
    public double asB = 0.0;
    public boolean dti = false;
    public boolean dtD = false;
    public int aqs = -1;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSensoredObjectInfo: MeshObjectGUID=");
        stringBuilder.append(this.Ui);
        stringBuilder.append(" PhysicalObjectGUID=");
        stringBuilder.append(this.dtj);
        stringBuilder.append(" ModifierGUIDs=");
        if (this.dtB == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(this.dtB.length);
        }
        stringBuilder.append(" Position=");
        stringBuilder.append(this.Position);
        stringBuilder.append(" Resource='");
        stringBuilder.append(lea.enW().getName(this.ResourceType));
        stringBuilder.append("' AreaEnterTime=");
        stringBuilder.append(this.dtC);
        return stringBuilder.toString();
    }

    public String art() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSensoredObjectInfo: MeshObjectGUID=");
        stringBuilder.append(this.Ui);
        if (this.dtj != null) {
            stringBuilder.append(" PhysicalObjectGUID=");
            stringBuilder.append(this.dtj);
        }
        stringBuilder.append(" Resource='");
        stringBuilder.append(lea.enW().getName(this.ResourceType));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

