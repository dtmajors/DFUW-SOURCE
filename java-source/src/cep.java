/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cug
 *  cxd
 */
import java.util.Map;

public class cep {
    public static final boolean eqx = true;
    private static final String TC = "SFPlayerDeployableUseBonusManager";
    private final cex abN;
    private final ti eqy;
    private double eqz = -1.0;
    private double eqA = -1.0;

    public cep(cex cex2) {
        this.abN = cex2;
        this.eqy = lea.eol().get(cug.fwD);
        assert (this.eqy != null);
    }

    public void pu(int n) {
        double d2;
        if (n != cug.fwE) {
            assert (false) : "ResourceName : " + cug.uV((int)n);
            return;
        }
        double d3 = this.abN.getMessageDelegator().arc().rgz;
        if (d3 >= this.eqz + this.eqy.uM() || this.eqz == -1.0) {
            this.aLF();
            this.eqz = d3;
        } else {
            d2 = this.eqz + this.eqy.uM() - d3;
            this.abN.c(mbr.ulR.bD(cug.fwE, d2));
        }
        if (d3 >= this.eqA + this.eqy.uN() || this.eqA == -1.0) {
            this.aLG();
            this.eqA = d3;
        } else {
            d2 = this.eqA + this.eqy.uN() - d3;
            this.abN.c(mbr.ulS.bD(cug.fwE, d2));
        }
    }

    private void aLF() {
        if (this.eqy.uJ() == null || this.eqy.uJ().isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, Float> entry : this.eqy.uJ().entrySet()) {
            fcw fcw2 = (fcw)this.abN.getMessageDelegator().h(9227, this.abN.getGUID(), this.abN.getMessageDelegator().getGUID());
            fcw2.bst = bkd.dqz;
            fcw2.aZG = this.abN.getGUID();
            fcw2.akX = this.abN.getGUID();
            fcw2.aYF = this.abN.getGUID();
            fcw2.bsG = cug.fwE;
            fcw2.aYC = cxd.fLP;
            fcw2.Magnitude = entry.getValue().floatValue();
            fcw2.eKm = this.eqy.uL();
            fcw2.aSp = 0.0f;
            fcw2.aYH = 1;
            fcw2.aYG = entry.getKey();
            fcw2.bsE = 0;
            fcw2.bRD = 2;
            fcw2.gpI = this.eqy.uL();
            fcw2.a(cxd.f.fQW);
            this.abN.getMessageDelegator().F(fcw2);
        }
    }

    private void aLG() {
        if (this.eqy.uK() == null || this.eqy.uK().isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, Float> entry : this.eqy.uK().entrySet()) {
            fcw fcw2 = (fcw)this.abN.getMessageDelegator().h(9227, this.abN.getGUID(), this.abN.getMessageDelegator().getGUID());
            fcw2.bst = bkd.dqz;
            fcw2.aZG = this.abN.getGUID();
            fcw2.akX = this.abN.getGUID();
            fcw2.aYF = this.abN.getGUID();
            fcw2.bsG = cug.fwE;
            fcw2.aYC = cxd.fLP;
            fcw2.Magnitude = entry.getValue().floatValue();
            fcw2.eKm = 0.0;
            fcw2.aSp = 0.0f;
            fcw2.aYH = 1;
            fcw2.aYG = entry.getKey();
            fcw2.bsE = 0;
            fcw2.bRD = 1;
            fcw2.gpI = -3.0;
            fcw2.a(cxd.f.fQW);
            this.abN.getMessageDelegator().F(fcw2);
        }
    }

    public void aLH() {
        this.eqz = -1.0;
        this.eqA = -1.0;
    }
}

