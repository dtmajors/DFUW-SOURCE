/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcw
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import org.w3c.dom.Document;

public class amp
extends JFrame {
    private static final float bzu = 0.95f;
    private static final String bzv = "xml-files/gamelogicinfo/creaturemovementspeedlist.xml";
    private static les bzw;
    private final cts bzx;
    private final b bzy = new b(this);
    private cts bzz;
    private boolean bzA;
    private final Map<String, cts> bzB = lcn.emw();
    private int bzC;
    private int bzD;
    private int bzE;
    private final DecimalFormat bzF = new DecimalFormat();
    private int bzG;
    JButton bzH;
    JLabel R;
    JScrollPane ah;
    JScrollPane ai;
    JButton bzI;
    JList bzJ;
    JTree bzK;
    JSlider bzL;
    JSlider bzM;
    JButton bzN;
    JTextField bzO;
    JSlider bzP;
    JButton bzQ;
    JSlider bzR;

    public amp() {
        this.b();
        lcw.qHF = 20;
        this.bzF.setMaximumFractionDigits(1);
        this.a((DefaultMutableTreeNode)this.bzK.getModel().getRoot());
        this.Hs();
        this.bzx = this.bzy.dC(bzw.getName(cug.fgJ));
        String string = bzw.getName(cug.fgD);
        cts cts2 = this.bzy.dC(string);
        if (cts2 == null) {
            cts2 = this.bzy.dD(string);
            cts2.a(this.bzx, 0.95f);
            cts2.ResourceName = string;
            cts2.ResourceType = cug.fgD;
            this.a(cts2);
        }
        this.bzz = cts2.bbD();
        this.b(this.bzz);
        this.bf(true);
    }

    private void a(cts cts2) {
        cts2.ContactVelocityClimbing = Float.parseFloat(this.bzF.format(cts2.ContactVelocityClimbing));
        cts2.ContactVelocityCrouchWalk = Float.parseFloat(this.bzF.format(cts2.ContactVelocityCrouchWalk));
        cts2.ContactVelocityRun = Float.parseFloat(this.bzF.format(cts2.ContactVelocityRun));
        cts2.ContactVelocityRunStrafe = Float.parseFloat(this.bzF.format(cts2.ContactVelocityRunStrafe));
        cts2.ContactVelocitySprint = Float.parseFloat(this.bzF.format(cts2.ContactVelocitySprint));
        cts2.ContactVelocitySwim = Float.parseFloat(this.bzF.format(cts2.ContactVelocitySwim));
        cts2.ContactVelocitySwimFast = Float.parseFloat(this.bzF.format(cts2.ContactVelocitySwimFast));
        cts2.ContactVelocityWalk = Float.parseFloat(this.bzF.format(cts2.ContactVelocityWalk));
    }

    private void a(DefaultMutableTreeNode defaultMutableTreeNode) {
        Object object;
        bzw = lea.enW();
        if (cug.fgD == 0) {
            object = new juf();
            ((juf)object).a("xml-files/gamelogicinfo/resourcetree.xml", bzw);
            cug.anZ();
        }
        object = bzw.acv(cug.fgD);
        this.a(defaultMutableTreeNode, bzw, (ler)object);
    }

    private void a(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            DefaultMutableTreeNode defaultMutableTreeNode2;
            if (les2.g(ler3) == null) {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
            } else {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
                this.a(defaultMutableTreeNode2, les2, ler3);
            }
            ler3 = les2.h(ler3);
        }
    }

    private boolean Hs() {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, cts.class);
        String string = null;
        try {
            string = jry.ti(bzv);
            Object object = xStream.fromXML(string);
            this.bzy.h((List)object);
            return true;
        }
        catch (Exception exception) {
            System.err.println("Parsing of file 'xml-files/gamelogicinfo/creaturemovementspeedlist.xml' failed.");
            return false;
        }
    }

    private void bf(boolean bl) {
        this.bzR.setEnabled(!bl);
        this.bzL.setEnabled(!bl);
        this.bzM.setEnabled(!bl);
        this.bzP.setEnabled(!bl);
    }

    private void b() {
        this.ah = new JScrollPane();
        this.bzK = new JTree(new DefaultMutableTreeNode("r_Grounded Monsters"));
        this.bzR = new JSlider();
        this.bzL = new JSlider();
        this.bzP = new JSlider();
        this.bzM = new JSlider();
        this.ai = new JScrollPane();
        this.bzJ = new JList();
        this.bzJ.setModel(new DefaultListModel());
        this.bzN = new JButton();
        this.bzQ = new JButton();
        this.R = new JLabel();
        this.bzO = new JTextField();
        this.bzI = new JButton();
        this.bzH = new JButton();
        a a2 = new a(this);
        this.setDefaultCloseOperation(3);
        this.setTitle("Creature Speed Info Modifier");
        this.bzK.addMouseListener(a2);
        this.ah.setViewportView(this.bzK);
        this.bzR.setMajorTickSpacing(25);
        this.bzR.setMaximum(300);
        this.bzR.setMinorTickSpacing(5);
        this.bzR.setPaintLabels(true);
        this.bzR.setPaintTicks(true);
        this.bzR.setSnapToTicks(true);
        this.bzR.setToolTipText("% relative to players");
        this.bzR.setValue(100);
        this.bzR.setBorder(BorderFactory.createTitledBorder(null, "Walk", 0, 0, new Font("Tahoma", 0, 11), new Color(255, 0, 0)));
        this.bzR.addChangeListener(a2);
        this.bzL.setMajorTickSpacing(25);
        this.bzL.setMaximum(300);
        this.bzL.setMinorTickSpacing(5);
        this.bzL.setPaintLabels(true);
        this.bzL.setPaintTicks(true);
        this.bzL.setSnapToTicks(true);
        this.bzL.setToolTipText("% relative to players");
        this.bzL.setValue(100);
        this.bzL.setBorder(BorderFactory.createTitledBorder(null, "Run", 0, 0, new Font("Tahoma", 0, 11), new Color(255, 0, 0)));
        this.bzL.addChangeListener(a2);
        this.bzP.setMajorTickSpacing(25);
        this.bzP.setMaximum(300);
        this.bzP.setMinorTickSpacing(5);
        this.bzP.setPaintLabels(true);
        this.bzP.setPaintTicks(true);
        this.bzP.setSnapToTicks(true);
        this.bzP.setToolTipText("% relative to players");
        this.bzP.setValue(100);
        this.bzP.setBorder(BorderFactory.createTitledBorder(null, "Sprint", 0, 0, new Font("Tahoma", 0, 11), new Color(255, 0, 0)));
        this.bzP.addChangeListener(a2);
        this.bzM.setMajorTickSpacing(25);
        this.bzM.setMaximum(300);
        this.bzM.setMinorTickSpacing(5);
        this.bzM.setPaintLabels(true);
        this.bzM.setPaintTicks(true);
        this.bzM.setSnapToTicks(true);
        this.bzM.setToolTipText("% relative to players");
        this.bzM.setValue(100);
        this.bzM.setBorder(BorderFactory.createTitledBorder(null, "Run Strafe", 0, 0, new Font("Tahoma", 0, 11), new Color(255, 0, 0)));
        this.bzM.addChangeListener(a2);
        this.ai.setViewportView(this.bzJ);
        this.bzN.setText("Save Selected");
        this.bzN.addActionListener(a2);
        this.bzQ.setText("Undo Selected");
        this.bzQ.addActionListener(a2);
        this.R.setText("Search:");
        this.bzO.addActionListener(a2);
        this.bzI.setText("Load Speed File");
        this.bzI.addActionListener(a2);
        this.bzH.setText("Clean Speed File");
        this.bzH.setToolTipText("This button gets enabled when inconsitencies are found while loading the speed file.");
        this.bzH.setEnabled(false);
        this.bzH.addActionListener(a2);
        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.ah, -1, 289, Short.MAX_VALUE).addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup().addComponent(this.bzI).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bzH)).addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup().addComponent(this.R).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bzO, -1, 248, Short.MAX_VALUE))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addComponent(this.bzQ).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bzN)).addComponent(this.bzP, -1, 334, Short.MAX_VALUE).addComponent(this.bzM, -1, 334, Short.MAX_VALUE).addComponent(this.ai, -1, 334, Short.MAX_VALUE).addComponent(this.bzL, GroupLayout.Alignment.TRAILING, -1, 334, Short.MAX_VALUE).addComponent(this.bzR, GroupLayout.Alignment.TRAILING, -1, 334, Short.MAX_VALUE)).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bzI).addComponent(this.bzH)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(groupLayout.createSequentialGroup().addComponent(this.bzR, -2, 67, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bzL, -2, 67, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bzP, -2, 67, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bzM, -2, 67, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ai, -2, 147, -2)).addComponent(this.ah)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bzO, -2, -1, -2).addComponent(this.R).addComponent(this.bzN).addComponent(this.bzQ, -2, 23, -2)).addContainerGap()));
        this.pack();
    }

    protected void a(ChangeEvent changeEvent) {
        int n = this.bzL.getValue();
        if (!this.bzL.getValueIsAdjusting()) {
            if (this.bzC != n && !this.bzA) {
                String string = this.bzz.pa();
                cts cts2 = this.bzy.dC(string);
                cts cts3 = new cts();
                if (cts2 == null) {
                    cts2 = this.bzy.dD(string);
                    cts2.ResourceName = string;
                    cts2.ResourceType = this.bzz.ResourceType;
                    cts3 = cts2.bbD();
                    cts3.a(this.bzx, 0.95f);
                } else {
                    cts3 = cts2.bbD();
                }
                cts2.ContactVelocityClimbing = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityClimbing * (float)this.bzR.getValue() / 100.0f));
                cts2.ContactVelocityCrouchWalk = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityCrouchWalk * (float)this.bzR.getValue() / 100.0f));
                cts2.ContactVelocityRun = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityRun * (float)n / 100.0f));
                cts2.ContactVelocityRunStrafe = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityRunStrafe * (float)this.bzM.getValue() / 100.0f));
                cts2.ContactVelocitySprint = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocitySprint * (float)this.bzP.getValue() / 100.0f));
                cts2.ContactVelocitySwim = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocitySwim * (float)this.bzR.getValue() / 100.0f));
                cts2.ContactVelocitySwimFast = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocitySwimFast * (float)this.bzP.getValue() / 100.0f));
                cts2.ContactVelocityWalk = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityWalk * (float)this.bzR.getValue() / 100.0f));
                if (!this.bzB.containsKey(string)) {
                    DefaultListModel defaultListModel = (DefaultListModel)this.bzJ.getModel();
                    defaultListModel.addElement(string);
                    this.bzB.put(string, cts3);
                }
                this.bzN.setEnabled(true);
            }
            this.bzC = n;
        }
        float f2 = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityRun * (float)n / 100.0f));
        this.bzL.setBorder(BorderFactory.createTitledBorder(null, "Run " + n + "% " + f2, 0, 0, new Font("Tahoma", 0, 11), new Color(255, 0, 0)));
        this.bzA = false;
    }

    protected void b(ChangeEvent changeEvent) {
        int n = this.bzP.getValue();
        if (!this.bzP.getValueIsAdjusting()) {
            if (this.bzD != n && !this.bzA) {
                String string = this.bzz.pa();
                cts cts2 = this.bzy.dC(string);
                cts cts3 = new cts();
                if (cts2 == null) {
                    cts2 = this.bzy.dD(string);
                    cts2.ResourceName = string;
                    cts2.ResourceType = this.bzz.ResourceType;
                    cts3 = cts2.bbD();
                    cts3.a(this.bzx, 0.95f);
                } else {
                    cts3 = cts2.bbD();
                }
                int n2 = this.bzL.getValue() > 105 ? 105 : this.bzL.getValue();
                cts2.ContactVelocityClimbing = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityClimbing * (float)n2 / 100.0f));
                cts2.ContactVelocityCrouchWalk = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityCrouchWalk * (float)n2 / 100.0f));
                cts2.ContactVelocityRun = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityRun * (float)this.bzL.getValue() / 100.0f));
                cts2.ContactVelocityRunStrafe = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityRunStrafe * (float)this.bzM.getValue() / 100.0f));
                cts2.ContactVelocitySprint = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocitySprint * (float)n / 100.0f));
                cts2.ContactVelocitySwim = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocitySwim * (float)n2 / 100.0f));
                cts2.ContactVelocitySwimFast = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocitySwimFast * (float)n / 100.0f));
                cts2.ContactVelocityWalk = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityWalk * (float)n2 / 100.0f));
                if (!this.bzB.containsKey(string)) {
                    DefaultListModel defaultListModel = (DefaultListModel)this.bzJ.getModel();
                    defaultListModel.addElement(string);
                    this.bzB.put(string, cts3);
                }
                this.bzN.setEnabled(true);
            }
            this.bzD = n;
        }
        this.bzA = false;
        float f2 = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocitySprint * (float)n / 100.0f));
        this.bzP.setBorder(BorderFactory.createTitledBorder(null, "Sprint " + this.bzP.getValue() + "% " + f2, 0, 0, new Font("Tahoma", 0, 11), new Color(255, 0, 0)));
    }

    protected void c(ChangeEvent changeEvent) {
        int n = this.bzM.getValue();
        if (!this.bzM.getValueIsAdjusting()) {
            if (this.bzE != n && !this.bzA) {
                String string = this.bzz.pa();
                cts cts2 = this.bzy.dC(string);
                cts cts3 = new cts();
                if (cts2 == null) {
                    cts2 = this.bzy.dD(string);
                    cts2.ResourceName = string;
                    cts2.ResourceType = this.bzz.ResourceType;
                    cts3 = cts2.bbD();
                    cts3.a(this.bzx, 0.95f);
                } else {
                    cts3 = cts2.bbD();
                }
                cts2.ContactVelocityClimbing = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityClimbing * (float)this.bzR.getValue() / 100.0f));
                cts2.ContactVelocityCrouchWalk = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityCrouchWalk * (float)this.bzR.getValue() / 100.0f));
                cts2.ContactVelocityRun = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityRun * (float)this.bzL.getValue() / 100.0f));
                cts2.ContactVelocityRunStrafe = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityRunStrafe * (float)n / 100.0f));
                cts2.ContactVelocitySprint = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocitySprint * (float)this.bzP.getValue() / 100.0f));
                cts2.ContactVelocitySwim = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocitySwim * (float)this.bzR.getValue() / 100.0f));
                cts2.ContactVelocitySwimFast = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocitySwimFast * (float)this.bzP.getValue() / 100.0f));
                cts2.ContactVelocityWalk = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityWalk * (float)this.bzR.getValue() / 100.0f));
                if (!this.bzB.containsKey(string)) {
                    DefaultListModel defaultListModel = (DefaultListModel)this.bzJ.getModel();
                    defaultListModel.addElement(string);
                    this.bzB.put(string, cts3);
                }
                this.bzN.setEnabled(true);
            }
            this.bzE = n;
        }
        this.bzA = false;
        float f2 = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityRunStrafe * (float)n / 100.0f));
        this.bzM.setBorder(BorderFactory.createTitledBorder(null, "Run Strafe " + this.bzM.getValue() + "% " + f2, 0, 0, new Font("Tahoma", 0, 11), new Color(255, 0, 0)));
    }

    protected void m(ActionEvent actionEvent) {
        Object object;
        ArrayList<Object> arrayList = new ArrayList<Object>(Arrays.asList(this.bzJ.getSelectedValues()));
        if (arrayList.size() == 0) {
            return;
        }
        ArrayList<Object> arrayList2 = new ArrayList<Object>(Arrays.asList(((DefaultListModel)this.bzJ.getModel()).toArray()));
        for (Object iterator : arrayList) {
            if (!(iterator instanceof String)) continue;
            Object object2 = (String)iterator;
            this.bzB.remove(object2);
            object = this.bzy.dC(bzw.getName(cug.fgD));
            cts cts2 = this.bzy.dC((String)object2);
            if (((cts)object).d(cts2)) {
                this.bzy.dE((String)object2);
            }
            ((DefaultListModel)this.bzJ.getModel()).removeElement(object2);
        }
        arrayList2.removeAll(arrayList);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.bzy.Hu());
        for (Object object2 : arrayList2) {
            if (!(object2 instanceof String)) continue;
            object = (String)object2;
            arrayList3.remove(this.bzy.dC((String)object));
        }
        this.bzN.setEnabled(this.bzB.size() > 0);
        this.S(arrayList3);
    }

    protected void n(ActionEvent actionEvent) {
        Object[] objectArray = this.bzJ.getSelectedValues();
        if (objectArray == null || objectArray.length == 0) {
            return;
        }
        for (Object object : objectArray) {
            if (!(object instanceof String)) continue;
            String string = (String)object;
            cts cts2 = this.bzB.remove(string);
            if (this.bzy.dC(bzw.getName(cug.fgD)).d(cts2)) {
                this.bzy.dE(string);
            } else {
                this.bzy.dC(string).c(cts2);
            }
            ((DefaultListModel)this.bzJ.getModel()).removeElement(string);
            if (this.bzz == null || !string.equalsIgnoreCase(this.bzz.ResourceName)) continue;
            this.bzz = cts2;
        }
        if (this.bzz != null) {
            this.b(this.bzz);
        }
        this.bzN.setEnabled(this.bzB.size() > 0);
    }

    protected void o(ActionEvent actionEvent) {
        this.bzK.collapseRow(0);
        DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode(((DefaultTreeModel)this.bzK.getModel()).getRoot());
        Enumeration<TreeNode> enumeration = ((DefaultMutableTreeNode)defaultMutableTreeNode.getUserObject()).depthFirstEnumeration();
        String string = this.bzO.getText();
        if (string == null || "".equalsIgnoreCase(string)) {
            return;
        }
        TreePath[] treePathArray = new TreePath[]{};
        while (enumeration.hasMoreElements()) {
            DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)enumeration.nextElement();
            if (!((String)defaultMutableTreeNode2.getUserObject()).toLowerCase().contains(string.toLowerCase())) continue;
            Object[] objectArray = ((DefaultTreeModel)this.bzK.getModel()).getPathToRoot(defaultMutableTreeNode2);
            TreePath treePath = new TreePath(objectArray);
            this.bzK.scrollPathToVisible(treePath);
            TreePath[] treePathArray2 = new TreePath[treePathArray.length + 1];
            System.arraycopy(treePathArray, 0, treePathArray2, 0, treePathArray.length);
            treePathArray = treePathArray2;
            treePathArray[treePathArray.length - 1] = treePath;
        }
        this.bzK.setSelectionPaths(treePathArray);
    }

    protected void p(ActionEvent actionEvent) {
        this.Hs();
    }

    private void b(MouseEvent mouseEvent) {
        int[] nArray = this.bzK.getSelectionRows();
        if (nArray != null) {
            DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.bzK.getLastSelectedPathComponent();
            String string = defaultMutableTreeNode.toString();
            if (string == null) {
                return;
            }
            this.bzz = this.m(string, string).bbD();
            if (string.equals("r_Grounded Monsters")) {
                this.bf(true);
            } else {
                this.bf(false);
            }
            this.bzz.ResourceName = string;
            this.bzz.ResourceType = bzw.getType(string);
            this.b(this.bzz);
        }
    }

    private void d(ChangeEvent changeEvent) {
        int n = this.bzR.getValue();
        if (!this.bzR.getValueIsAdjusting()) {
            if (this.bzG != n && !this.bzA) {
                String string = this.bzz.pa();
                cts cts2 = this.bzy.dC(string);
                cts cts3 = new cts();
                if (cts2 == null) {
                    cts2 = this.bzy.dD(string);
                    cts2.ResourceName = string;
                    cts2.ResourceType = this.bzz.ResourceType;
                    cts3 = cts2.bbD();
                    cts3.a(this.bzx, 0.95f);
                } else {
                    cts3 = cts2.bbD();
                }
                cts2.ContactVelocityClimbing = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityClimbing * (float)n / 100.0f));
                cts2.ContactVelocityCrouchWalk = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityCrouchWalk * (float)n / 100.0f));
                cts2.ContactVelocityRun = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityRun * (float)this.bzL.getValue() / 100.0f));
                cts2.ContactVelocityRunStrafe = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityRunStrafe * (float)this.bzM.getValue() / 100.0f));
                cts2.ContactVelocitySprint = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocitySprint * (float)this.bzP.getValue() / 100.0f));
                cts2.ContactVelocitySwim = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocitySwim * (float)n / 100.0f));
                cts2.ContactVelocitySwimFast = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocitySwimFast * (float)this.bzP.getValue() / 100.0f));
                cts2.ContactVelocityWalk = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityWalk * (float)n / 100.0f));
                if (!this.bzB.containsKey(string)) {
                    DefaultListModel defaultListModel = (DefaultListModel)this.bzJ.getModel();
                    defaultListModel.addElement(string);
                    this.bzB.put(string, cts3);
                }
                this.bzN.setEnabled(true);
            }
            this.bzG = n;
        }
        float f2 = Float.parseFloat(this.bzF.format(this.bzx.ContactVelocityWalk * (float)n / 100.0f));
        this.bzR.setBorder(BorderFactory.createTitledBorder(null, "Walk " + n + "% " + f2, 0, 0, new Font("Tahoma", 0, 11), new Color(255, 0, 0)));
        this.bzA = false;
    }

    private void q(ActionEvent actionEvent) {
        this.S(new ArrayList<cts>(this.bzy.Hu()));
        this.bzH.setEnabled(false);
    }

    private void b(cts cts2) {
        int n = (int)(cts2.ContactVelocityWalk * 100.0f / this.bzx.ContactVelocityWalk);
        int n2 = (int)(cts2.ContactVelocityRun * 100.0f / this.bzx.ContactVelocityRun);
        int n3 = (int)(cts2.ContactVelocitySprint * 100.0f / this.bzx.ContactVelocitySprint);
        int n4 = (int)(cts2.ContactVelocityRunStrafe * 100.0f / this.bzx.ContactVelocityRunStrafe);
        if (this.bzR.getValue() != n) {
            this.bzA = true;
            this.bzR.setValue(n);
            this.bzR.setValueIsAdjusting(false);
        }
        if (this.bzL.getValue() != n2) {
            this.bzA = true;
            this.bzL.setValue(n2);
            this.bzL.setValueIsAdjusting(false);
        }
        if (this.bzP.getValue() != n3) {
            this.bzA = true;
            this.bzP.setValue(n3);
            this.bzP.setValueIsAdjusting(false);
        }
        if (this.bzM.getValue() != n4) {
            this.bzA = true;
            this.bzM.setValue(n4);
            this.bzM.setValueIsAdjusting(false);
        }
    }

    private cts m(String string, String string2) {
        cts cts2 = this.bzy.dC(string);
        if (cts2 == null) {
            int n = bzw.uW(bzw.getType(string));
            if (n < 0) {
                return this.bzy.dD(string2);
            }
            String string3 = bzw.getName(n);
            return this.m(string3, string2);
        }
        return cts2;
    }

    private void S(List<cts> list) {
        XStream xStream = new XStream(new DomDriver());
        xStream.setMode(1001);
        Annotations.configureAliases(xStream, cts.class);
        String string = xStream.toXML(list);
        Document document = jsy.tL(string);
        jsz.a(document, new jrw(lcw.qLb + bzv));
    }

    public static void main(String[] stringArray) {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new amp().setVisible(true);
            }
        });
    }

    static /* synthetic */ les Ht() {
        return bzw;
    }

    static /* synthetic */ void a(amp amp2, ActionEvent actionEvent) {
        amp2.q(actionEvent);
    }

    static /* synthetic */ void a(amp amp2, MouseEvent mouseEvent) {
        amp2.b(mouseEvent);
    }

    static /* synthetic */ void a(amp amp2, ChangeEvent changeEvent) {
        amp2.d(changeEvent);
    }
}

