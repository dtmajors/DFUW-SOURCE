/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.LayoutStyle;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class mrf
extends JDialog {
    protected JPanel Eiv;
    protected JList DHd;
    protected JScrollPane Eiw;
    protected JTree Eix;
    protected JPanel Eiy;
    protected JTextField Eiz;
    protected JButton EiA;
    protected JButton EiB;
    protected JLabel P;
    protected JPanel ac;
    protected JScrollPane ai;
    private Vector<String> EiC = new Vector();
    private DefaultMutableTreeNode EiD;

    public mrf(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.eKm();
    }

    private void b() {
        this.Eiv = new JPanel();
        this.Eiw = new JScrollPane();
        this.DHd = new JList();
        this.ac = new JPanel();
        this.Eiy = new JPanel();
        this.P = new JLabel();
        this.Eiz = new JTextField();
        this.EiB = new JButton();
        this.ai = new JScrollPane();
        this.EiA = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Double click to add and remove actions");
        this.setResizable(false);
        this.Eiw.setBorder(BorderFactory.createTitledBorder("Search For Monsters"));
        this.Eiw.setViewportView(this.DHd);
        GroupLayout groupLayout = new GroupLayout(this.Eiv);
        this.Eiv.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addComponent(this.Eiw, -1, 335, Short.MAX_VALUE).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addGap(11, 11, 11).addComponent(this.Eiw, -1, 537, Short.MAX_VALUE)));
        this.P.setText("Monster Type");
        this.EiB.setText("Search Tree");
        GroupLayout groupLayout2 = new GroupLayout(this.Eiy);
        this.Eiy.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addComponent(this.P, -2, 72, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Eiz, -2, 108, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EiB, -1, 115, Short.MAX_VALUE).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.P, -2, 18, -2).addComponent(this.Eiz, -2, -1, -2).addComponent(this.EiB)));
        this.ai.setBorder(BorderFactory.createTitledBorder("All Monsters "));
        GroupLayout groupLayout3 = new GroupLayout(this.ac);
        this.ac.setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ai, GroupLayout.Alignment.TRAILING, -1, 325, Short.MAX_VALUE).addGroup(groupLayout3.createSequentialGroup().addComponent(this.Eiy, -1, -1, Short.MAX_VALUE).addContainerGap()))));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout3.createSequentialGroup().addContainerGap(-1, Short.MAX_VALUE).addComponent(this.Eiy, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ai, -2, 497, -2).addGap(62, 62, 62)));
        this.EiA.setText("Search");
        GroupLayout groupLayout4 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout4);
        groupLayout4.setHorizontalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addComponent(this.ac, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Eiv, -2, -1, -2).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, groupLayout4.createSequentialGroup().addContainerGap(620, Short.MAX_VALUE).addComponent(this.EiA).addGap(21, 21, 21)));
        groupLayout4.setVerticalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout4.createSequentialGroup().addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addComponent(this.ac, 0, 537, Short.MAX_VALUE)).addComponent(this.Eiv, -1, -1, Short.MAX_VALUE)).addGap(11, 11, 11).addComponent(this.EiA).addContainerGap()));
        this.pack();
    }

    private void eKm() {
        this.eKn();
        this.eKo();
    }

    private void eKn() {
        this.EiD = new DefaultMutableTreeNode("Monster Types");
        les les2 = lea.enW();
        ler ler2 = les2.eqq();
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            int n = les2.getType(lea.enW().getName(cug.fgz));
            boolean bl = les2.isDescendant(ler3.getType(), n);
            if (bl) {
                ler ler4 = les2.g(ler3);
                while (ler4 != null) {
                    this.c(this.EiD, les2, ler4);
                    ler4 = les2.h(ler4);
                }
            }
            ler3 = les2.h(ler3);
        }
    }

    private void c(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
        int n = les2.getType(lea.enW().getName(cug.fgE));
        int n2 = les2.getType(lea.enW().getName(cug.fgG));
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            boolean bl = les2.isDescendant(ler3.getType(), n);
            boolean bl2 = les2.isDescendant(ler3.getType(), n2);
            if (bl && bl2) {
                DefaultMutableTreeNode defaultMutableTreeNode2;
                if (les2.g(ler3) == null) {
                    defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                    defaultMutableTreeNode.add(defaultMutableTreeNode2);
                } else {
                    defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                    defaultMutableTreeNode.add(defaultMutableTreeNode2);
                    this.c(defaultMutableTreeNode2, les2, ler3);
                }
            }
            ler3 = les2.h(ler3);
        }
        this.Eix = new JTree(defaultMutableTreeNode);
        this.Eix.getSelectionModel().setSelectionMode(1);
        this.ai.setViewportView(this.Eix);
    }

    private void eKo() {
        this.DHd.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mrf EiE;
            {
                this.EiE = mrf2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == 1 && mouseEvent.getClickCount() == 2) {
                    mrf.a(this.EiE);
                }
            }
        });
        this.DHd.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ mrf EiE;
            {
                this.EiE = mrf2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 127) {
                    Object[] objectArray = this.EiE.DHd.getSelectedValues();
                    if (objectArray != null) {
                        for (int i = 0; i < objectArray.length; ++i) {
                            mrf.b(this.EiE).remove(objectArray[i]);
                        }
                    }
                    this.EiE.DHd.setListData(mrf.b(this.EiE));
                    this.EiE.DHd.repaint();
                }
            }
        });
        this.Eix.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mrf EiE;
            {
                this.EiE = mrf2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                MutableTreeNode mutableTreeNode;
                TreePath treePath;
                if (mouseEvent.getButton() == 1 && mouseEvent.getClickCount() == 2 && (treePath = this.EiE.Eix.getSelectionPath()) != null && (mutableTreeNode = (MutableTreeNode)treePath.getLastPathComponent()) != null) {
                    mrf.a(this.EiE, mutableTreeNode.toString());
                }
            }
        });
        this.EiA.addActionListener(new ActionListener(this){
            final /* synthetic */ mrf EiE;
            {
                this.EiE = mrf2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mrf.c(this.EiE);
            }
        });
        this.EiB.addActionListener(new ActionListener(this){
            final /* synthetic */ mrf EiE;
            {
                this.EiE = mrf2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
            }
        });
    }

    public TreePath a(JTree jTree, String[] stringArray) {
        TreeNode treeNode = (TreeNode)jTree.getModel().getRoot();
        return this.a(jTree, new TreePath(treeNode), stringArray, 0, true);
    }

    private TreePath a(JTree jTree, TreePath treePath, Object[] objectArray, int n, boolean bl) {
        TreeNode treeNode = (TreeNode)treePath.getLastPathComponent();
        Object object = treeNode;
        if (bl) {
            object = object.toString();
        }
        if (object.equals(objectArray[n])) {
            if (n == objectArray.length - 1) {
                return treePath;
            }
            if (treeNode.getChildCount() >= 0) {
                Enumeration<? extends TreeNode> enumeration = treeNode.children();
                while (enumeration.hasMoreElements()) {
                    TreeNode treeNode2 = enumeration.nextElement();
                    TreePath treePath2 = treePath.pathByAddingChild(treeNode2);
                    TreePath treePath3 = this.a(jTree, treePath2, objectArray, n + 1, bl);
                    if (treePath3 == null) continue;
                    return treePath3;
                }
            }
        }
        return null;
    }

    private void eKp() {
        Object e2 = this.DHd.getSelectedValue();
        if (e2 != null) {
            this.EiC.remove(e2);
            this.DHd.setListData(this.EiC);
            this.DHd.repaint();
        }
    }

    private void CV(String string) {
        if (!this.EiC.contains(string)) {
            this.EiC.add(string);
            this.DHd.setListData(this.EiC);
        }
    }

    private void eKq() {
        this.setVisible(false);
    }

    public ArrayList<Integer> eKr() {
        ArrayList<Integer> arrayList = lcn.emv();
        for (String string : this.EiC) {
            arrayList.add(lea.enW().getType(string));
        }
        return arrayList;
    }

    static /* synthetic */ void a(mrf mrf2) {
        mrf2.eKp();
    }

    static /* synthetic */ Vector b(mrf mrf2) {
        return mrf2.EiC;
    }

    static /* synthetic */ void a(mrf mrf2, String string) {
        mrf2.CV(string);
    }

    static /* synthetic */ void c(mrf mrf2) {
        mrf2.eKq();
    }
}

