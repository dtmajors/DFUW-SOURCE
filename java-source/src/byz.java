/*
 * Decompiled with CFR.
 */
public class byz {
    public int bpX = 0;
    public int ecZ = 0;
    public int eda = 0;
    public boolean edb = false;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFOperationParameters: Mode='");
        stringBuilder.append(byw.nQ(this.bpX));
        stringBuilder.append("' PreviousModeValue='");
        stringBuilder.append(byw.az(this.bpX, this.ecZ));
        stringBuilder.append("' NewModeValue='");
        stringBuilder.append(byw.az(this.bpX, this.eda));
        stringBuilder.append("' ForwardUpdate=");
        stringBuilder.append(this.edb);
        return stringBuilder.toString();
    }
}

