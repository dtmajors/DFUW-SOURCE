/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class hwn
extends hwm {
    private ign liv;

    public hwn(ign ign2) {
        this.liv = ign2;
    }

    @Override
    public SFGUIElementDTO cBj() {
        SFGUIElementDTO sFGUIElementDTO = new SFGUIElementDTO();
        sFGUIElementDTO.id = this.liv.getId();
        sFGUIElementDTO.type = hxx.llC.ordinal();
        sFGUIElementDTO.progress = Math.min((double)this.liv.cTu(), (double)this.liv.cTt()) / (double)this.liv.cTt();
        if (this.liv.cTI() != null) {
            int n;
            sFGUIElementDTO.iconName = this.liv.cTI().cTo();
            sFGUIElementDTO.nameLabelColor = n = 0x808080;
            sFGUIElementDTO.progressColor = n;
            sFGUIElementDTO.progressTrackColor = hwn.D(n, 0.15f);
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "feat item found without category");
        }
        sFGUIElementDTO.quantity = this.liv.cTu();
        sFGUIElementDTO.visible = true;
        sFGUIElementDTO.changed = true;
        return sFGUIElementDTO;
    }

    public ign cBm() {
        return this.liv;
    }

    private static int D(int n, float f2) {
        Color color = new Color(n);
        float[] fArray = new float[3];
        Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), fArray);
        return Color.HSBtoRGB(fArray[0], fArray[1], fArray[2] * f2);
    }
}

