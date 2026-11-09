/*
 * Decompiled with CFR.
 */
public class vo
extends vd {
    public int SkillType = 0;
    public int[] aYi = null;

    public vo() {
        super(31);
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        vo vo2 = (vo)uk2;
        vo2.SkillType = this.SkillType;
        if (this.aYi != null) {
            int[] nArray = new int[this.aYi.length];
            System.arraycopy(this.aYi, 0, nArray, 0, this.aYi.length);
            vo2.aYi = nArray;
        }
    }
}

