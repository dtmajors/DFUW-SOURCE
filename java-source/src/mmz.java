/*
 * Decompiled with CFR.
 */
final class mmz {
    public String DOh = "";
    public String DisplayName;
    public float doT = 0.0f;
    public float mB = 0.0f;

    public mmz(String string, float f2, String string2, float f3) {
        this.DOh = string;
        this.doT = f2;
        this.DisplayName = string2;
        this.mB = f3;
    }

    public String toString() {
        String string = this.DisplayName + "(" + this.DOh + ")";
        if (this.doT != 0.0f) {
            string = string + "(" + this.doT + ")";
        }
        if (this.mB != 0.0f) {
            string = string + " Dist:" + this.mB;
        }
        return string;
    }
}

