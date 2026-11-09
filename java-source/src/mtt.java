/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  com.l2fprod.common.swing.JTaskPane
 *  com.l2fprod.common.swing.JTaskPaneGroup
 *  cug
 */
import com.l2fprod.common.swing.JTaskPane;
import com.l2fprod.common.swing.JTaskPaneGroup;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;
import java.util.Vector;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class mtt
extends mkx {
    private aux DEC = null;
    private final Dimension DDN = new Dimension(650, 600);
    private int ECj = 0;
    private JScrollPane Eqj = new JScrollPane();
    private JTaskPane Eqk = new JTaskPane();
    private JTaskPaneGroup ECk = new JTaskPaneGroup();
    private Action ECl;
    private Action ECm;
    private JPanel Eqh = new JPanel(new BorderLayout());
    private JPanel ECn = new JPanel(new BorderLayout());
    private JPanel ECo = new JPanel(new FlowLayout());
    private JButton ECp = new JButton("Start");
    private static final String Ezb = "NONE";
    private JPanel ECq = new JPanel(new BorderLayout());
    private JPanel ECr = new JPanel(new BorderLayout());
    private JScrollPane ECs = new JScrollPane();
    private Vector<String> ECt = new Vector();
    private JList ECu = new JList<String>(this.ECt);
    private JPanel ECv = new JPanel(new BorderLayout());
    private JScrollPane ECw = new JScrollPane();
    private JTaskPane ECx = new JTaskPane();
    private JTaskPaneGroup ECy = new JTaskPaneGroup();
    private JPanel ECz = new JPanel(new FlowLayout());
    private JButton ECA = new JButton("Add");
    private JButton ECB = new JButton("Remove");
    private JPanel ECC = new JPanel(new FlowLayout());
    private JButton ECD = new JButton("Save Land Vehicle SFFile");
    private JButton ECE = new JButton("<--");
    private JPanel ECF = new JPanel(new BorderLayout());
    private JPanel ECG = new JPanel(new BorderLayout());
    private JScrollPane ECH = new JScrollPane();
    private Vector<String> ECI = new Vector();
    private JList ECJ = new JList<String>(this.ECI);
    private JPanel ECK = new JPanel(new BorderLayout());
    private JScrollPane ECL = new JScrollPane();
    private JTaskPane ECM = new JTaskPane();
    private JTaskPaneGroup ECN = new JTaskPaneGroup();
    private Map gmH = lea.eoc();
    private Vector Eza = new Vector();
    private JPanel ECO = new JPanel(new BorderLayout());
    private JLabel ECP = new JLabel("Start Spawning Special Effect");
    private JComboBox ECQ = new JComboBox(this.Eza);
    private JPanel ECR = new JPanel(new BorderLayout());
    private JLabel ECS = new JLabel("Damage Special Effect");
    private JComboBox ECT = new JComboBox(this.Eza);
    private JPanel ECU = new JPanel(new BorderLayout());
    private JLabel ECV = new JLabel("Kill Special Effect");
    private JComboBox ECW = new JComboBox(this.Eza);
    private JPanel ECX = new JPanel(new BorderLayout());
    private JLabel ECY = new JLabel("Unspawn Special Effect");
    private JComboBox ECZ = new JComboBox(this.Eza);
    private JPanel EDa = new JPanel(new FlowLayout());
    private JButton EDb = new JButton("Add");
    private JButton EDc = new JButton("Remove");
    private JPanel EDd = new JPanel(new FlowLayout());
    private JButton EDe = new JButton("Save Water Vessel SFFile");
    private JButton EDf = new JButton("<--");
    private Map<Integer, amn> rha = lea.eoQ();
    private amn EDg = null;
    private JTree Eix;
    private DefaultMutableTreeNode EiD;
    private kbt EDh = new kbt();
    private boolean EDi = true;

    public mtt(boolean bl) {
        super(bl);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
        this.DEC.getAlignmentY();
    }

    public mtt() {
        super(false);
        this.setTitle("Vehicles Tool");
        this.setClosable(true);
        this.setSize(this.DDN);
        this.r();
    }

    private void r() {
        this.Eqj.getViewport().add((Component)this.Eqk);
        this.Eqk.add(this.ECk);
        this.ECk.setTitle("Vehicles Types");
        this.eOU();
        this.ECn.add((Component)this.Eqj, "Center");
        this.ECn.add((Component)this.ECo, "South");
        this.ECo.add(this.ECp);
        this.eOl();
        this.eOZ();
        this.ePa();
        this.Eqh.add((Component)this.ECn, "West");
        this.DGa.add(this.Eqh);
    }

    private void eOl() {
        for (Object k : this.gmH.keySet()) {
            String string;
            if (!(k instanceof String) || (string = (String)k).startsWith(Ezb)) continue;
            this.Eza.add(k);
        }
    }

    private void eOU() {
        this.ECu.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == 1) {
                    mtt.a(this.EDj);
                    mtt.b(this.EDj);
                }
            }
        });
        this.ECu.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 40 || keyEvent.getKeyCode() == 38) {
                    mtt.a(this.EDj);
                    mtt.b(this.EDj);
                }
            }
        });
        this.ECJ.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == 1) {
                    mtt.c(this.EDj);
                    mtt.d(this.EDj);
                }
            }
        });
        this.ECJ.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 40 || keyEvent.getKeyCode() == 38) {
                    mtt.c(this.EDj);
                    mtt.d(this.EDj);
                }
            }
        });
        this.ECl = new AbstractAction(this, "Create Water Vehicle"){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtt.a(this.EDj, 1);
                mtt.e(this.EDj).setEnabled(true);
            }
        };
        this.ECm = new AbstractAction(this, "Create Land Vehicle"){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtt.a(this.EDj, 2);
                mtt.e(this.EDj).setEnabled(true);
            }
        };
        this.ECk.add(this.ECl);
        this.ECk.add(this.ECm);
        this.ECp.addActionListener(new ActionListener(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                switch (mtt.f(this.EDj)) {
                    case 1: {
                        mtt.h(this.EDj).remove(mtt.g(this.EDj));
                        mtt.h(this.EDj).add((Component)mtt.i(this.EDj), "Center");
                        mtt.b(this.EDj, 1);
                        mtt.j(this.EDj).setVisible(false);
                        mtt.h(this.EDj).revalidate();
                        break;
                    }
                    case 2: {
                        mtt.h(this.EDj).remove(mtt.i(this.EDj));
                        mtt.h(this.EDj).add((Component)mtt.g(this.EDj), "Center");
                        mtt.b(this.EDj, 2);
                        mtt.j(this.EDj).setVisible(false);
                        mtt.h(this.EDj).revalidate();
                    }
                }
            }
        });
    }

    private void eOV() {
        if (this.EDg != null) {
            String string = (String)this.ECQ.getSelectedItem();
            this.EDg.cR(string);
            String string2 = (String)this.ECT.getSelectedItem();
            this.EDg.cP(string2);
            String string3 = (String)this.ECW.getSelectedItem();
            this.EDg.cQ(string3);
            String string4 = (String)this.ECZ.getSelectedItem();
            this.EDg.db(string4);
        }
    }

    private void eOW() {
        int n = this.ECJ.getSelectedIndex();
        if (n != -1) {
            String string = (String)this.ECJ.getSelectedValue();
            int n2 = lea.enW().getType(string);
            if (n2 != -1) {
                this.EDg = this.rha.get(new Integer(n2));
                String string2 = this.EDg.Ez();
                String string3 = this.EDg.Ex();
                String string4 = this.EDg.Ey();
                String string5 = this.EDg.EJ();
                this.Ah(true);
                this.ECQ.setSelectedItem(string2);
                this.ECT.setSelectedItem(string3);
                this.ECW.setSelectedItem(string4);
                this.ECZ.setSelectedItem(string5);
            }
        }
    }

    private void eOX() {
    }

    private void eOY() {
        int n = this.ECu.getSelectedIndex();
        if (n != -1) {
            String string = (String)this.ECu.getSelectedValue();
            int n2 = lea.enW().getType(string);
            if (n2 != -1) {
                // empty if block
            }
        }
    }

    private void afA(int n) {
        switch (n) {
            case 1: {
                this.ECI.removeAllElements();
                for (Integer n2 : this.rha.keySet()) {
                    String string = lea.enW().getName(n2);
                    if (this.ECI.contains(string) || string == null || string.trim().equals("")) continue;
                    this.ECI.add(string);
                }
                this.ECJ.setListData(this.ECI);
                this.ECJ.revalidate();
                if (this.ECI.size() != 0) break;
                this.Ah(false);
                break;
            }
            case 2: {
                this.ECt.removeAllElements();
            }
        }
    }

    private void Ah(boolean bl) {
        this.ECQ.setEnabled(bl);
        this.ECT.setEnabled(bl);
        this.ECW.setEnabled(bl);
        this.ECZ.setEnabled(bl);
    }

    private void eOZ() {
        Dimension dimension = new Dimension(180, 25);
        this.ECG.add((Component)this.ECH, "Center");
        this.ECG.add((Component)this.EDa, "South");
        this.ECH.getViewport().add(this.ECJ);
        this.ECG.setBorder(BorderFactory.createTitledBorder("Water Vehicles"));
        this.ECL.getViewport().add((Component)this.ECM);
        this.ECM.add(this.ECN);
        this.ECN.setTitle("Water Vehicle Attributes");
        this.ECN.add((Component)this.ECO);
        this.ECN.add((Component)this.ECR);
        this.ECN.add((Component)this.ECU);
        this.ECN.add((Component)this.ECX);
        this.ECO.add((Component)this.ECP, "West");
        this.ECO.setOpaque(false);
        this.ECO.add((Component)this.ECQ, "Center");
        this.ECP.setPreferredSize(dimension);
        this.ECP.setOpaque(false);
        this.ECQ.addItemListener(new ItemListener(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void itemStateChanged(ItemEvent itemEvent) {
                mtt.a(this.EDj, false);
            }
        });
        this.ECR.add((Component)this.ECS, "West");
        this.ECR.setOpaque(false);
        this.ECR.add((Component)this.ECT, "Center");
        this.ECS.setPreferredSize(dimension);
        this.ECS.setOpaque(false);
        this.ECT.addItemListener(new ItemListener(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void itemStateChanged(ItemEvent itemEvent) {
                mtt.a(this.EDj, false);
            }
        });
        this.ECU.add((Component)this.ECV, "West");
        this.ECU.setOpaque(false);
        this.ECU.add((Component)this.ECW, "Center");
        this.ECW.addItemListener(new ItemListener(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void itemStateChanged(ItemEvent itemEvent) {
                mtt.a(this.EDj, false);
            }
        });
        this.ECV.setPreferredSize(dimension);
        this.ECV.setOpaque(false);
        this.ECX.add((Component)this.ECY, "West");
        this.ECX.setOpaque(false);
        this.ECX.add((Component)this.ECZ, "Center");
        this.ECZ.addItemListener(new ItemListener(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void itemStateChanged(ItemEvent itemEvent) {
                mtt.a(this.EDj, false);
            }
        });
        this.ECY.setPreferredSize(dimension);
        this.ECY.setOpaque(false);
        this.EDa.add(this.EDb);
        this.EDb.addActionListener(new ActionListener(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtt.a(this.EDj, "Water Vessels", cug.fnO);
            }
        });
        this.EDa.add(this.EDc);
        this.EDc.addActionListener(new ActionListener(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtt.k(this.EDj);
            }
        });
        this.EDe.addActionListener(new ActionListener(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtt.c(this.EDj, 1);
                mtt.a(this.EDj, true);
            }
        });
        this.ECK.add((Component)this.ECL, "Center");
        this.ECK.setBorder(BorderFactory.createTitledBorder(""));
        this.ECK.add((Component)this.EDd, "South");
        this.ECF.add((Component)this.ECG, "West");
        this.ECF.add((Component)this.ECK, "Center");
        this.EDd.add(this.EDe);
        this.EDd.add(this.EDf);
        this.EDf.addActionListener(new ActionListener(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (!mtt.l(this.EDj)) {
                    int n = JOptionPane.showInternalConfirmDialog(mtt.h(this.EDj), "Do you want to Save Changes?");
                    if (n == 0) {
                        if (mtt.i(this.EDj).isVisible()) {
                            mtt.c(this.EDj, 1);
                        } else {
                            mtt.c(this.EDj, 2);
                        }
                        mtt.a(this.EDj, true);
                    }
                    if (n == 1) {
                        mtt.h(this.EDj).remove(mtt.i(this.EDj));
                        mtt.h(this.EDj).remove(mtt.g(this.EDj));
                        mtt.j(this.EDj).setVisible(true);
                        mtt.h(this.EDj).revalidate();
                        mtt.h(this.EDj).updateUI();
                    }
                    return;
                }
                mtt.h(this.EDj).remove(mtt.i(this.EDj));
                mtt.h(this.EDj).remove(mtt.g(this.EDj));
                mtt.j(this.EDj).setVisible(true);
                mtt.h(this.EDj).revalidate();
                mtt.h(this.EDj).updateUI();
            }
        });
    }

    private void afB(int n) {
        switch (n) {
            case 1: {
                this.ePc();
                break;
            }
            case 2: {
                this.ePe();
            }
        }
    }

    private void ePa() {
        this.ECr.add((Component)this.ECs, "West");
        this.ECr.add((Component)this.ECz, "South");
        this.ECs.getViewport().add(this.ECu);
        this.ECr.setBorder(BorderFactory.createTitledBorder("Land Vehicles"));
        this.ECw.getViewport().add((Component)this.ECx);
        this.ECx.add(this.ECy);
        this.ECy.setTitle("Land Vehicle Attributes");
        this.ECz.add(this.ECA);
        this.ECA.addActionListener(new ActionListener(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtt.a(this.EDj, "Land Vehicles", cug.fnD);
            }
        });
        this.ECz.add(this.ECB);
        this.ECB.addActionListener(new ActionListener(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtt.m(this.EDj);
            }
        });
        this.ECD.addActionListener(new ActionListener(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtt.c(this.EDj, 2);
                mtt.a(this.EDj, true);
            }
        });
        this.ECv.add((Component)this.ECw, "Center");
        this.ECv.add((Component)this.ECC, "South");
        this.ECv.setBorder(BorderFactory.createTitledBorder(""));
        this.ECq.add((Component)this.ECr, "West");
        this.ECq.add((Component)this.ECv, "Center");
        this.ECC.add(this.ECD);
        this.ECC.add(this.ECE);
        this.ECE.addActionListener(new ActionListener(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtt.h(this.EDj).remove(mtt.i(this.EDj));
                mtt.h(this.EDj).remove(mtt.g(this.EDj));
                mtt.j(this.EDj).setVisible(true);
                mtt.h(this.EDj).revalidate();
                mtt.h(this.EDj).updateUI();
            }
        });
    }

    private void ak(String string, int n) {
        JDialog jDialog = new JDialog();
        jDialog.setTitle(string);
        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel(new FlowLayout());
        JButton jButton = new JButton("Add " + string);
        JButton jButton2 = new JButton("Close");
        jButton2.addActionListener(new ActionListener(this, jDialog){
            final /* synthetic */ JDialog EtI;
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
                this.EtI = jDialog;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EtI.dispose();
            }
        });
        jPanel2.add(jButton);
        jPanel2.add(jButton2);
        JScrollPane jScrollPane = new JScrollPane();
        this.al(string, n);
        jScrollPane.getViewport().add(this.Eix);
        jButton.addActionListener(new ActionListener(this){
            final /* synthetic */ mtt EDj;
            {
                this.EDj = mtt2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                DefaultMutableTreeNode defaultMutableTreeNode;
                int[] nArray = mtt.n(this.EDj).getSelectionRows();
                if (nArray != null && (defaultMutableTreeNode = (DefaultMutableTreeNode)mtt.n(this.EDj).getLastSelectedPathComponent()).isLeaf()) {
                    String string = defaultMutableTreeNode.toString();
                    if (mtt.i(this.EDj).isVisible()) {
                        if (!mtt.o(this.EDj).contains(string)) {
                            mtt.a(this.EDj, string);
                        }
                    } else {
                        mtt.b(this.EDj, string);
                    }
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

    private void al(String string, int n) {
        this.EiD = new DefaultMutableTreeNode(string);
        les les2 = lea.enW();
        ler ler2 = les2.eqq();
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            this.a(this.EiD, les2, ler3, n);
            ler3 = les2.h(ler3);
        }
    }

    private void a(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2, int n) {
        int n2 = cug.fkN;
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            boolean bl = les2.isDescendant(ler3.getType(), n2);
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
        this.Eix = new JTree(defaultMutableTreeNode);
        this.Eix.getSelectionModel().setSelectionMode(1);
    }

    private void Dl(String string) {
        int n = lea.enW().getType(string);
        if (n != -1) {
            amn amn2 = new amn();
            amn2.hc(n);
            this.rha.put(new Integer(n), amn2);
            this.ECI.add(string);
            this.ECJ.setListData(this.ECI);
            this.ECJ.revalidate();
        } else {
            JOptionPane.showInternalMessageDialog(this.Eqh, "Resource [" + string + "] Doesn't Exist In Resource Tree");
        }
    }

    private void Dm(String string) {
        int n = lea.enW().getType(string);
        if (n == -1) {
            JOptionPane.showInternalMessageDialog(this.Eqh, "Resource [" + string + "] Doesn't Exist In Resource Tree");
        }
    }

    private void ePb() {
        String string = (String)this.ECJ.getSelectedValue();
        if (string != null && JOptionPane.showInternalConfirmDialog(this, "Are you sure that you\n want to remove " + string) == 0) {
            int n = lea.enW().getType(string);
            this.rha.remove(new Integer(n));
            this.ECI.remove(string);
            this.ECJ.revalidate();
            this.EDg = null;
            this.Ah(false);
        }
    }

    private void ePc() {
        if (this.EDg != null) {
            this.eOV();
        }
        this.EDh.dVb();
        JOptionPane.showInternalMessageDialog(this, "Water Vessel Info SFFile Saved");
    }

    private void ePd() {
    }

    private void ePe() {
    }

    static /* synthetic */ void a(mtt mtt2) {
        mtt2.eOX();
    }

    static /* synthetic */ void b(mtt mtt2) {
        mtt2.eOY();
    }

    static /* synthetic */ void c(mtt mtt2) {
        mtt2.eOV();
    }

    static /* synthetic */ void d(mtt mtt2) {
        mtt2.eOW();
    }

    static /* synthetic */ int a(mtt mtt2, int n) {
        mtt2.ECj = n;
        return mtt2.ECj;
    }

    static /* synthetic */ JButton e(mtt mtt2) {
        return mtt2.ECp;
    }

    static /* synthetic */ int f(mtt mtt2) {
        return mtt2.ECj;
    }

    static /* synthetic */ JPanel g(mtt mtt2) {
        return mtt2.ECq;
    }

    static /* synthetic */ JPanel h(mtt mtt2) {
        return mtt2.Eqh;
    }

    static /* synthetic */ JPanel i(mtt mtt2) {
        return mtt2.ECF;
    }

    static /* synthetic */ void b(mtt mtt2, int n) {
        mtt2.afA(n);
    }

    static /* synthetic */ JPanel j(mtt mtt2) {
        return mtt2.ECn;
    }

    static /* synthetic */ boolean a(mtt mtt2, boolean bl) {
        mtt2.EDi = bl;
        return mtt2.EDi;
    }

    static /* synthetic */ void a(mtt mtt2, String string, int n) {
        mtt2.ak(string, n);
    }

    static /* synthetic */ void k(mtt mtt2) {
        mtt2.ePb();
    }

    static /* synthetic */ void c(mtt mtt2, int n) {
        mtt2.afB(n);
    }

    static /* synthetic */ boolean l(mtt mtt2) {
        return mtt2.EDi;
    }

    static /* synthetic */ void m(mtt mtt2) {
        mtt2.ePd();
    }

    static /* synthetic */ JTree n(mtt mtt2) {
        return mtt2.Eix;
    }

    static /* synthetic */ Vector o(mtt mtt2) {
        return mtt2.ECI;
    }

    static /* synthetic */ void a(mtt mtt2, String string) {
        mtt2.Dl(string);
    }

    static /* synthetic */ void b(mtt mtt2, String string) {
        mtt2.Dm(string);
    }
}

