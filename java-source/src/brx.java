/*
 * Decompiled with CFR.
 */
public class brx {
    public int aCJ = -1;
    public bqs dJe = null;

    public brx awI() {
        brx brx2 = new brx();
        brx2.aCJ = this.aCJ;
        return brx2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFLayerSlotNode: LayerSlotNumber=");
        stringBuilder.append(this.aCJ);
        if (this.dJe != null) {
            stringBuilder.append(" Item=");
            stringBuilder.append(this.dJe.getGUID());
        }
        return stringBuilder.toString();
    }
}

