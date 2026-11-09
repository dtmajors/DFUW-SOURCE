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

public class laa
extends lau {
    protected Action qqn;
    protected les DX = lea.enT();

    public laa(kzx kzx2) {
        super(kzx2);
    }

    @Override
    public void init() {
        super.init();
        this.qtO.setCellRenderer(new a(this));
    }

    @Override
    protected DefaultTreeModel t() {
        ler ler2 = this.DX.eqq();
        if (ler2 == null) {
            lfn.b(5, "SFXMLEffectTreeView", "createTreeModel() RootNode is null.");
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
        ldi ldi2 = (ldi)this.DX.g(ler2);
        while (ldi2 != null) {
            lae lae3 = null;
            lae3 = ldi2.atw() != null ? new lae(4, ldi2.getType(), ldi2.getName() + " *") : new lae(4, ldi2.getType(), ldi2.getName());
            lae2.add(lae3);
            this.a(ldi2, lae3);
            ldi2 = (ldi)this.DX.h(ldi2);
        }
    }

    @Override
    protected JPopupMenu ekk() {
        JPopupMenu jPopupMenu = super.ekk();
        jPopupMenu.add(new JSeparator());
        this.qtZ = new AbstractAction(this, "Add Effect"){
            final /* synthetic */ laa qqo;
            {
                this.qqo = laa2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qqo.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null || this.qqo.c((lae)treePath.getLastPathComponent())) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                String string = JOptionPane.showInputDialog(this.qqo, "Enter EffectName", "Add Effect", 3);
                if (string == null || string.trim().equals("")) {
                    return;
                }
                if (this.qqo.DX.contains(string = string.trim())) {
                    lfn.b(0, "SFXMLEffectTreeView.initPopupMenu()", "actionPerformed() Effect already exists.");
                    return;
                }
                lae lae3 = new lae(4, this.qqo.DX.getType(string), string);
                lae2.add(lae3);
                this.qqo.qtP.reload(lae2);
                int n = this.qqo.DX.getType(lae2.getName());
                ler ler2 = this.qqo.DX.acv(n);
                ldi ldi2 = new ldi();
                ldi2.setName(string);
                ldi2.setType(this.qqo.DX.eqp());
                ldi2.acd(4192);
                this.qqo.DX.a(ler2, ldi2, null);
            }
        };
        this.qua = new AbstractAction(this, "Delete Effect"){
            final /* synthetic */ laa qqo;
            {
                this.qqo = laa2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qqo.qtO.getSelectionModel().getSelectionPath();
                if (treePath != null) {
                    lae lae2 = (lae)treePath.getLastPathComponent();
                    lfn.b(1, "SFXMLEffectTreeView", "actionPerformed() Removing node " + lae2.getName() + " and its descendants.");
                    if (lae2.isNodeAncestor(this.qqo.qtR)) {
                        this.qqo.qtP.removeNodeFromParent(lae2);
                    } else {
                        int n = this.qqo.DX.getType(lae2.getName());
                        ler ler2 = this.qqo.DX.acv(n);
                        this.qqo.DX.j(ler2);
                        this.qqo.qtP.removeNodeFromParent(lae2);
                        this.qqo.qtR.add(lae2);
                        this.qqo.qtP.reload(this.qqo.qtR);
                    }
                }
            }
        };
        this.qqn = new AbstractAction(this, "Save EffectTree"){
            final /* synthetic */ laa qqo;
            {
                this.qqo = laa2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.qqo.qoZ.ekI();
            }
        };
        jPopupMenu.add(this.qtZ);
        jPopupMenu.add(this.qqn);
        jPopupMenu.addSeparator();
        jPopupMenu.add(this.qua);
        return jPopupMenu;
    }

    @Override
    protected void ekl() {
        int n = JOptionPane.showConfirmDialog(this, "Do you really want to remove all\nnodes under the TrashCanNode?", "Empty TrashCan", 0);
        if (n == 0) {
            lfn.b(0, "SFXMLEffectTreeView", "emptyTrashCan() Emptying TrashCan");
            lae lae2 = null;
            for (int i2 = this.qtR.getChildCount() - 1; i2 >= 0; --i2) {
                lae2 = (lae)this.qtR.getChildAt(i2);
                this.qtP.removeNodeFromParent(lae2);
                this.a(lae2);
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
        lfn.b(0, "SFXMLEffectTreeView", "removeSubtree() Removing node " + lae2.getName());
        int n = this.DX.getType(lae2.getName());
        comparable = this.DX.acv(n);
        this.DX.j((ler)comparable);
    }
}

