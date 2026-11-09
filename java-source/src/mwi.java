/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcw
 */
import java.util.ArrayList;
import java.util.Collection;

public class mwi
extends mom {
    private ArrayList<amf> EPe = null;
    private final String[] DIf = new String[]{"GUID", "Filename", "Type", "Tile", "Category"};
    private final int[] EPf = new int[]{50, 280, 80, 50, 70};
    private final int DIg = this.DIf.length;

    public mwi() {
    }

    public mwi(Collection<amf> collection) {
        this.EPe = new ArrayList<amf>(collection);
    }

    public void n(Collection<amf> collection) {
        this.EPe = new ArrayList<amf>(collection);
    }

    @Override
    public Class<?> getColumnClass(int n) {
        switch (n) {
            case 0: {
                return Integer.class;
            }
        }
        return String.class;
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        switch (n2) {
            default: 
        }
        return false;
    }

    @Override
    public int getRowCount() {
        if (this.EPe != null) {
            return this.EPe.size();
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        return this.DIg;
    }

    public void e(dqk dqk2) {
        System.out.println("SFObjectTableModel: Adding Object!");
    }

    public amf afJ(int n) {
        int n2 = n;
        if (this.DSM != null && n < this.DSM.length && n >= 0) {
            n2 = this.DSM[n];
        }
        amf amf2 = null;
        if (n2 >= 0 && n2 < this.EPe.size()) {
            amf2 = this.EPe.get(n2);
        }
        return amf2;
    }

    public boolean aeL(int n) {
        amf amf2 = this.afJ(n);
        if (amf2 != null) {
            this.EPe.remove(amf2);
            this.fireTableDataChanged();
            return true;
        }
        return false;
    }

    public static String y(amf amf2) {
        if (amf2 instanceof bdl) {
            return ((bdl)((Object)amf2)).amd();
        }
        if (amf2 instanceof dsp) {
            return ((dsp)((Object)amf2)).atK();
        }
        if (amf2.getObjectType() == 28) {
            return amf2.getClass().getSimpleName() + " (" + amf2.getObjectDescriptionFilename() + ")";
        }
        if (amf2.getObjectType() == 148) {
            return "Decal:" + ((dsa)((Object)amf2)).getTextureName();
        }
        return amf2.getObjectDescriptionFilename();
    }

    @Override
    public Object getValueAt(int n, int n2) {
        amf amf2 = this.afJ(n);
        if (amf2 == null) {
            return "[null]";
        }
        switch (n2) {
            case 0: {
                return new Integer(amf2.getGUID().enx());
            }
            case 1: {
                return mwi.y(amf2);
            }
            case 2: {
                if (amf2.getObjectType() > amh.bxE.length) {
                    lfn.b(4, this.getClass().getSimpleName(), "getValueAt() WrongObjectType [" + amf2.getObjectType() + "] for Object [" + amf2 + "]");
                    return "INVALID TYPE = " + amf2.getObjectType();
                }
                return amh.bxE[amf2.getObjectType()];
            }
            case 3: {
                if (amf2 instanceof ami) {
                    ami ami2 = (ami)((Object)amf2);
                    ljq ljq2 = ami2.av();
                    return lcw.dZ((ljq)ljq2) + "(" + lcw.ea((ljq)ljq2) + ")";
                }
                return "--";
            }
            case 4: {
                String string = mje.DCj.get(amf2.getGUID());
                if (string == null) {
                    return "--";
                }
                return string;
            }
        }
        lfn.b(4, this.getClass().getName(), "Default case for Type[" + n2 + "] called. Ops?");
        return null;
    }

    @Override
    public String getColumnName(int n) {
        return this.DIf[n];
    }

    public int[] eRk() {
        return this.EPf;
    }
}

