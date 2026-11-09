/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Set;

public class bpu
extends bnw {
    private Set<Integer> dAc = lcn.emx();

    public bpu() {
        super(true);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11781: {
                this.a((fky)dxq2);
                break;
            }
            case 12819: {
                this.a((edt)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void cZ(float f2) {
        if (f2 <= 0.0f) {
            return;
        }
        this.dwJ.asg().mt((int)f2);
    }

    private void a(edt edt2) {
        if (edt2.aVk() == -1) {
            return;
        }
        if (!this.dAc.remove(edt2.aVk())) {
            return;
        }
        bpm bpm2 = ((bpv)this.dwJ).lN(edt2.aVk());
        if (bpm2 == null) {
            return;
        }
        assert (bpm2.dAb != null);
        if (edt2.imr <= 0.0f) {
            edt2.inf = false;
        }
        if (edt2.inf) {
            fky fky2 = bpm2.dAb;
            this.cZ(edt2.imr);
            bsc bsc2 = this.dwJ.asg().jk(fky2.aCK);
            if (bsc2 == null) {
                this.a(edt2.aO(), false, mdd.uFm.bD(new Object[0]));
                return;
            }
            dct dct2 = new dct();
            dct2.SkillType = bsc2.zg();
            dct2.SkillLevel = 1.0f;
            this.a(fky2.YN, dct2);
            this.a(lcr.ak((ldv)this.GUID, (int)bpm2.RB), true, null);
            ldv ldv2 = lcr.tQ((ldv)edt2.aO());
            fsn fsn2 = (fsn)this.MessageDelegator.h(30221, this.getGUID(), ldv2);
            fsn2.ObjectType = cgd.ewT.ordinal();
            fsn2.bSL = bsc2.zg();
            this.MessageDelegator.F(fsn2);
        } else if (edt2.Zd) {
            this.a(lcr.ak((ldv)this.GUID, (int)bpm2.RB), false, mdc.uEQ.bD(new Object[0]));
        } else {
            this.a(lcr.ak((ldv)this.GUID, (int)bpm2.RB), false, mdd.uFm.bD(new Object[0]));
        }
        bpm2.dAb = null;
    }

    private void a(fky fky2) {
        if (fky2.YN == null) {
            return;
        }
        if (fky2.dxt == null) {
            return;
        }
        if (fky2.aCK == null) {
            return;
        }
        bpm bpm2 = ((bpv)this.dwJ).lN(fky2.aO().ib());
        if (bpm2 == null) {
            return;
        }
        if (this.dAc.contains(bpm2.RB)) {
            this.a(fky2.aO(), false, mdd.uFi.bD(new Object[0]));
            return;
        }
        int n = lcr.abS((int)fky2.dxt.enw());
        fky2.dxt = lcr.ak((ldv)fky2.dxt, (int)n);
        fky2.YN = lcr.ak((ldv)fky2.YN, (int)n);
        fky2.aCK = lcr.ak((ldv)fky2.aCK, (int)this.GUID.ib());
        bsc bsc2 = this.dwJ.asg().jk(fky2.aCK);
        if (bsc2 == null) {
            this.a(fky2.aO(), false, mdd.uFm.bD(new Object[0]));
            return;
        }
        bpm2.dAb = fky2;
        this.dAc.add(bpm2.RB);
        eds eds2 = (eds)this.MessageDelegator.h(12818, this.GUID, fky2.YN);
        eds2.aqs = bpm2.RB;
        eds2.SkillType = bsc2.zg();
        eds2.Cost = (int)bsc2.Bb();
        this.MessageDelegator.F(eds2);
    }

    private void a(ldv ldv2, dct dct2) {
        assert (ldv2 != null);
        assert (dct2 != null);
        fdl fdl2 = (fdl)this.MessageDelegator.h(9235, this.GUID, ldv2.bFk());
        fdl2.bst = bkd.dqQ;
        fdl2.aZG = ldv2;
        fdl2.akX = ldv2;
        fdl2.dvs = new dct[]{dct2};
        fdl2.iJX = false;
        this.MessageDelegator.F(fdl2);
    }

    private void a(ldv ldv2, boolean bl2, loz loz2) {
        assert (ldv2 != null);
        fkz fkz2 = (fkz)this.MessageDelegator.h(11782, this.GUID, ldv2);
        fkz2.iPj = bl2;
        fkz2.s(loz2);
        this.MessageDelegator.F(fkz2);
    }
}

