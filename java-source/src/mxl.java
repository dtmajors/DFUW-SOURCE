/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  dta
 */
import java.util.Map;

public class mxl
extends mom {
    lfn ga = lfn.eqw();
    Map haz = null;
    String[] DIf = new String[]{"Filename", "Type", "GUID", "Objects", "Visible", "Locked"};
    public static final int[] ETN = new int[]{240, 80, 50, 50, 50, 50};
    private int DIg = this.DIf.length;

    public mxl() {
    }

    public mxl(Map map) {
        this.haz = map;
    }

    public Class getColumnClass(int n2) {
        switch (n2) {
            case 2: 
            case 3: {
                return Integer.class;
            }
            case 4: 
            case 5: {
                return Boolean.class;
            }
        }
        return String.class;
    }

    @Override
    public boolean isCellEditable(int n2, int n3) {
        switch (n3) {
            default: 
        }
        return false;
    }

    @Override
    public int getRowCount() {
        if (this.haz != null) {
            return this.haz.size();
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        return this.DIg;
    }

    public void e(dqk dqk2) {
        System.out.println("SFObjectTableModel: Adding Object!");
        assert (false);
    }

    public dta afS(int n2) {
        int n3 = n2;
        if (this.DSM != null && n2 < this.DSM.length) {
            n3 = this.DSM[n2];
        }
        dta dta22 = null;
        int n4 = 0;
        for (dta dta22 : this.haz.values()) {
            if (n3 == n4) break;
            ++n4;
        }
        return dta22;
    }

    public boolean aeL(int n2) {
        dta dta2 = this.afS(n2);
        if (dta2 != null) {
            this.haz.remove(dta2);
            this.fireTableDataChanged();
            return true;
        }
        return false;
    }

    @Override
    public Object getValueAt(int n2, int n3) {
        dta dta2 = this.afS(n2);
        if (dta2 == null) {
            return "invalid object";
        }
        switch (n3) {
            case 0: {
                return dta2.getObjectDescriptionFilename();
            }
            case 1: {
                return dte.Cc(dta2.bzz());
            }
            case 2: {
                return new Integer(dta2.getGUID().enw());
            }
            case 3: {
                return new Integer(dta2.bzr().size());
            }
            case 4: {
                return mxj.us(dta2.getGUID());
            }
            case 5: {
                return mxj.ur(dta2.getGUID());
            }
        }
        lfn.b(4, this.getClass().getName(), "Default case called. Ops?");
        return null;
    }

    @Override
    public String getColumnName(int n2) {
        return this.DIf[n2];
    }
}

