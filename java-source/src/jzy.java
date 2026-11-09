/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.w3c.dom.Node;

public class jzy {
    protected final jzp oRz;
    protected les ResourceTree = lea.enW();

    public jzy() {
        this.oRz = new jzp();
    }

    public jzy(jzp jzp2) {
        this.oRz = jzp2;
    }

    public final ctd b(Node node, int n) {
        assert (node != null);
        assert (n > 0);
        try {
            return this.c(node, n);
        }
        catch (bg bg2) {
            throw new bg("Parsing of enchantment failed.", bg2);
        }
    }

    protected final List cU(Node node) {
        Object object;
        int n;
        int n2;
        ArrayList<Object> arrayList = lcn.abH(2);
        List<Node> list = jsy.c("SFItem", node);
        if (!list.isEmpty()) {
            n2 = list.size();
            for (n = 0; n < n2; ++n) {
                try {
                    object = this.f(list.get(n), false);
                    arrayList.add(object);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of item " + n + " failed.", bg2);
                }
            }
        }
        if (!(list = jsy.c("SFRandomItem", node)).isEmpty()) {
            n2 = list.size();
            for (n = 0; n < n2; ++n) {
                try {
                    object = this.r(list.get(n), node.getNodeName());
                    if (object == null || object.isEmpty()) continue;
                    float f = 0.0f;
                    int n3 = object.size();
                    for (int i2 = 0; i2 < n3; ++i2) {
                        cto cto2 = (cto)object.get(i2);
                        f += cto2.Probability;
                    }
                    if ((double)f <= 0.0 || (double)f > 1.0000049999998737) {
                        throw new bg("ProbabilitySum is invalid: " + f);
                    }
                    if (f < 1.0f) {
                        // empty if block
                    }
                    arrayList.add(object);
                    continue;
                }
                catch (bg bg3) {
                    throw new bg("Parsing of randomitem " + n + " failed.", bg3);
                }
            }
        }
        return arrayList;
    }

    protected ej[] p(Node node, String string) {
        List<Node> list = jsy.c("SFAttribute", node);
        if (list.isEmpty()) {
            return null;
        }
        try {
            ej[] ejArray = this.oRz.bT(list);
            return ejArray;
        }
        catch (bg bg2) {
            throw new bg("Parsing of attributes for '" + string + "' failed", bg2);
        }
    }

    private ctd c(Node node, int n) {
        String string = jsy.c(node, "RecipeName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'RecipeName' has invalid value.");
        }
        ctw ctw2 = alc.cH(string);
        if (ctw2 == null) {
            throw new bj("RecipeName '" + string + "' is invalid.");
        }
        int n2 = jsy.d(node, "MagnitudeMultiplier");
        if ((float)n2 > 100.0f) {
            throw new bg("MagnitudeMultiplier is too large for attribute '" + ep.aM((int)n) + "'");
        }
        if ((float)n2 < 10.0f) {
            throw new bg("MagnitudeMultiplier is too small for attribute '" + ep.aM((int)n) + "'");
        }
        ald ald2 = ctw2.fH();
        float f = ald2.DD() * (float)n2 / 100.0f;
        ctd ctd2 = new ctd();
        ctd2.bnM = n;
        ctd2.few = ctw2.Type;
        ctd2.Pt = f;
        return ctd2;
    }

    protected ctd[] q(Node node, String string) {
        assert (node != null);
        assert (string != null);
        List<Node> list = jsy.c("SFEnchantment", node);
        if (list.isEmpty()) {
            return null;
        }
        ctd[] ctdArray = new ctd[list.size()];
        int n = list.size();
        for (int i2 = 0; i2 < n; ++i2) {
            try {
                int n2 = 0;
                switch (i2) {
                    case 0: {
                        n2 = 1584;
                        break;
                    }
                    case 1: {
                        n2 = 1600;
                        break;
                    }
                    default: {
                        throw new bg("Too many 'SFEnchantment' nodes defined.");
                    }
                }
                ctdArray[i2] = this.c(list.get(i2), n2);
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of enchantment " + i2 + " for resource '" + string + "' failed.", bg2);
            }
        }
        return ctdArray;
    }

    public cto f(Node node, boolean bl) {
        int n;
        String string = jsy.c(node, "ResourceName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'ResourceName' has invalid value.");
        }
        int n2 = this.ResourceTree.getType(string);
        if (n2 <= 0) {
            throw new bj("ResourceName '" + string + "' is invalid.");
        }
        cto cto2 = new cto();
        cto2.ResourceType = n2;
        if (jsy.g(node, "Droppable")) {
            cto2.fez = n = jsy.f(node, "Droppable");
        }
        if (jsy.g(node, "Quantity")) {
            n = jsy.d(node, "Quantity");
            if (n < 1) {
                throw new bj("Attribute 'Quantity' for resource '" + string + "' has invalid value.");
            }
            cto2.asi = n;
        } else if (jsy.g(node, "MaxQuantity")) {
            n = jsy.d(node, "MaxQuantity");
            if (n <= 0) {
                throw new bj("Attribute 'MaxQuantity' for resource '" + string + "' has invalid value.");
            }
            int n3 = jsy.d(node, "MinQuantity");
            if (n3 < 0) {
                throw new bj("Attribute 'MinQuantity' for resource '" + string + "' has invalid value.");
            }
            if (n3 > n) {
                throw new bj("MinQuantity > MaxQuantity.");
            }
            cto2.dpT = n;
            cto2.dpS = n3;
        }
        if (!bl && jsy.g(node, "Probability")) {
            float f = jsy.e(node, "Probability");
            if (f <= 0.0f || f > 1.0f) {
                throw new bj("Attribute 'Probability' for resource '" + string + "' has invalid value.");
            }
            cto2.Probability = f;
        }
        if (jsy.g(node, "BuildType")) {
            int n4;
            cto2.bcB = n4 = jsy.d(node, "BuildType");
        }
        cto2.DR = this.p(node, string);
        cto2.ffQ = this.q(node, string);
        List<Node> list = jsy.c("SFItem", node);
        if (!list.isEmpty()) {
            cto[] ctoArray = new cto[list.size()];
            int n5 = list.size();
            for (int i2 = 0; i2 < n5; ++i2) {
                try {
                    ctoArray[i2] = this.f(list.get(i2), true);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of item " + i2 + " for resource '" + string + "' failed.", bg2);
                }
            }
            cto2.fgf = ctoArray;
        }
        return cto2;
    }

    private List r(Node node, String string) {
        ArrayList<cto> arrayList = lcn.abH(2);
        List<Node> list = jsy.c("SFItem", node);
        if (!list.isEmpty()) {
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    cto cto2 = this.f(list.get(i2), false);
                    arrayList.add(cto2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of randomitem " + i2 + " failed.", bg2);
                }
            }
        }
        Collections.sort(arrayList, new ctp());
        return arrayList;
    }
}

