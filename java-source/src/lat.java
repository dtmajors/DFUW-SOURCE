/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 *  kzx
 */
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class lat
extends lau {
    public static final String qtG = "SpecialEffectNodes";
    private Action qtH;
    private Action qsK;
    private Action qtI;
    private dhj pdR = new dhj();
    private String[] ghu = del.bkK();
    private Map pdS = lea.eoo();
    private Map gmH = lea.bkO();
    private List<lae> qtJ = lcn.emv();
    private Map<String, lae> qtK = null;

    public lat(kzx kzx2) {
        super(kzx2);
    }

    @Override
    public void init() {
        super.init();
        this.qtO.setCellRenderer(new kzs());
    }

    @Override
    protected DefaultTreeModel t() {
        Serializable serializable;
        block3: {
            Object object2;
            this.qtQ = new lae(16, 0, qtG);
            this.qtK = lcn.emw();
            this.qtK.put(this.qtQ.getName().toLowerCase(), this.qtQ);
            Map<String, lae> map = lcn.emw();
            for (Object object2 : this.gmH.values()) {
                serializable = this.c((dgj)object2, false);
                map.put(serializable.getName().toLowerCase(), (lae)serializable);
            }
            kbw kbw2 = new kbw();
            object2 = "xml-files/common/specialeffect/specialeffecttree.xml";
            try {
                kbw2.b((String)object2, this.qtK, map);
            }
            catch (bg bg2) {
                lfn.log("SFXMLSpecialEffectTreeView", bg2);
                if ($assertionsDisabled) break block3;
                throw new AssertionError();
            }
        }
        serializable = new DefaultTreeModel(this.qtQ);
        return serializable;
    }

    @Override
    protected JPopupMenu ekk() {
        JPopupMenu jPopupMenu = super.ekk();
        jPopupMenu.add(new JSeparator());
        this.qtZ = new AbstractAction(this, "Add Node"){
            final /* synthetic */ lat qtL;
            {
                this.qtL = lat2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qtL.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null || this.qtL.c((lae)treePath.getLastPathComponent())) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                switch (lae2.getNodeType()) {
                    case 16: {
                        String string = JOptionPane.showInputDialog(this.qtL, "Enter SpecialEffectName", "se_");
                        if (string == null || string.trim().equals("")) {
                            return;
                        }
                        if (del.iI(string)) {
                            lfn.b(5, "SFXMLSpecialEffectTreeView.AddNode", "actionPerformed() There already exists a specialeffect with the name='" + string + "'");
                            return;
                        }
                        String string2 = (String)JOptionPane.showInputDialog(this.qtL, "Select EffectClassType", "Add Node", 3, null, lat.a(this.qtL), lat.a(this.qtL)[0]);
                        if (string2 == null) {
                            return;
                        }
                        if (!lat.b(this.qtL).containsKey(string2)) {
                            lfn.b(5, "SFXMLSpecialEffectTreeView.AddNode", "actionPerformed() EffectClass '" + string2 + "' has not been reflected.");
                            return;
                        }
                        lae lae3 = lat.a(this.qtL, string, string2);
                        if (lae3 == null) {
                            lfn.b(5, "SFXMLSpecialEffectTreeView.AddNode", "actionPerformed() NewEffectNode is null for EffectClass='" + string2 + "'");
                            return;
                        }
                        dgj dgj2 = (dgj)lae3.getValue();
                        lat.c(this.qtL).put(dgj2.getSpecialEffectType(), dgj2);
                        lae2.add(lae3);
                        this.qtL.qtP.reload(lae2);
                        this.qtL.qtO.getSelectionModel().setSelectionPath(treePath.pathByAddingChild(lae3));
                        this.qtL.qoZ.a(dgj2, false);
                        break;
                    }
                    case 19: {
                        String string = (String)JOptionPane.showInputDialog(this.qtL, "Select EffectClassType", "Add Node", 3, null, lat.a(this.qtL), lat.a(this.qtL)[0]);
                        if (string == null) {
                            return;
                        }
                        int n = del.iF(string);
                        if (n <= 0) {
                            lfn.b(5, "SFXMLSpecialEffectTreeView.AddNode", "actionPerformed() EffectClassName '" + string + "' is invalid.");
                            return;
                        }
                        dgj dgj3 = lat.d(this.qtL).Al(n);
                        lae lae4 = lat.a(this.qtL, dgj3, true);
                        if (lae4 == null) {
                            lfn.b(5, "SFXMLSpecialEffectTreeView.AddNode", "actionPerformed() NewEffectNode is null for EffectClass='" + string + "'");
                            return;
                        }
                        dgj dgj4 = (dgj)lae2.getValue();
                        dkw dkw2 = dgj4.getContainerManager();
                        if (dkw2 == null) {
                            dkw2 = new dkw();
                            dgj4.setContainerManager(dkw2);
                        }
                        dgj3.setEffectInstanceID(dkw2.bob());
                        dgj3.setDefaultValues();
                        dkw2.e(dgj3);
                        lae2.add(lae4);
                        this.qtL.qtP.reload(lae2);
                        this.qtL.qtO.getSelectionModel().setSelectionPath(treePath.pathByAddingChild(lae4));
                        this.qtL.qoZ.a(dgj3, true);
                        break;
                    }
                    default: {
                        return;
                    }
                }
            }
        };
        this.qtH = new AbstractAction(this, "Add ChildNodeCopy"){
            final /* synthetic */ lat qtL;
            {
                this.qtL = lat2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qtL.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null || this.qtL.c((lae)treePath.getLastPathComponent())) {
                    return;
                }
                dgj dgj2 = this.qtL.qoZ.ekt();
                if (dgj2 == null) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                dgj dgj3 = dgj2.createCopy();
                dgj dgj4 = (dgj)lae2.getValue();
                dkw dkw2 = dgj4.getContainerManager();
                if (dkw2 == null) {
                    dkw2 = new dkw();
                    dgj4.setContainerManager(dkw2);
                }
                dgj3.setEffectInstanceID(dkw2.bob());
                dkw2.e(dgj3);
                lae lae3 = lat.a(this.qtL, dgj3, true);
                lae2.add(lae3);
                this.qtL.qtP.reload(lae2);
                this.qtL.qtO.getSelectionModel().setSelectionPath(treePath.getParentPath().pathByAddingChild(lae3));
                this.qtL.qoZ.a(dgj3, true);
            }
        };
        this.qsK = new AbstractAction(this, "Create NodeCopy"){
            final /* synthetic */ lat qtL;
            {
                this.qtL = lat2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qtL.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null || this.qtL.c((lae)treePath.getLastPathComponent())) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                switch (lae2.getNodeType()) {
                    case 19: {
                        String string = JOptionPane.showInputDialog(this.qtL, "Enter SpecialEffectName", "se_");
                        if (string == null || string.trim().equals("")) {
                            return;
                        }
                        int n = del.iH(string);
                        if (n <= 0) {
                            lfn.b(5, "SFXMLSpecialEffectTreeView.CreateNodeCopy", "actionPerformed() Unable to create mapping for the specialeffect.");
                            return;
                        }
                        dgj dgj2 = ((dgj)lae2.getValue()).createCopy();
                        dgj2.setSpecialEffectType(n);
                        lat.c(this.qtL).put(dgj2.getSpecialEffectType(), dgj2);
                        lae lae3 = lat.a(this.qtL, dgj2, false);
                        lae lae4 = (lae)lae2.getParent();
                        lae4.add(lae3);
                        this.qtL.qtP.reload(lae4);
                        this.qtL.qtO.getSelectionModel().setSelectionPath(treePath.getParentPath().pathByAddingChild(lae3));
                        this.qtL.qoZ.a(dgj2, false);
                        break;
                    }
                    case 21: {
                        dgj dgj3 = ((dgj)lae2.getValue()).createCopy();
                        lae lae5 = (lae)lae2.getParent();
                        dgj dgj4 = (dgj)lae5.getValue();
                        dkw dkw2 = dgj4.getContainerManager();
                        if (dkw2 == null) {
                            dkw2 = new dkw();
                            dgj4.setContainerManager(dkw2);
                        }
                        dgj3.setEffectInstanceID(dkw2.bob());
                        dkw2.e(dgj3);
                        lae lae6 = lat.a(this.qtL, dgj3, true);
                        lae5.add(lae6);
                        this.qtL.qtP.reload(lae5);
                        this.qtL.qtO.getSelectionModel().setSelectionPath(treePath.getParentPath().pathByAddingChild(lae6));
                        this.qtL.qoZ.a(dgj3, true);
                        break;
                    }
                    default: {
                        return;
                    }
                }
            }
        };
        this.qua = new AbstractAction(this, "Delete Node"){
            final /* synthetic */ lat qtL;
            {
                this.qtL = lat2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qtL.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null) {
                    return;
                }
                int n = JOptionPane.showConfirmDialog(this.qtL, "Do you really want to delete the node", "Deletion confirmation", 0);
                if (n == 1) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                lfn.b(0, "SFXMLSpecialEffectTreeView.DeleteNode", "actionPerformed() Removing node '" + lae2.getName() + "' and its descendants.");
                lae lae3 = (lae)lae2.getParent();
                switch (lae2.getNodeType()) {
                    case 19: {
                        dgj dgj2 = (dgj)lae2.getValue();
                        lat.c(this.qtL).remove(new Integer(dgj2.getSpecialEffectType()));
                        del.n(dgj2.getSpecialEffectName(), dgj2.getSpecialEffectType());
                        this.qtL.qoZ.a(null, false);
                        break;
                    }
                    case 21: {
                        dgj dgj3 = (dgj)lae3.getValue();
                        dkw dkw2 = dgj3.getContainerManager();
                        if (dkw2 == null) {
                            lfn.b(5, "SFXMLSpecialEffectTreeView.DeleteNode", "actionPerformed() Effect '" + dgj3.getSpecialEffectName() + "' has subeffect but no containermanager.");
                            return;
                        }
                        dgj dgj4 = (dgj)lae2.getValue();
                        dkw2.f(dgj4);
                        if (dkw2.bnY() == null || dkw2.bnY().length == 0) {
                            dgj3.setContainerManager(null);
                        }
                        this.qtL.qoZ.a(null, true);
                        break;
                    }
                    default: {
                        return;
                    }
                }
                this.qtL.qtP.removeNodeFromParent(lae2);
            }
        };
        this.qtI = new AbstractAction(this, "Save SpecialEffectTree"){
            final /* synthetic */ lat qtL;
            {
                this.qtL = lat2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.qtL.qoZ.aa(lat.c(this.qtL));
            }
        };
        jPopupMenu.add(this.qtZ);
        jPopupMenu.add(this.qtH);
        jPopupMenu.add(this.qsK);
        jPopupMenu.add(this.qtI);
        jPopupMenu.add(this.quc);
        jPopupMenu.addSeparator();
        jPopupMenu.add(this.qua);
        return jPopupMenu;
    }

    private dgj Al(int n) {
        dgj dgj2 = this.pdR.Al(n);
        if (dgj2 == null) {
            lfn.b(5, "SFXMLSpecialEffectTreeView", "createSpecialEffect() Unknown EffectClassType provided: " + n);
            return null;
        }
        dgj2.setDefaultValues();
        return dgj2;
    }

    private lae c(dgj dgj2, boolean bl) {
        lae lae2 = null;
        if (bl) {
            lae2 = new lae(21, dgj2.getSpecialEffectType(), dgj2.getEffectClassName() + "  (Sub)", dgj2);
            dgj2.setSubEffect(true);
        } else {
            lae2 = new lae(19, dgj2.getSpecialEffectType(), dgj2.getSpecialEffectName(), dgj2);
        }
        if (dgj2.getContainerManager() != null) {
            dgj[] dgjArray = dgj2.getContainerManager().bnY();
            assert (dgjArray != null);
            lae lae3 = null;
            int n = dgjArray.length;
            for (int i = 0; i < n; ++i) {
                lae3 = this.c(dgjArray[i], true);
                lae2.add(lae3);
            }
        }
        return lae2;
    }

    private lae au(String string, String string2) {
        int n = del.iF(string2);
        if (n <= 0) {
            lfn.b(5, "SFXMLSpecialEffectTreeView", "createSpecialEffectNode() EffectClassName '" + string2 + "' is invalid.");
            return null;
        }
        int n2 = del.iH(string);
        if (n2 <= 0) {
            lfn.b(5, "SFXMLSpecialEffectTreeView", "createSpecialEffectNode() Unable to create mapping for the specialeffect.");
            return null;
        }
        dgj dgj2 = this.Al(n);
        if (dgj2 == null) {
            lfn.b(5, "SFXMLSpecialEffectTreeView", "createSpecialEffectNode() An instance of EffectClass'" + string2 + "' could not be created.");
            return null;
        }
        dgj2.setSpecialEffectType(n2);
        return new lae(19, n2, string, dgj2);
    }

    static /* synthetic */ String[] a(lat lat2) {
        return lat2.ghu;
    }

    static /* synthetic */ Map b(lat lat2) {
        return lat2.pdS;
    }

    static /* synthetic */ lae a(lat lat2, String string, String string2) {
        return lat2.au(string, string2);
    }

    static /* synthetic */ Map c(lat lat2) {
        return lat2.gmH;
    }

    static /* synthetic */ dhj d(lat lat2) {
        return lat2.pdR;
    }

    static /* synthetic */ lae a(lat lat2, dgj dgj2, boolean bl) {
        return lat2.c(dgj2, bl);
    }
}

