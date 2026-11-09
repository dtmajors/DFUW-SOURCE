/*
 * Decompiled with CFR.
 */
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.GroupLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;

public class mvj
extends JDialog {
    private JTextArea EKT;
    private JLabel I;
    private JLabel P;
    private JPanel aa;
    private JProgressBar DGk;
    private JScrollPane ah;

    public mvj(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.I = new JLabel();
        this.DGk = new JProgressBar();
        this.P = new JLabel();
        this.ah = new JScrollPane();
        this.EKT = new JTextArea();
        this.setDefaultCloseOperation(2);
        this.setTitle("Preprocessing objects");
        this.I.setText("Progress:");
        this.P.setText("Objects Processed");
        this.EKT.setColumns(20);
        this.EKT.setEditable(false);
        this.EKT.setRows(5);
        this.ah.setViewportView(this.EKT);
        GroupLayout groupLayout = new GroupLayout(this.aa);
        this.aa.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.DGk, -1, 800, Short.MAX_VALUE).addComponent(this.I).addComponent(this.P).addComponent(this.ah, -1, 800, Short.MAX_VALUE)).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.I).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DGk, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.P).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ah, -1, 361, Short.MAX_VALUE).addContainerGap()));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.aa, -1, -1, Short.MAX_VALUE).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.aa, -1, -1, Short.MAX_VALUE).addContainerGap()));
        this.pack();
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                mvj mvj2 = new mvj((Frame)new JFrame(), true);
                mvj2.addWindowListener(new WindowAdapter(this){
                    final /* synthetic */ 1 EKU;
                    {
                        this.EKU = var1_1;
                    }

                    public void windowClosing(WindowEvent windowEvent) {
                        System.exit(0);
                    }
                });
                mvj2.setVisible(true);
            }
        });
    }

    private void c() {
        this.v("preprocessing..", 0, 0);
    }

    private void v(String string, int n, int n2) {
        this.DGk.setString("");
        this.DGk.setStringPainted(true);
        this.DGk.setMinimum(0);
        this.DGk.setMaximum(n);
        if (n == 0) {
            this.DGk.setIndeterminate(true);
        }
    }

    public void C(int n, int n2, String string) {
        Runnable runnable = new Runnable(this, n, n2, string){
            final /* synthetic */ int DGm;
            final /* synthetic */ int DGn;
            final /* synthetic */ String DGo;
            final /* synthetic */ mvj EKV;
            {
                this.EKV = mvj2;
                this.DGm = n;
                this.DGn = n2;
                this.DGo = string;
            }

            public void run() {
                mvj.a(this.EKV).setString("" + this.DGm + "/" + this.DGn);
                if (mvj.a(this.EKV).isIndeterminate() && this.DGn != 0) {
                    mvj.a(this.EKV).setIndeterminate(false);
                    mvj.a(this.EKV).setString(null);
                }
                mvj.a(this.EKV).setMaximum(this.DGn);
                mvj.a(this.EKV).setValue(this.DGm);
                mvj.b(this.EKV).append(this.DGo + "\n");
            }
        };
        SwingUtilities.invokeLater(runnable);
    }

    static /* synthetic */ JProgressBar a(mvj mvj2) {
        return mvj2.DGk;
    }

    static /* synthetic */ JTextArea b(mvj mvj2) {
        return mvj2.EKT;
    }
}

