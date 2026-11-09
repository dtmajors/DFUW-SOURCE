/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lqf
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class kk
extends jk {
    @Override
    public void nU() {
        this.a(a.apJ.toString().toLowerCase(), hc.aaV, lqf.rXP, mhs.STRING);
        this.a(a.apK.toString().toLowerCase(), hc.aaV, lqf.saH, mhs.STRING);
        this.a(a.apL.toString().toLowerCase(), hc.aaV, lqf.rXR, mhs.STRING);
        this.a(a.apM.toString().toLowerCase(), hc.aaV, lqf.saH, mhs.STRING);
        this.a(a.apN.toString().toLowerCase(), hc.aaV, lqf.saJ, mhs.STRING);
        this.a(a.apO.toString().toLowerCase(), hc.aaV, lqf.saK, mhs.STRING);
        this.a(a.apP.toString().toLowerCase(), hc.aaV, lqf.saL, mhs.STRING);
        this.a(a.apQ.toString().toLowerCase(), hc.aaV, lqf.saM, mhs.STRING);
        this.a(a.apR.toString().toLowerCase(), hc.aaV, lqf.saN, mhs.STRING, mhs.FLOAT);
        this.a(a.apS.toString().toLowerCase(), hc.aaV, lqf.saO);
        this.a(a.apT.toString().toLowerCase(), hc.aaV, lqf.saP);
        this.a(a.apU.toString().toLowerCase(), hc.aaV, lqf.saQ);
        this.a(a.apV.toString().toLowerCase(), hc.aaV, lqf.rXQ, mhs.STRING);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bw(jj2.akV);
        if (a2 == null) {
            jj2.b(lqg.scy.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case apJ: {
                this.a(jj2, 1, false, false);
                break;
            }
            case apK: {
                this.a(jj2, 1, true, false);
                break;
            }
            case apL: {
                this.a(jj2, 2, false, false);
                break;
            }
            case apM: {
                this.a(jj2, 2, true, false);
                break;
            }
            case apN: {
                this.a(jj2, 3, false, false);
                break;
            }
            case apO: {
                this.a(jj2, 3, true, false);
                break;
            }
            case apP: {
                this.a(jj2, 1, false, true);
                break;
            }
            case apQ: {
                this.a(jj2, 1, true, true);
                break;
            }
            case apR: {
                this.bc(jj2);
                break;
            }
            case apS: {
                this.ow();
                break;
            }
            case apT: {
                this.ox();
                break;
            }
            case apU: {
                this.oy();
                break;
            }
            case apV: {
                this.bb(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private a bw(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    private void a(jj jj2, int n, boolean bl, boolean bl2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        List<cte> list = this.ba(string);
        ArrayList<cte> arrayList = lcn.emv();
        for (cte object2 : list) {
            if (lea.enW().isDescendant(object2.ResourceType, cug.fkd)) continue;
            arrayList.add(object2);
        }
        list.removeAll(arrayList);
        if (list.isEmpty()) {
            lfn.b(5, "SFConsoleCommandHandlerInventory", "handleEquip() Could not parse equipment");
            jj2.b(lqg.scz.bD(jj2.akV, string), true);
            return;
        }
        cte[] cteArray = new cte[list.size()];
        list.toArray(cteArray);
        erm erm2 = (erm)this.MessageDelegator.h(16644, this.GUID, this.nW().getGUID());
        erm2.aZF = n;
        erm2.dtP = cteArray;
        erm2.iyH = bl;
        erm2.iyI = bl2;
        this.MessageDelegator.F(erm2);
        jj2.b(lqg.scA.bD(string), false);
    }

    private void bb(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        List<cte> list = this.ba(string);
        boolean bl = false;
        Map<Integer, cte> map = lcn.emw();
        Set<Integer> set = lcn.emx();
        for (cte cte2 : list) {
            if (!lea.enW().isDescendant(cte2.ResourceType, cug.fkd)) {
                jj2.a(lqg.scC.bD(cte2.ResourceType), true);
                bl = true;
                continue;
            }
            ctu ctu2 = cwy.bm(1, cte2.ResourceType);
            if (ctu2 == null) {
                jj2.a(lqg.scD.bD(cte2.ResourceType), true);
                bl = true;
                continue;
            }
            for (ctm ctm2 : ctu2.Ingredients) {
                if (!lea.enW().isDescendant(ctm2.ResourceType, cug.fkd)) {
                    jj2.a(lqg.scC.bD(ctm2.ResourceType), true);
                    bl = true;
                    continue;
                }
                cte cte3 = (cte)map.get(ctm2.ResourceType);
                if (cte3 == null) {
                    cte3 = new cte();
                    cte3.ResourceType = ctm2.ResourceType;
                    map.put(ctm2.ResourceType, cte3);
                }
                cte3.asi = cte3.asi + ctm2.asi * (cte2.asi == 0 ? 1 : cte2.asi);
            }
            if (bl || set.contains(cte2.ResourceType)) continue;
            for (ctm ctm2 : ctu2.Ingredients) {
                jj2.a(lqg.scF.bD(cte2.ResourceType, ctm2.asi, ctm2.ResourceType), false);
            }
            set.add(cte2.ResourceType);
        }
        if (map.isEmpty()) {
            jj2.b(lqg.scE.bD(string), bl);
            return;
        }
        erm erm2 = (erm)this.MessageDelegator.h(16644, this.GUID, this.nW().getGUID());
        erm2.aZF = 1;
        erm2.dtP = map.values().toArray(new cte[map.size()]);
        erm2.iyH = false;
        erm2.iyI = false;
        this.MessageDelegator.F(erm2);
        jj2.b(lqg.scB.bD(string), bl);
    }

    private void bc(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFConsoleCommandHandlerInventory", "setItemDurability() ResourceName '" + string + "' is invalid.");
            return;
        }
        float f = ((mhn)jj2.cA((int)1)).Pz;
        fmr fmr2 = (fmr)this.MessageDelegator.h(7976, this.GUID, this.nW().getGUID());
        fmr2.ilu = 6;
        fmr2.ResourceType = n;
        fmr2.iQv = f;
        this.d(this.nW().getGUID(), fmr2);
    }

    private void ow() {
        fmr fmr2 = (fmr)this.MessageDelegator.h(7976, this.GUID, this.nW().getGUID());
        fmr2.ilu = 1;
        this.d(this.nW().getGUID(), fmr2);
    }

    private void ox() {
        fmr fmr2 = (fmr)this.MessageDelegator.h(7976, this.GUID, this.nW().getGUID());
        fmr2.ilu = 2;
        this.d(this.nW().getGUID(), fmr2);
    }

    private void oy() {
        fmr fmr2 = (fmr)this.MessageDelegator.h(7976, this.GUID, this.nW().getGUID());
        fmr2.ilu = 3;
        this.d(this.nW().getGUID(), fmr2);
    }
}

