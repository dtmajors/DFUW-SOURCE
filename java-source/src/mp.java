/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 *  lcr
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class mp
extends btk {
    private static final String TC = "SFQuestReactivationManager";
    private ha azk;
    private Map<Integer, om> aza;
    private Map<String, List<Integer>> azl = lcn.emw();
    private Map<ldv, List<Integer>> azm = lcn.emw();
    private int azn = 0;
    private int azo = 0;
    private Map<ldv, List<lfs<ldv, Integer>>> azp = lcn.emw();
    private Map<ldv, Integer> azq = lcn.emw();

    public mp(ha ha2, Map<Integer, om> map) {
        this.azk = ha2;
        this.aza = map;
        if (this.aza == null || this.aza.isEmpty()) {
            this.azk.jA().ah(true);
            this.rm();
        }
    }

    public void ri() {
        this.rj();
    }

    private void rj() {
        for (om om2 : this.aza.values()) {
            List<Integer> list = this.azl.get(om2.ayB);
            if (list == null) {
                list = lcn.emv();
                list.add(om2.ayK);
                this.azl.put(om2.ayB, list);
                fjx fjx2 = (fjx)this.MessageDelegator.h(11790, this.getGUID(), lcr.qEm);
                fjx2.ga(om2.ayB);
                fjx2.jM(true);
                fjx2.lf(true);
                this.MessageDelegator.F(fjx2);
                continue;
            }
            list.add(om2.ayK);
        }
    }

    private void a(fjy fjy2) {
        ldv ldv2 = fjy2.atp();
        String string = fjy2.arX();
        assert (ldv2 != null);
        assert (string != null);
        if (ldv2.equals(lcr.qAC)) {
            lfn.b(5, TC, "handleInteractionGlobalGUIDResponceMessage() Vendor  : " + string + " is not registered. All Quests from this vendor will be removed from player");
            this.azl.remove(string);
            Iterator<om> iterator = this.aza.values().iterator();
            while (iterator.hasNext()) {
                om om2 = iterator.next();
                if (!om2.ayB.equalsIgnoreCase(string)) continue;
                iterator.remove();
                String string2 = lea.eoU().Ch(om2.ayK);
                lfn.b(5, TC, "handleInteractionGlobalGUIDResponceMessage() Quest ID [" + om2.toString() + " Removed From Player [" + this.azk.iU() + "]");
            }
            if (this.azl.isEmpty() && this.azm.isEmpty()) {
                this.azk.jA().ah(true);
                this.rm();
            }
            return;
        }
        this.azm.put(ldv2, this.azl.remove(string));
        if (this.azl.isEmpty()) {
            this.rk();
        }
    }

    private void rk() {
        for (Map.Entry<ldv, List<Integer>> entry : this.azm.entrySet()) {
            ldv ldv2 = entry.getKey();
            List<Integer> list = entry.getValue();
            int[] nArray = new int[list.size()];
            for (int i = 0; i < list.size(); ++i) {
                nArray[i] = list.get(i);
            }
            gcv gcv2 = (gcv)this.MessageDelegator.h(10254, this.getGUID(), ldv2);
            gcv2.iOV = nArray;
            this.MessageDelegator.F(gcv2);
            ++this.azn;
        }
        this.azm.clear();
    }

    private void a(gcw gcw2) {
        ldv ldv2 = gcw2.aO();
        ldv[] ldvArray = gcw2.jdz;
        int[] nArray = gcw2.iOV;
        assert (ldvArray.length == nArray.length);
        ArrayList<ldv> arrayList = lcn.emv();
        ArrayList<Integer> arrayList2 = lcn.emv();
        for (int i = 0; i < ldvArray.length; ++i) {
            ldv ldv3 = ldvArray[i];
            int n = nArray[i];
            if (!ldv3.equals(lcr.qAC)) {
                arrayList.add(ldv3);
                arrayList2.add(n);
                continue;
            }
            dty dty2 = lea.eoU().Cf(n);
            String string = dty2 != null ? dty2.Name : "";
            lfn.b(5, TC, "requestComplexQuestGUIDS() Removing Quest " + string + " With ID " + n + " For Player " + this.azk.getGUID() + " Vendor " + gcw2.aO());
            this.aza.remove(n);
        }
        if (arrayList.isEmpty()) {
            if (this.azp.isEmpty() && this.azq.isEmpty()) {
                this.azk.jA().ah(true);
                this.rm();
            }
            return;
        }
        ArrayList arrayList3 = lcn.emv();
        for (int i = 0; i < arrayList.size(); ++i) {
            arrayList3.add(new lfs(arrayList.get(i), arrayList2.get(i)));
        }
        this.azp.put(ldv2, arrayList3);
        --this.azn;
        if (this.azn != 0) {
            return;
        }
        for (ldv ldv4 : this.azp.keySet()) {
            this.bW(ldv4);
        }
        this.rl();
    }

    private void b(fkv fkv2) {
        ldv ldv2 = fkv2.aO();
        if (!this.azq.containsKey(ldv2)) {
            return;
        }
        if (fkv2.ew == -1) {
            int n = fkv2.azg;
            om om2 = this.aza.remove(n);
            assert (om2 != null);
        }
        this.azq.remove(ldv2);
        if (this.azp.isEmpty() && this.azq.isEmpty()) {
            this.azk.jA().ah(true);
            this.rm();
            return;
        }
        this.bW(ldv2);
        this.rl();
    }

    private void bW(ldv ldv2) {
        List<lfs<ldv, Integer>> list = this.azp.get(ldv2);
        if (list == null || list.isEmpty()) {
            return;
        }
        lfs<ldv, Integer> lfs2 = list.remove(0);
        ldv ldv3 = (ldv)lfs2.reX;
        int n = (Integer)lfs2.reY;
        String string = lea.eoU().Ch(n);
        if (!this.aza.containsKey(n)) {
            assert (false);
            return;
        }
        if (ldv3.equals(lcr.qAC)) {
            this.aza.remove(n);
            return;
        }
        om om2 = this.aza.get(n);
        int[] nArray = null;
        int[] nArray2 = null;
        int n2 = 0;
        if (om2.aGd != null && om2.aGd.length > 0) {
            nArray = new int[om2.aGd.length];
            nArray2 = new int[om2.aGd.length];
            for (on on2 : om2.aGd) {
                int n3 = lea.enW().getType(on2.ResourceName);
                if (n3 == -1) {
                    lfn.b(5, TC, "Invalid resource name : " + on2.ResourceName);
                    assert (false);
                    continue;
                }
                nArray[n2] = n3;
                nArray2[n2] = on2.ayN;
                ++n2;
            }
        }
        on[] onArray = (on[])this.MessageDelegator.h(11785, this.getGUID(), ldv2);
        onArray.SA = this.azk.aP();
        onArray.iOY = ldv3;
        onArray.Tr = this.azk.getGUID();
        onArray.dzi = om2.aGc;
        onArray.adA = this.azk.getGUID();
        onArray.dzl = nArray;
        onArray.dzm = nArray2;
        onArray.iPa = true;
        this.MessageDelegator.F((dxq)onArray);
        this.azq.put(ldv2, n);
        ++this.azo;
    }

    private void rl() {
        Iterator<Map.Entry<ldv, List<lfs<ldv, Integer>>>> iterator = this.azp.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<ldv, List<lfs<ldv, Integer>>> entry = iterator.next();
            ldv ldv2 = entry.getKey();
            List<lfs<ldv, Integer>> list = entry.getValue();
            if (!list.isEmpty()) continue;
            iterator.remove();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 11034: {
                gre gre2 = (gre)dxq2;
                int n2 = gre2.jqc;
                int n3 = gre2.iHL;
                int n4 = gre2.jqd;
                ldv ldv2 = gre2.jqf;
                lfn.b(5, TC, "receiveMessage() Message Type " + n2 + " With Tag " + n4 + " Failed With Error Type " + n3);
                lfn.b(5, TC, "receiveMessage() Was Sent To GUID " + ldv2 + " For Player " + this.azk.iU() + " With GUID " + this.azk.getGUID());
                assert (false);
                break;
            }
            case 11791: {
                this.a((fjy)dxq2);
                break;
            }
            case 10255: {
                this.a((gcw)dxq2);
                break;
            }
            case 11786: {
                this.b((fkv)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void rm() {
        this.azl = null;
        this.azm = null;
        this.azp = null;
        this.azq = null;
        this.MessageDelegator.hd(this.getGUID());
    }
}

