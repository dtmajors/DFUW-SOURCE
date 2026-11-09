/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  kzx
 */
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class lag
extends lau {
    private Action qrs;
    private les dqu = lea.enV();
    private String[] qrt = new String[0];

    public lag(kzx kzx2) {
        super(kzx2);
    }

    public String[] ekC() {
        return this.qrt;
    }

    @Override
    protected DefaultTreeModel t() {
        ler ler2 = this.dqu.eqq();
        if (ler2 == null) {
            lfn.b(5, "SFXMLObjectTreeView", "createTreeModel() RootNode is null.");
            return new DefaultTreeModel(new lae(16, 0, "RootNode"));
        }
        ArrayList<String> arrayList = lcn.emv();
        arrayList.add(ler2.getName());
        this.qtQ = new lae(16, 0, ler2.getName());
        DefaultTreeModel defaultTreeModel = new DefaultTreeModel(this.qtQ);
        this.a(ler2, this.qtQ, arrayList);
        Collections.sort(arrayList);
        this.qrt = arrayList.toArray(new String[arrayList.size()]);
        return defaultTreeModel;
    }

    private void a(ler ler2, lae lae2, List list) {
        ler ler3 = this.dqu.g(ler2);
        lae lae3 = null;
        while (ler3 != null) {
            lae3 = new lae(9, ler3.getType(), ler3.getName());
            lae2.add(lae3);
            list.add(ler3.getName());
            this.a(ler3, lae3, list);
            ler3 = this.dqu.h(ler3);
        }
    }

    @Override
    protected JPopupMenu ekk() {
        JPopupMenu jPopupMenu = super.ekk();
        jPopupMenu.add(new JSeparator());
        this.qtZ = new AbstractAction(this, "Add Object"){
            final /* synthetic */ lag qru;
            {
                this.qru = lag2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qru.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null || this.qru.c((lae)treePath.getLastPathComponent())) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                String string = (String)JOptionPane.showInputDialog(this.qru, "Select ObjectType", "Add ObjectType", 3, null, lag.a(this.qru), lag.a(this.qru)[0]);
                if (lag.b(this.qru).contains(string)) {
                    lfn.b(0, "SFXMLObjectTreeView.initPopupMenu()", "actionPerformed() ObjectType already exists.");
                    return;
                }
                lae lae3 = new lae(9, amh.dn(string), string);
                lae2.add(lae3);
                this.qru.qtP.reload(lae2);
                int n = lag.b(this.qru).getType(lae2.getName());
                ler ler2 = lag.b(this.qru).acv(n);
                lfl lfl2 = new lfl();
                lfl2.setName(string);
                lfl2.setType(this.qru.qoZ.dn(string));
                lag.b(this.qru).a(ler2, lfl2, null);
            }
        };
        this.qua = new AbstractAction(this, "Delete Object"){
            final /* synthetic */ lag qru;
            {
                this.qru = lag2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qru.qtO.getSelectionModel().getSelectionPath();
                if (treePath != null) {
                    ler ler2;
                    lae lae2 = (lae)treePath.getLastPathComponent();
                    this.qru.qtP.removeNodeFromParent(lae2);
                    int n = this.qru.qoZ.dn(lae2.getName());
                    if (n > 0 && (ler2 = lag.b(this.qru).acv(n)) != null) {
                        lag.b(this.qru).j(ler2);
                    }
                }
            }
        };
        this.qrs = new AbstractAction(this, "Save ObjectTree"){
            final /* synthetic */ lag qru;
            {
                this.qru = lag2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.qru.qoZ.ekL();
            }
        };
        jPopupMenu.add(this.qtZ);
        jPopupMenu.add(this.qrs);
        jPopupMenu.addSeparator();
        jPopupMenu.add(this.qua);
        return jPopupMenu;
    }

    static /* synthetic */ String[] a(lag lag2) {
        return lag2.qrt;
    }

    static /* synthetic */ les b(lag lag2) {
        return lag2.dqu;
    }
}

