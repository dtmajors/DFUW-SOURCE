/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 *  skt.swing.SwingUtil
 *  skt.swing.search.TextComponentFindAction
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import org.jdesktop.layout.GroupLayout;
import skt.swing.SwingUtil;
import skt.swing.search.TextComponentFindAction;

public class mky
extends JDialog {
    private JTextArea DGi;
    private JTextArea DGj;
    private JButton G;
    private JLabel I;
    private JPanel aa;
    private JPanel bN;
    private JPanel ac;
    private JProgressBar DGk;
    private JScrollPane ah;
    private JScrollPane ai;

    public mky(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.c();
        this.DGi.setFont(new Font("Tiresias PCFont Z", 1, 15));
        this.DGj.setFont(new Font("Tiresias PCFont Z", 1, 13));
    }

    private void b() {
        this.aa = new JPanel();
        this.ah = new JScrollPane();
        this.DGi = new JTextArea();
        this.bN = new JPanel();
        this.G = new JButton();
        this.I = new JLabel();
        this.ai = new JScrollPane();
        this.DGj = new JTextArea();
        this.ac = new JPanel();
        this.DGk = new JProgressBar();
        this.setDefaultCloseOperation(2);
        this.setTitle("Results");
        this.aa.setBorder(BorderFactory.createTitledBorder("Result Info"));
        this.DGi.setColumns(20);
        this.DGi.setRows(5);
        this.ah.setViewportView(this.DGi);
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.ah, -1, 729, Short.MAX_VALUE).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.ah, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        this.bN.setBorder(BorderFactory.createTitledBorder("Result Log"));
        this.G.setText("Close");
        this.G.addActionListener(new ActionListener(this){
            final /* synthetic */ mky DGl;
            {
                this.DGl = mky2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mky.a(this.DGl, actionEvent);
            }
        });
        this.I.setText("CTRL-I to search Result-text. CTRL-SHIFT-I for case insensitive search of Result text.");
        this.DGj.setColumns(20);
        this.DGj.setRows(5);
        this.ai.setViewportView(this.DGj);
        GroupLayout groupLayout2 = new GroupLayout((Container)this.bN);
        this.bN.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.ai, -1, 729, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.G).addPreferredGap(0).add((Component)this.I, -2, 521, -2))).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.ai, -1, 308, Short.MAX_VALUE).addPreferredGap(1).add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.G).add((Component)this.I)).addContainerGap()));
        this.ac.setBorder(BorderFactory.createTitledBorder("Progress"));
        GroupLayout groupLayout3 = new GroupLayout((Container)this.ac);
        this.ac.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((Component)this.DGk, -1, 729, Short.MAX_VALUE).addContainerGap()));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((Component)this.DGk, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        GroupLayout groupLayout4 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout4);
        groupLayout4.setHorizontalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout4.createParallelGroup(2).add((Component)this.aa, -1, -1, Short.MAX_VALUE).add((Component)this.bN, -1, -1, Short.MAX_VALUE).add(1, (Component)this.ac, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        groupLayout4.setVerticalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().add((Component)this.aa, -2, -1, -2).addPreferredGap(0).add((Component)this.ac, -2, -1, -2).addPreferredGap(0).add((Component)this.bN, -1, -1, Short.MAX_VALUE).addContainerGap()));
        this.pack();
    }

    private void x(ActionEvent actionEvent) {
        this.dispose();
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new mky((Frame)new JFrame(), false);
            }
        });
    }

    public void Cn(String string) {
        this.DGj.setText(string);
    }

    public void Co(String string) {
        this.DGi.setText(string);
    }

    private void c() {
        SwingUtil.installActions((JComponent)this.DGj, (Action[])new Action[]{new TextComponentFindAction(false), new TextComponentFindAction(true)});
        this.DGj.requestFocus();
        this.v("working..", 0, 0);
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
            final /* synthetic */ mky DGl;
            {
                this.DGl = mky2;
                this.DGm = n;
                this.DGn = n2;
                this.DGo = string;
            }

            public void run() {
                mky.a(this.DGl).setString("" + this.DGm + "/" + this.DGn);
                if (mky.a(this.DGl).isIndeterminate() && this.DGn != 0) {
                    mky.a(this.DGl).setIndeterminate(false);
                    mky.a(this.DGl).setString(null);
                }
                mky.a(this.DGl).setMaximum(this.DGn);
                mky.a(this.DGl).setValue(this.DGm);
                mky.b(this.DGl).append(this.DGo + "\n");
            }
        };
        SwingUtilities.invokeLater(runnable);
    }

    static /* synthetic */ void a(mky mky2, ActionEvent actionEvent) {
        mky2.x(actionEvent);
    }

    static /* synthetic */ JProgressBar a(mky mky2) {
        return mky2.DGk;
    }

    static /* synthetic */ JTextArea b(mky mky2) {
        return mky2.DGj;
    }
}

