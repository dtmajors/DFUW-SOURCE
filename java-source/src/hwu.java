/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class hwu
extends hwo {
    public hwu(bsm bsm2) {
        super(bsm2);
    }

    @Override
    public SFGUIElementDTO cBj() {
        SFGUIElementDTO sFGUIElementDTO = super.cBj();
        sFGUIElementDTO.quantity = cug.uF((int)this.liG.getType());
        sFGUIElementDTO.quantityText = null;
        sFGUIElementDTO.state = 0;
        civ civ2 = lea.epC().get(this.liG.getType());
        if (civ2 != null) {
            if (civ2.vf() != 0) {
                sFGUIElementDTO.quantity = civ2.vf();
            }
            if (civ2.aPG()) {
                sFGUIElementDTO.indicators |= 0x40;
            }
            String string = "#0099FF";
            sFGUIElementDTO.text = "<p>" + sFGUIElementDTO.text + "</p><p><font color=\"" + string + "\">" + civ2.cl() + "</font><img src=\"selentine_small.png\" hspace=\"0\" vspace=\"-8\"/></p>";
        }
        return sFGUIElementDTO;
    }
}

