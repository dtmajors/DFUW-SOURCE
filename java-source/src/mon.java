/*
 * Decompiled with CFR.
 */
import java.util.Date;

public class mon {
    mom DSP;

    public mon(mom mom2) {
        this.DSP = mom2;
    }

    public void ar(int n, boolean bl) {
        int n2 = this.DSP.getRowCount();
        int[] nArray = this.DSP.eHF();
        for (int i = 0; i < n2 - 1; ++i) {
            int n3;
            int n4 = i;
            for (n3 = i + 1; n3 < n2; ++n3) {
                if (bl) {
                    if (this.U(n, n3, n4) >= 0) continue;
                    n4 = n3;
                    continue;
                }
                if (this.U(n, n3, n4) <= 0) continue;
                n4 = n3;
            }
            n3 = nArray[i];
            nArray[i] = nArray[n4];
            nArray[n4] = n3;
        }
    }

    public int U(int n, int n2, int n3) {
        Object object = this.DSP.getValueAt(n2, n);
        Object object2 = this.DSP.getValueAt(n3, n);
        if (object == null && object2 == null) {
            return 0;
        }
        if (object == null) {
            return -1;
        }
        if (object2 == null) {
            return 1;
        }
        Class<?> clazz = this.DSP.getColumnClass(n);
        if (clazz.getSuperclass() == Number.class) {
            return this.a((Number)object, (Number)object2);
        }
        if (clazz == String.class) {
            return ((String)object).compareTo((String)object2);
        }
        if (clazz == Date.class) {
            return this.a((Date)object, (Date)object2);
        }
        if (clazz == Boolean.class) {
            return this.compare((Boolean)object, (Boolean)object2);
        }
        return ((String)object).compareTo((String)object2);
    }

    public int a(Number number, Number number2) {
        double d2;
        double d3 = number.doubleValue();
        if (d3 < (d2 = number2.doubleValue())) {
            return -1;
        }
        if (d3 > d2) {
            return 1;
        }
        return 0;
    }

    public int a(Date date, Date date2) {
        long l;
        long l2 = date.getTime();
        if (l2 < (l = date2.getTime())) {
            return -1;
        }
        if (l2 > l) {
            return 1;
        }
        return 0;
    }

    public int compare(Boolean bl, Boolean bl2) {
        boolean bl3;
        boolean bl4 = bl;
        if (bl4 == (bl3 = bl2.booleanValue())) {
            return 0;
        }
        if (bl4) {
            return 1;
        }
        return -1;
    }
}

