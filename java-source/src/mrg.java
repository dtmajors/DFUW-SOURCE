/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcw
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import org.jdesktop.layout.GroupLayout;

public class mrg
extends JInternalFrame
implements lgx {
    private JButton EiF;
    private JCheckBox EiG;
    private JTree EiH;
    private JButton G;
    private JComboBox DGq;
    private JLabel I;
    private JLabel P;
    private JList DFW;
    private JPanel aa;
    private JPanel bN;
    private JPanel ac;
    private JPanel ad;
    private JPanel bAw;
    private JPanel ae;
    private JScrollPane ah;
    private JScrollPane ai;
    private JScrollPane aj;
    private JSplitPane EiI;
    private JTextArea DUr;
    List<String> aGu = lcn.emv();
    private aux DEC;
    private boolean kpO = false;

    public mrg() {
        this.b();
        this.c();
    }

    private void b() {
        this.EiI = new JSplitPane();
        this.bAw = new JPanel();
        this.ad = new JPanel();
        this.aj = new JScrollPane();
        this.EiH = new JTree();
        this.aa = new JPanel();
        this.ah = new JScrollPane();
        this.DFW = new JList();
        this.EiF = new JButton();
        this.I = new JLabel();
        this.ac = new JPanel();
        this.DGq = new JComboBox();
        this.P = new JLabel();
        this.EiG = new JCheckBox();
        this.G = new JButton();
        this.ae = new JPanel();
        this.bN = new JPanel();
        this.ai = new JScrollPane();
        this.DUr = new JTextArea();
        this.setClosable(true);
        this.setMaximizable(true);
        this.setResizable(true);
        this.setTitle("Create Structure nodes from template");
        this.EiI.setDividerLocation(400);
        this.EiI.setOrientation(0);
        this.ad.setBorder(BorderFactory.createTitledBorder("Structure Info List"));
        this.EiH.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mrg EiJ;
            {
                this.EiJ = mrg2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                mrg.a(this.EiJ, mouseEvent);
            }
        });
        this.aj.setViewportView(this.EiH);
        GroupLayout groupLayout = new GroupLayout((Container)this.ad);
        this.ad.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.aj, -1, 354, Short.MAX_VALUE).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.aj, -1, 328, Short.MAX_VALUE).addContainerGap()));
        this.aa.setBorder(BorderFactory.createTitledBorder("Structures to add"));
        this.DFW.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mrg EiJ;
            {
                this.EiJ = mrg2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                mrg.b(this.EiJ, mouseEvent);
            }
        });
        this.ah.setViewportView(this.DFW);
        this.EiF.setText("Choose Resources");
        this.EiF.addActionListener(new ActionListener(this){
            final /* synthetic */ mrg EiJ;
            {
                this.EiJ = mrg2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mrg.a(this.EiJ, actionEvent);
            }
        });
        this.I.setText("<html>Right-click on resources to delete them.</html>");
        GroupLayout groupLayout2 = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (Component)this.ah, -1, 258, Short.MAX_VALUE).add((Component)this.I, -1, 258, Short.MAX_VALUE).add((Component)this.EiF)).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.I).addPreferredGap(0).add((Component)this.ah, -1, 274, Short.MAX_VALUE).addPreferredGap(1).add((Component)this.EiF).addContainerGap()));
        this.DGq.setModel(new DefaultComboBoxModel<String>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        this.P.setText("Choose Template:");
        this.EiG.setText("Replace Old Nodes");
        this.EiG.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.EiG.setMargin(new Insets(0, 0, 0, 0));
        this.G.setText("Add to StructureList file");
        this.G.addActionListener(new ActionListener(this){
            final /* synthetic */ mrg EiJ;
            {
                this.EiJ = mrg2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mrg.b(this.EiJ, actionEvent);
            }
        });
        GroupLayout groupLayout3 = new GroupLayout((Container)this.ac);
        this.ac.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((Component)this.P).add((Component)this.DGq, 0, 167, Short.MAX_VALUE).add(2, (GroupLayout.Group)groupLayout3.createParallelGroup(1).add((Component)this.EiG).add((Component)this.G))).addContainerGap()));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((Component)this.P).addPreferredGap(0).add((Component)this.DGq, -2, -1, -2).addPreferredGap(0, 277, Short.MAX_VALUE).add((Component)this.EiG).add((Component)this.G).addContainerGap()));
        GroupLayout groupLayout4 = new GroupLayout((Container)this.bAw);
        this.bAw.setLayout((LayoutManager)groupLayout4);
        groupLayout4.setHorizontalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((Component)this.ad, -1, -1, Short.MAX_VALUE).add(18, 18, 18).add((Component)this.aa, -2, -1, -2).addPreferredGap(0).add((Component)this.ac, -2, -1, -2).addContainerGap()));
        groupLayout4.setVerticalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE).add((Component)this.ad, -1, -1, Short.MAX_VALUE).add((Component)this.ac, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        this.EiI.setTopComponent(this.bAw);
        this.bN.setBorder(BorderFactory.createTitledBorder("Result log"));
        this.DUr.setColumns(20);
        this.DUr.setRows(5);
        this.ai.setViewportView(this.DUr);
        GroupLayout groupLayout5 = new GroupLayout((Container)this.bN);
        this.bN.setLayout((LayoutManager)groupLayout5);
        groupLayout5.setHorizontalGroup((GroupLayout.Group)groupLayout5.createParallelGroup(1).add((GroupLayout.Group)groupLayout5.createSequentialGroup().addContainerGap().add((Component)this.ai, -1, 855, Short.MAX_VALUE).addContainerGap()));
        groupLayout5.setVerticalGroup((GroupLayout.Group)groupLayout5.createParallelGroup(1).add((GroupLayout.Group)groupLayout5.createSequentialGroup().add((Component)this.ai, -1, 202, Short.MAX_VALUE).addContainerGap()));
        GroupLayout groupLayout6 = new GroupLayout((Container)this.ae);
        this.ae.setLayout((LayoutManager)groupLayout6);
        groupLayout6.setHorizontalGroup((GroupLayout.Group)groupLayout6.createParallelGroup(1).add((GroupLayout.Group)groupLayout6.createSequentialGroup().addContainerGap().add((Component)this.bN, -1, -1, Short.MAX_VALUE).addContainerGap()));
        groupLayout6.setVerticalGroup((GroupLayout.Group)groupLayout6.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout6.createSequentialGroup().addContainerGap().add((Component)this.bN, -1, -1, Short.MAX_VALUE).addContainerGap()));
        this.EiI.setBottomComponent(this.ae);
        GroupLayout groupLayout7 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout7);
        groupLayout7.setHorizontalGroup((GroupLayout.Group)groupLayout7.createParallelGroup(1).add((GroupLayout.Group)groupLayout7.createSequentialGroup().addContainerGap().add((Component)this.EiI, -1, 909, Short.MAX_VALUE).addContainerGap()));
        groupLayout7.setVerticalGroup((GroupLayout.Group)groupLayout7.createParallelGroup(1).add((GroupLayout.Group)groupLayout7.createSequentialGroup().addContainerGap().add((Component)this.EiI, -1, 668, Short.MAX_VALUE).addContainerGap()));
        this.pack();
    }

    private void p(MouseEvent mouseEvent) {
        this.mouseClicked(mouseEvent);
    }

    private void x(ActionEvent actionEvent) {
        this.eKs();
    }

    private void bz(ActionEvent actionEvent) {
        this.eJR();
    }

    private void q(MouseEvent mouseEvent) {
        this.r(mouseEvent);
    }

    private void c() {
        this.DFW.setListData(new Vector());
        this.EiH.setModel(new DefaultTreeModel(this.eKt()));
        this.a(this.EiH, new TreePath(this.EiH.getModel().getRoot()), true);
        this.m();
    }

    private void m() {
        File file = new File(lcw.qLb + "xml-files/worldbuilder/structure-templates/");
        File[] fileArray = file.listFiles();
        Vector<String> vector = new Vector<String>();
        for (int i = 0; i < fileArray.length; ++i) {
            File file2 = fileArray[i];
            if (!file2.isFile()) continue;
            vector.add(file2.getName());
        }
        this.DGq.setModel(new DefaultComboBoxModel(vector));
    }

    private void r(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == 3) {
            lfn.b(0, this.getClass().getSimpleName(), "mouseClicked() : right button clicked!");
            Point point = mouseEvent.getPoint();
            TreePath treePath = this.EiH.getPathForLocation(mouseEvent.getX(), mouseEvent.getY());
            if (treePath == null) {
                return;
            }
            DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)treePath.getLastPathComponent();
            if (!defaultMutableTreeNode.isLeaf()) {
                return;
            }
            String string = (String)defaultMutableTreeNode.getUserObject();
            if (string == null) {
                return;
            }
            int n = JOptionPane.showConfirmDialog(this, "Delete Selected resource [" + string + "] from StructureInfoList file?");
            if (n != 0) {
                return;
            }
            kbj kbj2 = new kbj();
            try {
                kbj2.wo(string);
                lea.eoN().clear();
                kbj2.wn("xml-files/gamelogicinfo/structuresinfolist.xml");
                this.EiH.setModel(new DefaultTreeModel(this.eKt()));
                this.EiH.revalidate();
                this.a(this.EiH, new TreePath(this.EiH.getModel().getRoot()), true);
            }
            catch (bg bg2) {
                lfn.b(0, this.getClass().getSimpleName(), "addResources() : Exception when removing node from Structurinfolist \n" + bg2);
            }
        }
    }

    private void a(JTree jTree, TreePath treePath, boolean bl) {
        TreeNode treeNode = (TreeNode)treePath.getLastPathComponent();
        if (treeNode.getChildCount() >= 0) {
            Enumeration<? extends TreeNode> enumeration = treeNode.children();
            while (enumeration.hasMoreElements()) {
                TreeNode treeNode2 = enumeration.nextElement();
                TreePath treePath2 = treePath.pathByAddingChild(treeNode2);
                this.a(jTree, treePath2, bl);
            }
        }
        if (bl) {
            jTree.expandPath(treePath);
        } else {
            jTree.collapsePath(treePath);
        }
    }

    @Override
    public void Ad(String string) {
        this.aGu.add(string);
        Object[] objectArray = this.aGu.toArray(new Object[this.aGu.size()]);
        this.DFW.setListData(objectArray);
        this.DFW.revalidate();
        this.DFW.repaint();
    }

    private void eJR() {
        mqv mqv2 = new mqv((Frame)this.DEC, false, this);
        mqv2.setLocationRelativeTo(this);
        mqv2.zO(true);
        mqv2.zN(false);
        mqv2.setVisible(true);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    private void eKs() {
        boolean bl = this.EiG.isSelected();
        kbj kbj2 = new kbj();
        String string = "";
        String string2 = (String)this.DGq.getSelectedItem();
        if (string2 == null) {
            string2 = "structtemplate.xml";
        }
        int n = 0;
        for (String string3 : this.aGu) {
            try {
                int n2 = lea.enW().getType(string3);
                ler ler2 = lea.enW().acv(n2);
                boolean bl2 = lea.enW().e(ler2);
                if (bl2) {
                    boolean bl3 = kbj2.b(string3, bl, string2);
                    if (bl3) {
                        string = string + "\nResource [" + string3 + "] added to structureInfoList file.";
                        ++n;
                        continue;
                    }
                    string = string + "\nResource [" + string3 + "] already exists in structureInfoList file! Not added.";
                    continue;
                }
                List<ler> list = lea.enW().a(ler2, true);
                for (ler ler3 : list) {
                    string3 = ler3.getName();
                    boolean bl4 = kbj2.P(string3, bl);
                    if (bl4) {
                        string = string + "\nResource [" + string3 + "] added to structureInfoList file.(rec)";
                        ++n;
                        continue;
                    }
                    string = string + "\nResource [" + string3 + "] already exists in structureInfoList file! Not added.";
                }
            }
            catch (Exception exception) {
                lfn.b(0, this.getClass().getSimpleName(), "addResources() : BLABLA -> " + exception);
                return;
            }
        }
        string = string + "\nAdded [" + n + "] nodes to structureInfoList file.";
        this.DUr.setText(string);
        JOptionPane.showMessageDialog(this, "Added [" + n + "] resoure nodes to structureInfoList file.");
        this.aGu.clear();
        Object[] objectArray = this.aGu.toArray(new Object[this.aGu.size()]);
        this.DFW.setListData(objectArray);
        this.DFW.revalidate();
        this.DFW.repaint();
        try {
            lea.eoN().clear();
            kbj2.wn("xml-files/gamelogicinfo/structuresinfolist.xml");
            this.EiH.setModel(new DefaultTreeModel(this.eKt()));
            this.EiH.revalidate();
            this.a(this.EiH, new TreePath(this.EiH.getModel().getRoot()), true);
        }
        catch (bg bg2) {
            lfn.b(0, this.getClass().getSimpleName(), "addResources() : Exception parsing StructurInfoFile: \n" + bg2);
        }
    }

    private DefaultMutableTreeNode eKt() {
        DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode("RootNode!");
        Map<Integer, amm> map = lea.eoN();
        les les2 = lea.enW();
        lfn.b(0, this.getClass().getSimpleName(), "getStructureInfoRootNode() : Nr of Infos = " + map.size());
        for (Integer n : map.keySet()) {
            ArrayList<String> arrayList = lcn.emv();
            ler ler2 = les2.acv(n);
            assert (ler2 != null);
            arrayList.add(ler2.getName());
            while (ler2 != null && les2.i(ler2) != null) {
                lfn.b(0, this.getClass().getSimpleName(), "getStructureInfoRootNode() : Add item = " + ler2.getName() + ", parent = " + les2.i(ler2));
                if ((ler2 = les2.i(ler2)) == null) continue;
                arrayList.add(ler2.getName());
            }
            DefaultMutableTreeNode defaultMutableTreeNode2 = defaultMutableTreeNode;
            block2: for (int i = arrayList.size() - 1; i >= 0; --i) {
                String string = (String)arrayList.get(i);
                lfn.b(0, this.getClass().getSimpleName(), "getStructureInfoRootNode() : ResName = " + string);
                boolean bl = true;
                while (bl) {
                    DefaultMutableTreeNode defaultMutableTreeNode3;
                    bl = false;
                    Enumeration<TreeNode> enumeration = defaultMutableTreeNode2.children();
                    while (enumeration.hasMoreElements()) {
                        defaultMutableTreeNode3 = (DefaultMutableTreeNode)enumeration.nextElement();
                        if (!defaultMutableTreeNode3.getUserObject().equals(string)) continue;
                        lfn.b(0, this.getClass().getSimpleName(), "getStructureInfoRootNode() : Found Object in path equals = " + string);
                        defaultMutableTreeNode2 = defaultMutableTreeNode3;
                        bl = true;
                        continue block2;
                    }
                    if (bl) continue;
                    lfn.b(0, this.getClass().getSimpleName(), "getStructureInfoRootNode() : Node NOT Found. Adding  [" + string + "]  to  Parent = " + defaultMutableTreeNode2.getUserObject());
                    defaultMutableTreeNode3 = new DefaultMutableTreeNode(string);
                    defaultMutableTreeNode2.add(defaultMutableTreeNode3);
                    defaultMutableTreeNode2 = defaultMutableTreeNode3;
                }
            }
        }
        return defaultMutableTreeNode;
    }

    private void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == 3) {
            lfn.b(0, this.getClass().getSimpleName(), "mouseClicked() : right button clicked!");
            Point point = mouseEvent.getPoint();
            int n = this.DFW.locationToIndex(mouseEvent.getPoint());
            this.DFW.setSelectedIndex(n);
            int n2 = JOptionPane.showConfirmDialog(this, "Delete Selected resource from list?");
            if (n2 == 0) {
                this.aGu.remove(n);
                Object[] objectArray = this.aGu.toArray(new Object[this.aGu.size()]);
                this.DFW.setListData(objectArray);
                this.DFW.revalidate();
                this.DFW.repaint();
            }
        }
    }

    static /* synthetic */ void a(mrg mrg2, MouseEvent mouseEvent) {
        mrg2.q(mouseEvent);
    }

    static /* synthetic */ void b(mrg mrg2, MouseEvent mouseEvent) {
        mrg2.p(mouseEvent);
    }

    static /* synthetic */ void a(mrg mrg2, ActionEvent actionEvent) {
        mrg2.bz(actionEvent);
    }

    static /* synthetic */ void b(mrg mrg2, ActionEvent actionEvent) {
        mrg2.x(actionEvent);
    }
}

