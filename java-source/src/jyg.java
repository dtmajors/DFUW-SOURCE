/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  lcw
 *  lkv
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jyg {
    private final lju fzk = new lju(0, 1);
    private final jye pag = new jye();
    private final jyf pah = new jyf();
    private final jyh pai = new jyh();
    private final jyc paj = new jyc();
    private final jyd pak = new jyd();
    private boolean pal = true;
    private static int iSj = 0;

    public jyg(boolean bl) {
        this.pal = bl;
    }

    public String vC(String string) {
        Document document = null;
        try {
            document = jsy.tJ("xml-files/object/animation/" + string);
        }
        catch (bo bo2) {
            lfn.log("SFAnimationTemplateParser", bo2);
            return null;
        }
        ++iSj;
        Object var3_4 = null;
        Node node = jsy.a("SFAnimationTemplate", (Node)document);
        if (node == null) {
            lfn.b(5, "SFAnimationTemplateParser", "getStateFileName() Invalid file. Node [SFAnimationTemplate] not found!");
            return null;
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(this.fzk)) {
            lfn.b(5, "SFAnimationTemplateParser", "getStateFileName() Cannot Load. Wrong Version: " + lju2);
            return null;
        }
        String string2 = "SFAnimationStateTemplateReference";
        Node node2 = jsy.a(string2, node);
        if (node2 == null) {
            lfn.b(5, "SFAnimationTemplateParser", "getStateFileName() Could not find node [" + string2 + "]!");
            return null;
        }
        return jsy.m(node2);
    }

    public bvc d(String string, bve.a a2) {
        Document document = null;
        try {
            document = jsy.tJ("xml-files/object/animation/" + string);
        }
        catch (bo bo2) {
            lfn.log("SFAnimationTemplateParser", bo2);
            return null;
        }
        ++iSj;
        return this.a(document, jry.tn(string), a2);
    }

    private bvc a(Document document, String string, bve.a a2) {
        bvr bvr2 = null;
        Node node = jsy.a("SFAnimationTemplate", (Node)document);
        if (node != null) {
            lju lju2 = jsy.c(document);
            if (!lju2.equals(this.fzk)) {
                lfn.b(5, "SFAnimationTemplateParser", "traverseDocument() Cannot Load. Wrong Version: " + lju2);
                return null;
            }
            if (this.pal) {
                bvr bvr3 = (bvr)bvt.c(a2);
                this.a(node, bvr3);
                bvr3.cx(jry.tp(string));
                bvr2 = bvr3;
            } else {
                bvf bvf2 = (bvf)bvn.c(a2);
                this.a(node, bvf2, string);
                bvf2.cx(jry.tp(string));
                bvr2 = bvf2;
            }
        } else {
            lfn.b(5, "SFAnimationTemplateParser", "traverseDocument() '" + string + "' is invalid.");
        }
        return bvr2;
    }

    private void a(Node node, bvf bvf2, String string) {
        String string2 = null;
        Node node2 = null;
        String string3 = null;
        string3 = "SFWorldMeshObject";
        node2 = jsy.a(string3, node);
        if (node2 != null) {
            string2 = jsy.m(node2);
            bvf2.setFileName(string2);
        } else {
            lfn.b(5, "SFAnimationTemplateParser", "getClientAnimationData() Could not find node [" + string3 + "]!");
        }
        string3 = "SFAnimationTransitionTemplateReference";
        node2 = jsy.a(string3, node);
        if (node2 != null) {
            string2 = jsy.m(node2);
            bvf2.a(this.pai.vD(string2));
        } else {
            lfn.b(5, "SFAnimationTemplateParser", "getClientAnimationData() Could not find node [" + string3 + "]!");
        }
        string3 = "SFAnimationPartTemplateReference";
        node2 = jsy.a(string3, node);
        if (node2 != null) {
            string2 = jsy.m(node2);
            if (string2 != null && !string2.equals("")) {
                bvf2.a(this.pag.vA(string2));
            }
        } else {
            lfn.b(5, "SFAnimationTemplateParser", "getClientAnimationData() Could not find node [" + string3 + "]!");
        }
        if (bvf2.azu() != null) {
            string3 = "SFAnimationAACTemplateReference";
            node2 = jsy.a(string3, node);
            if (node2 == null) {
                bvf2.azv();
            } else {
                jyb.a(jsy.m(node2), bvf2.azu().eth(), bvf2.azu().eti());
            }
        }
        if ((node2 = jsy.a(string3 = "SFAnimationStateTemplateReference", node)) != null) {
            string2 = jsy.m(node2);
            this.pah.cx(string);
            bvf2.a(this.pah.vB(string2));
        } else {
            lfn.b(5, "SFAnimationTemplateParser", "getClientAnimationData() Could not find node [" + string3 + "]!");
        }
        string3 = "SFAnimationDistanceTimerTemplateReference";
        node2 = jsy.a(string3, node);
        if (node2 != null && (string2 = jsy.m(node2)) != null && !string2.equals("")) {
            bvf2.a(this.paj.vz(string2));
        }
        if ((node2 = jsy.a(string3 = "SFAnimationEffectReference", node)) != null && !lcw.emZ() && (string2 = jsy.m(node2)) != null && !string2.equals("")) {
            Map<String, List<lkp>> map = this.pak.uH(string2);
            if (map == null) {
                assert (false) : "Missing effect file : " + string2;
                return;
            }
            for (Map.Entry<String, List<lkp>> entry : map.entrySet()) {
                String string4 = entry.getKey();
                List<lkp> list = entry.getValue();
                if (list.isEmpty()) continue;
                int n = lkv.AF((String)string4);
                assert (n > 0) : "Invalid State: " + string4;
                lks lks2 = bvf2.azA();
                lkr lkr2 = lks2.adk(n);
                assert (lkr2 != null) : "State " + string4 + " is invalid!";
                List<lkp> list2 = lkr2.etZ();
                if (list2 != null) {
                    list2.addAll(list);
                    continue;
                }
                lkr2.cb(list);
            }
        }
    }

    private void a(Node node, bvr bvr2) {
        String string = "SFWorldMeshObject";
        Node node2 = jsy.a(string, node);
        if (node2 != null) {
            String string2 = jsy.m(node2);
            bvr2.setFileName(string2);
        } else {
            lfn.b(5, "SFAnimationTemplateParser", "getServerAnimationData() Could not find node [" + string + "]!");
        }
    }
}

