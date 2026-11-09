/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class juh {
    private String oRY = "loading_screen_tips.xml";

    public void dTr() {
        Document document = jsy.tK("xml-files/client/gui//loading_screen_tips.xml");
        Node node = jsy.e("Tips", document);
        List<Node> list = jsy.c("Tip", node);
        ArrayList<loz> arrayList = lcn.emv();
        ArrayList<loz> arrayList2 = lcn.emv();
        for (Node node2 : list) {
            String string = node2.getAttributes().getNamedItem("Id").getNodeValue();
            lox lox2 = lpd.rHs.BE("LoadingScreenTips." + string);
            if (lox2 == null) continue;
            boolean bl = false;
            Node node3 = node2.getAttributes().getNamedItem("Lore");
            if (node3 != null && node3.getNodeValue().toLowerCase().equals("true")) {
                bl = true;
            }
            if (bl) {
                arrayList2.add(lox2.bD(new Object[0]));
                continue;
            }
            arrayList.add(lox2.bD(new Object[0]));
        }
        bth.dLj = new loz[arrayList.size()];
        bth.dLk = new loz[arrayList2.size()];
        arrayList.toArray(bth.dLj);
        arrayList2.toArray(bth.dLk);
    }
}

