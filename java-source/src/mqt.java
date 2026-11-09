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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jdesktop.layout.GroupLayout;

public class mqt
extends JInternalFrame {
    private JTextField EgC;
    private JButton EgD;
    private JTextField EgE;
    private JComboBox u;
    private JTextField EgF;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private JPanel aa;
    private lgq RC = new lgq();

    public mqt() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.I = new JLabel();
        this.P = new JLabel();
        this.Q = new JLabel();
        this.EgE = new JTextField();
        this.EgC = new JTextField();
        this.EgF = new JTextField();
        this.EgD = new JButton();
        this.u = new JComboBox();
        this.setClosable(true);
        this.setTitle("Random Name Generator");
        this.I.setText("Male firstname:");
        this.P.setText("Female firstname:");
        this.Q.setText("Sirname:");
        this.EgD.setText("Generate name");
        this.EgD.addActionListener(new ActionListener(this){
            final /* synthetic */ mqt EgG;
            {
                this.EgG = mqt2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqt.a(this.EgG, actionEvent);
            }
        });
        this.u.setModel(new DefaultComboBoxModel<String>(new String[]{"Select race.."}));
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (Component)this.I).add(2, (Component)this.P).add(2, (Component)this.Q)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.EgE, -1, 223, Short.MAX_VALUE).add((Component)this.EgC, -1, 223, Short.MAX_VALUE).add((Component)this.EgF, -1, 223, Short.MAX_VALUE))).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.EgD).addPreferredGap(0).add((Component)this.u, 0, 210, Short.MAX_VALUE))).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.I).add((Component)this.EgE, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.P).add((Component)this.EgC, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.Q).add((Component)this.EgF, -2, -1, -2)).addPreferredGap(0, -1, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.EgD).add((Component)this.u, -2, -1, -2)).addContainerGap()));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.aa, -1, -1, Short.MAX_VALUE).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.aa, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        this.pack();
    }

    private void bt(ActionEvent actionEvent) {
        if (this.u.getSelectedIndex() < 1) {
            return;
        }
        String string = this.RC.aC((String)this.u.getSelectedItem(), "Female");
        String string2 = this.RC.aC((String)this.u.getSelectedItem(), "Male");
        String string3 = this.RC.aC((String)this.u.getSelectedItem(), "Surname");
        this.EgC.setText(string);
        this.EgE.setText(string2);
        this.EgF.setText(string3);
    }

    private void c() {
        String[] stringArray = new String[]{"Choose race..", "Human", "Dwarf", "Mirdain", "Alfar", "Ork", "Mahirim"};
        this.u.setModel(new DefaultComboBoxModel<String>(stringArray));
    }

    static /* synthetic */ void a(mqt mqt2, ActionEvent actionEvent) {
        mqt2.bt(actionEvent);
    }
}

