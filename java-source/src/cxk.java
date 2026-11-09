/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  lcw
 */
import java.util.List;

public class cxk {
    private static les aqN = lea.enZ();

    public boolean a(lhg lhg2) {
        if (!lea.eob().contains(lhg2.getType())) {
            return false;
        }
        String string = (lhg2.getName() + ".xml").toLowerCase();
        String string2 = lcw.qMy + string;
        boolean bl = jry.tj(string2);
        String string3 = lcw.qMZ + string;
        boolean bl2 = jry.tj(string3);
        if (!lcw.qOR) {
            if (lcw.ena()) {
                bl2 = true;
            } else if (lcw.enf()) {
                bl = true;
            }
        }
        if (!bl) {
            lfn.b(5, "SFSkillTypeChecker", "canCreateSkill(): Client file for " + lhg2.getName() + " not found");
            return false;
        }
        if (!bl2) {
            lfn.b(5, "SFSkillTypeChecker", "canCreateSkill(): Server file for " + lhg2.getName() + " not found");
            return false;
        }
        return true;
    }

    public void a(String string, List list) {
        this.a(string, 0.0f, (List<dct>)list);
    }

    public void a(String string, float f2, List<dct> list) {
        if (string == null || string.trim().equals("")) {
            return;
        }
        if (f2 < 1.0f || f2 > 100.0f) {
            return;
        }
        if (list == null) {
            return;
        }
        ler ler2 = aqN.eqq();
        if (ler2 == null) {
            return;
        }
        this.a(ler2, string.toLowerCase(), f2, list);
    }

    private void a(lhg lhg2, float f2, List<dct> list) {
        assert (lhg2 != null);
        assert (f2 >= 1.0f);
        assert (list != null);
        lhg lhg3 = (lhg)aqN.g(lhg2);
        while (lhg3 != null) {
            if (this.a(lhg3)) {
                dct dct2 = new dct();
                dct2.SkillType = lhg3.getType();
                dct2.SkillLevel = f2;
                list.add(dct2);
            }
            this.a(lhg3, f2, list);
            lhg3 = (lhg)aqN.h(lhg3);
        }
    }

    public void a(int n2, float f2, List<dct> list) {
        if (n2 < 0) {
            return;
        }
        if (f2 < 1.0f || f2 > 100.0f) {
            return;
        }
        if (list == null) {
            return;
        }
        lhg lhg2 = (lhg)aqN.acv(n2);
        dct dct2 = null;
        if (!this.a(lhg2)) {
            lfn.b(5, "SFSkillTypeChecker", "checkSkillType() Skill '" + lhg2.getName() + " can not be created.");
            return;
        }
        dct2 = new dct();
        dct2.SkillType = n2;
        dct2.SkillLevel = f2;
        list.add(dct2);
        if (lea.enZ().isDescendant(lhg2.getType(), cxd.fIt)) {
            String string = aqN.acv(lhg2.getType()).getName();
            string = string + "_spells";
            lhg2 = (lhg)lea.enZ().zx(string);
        } else if (lea.enZ().isDescendant(lhg2.getType(), cxd.fIu)) {
            String string = aqN.acv(lhg2.getType()).getName();
            string = string + "_skills";
            lhg2 = (lhg)lea.enZ().zx(string);
        } else if (lea.enZ().isDescendant(lhg2.getType(), cxd.fIw)) {
            String string = aqN.acv(lhg2.getType()).getName();
            string = string + "_skills";
            lhg2 = (lhg)lea.enZ().zx(string);
        }
        if (aqN.g(lhg2) != null) {
            this.a(lhg2, f2, list);
        }
    }

    private void a(ler ler2, String string, float f2, List<dct> list) {
        lhg lhg2 = (lhg)aqN.g(ler2);
        while (lhg2 != null) {
            if (lhg2.getName().toLowerCase().indexOf(string) >= 0) {
                this.a(lhg2.getType(), f2, list);
            }
            this.a(lhg2, string, f2, list);
            lhg2 = (lhg)aqN.h(lhg2);
        }
    }
}

