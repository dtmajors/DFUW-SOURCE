/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.jdesktop.layout.GroupLayout;

public class mvi
extends JInternalFrame {
    private JButton DTS;
    private JTextField EKE;
    private JTextField EgS;
    private JSlider EKF;
    private JSlider EKG;
    private JButton EKH;
    private JSlider EKI;
    private JSlider EKJ;
    private JCheckBox DFu;
    private JLabel EKK;
    private JLabel EKL;
    private JLabel EKM;
    private JLabel EKN;
    private JLabel EKO;
    private JLabel EKP;
    private JLabel EKQ;
    private JList DFW;
    private JPanel aa;
    private JPanel bN;
    private JPanel ac;
    private JScrollPane ah;
    dsr EKR;

    public mvi() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.EKK = new JLabel();
        this.EgS = new JTextField();
        this.EKL = new JLabel();
        this.EKE = new JTextField();
        this.bN = new JPanel();
        this.ah = new JScrollPane();
        this.DFW = new JList();
        this.DTS = new JButton();
        this.EKH = new JButton();
        this.ac = new JPanel();
        this.EKM = new JLabel();
        this.EKI = new JSlider();
        this.EKJ = new JSlider();
        this.DFu = new JCheckBox();
        this.EKN = new JLabel();
        this.EKO = new JLabel();
        this.EKP = new JLabel();
        this.EKQ = new JLabel();
        this.EKF = new JSlider();
        this.EKG = new JSlider();
        this.setClosable(true);
        this.setIconifiable(true);
        this.setMaximizable(true);
        this.setResizable(true);
        this.setTitle("Elevator Properties");
        this.EKK.setText("Meshfile:");
        this.EgS.setEditable(false);
        this.EKL.setText("GUID:");
        this.EKE.setEditable(false);
        this.bN.setBorder(BorderFactory.createTitledBorder("Control Points"));
        this.DFW.setModel(new AbstractListModel(this){
            String[] qos;
            final /* synthetic */ mvi EKS;
            {
                this.EKS = mvi2;
                this.qos = new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
            }

            public int getSize() {
                return this.qos.length;
            }

            public Object getElementAt(int n) {
                return this.qos[n];
            }
        });
        this.ah.setViewportView(this.DFW);
        this.DTS.setText("Add");
        this.DTS.addActionListener(new ActionListener(this){
            final /* synthetic */ mvi EKS;
            {
                this.EKS = mvi2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvi.a(this.EKS, actionEvent);
            }
        });
        this.EKH.setText("Refresh");
        this.EKH.addActionListener(new ActionListener(this){
            final /* synthetic */ mvi EKS;
            {
                this.EKS = mvi2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvi.b(this.EKS, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.bN);
        this.bN.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.ah, -1, 245, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.DTS).addPreferredGap(0).add((Component)this.EKH))).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.ah, -2, 263, -2).addPreferredGap(0, 43, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.DTS).add((Component)this.EKH)).addContainerGap()));
        this.EKM.setText("Speed:");
        this.EKI.setMajorTickSpacing(2);
        this.EKI.setMaximum(80);
        this.EKI.setMinorTickSpacing(1);
        this.EKI.setPaintLabels(true);
        this.EKI.setPaintTicks(true);
        this.EKI.setSnapToTicks(true);
        this.EKI.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvi EKS;
            {
                this.EKS = mvi2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                mvi.a(this.EKS, changeEvent);
            }
        });
        this.DFu.setText("Loop the route");
        this.DFu.addActionListener(new ActionListener(this){
            final /* synthetic */ mvi EKS;
            {
                this.EKS = mvi2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvi.c(this.EKS, actionEvent);
            }
        });
        this.EKN.setText("PauseTime:");
        this.EKF.setMajorTickSpacing(4);
        this.EKF.setMaximum(64);
        this.EKF.setMinorTickSpacing(2);
        this.EKF.setPaintLabels(true);
        this.EKF.setPaintTicks(true);
        this.EKF.setSnapToTicks(true);
        this.EKF.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvi EKS;
            {
                this.EKS = mvi2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                mvi.b(this.EKS, changeEvent);
            }
        });
        this.EKO.setText("Alternate PauseTime is used only for non looping elevators. Use -1 to disable it.");
        this.EKP.setText("PauseTime (ALT):");
        this.EKG.setMajorTickSpacing(1);
        this.EKG.setMaximum(16);
        this.EKG.setMinimum(-1);
        this.EKG.setMinorTickSpacing(1);
        this.EKG.setPaintLabels(true);
        this.EKG.setPaintTicks(true);
        this.EKG.setSnapToTicks(true);
        this.EKG.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvi EKS;
            {
                this.EKS = mvi2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                mvi.c(this.EKS, changeEvent);
            }
        });
        this.EKQ.setText("Acceleration:");
        this.EKJ.setMajorTickSpacing(1);
        this.EKJ.setMaximum(64);
        this.EKJ.setMinorTickSpacing(1);
        this.EKJ.setPaintLabels(true);
        this.EKJ.setPaintTicks(true);
        this.EKJ.setSnapToTicks(true);
        this.EKJ.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvi EKS;
            {
                this.EKS = mvi2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                mvi.d(this.EKS, changeEvent);
            }
        });
        GroupLayout groupLayout2 = new GroupLayout((Container)this.ac);
        this.ac.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(2).add((Component)this.EKP).add((Component)this.EKN).add((Component)this.EKM).add((Component)this.EKQ)).addPreferredGap(0).add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.DFu).add((Component)this.EKO).add(2, (Component)this.EKJ, -1, 343, Short.MAX_VALUE).add(2, (Component)this.EKI, -1, 343, Short.MAX_VALUE).add(2, (Component)this.EKF, -1, 343, Short.MAX_VALUE).add(2, (Component)this.EKG, -1, 343, Short.MAX_VALUE)).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.EKI, -2, -1, -2).add((Component)this.EKM)).addContainerGap(5, 50).add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.EKJ, -2, -1, -2).add((Component)this.EKQ)).addContainerGap(5, 50).add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.EKF, -2, -1, -2).add((Component)this.EKN)).addContainerGap(5, 50).add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.EKG, -2, -1, -2).add((Component)this.EKP)).add((Component)this.EKO).addContainerGap(5, 50).add((Component)this.DFu).addContainerGap()));
        GroupLayout groupLayout3 = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().add((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((Component)this.EKK).add((Component)this.EKL)).addPreferredGap(0).add((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((Component)this.EgS, -1, 800, Short.MAX_VALUE).add((Component)this.EKE, -2, 149, -2))).add((GroupLayout.Group)groupLayout3.createSequentialGroup().add((Component)this.bN, -2, -1, -2).addPreferredGap(1).add((Component)this.ac, -1, -1, Short.MAX_VALUE))).addContainerGap()));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout3.createParallelGroup(3).add((Component)this.EKK).add((Component)this.EgS, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout3.createParallelGroup(3).add((Component)this.EKL).add((Component)this.EKE, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((Component)this.ac, -1, -1, Short.MAX_VALUE).add((Component)this.bN, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        GroupLayout groupLayout4 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout4);
        groupLayout4.setHorizontalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        groupLayout4.setVerticalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        this.pack();
    }

    private void cY(ActionEvent actionEvent) {
        this.eQI();
    }

    private void ba(ActionEvent actionEvent) {
        this.eQH();
    }

    private void S(ActionEvent actionEvent) {
        this.eQG();
    }

    private void l(ChangeEvent changeEvent) {
        JSlider jSlider = (JSlider)changeEvent.getSource();
        if (!jSlider.getValueIsAdjusting()) {
            this.eQD();
        }
    }

    private void m(ChangeEvent changeEvent) {
        JSlider jSlider = (JSlider)changeEvent.getSource();
        if (!jSlider.getValueIsAdjusting()) {
            this.eQC();
        }
    }

    private void n(ChangeEvent changeEvent) {
        JSlider jSlider = (JSlider)changeEvent.getSource();
        if (!jSlider.getValueIsAdjusting()) {
            this.eQE();
        }
    }

    private void o(ChangeEvent changeEvent) {
        JSlider jSlider = (JSlider)changeEvent.getSource();
        if (!jSlider.getValueIsAdjusting()) {
            this.eQF();
        }
    }

    private void c() {
        this.eQI();
    }

    private void eQC() {
        if (this.EKR == null) {
            return;
        }
        float f2 = this.EKJ.getValue();
        if (f2 <= 0.0f) {
            f2 = 0.1f;
        }
        lfn.b(0, this.getClass().getSimpleName(), "changeSpeed() : Acceleration = " + f2);
        this.EKR.iw(f2);
    }

    private void eQD() {
        if (this.EKR == null) {
            return;
        }
        float f2 = this.EKI.getValue();
        if (f2 <= 0.0f) {
            f2 = 0.1f;
        }
        lfn.b(0, this.getClass().getSimpleName(), "changeSpeed() : Speed = " + f2);
        this.EKR.iv(f2);
    }

    private void eQE() {
        if (this.EKR == null) {
            return;
        }
        float f2 = this.EKF.getValue();
        lfn.b(0, this.getClass().getSimpleName(), "changePauseTime() : PauseTime = " + f2);
        this.EKR.ix(f2);
    }

    private void eQF() {
        if (this.EKR == null) {
            return;
        }
        float f2 = this.EKG.getValue();
        lfn.b(0, this.getClass().getSimpleName(), "changePauseTime() : PauseTimeAlternate = " + f2);
        this.EKR.iy(f2);
    }

    private void eQG() {
        if (this.EKR == null) {
            return;
        }
        boolean bl = this.DFu.isSelected();
        lfn.b(0, this.getClass().getSimpleName(), "changeLooping() : Looping = " + bl);
        this.EKR.jv(bl);
    }

    private void eQH() {
        if (this.EKR == null) {
            return;
        }
        this.EKR.t(mje.DBl, new lgl());
        this.eQI();
    }

    private void eQI() {
        if (this.EKR == null) {
            lfn.b(5, this.getClass().getSimpleName(), "setupJList() : Elevator is null!");
            return;
        }
        List<dss> list = this.EKR.getPoints();
        ArrayList<ljq> arrayList = lcn.emv();
        for (dss dss2 : list) {
            arrayList.add(dss2.av());
        }
        this.DFW.setListData(arrayList.toArray());
    }

    private void update() {
        if (this.EKR == null) {
            return;
        }
        this.EKI.setValue((int)this.EKR.aBG());
        this.EKF.setValue((int)this.EKR.byz());
        this.EKG.setValue((int)this.EKR.byA());
        this.EKJ.setValue((int)this.EKR.getAcceleration());
        this.DFu.setSelected(this.EKR.byB());
    }

    public void a(dsr dsr2) {
        this.EKR = dsr2;
        this.EKE.setText(this.EKR.getGUID().toString());
        this.EgS.setText(this.EKR.getObjectDescriptionFilename());
        this.eQI();
        this.update();
    }

    static /* synthetic */ void a(mvi mvi2, ActionEvent actionEvent) {
        mvi2.ba(actionEvent);
    }

    static /* synthetic */ void b(mvi mvi2, ActionEvent actionEvent) {
        mvi2.cY(actionEvent);
    }

    static /* synthetic */ void a(mvi mvi2, ChangeEvent changeEvent) {
        mvi2.l(changeEvent);
    }

    static /* synthetic */ void c(mvi mvi2, ActionEvent actionEvent) {
        mvi2.S(actionEvent);
    }

    static /* synthetic */ void b(mvi mvi2, ChangeEvent changeEvent) {
        mvi2.n(changeEvent);
    }

    static /* synthetic */ void c(mvi mvi2, ChangeEvent changeEvent) {
        mvi2.o(changeEvent);
    }

    static /* synthetic */ void d(mvi mvi2, ChangeEvent changeEvent) {
        mvi2.m(changeEvent);
    }
}

