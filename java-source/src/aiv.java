/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 *  mcs
 */
public class aiv
extends aja
implements aki {
    private int bnM = 0;
    private ajb.d bnS = null;
    private float aXs = 0.0f;
    private float bnT = 0.0f;
    private float bnU = 0.0f;

    public aiv() {
        this.bog = ajb.b.boz;
    }

    public int BV() {
        return this.bnM;
    }

    public void fC(int n) {
        this.bnM = n;
    }

    public ajb.d Ce() {
        return this.bnS;
    }

    public void a(ajb.d d2) {
        this.bnS = d2;
    }

    public float Cf() {
        return this.aXs;
    }

    public void ah(float f2) {
        this.aXs = f2;
    }

    public float Cg() {
        return this.bnT;
    }

    public void ai(float f2) {
        this.bnT = f2;
    }

    public String getAttributeName() {
        assert (this.bnM > 0);
        return ep.aM((int)this.bnM);
    }

    @Override
    protected boolean BU() {
        this.bok = null;
        float f2 = this.boj.aJz().bgQ().fi().al(this.bnM);
        float f3 = this.bnU + this.aXs;
        float f4 = this.bnU - this.bnT;
        boolean bl = true;
        switch (this.bnS) {
            case bpy: {
                if (!(f2 < f4)) break;
                int n = ep.k((int)this.bnM, (int)2);
                float f5 = this.boj.aJz().bgQ().fi().al(n);
                if (!(f2 < f5)) break;
                this.bok = mcs.uBN.bD(this.bnM);
                bl = false;
                break;
            }
            case bpz: {
                if (!(f2 > f3)) break;
                this.bok = mcs.uBO.bD(this.bnM);
                bl = false;
                break;
            }
            case bpA: {
                if (!(f2 < f4) && !(f2 > f3)) break;
                this.bok = mcs.uBP.bD(this.bnM, Float.valueOf(f4), Float.valueOf(f3));
                bl = false;
                break;
            }
            default: {
                lfn.b(5, "SFAttributeModificationConstraint", "checkConstraint() Invalid ModificationType found: " + (Object)((Object)this.bnS));
                bl = false;
                assert (false);
                break;
            }
        }
        return bl;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        aiv aiv2 = (aiv)aja2;
        aiv2.a(this.bnS);
        aiv2.fC(this.bnM);
        aiv2.ah(this.aXs);
        aiv2.ai(this.bnT);
    }

    @Override
    public void Ch() {
        assert (this.bnU == 0.0f);
        this.bnU = this.boj.aJz().bgQ().fi().al(this.bnM);
    }

    @Override
    public void Ci() {
        this.bnU = 0.0f;
    }
}

