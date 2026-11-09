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
import java.util.Set;

public class dlk
extends dlo {
    private ccs gFY = null;
    private Set<ldv> gFZ = lcn.emx();
    private Map<Integer, elh> gGa = lcn.emw();
    private int gGb = 0;
    private dlr gGc = null;
    private Map<Integer, ekd> gGd = lcn.emw();
    private int gGe = 0;
    private axo gGf = null;
    private cbx[] gGg = null;
    private a gGh = null;
    private Map<ldv, cmg> byK = lcn.emw();

    public void c(axo axo2) {
        this.gGf = axo2;
    }

    public axo bpz() {
        return this.gGf;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
    }

    @Override
    public boolean a(dxq dxq2, btk btk2) {
        switch (dxq2.bEz()) {
            case 13848: {
                this.a((eoa)dxq2);
                return true;
            }
            case 19460: {
                this.b((ecv)dxq2);
                return true;
            }
            case 13850: {
                this.a((ekd)dxq2);
                return true;
            }
            case 13859: {
                this.a((elh)dxq2);
                return true;
            }
            case 13852: {
                this.a((eka)dxq2);
                return true;
            }
            case 13862: {
                this.a((eoc)dxq2);
                return true;
            }
            case 18733: {
                this.a((eja)dxq2);
                return true;
            }
            case 18735: {
                this.a((eiy)dxq2);
                return true;
            }
            case 34051: {
                this.a((git)dxq2);
                return true;
            }
        }
        return false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 19458: {
                this.b((ecs)dxq2);
                break;
            }
            case 13852: {
                this.a((eka)dxq2);
                break;
            }
            case 13860: {
                this.a((eli)dxq2);
                break;
            }
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            case 13875: {
                this.a((ekg)dxq2);
                break;
            }
            case 6146: {
                this.b((gfn)dxq2);
                break;
            }
            case 8195: {
                this.a((gzp)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eoa eoa2) {
        eob eob2 = (eob)this.MessageDelegator.h(13849, this.gFY == null ? this.GUID : this.gFY.getGUID(), eoa2.aO());
        this.MessageDelegator.b(eoa2, eob2);
        eob2.isM = this.gFY != null && this.isEnabled();
        this.MessageDelegator.F(eob2);
        if (this.gFY != null && this.isEnabled()) {
            this.mQ(eoa2.Tr);
        }
    }

    private void a(eoc eoc2) {
        if (this.gGc == null) {
            this.gGc = new dlr(this);
        }
        this.gGc.a(eoc2);
    }

    private void b(ecv ecv2) {
        if (this.gFY == null) {
            ecw ecw2 = (ecw)this.MessageDelegator.h(19461, this.getGUID(), ecv2.aO());
            this.MessageDelegator.b(ecv2, ecw2);
            this.MessageDelegator.F(ecw2);
        }
        assert (this.gFY != null);
        boolean bl = this.gFY.a(ecv2, this.isEnabled());
        if (bl) {
            this.mQ(ecv2.Ri);
        }
    }

    private void mQ(ldv ldv2) {
        if (this.XQ() == null) {
            return;
        }
        if (this.XQ().Xw() == null) {
            return;
        }
        if (this.gFY == null) {
            return;
        }
        if (ldv2 == null) {
            return;
        }
        ejp ejp2 = (ejp)this.MessageDelegator.h(18712, this.XQ().getGUID(), this.XQ().Xw());
        ejp2.Ri = ldv2;
        ejp2.isp = this.gFY.az();
        this.MessageDelegator.F(ejp2);
    }

    private boolean bpA() {
        if (this.gFY == null) {
            return false;
        }
        return this.isEnabled();
    }

    private void a(eka eka2) {
        this.mS(eka2.Tr);
    }

    private void a(elh elh2) {
        if (this.csC.Xw() == null) {
            eli eli2 = (eli)this.MessageDelegator.h(13860, this.getGUID(), elh2.aO());
            this.MessageDelegator.b(elh2, eli2);
            eli2.ew = 3;
            this.MessageDelegator.F(eli2);
            return;
        }
        if (this.gFY == null || !this.gFY.aHY()) {
            eli eli3 = (eli)this.MessageDelegator.h(13860, this.getGUID(), elh2.aO());
            this.MessageDelegator.b(elh2, eli3);
            eli3.ew = 3;
            this.MessageDelegator.F(eli3);
            return;
        }
        this.gGa.put(this.gGb, elh2);
        elh elh3 = (elh)this.MessageDelegator.h(13859, this.getGUID(), this.csC.Xw());
        elh3.hh(elh2.aoC());
        elh3.ci(this.csC.getGUID());
        elh3.sk(this.gGb);
        ++this.gGb;
        this.MessageDelegator.F(elh3);
    }

    private void a(eli eli2) {
        elh elh2 = this.gGa.remove(eli2.aVk());
        if (elh2 == null) {
            return;
        }
        eli eli3 = (eli)this.MessageDelegator.h(13860, this.getGUID(), eli2.aO());
        this.MessageDelegator.b(elh2, eli3);
        eli3.ew = eli2.ew;
        if (this.gFY == null || !this.gFY.aHY()) {
            eli3.ew = 3;
            this.MessageDelegator.F(eli3);
            return;
        }
        if (eli2.ew == 0) {
            this.gFY.fx(eli2.ekw);
        }
        this.MessageDelegator.F(eli3);
    }

    private void a(ekd ekd2) {
        this.gGd.put(this.gGe, ekd2);
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.GUID, ekd2.Tr);
        eef2.aqs = this.gGe++;
        this.MessageDelegator.F(eef2);
    }

    private void a(eeg eeg2) {
        ekd ekd2 = this.gGd.get(eeg2.aVk());
        if (ekd2 != null) {
            if (eeg2.iG() != null && eeg2.iG().equals(this.XQ().Xw()) && ekd2.isL != 1) {
                eke eke2 = (eke)this.MessageDelegator.h(13851, this.gFY == null ? this.GUID : this.gFY.getGUID(), ekd2.aO());
                this.MessageDelegator.b(ekd2, eke2);
                eke2.isM = this.gFY != null && this.bpA();
                eke2.isL = ekd2.isL;
                if (eke2.isM) {
                    this.mR(ekd2.Tr);
                } else {
                    eke2.isN = false;
                }
                this.MessageDelegator.F(eke2);
                this.gGd.remove(eeg2.aVk());
            } else {
                ekf ekf2 = (ekf)this.MessageDelegator.h(13874, this.getGUID(), this.XQ().Xw());
                ekf2.sk(eeg2.aVk());
                ekf2.isL = ekd2.isL;
                ekf2.cCH = eeg2.iG();
                ekf2.Ri = eeg2.aO();
                ekf2.aDk = this.XQ().getGUID();
                this.MessageDelegator.F(ekf2);
            }
        } else {
            lfn.b(5, "SFBuildingStructure", "handleCharacterNamedPropertiesResponseMessage() : No request found for received message tag! MessageTag: " + eeg2.aVk());
            assert (false);
        }
    }

    private void a(ekg ekg2) {
        ekd ekd2 = this.gGd.remove(ekg2.aVk());
        if (ekd2 != null) {
            eke eke2 = (eke)this.MessageDelegator.h(13851, this.gFY == null ? this.GUID : this.gFY.getGUID(), ekd2.aO());
            this.MessageDelegator.b(ekd2, eke2);
            eke2.isL = ekd2.isL;
            eke2.isM = false;
            boolean bl = eke2.isN = this.gFY != null;
            if (ekg2.isM && this.XQ().Xw() != null && this.XQ().Xw().equals(ekg2.aO())) {
                eke2.isM = this.bpA();
                if (eke2.isM) {
                    this.mR(ekd2.Tr);
                } else {
                    eke2.isN = false;
                }
            }
            this.MessageDelegator.F(eke2);
        } else {
            lfn.b(5, "SFBuildingStructure", "handleClanRelationToClanResponseMessage() : No request found for received message tag! MessageTag: " + ekg2.aVk());
            assert (false);
        }
    }

    private void mR(ldv ldv2) {
        if (this.gFZ.contains(ldv2)) {
            return;
        }
        this.gFZ.add(ldv2);
    }

    private void mS(ldv ldv2) {
        if (!this.gFZ.remove(ldv2)) {
            // empty if block
        }
    }

    private void bpB() {
        if (this.gFY == null) {
            return;
        }
        assert (this.gFY != null);
        for (ldv ldv2 : this.gFZ) {
            eka eka2 = (eka)this.MessageDelegator.h(13852, this.gFY.getGUID(), ldv2);
            eka2.Tr = ldv2;
            this.MessageDelegator.F(eka2);
        }
        this.gFZ.clear();
    }

    @Override
    protected void b(ecs ecs2) {
        if (ecs2.aVk() < 2) {
            super.b(ecs2);
            return;
        }
        if (ecs2.bFA() == null) {
            this.gGt = true;
            return;
        }
        this.gGt = true;
        if (ecs2.aVk() == 3) {
            this.c(ecs2);
            return;
        }
        if (ecs2.aVk() == 2) {
            this.y(this.gFY);
            this.gFY = null;
            this.Qg = null;
        }
        if (ecs2.aVk() == 6) {
            this.y(this.Qg);
            this.Qg = ecs2.bFA();
            this.Qg.aAG().c(this.csA.av());
            this.Qg.aAG().a(this.csA.aw());
            this.MessageDelegator.a((amf)this.Qg);
            this.Qg.fi().c(352, this.csA.Yd());
            this.gFY = ecs2.bFA();
            this.gFY.a((cbq)this);
            this.gFY.a((btn)this);
            this.gFY.a(this);
            this.gFY.Hy();
            this.gGH = false;
            this.c(this.Qg, this.csA.XM());
            if (this.csA.isEnabled() && !this.avz) {
                this.enable();
            } else if (!this.csA.isEnabled() && this.avz) {
                this.disable();
            }
            this.aSp();
            this.HV();
            return;
        }
        this.gFY = ecs2.bFA();
        this.Qg = this.gFY;
        if (ecs2.aVk() == 5) {
            this.bpH();
            this.gFY.Hy();
            this.bpK();
            this.c(this.Qg, this.csA.XM());
            this.in(true);
        } else {
            this.aSv();
            this.gFY.Hy();
        }
        this.gFY.a((cbq)this);
        this.gFY.a((btn)this);
        this.gFY.a(this);
        if (ecs2.aVk() != 5) {
            this.a(this.Qg, 15.0f, ep.a.Pe);
        }
    }

    private void c(ecs ecs2) {
        super.z(ecs2.bFA());
        this.gFY = ecs2.bFA();
        this.gFY.a((cbq)this);
        this.gFY.a((btn)this);
        this.gFY.Hy();
    }

    @Override
    protected void bN(int n, int n2) {
        ecr ecr2 = (ecr)this.MessageDelegator.h(19457, this.getGUID(), lcr.qBq);
        ecr2.l(n);
        ecr2.sk(n2);
        ecr2.jS(true);
        ecr2.c(this.csA.av());
        ecr2.a(this.csA.aw());
        ecr2.oF(this.getGUID());
        this.MessageDelegator.F(ecr2);
    }

    @Override
    protected void y(cbx cbx2) {
        assert (cbx2 instanceof ccs);
        ccs ccs2 = (ccs)cbx2;
        ecx ecx2 = (ecx)this.MessageDelegator.h(19459, this.getGUID(), lcr.qBq);
        ecx2.ku(ccs2.getGUID());
        ecx2.jV(true);
        this.MessageDelegator.F(ecx2);
        this.MessageDelegator.hd(ccs2.getGUID());
    }

    @Override
    public void a(cbx cbx2, et et2) {
        super.a(cbx2, et2);
    }

    @Override
    public amm aIB() {
        if (this.gFY == null) {
            return null;
        }
        return this.gFY.aIB();
    }

    private void a(eja eja2) {
        ejb ejb2 = (ejb)this.MessageDelegator.h(18734, this.GUID, eja2.aO());
        this.MessageDelegator.b(eja2, ejb2);
        ejb2.kk(this.csC.Xw() == null ? false : this.csC.Xw().equals(eja2.bHj()));
        ejb2.kl(this.gFY == null ? false : this.gFY.aHY());
        ejb2.km(this.gFY == null ? false : this.gFY.aIe());
        ejb2.kn(this.csC.Ze());
        ejb2.ko(this.csC.dt(eja2.bHi()));
        ejb2.b(this.csC.Zr());
        ejb2.kp(this.csC.dw(eja2.bHi()));
        ejb2.kq(this.csC.dy(eja2.bHi()));
        ejb2.kr(this.csC.dv(eja2.bHj()));
        ejb2.ks(this.csC.dx(eja2.bHj()));
        this.MessageDelegator.F(ejb2);
    }

    private void a(eiy eiy2) {
        eiz eiz2 = (eiz)this.MessageDelegator.h(18736, this.GUID, eiy2.aO());
        this.MessageDelegator.b(eiy2, eiz2);
        if (this.gFY == null) {
            eiz2.a(axr.ctd);
            this.MessageDelegator.F(eiz2);
            return;
        }
        if (!this.gFY.aHY()) {
            eiz2.a(axr.ctg);
            this.MessageDelegator.F(eiz2);
            return;
        }
        if (this.csC.Xw() == null) {
            eiz2.a(axr.ctf);
            this.MessageDelegator.F(eiz2);
            return;
        }
        if (this.csC.Xw().equals(eiy2.bHj()) && ((!this.csC.Ze() ? eiy2.bHk() : eiy2.bHl()) || this.csC.dt(eiy2.bHi()))) {
            if (!this.gFY.fx(this.gFY.aIe() ? eiy2.bHm() : false)) {
                eiz2.a(axr.ctd);
                this.MessageDelegator.F(eiz2);
                return;
            }
            eiz2.a(axr.cte);
            this.MessageDelegator.F(eiz2);
            return;
        }
        switch (this.csC.Zr()) {
            case cDW: {
                break;
            }
            case cDX: {
                if (!this.csC.dx(eiy2.bHj()) && !this.csC.dy(eiy2.bHi()) || this.csC.dw(eiy2.bHi())) break;
                eiz2.a(axr.cti);
                this.MessageDelegator.F(eiz2);
                return;
            }
            case cDY: {
                if (this.csC.Xw().equals(eiy2.bHj()) || (this.csC.dw(eiy2.bHi()) || this.csC.dv(eiy2.bHj())) && !this.csC.dy(eiy2.bHi())) break;
                eiz2.a(axr.ctj);
                this.MessageDelegator.F(eiz2);
                return;
            }
            case cDZ: {
                if (this.csC.Xw().equals(eiy2.bHj())) break;
                eiz2.a(axr.ctf);
                this.MessageDelegator.F(eiz2);
                return;
            }
            case cEa: {
                if (this.csC.Xw().equals(eiy2.bHj())) {
                    eiz2.a(axr.ctk);
                    this.MessageDelegator.F(eiz2);
                    return;
                }
                eiz2.a(axr.ctf);
                this.MessageDelegator.F(eiz2);
                return;
            }
        }
        if (!this.gFY.fx(this.gFY.aIe())) {
            eiz2.a(axr.ctd);
            this.MessageDelegator.F(eiz2);
            return;
        }
        eiz2.a(axr.cte);
        this.MessageDelegator.F(eiz2);
    }

    private void a(git git2) {
        Object object;
        eh eh2;
        if (this.gGh != null) {
            this.b(null, false, may.uhh.bD(new Object[0]));
            return;
        }
        this.gGh = new a(this, null);
        this.gGh.ec = git2.aO();
        if (!this.isEnabled() || this.gFY == null || this.gFY.aAG() == null) {
            this.b(null, false, may.uhi.bD(new Object[0]));
            return;
        }
        bvd bvd2 = this.gFY.aAG();
        lgw lgw2 = (lgw)lea.enW().acv(this.csA.Yo());
        Map<String, eh> map = ei.ao(lgw2.bBt());
        int n = ei.an("AttachPoint_Wall Ladder 01");
        float f = 0.0f;
        int n2 = -1;
        int n3 = 0;
        for (n3 = 0; n3 < 6 && (eh2 = map.get(object = ei.fe()[n + n3])) != null; ++n3) {
            ljq ljq2 = eh2.fb().esF();
            ljq2 = bvd2.azc().eq(ljq2);
            ljq2.es(bvd2.azb());
            ljq ljq3 = ljq2.esF();
            ljq3.et(git2.av());
            float f2 = ljq3.eqN();
            if (n2 != -1 && !(f2 < f)) continue;
            n2 = n3;
            f = f2;
            this.gGh.Position = ljq2;
            this.gGh.Rotation = bvd2.aw();
            this.gGh.Rotation.Y(eh2.fc());
            this.gGh.gGi = n2;
        }
        if (n2 == -1) {
            this.b(null, false, may.uhj.bD(new Object[0]));
            return;
        }
        if (f > 6.0f) {
            this.b(null, false, may.uhk.bD(new Object[0]));
            return;
        }
        if (this.gGg == null) {
            this.gGg = new cbx[n3];
        }
        if (this.gGg[n2] != null) {
            this.b(null, false, may.uhl.bD(new Object[0]));
            return;
        }
        if (git2.bVu()) {
            this.b(null, true, null);
            return;
        }
        object = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        ((gfw)object).sk(n2);
        ((gfm)object).Yc = this.GUID;
        ((gfm)object).ResourceType = cug.fnT;
        ((gfm)object).asi = 1;
        ((gfm)object).iSi = 1;
        ((gfm)object).gb = this.MessageDelegator.bzw();
        this.MessageDelegator.F((dxq)object);
    }

    private void b(ldv ldv2, boolean bl, loz loz2) {
        Cloneable cloneable;
        if (ldv2 == null) {
            ldv2 = this.gGh.ec;
            this.gGh = null;
        }
        if (loz2 != null) {
            cloneable = lcr.tQ((ldv)ldv2);
            fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, (ldv)cloneable);
            fgs2.r(loz2);
            this.MessageDelegator.E(fgs2);
        }
        cloneable = (giu)this.MessageDelegator.h(34052, this.GUID, ldv2);
        ((giu)cloneable).jO(bl);
        this.MessageDelegator.E((dxq)cloneable);
    }

    private void a(gzp gzp2) {
        if (gzp2.bhp.getType() == 352) {
            for (int i = 0; i < this.gGg.length; ++i) {
                cbx cbx2 = this.gGg[i];
                if (cbx2 == null || !cbx2.getGUID().equals(gzp2.dtj)) continue;
                et et2 = (et)gzp2.bhp;
                et et3 = (et)cbx2.jm().ae(353);
                if (!(et2.fN() <= et3.fN())) break;
                this.MessageDelegator.hd(cbx2.getGUID());
                this.gGg[i] = null;
                break;
            }
        }
    }

    private void b(gfn gfn2) {
        int n = gfn2.aVk();
        switch (n) {
            case 100: 
            case 101: {
                this.f(gfn2);
                return;
            }
        }
        if (this.gGh == null) {
            assert (false);
            return;
        }
        if (gfn2.dtF == null) {
            this.b(null, false, null);
            return;
        }
        bvd bvd2 = gfn2.dtF.aIl();
        if (bvd2 == null) {
            assert (false);
            this.b(null, false, null);
            return;
        }
        gfn2.dtF.d(bvd2);
        bvd2.c(this.gGh.Position);
        bvd2.a(this.gGh.Rotation);
        this.gGg[this.gGh.gGi] = gfn2.dtF;
        this.MessageDelegator.a((amf)gfn2.dtF);
        gzo gzo2 = (gzo)this.MessageDelegator.h(8193, this.GUID, gfn2.dtF.getGUID());
        gzo2.jvG = new dqi();
        gzo2.jvG.nC(this.GUID);
        gzo2.jvG.hZ(gfn2.dtF.getGUID());
        gzo2.jvG.M(new int[]{352});
        this.MessageDelegator.F(gzo2);
        this.b(null, true, null);
    }

    @Override
    public void bpx() {
        super.bpx();
    }

    @Override
    public void Ay(int n) {
        super.Ay(n);
        this.io(false);
    }

    @Override
    public void XZ() {
        if (this.gGg != null) {
            for (cbx cbx2 : this.gGg) {
                if (cbx2 == null) continue;
                this.MessageDelegator.hd(cbx2.getGUID());
            }
            this.gGg = null;
        }
        this.io(true);
        if (this.gFY != null) {
            this.bpB();
            this.gFY = null;
        }
        super.XZ();
    }

    @Override
    protected void disable() {
        this.bpB();
        super.disable();
        if (!this.byK.isEmpty()) {
            for (cmg cmg2 : this.byK.values()) {
                cmg2.gr(false);
            }
        }
    }

    @Override
    protected void enable() {
        super.enable();
        if (!this.byK.isEmpty()) {
            for (cmg cmg2 : this.byK.values()) {
                cmg2.gr(true);
            }
        }
    }

    public int lF() {
        if (!this.byK.isEmpty()) {
            for (cmg cmg2 : this.byK.values()) {
                if (!(cmg2 instanceof cmj)) continue;
                return ((cmj)cmg2).lF();
            }
        }
        return -1;
    }

    public float Zt() {
        if (!this.byK.isEmpty()) {
            for (cmg cmg2 : this.byK.values()) {
                cmj cmj2;
                if (!(cmg2 instanceof cmj) || (cmj2 = (cmj)cmg2).jm() == null) continue;
                return cmj2.jm().al(352);
            }
        }
        return 0.0f;
    }

    public void aTi() {
        if (!this.byK.isEmpty()) {
            for (cmg cmg2 : this.byK.values()) {
                if (!(cmg2 instanceof cmj)) continue;
                cmj cmj2 = (cmj)cmg2;
                cmj2.aTi();
            }
        }
    }

    private void in(boolean bl) {
        amm amm2 = this.aIB();
        if (amm2 == null) {
            return;
        }
        Map<Integer, amm.a> map = amm2.GO();
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Integer n : map.keySet()) {
            gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
            gfm2.sk(bl ? 101 : 100);
            gfm2.Yc = this.getGUID();
            gfm2.ResourceType = n;
            gfm2.iSi = 1;
            this.MessageDelegator.F(gfm2);
        }
    }

    private void io(boolean bl) {
        if (!this.byK.isEmpty()) {
            for (Map.Entry<ldv, cmg> entry : this.byK.entrySet()) {
                Object object;
                ldv ldv2 = entry.getKey();
                cmg cmg2 = entry.getValue();
                cmj cmj2 = null;
                if (cmg2 instanceof cmj) {
                    cmj2 = (cmj)cmg2;
                    object = lea.epQ().iK(cmj2.lF());
                    if (object != null) {
                        this.aG(((ayc.a)object).GG());
                    }
                }
                if (bl) {
                    this.csC.gO(-1);
                    cmg2.g(this.gFY.aIv().aof());
                } else {
                    cmg2.aTf();
                    if (cmj2 != null) {
                        this.csC.gO(cmj2.lF());
                    }
                }
                object = (ggb)this.MessageDelegator.h(6147, this.getGUID(), lcr.qCq);
                ((ggb)object).gb = ldv2;
                this.MessageDelegator.F((dxq)object);
                this.MessageDelegator.hd(ldv2);
            }
            this.byK.clear();
        }
    }

    public void aF(List<aml> list) {
        amm amm2 = this.aIB();
        if (amm2 == null) {
            lfn.b(5, "SFStructure", "enableSpecialAttributes() No structureinfo");
            return;
        }
        if (list == null || list.isEmpty()) {
            lfn.b(5, "SFStructure", "enableSpecialAttributes() No attributes");
            return;
        }
        for (aml aml2 : list) {
            amm2.a(aml2);
        }
        if (this.avz) {
            this.csC.b((dlo)this, amm2.GG(), true);
        }
    }

    public void aG(List<aml> list) {
        amm amm2 = this.aIB();
        if (amm2 == null) {
            lfn.b(5, "SFStructure", "disableSpecialAttributes() No structureinfo");
            return;
        }
        if (list == null || list.isEmpty()) {
            lfn.b(5, "SFStructure", "disableSpecialAttributes() No attributes");
            return;
        }
        for (aml aml2 : list) {
            amm2.b(aml2);
        }
        if (this.avz) {
            this.csC.a((dlo)this, amm2.GG());
        }
    }

    @Override
    public void ip(boolean bl) {
        if (this.byK != null) {
            for (cmg cmg2 : this.byK.values()) {
                cmg2.gs(bl);
            }
        }
    }

    @Override
    protected void bpC() {
        super.bpC();
        this.in(false);
    }

    private void f(gfn gfn2) {
        int n = gfn2.aVk();
        if (n != 100 && n != 101) {
            assert (false) : "MessageTag : " + n;
            return;
        }
        cbx cbx2 = gfn2.dtF;
        if (cbx2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleAssociatedObjectCreation() : Associated object failed to created.");
            assert (false);
            return;
        }
        amm amm2 = this.aIB();
        assert (amm2 != null);
        eh eh2 = amm2.hb(cbx2.az());
        assert (eh2 != null);
        ljq ljq2 = new ljq();
        lgl lgl2 = new lgl();
        eh2.a(this.aze().aAG().azb(), this.aze().aAG().azc(), ljq2, lgl2);
        bvd bvd2 = cbx2.aIl();
        cbx2.d(bvd2);
        bvd2.c(ljq2);
        bvd2.a(lgl2);
        cbx2.aAG().c(bvd2.av());
        cbx2.aAG().a(bvd2.aw());
        this.MessageDelegator.a((amf)cbx2);
        assert (cbx2 instanceof cmg);
        cmg cmg2 = (cmg)cbx2;
        cmg2.b(this);
        cmg2.gr(this.isEnabled());
        this.byK.put(cbx2.getGUID(), cmg2);
        if (cmg2 instanceof cmj) {
            cmj cmj2 = (cmj)cmg2;
            cmj2.a(this.csC.lF(), this.csC.Zt(), n == 101);
        }
    }
}

