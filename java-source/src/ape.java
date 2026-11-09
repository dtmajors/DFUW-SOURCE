/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
import java.util.Collection;

public class ape
extends aqu {
    private ljq bKG;
    private final int bKH;
    private final int bKI;
    private final float bKJ;
    private final float bKK;
    private final double bKL;
    private double bKM;

    public ape(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 14.0;
        this.bLq = true;
        this.bKH = lea.enT().getType("Cold Damage");
        this.bKI = lea.enT().getType("Impact Damage");
        this.bKJ = 35.0f;
        this.bKK = 30.0f;
        this.bKL = 1.0 + 0.3 * arw.Sw();
    }

    @Override
    public boolean execute() {
        this.bFP.Kk();
        this.bFP.Kq();
        if (!this.bFP.e(this.bFP.bCK.Ov(), 160.0f)) {
            return false;
        }
        if (this.bFP.Jp().rgz > this.bKM + this.bKL) {
            this.bKM = this.bFP.Jp().rgz;
            Collection<asv> collection = this.bFP.IZ().r(this.bKG, this.bKK);
            for (asv asv2 : collection) {
                if (asv2.Uq()) {
                    this.bFP.a(asv2, this.bKI, this.bKJ);
                    continue;
                }
                this.bFP.a(asv2, this.bKH, this.bKJ);
            }
        }
        this.bFP.bCK.a(this.bKG, 85.0f, -15.0f, 25.0f, 0.0f);
        this.bFP.bCK.a(any.a.bIp);
        return this.bF(false);
    }

    @Override
    public ljq Pp() {
        return this.bFP.IZ().LC();
    }

    @Override
    public void initialize() {
        this.bFP.a(false, null);
        this.Qs();
        this.bFP.stop();
        this.bKG = this.bFP.IZ().LC().esF();
        float f = this.bFP.Jn().u(this.bKG, 85.0f);
        if (f != -3.4028235E38f) {
            this.bKG.y = f;
        }
        asp.a(del.gjY, this.bKG, this.bFP.getGUID(), this.bFP.getMessageDelegator());
        this.bKM = this.bFP.Jp().rgz;
    }

    @Override
    public String name() {
        return "FLY DIVE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

