/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 *  lcw
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.dnd.DropTarget;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class mwc
extends mkx
implements ActionListener {
    private aux DEC = null;
    private Dimension bV = new Dimension(500, 350);
    private static int EOO = 1;
    private mwb EOP;
    private mwd EOQ;
    private b EOR;
    private JButton DNZ = new JButton("Save Palette");
    private JButton EOS = new JButton("Check file existance");
    private String EOT;
    private List fu;

    public mwc(List list, String string) {
        super(false);
        this.fu = list;
        this.EOT = string;
        this.setClosable(true);
        this.eQP();
        ++EOO;
        this.setPreferredSize(this.bV);
        this.EOR = new b(this);
        this.EOQ = new mwd(this);
        this.r();
        this.pack();
    }

    private void r() {
        JPanel jPanel = new JPanel(new FlowLayout(2));
        a a2 = new a(this, new BorderLayout());
        this.c(a2);
        this.EOS.addActionListener(new ActionListener(this){
            final /* synthetic */ mwc EOU;
            {
                this.EOU = mwc2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mwc.a(this.EOU);
            }
        });
        jPanel.add(this.EOS);
        this.DNZ.addActionListener(new ActionListener(this){
            final /* synthetic */ mwc EOU;
            {
                this.EOU = mwc2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mwc.b(this.EOU);
            }
        });
        jPanel.add(this.DNZ);
        this.DGa.add((Component)a2, "Center");
        this.DGa.add((Component)jPanel, "South");
    }

    private void eQP() {
        this.setTitle("Object Palette Nr [" + EOO + "], Filename [" + this.EOT + "]");
    }

    private void eQQ() {
        Iterator iterator = this.fu.iterator();
        while (iterator.hasNext()) {
            jrw jrw2 = (jrw)iterator.next();
            if (!jrw2.exists()) {
                lfn.b(4, "", "SFFile [" + jrw2 + "] does not exist! Removing it from palette.");
                iterator.remove();
            }
            ((mwe)this.EOP.getModel()).fireTableDataChanged();
        }
    }

    private void eQR() {
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(lcw.qLb + "worldbuilder/palette-configs/");
            mkb2.addChoosableFileFilter(new myr("xml", "Palette Files"));
            mkb2.Ci(".xml");
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(0);
            n = mkb2.showSaveDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return;
        }
        jrw jrw2 = mkb2.eDc();
        if (jrw2 != null) {
            if (n == 0) {
                String string = jrw2.toString();
                String string2 = string.substring(0, lcw.qLb.length());
                string = string.substring(lcw.qLb.length() - 1);
                if (string2.equalsIgnoreCase(lcw.qLb)) {
                    jyt jyt2 = new jyt();
                    jyt2.a(this.fu, jrw2);
                } else {
                    JOptionPane.showInternalMessageDialog(this, "Cannot save outside of Install Directory!", "Error: Wrong save area", 0);
                }
            }
            this.EOT = jrw2.getName();
            this.eQP();
        }
    }

    private void c(JPanel jPanel) {
        mwe mwe2 = new mwe(this.fu);
        this.EOP = new mwb(mwe2);
        this.EOP.addMouseListener(this.EOR);
        this.EOP.setSelectionMode(2);
        this.EOP.setDropTarget(new DropTarget(this, 1, new myc(), true));
        JTableHeader jTableHeader = this.EOP.getTableHeader();
        this.EOP.setShowVerticalLines(true);
        this.EOP.setShowHorizontalLines(true);
        jTableHeader.setReorderingAllowed(false);
        jTableHeader.setVerifyInputWhenFocusTarget(true);
        mol mol2 = new mol();
        jTableHeader.addMouseListener(new mok(jTableHeader, mol2));
        TableColumnModel tableColumnModel = this.EOP.getColumnModel();
        int n = tableColumnModel.getColumnCount();
        for (int i = 0; i < n; ++i) {
            tableColumnModel.getColumn(i).setHeaderRenderer(mol2);
        }
        JScrollPane jScrollPane = new JScrollPane(this.EOP);
        jPanel.add(jScrollPane);
        jPanel.setDropTarget(new DropTarget(this, 1, new myc(), true));
    }

    private void Q(jrw jrw2) {
        lfn.b(0, this.getClass().getName(), "Gonna load file = " + jrw2);
        if (this.DEC != null && jrw2 != null && jrw2.isFile()) {
            hac hac2 = (hac)this.DEC.d(4097);
            hac2.on(lcr.qAE);
            hac2.f(lcr.qzr);
            hac2.Lb(1);
            hac2.setFileName(jrw2.getAbsolutePath());
            this.DEC.a((dxq)hac2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("Update Table")) {
            ((mwe)this.EOP.getModel()).fireTableDataChanged();
        } else if (actionEvent.getActionCommand().equals("Delete")) {
            int[] nArray = this.EOP.getSelectedRows();
            int n = 0;
            for (int i = 0; i < nArray.length; ++i) {
                n = nArray[i];
                ((mwe)this.EOP.getModel()).aeL(n);
            }
            ((mwe)this.EOP.getModel()).fireTableDataChanged();
        }
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mwc mwc2) {
        mwc2.eQQ();
    }

    static /* synthetic */ void b(mwc mwc2) {
        mwc2.eQR();
    }

    static /* synthetic */ mwb c(mwc mwc2) {
        return mwc2.EOP;
    }

    static /* synthetic */ mwd d(mwc mwc2) {
        return mwc2.EOQ;
    }

    static /* synthetic */ void a(mwc mwc2, jrw jrw2) {
        mwc2.Q(jrw2);
    }
}

