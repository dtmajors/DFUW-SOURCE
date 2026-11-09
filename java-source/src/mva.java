/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 *  lcw
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.dnd.DropTarget;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class mva
extends mlc
implements ActionListener {
    private bdl EJm = null;
    private aux DEC = null;
    private mvk EGt = null;
    private mkt EJn = null;
    private JPanel EGy = null;
    private mkg EGz = null;
    private JPanel EGA = null;
    private JButton EJo = null;
    private mku EGC = null;
    private mku DNu = null;
    private mks EJp = null;
    private mks EJq = null;
    private mkn EJr = null;
    private muz EJs = null;

    public mva(bdl bdl2) {
        this.setTitle("ObjectCollection  properties");
        this.setPreferredSize(new Dimension(450, 300));
        this.EJm = bdl2;
        this.ePH();
        this.pack();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
        this.EJs.p(aux2);
    }

    private void ePH() {
        this.EGt = new mvk(this);
        JPanel jPanel = null;
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(0));
        this.j(jPanel);
        this.addTab("General", jPanel);
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(0));
        this.k(jPanel);
        this.addTab("Coordinates", jPanel);
        a a2 = new a(this, new BorderLayout());
        this.a(a2);
        this.addTab("Contents", a2);
    }

    private void j(JPanel jPanel) {
        mkn mkn2 = null;
        mkn2 = new mkn("GUID", this.EJm.getGUID().toString());
        jPanel.add(mkn2);
        mkn2 = new mkn("XML SFFile:", this.EJm.amd());
        jPanel.add(mkn2);
        this.EJn = new mkt("Scale", Float.toString(this.EJm.getScale()));
        jPanel.add(this.EJn);
        this.EJo = new JButton("Save As Template");
        this.EJo.addActionListener(new ActionListener(this){
            final /* synthetic */ mva EJt;
            {
                this.EJt = mva2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mva.a(this.EJt, actionEvent);
            }
        });
        jPanel.add(this.EJo);
    }

    private void k(JPanel jPanel) {
        this.EGC = new mku("Position", this.EJm.av());
        jPanel.add(this.EGC);
        this.DNu = new mku("Rotation", this.EJm.FX());
        jPanel.add(this.DNu);
        if (this.EJm instanceof bdn) {
            bdn bdn2 = (bdn)this.EJm;
            this.EJq = new mks(this, "Grid Dimension", bdn2.amp());
            jPanel.add(this.EJq);
            this.EJp = new mks(this, "PivotPoint Cell:", bdn2.ams().bKZ());
            jPanel.add(this.EJp);
            this.EJr = new mkn("Size of each Cell in the Grid: ", Double.toString(bdn2.ams().eqb()));
            jPanel.add(this.EJr);
            mkn mkn2 = new mkn("No of Objects", Integer.toString(bdn2.ams().epV()).toString());
            jPanel.add(mkn2);
        }
    }

    private void a(a a2) {
        mvb mvb2 = new mvb(this.EJm);
        this.EJs = new muz(mvb2);
        this.EJs.uq(this.EJm.getGUID());
        this.EJs.setSelectionMode(2);
        JTableHeader jTableHeader = this.EJs.getTableHeader();
        this.EJs.setShowVerticalLines(true);
        this.EJs.setShowHorizontalLines(true);
        jTableHeader.setReorderingAllowed(false);
        jTableHeader.setVerifyInputWhenFocusTarget(true);
        mol mol2 = new mol();
        jTableHeader.addMouseListener(new mok(jTableHeader, mol2));
        TableColumnModel tableColumnModel = this.EJs.getColumnModel();
        int n = tableColumnModel.getColumnCount();
        for (int i = 0; i < n; ++i) {
            tableColumnModel.getColumn(i).setHeaderRenderer(mol2);
        }
        JScrollPane jScrollPane = new JScrollPane(this.EJs);
        a2.setDropTarget(new DropTarget(this, 1, new myc(), true));
        a2.add(jScrollPane);
    }

    @Override
    protected void eDD() {
        Object object;
        if (this.EGC.hasChanged()) {
            object = (ftv)this.DEC.d(1025);
            ((dxq)object).on(this.EJm.getGUID());
            ((ftv)object).c(this.EGC.bSh());
            ((ftv)object).HT(8);
            this.DEC.a((dxq)object);
        }
        if (this.DNu.hasChanged()) {
            object = (ftv)this.DEC.d(1025);
            ((dxq)object).on(this.EJm.getGUID());
            ((ftv)object).a(new lgl(this.DNu.bSh()));
            ((ftv)object).HT(32);
            this.DEC.a((dxq)object);
        }
        if (this.EJm instanceof bdn) {
            Object object2;
            if (this.EJq != null && this.EJq.hasChanged()) {
                object = ((bdn)this.EJm).ams().amp();
                object2 = this.EJq.eDu();
                if (((lek)object2).cf < ((lek)object).cf || ((lek)object2).cg < ((lek)object).cg || ((lek)object2).riS < ((lek)object).riS) {
                    int n = JOptionPane.showConfirmDialog(this, "New Grid dimension is smaller than old Grid dimension! Objects will be deleted. Continue?", "New Dimension is smaller", 0);
                    if (n == 0) {
                        era era2 = (era)this.DEC.d(9474);
                        era2.on(this.EJm.getGUID());
                        era2.f(lcr.qzr);
                        era2.EN(5);
                        era2.c(this.EJq.eDu());
                        this.DEC.a((dxq)era2);
                    }
                } else {
                    era era3 = (era)this.DEC.d(9474);
                    era3.on(this.EJm.getGUID());
                    era3.f(lcr.qzr);
                    era3.EN(5);
                    era3.c(this.EJq.eDu());
                    this.DEC.a((dxq)era3);
                }
            }
            if (this.EJp != null && this.EJp.hasChanged()) {
                object = this.EJp.eDu();
                object2 = (era)this.DEC.d(9474);
                ((dxq)object2).on(this.EJm.getGUID());
                ((dxq)object2).f(lcr.qzr);
                ((era)object2).EN(6);
                ((era)object2).e((lek)object);
                this.DEC.a((dxq)object2);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    }

    private void cM(ActionEvent actionEvent) {
        Object object;
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(lcw.qLb + "xml-files/object/collection/");
            object = new myr("xml", "XML Files");
            mkb2.Ci(".xml");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(0);
            n = mkb2.showSaveDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            throw new bs(exception);
        }
        object = mkb2.eDc();
        if (object != null && n == 0) {
            String string = ((File)object).toString();
            String string2 = string.substring(0, lcw.qLb.length());
            string = string.substring(lcw.qLb.length() - 1);
            if (string2.equalsIgnoreCase(lcw.qLb)) {
                hac hac2 = (hac)this.DEC.d(4097);
                hac2.Lb(16);
                try {
                    hac2.setFileName(((File)object).getAbsolutePath());
                }
                catch (Exception exception) {
                    // empty catch block
                }
                hac2.hC(this.EJm.getGUID());
                this.DEC.a((dxq)hac2);
                String string3 = "Saving ObjectModuleTemplate [" + object + "]";
            } else {
                JOptionPane.showInternalMessageDialog(this, "Cannot save outside of Install Directory!", "Error: Wrong save area", 0);
            }
        }
    }

    static /* synthetic */ void a(mva mva2, ActionEvent actionEvent) {
        mva2.cM(actionEvent);
    }

    static /* synthetic */ muz a(mva mva2) {
        return mva2.EJs;
    }

    static /* synthetic */ mvk b(mva mva2) {
        return mva2.EGt;
    }

    static /* synthetic */ mkg c(mva mva2) {
        return mva2.EGz;
    }
}

