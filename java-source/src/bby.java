/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  azn
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class bby
extends btk {
    private static final double auT = 1.0;
    private final ayd cCy;
    private final azn cwP;
    private Map<cib, lfs<String, Double>> cST = lcn.emw();
    private double abo = 0.0;
    private GregorianCalendar cSU;

    public bby(ayd ayd2, azn azn2) {
        this.cCy = ayd2;
        this.cwP = azn2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.cSU = this.MessageDelegator.bzy();
    }

    private void a(enb enb2) {
        ldv ldv2 = enb2.abB();
        assert (ldv2 != null);
        bbr bbr2 = this.cCy.dR(ldv2);
        if (bbr2 == null) {
            this.a(new int[]{0}, enb2.aO());
            return;
        }
        if (!bbr2.b(bca.cTK)) {
            this.a(new int[]{1}, enb2.aO());
            return;
        }
        Collection collection = this.cCy.aan();
        if (collection == null || collection.isEmpty()) {
            this.a(new int[]{3}, enb2.aO());
            return;
        }
        int[] nArray = enb2.bIU();
        assert (nArray != null);
        int[] nArray2 = enb2.bIV();
        assert (nArray2 != null);
        int[] nArray3 = new int[nArray.length];
        for (int i = 0; i < nArray.length; ++i) {
            int n;
            Object object;
            Object object2;
            int n2 = nArray[i];
            cia cia2 = lea.epN().qe(n2);
            if (cia2 == null) {
                nArray3[i] = 2;
                assert (false);
                continue;
            }
            if (this.cST.containsKey((Object)cia2.aOL())) {
                nArray3[i] = 7;
                object2 = this.cST.get((Object)cia2.aOL());
                lfn.b(5, this.getClass().getSimpleName(), "handleClanPerkManagementRequestMessage() : Perk [" + cia2.aOL().name() + "] is already active and it needs " + ldz.dW((Double)((lfs)object2).reY) + " minutes to expire.");
                continue;
            }
            if (!cia2.aON()) {
                nArray3[i] = 2;
                assert (false);
                continue;
            }
            object2 = null;
            for (azb azb2 : collection) {
                object = azb2.Xt();
                List<cib> list = lea.epN().hr((String)object);
                if (list == null || !list.contains((Object)cia2.aOL())) continue;
                object2 = object;
                break;
            }
            if (object2 == null) {
                nArray3[i] = 4;
                continue;
            }
            int n3 = cia.aM(cia2.cl(), nArray2[i]);
            if (n3 > (n = this.cCy.aaq())) {
                nArray3[i] = 5;
                assert (false);
                continue;
            }
            object = this.cCy.a(-n3, azm.cFa, ldv2, false);
            if (!((azl)((Object)object)).adn()) {
                nArray3[i] = 6;
                continue;
            }
            nArray3[i] = 8;
            if (this.cST == null) {
                this.cST = lcn.emw();
            }
            double d2 = (double)nArray2[i] * 3600.0;
            lfs<Object, Double> lfs2 = new lfs<Object, Double>(object2, d2);
            this.cST.put(cia2.aOL(), lfs2);
            this.ac(0, n2);
            this.cCy.i(mck.uvN.bD(n2, object2, bbr2.akp()));
            this.cwP.a(2305, n2, this.MessageDelegator.arc().rgz + (double)nArray2[i] * 3600.0);
        }
        this.a(nArray3, enb2.aO());
    }

    public void u(bbr bbr2) {
        if (this.cST == null || this.cST.isEmpty()) {
            return;
        }
        for (cib cib2 : this.cST.keySet()) {
            this.c(0, cib2.ordinal(), bbr2.abB());
        }
    }

    public void eH(ldv ldv2) {
        if (this.cST == null || this.cST.isEmpty()) {
            return;
        }
        for (cib cib2 : this.cST.keySet()) {
            this.c(0, cib2.ordinal(), ldv2);
        }
    }

    public void eI(ldv ldv2) {
        if (this.cST == null || this.cST.isEmpty()) {
            return;
        }
        for (cib cib2 : this.cST.keySet()) {
            this.c(1, cib2.ordinal(), ldv2);
        }
    }

    public void fn(String string) {
        if (this.cST == null || this.cST.isEmpty()) {
            return;
        }
        List<cib> list = lea.epN().hr(string);
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = lcn.emv();
        for (cib cib2 : list) {
            lfs<String, Double> lfs2 = this.cST.remove((Object)cib2);
            if (lfs2 == null) continue;
            this.ac(1, cib2.ordinal());
            this.cCy.i(mck.uvQ.bD(string, cib2.ordinal()));
        }
    }

    public List<cib> akF() {
        if (this.cCy.aan() == null || this.cCy.aan().isEmpty()) {
            return null;
        }
        return null;
    }

    public void doTick(ldz ldz2) {
        if (!$assertionsDisabled) {
            lea.epN();
            if (!cid.eAW) {
                throw new AssertionError();
            }
        }
        if (this.cST == null || this.cST.isEmpty()) {
            return;
        }
        this.cSU.setTimeInMillis(System.currentTimeMillis());
        this.abo -= ldz2.qwh;
        if (this.abo > 0.0) {
            return;
        }
        this.abo = 1.0;
        Iterator<Map.Entry<cib, lfs<String, Double>>> iterator = this.cST.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<cib, lfs<String, Double>> entry = iterator.next();
            lfs<String, Double> lfs2 = entry.getValue();
            Object s = lfs2.reY;
            lfs2.reY = (Double)lfs2.reY - 1.0;
            Double d2 = lfs2.reY;
            int n = ldz.dW((Double)lfs2.reY);
            if ((Double)lfs2.reY == 60.0 || (Double)lfs2.reY == 120.0 || (double)n == 300.0) {
                this.cCy.i(mck.uvP.bD(entry.getKey().ordinal(), lfs2.reY));
            }
            if (!((Double)lfs2.reY <= 0.0)) continue;
            this.ac(1, entry.getKey().ordinal());
            iterator.remove();
            this.cwP.a(2307, entry.getKey().ordinal(), -1.0);
            this.cCy.i(mck.uvO.bD(entry.getKey().ordinal(), lfs2.reX));
        }
    }

    public void a(nm nm2) {
        if (nm2.aDy.aEe != null) {
            for (ov ov2 : nm2.aDy.aEe) {
                cib cib2 = cib.getValueByName(ov2.aGn);
                if (cib2 == null) {
                    assert (false) : "Invalid perk : " + ov2.aGn;
                    continue;
                }
                cia cia2 = lea.epN().a(cib2);
                if (cia2 == null) {
                    assert (false) : "Perk : " + ov2.aGn + " info is missing.";
                    continue;
                }
                if (!cia2.aON()) {
                    assert (false) : "Perk : " + ov2.aGn + " is not a clan perk.";
                    continue;
                }
                this.cST.put(cib2, new lfs<String, Double>(ov2.aGn, ov2.aGq));
            }
        }
    }

    public void g(nm nm2) {
        if (this.cST == null || this.cST.isEmpty()) {
            return;
        }
        nm2.aDy.aEe = new ov[this.cST.size()];
        int n = 0;
        for (Map.Entry<cib, lfs<String, Double>> entry : this.cST.entrySet()) {
            nm2.aDy.aEe[n] = new ov(entry.getKey().name(), (Double)entry.getValue().reY);
            ++n;
        }
    }

    private void ac(int n, int n2) {
        Map map = this.cCy.ZU();
        for (bbr bbr2 : map.values()) {
            if (!bbr2.qf()) continue;
            this.c(n, n2, bbr2.abB());
        }
    }

    private void c(int n, int n2, ldv ldv2) {
        eel eel2 = (eel)this.MessageDelegator.h(12847, this.getGUID(), ldv2);
        eel2.DV(n);
        eel2.DW(n2);
        this.MessageDelegator.F(eel2);
    }

    private void a(int[] nArray, ldv ldv2) {
        enc enc2 = (enc)this.MessageDelegator.h(13932, this.getGUID(), ldv2);
        enc2.Z(nArray);
        this.MessageDelegator.E(enc2);
    }

    public void a(emr emr2) {
        int n = emr2.bEz();
        switch (n) {
            case 13931: {
                this.a((enb)emr2);
            }
        }
    }

    public bbx[] akG() {
        if (this.cST == null || this.cST.isEmpty()) {
            return null;
        }
        bbx[] bbxArray = new bbx[this.cST.size()];
        int n = 0;
        for (Map.Entry<cib, lfs<String, Double>> entry : this.cST.entrySet()) {
            bbx bbx2 = new bbx();
            bbx2.ke(entry.getKey().ordinal());
            bbx2.aM((Double)entry.getValue().reY);
            bbxArray[n] = bbx2;
            ++n;
        }
        return bbxArray;
    }
}

