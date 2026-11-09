/*
 * Decompiled with CFR.
 */
public class dcw {
    public final int SkillType;
    public final dcv[] gdz;

    public dcw(int n2, dcv[] dcvArray) {
        assert (n2 > 0);
        assert (dcvArray != null);
        this.SkillType = n2;
        this.gdz = dcvArray;
    }

    public int a(cxd.l l2) {
        if (l2 == null) {
            return -1;
        }
        int n2 = this.gdz.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.gdz[i2].gdx != l2) continue;
            return this.gdz[i2].gdy;
        }
        return -1;
    }
}

