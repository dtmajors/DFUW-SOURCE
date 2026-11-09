/*
 * Decompiled with CFR.
 */
public class dcv {
    public final cxd.l gdx;
    public final int gdy;

    public dcv(cxd.l l2, int n2) {
        this.gdx = l2;
        this.gdy = n2;
        if (this.gdx == null) {
            // empty if block
        }
        if (this.gdy <= 0) {
            // empty if block
        }
    }

    public String toString() {
        return "Relation='" + this.gdx.name() + "' Skill='" + lea.enZ().getName(this.gdy) + "'";
    }
}

