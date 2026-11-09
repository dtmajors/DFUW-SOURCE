/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 */
import javax.swing.JTable;

public class mpw
extends JTable {
    lfn ga = lfn.eqw();
    private mxl DXm = null;

    public mpw() {
    }

    public mpw(mxl mxl2) {
        super(mxl2);
        this.DXm = mxl2;
        this.setTransferHandler(new myg("[!ObjectSpace!]"));
        this.setDragEnabled(true);
    }

    public dta eIV() {
        dta dta2 = this.DXm.afS(this.getSelectedRow());
        lfn.b(0, this.getClass().getName(), "Getting ObjectSpace [" + dta2.getGUID() + "]");
        return dta2;
    }

    public Object eIW() {
        System.out.println("SFJTable: Getting selected object!");
        int n = this.getSelectedRow();
        String string = (String)this.getValueAt(n, 0);
        System.out.println("SFJTable: Getting selected object! DONE");
        return string;
    }
}

