/*
 * Decompiled with CFR.
 */
public class caw {
    public bzy eeI = null;
    public ldv Ui = null;
    public int bhh = 0;
    public int eeC = 0;
    public String dBL = null;
    public int[] duz = null;

    public boolean equals(Object object) {
        assert (this.eeI != null);
        assert (this.eeI.GUID != null);
        assert (this.Ui != null);
        assert (this.bhh >= 0);
        assert (this.eeC >= 0);
        assert (this.dBL != null);
        if (object instanceof caw) {
            caw caw2 = (caw)object;
            if (!this.eeI.GUID.equals(caw2.awM())) {
                return false;
            }
            if (!this.Ui.equals(caw2.Ui)) {
                return false;
            }
            if (this.bhh != caw2.bhh) {
                return false;
            }
            if (this.eeC != caw2.eeC) {
                return false;
            }
            return this.dBL.equalsIgnoreCase(caw2.dBL);
        }
        return false;
    }

    public ldv awM() {
        assert (this.eeI != null);
        return this.eeI.GUID;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFShaderMapping: ItemGUID=");
        stringBuilder.append(this.eeI.GUID);
        stringBuilder.append(" MeshObjectGUID=");
        stringBuilder.append(this.Ui);
        stringBuilder.append(" SubsetID=");
        stringBuilder.append(this.bhh);
        stringBuilder.append(" MaterialID=");
        stringBuilder.append(this.eeC);
        stringBuilder.append(" ShaderName='");
        stringBuilder.append(this.dBL);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

