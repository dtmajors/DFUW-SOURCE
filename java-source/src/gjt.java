/*
 * Decompiled with CFR.
 */
public class gjt
extends gjl {
    public static final int jjk = 1;
    public static final int jjl = 2;
    public static final int jjm = 4;
    public static final int jjn = 8;
    public static final int jjo = 16;
    public static final int jjp = 32;
    public static final int jjq = 64;
    public int SkillType = 0;
    public int aYH = 0;
    public int aZF = 0;
    public boolean[] ecU = null;
    public boolean gcv = false;
    public ldv akX = null;
    public int ResourceType = 0;
    public String YL = null;
    public ldv dsL = null;
    public int dhr = 0;
    public ljq aZD = null;
    public int fZd = 0;
    public int fZe = 0;
    public int fZf = 0;
    public boolean fZg = false;
    public ldv gcw = null;
    public ljq Position = null;
    public lgl Rotation = null;
    public boolean dOf = false;
    public double gcy = 0.0;
    public double QM = 0.0;
    public boolean jjr = false;
    public ldg[] dcp = null;

    gjt() {
        super(4617);
    }

    @Override
    public Object clone() {
        gjt gjt2 = (gjt)super.clone();
        if (gjt2 != null && this.ecU != null) {
            boolean[] blArray = new boolean[this.ecU.length];
            System.arraycopy(this.ecU, 0, blArray, 0, this.ecU.length);
            gjt2.ecU = blArray;
        }
        if (gjt2 != null && this.dcp != null) {
            this.aZF ^= 0x40;
            this.dcp = null;
        }
        return gjt2;
    }

    public static gjt e(lbm<dxq> lbm2) {
        return (gjt)lbm2.ik(4617);
    }
}

