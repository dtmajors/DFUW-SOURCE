/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  cew
 *  cug
 *  dgj
 *  lkv
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class cmt
extends btk {
    private List eLW = lcn.emv();
    private List eLX = lcn.emv();
    private List eLY = lcn.emv();
    private static Map eLZ = null;
    private ldz eMa = null;
    private cew dLR = null;
    private double eMb = 3.0;
    private double eMc = 0.2;
    private double eMd = -2.0;
    private int eMe = -2;
    private static float bpE = 30.0f;
    private static float aSc = 5.0f;
    private static int eMf = 360;
    private static int eMg = 360;
    private static ljq eMh = new ljq(0.0f, 1.0f, 0.0f);
    private static long dKH = 0L;
    private static boolean eMi = false;
    private static boolean eMj = false;
    private double eMk = 0.0;
    private double eMl = 0.6;
    private double eMm = 0.4;
    private boolean eMn = false;
    private Random eMo = new Random();

    public cew axF() {
        return this.dLR;
    }

    public void b(cew cew2) {
        this.dLR = cew2;
    }

    @Override
    public void initialize() {
        super.initialize();
        if (eLZ == null) {
            this.aTI();
        }
    }

    @Override
    public void cleanUp() {
        Object object2;
        super.cleanUp();
        Iterator iterator = this.eLW.iterator();
        while (iterator.hasNext()) {
            object2 = (dfc)iterator.next();
            iterator.remove();
            this.MessageDelegator.hd(((amf)object2).getGUID());
        }
        iterator = this.eLX.iterator();
        while (iterator.hasNext()) {
            object2 = (dfc)iterator.next();
            iterator.remove();
            this.MessageDelegator.hd(((amf)object2).getGUID());
        }
        for (Object object2 : this.eLY) {
            kne kne2 = (kne)this.MessageDelegator.h(776);
            kne2.lQ(false);
            kne2.wC(false);
            kne2.wD(false);
            kne2.jM(true);
            kne2.xo(false);
            kne2.qj((ldv)object2);
            kne2.qk((ldv)object2);
            kne2.kX((ldv)object2);
            kne2.ts(this.getGUID());
            kne2.Zo(2);
            this.MessageDelegator.a(kne2);
        }
        this.eLW = null;
        this.eLX = null;
        this.eLY = null;
    }

    public void doTick(ldz ldz2) {
        this.eMa = ldz2;
        if (this.dLR == null) {
            return;
        }
        this.aTH();
    }

    private void aTB() {
        bvf bvf2 = (bvf)this.dLR.aAG();
        if (!eLZ.containsKey(new Integer(bvf2.az()))) {
            return;
        }
        lcb lcb2 = bvf2.azD();
        if (lcb2 == null || lcb2.qvQ == null) {
            return;
        }
        if (lcb2.qvR == null) {
            return;
        }
        int n = lkv.adp((int)lcb2.qvR.etQ());
        if (lcb2.qvT == this.eMd && lcb2.qvR.etO() == this.eMe) {
            return;
        }
        this.eMe = lcb2.qvR.etO();
        this.eMd = lcb2.qvT;
        switch (n) {
            case 851968: 
            case 0x1000000: {
                if (this.eMc < Math.random()) {
                    return;
                }
                this.aTD();
                break;
            }
            case 0xB000000: {
                this.aTE();
                break;
            }
            case 0x3000000: {
                this.aTG();
                break;
            }
            case 0xA000000: {
                this.aTF();
                break;
            }
        }
    }

    private void aTC() {
        bvf bvf2 = (bvf)this.dLR.aAG();
        lcb lcb2 = bvf2.azD();
        if (lcb2 == null || lcb2.qvQ == null) {
            return;
        }
        int n = lkv.adp((int)lcb2.qvQ.etQ());
        switch (n) {
            case 983040: {
                if (this.eLX.isEmpty()) {
                    return;
                }
                if (this.eMk + this.eMl > this.eMa.rgz) {
                    return;
                }
                this.eMk = this.eMa.rgz;
                int n2 = this.eMo.nextInt(this.eLX.size());
                dfc dfc2 = (dfc)this.eLX.get(n2);
                dfc2.play();
                break;
            }
            case 0x100000: {
                if (this.eLX.isEmpty()) {
                    return;
                }
                if (this.eMk + this.eMm > this.eMa.rgz) {
                    return;
                }
                this.eMk = this.eMa.rgz;
                int n3 = this.eMo.nextInt(this.eLX.size());
                dfc dfc3 = (dfc)this.eLX.get(n3);
                dfc3.play();
                break;
            }
        }
    }

    private void aTD() {
        bvf bvf2 = (bvf)this.dLR.aAG();
        List list = (List)eLZ.get(new Integer(bvf2.az()));
        assert (list != null);
        if (list.isEmpty()) {
            return;
        }
        int n = this.eMo.nextInt(list.size());
        String string = (String)list.get(n);
        this.a(bvf2.av(), string);
    }

    private void aTE() {
        bvf bvf2 = (bvf)this.dLR.aAG();
    }

    private void aTF() {
        bvf bvf2 = (bvf)this.dLR.aAG();
    }

    private void aTG() {
        bvf bvf2 = (bvf)this.dLR.aAG();
    }

    private void a(ljq ljq2, String string) {
        dfc dfc2 = (dfc)dgj.getAtomFactory().Af(4);
        dfc2.setGUID(this.MessageDelegator.bzv());
        dfc2.setActive(true);
        dfc2.setConeOrientation(eMh);
        dfc2.setConeOutsideVolume(dKH);
        dfc2.setInsideConeAngle(eMf);
        dfc2.setLooping(eMi);
        dfc2.hO(true);
        dfc2.setMaxDistance(bpE);
        dfc2.setMinDistance(aSc);
        dfc2.setMode(0);
        dfc2.setOutsideConeAngle(eMg);
        dfc2.setPlayingOnce(eMj);
        dfc2.bi(new ljq());
        dfc2.setXMLFileName(string);
        dfc2.bK(ljq2);
        this.MessageDelegator.a(dfc2);
        dfc2.o(this.eMa.rgz);
        this.eLW.add(dfc2);
    }

    private void aTH() {
        if (this.eLW.isEmpty()) {
            return;
        }
        Iterator iterator = this.eLW.iterator();
        while (iterator.hasNext()) {
            dfc dfc2 = (dfc)iterator.next();
            if (!(dfc2.aAw() + this.eMb < this.eMa.rgz)) continue;
            iterator.remove();
            dey.bls().b(dfc2);
        }
    }

    private void aTI() {
        eLZ = lcn.emw();
        String[] stringArray = new String[]{"audio/player/human/female/df_human_female_aggro_1.xml", "audio/player/human/female/df_human_female_aggro_2.xml", "audio/player/human/female/df_human_female_aggro_3.xml", "audio/player/human/female/df_human_female_aggro_4.xml", "audio/player/human/female/df_human_female_aggro_5.xml", "audio/player/human/female/df_human_female_aggro_6.xml", "audio/player/human/female/df_human_female_aggro_7.xml", "audio/player/human/female/df_human_female_aggro_8.xml"};
        String[] stringArray2 = new String[]{"audio/player/human/male/df_human_male_aggro_1.xml", "audio/player/human/male/df_human_male_aggro_2.xml", "audio/player/human/male/df_human_male_aggro_3.xml", "audio/player/human/male/df_human_male_aggro_4.xml", "audio/player/human/male/df_human_male_aggro_5.xml", "audio/player/human/male/df_human_male_aggro_6.xml", "audio/player/human/male/df_human_male_aggro_7.xml", "audio/player/human/male/df_human_male_aggro_8.xml"};
        String[] stringArray3 = new String[]{"audio/player/ork/male/df_ork_male_aggro_1.xml", "audio/player/ork/male/df_ork_male_aggro_2.xml", "audio/player/ork/male/df_ork_male_aggro_3.xml", "audio/player/ork/male/df_ork_male_aggro_4.xml", "audio/player/ork/male/df_ork_male_aggro_5.xml", "audio/player/ork/male/df_ork_male_aggro_6.xml", "audio/player/ork/male/df_ork_male_aggro_7.xml", "audio/player/ork/male/df_ork_male_aggro_8.xml"};
        String[] stringArray4 = new String[]{"audio/player/ork/female/df_ork_female_aggro_1.xml", "audio/player/ork/female/df_ork_female_aggro_2.xml", "audio/player/ork/female/df_ork_female_aggro_3.xml", "audio/player/ork/female/df_ork_female_aggro_4.xml", "audio/player/ork/female/df_ork_female_aggro_5.xml", "audio/player/ork/female/df_ork_female_aggro_6.xml", "audio/player/ork/female/df_ork_female_aggro_7.xml", "audio/player/ork/female/df_ork_female_aggro_8.xml"};
        String[] stringArray5 = new String[]{"audio/player/alfar/male/df_alfar_male_aggro_1.xml", "audio/player/alfar/male/df_alfar_male_aggro_2.xml", "audio/player/alfar/male/df_alfar_male_aggro_3.xml", "audio/player/alfar/male/df_alfar_male_aggro_4.xml", "audio/player/alfar/male/df_alfar_male_aggro_5.xml", "audio/player/alfar/male/df_alfar_male_aggro_6.xml", "audio/player/alfar/male/df_alfar_male_aggro_7.xml", "audio/player/alfar/male/df_alfar_male_aggro_8.xml"};
        String[] stringArray6 = new String[]{"audio/player/alfar/female/df_alfar_female_aggro_1.xml", "audio/player/alfar/female/df_alfar_female_aggro_2.xml", "audio/player/alfar/female/df_alfar_female_aggro_3.xml", "audio/player/alfar/female/df_alfar_female_aggro_4.xml", "audio/player/alfar/female/df_alfar_female_aggro_5.xml", "audio/player/alfar/female/df_alfar_female_aggro_6.xml", "audio/player/alfar/female/df_alfar_female_aggro_7.xml", "audio/player/alfar/female/df_alfar_female_aggro_8.xml"};
        String[] stringArray7 = new String[]{"audio/player/dwarf/male/df_dwarf_male_aggro_1.xml", "audio/player/dwarf/male/df_dwarf_male_aggro_2.xml", "audio/player/dwarf/male/df_dwarf_male_aggro_3.xml", "audio/player/dwarf/male/df_dwarf_male_aggro_4.xml", "audio/player/dwarf/male/df_dwarf_male_aggro_5.xml", "audio/player/dwarf/male/df_dwarf_male_aggro_6.xml", "audio/player/dwarf/male/df_dwarf_male_aggro_7.xml", "audio/player/dwarf/male/df_dwarf_male_aggro_8.xml"};
        String[] stringArray8 = new String[]{"audio/player/dwarf/female/df_dwarf_female_aggro_1.xml", "audio/player/dwarf/female/df_dwarf_female_aggro_2.xml", "audio/player/dwarf/female/df_dwarf_female_aggro_3.xml", "audio/player/dwarf/female/df_dwarf_female_aggro_4.xml", "audio/player/dwarf/female/df_dwarf_female_aggro_5.xml", "audio/player/dwarf/female/df_dwarf_female_aggro_6.xml", "audio/player/dwarf/female/df_dwarf_female_aggro_7.xml", "audio/player/dwarf/female/df_dwarf_female_aggro_8.xml"};
        String[] stringArray9 = new String[]{"audio/player/mahirim/male/df_wolf_male_aggro_1.xml", "audio/player/mahirim/male/df_wolf_male_aggro_2.xml", "audio/player/mahirim/male/df_wolf_male_aggro_3.xml", "audio/player/mahirim/male/df_wolf_male_aggro_4.xml", "audio/player/mahirim/male/df_wolf_male_aggro_5.xml", "audio/player/mahirim/male/df_wolf_male_aggro_6.xml", "audio/player/mahirim/male/df_wolf_male_aggro_7.xml", "audio/player/mahirim/male/df_wolf_male_aggro_8.xml"};
        String[] stringArray10 = new String[]{"audio/player/mahirim/female/df_wolf_female_aggro_1.xml", "audio/player/mahirim/female/df_wolf_female_aggro_2.xml", "audio/player/mahirim/female/df_wolf_female_aggro_3.xml", "audio/player/mahirim/female/df_wolf_female_aggro_4.xml", "audio/player/mahirim/female/df_wolf_female_aggro_5.xml", "audio/player/mahirim/female/df_wolf_female_aggro_6.xml", "audio/player/mahirim/female/df_wolf_female_aggro_7.xml", "audio/player/mahirim/female/df_wolf_female_aggro_8.xml"};
        String[] stringArray11 = new String[]{"audio/player/mirdain/male/df_mirdain_male_aggro_1.xml", "audio/player/mirdain/male/df_mirdain_male_aggro_2.xml", "audio/player/mirdain/male/df_mirdain_male_aggro_3.xml", "audio/player/mirdain/male/df_mirdain_male_aggro_4.xml", "audio/player/mirdain/male/df_mirdain_male_aggro_5.xml", "audio/player/mirdain/male/df_mirdain_male_aggro_6.xml", "audio/player/mirdain/male/df_mirdain_male_aggro_7.xml", "audio/player/mirdain/male/df_mirdain_male_aggro_8.xml"};
        String[] stringArray12 = new String[]{"audio/player/mirdain/female/df_mirdain_female_aggro_1.xml", "audio/player/mirdain/female/df_mirdain_female_aggro_2.xml", "audio/player/mirdain/female/df_mirdain_female_aggro_3.xml", "audio/player/mirdain/female/df_mirdain_female_aggro_4.xml", "audio/player/mirdain/female/df_mirdain_female_aggro_5.xml", "audio/player/mirdain/female/df_mirdain_female_aggro_6.xml", "audio/player/mirdain/female/df_mirdain_female_aggro_7.xml", "audio/player/mirdain/female/df_mirdain_female_aggro_8.xml"};
        ArrayList<String> arrayList = lcn.bx(stringArray6);
        ArrayList<String> arrayList2 = lcn.bx(stringArray5);
        eLZ.put(new Integer(cug.fhO), arrayList);
        eLZ.put(new Integer(cug.fhP), arrayList2);
        ArrayList<String> arrayList3 = lcn.bx(stringArray7);
        ArrayList<String> arrayList4 = lcn.bx(stringArray8);
        eLZ.put(new Integer(cug.fhQ), arrayList4);
        eLZ.put(new Integer(cug.fhR), arrayList3);
        ArrayList<String> arrayList5 = lcn.bx(stringArray2);
        ArrayList<String> arrayList6 = lcn.bx(stringArray);
        eLZ.put(new Integer(cug.fhS), arrayList6);
        eLZ.put(new Integer(cug.fhT), arrayList5);
        ArrayList<String> arrayList7 = lcn.bx(stringArray9);
        ArrayList<String> arrayList8 = lcn.bx(stringArray10);
        eLZ.put(new Integer(cug.fhU), arrayList8);
        eLZ.put(new Integer(cug.fhV), arrayList7);
        ArrayList<String> arrayList9 = lcn.bx(stringArray11);
        ArrayList<String> arrayList10 = lcn.bx(stringArray12);
        eLZ.put(new Integer(cug.fhW), arrayList10);
        eLZ.put(new Integer(cug.fhX), arrayList9);
        ArrayList<String> arrayList11 = lcn.bx(stringArray3);
        ArrayList<String> arrayList12 = lcn.bx(stringArray4);
        eLZ.put(new Integer(cug.fhY), arrayList12);
        eLZ.put(new Integer(cug.fhZ), arrayList11);
    }
}

