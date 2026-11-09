/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  ep
 *  lcw
 *  mtq
 */
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mph
extends mkx
implements ActionListener {
    public static final int DUT = 1;
    public static final int DUU = 2;
    public static final int DUV = 3;
    public static final int DUW = 0;
    public static final int DUX = 1;
    public static final int DUY = 2;
    private static final int DUZ = 1;
    private static final int DVa = 2;
    private static final int DVb = 3;
    private int DVc = 0;
    private final kar pdI = new kar();
    private final les ResourceTree = lea.enW();
    private JTree ca = null;
    private a DVd = null;
    private final mts DVe;
    private final String bW = "n/a";
    private final mkn bX = new mkn("Resource Name", "n/a", false);
    private final mkn bY = new mkn("Resource Type", "n/a", false);
    private final mkn bZ = new mkn("Has resource file", "n/a", false);
    private boolean DVf = false;
    private mtq DVg = null;
    protected mpi DVh = null;
    protected ler DVi = lea.enW().eqq();

    public mph(int n, JComponent jComponent) {
        switch (n) {
            case 2: {
                this.DVg = (mtq)jComponent;
                this.DVf = true;
                this.DVc = 0;
                break;
            }
            case 3: {
                this.DVf = false;
                this.DVc = 0;
                break;
            }
            default: {
                assert (false) : "Unknown Caller :" + n;
                break;
            }
        }
        this.ca = new JTree(this.t());
        this.ca.setCellRenderer(new b(this));
        this.ca.getSelectionModel().setSelectionMode(1);
        this.ca.putClientProperty("JTree.lineStyle", "Angled");
        this.DVd = new a(this, this.ca, this);
        this.ca.addMouseListener(this.DVd);
        this.DVe = new mts(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n = -1;
        if (actionEvent.getActionCommand().equals("Create SFFile for Resource from copy")) {
            n = 1;
        } else if (actionEvent.getActionCommand().equals("Create SFFile for Resource")) {
            n = 2;
        } else if (actionEvent.getActionCommand().equals("Open Resource")) {
            n = 3;
        } else assert (false) : "Unknown EventType [" + actionEvent.getActionCommand() + "]";
        this.afe(n);
    }

    public void a(mpi mpi2) {
        this.DVh = mpi2;
    }

    private void afe(int n) {
        TreePath treePath = this.ca.getPathForRow(this.ca.getRowForLocation(this.DVd.cf, this.DVd.cg));
        if (treePath == null) {
            return;
        }
        lae lae2 = (lae)treePath.getLastPathComponent();
        if (lae2 == null) {
            return;
        }
        lgw lgw2 = (lgw)lae2.dHM();
        if (lgw2 == null) {
            return;
        }
        switch (n) {
            case 1: {
                int n2;
                String string = lgw2.getName();
                jrw jrw2 = this.a(new myr("xml", "Resource Files (*.xml)"), lcw.qLb + "xml-files/server/resource/");
                if (jrw2 == null) {
                    return;
                }
                if (!jrw2.exists()) {
                    JOptionPane.showMessageDialog(this, "SFFile [" + jrw2 + "] does not exist.. insane!!", "Copy Error", 0);
                    return;
                }
                string = jry.tl(string);
                jrw jrw3 = new jrw(jrw2.getParent() + "/" + string);
                if (jrw3.exists() && (n2 = JOptionPane.showConfirmDialog((Component)this.DVg, "Target-file [" + jrw3 + "] exists. Overwrite?")) != 0) {
                    return;
                }
                this.b(jrw2, jrw3);
                this.aff(lgw2.getType());
                lgw2.ys(true);
                this.ca.revalidate();
                this.R(jrw3);
                break;
            }
            case 2: {
                int n3;
                String string = lae2.toString() + ".xml";
                jrw jrw4 = new jrw(lcw.qLb + "xml-files/server/resource/" + string);
                if (jrw4.exists() && (n3 = JOptionPane.showConfirmDialog(this, "Resource [" + jrw4.getName() + "] exists. Overwrite?")) != 0) {
                    return;
                }
                if (!this.w(lgw2)) {
                    return;
                }
                this.R(jrw4);
                break;
            }
            case 3: {
                String string = lae2.toString() + ".xml";
                jrw jrw5 = new jrw(lcw.qLb + "xml-files/server/resource/" + string);
                if (!jrw5.exists()) {
                    JOptionPane.showMessageDialog(this, "Resource [" + jrw5.getName() + "] does not exist!");
                    return;
                }
                this.R(jrw5);
            }
        }
    }

    private jrw a(myr myr2, String string) {
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(string);
            mkb2.addChoosableFileFilter(myr2);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(0);
            n = mkb2.showOpenDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return null;
        }
        jrw jrw2 = null;
        if (n == 0) {
            jrw2 = mkb2.eDc();
        }
        return jrw2;
    }

    private void R(jrw jrw2) {
        if (this.DVf) {
            this.DVg.eJb();
            this.DVg.R(jrw2);
            return;
        }
    }

    private void b(jrw jrw2, jrw jrw3) {
        String string;
        int n;
        jry.a(jrw3, jrw2);
        if (jrw2 != null && jrw2.exists() && (n = (string = jrw2.getName()).lastIndexOf(".")) != -1) {
            string = string.substring(0, n);
            String string2 = jrw3.getName();
            n = string2.lastIndexOf(".");
            if (n != -1) {
                string2 = string2.substring(0, n);
                int n2 = lea.enW().getType(string2);
                if (n2 <= 0) {
                    return;
                }
                Document document = null;
                try {
                    document = jsy.n(jrw3);
                }
                catch (bo bo2) {
                    // empty catch block
                }
                if (document != null) {
                    Node node = jsy.a("SFResourceName", document);
                    node = this.g(node);
                    node.setNodeValue(string2);
                    jsz.a(document, jrw3);
                    this.aff(n2);
                    return;
                }
            }
        }
    }

    private void aff(int n) {
        kzh kzh2 = new kzh();
        if (kzh2.ekc()) {
            kzh2.am(n, true);
            return;
        }
        JOptionPane.showMessageDialog(this, "Failed To Connect To Database");
    }

    private Node g(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            for (int i = 0; i < nodeList.getLength(); ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFString")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Value");
                return node;
            }
        }
        return null;
    }

    public void l(ler ler2) {
        this.DVi = ler2;
    }

    protected DefaultTreeModel t() {
        if (this.DVi == null) {
            return new DefaultTreeModel(new lae(16, 0, "RootNode"));
        }
        if (this.DVf) {
            lae lae2 = new lae(16, 0, "Items");
            DefaultTreeModel defaultTreeModel = new DefaultTreeModel(lae2);
            les les2 = lea.enW();
            this.DVi = les2.eqq();
            this.a(lae2, les2, this.DVi);
            return defaultTreeModel;
        }
        lae lae3 = new lae(16, 0, this.DVi.getName());
        DefaultTreeModel defaultTreeModel = new DefaultTreeModel(lae3);
        this.a(this.DVi, lae3);
        return defaultTreeModel;
    }

    private void a(lae lae2, les les2, ler ler2) {
        int n = cug.fkd;
        int n2 = cug.fkN;
        int n3 = cug.fkp;
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            boolean bl = les2.isDescendant(ler3.getType(), n);
            boolean bl2 = les2.isDescendant(ler3.getType(), n2);
            boolean bl3 = les2.isDescendant(ler3.getType(), n3);
            if (bl || bl2 || bl3) {
                lae lae3 = new lae(15, ler3.getType(), ler3.getName());
                lae2.add(lae3);
                if (les2.g(ler3) != null) {
                    this.a(lae3, les2, ler3);
                }
            }
            ler3 = les2.h(ler3);
        }
    }

    private void b(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
        int n = cug.fgJ;
        int n2 = cug.fgE;
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            boolean bl = les2.isDescendant(ler3.getType(), n);
            boolean bl2 = les2.isDescendant(ler3.getType(), n2);
            if (bl2 && !bl) {
                lae lae2 = new lae(15, ler3.getType(), ler3.getName());
                defaultMutableTreeNode.add(lae2);
                if (les2.g(ler3) != null) {
                    this.b(lae2, les2, ler3);
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

    public static void eIr() {
        String string = "\"http://tools.office.aventurine.gr/skill_wizard/massive_actions/trigger_resource_export.php\"";
        mph.CJ(string);
    }

    private static boolean CJ(String string) {
        String string2 = System.getProperty("os.name").toLowerCase();
        Runtime runtime = Runtime.getRuntime();
        try {
            if (string2.indexOf("win") >= 0) {
                runtime.exec("rundll32 url.dll,FileProtocolHandler " + string);
                return true;
            }
            if (string2.indexOf("mac") >= 0) {
                runtime.exec("open " + string);
                return true;
            }
            if (string2.indexOf("nix") >= 0 || string2.indexOf("nux") >= 0) {
                String[] stringArray = new String[]{"epiphany", "firefox", "mozilla", "konqueror", "netscape", "opera", "links", "lynx"};
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < stringArray.length; ++i) {
                    stringBuffer.append((i == 0 ? "" : " || ") + stringArray[i] + " \"" + string + "\" ");
                }
                runtime.exec(new String[]{"sh", "-c", stringBuffer.toString()});
                return true;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        return false;
    }

    private boolean w(lgw lgw2) {
        if (this.DVc == 0) {
            cbx cbx2 = new cbx(true);
            cbx2.l(lgw2.getType());
            cbv cbv2 = new cbv();
            cbv2.d(bve.a.dQD);
            cbx2.a(cbv2);
            this.C(cbx2);
            this.a(lgw2, cbx2, null);
            return true;
        }
        assert (false);
        return false;
    }

    private void a(lgw lgw2, cbx cbx2, ase ase2) {
        this.pdI.a(cbx2, "xml-files/server/resource/", lgw2.getName(), ase2);
        lgw2.ys(true);
        lea.eoz().put(new Integer(cbx2.az()), ase2);
    }

    public void a(String string) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.ca.getModel().getRoot();
        TreePath treePath = new TreePath(defaultMutableTreeNode);
        this.ca.setSelectionPath(treePath);
        this.ca.setExpandsSelectedPaths(false);
        Enumeration<TreeNode> enumeration = defaultMutableTreeNode.depthFirstEnumeration();
        while (enumeration.hasMoreElements()) {
            lae lae2 = (lae)enumeration.nextElement();
            if (!lae2.getName().toLowerCase().contains(string.toLowerCase())) continue;
            Object[] objectArray = ((DefaultTreeModel)this.ca.getModel()).getPathToRoot(lae2);
            treePath = new TreePath(objectArray);
            this.ca.scrollPathToVisible(treePath);
            this.ca.setSelectionPath(treePath);
            return;
        }
    }

    public void eIs() {
        JScrollPane jScrollPane = new JScrollPane(this.ca);
        this.DGa.add(jScrollPane);
    }

    public void s() {
        this.ca.setModel(this.t());
        this.ca.revalidate();
    }

    public JTree eIt() {
        return this.ca;
    }

    private void a(cdw cdw2) {
        this.C((cbx)cdw2);
        el el2 = cdw2.fi();
        fe fe2 = new fe();
        fe2.setType(1488);
        el2.b(fe2);
    }

    private void C(cbx cbx2) {
        el el2 = cbx2.fi();
        this.e(el2, 1104);
        this.a(el2, 1328, cbx2.pa());
    }

    private void e(el el2, int n) {
        if (ep.aR((int)n)) {
            et et2 = new ez();
            et2.setType(n);
            et2.o(0.0f);
            el2.b(et2);
            et2 = new et();
            et2.setType(ep.k((int)n, (int)4));
            et2.o(10.0f);
            el2.b(et2);
            et2 = new ez();
            et2.setType(ep.k((int)n, (int)2));
            et2.o(10.0f);
            el2.b(et2);
            et2 = new et();
            et2.setType(ep.k((int)n, (int)1));
            et2.o(0.0f);
            el2.b(et2);
        } else {
            et et3 = new et();
            et3.setType(n);
            et3.o(0.0f);
            el2.b(et3);
        }
    }

    private void a(el el2, int n, String string) {
        ff ff2 = new ff();
        ff2.setType(n);
        ff2.av(string);
        el2.b(ff2);
    }

    static /* synthetic */ mkn a(mph mph2) {
        return mph2.bX;
    }

    static /* synthetic */ mkn b(mph mph2) {
        return mph2.bY;
    }

    static /* synthetic */ mkn c(mph mph2) {
        return mph2.bZ;
    }

    static /* synthetic */ boolean a(mph mph2, lgw lgw2) {
        return mph2.w(lgw2);
    }

    static /* synthetic */ void a(mph mph2, jrw jrw2) {
        mph2.R(jrw2);
    }

    static /* synthetic */ void a(mph mph2, int n) {
        mph2.aff(n);
    }

    static /* synthetic */ mts d(mph mph2) {
        return mph2.DVe;
    }
}

