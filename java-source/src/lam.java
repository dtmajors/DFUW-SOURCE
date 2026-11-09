/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  kzx
 */
import java.awt.event.ActionEvent;
import java.util.Iterator;
import java.util.Map;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class lam
extends lau {
    private Action qsK;
    private Action qsL;
    private Action qsM;
    private Map qsN = null;
    private Map qsO = null;
    private les ResourceTree = lea.enW();
    private les aqN = lea.enZ();

    public lam(kzx kzx2) {
        super(kzx2);
    }

    @Override
    public void init() {
        super.init();
        this.qtO.setCellRenderer(new kzp());
    }

    @Override
    protected DefaultTreeModel t() {
        this.qtQ = new lae(16, 0, "Recipes");
        DefaultTreeModel defaultTreeModel = new DefaultTreeModel(this.qtQ);
        return defaultTreeModel;
    }

    private lae j(ctu ctu2) {
        lae lae2 = new lae(12, ctu2);
        this.a((ctt)ctu2, lae2);
        if (ctu2.bbI() != null) {
            this.a(ctu2, lae2);
        }
        return lae2;
    }

    private lae c(ctv ctv2) {
        lae lae2 = new lae(13, ctv2);
        this.a((ctt)ctv2, lae2);
        this.a(ctv2, lae2);
        return lae2;
    }

    private void a(ctv ctv2, lae lae2) {
    }

    private void a(ctt ctt2, lae lae2) {
        assert (ctt2 != null);
        assert (lae2 != null);
        assert (ctt2.Ingredients != null);
        ctm[] ctmArray = ctt2.Ingredients;
        for (int i = 0; i < ctmArray.length; ++i) {
            lae2.add(new lae(7, ctmArray[i]));
        }
    }

    private void a(ctu ctu2, lae lae2) {
        assert (ctu2 != null);
        assert (lae2 != null);
        assert (ctu2.bbI() != null);
        ctz[] ctzArray = ctu2.bbI();
        for (int i = 0; i < ctzArray.length; ++i) {
            lae2.add(new lae(14, ctzArray[i]));
        }
    }

    @Override
    protected JPopupMenu ekk() {
        JPopupMenu jPopupMenu = super.ekk();
        jPopupMenu.add(new JSeparator());
        this.qtZ = new AbstractAction(this, "Add Node"){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ lam qsP;
            {
                this.qsP = lam2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qsP.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null || this.qsP.c((lae)treePath.getLastPathComponent())) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                Object[] objectArray = null;
                switch (lae2.getNodeType()) {
                    case 12: {
                        objectArray = new String[]{"Ingredient", "RequiredSkill"};
                        break;
                    }
                    case 13: {
                        objectArray = new String[]{"EnchantmentConfiguration", "Ingredient"};
                        break;
                    }
                    case 16: {
                        objectArray = new String[]{"RecipeCrafting", "RecipeEnchanting"};
                        break;
                    }
                    default: {
                        return;
                    }
                }
                String string = (String)JOptionPane.showInputDialog(this.qsP, "Select NodeType", "Add Node", 3, null, objectArray, "Null");
                if (string == null) {
                    return;
                }
                lae lae3 = null;
                if (string.equals("RecipeCrafting")) {
                    String string2 = this.qsP.qoZ.u();
                    if (string2 == null || string2.trim().equals("")) {
                        lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() No resorce has been selected.");
                        return;
                    }
                    int n = lam.a(this.qsP).getType(string2);
                    if (n <= 0) {
                        lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() The selected resorce is invalid.");
                        return;
                    }
                    Integer n2 = new Integer(n);
                    if (lam.b(this.qsP).containsKey(n2)) {
                        lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() A recipe for the resource already exists.");
                        return;
                    }
                    ctm ctm2 = new ctm();
                    ctm2.ResourceType = n;
                    ctm2.asi = 1;
                    ctm2.fgb = 0.0f;
                    ctm[] ctmArray = new ctm[]{ctm2};
                    ctu ctu2 = new ctu();
                    ctu2.l(n);
                    ctu2.do(1);
                    ctu2.eR(0.0f);
                    ctu2.eS(1.0f);
                    ctu2.un(cug.fgE);
                    ctu2.Ingredients = ctmArray;
                    lae3 = lam.a(this.qsP, ctu2);
                    lam.b(this.qsP).put(n2, ctu2);
                    lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() Added " + ctu2);
                } else if (string.equals("RecipeEnchanting")) {
                    String string3 = this.qsP.qoZ.u();
                    if (string3 == null || string3.trim().equals("")) {
                        lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() No resorce has been selected. It is needed as an ingredient.");
                        return;
                    }
                    int n = lam.a(this.qsP).getType(string3);
                    if (n <= 0) {
                        lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() The selected resorce is invalid.");
                        return;
                    }
                    String string4 = JOptionPane.showInputDialog(this.qsP, "Enter EnchantmentName", "Add Enchantment", 3);
                    if (string4 == null || string4.trim().equals("")) {
                        return;
                    }
                    string4 = string4.trim();
                    if (lam.c(this.qsP).containsKey(string4)) {
                        lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() A recipe with the same name already exists.");
                        return;
                    }
                    int n3 = lam.d(this.qsP);
                    Integer n4 = new Integer(n3);
                    if (lam.c(this.qsP).containsKey(n4)) {
                        lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() A recipe with the same type already exists.");
                        return;
                    }
                    ctm ctm3 = new ctm();
                    ctm3.ResourceType = n;
                    ctm3.asi = 1;
                    ctm3.fgb = 0.0f;
                    ctm[] ctmArray = new ctm[]{ctm3};
                    all all2 = new all();
                    all2.fU(5);
                    all2.fV(3);
                    all2.fC(1104);
                    all2.ap(0.0f);
                } else if (string.equals("Ingredient")) {
                    String string5 = this.qsP.qoZ.u();
                    if (string5 == null || string5.trim().equals("")) {
                        lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() No resorce has been selected.");
                        return;
                    }
                    int n = lam.a(this.qsP).getType(string5);
                    if (n <= 0) {
                        lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() The selected resorce is invalid.");
                        return;
                    }
                    ctm ctm4 = new ctm();
                    ctm4.ResourceType = n;
                    ctm4.asi = 1;
                    ctm4.fgb = 0.0f;
                    ctt ctt2 = (ctt)lae2.getValue();
                    if (!ctt2.a(ctm4)) {
                        return;
                    }
                    lae3 = new lae(7, ctm4);
                    lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() Adding " + ctm4);
                } else if (string.equals("RequiredSkill")) {
                    String string6 = this.qsP.qoZ.eks();
                    if (string6 == null || string6.trim().equals("")) {
                        lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() No skill has been selected.");
                        return;
                    }
                    int n = lam.e(this.qsP).getType(string6);
                    if (n <= 0) {
                        lfn.b(5, "SFXMLRecipeTreeView.AddNode", "actionPerformed() The selected skill is invalid.");
                        return;
                    }
                    ctz ctz2 = new ctz();
                    ctz2.SkillType = n;
                    ctz2.SkillLevel = 1.0f;
                    ctz2.fgs = 0.0f;
                    ctz2.fgt = false;
                    ctu ctu3 = (ctu)lae2.getValue();
                    if (!ctu3.a(ctz2)) {
                        return;
                    }
                    lae3 = new lae(14, ctz2);
                    lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() Adding " + ctz2);
                } else if (string.equals("EnchantmentConfiguration")) {
                    Object[] objectArray2 = aln.DP();
                    String string7 = (String)JOptionPane.showInputDialog(this.qsP, "EnchantmentConfiguration", "Select EnchantmentClassName", 3, null, objectArray2, "Null");
                    if (string7 == null) {
                        return;
                    }
                    int n = aln.cL(string7);
                    if (n <= 0) {
                        lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() EnchantmentClassName '" + string7 + "' is invalid.");
                        return;
                    }
                    Object[] objectArray3 = aln.DQ();
                    String string8 = (String)JOptionPane.showInputDialog(this.qsP, "EnchantmentConfiguration", "Select ItemClassName", 3, null, objectArray3, "Null");
                    if (string8 == null) {
                        return;
                    }
                    int n5 = aln.cM(string8);
                    if (n5 <= 0) {
                        lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() ItemClassName '" + string8 + "' is invalid.");
                        return;
                    }
                    all all3 = new all();
                    all3.fU(n);
                    all3.fV(n5);
                    switch (n) {
                        case 1: {
                            all3.fJ(bfk.dgM);
                            all3.eI(cxd.fIa);
                            all3.ap(5.0f);
                            break;
                        }
                        case 2: {
                            all3.eI(cxd.fIa);
                            all3.ap(0.0f);
                            break;
                        }
                        case 3: {
                            all3.l(cug.fgJ);
                            all3.ap(5.0f);
                            break;
                        }
                        case 4: {
                            all3.fC(208);
                            all3.ap(0.0f);
                            break;
                        }
                        case 5: {
                            all3.fC(1104);
                            all3.ap(0.0f);
                            break;
                        }
                        case 6: {
                            all3.eI(cxd.fIa);
                            break;
                        }
                        default: {
                            lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() EnchantmentClassName '" + string7 + "' is invalid.");
                            return;
                        }
                    }
                    lae3 = new lae(5, all3);
                    lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() Adding " + all3);
                } else {
                    lfn.b(0, "SFXMLRecipeTreeView.AddNode", "actionPerformed() Invalid nodetype provided: '" + string + "'");
                    return;
                }
                if (!$assertionsDisabled && lae3 == null) {
                    throw new AssertionError();
                }
                lae2.add(lae3);
                this.qsP.qtP.reload(lae2);
                this.qsP.qtO.getSelectionModel().setSelectionPath(treePath.pathByAddingChild(lae3));
                switch (lae3.getNodeType()) {
                    case 5: {
                        this.qsP.qoZ.a((all)lae3.getValue());
                        break;
                    }
                    case 7: {
                        this.qsP.qoZ.d((ctm)lae3.getValue());
                        break;
                    }
                    case 12: {
                        this.qsP.qoZ.h((ctu)lae3.getValue());
                        break;
                    }
                    case 13: {
                        this.qsP.qoZ.a((ctv)lae3.getValue());
                        break;
                    }
                    case 14: {
                        this.qsP.qoZ.c((ctz)lae3.getValue());
                        break;
                    }
                    default: {
                        return;
                    }
                }
            }

            static {
                $assertionsDisabled = !lam.class.desiredAssertionStatus();
            }
        };
        this.qsK = new AbstractAction(this, "Create NodeCopy"){
            final /* synthetic */ lam qsP;
            {
                this.qsP = lam2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qsP.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null || this.qsP.c((lae)treePath.getLastPathComponent())) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                if (lae2.getNodeType() == 12) {
                    String string = this.qsP.qoZ.u();
                    if (string == null || string.trim().equals("")) {
                        lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() No resorce has been selected.");
                        return;
                    }
                    int n = lam.a(this.qsP).getType(string);
                    if (n <= 0) {
                        lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() The selected resorce is invalid.");
                        return;
                    }
                    Integer n2 = new Integer(n);
                    if (lam.b(this.qsP).containsKey(n2)) {
                        lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() A recipe for the resource already exists.");
                        return;
                    }
                    ctu ctu2 = (ctu)((ctt)lae2.getValue()).bbE();
                    ctu2.l(n);
                    lae lae3 = lam.a(this.qsP, ctu2);
                    this.qsP.qtQ.add(lae3);
                    this.qsP.qtP.reload(this.qsP.qtQ);
                    lam.b(this.qsP).put(n2, ctu2);
                    lfn.b(0, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() Added " + ctu2);
                    this.qsP.qoZ.h(ctu2);
                } else if (lae2.getNodeType() == 13) {
                    String string = JOptionPane.showInputDialog(this.qsP, "Enter EnchantmentName", "e_");
                    if (string == null || string.trim().equals("")) {
                        return;
                    }
                    string = string.trim();
                    if (lam.c(this.qsP).containsKey(string)) {
                        lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() A recipe with the same name already exists.");
                        return;
                    }
                    int n = lam.d(this.qsP);
                    Integer n3 = new Integer(n);
                    if (lam.c(this.qsP).containsKey(n3)) {
                        lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() A recipe with the same type already exists.");
                        return;
                    }
                    ctv ctv2 = (ctv)((ctt)lae2.getValue()).bbE();
                    ctv2.Ps = n;
                    ctv2.EnchantmentName = string;
                    lae lae4 = lam.a(this.qsP, ctv2);
                    this.qsP.qtQ.add(lae4);
                    this.qsP.qtP.reload(this.qsP.qtQ);
                    lam.c(this.qsP).put(n3, ctv2);
                    lam.c(this.qsP).put(string, ctv2);
                    lfn.b(0, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() Added " + ctv2);
                    this.qsP.qoZ.a(ctv2);
                } else if (lae2.getNodeType() == 7) {
                    String string = this.qsP.qoZ.u();
                    if (string == null || string.trim().equals("")) {
                        lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() No resorce has been selected.");
                        return;
                    }
                    int n = lam.a(this.qsP).getType(string);
                    if (n <= 0) {
                        lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() The selected resorce is invalid.");
                        return;
                    }
                    ctm ctm2 = ((ctm)lae2.getValue()).bbC();
                    ctm2.ResourceType = n;
                    lae lae5 = (lae)lae2.getParent();
                    ctt ctt2 = (ctt)lae5.getValue();
                    if (!ctt2.a(ctm2)) {
                        return;
                    }
                    lae lae6 = new lae(7, ctm2);
                    lae5.add(lae6);
                    this.qsP.qtP.reload(lae5);
                    lfn.b(0, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() Added " + ctm2);
                    this.qsP.qoZ.d(ctm2);
                } else if (lae2.getNodeType() == 14) {
                    String string = this.qsP.qoZ.eks();
                    if (string == null || string.trim().equals("")) {
                        lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() No skill has been selected.");
                        return;
                    }
                    int n = lam.e(this.qsP).getType(string);
                    if (n <= 0) {
                        lfn.b(5, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() The selected skill is invalid.");
                        return;
                    }
                    ctz ctz2 = ((ctz)lae2.getValue()).bbN();
                    ctz2.SkillType = n;
                    lae lae7 = (lae)lae2.getParent();
                    ctu ctu3 = (ctu)lae7.getValue();
                    if (!ctu3.a(ctz2)) {
                        return;
                    }
                    lae lae8 = new lae(14, ctz2);
                    lae7.add(lae8);
                    this.qsP.qtP.reload(lae7);
                    lfn.b(0, "SFXMLRecipeTreeView.CopyNode", "actionPerformed() Added " + ctz2);
                    this.qsP.qoZ.c(ctz2);
                }
            }
        };
        this.qua = new AbstractAction(this, "Delete Node"){
            final /* synthetic */ lam qsP;
            {
                this.qsP = lam2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                TreePath treePath = this.qsP.qtO.getSelectionModel().getSelectionPath();
                if (treePath == null || this.qsP.c((lae)treePath.getLastPathComponent())) {
                    return;
                }
                int n = JOptionPane.showConfirmDialog(this.qsP, "Do you really want to delete the node", "Deletion confirmation", 0);
                if (n == 1) {
                    return;
                }
                lae lae2 = (lae)treePath.getLastPathComponent();
                if (lae2.getNodeType() == 12) {
                    ctu ctu2 = (ctu)lae2.getValue();
                    lam.b(this.qsP).remove(new Integer(ctu2.az()));
                    this.qsP.qtP.removeNodeFromParent(lae2);
                    lfn.b(0, "SFXMLRecipeTreeView.DeleteNode", "actionPerformed() Removed " + ctu2);
                } else if (lae2.getNodeType() == 13) {
                    ctv ctv2 = (ctv)lae2.getValue();
                    lam.c(this.qsP).remove(new Integer(ctv2.Ps));
                    lam.c(this.qsP).remove(ctv2.fJ());
                    this.qsP.qtP.removeNodeFromParent(lae2);
                    lfn.b(0, "SFXMLRecipeTreeView.DeleteNode", "actionPerformed() Removed " + ctv2);
                } else if (lae2.getNodeType() == 7) {
                    ctm ctm2 = (ctm)lae2.getValue();
                    lae lae3 = (lae)lae2.getParent();
                    ctt ctt2 = (ctt)lae3.getValue();
                    if (!ctt2.b(ctm2)) {
                        return;
                    }
                    this.qsP.qtP.removeNodeFromParent(lae2);
                    lfn.b(0, "SFXMLRecipeTreeView.DeleteNode", "actionPerformed() Removed " + ctm2);
                } else if (lae2.getNodeType() == 14) {
                    ctz ctz2 = (ctz)lae2.getValue();
                    lae lae4 = (lae)lae2.getParent();
                    ctu ctu3 = (ctu)lae4.getValue();
                    if (!ctu3.b(ctz2)) {
                        return;
                    }
                    this.qsP.qtP.removeNodeFromParent(lae2);
                    lfn.b(0, "SFXMLRecipeTreeView.DeleteNode", "actionPerformed() Removed " + ctz2);
                } else if (lae2.getNodeType() == 5) {
                    all all2 = (all)lae2.getValue();
                    lae lae5 = (lae)lae2.getParent();
                    ctv ctv3 = (ctv)lae5.getValue();
                    this.qsP.qtP.removeNodeFromParent(lae2);
                    lfn.b(0, "SFXMLRecipeTreeView.DeleteNode", "actionPerformed() Removed " + all2);
                }
            }
        };
        this.qsL = new AbstractAction(this, "Save RecipeCraftingTree"){
            final /* synthetic */ lam qsP;
            {
                this.qsP = lam2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.qsP.qoZ.ekM();
            }
        };
        this.qsM = new AbstractAction(this, "Save RecipeEnchantingTree"){
            final /* synthetic */ lam qsP;
            {
                this.qsP = lam2;
                super(string);
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.qsP.qoZ.ekN();
            }
        };
        jPopupMenu.add(this.qtZ);
        jPopupMenu.add(this.qsK);
        jPopupMenu.add(this.quc);
        jPopupMenu.add(this.qsL);
        jPopupMenu.add(this.qsM);
        jPopupMenu.addSeparator();
        jPopupMenu.add(this.qua);
        return jPopupMenu;
    }

    private int elB() {
        if (this.qsO.isEmpty()) {
            return 1;
        }
        Iterator iterator = this.qsO.entrySet().iterator();
        Map.Entry entry = null;
        int n = 0;
        while (iterator.hasNext()) {
            int n2;
            entry = iterator.next();
            if (!(entry.getKey() instanceof Integer) || (n2 = ((Integer)entry.getKey()).intValue()) <= n) continue;
            n = n2;
        }
        return ++n;
    }

    static /* synthetic */ les a(lam lam2) {
        return lam2.ResourceTree;
    }

    static /* synthetic */ Map b(lam lam2) {
        return lam2.qsN;
    }

    static /* synthetic */ lae a(lam lam2, ctu ctu2) {
        return lam2.j(ctu2);
    }

    static /* synthetic */ Map c(lam lam2) {
        return lam2.qsO;
    }

    static /* synthetic */ int d(lam lam2) {
        return lam2.elB();
    }

    static /* synthetic */ les e(lam lam2) {
        return lam2.aqN;
    }

    static /* synthetic */ lae a(lam lam2, ctv ctv2) {
        return lam2.c(ctv2);
    }
}

