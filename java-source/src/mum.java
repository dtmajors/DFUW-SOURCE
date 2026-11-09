/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
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
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jdesktop.layout.GroupLayout;

public class mum
extends JDialog
implements mrc {
    private JButton qtg;
    private JButton EGI;
    private JTextField EGJ;
    private JButton DEt;
    private JTextField EGK;
    private JLabel I;
    private JLabel P;
    private JPanel aa;
    private String SkillName;
    private float aXV;
    aux DEC;

    public mum(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
    }

    private void b() {
        this.aa = new JPanel();
        this.I = new JLabel();
        this.EGK = new JTextField();
        this.EGI = new JButton();
        this.P = new JLabel();
        this.EGJ = new JTextField();
        this.DEt = new JButton();
        this.qtg = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Training rule Editor");
        this.I.setText("Skill:");
        this.EGK.setToolTipText("If you know the name of the skill, you can write it here, or use the skill schooser instead");
        this.EGI.setText("Choose Skill..");
        this.EGI.addActionListener(new ActionListener(this){
            final /* synthetic */ mum EGL;
            {
                this.EGL = mum2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mum.a(this.EGL, actionEvent);
            }
        });
        this.P.setText("Cost:");
        this.DEt.setText("Ok");
        this.DEt.addActionListener(new ActionListener(this){
            final /* synthetic */ mum EGL;
            {
                this.EGL = mum2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mum.b(this.EGL, actionEvent);
            }
        });
        this.qtg.setText("Cancel");
        this.qtg.addActionListener(new ActionListener(this){
            final /* synthetic */ mum EGL;
            {
                this.EGL = mum2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mum.c(this.EGL, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.I).add((Component)this.P)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(1, false).add((Component)this.EGJ).add((Component)this.EGK, -1, 155, Short.MAX_VALUE)).addPreferredGap(0).add((Component)this.EGI)).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.DEt).addPreferredGap(0, 299, Short.MAX_VALUE).add((Component)this.qtg))).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.I).add((Component)this.EGK, -2, -1, -2).add((Component)this.EGI)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.P).add((Component)this.EGJ, -2, -1, -2)).addPreferredGap(0, 41, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.DEt).add((Component)this.qtg)).addContainerGap()));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        this.pack();
    }

    private void cw(ActionEvent actionEvent) {
        this.ePI();
    }

    private void I(ActionEvent actionEvent) {
        this.eHH();
    }

    private void H(ActionEvent actionEvent) {
        this.eHI();
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new mum((Frame)new JFrame(), true).setVisible(true);
            }
        });
    }

    private void ePI() {
        mrd mrd2 = new mrd((Frame)this.DEC, true, this);
        mrd2.setLocationRelativeTo(this);
        mrd2.setVisible(true);
    }

    public void Ad(String string) {
        if (!lea.enZ().contains(string)) {
            lfn.b(5, this.getClass().getSimpleName(), "setResourceType() : Not a skill!");
            return;
        }
        this.EGK.setText(string);
    }

    private void eHH() {
        this.SkillName = this.EGK.getText();
        int n = lea.enZ().getType(this.SkillName);
        if (n < 0) {
            JOptionPane.showMessageDialog(this, "Skill '" + this.SkillName + "' is invalid!", "Error adding Rule", 0);
            return;
        }
        try {
            this.aXV = Float.parseFloat(this.EGJ.getText());
        }
        catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Cost must be a valid Float value!", "Error adding Rule", 0);
            return;
        }
        this.dispose();
    }

    private void eHI() {
        this.SkillName = null;
        this.dispose();
    }

    public String Bu() {
        return this.SkillName;
    }

    public float Bb() {
        return this.aXV;
    }

    @Override
    public void CU(String string) {
        this.SkillName = string;
        this.EGK.setText(this.SkillName);
        this.repaint();
    }

    public void aa(float f2) {
        this.aXV = f2;
        this.EGJ.setText(Float.toString(this.aXV));
        this.repaint();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mum mum2, ActionEvent actionEvent) {
        mum2.cw(actionEvent);
    }

    static /* synthetic */ void b(mum mum2, ActionEvent actionEvent) {
        mum2.I(actionEvent);
    }

    static /* synthetic */ void c(mum mum2, ActionEvent actionEvent) {
        mum2.H(actionEvent);
    }
}

