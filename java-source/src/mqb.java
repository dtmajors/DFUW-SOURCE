/*
 * Decompiled with CFR.
 */
class mqb
extends mqa {
    public String FileName;
    public String DYy;

    public mqb(String string, String string2) {
        this.FileName = string;
        this.DYy = string2;
    }

    public String toString() {
        return "DeletingFile\t" + this.FileName;
    }
}

