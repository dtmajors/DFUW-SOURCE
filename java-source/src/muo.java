/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  com.l2fprod.common.swing.JTaskPane
 *  com.l2fprod.common.swing.JTaskPaneGroup
 *  lcw
 */
import com.l2fprod.common.swing.JTaskPane;
import com.l2fprod.common.swing.JTaskPaneGroup;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.w3c.dom.Document;

public class muo
extends mkx {
    private aux DEC = null;
    protected static final String pEh = lcw.qLb + "/" + "xml-files/server/vendor/";
    private JPanel Eiv = new JPanel(new BorderLayout());
    private JPanel EGP = new JPanel(new GridLayout());
    private JScrollPane EGQ = new JScrollPane();
    private JTaskPane EGR = new JTaskPane();
    private JTaskPaneGroup EGS = new JTaskPaneGroup();
    private JPanel EGT = new JPanel(new FlowLayout());
    private JButton DWx = new JButton("Save Template");
    private JButton f = new JButton("Add Resource");
    private JButton qtg = new JButton("Cancel");
    private JScrollPane EGU = new JScrollPane();
    private JTree EGV;
    private DefaultTreeModel EGW;
    private DefaultMutableTreeNode EoC;
    private les aqN = lea.enZ();
    private ler qro = this.aqN.eqq();
    private muw.b EGX;
    private String EGY = "";
    List<muy> EGZ = lcn.emv();
    mur EHa = new mur();
    muq EHb = new muq();
    private JMenuBar EHc = new JMenuBar();
    private JMenu EHd = new JMenu("SFFile");
    private JMenuItem EHe = new JMenuItem("Load Template");
    private ActionListener EHf;
    private String EHg = "";

    public muo(String string, muw.b b2) {
        super(false);
        this.setClosable(true);
        this.setMaximizable(false);
        this.setResizable(false);
        this.setTitle(string);
        this.setSize(500, 300);
        this.setVisible(true);
        this.EGY = string;
        this.EGX = b2;
        this.eU();
        this.r();
    }

    public muo(String string, muw.b b2, jrw jrw2) {
        super(false);
        this.setClosable(true);
        this.setMaximizable(false);
        this.setResizable(false);
        this.setTitle(string);
        this.setSize(500, 300);
        this.setVisible(true);
        this.EGY = string;
        this.EGX = b2;
        this.eU();
        this.r();
        this.T(jrw2);
        this.EHg = jrw2.getName();
    }

    private void eU() {
        this.EGS.setTitle("Template Details");
        this.EGQ.getViewport().add((Component)this.EGR);
        this.EGR.add(this.EGS);
    }

    private void Dy(String string) {
        if (!this.Dz(string)) {
            JPanel jPanel = new JPanel(new BorderLayout());
            jPanel.setOpaque(false);
            JPanel jPanel2 = new JPanel(new BorderLayout());
            jPanel2.setOpaque(false);
            JLabel jLabel = new JLabel("Resource ");
            jLabel.setOpaque(false);
            JTextField jTextField = new JTextField(string);
            jTextField.setEditable(false);
            jPanel2.add((Component)jLabel, "West");
            jPanel2.add((Component)jTextField, "Center");
            JPanel jPanel3 = new JPanel(new GridLayout());
            jPanel3.setOpaque(false);
            Vector<String> vector = new Vector<String>();
            JPanel jPanel4 = new JPanel(new BorderLayout());
            jPanel4.setOpaque(false);
            JPanel jPanel5 = new JPanel(new BorderLayout());
            jPanel5.setOpaque(false);
            JLabel jLabel2 = new JLabel(" Target ");
            jLabel2.setOpaque(false);
            vector.add("Player");
            vector.add("Item");
            JComboBox jComboBox = new JComboBox(vector);
            jComboBox.setSelectedIndex(0);
            jComboBox.setEditable(false);
            jPanel5.add((Component)jLabel2, "West");
            jPanel5.add(jComboBox, "Center");
            JPanel jPanel6 = new JPanel(new BorderLayout());
            jPanel6.setOpaque(false);
            JLabel jLabel3 = new JLabel(" Cost ");
            jLabel3.setOpaque(false);
            JTextField jTextField2 = new JTextField();
            jTextField2.setEditable(false);
            jTextField2.addKeyListener(new KeyListener(this, jTextField2){
                final /* synthetic */ JTextField EHh;
                final /* synthetic */ muo EHi;
                {
                    this.EHi = muo2;
                    this.EHh = jTextField;
                }

                public void keyReleased(KeyEvent keyEvent) {
                    String string = this.EHh.getText();
                    this.EHi.a(string, this.EHh);
                }

                public void keyPressed(KeyEvent keyEvent) {
                }

                public void keyTyped(KeyEvent keyEvent) {
                }
            });
            JCheckBox jCheckBox = new JCheckBox();
            jCheckBox.setOpaque(false);
            jCheckBox.addChangeListener(new ChangeListener(this, jCheckBox, jTextField2){
                final /* synthetic */ JCheckBox EHk;
                final /* synthetic */ JTextField EHh;
                final /* synthetic */ muo EHi;
                {
                    this.EHi = muo2;
                    this.EHk = jCheckBox;
                    this.EHh = jTextField;
                }

                public void stateChanged(ChangeEvent changeEvent) {
                    if (this.EHk.isSelected()) {
                        this.EHh.setEditable(true);
                    } else {
                        this.EHh.setEditable(false);
                    }
                }
            });
            jPanel6.add((Component)jLabel3, "West");
            jPanel6.add((Component)jTextField2, "Center");
            jPanel6.add((Component)jCheckBox, "East");
            JButton jButton = new JButton("Remove");
            jButton.addActionListener(new ActionListener(this, jTextField, jPanel){
                final /* synthetic */ JTextField EHl;
                final /* synthetic */ JPanel EHm;
                final /* synthetic */ muo EHi;
                {
                    this.EHi = muo2;
                    this.EHl = jTextField;
                    this.EHm = jPanel;
                }

                public void actionPerformed(ActionEvent actionEvent) {
                    for (int i = 0; i < this.EHi.EGZ.size(); ++i) {
                        muy muy2 = this.EHi.EGZ.get(i);
                        if (muy2.EJh != this.EHl) continue;
                        if (this.EHi.EGZ.remove(i) == null) break;
                        break;
                    }
                    muo.a(this.EHi).remove((Component)this.EHm);
                    muo.a(this.EHi).revalidate();
                }
            });
            jPanel3.add(jPanel5);
            jPanel3.add(jPanel6);
            jPanel4.add((Component)jPanel3, "Center");
            jPanel4.add((Component)jButton, "East");
            jPanel.add((Component)jPanel2, "Center");
            jPanel.add((Component)jPanel4, "East");
            this.EGS.add((Component)jPanel);
            this.EGS.revalidate();
            muy muy2 = new muy();
            muy2.EJh = jTextField;
            muy2.EJi = jComboBox;
            muy2.EJj = jTextField2;
            this.EGZ.add(muy2);
        }
    }

    void a(String string, JTextField jTextField) {
        block2: {
            try {
                int n = Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                if (string.length() <= 0) break block2;
                string = string.substring(0, string.length() - 1);
                jTextField.setText(string);
                this.a(string, jTextField);
            }
        }
    }

    private boolean Dz(String string) {
        for (int i = 0; i < this.EGZ.size(); ++i) {
            muy muy2 = this.EGZ.get(i);
            if (!muy2.EJh.getText().equals(string)) continue;
            return true;
        }
        return false;
    }

    private void ePO() {
        this.EHd.add(this.EHe);
        this.EHe.addActionListener(new a(this));
        this.EHc.add(this.EHd);
    }

    private void T(jrw jrw2) {
        this.EGS.removeAll();
        this.EGZ.clear();
        List list = lcn.emv();
        list = this.EHb.U(jrw2);
        for (int i = 0; i < list.size(); ++i) {
            String string = "";
            List list2 = (List)list.get(i);
            String string2 = list2.get(0).toString();
            String string3 = list2.get(1).toString();
            if (list2.size() > 2) {
                string = list2.get(2).toString();
            }
            this.F(string2, string3, string);
        }
    }

    private void F(String string, String string2, String string3) {
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.setOpaque(false);
        JPanel jPanel2 = new JPanel(new BorderLayout());
        jPanel2.setOpaque(false);
        JLabel jLabel = new JLabel("Resource ");
        jLabel.setOpaque(false);
        JTextField jTextField = new JTextField(string);
        jTextField.setEditable(false);
        jPanel2.add((Component)jLabel, "West");
        jPanel2.add((Component)jTextField, "Center");
        JPanel jPanel3 = new JPanel(new GridLayout());
        jPanel3.setOpaque(false);
        Vector<String> vector = new Vector<String>();
        JPanel jPanel4 = new JPanel(new BorderLayout());
        jPanel4.setOpaque(false);
        JPanel jPanel5 = new JPanel(new BorderLayout());
        jPanel5.setOpaque(false);
        JLabel jLabel2 = new JLabel(" Target ");
        jLabel2.setOpaque(false);
        vector.add("Player");
        vector.add("Item");
        JComboBox jComboBox = new JComboBox(vector);
        jComboBox.setSelectedItem(string2);
        jComboBox.setEditable(false);
        jPanel5.add((Component)jLabel2, "West");
        jPanel5.add(jComboBox, "Center");
        JPanel jPanel6 = new JPanel(new BorderLayout());
        jPanel6.setOpaque(false);
        JLabel jLabel3 = new JLabel(" Cost ");
        jLabel3.setOpaque(false);
        JTextField jTextField2 = new JTextField(string3);
        jTextField2.setEditable(false);
        jTextField2.addKeyListener(new KeyListener(this, jTextField2){
            final /* synthetic */ JTextField EHh;
            final /* synthetic */ muo EHi;
            {
                this.EHi = muo2;
                this.EHh = jTextField;
            }

            public void keyReleased(KeyEvent keyEvent) {
                String string = this.EHh.getText();
                this.EHi.a(string, this.EHh);
            }

            public void keyPressed(KeyEvent keyEvent) {
            }

            public void keyTyped(KeyEvent keyEvent) {
            }
        });
        JCheckBox jCheckBox = new JCheckBox();
        jCheckBox.setOpaque(false);
        jCheckBox.addChangeListener(new ChangeListener(this, jCheckBox, jTextField2){
            final /* synthetic */ JCheckBox EHk;
            final /* synthetic */ JTextField EHh;
            final /* synthetic */ muo EHi;
            {
                this.EHi = muo2;
                this.EHk = jCheckBox;
                this.EHh = jTextField;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                if (this.EHk.isSelected()) {
                    this.EHh.setEditable(true);
                } else {
                    this.EHh.setEditable(false);
                }
            }
        });
        jPanel6.add((Component)jLabel3, "West");
        jPanel6.add((Component)jTextField2, "Center");
        jPanel6.add((Component)jCheckBox, "East");
        JButton jButton = new JButton("Remove");
        jButton.addActionListener(new ActionListener(this, jTextField, jPanel){
            final /* synthetic */ JTextField EHl;
            final /* synthetic */ JPanel EHm;
            final /* synthetic */ muo EHi;
            {
                this.EHi = muo2;
                this.EHl = jTextField;
                this.EHm = jPanel;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                for (int i = 0; i < this.EHi.EGZ.size(); ++i) {
                    muy muy2 = this.EHi.EGZ.get(i);
                    if (muy2.EJh != this.EHl) continue;
                    this.EHi.EGZ.remove(i);
                    break;
                }
                muo.a(this.EHi).remove((Component)this.EHm);
                muo.a(this.EHi).revalidate();
            }
        });
        jPanel3.add(jPanel5);
        jPanel3.add(jPanel6);
        jPanel4.add((Component)jPanel3, "Center");
        jPanel4.add((Component)jButton, "East");
        jPanel.add((Component)jPanel2, "Center");
        jPanel.add((Component)jPanel4, "East");
        this.EGS.add((Component)jPanel);
        this.EGS.revalidate();
        muy muy2 = new muy();
        muy2.EJh = jTextField;
        muy2.EJi = jComboBox;
        muy2.EJj = jTextField2;
        this.EGZ.add(muy2);
    }

    private void r() {
        this.ePO();
        this.setJMenuBar(this.EHc);
        this.Eiv.add((Component)this.EGP, "Center");
        this.Eiv.add((Component)this.EGT, "South");
        this.EGP.add(this.EGQ);
        this.EGT.add(this.DWx);
        this.DWx.addActionListener(new ActionListener(this){
            final /* synthetic */ muo EHi;
            {
                this.EHi = muo2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                muo.a(this.EHi, muo.c(this.EHi));
            }
        });
        this.EGT.add(this.f);
        this.f.addActionListener(new ActionListener(this){
            final /* synthetic */ muo EHi;
            {
                this.EHi = muo2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                muo.e(this.EHi);
            }
        });
        this.EGT.add(this.qtg);
        this.qtg.addActionListener(new ActionListener(this){
            final /* synthetic */ muo EHi;
            {
                this.EHi = muo2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                muo.f(this.EHi);
            }
        });
        this.DGa.add(this.Eiv);
    }

    private void ePP() {
        this.dispose();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    private void a(muw.b b2) {
        String string = JOptionPane.showInputDialog(this, "Template Name", this.EHg);
        if (string != null && !string.equals("")) {
            Object object;
            XStream xStream = new XStream(new DomDriver());
            xStream.setClassLoader(r.cr);
            Annotations.configureAliases(xStream, muu.class);
            muu[] muuArray = new muu[this.EGZ.size()];
            int n = 0;
            for (muy object22 : this.EGZ) {
                object = new muu();
                ((muu)object).SkillName = object22.EJh.getText();
                muuArray[n] = object;
                ++n;
            }
            String string2 = lcw.qLb + "/" + "xml-files/server/vendor/";
            String string3 = xStream.toXML(muuArray);
            object = jsy.tL(string3);
            switch (b2) {
                case EJd: {
                    jsz.a((Document)object, new jrw((String)string2 + "trainingtemplates/" + string));
                }
            }
        }
    }

    private void ePQ() {
        JDialog jDialog = new JDialog();
        jDialog.setTitle(this.title);
        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel(new FlowLayout());
        JButton jButton = new JButton("Add Resource");
        JButton jButton2 = new JButton("Close");
        jButton2.addActionListener(new ActionListener(this, jDialog){
            final /* synthetic */ JDialog EtI;
            final /* synthetic */ muo EHi;
            {
                this.EHi = muo2;
                this.EtI = jDialog;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EtI.dispose();
            }
        });
        jPanel2.add(jButton);
        jPanel2.add(jButton2);
        JScrollPane jScrollPane = new JScrollPane();
        this.ePR();
        jScrollPane.getViewport().add(this.EGV);
        jButton.addActionListener(new ActionListener(this){
            final /* synthetic */ muo EHi;
            {
                this.EHi = muo2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                int[] nArray;
                if (!muo.g(this.EHi).isSelectionEmpty() && (nArray = muo.g(this.EHi).getSelectionRows()) != null) {
                    DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)muo.g(this.EHi).getLastSelectedPathComponent();
                    System.out.println("Selected Node :" + defaultMutableTreeNode.getUserObject());
                    muo.b(this.EHi, defaultMutableTreeNode.getUserObject().toString());
                }
            }
        });
        jPanel.add((Component)jScrollPane, "Center");
        jPanel.add((Component)jPanel2, "South");
        jDialog.add(jPanel);
        jDialog.setModal(true);
        jDialog.setSize(250, 500);
        jDialog.setLocation(this.DEC.eCu().getWidth() / 2 - jDialog.getWidth() / 2, this.DEC.eCu().getHeight() / 2 - jDialog.getHeight() / 2);
        jDialog.setVisible(true);
        this.EGV.revalidate();
    }

    private void ePR() {
        this.EoC = new DefaultMutableTreeNode(this.EGY);
        les les2 = lea.enW();
        ler ler2 = les2.eqq();
        switch (this.EGX) {
            case EJd: {
                this.a(this.EoC, this.qro, this.aqN);
            }
        }
    }

    private void a(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2, int n) {
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
                    this.a(defaultMutableTreeNode2, les2, ler3, n);
                }
            }
            ler3 = les2.h(ler3);
        }
        this.EGV = new JTree(defaultMutableTreeNode);
        this.EGV.getSelectionModel().setSelectionMode(1);
    }

    private void a(DefaultMutableTreeNode defaultMutableTreeNode, ler ler2, les les2) {
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            DefaultMutableTreeNode defaultMutableTreeNode2;
            if (les2.g(ler3) == null) {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
            } else {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
                this.a(defaultMutableTreeNode2, ler3, les2);
            }
            ler3 = les2.h(ler3);
        }
        this.EGV = new JTree(defaultMutableTreeNode);
        this.EGV.getSelectionModel().setSelectionMode(1);
    }

    static /* synthetic */ JTaskPaneGroup a(muo muo2) {
        return muo2.EGS;
    }

    static /* synthetic */ JMenuItem b(muo muo2) {
        return muo2.EHe;
    }

    static /* synthetic */ muw.b c(muo muo2) {
        return muo2.EGX;
    }

    static /* synthetic */ JPanel d(muo muo2) {
        return muo2.Eiv;
    }

    static /* synthetic */ String a(muo muo2, String string) {
        muo2.EHg = string;
        return muo2.EHg;
    }

    static /* synthetic */ void a(muo muo2, jrw jrw2) {
        muo2.T(jrw2);
    }

    static /* synthetic */ void a(muo muo2, muw.b b2) {
        muo2.a(b2);
    }

    static /* synthetic */ void e(muo muo2) {
        muo2.ePQ();
    }

    static /* synthetic */ void f(muo muo2) {
        muo2.ePP();
    }

    static /* synthetic */ JTree g(muo muo2) {
        return muo2.EGV;
    }

    static /* synthetic */ void b(muo muo2, String string) {
        muo2.Dy(string);
    }
}

