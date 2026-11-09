/*
 * Decompiled with CFR.
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jyh {
    private lju fzk = new lju(0, 1);

    public lkz vD(String string) {
        Document document = null;
        try {
            document = jsy.tJ("xml-files/object/animation/transitions/" + string);
        }
        catch (bo bo2) {
            return null;
        }
        lkz lkz2 = this.v(document, jry.tn(string));
        if (lkz2 == null) {
            // empty if block
        }
        return lkz2;
    }

    public lkz K(jrw jrw2) {
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            return null;
        }
        lkz lkz2 = this.v(document, jrw2.getName());
        if (lkz2 == null) {
            // empty if block
        }
        return lkz2;
    }

    private lkz v(Document document, String string) {
        Node node;
        lju lju2;
        lkz lkz2 = null;
        Node node2 = jsy.a("SFAnimationTransitionTemplate", (Node)document);
        if (node2 != null && (lju2 = jsy.c(document)).equals(this.fzk) && (node = jsy.a("SFAnimationTransitionSet", node2)) != null && (lkz2 = this.cA(node)) != null) {
            lkz2.AH(string);
        }
        return lkz2;
    }

    public lkz cA(Node node) {
        lkz lkz2 = new lkz();
        NodeList nodeList = node.getChildNodes();
        Node node2 = null;
        String string = null;
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            node2 = nodeList.item(i2);
            if (node2.getNodeName().equals("Name")) {
                string = jsy.m(node2);
                continue;
            }
            if (!node2.getNodeName().equals("TransitionList")) continue;
            List<Node> list = jsy.c("Transition", node2);
            int n = list.size();
            for (int i3 = 0; i3 < n; ++i3) {
                lkz2.b(this.cB(list.get(i3)));
            }
        }
        lkz2.setName(string);
        return lkz2;
    }

    private lky cB(Node node) {
        int n = 0;
        int n2 = 0;
        boolean bl = false;
        boolean bl2 = false;
        String string = "no name";
        lky lky2 = new lky();
        NodeList nodeList = node.getChildNodes();
        Node node2 = null;
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            node2 = nodeList.item(i2);
            if (node2.getNodeName().equals("TransitionFromSetID")) {
                n = jsy.r(node2);
                continue;
            }
            if (node2.getNodeName().equals("TransitionToSetID")) {
                n2 = jsy.r(node2);
                continue;
            }
            if (node2.getNodeName().equals("TransitionName")) {
                string = jsy.m(node2);
                continue;
            }
            if (node2.getNodeName().equals("TransitionUseAsReverse")) {
                bl = jsy.t(node2);
                continue;
            }
            if (!node2.getNodeName().equals("TransitionData")) continue;
            this.a(lky2, node2);
        }
        lky2.adv(n);
        lky2.adw(n2);
        lky2.yJ(bl);
        lky2.setName(string);
        return lky2;
    }

    private void a(lky lky2, Node node) {
        int n = 0;
        int n2 = 0;
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        boolean bl = false;
        boolean bl2 = false;
        double d5 = 0.0;
        double d6 = 0.0;
        NodeList nodeList = node.getChildNodes();
        Node node2 = null;
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            node2 = nodeList.item(i2);
            if (node2.getNodeName().equals("AnimationPartID")) {
                n = jsy.r(node2);
                continue;
            }
            if (node2.getNodeName().equals("TransitionType")) {
                n2 = jsy.r(node2);
                continue;
            }
            if (node2.getNodeName().equals("TransitionDuration")) {
                d2 = jsy.q(node2);
                continue;
            }
            if (node2.getNodeName().equals("TransitionDelayTime")) {
                d3 = jsy.q(node2);
                continue;
            }
            if (node2.getNodeName().equals("AnimationStartPoint")) {
                d4 = jsy.q(node2);
                continue;
            }
            if (node2.getNodeName().equals("TransitionUsePositionMultiplier")) {
                bl2 = jsy.t(node2);
                continue;
            }
            if (node2.getNodeName().equals("TransitionUseSpeedMultiplier")) {
                bl = jsy.t(node2);
                continue;
            }
            if (node2.getNodeName().equals("TransitionPositionMultiplier")) {
                d6 = jsy.q(node2);
                continue;
            }
            if (!node2.getNodeName().equals("TransitionSpeedMultiplier")) continue;
            d5 = jsy.q(node2);
        }
        lky2.en(d4);
        lky2.eq(d3);
        lky2.er(d2);
        lky2.adx(n2);
        lky2.yK(bl2);
        lky2.yL(bl);
        lky2.eo(d6);
        lky2.ep(d5);
    }
}

