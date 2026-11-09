/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class mlo
extends JDialog {
    private JButton qtg;
    private JButton DJd;
    private JCheckBox DJe;
    private JCheckBox DJf;
    private JTextField DJg;
    private JButton DEt;
    private JComboBox DJh;
    private JCheckBox DFu;
    private JLabel I;
    private JLabel Q;
    private JPanel aa;
    private mla DJi;
    private JTextField DJj;
    private JLabel DJk;

    public mlo(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.Q = new JLabel();
        this.I = new JLabel();
        this.DJe = new JCheckBox();
        this.DJf = new JCheckBox();
        this.DJf.setSelected(true);
        this.DJg = new JTextField();
        this.DJh = new JComboBox();
        this.DEt = new JButton();
        this.qtg = new JButton();
        this.DFu = new JCheckBox();
        this.DJd = new JButton();
        this.DJi = new mla();
        this.setDefaultCloseOperation(2);
        this.setTitle("Add Audio Effect");
        this.Q.setText("Effect type:");
        this.I.setText("Effect Name:");
        this.DJf.setText("Relation");
        this.DJf.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.DJf.setMargin(new Insets(0, 0, 0, 0));
        this.DJe.setText("Loop");
        this.DJe.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.DJe.setMargin(new Insets(0, 0, 0, 0));
        this.DJg.setEditable(false);
        this.DJh.setModel(new DefaultComboBoxModel<String>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        this.DEt.setText("Ok");
        this.DEt.addActionListener(new ActionListener(this){
            final /* synthetic */ mlo DJl;
            {
                this.DJl = mlo2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlo.a(this.DJl, actionEvent);
            }
        });
        this.qtg.setText("Cancel");
        this.qtg.addActionListener(new ActionListener(this){
            final /* synthetic */ mlo DJl;
            {
                this.DJl = mlo2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlo.b(this.DJl, actionEvent);
            }
        });
        this.DFu.setText("New");
        this.DFu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.DFu.setMargin(new Insets(0, 0, 0, 0));
        this.DFu.addActionListener(new ActionListener(this){
            final /* synthetic */ mlo DJl;
            {
                this.DJl = mlo2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlo.c(this.DJl, actionEvent);
            }
        });
        this.DJd.setText("Choose existing..");
        this.DJd.addActionListener(new ActionListener(this){
            final /* synthetic */ mlo DJl;
            {
                this.DJl = mlo2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlo.d(this.DJl, actionEvent);
            }
        });
        this.DJi.eDs();
        this.DJi.ah(10.0f);
        this.DJi.Cp("Delay");
        this.DJi.or(0.0f);
        this.DJj = new JTextField();
        this.DJj.setColumns(10);
        this.DJk = new JLabel("Effect Delay:");
        this.DJk.setHorizontalAlignment(0);
        GroupLayout groupLayout = new GroupLayout(this.aa);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(this.DEt).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.qtg).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE).addComponent(this.DJd)).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.I).addComponent(this.Q).addComponent(this.DJk)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.DJg, GroupLayout.Alignment.TRAILING, -1, 342, Short.MAX_VALUE).addComponent(this.DJh, GroupLayout.Alignment.TRAILING, 0, 342, Short.MAX_VALUE).addComponent(this.DJi, -2, 308, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.DJe).addComponent(this.DFu).addComponent(this.DJf)).addGap(8))).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Q).addComponent(this.DJe).addComponent(this.DJh, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.DJg, -2, -1, -2).addComponent(this.DFu)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.DJk).addComponent(this.DJi, -2, -1, -2).addComponent(this.DJf)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.DEt).addComponent(this.qtg).addComponent(this.DJd))));
        this.aa.setLayout(groupLayout);
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.aa, -2, 484, -2).addContainerGap(-1, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.aa, -2, 155, -2).addContainerGap(-1, Short.MAX_VALUE)));
        this.getContentPane().setLayout(groupLayout2);
        this.pack();
    }

    private void R(ActionEvent actionEvent) {
        this.eEi();
    }

    private void S(ActionEvent actionEvent) {
        this.DJg.setEditable(this.DFu.isSelected());
        this.DJd.setEnabled(!this.DFu.isSelected());
    }

    private void H(ActionEvent actionEvent) {
        this.DJg.setText("");
        this.dispose();
    }

    private void I(ActionEvent actionEvent) {
        this.p();
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new mlo((Frame)new JFrame(), true).setVisible(true);
            }
        });
    }

    private void c() {
        this.DJh.setModel(new DefaultComboBoxModel<del.a>(del.a.values()));
        this.DJh.setSelectedIndex(0);
    }

    private void p() {
        File file;
        if (!this.DFu.isSelected() && !(file = new File(this.DJg.getText())).exists()) {
            JOptionPane.showMessageDialog(this, "New Effect not selected, but file [" + this.DJg.getText() + "] does not exist!", "Error", 0);
            return;
        }
        this.dispose();
    }

    public void Ct(String string) {
        this.DJg.setText(string);
    }

    public String CE() {
        return this.DJg.getText();
    }

    public float getDelayTime() {
        return this.DJi.getValue();
    }

    public boolean isLooping() {
        return this.DJe.isSelected();
    }

    public boolean isRelationEffect() {
        return this.DJf.isSelected();
    }

    public boolean isNew() {
        return this.DFu.isSelected();
    }

    private void eEi() {
        String string = lcw.qLb + "xml/" + "audio/";
        mkb mkb2 = new mkb(string);
        mkb2.setDragEnabled(false);
        mkb2.setFileSelectionMode(2);
        int n = mkb2.showDialog(this, "Choose Audio XML");
        if (n != 0) {
            return;
        }
        jrw jrw2 = mkb2.eDc();
        if (!jrw2.isFile()) {
            return;
        }
        this.DJg.setText(jrw2.getAbsolutePath());
    }

    public del.a eEj() {
        return (del.a)((Object)this.DJh.getSelectedItem());
    }

    static /* synthetic */ void a(mlo mlo2, ActionEvent actionEvent) {
        mlo2.I(actionEvent);
    }

    static /* synthetic */ void b(mlo mlo2, ActionEvent actionEvent) {
        mlo2.H(actionEvent);
    }

    static /* synthetic */ void c(mlo mlo2, ActionEvent actionEvent) {
        mlo2.S(actionEvent);
    }

    static /* synthetic */ void d(mlo mlo2, ActionEvent actionEvent) {
        mlo2.R(actionEvent);
    }
}

