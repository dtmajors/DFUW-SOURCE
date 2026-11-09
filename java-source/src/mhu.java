/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.SFXMLSerializable;

public class mhu
extends mhk {
    public String Value;

    public mhu() {
        super(mhs.XML);
    }

    public mhu(String string) {
        super(mhs.XML);
        this.Value = string;
    }

    public mhu(SFXMLSerializable sFXMLSerializable) {
        super(mhs.XML);
        if (sFXMLSerializable != null) {
            this.Value = sFXMLSerializable.cDB();
        }
    }

    public String toString() {
        return "XML:" + this.Value;
    }

    @Override
    public String eyZ() {
        return this.Value;
    }

    @Override
    public boolean BT(String string) {
        if (string != null) {
            this.Value = string;
            return true;
        }
        return false;
    }
}

