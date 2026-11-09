/*
 * Decompiled with CFR.
 */
public class gjz
extends gjl {
    public static final int jjk = 1;
    public static final int jjl = 2;
    public static final int jjq = 64;
    public int SkillType = 0;
    public int aYH = 0;
    public int aZF = 0;
    public boolean[] ecU = null;
    public boolean gcv = false;
    public ldg[] dcp = null;

    gjz() {
        super(4619);
    }

    @Override
    public Object clone() {
        gjz gjz2 = (gjz)super.clone();
        if (gjz2 != null && this.ecU != null) {
            boolean[] blArray = new boolean[this.ecU.length];
            System.arraycopy(this.ecU, 0, blArray, 0, this.ecU.length);
            gjz2.ecU = blArray;
        }
        if (gjz2 != null && this.dcp != null) {
            this.aZF ^= 0x40;
            this.dcp = null;
        }
        return gjz2;
    }
}

