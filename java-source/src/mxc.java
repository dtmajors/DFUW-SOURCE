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
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class mxc
extends mkx {
    private aux DEC = null;
    private Dimension EDK = new Dimension(350, 768);
    private final String ERV = lcw.qLb + "xml-files/server/resourcecontainers/shop inventory/";
    private JPanel ERW = new JPanel(new GridLayout(1, 1));
    private mpj ERX = new mpj();
    private JPanel ERY = new JPanel(new BorderLayout());
    private JTree EzM;
    private DefaultMutableTreeNode ERZ;
    private JPanel ESa = new JPanel(new GridLayout(2, 1));
    private JScrollPane ESb = new JScrollPane();
    private JTaskPane ESc = new JTaskPane();
    private JTaskPaneGroup ESd = new JTaskPaneGroup();
    private List<String> ESe = lcn.emv();
    private Cursor EEm = new Cursor(0);
    private Cursor EEn = new Cursor(3);
    private jyv ESf = new jyv();
    private jxk ESg = new jxk();

    public void p(aux aux2) {
        this.DEC = aux2;
        this.DEC.getAlignmentY();
    }

    public mxc() {
        super(false);
        this.setTitle("Shop Inventory Table");
        this.setPreferredSize(this.EDK);
        this.setSize(this.EDK);
        this.setDefaultCloseOperation(2);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setMaximizable(true);
        this.DGa.setLayout(new GridLayout(2, 1));
        this.r();
    }

    private void r() {
        this.ERW.add(this.ERX);
        this.ERX.afg(2000);
        this.ERX.eIu().zJ(false);
        this.ERX.eIu().CI("Shop Inventory Tables");
        this.ERX.eIu().getFileChooser().setCurrentDirectory(new jrw(this.ERV));
        this.ERX.b(new KeyAdapter(this){
            final /* synthetic */ mxc ESh;
            {
                this.ESh = mxc2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 10) {
                    try {
                        mxc.a(this.ESh, mxc.a(this.ESh), mxc.a(this.ESh).eIv(), mxc.a(this.ESh).eDc().getName());
                    }
                    catch (Exception exception) {
                        lfn.b(0, this.getClass().getName(), "Directory");
                    }
                }
            }
        });
        this.ERX.b(new MouseAdapter(this){
            final /* synthetic */ mxc ESh;
            {
                this.ESh = mxc2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == 1 && mouseEvent.getClickCount() == 2) {
                    try {
                        mxc.a(this.ESh, mxc.a(this.ESh), mxc.a(this.ESh).eIv(), mxc.a(this.ESh).eDc().getName());
                    }
                    catch (Exception exception) {
                        lfn.b(0, this.getClass().getName(), "Directory");
                    }
                }
            }
        });
        this.ERX.eIu().g(new ActionListener(this){
            final /* synthetic */ mxc ESh;
            {
                this.ESh = mxc2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mxc.a(this.ESh, JOptionPane.showInputDialog(mxc.a(this.ESh), (Object)"SFFile Name"));
                mxc.a(this.ESh).rescanCurrentDirectory();
            }
        });
        this.ERX.eIu().f(new ActionListener(this){
            final /* synthetic */ mxc ESh;
            {
                this.ESh = mxc2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mxc.b(this.ESh);
            }
        });
        this.DGa.add(this.ERW);
        this.eSE();
        this.ESa.add(this.ERY);
        this.ESa.add(this.ESb);
        this.ESa.setBorder(BorderFactory.createTitledBorder(""));
        this.ESb.getViewport().add((Component)this.ESc);
        this.ESc.add(this.ESd);
        this.ESd.setTitle("Items In List");
        this.DGa.add(this.ESa);
    }

    private void eSE() {
        JScrollPane jScrollPane = new JScrollPane();
        this.eKn();
        jScrollPane.getViewport().add(this.EzM);
        this.EzM.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mxc ESh;
            {
                this.ESh = mxc2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                DefaultMutableTreeNode defaultMutableTreeNode;
                int[] nArray;
                if (mouseEvent.getButton() == 1 && mouseEvent.getClickCount() == 2 && (nArray = mxc.c(this.ESh).getSelectionRows()) != null && (defaultMutableTreeNode = (DefaultMutableTreeNode)mxc.c(this.ESh).getLastSelectedPathComponent()).isLeaf()) {
                    String string = defaultMutableTreeNode.toString();
                    this.ESh.addItem(string);
                }
            }
        });
        this.ERY.add((Component)jScrollPane, "Center");
        this.ERY.setBorder(BorderFactory.createTitledBorder(""));
    }

    private void eKn() {
        this.ERZ = new DefaultMutableTreeNode("Items");
        les les2 = lea.enW();
        ler ler2 = les2.eqq();
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            this.c(this.ERZ, les2, ler3);
            ler3 = les2.h(ler3);
        }
    }

    private void c(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
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
                    this.c(defaultMutableTreeNode2, les2, ler3);
                }
            }
            ler3 = les2.h(ler3);
        }
        this.EzM = new JTree(defaultMutableTreeNode);
        this.EzM.getSelectionModel().setSelectionMode(1);
    }

    private void DX(String string) {
        if (string != null && !string.equals("")) {
            this.ERX.setCursor(this.EEn);
            this.ESf.vF(this.ERX.getCurrentDirectory() + "/" + string);
            this.ERX.setCursor(this.EEm);
        }
    }

    private void eSF() {
        if (this.ERX.eDc() != null && this.ERX.eDc().exists()) {
            String string = this.ERX.eDc().getAbsolutePath();
            int n = JOptionPane.showConfirmDialog(this.ERX, "Overriding SFFile ? " + string);
            if (n == 0) {
                this.setCursor(this.EEn);
                this.ESf.x(string, this.ESe);
                this.setCursor(this.EEm);
            }
        }
    }

    private void a(mpj mpj2, JList jList, Object object) {
        this.DY(mpj2.getCurrentDirectory() + "/" + object.toString());
    }

    public void DY(String string) {
        lfn.b(2, "SFShopInventory", "openShopInventoryXMLFile() Opening Shop SFFile :" + string);
        this.ESe.clear();
        this.ESd.removeAll();
        this.ESd.revalidate();
        List<String> list = this.ESg.vh(string);
        for (int i = 0; i < list.size(); ++i) {
            this.addItem(list.get(i));
        }
    }

    public void addItem(String string) {
        if (this.ESe.contains(string)) {
            return;
        }
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.setOpaque(false);
        JPanel jPanel2 = new JPanel(new GridLayout(1, 2));
        jPanel2.setOpaque(false);
        JPanel jPanel3 = new JPanel(new BorderLayout());
        jPanel3.setOpaque(false);
        JTextField jTextField = new JTextField();
        jTextField.setText(string);
        jPanel3.add((Component)jTextField, "Center");
        jPanel2.add(jPanel3);
        jPanel.add((Component)jPanel2, "Center");
        JButton jButton = new JButton("Remove");
        jButton.addActionListener(new ActionListener(this, string, jPanel){
            final /* synthetic */ String EEr;
            final /* synthetic */ JPanel EHm;
            final /* synthetic */ mxc ESh;
            {
                this.ESh = mxc2;
                this.EEr = string;
                this.EHm = jPanel;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mxc.b(this.ESh, this.EEr);
                mxc.d(this.ESh).remove((Component)this.EHm);
                mxc.d(this.ESh).revalidate();
            }
        });
        jPanel.add((Component)jButton, "East");
        this.ESd.add((Component)jPanel);
        this.ESd.revalidate();
        this.ESd.repaint();
        this.ESe.add(string);
    }

    private void DZ(String string) {
        this.ESe.remove(string);
    }

    public void c(jrw jrw2, jrw jrw3) {
        this.ERX.setCurrentDirectory(jrw2);
        this.ERX.setSelectedFile(jrw3);
    }

    static /* synthetic */ mpj a(mxc mxc2) {
        return mxc2.ERX;
    }

    static /* synthetic */ void a(mxc mxc2, mpj mpj2, JList jList, Object object) {
        mxc2.a(mpj2, jList, object);
    }

    static /* synthetic */ void a(mxc mxc2, String string) {
        mxc2.DX(string);
    }

    static /* synthetic */ void b(mxc mxc2) {
        mxc2.eSF();
    }

    static /* synthetic */ JTree c(mxc mxc2) {
        return mxc2.EzM;
    }

    static /* synthetic */ void b(mxc mxc2, String string) {
        mxc2.DZ(string);
    }

    static /* synthetic */ JTaskPaneGroup d(mxc mxc2) {
        return mxc2.ESd;
    }
}

