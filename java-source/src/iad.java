/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class iad
extends hzv {
    private static final int lAV = 220;
    private static final int lAW = 50;
    private int fc = 0;
    private hvz liO = null;
    private dmi lAX = null;
    List<alu> PG = lcn.emv();

    public iad(int n, int n2) {
        super("tooltipmodifier.swf", "MODIFIER TOOLTIP", n, n2, 270, 50, hyd.lnj);
        this.lzL = true;
    }

    @Override
    protected void cBa() {
        super.cBa();
        if (this.liO != null) {
            ArrayList<Integer> arrayList = lcn.emv();
            for (int j = 0; j < this.liO.cAN(); ++j) {
                arrayList.add(j);
            }
            ArrayList<Integer> arrayList2 = lcn.emv();
            this.a(this.liO, arrayList, arrayList2);
        }
        if (this.lAX != null) {
            this.a(this.lAX);
        }
    }

    public void a(hvz hvz2, List<Integer> list, List<Integer> list2) {
        int n;
        int n2;
        int n3;
        this.liO = hvz2;
        if (!this.cDj()) {
            return;
        }
        if (hvz2.zg() != -1) {
            String string = lya.tCp.bD(hvz2.zg()).exA();
            this.a("setSkillName", new Object[]{string});
        }
        for (n3 = 0; n3 < list.size(); ++n3) {
            Object object;
            n2 = list.get(n3);
            n = hvz2.OC(n2);
            alu alu2 = hvz2.OB(n2);
            boolean bl = true;
            boolean bl2 = false;
            for (int j = 0; j < this.PG.size(); ++j) {
                object = this.PG.get(j);
                if (((alu)object).CD() != alu2.CD()) continue;
                if (alu2.Ep() > ((alu)object).Ep()) {
                    int n4 = hvz2.j((alu)object);
                    if (n4 != -1) {
                        this.a("removeModifier", new Object[]{n4});
                    }
                    this.PG.set(j, alu2);
                    bl2 = true;
                    break;
                }
                bl = false;
                break;
            }
            if (!bl) continue;
            String string = "texture/dds/" + alu2.Eq().Name;
            object = lvm.sWX.bD(alu2.CD()).exA();
            if (alu2.hasInfiniteDuration()) {
                this.a("addModifierWithoutTimer", new Object[]{n, string, object, 1});
            } else {
                this.a("addModifier", new Object[]{n, string, object});
            }
            if (bl2) continue;
            this.PG.add(alu2);
        }
        for (n3 = 0; n3 < list2.size(); ++n3) {
            this.a("removeModifier", new Object[]{list2.get(n3)});
        }
        n3 = hvz2.zg() == -1 ? 0 : 30;
        n2 = n3 + 1;
        for (n = 0; n < this.PG.size(); ++n) {
            this.a("setModifierPos", new Object[]{hvz2.j(this.PG.get(n)), n2});
            n2 += 30;
        }
        super.onTooltipWindowResized((int)this.getWidth(), this.PG.size() * 30 + n3);
    }

    public void a(hvz hvz2, float[] fArray) {
        if (!this.cDj()) {
            return;
        }
        for (int j = 0; j < fArray.length; ++j) {
            alu alu2 = hvz2.OB(j);
            if (alu2.En() == -2.0 || !this.PG.contains(alu2)) continue;
            double d2 = alu2.En() * (double)(1.0f - fArray[j]);
            String string = "";
            double d3 = d2;
            if (d3 > 3600.0) {
                string = lvm.sWE.bD(d2).exA();
                string = string.substring(0, string.indexOf("m") + 1);
            } else {
                string = String.format("%1$tM:%1$tS", (long)d2 * 1000L);
            }
            this.a("setModifierProgress", new Object[]{hvz2.OC(j), Float.valueOf(fArray[j]), string});
        }
    }

    @llk
    public void updateHeight(double d2) {
        this.fc = (int)d2;
        float f = (float)d2 / this.cDc();
        this.N(1.0f, f);
    }

    public void a(dmi dmi2) {
        this.lAX = dmi2;
        if (!this.cDj()) {
            return;
        }
        this.a("setSkillName", new Object[]{lyw.tLM.bD(new Object[0]).exA()});
        int n = 0;
        int n2 = 30;
        for (dmh dmh2 : dmh.values()) {
            loz loz2;
            if (dmi2.c(dmh2) == 0.0f || (loz2 = dmi2.f(dmh2)) == null) continue;
            this.a("addModifierWithoutTimer", new Object[]{n, dmh2.bpW(), loz2.exA(), 0.42});
            this.a("setModifierPos", new Object[]{n, n2});
            ++n;
            n2 += 30;
        }
        super.onTooltipWindowResized((int)this.getWidth(), n2);
    }
}

