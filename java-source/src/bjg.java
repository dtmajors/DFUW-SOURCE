/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class bjg
extends btk
implements bto {
    private bjh dnL = null;
    private List<String> dnM = lcn.emv();
    private List<String> dnN = lcn.emv();
    private List<String> dnO = lcn.emv();
    private List<String> dnP = lcn.emv();
    private List<String> dnQ = lcn.emv();
    private List<String> dnR = lcn.emv();
    private List<String> dnS = lcn.emv();
    private Set<String> dnT = lcn.emx();
    private List<String> dnU = lcn.emv();
    private Set<String> dnV = lcn.emx();
    private Set<String> dnW = lcn.emx();
    private Set<String> dnX = lcn.emx();
    private String dnY;
    private String dnZ;
    private String doa;
    private String dob;
    private String doc;
    private String dod;
    private final float doe = 300.0f;
    private final float dof = 300.0f;
    private final int dog = 150;
    private final int doh = 50;
    private boolean doi = false;
    private final boolean doj = true;
    private final boolean dok = true;
    private boolean dol = false;
    private final int dom = 1;
    private List<String> don = lcn.emv();
    private final boolean doo = true;

    public bjg() {
        this.don.add("Heart of Eanna");
        this.don.add("Sanguine");
        this.don.add("Sandbrook");
        this.don.add("Monkfield");
        this.don.add("Whiteclaw");
        this.don.add("Lyran");
        this.don.add("Urranyr");
        this.don.add("Amurran");
        this.don.add("Maghnir");
        this.don.add("Cor Ymirhal");
        this.don.add("Idawoll");
        this.don.add("Firun");
        this.don.add("Flaming Skull");
        this.don.add("Gulgrumir");
        this.don.add("Okrim");
        this.don.add("Nerzok");
        this.dnY = "Sanguine";
        this.dnM.add(this.dnY);
        this.dnM.add("Heart of Eanna");
        this.dnM.add("Sandbrook");
        this.dnM.add("Monkfield");
        this.dnZ = "Flaming Skull";
        this.dnN.add(this.dnZ);
        this.dnN.add("Okrim");
        this.dnN.add("Firun");
        this.dnN.add("Nerzok");
        this.doa = "Cor Ymirhal";
        this.dnO.add(this.doa);
        this.dnO.add("Maghnir");
        this.dnO.add("Idawoll");
        this.dnO.add("Gulgrumir");
        this.dob = "Amurran";
        this.dnP.add(this.dob);
        this.dnP.add("Lyran");
        this.dnP.add("Whiteclaw");
        this.dnP.add("Urranyr");
        this.dnQ.addAll(this.dnN);
        this.doc = this.dnZ;
        this.dnR.addAll(this.dnP);
        this.dod = this.dob;
        this.dnS.add("intro_area_f19");
        this.dnS.add("intro_area_f14");
        this.dnS.add("intro_area_u26");
        this.dnS.add("intro_area_f06");
        this.dnS.add("intro_area_q26");
        this.dnS.add("intro_area_z20");
        this.dnS.add("intro_area_y11");
        this.dnS.add("intro_area_o06");
        this.dnS.add("intro_area_z15");
        this.dnS.add("intro_area_z06");
        this.dnT.addAll(this.dnM);
        this.dnT.addAll(this.dnN);
        this.dnT.addAll(this.dnO);
        this.dnT.addAll(this.dnP);
        this.dnT.addAll(this.dnQ);
        this.dnT.addAll(this.dnR);
        this.dnT.addAll(this.dnS);
        for (String string : this.dnP) {
            this.dnU.add(string);
        }
        for (String string : this.dnO) {
            this.dnU.add(string);
        }
        for (String string : this.dnN) {
            this.dnU.add(string);
        }
        for (String string : this.dnM) {
            this.dnU.add(string);
        }
        this.dnV.add("Sandbrook");
        this.dnW.add("Heart of Eanna");
    }

    private boolean fE(String string) {
        if (string == null) {
            return false;
        }
        return string.equals(this.dnY) || string.equals(this.dnZ) || string.equals(this.doa) || string.equals(this.dob);
    }

    private int fF(String string) {
        if (this.dnS.contains(string)) {
            return 50;
        }
        return 150;
    }

    private int fG(String string) {
        if (this.dnM.contains(string)) {
            return 3;
        }
        if (this.dnN.contains(string)) {
            return 6;
        }
        if (this.dnO.contains(string)) {
            return 2;
        }
        if (this.dnP.contains(string)) {
            return 4;
        }
        if (this.dnQ.contains(string)) {
            return 1;
        }
        if (this.dnR.contains(string)) {
            return 5;
        }
        if (this.dnS.contains(string)) {
            return 0;
        }
        return -1;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dnL = new bjh();
        this.dnL.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.dnL);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 17431: {
                this.a((ebv)dxq2);
                break;
            }
            case 17433: {
                this.a((ebt)dxq2);
                break;
            }
            case 17440: {
                this.a((ebe)dxq2);
                break;
            }
            case 17437: {
                this.a((ebl)dxq2);
                break;
            }
            case 17441: {
                this.a((ebn)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private String dj(boolean bl2) {
        return this.kO(0);
    }

    private String a(cg.b b2) {
        Set<String> set = null;
        switch (b2) {
            case he: {
                set = this.dnV;
                break;
            }
            case hd: {
                set = this.dnW;
                break;
            }
            default: {
                assert (false);
                set = lcn.emx();
                set.addAll(this.dnV);
                set.addAll(this.dnW);
            }
        }
        ArrayList<String> arrayList = lcn.emv();
        arrayList.addAll(set);
        Collections.shuffle(arrayList);
        for (String string : arrayList) {
            if (this.dnL.fI(string) <= 1) continue;
            return string;
        }
        return this.h(set);
    }

    private String kO(int n) {
        List<String> list = null;
        list = this.don;
        for (String string : list) {
            if (this.dnL.fI(string) <= 1) continue;
            return string;
        }
        for (String string : this.dnU) {
            if (this.dnL.fI(string) <= 1) continue;
            return string;
        }
        return this.apz();
    }

    private String af(List<String> list) {
        int n = lew.fW(0, list.size());
        String string = list.get(n);
        return string;
    }

    private String h(Set<String> set) {
        int n = lew.fW(0, set.size());
        int n2 = 0;
        for (String string : set) {
            if (n2 == n) {
                return string;
            }
            ++n2;
        }
        assert (false);
        Iterator<String> iterator = set.iterator();
        if (iterator.hasNext()) {
            String string;
            string = iterator.next();
            return string;
        }
        return null;
    }

    private String apz() {
        return this.af(this.dnU);
    }

    private void a(ebn ebn2) {
        ebo ebo2 = (ebo)this.MessageDelegator.h(17442, this.getGUID(), ebn2.aO());
        this.MessageDelegator.b(ebn2, ebo2);
        ebo2.azF = this.dj(ebn2.ikZ);
        if (ebo2.azF != null) {
            ebo2.azE = 2;
        }
        this.MessageDelegator.F(ebo2);
    }

    private void a(ebl ebl2) {
        ebm ebm2 = (ebm)this.MessageDelegator.h(17438, this.getGUID(), ebl2.aO());
        this.MessageDelegator.b(ebl2, ebm2);
        cg.b b2 = cg.b.getValueByOrdinal(ebl2.Nationality);
        String string = null;
        string = b2 == cg.b.hc ? this.kO(ebl2.ikK) : this.a(b2);
        bjh.a a2 = this.dnL.fH(string);
        if (a2 == null) {
            lfn.b(5, "SFGlobalPlayerBindStoneMonitor", "handleBindStoneGlobalGetStartingBindStoneRequestMessage() Could not find bindstone.CAN NOT HAPPEN!!!?!?!  ");
            assert (false);
            for (int i = 0; a2 == null && i < 10; ++i) {
                string = this.apz();
                a2 = this.dnL.fH(string);
            }
            if (a2 == null) {
                lfn.b(5, "SFGlobalPlayerBindStoneMonitor", "handleBindStoneGlobalGetStartingBindStoneRequestMessage: Didn't find a bindstone. Stuff will break.");
                return;
            }
        }
        ebm2.azY = a2.azY;
        ebm2.azF = string;
        ebm2.bYY = a2.bYY;
        this.MessageDelegator.F(ebm2);
    }

    private void a(ebt ebt2) {
        ebu ebu2 = (ebu)this.MessageDelegator.h(17434, this.getGUID(), ebt2.aO());
        this.MessageDelegator.b(ebt2, ebu2);
        if (ebt2.ild == null) {
            this.MessageDelegator.F(ebt2);
            return;
        }
        if (ebt2.ild.length == 0) {
            this.MessageDelegator.F(ebt2);
            return;
        }
        int[] nArray = new int[ebt2.ild.length];
        int[] nArray2 = new int[ebt2.ild.length];
        int n = 0;
        for (String string : ebt2.ild) {
            bjh.a a2 = this.dnL.fH(string);
            if (a2 != null) {
                nArray[n] = a2.dow;
                nArray2[n] = this.fF(string);
            } else {
                nArray2[n] = 0;
                nArray[n] = 0;
            }
            ++n;
        }
        ebu2.ild = ebt2.ild;
        ebu2.ile = nArray;
        ebu2.ilf = nArray2;
        this.MessageDelegator.F(ebu2);
    }

    private void a(ebv ebv2) {
        Object object;
        ebw ebw2 = (ebw)this.MessageDelegator.h(17432, this.getGUID(), ebv2.aO());
        this.MessageDelegator.b(ebv2, ebw2);
        ArrayList<String> arrayList = lcn.emv();
        ArrayList<String> arrayList2 = lcn.emv();
        ArrayList<Integer> arrayList3 = lcn.emv();
        ArrayList<ljq> arrayList4 = lcn.emv();
        ArrayList<Float> arrayList5 = lcn.emv();
        ArrayList<Integer> arrayList6 = lcn.emv();
        ArrayList<Integer> arrayList7 = lcn.emv();
        for (String object22 : this.dnM) {
            object = this.dnL.fH(object22);
            if (object == null) continue;
            arrayList.add(object22);
            arrayList2.add(object22);
            arrayList3.add(this.fG(object22));
            arrayList4.add(object.bYY);
            arrayList5.add(Float.valueOf(object.Radius));
            arrayList6.add(object.dow);
            arrayList7.add(this.fF(object22));
        }
        for (String string : this.dnN) {
            object = this.dnL.fH(string);
            if (object == null) continue;
            arrayList.add(string);
            arrayList2.add(string);
            arrayList3.add(this.fG(string));
            arrayList4.add(object.bYY);
            arrayList5.add(Float.valueOf(object.Radius));
            arrayList6.add(object.dow);
            arrayList7.add(this.fF(string));
        }
        for (String string : this.dnO) {
            object = this.dnL.fH(string);
            if (object == null) continue;
            arrayList.add(string);
            arrayList2.add(string);
            arrayList3.add(this.fG(string));
            arrayList4.add(object.bYY);
            arrayList5.add(Float.valueOf(object.Radius));
            arrayList6.add(object.dow);
            arrayList7.add(this.fF(string));
        }
        for (String string : this.dnP) {
            object = this.dnL.fH(string);
            if (object == null) continue;
            arrayList.add(string);
            arrayList2.add(string);
            arrayList3.add(this.fG(string));
            arrayList4.add(object.bYY);
            arrayList5.add(Float.valueOf(object.Radius));
            arrayList6.add(object.dow);
            arrayList7.add(this.fF(string));
        }
        for (String string : this.dnQ) {
            object = this.dnL.fH(string);
            if (object == null) continue;
            arrayList.add(string);
            arrayList2.add(string);
            arrayList3.add(this.fG(string));
            arrayList4.add(object.bYY);
            arrayList5.add(Float.valueOf(object.Radius));
            arrayList6.add(object.dow);
            arrayList7.add(this.fF(string));
        }
        for (String string : this.dnR) {
            object = this.dnL.fH(string);
            if (object == null) continue;
            arrayList.add(string);
            arrayList2.add(string);
            arrayList3.add(this.fG(string));
            arrayList4.add(object.bYY);
            arrayList5.add(Float.valueOf(object.Radius));
            arrayList6.add(object.dow);
            arrayList7.add(this.fF(string));
        }
        for (String string : this.dnS) {
            object = this.dnL.fH(string);
            if (object == null) continue;
            arrayList.add(string);
            arrayList2.add(string);
            arrayList3.add(this.fG(string));
            arrayList4.add(object.bYY);
            arrayList5.add(Float.valueOf(object.Radius));
            arrayList6.add(object.dow);
            arrayList7.add(this.fF(string));
        }
        String[] stringArray = new String[arrayList.size()];
        arrayList.toArray(stringArray);
        String[] stringArray2 = new String[arrayList2.size()];
        arrayList2.toArray(stringArray2);
        object = new Integer[arrayList3.size()];
        arrayList3.toArray((T[])object);
        int[] nArray = new int[arrayList3.size()];
        for (int i = 0; i < ((Integer[])object).length; ++i) {
            nArray[i] = object[i];
        }
        ljq[] ljqArray = new ljq[arrayList4.size()];
        arrayList4.toArray(ljqArray);
        Float[] floatArray = new Float[arrayList5.size()];
        arrayList5.toArray(floatArray);
        float[] fArray = new float[arrayList5.size()];
        for (int i = 0; i < floatArray.length; ++i) {
            fArray[i] = floatArray[i].floatValue();
        }
        object = new Integer[arrayList6.size()];
        arrayList6.toArray((T[])object);
        int[] nArray2 = new int[arrayList6.size()];
        for (int i = 0; i < ((Integer[])object).length; ++i) {
            nArray2[i] = object[i];
        }
        object = new Integer[arrayList7.size()];
        arrayList7.toArray((T[])object);
        int[] nArray3 = new int[arrayList7.size()];
        for (int i = 0; i < ((Integer[])object).length; ++i) {
            nArray3[i] = object[i];
        }
        ebw2.ilg = stringArray;
        ebw2.ilh = stringArray2;
        ebw2.ilj = fArray;
        ebw2.ili = ljqArray;
        ebw2.ilk = nArray2;
        ebw2.ill = nArray3;
        ebw2.ilm = nArray;
        this.MessageDelegator.F(ebw2);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.MessageDelegator.hd(this.dnL.getGUID());
        this.dnL = null;
    }

    private void a(ebe ebe2) {
        if (ebe2.ikU == null || ebe2.ikU.length < this.dnT.size()) {
            String[] stringArray = new String[this.dnT.size()];
            this.dnT.toArray(stringArray);
            ebd ebd2 = (ebd)this.MessageDelegator.h(17439, this.getGUID(), lcr.qEq);
            ebd2.ikT = stringArray;
            this.MessageDelegator.F(ebd2);
        } else {
            this.apA();
        }
    }

    private void apA() {
        for (String string : this.dnM) {
            this.dnL.a(string, 300.0f, 150);
        }
        for (String string : this.dnN) {
            this.dnL.a(string, 300.0f, 150);
        }
        for (String string : this.dnO) {
            this.dnL.a(string, 300.0f, 150);
        }
        for (String string : this.dnP) {
            this.dnL.a(string, 300.0f, 150);
        }
        for (String string : this.dnQ) {
            this.dnL.a(string, 300.0f, 150);
        }
        for (String string : this.dnR) {
            this.dnL.a(string, 300.0f, 150);
        }
        for (String string : this.dnS) {
            this.dnL.a(string, 300.0f, 50);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.doi) {
            String[] stringArray = new String[this.dnT.size()];
            this.dnT.toArray(stringArray);
            ebd ebd2 = (ebd)this.MessageDelegator.h(17439, this.getGUID(), lcr.qEq);
            ebd2.ikT = stringArray;
            this.MessageDelegator.F(ebd2);
            this.doi = true;
        }
    }
}

