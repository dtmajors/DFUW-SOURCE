/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import org.jdesktop.layout.GroupLayout;

public class mqv
extends JDialog {
    private JButton EgQ;
    private JTextField EgR;
    private JTextField EgS;
    private JTextField DJg;
    private JPanel EgT;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private JPanel bN;
    private les ResourceTree = lea.enW();
    private JTree ca = null;
    private a EgU = null;
    lgx EgV;
    private boolean EgW = true;
    private boolean EgX = false;
    private String EgY = "Resource";
    private boolean EgZ = true;

    public mqv(Frame frame, boolean bl, lgx lgx2) {
        this(frame, bl);
        this.EgV = lgx2;
    }

    public mqv(Frame frame, boolean bl, String string, lgx lgx2) {
        super(frame, bl);
        this.EgV = lgx2;
        this.EgY = string;
        this.b();
        this.c();
    }

    public mqv(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.c();
    }

    private void b() {
        this.EgT = new JPanel();
        this.bN = new JPanel();
        this.I = new JLabel();
        this.Q = new JLabel();
        this.DJg = new JTextField();
        this.EgR = new JTextField();
        this.P = new JLabel();
        this.EgS = new JTextField();
        this.EgQ = new JButton();
        this.setDefaultCloseOperation(2);
        this.EgT.setBorder(BorderFactory.createTitledBorder("Resources"));
        this.EgT.setLayout(new BorderLayout());
        this.bN.setBorder(BorderFactory.createTitledBorder("Resource information"));
        this.I.setText("Name:");
        this.Q.setText("Has file:");
        this.P.setText("Mesh file:");
        GroupLayout groupLayout = new GroupLayout((Container)this.bN);
        this.bN.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.I).add((Component)this.Q).add((Component)this.P)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.DJg, -1, 290, Short.MAX_VALUE).add((Component)this.EgR, -1, 290, Short.MAX_VALUE).add((Component)this.EgS, -1, 290, Short.MAX_VALUE)).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.I).add((Component)this.DJg, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.EgR, -2, -1, -2).add((Component)this.Q)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.P).add((Component)this.EgS, -2, -1, -2)).addContainerGap(13, Short.MAX_VALUE)));
        this.EgQ.setText("Add");
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.EgT, -1, 372, Short.MAX_VALUE).add((Component)this.bN, -1, -1, Short.MAX_VALUE).add(2, (Component)this.EgQ)).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.EgT, -2, 536, -2).addPreferredGap(0).add((Component)this.EgQ).addPreferredGap(0, 8, Short.MAX_VALUE).add((Component)this.bN, -2, -1, -2).addContainerGap()));
        this.pack();
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new mqv((Frame)new JFrame(), true).setVisible(true);
            }
        });
    }

    private void c() {
        this.ca = new JTree(this.t());
        this.ca.setCellRenderer(new b(this));
        this.ca.getSelectionModel().setSelectionMode(1);
        this.ca.putClientProperty("JTree.lineStyle", "Angled");
        this.EgU = new a(this, this.ca, this);
        this.ca.addMouseListener(this.EgU);
        JScrollPane jScrollPane = new JScrollPane(this.ca);
        this.EgT.add(jScrollPane);
        if (this.EgY != null && (this.EgY.contains("Items") || this.EgY.contains("Resource"))) {
            this.EgQ.setVisible(true);
            this.EgQ.addActionListener(new ActionListener(this){
                final /* synthetic */ mqv Eha;
                {
                    this.Eha = mqv2;
                }

                public void actionPerformed(ActionEvent actionEvent) {
                    lae lae2;
                    TreePath treePath = mqv.a(this.Eha).getSelectionPath();
                    if (treePath != null && (lae2 = (lae)treePath.getLastPathComponent()) != null) {
                        lgw lgw2 = (lgw)lae2.dHM();
                        if (lgw2 == null) {
                            return;
                        }
                        if (mqv.b(this.Eha) || lae2.isLeaf()) {
                            lfn.b(0, this.getClass().getSimpleName(), "mouseClicked() : Adding ResourceType = " + lgw2.getType());
                            String string = lgw2.getName();
                            this.Eha.EgV.Ad(string);
                            if (mqv.c(this.Eha)) {
                                if (mqv.d(this.Eha)) {
                                    JOptionPane.showMessageDialog(this.Eha, "ResourceType Selected: " + string);
                                }
                                this.Eha.dispose();
                            }
                            lfn.b(0, this.getClass().getName(), "mouseClicked() : Value is: " + lgw2.getDescription());
                        }
                    }
                }
            });
        } else {
            this.EgQ.setVisible(false);
        }
    }

    protected DefaultTreeModel t() {
        ler ler2 = this.ResourceTree.eqq();
        if (ler2 == null) {
            lfn.b(5, "SFXMLResourceTreeView", "createTreeModel() RootNode is null.");
            return new DefaultTreeModel(new lae(16, 0, "RootNode"));
        }
        lae lae2 = new lae(16, 0, "Items");
        DefaultTreeModel defaultTreeModel = new DefaultTreeModel(lae2);
        les les2 = lea.enW();
        ler2 = les2.eqq();
        this.a(lae2, les2, ler2);
        return defaultTreeModel;
    }

    private void a(lae lae2, les les2, ler ler2) {
        int n = les2.getType(this.EgY);
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            boolean bl = les2.isDescendant(ler3.getType(), n);
            if (bl) {
                lae lae3;
                if (les2.g(ler3) == null) {
                    lae3 = new lae(15, ler3.getType(), ler3.getName());
                    lae2.add(lae3);
                } else {
                    lae3 = new lae(15, ler3.getType(), ler3.getName());
                    lae2.add(lae3);
                    this.a(lae3, les2, ler3);
                }
            }
            ler3 = les2.h(ler3);
        }
    }

    public void zM(boolean bl) {
        this.EgZ = bl;
    }

    public boolean eJP() {
        return this.EgW;
    }

    public void zN(boolean bl) {
        this.EgW = bl;
    }

    public boolean eJQ() {
        return this.EgX;
    }

    public void zO(boolean bl) {
        this.EgX = bl;
    }

    static /* synthetic */ JTree a(mqv mqv2) {
        return mqv2.ca;
    }

    static /* synthetic */ boolean b(mqv mqv2) {
        return mqv2.EgX;
    }

    static /* synthetic */ boolean c(mqv mqv2) {
        return mqv2.EgW;
    }

    static /* synthetic */ boolean d(mqv mqv2) {
        return mqv2.EgZ;
    }

    static /* synthetic */ JTextField e(mqv mqv2) {
        return mqv2.DJg;
    }

    static /* synthetic */ JTextField f(mqv mqv2) {
        return mqv2.EgR;
    }

    static /* synthetic */ JTextField g(mqv mqv2) {
        return mqv2.EgS;
    }
}

