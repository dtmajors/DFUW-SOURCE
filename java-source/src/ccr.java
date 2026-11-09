/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class ccr {
    private dxr MessageDelegator = null;
    private ame elO = null;
    private float elP = 0.0f;
    private ldv elQ = null;
    private double Ec = -1.0;

    public void doTick(ldz ldz2) {
        if (this.Ec > ldz2.rgz) {
            return;
        }
        this.elP += this.elO.FP();
        if (this.elP > this.elO.FT()) {
            this.elP = this.elO.FT();
        }
        this.Ec = ldz2.rgz + 1.0;
    }

    private boolean dK(float f2) {
        if (f2 <= 0.0f) {
            return false;
        }
        return !(this.elP < 1.0f);
    }

    private int oR(int n) {
        if ((float)n > this.elP) {
            n = (int)this.elP;
            this.elP = 0.0f;
            return n;
        }
        this.elP -= (float)n;
        return n;
    }

    public void a(ecv ecv2) {
        ecw ecw2 = (ecw)this.MessageDelegator.h(19461, this.elQ, ecv2.aO());
        this.MessageDelegator.b(ecv2, ecw2);
        float f2 = ecv2.SkillLevel / 100.0f;
        ecw2.ilW = this.a(f2, ecv2.ilV);
        if (ecw2.ilW != null) {
            ecw2.ilX = this.b(f2, ecv2.ilV);
        }
        this.MessageDelegator.F(ecw2);
    }

    public cte a(float f2, int n) {
        if (!this.dK(f2)) {
            return null;
        }
        float f3 = 0.5f + 0.5f * (float)Math.random();
        float f4 = this.elO.FO() * f2 * f3;
        int n2 = (int)Math.ceil(f4);
        if (n2 < 1) {
            return null;
        }
        int n3 = this.elO.FL();
        if (n3 <= 0) {
            return null;
        }
        if ((n2 = this.oR(n2)) < 1) {
            return null;
        }
        int n4 = cug.wE((int)n);
        if (n4 > 0) {
            int n5 = cug.wE((int)n3);
            if (n5 == n4 + 1) {
                if (Math.random() > 0.5) {
                    n3 = this.elO.FM();
                }
            } else if (n5 > n4 + 1) {
                n3 = this.elO.FM();
            }
        }
        cte cte2 = new cte();
        cte2.asi = n2;
        cte2.ResourceType = n3;
        return cte2;
    }

    public cte b(float f2, int n) {
        int n2;
        if (!this.dK(f2)) {
            return null;
        }
        int n3 = cug.wE((int)n);
        if ((double)this.elO.FQ() < Math.random()) {
            return null;
        }
        if (this.elO.FR().isEmpty()) {
            return null;
        }
        int n4 = -1;
        for (int i2 = 0; i2 < 5; ++i2) {
            int n5 = (int)((double)this.elO.FR().size() * Math.random());
            assert (n5 < this.elO.FR().size());
            if (n5 >= this.elO.FR().size()) {
                n5 = this.elO.FR().size() - 1;
            }
            if (n3 + 1 > (n2 = cug.wE((int)(n4 = this.elO.FR().get(n5).intValue()))) || n3 + 1 == n2 && Math.random() < 0.5) break;
            n4 = -1;
        }
        if (n4 == -1) {
            return null;
        }
        assert (n4 > 0);
        float f3 = 0.5f + 0.5f * (float)Math.random();
        float f4 = this.elO.FS() * f2 * f3;
        n2 = (int)Math.ceil(f4);
        if (n2 < 1) {
            return null;
        }
        cte cte2 = new cte();
        cte2.asi = n2;
        cte2.ResourceType = n4;
        return cte2;
    }

    public ldv aIU() {
        return this.elQ;
    }

    public void ku(ldv ldv2) {
        this.elQ = ldv2;
    }

    public dxr getMessageDelegator() {
        return this.MessageDelegator;
    }

    public void setMessageDelegator(dxr dxr2) {
        this.MessageDelegator = dxr2;
    }

    public ame aIV() {
        return this.elO;
    }

    public void a(ame ame2) {
        assert (ame2 != null);
        this.elO = ame2;
        this.elP = this.elO.FN();
    }

    public float aIW() {
        return this.elP;
    }
}

