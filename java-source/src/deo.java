/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  dgj
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class deo
extends btk
implements bto {
    private List eLW = lcn.emv();
    private Map eLZ = lcn.emw();
    private ldz eMa = null;
    private double eMb = 2.0;
    private float bpE = 30.0f;
    private float aSc = 5.0f;
    private int eMf = 360;
    private int eMg = 360;
    private ljq eMh = new ljq(0.0f, 1.0f, 0.0f);
    private long dKH = 0L;
    private boolean eMi = false;
    private boolean eMj = false;
    private float gmD = 0.2f;
    double gmE = 0.0;

    public deo() {
        this.aTI();
    }

    @Override
    public void doTick(ldz ldz2) {
        this.eMa = ldz2;
        this.aTH();
    }

    public void b(ldv ldv2, ljq ljq2, boolean bl) {
        if (ldv2 == null) {
            return;
        }
        if (ljq2 == null) {
            return;
        }
        if (bl && !lgp.erA().cS(this.gmD)) {
            lfn.b(0, this.getClass().getSimpleName(), "startHitSound() :: Not Playing Sound!!!");
            return;
        }
        if (this.eMa.rgz - this.gmE < 4.0) {
            return;
        }
        this.gmE = this.eMa.rgz;
        String string = this.mB(ldv2);
        if (string == null) {
            return;
        }
        this.a(ljq2, string);
    }

    private void a(ljq ljq2, String string) {
        dfc dfc2 = (dfc)dgj.getAtomFactory().Af(4);
        dfc2.setGUID(this.MessageDelegator.bzv());
        dfc2.setActive(true);
        dfc2.setConeOrientation(this.eMh);
        dfc2.setConeOutsideVolume(this.dKH);
        dfc2.setInsideConeAngle(this.eMf);
        dfc2.setLooping(this.eMi);
        dfc2.hO(true);
        dfc2.setMaxDistance(this.bpE);
        dfc2.setMinDistance(this.aSc);
        dfc2.setMode(0);
        dfc2.setOutsideConeAngle(this.eMg);
        dfc2.setPlayingOnce(this.eMj);
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

    private String mB(ldv ldv2) {
        bvd bvd2 = (bvd)this.MessageDelegator.bzx().bzt().d(ldv2);
        if (bvd2 == null) {
            return null;
        }
        if (!this.eLZ.containsKey(bvd2.az())) {
            return null;
        }
        List list = (List)this.eLZ.get(bvd2.az());
        assert (list != null);
        if (list.isEmpty()) {
            return null;
        }
        int n2 = (int)((float)list.size() * lgp.erA().nextFloat());
        if (n2 >= list.size()) {
            n2 = list.size() - 1;
        }
        return (String)list.get(n2);
    }

    private void aTI() {
        String[] stringArray = new String[]{"audio/player/human/female/df_human_female_pain_1.xml", "audio/player/human/female/df_human_female_pain_2.xml", "audio/player/human/female/df_human_female_pain_3.xml", "audio/player/human/female/df_human_female_pain_4.xml", "audio/player/human/female/df_human_female_pain_5.xml", "audio/player/human/female/df_human_female_pain_6.xml", "audio/player/human/female/df_human_female_pain_7.xml", "audio/player/human/female/df_human_female_pain_8.xml"};
        String[] stringArray2 = new String[]{"audio/player/human/male/df_human_male_pain_1.xml", "audio/player/human/male/df_human_male_pain_2.xml", "audio/player/human/male/df_human_male_pain_3.xml", "audio/player/human/male/df_human_male_pain_4.xml", "audio/player/human/male/df_human_male_pain_5.xml", "audio/player/human/male/df_human_male_pain_6.xml", "audio/player/human/male/df_human_male_pain_7.xml", "audio/player/human/male/df_human_male_pain_8.xml"};
        String[] stringArray3 = new String[]{"audio/player/ork/male/df_ork_male_pain_1.xml", "audio/player/ork/male/df_ork_male_pain_2.xml", "audio/player/ork/male/df_ork_male_pain_3.xml", "audio/player/ork/male/df_ork_male_pain_4.xml", "audio/player/ork/male/df_ork_male_pain_5.xml", "audio/player/ork/male/df_ork_male_pain_6.xml", "audio/player/ork/male/df_ork_male_pain_7.xml", "audio/player/ork/male/df_ork_male_pain_8.xml"};
        String[] stringArray4 = new String[]{"audio/player/ork/female/df_ork_female_pain_1.xml", "audio/player/ork/female/df_ork_female_pain_2.xml", "audio/player/ork/female/df_ork_female_pain_3.xml", "audio/player/ork/female/df_ork_female_pain_4.xml", "audio/player/ork/female/df_ork_female_pain_5.xml", "audio/player/ork/female/df_ork_female_pain_6.xml", "audio/player/ork/female/df_ork_female_pain_7.xml", "audio/player/ork/female/df_ork_female_pain_8.xml"};
        String[] stringArray5 = new String[]{"audio/player/alfar/male/df_alfar_male_pain_1.xml", "audio/player/alfar/male/df_alfar_male_pain_2.xml", "audio/player/alfar/male/df_alfar_male_pain_3.xml", "audio/player/alfar/male/df_alfar_male_pain_4.xml", "audio/player/alfar/male/df_alfar_male_pain_5.xml", "audio/player/alfar/male/df_alfar_male_pain_6.xml", "audio/player/alfar/male/df_alfar_male_pain_7.xml", "audio/player/alfar/male/df_alfar_male_pain_8.xml"};
        String[] stringArray6 = new String[]{"audio/player/alfar/female/df_alfar_female_pain_1.xml", "audio/player/alfar/female/df_alfar_female_pain_2.xml", "audio/player/alfar/female/df_alfar_female_pain_3.xml", "audio/player/alfar/female/df_alfar_female_pain_4.xml", "audio/player/alfar/female/df_alfar_female_pain_5.xml", "audio/player/alfar/female/df_alfar_female_pain_6.xml", "audio/player/alfar/female/df_alfar_female_pain_7.xml", "audio/player/alfar/female/df_alfar_female_pain_8.xml"};
        String[] stringArray7 = new String[]{"audio/player/dwarf/male/df_dwarf_male_pain_1.xml", "audio/player/dwarf/male/df_dwarf_male_pain_2.xml", "audio/player/dwarf/male/df_dwarf_male_pain_3.xml", "audio/player/dwarf/male/df_dwarf_male_pain_4.xml", "audio/player/dwarf/male/df_dwarf_male_pain_5.xml", "audio/player/dwarf/male/df_dwarf_male_pain_6.xml", "audio/player/dwarf/male/df_dwarf_male_pain_7.xml", "audio/player/dwarf/male/df_dwarf_male_pain_8.xml"};
        String[] stringArray8 = new String[]{"audio/player/dwarf/female/df_dwarf_female_pain_1.xml", "audio/player/dwarf/female/df_dwarf_female_pain_2.xml", "audio/player/dwarf/female/df_dwarf_female_pain_3.xml", "audio/player/dwarf/female/df_dwarf_female_pain_4.xml", "audio/player/dwarf/female/df_dwarf_female_pain_5.xml", "audio/player/dwarf/female/df_dwarf_female_pain_6.xml", "audio/player/dwarf/female/df_dwarf_female_pain_7.xml", "audio/player/dwarf/female/df_dwarf_female_pain_8.xml"};
        String[] stringArray9 = new String[]{"audio/player/mahirim/male/df_wolf_male_pain_1.xml", "audio/player/mahirim/male/df_wolf_male_pain_2.xml", "audio/player/mahirim/male/df_wolf_male_pain_3.xml", "audio/player/mahirim/male/df_wolf_male_pain_4.xml", "audio/player/mahirim/male/df_wolf_male_pain_5.xml", "audio/player/mahirim/male/df_wolf_male_pain_6.xml", "audio/player/mahirim/male/df_wolf_male_pain_7.xml", "audio/player/mahirim/male/df_wolf_male_pain_8.xml"};
        String[] stringArray10 = new String[]{"audio/player/mahirim/female/df_wolf_female_pain_1.xml", "audio/player/mahirim/female/df_wolf_female_pain_2.xml", "audio/player/mahirim/female/df_wolf_female_pain_3.xml", "audio/player/mahirim/female/df_wolf_female_pain_4.xml", "audio/player/mahirim/female/df_wolf_female_pain_5.xml", "audio/player/mahirim/female/df_wolf_female_pain_6.xml", "audio/player/mahirim/female/df_wolf_female_pain_7.xml", "audio/player/mahirim/female/df_wolf_female_pain_8.xml"};
        String[] stringArray11 = new String[]{"audio/player/mirdain/male/df_mirdain_male_pain_1.xml", "audio/player/mirdain/male/df_mirdain_male_pain_2.xml", "audio/player/mirdain/male/df_mirdain_male_pain_3.xml", "audio/player/mirdain/male/df_mirdain_male_pain_4.xml", "audio/player/mirdain/male/df_mirdain_male_pain_5.xml", "audio/player/mirdain/male/df_mirdain_male_pain_6.xml", "audio/player/mirdain/male/df_mirdain_male_pain_7.xml", "audio/player/mirdain/male/df_mirdain_male_pain_8.xml"};
        String[] stringArray12 = new String[]{"audio/player/mirdain/female/df_mirdain_female_pain_1.xml", "audio/player/mirdain/female/df_mirdain_female_pain_2.xml", "audio/player/mirdain/female/df_mirdain_female_pain_3.xml", "audio/player/mirdain/female/df_mirdain_female_pain_4.xml", "audio/player/mirdain/female/df_mirdain_female_pain_5.xml", "audio/player/mirdain/female/df_mirdain_female_pain_6.xml", "audio/player/mirdain/female/df_mirdain_female_pain_7.xml", "audio/player/mirdain/female/df_mirdain_female_pain_8.xml"};
        ArrayList<String> arrayList = lcn.bx(stringArray6);
        ArrayList<String> arrayList2 = lcn.bx(stringArray5);
        this.eLZ.put(new Integer(cug.fhO), arrayList);
        this.eLZ.put(new Integer(cug.fhP), arrayList2);
        ArrayList<String> arrayList3 = lcn.bx(stringArray7);
        ArrayList<String> arrayList4 = lcn.bx(stringArray8);
        this.eLZ.put(new Integer(cug.fhQ), arrayList4);
        this.eLZ.put(new Integer(cug.fhR), arrayList3);
        ArrayList<String> arrayList5 = lcn.bx(stringArray2);
        ArrayList<String> arrayList6 = lcn.bx(stringArray);
        this.eLZ.put(new Integer(cug.fhS), arrayList6);
        this.eLZ.put(new Integer(cug.fhT), arrayList5);
        ArrayList<String> arrayList7 = lcn.bx(stringArray9);
        ArrayList<String> arrayList8 = lcn.bx(stringArray10);
        this.eLZ.put(new Integer(cug.fhU), arrayList8);
        this.eLZ.put(new Integer(cug.fhV), arrayList7);
        ArrayList<String> arrayList9 = lcn.bx(stringArray11);
        ArrayList<String> arrayList10 = lcn.bx(stringArray12);
        this.eLZ.put(new Integer(cug.fhW), arrayList10);
        this.eLZ.put(new Integer(cug.fhX), arrayList9);
        ArrayList<String> arrayList11 = lcn.bx(stringArray3);
        ArrayList<String> arrayList12 = lcn.bx(stringArray4);
        this.eLZ.put(new Integer(cug.fhY), arrayList12);
        this.eLZ.put(new Integer(cug.fhZ), arrayList11);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        Iterator iterator = this.eLW.iterator();
        while (iterator.hasNext()) {
            dfc dfc2 = (dfc)iterator.next();
            iterator.remove();
            this.MessageDelegator.hd(dfc2.getGUID());
        }
    }
}

