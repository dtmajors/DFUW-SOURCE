/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  lcr
 */
import java.util.List;
import java.util.Map;

public class bjs
extends btk
implements cbq {
    private static final float dpr = 1.0f;
    private List<a> dps = lcn.emv();
    private bjx dpf = null;

    public bjs(bjx bjx2) {
        this.dpf = bjx2;
    }

    public void a(bjr bjr2, boolean bl2) {
        this.dps.clear();
        int n = 0;
        for (bjp bjp2 : bjr2.aqh()) {
            if (bjp2.az() != cug.fsw) continue;
            a a2 = new a(this);
            a2.ID = n++;
            a2.dpt = bjp2;
            this.dps.add(a2);
            if (bl2) {
                this.b(a2);
                continue;
            }
            this.a(a2);
        }
    }

    private void a(a a2) {
        ecr ecr2 = (ecr)this.MessageDelegator.h(19457, this.getGUID(), lcr.qBq);
        ecr2.l(a2.dpt.az());
        ecr2.sk(a2.ID);
        ecr2.c(a2.dpt.apU());
        ecr2.a(a2.dpt.apV());
        ecr2.oF(this.getGUID());
        ecr2.jS(true);
        this.MessageDelegator.F(ecr2);
    }

    private void b(a a2) {
        int n = a2.dpt.az();
        String string = lea.enW().getName(n);
        string = string + " Rubble";
        n = lea.enW().getType(string);
        if (n == -1) {
            assert (false);
            return;
        }
        fem fem2 = (fem)this.MessageDelegator.h(25345, this.getGUID(), lcr.qBI);
        fem2.sk(a2.ID);
        fem2.l(n);
        fem2.c(a2.dpt.apU());
        fem2.a(a2.dpt.apV());
        fem2.jS(true);
        fem2.oF(this.getGUID());
        this.MessageDelegator.F(fem2);
    }

    private void c(a a2) {
        if (a2.dpv == null) {
            return;
        }
        feq feq2 = (feq)this.MessageDelegator.h(25347, this.GUID, lcr.qBI);
        feq2.pC(a2.dpv.getGUID());
        feq2.iFu = true;
        this.MessageDelegator.F(feq2);
        this.MessageDelegator.hd(a2.dpv.getGUID());
    }

    private void d(a a2) {
        if (a2.dpu == null) {
            assert (false);
            return;
        }
        ecx ecx2 = (ecx)this.MessageDelegator.h(19459, this.GUID, lcr.qBq);
        ecx2.elQ = a2.dpu.getGUID();
        ecx2.ilY = true;
        this.MessageDelegator.E(ecx2);
        this.MessageDelegator.hd(a2.dpu.getGUID());
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 19458) {
            this.a((ecs)dxq2);
        } else if (dxq2.bEz() == 12812) {
            this.a((eeg)dxq2);
        } else if (dxq2.bEz() == 25346) {
            this.a((fen)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    private void a(ecs ecs2) {
        if (ecs2.bFA() == null) {
            assert (false);
            return;
        }
        a a2 = this.dps.get(ecs2.aVk());
        a2.dpu = ecs2.bFA();
        this.MessageDelegator.a((amf)((Object)ecs2.bFA()));
        ecs2.bFA().a(this);
    }

    private void a(fen fen2) {
        if (fen2.bOM() == null) {
            assert (false);
            return;
        }
        a a2 = this.dps.get(fen2.aVk());
        a2.dpv = fen2.bOM();
        this.MessageDelegator.a((amf)((Object)a2.dpv));
    }

    private void a(eeg eeg2) {
        ldv ldv2 = lcr.abW((int)eeg2.aP().enw());
        a a2 = null;
        for (a a3 : this.dps) {
            if (!ldv2.equals(a3.dpw)) continue;
            a2 = a3;
        }
        if (a2 == null) {
            return;
        }
        if (!ldv.tU(eeg2.iG())) {
            this.d(ldv2, maw.ufG.bD(new Object[0]));
            a2.dpw = null;
            this.h(a2.dpu);
            return;
        }
        if (eeg2.kv() && !iw.nE()) {
            this.d(ldv2, mdc.uEO.bD(new Object[0]));
            a2.dpw = null;
            this.h(a2.dpu);
            return;
        }
        a2.dpw = null;
        a2.dpx = eeg2.iG();
        this.d(a2);
        this.b(a2);
        this.dpf.aqM();
        for (a a3 : this.dps) {
            if (a3.dpx != null) continue;
            return;
        }
        this.dpf.aqK();
    }

    @Override
    public boolean b(cbx cbx2, et et2) {
        if (!(cbx2 instanceof ccs)) {
            assert (false);
            return true;
        }
        if (et2.getType() != 352) {
            return true;
        }
        bfl bfl2 = (bfl)cbx2.aIv().aof();
        if (bfl2 == null) {
            return false;
        }
        if (bfl2.aYF == null) {
            this.h(cbx2);
            et2.o(1.0f);
            return false;
        }
        if (lea.enW().isDescendant(bfl2.bsG, cug.fgG)) {
            this.h(cbx2);
            et2.o(1.0f);
            return false;
        }
        a a2 = this.hD(cbx2.getGUID());
        if (a2 == null) {
            assert (false);
            this.h(cbx2);
            et2.o(1.0f);
            return false;
        }
        if (a2.dpx != null) {
            this.h(cbx2);
            return false;
        }
        a2.dpw = lcr.tQ((ldv)bfl2.aYF);
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), a2.dpw);
        this.MessageDelegator.F(eef2);
        return false;
    }

    @Override
    public void b(cbx cbx2) {
    }

    @Override
    public void a(cbx cbx2, et et2) {
        if (et2.getType() != 352) {
            return;
        }
        this.dpf.aqL();
    }

    protected void h(cbx cbx2) {
        ej ej2 = cbx2.fi().ae(352);
        if (ej2 == null) {
            lfn.b(5, "SFFortressSystemMainElementManager", "enableAttributeNotification() No Health Attribute!");
            return;
        }
        if (!(ej2 instanceof ex)) {
            lfn.b(5, "SFFortressSystemMainElementManager", "enableAttributeNotification() Health NOT limited float attribute");
            return;
        }
        ex ex2 = (ex)ej2;
        ex2.o(1.0f);
        ex2.y(true);
    }

    public void d(ldv ldv2, loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    public void aqi() {
        for (a a2 : this.dps) {
            a2.dpx = null;
            this.c(a2);
            this.a(a2);
        }
    }

    private a hD(ldv ldv2) {
        for (a a2 : this.dps) {
            if (a2.dpu == null || !a2.dpu.getGUID().equals(ldv2)) continue;
            return a2;
        }
        return null;
    }

    public float hE(ldv ldv2) {
        int n = 0;
        for (a a2 : this.dps) {
            if (a2.dpx == null || !a2.dpx.equals(ldv2)) continue;
            ++n;
        }
        return (float)n / (float)this.dps.size();
    }

    public void u(Map<ldv, Float> map) {
        for (a a2 : this.dps) {
            Float f = map.get(a2.dpx);
            if (f == null) {
                f = Float.valueOf(0.0f);
            }
            f = Float.valueOf(f.floatValue() + 0.05f);
            map.put(a2.dpx, f);
        }
    }
}

