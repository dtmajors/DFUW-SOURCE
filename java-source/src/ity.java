/*
 * Decompiled with CFR.
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class ity
implements itv {
    @Override
    public String c(its its2) {
        StringBuilder stringBuilder = new StringBuilder();
        ity.a(stringBuilder, its2);
        return stringBuilder.toString();
    }

    @Override
    public its rC(String string) {
        Document document = jsy.tL(string);
        if (document == null) {
            return null;
        }
        document.getDocumentElement().normalize();
        return ity.r(document.getDocumentElement());
    }

    private static void b(StringBuilder stringBuilder, String string, int n) {
        stringBuilder.append("<Int");
        stringBuilder.append(" name=\"");
        stringBuilder.append(string);
        stringBuilder.append("\" value=\"");
        stringBuilder.append(n);
        stringBuilder.append("\"/>");
    }

    private static void a(StringBuilder stringBuilder, String string, String string2) {
        stringBuilder.append("<String");
        stringBuilder.append(" name=\"");
        stringBuilder.append(string);
        stringBuilder.append("\" value=\"");
        if (string2 != null) {
            stringBuilder.append(string2);
        }
        stringBuilder.append("\"/>");
    }

    private static void a(StringBuilder stringBuilder, String string, boolean bl) {
        stringBuilder.append("<Boolean");
        stringBuilder.append(" name=\"");
        stringBuilder.append(string);
        stringBuilder.append("\" value=\"");
        stringBuilder.append(bl);
        stringBuilder.append("\"/>");
    }

    private static void b(StringBuilder stringBuilder, String string) {
        stringBuilder.append("<Container name=\"");
        stringBuilder.append(string);
        stringBuilder.append("\">");
    }

    private static void i(StringBuilder stringBuilder) {
        stringBuilder.append("</Container>");
    }

    private static void a(StringBuilder stringBuilder, its its2) {
        if (its2 instanceof itt) {
            itt itt2 = (itt)its2;
            ity.b(stringBuilder, itt2.getName());
            List<its> list = itt2.getChildren();
            for (its its3 : list) {
                ity.a(stringBuilder, its3);
            }
            ity.i(stringBuilder);
            return;
        }
        if (its2 instanceof itu) {
            itu itu2 = (itu)its2;
            ity.b(stringBuilder, itu2.getName(), itu2.getValue());
            return;
        }
        if (its2 instanceof itx) {
            itx itx2 = (itx)its2;
            ity.a(stringBuilder, itx2.getName(), itx2.getValue());
            return;
        }
        if (its2 instanceof itr) {
            itr itr2 = (itr)its2;
            ity.a(stringBuilder, itr2.getName(), itr2.getValue());
        }
    }

    private static its r(Element element) {
        if (element.getTagName().equals("Container")) {
            itt itt2 = new itt(element.getAttribute("name"));
            for (Node node = element.getFirstChild(); node != null; node = node.getNextSibling()) {
                if (node.getNodeType() != 1) continue;
                its its2 = ity.r((Element)node);
                itt2.a(its2);
            }
            return itt2;
        }
        if (element.getTagName().equals("Int")) {
            return new itu(element.getAttribute("name"), Integer.valueOf(element.getAttribute("value")));
        }
        if (element.getTagName().equals("String")) {
            return new itx(element.getAttribute("name"), element.getAttribute("value"));
        }
        if (element.getTagName().equals("Boolean")) {
            return new itr(element.getAttribute("name"), Boolean.valueOf(element.getAttribute("value")));
        }
        return null;
    }
}

