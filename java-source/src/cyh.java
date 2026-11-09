/*
 * Decompiled with CFR.
 */
public class cyh
extends cyg {
    public final cxd.b fYc;
    public final boolean bhy;
    private static les aqN = lea.enZ();

    public cyh(int n2, double d2, double d3, cxd.b b2) {
        super(n2, d2, d3);
        this.fYc = b2;
        this.bhy = false;
    }

    public cyh(int n2, double d2, double d3, cxd.b b2, boolean bl) {
        super(n2, d2, d3);
        this.fYc = b2;
        this.bhy = bl;
    }

    @Override
    public boolean yF(int n2) {
        dcj dcj2 = cxj.b(this.fYc);
        if (dcj2 == null) {
            lfn.b(5, "SFBlockingItemTimedGroup", "isBlockingSkill() Could not find skillblockinggroup " + (Object)((Object)this.fYc));
            return true;
        }
        int[] nArray = dcj2.gcS;
        int n3 = nArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (nArray[i2] == this.SkillType || !aqN.isDescendant(n2, nArray[i2])) continue;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" BlockingGroupType='");
        stringBuilder.append((Object)this.fYc);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

