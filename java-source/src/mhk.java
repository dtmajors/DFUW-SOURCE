/*
 * Decompiled with CFR.
 */
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;

public abstract class mhk {
    private int Type;
    public static final mhk[] DwX = new mhk[0];

    private mhk() {
        this.Type = -1;
    }

    protected mhk(mhs mhs2) {
        this.Type = mhs2 == null ? -1 : mhs2.ordinal();
    }

    public mhs eyY() {
        if (this.Type >= 0) {
            return mhs.VALUES[this.Type];
        }
        return null;
    }

    public abstract String eyZ();

    public abstract boolean BT(String var1);

    public static mhk a(mhs mhs2, String string) {
        mhk mhk2 = null;
        switch (mhs2) {
            case BOOLEAN: {
                mhk2 = new mhl();
                break;
            }
            case DOUBLE: {
                mhk2 = new mhm();
                break;
            }
            case FLOAT: {
                mhk2 = new mhn();
                break;
            }
            case INTEGER: {
                mhk2 = new mho();
                break;
            }
            case LONG: {
                mhk2 = new mhp();
                break;
            }
            case STRING: {
                mhk2 = new mhr();
                break;
            }
            case XML: {
                mhk2 = new mhu();
                break;
            }
            default: {
                return null;
            }
        }
        if (mhk2.BT(string)) {
            return mhk2;
        }
        return null;
    }

    public static mhk aF(Object object) {
        if (object == null) {
            return new mhq();
        }
        if (object instanceof String) {
            return new mhr((String)object);
        }
        if (object instanceof Boolean) {
            return new mhl((Boolean)object);
        }
        if (object instanceof Integer) {
            return new mho((Integer)object);
        }
        if (object instanceof Long) {
            return new mhp((Long)object);
        }
        if (object instanceof Double) {
            return new mhm((Double)object);
        }
        if (object instanceof Float) {
            return new mhn(((Float)object).floatValue());
        }
        if (object instanceof SFXMLSerializable) {
            return new mhu((SFXMLSerializable)object);
        }
        return new mht();
    }

    public String fk() {
        return (Object)((Object)mhs.values()[this.Type]) + ":" + this.eyZ();
    }

    public static mhk BU(String string) {
        List<String> list = pr.a(':', string);
        if (list == null || list.size() != 2) {
            return null;
        }
        mhs mhs2 = mhs.valueOf(list.get(0).toUpperCase());
        if (mhs2 == null) {
            return null;
        }
        switch (mhs2) {
            case BOOLEAN: {
                mhl mhl2 = new mhl();
                mhl2.BT(list.get(1));
                return mhl2;
            }
            case DOUBLE: {
                return new mhm(Double.parseDouble(list.get(1)));
            }
            case FLOAT: {
                return new mhn(Float.parseFloat(list.get(1)));
            }
            case INTEGER: {
                return new mho(Integer.parseInt(list.get(1)));
            }
            case LONG: {
                return new mhp(Long.parseLong(list.get(1)));
            }
            case STRING: {
                return new mhr(list.get(1));
            }
            case XML: {
                return new mhu(list.get(1));
            }
        }
        return null;
    }
}

