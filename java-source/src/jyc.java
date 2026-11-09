/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jyc {
    lju fzk = new lju(0, 1);

    public lke vz(String string) {
        Document document = null;
        try {
            document = jsy.tJ("xml-files/object/animation/distancetimers/" + string);
        }
        catch (bo bo2) {
            return null;
        }
        return this.s(document, jry.tn(string));
    }

    private lke s(Document document, String string) {
        lju lju2;
        lke lke2 = null;
        Node node = jsy.a("SFAnimationDistanceTimerTemplate", (Node)document);
        if (node != null && (lju2 = jsy.c(document)).equals(this.fzk)) {
            lke2 = this.co(node);
            lke2.cd(string);
        }
        return lke2;
    }

    private lke co(Node node) {
        lke lke2 = new lke();
        Node node2 = null;
        node2 = jsy.a("AnimationDistanceTimerList", node);
        NodeList nodeList = node2.getChildNodes();
        lkd lkd2 = null;
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            node2 = nodeList.item(i2);
            if (!node2.getNodeName().equals("AnimationDistanceTimer") || (lkd2 = this.cp(node2)) == null) continue;
            lke2.a(lkd2);
        }
        return lke2;
    }

    private lkd cp(Node node) {
        lkd lkd2 = new lkd();
        Node node2 = jsy.a("AnimationDistanceTimerType", node);
        if (node2 != null) {
            lkd2.Xs(jsy.r(node2));
        }
        if ((node2 = jsy.a("AnimationDistanceTimerSetName", node)) != null) {
            lkd2.wI(jsy.m(node2));
        }
        if ((node2 = jsy.a("AnimationDistanceTimerDeltaTimePerUnit", node)) != null) {
            lkd2.dK(jsy.q(node2));
        }
        return lkd2;
    }
}

