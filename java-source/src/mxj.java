/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  dta
 *  lcw
 */
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Map;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class mxj
extends mkx
implements ActionListener {
    private Map<ldv, dta> ETE = lcn.emw();
    private mxk ETF = null;
    private aux DEC = null;
    private b ETG = null;
    private final String EOZ = "Loaded ObjectSpaces";
    private mpw ETH = null;
    private boolean ETI = false;
    private static Map<ldv, JCheckBox> ETJ = lcn.emw();
    private static Map<ldv, JCheckBox> ETK = lcn.emw();

    public mxj(Map<ldv, dta> map) {
        super(false);
        this.ETE = map;
        this.setTitle("Loaded ObjectSpaces");
        Dimension dimension = new Dimension(500, 400);
        this.setPreferredSize(dimension);
        this.ETG = new b(this);
        this.ETF = new mxk(this);
        this.eQT();
        this.pack();
        this.addInternalFrameListener(new InternalFrameAdapter(this){
            final /* synthetic */ mxj ETL;
            {
                this.ETL = mxj2;
            }

            public void internalFrameActivated(InternalFrameEvent internalFrameEvent) {
                if (mxj.a(this.ETL) != null) {
                    mxj.a(this.ETL).invalidate();
                    mxj.b(this.ETL);
                }
            }
        });
        Thread thread = new Thread(new d(this, this.ETE));
        thread.start();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    public void eQT() {
        mxl mxl2 = new mxl(this.ETE);
        this.ETH = new mpw(mxl2);
        this.ETH.addMouseListener(this.ETG);
        this.ETH.setSelectionMode(2);
        JTableHeader jTableHeader = this.ETH.getTableHeader();
        this.ETH.setShowVerticalLines(true);
        this.ETH.setShowHorizontalLines(true);
        jTableHeader.setReorderingAllowed(false);
        jTableHeader.setVerifyInputWhenFocusTarget(true);
        mol mol2 = new mol();
        c c2 = new c(this);
        a a2 = new a(this);
        jTableHeader.addMouseListener(new mok(jTableHeader, mol2));
        TableColumnModel tableColumnModel = this.ETH.getColumnModel();
        int n2 = tableColumnModel.getColumnCount();
        for (int i = 0; i < n2; ++i) {
            tableColumnModel.getColumn(i).setHeaderRenderer(mol2);
            if (i == 4 || i == 5) {
                tableColumnModel.getColumn(i).setCellRenderer(a2);
            } else {
                tableColumnModel.getColumn(i).setCellRenderer(c2);
            }
            tableColumnModel.getColumn(i).setPreferredWidth(mxl.ETN[i]);
        }
        JScrollPane jScrollPane = new JScrollPane(this.ETH);
        this.DGa.add(jScrollPane);
    }

    @Override
    protected void z(ActionEvent actionEvent) {
        try {
            this.setIcon(true);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    protected void E(ActionEvent actionEvent) {
        try {
            this.setIcon(true);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    protected void A(ActionEvent actionEvent) {
        try {
            this.setIcon(true);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("Enable")) {
            int n2 = this.ETH.getSelectedRow();
            dta dta2 = ((mxl)this.ETH.getModel()).afS(n2);
            dta2.setActive(true);
        } else if (actionEvent.getActionCommand().equals("View Contents")) {
            int n3 = this.ETH.getSelectedRow();
            dta dta3 = ((mxl)this.ETH.getModel()).afS(n3);
            mwg mwg2 = new mwg(dta3.bzr(), dta3.getObjectDescriptionFilename(), dta3.getGUID());
            mwg2.p(this.DEC);
            this.getDesktopPane().add(mwg2);
            mwg2.setVisible(true);
        } else if (actionEvent.getActionCommand().equals("Disable")) {
            int n4 = this.ETH.getSelectedRow();
            dta dta4 = ((mxl)this.ETH.getModel()).afS(n4);
            dta4.setActive(false);
        } else if (actionEvent.getActionCommand().equals("Add Sensors")) {
            int n5 = this.ETH.getSelectedRow();
            dta dta5 = ((mxl)this.ETH.getModel()).afS(n5);
            hag hag2 = (hag)this.DEC.d(4102);
            hag2.Lg(1);
            hag2.qM(dta5.getGUID());
            this.DEC.a((dxq)hag2);
        } else if (actionEvent.getActionCommand().equals("Remove")) {
            int[] nArray = this.ETH.getSelectedRows();
            for (int i = 0; i < nArray.length; ++i) {
                int n6 = nArray[i];
                dta dta6 = ((mxl)this.ETH.getModel()).afS(n6);
                hag hag3 = (hag)this.DEC.d(4102);
                hag3.Lg(2);
                hag3.qM(dta6.getGUID());
                this.DEC.a((dxq)hag3);
            }
            this.eSP();
        } else if (actionEvent.getActionCommand().equals("Remove All")) {
            for (dta dta7 : this.ETE.values()) {
                if (dta7.bzz() != 0 && dta7.bzz() != 1 && dta7.bzz() != 13 && dta7.bzz() != 14 && dta7.bzz() != 4) continue;
                hag hag4 = (hag)this.DEC.d(4102);
                hag4.Lg(2);
                hag4.qM(dta7.getGUID());
                this.DEC.a((dxq)hag4);
            }
            this.eSP();
        } else if (actionEvent.getActionCommand().equals("Update Table")) {
            ((mxl)this.ETH.getModel()).fireTableDataChanged();
        } else if (actionEvent.getActionCommand().equals("Set Selected")) {
            this.eSS();
        } else if (actionEvent.getActionCommand().equals("Create ObjectSpace")) {
            hag hag5 = (hag)this.DEC.d(4102);
            hag5.Lg(3);
            this.DEC.a((dxq)hag5);
        } else if (actionEvent.getActionCommand().equals("Create Interaction ObjectSpace")) {
            hag hag6 = (hag)this.DEC.d(4102);
            hag6.Lg(3);
            hag6.Ca(14);
            this.DEC.a((dxq)hag6);
        } else if (actionEvent.getActionCommand().equals("Save ObjectSpace")) {
            this.eST();
        } else if (actionEvent.getActionCommand().equals("Rename")) {
            this.eSR();
        } else if (actionEvent.getActionCommand().equals("Reposition ObjectSpace")) {
            this.eSQ();
        } else if (actionEvent.getActionCommand().equals("Move Selected Objects to this OS")) {
            hac hac2 = (hac)this.DEC.d(4097);
            hac2.Lb(49);
            int n7 = this.ETH.getSelectedRow();
            dta dta8 = ((mxl)this.ETH.getModel()).afS(n7);
            hac2.hC(dta8.getGUID());
            this.DEC.a((dxq)hac2);
        }
    }

    private void eSP() {
    }

    private synchronized void eRg() {
        if (this.ETH != null) {
            int[] nArray = this.ETH.getSelectedRows();
            this.eRh();
            ((mxl)this.ETH.getModel()).eHE();
            ((mxl)this.ETH.getModel()).fireTableDataChanged();
            this.ETH.invalidate();
            for (int n2 : nArray) {
                int n3 = ((mxl)this.ETH.getModel()).getRowCount();
                if (n3 <= n2) continue;
                this.ETH.setRowSelectionInterval(n2, n2);
            }
        }
    }

    private void eRh() {
        Object object;
        int n2 = 0;
        int n3 = 0;
        if (this.ETE != null) {
            object = null;
            Object object2 = this.ETE.values().iterator();
            while (object2.hasNext()) {
                object = (dta)object2.next();
                n2 += object.bzr().size();
            }
        }
        object = this.ETH.getSelectedRows();
        for (int n4 : object) {
            dta dta2 = ((mxl)this.ETH.getModel()).afS(n4);
            n3 += dta2.bzr().size();
        }
        this.ETI = false;
        this.setTitle("Loaded ObjectSpaces, Objects = [" + n2 + "], Selected = [" + n3 + "]");
    }

    private void eSQ() {
        int n2 = this.ETH.getSelectedRowCount();
        int[] nArray = this.ETH.getSelectedRows();
        mka mka2 = new mka();
        mka2.m(new lek());
        lek lek2 = mka2.a((Frame)this.DEC, "Enter Movement Meters", "Enter X,Y,Z movement");
        if (lek2 != null) {
            ljq ljq2 = new ljq();
            ljq2.kl((float)(1.0 * (double)lek2.getX()));
            ljq2.km((float)(1.0 * (double)lek2.getY()));
            ljq2.fb((float)(1.0 * (double)lek2.eqe()));
            for (int i = 0; i < n2; ++i) {
                dta dta2 = ((mxl)this.ETH.getModel()).afS(nArray[i]);
                if (dta2 == null) continue;
                hac hac2 = (hac)this.DEC.d(4097);
                hac2.Lb(33);
                hac2.hC(dta2.getGUID());
                hac2.setRotation(new ljq());
                hac2.c(ljq2);
                this.DEC.a((dxq)hac2);
            }
        }
    }

    private void eSR() {
        Object object;
        int n2 = this.ETH.getSelectedRow();
        dta dta2 = ((mxl)this.ETH.getModel()).afS(n2);
        if (dta2 == null) {
            return;
        }
        String string = dta2.getObjectDescriptionFilename();
        if (string.equals("n/a")) {
            string = "";
        }
        String string2 = lcw.qLb + "xml-files/objectspace/" + string;
        if ((string2 = jry.tp(string2)) == null) {
            lfn.b(5, "SFWorldDataDialog", "renameObjectSpace() BaseDir is null! Not renaming.");
            return;
        }
        jrw jrw2 = new jrw(string2);
        if (!jrw2.exists()) {
            string2 = jrw2.dRU() != null && jrw2.dRU().isDirectory() ? jrw2.dRU().getAbsolutePath() : lcw.qLb + "xml-files/objectspace/";
        } else if (!jrw2.isDirectory()) {
            string2 = jrw2.dRU().getAbsolutePath();
        }
        mkb mkb2 = null;
        int n3 = 0;
        try {
            mkb2 = new mkb(string2);
            object = new myr("xml", "XML Files");
            mkb2.Ci(".xml");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(0);
            n3 = mkb2.showDialog(this, "Set Filename");
        }
        catch (Exception exception) {
            lfn.print("FileChooser exception: " + exception);
            return;
        }
        object = mkb2.eDc();
        if (object != null && n3 == 0) {
            String string3 = ((File)object).getPath();
            string3 = string3.toLowerCase();
            String string4 = lcw.qLb + "xml-files/objectspace/";
            if (string3.startsWith(string4 = string4.toLowerCase().replace('/', '\\'))) {
                string3 = string3.substring(string4.length());
                dta2.setObjectDescriptionFilename(string3);
                lfn.b(0, this.getClass().getName(), "renameObjectSpace() : New name is: " + string3);
            } else {
                JOptionPane.showMessageDialog(this, "You must save the ObjectSpace in the OS directory!");
            }
        }
    }

    private void eSS() {
        int n2 = this.ETH.getSelectedRow();
        dta dta2 = ((mxl)this.ETH.getModel()).afS(n2);
        hag hag2 = (hag)this.DEC.d(4102);
        hag2.Lg(4);
        hag2.qM(dta2.getGUID());
        this.DEC.a((dxq)hag2);
        if (this.DEC.ezV() != null) {
            this.DEC.ezV().k(dta2.getObjectDescriptionFilename(), dta2.getGUID());
            this.DEC.ezV().a(dta2.bzr(), dta2.getGUID());
        }
    }

    private void eST() {
        int n2 = this.ETH.getSelectedRow();
        dta dta2 = ((mxl)this.ETH.getModel()).afS(n2);
        if (dta2 != null) {
            Object object;
            Object object2;
            String string;
            Object object3;
            mkb mkb2 = null;
            int n3 = 0;
            try {
                object3 = dta2.getObjectDescriptionFilename();
                if (((String)object3).equals("n/a")) {
                    object3 = "";
                }
                string = lcw.qLb + "xml-files/objectspace/" + (String)object3;
                if ((string = jry.tp(string)) == null) {
                    lfn.b(5, "SFWorldDataDialog", "renameObjectSpace() BaseDir is null! Not renaming.");
                    return;
                }
                object2 = new jrw(string);
                if (!((File)object2).exists()) {
                    if (((jrw)object2).dRU() != null && ((jrw)object2).dRU().isDirectory()) {
                        string = ((jrw)object2).dRU().getAbsolutePath();
                    } else {
                        string = lcw.qLb + "xml-files/objectspace/";
                        if (mje.DBM != null) {
                            string = mje.DBM.getAbsolutePath();
                        }
                    }
                } else if (!((File)object2).isDirectory()) {
                    string = ((jrw)object2).dRU().getAbsolutePath();
                }
                mkb2 = new mkb(string);
                if (!((String)object3).equals("") && ((File)(object = new jrw(lcw.qLb + "xml-files/objectspace/" + (String)object3))).exists() && ((File)object).isFile()) {
                    mkb2.setSelectedFile((File)object);
                }
                object = new myr("xml", "XML Files");
                mkb2.Ci(".xml");
                mkb2.addChoosableFileFilter((FileFilter)object);
                mkb2.setAcceptAllFileFilterUsed(false);
                mkb2.setFileSelectionMode(0);
                n3 = mkb2.showSaveDialog(this);
            }
            catch (Exception exception) {
                lfn.print("FileChooser exception: " + exception);
                return;
            }
            object3 = mkb2.eDc();
            if (object3 != null && n3 == 0) {
                string = lcw.qLb + "xml-files/objectspace/";
                string = string.toLowerCase().replace('/', '\\');
                object2 = ((File)object3).getPath().toLowerCase();
                object2 = ((String)object2).startsWith(string) ? ((String)object2).substring(string.length()) : ((File)object3).getName();
                dta2.setObjectDescriptionFilename((String)object2);
                object = (hag)this.DEC.d(4102);
                ((hag)object).Lg(5);
                ((hag)object).qM(dta2.getGUID());
                this.DEC.a((dxq)object);
            }
        } else {
            lfn.b(4, this.getClass().getName(), "ObjectSpace NULL. Could not be saved!");
        }
    }

    public static boolean ur(ldv ldv2) {
        JCheckBox jCheckBox = ETK.get(ldv2);
        if (jCheckBox != null) {
            return jCheckBox.isSelected();
        }
        return false;
    }

    public static boolean us(ldv ldv2) {
        JCheckBox jCheckBox = ETJ.get(ldv2);
        if (jCheckBox != null) {
            return jCheckBox.isSelected();
        }
        return false;
    }

    static /* synthetic */ mpw a(mxj mxj2) {
        return mxj2.ETH;
    }

    static /* synthetic */ void b(mxj mxj2) {
        mxj2.eRh();
    }

    static /* synthetic */ mxk c(mxj mxj2) {
        return mxj2.ETF;
    }

    static /* synthetic */ boolean a(mxj mxj2, boolean bl) {
        mxj2.ETI = bl;
        return mxj2.ETI;
    }

    static /* synthetic */ aux d(mxj mxj2) {
        return mxj2.DEC;
    }

    static /* synthetic */ Map eSU() {
        return ETJ;
    }

    static /* synthetic */ Map cnw() {
        return ETK;
    }

    static /* synthetic */ void e(mxj mxj2) {
        mxj2.eSS();
    }

    static /* synthetic */ boolean f(mxj mxj2) {
        return mxj2.ETI;
    }

    static /* synthetic */ void g(mxj mxj2) {
        mxj2.eRg();
    }
}

