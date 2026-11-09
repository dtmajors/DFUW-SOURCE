/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.jdesktop.layout.GroupLayout;

public class mrs
extends JInternalFrame {
    private JButton qtg;
    private JSlider EmE;
    private JCheckBox EmF;
    private JCheckBox EmG;
    private JButton DEt;
    private JCheckBox EmH;
    private JCheckBox EmI;
    private JCheckBox EmJ;
    private JCheckBox EmK;
    private JCheckBox EmL;
    private JCheckBox EmM;
    private JCheckBox EmN;
    private JCheckBox EmO;
    private JSlider EmP;
    private JCheckBox EmQ;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private JLabel R;
    private JLabel S;
    private JPanel aa;
    private JPanel ac;
    private JSeparator bAx;
    private JSeparator EmR;
    private JSeparator EmS;

    public mrs() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.DEt = new JButton();
        this.qtg = new JButton();
        this.ac = new JPanel();
        this.I = new JLabel();
        this.EmH = new JCheckBox();
        this.EmL = new JCheckBox();
        this.EmM = new JCheckBox();
        this.EmQ = new JCheckBox();
        this.EmO = new JCheckBox();
        this.EmJ = new JCheckBox();
        this.EmI = new JCheckBox();
        this.EmN = new JCheckBox();
        this.bAx = new JSeparator();
        this.P = new JLabel();
        this.EmR = new JSeparator();
        this.EmE = new JSlider();
        this.Q = new JLabel();
        this.EmS = new JSeparator();
        this.R = new JLabel();
        this.EmP = new JSlider();
        this.S = new JLabel();
        this.EmK = new JCheckBox();
        this.EmF = new JCheckBox();
        this.EmG = new JCheckBox();
        this.setClosable(true);
        this.setIconifiable(true);
        this.setResizable(true);
        this.setTitle("Worldbuilder Preferences");
        this.DEt.setText("Ok");
        this.DEt.addActionListener(new ActionListener(this){
            final /* synthetic */ mrs EmT;
            {
                this.EmT = mrs2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mrs.a(this.EmT, actionEvent);
            }
        });
        this.qtg.setText("Cancel");
        this.qtg.addActionListener(new ActionListener(this){
            final /* synthetic */ mrs EmT;
            {
                this.EmT = mrs2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mrs.b(this.EmT, actionEvent);
            }
        });
        this.I.setText("Object Selection:");
        this.EmH.setText("Select object with one mouse-click");
        this.EmH.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.EmH.setMargin(new Insets(0, 0, 0, 0));
        this.EmL.setText("Select objects from all objectspaces");
        this.EmL.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.EmL.setMargin(new Insets(0, 0, 0, 0));
        this.EmM.setText("Selected last object loaded");
        this.EmM.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.EmM.setMargin(new Insets(0, 0, 0, 0));
        this.EmQ.setText("Use shader to mark object selection");
        this.EmQ.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.EmQ.setMargin(new Insets(0, 0, 0, 0));
        this.EmO.setText("Show Thumbnails in FileExplorer");
        this.EmO.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.EmO.setMargin(new Insets(0, 0, 0, 0));
        this.EmJ.setText("Power User");
        this.EmJ.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.EmJ.setMargin(new Insets(0, 0, 0, 0));
        this.EmI.setText("One instance of Wizard dialogs");
        this.EmI.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.EmI.setMargin(new Insets(0, 0, 0, 0));
        this.EmN.setText("Show Messageboxes when processing");
        this.EmN.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.EmN.setMargin(new Insets(0, 0, 0, 0));
        this.P.setText("Interface Settings:");
        this.EmE.setMajorTickSpacing(25);
        this.EmE.setMinorTickSpacing(5);
        this.EmE.setPaintLabels(true);
        this.EmE.setPaintTicks(true);
        this.EmE.setToolTipText("Sets the delay between each frame rendered. Increase frame-delay to increase the worldbuilder gui responsiveness.");
        this.EmE.setValue(10);
        this.EmE.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mrs EmT;
            {
                this.EmT = mrs2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                mrs.a(this.EmT, changeEvent);
            }
        });
        this.Q.setText("Frame Delay (ms);");
        this.R.setText("Speed Sensitivity:");
        this.EmP.setMajorTickSpacing(2000);
        this.EmP.setMaximum(20000);
        this.EmP.setMinorTickSpacing(500);
        this.EmP.setPaintTicks(true);
        this.EmP.setToolTipText("Sets the sensitivity for the mouse wheel");
        this.EmP.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mrs EmT;
            {
                this.EmT = mrs2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                mrs.b(this.EmT, changeEvent);
            }
        });
        this.S.setText("Behaviour:");
        this.EmK.setText("Random Rotate Nature objects");
        this.EmK.setToolTipText("If checked, will rotate all objects from the nature-folder with a random value on insertion");
        this.EmK.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.EmK.setMargin(new Insets(0, 0, 0, 0));
        this.EmF.setText("Automatically go to selected objects.");
        this.EmF.addActionListener(new ActionListener(this){
            final /* synthetic */ mrs EmT;
            {
                this.EmT = mrs2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mrs.c(this.EmT, actionEvent);
            }
        });
        this.EmG.setText("Offset Camera on GoTo objects");
        this.EmG.addActionListener(new ActionListener(this){
            final /* synthetic */ mrs EmT;
            {
                this.EmT = mrs2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mrs.d(this.EmT, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.ac);
        this.ac.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap(40, Short.MAX_VALUE).add((Component)this.EmR, -1, 328, Short.MAX_VALUE).add(10, 10, 10)).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().add(34, 34, 34).add((Component)this.EmE, -1, 334, Short.MAX_VALUE).addContainerGap()).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().add(44, 44, 44).add((Component)this.EmS, -1, 324, Short.MAX_VALUE).addContainerGap()).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().add(39, 39, 39).add((Component)this.EmP, -1, 329, Short.MAX_VALUE).addContainerGap()).add((GroupLayout.Group)groupLayout.createSequentialGroup().add(44, 44, 44).add((Component)this.R).addContainerGap(248, Short.MAX_VALUE)).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap(40, Short.MAX_VALUE).add((Component)this.bAx, -1, 328, Short.MAX_VALUE).add(10, 10, 10)).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add(41, 41, 41).add((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (Component)this.P).add(2, (Component)this.I)).addPreferredGap(0)).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap(39, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createParallelGroup(2).add((Component)this.S).add((Component)this.Q)).add(9, 9, 9))).add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.EmG).add((Component)this.EmF).add((Component)this.EmK).add((Component)this.EmJ).add((Component)this.EmI).add((Component)this.EmO).add((Component)this.EmQ).add((Component)this.EmM).add((Component)this.EmL).add((Component)this.EmH).add((Component)this.EmN)).add(39, 39, 39)));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.EmH).addPreferredGap(0).add((Component)this.EmL).addPreferredGap(0).add((Component)this.EmM).addPreferredGap(0).add((Component)this.EmQ)).add((Component)this.I)).addPreferredGap(0).add((Component)this.bAx, -2, 10, -2).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.P).add((Component)this.EmO)).addPreferredGap(0).add((Component)this.EmI).addPreferredGap(0).add((Component)this.EmN).addPreferredGap(0).add((Component)this.EmJ).addPreferredGap(0).add((Component)this.EmR, -2, 10, -2).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.S).add((Component)this.EmK)).addPreferredGap(0).add((Component)this.EmF).addPreferredGap(1).add((Component)this.EmG).addPreferredGap(0, 20, Short.MAX_VALUE).add((Component)this.Q).addPreferredGap(0).add((Component)this.EmE, -2, 62, -2).addPreferredGap(0).add((Component)this.EmS, -2, 10, -2).addPreferredGap(0).add((Component)this.R).addPreferredGap(0).add((Component)this.EmP, -2, -1, -2).addContainerGap()));
        GroupLayout groupLayout2 = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (Component)this.ac, -1, -1, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.DEt).addPreferredGap(0, 268, Short.MAX_VALUE).add((Component)this.qtg))).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.ac, -1, -1, Short.MAX_VALUE).addPreferredGap(0).add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.DEt).add((Component)this.qtg)).addContainerGap()));
        GroupLayout groupLayout3 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        this.pack();
    }

    private void H(ActionEvent actionEvent) {
        this.eHO();
    }

    private void I(ActionEvent actionEvent) {
        this.p();
    }

    private void h(ChangeEvent changeEvent) {
        mje.DBf = this.EmP.getValue();
    }

    private void i(ChangeEvent changeEvent) {
        mje.DBe = this.EmE.getValue();
    }

    private void bN(ActionEvent actionEvent) {
        mje.DBH = this.EmF.isSelected();
    }

    private void bO(ActionEvent actionEvent) {
        mje.DBI = this.EmG.isSelected();
    }

    private void c() {
        this.EmH.setSelected(mje.DAX);
        this.EmI.setSelected(mje.DBj);
        this.EmJ.setSelected(mje.DBk);
        this.EmL.setSelected(mje.DAZ);
        this.EmM.setSelected(mje.DBd);
        this.EmN.setSelected(mje.DBb);
        this.EmO.setSelected(mje.DAY);
        this.EmQ.setSelected(mje.DBc);
        this.EmP.setValue((int)mje.DBf);
        this.EmE.setValue((int)mje.DBe);
        this.EmK.setSelected(mje.DBh);
        this.EmF.setSelected(mje.DBH);
        this.EmG.setSelected(mje.DBI);
    }

    private void p() {
        mje.DAX = this.EmH.isSelected();
        mje.DBj = this.EmI.isSelected();
        mje.DBk = this.EmJ.isSelected();
        mje.DAZ = this.EmL.isSelected();
        mje.DBd = this.EmM.isSelected();
        mje.DBb = this.EmN.isSelected();
        mje.DAY = this.EmO.isSelected();
        mje.DBc = this.EmQ.isSelected();
        mje.DBh = this.EmK.isSelected();
        mzw mzw2 = new mzw();
        mzw2.eTA();
        this.dispose();
    }

    private void eHO() {
        this.dispose();
    }

    static /* synthetic */ void a(mrs mrs2, ActionEvent actionEvent) {
        mrs2.I(actionEvent);
    }

    static /* synthetic */ void b(mrs mrs2, ActionEvent actionEvent) {
        mrs2.H(actionEvent);
    }

    static /* synthetic */ void a(mrs mrs2, ChangeEvent changeEvent) {
        mrs2.i(changeEvent);
    }

    static /* synthetic */ void b(mrs mrs2, ChangeEvent changeEvent) {
        mrs2.h(changeEvent);
    }

    static /* synthetic */ void c(mrs mrs2, ActionEvent actionEvent) {
        mrs2.bN(actionEvent);
    }

    static /* synthetic */ void d(mrs mrs2, ActionEvent actionEvent) {
        mrs2.bO(actionEvent);
    }
}

