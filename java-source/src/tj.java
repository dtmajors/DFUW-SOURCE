/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  bri
 *  cbx
 *  cug
 *  cxd
 *  lcr
 */
import java.util.Iterator;
import java.util.Map;

public class tj
extends btk
implements btn,
cbq {
    private final tk ZM;
    private static final float aSq = 200.0f;
    private lid<a> aSr = new lid();
    private lid<a> aSs = new lid();
    private lid<a> aSt = new lid();
    private Map<cbx, a> aSu = lcn.emw();
    private Map<cbx, atf> aSv = lcn.emw();
    private Map<Integer, cbx> aSw = lcn.emw();
    private Map<cbx, fum> aSx = lcn.emw();
    private Map<Integer, cbx> aSy = lcn.emw();
    private int aSz = 1;
    private int aSA = 1;
    private Map<Integer, ldv> aSB = lcn.emw();
    private int ayN = 0;
    private Map<Integer, brv[]> aSC = lcn.emw();
    private int aSD = 0;
    private static final boolean aSE = false;
    private static final double aSF = 0.5;
    private static final double aSG = 600.0;
    private static final double aSH = 1800.0;
    private static final double aSI = 120.0;
    private static final double aSJ = 300.0;
    private static final boolean aSK = true;
    private static final double aSL = 10.0;
    private double aSM = -1.0;

    public tj(tk tk2) {
        this.ZM = tk2;
    }

    public void doTick(ldz ldz2) {
        clw clw2;
        int n;
        int n2;
        if (this.aSu.isEmpty()) {
            return;
        }
        this.t(ldz2);
        a a2 = this.aSr.eg(ldz2.rgz);
        if (a2 != null) {
            if (cug.vk((int)a2.Qg.az()) && !cug.vl((int)a2.Qg.az())) {
                a2.Qg.aIv().aoe();
                this.b(a2.Qg);
            } else {
                this.a(a2);
                this.aSu.remove(a2.Qg);
                this.a(a2.Qg, true);
                this.ZM.b(a2.Qg, true);
                this.c(a2.Qg);
            }
        }
        if ((a2 = this.aSs.eg(ldz2.rgz)) != null) {
            if (!(a2.Qg instanceof clw)) {
                lfn.b(5, "SFDeployablePhysicalObjectManager", "doTick(): Don't know how to report for " + a2.Qg);
                assert (false);
                return;
            }
            n2 = (int)(a2.aSN - ldz2.rgz);
            n = (n2 + 30) / 60;
            clw2 = (clw)a2.Qg;
            if (clw2.az() == cug.fkX) {
                this.ZM.aQ().d(mcv.uCs.bD(clw2.az(), clw2.aAG().av(), n * 60));
            }
            if (clw2.az() == cug.fkY) {
                this.ZM.aQ().e(mcv.uCs.bD(clw2.az(), clw2.aAG().av(), n * 60));
            } else if (!cug.vl((int)a2.Qg.az())) {
                this.ZM.aQ().c(mcv.uCs.bD(clw2.az(), clw2.aAG().av(), n * 60));
            }
            a2.aSO = (double)n2 <= 300.0 ? (a2.aSO += 60.0) : (a2.aSO += 1800.0);
            this.aSs.a(a2.aSO, a2);
        }
        if ((a2 = this.aSt.eg(ldz2.rgz)) != null) {
            if (!(a2.Qg instanceof clw)) {
                lfn.b(5, "SFDeployablePhysicalObjectManager", "doTick(): Don't know how to update attributes for " + a2.Qg);
                assert (false);
                return;
            }
            n2 = (int)(a2.aSN - ldz2.rgz);
            n = (n2 + 30) / 60;
            clw2 = (clw)a2.Qg;
            a2.aSP += 60.0;
            this.aSt.a(a2.aSP, a2);
        }
    }

    private void t(ldz ldz2) {
        if (ldz2.rgz - this.aSM >= 10.0) {
            Iterator<Map.Entry<cbx, a>> iterator = this.aSu.entrySet().iterator();
            while (iterator.hasNext()) {
                clw clw2;
                boolean bl;
                Map.Entry<cbx, a> entry = iterator.next();
                if (!cug.vn((int)entry.getKey().az()) || !(bl = (clw2 = (clw)entry.getKey()).mB().aJC().asf().isEmpty())) continue;
                this.a(entry.getValue());
                iterator.remove();
                this.a(entry.getKey(), true);
                this.ZM.b(entry.getKey(), true);
            }
            this.aSM = ldz2.rgz;
        }
    }

    private void a(a a2) {
        if (a2.aSN > 0.0) {
            this.aSr.b(a2.aSN, a2);
            a2.aSN = -1.0;
        }
        if (a2.aSO > 0.0) {
            this.aSs.b(a2.aSO, a2);
            a2.aSO = -1.0;
        }
        if (a2.aSP > 0.0) {
            this.aSt.b(a2.aSP, a2);
            a2.aSP = -1.0;
        }
    }

    public void a(ti ti2, ljq ljq2, lgl lgl2, ldv ldv2) {
        if (lea.enW().isDescendant(ti2.az(), cug.fkQ) || lea.enW().isDescendant(ti2.az(), cug.fsf) || cug.fwE == ti2.az()) {
            this.a(ti2.az(), ljq2, lgl2);
        } else if (lea.enW().isDescendant(ti2.az(), cug.fkV)) {
            this.a(ti2.az(), ljq2, lgl2, ldv2, -1);
        } else {
            this.b(ti2.az(), ljq2, lgl2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 25346: {
                this.a((fen)dxq2);
                break;
            }
            case 19458: {
                this.a((ecs)dxq2);
                break;
            }
            case 25858: {
                this.a((fpq)dxq2);
                break;
            }
            case 22788: {
                this.a((eaf)dxq2);
                break;
            }
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(int n, ljq ljq2, lgl lgl2) {
        fem fem2 = (fem)this.MessageDelegator.h(25345, this.getGUID(), lcr.qBI);
        fem2.ikP = true;
        fem2.Position = ljq2;
        fem2.Rotation = lgl2;
        fem2.ResourceType = n;
        fem2.ilU = null;
        this.MessageDelegator.F(fem2);
    }

    private void a(int n, ljq ljq2, lgl lgl2, ldv ldv2, int n2) {
        fpp fpp2 = (fpp)this.MessageDelegator.h(25857, this.getGUID(), lcr.qBL);
        fpp2.l(n);
        fpp2.c(ljq2);
        fpp2.a(lgl2);
        fpp2.jS(true);
        if (cug.vk((int)n)) {
            if (ldv2 == null) {
                lfn.b(5, "SFDeployablePhysicalObjectManager", "sendLocalStorageObjectCreateRequest(): OwnerGUID == null");
                assert (false);
                return;
            }
            fpp2.sk(this.ayN);
            this.aSB.put(this.ayN, ldv2);
            ++this.ayN;
        } else if (cug.vn((int)n)) {
            assert (ldv2 == null);
            fpp2.sk(n2);
        }
        this.MessageDelegator.F(fpp2);
    }

    private void m(ldv ldv2, int n) {
        fpt fpt2 = (fpt)this.MessageDelegator.h(25859, this.getGUID(), lcr.qBL);
        fpt2.hsP = true;
        fpt2.iTo = ldv2;
        fpt2.iFu = false;
        this.MessageDelegator.F(fpt2);
    }

    private void cm(ldv ldv2) {
        feq feq2 = (feq)this.MessageDelegator.h(25347, this.getGUID(), lcr.qBI);
        feq2.iKB = ldv2;
        feq2.iFu = false;
        this.MessageDelegator.F(feq2);
    }

    private void b(int n, ljq ljq2, lgl lgl2) {
        ecr ecr2 = (ecr)this.MessageDelegator.h(19457, this.getGUID(), lcr.qBq);
        ecr2.ikP = true;
        ecr2.Position = ljq2;
        ecr2.Rotation = lgl2;
        ecr2.ResourceType = n;
        ecr2.ilU = null;
        if (cug.wK((int)n)) {
            ecr2.ilS = new ljq(ljq2.x, ljq2.y - 2.0f, ljq2.rlV);
            ecr2.ilT = lgl2;
            ecr2.aTo = 2.0;
            ecr2.ilR = true;
        }
        this.MessageDelegator.F(ecr2);
    }

    private void cn(ldv ldv2) {
        ecx ecx2 = (ecx)this.MessageDelegator.h(19459, this.getGUID(), lcr.qBq);
        ecx2.elQ = ldv2;
        ecx2.ilY = false;
        this.MessageDelegator.F(ecx2);
    }

    private void a(fen fen2) {
        if (fen2.iKC == null) {
            assert (false);
            return;
        }
        ti ti2 = lea.eom().get(fen2.iKC.az());
        if (ti2 == null) {
            this.cm(fen2.iKC.getGUID());
            assert (false);
            return;
        }
        this.a((cbx)fen2.iKC, ti2);
        fen2.iKC.c(this);
        fen2.iKC.b(this);
    }

    private void a(ecs ecs2) {
        assert (ecs2.bFA() != null);
        if (ecs2.bFA() == null) {
            return;
        }
        ti ti2 = lea.eom().get(ecs2.bFA().az());
        if (ti2 == null) {
            this.cn(ecs2.aIU());
            assert (false);
            return;
        }
        this.a((cbx)ecs2.bFA(), ti2);
        ecs2.bFA().a(this);
        ecs2.bFA().a(this);
    }

    private void a(fpq fpq2) {
        if (fpq2.iTo == null) {
            lfn.b(5, "SFDeployablePhysicalObjectManager", "handleLocalStorageObjectCreateResponseMessage(): Message.LocalStorageObjectGUID == null");
            assert (false);
            return;
        }
        if (fpq2.eIh == null) {
            lfn.b(5, "handleLocalStorageObjectCreateResponseMessage", "registerObject() Local Storage == null");
            assert (false);
            return;
        }
        if (!(fpq2.bQP() instanceof clw)) {
            assert (false);
            return;
        }
        clw clw2 = (clw)fpq2.bQP();
        int n = clw2.az();
        ti ti2 = lea.eom().get(n);
        if (ti2 == null) {
            lfn.b(5, "SFDeployablePhysicalObjectManager", "handleLocalStorageObjectCreateResponseMessage(): Info == null for RT " + n);
            this.m(fpq2.iTo, n);
            assert (false);
            return;
        }
        this.a((cbx)clw2, ti2);
        clw2.Hy();
        clw2.c(this);
        int n2 = fpq2.aVk();
        if (cug.vk((int)n)) {
            ldv ldv2 = this.aSB.remove(n2);
            if (ldv2 == null) {
                lfn.b(5, "SFDeployablePhysicalObjectManager", "handleLocalStorageObjectCreateResponseMessage(): OwnerGUID=null for MT " + n2);
                assert (false);
                return;
            }
            clw2.d(this);
            clw2.kT(ldv2);
            fpq2.eIh.mH();
            fpq2.eIh.aSu();
        } else if (cug.vn((int)n)) {
            brv[] brvArray = this.aSC.remove(n2);
            if (brvArray == null) {
                lfn.b(5, "SFDeployablePhysicalObjectManager", "handleLocalStorageObjectCreateResponseMessage(): Items is null for MT " + n2);
                assert (false);
                return;
            }
            bqm.b b2 = bqm.b.getInventoryTypeByResourceType(clw2.az());
            if (b2 == null) {
                lfn.b(5, "SFDeployablePhysicalObjectManager", "handleLocalStorageObjectCreateResponseMessage(): InvType is null for RT " + clw2.az());
                assert (false);
                return;
            }
            brk brk2 = new brk();
            brk2.a(b2);
            brk2.setGUID(this.MessageDelegator.bzv());
            cni cni2 = new cni();
            cni2.setGUID(this.MessageDelegator.bzv());
            cni2.setObjectType(115);
            cni2.l(cug.fnx);
            cni2.aJC().setGUID(this.MessageDelegator.bzv());
            cni2.aJC().b((bqk)brk2);
            brk2.c(brvArray);
            this.MessageDelegator.a((amf)((Object)cni2));
            clw2.b(cni2);
        }
    }

    private void a(cbx cbx2, ti ti2) {
        this.b(cbx2, ti2);
        a a2 = new a(this, cbx2);
        if (ti2.uB() > 0.0f) {
            a2.aSN = (double)ti2.uB() + this.MessageDelegator.arc().rgz;
            this.aSr.a(a2.aSN, a2);
            cbx2.fi().a(12384, a2.aSN);
        }
        if (cug.vk((int)cbx2.az())) {
            a2.aSO = this.MessageDelegator.arc().rgz;
            this.aSs.a(a2.aSO, a2);
            a2.aSP = this.MessageDelegator.arc().rgz;
            this.aSt.a(a2.aSP, a2);
        } else if (lea.enW().isDescendant(cbx2.az(), cug.fsf)) {
            // empty if block
        }
        this.aSu.put(cbx2, a2);
        if (cbx2.az() == cug.fkY || cbx2.az() == cug.flu) {
            cbx2.fi().b(10432, this.ZM.aQ().iV());
        } else {
            cbx2.fi().b(10432, this.ZM.aQ().iU());
        }
        fth fth2 = (fth)this.MessageDelegator.h(30218, this.getGUID(), this.ZM.aQ().getGUID());
        fth2.Position = cbx2.aAG().azb();
        fth2.ResourceType = ti2.uw();
        this.MessageDelegator.I(fth2);
    }

    private void b(cbx cbx2, ti ti2) {
        if (ti2.uC() <= 0) {
            return;
        }
        if (cbx2 == null) {
            assert (false);
            return;
        }
        if (cbx2.aAG() == null) {
            assert (false);
            return;
        }
        if (cbx2.aAG().azb() == null) {
            assert (false);
            return;
        }
        assert (!this.aSw.containsKey(this.aSz));
        this.aSw.put(this.aSz, cbx2);
        eaa eaa2 = (eaa)this.MessageDelegator.h(22785, this.getGUID(), this.ZM.aQ().getGUID());
        eaa2.Position = cbx2.aAG().av();
        eaa2.aFo = ti2.uD();
        eaa2.ResourceType = ti2.uC();
        eaa2.aFp = false;
        eaa2.aqs = this.aSz++;
        this.ZM.aQ().receiveMessage((dxq)eaa2);
    }

    private void a(eaf eaf2) {
        if (eaf2.ex == 3) {
            return;
        }
        if (eaf2.ex != 2) {
            lfn.b(5, "SFDeployablePhysicalObjectManager", "handleAnnotationResponseMessage() Failed in adding annotation. Responsetype: " + eaf2.ex);
            return;
        }
        cbx cbx2 = this.aSw.remove(eaf2.aVk());
        assert (eaf2.Zn != null);
        assert (eaf2.Zn.length == 1);
        assert (cbx2 != null);
        if (eaf2.Zn == null || eaf2.Zn.length != 1) {
            lfn.b(5, "SFDeployablePhysicalObjectManager", "handleAnnotationResponseMessage() Annotations fucked up");
            return;
        }
        atf atf2 = eaf2.Zn[0];
        if (cbx2 == null) {
            this.a(atf2);
            return;
        }
        if (!this.aSu.containsKey(cbx2)) {
            this.a(atf2);
            return;
        }
        this.aSv.put(cbx2, atf2);
    }

    private void a(atf atf2) {
        assert (atf2 != null);
        if (atf2 == null) {
            return;
        }
        eae eae2 = (eae)this.MessageDelegator.h(22786, this.getGUID(), this.ZM.aQ().getGUID());
        eae2.iks = atf2.ID;
        this.ZM.aQ().receiveMessage((dxq)eae2);
    }

    @Override
    public void b(cbx cbx2) {
        a a2 = this.aSu.remove(cbx2);
        if (a2 == null) {
            lfn.b(5, "SFDeployablePhysicalObjectManager", "handleDeadObject() Could not find this PO: " + cbx2);
            assert (false);
            return;
        }
        this.a(a2);
        boolean bl = true;
        if (cbx2 instanceof clv) {
            atf atf2 = this.aSv.remove(cbx2);
            if (atf2 != null) {
                this.a(atf2);
            }
            if (cug.vk((int)cbx2.az())) {
                int n;
                Object object;
                Object object2;
                clw clw2 = (clw)cbx2;
                cni cni2 = clw2.mB();
                if (cni2 != null && (object2 = (bri)cni2.aJC().asf()) != null && (object = object2.a(bqy.dHr)) != null && ((brv[])object).length > 0 && (n = cug.vo((int)cbx2.az())) != -1) {
                    this.a(n, cbx2.aAG().av(), cbx2.aAG().aw(), null, this.aSD);
                    this.aSC.put(this.aSD, (brv[])object);
                    ++this.aSD;
                    bl = false;
                }
                this.a(cbx2, bl);
                object2 = clw2.jm().ae(352);
                if (object2 != null && object2 instanceof et) {
                    object = (et)object2;
                    float f2 = ((et)object).fN();
                    if (f2 <= 0.0f) {
                        this.ZM.a(cbx2, cbx2.aIv().aof(), bl);
                    } else {
                        this.ZM.b(cbx2, bl);
                    }
                }
            }
            return;
        }
        if (lea.enW().isDescendant(cbx2.az(), cug.fkQ) || lea.enW().isDescendant(cbx2.az(), cug.fsf) || cug.vq((int)cbx2.az())) {
            atf atf3 = this.aSv.remove(cbx2);
            if (atf3 != null) {
                this.a(atf3);
            }
            this.a(a2.Qg, true);
            this.ZM.a(cbx2, cbx2.aIv().aof(), true);
            this.c(cbx2);
            return;
        }
        this.ZM.a(cbx2, cbx2.aIv().aof(), bl);
    }

    private void c(cbx cbx2) {
        if (cbx2 == null) {
            return;
        }
        if (cbx2.aAG() == null) {
            return;
        }
        int n = cug.vz((int)cbx2.az());
        if (n == -1) {
            return;
        }
        ti ti2 = lea.eol().get(n);
        if (ti2 == null) {
            return;
        }
        if (!(ti2.uO() > 0.0f)) {
            return;
        }
        fcq fcq2 = (fcq)this.MessageDelegator.h(9224, this.GUID, this.MessageDelegator.getGUID());
        fcq2.bst = bkd.dqC;
        fcq2.aZG = lcr.qAC;
        fcq2.akX = lcr.qEk;
        fcq2.aYF = lcr.qAC;
        fcq2.bsG = cug.fwH;
        fcq2.aYC = cxd.fIy;
        fcq2.Magnitude = ti2.uO();
        fcq2.eKm = -3.0;
        fcq2.aSp = ti2.uP();
        fcq2.aYH = 1;
        fcq2.aYG = bfk.dgh;
        fcq2.bsE = 0;
        fcq2.bRD = 5;
        fcq2.gpI = -3.0;
        fcq2.aZH = cbx2.aAG().av();
        fcq2.Radius = ti2.getRadius();
        fcq2.Position = cbx2.aAG().av();
        fcq2.dta = new int[]{cug.fgE, cug.fgH, cug.fwH};
        fcq2.dsZ = null;
        fcq2.gbe = bkd.dqy;
        fcq2.dtb = false;
        fcq2.dsL = null;
        this.MessageDelegator.H(fcq2);
        fcq2.a(cxd.f.fQW);
    }

    private void a(cbx cbx2, boolean bl) {
        if (cbx2 == null) {
            assert (false);
            return;
        }
        ti ti2 = lea.eom().get(cbx2.az());
        if (ti2 != null && ti2.uE() > 0 && bl) {
            cbx2.oM(ti2.uE());
        }
        if (cbx2 instanceof ccs) {
            this.cn(cbx2.getGUID());
        } else if (cbx2 instanceof ckx) {
            this.cm(cbx2.getGUID());
        } else if (cbx2 instanceof clw) {
            this.m(cbx2.getGUID(), cbx2.az());
        } else {
            lfn.b(5, "SFDeployablePhysicalObjectManager", "removeObject() Unknown objectype: " + cbx2.getClass().getSimpleName());
            assert (false);
        }
        atf atf2 = this.aSv.remove(cbx2);
        if (atf2 != null) {
            this.a(atf2);
        }
    }

    @Override
    public void a(cbx cbx2, et et2) {
        clw clw2;
        if (!this.aSu.containsKey(cbx2)) {
            lfn.b(5, "SFDeployablePhysicalObjectManager", "handleFloatAttributeChanged() Does not contain this object: " + cbx2.pa());
            return;
        }
        if (et2.getType() != 352) {
            return;
        }
        if (cbx2 instanceof clw && (clw2 = (clw)cbx2).aSB() + 0.5 < this.MessageDelegator.arc().rgz) {
            clw2.bx(this.MessageDelegator.arc().rgz);
            if (cbx2.aAG() != null && cbx2.aAG().azb() != null) {
                this.ZM.aQ().c(mcv.uCr.bD(cbx2.az(), cbx2.aAG().azb(), Float.valueOf(et2.fN())));
            }
        }
    }

    @Override
    public boolean b(cbx cbx2, et et2) {
        return true;
    }

    @Override
    public boolean a(dxq dxq2, btk btk2) {
        switch (dxq2.bEz()) {
            case 1046: {
                if (!(btk2 instanceof cbx)) {
                    lfn.b(0, "SFDeployablePhysicalObjectManager", "acceptMessage() not a physicalobject!");
                    assert (false);
                    return false;
                }
                cbx cbx2 = (cbx)btk2;
                if (!lea.enW().isDescendant(cbx2.az(), cug.fsf)) {
                    assert (false);
                    return false;
                }
                this.a((fum)dxq2, cbx2);
                return true;
            }
        }
        return false;
    }

    private void a(fum fum2, cbx cbx2) {
        if (this.aSx.containsKey(cbx2)) {
            return;
        }
        this.aSx.put(cbx2, fum2);
        this.aSy.put(this.aSA, cbx2);
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), fum2.diQ);
        eef2.sk(this.aSA);
        this.MessageDelegator.F(eef2);
        ++this.aSA;
    }

    private void a(eeg eeg2) {
        cbx cbx2 = this.aSy.remove(eeg2.aVk());
        assert (cbx2 != null);
        if (cbx2 == null) {
            return;
        }
        fum fum2 = this.aSx.remove(cbx2);
        assert (fum2 != null);
        if (fum2 == null) {
            return;
        }
        a a2 = this.aSu.remove(cbx2);
        if (a2 == null) {
            lfn.b(5, "SFDeployablePhysicalObjectManager", "handleDeadObject() Could not find this PO: " + cbx2);
            assert (false);
            return;
        }
        this.a(mbr.ulQ.bD(cg.c(eeg2.iP(), eeg2.iR()), this.ZM.aQ().iU()), a2.Qg.aAG().av());
        this.ZM.aQ().c(mbr.ulP.bD(cg.c(eeg2.iP(), eeg2.iR())));
        this.a(a2);
        this.a(cbx2, true);
        this.ZM.f(cbx2.az(), cbx2.aAG().av());
    }

    private void a(loz loz2, ljq ljq2) {
        fgh fgh2 = (fgh)this.MessageDelegator.h(29448, this.GUID, lcr.qAL);
        fgh2.r(loz2);
        fgh2.c(ljq2);
        fgh2.setRadius(200.0f);
        this.MessageDelegator.F(fgh2);
    }
}

