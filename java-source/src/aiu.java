/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxg
 */
public class aiu
extends ait {
    private boolean bnQ = true;
    private int bnR = 0;

    public aiu() {
        this.bog = ajb.b.boy;
    }

    public boolean Cb() {
        return this.bnQ;
    }

    public void aW(boolean bl) {
        this.bnQ = bl;
    }

    public int Cc() {
        return this.bnR;
    }

    public void fD(int n) {
        this.bnR = n;
    }

    public String Cd() {
        return cxh.fH(this.bnR);
    }

    @Override
    protected float BZ() {
        if (this.bnQ) {
            if (!cxg.bp((int)0, (int)this.bnR)) {
                lfn.b(5, "SFAttributeFunctionValueConstraint", "computeRequiredAttributeValue() General skillfunction '" + this.Cd() + "' is not defined.");
                return 0.0f;
            }
            float f2 = cxg.d((cxc)this.boj, (int)this.bnR);
            return f2;
        }
        if (!cxg.bp((int)this.boj.zg(), (int)this.bnR)) {
            lfn.b(5, "SFAttributeFunctionValueConstraint", "computeRequiredAttributeValue() SkillFunction '" + this.Cd() + "' is not defined for skill '" + this.boj.getName() + "'");
            return 0.0f;
        }
        float f3 = cxg.c((cxc)this.boj, (int)this.bnR);
        return f3;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        aiu aiu2 = (aiu)aja2;
        aiu2.aW(this.bnQ);
        aiu2.fD(this.bnR);
    }
}

