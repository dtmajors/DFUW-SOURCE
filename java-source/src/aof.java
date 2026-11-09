/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cug
 */
import java.util.Collection;

public class aof
extends aqu {
    private double bJn = 0.0;
    private boolean bJo;
    private boolean bJp;
    private boolean bJq;
    private float bJr = 0.0f;

    public aof(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        int n = arw.hK(10);
        this.bLp = n < 5 ? 4.0 : (n < 7 ? 5.0 : (n < 9 ? 6.0 : 7.0));
        this.bJr = (float)(this.bLp / 7.0);
        this.bLq = true;
    }

    @Override
    public boolean execute() {
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.Qt();
        this.Ql();
        this.PL();
        double d2 = this.bFP.Jp().rgz;
        if (this.bJn <= 0.0) {
            this.bJn = d2;
            return true;
        }
        if (d2 > this.bJn) {
            if (!this.bJo) {
                this.bJn = d2 + this.bLp - 2.0;
                this.bFP.hg(0x2000072);
                this.bJo = true;
            } else {
                if (d2 > this.bJn + 1.0) {
                    if (this.bJq) {
                        Collection<asv> collection = this.bFP.IZ().r(this.bFP.av(), 100.0f);
                        for (asv asv2 : collection) {
                            this.bFP.a(asv2, lea.enT().getType("Impact Damage"), (150.0f + 20.0f * arw.Sx()) * this.bJr, 6.0f, 3.0f, anf.a.bEb);
                        }
                    } else {
                        asv asv3 = this.bFP.IZ().Ly();
                        this.bFP.a(asv3, lea.enT().getType("Impact Damage"), (70.0f + 30.0f * arw.Sx()) * this.bJr);
                    }
                    this.bJn = Double.POSITIVE_INFINITY;
                    return true;
                }
                if (!this.bJp) {
                    if (this.bFP.IZ().LA() < 16.0f && (double)arw.Sx() > 0.1) {
                        this.bJq = true;
                        this.bFP.hg(33554783);
                    } else {
                        this.bJq = false;
                        lfn.print("ready to cast celestial fire...............");
                        asp.a(del.gkh, this.bFP.IZ().Ly().av(), this.bFP.IZ().Ly().Ul(), this.bFP.av(), this.bFP.Jl().Ul(), this.bFP.getMessageDelegator());
                        this.bFP.hg(33554638);
                    }
                    this.bJp = true;
                }
            }
        }
        return true;
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.a(true, null);
        this.bFP.hg(65566);
        this.Qs();
    }

    @Override
    public String name() {
        if (this.Pt()) {
            return "CELESTIAL MAGIC ATTACK";
        }
        return "INFERNAL MAGIC ATTACK";
    }

    @Override
    public boolean Pr() {
        return true;
    }

    private boolean Pt() {
        return this.bFP.az() == cug.fhz;
    }
}

