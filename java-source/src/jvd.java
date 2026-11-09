/*
 * Decompiled with CFR.
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jvd {
    private final lju oRy = new lju(0, 1, 0);

    public void uq(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, this.oRy);
            Node node = jsy.d("XML", document);
            List<Node> list = jsy.c("SFGamelogicFunctionRule", node);
            if (list.isEmpty()) {
                return;
            }
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    cbt cbt2 = this.am(list.get(i2));
                    if (cbr.oI(cbt2.ekd)) {
                        throw new bg("Gamelogicfunctionrule has already been added: " + cbt2);
                    }
                    cbr.a(cbt2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of gamelogicfunctionrule node " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bs("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    public void ur(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, this.oRy);
            Node node = jsy.d("XML", document);
            List<Node> list = jsy.c("SFSkillFunctionRule", node);
            if (list.isEmpty()) {
                return;
            }
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    dcr dcr2 = this.an(list.get(i2));
                    if (cxj.bv(dcr2.SkillType, dcr2.bnR)) {
                        throw new bg("Skillfunctionrule has already been added: " + dcr2);
                    }
                    cxj.a(dcr2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of skillfunctionrule node " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bs("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private cbt am(Node node) {
        Node node2 = jsy.d("SFGamelogicFunctionName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("GamelogicFunctionName is invalid.");
        }
        int n = cbs.gX(string);
        if (n <= 0) {
            throw new bj("GamelogicFunctionName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFShowDebug", node);
        boolean bl = jsy.t(node2);
        cbt cbt2 = new cbt();
        cbt2.ekd = n;
        cbt2.eke = bl;
        return cbt2;
    }

    private dcr an(Node node) {
        Node node2 = jsy.d("SFSkillName", node);
        int n = kbi.eM(node2);
        if (n < 0) {
            throw new bj("SkillType is invalid.");
        }
        node2 = jsy.d("SFSkillFunctionName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("SkillFunctionName is invalid.");
        }
        int n2 = cxh.ix(string);
        if (n2 <= 0) {
            throw new bj("SkillFunctionName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFShowDebug", node);
        boolean bl = jsy.t(node2);
        dcr dcr2 = new dcr();
        dcr2.SkillType = n;
        dcr2.bnR = n2;
        dcr2.eke = bl;
        return dcr2;
    }
}

