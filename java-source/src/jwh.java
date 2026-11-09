/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jwh {
    private lju fzk = new lju(0, 1);
    public static List<List<String>> oWJ = lcn.emv();
    public static List<List<String>> oWK = lcn.emv();

    public void dTX() {
        String string = "xml-files/client/cc_config/equipment.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            assert (false);
            return;
        }
        try {
            this.h(document, jry.tn(string));
        }
        catch (bp bp2) {
            throw new bo("Error Parsing SFFile [" + string + "]", bp2);
        }
    }

    private void h(Document document, String string) {
        assert (document != null);
        Node node = jsy.a("SFCharacterFeatureSetConfig", (Node)document);
        if (node == null) {
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Rootnode is invalid");
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(this.fzk)) {
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Vrong Version [" + lju2 + "]. Supported Version = " + this.fzk);
        }
        this.aQ(node);
        this.aR(node);
    }

    private void aQ(Node node) {
        String string = "DressList";
        List<Node> list = jsy.c(string, node);
        if (list == null || list.isEmpty()) {
            assert (false);
            throw new bp("Could noe parse [" + string + "] Node");
        }
        Iterator<Node> iterator = list.iterator();
        while (iterator.hasNext()) {
            ArrayList<String> arrayList = lcn.emv();
            string = "SFResourceName";
            Node node2 = iterator.next();
            List<Node> list2 = jsy.c(string, node2);
            if (list2 == null) {
                assert (false);
                throw new bp("Could noe parse [" + string + "] Node");
            }
            for (Node node3 : list2) {
                if (node3 == null) continue;
                arrayList.add(jsy.m(node3));
            }
            oWK.add(arrayList);
        }
    }

    private void aR(Node node) {
        String string = "DressFeatureList";
        List<Node> list = jsy.c(string, node);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<Node> iterator = list.iterator();
        while (iterator.hasNext()) {
            ArrayList<String> arrayList = lcn.emv();
            string = "SFResourceName";
            Node node2 = iterator.next();
            List<Node> list2 = jsy.c(string, node2);
            if (list2 == null) {
                // empty if block
            }
            if (list2 != null) {
                for (Node node3 : list2) {
                    if (node3 == null) continue;
                    arrayList.add(jsy.m(node3));
                }
            }
            oWJ.add(arrayList);
        }
    }

    public List<List<String>> dUg() {
        return oWK;
    }

    public List<List<String>> dUh() {
        return oWJ;
    }

    public static List dUi() {
        return oWK.get(new Random().nextInt(oWK.size()));
    }

    public static List dUj() {
        return oWJ.get(new Random().nextInt(oWJ.size()));
    }
}

