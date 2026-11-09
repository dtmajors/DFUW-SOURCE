/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  lcr
 */
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class dlj
extends dlo
implements bgc {
    private ccd gFT = null;
    private Map<Integer, eat> gFU = lcn.emw();
    private int Qs = 0;
    private Map<Integer, eax> gFV = lcn.emw();
    private int gFW = 0;
    private List<eax> gFX = lcn.emv();

    public Set<ldv> aIM() {
        return this.gFT == null ? new HashSet() : this.gFT.aIM();
    }

    @Override
    public void bpv() {
        if (this.gFT == null || !(this.gFT instanceof ccj)) {
            return;
        }
        ccj ccj2 = (ccj)this.gFT;
        ccj2.cA(this.csC.Xy());
        ccj2.cz(this.csC.Xt());
        ccj2.al(this.csC.Xv());
        ccj2.X(this.csC.Xu());
        ccj2.ci(this.csC.getGUID());
        ccj2.ks(this.csC.Xw());
        ccj2.a(this.csC.Xz());
    }

    public ldv acn() {
        if (this.gFT == null) {
            return null;
        }
        return this.gFT.getGUID();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.bpw();
    }

    private void bpw() {
        if (this.gFX.isEmpty()) {
            return;
        }
        if (this.gFT == null) {
            return;
        }
        for (eax eax2 : this.gFX) {
            this.a(eax2);
        }
        this.gFX.clear();
    }

    public void cr(boolean bl) {
        if (this.gFT == null) {
            return;
        }
        this.c(this.gFT, !bl);
        ((ccj)this.gFT).fi().f(12416, bl);
        if (bl) {
            this.aqx();
        }
    }

    public void aqw() {
        if (this.gFT == null) {
            return;
        }
        this.aqx();
        ((ez)this.gFT.jm().ah(352)).ga();
    }

    @Override
    public boolean a(dxq dxq2, btk btk2) {
        if (dxq2.bED() == 18688) {
            this.csC.receiveMessage(dxq2);
            return true;
        }
        switch (dxq2.bEz()) {
            case 17415: {
                this.a((eav)dxq2);
                return true;
            }
            case 17409: {
                this.b((eat)dxq2);
                return true;
            }
            case 17417: {
                this.a((eas)dxq2);
                return true;
            }
            case 17424: {
                this.a((eax)dxq2);
                return true;
            }
        }
        return false;
    }

    @Override
    public void bpx() {
        super.bpx();
    }

    @Override
    protected void bN(int n, int n2) {
        eaz eaz2 = (eaz)this.MessageDelegator.h(17411, this.getGUID(), lcr.qBo);
        eaz2.l(this.csA.Yo());
        eaz2.sk(n2);
        eaz2.jS(true);
        eaz2.c(this.csA.av());
        eaz2.a(this.csA.aw());
        eaz2.oD(this.getGUID());
        eaz2.bL(this.csC.Xt());
        this.MessageDelegator.F(eaz2);
    }

    @Override
    protected void y(cbx cbx2) {
        assert (cbx2 instanceof ccd);
        ccd ccd2 = (ccd)cbx2;
        ebx ebx2 = (ebx)this.MessageDelegator.h(17414, this.getGUID(), lcr.qBo);
        ebx2.eM(ccd2.getGUID());
        ebx2.jU(true);
        this.MessageDelegator.F(ebx2);
        this.MessageDelegator.hd(ccd2.getGUID());
    }

    @Override
    public void XZ() {
        if (this.gFT == null) {
            return;
        }
        this.gFT.b(this);
        this.gFT = null;
        super.XZ();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 17412: {
                this.a((eba)dxq2);
                break;
            }
            case 13839: {
                this.a((ekc)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eba eba2) {
        if (eba2.aVk() < 2) {
            assert (false);
            return;
        }
        this.gGt = true;
        if (eba2.bFl() == null) {
            return;
        }
        if (eba2.aVk() == 3) {
            assert (false);
            return;
        }
        if (eba2.aVk() == 2) {
            this.y(this.gFT);
            if (this.gFT != null) {
                this.gFT.b(this);
            }
            this.gFT = null;
            this.Qg = null;
        }
        this.gFT = eba2.bFl();
        this.Qg = this.gFT;
        this.gFT.a(this);
        this.gFT.a(this);
        this.gFT.a(this);
        this.bpv();
        if (eba2.aVk() == 5) {
            this.bpH();
        } else {
            this.aSv();
        }
        this.gFT.Hy();
        this.c(this.Qg, true);
    }

    private void a(eav eav2) {
        eaw eaw2 = (eaw)this.MessageDelegator.h(17416, this.getGUID(), eav2.aO());
        this.MessageDelegator.b(eav2, eaw2);
        assert (this.csC != null);
        eaw2.ci(this.csC.getGUID());
        eaw2.ch(this.csC.Xw());
        eaw2.jR(true);
        eaw2.cz(this.csC.Xt());
        eaw2.iq(this.csC.Xx());
        eaw2.a(this.csC.Xz());
        if (this.gFT != null && this.gFT.aAG() != null) {
            eaw2.al(this.gFT.aAG().azb());
        } else {
            eaw2.al(new ljq());
        }
        eaw2.X(this.csC.Xu());
        lfs lfs2 = this.csC.Zk();
        eaw2.Dv((Integer)lfs2.reX);
        eaw2.Dw((Integer)lfs2.reY);
        this.MessageDelegator.F(eaw2);
    }

    private void a(eas eas2) {
        assert (this.gFT != null);
        if (this.gFT == null) {
            return;
        }
        if (!this.gFT.kq(eas2.Ri)) {
            return;
        }
        this.jK(eas2.Ri);
    }

    public ccf c(ldv ldv2, ccf ccf2) {
        if (this.gFT == null) {
            return ccf.elE;
        }
        if (!this.gFT.kq(ldv2)) {
            return ccf.ely;
        }
        ccf ccf3 = this.gFT.b(ldv2, ccf2);
        this.csC.Zf();
        this.K(ldv2, false);
        return ccf3;
    }

    public ccf d(ldv ldv2, ccf ccf2) {
        if (this.gFT == null) {
            return ccf.eln;
        }
        if (!(this.gFT instanceof ccj)) {
            return ccf.els;
        }
        ccj ccj2 = (ccj)this.gFT;
        List<ldv> list = ccj2.kt(ldv2);
        if (list == null || list.isEmpty()) {
            return ccf.elB;
        }
        for (ldv ldv3 : list) {
            ccf ccf3 = ccj2.b(ldv3, ccf2);
            if (ccf3 != ccf.elu) continue;
            this.K(ldv3, false);
        }
        this.csC.Zf();
        return ccf.elC;
    }

    public void a(ldv ldv2, Set<ldv> set) {
        ccf ccf2;
        if (this.gFT == null) {
            return;
        }
        ccj ccj2 = (ccj)this.gFT;
        if (ccj2.aIN().containsKey(ldv2) && !set.contains(ccj2.aIN().get(ldv2)) && (ccf2 = ccj2.b(ldv2, ccf.elw)) == ccf.elu) {
            this.K(ldv2, false);
        }
        this.csC.Zf();
    }

    private void a(eax eax2) {
        if (this.gFT == null) {
            this.gFX.add(eax2);
            return;
        }
        if (this.gFT instanceof ccj) {
            if (this.csC.Xw() == null) {
                lfn.b(5, "SFBindStoneStructure", "handleBindStoneClanStoneBindRestoreRequestMessage() No City. Debying: " + eax2.ikI);
                this.gFT.a(eax2, ccf.els, this.csC.getGUID());
                return;
            }
            if (this.csC.Xw().equals(eax2.cCH)) {
                this.M(eax2.ikI, eax2.cCH);
                this.gFT.a(eax2, ccf.elo, this.csC.getGUID());
                return;
            }
            this.gFV.put(this.gFW, eax2);
            ekb ekb2 = (ekb)this.MessageDelegator.h(13838, this.getGUID(), this.csC.Xw());
            ekb2.aqs = this.gFW++;
            ekb2.ikJ = eax2.ikJ;
            ekb2.cCH = eax2.cCH;
            ekb2.ikI = eax2.ikI;
            this.MessageDelegator.F(ekb2);
            return;
        }
        this.gFT.M(eax2.ikI, eax2.cCH);
        this.gFT.a(eax2, ccf.elo, this.csC.getGUID());
    }

    private void b(eat eat2) {
        if (this.gFT == null) {
            assert (false);
            eau eau2 = (eau)this.MessageDelegator.h(17410, this.getGUID(), eat2.aO());
            this.MessageDelegator.b(eat2, eau2);
            eau2.ikL = ccf.elt.ordinal();
            eau2.bYY = null;
            eau2.ela = false;
            eau2.azF = "";
            eau2.azE = -1;
            this.MessageDelegator.F(eau2);
            return;
        }
        ccf ccf2 = ccf.eln;
        if (this.csC.Xw() == null) {
            this.gFT.a(eat2, ccf.elt, this.csC.getGUID());
            return;
        }
        ccf2 = this.gFT.a(eat2);
        if (ccf2 != ccf.elo) {
            this.gFT.a(eat2, ccf2, this.csC.getGUID());
            return;
        }
        if (this.gFT instanceof ccj) {
            if (this.csC.Xw().equals(eat2.cCH)) {
                this.M(eat2.ikI, eat2.cCH);
                this.gFT.a(eat2, ccf2, this.csC.getGUID());
                return;
            }
            this.gFU.put(this.Qs, eat2);
            ekb ekb2 = (ekb)this.MessageDelegator.h(13838, this.getGUID(), this.csC.Xw());
            ekb2.aqs = this.Qs++;
            ekb2.ikJ = eat2.ikJ;
            ekb2.cCH = eat2.cCH;
            ekb2.ikI = eat2.ikI;
            this.MessageDelegator.F(ekb2);
            return;
        }
        this.gFT.a(eat2, ccf2, this.csC.getGUID());
    }

    private void a(ekc ekc2) {
        eat eat2 = this.gFU.remove(ekc2.aVk());
        if (eat2 != null) {
            if (this.gFT == null) {
                assert (false);
                eau eau2 = (eau)this.MessageDelegator.h(17410, this.getGUID(), eat2.aO());
                this.MessageDelegator.b(eat2, eau2);
                eau2.ikL = ccf.elt.ordinal();
                eau2.bYY = null;
                eau2.ela = false;
                eau2.azF = "";
                eau2.azE = -1;
                this.MessageDelegator.F(eau2);
                return;
            }
            ccf ccf2 = ccf.eln;
            if (!ekc2.aO().equals(this.csC.Xw())) {
                this.gFT.a(eat2, ccf.elr, this.csC.getGUID());
                return;
            }
            ccf2 = this.gFT.a(eat2);
            if (ccf2 != ccf.elo) {
                this.gFT.a(eat2, ccf2, this.csC.getGUID());
                return;
            }
            ccf ccf3 = ccf.getValueByOrdinal(ekc2.ikL);
            if (ccf3 != ccf.elo) {
                this.gFT.a(eat2, ccf3, this.csC.getGUID());
                return;
            }
            this.M(eat2.ikI, eat2.cCH);
            this.gFT.a(eat2, ccf3, this.csC.getGUID());
            return;
        }
        eax eax2 = this.gFV.remove(ekc2.aVk());
        if (eax2 != null) {
            if (this.gFT == null) {
                assert (false);
                eau eau3 = (eau)this.MessageDelegator.h(17410, this.getGUID(), eax2.aO());
                this.MessageDelegator.b(eax2, eau3);
                eau3.ikL = ccf.elt.ordinal();
                eau3.bYY = null;
                eau3.ela = false;
                eau3.azF = "";
                eau3.azE = -1;
                this.MessageDelegator.F(eau3);
                return;
            }
            if (!ekc2.aO().equals(this.csC.Xw())) {
                this.gFT.a(eax2, ccf.elr, this.csC.getGUID());
                return;
            }
            ccf ccf4 = ccf.getValueByOrdinal(ekc2.ikL);
            if (ccf4 != ccf.elo) {
                this.gFT.a(eax2, ccf4, this.csC.getGUID());
                return;
            }
            this.M(eax2.ikI, eax2.cCH);
            this.gFT.a(eax2, ccf4, this.csC.getGUID());
            return;
        }
    }

    private void M(ldv ldv2, ldv ldv3) {
        if (this.gFT == null) {
            return;
        }
        this.gFT.M(ldv2, ldv3);
        this.csC.Zf();
        this.K(ldv2, true);
    }

    private void jK(ldv ldv2) {
        if (this.gFT == null) {
            return;
        }
        this.gFT.kr(ldv2);
        this.csC.Zf();
        this.K(ldv2, false);
    }

    private void K(ldv ldv2, boolean bl) {
        if (this.csC.Xw() != null) {
            eil eil2 = (eil)this.MessageDelegator.h(18700, this.getGUID(), this.csC.Xw());
            eil2.iro = bl;
            eil2.aDk = this.csC.getGUID();
            eil2.diQ = ldv2;
            this.MessageDelegator.F(eil2);
        }
    }

    @Override
    public void b(cbx cbx2) {
        assert (cbx2 instanceof ccd);
        assert (cbx2 == this.gFT);
        this.csC.YW();
    }

    @Override
    public boolean b(cbx cbx2, et et2) {
        return true;
    }

    public void Ax(int n) {
        if (this.gFT == null) {
            return;
        }
        int n2 = this.gFT.aIE() + n;
        if (n2 < 0) {
            assert (false);
            n2 = 0;
        }
        this.gFT.oO(n2);
    }

    public void Zd() {
        if (this.gFT == null) {
            return;
        }
        this.gFT.a(ccf.elr);
    }

    public int bpy() {
        if (this.gFT == null) {
            return 0;
        }
        return this.gFT.aID();
    }

    public int aIE() {
        if (this.gFT == null) {
            return 0;
        }
        return this.gFT.aIE();
    }

    @Override
    public amm aIB() {
        if (this.gFT == null) {
            return null;
        }
        return this.gFT.aIB();
    }

    @Override
    public void a(cbx cbx2, et et2) {
        super.a(cbx2, et2);
    }

    @Override
    protected void c(cbx cbx2, boolean bl) {
        if (cbx2 == null) {
            return;
        }
        ez ez2 = (ez)cbx2.fi().ae(352);
        assert (ez2 != null);
        if (bl) {
            ez2.a(ep.a.Pe);
        } else {
            ez2.a(ep.a.Pg);
        }
        if (this.csA.Yl()) {
            cbx2.fi().f(12432, ez2.gk() == ep.a.Pf);
        }
    }

    @Override
    public void b(float f, ldv ldv2, boolean bl) {
        if (this.csC != null) {
            this.csC.a(f, ldv2, bl);
        }
    }
}

