/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class hwp
extends hwm {
    private bsm liM;
    private int hf;

    public hwp(bsm bsm2) {
        this.liM = bsm2;
    }

    public hwp(bsm bsm2, int n) {
        this.liM = bsm2;
        this.hf = n;
    }

    @Override
    public SFGUIElementDTO cBj() {
        SFGUIElementDTO sFGUIElementDTO = new SFGUIElementDTO();
        sFGUIElementDTO.id = this.hf;
        sFGUIElementDTO.type = hxx.llC.ordinal();
        sFGUIElementDTO.iconName = "texture/dds/" + this.liM.atw().Name;
        sFGUIElementDTO.text = lxf.tod.bD(this.liM.getType()).exA();
        sFGUIElementDTO.quantity = cug.uF((int)this.liM.getType());
        if (sFGUIElementDTO.quantity < 0) {
            sFGUIElementDTO.quantity = 1;
        }
        return sFGUIElementDTO;
    }

    public bsm cBq() {
        return this.liM;
    }

    public int getId() {
        return this.hf;
    }
}

