/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class ieq {
    private static int lhy = 0;
    private int ID = 0;
    protected ier lOn = null;
    protected hwm lOo = null;

    public ieq(ier ier2, hwm hwm2) {
        this.lOo = hwm2;
        this.ID = lhy++;
        this.lOn = ier2;
    }

    public boolean cQk() {
        return this.lOo != null && this.cBj().state != hxw.llx.ordinal();
    }

    public SFGUIElementDTO cBj() {
        if (this.lOo != null) {
            SFGUIElementDTO sFGUIElementDTO = this.lOo.cBj();
            sFGUIElementDTO.id = this.ID;
            return sFGUIElementDTO;
        }
        return null;
    }

    protected int getID() {
        return this.ID;
    }

    public ier cQl() {
        return this.lOn;
    }

    public hwm cQm() {
        return this.lOo;
    }
}

