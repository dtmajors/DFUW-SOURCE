/*
 * Decompiled with CFR.
 */
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class mqf
extends JDialog {
    private JTextField DYK;
    private JTextField DDZ;
    private JButton G;
    private JLabel I;
    private JLabel P;

    public mqf(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
    }

    private void b() {
        this.I = new JLabel();
        this.P = new JLabel();
        this.DYK = new JTextField();
        this.DDZ = new JTextField();
        this.G = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Convert  Long or GUID");
        this.I.setText("Insert long or GUID:");
        this.P.setText("Result:");
        this.DDZ.setEditable(false);
        this.G.setText("Convert");
        this.G.addActionListener(new ActionListener(this){
            final /* synthetic */ mqf DYL;
            {
                this.DYL = mqf2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqf.a(this.DYL, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.P).addComponent(this.I)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.DDZ, -1, 278, Short.MAX_VALUE).addComponent(this.DYK, -1, 278, Short.MAX_VALUE))).addComponent(this.G, GroupLayout.Alignment.TRAILING)).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.DYK, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.P).addComponent(this.DDZ, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addComponent(this.G).addContainerGap()));
        this.pack();
    }

    private void x(ActionEvent actionEvent) {
        this.eJa();
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                mqf mqf2 = new mqf((Frame)new JFrame(), true);
                mqf2.addWindowListener(new WindowAdapter(this){
                    final /* synthetic */ 2 DYM;
                    {
                        this.DYM = var1_1;
                    }

                    public void windowClosing(WindowEvent windowEvent) {
                        System.exit(0);
                    }
                });
                mqf2.setVisible(true);
            }
        });
    }

    private void eJa() {
        this.DDZ.setText("invalid");
        String string = this.DYK.getText();
        if (string == null || string.isEmpty()) {
            return;
        }
        try {
            long l = Long.parseLong(string);
            ldv ldv2 = new ldv(l);
            this.DDZ.setText("GUID = " + ldv2.toString());
            return;
        }
        catch (NumberFormatException numberFormatException) {
            ldv ldv3 = ldv.zq(string);
            if (ldv3 == null) {
                return;
            }
            this.DDZ.setText("Long = " + ldv3.eny());
            return;
        }
    }

    private void CN(String string) {
    }

    static /* synthetic */ void a(mqf mqf2, ActionEvent actionEvent) {
        mqf2.x(actionEvent);
    }
}

