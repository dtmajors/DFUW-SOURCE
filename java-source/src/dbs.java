/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class dbs {
    public final int SkillType;
    public final aja[] fGe;
    public List<Integer> gcu;

    public dbs(int n2, aja[] ajaArray, List<Integer> list) {
        assert (n2 > 0);
        assert (ajaArray != null);
        assert (ajaArray.length > 0);
        this.SkillType = n2;
        this.fGe = ajaArray;
        this.gcu = list;
    }

    public dbs bjf() {
        aja[] ajaArray = new aja[this.fGe.length];
        int n2 = ajaArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ajaArray[i2] = this.fGe[i2].Cp();
        }
        ArrayList<Integer> arrayList = null;
        if (this.gcu != null) {
            arrayList = lcn.abH(this.gcu.size());
            arrayList.addAll(this.gcu);
        }
        return new dbs(this.SkillType, ajaArray, arrayList);
    }

    public void bjg() {
        int n2 = this.fGe.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!ajb.b.isPreventPerformingStateCheck(this.fGe[i2].Cl())) continue;
            this.fGe[i2].a(ajb.a.bos);
        }
    }

    public String Bu() {
        return lea.enZ().getName(this.SkillType);
    }

    public boolean zD(int n2) {
        return this.gcu != null && this.gcu.contains(n2);
    }
}

