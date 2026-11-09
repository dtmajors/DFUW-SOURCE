/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  kzx
 */
import java.awt.event.ActionEvent;
import java.util.Enumeration;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class lao
extends lau {
    protected Action qtb = null;
    protected les ResourceTree = lea.enW();

    public lao(kzx kzx2) {
        super(kzx2);
    }

    @Override
    public void init() {
        super.init();
        this.qtO.setCellRenderer(new a(this));
    }

    @Override
    protected DefaultTreeModel t() {
        ler ler2 = this.ResourceTree.eqq();
        if (ler2 == null) {
            lfn.b(5, "SFXMLResourceTreeView", "createTreeModel() RootNode is null.");
            return new DefaultTreeModel(new lae(16, 0, "RootNode"));
        }
        this.qtQ = new lae(16, 0, ler2.getName());
        DefaultTreeModel defaultTreeModel = new DefaultTreeModel(this.qtQ);
        this.a(ler2, this.qtQ);
        this.qtR = new lae(18, 0, "** TRASHCAN NODE **");
        this.qtQ.add(this.qtR);
        return defaultTreeModel;
    }

    private void a(ler ler2, lae lae2) {
        lgw lgw2 = (lgw)this.ResourceTree.g(ler2);
        while (lgw2 != null) {
            lae lae3 = null;
            lae3 = lgw2.enm().endsWith("doom_01.dds") ? new lae(15, lgw2.getType(), lgw2.getName() + " *") : new lae(15, lgw2.getType(), lgw2.getName());
            lae2.add(lae3);
            this.a(lgw2, lae3);
            lgw2 = (lgw)this.ResourceTree.h(lgw2);
        }
    }

    @Override
    protected JPopupMenu ekk() {
        JPopupMenu jPopupMenu = super.ekk();
        jPopupMenu.add(new JSeparator());
        this.qtZ = new AbstractAction(this, "Add Resource"){
            final /* synthetic */ lao qtc;
            {
                this.qtc = lao2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qtc.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null || this.qtc.c((lae)treePath.getLastPathComponent())) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                String string = JOptionPane.showInputDialog(this.qtc, "Enter ResourceName", "Add Resource to '" + lae2.getName() + "'", 3);
                if (string == null || string.trim().equals("")) {
                    return;
                }
                if (this.qtc.ResourceTree.contains(string = string.trim())) {
                    lfn.b(2, "SFXMLResourceTreeView", "actionPerformed() Resource already exists.");
                    return;
                }
                lae lae3 = new lae(15, this.qtc.ResourceTree.getType(string), string);
                lae2.add(lae3);
                this.qtc.qtP.reload(lae2);
                int n = this.qtc.ResourceTree.getType(lae2.getName());
                ler ler2 = this.qtc.ResourceTree.acv(n);
                lgw lgw2 = new lgw();
                lgw2.setName(string);
                lgw2.setType(this.qtc.ResourceTree.eqp());
                lgw2.a(new lhu(32, 32, "gui_icon_generic_32x32.bmp"));
                lgw2.jC("NULL");
                lgw2.a(bqm.a.dDV);
                lgw2.ys(false);
                lgw2.yt(false);
                lgw2.b(cak.c.efE);
                this.qtc.ResourceTree.a(ler2, lgw2, null);
            }
        };
        this.qua = new AbstractAction(this, "Delete Resource"){
            final /* synthetic */ lao qtc;
            {
                this.qtc = lao2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qtc.qtO.getSelectionModel().getSelectionPath();
                if (treePath != null) {
                    int n = JOptionPane.showConfirmDialog(this.qtc, "Do you really want to delete the resource", "Deletion confirmation", 0);
                    if (n == 1) {
                        return;
                    }
                    lae lae2 = (lae)treePath.getLastPathComponent();
                    lfn.b(1, "SFXMLResourceTreeView", "actionPerformed() Removing node " + lae2.getName() + " and its descendants.");
                    if (lae2.isNodeAncestor(this.qtc.qtR)) {
                        this.qtc.qtP.removeNodeFromParent(lae2);
                        this.qtc.qoZ.yl(lae2.getName());
                    } else {
                        int n2 = this.qtc.ResourceTree.getType(lae2.getName());
                        ler ler2 = this.qtc.ResourceTree.acv(n2);
                        this.qtc.ResourceTree.j(ler2);
                        this.qtc.qtP.removeNodeFromParent(lae2);
                        this.qtc.qtR.add(lae2);
                        this.qtc.qtP.reload(this.qtc.qtR);
                    }
                }
            }
        };
        this.qtb = new AbstractAction(this, "Save ResourceTree"){
            final /* synthetic */ lao qtc;
            {
                this.qtc = lao2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.qtc.qoZ.ekO();
            }
        };
        jPopupMenu.add(this.qtZ);
        jPopupMenu.add(this.qtb);
        jPopupMenu.addSeparator();
        jPopupMenu.add(this.qua);
        return jPopupMenu;
    }

    @Override
    protected void ekl() {
        int n = JOptionPane.showConfirmDialog(this, "Do you really want to remove all\nnodes under the TrashCanNode?", "Empty TrashCan", 0);
        if (n == 0) {
            lfn.b(0, "SFXMLResourceTreeView", "emptyTrashCan() Emptying TrashCan");
            lae lae2 = null;
            for (int i = this.qtR.getChildCount() - 1; i >= 0; --i) {
                lae2 = (lae)this.qtR.getChildAt(i);
                this.qtP.removeNodeFromParent(lae2);
                this.qoZ.yl(lae2.getName());
            }
            this.qtP.reload(this.qtR);
        }
    }

    @Override
    protected void a(lae lae2) {
        Comparable comparable;
        if (lae2.getChildCount() > 0) {
            Enumeration<TreeNode> enumeration = lae2.children();
            comparable = null;
            while (enumeration.hasMoreElements()) {
                comparable = (lae)enumeration.nextElement();
                this.a((lae)comparable);
            }
        }
        lfn.b(0, "SFXMLResourceTreeView", "removeSubtree() Removing node " + lae2.getName());
        int n = this.ResourceTree.getType(lae2.getName());
        comparable = this.ResourceTree.acv(n);
        this.ResourceTree.j((ler)comparable);
    }
}

