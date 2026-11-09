/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  cxg
 *  ep
 *  lcw
 *  mcs
 */
public class aiw
extends aja
implements ajc,
akw {
    private static final float bnW = 1.0f;
    private int bnM = 0;
    private int bnX = 0;
    private int bnY = 0;
    private byx bnZ = null;
    private float boa = 0.0f;
    private float bob = 0.0f;
    private double boc = 0.0;

    public aiw() {
        this.bog = ajb.b.boA;
    }

    public void fC(int n) {
        this.bnM = n;
    }

    public void fE(int n) {
        this.bnX = n;
    }

    public void fF(int n) {
        this.bnY = n;
    }

    public String getAttributeName() {
        return ep.aM((int)this.bnM);
    }

    @Override
    public final void reset() {
        super.reset();
        this.bnZ = null;
        this.boa = 0.0f;
        this.bob = 0.0f;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" AttributeType='");
        stringBuilder.append(this.getAttributeName());
        stringBuilder.append("' LargeSkillFunctionType='");
        stringBuilder.append(this.fH(this.bnX));
        stringBuilder.append("' SmallSkillFunctionType='");
        stringBuilder.append(this.fH(this.bnY));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    @Override
    protected boolean BU() {
        this.bok = null;
        float f2 = this.boj.aJz().bgQ().fi().al(this.bnM);
        float f3 = this.BY();
        if (f3 < 0.0f) {
            lfn.b(5, "SFAttributeMovementConstraint", "checkConstraint() Invalid requiredvalue provided for attribute '" + this.getAttributeName() + "': " + f3);
            this.bok = mcs.uAm.bD(new Object[0]);
            return false;
        }
        boolean bl = true;
        if (!bl) {
            this.bok = lcw.bcB == 2 ? mcs.uAp.bD(this.bnM, 384, Float.valueOf(f3)) : mcs.uAo.bD(this.bnM, Float.valueOf(f3), Float.valueOf(f2));
        }
        return bl;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        aiw aiw2 = (aiw)aja2;
        aiw2.fC(this.bnM);
        aiw2.fE(this.bnX);
        aiw2.fF(this.bnY);
    }

    private float fG(int n) {
        if (!cxg.bp((int)0, (int)n)) {
            lfn.b(5, "SFAttributeMovementConstraint", "computeSkillFunction() Skillfunction '" + this.fH(n) + "' is not defined.");
            return 0.0f;
        }
        return cxg.d((cxc)this.boj, (int)n);
    }

    private float BY() {
        if (this.boa == 0.0f) {
            this.boa = this.fG(this.bnX);
            if (this.boj.aJz().bgQ().Ux() && ep.aH((int)this.bnM)) {
                this.boa *= 0.01f;
            }
        }
        if (this.bob == 0.0f) {
            this.bob = this.fG(this.bnY);
            if (this.boj.aJz().bgQ().Ux() && ep.aH((int)this.bnM)) {
                this.bob *= 0.01f;
            }
        }
        if (this.bnZ == null) {
            this.bnZ = this.boj.aJz().bgQ().aJD();
        }
        if (this.bnZ.aEP().aEB()) {
            return this.boa;
        }
        return this.bob;
    }

    private String fH(int n) {
        return cxh.fH(n);
    }

    @Override
    public void Ca() {
        Object object;
        if (ctg.fff) {
            return;
        }
        float f2 = this.BY();
        if (f2 <= 0.0f) {
            lfn.b(5, "SFAttributeMovementConstraint", "doConsume() RequiredAttributeValue is invalid: " + f2);
            return;
        }
        int n = this.Co().zg();
        if (lea.enZ().isDescendant(n, cxd.fHI) && ((byv)(object = this.boj.aJz().bgQ().aJD().aEP())).aEE()) {
            f2 *= 2.0f;
        }
        if ((object = this.boj.aJz().bgQ().fi().ah(this.bnM)) == null) {
            lfn.b(5, "SFAttributeMovementConstraint", "doConsume() Attribute '" + ep.aM((int)this.bnM) + "' was not found.");
            return;
        }
        if (((et)object).fN() >= f2) {
            ((et)object).n(-f2);
        } else if (((et)object).fN() > 0.0f) {
            ((et)object).o(0.0f);
        }
    }

    @Override
    public void nh() {
        if (this.boc == 0.0) {
            return;
        }
        double d2 = this.boj.getMessageDelegator().arc().rgz;
        while (this.boc <= d2) {
            this.boc += 1.0;
            this.Ca();
        }
    }

    @Override
    public void Ch() {
        this.boc = this.boj.getMessageDelegator().arc().rgz + 1.0;
        if (this.boj.bfF()) {
            this.boj.aJz().bgQ().aJL().b(this.bnM, false, " From Atribute Movement Constraint : " + this.boj.Bu());
        }
    }

    @Override
    public void Ci() {
        this.boc = 0.0;
        if (this.boj.bfF()) {
            this.boj.aJz().bgQ().aJL().b(this.bnM, true, " From Attribute Movement Constraint : " + this.boj.Bu());
        }
    }
}

