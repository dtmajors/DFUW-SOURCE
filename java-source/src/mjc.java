/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class mjc {
    private String Name = null;
    private List<b> Dzf = lcn.emv();

    public static List<mjc> BY(String string) {
        ArrayList<mjc> arrayList = lcn.emv();
        Document document = jsy.tK(string);
        if (document == null) {
            return null;
        }
        List<Node> list = jsy.c("SFGenericObjectType", document.getFirstChild());
        for (Node node : list) {
            mjc mjc2 = new mjc();
            mjc2.b(node);
            arrayList.add(mjc2);
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private void b(Node node) {
        this.Name = node.getAttributes().getNamedItem("Name").getNodeValue();
        List<Node> list = jsy.c("Var", node);
        for (Node node2 : list) {
            Object object;
            Object object2;
            void object4;
            Object object32;
            b b2 = new b(this);
            b2.Name = node2.getAttributes().getNamedItem("Name").getNodeValue();
            String string = node2.getAttributes().getNamedItem("Type").getNodeValue();
            for (Object object32 : c.values()) {
                if (!object32.toString().equals(string)) continue;
                b2.Type = object32.ordinal();
            }
            Object var7_9 = null;
            Node node3 = node2.getAttributes().getNamedItem("Default");
            if (node3 != null) {
                String string2 = node3.getNodeValue();
            }
            String string3 = null;
            object32 = node2.getAttributes().getNamedItem("SliderMin");
            if (object32 != null) {
                string3 = object32.getNodeValue();
            }
            String string4 = null;
            Node node4 = node2.getAttributes().getNamedItem("SliderMax");
            if (node4 != null) {
                string4 = node4.getNodeValue();
            }
            if (b2.Type == c.Dzu.ordinal()) {
                b2.crG = object4 != null ? Float.valueOf((String)object4) : Float.valueOf(0.0f);
                b2.Dzn = string3 != null ? Float.valueOf(string3) : Float.valueOf(0.0f);
                b2.Dzo = string4 != null ? Float.valueOf(string4) : Float.valueOf(100.0f);
            }
            if (b2.Type == c.Dzv.ordinal() || b2.Type == c.Dzz.ordinal()) {
                b2.crG = object4 != null ? Integer.valueOf((String)object4) : Integer.valueOf(0);
            }
            if (b2.Type == c.Dzx.ordinal() || b2.Type == c.Dzw.ordinal() || b2.Type == c.DzA.ordinal() || b2.Type == c.DzB.ordinal()) {
                b2.crG = object4 != null ? object4 : "";
            }
            if (b2.Type == c.Dzx.ordinal() && (object2 = node2.getAttributes().getNamedItem("StartPath")) != null) {
                b2.Dzp = object2.getNodeValue();
            }
            if (b2.Type == c.Dzy.ordinal()) {
                b2.crG = new ljq(0.0f, 0.0f, 0.0f);
            }
            if (b2.Type == c.DzB.ordinal() && (object2 = node2.getAttributes().getNamedItem("DynamicType")) != null) {
                b2.Dzr = object2.getNodeValue();
            }
            if ((b2.Type == c.Dzz.ordinal() || b2.Type == c.DzA.ordinal()) && (object2 = node2.getAttributes().getNamedItem("Values")) != null) {
                object = object2.getNodeValue().split(",");
                b2.Dzq = object;
            }
            if (b2.Type == c.DzB.ordinal()) {
                object2 = a.valueOf(b2.Dzr);
                switch (1.Dzg[((Enum)object2).ordinal()]) {
                    case 1: {
                        Object object52;
                        object = lcn.abH(fy.TF.size());
                        Object object6 = fy.TF.values();
                        Object object7 = object6.iterator();
                        while (object7.hasNext()) {
                            object52 = (List)object7.next();
                            for (Object object8 : object52) {
                                btd btd2 = (btd)object8;
                                if (btd2 == null || btd2.axo() == null || btd2.axo().trim().isEmpty()) continue;
                                object.add(btd2.axo());
                            }
                        }
                        b2.Dzq = object.toArray(new String[object.size()]);
                        object7 = new b(this);
                        ((b)object7).Name = "MonsterName";
                        ((b)object7).crG = "";
                        ((b)object7).Dzs = true;
                        ((b)object7).Type = c.Dzw.ordinal();
                        this.Dzf.add((b)object7);
                        object52 = new b(this);
                        ((b)object52).Name = "MonsterNumber";
                        ((b)object52).Type = c.Dzv.ordinal();
                        ((b)object52).crG = 0;
                        ((b)object52).Dzs = true;
                        this.Dzf.add((b)object52);
                        break;
                    }
                    case 2: {
                        Object object52;
                        object = lcn.emv();
                        Object object6 = lea.eoc();
                        for (Object object52 : object6.keySet()) {
                            if (!(object52 instanceof String)) continue;
                            object.add((String)object52);
                        }
                        b2.Dzq = object.toArray(new String[object.size()]);
                        break;
                    }
                    case 3: {
                        Object object9;
                        object = lcn.emv();
                        Object object6 = lea.enW().acv(cug.fgG);
                        Object object7 = lea.enW().a((ler)object6, true);
                        Object object52 = object7.iterator();
                        while (object52.hasNext()) {
                            object9 = (ler)object52.next();
                            object.add(((ler)object9).getName());
                        }
                        b2.Dzq = object.toArray(new String[object.size()]);
                        object52 = new b(this);
                        ((b)object52).Name = "MonsterName";
                        ((b)object52).crG = "";
                        ((b)object52).Dzs = true;
                        ((b)object52).Type = c.Dzw.ordinal();
                        this.Dzf.add((b)object52);
                        break;
                    }
                    case 4: {
                        Object object9;
                        object = lcn.emv();
                        Object object6 = (lgw)lea.enW().acv(cug.fkv);
                        Object object7 = lea.enW().a((ler)object6, false, false);
                        Object object52 = object7.iterator();
                        while (object52.hasNext()) {
                            Object object8;
                            object9 = (ler)object52.next();
                            object8 = ((ler)object9).getName();
                            object.add(object8);
                        }
                        b2.Dzq = object.toArray(new String[object.size()]);
                    }
                }
            }
            if (b2.Type == c.DzC.ordinal()) {
                b2.crG = Boolean.parseBoolean((String)object4);
            }
            this.Dzf.add(b2);
        }
    }

    public void d(bsx bsx2) {
        for (b b2 : this.Dzf) {
            if (b2.crG == null) {
                lfn.b(5, "SFGenericObjectType", "initializeLevelObjectGeneric() : Variable " + b2.Name + " has default value NULL!!");
                assert (false);
                continue;
            }
            bsx2.setValue(b2.Name, b2.crG);
        }
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public List<b> ezw() {
        return this.Dzf;
    }

    public void cj(List<b> list) {
        this.Dzf = list;
    }
}

