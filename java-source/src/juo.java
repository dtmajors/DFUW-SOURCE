/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class juo {
    private static final String TC = "SFFeatSystemDynamicPointsInfoParser";
    private final tt oSm = lea.epA();

    public void eL(String string) {
        try {
            Document document = jsy.tJ(string);
            if (document == null) {
                lfn.b(5, TC, "parseFile() Invalid Document: [" + string + "]");
                assert (false);
                return;
            }
            Node node = jsy.a("XML", (Node)document);
            if (node == null) {
                throw new bn("XML");
            }
            Node node2 = jsy.a("Range", node);
            if (node2 == null) {
                throw new bn("Range");
            }
            List<Node> list = jsy.c("Step", node2);
            if (list == null || list.isEmpty()) {
                throw new bn("Step");
            }
            for (Node node3 : list) {
                int n = Integer.parseInt(jsy.i(node3, "Points"));
                if (n < 0) {
                    throw new bj("Points : " + n);
                }
                float f = Float.parseFloat(jsy.i(node3, "Value"));
                if (f <= 0.0f) {
                    throw new bj("Multiplier : " + f);
                }
                this.oSm.i(n, f);
            }
            Node node4 = jsy.a("ComparisonOnCurrentPlayerPoints", node2);
            if (node4 == null) {
                throw new bn("ComparisonOnCurrentPlayerPoints");
            }
            boolean bl = Boolean.getBoolean(jsy.i(node4, "Value"));
            this.oSm.as(bl);
            Node node5 = jsy.a("Multipliers", node);
            if (node5 == null) {
                throw new bn("Multipliers");
            }
            List<Node> list2 = jsy.c("Multiplier", node5);
            if (list2 == null || list2.isEmpty()) {
                throw new bn("Multiplier");
            }
            for (Node node6 : list2) {
                String string2 = jsy.i(node6, "Type");
                float f = Float.parseFloat(jsy.i(node6, "Value"));
                if (f < 0.0f) {
                    throw new bn("Value");
                }
                float f2 = Float.parseFloat(jsy.i(node6, "EventMultiplier"));
                if (f2 < 0.0f) {
                    throw new bn("EventMultiplier");
                }
                this.oSm.b(string2, f * f2);
            }
            Node node7 = jsy.a("Resources", node);
            if (node7 == null) {
                throw new bn("Resources");
            }
            this.a("Harvesting", a.oSp, node7);
            this.a("Crafting", a.oSo, node7);
            this.a("PPE", a.oSq, node7);
        }
        catch (bg bg2) {
            lfn.b(5, this.getClass().getSimpleName(), "error: " + bg2.getMessage());
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private void a(String string, a a2, Node node) {
        List<Node> list = jsy.c(string, node);
        if (list == null || list.isEmpty()) {
            throw new bn(string);
        }
        for (Node node2 : list) {
            List<Node> list2 = jsy.c("Node", node2);
            if (list2 == null || list2.isEmpty()) {
                throw new bn("Node");
            }
            for (Node node3 : list2) {
                this.a(node3, a2);
            }
        }
    }

    private void a(Node node, a a2) {
        float f;
        String string = jsy.i(node, "ResourceName");
        if (string == null) {
            throw new bn("ResourceName");
        }
        int n = lea.enW().getType(string);
        if (n == -1) {
            throw new bj("Resource Name : " + string);
        }
        float f2 = Float.parseFloat(jsy.i(node, "Points"));
        if (f2 <= 0.0f) {
            throw new bn("Points");
        }
        if (cug.vI((int)n)) {
            String string2;
            f = Float.parseFloat(jsy.i(node, "Rank"));
            if (f >= 0.0f) {
                this.oSm.x(n, (int)f);
            }
            if ((string2 = jsy.i(node, "EventMultiplier")) != null) {
                float f3 = Float.parseFloat(string2);
                f2 *= f3 > 0.0f ? f3 : 1.0f;
            }
        }
        switch (a2) {
            case oSo: {
                this.oSm.g(n, f2);
                break;
            }
            case oSp: {
                this.oSm.h(n, f2);
                break;
            }
            case oSq: {
                this.oSm.f(n, f2);
            }
        }
        f = Float.parseFloat(jsy.i(node, "FeatsMult"));
        if (f <= 0.0f) {
            throw new bn("FeatsMult");
        }
        float f4 = 1.0f;
        if (lea.enW().isDescendant(n, cug.fgG)) {
            f4 = this.oSm.a(tw.aVT);
        } else if (lea.enW().isDescendant(n, cug.fkd)) {
            f4 = cwy.xk(n) || cwy.xl(n) ? this.oSm.a(tw.aVV) : this.oSm.a(tw.aVU);
        }
        this.oSm.e(n, f2 * f * f4);
    }
}

