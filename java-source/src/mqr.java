/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jdesktop.layout.GroupLayout;

public class mqr
extends JDialog {
    private JButton qtg;
    private JCheckBox Egp;
    private JButton DEt;
    private JCheckBox Egq;
    private JCheckBox Egr;
    private JCheckBox Egs;
    private JComboBox DGq;
    private JLabel I;
    private JLabel P;
    private JPanel aa;
    private JTextField Egt;
    private boolean Egu = false;

    public mqr(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.I = new JLabel();
        this.DGq = new JComboBox();
        this.Egs = new JCheckBox();
        this.DEt = new JButton();
        this.qtg = new JButton();
        this.P = new JLabel();
        this.Egt = new JTextField();
        this.Egp = new JCheckBox();
        this.Egq = new JCheckBox();
        this.Egr = new JCheckBox();
        this.setDefaultCloseOperation(2);
        this.setTitle("Preprocessing Options");
        this.setModal(true);
        this.setResizable(false);
        this.I.setText("Choose Object Type:");
        this.DGq.setModel(new DefaultComboBoxModel<String>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        this.DGq.addActionListener(new ActionListener(this){
            final /* synthetic */ mqr Egv;
            {
                this.Egv = mqr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqr.a(this.Egv, actionEvent);
            }
        });
        this.Egs.setSelected(true);
        this.Egs.setText("Use old file location if found.");
        this.Egs.setToolTipText("If selected, will look for existing file and modify this. If not found, new file will be generated from template. Default is selected.");
        this.Egs.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.DEt.setText("Ok");
        this.DEt.addActionListener(new ActionListener(this){
            final /* synthetic */ mqr Egv;
            {
                this.Egv = mqr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqr.b(this.Egv, actionEvent);
            }
        });
        this.qtg.setText("Cancel");
        this.qtg.addActionListener(new ActionListener(this){
            final /* synthetic */ mqr Egv;
            {
                this.Egv = mqr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqr.c(this.Egv, actionEvent);
            }
        });
        this.P.setText("Scale:");
        this.Egt.setText("1.0");
        this.Egp.setSelected(true);
        this.Egp.setText("Copy processed files to dump area");
        this.Egp.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        this.Egq.setText("Reset to default collision schemes");
        this.Egq.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        this.Egr.setText("Remove old files from dump area");
        this.Egr.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        this.Egr.addActionListener(new ActionListener(this){
            final /* synthetic */ mqr Egv;
            {
                this.Egv = mqr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqr.d(this.Egv, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (Component)this.I).add(2, (Component)this.P)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(1, false).add((Component)this.Egt).add((Component)this.DGq, -2, 223, -2).add((Component)this.Egs).add((Component)this.Egp).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.Egq).addContainerGap()).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.Egr).addContainerGap()))).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.DEt).addPreferredGap(0, 229, Short.MAX_VALUE).add((Component)this.qtg)))));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.I).add((Component)this.DGq, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.P).add((Component)this.Egt, -2, -1, -2)).addPreferredGap(1).add((Component)this.Egs).addPreferredGap(0).add((Component)this.Egp).addPreferredGap(0).add((Component)this.Egr).addPreferredGap(0).add((Component)this.Egq).addPreferredGap(0, 59, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.qtg).add((Component)this.DEt)).addContainerGap()));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.aa, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.aa, -1, -1, Short.MAX_VALUE)));
        this.pack();
    }

    private void F(ActionEvent actionEvent) {
    }

    private void I(ActionEvent actionEvent) {
        this.Egu = true;
        this.dispose();
    }

    private void H(ActionEvent actionEvent) {
        this.dispose();
    }

    private void bp(ActionEvent actionEvent) {
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new mqr((Frame)new JFrame(), true).setVisible(true);
            }
        });
    }

    private void c() {
        this.DGq.setModel(new DefaultComboBoxModel<mjd>(mje.DBN));
        this.DGq.setSelectedIndex(0);
    }

    public int eJD() {
        return this.DGq.getSelectedIndex();
    }

    public boolean eJE() {
        return this.Egs.isSelected();
    }

    public boolean eJF() {
        return this.Egp.isSelected();
    }

    public boolean eJG() {
        return this.Egq.isSelected();
    }

    public boolean eJH() {
        return this.Egr.isSelected();
    }

    public boolean eJI() {
        return this.Egu;
    }

    public float getScale() {
        float f = 1.0f;
        try {
            f = Float.parseFloat(this.Egt.getText());
        }
        catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }
        return f;
    }

    static /* synthetic */ void a(mqr mqr2, ActionEvent actionEvent) {
        mqr2.F(actionEvent);
    }

    static /* synthetic */ void b(mqr mqr2, ActionEvent actionEvent) {
        mqr2.I(actionEvent);
    }

    static /* synthetic */ void c(mqr mqr2, ActionEvent actionEvent) {
        mqr2.H(actionEvent);
    }

    static /* synthetic */ void d(mqr mqr2, ActionEvent actionEvent) {
        mqr2.bp(actionEvent);
    }
}

