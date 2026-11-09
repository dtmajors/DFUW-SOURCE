/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class csx
extends btk
implements bto {
    private final double feb = 10.0;
    private cuw fec = null;
    private cvf fed = null;
    private cva fee = null;
    private cuz fef = null;
    private final Map<ldv, Double> feg = lcn.emw();
    private final Map<Integer, gfw[]> feh = lcn.emw();
    private final Map<Integer, Double> fei = lcn.emw();
    private int Qs = 1;
    private final Map<Integer, csw> fej = lea.eoT();
    private final les ResourceTree = lea.enW();
    protected List<gr> dib = lcn.emv();
    private Map<ldv, bsz> fek = lea.epH();
    private int fel = 0;

    @Override
    public void initialize() {
        super.initialize();
        this.fec = new cuw(this);
        this.fec.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.fec);
        this.fed = new cvf(this);
        this.fed.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.fed);
        lea.epQ();
        if (ayc.avz) {
            this.fee = new cva(this);
        }
        if (aev.isEnabled()) {
            this.fef = new cuz(this);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bED()) {
            case 35328: {
                assert (aev.isEnabled());
                assert (this.fef != null);
                this.fef.a((glo)dxq2);
            }
        }
        switch (dxq2.bEz()) {
            case 6152: {
                this.a((gfy)dxq2);
                break;
            }
            case 7982: {
                this.e((fnf)dxq2);
                break;
            }
            case 9251: {
                this.a((fdu)dxq2);
                break;
            }
            case 35074: 
            case 35083: 
            case 35085: 
            case 35088: {
                if (!$assertionsDisabled) {
                    lea.epQ();
                    if (!ayc.avz) {
                        throw new AssertionError();
                    }
                }
                assert (this.fee != null);
                if (this.fee == null) break;
                this.fee.B(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gfy gfy2) {
        Double d2;
        gfz gfz2 = (gfz)this.MessageDelegator.h(6153, this.GUID, gfy2.aO());
        this.MessageDelegator.b(gfy2, gfz2);
        gfz2.dtP = null;
        if (gfy2.RB <= 0) {
            this.MessageDelegator.F(gfz2);
            return;
        }
        if (gfy2.aZG == null) {
            this.MessageDelegator.F(gfz2);
            return;
        }
        if (gfy2.jgr == null) {
            this.MessageDelegator.F(gfz2);
            return;
        }
        if (gfy2.cwg <= 0) {
            this.MessageDelegator.F(gfz2);
            return;
        }
        if (!this.ResourceTree.isDescendant(gfy2.cwg, cug.fjJ)) {
            this.MessageDelegator.F(gfz2);
            return;
        }
        boolean bl = this.ResourceTree.isDescendant(gfy2.cwg, cug.fwx);
        if (bl) {
            if (!$assertionsDisabled) {
                lea.epQ();
                if (!ayc.avz) {
                    throw new AssertionError();
                }
            }
            assert (this.fee != null);
            if (this.fee != null) {
                this.fee.c(gfy2);
            }
            this.MessageDelegator.F(gfz2);
            return;
        }
        if (!this.fej.containsKey(gfy2.cwg)) {
            this.MessageDelegator.F(gfz2);
            return;
        }
        boolean bl2 = lea.enW().isDescendant(gfy2.cwg, cug.fwA);
        if (!bl2 && (d2 = this.feg.get(gfy2.jgr)) != null) {
            double d3 = this.MessageDelegator.arc().rgz;
            if (d2 > d3) {
                this.MessageDelegator.F(gfz2);
                this.c(gfy2.RB, mah.ubf.bD(gfy2.cwg));
                return;
            }
        }
        boolean bl3 = this.ResourceTree.isDescendant(gfy2.cwg, cug.fjL);
        boolean bl4 = this.ResourceTree.isDescendant(gfy2.cwg, cug.fjK);
        gfz2.jgp = !bl4 && !bl3 ? this.b(gfy2) : -1;
        int n = -1;
        boolean bl5 = cug.uC((int)gfy2.cwg);
        if (bl5) {
            n = cug.uN((int)gfy2.cwg);
            if (n <= 0) {
                this.MessageDelegator.F(gfz2);
                return;
            }
        } else {
            gfz2.dtP = bl4 ? (this.fec.lM(gfy2.jgr) ? this.ud(gfy2.cwg) : null) : (bl3 ? (this.fed.lP(gfy2.jgr) ? this.ue(gfy2.cwg) : null) : this.X(gfy2.jgr, gfy2.cwg));
            this.MessageDelegator.F(gfz2);
            if (gfz2.dtP == null) {
                this.c(gfy2.RB, mah.ubf.bD(gfy2.cwg));
            } else {
                this.c(gfy2.RB, mah.ubd.bD(gfy2.cwg));
            }
            this.b(gfy2.RB, gfz2.dtP);
            return;
        }
        assert (n > 0);
        int n2 = this.Qs++;
        this.feh.put(n2, new gfw[]{gfy2, gfz2});
        double d4 = this.MessageDelegator.arc().rgz + 10.0;
        this.fei.put(n2, d4);
        fdt fdt2 = (fdt)this.MessageDelegator.h(9250, this.GUID, gfy2.aZG);
        fdt2.sk(n2);
        fdt2.cz(10.0);
        fdt2.kT(true);
        fdt2.kU(false);
        this.MessageDelegator.F(fdt2);
    }

    private int b(gfy gfy2) {
        float f2;
        int n = -1;
        bsz bsz2 = this.fek.get(gfy2.jgr);
        if (bsz2 == null) {
            lfn.b(5, "SFChestManager", "validateRequest() ResourceGUID : " + gfy2.jgr + " for ResourceType : " + gfy2.cwg + " does not exist.");
            return 1;
        }
        if (bsz2.dKu != gfy2.cwg) {
            n = 2;
            lfn.b(5, "SFChestManager", "validateRequest() ResourceGUID : " + gfy2.jgr + " has as a ResourceType : " + gfy2.cwg + " but requested resource type is : " + bsz2.dKu);
        }
        if (bsz2.Position != null && gfy2.jgs != null && (f2 = ljq.s(bsz2.Position, gfy2.jgs)) > 14.0f) {
            n |= 4;
            lfn.b(5, "SFChestManager", "validateRequest() ResourceGUID : " + gfy2.jgr + " ResourceType : " + gfy2.cwg + " Object Position : " + bsz2.Position);
            lfn.b(5, "SFChestManager", "validateRequest() Player's Position : " + gfy2.jgs + " and distance : " + f2);
        }
        return n;
    }

    private void a(fdu fdu2) {
        Double d2 = this.fei.get(fdu2.aVk());
        gfw[] gfwArray = this.feh.get(fdu2.aVk());
        if (d2 == null || gfwArray == null) {
            return;
        }
        gfy gfy2 = (gfy)gfwArray[0];
        gfz gfz2 = (gfz)gfwArray[1];
        if (!fdu2.aO().equals(gfy2.aZG)) {
            return;
        }
        this.MessageDelegator.F(gfz2);
        this.fei.remove(fdu2.aVk());
        this.feh.remove(fdu2.aVk());
    }

    private void m(Integer n) {
        gfw[] gfwArray = this.feh.get(n);
        gfy gfy2 = (gfy)gfwArray[0];
        gfz gfz2 = (gfz)gfwArray[1];
        gfz2.dtP = null;
        boolean bl = lea.enW().isDescendant(gfy2.cwg, cug.fwA);
        if (bl) {
            if (!this.fef.lM(gfy2.jgr)) {
                this.MessageDelegator.F(gfz2);
                this.c(gfy2.RB, mah.ubf.bD(gfy2.cwg));
                this.feh.remove(n);
            } else {
                gfz2.dtP = this.X(gfy2.jgr, gfy2.cwg);
                fne fne2 = (fne)this.MessageDelegator.h(7981, this.GUID, gfy2.aZG);
                fne2.aqs = n;
                fne2.ResourceType = cug.uN((int)gfy2.cwg);
                fne2.asi = 1;
                fne2.b(bqy.dHw);
                this.MessageDelegator.F(fne2);
            }
            return;
        }
        if (!this.feg.containsKey(gfy2.jgr) || this.feg.get(gfy2.jgr) <= this.MessageDelegator.arc().rgz) {
            gfz2.dtP = this.X(gfy2.jgr, gfy2.cwg);
        }
        if (gfz2.dtP == null) {
            this.MessageDelegator.F(gfz2);
            this.c(gfy2.RB, mah.ubf.bD(gfy2.cwg));
            this.feh.remove(n);
            return;
        }
        fne fne3 = (fne)this.MessageDelegator.h(7981, this.GUID, gfy2.aZG);
        fne3.aqs = n;
        fne3.ResourceType = cug.uN((int)gfy2.cwg);
        fne3.asi = 1;
        fne3.b(bqy.dHw);
        this.MessageDelegator.F(fne3);
    }

    private void e(fnf fnf2) {
        gfw[] gfwArray = this.feh.remove(fnf2.aqs);
        if (gfwArray == null) {
            return;
        }
        gfy gfy2 = (gfy)gfwArray[0];
        gfz gfz2 = (gfz)gfwArray[1];
        if (fnf2.iQM) {
            this.c(gfy2.RB, mah.ubd.bD(gfy2.cwg));
            this.b(gfy2.RB, gfz2.dtP);
            ldv ldv2 = lcr.tQ((ldv)gfy2.aZG);
            fsy fsy2 = (fsy)this.MessageDelegator.h(30244, this.getGUID(), ldv2);
            fsy2.cwg = gfy2.cwg;
            this.MessageDelegator.F(fsy2);
        } else {
            lfn.b(5, "SFChestManager", "handleResourceRemoveResponse() Key was not removed from " + fnf2.aO());
            this.c(gfy2.RB, mah.ubg.bD(fnf2.ResourceType, gfy2.cwg));
            boolean bl = lea.enW().isDescendant(gfy2.cwg, cug.fwA);
            if (!bl) {
                this.feg.remove(gfy2.jgr);
            }
            gfz2.dtP = null;
        }
        this.MessageDelegator.F(gfz2);
    }

    private cte[] ud(int n) {
        assert (n > 0);
        csw csw2 = this.fej.get(n);
        if (csw2 == null) {
            return null;
        }
        cte[] cteArray = ctf.a(csw2);
        if (cteArray == null || cteArray.length == 0) {
            return null;
        }
        return cteArray;
    }

    private cte[] ue(int n) {
        assert (n > 0);
        csw csw2 = this.fej.get(n);
        if (csw2 == null) {
            return null;
        }
        cte[] cteArray = ctf.a(csw2);
        if (cteArray != null && cteArray.length == 0) {
            return null;
        }
        return cteArray;
    }

    private cte[] X(ldv ldv2, int n) {
        cte[] cteArray;
        assert (ldv2 != null);
        assert (n > 0);
        csw csw2 = this.fej.get(n);
        if (csw2 == null) {
            return null;
        }
        boolean bl = lea.enW().isDescendant(n, cug.fwA);
        if (!bl) {
            double d2;
            double d3 = lgp.erA().nextFloat();
            double d4 = d2 = d3 * (csw2.fdY - csw2.fdZ) + csw2.fdZ;
            this.feg.put(ldv2, d2 += this.MessageDelegator.arc().rgz);
        }
        if ((cteArray = ctf.a(csw2)) != null && cteArray.length == 0) {
            return null;
        }
        return cteArray;
    }

    private lip uf(int n) {
        lip lip2 = cug.uH((int)n);
        if (lip2 == null) {
            lip2 = new ljk("Unknown");
        }
        return lip2;
    }

    private void c(int n, loz loz2) {
        ldv ldv2 = lcr.ak((ldv)lcr.acL, (int)n);
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private void b(int n, cte[] cteArray) {
        if (cteArray == null) {
            return;
        }
        if (cteArray.length == 0) {
            return;
        }
        for (int i = 0; i < cteArray.length; ++i) {
            if (cteArray[i] == null || !this.ug(cteArray[i].ResourceType)) continue;
            this.c(n, mah.ubh.bD(cteArray[i].ResourceType));
        }
    }

    public boolean ug(int n) {
        if (lea.enW().isDescendant(n, cug.fqU)) {
            return true;
        }
        if (lea.enW().isDescendant(n, cug.fqV)) {
            return true;
        }
        if (lea.enW().isDescendant(n, cug.fqM)) {
            return true;
        }
        return lea.enW().isDescendant(n, cug.frJ);
    }

    @Override
    public void doTick(ldz ldz2) {
        Iterator<Map.Entry<Integer, Double>> iterator = this.fei.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Double> entry = iterator.next();
            if (ldz2.rgz < entry.getValue()) continue;
            this.m(entry.getKey());
            iterator.remove();
        }
        lea.epQ();
        if (ayc.avz) {
            assert (this.fee != null);
            if (this.fee != null) {
                this.fee.doTick(ldz2);
            }
        }
    }

    public final List<gr> bbk() {
        return this.dib;
    }

    public final void aC(List<gr> list) {
        this.dib = list;
    }

    public int bbl() {
        if (this.dib.isEmpty()) {
            return -1;
        }
        int n = this.fel++;
        if (this.fel >= this.dib.size()) {
            this.fel = 0;
        }
        return this.dib.get((int)n).di;
    }
}

