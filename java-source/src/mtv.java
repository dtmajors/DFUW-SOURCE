/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  com.l2fprod.common.swing.JTaskPane
 *  com.l2fprod.common.swing.JTaskPaneGroup
 *  cug
 *  lcw
 */
import com.l2fprod.common.swing.JTaskPane;
import com.l2fprod.common.swing.JTaskPaneGroup;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class mtv
extends mkx {
    private aux DEC = null;
    private Dimension EDK = new Dimension(800, 600);
    private String EDL = lcw.qLb + "xml-files/server/resourcecontainers/loot inventory/";
    private String EDM = lcw.qLb + "xml-files/server/resourcecontainers/skinning inventory/";
    private JPanel EDN = new JPanel(new GridLayout(1, 2));
    Vector EDO = new Vector();
    Vector EDP = new Vector();
    private List<lil> EDQ = lcn.emv();
    private JPanel EDR = new JPanel(new GridLayout(2, 1));
    private mpj EDS;
    private JPanel EDT = new JPanel(new GridLayout(2, 1));
    private JPanel EDU = new JPanel(new GridLayout(1, 1));
    private JTree EDV;
    private DefaultMutableTreeNode EDW;
    private JScrollPane EDX = new JScrollPane();
    private JTaskPane EDY = new JTaskPane();
    private JTaskPaneGroup EDZ = new JTaskPaneGroup();
    private List<String> EEa = lcn.emv();
    private List<lil> EEb = lcn.emv();
    private JPanel EEc = new JPanel(new GridLayout(2, 1));
    private mpj EEd;
    private JPanel EEe = new JPanel(new GridLayout(2, 1));
    private JPanel EEf = new JPanel(new GridLayout(1, 1));
    private JTree EEg;
    private DefaultMutableTreeNode EEh;
    private JScrollPane EEi = new JScrollPane();
    private JTaskPane EEj = new JTaskPane();
    private JTaskPaneGroup EEk = new JTaskPaneGroup();
    private List<String> EEl = lcn.emv();
    private Cursor EEm = new Cursor(0);
    private Cursor EEn = new Cursor(3);
    private jyp EEo = new jyp();
    private jwz EEp = new jwz();

    public void p(aux aux2) {
        this.DEC = aux2;
        this.DEC.getAlignmentY();
    }

    public mtv() {
        super(false);
        try {
            this.setTitle("Loot & Skinning Drop Tables");
            this.setPreferredSize(this.EDK);
            this.setSize(this.EDK);
            this.setDefaultCloseOperation(2);
            this.setClosable(true);
            this.setResizable(true);
            this.setIconifiable(true);
            this.setMaximizable(true);
            this.setLayout(new GridLayout());
            this.ePh();
            this.r();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.exit(1);
        }
    }

    private void ePh() {
        this.EDS = new mpj();
        this.EDS.eIu().getFileChooser().setCurrentDirectory(new jrw(this.EDL));
        this.EDS.b(new KeyAdapter(this){
            final /* synthetic */ mtv EEq;
            {
                this.EEq = mtv2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 10) {
                    mtv.a(this.EEq, mtv.a(this.EEq), mtv.a(this.EEq).eIv(), mtv.a(this.EEq).eDc().getName());
                }
            }
        });
        this.EDS.b(new MouseAdapter(this){
            final /* synthetic */ mtv EEq;
            {
                this.EEq = mtv2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == 1 && mouseEvent.getClickCount() == 2) {
                    mtv.a(this.EEq, mtv.a(this.EEq), mtv.a(this.EEq).eIv(), mtv.a(this.EEq).eDc().getName());
                }
            }
        });
        this.EDS.afg(2000);
        this.EDR.add(this.EDS);
        this.EDR.add(this.EDT);
        this.ePi();
        this.EDT.add(this.EDU);
        this.EDT.add(this.EDX);
        this.EDT.setBorder(BorderFactory.createTitledBorder(""));
        this.EDX.getViewport().add((Component)this.EDY);
        this.EDY.add(this.EDZ);
        this.EDZ.setTitle("Items In List");
        this.EEd = new mpj();
        this.EEd.eIu().getFileChooser().setCurrentDirectory(new jrw(this.EDM));
        this.EEd.b(new KeyAdapter(this){
            final /* synthetic */ mtv EEq;
            {
                this.EEq = mtv2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 10) {
                    mtv.a(this.EEq, mtv.b(this.EEq), mtv.b(this.EEq).eIv(), mtv.b(this.EEq).eDc().getName());
                }
            }
        });
        this.EEd.b(new MouseAdapter(this){
            final /* synthetic */ mtv EEq;
            {
                this.EEq = mtv2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == 1 && mouseEvent.getClickCount() == 2) {
                    mtv.a(this.EEq, mtv.b(this.EEq), mtv.b(this.EEq).eIv(), mtv.b(this.EEq).eDc().getName());
                }
            }
        });
        this.EEc.add(this.EEd);
        this.EEc.add(this.EEd);
        this.EEc.add(this.EEe);
        this.ePk();
        this.EEe.add(this.EEf);
        this.EEe.add(this.EEi);
        this.EEe.setBorder(BorderFactory.createTitledBorder(""));
        this.EEi.getViewport().add((Component)this.EEj);
        this.EEj.add(this.EEk);
        this.EEk.setTitle("Items In List");
        this.EDN.add(this.EDR);
        this.EDN.add(this.EEc);
    }

    private void a(mpj mpj2, JList jList, Object object) {
        if (mpj2 == this.EDS) {
            String string = mpj2.getCurrentDirectory() + "/" + object.toString();
            this.aQ(string, "SFLootInventory");
            return;
        }
        if (mpj2 == this.EEd) {
            String string = mpj2.getCurrentDirectory() + "/" + object.toString();
            this.aQ(string, "SFSkinningInventory");
            return;
        }
    }

    private void ePi() {
        JScrollPane jScrollPane = new JScrollPane();
        this.ePj();
        jScrollPane.getViewport().add(this.EDV);
        this.EDV.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mtv EEq;
            {
                this.EEq = mtv2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                DefaultMutableTreeNode defaultMutableTreeNode;
                int[] nArray;
                if (mouseEvent.getButton() == 1 && mouseEvent.getClickCount() == 2 && (nArray = mtv.c(this.EEq).getSelectionRows()) != null && (defaultMutableTreeNode = (DefaultMutableTreeNode)mtv.c(this.EEq).getLastSelectedPathComponent()).isLeaf()) {
                    String string = defaultMutableTreeNode.toString();
                    mtv.a(this.EEq, string, 1, 100);
                }
            }
        });
        this.EDU.add((Component)jScrollPane, "Center");
        this.EDU.setBorder(BorderFactory.createTitledBorder(""));
    }

    private void ePj() {
        this.EDW = new DefaultMutableTreeNode("Loot Items");
        les les2 = lea.enW();
        ler ler2 = les2.eqq();
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            this.g(this.EDW, les2, ler3);
            ler3 = les2.h(ler3);
        }
    }

    private void g(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
        int n = cug.fkd;
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            boolean bl = les2.isDescendant(ler3.getType(), n);
            if (bl) {
                DefaultMutableTreeNode defaultMutableTreeNode2;
                if (les2.g(ler3) == null) {
                    defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                    defaultMutableTreeNode.add(defaultMutableTreeNode2);
                } else {
                    defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                    defaultMutableTreeNode.add(defaultMutableTreeNode2);
                    this.g(defaultMutableTreeNode2, les2, ler3);
                }
            }
            ler3 = les2.h(ler3);
        }
        this.EDV = new JTree(defaultMutableTreeNode);
        this.EDV.getSelectionModel().setSelectionMode(1);
    }

    private void w(String string, int n, int n2) {
        if (this.EEa.contains(string)) {
            return;
        }
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.setOpaque(false);
        JPanel jPanel2 = new JPanel(new GridLayout(1, 2));
        jPanel2.setOpaque(false);
        JPanel jPanel3 = new JPanel(new BorderLayout());
        jPanel3.setOpaque(false);
        JLabel jLabel = new JLabel(" Amount ");
        jLabel.setOpaque(false);
        JComboBox jComboBox = new JComboBox(this.EDO);
        jPanel3.add((Component)jLabel, "West");
        jPanel3.add(jComboBox, "Center");
        jComboBox.setSelectedItem(n);
        JPanel jPanel4 = new JPanel(new BorderLayout());
        jPanel4.setOpaque(false);
        JLabel jLabel2 = new JLabel(" Drop ");
        jLabel2.setOpaque(false);
        JComboBox jComboBox2 = new JComboBox(this.EDP);
        jPanel4.add((Component)jLabel2, "West");
        jPanel4.add(jComboBox2, "Center");
        jComboBox2.setSelectedItem(n2);
        jPanel2.add(jPanel3);
        jPanel2.add(jPanel4);
        JButton jButton = new JButton("Remove");
        jButton.addActionListener(new ActionListener(this, string, jPanel){
            final /* synthetic */ String EEr;
            final /* synthetic */ JPanel EEs;
            final /* synthetic */ mtv EEq;
            {
                this.EEq = mtv2;
                this.EEr = string;
                this.EEs = jPanel;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtv.d(this.EEq).remove(this.EEr);
                mtv.e(this.EEq).remove((Component)this.EEs);
                mtv.e(this.EEq).revalidate();
                for (int i = 0; i < mtv.f(this.EEq).size(); ++i) {
                    lil lil2 = (lil)mtv.f(this.EEq).get(i);
                    JTextField jTextField = (JTextField)lil2.getFirst();
                    String string = jTextField.getText();
                    if (!string.toLowerCase().equals(this.EEr.toLowerCase())) continue;
                    mtv.f(this.EEq).remove(i);
                    break;
                }
            }
        });
        JPanel jPanel5 = new JPanel(new BorderLayout());
        jPanel5.setOpaque(false);
        jPanel5.add((Component)jPanel2, "Center");
        jPanel5.add((Component)jButton, "East");
        JPanel jPanel6 = new JPanel(new GridLayout(1, 1));
        jPanel6.setOpaque(false);
        JPanel jPanel7 = new JPanel(new BorderLayout());
        jPanel7.setOpaque(false);
        JTextField jTextField = new JTextField();
        jTextField.setOpaque(false);
        jTextField.setText(string);
        jPanel7.add((Component)jTextField, "Center");
        jPanel6.add(jPanel7);
        jPanel.add((Component)jPanel6, "Center");
        jPanel.add((Component)jPanel5, "East");
        this.EDZ.add((Component)jPanel);
        this.EDZ.revalidate();
        this.EDZ.repaint();
        this.EEa.add(string);
        this.EDQ.add(new lil(jTextField, jComboBox, jComboBox2));
    }

    private void ePk() {
        JScrollPane jScrollPane = new JScrollPane();
        this.ePl();
        jScrollPane.getViewport().add(this.EEg);
        this.EEg.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mtv EEq;
            {
                this.EEq = mtv2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                DefaultMutableTreeNode defaultMutableTreeNode;
                int[] nArray;
                if (mouseEvent.getButton() == 1 && mouseEvent.getClickCount() == 2 && (nArray = mtv.g(this.EEq).getSelectionRows()) != null && (defaultMutableTreeNode = (DefaultMutableTreeNode)mtv.g(this.EEq).getLastSelectedPathComponent()).isLeaf()) {
                    String string = defaultMutableTreeNode.toString();
                    mtv.b(this.EEq, string, 1, 100);
                }
            }
        });
        this.EEf.add((Component)jScrollPane, "Center");
        this.EEf.setBorder(BorderFactory.createTitledBorder(""));
    }

    private void ePl() {
        this.EEh = new DefaultMutableTreeNode("Skinning Items");
        les les2 = lea.enW();
        ler ler2 = les2.eqq();
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            this.h(this.EEh, les2, ler3);
            ler3 = les2.h(ler3);
        }
    }

    private void h(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
        int n = cug.fkd;
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            boolean bl = les2.isDescendant(ler3.getType(), n);
            if (bl) {
                DefaultMutableTreeNode defaultMutableTreeNode2;
                if (les2.g(ler3) == null) {
                    defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                    defaultMutableTreeNode.add(defaultMutableTreeNode2);
                } else {
                    defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                    defaultMutableTreeNode.add(defaultMutableTreeNode2);
                    this.h(defaultMutableTreeNode2, les2, ler3);
                }
            }
            ler3 = les2.h(ler3);
        }
        this.EEg = new JTree(defaultMutableTreeNode);
        this.EEg.getSelectionModel().setSelectionMode(1);
    }

    private void x(String string, int n, int n2) {
        if (this.EEl.contains(string)) {
            return;
        }
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.setOpaque(false);
        JPanel jPanel2 = new JPanel(new GridLayout(1, 2));
        jPanel2.setOpaque(false);
        JPanel jPanel3 = new JPanel(new BorderLayout());
        jPanel3.setOpaque(false);
        JLabel jLabel = new JLabel(" Amount ");
        JComboBox jComboBox = new JComboBox(this.EDO);
        jPanel3.add((Component)jLabel, "West");
        jPanel3.add(jComboBox, "Center");
        jComboBox.setSelectedItem(n);
        JPanel jPanel4 = new JPanel(new BorderLayout());
        jPanel4.setOpaque(false);
        JLabel jLabel2 = new JLabel(" Drop ");
        JComboBox jComboBox2 = new JComboBox(this.EDP);
        jPanel4.add((Component)jLabel2, "West");
        jPanel4.add(jComboBox2, "Center");
        jComboBox2.setSelectedItem(n2);
        jPanel2.add(jPanel3);
        jPanel2.add(jPanel4);
        JButton jButton = new JButton("Remove");
        jButton.addActionListener(new ActionListener(this, string, jPanel){
            final /* synthetic */ String EEr;
            final /* synthetic */ JPanel EEt;
            final /* synthetic */ mtv EEq;
            {
                this.EEq = mtv2;
                this.EEr = string;
                this.EEt = jPanel;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtv.h(this.EEq).remove(this.EEr);
                mtv.i(this.EEq).remove((Component)this.EEt);
                mtv.i(this.EEq).revalidate();
                for (int i = 0; i < mtv.j(this.EEq).size(); ++i) {
                    lil lil2 = (lil)mtv.j(this.EEq).get(i);
                    JTextField jTextField = (JTextField)lil2.getFirst();
                    String string = jTextField.getText();
                    if (!string.toLowerCase().equals(this.EEr.toLowerCase())) continue;
                    mtv.j(this.EEq).remove(i);
                    break;
                }
            }
        });
        JPanel jPanel5 = new JPanel(new BorderLayout());
        jPanel5.setOpaque(false);
        jPanel5.add((Component)jPanel2, "Center");
        jPanel5.add((Component)jButton, "East");
        JPanel jPanel6 = new JPanel(new GridLayout(1, 1));
        jPanel6.setOpaque(false);
        JPanel jPanel7 = new JPanel(new BorderLayout());
        jPanel7.setOpaque(false);
        JTextField jTextField = new JTextField();
        jTextField.setEditable(false);
        jTextField.setText(string);
        jPanel7.add((Component)jTextField, "Center");
        jPanel6.add(jPanel7);
        jPanel.add((Component)jPanel6, "Center");
        jPanel.add((Component)jPanel5, "East");
        this.EEk.add((Component)jPanel);
        this.EEk.revalidate();
        this.EEk.repaint();
        this.EEl.add(string);
        this.EEb.add(new lil(jTextField, jComboBox, jComboBox2));
    }

    private void r() {
        for (int i = 0; i < 1000; ++i) {
            this.EDO.add(new Integer(i));
            if (i > 100) continue;
            this.EDP.add(new Integer(i));
        }
        this.EDS.eIu().zJ(false);
        this.EDS.eIu().CI("Loot Drop Tables");
        this.EDS.eIu().g(new ActionListener(this){
            final /* synthetic */ mtv EEq;
            {
                this.EEq = mtv2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtv.a(this.EEq, JOptionPane.showInputDialog(mtv.a(this.EEq), (Object)"SFFile Name"), "SFLootInventory");
            }
        });
        this.EDS.eIu().f(new ActionListener(this){
            final /* synthetic */ mtv EEq;
            {
                this.EEq = mtv2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                int n;
                String string = mtv.a(this.EEq).eDc().getName();
                if (mtv.a(this.EEq).eDc().exists() && (n = JOptionPane.showConfirmDialog(mtv.a(this.EEq), "Overriding SFFile ? " + string)) == 0 && mtv.a(this.EEq).eDc() != null) {
                    mtv.a(this.EEq, string, "SFLootInventory");
                }
            }
        });
        this.EEd.eIu().zJ(false);
        this.EEd.eIu().CI("Skinning Drop Table");
        this.EEd.eIu().g(new ActionListener(this){
            final /* synthetic */ mtv EEq;
            {
                this.EEq = mtv2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtv.a(this.EEq, JOptionPane.showInputDialog(mtv.b(this.EEq), (Object)"SFFile Name"), "SFSkinningInventory");
            }
        });
        this.EEd.eIu().f(new ActionListener(this){
            final /* synthetic */ mtv EEq;
            {
                this.EEq = mtv2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                int n;
                String string = mtv.b(this.EEq).eDc().getName();
                if (mtv.b(this.EEq).eDc().exists() && (n = JOptionPane.showConfirmDialog(mtv.b(this.EEq), "Overriding SFFile ? " + mtv.b(this.EEq).eDc().getName())) == 0 && mtv.b(this.EEq).eDc() != null) {
                    mtv.a(this.EEq, string, "SFSkinningInventory");
                }
            }
        });
        this.DGa.add(this.EDN);
    }

    private void aP(String string, String string2) {
        if (string == null || string.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Give A SFFile Name");
            return;
        }
        ArrayList<lil> arrayList = lcn.emv();
        if (string2.equals("SFLootInventory")) {
            string = this.EDS.getCurrentDirectory() + "/" + string;
            this.setCursor(this.EEn);
            for (int i = 0; i < this.EDQ.size(); ++i) {
                lil lil2 = this.EDQ.get(i);
                String string3 = ((JTextField)lil2.getFirst()).getText();
                int n = (Integer)((JComboBox)lil2.eqz()).getSelectedItem();
                int n2 = (Integer)((JComboBox)lil2.esw()).getSelectedItem();
                arrayList.add(new lil<String, Integer, Integer>(string3, new Integer(n), new Integer(n2)));
            }
            this.EEo.a(string, string2, arrayList);
            this.setCursor(this.EEm);
            return;
        }
        if (string2.equals("SFSkinningInventory")) {
            string = this.EEd.getCurrentDirectory() + "/" + string;
            this.setCursor(this.EEn);
            for (int i = 0; i < this.EEb.size(); ++i) {
                lil lil3 = this.EEb.get(i);
                String string4 = ((JTextField)lil3.getFirst()).getText();
                int n = (Integer)((JComboBox)lil3.eqz()).getSelectedItem();
                int n3 = (Integer)((JComboBox)lil3.esw()).getSelectedItem();
                arrayList.add(new lil<String, Integer, Integer>(string4, new Integer(n), new Integer(n3)));
            }
            this.EEo.a(string, string2, arrayList);
            this.setCursor(this.EEm);
            return;
        }
    }

    public void aQ(String string, String string2) {
        Vector vector = this.EEp.ai(string, string2);
        if (vector == null) {
            return;
        }
        if (string2.equals("SFLootInventory")) {
            this.EDZ.removeAll();
            this.EEa.clear();
            this.EDQ.clear();
            for (int i = 0; i < vector.size(); ++i) {
                lil lil2 = (lil)vector.get(i);
                String string3 = (String)lil2.getFirst();
                int n = (Integer)lil2.eqz();
                int n2 = (Integer)lil2.esw();
                this.w(string3, n, n2);
            }
            return;
        }
        this.EEk.removeAll();
        this.EEl.clear();
        this.EEb.clear();
        for (int i = 0; i < vector.size(); ++i) {
            lil lil3 = (lil)vector.get(i);
            String string4 = (String)lil3.getFirst();
            int n = (Integer)lil3.eqz();
            int n3 = (Integer)lil3.esw();
            this.x(string4, n, n3);
        }
    }

    static /* synthetic */ mpj a(mtv mtv2) {
        return mtv2.EDS;
    }

    static /* synthetic */ void a(mtv mtv2, mpj mpj2, JList jList, Object object) {
        mtv2.a(mpj2, jList, object);
    }

    static /* synthetic */ mpj b(mtv mtv2) {
        return mtv2.EEd;
    }

    static /* synthetic */ JTree c(mtv mtv2) {
        return mtv2.EDV;
    }

    static /* synthetic */ void a(mtv mtv2, String string, int n, int n2) {
        mtv2.w(string, n, n2);
    }

    static /* synthetic */ List d(mtv mtv2) {
        return mtv2.EEa;
    }

    static /* synthetic */ JTaskPaneGroup e(mtv mtv2) {
        return mtv2.EDZ;
    }

    static /* synthetic */ List f(mtv mtv2) {
        return mtv2.EDQ;
    }

    static /* synthetic */ JTree g(mtv mtv2) {
        return mtv2.EEg;
    }

    static /* synthetic */ void b(mtv mtv2, String string, int n, int n2) {
        mtv2.x(string, n, n2);
    }

    static /* synthetic */ List h(mtv mtv2) {
        return mtv2.EEl;
    }

    static /* synthetic */ JTaskPaneGroup i(mtv mtv2) {
        return mtv2.EEk;
    }

    static /* synthetic */ List j(mtv mtv2) {
        return mtv2.EEb;
    }

    static /* synthetic */ void a(mtv mtv2, String string, String string2) {
        mtv2.aP(string, string2);
    }
}

