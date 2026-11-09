/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cwx
 *  cyt
 *  lcr
 *  lcw
 */
import java.util.List;

public class cyz {
    private final cyt emI;
    private final dxr MessageDelegator;
    private final ldv fZl;
    private final boolean fZm;
    private List<cyl> fZn = lcn.abH(5);
    private static les aqN = lea.enZ();

    public cyz(cyt cyt2) {
        this.emI = cyt2;
        this.MessageDelegator = this.emI.bgQ().getMessageDelegator();
        this.fZl = this.emI.bgQ().isServerObject() ? lcr.qEb : lcr.qEa;
        this.fZm = !lcw.emZ();
    }

    public void a(int n2, ddb ddb2, ddc ddc2, cwx cwx2) {
        if (n2 <= 0) {
            return;
        }
        if (ddb2 == null) {
            return;
        }
        if (!this.fZm) {
            return;
        }
        ldv ldv2 = null;
        ldv2 = ddc2 == null ? this.a(n2, ddb2, null) : this.a(ddb2, ddc2, cwx2);
        if (ldv2 == null) {
            return;
        }
        int n3 = ddb2.getSpecialEffectType();
        if (n3 == -1) {
            n3 = ddb2.bjG();
        }
        cyl cyl2 = new cyl();
        cyl2.SkillType = n2;
        cyl2.SpecialEffectType = n3;
        cyl2.aUa = ldv2;
        this.fZn.add(cyl2);
    }

    public void ze(int n2) {
        if (n2 <= 0) {
            return;
        }
        if (!this.fZm) {
            return;
        }
        if (this.fZn.isEmpty()) {
            return;
        }
        int n3 = this.fZn.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            cyl cyl2 = this.fZn.get(i2);
            this.mo(cyl2.aUa);
        }
        this.fZn.clear();
    }

    public ldv a(int n2, ddb ddb2, ljq ljq2) {
        ldv ldv2;
        if (n2 <= 0) {
            return null;
        }
        if (ddb2 == null) {
            return null;
        }
        if (!this.fZm) {
            return lcr.qAC;
        }
        int n3 = ddb2.getSpecialEffectType();
        if (n3 == -1) {
            n3 = ddb2.bjG();
        }
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.emI.bgQ().getGUID(), this.fZl);
        glh2.SpecialEffectType = n3;
        glh2.oV = ddb2.bjH();
        glh2.jkR = true;
        glh2.aUa = ldv2 = this.MessageDelegator.lL(this.fZl);
        if (ddb2.biW() != cxd.t.fSJ) {
            ldv ldv3 = this.emI.b(ddb2.biW());
            if (ldv3 == null) {
                return null;
            }
            glh2.akX = ldv3;
            ljq ljq3 = this.a(n2, ddb2.biW());
            if (ljq2 != null) {
                ljq3 = ljq2;
            }
            glh2.aZD = ljq3;
        }
        int n4 = 0;
        if (ddb2.bjK()) {
            n4 |= 1;
            glh2.aZG = this.emI.a(cxd.t.fSM);
            if (glh2.aZG == null) {
                // empty if block
            }
        }
        if (ddb2.bjL()) {
            n4 |= 2;
            glh2.aZH = this.emI.yS(n2);
            if (glh2.aZH == null) {
                // empty if block
            }
        }
        if (ddb2.bjM()) {
            n4 |= 4;
            glh2.gfq = this.emI.yT(n2);
            if (glh2.gfq == null) {
                glh2.gfq = new lgl();
            }
        }
        if (ddb2.bjN()) {
            float f2 = this.emI.a(n2, ddb2.biV());
            if (!((double)f2 <= 0.0) || f2 != -2.0f) {
                // empty if block
            }
            n4 |= 8;
            glh2.doT = f2;
        }
        if (ddb2.bjO()) {
            cwx cwx2 = this.emI.yG(n2);
            if (cwx2 == null) {
                return null;
            }
            n4 |= 0x10;
            glh2.biu = cwx2.bfw() / 100.0f;
            glh2.gfr = 0.0f;
            if (glh2.biu <= 0.0f || glh2.biu > 1.0f || glh2.gfr < 0.0f || glh2.gfr > 30.0f) {
                // empty if block
            }
        }
        glh2.jkS = n4;
        boolean bl = false;
        switch (ddb2.biV()) {
            case fSd: 
            case fSj: 
            case fSk: {
                bl = false;
                break;
            }
            case fSc: 
            case fSf: {
                if (!this.emI.isServerObject() || this.emI.bgQ().Ux()) break;
                bl = true;
                break;
            }
            default: {
                if (!this.emI.isServerObject() || this.emI.bgQ().Ux()) break;
                bl = true;
            }
        }
        if (bl) {
            glh2.gfs = this.emI.bgQ().aJP().hk();
        }
        this.MessageDelegator.F(glh2);
        return ldv2;
    }

    public ldv a(ddb ddb2, ddc ddc2, cwx cwx2) {
        if (ddb2 == null) {
            return null;
        }
        if (ddc2 == null) {
            return null;
        }
        if (!this.fZm) {
            return lcr.qAC;
        }
        int n2 = ddb2.getSpecialEffectType();
        if (n2 == -1) {
            n2 = ddb2.bjG();
        }
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.emI.bgQ().getGUID(), this.fZl);
        glh2.setSpecialEffectType(n2);
        glh2.setTargetPosition(ddc2.aZD);
        glh2.o(ddb2.bjH());
        glh2.mj(true);
        ldv ldv2 = this.MessageDelegator.lL(this.fZl);
        glh2.my(ldv2);
        int n3 = 0;
        if (ddb2.biW() != cxd.t.fSJ) {
            glh2.setTargetObjectGUID(ddc2.dsL);
            assert (glh2.getTargetObjectGUID() != null);
            if (ddc2.akX.equals(lcr.qEk)) {
                n3 |= 0x20;
            }
        }
        if (ddb2.bjK()) {
            n3 |= 1;
            glh2.aZG = this.emI.a(cxd.t.fSM);
            if (glh2.aZG == null) {
                // empty if block
            }
        }
        if (ddb2.bjL()) {
            n3 |= 2;
            glh2.aZH = ddc2.aZH != null ? ddc2.aZH : this.emI.yS(cwx2.zg());
            if (glh2.aZH == null) {
                // empty if block
            }
        }
        if (ddb2.bjM()) {
            n3 |= 4;
            glh2.gfq = ((cyv)this.emI).E(ddc2.aYC, true);
            if (glh2.gfq == null) {
                // empty if block
            }
        }
        if (ddb2.bjN()) {
            float f2 = 0.0f;
            f2 = ddb2.biV() == cxd.p.fSf ? (ddc2.doT > 0.0f ? ddc2.doT : this.emI.a(ddc2.aYC, ddb2.biV())) : this.emI.a(ddc2.aYC, ddb2.biV());
            if (f2 <= 0.0f) {
                return null;
            }
            n3 |= 8;
            glh2.doT = f2;
        }
        if (ddb2.bjO()) {
            n3 |= 0x10;
            glh2.biu = ddc2.biu;
            glh2.gfr = cwx2.fd(ddc2.biu);
            if (glh2.biu <= 0.0f || glh2.biu > 1.0f || glh2.gfr < 0.0f || glh2.gfr > 30.0f) {
                // empty if block
            }
        }
        glh2.jkS = n3;
        this.MessageDelegator.F(glh2);
        return ldv2;
    }

    public void mo(ldv ldv2) {
        if (!this.fZm) {
            return;
        }
        if (ldv2 == null) {
            return;
        }
        this.cx(ldv2);
    }

    private ljq a(int n2, cxd.t t2) {
        assert (n2 > 0);
        switch (t2) {
            case fSK: {
                return this.emI.bgQ().aAG().av();
            }
            case fSL: {
                return this.emI.yS(n2);
            }
            case fSM: {
                return this.emI.bgQ().aAG().av();
            }
        }
        return null;
    }

    private void cx(ldv ldv2) {
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.emI.bgQ().getGUID(), this.fZl);
        glj2.jkV = 1;
        glj2.aUa = ldv2;
        this.MessageDelegator.F(glj2);
    }
}

