/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  axx
 *  cbx
 *  cxd
 *  lcr
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public abstract class dlo
extends btk
implements btn,
bto,
cbq {
    public static final float gGp = 15.0f;
    protected cbx Qg = null;
    protected ljq eJR = null;
    protected ljq gGq = null;
    protected lgl gGr = null;
    protected cpw gGs = null;
    protected bwa eld = null;
    protected boolean gGt = true;
    protected axq csA = null;
    protected axx csC = null;
    protected ccs gGu = null;
    protected boolean gGv = false;
    protected static final int dpC = 1;
    protected static final int gGw = 2;
    protected static final int gGx = 3;
    protected static final int gGy = 4;
    protected static final int gGz = 5;
    protected static final int gGA = 6;
    protected static final int gGB = 100;
    protected static final int gGC = 101;
    protected int aDw = -1;
    protected int gGD = 0;
    protected LinkedList<ccs> gGE = lcn.emA();
    protected int gGF = -1;
    protected boolean eJS = false;
    protected boolean gGG = false;
    protected boolean gGH = false;
    protected int gGI = -1;
    protected amm elb = null;
    protected boolean avz = false;
    private int gGJ = 0;
    private double gGK = 0.0;
    private boolean gGL = false;

    protected dlo() {
    }

    public void bpv() {
    }

    @Override
    public boolean a(dxq dxq2, btk btk2) {
        return false;
    }

    @Override
    public void b(cbx cbx2) {
        if (cbx2 instanceof ccs && (ccs)cbx2 == this.gGu) {
            this.bpO();
            return;
        }
        assert (cbx2 == this.Qg);
        assert (this.aDw >= 0);
        axy axy2 = this.csC.a(this, this.aDw);
        switch (axy2) {
            case cuA: {
                if (this.avz) {
                    this.disable();
                    break;
                }
                this.aqx();
                break;
            }
            case cuz: {
                this.Ay(this.aDw - 1);
                break;
            }
            case cuy: {
                if (this.avz) {
                    this.disable();
                }
                this.XZ();
                break;
            }
            case cux: {
                lfn.b(4, "SFStructure", "handleDeadObject() Taking no action!");
                break;
            }
            default: {
                assert (false) : "Unknown operation";
                break;
            }
        }
    }

    public void bpE() {
        if (this.avz) {
            this.disable();
        }
        this.XZ();
    }

    public float Yd() {
        if (this.Qg == null) {
            return 0.0f;
        }
        et et2 = this.Qg.jm().ah(352);
        return et2.fN();
    }

    public float Ye() {
        if (this.Qg == null) {
            return 0.0f;
        }
        return this.Qg.jm().ai(352);
    }

    @Override
    public boolean b(cbx cbx2, et et2) {
        if (cbx2 == this.gGu || this.aDw < 0) {
            return true;
        }
        if (!this.avz) {
            if (this.csC.YT()) {
                return true;
            }
            this.aqx();
            return false;
        }
        return true;
    }

    @Override
    public void a(cbx cbx2, et et2) {
        if (cbx2 == this.gGu || this.aDw < 0) {
            return;
        }
        if (!this.avz) {
            if (!this.csC.e(this)) {
                return;
            }
            this.enable();
            return;
        }
        if (this.gGH) {
            return;
        }
        if (et2.getType() != 352) {
            return;
        }
        if (et2.fN() <= 0.0f) {
            return;
        }
        cbx cbx3 = cbx2;
        if (cbx3 != this.Qg) {
            return;
        }
        this.csC.g(this);
        int n = this.e(et2, et2.fN());
        if (n < 0) {
            return;
        }
        this.bN(n, 3);
        this.gGH = true;
        this.c(this.Qg, true);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.eld != null) {
            this.eld.doTick(this.MessageDelegator.arc());
        }
        if (!this.gGE.isEmpty()) {
            Iterator iterator = this.gGE.iterator();
            while (iterator.hasNext()) {
                ccs ccs2 = (ccs)iterator.next();
                if (!ccs2.aAG().isReadyToRun()) continue;
                this.b(ccs2);
                iterator.remove();
            }
        }
        if (this.gGG && this.aAE()) {
            this.gGt = false;
            assert (this.gGI >= 0);
            int n = this.csA.iw(this.gGI);
            assert (n > 0);
            this.bN(n, 2);
            this.gGG = false;
            this.csC.a(this, this.aDw, this.gGI);
            this.aDw = this.gGI;
            this.disable();
        }
        if (this.eJS && this.aAE()) {
            this.eJS = false;
            this.csA.cf(false);
            if (this.csC.YQ() && this.csA.Yg() != 1) {
                this.enable();
            }
            this.bpC();
            if (!(this instanceof dlj)) {
                this.c(this.Qg, this.csA.XM());
            }
        }
        if (!(this.gGG || this.eJS || !this.gGt || this.csA.XU() || this.aze() == null || this.isEnabled() || this.csA.Yh() || !this.csC.e(this))) {
            this.enable();
        }
    }

    protected void bpC() {
    }

    public int Ya() {
        if (this.aDw < 0) {
            return 0;
        }
        int n = this.csA.iw(this.aDw);
        assert (n > 0);
        lgw lgw2 = (lgw)lea.enW().acv(n);
        if (lgw2 == null) {
            lfn.b(5, "SFStructure", "getCurrentPowerLevel() Could NOT get SFResourceListItem!");
            return 0;
        }
        return (int)lgw2.erL();
    }

    public void bpF() {
        this.aDw = -1;
        assert (this.csA != null);
        if (this.csA.Yw()) {
            this.bpN();
        }
    }

    public void bpx() {
        assert (this.csA != null);
        this.bN(this.csA.Yo(), 4);
        this.gGt = false;
        this.aDw = 0;
        this.csC.a(this, -1, 0);
        if (this.gGu != null) {
            this.gGE.add(this.gGu);
            this.gGu = null;
        }
    }

    public void XO() {
        assert (this.csA != null);
        if (this.csA.XS() < 0) {
            this.bpF();
            return;
        }
        this.gGI = this.csA.XS();
        int n = this.csA.iw(this.gGI);
        assert (n > 0);
        this.bN(n, 5);
        this.csC.a(this, -1, this.gGI);
        this.aDw = this.gGI;
    }

    public void XZ() {
        assert (this.gGt);
        if (this.Qg == null) {
            lfn.b(5, "SFStructure", "destroyStructure() PhysicalObject == null");
            return;
        }
        this.disable();
        if (!this.aAE()) {
            this.aAC();
        }
        this.y(this.Qg);
        this.csC.a(this, this.aDw, -1);
        this.aDw = -1;
        this.Qg = null;
        this.csC.h(this);
        if (this.csA.Yw()) {
            this.bpN();
        }
    }

    public void Ay(int n) {
        assert (this.aDw >= 0);
        this.gGG = true;
        this.bpL();
        this.gGI = n;
        this.gGL = true;
    }

    public void Az(int n) {
        if (this.aDw >= 0) {
            this.gGG = true;
            this.bpL();
            this.gGI = n;
            this.gGL = true;
        } else {
            this.bN(this.csA.iw(n), 4);
            this.gGt = false;
            this.aDw = n;
            this.csC.a(this, -1, n);
            if (this.gGu != null) {
                this.gGE.add(this.gGu);
                this.gGu = null;
            }
        }
    }

    public void bpG() {
        this.XZ();
        if (this.gGu != null) {
            assert (this.gGu.aAG().isReadyToRun());
            this.bpP();
        }
    }

    protected abstract void y(cbx var1);

    protected void z(cbx cbx2) {
        if (this.Qg == null) {
            return;
        }
        float f = this.Qg.fi().al(352);
        this.y(this.Qg);
        this.Qg = cbx2;
        this.Qg.aAG().c(this.csA.av());
        this.Qg.aAG().a(this.csA.aw());
        this.MessageDelegator.a((amf)this.Qg);
        this.gGH = false;
        this.c(this.Qg, false);
        this.Qg.fi().c(352, f);
    }

    protected void AA(int n) {
        if (this.csA.Yq() == null) {
            return;
        }
        if (this.csA.Yq().equals("")) {
            return;
        }
        if (this.Qg == null) {
            assert (false);
            return;
        }
        this.gGq = null;
        this.gGr = null;
        this.gGs = null;
        bvd bvd2 = this.Qg.aAG();
        if (bvd2 == null) {
            lfn.b(5, "SFStructure", "createVendor() MO == NULL");
            return;
        }
        Map<String, eh> map = ei.ao(bvd2.getFileName());
        if (map == null) {
            lfn.b(5, "SFStructure", "createVendor() AttMap == null");
            return;
        }
        eh eh2 = map.get("AttachPoint_Structure Vendor 01");
        if (eh2 == null) {
            lfn.b(5, "SFStructure", "createVendor() ATTACHPOINT_STRUCTURE_VENDOR_01 == null");
            assert (false);
            return;
        }
        this.gGr = new lgl(eh2.getRotation());
        this.gGr.Y(this.csA.aw());
        this.gGq = lgl.a(this.csA.aw(), eh2.fb());
        this.gGq.es(this.csA.av());
        String string = this.csA.Yq();
        if (n > 0) {
            string = string + (n + 1);
        }
        string = string + ".xml";
        ++this.gGJ;
        gzb gzb2 = (gzb)this.MessageDelegator.h(20225, this.getGUID(), lcr.qBw);
        gzb2.ln(string);
        gzb2.c(this.gGq);
        gzb2.a(this.gGr);
        gzb2.ms(false);
        gzb2.jS(true);
        gzb2.oF(this.getGUID());
        gzb2.sk(this.gGJ);
        this.MessageDelegator.F(gzb2);
    }

    private void b(gzc gzc2) {
        if (gzc2.bYt() == null) {
            lfn.b(5, "SFStructure", "handleVendorCreateResponse() Vendor did NOT assemble!");
            return;
        }
        if (gzc2.aVk() != this.gGJ) {
            lfn.b(5, "SFStructure", "handleVendorCreateResponse() Vendor Already removed");
            this.b(gzc2.bYt());
            return;
        }
        this.gGs = gzc2.bYt();
    }

    private void b(cpw cpw2) {
        assert (cpw2 != null);
        gzi gzi2 = (gzi)this.MessageDelegator.h(20227, this.getGUID(), lcr.qBw);
        gzi2.mt(true);
        gzi2.qG(cpw2.getGUID());
        this.MessageDelegator.F(gzi2);
    }

    public int Gy() {
        return this.csA.Yo();
    }

    public String Gz() {
        return this.csA.Yp();
    }

    public axq XL() {
        return this.csA;
    }

    public void b(axq axq2) {
        this.csA = axq2;
    }

    protected void aSw() {
        if (this.Qg == null) {
            return;
        }
        bvd bvd2 = this.Qg.aAG();
        if (bvd2 == null) {
            lfn.b(5, "SFStructure", "setupSpawnDelta() MO == NULL");
            this.eJR = new ljq();
            return;
        }
        Map<String, eh> map = ei.ao(bvd2.getFileName());
        if (map == null) {
            assert (false) : "There are no attachpoints for : " + bvd2.getFileName();
            lfn.b(5, "SFStructure", "setupSpawnDelta() AttMap == null");
            this.eJR = new ljq();
            return;
        }
        eh eh2 = map.get("AttachPoint_Structure Spawn Delta");
        if (eh2 == null) {
            assert (false) : "There are no attachpoints with the name : AttachPoint_Structure Spawn Delta  for : " + bvd2.getFileName();
            lfn.b(5, "SFStructure", "setupSpawnDelta() SpawnPoint == null");
            this.eJR = new ljq();
            return;
        }
        this.eJR = new ljq(eh2.fb());
        this.eJR.rlV = 0.0f;
        this.eJR.x = 0.0f;
    }

    protected void aSv() {
        if (this.Qg == null) {
            return;
        }
        this.aSw();
        ljq ljq2 = this.csA.av();
        ljq2.et(this.eJR);
        this.Qg.aAG().c(ljq2);
        this.Qg.aAG().a(this.csA.aw());
        this.MessageDelegator.a((amf)this.Qg);
        this.aSx();
        this.eJS = true;
    }

    protected void bpH() {
        if (this.Qg == null) {
            return;
        }
        ljq ljq2 = this.csA.av();
        this.Qg.aAG().c(ljq2);
        this.Qg.aAG().a(this.csA.aw());
        this.MessageDelegator.a((amf)this.Qg);
        this.aSw();
    }

    public boolean bpI() {
        return this.Qg != null && this.Qg.aAG() != null && this.Qg.aAG().ayZ();
    }

    public void bpJ() {
        if (this.bpI()) {
            this.bpK();
        }
    }

    protected void bpK() {
        int n;
        if (!this.bpI()) {
            if (this.csC == null) {
                lfn.b(5, this.getClass().getSimpleName(), "restoreStructureEnabling() : No City!!!!!!!!!!!!!!!!!!!!!!!");
                assert (false);
            } else {
                this.csC.c(this);
                return;
            }
        }
        this.Qg.jm().c(352, this.csA.Yd());
        switch (this.csA.Yg()) {
            case 1: {
                this.csA.setEnabled(false);
                break;
            }
            case 2: {
                this.csA.setEnabled(true);
                break;
            }
            default: {
                if (this.csC.d(this)) {
                    this.csA.setEnabled(this.Qg.fi().al(352) / this.Qg.fi().ai(352) > 0.05f);
                    break;
                }
                this.csA.setEnabled(true);
            }
        }
        if (this.csA.isEnabled() && !this.avz) {
            this.enable();
        } else if (!this.csA.isEnabled() && this.avz) {
            this.disable();
        }
        if (this.csA.YB() && this.csA.XS() == 0 && (n = this.e(this.Qg.jm().ah(352), this.csA.Yd())) >= 0 && this.Qg.az() != n) {
            this.bN(n, 6);
            this.gGH = true;
            return;
        }
        this.Qg.jm().c(352, this.csA.Yd());
        this.aSp();
        this.HV();
        this.csA.cg(false);
    }

    private void j(ljq ljq2, ljq ljq3) {
        if (this.Qg == null) {
            assert (false);
            return;
        }
        bvd bvd2 = this.Qg.aAG();
        this.eld = new bwa();
        this.eld.setServerObject(true);
        this.eld.eL(false);
        this.eld.d(bvd2);
        this.eld.setMessageDelegator(this.MessageDelegator);
        this.eld.bf(15.0);
        this.eld.bc(ljq2);
        this.eld.l(this.csA.aw());
        this.eld.bd(ljq3);
        this.eld.m(this.csA.aw());
        this.eld.o(this.MessageDelegator.arc().rgz);
        this.eld.initialize();
    }

    private void k(ljq ljq2, ljq ljq3) {
        if (this.Qg == null) {
            return;
        }
        fuj fuj2 = (fuj)this.MessageDelegator.h(1038, this.Qg.getGUID(), this.Qg.getGUID());
        fuj2.gon = ljq2;
        fuj2.goo = ljq3;
        fuj2.iWX = this.csA.aw();
        fuj2.iWY = this.csA.aw();
        fuj2.eKm = 15.0;
        fuj2.oV = this.MessageDelegator.arc().rgz;
        gqu gqu2 = (gqu)this.MessageDelegator.h(11055, this.getGUID(), lcr.qAJ);
        gqu2.jpQ = (float)this.MessageDelegator.arc().rgz + 15.0f;
        gqu2.iXB = fuj2;
        this.MessageDelegator.F(gqu2);
    }

    protected void aSx() {
        assert (this.Qg != null);
        assert (this.eJR != null);
        if (this.Qg == null) {
            return;
        }
        ljq ljq2 = this.csA.av();
        ljq2.et(this.eJR);
        this.j(ljq2, this.csA.av());
        this.k(ljq2, this.csA.av());
    }

    protected void bpL() {
        assert (this.Qg != null);
        if (this.Qg == null) {
            return;
        }
        assert (this.eJR != null);
        ljq ljq2 = this.csA.av();
        ljq2.et(this.eJR);
        this.j(this.csA.av(), ljq2);
        this.k(this.csA.av(), ljq2);
    }

    public boolean aAE() {
        if (this.eld == null) {
            return true;
        }
        return this.eld.aAE();
    }

    protected void aAC() {
    }

    public boolean bpM() {
        if (this.gGv) {
            return false;
        }
        if (this.gGu != null && !this.gGu.aAG().isReadyToRun()) {
            return false;
        }
        return this.gGt;
    }

    public axx XQ() {
        return this.csC;
    }

    public void b(axx axx2) {
        this.csC = axx2;
    }

    private void bpN() {
        assert (this.csA.Yw());
        this.gGv = true;
        ecr ecr2 = (ecr)this.MessageDelegator.h(19457, this.getGUID(), lcr.qBq);
        ecr2.l(this.csA.Yx());
        ecr2.sk(1);
        ecr2.jS(true);
        ecr2.c(this.csA.av());
        ecr2.a(this.csA.aw());
        ecr2.oF(this.getGUID());
        this.MessageDelegator.F(ecr2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 19458: {
                this.b((ecs)dxq2);
                break;
            }
            case 20226: {
                this.b((gzc)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected void b(ecs ecs2) {
        if (ecs2.aVk() != 1) {
            super.receiveMessage(ecs2);
            return;
        }
        this.gGv = false;
        this.gGu = ecs2.bFA();
        if (this.gGu == null) {
            lfn.b(5, "SFStructure", "handleBuildingCreateResponse() Could not assemble rubble.");
            assert (false);
            return;
        }
        this.gGu.a(this);
        this.gGu.a(this);
        this.MessageDelegator.a((amf)((Object)this.gGu));
    }

    private void bpO() {
        this.bpP();
    }

    private void bpP() {
        if (this.gGu == null) {
            return;
        }
        this.b(this.gGu);
        this.gGu = null;
    }

    private void b(ccs ccs2) {
        ecx ecx2 = (ecx)this.MessageDelegator.h(19459, this.getGUID(), lcr.qBq);
        ecx2.ku(ccs2.getGUID());
        ecx2.jV(true);
        this.MessageDelegator.F(ecx2);
        this.MessageDelegator.hd(ccs2.getGUID());
    }

    protected void a(cbx cbx2, float f, ep.a a2) {
        alp alp2 = new alp();
        alp2.setGUID(this.MessageDelegator.bzv());
        alp2.x(f);
        alp2.ga(1);
        alp2.fC(352);
        alp2.gc(0);
        alp2.cP(this.getGUID());
        alp2.gd(cbx2.az());
        alp2.ge(cxd.fHu);
        alp2.fJ(bfk.dgO);
        alp2.gf(1);
        alp2.a(a2);
        cbx2.jm().a((alq)alp2);
    }

    protected void c(cbx cbx2, boolean bl) {
        if (cbx2 == null) {
            return;
        }
        ez ez2 = (ez)cbx2.fi().ae(352);
        assert (ez2 != null);
        boolean bl2 = this instanceof dlj;
        if (bl) {
            ez2.a(this.csA.XM() && !bl2 ? ep.a.Pf : ep.a.Pe);
        } else {
            ez2.a(this.csA.XM() && !bl2 ? ep.a.Pf : ep.a.Pg);
        }
        if (this.csA.Yl()) {
            cbx2.fi().f(12432, ez2.gk() == ep.a.Pf);
        }
    }

    public void n(boolean bl, boolean bl2) {
        if (this.Qg == null) {
            return;
        }
        ej ej2 = this.Qg.fi().ae(352);
        if (ej2 == null) {
            return;
        }
        if (!(ej2 instanceof ez)) {
            return;
        }
        if (((ez)ej2).gk() != ep.a.Pe) {
            ((ez)ej2).a(bl ? ep.a.Pf : ep.a.Pg);
        }
        if (this.csA.Yl()) {
            this.Qg.fi().f(12432, ((ez)ej2).gk() == ep.a.Pf);
        }
        if (this instanceof dlk) {
            dlk dlk2 = (dlk)this;
            dlk2.ip(bl2);
        }
    }

    protected int i(et et2) {
        if (!this.csA.YB()) {
            return 0;
        }
        int n = this.csA.ix(this.aDw);
        if (n == 0) {
            return 0;
        }
        return 0;
    }

    protected int e(et et2, float f) {
        assert (et2.getType() == 352);
        if (!this.csA.YB()) {
            return -1;
        }
        assert (this.aDw >= 0);
        int n = this.csA.ix(this.aDw);
        if (n <= 0) {
            return -1;
        }
        ++n;
        float f2 = f;
        float f3 = et2.fi().ai(352);
        assert (f3 > 0.0f);
        if (f2 > f3) {
            f2 = f3;
        } else if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        float f4 = f2 / f3;
        f4 = 1.0f - f4;
        float f5 = n;
        int n2 = (int)(f5 * f4);
        if (n2 > n - 1) {
            n2 = n - 1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 == this.gGD) {
            return -1;
        }
        this.gGD = n2;
        return this.csA.U(n2, this.aDw);
    }

    public int XS() {
        return this.aDw;
    }

    public void iB(int n) {
        this.aDw = n;
    }

    protected abstract void bN(int var1, int var2);

    public abstract amm aIB();

    protected void enable() {
        assert (!this.avz);
        this.avz = true;
        this.csA.setEnabled(this.avz);
        this.AA(this.aDw);
        amm amm2 = this.aIB();
        if (amm2 == null) {
            lfn.b(5, "SFStructure", "enable() No structureinfo");
            return;
        }
        if (this.gGL) {
            this.csC.a(this, amm2.GG());
            this.gGL = false;
        } else {
            this.csC.b(this, amm2.GG(), false);
        }
        this.csC.i(this);
        this.iq(true);
    }

    protected void iq(boolean bl) {
        if (this.Qg == null) {
            lfn.b(5, "SFStructure", "setActiveFlag() PhysicalObject == null");
            return;
        }
        eq eq2 = this.Qg.fi().af(1280);
        if (eq2 == null) {
            return;
        }
        eq2.x(bl);
    }

    protected void aqx() {
        if (this.Qg == null) {
            return;
        }
        ej ej2 = this.Qg.fi().ae(352);
        if (ej2 == null) {
            lfn.b(5, "SFStructure", "enableAttributeNotification() No Health Attribute!");
            return;
        }
        if (!(ej2 instanceof ex)) {
            lfn.b(5, "SFStructure", "enableAttributeNotification() Health NOT limited float attribute");
            return;
        }
        ex ex2 = (ex)ej2;
        ex2.y(true);
    }

    protected void disable() {
        if (!this.avz) {
            return;
        }
        this.avz = false;
        this.csA.setEnabled(this.avz);
        if (!this.gGL) {
            this.csC.f(this);
        }
        if (this.gGs != null) {
            this.b(this.gGs);
            this.gGs = null;
        }
        this.csC.j(this);
        this.gGK = this.MessageDelegator.arc().rgz;
        this.iq(false);
        this.aqx();
    }

    public cbx aze() {
        return this.Qg;
    }

    public double bpQ() {
        return this.gGK;
    }

    public void bO(double d2) {
        this.gGK = d2;
    }

    public boolean isEnabled() {
        return this.avz;
    }

    public void aSp() {
    }

    public void HV() {
    }

    public void ip(boolean bl) {
    }

    public boolean acR() {
        return this.gGG;
    }
}

