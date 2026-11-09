/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class ia {
    public final gw aeX;
    public final ldv Yc;
    public final boolean aeY;
    int Rl = 0;

    ia(gw gw2, ldv ldv2) {
        this.aeX = gw2;
        this.Yc = ldv2;
        this.aeY = lcr.tR((ldv)ldv2) || lcr.tS((ldv)ldv2);
    }

    public String toString() {
        return "[OSGUID " + this.Yc + ", CreatureOS " + this.aeY + ", RefCount=" + this.Rl + "]";
    }
}

