/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class jwg {
    private lju fzk = new lju(0, 1);
    private final String oWD = "Could not parse Node = ";
    private List<cs> aCM;
    private List<cs> oWE;
    private List<cr> oWF;
    private int oWG;
    private int oWH;
    private int oWI;

    public void eL(String string) {
        this.aCM = lcn.emv();
        this.oWE = lcn.emv();
        this.oWF = lcn.emv();
        String string2 = "xml-files/client/cc_config/" + string;
        Document document = null;
        try {
            document = jsy.tJ(string2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            assert (false);
            return;
        }
        try {
            this.h(document, string);
        }
        catch (bp bp2) {
            throw new bo("Error Parsing SFFile [" + string + "]", bp2);
        }
    }

    private void h(Document document, String string) {
        assert (document != null);
        Node node = jsy.a("SFCharacterSkillSetConfig", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "SFFile [" + string + "] is invalid!");
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Rootnode is invalid");
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(this.fzk)) {
            lfn.b(5, this.getClass().getName(), "Cannot Load. Wrong Version: " + lju2);
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Vrong Version [" + lju2 + "]. Supported Version = " + this.fzk);
        }
        String string2 = "SkillList";
        Node node2 = jsy.a(string2, node);
        if (node2 == null) {
            lfn.b(5, this.getClass().getName(), "SFFile [" + string + "] is invalid!");
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Rootnode is invalid");
        }
        List<Node> list = node2.getAttributes();
        Iterator<Node> iterator = list.getNamedItem("AvailiblePoints");
        this.oWG = Integer.parseInt(iterator.getNodeValue());
        string2 = "Skill";
        list = jsy.c(string2, node2);
        if (list == null || list.isEmpty()) {
            lfn.b(5, this.getClass().getName(), "traverseDocument() : Error getting node [" + string2 + "]");
            assert (false);
            throw new bp("Could noe parse [" + string2 + "] Node");
        }
        this.b(list, this.aCM);
        string2 = "AttribList";
        node2 = jsy.a(string2, node);
        if (node2 == null) {
            lfn.b(5, this.getClass().getName(), "SFFile [" + string + "] is invalid!");
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Rootnode is invalid");
        }
        iterator = node2.getAttributes();
        Object object = iterator.getNamedItem("AvailiblePoints");
        this.oWH = Integer.parseInt(object.getNodeValue());
        string2 = "Skill";
        list = jsy.c(string2, node2);
        if (list == null || list.isEmpty()) {
            lfn.b(5, this.getClass().getName(), "traverseDocument() : Error getting node [" + string2 + "]");
            assert (false);
            throw new bp("Could noe parse [" + string2 + "] Node");
        }
        this.b(list, this.oWE);
        string2 = "SpellList";
        node2 = jsy.a(string2, node);
        if (node2 == null) {
            lfn.b(5, this.getClass().getName(), "SFFile [" + string + "] is invalid!");
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Rootnode is invalid");
        }
        iterator = node2.getAttributes();
        object = iterator.getNamedItem("AvailiblePoints");
        this.oWI = Integer.parseInt(object.getNodeValue());
        string2 = "Spell";
        list = jsy.c(string2, node2);
        if (list == null || list.isEmpty()) {
            lfn.b(5, this.getClass().getName(), "traverseDocument() : Error getting node [" + string2 + "]");
            assert (false);
            throw new bp("Could noe parse [" + string2 + "] Node");
        }
        iterator = list.iterator();
        while (iterator.hasNext()) {
            object = new cr();
            node2 = iterator.next();
            NamedNodeMap namedNodeMap = node2.getAttributes();
            node2 = namedNodeMap.getNamedItem("Name");
            assert (node2 != null);
            ((cr)object).setName(node2.getNodeValue());
            this.oWF.add((cr)object);
        }
    }

    private void b(List list, List list2) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            cs cs2 = new cs();
            Node node = (Node)iterator.next();
            NamedNodeMap namedNodeMap = node.getAttributes();
            node = namedNodeMap.getNamedItem("Name");
            assert (node != null);
            cs2.setName(node.getNodeValue());
            node = namedNodeMap.getNamedItem("MaxValue");
            assert (node != null);
            cs2.L(Integer.parseInt(node.getNodeValue()));
            node = namedNodeMap.getNamedItem("MinValue");
            assert (node != null);
            cs2.M(Integer.parseInt(node.getNodeValue()));
            node = namedNodeMap.getNamedItem("StartValue");
            assert (node != null);
            cs2.N(Integer.parseInt(node.getNodeValue()));
            list2.add(cs2);
        }
    }

    public List<cs> dUa() {
        return this.oWE;
    }

    public List<cs> dUb() {
        return this.aCM;
    }

    public List<cr> dUc() {
        return this.oWF;
    }

    public int dUd() {
        return this.oWH;
    }

    public int dUe() {
        return this.oWG;
    }

    public int dUf() {
        return this.oWI;
    }
}

