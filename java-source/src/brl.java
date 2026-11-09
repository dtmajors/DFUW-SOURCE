/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  cug
 *  lcr
 */
import java.util.List;

public class brl
extends bqk {
    private static final int dIG = 1000000000;
    private static final int dIH = 1000;
    private static final int dII = 1000000;
    private bqb dIJ = null;

    public brl() {
        this(true);
    }

    public brl(boolean bl2) {
        super(bl2 ? 8 : 0);
        this.setObjectType(63);
    }

    public final bqb avR() {
        return this.dIJ;
    }

    public final boolean a(brm brm2, brs brs2) {
        assert (!this.Initialized);
        if (brm2 == null) {
            return false;
        }
        if (brs2 == null) {
            return false;
        }
        if (this.dBQ.cF(brm2.getGUID())) {
            return false;
        }
        if (brm2 instanceof brt && ((brt)brm2).az() == cug.fkb) {
            return false;
        }
        if (brm2 instanceof brt) {
            return this.a((brt)brm2, this.dBQ.awe(), true);
        }
        if (brm2 instanceof bsc) {
            return this.a((bsc)brm2, this.dBQ.awe(), true);
        }
        return super.a(brm2, brs2);
    }

    public final void dd(float f2) {
        assert (f2 > 0.0f);
        for (brs brs2 : this.dBQ.AN().values()) {
            if (!(brs2.awo() instanceof brt)) continue;
            brt brt2 = (brt)brs2.awo();
            float f3 = 0.0f;
            f3 = (int)(brt2.Bb() * f2);
            brt2.aa(f3);
            gyz gyz2 = (gyz)this.MessageDelegator.h(12050, this.GUID, lcr.qAI);
            gyz2.aXP = 10;
            gyz2.eDY = 1;
            gyz2.aCK = brt2.getGUID();
            gyz2.aXV = brt2.Bb();
            this.MessageDelegator.E(gyz2);
        }
    }

    protected final void aut() {
        assert (this.Initialized);
        super.aut();
        if (this.dwG) {
            brs brs2 = this.dBQ.awe();
            this.dBQ.reset();
            brs brs3 = this.dBQ.awe();
            brs3.awo().setGUID(this.GUID);
            this.avS();
            this.a(brs2, brs3);
        }
    }

    private void a(brs brs2, brs brs3) {
        assert (brs2 != null);
        assert (brs3 != null);
        if (!brs2.Ba()) {
            return;
        }
        List<brs> list = brs2.AY();
        for (int i = 0; i < list.size(); ++i) {
            brs brs4 = list.get(i);
            if (brs4.awo() instanceof brt) {
                this.a((brt)brs4.awo(), brs3, false);
                continue;
            }
            if (!(brs4.awo() instanceof bsc)) continue;
            this.a((bsc)brs4.awo(), brs3, false);
        }
    }

    private void avS() {
        assert (this.Initialized);
        assert (this.dBQ.awe() != null);
        this.dIJ = new bqb();
        this.dIJ.l(cug.fkb);
        this.dIJ.setGUID(this.MessageDelegator.bzv());
        this.dIJ.do(0);
        this.dIJ.aX(null);
        this.dIJ.lS(0);
        this.b(this.dIJ, this.dBQ.awe());
        this.dIJ.do(1000000);
    }

    protected void a(fmm fmm2) {
        switch (fmm2.bEz()) {
            case 7937: {
                this.a((fla)fmm2);
                break;
            }
            case 7938: {
                this.a((flb)fmm2);
                break;
            }
            case 7940: {
                this.a((fmv)fmm2);
                break;
            }
            case 7953: {
                this.a((fmb)fmm2);
                break;
            }
            case 7939: {
                this.a((fln)fmm2);
                break;
            }
            default: {
                super.a(fmm2);
            }
        }
    }

    private void a(fmv fmv2) {
        assert (this.Initialized);
        assert (this.dwG);
        if (fmv2.aCK == null) {
            return;
        }
        if (fmv2.dIW == null) {
            return;
        }
        boolean bl2 = true;
        ldv ldv2 = fmv2.aCK;
        brm brm2 = this.iF(ldv2);
        if (brm2 == null) {
            bl2 = false;
        } else if (!this.dBR.b(ldv2, fmv2.dIW)) {
            bl2 = false;
        }
        if (!bl2) {
            this.a(fmv2.aO(), 2, false, fmv2.aVk());
            return;
        }
        boolean bl3 = false;
        bl3 = brm2 instanceof brt ? this.a((brt)brm2) : (brm2 instanceof bsc ? this.a((bsc)brm2) : false);
        if (bl3) {
            this.a(fmv2.aO(), 2, true, fmv2.aVk());
            if (fmv2.iQC) {
                brv brv2 = new brv();
                brv2.dIY = brm2;
                fmw fmw2 = (fmw)this.MessageDelegator.h(7941, this.GUID, fmv2.aO());
                this.MessageDelegator.b(fmv2, fmw2);
                fmw2.iQE = brv2;
                this.MessageDelegator.F(fmw2);
            }
        } else {
            this.a(fmv2.aO(), 2, false, fmv2.aVk());
        }
    }

    private void o(int n, ldv ldv2) {
        assert (this.Initialized);
        assert (this.dwG);
        gyz gyz2 = (gyz)this.MessageDelegator.h(12050, this.GUID, lcr.qAI);
        gyz2.aXP = 4;
        gyz2.eDY = n;
        gyz2.aCK = ldv2;
        this.MessageDelegator.E(gyz2);
    }

    public final boolean mt(int n) {
        assert (this.Initialized);
        assert (this.dIJ != null);
        assert (this.dIJ.az() == cug.fkb);
        assert (this.dIJ.vf() >= 0);
        assert (n != 0);
        if (n < 0) assert (this.dIJ.vf() >= n);
        this.dIJ.do(this.dIJ.vf() + n);
        if (this.dIJ.vf() >= 1000000000) {
            this.dIJ.do(this.dIJ.vf() - 1000000);
        } else if (this.dIJ.vf() <= 1000) {
            this.dIJ.do(this.dIJ.vf() + 1000000);
        }
        return true;
    }

    private void a(fln fln2) {
        assert (this.Initialized);
        assert (this.dIJ != null);
        assert (this.dIJ.getGUID() != null);
        if (fln2.aCK == null) {
            return;
        }
        if (fln2.dIW == null) {
            return;
        }
        if (fln2.iPw == 0) {
            return;
        }
        boolean bl2 = true;
        bqb bqb2 = (bqb)this.iF(fln2.aCK);
        if (bqb2 == null) {
            bl2 = false;
        } else if (!this.dIJ.getGUID().equals(bqb2.getGUID())) {
            bl2 = false;
        } else if (this.dIJ.vf() <= 0) {
            bl2 = false;
        } else if (fln2.iPw < 0 && this.dIJ.vf() < fln2.iPw) {
            bl2 = false;
        } else if (!this.dBR.b(fln2.aCK, fln2.dIW)) {
            bl2 = false;
        }
        if (!bl2) {
            this.a(fln2.aO(), 15, false, fln2.aVk());
            return;
        }
        boolean bl3 = this.mt(fln2.iPw);
        this.a(fln2.aO(), 15, bl3, fln2.aVk());
    }

    public final brt jj(ldv ldv2) {
        if (ldv2 == null) {
            return null;
        }
        brm brm2 = this.iF(ldv2);
        if (brm2 == null) {
            return null;
        }
        if (brm2 instanceof brt) {
            return (brt)brm2;
        }
        return null;
    }

    private void a(fla fla2) {
        assert (this.Initialized);
        assert (this.dwG);
        if (fla2.aCK == null) {
            return;
        }
        if (fla2.iPl == null) {
            return;
        }
        boolean bl2 = true;
        if (this.iE(fla2.aCK)) {
            bl2 = false;
        } else if (!this.dBR.b(this.GUID, fla2.iPl)) {
            bl2 = false;
        }
        if (!bl2) {
            this.a(fla2.aO(), 1, false, fla2.aVk());
            return;
        }
        brt brt2 = new brt();
        brt2.setGUID(fla2.aCK);
        brt2.l(fla2.ResourceType);
        brt2.do(fla2.asi);
        brt2.aa(fla2.aXV);
        brt2.setWeight(fla2.aXy);
        boolean bl3 = this.a(brt2, this.dBQ.awe(), false);
        this.a(fla2.aO(), 1, bl3, fla2.aVk());
    }

    private void a(fmb fmb2) {
        assert (this.Initialized);
        if (fmb2.aCK == null) {
            return;
        }
        if (fmb2.dIW == null) {
            return;
        }
        if (fmb2.iPI <= 0) {
            return;
        }
        boolean bl2 = true;
        brt brt2 = this.jj(fmb2.aCK);
        if (brt2 == null) {
            bl2 = false;
        } else if (brt2.vf() < fmb2.iPI) {
            bl2 = false;
        } else if (!this.dBR.b(fmb2.aCK, fmb2.dIW)) {
            bl2 = false;
        }
        if (!bl2) {
            this.a(fmb2.aO(), 7, false, fmb2.aVk());
            return;
        }
        boolean bl3 = this.a(brt2, fmb2.iPI);
        this.a(fmb2.aO(), 7, bl3, fmb2.aVk());
        if (fmb2.iPJ) {
            brt brt3 = (brt)brt2.awy();
            brt3.setGUID(null);
            brt3.do(fmb2.iPI);
            fmc fmc2 = (fmc)this.MessageDelegator.h(7954, this.GUID, fmb2.aO());
            this.MessageDelegator.b(fmb2, fmc2);
            fmc2.dIY = brt3;
            this.MessageDelegator.F(fmc2);
        }
    }

    private boolean a(brt brt2, brs brs2, boolean bl2) {
        assert (brt2 != null);
        assert (brs2 != null);
        assert (brt2.Bb() > 0.0f);
        this.b(brt2, brs2);
        if (bl2) {
            return true;
        }
        if (this.dwG) {
            gyz gyz2 = (gyz)this.MessageDelegator.h(12050, this.GUID, lcr.qAI);
            gyz2.aXP = 1;
            gyz2.eDY = 1;
            gyz2.aCK = brt2.getGUID();
            gyz2.ResourceType = brt2.az();
            gyz2.asi = brt2.vf();
            gyz2.aXV = brt2.Bb();
            gyz2.aXy = brt2.getWeight();
            this.MessageDelegator.E(gyz2);
        }
        return true;
    }

    private boolean a(brt brt2, int n) {
        assert (this.Initialized);
        assert (brt2 != null);
        assert (brt2.vf() >= n);
        assert (n > 0);
        brt2.do(brt2.vf() - n);
        assert (brt2.vf() >= 0);
        if (brt2.vf() != 0) {
            gyz gyz2 = (gyz)this.MessageDelegator.h(12050, this.GUID, lcr.qAI);
            gyz2.aXP = 18;
            gyz2.eDY = 1;
            gyz2.aCK = brt2.getGUID();
            gyz2.asi = brt2.vf();
            this.MessageDelegator.E(gyz2);
        }
        return true;
    }

    private boolean a(brt brt2) {
        assert (this.Initialized);
        assert (brt2 != null);
        boolean bl2 = this.iG(brt2.getGUID());
        if (bl2 && this.dwG) {
            this.o(1, brt2.getGUID());
        }
        return bl2;
    }

    public final bsc jk(ldv ldv2) {
        if (ldv2 == null) {
            return null;
        }
        brm brm2 = this.iF(ldv2);
        if (brm2 == null) {
            return null;
        }
        if (brm2 instanceof bsc) {
            return (bsc)brm2;
        }
        return null;
    }

    private void a(flb flb2) {
        assert (this.Initialized);
        assert (this.dwG);
        if (flb2.aCK == null) {
            return;
        }
        if (flb2.iPl == null) {
            return;
        }
        boolean bl2 = true;
        if (this.iE(flb2.aCK)) {
            bl2 = false;
        } else if (!this.dBR.b(this.GUID, flb2.iPl)) {
            bl2 = false;
        }
        if (!bl2) {
            this.a(flb2.aO(), 1, false, flb2.aVk());
            return;
        }
        bsc bsc2 = new bsc();
        bsc2.setGUID(flb2.aCK);
        bsc2.eI(flb2.SkillType);
        bsc2.ag(flb2.SkillLevel);
        bsc2.aa(flb2.aXV);
        boolean bl3 = this.a(bsc2, this.dBQ.awe(), false);
        this.a(flb2.aO(), 1, bl3, flb2.aVk());
    }

    private boolean a(bsc bsc2, brs brs2, boolean bl2) {
        assert (bsc2 != null);
        assert (brs2 != null);
        assert (bsc2.Bb() > 0.0f);
        this.b(bsc2, brs2);
        if (bl2) {
            return true;
        }
        if (this.dwG) {
            gyz gyz2 = (gyz)this.MessageDelegator.h(12050, this.GUID, lcr.qAI);
            gyz2.aXP = 1;
            gyz2.eDY = 2;
            gyz2.aCK = bsc2.getGUID();
            gyz2.SkillType = bsc2.zg();
            gyz2.SkillLevel = bsc2.Bt();
            gyz2.aXV = bsc2.Bb();
            this.MessageDelegator.E(gyz2);
        }
        return true;
    }

    private boolean a(bsc bsc2) {
        assert (this.Initialized);
        assert (bsc2 != null);
        boolean bl2 = this.iG(bsc2.getGUID());
        if (bl2 && this.dwG) {
            this.o(2, bsc2.getGUID());
        }
        return bl2;
    }

    protected void a(uk uk2) {
        assert (uk2 != null);
        if (uk2.Uo < 160) {
            super.a(uk2);
            return;
        }
        switch (uk2.aWp) {
            case 25: {
                this.a((vj)uk2);
                break;
            }
            case 33: {
                this.a((vq)uk2);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(vj vj2) {
        brt brt2;
        assert (vj2 != null);
        vj2.GUID = this.iI(vj2.GUID);
        boolean bl2 = false;
        if ((vj2.aXP & 1) > 0) {
            brt2 = new brt();
            brt2.setGUID(vj2.GUID);
            brt2.l(vj2.ResourceType);
            brt2.do(vj2.asi);
            brt2.aa(vj2.aXV);
            brt2.setWeight(vj2.aXy);
            this.a(brt2, this.dBQ.awe(), false);
            bl2 = true;
        }
        if ((vj2.aXP & 8) > 0) {
            brt2 = (brt)this.iF(vj2.GUID);
            if (brt2 == null) {
                return;
            }
            if ((vj2.aXP & 0x80) > 0) {
                brt2.do(vj2.asi);
            }
            if ((vj2.aXP & 0x10) > 0) {
                brt2.aa(vj2.aXV);
            }
            bl2 = true;
        }
        if ((vj2.aXP & 4) > 0) {
            brt2 = (brt)this.iF(vj2.GUID);
            if (brt2 == null) {
                return;
            }
            this.a(brt2);
            bl2 = true;
        }
        if (bl2) {
            this.ln(1);
        }
    }

    private void a(vq vq2) {
        bsc bsc2;
        assert (vq2 != null);
        vq2.GUID = this.iI(vq2.GUID);
        if ((vq2.aXP & 1) > 0) {
            bsc2 = new bsc();
            bsc2.setGUID(vq2.GUID);
            bsc2.eI(vq2.SkillType);
            bsc2.ag(vq2.SkillLevel);
            bsc2.aa(vq2.aXV);
            this.a(bsc2, this.dBQ.awe(), false);
        }
        if ((vq2.aXP & 8) > 0) {
            bsc2 = (bsc)this.iF(vq2.GUID);
            if (bsc2 == null) {
                return;
            }
            bsc2.ag(vq2.SkillLevel);
            bsc2.aa(vq2.aXV);
        }
        if ((vq2.aXP & 4) > 0) {
            bsc2 = (bsc)this.iF(vq2.GUID);
            if (bsc2 == null) {
                return;
            }
            this.a(bsc2);
        }
    }
}

