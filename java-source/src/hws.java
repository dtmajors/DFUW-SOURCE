/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class hws
extends hwq {
    public hws(bsh bsh2) {
        super(bsh2);
    }

    @Override
    public SFGUIElementDTO cBj() {
        SFGUIElementDTO sFGUIElementDTO = super.cBj();
        sFGUIElementDTO.text = "<p>" + sFGUIElementDTO.text + "</p><p><font color=\"" + "#FFD700" + "\">" + (int)this.liF.Bb() + "</font><img src=\"gold_points.png\" hspace=\"0\" vspace=\"-4\"/></p>";
        return sFGUIElementDTO;
    }
}

