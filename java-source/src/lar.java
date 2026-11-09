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

public class lar
extends lau {
    protected Action qtv = null;
    protected les aqN = lea.enZ();

    public lar(kzx kzx2) {
        super(kzx2);
    }

    @Override
    protected DefaultTreeModel t() {
        ler ler2 = this.aqN.eqq();
        if (ler2 == null) {
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
        ler ler3 = this.aqN.g(ler2);
        lae lae3 = null;
        while (ler3 != null) {
            lae3 = new lae(17, ler3.getType(), ler3.getName());
            lae2.add(lae3);
            this.a(ler3, lae3);
            ler3 = this.aqN.h(ler3);
        }
    }

    @Override
    protected JPopupMenu ekk() {
        JPopupMenu jPopupMenu = super.ekk();
        jPopupMenu.add(new JSeparator());
        this.qtZ = new AbstractAction(this, "Add Skill"){
            final /* synthetic */ lar qtw;
            {
                this.qtw = lar2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qtw.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null || this.qtw.c((lae)treePath.getLastPathComponent())) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                String string = JOptionPane.showInputDialog(this.qtw, "Enter SkillName", "Add Skill to '" + lae2.getName() + "'", 3);
                if (string == null || string.trim().equals("")) {
                    return;
                }
                if (this.qtw.aqN.contains(string = string.trim())) {
                    return;
                }
                lae lae3 = new lae(17, this.qtw.aqN.getType(string), string);
                lae2.add(lae3);
                this.qtw.qtP.reload(lae2);
                int n = this.qtw.aqN.getType(lae2.getName());
                ler ler2 = this.qtw.aqN.acv(n);
                lhg lhg2 = new lhg();
                lhg2.setName(string);
                lhg2.setType(this.qtw.aqN.eqp());
                lhg2.yu(false);
                lhg2.a(new lhu(32, 32, "gui_icon_generic_32x32.bmp"));
                lhg2.yv(false);
                lhg2.yw(false);
                this.qtw.aqN.a(ler2, lhg2, null);
            }
        };
        this.qua = new AbstractAction(this, "Delete Skill"){
            final /* synthetic */ lar qtw;
            {
                this.qtw = lar2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qtw.qtO.getSelectionModel().getSelectionPath();
                if (treePath != null) {
                    lae lae2 = (lae)treePath.getLastPathComponent();
                    if (lae2.isNodeAncestor(this.qtw.qtR)) {
                        this.qtw.qtP.removeNodeFromParent(lae2);
                        this.qtw.qoZ.ym(lae2.getName());
                    } else {
                        int n = this.qtw.aqN.getType(lae2.getName());
                        ler ler2 = this.qtw.aqN.acv(n);
                        this.qtw.aqN.j(ler2);
                        this.qtw.qtP.removeNodeFromParent(lae2);
                        this.qtw.qtR.add(lae2);
                        this.qtw.qtP.reload(this.qtw.qtR);
                    }
                }
            }
        };
        this.qtv = new AbstractAction(this, "Save SkillTree"){
            final /* synthetic */ lar qtw;
            {
                this.qtw = lar2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.qtw.qoZ.ekP();
            }
        };
        jPopupMenu.add(this.qtZ);
        jPopupMenu.add(this.qtv);
        jPopupMenu.addSeparator();
        jPopupMenu.add(this.qua);
        return jPopupMenu;
    }

    @Override
    protected void ekl() {
        int n = JOptionPane.showConfirmDialog(this, "Do you really want to remove all\nnodes under the TrashCanNode?", "Empty TrashCan", 0);
        if (n == 0) {
            lae lae2 = null;
            for (int i = this.qtR.getChildCount() - 1; i >= 0; --i) {
                lae2 = (lae)this.qtR.getChildAt(i);
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
        int n = this.aqN.getType(lae2.getName());
        comparable = this.aqN.acv(n);
        this.aqN.j((ler)comparable);
    }
}

