/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 */
public class mvb
extends mom {
    lfn ga = lfn.eqw();
    bdl EJm = null;
    String[] DIf = new String[]{"GUID", "Type", "Filename", "ObjectName"};
    private int DIg = this.DIf.length;
    private int sH = 0;
    private int sI = 0;
    private int EJu = 0;

    public mvb() {
    }

    public mvb(bdl bdl2) {
        this.EJm = bdl2;
    }

    public Class getColumnClass(int n) {
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
        if (this.EJm != null) {
            return this.EJm.ame().size();
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
        if (this.DSM != null && n < this.DSM.length) {
            n2 = this.DSM[n];
        }
        amf amf2 = this.EJm.ame().get(n2);
        return amf2;
    }

    public boolean aeL(int n) {
        amf amf2 = this.afJ(n);
        if (amf2 != null) {
            this.EJm.ame().remove(amf2);
            this.fireTableDataChanged();
            return true;
        }
        return false;
    }

    @Override
    public Object getValueAt(int n, int n2) {
        amf amf2 = this.afJ(n);
        switch (n2) {
            case 0: {
                return new Integer(amf2.getGUID().enx());
            }
            case 1: {
                return amh.bxE[amf2.getObjectType()];
            }
            case 2: {
                return amf2.getObjectDescriptionFilename();
            }
            case 3: {
                return "No Name";
            }
        }
        return null;
    }

    @Override
    public String getColumnName(int n) {
        return this.DIf[n];
    }
}

