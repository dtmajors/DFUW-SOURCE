/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class hwm {
    public static final int lit = 0xFF0000;
    public static final int liu = 0xFFFFFF;
    protected boolean avz = false;

    public SFGUIElementDTO cBj() {
        return null;
    }

    public String getName() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public boolean a(cxc cxc2, float f2, int n) {
        return false;
    }

    public boolean d(cxc cxc2, boolean bl) {
        return false;
    }

    public static hwm nS(String string) {
        String[] stringArray = string.split(";");
        if (stringArray.length == 0) {
            return null;
        }
        hwm hwm2 = null;
        if (stringArray[0].equals("item")) {
            hwm2 = new hwo(stringArray);
        }
        if (stringArray[0].equals("skill")) {
            hwm2 = new hwv(stringArray);
        }
        return hwm2;
    }

    public float cBk() {
        return -1.0f;
    }

    public int getState() {
        return 0;
    }

    public boolean b(hwm hwm2) {
        return false;
    }

    public hwm cBl() {
        assert (false);
        return null;
    }

    public void update() {
    }
}

