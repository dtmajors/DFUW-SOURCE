/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
import java.util.Collection;

public class aoz
extends aqu {
    final double bKo = 0.6283185307179586;
    final float bKp = 11.0f;
    final float bKq = 121.0f;
    final int bKr = 12;
    final double bKs = 6.2;
    final double bJz = 0.5166666666666667;
    final double bKt = 1.0;
    final double bKu = 1.0;
    double bKv = 0.0;
    boolean bKw = false;
    double bKx;

    public aoz(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 6.2;
        this.bLq = true;
    }

    @Override
    public boolean execute() {
        if (!this.bKw) {
            this.bFP.hg(0x10000E0);
            this.bKw = true;
        }
        return this.Ql();
    }

    @Override
    public void O(double d2) {
        if (5.2 < d2 || 1.0 > d2) {
            return;
        }
        if (this.bKv - 0.5166666666666667 < d2) {
            return;
        }
        this.bKv = d2;
        float f = (float)(this.bKx + 0.6283185307179586 * arw.Sw());
        lgl lgl2 = new lgl(new ljq(0.0f, 1.0f, 0.0f), f);
        ljq ljq2 = new ljq(0.0f, 0.0f, -1.0f);
        lgl2.Y(this.bFP.aw());
        ljq2 = lgl2.eq(ljq2);
        this.bKx -= 0.5235987755982988;
        float f2 = (float)(this.bKx - 0.6283185307179586 * arw.Sw());
        lgl2 = new lgl(new ljq(0.0f, 1.0f, 0.0f), f2);
        ljq ljq3 = new ljq(0.0f, 0.0f, -1.0f);
        lgl2.Y(this.bFP.aw());
        ljq3 = lgl2.eq(ljq3);
        Collection<asv> collection = this.bFP.IZ().r(this.bFP.av(), 7.5f);
        for (asv asv2 : collection) {
            ljq ljq4 = ljq.z(asv2.av(), this.bFP.av());
            boolean bl = arw.b(ljq4, ljq2, ljq3, 121.0f);
            if (!bl) continue;
            this.bFP.a(asv2, lea.enT().getType("Impact Damage"), 50.0f + arw.Sx() * 50.0f, 5.0f, 5.0f, anf.a.bEb);
        }
    }

    @Override
    public void end() {
        this.bFP.hg(65566);
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        assert (this.bLs == aqu.b.bNF);
        this.bKx = Math.PI * 2;
        this.bKw = false;
        this.bKv = 6.716666666666667;
        this.bFP.hg(65566);
        this.Qs();
    }

    @Override
    public String name() {
        return "ERODACH WHIRLWIND";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

