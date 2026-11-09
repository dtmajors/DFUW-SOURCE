/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class kat {
    private lju fzk = new lju(0, 1);
    private final String oWD = "Could not parse Node = ";

    public List<String> dUl() {
        List<String> list = null;
        String string = "xml-files/toolsconfig/required_states_characters.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            // empty catch block
        }
        try {
            list = this.i(document, string);
        }
        catch (bp bp2) {
            throw new bo("Error Parsing SFFile [" + string + "]", bp2);
        }
        return list;
    }

    private List<String> i(Document document, String string) {
        ArrayList<String> arrayList = lcn.emv();
        Node node = jsy.a("RequiredStates", (Node)document);
        if (node == null) {
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Rootnode is invalid");
        }
        String string2 = "AnimationState";
        List<Node> list = jsy.c(string2, node);
        if (list == null) {
            assert (false);
            throw new bp("Could noe parse [" + string2 + "] Node");
        }
        Node node22 = null;
        for (Node node22 : list) {
            NamedNodeMap namedNodeMap = node22.getAttributes();
            if ((node22 = namedNodeMap.getNamedItem("Name")) == null) {
                assert (false);
                continue;
            }
            String string3 = node22.getNodeValue();
            string3 = string3.toLowerCase();
            node22 = namedNodeMap.getNamedItem("Name");
            if (node22 == null) {
                assert (false);
                continue;
            }
            boolean bl = Boolean.parseBoolean(node22.getNodeValue());
            arrayList.add(string3);
        }
        return arrayList;
    }
}

