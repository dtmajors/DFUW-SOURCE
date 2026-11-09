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

public class kzu
extends lau {
    protected Action qoM;
    protected les nOR = lea.enS();

    public kzu(kzx kzx2) {
        super(kzx2);
    }

    @Override
    protected DefaultTreeModel t() {
        ler ler2 = this.nOR.eqq();
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
        ler ler3 = this.nOR.g(ler2);
        lae lae3 = null;
        while (ler3 != null) {
            lae3 = new lae(1, ler3.getType(), ler3.getName());
            lae2.add(lae3);
            this.a(ler3, lae3);
            ler3 = this.nOR.h(ler3);
        }
    }

    @Override
    protected JPopupMenu ekk() {
        JPopupMenu jPopupMenu = super.ekk();
        jPopupMenu.add(new JSeparator());
        this.qtZ = new AbstractAction(this, "Add Action"){
            final /* synthetic */ kzu qoN;
            {
                this.qoN = kzu2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qoN.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null || this.qoN.c((lae)treePath.getLastPathComponent())) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                String string = JOptionPane.showInputDialog(this.qoN, "Enter ActionName", "Add Action", 3);
                if (string == null || string.trim().equals("")) {
                    return;
                }
                if (this.qoN.nOR.contains(string = string.trim())) {
                    return;
                }
                lae lae3 = new lae(1, this.qoN.nOR.getType(string), string);
                lae2.add(lae3);
                this.qoN.qtP.reload(lae2);
                int n = this.qoN.nOR.getType(lae2.getName());
                ler ler2 = this.qoN.nOR.acv(n);
                lby lby2 = new lby();
                lby2.setName(string);
                lby2.setType(this.qoN.nOR.eqp());
                lby2.yd(true);
                lby2.ye(true);
                lby2.yf(false);
                lby2.dP(0.5);
                lby2.yg(false);
                this.qoN.nOR.a(ler2, lby2, null);
            }
        };
        this.qua = new AbstractAction(this, "Delete Action"){
            final /* synthetic */ kzu qoN;
            {
                this.qoN = kzu2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qoN.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null) {
                    return;
                }
                int n = JOptionPane.showConfirmDialog(this.qoN, "Do you really want to delete the node", "Deletion confirmation", 0);
                if (n == 1) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                int n2 = this.qoN.nOR.getType(lae2.getName());
                ler ler2 = this.qoN.nOR.acv(n2);
                this.qoN.nOR.j(ler2);
                this.qoN.qtP.removeNodeFromParent(lae2);
            }
        };
        this.qoM = new AbstractAction(this, "Save ActionTree"){
            final /* synthetic */ kzu qoN;
            {
                this.qoN = kzu2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.qoN.qoZ.ekH();
            }
        };
        jPopupMenu.add(this.qtZ);
        jPopupMenu.add(this.qoM);
        jPopupMenu.addSeparator();
        jPopupMenu.add(this.qua);
        return jPopupMenu;
    }

    @Override
    protected void ekl() {
        int n = JOptionPane.showConfirmDialog(this, "Do you really want to remove all\nnodes under the TrashCanNode?", "Empty TrashCan", 0);
        if (n == 0) {
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
        int n = this.nOR.getType(lae2.getName());
        comparable = this.nOR.acv(n);
        this.nOR.j((ler)comparable);
    }
}

