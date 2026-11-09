/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.dnd.DropTarget;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class mvc
extends mkx
implements mxv {
    private JTree qtO;
    private DefaultTreeModel EJv;
    private cc EJw;
    private Object EJx = null;
    private cd EJy = new cd();
    private lfn ga = lfn.eqw();
    private JPopupMenu qtS = null;
    private Action EJz;
    private Action EJA;
    private Action EJB;
    private Action EJC;
    private Action qtV;
    private Action qtW;
    private Action qtX;
    private Action EJD;
    private DropTarget DOo = null;
    private myc DOp = null;
    private int DOq = 1;

    public mvc() {
        super(false);
        this.init();
    }

    private void init() {
        this.setClosable(true);
        Container container = this.getContentPane();
        container.setBackground(new Color(10, 55, 131));
        this.qtO = this.elL();
        container.setLayout(new BorderLayout());
        JScrollPane jScrollPane = new JScrollPane(this.qtO);
        container.add((Component)jScrollPane, "Center");
        this.qtS = this.ekk();
        this.DOp = new myc();
        this.DOo = new DropTarget(this.qtO, this.DOq, this.DOp, true);
        this.setTransferHandler(new myf("[LogicObject]"));
        this.setDropTarget(this.DOo);
        this.setTitle("SFObjectReflectorFrame");
        this.setSize(new Dimension(600, 600));
        this.setLocation(new Point(100, 100));
        this.setResizable(true);
    }

    @Override
    public void a(btk btk2, double d2, double d3) {
        if (this.EJx == null) {
            this.b(btk2, true);
        } else {
            this.a(this.EJw, btk2);
        }
    }

    public cc b(Object object, boolean bl) {
        if (object != null) {
            this.EJy.init();
            cc cc2 = new cc("Test", 7);
            this.EJy.a(object, null, cc2);
            if (bl) {
                this.EJw = cc2;
                this.EJx = object;
                this.EJv.setRoot(this.EJw);
            }
            return cc2;
        }
        lfn.b(5, "SFObjectReflectorFrame", "createObjectTree() Object is null!");
        return null;
    }

    public void a(cc cc2, Object object) {
        if (cc2.equals(this.EJw)) {
            lfn.b(0, "SFObjectReflectorFrame", "refreshObjectTree() Refreshing rootnode.");
            this.b(object, true);
        } else {
            lfn.b(0, "SFObjectReflectorFrame", "refreshObjectTree() Refreshing node [" + cc2.getNodeName() + "]");
            cc cc3 = (cc)cc2.getParent();
            cc3.remove(cc2);
            cc cc4 = this.b(object, false);
            cc3.add(cc4);
            this.EJv.reload(cc4);
        }
    }

    public void a(TreePath treePath) {
        this.qtO.scrollPathToVisible(treePath);
        this.qtO.setSelectionPath(treePath);
    }

    public List an(String string, int n) {
        ArrayList arrayList = lcn.emv();
        if (string == null && n == -1) {
            lfn.b(0, "SFObjectReflectorFrame", "findNodes() No search parameters provided!");
        } else {
            lfn.b(0, "SFObjectReflectorFrame", "findNodes() Searching for node (" + string + ", " + n + ")");
            this.a(this.EJw, string, n, arrayList);
            lfn.b(0, "SFObjectReflectorFrame", "findNodes() ResultList contains " + arrayList.size() + " TreePaths.");
        }
        return arrayList;
    }

    private void a(cc cc2, String string, int n, List list) {
        boolean bl = false;
        boolean bl2 = false;
        if (string == null) {
            bl = true;
        } else if (cc2.getNodeName().startsWith(string)) {
            bl = true;
        } else if (cc2.getClassName().startsWith(string)) {
            bl = true;
        }
        if (n == -1) {
            bl2 = true;
        } else if (cc2.getNodeType() == n) {
            bl2 = true;
        }
        if (bl && bl2) {
            list.add(new TreePath(cc2.getPath()));
        }
        if (!cc2.isLeaf()) {
            cc cc3 = (cc)cc2.getFirstChild();
            for (int i = 0; i < cc2.getChildCount(); ++i) {
                this.a(cc3, string, n, list);
                cc3 = (cc)cc3.getNextSibling();
            }
        }
    }

    private JTree elL() {
        this.EJv = new DefaultTreeModel(new cc("Empty", 7));
        this.qtO = new JTree(this.EJv);
        this.qtO.putClientProperty("JTree.lineStyle", "Angled");
        this.qtO.setShowsRootHandles(true);
        this.qtO.setToggleClickCount(2);
        this.qtO.setEditable(true);
        this.qtO.getSelectionModel().setSelectionMode(1);
        b b2 = new b(this);
        this.qtO.setCellRenderer(b2);
        this.qtO.setCellEditor(new a(this, this.qtO, b2));
        ToolTipManager.sharedInstance().registerComponent(this.qtO);
        this.qtO.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mvc EJE;
            {
                this.EJE = mvc2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                TreePath treePath = mvc.a(this.EJE).getPathForLocation(mouseEvent.getX(), mouseEvent.getY());
                if (treePath != null) {
                    mvc.a(this.EJE).setSelectionPath(treePath);
                    if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                        mvc.a(this.EJE, mouseEvent);
                    }
                }
            }
        });
        return this.qtO;
    }

    private JPopupMenu ekk() {
        this.EJz = new AbstractAction(this, "Refresh tree"){
            final /* synthetic */ mvc EJE;
            {
                this.EJE = mvc2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EJE.b(mvc.b(this.EJE), true);
            }
        };
        this.EJA = new AbstractAction(this, "Refresh selected"){
            final /* synthetic */ mvc EJE;
            {
                this.EJE = mvc2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = mvc.a(this.EJE).getSelectionModel().getSelectionPath();
                if (treePath != null) {
                    cc cc2 = (cc)treePath.getLastPathComponent();
                    cc cc3 = cc2.at();
                    if (cc3 != null) {
                        this.EJE.a(cc3, cc3.ao());
                    } else {
                        lfn.print("Classnode is null");
                    }
                }
            }
        };
        this.EJB = new AbstractAction(this, "java.util.List all unique names"){
            final /* synthetic */ mvc EJE;
            {
                this.EJE = mvc2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = mvc.a(this.EJE).getSelectionModel().getSelectionPath();
                if (treePath != null) {
                    cc cc2 = (cc)treePath.getLastPathComponent();
                    ArrayList<E> arrayList = lcn.emv();
                    mvc.a(this.EJE, treePath, cc2, 2, true, arrayList);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i = 0; i < arrayList.size(); ++i) {
                        stringBuilder.append((String)arrayList.get(i));
                        stringBuilder.append("\n");
                    }
                    mvc.a(this.EJE, "Unique namenodes under selected node", stringBuilder.toString());
                }
            }
        };
        this.EJC = new AbstractAction(this, "List all unique types"){
            final /* synthetic */ mvc EJE;
            {
                this.EJE = mvc2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = mvc.a(this.EJE).getSelectionModel().getSelectionPath();
                if (treePath != null) {
                    cc cc2 = (cc)treePath.getLastPathComponent();
                    ArrayList<E> arrayList = lcn.emv();
                    mvc.a(this.EJE, treePath, cc2, 3, true, arrayList);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i = 0; i < arrayList.size(); ++i) {
                        stringBuilder.append((String)arrayList.get(i));
                        stringBuilder.append("\n");
                    }
                    mvc.a(this.EJE, "Unique types under selected node", stringBuilder.toString());
                }
            }
        };
        this.qtV = new AbstractAction(this, "Expand selected"){
            final /* synthetic */ mvc EJE;
            {
                this.EJE = mvc2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = mvc.a(this.EJE).getSelectionModel().getSelectionPath();
                if (treePath != null) {
                    cc cc2 = (cc)treePath.getLastPathComponent();
                    mvc.a(this.EJE, treePath, cc2);
                }
            }
        };
        this.qtW = new AbstractAction(this, "Collapse selected"){
            final /* synthetic */ mvc EJE;
            {
                this.EJE = mvc2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = mvc.a(this.EJE).getSelectionModel().getSelectionPath();
                if (treePath != null) {
                    cc cc2 = (cc)treePath.getLastPathComponent();
                    mvc.b(this.EJE, treePath, cc2);
                }
            }
        };
        this.EJD = new AbstractAction(this, "Toggle show full path"){
            final /* synthetic */ mvc EJE;
            {
                this.EJE = mvc2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = mvc.a(this.EJE).getSelectionModel().getSelectionPath();
                if (treePath != null) {
                    boolean bl = !mvc.c(this.EJE).ap();
                    TreePath treePath2 = new TreePath(mvc.c(this.EJE));
                    mvc.a(this.EJE, treePath2, mvc.c(this.EJE), bl);
                    mvc.d(this.EJE).reload(mvc.c(this.EJE));
                }
            }
        };
        this.qtX = new AbstractAction(this, "Search"){
            final /* synthetic */ mvc EJE;
            {
                this.EJE = mvc2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvc.e(this.EJE);
            }
        };
        JPopupMenu jPopupMenu = new JPopupMenu();
        jPopupMenu.add(this.EJz);
        jPopupMenu.add(this.EJA);
        jPopupMenu.add(this.EJB);
        jPopupMenu.add(this.EJC);
        jPopupMenu.add(this.qtV);
        jPopupMenu.add(this.qtW);
        jPopupMenu.add(this.EJD);
        jPopupMenu.add(this.qtX);
        return jPopupMenu;
    }

    private void n(MouseEvent mouseEvent) {
        this.qtS.show(this.qtO, mouseEvent.getX(), mouseEvent.getY());
    }

    private void ejl() {
        mvd mvd2 = new mvd(this);
    }

    private void aT(String string, String string2) {
        JOptionPane.showMessageDialog(this.qtO, string2, string, 1);
    }

    private void a(TreePath treePath, cc cc2, int n, boolean bl, List list) {
        if ((!list.contains(cc2.getNodeName()) || list.contains(cc2.getNodeName()) && !bl) && cc2.getNodeType() == n) {
            list.add(cc2.getNodeName());
        }
        if (!cc2.isLeaf()) {
            cc cc3 = (cc)cc2.getFirstChild();
            TreePath treePath2 = null;
            for (int i = 0; i < cc2.getChildCount(); ++i) {
                treePath2 = treePath.pathByAddingChild(cc3);
                this.a(treePath2, cc3, n, bl, list);
                cc3 = (cc)cc3.getNextSibling();
            }
        }
    }

    private void a(TreePath treePath, cc cc2) {
        if (!cc2.isLeaf()) {
            this.qtO.expandPath(treePath);
            cc cc3 = (cc)cc2.getFirstChild();
            TreePath treePath2 = null;
            for (int i = 0; i < cc2.getChildCount(); ++i) {
                treePath2 = treePath.pathByAddingChild(cc3);
                this.a(treePath2, cc3);
                cc3 = (cc)cc3.getNextSibling();
            }
        }
    }

    private void b(TreePath treePath, cc cc2) {
        if (!cc2.isLeaf()) {
            cc cc3 = (cc)cc2.getFirstChild();
            TreePath treePath2 = null;
            for (int i = 0; i < cc2.getChildCount(); ++i) {
                treePath2 = treePath.pathByAddingChild(cc3);
                this.b(treePath2, cc3);
                cc3 = (cc)cc3.getNextSibling();
            }
            this.qtO.collapsePath(treePath);
        }
    }

    private void a(TreePath treePath, cc cc2, boolean bl) {
        cc2.j(bl);
        if (!cc2.isLeaf()) {
            cc cc3 = (cc)cc2.getFirstChild();
            TreePath treePath2 = null;
            for (int i = 0; i < cc2.getChildCount(); ++i) {
                treePath2 = treePath.pathByAddingChild(cc3);
                this.a(treePath2, cc3, bl);
                cc3 = (cc)cc3.getNextSibling();
            }
        }
    }

    private void b(Object object, Field field, String string) {
        if (object == null || field == null || string == null) {
            lfn.b(5, "SFObjectReflectorFrame", "setFieldValue() Invalid parameters provided!");
        } else {
            lfn.b(0, "SFObjectReflectorFrame", "setFieldValue() Setting the field value.");
            this.EJy.a(object, field, string);
        }
    }

    private void a(List list, int n, String string, String string2) {
        if (list == null || n < 0 || string2 == null) {
            lfn.b(5, "SFObjectReflectorFrame", "setListItemValue() Invalid parameters provided!");
        } else {
            lfn.b(0, "SFObjectReflectorFrame", "setListItemValue() Setting the listitem value.");
            this.EJy.a(list, n, string, string2);
        }
    }

    private void a(Map map, String string, String string2, Object object) {
        if (map == null || string == null || string2 == null || object == null) {
            lfn.b(5, "SFObjectReflectorFrame", "setEntryKeyValue() Invalid parameters provided!");
        } else {
            lfn.b(0, "SFObjectReflectorFrame", "setEntryKeyValue() Setting the entrykey value.");
            this.EJy.a(map, string, string2, object);
        }
    }

    private void a(Map map, Object object, String string, String string2) {
        if (map == null || object == null || string == null || string2 == null) {
            lfn.b(5, "SFObjectReflectorFrame", "setEntryValueValue() Invalid parameters provided!");
        } else {
            lfn.b(0, "SFObjectReflectorFrame", "setEntryValueValue() Setting the entryvalue value.");
            this.EJy.a(map, object, string, string2);
        }
    }

    static /* synthetic */ JTree a(mvc mvc2) {
        return mvc2.qtO;
    }

    static /* synthetic */ void a(mvc mvc2, MouseEvent mouseEvent) {
        mvc2.n(mouseEvent);
    }

    static /* synthetic */ Object b(mvc mvc2) {
        return mvc2.EJx;
    }

    static /* synthetic */ void a(mvc mvc2, TreePath treePath, cc cc2, int n, boolean bl, List list) {
        mvc2.a(treePath, cc2, n, bl, list);
    }

    static /* synthetic */ void a(mvc mvc2, String string, String string2) {
        mvc2.aT(string, string2);
    }

    static /* synthetic */ void a(mvc mvc2, TreePath treePath, cc cc2) {
        mvc2.a(treePath, cc2);
    }

    static /* synthetic */ void b(mvc mvc2, TreePath treePath, cc cc2) {
        mvc2.b(treePath, cc2);
    }

    static /* synthetic */ cc c(mvc mvc2) {
        return mvc2.EJw;
    }

    static /* synthetic */ void a(mvc mvc2, TreePath treePath, cc cc2, boolean bl) {
        mvc2.a(treePath, cc2, bl);
    }

    static /* synthetic */ DefaultTreeModel d(mvc mvc2) {
        return mvc2.EJv;
    }

    static /* synthetic */ void e(mvc mvc2) {
        mvc2.ejl();
    }

    static /* synthetic */ void a(mvc mvc2, Object object, Field field, String string) {
        mvc2.b(object, field, string);
    }

    static /* synthetic */ void a(mvc mvc2, List list, int n, String string, String string2) {
        mvc2.a(list, n, string, string2);
    }

    static /* synthetic */ void a(mvc mvc2, Map map, String string, String string2, Object object) {
        mvc2.a(map, string, string2, object);
    }

    static /* synthetic */ void a(mvc mvc2, Map map, Object object, String string, String string2) {
        mvc2.a(map, object, string, string2);
    }
}

