/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

public class jzp {
    private jzy beG = null;

    public List<ej> cH(Node node) {
        return this.d(node, false);
    }

    public List<ej> d(Node node, boolean bl) {
        int n;
        if (node == null) {
            throw new bi("ResourceNode is null.");
        }
        ArrayList<ej> arrayList = lcn.emv();
        List<Node> list = jsy.c("SFBooleanAttribute", node);
        int n2 = list.size();
        for (n = 0; n < n2; ++n) {
            try {
                this.a(list.get(n), arrayList);
                continue;
            }
            catch (bg bg2) {
                throw new bg("SFBooleanAttribute", bg2);
            }
        }
        list = jsy.c("SFEnchantmentAttribute", node);
        n2 = list.size();
        for (n = 0; n < n2; ++n) {
            try {
                this.b(list.get(n), arrayList);
                continue;
            }
            catch (bg bg3) {
                throw new bg("SFEnchantmentAttribute", bg3);
            }
        }
        list = jsy.c("SFFloatAttribute", node);
        n2 = list.size();
        for (n = 0; n < n2; ++n) {
            try {
                if (bl) {
                    arrayList.add(this.cJ(list.get(n)));
                    continue;
                }
                this.c(list.get(n), arrayList);
                continue;
            }
            catch (bg bg4) {
                throw new bg("SFFloatAttribute", bg4);
            }
        }
        list = jsy.c("SFGUIDAttribute", node);
        n2 = list.size();
        for (n = 0; n < n2; ++n) {
            try {
                this.d(list.get(n), arrayList);
                continue;
            }
            catch (bg bg5) {
                throw new bg("SFGUIDAttribute", bg5);
            }
        }
        list = jsy.c("SFIntegerAttribute", node);
        n2 = list.size();
        for (n = 0; n < n2; ++n) {
            try {
                this.e(list.get(n), arrayList);
                continue;
            }
            catch (bg bg6) {
                throw new bg("SFIntegerAttribute", bg6);
            }
        }
        Node node2 = jsy.a("SFPositionalInfoAttribute", node);
        if (node2 != null) {
            try {
                this.f(node2, arrayList);
            }
            catch (bg bg7) {
                throw new bg("SFPositionalInfoAttribute", bg7);
            }
        }
        list = jsy.c("SFStringAttribute", node);
        int n3 = list.size();
        for (n2 = 0; n2 < n3; ++n2) {
            try {
                this.g(list.get(n2), arrayList);
                continue;
            }
            catch (bg bg8) {
                throw new bg("SFStringAttribute", bg8);
            }
        }
        list = jsy.c("SFVector3Attribute", node);
        n3 = list.size();
        for (n2 = 0; n2 < n3; ++n2) {
            try {
                this.j(list.get(n2), arrayList);
                continue;
            }
            catch (bg bg9) {
                throw new bg("SFVector3Attribute", bg9);
            }
        }
        list = jsy.c("SFStringInstanceAttribute", node);
        n3 = list.size();
        for (n2 = 0; n2 < n3; ++n2) {
            try {
                this.h(list.get(n2), arrayList);
                continue;
            }
            catch (bg bg10) {
                throw new bg("SFStringInstanceAttribute", bg10);
            }
        }
        list = jsy.c("SFDoubleAttribute", node);
        n3 = list.size();
        for (n2 = 0; n2 < n3; ++n2) {
            try {
                this.i(list.get(n2), arrayList);
                continue;
            }
            catch (bg bg11) {
                throw new bg("SFDoubleAttribute", bg11);
            }
        }
        return arrayList;
    }

    public ej[] bT(List<Node> list) {
        if (list == null) {
            throw new bi("AttributeNodes list is null.");
        }
        ej[] ejArray = new ej[list.size()];
        int n = list.size();
        for (int i2 = 0; i2 < n; ++i2) {
            try {
                Node node = list.get(i2);
                String string = jsy.c(node, "Name");
                if (string == null || string.trim().equals("")) {
                    throw new bj("Node 'Name' has invalid value.");
                }
                int n2 = ep.as((String)string);
                if (n2 <= 0) {
                    throw new bj("AttributeName '" + string + "' is invalid.");
                }
                eo eo2 = ep.bc((int)n2);
                switch (eo2.kM) {
                    case 0: {
                        Object object = jsy.c(node, "Value");
                        if (object == null || ((String)object).trim().equals("")) {
                            throw new bj("Node 'Value' has invalid value.");
                        }
                        boolean bl = Boolean.parseBoolean((String)object);
                        ej ej2 = new eq();
                        ej2.setType(n2);
                        ((eq)ej2).x(bl);
                        ejArray[i2] = ej2;
                        break;
                    }
                    case 1: {
                        if (this.beG == null) {
                            this.beG = new jzy(this);
                        }
                        if (n2 == 1440 || n2 == 1456) {
                            ejArray[i2] = this.a(node, n2);
                            break;
                        }
                        Object object = this.beG.b(node, n2);
                        ejArray[i2] = ctf.a((ctd)object);
                        break;
                    }
                    case 2: {
                        Object object = jsy.c(node, "Value");
                        if (object == null || ((String)object).trim().equals("")) {
                            throw new bj("Node 'Value' has invalid value.");
                        }
                        float f = Float.parseFloat((String)object);
                        ej ej2 = new et();
                        ej2.setType(n2);
                        ((et)ej2).o(f);
                        ejArray[i2] = ej2;
                        break;
                    }
                    case 3: {
                        Object object = jsy.c(node, "Value");
                        if (object == null || ((String)object).trim().equals("")) {
                            throw new bj("Node 'Value' has invalid value.");
                        }
                        int n3 = 0;
                        if (n2 == 10384) {
                            n3 = lea.enZ().getType((String)object);
                            if (n3 <= 0) {
                                throw new bj("SkillName '" + (String)object + "' is invalid.");
                            }
                        } else {
                            n3 = Integer.parseInt((String)object);
                        }
                        ej ej2 = new ew();
                        ej2.setType(n2);
                        ((ew)ej2).bi(n3);
                        ejArray[i2] = ej2;
                        break;
                    }
                    case 7: {
                        Object object = jsy.c(node, "Value");
                        if (object == null || ((String)object).trim().equals("")) {
                            throw new bj("Node 'Value' has invalid value.");
                        }
                        ff ff2 = new ff();
                        ff2.setType(n2);
                        ff2.av((String)object);
                        ejArray[i2] = ff2;
                        break;
                    }
                    case 8: {
                        Object object = jsy.c(node, "Value");
                        if (object == null || ((String)object).trim().equals("")) {
                            throw new bj("Node 'Value' has invalid value.");
                        }
                        fg fg2 = new fg();
                        fg2.setType(n2);
                        fg2.aq((String)object);
                        ejArray[i2] = fg2;
                        break;
                    }
                    case 9: {
                        Object object = jsy.c(node, "Value");
                        if (object == null || ((String)object).trim().equals("")) {
                            throw new bj("Node 'Value' has invalid value.");
                        }
                        double d2 = 0.0;
                        try {
                            d2 = Double.parseDouble((String)object);
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw new bj("Node 'Value' has invalid value.", numberFormatException);
                        }
                        er er2 = new er();
                        er2.setType(n2);
                        er2.d(d2);
                        ejArray[i2] = er2;
                        break;
                    }
                    default: {
                        throw new bg("Unhandled datatype provided: " + eo2.kM);
                    }
                }
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of attribute " + i2 + " failed.", bg2);
            }
        }
        return ejArray;
    }

    public int cI(Node node) {
        if (node == null) {
            throw new bi("AttributeName node is null.");
        }
        String string = jsy.m(node);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node '" + node.getNodeName() + "' has invalid value.");
        }
        if (ep.at((String)string)) {
            return ep.as((String)string);
        }
        int n = string.indexOf(" ");
        if (n < 0) {
            throw new bj("AttributeName '" + string + "' is invalid.");
        }
        String string2 = string;
        String string3 = string.substring(0, n);
        if (string3 == null || string3.trim().equals("")) {
            throw new bj("AttributeName '" + string2 + "' is invalid.");
        }
        if ((string = string.substring(string3.length())) == null || string.trim().equals("")) {
            throw new bj("AttributeName '" + string2 + "' is invalid.");
        }
        int n2 = ep.as((String)string.trim());
        if (n2 <= 0) {
            throw new bj("AttributeName '" + string2 + "' is invalid.");
        }
        if (string3.equals("Max")) {
            return ep.k((int)n2, (int)2);
        }
        throw new bj("Attribute relation '" + string3 + "' is invalid.");
    }

    public void a(Node node, List<ej> list) {
        if (node == null) {
            throw new bi("AttributeNode is null.");
        }
        if (list == null) {
            throw new bi("AttributeList is null.");
        }
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.cI(node2);
        if (ep.aL((int)n) != 0) {
            throw new bj("BooleanAttribute '" + ep.aM((int)n) + "' is not a BooleanAttribute.");
        }
        try {
            node2 = jsy.d("SFValue", node);
            boolean bl = jsy.t(node2);
            if (ep.aO((int)n)) {
                ey ey2 = new ey();
                ey2.setType(n);
                ey2.x(bl);
                list.add(ey2);
            } else {
                eq eq2 = new eq();
                eq2.setType(n);
                eq2.x(bl);
                list.add(eq2);
            }
        }
        catch (bg bg2) {
            throw new bg("Parsing of attribute '" + ep.aM((int)n) + "' failed.", bg2);
        }
    }

    public void b(Node node, List<ej> list) {
        if (node == null) {
            throw new bi("AttributeNode is null.");
        }
        if (list == null) {
            throw new bi("AttributeList is null.");
        }
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.cI(node2);
        if (ep.aL((int)n) != 1) {
            throw new bj("EnchantmentAttribute '" + ep.aM((int)n) + "' is not an EnchantmentAttribute.");
        }
        if (n != 1568) {
            throw new bj("Defining attribute '" + ep.aM((int)n) + "' in a resource is not allowed.");
        }
        try {
            node2 = jsy.d("SFEnchantmentName", node);
            String string = jsy.m(node2);
            if (string == null || string.trim().equals("")) {
                throw new bg("EnchantmentName is invalid.");
            }
            ald ald2 = lea.zt(string);
            if (ald2 == null) {
                throw new bg("EnchantmentName '" + string + "' is invalid.");
            }
            node2 = jsy.d("SFEnchantmentStrength", node);
            float f = jsy.o(node2);
            if (f > 100.0f) {
                throw new bg("EnchantmentStrength is too large.");
            }
            if (f <= 0.0f) {
                throw new bg("EnchantmentStrength is too small.");
            }
            if (!(ald2 instanceof ale)) {
                String string2 = ep.aM((int)n);
                throw new bg("Attribute '" + string2 + "' should only have Add Effect EnchantmentInfo.");
            }
            es es2 = new es();
            es2.setType(n);
            es2.bf(ald2.Type);
            es2.m(f);
            es2.a((int[])null);
            ald ald3 = es2.fH();
            if (ald3 != null && ald3 instanceof ale) {
                ale ale2 = (ale)ald3;
                if (f > 10.0f) {
                    throw new bg("Magnitude is too large.");
                }
            }
            list.add(es2);
        }
        catch (bg bg2) {
            throw new bg("Parsing of attribute '" + ep.aM((int)n) + "' failed.", bg2);
        }
    }

    public et cJ(Node node) {
        if (node == null) {
            throw new bi("AttributeNode is null.");
        }
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.cI(node2);
        if (ep.aL((int)n) != 2) {
            throw new bj("FloatAttribute '" + ep.aM((int)n) + "' is not a FloatAttribute.");
        }
        try {
            node2 = jsy.d("SFValue", node);
            float f = jsy.o(node2);
            et et2 = new et();
            et2.setType(n);
            et2.o(f);
            return et2;
        }
        catch (Exception exception) {
            throw new bg("Parsing of attribute '" + ep.aM((int)n) + "' failed.", exception);
        }
    }

    public void c(Node node, List<ej> list) {
        if (node == null) {
            throw new bi("AttributeNode is null.");
        }
        if (list == null) {
            throw new bi("AttributeList is null.");
        }
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.cI(node2);
        if (ep.aL((int)n) != 2) {
            throw new bj("FloatAttribute '" + ep.aM((int)n) + "' is not a FloatAttribute.");
        }
        try {
            node2 = jsy.d("SFValue", node);
            float f = jsy.o(node2);
            if (ep.aR((int)n)) {
                et et2 = new ez();
                et2.setType(n);
                et2.o(f);
                list.add(et2);
                node2 = jsy.d("SFMaxMaxValue", node);
                float f2 = jsy.o(node2);
                et2 = new et();
                et2.setType(ep.k((int)n, (int)4));
                et2.o(f2);
                list.add(et2);
                node2 = jsy.a("SFMaxValue", node);
                float f3 = jsy.o(node2);
                et2 = new ez();
                et2.setType(ep.k((int)n, (int)2));
                et2.o(f3);
                list.add(et2);
                node2 = jsy.a("SFMinValue", node);
                float f4 = jsy.o(node2);
                et2 = new et();
                et2.setType(ep.k((int)n, (int)1));
                et2.o(f4);
                list.add(et2);
                if (f > f3) {
                    throw new bj("Value > MaxValue for attribute '" + ep.aM((int)n) + "'");
                }
                if (f < f4) {
                    throw new bj("Value < MinValue for attribute '" + ep.aM((int)n) + "'");
                }
                if (f2 < f3) {
                    throw new bj("MaxMaxValue < MaxValue for attribute '" + ep.aM((int)n) + "'");
                }
            } else {
                et et3 = new et();
                et3.setType(n);
                et3.o(f);
                list.add(et3);
            }
        }
        catch (Exception exception) {
            throw new bg("Parsing of attribute '" + ep.aM((int)n) + "' failed.", exception);
        }
    }

    public void d(Node node, List<ej> list) {
        if (node == null) {
            throw new bi("AttributeNode is null.");
        }
        if (list == null) {
            throw new bi("AttributeList is null.");
        }
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.cI(node2);
        if (ep.aL((int)n) != 4) {
            throw new bj("SFGUIDAttribute '" + ep.aM((int)n) + "' is not a SFGUIDAttribute.");
        }
        try {
            ev ev2 = new ev();
            ev2.setType(n);
            node2 = jsy.d("SFValue", node);
            String string = jsy.m(node2);
            if (string == null) {
                throw new bj("TextValue is null.");
            }
            if (string.equalsIgnoreCase("NULL")) {
                ev2.F(null);
            } else {
                ldv ldv2 = ldv.zq(string.trim());
                if (ldv2 == null) {
                    throw new bj("AttributeValue is null, but should not be: " + string);
                }
                ev2.F(ldv2);
            }
            list.add(ev2);
        }
        catch (bg bg2) {
            throw new bg("Parsing of attribute '" + ep.aM((int)n) + "' failed.", bg2);
        }
    }

    public void e(Node node, List<ej> list) {
        if (node == null) {
            throw new bi("AttributeNode is null.");
        }
        if (list == null) {
            throw new bi("AttributeList is null.");
        }
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.cI(node2);
        if (ep.aL((int)n) != 3) {
            throw new bj("IntegerAttribute '" + ep.aM((int)n) + "' is not an IntegerAttribute.");
        }
        try {
            node2 = jsy.d("SFValue", node);
            int n2 = jsy.r(node2);
            ew ew2 = new ew();
            ew2.setType(n);
            ew2.bi(n2);
            list.add(ew2);
        }
        catch (Exception exception) {
            throw new bg("Parsing of attribute '" + ep.aM((int)n) + "' failed.", exception);
        }
    }

    public void f(Node node, List<ej> list) {
        if (node == null) {
            throw new bi("AttributeNode is null.");
        }
        if (list == null) {
            throw new bi("AttributeList is null.");
        }
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.cI(node2);
        if (ep.aL((int)n) != 5) {
            throw new bj("SFPositionalInfoAttribute '" + ep.aM((int)n) + "' is not a SFPositionalInfoAttribute.");
        }
        fe fe2 = new fe();
        fe2.setType(n);
        list.add(fe2);
    }

    public void g(Node node, List<ej> list) {
        if (node == null) {
            throw new bi("AttributeNode is null.");
        }
        if (list == null) {
            throw new bi("AttributeList is null.");
        }
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.cI(node2);
        if (ep.aL((int)n) != 7) {
            throw new bj("StringAttribute '" + ep.aM((int)n) + "' is not a StringAttribute.");
        }
        try {
            node2 = jsy.d("SFValue", node);
            String string = jsy.m(node2);
            ff ff2 = new ff();
            ff2.setType(n);
            ff2.av(string);
            list.add(ff2);
        }
        catch (bg bg2) {
            throw new bg("Parsing of attribute '" + ep.aM((int)n) + "' failed.", bg2);
        }
    }

    public void h(Node node, List<ej> list) {
        if (node == null) {
            throw new bi("AttributeNode is null.");
        }
        if (list == null) {
            throw new bi("AttributeList is null.");
        }
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.cI(node2);
        if (ep.aL((int)n) != 8) {
            throw new bj("StringInstanceAttribute '" + ep.aM((int)n) + "' is not a StringInstanceAttribute.");
        }
        try {
            node2 = jsy.d("SFValue", node);
            String string = jsy.m(node2);
            fg fg2 = new fg();
            fg2.setType(n);
            fg2.aq(string);
            list.add(fg2);
        }
        catch (bg bg2) {
            throw new bg("Parsing of attribute '" + ep.aM((int)n) + "' failed.", bg2);
        }
    }

    public void i(Node node, List<ej> list) {
        if (node == null) {
            throw new bi("AttributeNode is null.");
        }
        if (list == null) {
            throw new bi("AttributeList is null.");
        }
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.cI(node2);
        if (ep.aL((int)n) != 9) {
            throw new bj("DoubleAttribute '" + ep.aM((int)n) + "' is not a DoubleAttribute.");
        }
        try {
            node2 = jsy.d("SFValue", node);
            String string = jsy.m(node2);
            double d2 = Double.parseDouble(string);
            er er2 = new er();
            er2.setType(n);
            er2.d(d2);
            list.add(er2);
        }
        catch (bg bg2) {
            throw new bg("Parsing of attribute '" + ep.aM((int)n) + "' failed.", bg2);
        }
    }

    public void j(Node node, List<ej> list) {
        if (node == null) {
            throw new bi("AttributeNode is null.");
        }
        if (list == null) {
            throw new bi("AttributeList is null.");
        }
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.cI(node2);
        if (ep.aL((int)n) != 6) {
            throw new bj("SFVector3Attribute '" + ep.aM((int)n) + "' is not a SFVector3Attribute.");
        }
        try {
            fh fh2 = new fh();
            fh2.setType(n);
            node2 = jsy.d("SFValue", node);
            ljq ljq2 = jsy.w(node2);
            if (ljq2 == null) {
                throw new bj("AttributeValue is null, but should not be.");
            }
            fh2.L(ljq2);
            list.add(fh2);
        }
        catch (bg bg2) {
            throw new bg("Parsing of attribute '" + ep.aM((int)n) + "' failed.", bg2);
        }
    }

    private es a(Node node, int n) {
        String string = jsy.c(node, "EnchantmentName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'EnchantmentName' has invalid value.");
        }
        ald ald2 = lea.zt(string);
        if (ald2 == null) {
            throw new bj("EnchantmentName '" + string + "' is invalid.");
        }
        float f = jsy.e(node, "EnchantmentStrength");
        if (f > 100.0f) {
            throw new bg("EnchantmentStrength is too large for attribute '" + ep.aM((int)n) + "'");
        }
        if (f < -100.0f) {
            throw new bg("EnchantmentStrength is too small for attribute '" + ep.aM((int)n) + "'");
        }
        es es2 = new es();
        es2.setType(n);
        es2.bf(ald2.Type);
        es2.m(f);
        es2.a((int[])null);
        return es2;
    }
}

