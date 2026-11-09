/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ha
 *  lcr
 */
import java.util.List;
import java.util.Map;

public class to
extends btk
implements btn,
bto {
    private coh aUb;
    private coh aUc;
    private List<coh> aUd = lcn.emv();
    private Map<ldv, lei> aUe = lcn.emw();
    private List<String> aUf = lcn.emv();
    private boolean aUg = false;
    private boolean aUh = false;
    private boolean aUi = false;
    private int aUj = 0;
    private ljq aUk;
    private lgl aUl;
    private static final ljq akL = new ljq(0.0, -1.0, 0.0);
    private static final float akM = 0.5f;
    private static final float aTw = 1.0f;
    private static final float akO = 0.75f;
    private static final float aUm = 10.0f;
    private double aUn;
    private double aUo;
    private double aUp;
    private double aUq;
    private double aUr;
    private static final double aUs = 7200.0;
    private static final int aUt = 98;
    private static final double aUu = 180.0;
    private static final double aUv = 5.0;
    private static final float aSq = 200.0f;
    private final ha hF;

    public to(ha ha2) {
        this.hF = ha2;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.aUb == null) {
            return;
        }
        if (this.aUg) {
            return;
        }
        if (this.aUi) {
            double d2 = 5.0 - (ldz2.rgz - this.aUr);
            if (d2 > 0.0) {
                return;
            }
            this.aUi = false;
            this.a(mcz.uEb.bD(this.hF.iU()), this.aUb.aAG().av());
            this.hF.c(mcz.uEa.bD(new Object[0]));
            this.aUh = true;
            return;
        }
        if (!this.aUf.isEmpty()) {
            double d3 = 180.0 - (ldz2.rgz - this.aUq);
            if (d3 > 0.0) {
                return;
            }
            this.a(mcz.uEd.bD(this.hF.iU()), this.aUb.aAG().av());
            this.hF.c(mcz.uEc.bD(new Object[0]));
            int n = 1;
            for (String string : this.aUf) {
                this.a(mcz.uEe.bD(string, n), this.aUb.aAG().av());
                this.hF.c(mcz.uEe.bD(string, n));
                ++n;
            }
            this.aUh = false;
            this.aUf.clear();
            this.aUe.clear();
            return;
        }
        double d4 = 7200.0 - (ldz2.rgz - this.aUn);
        if (d4 < 0.0) {
            this.a(mcz.uDP.bD(this.hF.iU()), this.aUb.aAG().av());
            this.hF.c(mcz.uDO.bD(new Object[0]));
            this.vb();
            this.aUh = false;
            this.aUe.clear();
            this.aUf.clear();
            return;
        }
    }

    private void a(loz loz2, ljq ljq2) {
        fgh fgh2 = (fgh)this.MessageDelegator.h(29448, this.GUID, lcr.qAL);
        fgh2.r(loz2);
        fgh2.c(ljq2);
        fgh2.setRadius(200.0f);
        this.MessageDelegator.F(fgh2);
    }

    @Override
    public boolean a(dxq dxq2, btk btk2) {
        switch (dxq2.bEz()) {
            case 27141: {
                this.a((gwj)dxq2, btk2);
                return true;
            }
            case 27142: {
                this.a((gwc)dxq2, btk2);
                return true;
            }
        }
        return false;
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4866: {
                this.handleLineContainmentResponse((kuj)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 26370: {
                this.a((eyy)dxq2);
                break;
            }
            case 27138: {
                this.a((gwf)dxq2);
                break;
            }
            case 27140: {
                this.a((gwd)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gwj gwj2, btk btk2) {
        assert (gwj2.jsH != null);
        assert (gwj2.YU != null);
        assert (gwj2.YV != null);
        if (!this.aUh) {
            return;
        }
        if (this.aUb == null) {
            assert (false);
            return;
        }
        assert (btk2 != null);
        if (!(btk2 instanceof coh)) {
            assert (false);
            return;
        }
        coh coh2 = (coh)((Object)btk2);
        int n = this.a(coh2);
        if (n < 0) {
            assert (false);
            return;
        }
        lei lei2 = this.aUe.get(gwj2.jsH);
        if (lei2 == null) {
            if (n != 0) {
                return;
            }
            this.aUe.put(gwj2.jsH, new lei(0));
            coh2.oM(del.gjJ);
            this.a(mcz.uDR.bD(cg.c(gwj2.YU, gwj2.YV), this.hF.iU()), coh2.aAG().av());
            this.hF.c(mcz.uDQ.bD(cg.c(gwj2.YU, gwj2.YV)));
            return;
        }
        if (lei2 != null && lei2.intValue() != n - 1) {
            return;
        }
        lei2.setValue(n);
        if (coh2 != this.aUc) {
            coh2.oM(del.gjJ);
            this.a(mcz.uDT.bD(cg.c(gwj2.YU, gwj2.YV), n + 1, this.hF.iU()), coh2.aAG().av());
            this.hF.c(mcz.uDS.bD(cg.c(gwj2.YU, gwj2.YV), n + 1));
            return;
        }
        assert (coh2 == this.aUc);
        if (this.aUf.isEmpty()) {
            coh2.oM(del.gjL);
            this.a(mcz.uDX.bD(cg.c(gwj2.YU, gwj2.YV), this.hF.iU()), coh2.aAG().av());
            this.hF.c(mcz.uDW.bD(cg.c(gwj2.YU, gwj2.YV)));
            this.aUq = this.MessageDelegator.arc().rgz;
        } else {
            coh2.oM(del.gjJ);
            this.a(mcz.uDV.bD(cg.c(gwj2.YU, gwj2.YV), this.hF.iU()), coh2.aAG().av());
            this.hF.c(mcz.uDU.bD(cg.c(gwj2.YU, gwj2.YV)));
        }
        this.aUf.add(cg.c(gwj2.YU, gwj2.YV));
    }

    private void a(gwc gwc2, btk btk2) {
        assert (gwc2.diQ != null);
        if (!this.hF.getGUID().equals(gwc2.diQ)) {
            fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, gwc2.diQ);
            fgs2.r(mcz.uEf.bD(new Object[0]));
            this.MessageDelegator.F(fgs2);
            return;
        }
        if (this.aUg || this.aUi || this.aUh || this.aUc == null) {
            this.hF.c(mcz.uEg.bD(new Object[0]));
            return;
        }
        this.aUi = true;
        this.aUr = this.MessageDelegator.arc().rgz;
        this.aUb.oM(del.gjK);
        this.a(mcz.uDZ.bD(this.hF.iU(), 5.0), this.aUb.aAG().av());
        this.hF.c(mcz.uDY.bD(5.0));
    }

    private int va() {
        int n = 0;
        if (this.aUb != null) {
            ++n;
        }
        if (this.aUc != null) {
            ++n;
        }
        return n + this.aUd.size();
    }

    private int a(coh coh2) {
        int n = 0;
        if (coh2 == this.aUb) {
            return n;
        }
        n = 1;
        for (coh coh3 : this.aUd) {
            if (coh3 == coh2) {
                return n;
            }
            ++n;
        }
        if (coh2 == this.aUc) {
            return n;
        }
        return -1;
    }

    public void dl(int n) {
        if (!lea.enW().isDescendant(n, cug.frU)) {
            assert (false);
            return;
        }
        if (!this.hF.iY()) {
            return;
        }
        if (this.hF.jf() == null) {
            return;
        }
        if (this.hF.jf().aAG() == null) {
            return;
        }
        if (this.hF.jf().aAG().azb() == null) {
            return;
        }
        if (this.hF.jf().aLU() == null) {
            return;
        }
        if (this.hF.jf().aLU().aEP() == null) {
            return;
        }
        if (this.hF.jf().aLU().aEP().vO() != 6) {
            return;
        }
        if (this.hF.jf().aLU().aEP().vN() != 1) {
            return;
        }
        if (this.hF.jf().aLU().aEP().vP() != 1) {
            return;
        }
        if (this.hF.jf().aLU().aEP().vK() != 3) {
            return;
        }
        if (this.aUg) {
            return;
        }
        if (this.hF.jf().aAG().azb().y < -1000.0f) {
            this.hF.c(mcz.uDE.bD(new Object[0]));
            return;
        }
        if (lea.enW().isDescendant(n, cug.frW)) {
            if (this.aUb != null) {
                this.hF.c(mcz.uDD.bD(new Object[0]));
                return;
            }
            this.dm(n);
        } else if (lea.enW().isDescendant(n, cug.frY)) {
            if (this.aUb == null) {
                this.hF.c(mcz.uDF.bD(new Object[0]));
                return;
            }
            if (this.aUc != null) {
                this.hF.c(mcz.uDG.bD(new Object[0]));
                return;
            }
            if (this.aUd.size() >= 98) {
                this.hF.c(mcz.uDK.bD(new Object[0]));
                return;
            }
            this.dm(n);
        } else if (lea.enW().isDescendant(n, cug.frX)) {
            if (this.aUb == null) {
                this.hF.c(mcz.uDH.bD(new Object[0]));
                return;
            }
            if (this.aUc != null) {
                this.hF.c(mcz.uDI.bD(new Object[0]));
                return;
            }
            if (this.aUd.isEmpty()) {
                this.hF.c(mcz.uDJ.bD(new Object[0]));
                return;
            }
            this.dm(n);
        } else {
            assert (false);
            return;
        }
    }

    private boolean ah(ljq ljq2) {
        if (this.aUb != null) {
            if (this.aUb.aAG() == null || this.aUb.aAG().azb() == null) {
                return false;
            }
            ljq ljq3 = this.aUb.aAG().av();
            ljq3.et(ljq2);
            if (ljq3.eqN() < 10.0f) {
                return false;
            }
        }
        for (coh coh2 : this.aUd) {
            if (coh2.aAG() == null || coh2.aAG().azb() == null) {
                return false;
            }
            ljq ljq4 = coh2.aAG().av();
            ljq4.et(ljq2);
            if (!(ljq4.eqN() < 10.0f)) continue;
            return false;
        }
        return true;
    }

    private void dm(int n) {
        this.aUj = n;
        if (this.vd() <= 0) {
            assert (false);
            return;
        }
        this.aUg = true;
        ljq ljq2 = this.hF.jf().aAG().av();
        this.aUl = this.hF.jf().aAG().aw();
        ljq2.y += 0.5f;
        this.ae(ljq2);
    }

    private void vb() {
        if (this.aUb != null) {
            eyz eyz2 = (eyz)this.MessageDelegator.h(26371, this.getGUID(), lcr.qEt);
            eyz2.iFP = this.aUb.aAG().av();
            eyz2.aRX = this.dn(this.aUb.az());
            this.MessageDelegator.F(eyz2);
            this.b(this.aUb);
            this.aUb = null;
        }
        for (coh coh2 : this.aUd) {
            this.b(coh2);
        }
        this.aUd.clear();
        if (this.aUc != null) {
            this.b(this.aUc);
            this.aUc = null;
        }
    }

    private void b(coh coh2) {
        assert (coh2 != null);
        gwi gwi2 = (gwi)this.MessageDelegator.h(27139, this.getGUID(), lcr.qBN);
        gwi2.iFu = false;
        gwi2.Rs = coh2.getGUID();
        this.MessageDelegator.F(gwi2);
    }

    private void ae(ljq ljq2) {
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(akL);
        kji2.setLength(0.75f);
        this.MessageDelegator.a(kji2);
    }

    private void handleLineContainmentResponse(kuj kuj2) {
        if (kuj2.bqd == null) {
            this.aUg = false;
            this.hF.c(mcz.uDL.bD(new Object[0]));
            return;
        }
        if (kuj2.bqd.length <= 0) {
            this.aUg = false;
            this.hF.c(mcz.uDL.bD(new Object[0]));
            return;
        }
        int n = -1;
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < kuj2.bqd.length; ++i) {
            if (kuj2.bqd[i] != cug.fkr || !(kuj2.pJh[i] < f2)) continue;
            f2 = kuj2.pJh[i];
            n = i;
        }
        if (n < 0) {
            this.aUg = false;
            this.hF.c(mcz.uDL.bD(new Object[0]));
            return;
        }
        this.aUk = kuj2.ilP[n];
        if (!this.ah(this.aUk)) {
            this.aUg = false;
            this.hF.c(mcz.uDM.bD(new Object[0]));
            return;
        }
        if (lea.enW().isDescendant(this.aUj, cug.frW)) {
            eyx eyx2 = (eyx)this.MessageDelegator.h(26369, this.getGUID(), lcr.qEt);
            eyx2.iFP = this.aUk;
            eyx2.aRX = this.aUj;
            this.MessageDelegator.F(eyx2);
            return;
        }
        this.vc();
    }

    private void a(eyy eyy2) {
        assert (eyy2.ew != 0);
        assert (this.aUg);
        assert (this.aUj > 0);
        if (eyy2.ew != 3) {
            this.hF.c(mcz.uDN.bD(new Object[0]));
            this.aUg = false;
            return;
        }
        assert (eyy2.ew == 3);
        this.vc();
    }

    private void vc() {
        if (!this.hF.jf().aJC().asf().aup().a(this.aUj, 1, bqy.dHw)) {
            this.aUg = false;
            return;
        }
        gwe gwe2 = (gwe)this.MessageDelegator.h(27137, this.getGUID(), lcr.qBN);
        gwe2.Position = this.aUk;
        gwe2.Rotation = this.aUl;
        gwe2.ResourceType = this.vd();
        gwe2.jS(true);
        gwe2.oF(null);
        this.MessageDelegator.F(gwe2);
    }

    private int vd() {
        String string = lea.enW().getName(this.aUj);
        if (string == null) {
            assert (false);
            return -1;
        }
        return lea.enW().getType(string.replace(" Item", ""));
    }

    private int dn(int n) {
        String string = lea.enW().getName(n);
        if (string == null) {
            assert (false);
            return -1;
        }
        return lea.enW().getType(string + " Item");
    }

    private void a(gwd gwd2) {
        gwj gwj2 = (gwj)this.MessageDelegator.h(27141, this.getGUID(), gwd2.jsF);
        gwj2.jsH = this.hF.getGUID();
        gwj2.YU = this.hF.iP();
        gwj2.YV = this.hF.iR();
        this.MessageDelegator.F(gwj2);
    }

    private void a(gwf gwf2) {
        if (gwf2.jsG == null) {
            assert (false);
            return;
        }
        if (lea.enW().isDescendant(this.aUj, cug.frW)) {
            this.aUb = gwf2.jsG;
            this.aUn = this.MessageDelegator.arc().rgz;
            this.aUp = this.MessageDelegator.arc().rgz;
        } else if (lea.enW().isDescendant(this.aUj, cug.frY)) {
            this.aUd.add(gwf2.jsG);
            this.aUp = this.MessageDelegator.arc().rgz;
        } else if (lea.enW().isDescendant(this.aUj, cug.frX)) {
            this.aUc = gwf2.jsG;
            this.aUo = this.MessageDelegator.arc().rgz;
            this.aUp = this.MessageDelegator.arc().rgz;
            this.hF.c(mcz.uEh.bD(new Object[0]));
        } else assert (false);
        this.c(gwf2.jsG);
    }

    private void c(coh coh2) {
        this.aUg = false;
        coh2.c(this);
        coh2.aSx();
        coh2.fi().b(10432, this.hF.iU());
        coh2.fi().i(12560, this.a(coh2));
        coh2.fi().a(12384, this.aUn + 7200.0);
    }
}

