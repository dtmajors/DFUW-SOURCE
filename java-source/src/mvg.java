/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ari
 *  aux
 *  cug
 *  lcw
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class mvg
extends mkx {
    private dsl EJX;
    private ari EJY;
    private List<ler> aGu;
    private final Map<String, Integer> bRe = lcn.emw();
    private final jxl EJZ = new jxl();
    private final jyw EKa = new jyw();
    private ldv EKb;
    private JCheckBox EKc;
    private JComboBox EKd;
    private JButton EKe;
    private JTextField EKf;
    private JComboBox EKg;
    private JButton DON;
    private JButton DEp;
    private JPanel EKh;
    private JTree EKi;
    private JComboBox EKj;
    private JSpinner EKk;
    private JButton DNZ;
    private JButton qtf;
    private JTextField EKl;
    private JTextField EKm;
    private JSpinner EKn;
    private JLabel DGG;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private JLabel R;
    private JLabel S;
    private JPanel aa;
    private JPanel bN;
    private JPanel ac;
    private JPanel ad;
    private JPanel bAw;
    private JPanel ae;
    private JPanel af;
    private JPanel ag;
    private JScrollPane ah;
    private JScrollPane ai;
    private JLabel EKo;
    private JCheckBox EKp;
    private JCheckBox EKq;
    private JCheckBox EKr;

    public mvg() {
        super(false);
        this.b();
        this.EKi.getSelectionModel().setSelectionMode(1);
        this.a((DefaultMutableTreeNode)this.EKi.getModel().getRoot());
        this.setClosable(true);
    }

    public mvg(dsl dsl2) {
        super(false);
        this.EJX = dsl2;
        this.b();
        this.a((DefaultMutableTreeNode)this.EKi.getModel().getRoot());
        if (this.EJX.byn() != null) {
            this.DG(this.EJX.byn());
        } else {
            this.eQy();
        }
        this.setClosable(true);
    }

    private void eQy() {
        this.Y("Spawnpoint Dialog Tool :)", false);
        this.EKm.setText(null);
        this.EKp.setEnabled(true);
        this.EKq.setSelected(false);
        this.EKr.setSelected(false);
        this.EKk.setValue(4);
        this.EKn.setValue(Float.valueOf(100.0f));
        this.EKc.setSelected(false);
        this.EKj.setSelectedItem((Object)ash.c.bVm);
        this.EKh.removeAll();
        this.EKh.revalidate();
        this.pack();
    }

    protected void a(mvf mvf2) {
        mvf.Aj(true);
        mvf2.afK(0);
        this.a(mvf2, false);
        mvf.Aj(false);
        this.EKh.remove(mvf2);
        if (this.EKh.getComponentCount() == 1) {
            this.EKh.getComponent(0).setEnabled(false);
        }
        this.bRe.remove(mvf2.eQv().toLowerCase());
        this.EKh.revalidate();
        this.pack();
    }

    private void c(String string, int n, boolean bl) {
        if (!bl && this.bRe.containsKey(string.toLowerCase())) {
            return;
        }
        mvf mvf2 = new mvf(this);
        mvf.Aj(true);
        mvf2.DF(string);
        int n2 = n;
        float f = (float)n / 100.0f;
        if (n < 0) {
            if (this.EKh.getComponentCount() == 0) {
                n2 = 100;
                f = 1.0f;
            } else {
                n2 = 0;
                f = 0.0f;
            }
        }
        mvf2.afK(n2);
        mvf2.oH(f);
        this.EKh.add(mvf2);
        if (this.EKh.getComponentCount() == 1) {
            mvf2.setEnabled(false);
        } else if (!this.EKh.getComponent(0).isEnabled()) {
            this.EKh.getComponent(0).setEnabled(true);
        }
        mvf.Aj(false);
        this.bRe.put(string.toLowerCase(), mvf2.eQw());
        this.pack();
    }

    private void DG(String string) {
        this.eQy();
        this.EJY = this.EJZ.vk(string);
        if (this.EJY == null) {
            this.Y("Spawnpoint " + string + " does not parse correctly... check the logs", true);
            return;
        }
        this.EKb = this.EJY.Rk();
        this.EKm.setText(this.EJY.getName());
        this.EKn.setValue(Float.valueOf(this.EJY.getRadius()));
        this.EKq.setSelected(this.EJY.Rg());
        this.EKr.setSelected(this.EJY.Rh());
        this.EKp.setSelected(this.EJY.Rz());
        this.EKj.setSelectedItem((Object)this.EJY.Rr());
        this.EKk.setValue(this.EJY.Ro());
        String string2 = this.EJY.Rt();
        this.EKc.setSelected(string2 != null);
        if (this.EKc.isSelected()) {
            this.EKg.setSelectedItem(string2);
            arb arb2 = this.EJY.RE();
            this.EKd.setSelectedItem((Object)arb2);
            String string3 = null;
            switch (arb2) {
                case bNX: 
                case bNZ: {
                    string3 = String.valueOf(this.EJY.Ry());
                    break;
                }
                case bOa: {
                    string3 = lea.enW().getName(this.EJY.Ry());
                }
            }
            this.EKf.setText(string3);
        }
        for (String string3 : this.EJY.Rp().keySet()) {
            int n = (Integer)this.EJY.Rp().get(string3);
            this.c(string3, n, true);
        }
    }

    private void a(DefaultMutableTreeNode defaultMutableTreeNode) {
        les les2 = lea.enW();
        ler ler2 = les2.acv(cug.fgG);
        this.aGu = les2.a(ler2, true);
        TreeSet<String> treeSet = new TreeSet<String>();
        Object object = this.aGu.iterator();
        while (object.hasNext()) {
            ler ler3 = object.next();
            treeSet.add(ler3.getName());
        }
        while ((object = (String)treeSet.pollFirst()) != null) {
            this.EKg.addItem(object);
        }
        this.a(defaultMutableTreeNode, les2, ler2);
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

    private boolean c(ari ari2) {
        Object object;
        String string = this.EKm.getText();
        if (string == null || "".equalsIgnoreCase(string)) {
            this.Y("Please provide a name for the spawnpoint", true);
            return false;
        }
        if (new File(lcw.qLb + "xml-files/object/spawnpoint/" + string + ".xml").exists()) {
            int n = JOptionPane.showInternalConfirmDialog(this, string + " exists. OK to overwrite?", "Overwrite spawnpoint", 0);
            switch (n) {
                case 1: 
                case 2: {
                    return false;
                }
            }
        }
        if ((object = this.EKn.getValue()) == null) {
            this.Y("Please provide a radius for the spawnpoint", true);
            return false;
        }
        Object object2 = this.EKj.getSelectedItem();
        if (object2 == null || "".equalsIgnoreCase(object2.toString())) {
            this.Y("Please provide a navmesh type for the spawnpoint", true);
            return false;
        }
        Object object3 = this.EKk.getValue();
        if (object3 == null) {
            this.Y("Please indicate a number of monsters for the spawnpoint", true);
            return false;
        }
        if (this.EKc.isSelected()) {
            Object object4 = this.EKg.getSelectedItem();
            if (object4 == null || "".equalsIgnoreCase(object4.toString())) {
                this.Y("Please provide a boss resource for the spawnpoint", true);
                return false;
            }
            Object object5 = this.EKd.getSelectedItem();
            if (object5 == null || "".equalsIgnoreCase(object5.toString())) {
                this.Y("Please provide a condition for the spawnpoint", true);
                return false;
            }
            String string2 = this.EKf.getText();
            if (string2 == null || "".equalsIgnoreCase(string2)) {
                this.Y("Please provide a condition value for the spawnpoint", true);
                return false;
            }
            switch ((arb)((Object)object5)) {
                case bOa: {
                    int n = lea.enW().getType(string2);
                    if (n < 0) {
                        this.Y("Invalid resource name provided for condition value", true);
                        return false;
                    }
                    ari2.e(object5.toString(), n);
                    break;
                }
                case bNX: {
                    try {
                        ari2.e(object5.toString(), Integer.valueOf(string2).intValue());
                        break;
                    }
                    catch (NumberFormatException numberFormatException) {
                        this.Y("Incorrect (boss condition) value provided", true);
                        return false;
                    }
                }
                case bNZ: {
                    ari2.e(object5.toString(), 0);
                }
            }
            ari2.dR(object4.toString());
            ari2.bK(this.EJY.Rv() <= 0.0f ? 3.0f : this.EJY.Rv());
            ari2.bJ(this.EJY.Ru() <= 0.0f ? 7.0f : this.EJY.Ru());
        }
        ari2.df(this.EJX != null && this.EJX.getGUID() != null ? this.EJX.getGUID() : this.EKb);
        ari2.hz(Integer.valueOf(object3.toString()).intValue());
        ari2.bI(this.EJY.Rn() <= 0.0f ? 2.0f : this.EJY.Rn());
        ari2.bH(this.EJY.Rm() <= 0.0f ? 5.0f : this.EJY.Rm());
        ari2.a((ash.c)((Object)object2));
        ari2.dQ("nm_" + string);
        ari2.setRadius(Float.valueOf(object.toString()).floatValue());
        ari2.setName(string);
        ari2.bK(this.EKq.isSelected());
        ari2.bL(this.EKr.isSelected());
        ari2.bM(this.EKp.isSelected());
        if (this.EJX != null) {
            this.EJX.it(ari2.getRadius());
            this.EJX.byo();
        }
        if (this.bRe == null || this.bRe.isEmpty()) {
            this.Y("Please select some monsters for the spawnpoint", true);
            return false;
        }
        ari2.r(this.bRe);
        return this.EKa.a(ari2);
    }

    private void Y(String string, boolean bl) {
        this.DGG.setForeground(bl ? Color.RED : Color.BLACK);
        this.DGG.setText(string);
    }

    private void eQz() {
        DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode(((DefaultTreeModel)this.EKi.getModel()).getRoot());
        this.EKi.collapsePath(new TreePath(defaultMutableTreeNode));
        Enumeration<TreeNode> enumeration = ((DefaultMutableTreeNode)defaultMutableTreeNode.getUserObject()).depthFirstEnumeration();
        String string = this.EKl.getText();
        while (enumeration.hasMoreElements()) {
            DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)enumeration.nextElement();
            if (!((String)defaultMutableTreeNode2.getUserObject()).toLowerCase().contains(string.toLowerCase())) continue;
            Object[] objectArray = ((DefaultTreeModel)this.EKi.getModel()).getPathToRoot(defaultMutableTreeNode2);
            TreePath treePath = new TreePath(objectArray);
            this.EKi.scrollPathToVisible(treePath);
            return;
        }
    }

    void a(mvf mvf2, boolean bl) {
        mvf[] mvfArray;
        int n;
        int n2;
        block19: {
            int n3;
            ArrayList<mvf> arrayList;
            int n4;
            block18: {
                n4 = (int)(mvf2.eQu() * 100.0f);
                n2 = mvf2.eQw();
                n = n2 - n4;
                if (bl) {
                    n *= -1;
                }
                if (n % 5 != 0) {
                    return;
                }
                Component[] componentArray = this.EKh.getComponents();
                mvfArray = new mvf[componentArray.length];
                for (int i = 0; i < componentArray.length; ++i) {
                    mvf mvf3;
                    if (!(componentArray[i] instanceof mvf)) continue;
                    mvfArray[i] = mvf3 = (mvf)componentArray[i];
                }
                if (mvfArray.length == 1) {
                    mvf2.afK(100);
                    mvf2.oH(1.0f);
                    return;
                }
                arrayList = lcn.emv();
                n3 = 0;
                for (mvf mvf4 : mvfArray) {
                    if (mvf4.equals(mvf2) || mvf4.eQx()) continue;
                    if (n > 0) {
                        if (mvf4.eQw() - 1 < 0) continue;
                        n3 += mvf4.eQw();
                    } else {
                        if (mvf4.eQw() + 1 > 100) continue;
                        n3 += 100 - mvf4.eQw();
                    }
                    arrayList.add(mvf4);
                }
                if (arrayList.size() > 0) break block18;
                mvf2.afK(n4);
                break block19;
            }
            if (n3 < Math.abs(n)) {
                n = (int)((float)n3 * Math.signum(n));
                mvf2.afK(n + n4);
            }
            int n5 = Math.abs(n);
            int n6 = 0;
            while (n5 > 0) {
                block21: {
                    block22: {
                        int n7;
                        mvf mvf5;
                        block20: {
                            if (n6 >= arrayList.size()) {
                                n6 = 0;
                            }
                            mvf5 = (mvf)arrayList.get(n6);
                            n7 = mvf5.eQw();
                            if (n <= 0) break block20;
                            if (n7 - 5 < 0) break block21;
                            mvf5.afK(n7 - 5);
                            break block22;
                        }
                        if (n7 + 5 > 100) break block21;
                        mvf5.afK(n7 + 5);
                    }
                    n5 -= 5;
                }
                ++n6;
            }
        }
        for (mvf mvf6 : mvfArray) {
            int n8;
            if (mvf6.equals(mvf2)) {
                if (bl) {
                    n8 = n2 + n;
                    n8 = n8 < 0 ? 0 : (n8 > 100 ? 100 : n8);
                    mvf6.afK(n8);
                } else {
                    n8 = mvf6.eQw();
                }
                mvf6.oH(n8);
            } else {
                n8 = mvf6.eQw();
                mvf6.oH(n8);
            }
            this.bRe.put(mvf6.eQv().toLowerCase(), new Integer(n8));
        }
    }

    public void p(aux aux2) {
    }

    private void b() {
        this.aa = new JPanel();
        this.ac = new JPanel();
        this.EKk = new JSpinner();
        this.P = new JLabel();
        this.Q = new JLabel();
        this.R = new JLabel();
        this.S = new JLabel();
        this.EKf = new JTextField();
        this.EKd = new JComboBox<arb>(arb.values());
        this.EKg = new JComboBox();
        this.EKc = new JCheckBox();
        this.EKe = new JButton();
        this.bAw = new JPanel();
        this.EKj = new JComboBox<ash.c>(ash.c.values());
        this.bN = new JPanel();
        this.I = new JLabel();
        this.EKo = new JLabel();
        this.EKm = new JTextField();
        this.EKn = new JSpinner();
        this.ad = new JPanel();
        this.af = new JPanel();
        this.DNZ = new JButton();
        this.DEp = new JButton();
        this.DON = new JButton();
        this.ag = new JPanel();
        this.DGG = new JLabel();
        this.ae = new JPanel();
        this.ah = new JScrollPane();
        this.EKi = new JTree(new DefaultMutableTreeNode("Monsters"));
        this.ai = new JScrollPane();
        this.EKh = new JPanel();
        this.EKl = new JTextField();
        this.qtf = new JButton();
        a a2 = new a(this);
        this.setDefaultCloseOperation(2);
        this.ac.setBorder(BorderFactory.createTitledBorder(null, "Monsters", 5, 0));
        this.EKk.setModel(new SpinnerNumberModel(4, 1, 20, 1));
        this.EKk.setToolTipText("Total number of monsters (boss excluded) for this spawnpoint");
        this.P.setText("Number");
        this.Q.setText("Mob");
        this.Q.setEnabled(false);
        this.R.setText("Condition");
        this.R.setEnabled(false);
        this.S.setText("Value");
        this.S.setEnabled(false);
        this.EKf.setToolTipText("Either a number (for conditions X_...) or a resource name (for condition RESOURCE)");
        this.EKf.setEnabled(false);
        this.EKd.setToolTipText("Spawn condition (when or how the Boss will popup in the spawnpoint)");
        this.EKd.setEnabled(false);
        this.EKd.addItemListener(a2);
        this.EKg.setToolTipText("Resource name for the Boss Mob");
        this.EKg.setEnabled(false);
        this.EKc.setText("Boss");
        this.EKc.addChangeListener(a2);
        this.EKe.setText("...");
        this.EKe.setToolTipText("Select a resource as the Condition Value (only available if RESOURCE is the Condition)");
        this.EKe.setEnabled(false);
        this.EKe.addActionListener(a2);
        GroupLayout groupLayout = new GroupLayout(this.ac);
        this.ac.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.P)).addGroup(groupLayout.createSequentialGroup().addGap(59, 59, 59).addComponent(this.EKk, -2, 52, -2)).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Q, GroupLayout.Alignment.TRAILING).addComponent(this.S, GroupLayout.Alignment.TRAILING).addComponent(this.R, GroupLayout.Alignment.TRAILING)).addGap(4, 4, 4).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addComponent(this.EKf, -1, 91, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EKe, -2, 40, -2)).addComponent(this.EKd, 0, 137, Short.MAX_VALUE).addComponent(this.EKg, 0, 137, Short.MAX_VALUE))).addGroup(GroupLayout.Alignment.CENTER, groupLayout.createSequentialGroup().addGap(73, 73, 73).addComponent(this.EKc))).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.P).addComponent(this.EKk, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EKc).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Q).addComponent(this.EKg, -2, 20, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.R).addComponent(this.EKd, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.S).addComponent(this.EKf, -2, -1, -2).addComponent(this.EKe)).addContainerGap(-1, Short.MAX_VALUE)));
        new mve().a(this.EKg);
        this.bAw.setBorder(BorderFactory.createTitledBorder(null, "Navmesh", 5, 0));
        this.EKj.setToolTipText("Type of navmesh");
        GroupLayout groupLayout2 = new GroupLayout(this.bAw);
        this.bAw.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.EKj, 0, 0, Short.MAX_VALUE).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.EKj, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        this.bN.setBorder(BorderFactory.createTitledBorder(null, "Spawnpoint", 5, 0));
        this.I.setText("Name");
        this.EKo.setText("Radius");
        this.EKn.setModel(new SpinnerNumberModel(Float.valueOf(100.0f), Float.valueOf(5.0f), null, Float.valueOf(5.0f)));
        this.EKp = new JCheckBox("Enable Frenzy");
        this.EKp.setSelected(true);
        this.EKp.setHorizontalTextPosition(2);
        this.EKq = new JCheckBox("Summoning");
        this.EKq.setHorizontalTextPosition(2);
        this.EKr = new JCheckBox("Event Spawnpoint");
        this.EKr.setHorizontalTextPosition(2);
        GroupLayout groupLayout3 = new GroupLayout(this.bN);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.I, GroupLayout.Alignment.TRAILING).addComponent(this.EKo, GroupLayout.Alignment.TRAILING)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EKm, -1, 150, Short.MAX_VALUE).addComponent(this.EKn, -2, 60, -2))).addGroup(groupLayout3.createSequentialGroup().addComponent(this.EKp).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EKq).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EKr))).addContainerGap()));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.EKm, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.EKo).addComponent(this.EKn, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.EKp).addComponent(this.EKq).addComponent(this.EKr)).addContainerGap(26, Short.MAX_VALUE)));
        this.bN.setLayout(groupLayout3);
        GroupLayout groupLayout4 = new GroupLayout(this.aa);
        groupLayout4.setHorizontalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bN, -1, -1, Short.MAX_VALUE).addComponent(this.bAw, GroupLayout.Alignment.TRAILING, -1, 218, Short.MAX_VALUE).addComponent(this.ac, GroupLayout.Alignment.TRAILING, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        groupLayout4.setVerticalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addComponent(this.bN, -2, 99, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bAw, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ac, -2, -1, -2).addContainerGap(60, Short.MAX_VALUE)));
        this.aa.setLayout(groupLayout4);
        this.getContentPane().add((Component)this.aa, "West");
        this.ad.setLayout(new BorderLayout());
        this.DNZ.setText("Save");
        this.DNZ.setMaximumSize(new Dimension(65, 23));
        this.DNZ.setMinimumSize(new Dimension(65, 23));
        this.DNZ.setPreferredSize(new Dimension(65, 23));
        this.DNZ.addActionListener(a2);
        this.af.add(this.DNZ);
        this.DEp.setText("Load");
        this.DEp.setMaximumSize(new Dimension(65, 23));
        this.DEp.setMinimumSize(new Dimension(65, 23));
        this.DEp.setPreferredSize(new Dimension(65, 23));
        this.DEp.addActionListener(a2);
        this.af.add(this.DEp);
        this.DON.setText("Clear");
        this.DON.setMaximumSize(new Dimension(65, 23));
        this.DON.setMinimumSize(new Dimension(65, 23));
        this.DON.setPreferredSize(new Dimension(65, 23));
        this.DON.addActionListener(a2);
        this.af.add(this.DON);
        this.ad.add((Component)this.af, "East");
        this.DGG.setText("Spawnpoint Dialog Tool :)");
        GroupLayout groupLayout5 = new GroupLayout(this.ag);
        this.ag.setLayout(groupLayout5);
        groupLayout5.setHorizontalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addContainerGap().addComponent(this.DGG).addContainerGap(522, Short.MAX_VALUE)));
        groupLayout5.setVerticalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addContainerGap().addComponent(this.DGG).addContainerGap(-1, Short.MAX_VALUE)));
        this.ad.add((Component)this.ag, "Center");
        this.getContentPane().add((Component)this.ad, "South");
        this.EKi.addMouseListener(a2);
        this.ah.setViewportView(this.EKi);
        this.EKh.setLayout(new BoxLayout(this.EKh, 1));
        this.ai.setViewportView(this.EKh);
        this.EKl.addActionListener(a2);
        this.qtf.setText("Search");
        this.qtf.addActionListener(a2);
        GroupLayout groupLayout6 = new GroupLayout(this.ae);
        this.ae.setLayout(groupLayout6);
        groupLayout6.setHorizontalGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout6.createSequentialGroup().addContainerGap().addGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout6.createSequentialGroup().addComponent(this.EKl, -1, 86, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.qtf)).addComponent(this.ah, GroupLayout.Alignment.TRAILING, -1, 157, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ai, -2, 448, -2).addContainerGap()));
        groupLayout6.setVerticalGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout6.createSequentialGroup().addContainerGap().addGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.ai, -1, 325, Short.MAX_VALUE).addGroup(GroupLayout.Alignment.LEADING, groupLayout6.createSequentialGroup().addGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.EKl, -2, -1, -2).addComponent(this.qtf)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ah, -1, 296, Short.MAX_VALUE))).addContainerGap()));
        this.getContentPane().add((Component)this.ae, "Center");
        this.pack();
    }

    private void aB(ActionEvent actionEvent) {
        boolean bl = false;
        if (this.EJY == null) {
            this.EJY = new ari();
        }
        if ((bl = this.c(this.EJY)) && this.EJX != null) {
            this.EJX.jr(this.EKm.getText() + ".xml");
            this.Y("Spawnpoint saved as: " + this.EJX.byn(), false);
        }
    }

    private void aj(ActionEvent actionEvent) {
        mkb mkb2 = new mkb(new jrw(lcw.qLb + "xml-files/object/spawnpoint/"));
        myr myr2 = new myr("xml", "XML Files");
        mkb2.addChoosableFileFilter(myr2);
        mkb2.setAcceptAllFileFilterUsed(false);
        mkb2.setFileSelectionMode(0);
        mkb2.showOpenDialog(this);
        jrw jrw2 = mkb2.eDc();
        if (jrw2 != null) {
            String string = jrw2.getName();
            if (string.lastIndexOf(".xml") < 0) {
                this.DG((string + ".xml").intern());
            } else if (jrw2.exists()) {
                this.DG(string);
            }
        }
    }

    private void cf(ActionEvent actionEvent) {
        this.eQy();
        this.EKb = null;
    }

    private void cP(ActionEvent actionEvent) {
        this.eQz();
    }

    private void cQ(ActionEvent actionEvent) {
        this.eQz();
    }

    private void k(ChangeEvent changeEvent) {
        this.EKd.setEnabled(this.EKc.isSelected());
        this.EKf.setEnabled(this.EKc.isSelected());
        this.EKg.setEnabled(this.EKc.isSelected());
        if (!this.EKc.isSelected()) {
            this.EKe.setEnabled(false);
        }
        this.Q.setEnabled(this.EKc.isSelected());
        this.R.setEnabled(this.EKc.isSelected());
        this.S.setEnabled(this.EKc.isSelected());
    }

    private void z(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            DefaultMutableTreeNode defaultMutableTreeNode = null;
            int[] nArray = this.EKi.getSelectionRows();
            if (nArray != null) {
                defaultMutableTreeNode = (DefaultMutableTreeNode)this.EKi.getLastSelectedPathComponent();
            }
            if (defaultMutableTreeNode != null && defaultMutableTreeNode.isLeaf()) {
                this.c(defaultMutableTreeNode.toString(), -1, false);
            }
        }
    }

    private void cR(ActionEvent actionEvent) {
        mkb mkb2 = new mkb(new jrw(lcw.qLb + "xml-files/server/resource/"));
        myr myr2 = new myr("xml", "XML Files");
        mkb2.addChoosableFileFilter(myr2);
        mkb2.setAcceptAllFileFilterUsed(false);
        mkb2.setFileSelectionMode(0);
        mkb2.showOpenDialog(this);
        jrw jrw2 = mkb2.eDc();
        if (jrw2 != null) {
            String string = jrw2.getName();
            int n = string.lastIndexOf(".xml");
            if (n >= 0) {
                string = string.substring(0, n);
            }
            this.EKf.setText(string);
        }
    }

    private void c(ItemEvent itemEvent) {
        if (this.EKd.getSelectedItem() == arb.bOa) {
            this.EKe.setEnabled(true);
        } else {
            this.EKe.setEnabled(false);
        }
    }

    static /* synthetic */ JButton a(mvg mvg2) {
        return mvg2.EKe;
    }

    static /* synthetic */ void a(mvg mvg2, ActionEvent actionEvent) {
        mvg2.cR(actionEvent);
    }

    static /* synthetic */ JButton b(mvg mvg2) {
        return mvg2.DNZ;
    }

    static /* synthetic */ void b(mvg mvg2, ActionEvent actionEvent) {
        mvg2.aB(actionEvent);
    }

    static /* synthetic */ JButton c(mvg mvg2) {
        return mvg2.DEp;
    }

    static /* synthetic */ void c(mvg mvg2, ActionEvent actionEvent) {
        mvg2.aj(actionEvent);
    }

    static /* synthetic */ JButton d(mvg mvg2) {
        return mvg2.DON;
    }

    static /* synthetic */ void d(mvg mvg2, ActionEvent actionEvent) {
        mvg2.cf(actionEvent);
    }

    static /* synthetic */ JTextField e(mvg mvg2) {
        return mvg2.EKl;
    }

    static /* synthetic */ void e(mvg mvg2, ActionEvent actionEvent) {
        mvg2.cQ(actionEvent);
    }

    static /* synthetic */ JButton f(mvg mvg2) {
        return mvg2.qtf;
    }

    static /* synthetic */ void f(mvg mvg2, ActionEvent actionEvent) {
        mvg2.cP(actionEvent);
    }

    static /* synthetic */ JComboBox g(mvg mvg2) {
        return mvg2.EKd;
    }

    static /* synthetic */ void a(mvg mvg2, ItemEvent itemEvent) {
        mvg2.c(itemEvent);
    }

    static /* synthetic */ JTree h(mvg mvg2) {
        return mvg2.EKi;
    }

    static /* synthetic */ void a(mvg mvg2, MouseEvent mouseEvent) {
        mvg2.z(mouseEvent);
    }

    static /* synthetic */ JCheckBox i(mvg mvg2) {
        return mvg2.EKc;
    }

    static /* synthetic */ void a(mvg mvg2, ChangeEvent changeEvent) {
        mvg2.k(changeEvent);
    }
}
