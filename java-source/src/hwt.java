/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class hwt
extends hwm {
    private hvz liO = null;
    private int ID = 0;
    private float liP = -1.0f;
    private boolean liQ = false;

    public hwt(hvz hvz2) {
        this.liO = hvz2;
        this.ID = hvz2.getId();
    }

    public static String a(hvz hvz2) {
        String string = "";
        if (hvz2.zg() != -1) {
            lhg lhg2 = (lhg)lea.enZ().acv(hvz2.zg());
            string = "texture/dds/" + lhg2.atw().Name;
        } else if (hvz2.cAN() > 0) {
            string = "texture/dds/" + hvz2.OB((int)0).Eq().Name;
        }
        return string;
    }

    @Override
    public SFGUIElementDTO cBj() {
        SFGUIElementDTO sFGUIElementDTO = new SFGUIElementDTO();
        String string = hwt.a(this.liO);
        this.liQ = this.liO.zg() != -1;
        sFGUIElementDTO.iconName = string;
        sFGUIElementDTO.quantity = 1;
        sFGUIElementDTO.id = this.ID;
        sFGUIElementDTO.progress = this.liP;
        return sFGUIElementDTO;
    }

    public int cCp() {
        if (this.liO == null) {
            return 0;
        }
        return this.liO.cAO();
    }

    public int but() {
        if (this.liO == null) {
            return 0;
        }
        if (this.liO.zg() == cxd.fKW) {
            return Math.min(this.liO.cAN(), 5);
        }
        if (this.liO.zg() == cxd.fHP) {
            return Math.min(this.liO.cAN(), 5);
        }
        if (this.liO.zg() == cxd.fHS) {
            return Math.min(this.liO.cAN(), 5);
        }
        if (this.liO.zg() == cxd.fKX) {
            return hso.cxK().cxP().cyZ().Ow(13536);
        }
        return 0;
    }

    public void hG(int n) {
        this.ID = n;
    }

    public int getID() {
        return this.ID;
    }

    public void kf(float f2) {
        this.liP = f2;
    }

    public boolean cCq() {
        return this.liQ;
    }
}

