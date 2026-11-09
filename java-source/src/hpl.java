/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcw
 */
import java.util.List;

public class hpl
extends hmt {
    private List<hpa> kVv = lcn.emv();
    private hpa kVw;
    private hpa kVx;
    private ljq kDn;
    private final hdm dXw;
    private static final float daN = 1.0f;
    private static lcq kVy = new lcq(1.0f, 0.6901961f, 0.06666667f, 1.0f);
    private static lcq kVz = new lcq(1.0f, 1.0f, 1.0f, 1.0f);

    public hpl(hdm hdm2, lgg lgg2) {
        super((hnc)hdm2, null, lgg2, hdm2.jXk.jPD);
        this.dXw = hdm2;
    }

    public final void cX(ljq ljq2) {
        for (hpa hpa2 : this.kVv) {
            hpa2.remove();
        }
        this.kVv.clear();
        if (this.kVw != null) {
            this.kVw.remove();
        }
        if (this.kVx != null) {
            this.kVx.remove();
        }
        int n = ((lhu)this.dXw.jXk.jWw.fM((int)1, (int)1)).kLY.rmN;
        int n2 = ((lhu)this.dXw.jXk.jWw.fM((int)1, (int)1)).kLY.H;
        this.kDn = new ljq(ljq2);
        float f = lcw.qGD.x / ((float)n * 1.0f);
        float f2 = lcw.qGD.rlV / ((float)n2 * 1.0f);
        float f3 = (float)this.cqv().rmN * f;
        float f4 = (float)this.cqv().H * f2;
        ljq ljq3 = new ljq(this.kDn.x - f3 / 2.0f, 0.0f, this.kDn.rlV + f4 / 2.0f);
        ljq ljq4 = new ljq(this.kDn.x + f3 / 2.0f, 0.0f, this.kDn.rlV - f4 / 2.0f);
        lej lej2 = lcw.dW((ljq)ljq3);
        lej lej3 = lcw.dW((ljq)ljq4);
        for (int i = lej2.getX(); i <= lej3.getX(); ++i) {
            for (int j = lej2.getY(); j <= lej3.getY(); ++j) {
                lej lej4 = new lej(i, j);
                lhu lhu2 = hpl.b(this.dXw, lej4.getX(), lej4.getY());
                ljq ljq5 = lcw.d((lej)lej4);
                int n3 = (int)((float)(this.cqv().rmN / 2) - (this.kDn.x - ljq5.x) / f);
                int n4 = (int)((float)(this.cqv().H / 2) + (this.kDn.rlV - ljq5.rlV) / f);
                lhf lhf2 = new lhf((int)((float)lhu2.kLY.rmN * 1.0f), (int)((float)lhu2.kLY.H * 1.0f));
                hpa hpa3 = new hpa((hnc)this.dXw, (String)null, new lgg(n3, n4), lhf2, lhu2);
                hpa3.N(1.0f, 1.0f);
                hpa3.H(kVy);
                this.j(hpa3);
                this.kVv.add(hpa3);
            }
        }
        if (this.kVx == null) {
            this.kVx = new hpa((hnc)this.dXw, (String)null, lgg.rlI, this.cqv(), this.dXw.jXk.jPF);
            this.kVx.H(kVz);
        }
        this.j(this.kVx);
        if (this.kVw == null) {
            lhf lhf3 = this.dXw.jXk.jPE.kLY;
            lgg lgg2 = new lgg((this.cqv().rmN - lhf3.rmN) / 2, (this.cqv().H - lhf3.H) / 2);
            this.kVw = new hpa((hnc)this.dXw, (String)null, lgg2, lhf3, this.dXw.jXk.jPE);
        }
        this.j(this.kVw);
    }

    private static lhu b(hdm hdm2, int n, int n2) {
        if (n < 0) {
            if (n2 < 0) {
                return hdm2.jXk.jPY;
            }
            if (n2 >= lcw.fyk.H) {
                return hdm2.jXk.jPT;
            }
            return hdm2.jXk.jPV;
        }
        if (n >= lcw.fyk.rmN) {
            if (n2 < 0) {
                return hdm2.jXk.jPW;
            }
            if (n2 >= lcw.fyk.H) {
                return hdm2.jXk.jPR;
            }
            return hdm2.jXk.jPU;
        }
        if (n2 < 0) {
            return hdm2.jXk.jPX;
        }
        if (n2 >= lcw.fyk.H) {
            return hdm2.jXk.jPS;
        }
        return (lhu)hdm2.jXk.jWw.fM(n2, n);
    }
}

