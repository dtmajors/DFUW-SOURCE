/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class mvn
extends JFrame
implements ActionListener {
    private Dimension bV = new Dimension(400, 650);
    private final String bW = "n/a";
    mkn bX = new mkn("Resource Name", "n/a", false);
    mkn bY = new mkn("Resource Type", "n/a", false);
    mkn bZ = new mkn("Has resource file", "n/a", false);
    private les ResourceTree = lea.enW();
    private JTree ca = null;
    private a ELg = null;
    mvm ELh;

    public mvn(mvm mvm2) {
        this.ELh = mvm2;
        this.setTitle("Selected Resource Type");
        this.setPreferredSize(this.bV);
        this.r();
        this.pack();
    }

    private void r() {
        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new BoxLayout(jPanel2, 1));
        jPanel2.setBorder(BorderFactory.createTitledBorder("Resource Info"));
        JLabel jLabel = new JLabel("List of Resources");
        jPanel.add((Component)jLabel, "North");
        this.ca = new JTree(this.t());
        this.ca.setCellRenderer(new b(this));
        this.ca.getSelectionModel().setSelectionMode(1);
        this.ca.putClientProperty("JTree.lineStyle", "Angled");
        this.ELg = new a(this, this.ca, this);
        this.ca.addMouseListener(this.ELg);
        JScrollPane jScrollPane = new JScrollPane(this.ca);
        jPanel.add(jScrollPane);
        this.setLayout(new BorderLayout());
        jPanel2.add(this.bX);
        jPanel2.add(this.bY);
        jPanel2.add(this.bZ);
        this.add((Component)jPanel, "Center");
        this.add((Component)jPanel2, "South");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    }

    public void s() {
        this.ca.setModel(this.t());
        this.ca.revalidate();
    }

    protected DefaultTreeModel t() {
        ler ler2 = this.ResourceTree.eqq();
        if (ler2 == null) {
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
        int n = les2.getType("Resource");
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

    private void a(ler ler2, lae lae2) {
        ler ler3 = this.ResourceTree.g(ler2);
        lae lae3 = null;
        while (ler3 != null) {
            lae3 = new lae(15, ler3.getType(), ler3.getName());
            lae2.add(lae3);
            this.a(ler3, lae3);
            ler3 = this.ResourceTree.h(ler3);
        }
    }

    public void a(String string) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.ca.getModel().getRoot();
        TreePath treePath = new TreePath(defaultMutableTreeNode);
        this.ca.setSelectionPath(treePath);
        this.ca.setExpandsSelectedPaths(false);
        Enumeration<TreeNode> enumeration = defaultMutableTreeNode.breadthFirstEnumeration();
        while (enumeration.hasMoreElements()) {
            lae lae2 = (lae)enumeration.nextElement();
            if (!lae2.getName().toLowerCase().contains(string.toLowerCase())) continue;
            Object[] objectArray = ((DefaultTreeModel)this.ca.getModel()).getPathToRoot(lae2);
            treePath = new TreePath(objectArray);
            this.ca.scrollPathToVisible(treePath);
            this.ca.setSelectionPath(treePath);
        }
    }
}

