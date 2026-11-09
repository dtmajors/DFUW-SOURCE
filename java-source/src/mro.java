/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcw
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jdesktop.layout.GroupLayout;

public class mro
extends JDialog {
    private JTextField DVA;
    private JTextField Elv;
    private JButton DVB;
    private JButton Elw;
    private JPanel bF;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private JPanel aa;
    private JPanel ac;
    private JComboBox Elx;
    private mrq bQ;
    private aux DEC;
    private ljq Ely;
    private String Elz;

    public mro(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.bF = new JPanel();
        this.ac = new JPanel();
        this.Elw = new JButton();
        this.DVB = new JButton();
        this.P = new JLabel();
        this.Elx = new JComboBox();
        this.Q = new JLabel();
        this.Elv = new JTextField();
        this.DVA = new JTextField();
        this.I = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Set Quest Marker");
        this.addWindowListener(new WindowAdapter(this){
            final /* synthetic */ mro ElA;
            {
                this.ElA = mro2;
            }

            public void windowClosing(WindowEvent windowEvent) {
                mro.a(this.ElA, windowEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.bF);
        this.bF.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(0, 513, Short.MAX_VALUE));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(0, 519, Short.MAX_VALUE));
        this.Elw.setText("Close & Set Marker");
        this.Elw.addActionListener(new ActionListener(this){
            final /* synthetic */ mro ElA;
            {
                this.ElA = mro2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mro.a(this.ElA, actionEvent);
            }
        });
        this.DVB.setText("Clear Marker");
        this.DVB.addActionListener(new ActionListener(this){
            final /* synthetic */ mro ElA;
            {
                this.ElA = mro2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mro.b(this.ElA, actionEvent);
            }
        });
        this.P.setText("Marker Type:");
        this.Elx.setModel(new DefaultComboBoxModel<String>(new String[]{"None", "Target Reward Vendor", "Target Talk", "Target Delivery", "Target Kill", "Target Use Skill", "Target Gather"}));
        this.Q.setText("Marker Caption:");
        GroupLayout groupLayout2 = new GroupLayout((Container)this.ac);
        this.ac.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.Elw).addPreferredGap(0).add((Component)this.DVB)).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.P).addPreferredGap(0).add((Component)this.Elx, -2, 159, -2).add(4, 4, 4).add((Component)this.Q).addPreferredGap(0).add((Component)this.Elv, -2, 191, -2))).addContainerGap(-1, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.P).add((Component)this.Elx, -2, -1, -2).add((Component)this.Q).add((Component)this.Elv, -2, -1, -2)).addPreferredGap(0, 15, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.Elw).add((Component)this.DVB))));
        this.DVA.setEditable(false);
        this.I.setText("Selected Tile:");
        GroupLayout groupLayout3 = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().add((GroupLayout.Group)groupLayout3.createParallelGroup(2).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((Component)this.bF, -1, -1, Short.MAX_VALUE)).add(1, (GroupLayout.Group)groupLayout3.createParallelGroup(1, false).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((Component)this.I).addPreferredGap(0).add((Component)this.DVA, -2, 90, -2)).add((Component)this.ac, -1, -1, Short.MAX_VALUE))).addContainerGap()));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout3.createSequentialGroup().add((GroupLayout.Group)groupLayout3.createParallelGroup(3).add((Component)this.I).add((Component)this.DVA, -2, -1, -2)).addPreferredGap(0).add((Component)this.bF, -1, -1, Short.MAX_VALUE).addPreferredGap(0).add((Component)this.ac, -2, -1, -2)));
        GroupLayout groupLayout4 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout4);
        groupLayout4.setHorizontalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().add((Component)this.aa, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        groupLayout4.setVerticalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((Component)this.aa, -2, -1, -2).addContainerGap(21, Short.MAX_VALUE)));
        this.pack();
    }

    private void b(WindowEvent windowEvent) {
        this.Ely = null;
    }

    private void bh(ActionEvent actionEvent) {
        this.bQ.eLx();
    }

    private void bB(ActionEvent actionEvent) {
        this.eLn();
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new mro((Frame)new JFrame(), true).setVisible(true);
            }
        });
    }

    private void c() {
        this.bQ = new mrq();
        this.bQ.zS(false);
        this.bQ.zU(true);
        this.bF.add((Component)this.bQ, "Center");
        this.bF.repaint();
        String[] stringArray = new String[bpk.values().length];
        for (int i = 0; i < bpk.values().length; ++i) {
            stringArray[i] = bpk.values()[i].getName();
        }
        this.Elx.setModel(new DefaultComboBoxModel<String>(stringArray));
        new Thread(new a(this, null)).start();
    }

    private void eLn() {
        if (this.Elx.getSelectedIndex() == -1 || this.Elx.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "No Type chosen!", "Marker not valid!", 0);
            return;
        }
        if (this.Elv.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "No Marker Caption set!", "Marker not valid!", 0);
            return;
        }
        if (this.Ely == null) {
            JOptionPane.showMessageDialog(this, "No Location chosen!", "Marker not valid!", 0);
            return;
        }
        this.dispose();
    }

    private synchronized void eIB() {
        Point point = this.bQ.eLz();
        if (point == null) {
            this.Ely = null;
            return;
        }
        if (!this.bQ.eLC()) {
            this.Ely = null;
            return;
        }
        List<mqm> list = this.bQ.eLA();
        mqm mqm2 = new mqm();
        mqm2.getDefaultSize().height = 10;
        mqm2.getDefaultSize().width = 10;
        mqm2.j(Color.cyan);
        mqm2.h(Color.cyan);
        mqm2.a(mqm.a.Eee);
        mqm2.h(point);
        list.clear();
        list.add(mqm2);
        int n = 512;
        int n2 = 512;
        ljq ljq2 = lcw.zh((String)this.DVA.getText());
        ljq ljq3 = new ljq(point.x, 0.0f, point.y);
        int n3 = (int)(ljq3.getX() * (lcw.qGD.getX() / (float)n));
        int n4 = (int)(lcw.qGD.bdV() - ljq3.bdV() * (lcw.qGD.bdV() / (float)n2));
        ljq3.x = n3;
        ljq3.rlV = n4;
        ljq3.es(ljq2);
        if (n3 < 0 || n3 > n || n4 < 0 || n4 > n2) {
            // empty if block
        }
        this.Ely = ljq3;
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    public String eLo() {
        return this.Elv.getText();
    }

    public String eLp() {
        return String.valueOf(this.Elx.getSelectedItem());
    }

    public ljq eLq() {
        return this.Ely;
    }

    public void fa(ljq ljq2) {
        this.Ely = ljq2;
    }

    public void eLr() {
        this.Elx.setVisible(false);
        this.P.setVisible(false);
        this.Elv.setVisible(false);
        this.Q.setVisible(false);
        this.Elw.setVisible(false);
        this.DVB.setVisible(false);
    }

    private void eLs() {
        this.dispose();
    }

    public void eLt() {
        this.setTitle("Right Click To Select A Tile");
    }

    public void eLu() {
        this.bQ.eLF();
        this.bQ.eLE();
        this.bQ.eLG();
    }

    public String eLv() {
        return this.bQ.eLv();
    }

    static /* synthetic */ void a(mro mro2, WindowEvent windowEvent) {
        mro2.b(windowEvent);
    }

    static /* synthetic */ void a(mro mro2, ActionEvent actionEvent) {
        mro2.bB(actionEvent);
    }

    static /* synthetic */ void b(mro mro2, ActionEvent actionEvent) {
        mro2.bh(actionEvent);
    }

    static /* synthetic */ mrq a(mro mro2) {
        return mro2.bQ;
    }

    static /* synthetic */ JTextField b(mro mro2) {
        return mro2.DVA;
    }

    static /* synthetic */ void c(mro mro2) {
        mro2.eIB();
    }
}

