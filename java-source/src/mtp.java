/*
 * Decompiled with CFR.
 */
import java.util.Vector;

public class mtp
extends mom {
    public mtp(Vector vector, Vector vector2) {
        this.setDataVector(vector, vector2);
    }

    public Class getColumnClass(int n) {
        switch (n) {
            default: 
        }
        return String.class;
    }

    @Override
    public void setValueAt(Object object, int n, int n2) {
        lfn.b(0, this.getClass().getSimpleName(), "setValueAt() : Set value [" + object + "] at Row[" + n + "] and column [" + n2 + "]");
        ej ej2 = this.afw(n);
        if (ej2 instanceof et) {
            et et2 = (et)ej2;
            try {
                et2.o(Float.parseFloat((String)object));
            }
            catch (NumberFormatException numberFormatException) {
                lfn.b(5, this.getClass().getSimpleName(), "setValueAt() : Number is invalid!");
            }
        } else if (ej2 instanceof eq) {
            eq eq2 = (eq)ej2;
            try {
                eq2.x(Boolean.parseBoolean((String)object));
            }
            catch (NumberFormatException numberFormatException) {
                lfn.b(5, this.getClass().getSimpleName(), "setValueAt() : Boolean attrib is invalid!");
            }
        } else if (ej2 instanceof ff) {
            ff ff2 = (ff)ej2;
            ff2.av((String)object);
        } else if (ej2 instanceof ez) {
            ez ez2 = (ez)ej2;
            try {
                ez2.o(Float.parseFloat((String)object));
            }
            catch (NumberFormatException numberFormatException) {
                lfn.b(5, this.getClass().getSimpleName(), "setValueAt() : Number is invalid!");
            }
        }
    }

    @Override
    public void aq(int n, boolean bl) {
        if (this.DSN == null) {
            this.DSN = new mon(this);
        }
        this.DSN.ar(n, bl);
        this.fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        return n2 == 1;
    }

    public ej afw(int n) {
        int n2 = n;
        if (this.DSM != null && this.DSM.length > n) {
            n2 = this.DSM[n];
        }
        if (n2 < 0 || n2 >= this.dataVector.size()) {
            return null;
        }
        return (ej)this.dataVector.get(n2);
    }

    @Override
    public Object getValueAt(int n, int n2) {
        ej ej2 = this.afw(n);
        if (ej2 == null) {
            return "Refresh table!";
        }
        switch (n2) {
            case 0: {
                return ej2.getName();
            }
            case 1: {
                Object object = ej2.getValue();
                if (object != null) {
                    return ej2.getValue().toString();
                }
                return "null!";
            }
            case 2: {
                return new Integer(ej2.getType()).toString();
            }
            case 3: {
                return new Integer(ej2.getDataType()).toString();
            }
            case 4: {
                return ej2.fl().toString();
            }
        }
        lfn.b(4, this.getClass().getName(), "Default case for Type[" + n2 + "] called. Ops?");
        return null;
    }
}

