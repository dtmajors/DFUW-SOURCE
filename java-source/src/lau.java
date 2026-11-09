/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 *  kzx
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.MenuElement;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class lau
extends JPanel
implements KeyListener {
    protected final String qtM = "** TRASHCAN NODE **";
    protected final String qtN = "** LOST NODES **";
    protected JTree qtO = null;
    protected DefaultTreeModel qtP = null;
    protected lae qtQ = null;
    protected lae qtR = null;
    protected kzx qoZ = null;
    protected JPopupMenu qtS = null;
    protected JPopupMenu qtT = null;
    protected Action qtU;
    protected Action qtV;
    protected Action qtW;
    protected Action qtX;
    protected Action qtY;
    protected Action qtZ;
    protected Action qua;
    protected Action qub;
    protected Action quc;
    private laf qud = null;
    private boolean que = false;

    public lau(kzx kzx2) {
        this.qoZ = kzx2;
    }

    public void init() {
        this.qtO = this.elL();
        this.setLayout(new BorderLayout());
        this.add((Component)new JScrollPane(this.qtO), "Center");
        this.qtS = this.ekk();
        this.qtT = this.elM();
        this.qtO.addKeyListener(this);
    }

    private JTree elL() {
        this.qtP = this.t();
        this.qtO = new JTree(this.qtP);
        this.qtO.putClientProperty("JTree.lineStyle", "Angled");
        this.qtO.setShowsRootHandles(true);
        this.qtO.setToggleClickCount(0);
        this.qtO.setEditable(false);
        this.qtO.getSelectionModel().setSelectionMode(1);
        ToolTipManager.sharedInstance().registerComponent(this.qtO);
        this.qtO.addTreeSelectionListener(new TreeSelectionListener(this){
            final /* synthetic */ lau quf;
            {
                this.quf = lau2;
            }

            public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
                lae lae2 = (lae)treeSelectionEvent.getPath().getLastPathComponent();
            }
        });
        this.qtO.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ lau quf;
            {
                this.quf = lau2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                TreePath treePath = this.quf.qtO.getPathForLocation(mouseEvent.getX(), mouseEvent.getY());
                if (treePath != null) {
                    this.quf.qtO.setSelectionPath(treePath);
                    if (SwingUtilities.isLeftMouseButton(mouseEvent) && mouseEvent.getClickCount() == 2) {
                        lae lae2 = (lae)treePath.getLastPathComponent();
                        String string = lae2.getName();
                        String string2 = null;
                        if (lae2.getParent() != null) {
                            string2 = ((lae)lae2.getParent()).getName();
                        }
                        switch (lae2.getNodeType()) {
                            case 1: {
                                break;
                            }
                            case 2: {
                                this.quf.qoZ.b((cam)((lae)lae2.getParent()).getValue());
                                this.quf.qoZ.d((cai)lae2.getValue());
                                break;
                            }
                            case 3: {
                                this.quf.qoZ.b((cam)((lae)lae2.getParent()).getValue());
                                this.quf.qoZ.d((cai)lae2.getValue());
                                break;
                            }
                            case 4: {
                                this.quf.qoZ.ap(string, string2);
                                break;
                            }
                            case 5: {
                                this.quf.qoZ.a((all)lae2.getValue());
                                break;
                            }
                            case 6: {
                                this.quf.qoZ.aq(string, string2);
                                break;
                            }
                            case 7: {
                                this.quf.qoZ.d((ctm)lae2.getValue());
                                break;
                            }
                            case 8: {
                                this.quf.qoZ.b((cam)((lae)lae2.getParent().getParent()).getValue());
                                this.quf.qoZ.d((cah)lae2.getValue());
                                break;
                            }
                            case 10: 
                            case 11: {
                                this.quf.qoZ.b((cam)lae2.getValue());
                                break;
                            }
                            case 12: {
                                this.quf.qoZ.h((ctu)lae2.getValue());
                                break;
                            }
                            case 13: {
                                this.quf.qoZ.a((ctv)lae2.getValue());
                                break;
                            }
                            case 14: {
                                this.quf.qoZ.c((ctz)lae2.getValue());
                                break;
                            }
                            case 15: {
                                this.quf.qoZ.ar(string, string2);
                                break;
                            }
                            case 16: {
                                break;
                            }
                            case 17: {
                                this.quf.qoZ.as(string, string2);
                                break;
                            }
                            case 18: {
                                break;
                            }
                            case 19: {
                                dgj dgj2 = (dgj)lae2.getValue();
                                this.quf.qoZ.a(dgj2, false);
                                break;
                            }
                            case 20: {
                                break;
                            }
                            case 21: {
                                dgj dgj3 = (dgj)lae2.getValue();
                                this.quf.qoZ.a(dgj3, true);
                                break;
                            }
                            case 22: {
                                this.quf.qoZ.b((cam)((lae)lae2.getParent()).getValue());
                                this.quf.qoZ.d((cai)lae2.getValue());
                                break;
                            }
                        }
                    } else if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                        this.quf.n(mouseEvent);
                    }
                }
            }
        });
        return this.qtO;
    }

    protected DefaultTreeModel t() {
        this.qtQ = new lae(16, 0, "Root");
        DefaultTreeModel defaultTreeModel = new DefaultTreeModel(this.qtQ);
        return defaultTreeModel;
    }

    protected void n(MouseEvent mouseEvent) {
        lae lae2 = (lae)this.qtO.getSelectionModel().getSelectionPath().getLastPathComponent();
        if (lae2.getName().equals("** TRASHCAN NODE **")) {
            this.qtT.show(this.qtO, mouseEvent.getX(), mouseEvent.getY());
        } else if (!this.c(lae2)) {
            if (this.b(lae2)) {
                MenuElement[] menuElementArray = this.qtS.getSubElements();
                JMenuItem jMenuItem = null;
                for (int i = 0; i < menuElementArray.length; ++i) {
                    if (!(menuElementArray[i] instanceof JMenuItem) || !(jMenuItem = (JMenuItem)menuElementArray[i]).getText().startsWith("Delete")) continue;
                    jMenuItem.setEnabled(false);
                }
                this.qtS.show(this.qtO, mouseEvent.getX(), mouseEvent.getY());
            } else {
                MenuElement[] menuElementArray = this.qtS.getSubElements();
                JMenuItem jMenuItem = null;
                for (int i = 0; i < menuElementArray.length; ++i) {
                    if (!(menuElementArray[i] instanceof JMenuItem) || !(jMenuItem = (JMenuItem)menuElementArray[i]).getText().startsWith("Delete")) continue;
                    jMenuItem.setEnabled(true);
                }
                this.qtS.show(this.qtO, mouseEvent.getX(), mouseEvent.getY());
            }
        }
    }

    protected boolean b(lae lae2) {
        return lae2.getNodeType() == 16;
    }

    protected boolean c(lae lae2) {
        return lae2.getNodeType() == 18;
    }

    protected JPopupMenu ekk() {
        this.qtU = new AbstractAction(this, "Reload Tree"){
            final /* synthetic */ lau quf;
            {
                this.quf = lau2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.quf.qtP = this.quf.t();
                this.quf.qtO.setModel(this.quf.qtP);
            }
        };
        this.qtV = new AbstractAction(this, "Expand selected"){
            final /* synthetic */ lau quf;
            {
                this.quf = lau2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.quf.qtO.getSelectionModel().getSelectionPath();
                if (treePath != null) {
                    lae lae2 = (lae)treePath.getLastPathComponent();
                    this.quf.a(treePath, lae2);
                }
            }
        };
        this.qtW = new AbstractAction(this, "Collapse selected"){
            final /* synthetic */ lau quf;
            {
                this.quf = lau2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.quf.qtO.getSelectionModel().getSelectionPath();
                if (treePath != null) {
                    lae lae2 = (lae)treePath.getLastPathComponent();
                    this.quf.b(treePath, lae2);
                }
            }
        };
        this.qtX = new AbstractAction(this, "Search"){
            final /* synthetic */ lau quf;
            {
                this.quf = lau2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                lap lap2 = new lap(this.quf, this.quf.qoZ.getLocation());
                if (this.quf instanceof kzu) {
                    lap2.setTitle("ActionTree SearchDialog");
                } else if (this.quf instanceof laa) {
                    lap2.setTitle("EffectTree SearchDialog");
                } else if (this.quf instanceof lac) {
                    lap2.setTitle("FunctionTree SearchDialog");
                } else if (this.quf instanceof lag) {
                    lap2.setTitle("ObjectTree SearchDialog");
                } else if (this.quf instanceof lai) {
                    lap2.setTitle("PaperDollTree SearchDialog");
                } else if (this.quf instanceof lao) {
                    lap2.setTitle("ResourceTree SearchDialog");
                } else if (this.quf instanceof lar) {
                    lap2.setTitle("SkillTree SearchDialog");
                } else {
                    lap2.setTitle("TreeView SearchDialog");
                }
            }
        };
        this.qub = new AbstractAction(this, "Show content"){
            final /* synthetic */ lau quf;
            {
                this.quf = lau2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath;
                if (lau.a(this.quf) == null) {
                    lau.a(this.quf, new laf(this.quf, this.quf.qoZ.getLocation()));
                }
                if (!lau.a(this.quf).isVisible()) {
                    lau.a(this.quf).setVisible(true);
                }
                if ((treePath = this.quf.qtO.getSelectionModel().getSelectionPath()) == null) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                ler ler2 = lae2.dHM();
                les les2 = lae2.elc();
                if (ler2 == null || les2 == null) {
                    return;
                }
                if (this.quf instanceof kzu) {
                    lau.a(this.quf).setTitle("Action ContentDialog");
                } else if (this.quf instanceof laa) {
                    lau.a(this.quf).setTitle("Effect ContentDialog");
                } else if (this.quf instanceof lac) {
                    lau.a(this.quf).setTitle("Function ContentDialog");
                } else if (this.quf instanceof lao) {
                    lau.a(this.quf).setTitle("Resource ContentDialog");
                } else if (this.quf instanceof lar) {
                    lau.a(this.quf).setTitle("Skill ContentDialog");
                } else {
                    lau.a(this.quf).setTitle("TreeView ContentDialog");
                }
                lau.a(this.quf).a(lae2, ler2, les2);
            }
        };
        this.quc = new AbstractAction(this, "Sort Tree"){
            final /* synthetic */ lau quf;
            {
                this.quf = lau2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.quf.elQ();
            }
        };
        JPopupMenu jPopupMenu = new JPopupMenu();
        jPopupMenu.add(this.qtU);
        jPopupMenu.add(this.qtV);
        jPopupMenu.add(this.qtW);
        jPopupMenu.add(this.qtX);
        jPopupMenu.add(this.qub);
        return jPopupMenu;
    }

    protected JPopupMenu elM() {
        this.qtY = new AbstractAction(this, "Empty TrashCan"){
            final /* synthetic */ lau quf;
            {
                this.quf = lau2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.quf.ekl();
            }
        };
        JPopupMenu jPopupMenu = new JPopupMenu();
        jPopupMenu.add(this.qtY);
        return jPopupMenu;
    }

    public void a(TreePath treePath) {
        this.qtO.scrollPathToVisible(treePath);
        this.qtO.setSelectionPath(treePath);
    }

    public List yM(String string) {
        ArrayList arrayList = lcn.emv();
        if (string != null) {
            this.a(this.qtQ, string.toLowerCase(), arrayList);
        }
        return arrayList;
    }

    public void elN() {
        if (this.qtO.getSelectionPath() != null) {
            lae lae2 = (lae)this.qtO.getSelectionPath().getLastPathComponent();
            this.qtP.reload(lae2);
        }
    }

    public boolean av(String string, String string2) {
        List list = this.yM(string);
        TreePath treePath = null;
        lae lae2 = null;
        Object var6_6 = null;
        int n = -1;
        for (int i = 0; i < list.size(); ++i) {
            treePath = (TreePath)list.get(i);
            if (treePath == null || treePath.getParentPath() == null || !(lae2 = (lae)treePath.getParentPath().getLastPathComponent()).getName().equals(string2)) continue;
            if (n == -1) {
                n = i;
                continue;
            }
            return false;
        }
        if (n != -1) {
            this.a(treePath);
            return true;
        }
        return false;
    }

    private void a(lae lae2, String string, List list) {
        if (lae2.getName().toLowerCase().indexOf(string, 0) >= 0) {
            list.add(new TreePath(lae2.getPath()));
        }
        if (!lae2.isLeaf()) {
            lae lae3 = (lae)lae2.getFirstChild();
            for (int i = 0; i < lae2.getChildCount(); ++i) {
                this.a(lae3, string, list);
                lae3 = (lae)lae3.getNextSibling();
            }
        }
    }

    public void yN(String string) {
        lae lae2 = (lae)this.qtO.getSelectionModel().getSelectionPath().getLastPathComponent();
        lae2.setName(string);
        this.qtP.reload(lae2);
    }

    public final boolean i(String string, String string2, String string3) {
        lae lae2 = this.a(this.qtQ, string);
        lae lae3 = this.a(this.qtQ, string2);
        lae lae4 = this.a(this.qtQ, string3);
        if (lae2 != null && lae3 != null && lae4 != null) {
            lae3.remove(lae2);
            lae4.add(lae2);
            this.qtP.reload(lae3);
            this.qtP.reload(lae4);
            return true;
        }
        return false;
    }

    public final void elO() {
        this.qtX.actionPerformed(null);
    }

    protected final lae a(lae lae2, String string) {
        if (lae2.getName().equals(string)) {
            return lae2;
        }
        lae lae3 = null;
        Enumeration<TreeNode> enumeration = lae2.children();
        while (enumeration.hasMoreElements()) {
            lae3 = this.a((lae)enumeration.nextElement(), string);
            if (lae3 == null) continue;
            return lae3;
        }
        return null;
    }

    protected final void a(TreePath treePath, lae lae2) {
        if (!lae2.isLeaf()) {
            this.qtO.expandPath(treePath);
            lae lae3 = (lae)lae2.getFirstChild();
            TreePath treePath2 = null;
            for (int i = 0; i < lae2.getChildCount(); ++i) {
                treePath2 = treePath.pathByAddingChild(lae3);
                this.a(treePath2, lae3);
                lae3 = (lae)lae3.getNextSibling();
            }
        }
    }

    protected final void b(TreePath treePath, lae lae2) {
        if (!lae2.isLeaf()) {
            lae lae3 = (lae)lae2.getFirstChild();
            TreePath treePath2 = null;
            for (int i = 0; i < lae2.getChildCount(); ++i) {
                treePath2 = treePath.pathByAddingChild(lae3);
                this.b(treePath2, lae3);
                lae3 = (lae)lae3.getNextSibling();
            }
            this.qtO.collapsePath(treePath);
        }
    }

    protected final lae a(lae lae2, lae lae3) {
        TreePath treePath = new TreePath(lae2.getPath());
        Object[] objectArray = treePath.getPath();
        TreePath treePath2 = new TreePath(lae3.getPath());
        Object[] objectArray2 = treePath2.getPath();
        lae lae4 = null;
        lae lae5 = null;
        for (int i = objectArray.length - 1; i >= 0; --i) {
            lae4 = (lae)objectArray[i];
            for (int j = objectArray2.length - 1; j >= 0; --j) {
                lae5 = (lae)objectArray2[j];
                if (lae4.getType() != lae5.getType()) continue;
                return lae4;
            }
        }
        return null;
    }

    protected final void elP() {
        this.qtZ.actionPerformed(null);
    }

    protected void ekl() {
    }

    public final void elQ() {
        ArrayList<TreeNode> arrayList = lcn.emv();
        Enumeration<TreeNode> enumeration = this.qtQ.children();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        this.qtQ.removeAllChildren();
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); ++i) {
            this.qtQ.add((lae)arrayList.get(i));
        }
        this.qtP.reload(this.qtQ);
    }

    protected final void removeNode() {
        this.qua.actionPerformed(null);
    }

    protected void a(lae lae2) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 17) {
            this.que = true;
        } else if (keyEvent.getKeyCode() == 127) {
            lae lae2;
            TreePath treePath = this.qtO.getSelectionModel().getSelectionPath();
            if (treePath != null && (lae2 = (lae)treePath.getLastPathComponent()) != null && !this.c(lae2) && !this.b(lae2)) {
                this.removeNode();
            }
        } else if (this.que) {
            lae lae3;
            TreePath treePath;
            if (keyEvent.getKeyCode() == 78 && (treePath = this.qtO.getSelectionModel().getSelectionPath()) != null && (lae3 = (lae)treePath.getLastPathComponent()) != null && !this.c(lae3)) {
                this.elP();
            }
        } else if (keyEvent.getKeyCode() == 116 && this.qud != null) {
            this.qub.actionPerformed(null);
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 17) {
            this.que = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    static /* synthetic */ laf a(lau lau2) {
        return lau2.qud;
    }

    static /* synthetic */ laf a(lau lau2, laf laf2) {
        lau2.qud = laf2;
        return lau2.qud;
    }
}

