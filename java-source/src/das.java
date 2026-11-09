/*
 * Decompiled with CFR.
 */
public class das
extends dar {
    private int bqK = 0;

    @Override
    public int DB() {
        return this.bqK;
    }

    public void fS(int n2) {
        this.bqK = n2;
    }

    protected final ddi biz() {
        assert (this.bqK > 0);
        ddi ddi2 = cxj.yt(this.bqK);
        if (ddi2 == null) {
            lfn.b(5, "SFPerformFunctionSkillOnTarget", "getTargetGroup() Could not find targetgroup " + this.bqK);
            return null;
        }
        return ddi2;
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        das das2 = (das)((Object)cxc2);
        das2.fS(this.bqK);
    }
}

