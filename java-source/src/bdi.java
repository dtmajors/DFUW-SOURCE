/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  bri
 *  cug
 *  lcr
 */
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bdi
extends btk {
    private ayd cCy = null;
    private cnf[] dae = null;
    private List<nb> daf = null;
    private List<ok> Zo = null;
    private int dag = 100000;
    private Map<Integer, fmz> dah = null;
    private Map<Integer, lfs<Boolean, Set<fmz>>> dai = null;
    private bde cYu = null;

    public ldv alT() {
        return this.a(bdj.dak);
    }

    public ldv a(bdj bdj2) {
        return this.dae == null || bdj2 == null || bdj2.ordinal() >= this.dae.length ? null : (this.dae[bdj2.ordinal()] == null ? null : this.dae[bdj2.ordinal()].getGUID());
    }

    public ldv alU() {
        return this.b(bdj.dak);
    }

    public ldv b(bdj bdj2) {
        return this.dae == null || bdj2 == null || bdj2.ordinal() >= this.dae.length ? null : (this.dae[bdj2.ordinal()] == null ? null : this.dae[bdj2.ordinal()].aJC().asf().getGUID());
    }

    public int alV() {
        return this.c(bdj.dak);
    }

    public int c(bdj bdj2) {
        return bdj2 == null ? -1 : bdj2.az();
    }

    public bdi(ayd ayd2) {
        this.cCy = ayd2;
        this.dae = new cnf[bdj.values().length];
        this.dah = lcn.emw();
        this.dai = lcn.emw();
    }

    @Override
    public void initialize() {
        super.initialize();
        this.d(bdj.dak);
        this.d(bdj.dal);
        this.d(bdj.dam);
        this.cYu = new bde(this.cCy);
        this.cYu.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.cYu);
    }

    @Override
    public void cleanUp() {
        if (this.cYu != null) {
            this.MessageDelegator.hd(this.cYu.getGUID());
            this.cYu = null;
        }
        super.cleanUp();
    }

    public void doTick(ldz ldz2) {
        if (this.cYu != null) {
            this.cYu.doTick(ldz2);
        }
    }

    public void g(nm nm2) {
        if (this.dae != null) {
            nm2.aCN = lcn.emA();
            for (int i = 0; i < this.dae.length; ++i) {
                gy.a((btk)this.cCy, this.dae[i].aJC().asf(), nm2.aCN);
            }
        }
    }

    public void a(nm nm2) {
        this.Zo = nm2.Zo;
        if (nm2.aCN != null) {
            int n;
            boolean bl;
            boolean bl2 = bl = this.dae != null;
            if (this.dae != null) {
                for (n = 0; n < this.dae.length; ++n) {
                    bl &= this.dae[n] != null;
                }
            }
            if (bl) {
                for (n = 0; n < this.dae.length; ++n) {
                    gy.a(this.MessageDelegator, this.dae[n].aJC().asf(), nm2.aCN);
                }
                bsa bsa2 = this.dae[bdj.dak.ordinal()].aJC().asf().aup().a(cug.fsH, 1, bqm.c.dEV, false);
                if (bsa2 == null || bsa2.avX() == null || bsa2.avX().length == 0) {
                    cte cte2 = new cte();
                    cte2.ResourceType = cug.fsH;
                    cte2.asi = 1;
                    this.dai.put(cug.fsH, new lfs(Boolean.TRUE, new HashSet()));
                    this.a(cug.fsH, new cte[]{cte2}, false, null, bqy.dGV);
                }
            } else {
                this.daf = nm2.aCN;
            }
        }
    }

    private boolean a(ldv ldv2, bdj bdj2) {
        if (!this.cCy.dQ(ldv2)) {
            return false;
        }
        bbr bbr2 = this.cCy.dR(ldv2);
        if (bbr2 == null) {
            return false;
        }
        switch (bdj2) {
            case dak: {
                return bbr2.b(bca.cTY) || bbr2.b(bca.cTZ) || bbr2.b(bca.cUa);
            }
            case dal: {
                return bbr2.b(bca.cUd) || bbr2.b(bca.cUe) || bbr2.b(bca.cUf);
            }
            case dam: {
                return bbr2.b(bca.cUh) || bbr2.b(bca.cUg) || bbr2.b(bca.cUi);
            }
        }
        return false;
    }

    public void e(bbr bbr2) {
        if (this.dae != null) {
            for (int i = 0; i < this.dae.length; ++i) {
                this.dae[i].e(bbr2);
            }
        }
    }

    private boolean alW() {
        if (this.dae == null) {
            return false;
        }
        for (int i = 0; i < this.dae.length; ++i) {
            if (this.dae[i].aJC() == null) {
                return false;
            }
            if (this.dae[i].aJC().asf() == null) {
                return false;
            }
            if (this.dae[i].aJC().asf().aup() != null) continue;
            return false;
        }
        return true;
    }

    private cte[] b(fmz fmz2) {
        if (fmz2 == null || fmz2.bqd == null || fmz2.bqd.length == 0) {
            return new cte[0];
        }
        cte[] cteArray = new cte[fmz2.bqd.length];
        for (int i = 0; i < fmz2.bqd.length; ++i) {
            cteArray[i] = new cte();
            cteArray[i].ResourceType = fmz2.bqd[i];
            cteArray[i].asi = fmz2.iIY[i];
            if (fmz2.iQG != null) {
                cteArray[i].DR = fmz2.iQG[i].DR;
            }
            if (fmz2.iQI == null || fmz2.iQI.length <= i || fmz2.iQI[i] == 0L) continue;
            cteArray[i].aXU = fmz2.iQI[i];
        }
        return cteArray;
    }

    public int a(cnf cnf2) {
        int n = 0;
        for (int i = 0; i < this.dae.length; ++i) {
            if (this.dae[i] == cnf2 || this.dae[i] == null || this.dae[i].aJC() == null || this.dae[i].aJC().asf() == null || this.dae[i].aJC().asf().aun() == null) continue;
            n += this.dae[i].aJC().asf().aun().AN().size();
        }
        return n;
    }

    public boolean V(int n, int n2) {
        if (!this.alW()) {
            return false;
        }
        return this.dae[bdj.dak.ordinal()].aJC().asf().aup().mp(n) >= n2;
    }

    public int iR(int n) {
        if (!this.alW()) {
            return 0;
        }
        return this.dae[bdj.dak.ordinal()].aJC().asf().aup().mp(n);
    }

    public void a(int[] nArray, int[] nArray2, bqy bqy2, bda[] bdaArray, boolean bl) {
        if (nArray == null || nArray2 == null || nArray.length != nArray2.length || nArray.length == 0) {
            return;
        }
        fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.GUID, this.GUID);
        fmz2.aFD = bl ? cug.fsH : -1;
        fmz2.bqd = nArray;
        fmz2.iIY = nArray2;
        fmz2.b(bqy2);
        this.c(fmz2);
        this.cYu.a(bdaArray);
    }

    public bsa W(int n, int n2) {
        if (!this.alW()) {
            return null;
        }
        if (!this.V(n, n2)) {
            return null;
        }
        return this.dae[bdj.dak.ordinal()].aJC().asf().aup().a(n, n2, bqm.c.dEV, true);
    }

    public void b(bsa bsa2) {
        if (!this.alW()) {
            return;
        }
        if (bsa2 == null) {
            return;
        }
        if (bsa2.avX() == null || bsa2.avX().length == 0) {
            return;
        }
        if (bsa2.awJ() == null || bsa2.awJ().length == 0 || bsa2.awJ().length != bsa2.avX().length) {
            return;
        }
        for (int i = 0; i < bsa2.avX().length; ++i) {
            this.dae[bdj.dak.ordinal()].aJC().asf().auo().a(bsa2.avX()[i].GUID, bsa2.awJ()[i]);
        }
    }

    public boolean a(int n, int n2, bqy bqy2, bda bda2) {
        if (!this.alW()) {
            return false;
        }
        if (!this.V(n, n2)) {
            return false;
        }
        boolean bl = this.dae[bdj.dak.ordinal()].aJC().asf().aup().a(n, n2, bqy2);
        if (bl) {
            this.cYu.c(bda2);
        }
        return bl;
    }

    public boolean a(bsa bsa2, int n, bqy bqy2, bda bda2) {
        if (!this.alW()) {
            return false;
        }
        if (bsa2 == null) {
            return false;
        }
        bri bri2 = (bri)this.dae[bdj.dak.ordinal()].aJC().asf();
        brp[] brpArray = bsa2.avX();
        lef[] lefArray = bsa2.awJ();
        if (brpArray == null || brpArray.length == 0) {
            return false;
        }
        if (lefArray == null || lefArray.length == 0 || lefArray.length != brpArray.length) {
            return false;
        }
        boolean bl = true;
        for (int i = 0; i < brpArray.length && n > 0; n -= brpArray[i].asi, ++i) {
            bl &= bri2.a(brpArray[i].GUID, lefArray[i], n > brpArray[i].asi ? brpArray[i].asi : n, bqy2);
        }
        if (bl) {
            this.cYu.c(bda2);
        }
        return bl;
    }

    private void d(bdj bdj2) {
        assert (bdj2 != null);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.GUID, lcr.qCq);
        gfm2.aqs = bdj2.ordinal();
        gfm2.ResourceType = bdj2.az();
        gfm2.iSi = 1;
        gfm2.Yc = this.cCy.getGUID();
        this.MessageDelegator.I(gfm2);
    }

    private void a(enx enx2, boolean bl) {
        assert (enx2 != null);
        eny eny2 = (eny)this.MessageDelegator.h(13834, this.cCy.getGUID(), enx2.aO());
        this.MessageDelegator.b(enx2, eny2);
        eny2.iwb = bl ? this.a(enx2.bJS()) : null;
        this.MessageDelegator.F(eny2);
    }

    private void a(int n, cte[] cteArray, boolean bl, ldv ldv2, bqy bqy2) {
        assert (cteArray != null);
        assert (cteArray.length > 0);
        assert (bqy2 != null);
        fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.GUID, this.MessageDelegator.getGUID());
        fcy2.aqs = n;
        fcy2.dul = 8;
        fcy2.bst = bkd.dqO;
        fcy2.aZG = this.GUID;
        fcy2.akX = this.alT();
        fcy2.dtP = cteArray;
        fcy2.iJG = bl;
        fcy2.iJE = ldv2;
        fcy2.b(bqy2);
        this.MessageDelegator.F(fcy2);
    }

    private void a(frq frq2, bqt[] bqtArray) {
        assert (frq2 != null);
        assert (bqtArray != null);
        frr frr2 = (frr)this.MessageDelegator.h(26633, this.cCy.getGUID(), frq2.dYb);
        this.MessageDelegator.b(frq2, frr2);
        frr2.YL = frq2.YL;
        frr2.aCH = 5;
        frr2.iUZ = bqtArray;
        this.MessageDelegator.E(frr2);
    }

    private void a(fmz fmz2, boolean bl) {
        assert (fmz2 != null);
        fna fna2 = (fna)this.MessageDelegator.h(7956, this.cCy.getGUID(), fmz2.aO());
        this.MessageDelegator.b(fmz2, fna2);
        fna2.bqd = fmz2.bqd;
        fna2.iIY = fmz2.iIY;
        fna2.iQK = bl;
        this.MessageDelegator.F(fna2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3585: 
            case 13919: 
            case 13921: {
                this.cYu.receiveMessage(dxq2);
                break;
            }
            case 6146: {
                this.b((gfn)dxq2);
                break;
            }
            case 7955: {
                lfn.b(5, this.getClass().getSimpleName(), "receiveMessage() : Inventory Resource Create Request Received from 'Out-Side' Source... Items Will Be Created But Cannot Be Properly Logged!!!... FIX THIS!!!... FromGUID = " + dxq2.aO().fk());
                assert (false);
                this.c((fmz)dxq2);
                break;
            }
            case 9219: {
                this.a((fcs)dxq2);
                break;
            }
            case 13833: {
                this.a((enx)dxq2);
                break;
            }
            case 7956: {
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(gfn gfn2) {
        if (gfn2.dtF == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleResourceCreateResponseMessage() : Resource Failed to be Created!!!... Message = " + gfn2);
            assert (false);
            return;
        }
        bdj bdj2 = bdj.getValueByOrdinal(gfn2.aVk());
        if (this.dae.length <= bdj2.ordinal()) {
            lfn.b(5, this.getClass().getSimpleName(), "handleResourceCreateResponseMessage() : Vaults Array is Null!!!");
            assert (false);
            return;
        }
        if (this.dae[bdj2.ordinal()] != null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleResourceCreateResponseMessage() : Vaults Array is Too Small!!!... VaultType = " + (Object)((Object)bdj2));
            assert (false);
            return;
        }
        if (!(gfn2.dtF instanceof cnf)) {
            lfn.b(5, this.getClass().getSimpleName(), "handleResourceCreateResponseMessage() : Created Resource is Not an SFStorageObjectClanBank instance!!!");
            assert (false);
            return;
        }
        this.dae[bdj2.ordinal()] = (cnf)gfn2.dtF;
        this.dae[bdj2.ordinal()].b(this.cCy);
        if (this.daf != null) {
            gy.a(this.MessageDelegator, this.dae[bdj2.ordinal()].aJC().asf(), this.daf);
        } else {
            this.dae[bdj2.ordinal()].aJC().asf().N(mx.si());
        }
        this.MessageDelegator.a((amf)((Object)this.dae[bdj2.ordinal()]));
        switch (bdj2) {
            case dak: {
                bsa bsa2 = this.dae[bdj2.ordinal()].aJC().asf().aup().a(cug.fsH, 1, bqm.c.dEV, false);
                if (bsa2 == null || bsa2.avX() == null || bsa2.avX().length == 0) {
                    cte cte2 = new cte();
                    cte2.ResourceType = cug.fsH;
                    cte2.asi = 1;
                    this.dai.put(cug.fsH, new lfs(Boolean.TRUE, new HashSet()));
                    this.a(cug.fsH, new cte[]{cte2}, false, null, bqy.dGV);
                }
                this.iO();
                break;
            }
        }
    }

    public void iO() {
        if (this.Zo == null) {
            return;
        }
        for (ok ok2 : this.Zo) {
            fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.GUID, this.GUID);
            fmz2.bqd = new int[]{lea.enW().getType(ok2.aCI)};
            fmz2.iIY = new int[]{ok2.asi};
            fmz2.iQI = new long[]{ok2.aCF};
            fmz2.iQG = new ek[]{new ek(ok2.DR)};
            fmz2.iQH = true;
            fmz2.iJG = ok2.aFE;
            fmz2.aFD = ok2.aFD;
            fmz2.b(bqy.getValueByDatabaseID(ok2.aFF));
            fmz2.iJE = null;
            this.c(fmz2);
        }
        this.Zo.clear();
        this.Zo = null;
    }

    private void c(fmz fmz2) {
        if (!this.alW()) {
            this.a(fmz2, false);
            return;
        }
        if (fmz2 == null || fmz2.bqd == null || fmz2.iIY == null || fmz2.bqd.length != fmz2.iIY.length || fmz2.bqd.length <= 0) {
            this.a(fmz2, false);
            return;
        }
        ldv ldv2 = null;
        if (fmz2.aFD != -1) {
            bsa bsa2 = this.dae[bdj.dak.ordinal()].aJC().asf().aup().a(fmz2.aFD, 1, bqm.c.dEV, false);
            if (bsa2 != null && bsa2.avX() != null && bsa2.avX().length > 0) {
                ldv2 = bsa2.avX()[0].GUID;
            } else {
                lfs<Boolean, Set<fmz>> lfs2 = this.dai.get(fmz2.aFD);
                if (lfs2 == null) {
                    lfs2 = new lfs(Boolean.FALSE, new HashSet());
                    this.dai.put(fmz2.aFD, lfs2);
                }
                ((Set)lfs2.reY).add(fmz2);
                if (!((Boolean)lfs2.reX).booleanValue()) {
                    lfs2.reX = Boolean.TRUE;
                    cte cte2 = new cte();
                    cte2.ResourceType = fmz2.aFD;
                    cte2.asi = 1;
                    this.a(fmz2.aFD, new cte[]{cte2}, false, null, bqy.dGV);
                }
                return;
            }
        }
        this.dah.put(this.dag, fmz2);
        this.a(this.dag++, this.b(fmz2), true, ldv2, fmz2.brE());
    }

    private void a(fcs fcs2) {
        lfs<Boolean, Set<fmz>> lfs2 = this.dai.remove(fcs2.aqs);
        if (lfs2 != null) {
            ldv ldv2 = null;
            bsa bsa2 = this.dae[bdj.dak.ordinal()].aJC().asf().aup().a(fcs2.aqs, 1, bqm.c.dEV, false);
            if (bsa2 == null || bsa2.avX() == null || bsa2.avX().length == 0) {
                lfn.b(5, "SFClanVaultManager", "handleFunctionCompletionResultMessage() : Preferred Container Create Function Completed, But Container Not Found!!!");
                assert (false);
            } else {
                ldv2 = bsa2.avX()[0].GUID;
            }
            for (fmz fmz2 : (Set)lfs2.reY) {
                this.dah.put(this.dag, fmz2);
                this.a(this.dag++, this.b(fmz2), true, ldv2, fmz2.brE());
            }
            return;
        }
        fmz fmz3 = this.dah.remove(fcs2.aqs);
        if (fmz3 != null) {
            if (ldv.au(fmz3.aO(), this.GUID)) {
                return;
            }
            this.a(fmz3, fcs2.iJq);
            return;
        }
        lfn.b(5, "SFClanVaultManager", "handleFunctionCompletionResultMessage() : Result Received for Unknown Request!!!");
        assert (false);
    }

    private void a(enx enx2) {
        this.a(enx2, this.a(enx2.qd(), enx2.bJS()));
    }
}

