/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  kzx
 */
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;

public class lai
extends lau {
    private int qrT = 0;
    private String qmN = null;
    private Map qrU = null;
    private boolean qrV = false;
    private les ResourceTree = lea.enW();

    public lai(kzx kzx2) {
        super(kzx2);
    }

    @Override
    public void init() {
        super.init();
        this.qtO.setCellRenderer(new kzo());
    }

    public void a(int n, String string, Map map, boolean bl) {
        if (n <= 0) {
            lfn.b(5, "SFXMLPaperDollTreeView", "setPaperdollItemMap() ResourceType is invalid.");
            return;
        }
        if (map == null) {
            lfn.b(5, "SFXMLPaperDollTreeView", "setPaperdollItemMap() PaperdollItemMap is null.");
            return;
        }
        this.qrT = n;
        this.qmN = string;
        this.qrU = map;
        this.qrV = bl;
        this.qtU.actionPerformed(null);
    }

    @Override
    protected DefaultTreeModel t() {
        this.qtQ = this.qrV ? new lae(16, 0, "PaperdollNPCNodes") : new lae(16, 0, "PaperdollNodes");
        if (this.qrU == null) {
            DefaultTreeModel defaultTreeModel = new DefaultTreeModel(this.qtQ);
            return defaultTreeModel;
        }
        ArrayList<lae> arrayList = lcn.emv();
        for (cam cam2 : this.qrU.values()) {
            lae lae2 = this.d(cam2);
            arrayList.add(lae2);
        }
        Collections.sort(arrayList);
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            this.qtQ.add((lae)arrayList.get(i2));
        }
        DefaultTreeModel defaultTreeModel = new DefaultTreeModel(this.qtQ);
        return defaultTreeModel;
    }

    @Override
    protected JPopupMenu ekk() {
        JPopupMenu jPopupMenu = super.ekk();
        jPopupMenu.add(new JSeparator());
        this.qtZ = new AbstractAction(this, "Add Node"){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ lai qrW;
            {
                this.qrW = lai2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                Object object;
                String string;
                TreePath treePath = this.qrW.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null || this.qrW.c((lae)treePath.getLastPathComponent())) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                int n = -1;
                Object[] objectArray = null;
                switch (lae2.getNodeType()) {
                    case 2: 
                    case 3: 
                    case 22: {
                        objectArray = new String[]{"MaterialShaderPairNode"};
                        break;
                    }
                    case 10: 
                    case 11: {
                        objectArray = new String[]{"AttachedMeshNode", "DummyMeshNode", "SubsetMeshNode"};
                        break;
                    }
                    case 16: {
                        string = this.qrW.qoZ.u();
                        if (string == null || string.trim().equals("")) {
                            lfn.b(5, "SFXMLPaperDollTreeView.AddNode", "actionPerformed() No resorce has been selected.");
                            return;
                        }
                        n = lai.a(this.qrW).getType(string);
                        if (n <= 0) {
                            lfn.b(5, "SFXMLPaperDollTreeView.AddNode", "actionPerformed() The selected resorce is invalid.");
                            return;
                        }
                        if (lai.b(this.qrW)) {
                            objectArray = new String[]{"PaperdollNPCNode"};
                            break;
                        }
                        object = new can(n);
                        if (lai.c(this.qrW).containsKey(object)) {
                            lfn.b(5, "SFXMLPaperDollTreeView.AddNode", "actionPerformed() The selected resorce already has a paperdollitem.");
                            return;
                        }
                        objectArray = new String[]{"PaperdollNode"};
                        break;
                    }
                    default: {
                        return;
                    }
                }
                string = (String)JOptionPane.showInputDialog(this.qrW, "Select NodeType", "Add Node", 3, null, objectArray, "MaterialNode");
                if (string == null) {
                    return;
                }
                object = null;
                if (string.equals("AttachedMeshNode")) {
                    cai cai2 = lai.a(this.qrW, cai.a.eeL);
                    cam cam2 = (cam)lae2.getValue();
                    cam2.b(cai2);
                    object = lai.a(this.qrW, cai2);
                } else if (string.equals("DummyMeshNode")) {
                    cai cai3 = lai.a(this.qrW, cai.a.eeM);
                    cam cam3 = (cam)lae2.getValue();
                    cam3.b(cai3);
                    object = lai.a(this.qrW, cai3);
                } else if (string.equals("MaterialShaderPairNode")) {
                    cah cah2 = lai.d(this.qrW);
                    cai cai4 = (cai)lae2.getValue();
                    cah2.oo(cai4.aGe());
                    cai4.a(cah2);
                    object = lai.a(this.qrW, cah2);
                } else if (string.equals("PaperdollNode")) {
                    cam cam4 = lai.e(this.qrW);
                    cam4.l(n);
                    can can2 = new can(cam4.az());
                    lai.c(this.qrW).put(can2, cam4);
                    object = lai.a(this.qrW, cam4);
                } else if (string.equals("PaperdollNPCNode")) {
                    Object[] objectArray2 = bqm.auC();
                    String string2 = (String)JOptionPane.showInputDialog(this.qrW, "Select NPCType", "Add Node", 3, null, objectArray2, "NULL");
                    if (string2 == null) {
                        return;
                    }
                    int n2 = bqm.gc(string2);
                    if (n2 <= 0) {
                        lfn.b(5, "SFXMLPaperDollTreeView.AddNode", "actionPerformed() NPCName '" + string2 + "' is invalid.");
                        return;
                    }
                    if (!lai.a(this.qrW).k(n, cug.fia, false)) {
                        lfn.b(5, "SFXMLPaperDollTreeView.AddNode", "actionPerformed() The selected resource is not an npc resource.");
                        return;
                    }
                    cap cap2 = new cap(n, n2);
                    if (lai.c(this.qrW).containsKey(cap2)) {
                        lfn.b(5, "SFXMLPaperDollTreeView.AddNode", "actionPerformed() A paperdollitemnpc is already mapped to key: " + cap2);
                        return;
                    }
                    cao cao2 = lai.f(this.qrW);
                    cao2.l(n);
                    cao2.fx(n2);
                    lai.c(this.qrW).put(cap2, cao2);
                    object = lai.a(this.qrW, cao2);
                } else if (string.equals("SubsetMeshNode")) {
                    cai cai5 = lai.a(this.qrW, cai.a.eeN);
                    cam cam5 = (cam)lae2.getValue();
                    cam5.b(cai5);
                    object = lai.a(this.qrW, cai5);
                }
                if (!$assertionsDisabled && object == null) {
                    throw new AssertionError();
                }
                lae2.add((MutableTreeNode)object);
                this.qrW.qtP.reload(lae2);
                this.qrW.qtO.getSelectionModel().setSelectionPath(treePath.pathByAddingChild(object));
                switch (((lae)object).getNodeType()) {
                    case 2: 
                    case 3: 
                    case 22: {
                        this.qrW.qoZ.d((cai)((lae)object).getValue());
                        break;
                    }
                    case 8: {
                        this.qrW.qoZ.d((cah)((lae)object).getValue());
                        break;
                    }
                    case 10: 
                    case 11: {
                        this.qrW.qoZ.b((cam)((lae)object).getValue());
                        break;
                    }
                    default: {
                        return;
                    }
                }
            }

            static {
                $assertionsDisabled = !lai.class.desiredAssertionStatus();
            }
        };
        AbstractAction abstractAction = new AbstractAction(this, "Create NodeCopy"){
            final /* synthetic */ lai qrW;
            {
                this.qrW = lai2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qrW.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null || this.qrW.c((lae)treePath.getLastPathComponent())) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                switch (lae2.getNodeType()) {
                    case 2: 
                    case 3: 
                    case 22: {
                        cai cai2 = ((cai)lae2.getValue()).aGb();
                        lae lae3 = (lae)lae2.getParent();
                        cam cam2 = (cam)lae3.getValue();
                        cam2.b(cai2);
                        lae lae4 = lai.a(this.qrW, cai2);
                        lae3.add(lae4);
                        this.qrW.qtP.reload(lae3);
                        this.qrW.qtO.getSelectionModel().setSelectionPath(treePath.getParentPath().pathByAddingChild(lae4));
                        this.qrW.qoZ.d(cai2);
                        break;
                    }
                    case 8: {
                        cah cah2 = ((cah)lae2.getValue()).aFX();
                        lae lae5 = (lae)lae2.getParent();
                        cai cai3 = (cai)lae5.getValue();
                        cah2.oo(cai3.aGe());
                        cai3.a(cah2);
                        lae lae6 = lai.a(this.qrW, cah2);
                        lae5.add(lae6);
                        this.qrW.qtP.reload(lae5);
                        this.qrW.qtO.getSelectionModel().setSelectionPath(treePath.getParentPath().pathByAddingChild(lae6));
                        this.qrW.qoZ.d(cah2);
                        break;
                    }
                    case 10: {
                        String string = this.qrW.qoZ.u();
                        if (string == null || string.trim().equals("")) {
                            lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() No resorce has been selected.");
                            return;
                        }
                        int n = lai.a(this.qrW).getType(string);
                        if (n <= 0) {
                            lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() The selected resorce is invalid.");
                            return;
                        }
                        can can2 = new can(n);
                        if (lai.c(this.qrW).containsKey(can2)) {
                            lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() The selected resorce already has a paperdollitem.");
                            return;
                        }
                        cam cam3 = ((cam)lae2.getValue()).aGj();
                        cam3.l(n);
                        lai.c(this.qrW).put(can2, cam3);
                        lae lae7 = lai.a(this.qrW, cam3);
                        this.qrW.qtQ.add(lae7);
                        this.qrW.qtP.reload(this.qrW.qtQ);
                        this.qrW.qtO.getSelectionModel().setSelectionPath(new TreePath(new Object[]{this.qrW.qtQ, lae7}));
                        this.qrW.qoZ.b((cam)lae7.getValue());
                        break;
                    }
                    case 11: {
                        String string = this.qrW.qoZ.u();
                        if (string == null || string.trim().equals("")) {
                            lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() No resorce has been selected.");
                            return;
                        }
                        int n = lai.a(this.qrW).getType(string);
                        if (n <= 0) {
                            lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() The selected resorce is invalid.");
                            return;
                        }
                        if (!lai.a(this.qrW).isDescendant(n, cug.fia)) {
                            lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() The selected resource is not an npc resource.");
                            return;
                        }
                        Object[] objectArray = bqm.auC();
                        String string2 = (String)JOptionPane.showInputDialog(this.qrW, "Select NPCType", "Create NodeCopy", 3, null, objectArray, "NULL");
                        if (string2 == null) {
                            return;
                        }
                        int n2 = bqm.gc(string2);
                        if (n2 <= 0) {
                            lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() NPCName '" + string2 + "' is invalid.");
                            return;
                        }
                        cap cap2 = new cap(n, n2);
                        if (lai.c(this.qrW).containsKey(cap2)) {
                            lfn.b(5, "SFXMLPaperDollTreeView.CreateNodeCopy", "actionPerformed() A paperdollitemnpc is already mapped to key: " + cap2);
                            return;
                        }
                        cao cao2 = (cao)((cam)lae2.getValue()).aGj();
                        cao2.l(n);
                        cao2.fx(n2);
                        lai.c(this.qrW).put(cap2, cao2);
                        lae lae8 = lai.a(this.qrW, cao2);
                        this.qrW.qtQ.add(lae8);
                        this.qrW.qtP.reload(this.qrW.qtQ);
                        this.qrW.qtO.getSelectionModel().setSelectionPath(new TreePath(new Object[]{this.qrW.qtQ, lae8}));
                        this.qrW.qoZ.b((cam)lae8.getValue());
                        break;
                    }
                    default: {
                        return;
                    }
                }
            }
        };
        this.qua = new AbstractAction(this, "Delete Node"){
            final /* synthetic */ lai qrW;
            {
                this.qrW = lai2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qrW.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                lfn.b(0, "SFXMLPaperDollTreeView.DeleteNode", "actionPerformed() Removing node '" + lae2.getName() + "' and its descendants.");
                int n = JOptionPane.showConfirmDialog(this.qrW, "Are you sure you want to remove selected node", "RemoveNode", 0);
                if (n == 1) {
                    return;
                }
                lae lae3 = (lae)lae2.getParent();
                switch (lae2.getNodeType()) {
                    case 2: 
                    case 3: 
                    case 22: {
                        cam cam2 = (cam)lae3.getValue();
                        if (cam2.aGi().length == 1) {
                            return;
                        }
                        cai cai2 = (cai)lae2.getValue();
                        cam2.c(cai2);
                        this.qrW.qoZ.d(null);
                        break;
                    }
                    case 8: {
                        cai cai3 = (cai)lae3.getValue();
                        if (cai3.aGa().length == 1) {
                            return;
                        }
                        cah cah2 = (cah)lae2.getValue();
                        cai3.b(cah2);
                        this.qrW.qoZ.d(null);
                        break;
                    }
                    case 10: 
                    case 11: {
                        can can2 = ((cam)lae2.getValue()).aGl();
                        lai.c(this.qrW).remove(can2);
                        this.qrW.qoZ.b(null);
                        this.qrW.qoZ.d(null);
                        this.qrW.qoZ.d(null);
                        break;
                    }
                    default: {
                        return;
                    }
                }
                this.qrW.qtP.removeNodeFromParent(lae2);
            }
        };
        AbstractAction abstractAction2 = new AbstractAction(this, "Save PaperdollTree"){
            final /* synthetic */ lai qrW;
            {
                this.qrW = lai2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (lai.g(this.qrW) <= 0 || lai.h(this.qrW) == null || lai.c(this.qrW) == null) {
                    return;
                }
                lai.a(this.qrW, lai.h(this.qrW), lai.c(this.qrW), lai.b(this.qrW));
            }
        };
        AbstractAction abstractAction3 = new AbstractAction(this, "Save All PaperdollTrees"){
            final /* synthetic */ lai qrW;
            {
                this.qrW = lai2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                for (Map.Entry<K, V> entry : lea.eot().entrySet()) {
                    if (!(entry.getKey() instanceof Integer)) continue;
                    int n = (Integer)entry.getKey();
                    if (n <= 0) {
                        lfn.b(5, "SFXMLPaperDollTreeView.SaveAllPaperdollTrees", "actionPerformed() ResourceType is invalid.");
                        continue;
                    }
                    String string = (String)entry.getValue();
                    if (string == null) {
                        lfn.b(5, "SFXMLPaperDollTreeView.SaveAllPaperdollTrees", "actionPerformed() FileName is null.");
                        continue;
                    }
                    Map<can, cam> map = lea.ack(n);
                    if (map == null) {
                        lfn.b(5, "SFXMLPaperDollTreeView.SaveAllPaperdollTrees", "actionPerformed() PaperdollItemMap is null.");
                        continue;
                    }
                    boolean bl = lai.a(this.qrW).isDescendant(n, cug.fia);
                    lai.a(this.qrW, string, map, bl);
                }
            }
        };
        AbstractAction abstractAction4 = new AbstractAction(this, "Select PaperdollItemMap"){
            final /* synthetic */ lai qrW;
            {
                this.qrW = lai2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                Object[] objectArray = lai.i(this.qrW);
                String string = (String)JOptionPane.showInputDialog(this.qrW, "Select PaperdollItemMap", "Select Map", 3, null, objectArray, lai.h(this.qrW));
                if (string == null) {
                    return;
                }
                Integer n = (Integer)lea.eot().get(string);
                if (n == null) {
                    lfn.b(5, "SFPaperDollTreeView.SelectPaperdollItemMap", "actionPerformed() No resourcetype was mapped to filename '" + string + "'");
                    return;
                }
                int n2 = n;
                Map<can, cam> map = lea.ack(n2);
                if (map == null) {
                    lfn.b(5, "SFPaperDollTreeView.SelectPaperdollItemMap", "actionPerformed() No PaperdollItemMap was mapped to resourcetype '" + lai.a(this.qrW).getName(n2) + "'");
                    return;
                }
                boolean bl = lai.a(this.qrW).k(n2, cug.fia, false);
                this.qrW.a(n2, string, map, bl);
            }
        };
        AbstractAction abstractAction5 = new AbstractAction(this, "Send PaperdollMessage"){
            final /* synthetic */ lai qrW;
            {
                this.qrW = lai2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (lai.g(this.qrW) <= 0 || lai.h(this.qrW) == null || lai.c(this.qrW) == null) {
                    return;
                }
                this.qrW.qoZ.aa(lai.g(this.qrW), lai.h(this.qrW));
            }
        };
        AbstractAction abstractAction6 = new AbstractAction(this, "Copy to other PaperdollMap"){
            final /* synthetic */ lai qrW;
            {
                this.qrW = lai2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qrW.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                if (lae2.getNodeType() != 10) {
                    return;
                }
                Object[] objectArray = lai.i(this.qrW);
                String string = (String)JOptionPane.showInputDialog(this.qrW, "Select PaperdollItemMap", "Select Map", 3, null, objectArray, lai.h(this.qrW));
                if (string == null) {
                    return;
                }
                Integer n = (Integer)lea.eot().get(string);
                if (n == null) {
                    lfn.b(5, "SFPaperDollTreeView.CopyToOtherMap", "actionPerformed() No resourcetype was mapped to filename '" + string + "'");
                    return;
                }
                int n2 = n;
                if (lai.a(this.qrW).isDescendant(n2, cug.fia)) {
                    return;
                }
                Map<can, cam> map = lea.ack(n2);
                if (map == null) {
                    lfn.b(5, "SFPaperDollTreeView.CopyToOtherMap", "actionPerformed() No PaperdollItemMap was mapped to resourcetype '" + lai.a(this.qrW).getName(n2) + "'");
                    return;
                }
                cam cam2 = (cam)lae2.getValue();
                if (map.containsKey(cam2.aGl())) {
                    lfn.b(1, "SFPaperDollTreeView.CopyToOtherMap", "actionPerformed() PaperdollItemMap already contains resource '" + cam2.pa() + "'");
                    return;
                }
                cam2 = cam2.aGj();
                map.put(cam2.aGl(), cam2);
            }
        };
        jPopupMenu.add(this.qtZ);
        jPopupMenu.add(abstractAction);
        jPopupMenu.add(this.quc);
        jPopupMenu.addSeparator();
        jPopupMenu.add(abstractAction4);
        jPopupMenu.add(abstractAction3);
        jPopupMenu.add(abstractAction2);
        jPopupMenu.addSeparator();
        jPopupMenu.add(abstractAction5);
        jPopupMenu.add(abstractAction6);
        jPopupMenu.addSeparator();
        jPopupMenu.add(this.qua);
        return jPopupMenu;
    }

    private cah elj() {
        cag cag2 = new cag();
        cag2.oo(0);
        cag2.j(new String[]{"dds\\texture_of_doom_01.dds"});
        cav cav2 = new cav();
        cav2.fv(false);
        cav2.oo(0);
        cav2.gW("ShaderDefault.xml");
        cah cah2 = new cah();
        cah2.a(cak.d.egA);
        cah2.b(cag2);
        cah2.a(cav2);
        return cah2;
    }

    private cai a(cai.a a2) {
        cai cai2;
        assert (a2 != null);
        cai cai3 = null;
        switch (a2) {
            case eeL: {
                cai2 = new bzu();
                ((bzu)cai2).a(cak.a.efu);
                ((bzu)cai2).setAttachPointName("AttachPoint_Engine");
                ((bzu)cai2).setFileName("NULL");
                cai3 = cai2;
                break;
            }
            case eeM: {
                cai2 = new caa();
                ((caa)cai2).a(cak.b.efB);
                cai3 = cai2;
                break;
            }
            case eeN: {
                cai2 = new cax();
                ((cax)cai2).a(cak.g.ehi);
                ((cax)cai2).setFileName("NULL");
                cai3 = cai2;
                break;
            }
            default: {
                lfn.b(5, "SFXMLPaperDollTreeView", "createDefaultMeshItem() Invalid meshitemtype provided: " + (Object)((Object)a2));
                assert (false);
                return null;
            }
        }
        cai3.eA(0);
        cai2 = new cah[]{this.elj()};
        cai3.a((cah[])cai2);
        return cai3;
    }

    private cam elk() {
        cam cam2 = new cam();
        cam2.a(new cai[]{this.a(cai.a.eeN)});
        return cam2;
    }

    private cao ell() {
        cao cao2 = new cao();
        cao2.a(new cai[]{this.a(cai.a.eeN)});
        return cao2;
    }

    private lae f(cah cah2) {
        assert (cah2 != null);
        assert (cah2.aFT() != null);
        assert (cah2.aFU() != null);
        return new lae(8, cah2);
    }

    private lae f(cai cai2) {
        assert (cai2 != null);
        assert (cai2.aGa() != null);
        lae lae2 = null;
        switch (cai2.aFY()) {
            case eeL: {
                lae2 = new lae(2, cai2);
                break;
            }
            case eeM: {
                lae2 = new lae(3, cai2);
                break;
            }
            case eeN: {
                lae2 = new lae(22, cai2);
                break;
            }
            default: {
                lfn.b(5, "SFXMLPaperDollTreeView", "createMeshNode() Invalid meshitemtype provided: " + (Object)((Object)cai2.aFY()));
                assert (false);
                return null;
            }
        }
        cah[] cahArray = cai2.aGa();
        int n = cahArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            assert (cahArray[i2] != null);
            assert (cahArray[i2].aFT() != null);
            assert (cahArray[i2].aFU() != null);
            lae lae3 = this.f(cahArray[i2]);
            lae2.add(lae3);
        }
        return lae2;
    }

    private void a(lae lae2, cam cam2) {
        assert (lae2 != null);
        assert (cam2 != null);
        assert (cam2.aGi() != null);
        cai[] caiArray = cam2.aGi();
        for (int i2 = 0; i2 < caiArray.length; ++i2) {
            lae lae3 = this.f(caiArray[i2]);
            lae2.add(lae3);
        }
    }

    private lae d(cam cam2) {
        assert (cam2 != null);
        assert (cam2.aGi() != null);
        lae lae2 = null;
        String string = cam2.aGk();
        lae2 = this.qrV ? new lae(11, cam2.az(), string, cam2) : new lae(10, cam2.az(), string, cam2);
        this.a(lae2, cam2);
        return lae2;
    }

    private String[] elm() {
        Object object;
        Iterator iterator = lea.eot().values().iterator();
        ArrayList arrayList = lcn.abH(2);
        while (iterator.hasNext()) {
            object = iterator.next();
            if (!(object instanceof String)) continue;
            arrayList.add(object);
        }
        Collections.sort(arrayList);
        object = new String[arrayList.size()];
        arrayList.toArray((T[])object);
        return object;
    }

    private void b(String string, Map map, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("'");
        stringBuilder.append(string);
        stringBuilder.append("' could not be saved\n");
        stringBuilder.append("Mismatching # of materials and shaders found:\n\n");
        boolean bl2 = false;
        if (bl2) {
            JOptionPane.showMessageDialog(this, stringBuilder.toString(), "PaperdollItemMap could not be saved", 0);
            return;
        }
        this.qoZ.b(string, map, bl);
    }

    static /* synthetic */ les a(lai lai2) {
        return lai2.ResourceTree;
    }

    static /* synthetic */ boolean b(lai lai2) {
        return lai2.qrV;
    }

    static /* synthetic */ Map c(lai lai2) {
        return lai2.qrU;
    }

    static /* synthetic */ cai a(lai lai2, cai.a a2) {
        return lai2.a(a2);
    }

    static /* synthetic */ lae a(lai lai2, cai cai2) {
        return lai2.f(cai2);
    }

    static /* synthetic */ cah d(lai lai2) {
        return lai2.elj();
    }

    static /* synthetic */ lae a(lai lai2, cah cah2) {
        return lai2.f(cah2);
    }

    static /* synthetic */ cam e(lai lai2) {
        return lai2.elk();
    }

    static /* synthetic */ lae a(lai lai2, cam cam2) {
        return lai2.d(cam2);
    }

    static /* synthetic */ cao f(lai lai2) {
        return lai2.ell();
    }

    static /* synthetic */ int g(lai lai2) {
        return lai2.qrT;
    }

    static /* synthetic */ String h(lai lai2) {
        return lai2.qmN;
    }

    static /* synthetic */ void a(lai lai2, String string, Map map, boolean bl) {
        lai2.b(string, map, bl);
    }

    static /* synthetic */ String[] i(lai lai2) {
        return lai2.elm();
    }
}

