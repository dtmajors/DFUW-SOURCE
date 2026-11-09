/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class mif {
    private ArrayList<a> DxG = new ArrayList();

    public mif BX(String string) {
        this.DxG.add(new a(string));
        return this;
    }

    public ArrayList<Element> v(Document document) {
        ArrayList<Element> arrayList = new ArrayList<Element>();
        Element element = document.getDocumentElement();
        if (element != null) {
            this.a(element, 0, arrayList);
        }
        return arrayList;
    }

    private void a(Element element, int n, ArrayList<Element> arrayList) {
        if (n < 0 || n >= this.DxG.size()) {
            return;
        }
        a a2 = this.DxG.get(n);
        if (!a2.N(element)) {
            return;
        }
        if (n == this.DxG.size() - 1) {
            arrayList.add(element);
            return;
        }
        for (Node node = element.getFirstChild(); node != null; node = node.getNextSibling()) {
            if (node.getNodeType() != 1) continue;
            Element element2 = (Element)node;
            this.a(element2, n + 1, arrayList);
        }
    }
}

