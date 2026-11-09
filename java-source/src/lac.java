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

public class lac
extends lau {
    protected Action qqK;
    protected Action qqL;
    protected les dqt = lea.enU();

    public lac(kzx kzx2) {
        super(kzx2);
    }

    @Override
    protected DefaultTreeModel t() {
        ler ler2 = this.dqt.eqq();
        if (ler2 == null) {
            lfn.b(5, "SFXMLFunctionTreeView", "createTreeModel() RootNode is null.");
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
        ler ler3 = this.dqt.g(ler2);
        lae lae3 = null;
        while (ler3 != null) {
            lae3 = new lae(6, ler3.getType(), ler3.getName());
            lae2.add(lae3);
            this.a(ler3, lae3);
            ler3 = this.dqt.h(ler3);
        }
    }

    @Override
    protected JPopupMenu ekk() {
        JPopupMenu jPopupMenu = super.ekk();
        jPopupMenu.add(new JSeparator());
        this.qtZ = new AbstractAction(this, "Add Function"){
            final /* synthetic */ lac qqM;
            {
                this.qqM = lac2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qqM.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null || this.qqM.c((lae)treePath.getLastPathComponent())) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                String string = JOptionPane.showInputDialog(this.qqM, "Enter FunctionName", "Add Function", 3);
                if (string == null || string.trim().equals("")) {
                    return;
                }
                if (this.qqM.dqt.contains(string = string.trim())) {
                    lfn.b(0, "SFXMLFunctionTreeView.initPopupMenu()", "actionPerformed() Function already exists.");
                    return;
                }
                lae lae3 = new lae(6, this.qqM.dqt.getType(string), string);
                lae2.add(lae3);
                this.qqM.qtP.reload(lae2);
                int n = this.qqM.dqt.getType(lae2.getName());
                ler ler2 = this.qqM.dqt.acv(n);
                ldu ldu2 = new ldu();
                ldu2.setName(string);
                ldu2.setType(this.qqM.dqt.eqp());
                this.qqM.dqt.a(ler2, ldu2, null);
            }
        };
        this.qua = new AbstractAction(this, "Delete Function"){
            final /* synthetic */ lac qqM;
            {
                this.qqM = lac2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qqM.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null) {
                    return;
                }
                int n = JOptionPane.showConfirmDialog(this.qqM, "Do you really want to delete the node", "Deletion confirmation", 0);
                if (n == 1) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                lfn.b(1, "SFXMLFunctionTreeView", "actionPerformed() Removing node " + lae2.getName() + " and its descendants.");
                int n2 = this.qqM.dqt.getType(lae2.getName());
                ler ler2 = this.qqM.dqt.acv(n2);
                this.qqM.dqt.j(ler2);
                this.qqM.qtP.removeNodeFromParent(lae2);
                this.qqM.qoZ.yk(lae2.getName());
            }
        };
        this.qqK = new AbstractAction(this, "Save FunctionTree"){
            final /* synthetic */ lac qqM;
            {
                this.qqM = lac2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.qqM.qoZ.ekJ();
            }
        };
        this.qqL = new AbstractAction(this, "Save ObjectFunctionList"){
            final /* synthetic */ lac qqM;
            {
                this.qqM = lac2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.qqM.qoZ.ekG();
            }
        };
        jPopupMenu.add(this.qtZ);
        jPopupMenu.add(this.qqK);
        jPopupMenu.add(this.qqL);
        jPopupMenu.addSeparator();
        jPopupMenu.add(this.qua);
        return jPopupMenu;
    }

    @Override
    protected void ekl() {
        int n = JOptionPane.showConfirmDialog(this, "Do you really want to remove all\nnodes under the TrashCanNode?", "Empty TrashCan", 0);
        if (n == 0) {
            lfn.b(0, "SFXMLFunctionTreeView", "emptyTrashCan() Emptying TrashCan");
            lae lae2 = null;
            for (int i2 = this.qtR.getChildCount() - 1; i2 >= 0; --i2) {
                lae2 = (lae)this.qtR.getChildAt(i2);
                this.qtP.removeNodeFromParent(lae2);
                this.a(lae2);
                this.qoZ.ym(lae2.getName());
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
        int n = this.dqt.getType(lae2.getName());
        comparable = this.dqt.acv(n);
        this.dqt.j((ler)comparable);
    }
}

