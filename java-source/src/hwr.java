/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class hwr
extends hwq {
    public hwr(brt brt2) {
        super(brt2);
    }

    @Override
    public SFGUIElementDTO cBj() {
        SFGUIElementDTO sFGUIElementDTO = super.cBj();
        brt brt2 = (brt)this.liF;
        sFGUIElementDTO.quantity = cug.uF((int)brt2.az());
        sFGUIElementDTO.quantityText = null;
        sFGUIElementDTO.text = "<p>" + sFGUIElementDTO.text + "</p><p><font color=\"" + "#FFD700" + "\">" + (int)brt2.Bb() + "</font><img src=\"gold_points.png\" hspace=\"0\" vspace=\"-4\"/></p>";
        int n = hso.cxK().cxP().cyZ().cAz();
        if (brt2.Bb() > (float)n) {
            sFGUIElementDTO.state = hxw.llw.ordinal();
        }
        return sFGUIElementDTO;
    }
}

