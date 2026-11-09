/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  bri
 *  cov
 *  cph
 *  cug
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class cou
extends btk
implements bto {
    private final cov eQc;
    private static final ljq akL = new ljq(0.0f, -1.0f, 0.0f);
    private static final float akO = 0.75f;
    private static final float eQd = 0.5f;
    private Random DZ = new Random();
    private double eQe = 0.0;
    private boolean eQf = false;
    private ljq eQg = null;
    private ctr eQh = null;
    private double eQi = 0.0;
    private lmf eQj = null;
    private ldv eQk = null;

    public cou(cov cov2, ldz ldz2) {
        this.eQc = cov2;
        this.bB(ldz2.rgz);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.eQf) {
            return;
        }
        if (ldz2.rgz >= this.eQe) {
            this.eQi = ldz2.rgz;
            if (!this.aVG()) {
                this.bB(this.eQi);
                return;
            }
            cph cph2 = this.eQc.aVT();
            if (cph2 == null) {
                this.bB(this.eQi);
                return;
            }
            cph cph3 = cph2.aXE();
            if (cph3 == null) {
                this.bB(this.eQi);
                return;
            }
            this.eQk = cph3.aXq();
            if (this.eQk == null) {
                this.bB(this.eQi);
                return;
            }
            this.eQg = this.eQc.aAG().av();
            if (!lcw.dY((ljq)this.eQg)) {
                this.bB(this.eQi);
                return;
            }
            this.eQj = lea.eg(this.eQg);
            if (this.eQj == null) {
                this.a(maa.tZF.bD(new Object[0]));
                this.bB(this.eQi);
                return;
            }
            this.eQh = cxj.yk(this.eQc.az());
            if (this.eQh == null) {
                lfn.b(5, "SFBoatFishingManager", "createHarvestedResource() No resourceharvestinginfo found for boat '" + lea.enW().getName(this.eQc.az()) + "'");
                this.bB(Double.MAX_VALUE);
                assert (false);
                return;
            }
            cni cni2 = this.eQc.aVE().mB();
            bqv bqv2 = cni2.aJC();
            if (bqv2 == null || !(bqv2 instanceof bqx)) {
                this.bB(this.eQi);
                return;
            }
            bqx bqx2 = (bqx)bqv2;
            bqk bqk2 = bqx2.asf();
            if (bqk2 == null || !(bqk2 instanceof bri)) {
                this.bB(this.eQi);
                return;
            }
            bri bri2 = (bri)bqk2;
            brh brh2 = bri2.aup();
            if (brh2 == null) {
                this.bB(this.eQi);
                return;
            }
            int n = brh2.avN();
            if (n >= cot.so(this.eQc.aVE().az())) {
                this.a(maa.tZB.bD(new Object[0]));
                this.bB(ldz2.rgz);
                return;
            }
            this.eQg.y += 0.5f;
            this.b(this.eQg, akL, 0.75f);
            this.eQf = true;
            return;
        }
    }

    private void b(ljq ljq2, ljq ljq3, float f2) {
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(ljq3);
        kji2.setLength(f2);
        kji2.hsP = true;
        this.MessageDelegator.a(kji2);
    }

    private void handleLineContainmentResponse(kuj kuj2) {
        if (!this.eQf) {
            assert (false);
            this.bB(this.eQi);
            return;
        }
        if (!this.aVG()) {
            this.bB(this.eQi);
            return;
        }
        if (kuj2.bqd == null) {
            this.bB(this.eQi);
            assert (false);
            return;
        }
        if (kuj2.bqd.length <= 0) {
            this.bB(this.eQi);
            return;
        }
        ldv ldv2 = null;
        ljq ljq2 = null;
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < kuj2.bqd.length; ++i) {
            if (kuj2.bqd[i] != cug.fqr || !(kuj2.pJh[i] < f2)) continue;
            f2 = kuj2.pJh[i];
            ljq2 = kuj2.ilP[i];
            ldv2 = kuj2.jnv[i];
        }
        if (ldv2 == null || ljq2 == null) {
            this.bB(this.eQi);
            assert (false);
            return;
        }
        this.V(ldv2, cug.fqr);
    }

    private void V(ldv ldv2, int n) {
        if (ldv2 == null) {
            this.bB(this.eQi);
            assert (false);
            return;
        }
        if (n < 0) {
            this.bB(this.eQi);
            assert (false);
            return;
        }
        gfq gfq2 = (gfq)this.MessageDelegator.h(6166, this.GUID, lcr.qEr);
        gfq2.gb = ldv2;
        gfq2.ResourceType = n;
        gfq2.hsP = true;
        gfq2.jgn = this.eQc.az();
        this.MessageDelegator.F(gfq2);
    }

    private void a(gfr gfr2) {
        if (!this.eQf) {
            this.bB(this.eQi);
            assert (false);
            return;
        }
        if (!this.aVG()) {
            this.bB(this.eQi);
            return;
        }
        if (gfr2.jgo) {
            gfi gfi2 = (gfi)this.MessageDelegator.h(6160, this.GUID, lcr.qBb);
            gfi2.jgh = this.eQc.pa() + "_" + this.eQj.name();
            gfi2.jgi = this.MessageDelegator.bzy().getTimeInMillis();
            gfi2.hsP = true;
            this.MessageDelegator.F(gfi2);
            return;
        }
        this.bB(this.eQi);
        this.a(this.eQc.az() == cug.foJ ? maa.tZC.bD(new Object[0]) : maa.tZD.bD(new Object[0]));
    }

    /*
     * WARNING - void declaration
     */
    private void a(gfj gfj2) {
        if (!this.eQf) {
            this.bB(this.eQi);
            assert (false);
            return;
        }
        if (!this.aVG()) {
            this.bB(this.eQi);
            return;
        }
        loz loz2 = null;
        switch (this.eQj) {
            case rEy: 
            case rEu: 
            case rEz: {
                loz2 = maa.tZv.bD(new Object[0]);
                break;
            }
            case rEw: 
            case rEv: {
                loz2 = maa.tZw.bD(new Object[0]);
                break;
            }
            case rEx: {
                loz2 = maa.tZx.bD(new Object[0]);
                break;
            }
            case rEt: {
                loz2 = maa.tZv.bD(new Object[0]);
                lfn.b(5, "SFBoatFishingManager", "handleCreateGlobalLootResponseMessage() Unpainted sea area!!!!");
                assert (false);
                break;
            }
        }
        List<List<cto>> list = this.eQh.fgh.get((Object)this.eQj);
        float f2 = 1.0f;
        dmq dmq2 = lea.ci(this.eQg);
        if (dmq2 != null) {
            void var6_8;
            Object object = null;
            if (this.eQc != null && this.eQc.aVT() != null && this.eQc.aVT().aXE() != null) {
                ldv ldv2 = this.eQc.aVT().aXE().aXr();
            }
            f2 = dmi.a(dmq2, dmq2.nr((ldv)var6_8), dmh.gHY);
        }
        for (List list2 : list) {
            ArrayList<cte> arrayList = lcn.emv();
            ctf.a((List<cto>)list2, arrayList, f2, 1.0f);
            if (arrayList.isEmpty()) continue;
            cte[] cteArray = arrayList.toArray(new cte[arrayList.size()]);
            fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.GUID, this.MessageDelegator.getGUID());
            fcy2.dul = 0;
            fcy2.bst = bkd.dqO;
            fcy2.aZG = this.eQc.aVE().mB().getGUID();
            fcy2.akX = this.eQc.aVE().mB().getGUID();
            fcy2.dtP = cteArray;
            fcy2.iyH = false;
            fcy2.iJG = true;
            fcy2.b(bqy.dGa);
            this.MessageDelegator.F(fcy2);
            int n = this.eQc.aVE() != null ? this.eQc.aVE().az() : cug.flb;
            for (cte cte2 : arrayList) {
                if (this.eQc.az() == cug.foJ) {
                    this.a(maa.tZy.bD(cte2.ResourceType, cte2.asi, n));
                    continue;
                }
                this.a(maa.tZz.bD(cte2.ResourceType, cte2.asi, n));
            }
            ldv ldv3 = lcr.tQ((ldv)this.eQk);
            if (cteArray == null || this.eQc.az() != cug.foJ) continue;
            fst fst2 = (fst)this.MessageDelegator.h(30211, this.getGUID(), ldv3);
            fst2.Position = this.eQg;
            fst2.iVB = true;
            fst2.eAc = cug.foJ;
            fst2.iVC = cteArray;
            this.MessageDelegator.I(fst2);
        }
        this.bB(this.eQi);
    }

    public void a(loz loz2) {
        cph cph2 = this.eQc.aVT();
        if (cph2 == null) {
            return;
        }
        cph cph3 = cph2.aXE();
        if (cph3 == null) {
            return;
        }
        ldv ldv2 = cph3.aXq();
        if (ldv2 == null) {
            return;
        }
        ldv ldv3 = lcr.tQ((ldv)ldv2);
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv3);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private boolean aVG() {
        if (!this.eQc.aXu()) {
            return false;
        }
        if (this.eQc.aAG() == null) {
            return false;
        }
        clx clx2 = this.eQc.aVE();
        if (clx2 == null) {
            return false;
        }
        cni cni2 = clx2.mB();
        return cni2 != null;
    }

    private void bB(double d2) {
        this.eQe = d2 + 8.0;
        this.eQg = null;
        this.eQf = false;
        this.eQh = null;
        this.eQi = 0.0;
        this.eQj = null;
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
        int n = dxq2.bEz();
        switch (n) {
            case 11034: {
                gre gre2 = (gre)dxq2;
                lfn.b(5, "SFBoatFishingManager", "receiveMessage()  System couldn't deliver message type :" + gre2.jqc + " to " + gre2.jqf);
                assert (false);
                this.bB(this.eQi);
                break;
            }
            case 6161: {
                this.a((gfj)dxq2);
                break;
            }
            case 6167: {
                this.a((gfr)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

