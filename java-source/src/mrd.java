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
import java.awt.event.MouseListener;
import java.util.Collections;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import org.jdesktop.layout.GroupLayout;

public class mrd
extends JDialog {
    private JPanel aa;
    private JScrollPane ah;
    private mrc EhS;
    private Vector EhT = new Vector();
    private JTree EhU;
    private DefaultMutableTreeNode EhV;
    private les EhW = lea.enZ();
    private ler EhX = this.EhW.eqq();
    private boolean EgX = false;

    public mrd(Frame frame, boolean bl, mrc mrc2) {
        this(frame, bl);
        this.EhS = mrc2;
    }

    public mrd(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.ah = new JScrollPane();
        this.setDefaultCloseOperation(2);
        this.aa.setBorder(BorderFactory.createTitledBorder("Skills"));
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.ah, -1, 334, Short.MAX_VALUE));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.ah, -1, 540, Short.MAX_VALUE));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        this.pack();
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new mrd((Frame)new JFrame(), true).setVisible(true);
            }
        });
    }

    private void c() {
        this.eKg();
        this.ah.getViewport().add(this.EhU);
    }

    private void eKg() {
        this.EhV = new DefaultMutableTreeNode(this.EhX.getName());
        this.a(this.EhV, this.EhX, this.EhW);
        Collections.sort(this.EhT);
    }

    private void a(DefaultMutableTreeNode defaultMutableTreeNode, ler ler2, les les2) {
        Object object = les2.g(ler2);
        while (object != null) {
            DefaultMutableTreeNode defaultMutableTreeNode2;
            if (les2.g((ler)object) == null) {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(((ler)object).getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
                this.EhT.add(((ler)object).getName());
            } else {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(((ler)object).getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
                this.a(defaultMutableTreeNode2, (ler)object, les2);
            }
            object = les2.h((ler)object);
        }
        this.EhU = new JTree(defaultMutableTreeNode);
        this.EhU.getSelectionModel().setSelectionMode(1);
        object = new a(this);
        this.EhU.addMouseListener((MouseListener)object);
    }

    public boolean eJQ() {
        return this.EgX;
    }

    public void zO(boolean bl) {
        this.EgX = bl;
    }

    static /* synthetic */ JTree a(mrd mrd2) {
        return mrd2.EhU;
    }

    static /* synthetic */ boolean b(mrd mrd2) {
        return mrd2.EgX;
    }

    static /* synthetic */ mrc c(mrd mrd2) {
        return mrd2.EhS;
    }
}

