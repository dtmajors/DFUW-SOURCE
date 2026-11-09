/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class juu {
    private final lju fzk = new lju(0, 1);

    public List<dtz> dTv() {
        Document document;
        ArrayList<dtz> arrayList = lcn.emv();
        jus jus2 = new jus();
        String string = "xml-files/gamelogicinfo/quests/questindex.xml";
        try {
            document = jsy.tJ("xml-files/gamelogicinfo/quests/questindex.xml");
        }
        catch (bo bo2) {
            return arrayList;
        }
        if (document == null) {
            return arrayList;
        }
        Node node = jsy.a("QuestIndex", (Node)document);
        if (node == null) {
            assert (false);
            return arrayList;
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(this.fzk)) {
            assert (false);
            return arrayList;
        }
        List<Node> list = jsy.c("ComplexQuest", node);
        for (Node node2 : list) {
            dty dty2 = null;
            ArrayList<due> arrayList2 = null;
            int[] nArray = null;
            NamedNodeMap namedNodeMap = node2.getAttributes();
            Node node3 = namedNodeMap.getNamedItem("Filename");
            if (node3 == null) {
                assert (false) : "Complex quest without attribute : Filename";
                continue;
            }
            String string2 = node3.getNodeValue();
            try {
                dty2 = (dty)jus2.uj(string2);
                int[] nArray2 = nArray = dty2 != null ? dty2.SubQuestIDs : null;
                if (nArray == null || nArray.length == 0) {
                    lfn.b(5, this.getClass().getSimpleName(), "getAllQuests() Complex Quest : " + string2 + " does not have any subquests.");
                    assert (false);
                    continue;
                }
            }
            catch (Exception exception) {
                lfn.b(5, this.getClass().getSimpleName(), "getAllQuests() Could not load Complex Quest : " + string2);
                exception.printStackTrace();
                assert (false);
                continue;
            }
            List<Node> list2 = jsy.c("SimpleQuest", node2);
            block7: for (Node node4 : list2) {
                NamedNodeMap namedNodeMap2 = node4.getAttributes();
                Node node5 = namedNodeMap2.getNamedItem("Filename");
                if (node5 == null) {
                    assert (false) : "Simple quest without attribute : Filename";
                    break;
                }
                String string3 = node5.getNodeValue();
                try {
                    due due2 = (due)jus2.uk(string3);
                    for (int n : nArray) {
                        if (n != due2.ID) continue;
                        if (arrayList2 == null) {
                            arrayList2 = lcn.emv();
                        }
                        arrayList2.add(due2);
                        continue block7;
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    assert (false);
                }
            }
            if (arrayList2 != null && arrayList2.size() != nArray.length) {
                assert (false) : "Complex quest : " + dty2.Filename + " has as subquests : " + nArray.length + " although the index file says that the number should be : " + (arrayList2 != null ? arrayList2.size() : 0) + ". Probably quest index file is out of sync?";
                continue;
            }
            arrayList.add(dty2);
            arrayList.addAll((Collection<dtz>)arrayList2);
        }
        return arrayList;
    }
}

