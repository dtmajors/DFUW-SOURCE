/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 *  lcw
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileFilter;
import org.jdesktop.layout.GroupLayout;

public class moz
extends JInternalFrame {
    private llm DTR = null;
    private JButton DTS;
    private JButton DTT;
    private JButton DEp;
    private JList DTU;
    private JButton DTV;
    private JCheckBox DTW;
    private JCheckBox DTX;
    private JButton DTY;
    private mku DTZ;
    private JButton DUa;
    private mku DUb;
    private JButton DNZ;
    private JToggleButton DUc;
    private JButton DUd;
    private JLabel Q;
    private JLabel R;
    private JPanel aa;
    private JPanel bN;
    private JPanel ac;
    private JPanel ad;
    private JPanel bAw;
    private JScrollPane ah;
    private JSlider DLH;
    private aux DEC;
    private lll rDU = new lll();

    public moz() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.ah = new JScrollPane();
        this.DTU = new JList();
        this.Q = new JLabel();
        this.bN = new JPanel();
        this.DTX = new JCheckBox();
        this.DUb = new mku();
        this.DTZ = new mku();
        this.DUa = new JButton();
        this.DTY = new JButton();
        this.DTW = new JCheckBox();
        this.ac = new JPanel();
        this.DTS = new JButton();
        this.DTV = new JButton();
        this.DTT = new JButton();
        this.ad = new JPanel();
        this.R = new JLabel();
        this.DLH = new JSlider();
        this.bAw = new JPanel();
        this.DEp = new JButton();
        this.DNZ = new JButton();
        this.DUd = new JButton();
        this.DUc = new JToggleButton();
        this.setClosable(true);
        this.setTitle("Camera Path Dialog");
        this.ah.setViewportView(this.DTU);
        this.Q.setText("List of points in current camera path");
        this.bN.setBorder(BorderFactory.createTitledBorder("rotation"));
        this.DTX.setText("Rotate Camera");
        this.DTX.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.DTX.setMargin(new Insets(0, 0, 0, 0));
        this.DTX.addActionListener(new ActionListener(this){
            final /* synthetic */ moz DUe;
            {
                this.DUe = moz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                moz.a(this.DUe, actionEvent);
            }
        });
        this.DUa.setText("Set Start Rot");
        this.DUa.addActionListener(new ActionListener(this){
            final /* synthetic */ moz DUe;
            {
                this.DUe = moz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                moz.b(this.DUe, actionEvent);
            }
        });
        this.DTY.setText("Set End Rot");
        this.DTY.addActionListener(new ActionListener(this){
            final /* synthetic */ moz DUe;
            {
                this.DUe = moz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                moz.c(this.DUe, actionEvent);
            }
        });
        this.DTW.setText("ReverseRotation");
        this.DTW.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.DTW.setMargin(new Insets(0, 0, 0, 0));
        this.DTW.addActionListener(new ActionListener(this){
            final /* synthetic */ moz DUe;
            {
                this.DUe = moz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                moz.d(this.DUe, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.bN);
        this.bN.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.DTX).addPreferredGap(0).add((Component)this.DTW)).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((GroupLayout.Group)groupLayout.createParallelGroup(2).add((Component)this.DUb, -2, -1, -2).add((Component)this.DTZ, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.DUa).add((Component)this.DTY)))).addContainerGap(60, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.DUb, -2, -1, -2).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.DUa))).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(2).add((Component)this.DTZ, -2, -1, -2).add((Component)this.DTY)).addPreferredGap(0, -1, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.DTX).add((Component)this.DTW)).addContainerGap()));
        this.DTS.setText("Add Point");
        this.DTS.addActionListener(new ActionListener(this){
            final /* synthetic */ moz DUe;
            {
                this.DUe = moz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                moz.e(this.DUe, actionEvent);
            }
        });
        this.DTV.setText("Remove Point");
        this.DTV.addActionListener(new ActionListener(this){
            final /* synthetic */ moz DUe;
            {
                this.DUe = moz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                moz.f(this.DUe, actionEvent);
            }
        });
        this.DTT.setText("Clear Point List");
        this.DTT.addActionListener(new ActionListener(this){
            final /* synthetic */ moz DUe;
            {
                this.DUe = moz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                moz.g(this.DUe, actionEvent);
            }
        });
        GroupLayout groupLayout2 = new GroupLayout((Container)this.ac);
        this.ac.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.DTS).addPreferredGap(0).add((Component)this.DTV).addPreferredGap(0).add((Component)this.DTT).addContainerGap(153, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.DTS).add((Component)this.DTV).add((Component)this.DTT)).addContainerGap(-1, Short.MAX_VALUE)));
        this.R.setText("Path time (seconds):");
        this.DLH.setMajorTickSpacing(10);
        this.DLH.setMinorTickSpacing(5);
        this.DLH.setPaintLabels(true);
        this.DLH.setPaintTicks(true);
        this.DLH.setValue(10);
        GroupLayout groupLayout3 = new GroupLayout((Container)this.ad);
        this.ad.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((Component)this.R).add(18, 18, 18).add((Component)this.DLH, -1, 319, Short.MAX_VALUE).addContainerGap()));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((Component)this.DLH, -2, -1, -2).add((Component)this.R)).addContainerGap(-1, Short.MAX_VALUE)));
        this.DEp.setText("Load");
        this.DEp.addActionListener(new ActionListener(this){
            final /* synthetic */ moz DUe;
            {
                this.DUe = moz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                moz.h(this.DUe, actionEvent);
            }
        });
        this.DNZ.setText("Save");
        this.DNZ.addActionListener(new ActionListener(this){
            final /* synthetic */ moz DUe;
            {
                this.DUe = moz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                moz.i(this.DUe, actionEvent);
            }
        });
        this.DUd.setText("Test Path");
        this.DUd.addActionListener(new ActionListener(this){
            final /* synthetic */ moz DUe;
            {
                this.DUe = moz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                moz.j(this.DUe, actionEvent);
            }
        });
        this.DUc.setText("Show trajectory");
        this.DUc.addActionListener(new ActionListener(this){
            final /* synthetic */ moz DUe;
            {
                this.DUe = moz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                moz.k(this.DUe, actionEvent);
            }
        });
        GroupLayout groupLayout4 = new GroupLayout((Container)this.bAw);
        this.bAw.setLayout((LayoutManager)groupLayout4);
        groupLayout4.setHorizontalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().add((Component)this.DEp).addPreferredGap(0).add((Component)this.DNZ).addPreferredGap(0, 134, Short.MAX_VALUE).add((Component)this.DUc).addPreferredGap(0).add((Component)this.DUd).addContainerGap()));
        groupLayout4.setVerticalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap(-1, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout4.createParallelGroup(3).add((Component)this.DEp).add((Component)this.DNZ).add((Component)this.DUd).add((Component)this.DUc)).addContainerGap()));
        GroupLayout groupLayout5 = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout5);
        groupLayout5.setHorizontalGroup((GroupLayout.Group)groupLayout5.createParallelGroup(1).add((GroupLayout.Group)groupLayout5.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout5.createParallelGroup(1).add((Component)this.bN, -1, -1, Short.MAX_VALUE).add((Component)this.ad, -1, -1, Short.MAX_VALUE).add((Component)this.ac, -1, -1, Short.MAX_VALUE).add((Component)this.ah, -1, 456, Short.MAX_VALUE).add((Component)this.Q, -2, 233, -2).add((Component)this.bAw, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        groupLayout5.setVerticalGroup((GroupLayout.Group)groupLayout5.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout5.createSequentialGroup().addContainerGap().add((Component)this.Q).addPreferredGap(0).add((Component)this.ah, -2, -1, -2).addPreferredGap(1).add((Component)this.ac, -2, -1, -2).addPreferredGap(0).add((Component)this.ad, -2, -1, -2).add(16, 16, 16).add((Component)this.bN, -2, -1, -2).addPreferredGap(0).add((Component)this.bAw, -1, -1, Short.MAX_VALUE)));
        GroupLayout groupLayout6 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout6);
        groupLayout6.setHorizontalGroup((GroupLayout.Group)groupLayout6.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        groupLayout6.setVerticalGroup((GroupLayout.Group)groupLayout6.createParallelGroup(1).add((GroupLayout.Group)groupLayout6.createSequentialGroup().add((Component)this.aa, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        this.pack();
    }

    private void aT(ActionEvent actionEvent) {
        this.rDU.yN(this.DTW.isSelected());
    }

    private void aU(ActionEvent actionEvent) {
        this.rDU.yM(this.DTX.isSelected());
    }

    private void aV(ActionEvent actionEvent) {
        ljq ljq2 = mje.DBm;
        this.DUb.cL(ljq2);
        this.rDU.eF(ljq2);
    }

    private void aW(ActionEvent actionEvent) {
        ljq ljq2 = mje.DBm;
        this.DTZ.cL(ljq2);
        this.rDU.eE(ljq2);
    }

    private void aX(ActionEvent actionEvent) {
        assert (this.DEC != null);
        ldv ldv2 = this.DEC.bzv();
        llm llm2 = new llm();
        llm2.setGUID(ldv2);
        llm2.a(this.rDU);
        this.DEC.b((btk)llm2);
    }

    private void aY(ActionEvent actionEvent) {
        int n = this.DTU.getSelectedIndex();
        if (n < 0) {
            return;
        }
        List<ljq> list = this.rDU.euI();
        list.remove(n);
        this.DTU.setListData(new Vector<ljq>(list));
        this.DTU.revalidate();
        this.DTU.repaint();
    }

    private void aZ(ActionEvent actionEvent) {
        List<ljq> list = this.rDU.euI();
        list.clear();
        this.DTU.setListData(new Vector<ljq>(list));
        this.DTU.revalidate();
        this.DTU.repaint();
    }

    private void aB(ActionEvent actionEvent) {
        Object object;
        if (this.rDU.euI().size() < 3) {
            JOptionPane.showMessageDialog(this.DEC.eCu(), "You need atleast 3 points to make a path!");
            return;
        }
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(lcw.qLb + "worldbuilder/camera paths/");
            object = new myr("xml", "XML Files");
            mkb2.Ci(".xml");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(0);
            mkb2.setDialogType(1);
            n = mkb2.showOpenDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return;
        }
        object = mkb2.eDc();
        if (object != null && n == 0) {
            String string = ((File)object).getName().toLowerCase();
            if (!string.endsWith(".xml")) {
                string = string + ".xml";
            }
            jyi jyi2 = new jyi();
            jyi2.a(string, this.rDU);
        }
    }

    private void aj(ActionEvent actionEvent) {
        Object object;
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(lcw.qLb + "worldbuilder/camera paths/");
            object = new myr("xml", "XML Files");
            mkb2.Ci(".xml");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(0);
            mkb2.setDialogType(0);
            n = mkb2.showOpenDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return;
        }
        object = mkb2.eDc();
        lll lll2 = null;
        if (object != null && n == 0) {
            jwc jwc2 = new jwc();
            lll2 = jwc2.p((jrw)object);
        }
        if (lll2 != null) {
            this.rDU = lll2;
            this.DTU.setListData(new Vector<ljq>(this.rDU.euI()));
            this.DTU.revalidate();
            this.DTU.repaint();
        }
        this.DUb.cL(this.rDU.euK());
        this.DTZ.cL(this.rDU.euJ());
        this.DLH.setValue((int)this.rDU.getDuration());
        this.DTX.setSelected(this.rDU.euL());
    }

    private void ba(ActionEvent actionEvent) {
        ljq ljq2 = new ljq(mje.DBl);
        List<ljq> list = this.rDU.euI();
        list.add(ljq2);
        this.DTU.setListData(new Vector<ljq>(list));
        this.DTU.revalidate();
        this.DTU.repaint();
    }

    private void bb(ActionEvent actionEvent) {
        this.eIc();
    }

    private void eIc() {
        ldv ldv2 = this.DEC.bzv();
        dxr dxr2 = this.DEC.uo(ldv2);
        assert (dxr2 != null);
        if (this.DTR != null) {
            this.DTR.rEd = true;
        }
        this.DTR = new llm();
        this.DTR.setGUID(ldv2);
        this.DTR.rEc = true;
        this.DTR.a(this.rDU);
        if (!this.DUc.isSelected()) {
            // empty if block
        }
        gzw gzw2 = (gzw)this.DEC.d(4124);
        gzw2.on(lcr.qAE);
        gzw2.jvM = this.DTR;
        this.DEC.a((dxq)gzw2);
    }

    private void c() {
        this.DTU.setListData(new Vector<ljq>(this.rDU.euI()));
        this.DUb.setTitle("Start Rotation");
        this.DTZ.setTitle("End Rotation");
        this.DLH.addChangeListener(new ChangeListener(this){
            final /* synthetic */ moz DUe;
            {
                this.DUe = moz2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                moz.b(this.DUe).setDuration(moz.a(this.DUe).getValue());
            }
        });
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(moz moz2, ActionEvent actionEvent) {
        moz2.aU(actionEvent);
    }

    static /* synthetic */ void b(moz moz2, ActionEvent actionEvent) {
        moz2.aV(actionEvent);
    }

    static /* synthetic */ void c(moz moz2, ActionEvent actionEvent) {
        moz2.aW(actionEvent);
    }

    static /* synthetic */ void d(moz moz2, ActionEvent actionEvent) {
        moz2.aT(actionEvent);
    }

    static /* synthetic */ void e(moz moz2, ActionEvent actionEvent) {
        moz2.ba(actionEvent);
    }

    static /* synthetic */ void f(moz moz2, ActionEvent actionEvent) {
        moz2.aY(actionEvent);
    }

    static /* synthetic */ void g(moz moz2, ActionEvent actionEvent) {
        moz2.aZ(actionEvent);
    }

    static /* synthetic */ void h(moz moz2, ActionEvent actionEvent) {
        moz2.aj(actionEvent);
    }

    static /* synthetic */ void i(moz moz2, ActionEvent actionEvent) {
        moz2.aB(actionEvent);
    }

    static /* synthetic */ void j(moz moz2, ActionEvent actionEvent) {
        moz2.aX(actionEvent);
    }

    static /* synthetic */ void k(moz moz2, ActionEvent actionEvent) {
        moz2.bb(actionEvent);
    }

    static /* synthetic */ JSlider a(moz moz2) {
        return moz2.DLH;
    }

    static /* synthetic */ lll b(moz moz2) {
        return moz2.rDU;
    }
}

