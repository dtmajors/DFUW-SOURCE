/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  ep
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import org.jdesktop.layout.GroupLayout;

public class mul
extends JDialog
implements mrc {
    private JButton EGD;
    private JButton qtg;
    private JButton DJd;
    private JButton EGE;
    private JTextField DJg;
    private JButton DEt;
    private JButton EGF;
    private JComboBox DJh;
    private JTextField DGx;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private JList DFW;
    private JPanel aa;
    private JPanel bN;
    private JPanel ac;
    private JScrollPane ah;
    private cua EGG;
    private aux DEC;

    public mul(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.DEt = new JButton();
        this.qtg = new JButton();
        this.bN = new JPanel();
        this.Q = new JLabel();
        this.P = new JLabel();
        this.DJg = new JTextField();
        this.DJd = new JButton();
        this.I = new JLabel();
        this.DJh = new JComboBox();
        this.DGx = new JTextField();
        this.ac = new JPanel();
        this.ah = new JScrollPane();
        this.DFW = new JList();
        this.EGD = new JButton();
        this.EGE = new JButton();
        this.EGF = new JButton();
        this.setDefaultCloseOperation(2);
        this.DEt.setText("Ok");
        this.DEt.addActionListener(new ActionListener(this){
            final /* synthetic */ mul EGH;
            {
                this.EGH = mul2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mul.a(this.EGH, actionEvent);
            }
        });
        this.qtg.setText("Cancel");
        this.qtg.addActionListener(new ActionListener(this){
            final /* synthetic */ mul EGH;
            {
                this.EGH = mul2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mul.b(this.EGH, actionEvent);
            }
        });
        this.Q.setText("Value:");
        this.P.setText("Name:");
        this.DJg.setToolTipText("If you know the name of the typel, you can write it here, or use the skill schooser instead");
        this.DJd.setText("Choose..");
        this.DJd.addActionListener(new ActionListener(this){
            final /* synthetic */ mul EGH;
            {
                this.EGH = mul2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mul.c(this.EGH, actionEvent);
            }
        });
        this.I.setText("Type:");
        this.DJh.setModel(new DefaultComboBoxModel<String>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        this.DJh.addActionListener(new ActionListener(this){
            final /* synthetic */ mul EGH;
            {
                this.EGH = mul2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mul.d(this.EGH, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.bN);
        this.bN.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1, false).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.Q).addPreferredGap(0).add((Component)this.DGx)).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.P).addPreferredGap(0).add((Component)this.DJg)).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.I).add(7, 7, 7).add((Component)this.DJh, -2, 129, -2))).addPreferredGap(0).add((Component)this.DJd).addContainerGap(87, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.I).add((Component)this.DJh, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.P).add((Component)this.DJg, -2, -1, -2).add((Component)this.DJd)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.Q).add((Component)this.DGx, -2, -1, -2)).addContainerGap(44, Short.MAX_VALUE)));
        this.ac.setBorder(BorderFactory.createTitledBorder("Composite Details"));
        this.ah.setViewportView(this.DFW);
        this.EGD.setText("Add");
        this.EGD.setEnabled(false);
        this.EGD.addActionListener(new ActionListener(this){
            final /* synthetic */ mul EGH;
            {
                this.EGH = mul2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mul.e(this.EGH, actionEvent);
            }
        });
        this.EGE.setText("Edit");
        this.EGE.setEnabled(false);
        this.EGE.addActionListener(new ActionListener(this){
            final /* synthetic */ mul EGH;
            {
                this.EGH = mul2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mul.f(this.EGH, actionEvent);
            }
        });
        this.EGF.setText("Remove");
        this.EGF.setEnabled(false);
        this.EGF.addActionListener(new ActionListener(this){
            final /* synthetic */ mul EGH;
            {
                this.EGH = mul2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mul.g(this.EGH, actionEvent);
            }
        });
        GroupLayout groupLayout2 = new GroupLayout((Container)this.ac);
        this.ac.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.EGD).addPreferredGap(0).add((Component)this.EGE).addPreferredGap(0).add((Component)this.EGF)).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add(10, 10, 10).add((Component)this.ah, -1, 308, Short.MAX_VALUE))).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.ah, -1, 150, Short.MAX_VALUE).addPreferredGap(0).add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.EGD).add((Component)this.EGE).add((Component)this.EGF))));
        GroupLayout groupLayout3 = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((Component)this.DEt).addPreferredGap(0, 214, Short.MAX_VALUE).add((Component)this.qtg).addContainerGap()).add(2, (Component)this.bN, -1, -1, Short.MAX_VALUE).add((Component)this.ac, -1, -1, Short.MAX_VALUE));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((Component)this.bN, -2, -1, -2).addPreferredGap(0).add((Component)this.ac, -2, -1, -2).addPreferredGap(0, 20, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout3.createParallelGroup(3).add((Component)this.DEt).add((Component)this.qtg)).addContainerGap()));
        GroupLayout groupLayout4 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout4);
        groupLayout4.setHorizontalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        groupLayout4.setVerticalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        this.pack();
    }

    private void cs(ActionEvent actionEvent) {
    }

    private void ct(ActionEvent actionEvent) {
    }

    private void cu(ActionEvent actionEvent) {
    }

    private void cv(ActionEvent actionEvent) {
        this.ePJ();
    }

    private void R(ActionEvent actionEvent) {
        this.ePI();
    }

    private void H(ActionEvent actionEvent) {
        this.eHI();
    }

    private void I(ActionEvent actionEvent) {
        this.eHH();
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new mul((Frame)new JFrame(), true).setVisible(true);
            }
        });
    }

    private void c() {
        this.ePL();
    }

    private void ePI() {
        if (this.EGG != null && this.EGG instanceof cue) {
            mrd mrd2 = new mrd((Frame)this.DEC, true, this);
            mrd2.setLocationRelativeTo(this);
            mrd2.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Choose only implemented for Skill Requirements.");
        }
    }

    private void eHH() {
        String string = this.DJg.getText();
        if (this.EGG instanceof cue) {
            cue cue2 = (cue)this.EGG;
            int n = lea.enZ().getType(string);
            if (n <= 0) {
                JOptionPane.showMessageDialog(this, "Skill '" + string + "' is invalid!", "Error adding Requirement", 0);
                return;
            }
            if (n != cue2.SkillType) {
                cue2.SkillType = n;
            }
            try {
                cue2.SkillLevel = Float.parseFloat(this.DGx.getText());
            }
            catch (NumberFormatException numberFormatException) {
                JOptionPane.showMessageDialog(this, "Must be a valid Float value!", "Error adding Requirement", 0);
                return;
            }
        } else if (this.EGG instanceof cuc) {
            cuc cuc2 = (cuc)this.EGG;
            int n = ep.as((String)string);
            if (n <= 0) {
                JOptionPane.showMessageDialog(this, "Attribute '" + string + "' is invalid!", "Error adding Requirement", 0);
                return;
            }
            if (n != cuc2.bnM) {
                cuc2.bnM = n;
            }
            try {
                cuc2.AttributeValue = Float.parseFloat(this.DGx.getText());
            }
            catch (NumberFormatException numberFormatException) {
                JOptionPane.showMessageDialog(this, "Must be a valid Float value!", "Error adding Requirement", 0);
                return;
            }
        } else if (this.EGG instanceof cub) {
            JOptionPane.showMessageDialog(this, "Composite Requirements not supported!", "Error adding Requirement", 0);
            return;
        }
        this.dispose();
    }

    private void ePJ() {
        String string = (String)this.DJh.getSelectedItem();
        if (string == null) {
            return;
        }
        if (string.equals("Skill") && !(this.EGG instanceof cue)) {
            this.EGG = new cue();
        }
        if (string.equals("Attribute") && !(this.EGG instanceof cuc)) {
            this.EGG = new cuc();
        }
        if (string.equals("Composite") && !(this.EGG instanceof cub)) {
            this.EGG = new cub();
            ((cub)this.EGG).Requirements = new cua[0];
        }
        this.ePL();
    }

    private void eHI() {
        this.EGG = null;
        this.dispose();
    }

    public cua ePK() {
        return this.EGG;
    }

    public void c(cua cua2) {
        this.EGG = cua2;
        this.ePL();
    }

    private void ePL() {
        this.DJh.setModel(new DefaultComboBoxModel<String>(cuo.Types));
        if (this.EGG != null) {
            if (this.EGG instanceof cue) {
                this.DJh.setSelectedItem("Skill");
                this.DJg.setText(((cue)this.EGG).Bu());
                this.DGx.setText(Float.toString(((cue)this.EGG).SkillLevel));
                this.DGx.setEnabled(true);
                this.DFW.setListData(new Object[0]);
            }
            if (this.EGG instanceof cuc) {
                this.DJh.setSelectedItem("Attribute");
                this.DJg.setText(((cuc)this.EGG).getAttributeName());
                this.DGx.setText(Float.toString(((cuc)this.EGG).AttributeValue));
                this.DGx.setEnabled(true);
                this.DFW.setListData(new Object[0]);
            }
            if (this.EGG instanceof cub) {
                cub cub2 = (cub)this.EGG;
                this.DJh.setSelectedItem("Composite");
                this.DJg.setText("Check Composite Details");
                this.DGx.setEnabled(false);
                cua[] cuaArray = cub2.Requirements;
                assert (cuaArray != null);
                this.DFW.setListData(cuaArray);
            }
        } else {
            this.EGG = new cue();
        }
    }

    @Override
    public void CU(String string) {
        if (this.EGG == null) {
            return;
        }
        if (this.EGG instanceof cue) {
            this.DJg.setText(string);
        }
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mul mul2, ActionEvent actionEvent) {
        mul2.I(actionEvent);
    }

    static /* synthetic */ void b(mul mul2, ActionEvent actionEvent) {
        mul2.H(actionEvent);
    }

    static /* synthetic */ void c(mul mul2, ActionEvent actionEvent) {
        mul2.R(actionEvent);
    }

    static /* synthetic */ void d(mul mul2, ActionEvent actionEvent) {
        mul2.cv(actionEvent);
    }

    static /* synthetic */ void e(mul mul2, ActionEvent actionEvent) {
        mul2.ct(actionEvent);
    }

    static /* synthetic */ void f(mul mul2, ActionEvent actionEvent) {
        mul2.cu(actionEvent);
    }

    static /* synthetic */ void g(mul mul2, ActionEvent actionEvent) {
        mul2.cs(actionEvent);
    }
}

