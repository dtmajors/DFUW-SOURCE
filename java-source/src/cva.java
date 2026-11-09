/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class cva
implements cuu {
    private static final String TC = "SFWorldRelicsManager";
    private static final double fyH = 86400.0;
    private ayc fyI = lea.epQ();
    private Map<Integer, cux> fyJ = lcn.abI(20);
    private Map<ldv, cux> fyK = lcn.abI(20);
    private Map<Integer, a> fyL = lcn.abI(20);
    private double abo = 0.0;
    private boolean fyM = false;
    private boolean fyN = false;
    private double fyO = 600.0;
    private final csx fyA;
    private Map<Integer, gfy> fyP = lcn.emw();
    private int aqs = 0;
    private List<ldv> fyQ = lcn.emv();
    private List<ldv> fyR = lcn.abH(10);

    public cva(csx csx2) {
        assert (ayc.avz);
        this.fyA = csx2;
    }

    public void doTick(ldz ldz2) {
        kdw.a a2 = this.fyA.getMessageDelegator().bzx().bzt().dVA();
        if (!a2.isRunning()) {
            return;
        }
        if (this.fyA.bbk().isEmpty()) {
            return;
        }
        if (!this.fyN) {
            this.fyO -= ldz2.qwh;
            if (this.fyO > 0.0) {
                return;
            }
            this.fyN = true;
        }
        this.abo -= ldz2.qwh;
        if (this.abo > 0.0) {
            return;
        }
        this.abo = 86400.0;
        this.bci();
    }

    private void bci() {
        Collection<ayc.a> collection = this.fyI.Zw();
        for (ayc.a a2 : collection) {
            this.a(null, a2);
        }
    }

    private void a(ljq ljq2, ayc.a a2) {
        if (this.fyJ.containsKey(a2.ZD())) {
            return;
        }
        if (this.fyL.containsKey(a2.lF())) {
            return;
        }
        this.fyJ.put(a2.ZD(), null);
        cux cux2 = new cux(this, a2.ZD(), ljq2);
        cux2.setGUID(this.fyA.getMessageDelegator().bzv());
        this.fyA.getMessageDelegator().a(cux2);
    }

    public void c(gfy gfy2) {
        ldv ldv2 = gfy2.jgr;
        cux cux2 = this.fyK.get(ldv2);
        if (cux2 == null) {
            return;
        }
        ayc.a a2 = this.fyI.iJ(cux2.az());
        if (a2 == null) {
            assert (false) : "There is no associated Relic with Chest Type : " + cux2.az();
            return;
        }
        ges ges2 = (ges)this.fyA.getMessageDelegator().h(35073, this.fyA.getGUID(), gfy2.aZG);
        ges2.sk(this.aqs);
        this.fyA.getMessageDelegator().F(ges2);
        this.fyP.put(this.aqs, gfy2);
        ++this.aqs;
    }

    private void a(get get2) {
        gfy gfy2 = this.fyP.remove(get2.aVk());
        if (gfy2 == null) {
            lfn.b(5, TC, "handleRelicChestUnlockCheckResponseMessage() No request for MessageTag : " + get2.aVk());
            assert (false);
            return;
        }
        if (get2.bUA()) {
            this.W(gfy2.jgr, gfy2.aZG);
        }
    }

    private boolean W(ldv ldv2, ldv ldv3) {
        cux cux2 = this.fyK.get(ldv2);
        if (cux2 == null) {
            return false;
        }
        boolean bl = cux2.bcf();
        if (bl) {
            ayc.a a2 = this.fyI.iJ(cux2.az());
            if (a2 == null) {
                assert (false) : "There is no associated Relic with Chest Type : " + cux2.az();
                return false;
            }
            this.abo = 86400.0;
            geu geu2 = (geu)this.fyA.getMessageDelegator().h(35075, this.fyA.getGUID(), ldv3);
            geu2.gO(a2.lF());
            this.fyA.getMessageDelegator().F(geu2);
        }
        return bl;
    }

    private void a(gfg gfg2) {
        gfg.a a2 = gfg.a.getValueByOrdinal(gfg2.bHc());
        if (a2 == null) {
            lfn.b(5, TC, "handleRelicWorldStateUpdateMessage() Invalid : " + gfg2.bHc());
            assert (false);
            return;
        }
        int n = gfg2.lF();
        ayc.a a3 = this.fyI.iK(n);
        if (a3 == null) {
            assert (false) : "Invalid : " + n;
            return;
        }
        switch (a2) {
            case jgc: {
                assert (!this.fyJ.containsKey(a3.ZD()));
                assert (!this.fyL.containsKey(n));
                assert (gfg2.acm() != null);
                assert (gfg2.bBW() != null);
                this.fyL.put(n, new a(this, gfg2.acm(), gfg2.av(), System.currentTimeMillis()));
                break;
            }
            case jfU: {
                assert (!this.fyL.containsKey(n));
                assert (gfg2.qd() != null);
                this.fyL.put(n, new a(this, gfg2.qd(), gfg2.av(), System.currentTimeMillis()));
                break;
            }
            case jgd: 
            case jfX: 
            case jfW: 
            case jfV: {
                assert (!this.fyJ.containsKey(a3.ZD()));
                ldv ldv2 = gfg2.qd();
                assert (ldv2 != null);
                a a4 = this.fyL.remove(n);
                if (a4 == null) {
                    assert (false) : "No lock for relic : " + n + " for player : " + ldv2;
                    return;
                }
                if (ldv2 != null && !ldv2.equals(a4.bYe)) {
                    assert (false) : "Relic : " + n + "  was not locked from : " + ldv2 + " but from : " + a.a(a4);
                    return;
                }
                ljq ljq2 = gfg2.av();
                if (a2 == gfg.a.jfW && ljq2 != null) {
                    ljq2.x += ayc.cvS / 10.0f;
                    ljq2.y += ayc.cvS / 10.0f;
                }
                this.a(ljq2, a3);
                break;
            }
            case jga: 
            case jgb: {
                ldv ldv3 = gfg2.qd();
                assert (ldv3 != null);
                assert (!this.fyK.containsKey(a3.ZD()));
                a a5 = this.fyL.remove(n);
                if (a5 == null) {
                    assert (false) : "No lock for relic : " + n + " for player : " + ldv3;
                    return;
                }
                if (a2 == gfg.a.jga) {
                    if (ldv3 == null || ldv3.equals(a5.bYe)) break;
                    assert (false) : "Relic : " + n + "  was not locked from : " + ldv3 + " but from : " + a.a(a5);
                    return;
                }
                this.b(a3.ZC(), -1, gfg2.av());
                break;
            }
            case jfY: {
                assert (gfg2.acm() != null);
                assert (gfg2.bBW() != null);
                assert (this.fyL.containsKey(n));
                assert (!this.fyK.containsKey(a3.ZD()));
                a a6 = this.fyL.get(n);
                if (a6 == null) {
                    assert (false) : "No lock for relic : " + n;
                    return;
                }
                a6.bYe = gfg2.acm();
                this.b(-1, a3.ZC(), gfg2.av());
                break;
            }
            case jfZ: {
                ldv ldv4 = gfg2.qd();
                assert (ldv4 != null);
                assert (this.fyL.containsKey(n));
                assert (!this.fyJ.containsKey(a3.ZD()));
                a a7 = this.fyL.get(n);
                if (a7 == null) {
                    assert (false) : "No lock for relic : " + n;
                    return;
                }
                a7.bYe = ldv4;
                this.b(a3.ZC(), -1, gfg2.av());
                break;
            }
            case jfS: 
            case jfT: {
                break;
            }
            default: {
                assert (false) : "Invalid type : " + (Object)((Object)a2);
                break;
            }
        }
        gfg2.on(lcr.qEl);
        this.fyA.getMessageDelegator().F(gfg2);
    }

    private void a(gew gew2) {
        int n = gew2.bHc();
        ldv ldv2 = gew2.bUx();
        assert (ldv2 != null);
        switch (n) {
            case 0: 
            case 3: {
                if (this.fyR.contains(ldv2)) break;
                this.fyR.add(ldv2);
                this.Y(ldv2, n);
                break;
            }
            case 1: 
            case 2: 
            case 4: {
                boolean bl = this.fyR.remove(ldv2);
                if (!bl) break;
                this.Y(ldv2, n);
                break;
            }
        }
    }

    private void Y(ldv ldv2, int n) {
        if (this.fyR.isEmpty()) {
            return;
        }
        boolean bl = false;
        loz loz2 = null;
        switch (n) {
            case 0: {
                loz2 = mcp.uxh.bD(new Object[0]);
                bl = true;
                break;
            }
            case 1: {
                loz2 = mcp.uxi.bD(new Object[0]);
                bl = true;
                break;
            }
            case 4: {
                loz2 = mcp.uxj.bD(new Object[0]);
                bl = true;
            }
        }
        for (ldv ldv3 : this.fyR) {
            gew gew2 = (gew)this.fyA.getMessageDelegator().h(35088, this.fyA.getGUID(), ldv3);
            gew2.Eh(n);
            gew2.Ji(this.fyR.size());
            gew2.qm(ldv2);
            this.fyA.getMessageDelegator().E(gew2);
            if (!bl || ldv3.equals(ldv2)) continue;
            this.b(loz2, ldv3);
        }
    }

    private void b(ljq ljq2, int n, int n2) {
        gfg gfg2 = (gfg)this.fyA.getMessageDelegator().h(35083, this.fyA.getGUID(), lcr.qAY);
        gfg2.Eh(n);
        gfg2.gO(n2);
        gfg2.c(ljq2);
        this.a(gfg2);
    }

    public void b(loz loz2, ldv ldv2) {
        fgs fgs2 = (fgs)this.fyA.getMessageDelegator().h(29446, this.fyA.getGUID(), ldv2);
        fgs2.r(loz2);
        this.fyA.getMessageDelegator().F(fgs2);
    }

    public void B(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 35083: {
                this.a((gfg)dxq2);
                break;
            }
            case 35074: {
                this.a((get)dxq2);
                break;
            }
            case 35085: {
                this.a((gfd)dxq2);
                break;
            }
            case 35088: {
                this.a((gew)dxq2);
                break;
            }
            default: {
                assert (false) : "Unhandled type : " + dxq2.getClass();
                break;
            }
        }
    }

    private void a(gfd gfd2) {
        if (gfd2.bUC()) {
            if (this.fyQ.contains(gfd2.qd())) {
                lfn.b(5, TC, "handleRelicShowRelicChestsOnMapMessage() There is already a listener for Player: " + gfd2.qd());
                return;
            }
            this.fyQ.add(gfd2.qd());
            this.lN(gfd2.qd());
            return;
        }
        boolean bl = this.fyQ.remove(gfd2.qd());
        if (!bl) {
            lfn.b(5, TC, "handleRelicShowRelicChestsOnMapMessage() There is no listener for Player: " + gfd2.qd());
        }
    }

    private void b(int n, int n2, ljq ljq2) {
        if (this.fyQ.isEmpty()) {
            return;
        }
        for (ldv ldv2 : this.fyQ) {
            this.a(n, n2, ljq2, ldv2);
        }
    }

    private void a(int n, int n2, ljq ljq2, ldv ldv2) {
        ger ger2 = (ger)this.fyA.getMessageDelegator().h(35086, this.fyA.getGUID(), ldv2);
        ger2.Jg(n);
        ger2.Jh(n2);
        ger2.c(ljq2);
        this.fyA.getMessageDelegator().E(ger2);
    }

    private void lN(ldv ldv2) {
        if (!this.fyK.isEmpty()) {
            for (cux object : this.fyK.values()) {
                this.a(-1, object.az(), object.Bc(), ldv2);
            }
        }
        if (!this.fyL.isEmpty()) {
            for (Map.Entry entry : this.fyL.entrySet()) {
                int n = (Integer)entry.getKey();
                ayc.a a2 = this.fyI.iK(n);
                assert (a2 != null);
                a a3 = (a)entry.getValue();
                this.a(-1, a2.ZC(), a3.Position, ldv2);
            }
        }
    }

    @Override
    public void a(ldv ldv2, cuv cuv2, ljq ljq2) {
        cux cux2 = (cux)cuv2;
        if (!this.fyJ.containsKey(cux2.az())) {
            lfn.b(5, TC, "notifyChestCreated() CHEST : " + cug.uV((int)cux2.az()) + " DOES NOT EXIST.");
            assert (false) : "RC : " + cug.uV((int)cux2.az());
            return;
        }
        assert (!this.fyK.containsKey(ldv2));
        this.fyJ.put(cux2.az(), cux2);
        this.fyK.put(ldv2, cux2);
        ayc.a a2 = this.fyI.iJ(cux2.az());
        assert (a2 != null);
        cux2.bB(ljq2);
        this.b(ljq2, gfg.a.jfS.ordinal(), a2.lF());
        this.b(-1, cux2.az(), ljq2);
    }

    @Override
    public void a(ldv ldv2, cuv cuv2, boolean bl) {
        cux cux2 = (cux)cuv2;
        if (!this.fyK.containsKey(ldv2)) {
            lfn.b(5, TC, "notifyChestRemoved() CHEST GUID : " + ldv2 + " NOT IN MAP.");
            assert (false);
            return;
        }
        if (!this.fyJ.containsKey(cux2.az())) {
            lfn.b(5, TC, "notifyChestRemoved() CHEST : " + cug.uV((int)cux2.az()) + " NOT IN MAP.");
            assert (false);
            return;
        }
        this.fyK.remove(ldv2);
        this.fyJ.remove(cux2.az());
        ayc.a a2 = this.fyI.iJ(cux2.az());
        assert (a2 != null);
        if (bl) {
            this.b(null, gfg.a.jfT.ordinal(), a2.lF());
        }
        this.b(cux2.az(), -1, cux2.Bc());
        this.fyA.getMessageDelegator().hd(cux2.getGUID());
    }

    @Override
    public int bbl() {
        return this.fyA.bbl();
    }
}

