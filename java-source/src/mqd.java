/*
 * Decompiled with CFR.
 */
class mqd
extends mqa {
    public int DYG;
    public String pXH;
    public String DYH;

    public mqd(int n, String string, String string2) {
        this.DYG = n;
        this.pXH = string;
        this.DYH = string2;
    }

    public String toString() {
        return "RenamingFile\t" + this.pXH + "\t" + this.DYH;
    }
}

