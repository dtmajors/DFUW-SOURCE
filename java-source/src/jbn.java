/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class jbn
implements hwb {
    private final jbo mOr;
    private final cbi mOs;
    private hwc lgs = null;
    private List<hvz> mOt = null;
    private Map<Integer, hwt> mOu = lcn.emw();

    public jbn(jbo jbo2, hwc hwc2, cbi cbi2) {
        this.mOr = jbo2;
        this.mOs = cbi2;
        if (hwc2 != null) {
            this.lgs = hwc2;
            this.lgs.a(this);
        }
    }

    public void b(alu[] aluArray) {
        if (aluArray == null) {
            aluArray = new alu[]{};
        }
        if (this.lgs != null) {
            this.lgs.b(aluArray);
        }
    }

    @Override
    public void a(List<hvz> list, List<hvz> list2, List<hvz> list3) {
        hwt hwt2;
        for (hvz hvz2 : list2) {
            hwt2 = new hwt(hvz2);
            SFGUIElementDTO sFGUIElementDTO = hwt2.cBj();
            this.mOr.c("addModifier", sFGUIElementDTO.id, sFGUIElementDTO.iconName, hwt2.cCq() ? 0.42 : 1.0, this.mOs.eiK);
            this.mOu.put(hvz2.getId(), hwt2);
        }
        for (hvz hvz2 : list3) {
            if (hvz2.getId() == this.mOr.lqB && this.mOr.lqS != null) {
                this.mOr.lqS.setVisible(false);
                this.mOr.lqB = -1;
            }
            hwt2 = this.mOu.remove(hvz2.getId());
            this.mOr.c("removeModifier", hvz2.getId(), this.mOs.eiK);
        }
        this.mOt = list;
    }

    @Override
    public void a(hvz hvz2, List<Integer> list, List<Integer> list2) {
        if (this.mOr.lqS != null) {
            this.mOr.lqS.a(hvz2, list, list2);
        }
    }

    @Override
    public int cAQ() {
        return this.mOr.lqB;
    }

    @Override
    public void a(List<hvz> list, float[] fArray) {
        if (!this.mOr.dwI()) {
            return;
        }
        int n = 0;
        for (hvz hvz2 : list) {
            if (fArray[n] >= 0.0f && fArray[n] - hvz2.cAP() > 0.05f) {
                this.mOr.c("setModifierProgress", hvz2.getId(), Float.valueOf(fArray[n]), this.mOs.eiK);
                hvz2.ke(fArray[n]);
            }
            ++n;
        }
    }

    @Override
    public void a(hvz hvz2, float[] fArray) {
        if (!this.mOr.dwI()) {
            return;
        }
        for (int i = 0; i < fArray.length; ++i) {
            if (this.mOr.lqS == null) continue;
            this.mOr.lqS.a(hvz2, fArray);
        }
    }

    @Override
    public void m(alu alu2) {
    }

    @Override
    public void n(alu alu2) {
    }

    public boolean TL(int n) {
        return this.mOu.containsKey(n);
    }

    public List<hvz> dwz() {
        return this.mOt;
    }
}

