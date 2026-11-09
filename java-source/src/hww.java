/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class hww
extends hwv {
    private bsc liV;

    public hww(bsc bsc2) {
        super(bsc2.awK());
        this.liV = bsc2;
    }

    @Override
    public SFGUIElementDTO cBj() {
        SFGUIElementDTO sFGUIElementDTO = super.cBj();
        int n = (int)this.liV.Bb();
        sFGUIElementDTO.text = "<p>" + sFGUIElementDTO.text + "</p><p><font color=\"#ffcc33\">" + n + " </font><img src=\"player_points.png\" hspace=\"0\" vspace=\"-4\"/></p>";
        int n2 = hso.cxK().cxP().cyZ().akj();
        sFGUIElementDTO.state = hxw.llv.ordinal();
        if (n > n2) {
            sFGUIElementDTO.state = hxw.llw.ordinal();
        } else {
            cua[] cuaArray;
            cuo cuo2 = cxj.bfS().get(this.liV.zg());
            if (cuo2 != null && (cuaArray = cuo2.Requirements) != null && cuaArray.length > 0) {
                for (cua cua2 : cuaArray) {
                    if (!(cua2 instanceof cue)) continue;
                    cue cue2 = (cue)cua2;
                    int n3 = cue2.SkillType;
                    cxc cxc2 = hso.cxK().cxP().cyZ().ht(n3);
                    if (cxc2 == null) {
                        sFGUIElementDTO.state = hxw.llw.ordinal();
                        break;
                    }
                    float f2 = cue2.SkillLevel;
                    if (!(cxc2.Bt() < f2)) continue;
                    sFGUIElementDTO.state = hxw.llw.ordinal();
                    break;
                }
            }
        }
        return sFGUIElementDTO;
    }
}

