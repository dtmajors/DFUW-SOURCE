/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

public class msj {
    private DefaultMutableTreeNode EtL;
    private DefaultTreeModel EtM;
    private DefaultMutableTreeNode EtN;
    private DefaultTreeModel EtO;
    private DefaultMutableTreeNode EtP;
    private DefaultTreeModel EtQ;
    private JTree Eix;
    private JTree EtR;
    private JTree EtS;
    private List<String> EtT;
    private List<String> EtU;
    private List<String> EtV;
    private final Dimension DDN = new Dimension(800, 600);
    private String EtW;
    private JButton EtX;
    private JTextField EtY;
    JTree EtZ;
    private ArrayList<String> Eua;
    private ArrayList<String> Eub;
    private JTree Euc;
    private JTree Eud;
    private DefaultTreeModel Eue;
    private DefaultTreeModel Euf;
    private ArrayList<String> Eug;
    private DefaultTreeModel Euh;
    private JTree Eui;
    private DefaultMutableTreeNode Euj;
    private DefaultMutableTreeNode Euk;
    private DefaultTreeModel Eul;
    private JTree Eum;
    private DefaultTreeModel Eun;
    private JTree Euo;

    public msj(JTextField jTextField) {
        this();
        this.EtY = jTextField;
    }

    public msj() {
        this.EtU = new ArrayList<String>();
        this.EtV = new ArrayList<String>();
        this.EtT = new ArrayList<String>();
        this.Eua = new ArrayList();
        this.Eug = new ArrayList();
        this.Eub = new ArrayList();
        this.eKn();
        this.eNP();
        this.eKg();
        this.eNQ();
        this.eNR();
        this.eNS();
        this.eNT();
        this.eNV();
        this.eNU();
        this.Eix = new JTree(this.EtM);
        this.EtS = new JTree(this.EtO);
        this.EtR = new JTree(this.EtQ);
        this.Euc = new JTree(this.Eue);
    }

    public void a(JTextField jTextField) {
        this.a(this.Euc);
    }

    public void b(JTextField jTextField) {
        this.a(this.Eum);
    }

    public void c(JTextField jTextField) {
        this.a(this.Euo);
    }

    public void d(JTextField jTextField) {
        this.a(this.Eix);
    }

    public void e(JTextField jTextField) {
        this.a(this.EtS);
    }

    public void f(JTextField jTextField) {
        this.a(this.EtR);
    }

    public void g(JTextField jTextField) {
        this.a(this.EtZ);
    }

    public void h(JTextField jTextField) {
        this.a(this.Eui);
    }

    public void i(JTextField jTextField) {
        this.a(this.Eud);
    }

    public void eKn() {
        this.EtL = new DefaultMutableTreeNode("Weapons");
        les les2 = lea.enW();
        ler ler2 = les2.eqq();
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            int n = les2.getType("r_Items");
            boolean bl = les2.isDescendant(ler3.getType(), n);
            if (bl) {
                this.c(this.EtL, les2, ler3);
                break;
            }
            ler3 = les2.h(ler3);
        }
    }

    private void c(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
        int n = les2.getType("r_Weapons");
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            boolean bl = les2.isDescendant(ler3.getType(), n);
            if (bl) {
                DefaultMutableTreeNode defaultMutableTreeNode2;
                if (ler3.getName() != null) {
                    this.EtT.add(ler3.getName());
                }
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
        this.EtM = new DefaultTreeModel(defaultMutableTreeNode);
    }

    public void eNP() {
        this.EtN = new DefaultMutableTreeNode("All Resources");
        les les2 = lea.enW();
        ler ler2 = les2.eqq();
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            this.d(this.EtN, les2, ler3);
            ler3 = les2.h(ler3);
        }
    }

    private void d(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            DefaultMutableTreeNode defaultMutableTreeNode2;
            if (les2.g(ler3) == null) {
                this.EtU.add(ler3.getName());
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
            } else {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
                this.d(defaultMutableTreeNode2, les2, ler3);
            }
            ler3 = les2.h(ler3);
        }
        this.EtO = new DefaultTreeModel(defaultMutableTreeNode);
    }

    public void eNQ() {
        DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode("Boosters");
        for (ckk ckk2 : lea.epw().aRd().values()) {
            defaultMutableTreeNode.add(new DefaultMutableTreeNode(ckk2.getName()));
        }
        DefaultTreeModel defaultTreeModel = new DefaultTreeModel(defaultMutableTreeNode);
        this.EtZ = new JTree(defaultTreeModel);
    }

    private void eNR() {
        Collection<List<cgw>> collection = lea.eps().aOg().values();
        ArrayList<cgw> arrayList = new ArrayList<cgw>();
        Collection<cgr> collection2 = lea.eps().aOa().values();
        Collection<cgu> collection3 = lea.eps().aOb().values();
        Collection<cgq> collection4 = lea.eps().aOc().values();
        Map<Integer, String> map = lcn.emw();
        ArrayList<cgr> arrayList2 = new ArrayList<cgr>();
        map.clear();
        for (List<cgw> object2 : collection) {
            for (Object object2 : object2) {
                arrayList.add((cgw)object2);
            }
        }
        for (cgw cgw2 : arrayList) {
            if (cgw2.ezk != cgl.eyz) continue;
            arrayList2.add(lea.eps().hm(cgw2.ezl));
        }
        for (cgr cgr2 : collection2) {
            if (arrayList2.contains(cgr2) || !cgr2.bdP || arrayList.contains(cgr2)) continue;
            map.put(cgr2.adk, "Feat");
        }
        DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode("Available Feats");
        defaultMutableTreeNode.removeAllChildren();
        for (Object object : map.keySet()) {
            Object object2;
            object2 = null;
            if (((String)map.get(object)).equals("Feat")) {
                object2 = new DefaultMutableTreeNode(lea.eps().pU((int)((Integer)object).intValue()).Name);
            } else if (((String)map.get(object)).equals("Subgroup") || ((String)map.get(object)).equals("Group")) continue;
            defaultMutableTreeNode.add((MutableTreeNode)object2);
        }
        this.Eue = new DefaultTreeModel(defaultMutableTreeNode);
        this.Euc = new JTree(this.Eue);
    }

    private void eNS() {
        Collection<List<cgw>> collection = lea.eps().aOg().values();
        ArrayList<cgw> arrayList = new ArrayList<cgw>();
        Collection<cgu> collection2 = lea.eps().aOb().values();
        Map<Integer, String> map = lcn.emw();
        ArrayList<cgu> arrayList2 = new ArrayList<cgu>();
        map.clear();
        for (List<cgw> object2 : collection) {
            for (Object object2 : object2) {
                arrayList.add((cgw)object2);
            }
        }
        for (cgw cgw2 : arrayList) {
            if (cgw2.ezk != cgl.eyA) continue;
            arrayList2.add(lea.eps().hl(cgw2.ezl));
        }
        for (cgu cgu2 : collection2) {
            if (arrayList2.contains(cgu2) || !cgu2.bdP || arrayList.contains(cgu2)) continue;
            map.put(cgu2.adk, "Subgroup");
        }
        DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode("Available Feats");
        defaultMutableTreeNode.removeAllChildren();
        for (Object object : map.keySet()) {
            Object object2;
            object2 = null;
            if (((String)map.get(object)).equals("Feat")) continue;
            if (((String)map.get(object)).equals("Subgroup")) {
                object2 = new DefaultMutableTreeNode(lea.eps().pT((int)((Integer)object).intValue()).Name);
            } else if (((String)map.get(object)).equals("Group")) continue;
            defaultMutableTreeNode.add((MutableTreeNode)object2);
        }
        this.Eul = new DefaultTreeModel(defaultMutableTreeNode);
        this.Eum = new JTree(this.Eul);
    }

    private void eNT() {
        Collection<List<cgw>> collection = lea.eps().aOg().values();
        ArrayList<cgw> arrayList = new ArrayList<cgw>();
        Collection<cgq> collection2 = lea.eps().aOc().values();
        Map<Integer, String> map = lcn.emw();
        ArrayList<cgq> arrayList2 = new ArrayList<cgq>();
        map.clear();
        for (List<cgw> object2 : collection) {
            for (Object object2 : object2) {
                arrayList.add((cgw)object2);
            }
        }
        for (cgw cgw2 : arrayList) {
            if (cgw2.ezk != cgl.eyB) continue;
            arrayList2.add(lea.eps().ho(cgw2.ezl));
        }
        for (cgq cgq2 : collection2) {
            if (arrayList2.contains(cgq2) || !cgq2.bdP || arrayList.contains(cgq2)) continue;
            map.put(cgq2.adk, "Group");
        }
        DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode("Available Groups");
        defaultMutableTreeNode.removeAllChildren();
        for (Object object : map.keySet()) {
            Object object2;
            object2 = null;
            if (((String)map.get(object)).equals("Feat") || ((String)map.get(object)).equals("Subgroup")) continue;
            if (((String)map.get(object)).equals("Group")) {
                object2 = new DefaultMutableTreeNode(lea.eps().pV((int)((Integer)object).intValue()).Name);
            }
            defaultMutableTreeNode.add((MutableTreeNode)object2);
        }
        this.Eun = new DefaultTreeModel(defaultMutableTreeNode);
        this.Euo = new JTree(this.Eun);
    }

    private void eNU() {
        Collection<cgr> collection = lea.eps().aOa().values();
        DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode("Available Feats");
        this.Euf = new DefaultTreeModel(defaultMutableTreeNode);
        for (cgr cgr2 : collection) {
            DefaultMutableTreeNode defaultMutableTreeNode2 = new DefaultMutableTreeNode(cgr2.Name);
            defaultMutableTreeNode.add(defaultMutableTreeNode2);
        }
        this.Eud = new JTree(this.Euf);
    }

    private void eNV() {
        this.Euj = new DefaultMutableTreeNode("Available Areas");
        this.Euh = new DefaultTreeModel(this.Euj);
        for (String string : lea.ept().keySet()) {
            DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode(string);
            this.Euj.add(defaultMutableTreeNode);
        }
        this.Eui = new JTree(this.Euh);
    }

    public void eKg() {
        this.EtP = new DefaultMutableTreeNode("Skills");
        les les2 = lea.enZ();
        ler ler2 = les2.eqq();
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            this.e(this.EtP, les2, ler3);
            ler3 = les2.h(ler3);
        }
    }

    private void e(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            DefaultMutableTreeNode defaultMutableTreeNode2;
            if (ler3.getName() != null) {
                this.EtV.add(ler3.getName());
            }
            if (les2.g(ler3) == null) {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
            } else {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
                this.e(defaultMutableTreeNode2, les2, ler3);
            }
            ler3 = les2.h(ler3);
        }
        this.EtQ = new DefaultTreeModel(defaultMutableTreeNode);
    }

    public List<String> dUb() {
        return this.EtV;
    }

    private boolean j(ej[] ejArray) {
        for (int i = 0; i < ejArray.length; ++i) {
            if (!ejArray[i].getName().equals("Health")) continue;
            return true;
        }
        return false;
    }

    public void a(JTree jTree) {
        jTree.getSelectionModel().setSelectionMode(1);
        JDialog jDialog = new JDialog();
        jDialog.setTitle("Choose a node and press Add");
        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel(new FlowLayout());
        this.EtX = new JButton("Add");
        JButton jButton = new JButton("Cancel");
        jButton.addActionListener(new ActionListener(this, jTree, jDialog){
            final /* synthetic */ JTree Eup;
            final /* synthetic */ JDialog EtI;
            final /* synthetic */ msj Euq;
            {
                this.Euq = msj2;
                this.Eup = jTree;
                this.EtI = jDialog;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.Eup.clearSelection();
                this.Eup.setSelectionPath(null);
                this.EtI.dispose();
            }
        });
        jPanel2.add(this.EtX);
        jPanel2.add(jButton);
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.getViewport().add(jTree);
        this.EtX.addActionListener(new ActionListener(this, jTree, jDialog){
            final /* synthetic */ JTree Eup;
            final /* synthetic */ JDialog EtI;
            final /* synthetic */ msj Euq;
            {
                this.Euq = msj2;
                this.Eup = jTree;
                this.EtI = jDialog;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                int[] nArray = this.Eup.getSelectionRows();
                if (nArray != null && this.Eup.getLastSelectedPathComponent() != null && !this.Eup.getLastSelectedPathComponent().equals("")) {
                    DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.Eup.getLastSelectedPathComponent();
                    String string = defaultMutableTreeNode.toString();
                    msj.a(this.Euq, string);
                    msj.b(this.Euq).setText(msj.a(this.Euq));
                    this.EtI.dispose();
                }
            }
        });
        jPanel.add((Component)jScrollPane, "Center");
        jPanel.add((Component)jPanel2, "South");
        jDialog.add(jPanel);
        jDialog.setModal(true);
        jDialog.setSize(250, 500);
        jDialog.setLocation((int)this.DDN.getWidth() / 2, (int)this.DDN.getHeight() / 2);
        jDialog.setVisible(true);
    }

    private String eNW() {
        return this.EtW;
    }

    public static boolean afu(int n) {
        Collection<List<cgw>> collection = lea.eps().aOg().values();
        ArrayList<cgw> arrayList = new ArrayList<cgw>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        for (List<cgw> object : collection) {
            for (cgw cgw2 : object) {
                arrayList.add(cgw2);
            }
        }
        for (cgw cgw3 : arrayList) {
            if (cgw3.ezk.equals((Object)cgl.eyz)) {
                arrayList2.add(lea.eps().hm((String)cgw3.ezl).adk);
                continue;
            }
            if (cgw3.ezk.equals((Object)cgl.eyA)) {
                arrayList2.add(lea.eps().hl((String)cgw3.ezl).adk);
                continue;
            }
            if (!cgw3.ezk.equals((Object)cgl.eyB)) continue;
            arrayList2.add(lea.eps().ho((String)cgw3.ezl).adk);
        }
        for (Integer n2 : arrayList2) {
            if (n != n2) continue;
            return true;
        }
        return false;
    }

    static /* synthetic */ String a(msj msj2, String string) {
        msj2.EtW = string;
        return msj2.EtW;
    }

    static /* synthetic */ String a(msj msj2) {
        return msj2.EtW;
    }

    static /* synthetic */ JTextField b(msj msj2) {
        return msj2.EtY;
    }
}

