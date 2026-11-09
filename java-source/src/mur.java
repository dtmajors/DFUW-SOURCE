/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mur {
    private static final String path = lcw.qLb + "/" + "xml-files/server/vendor/";
    private lju paq = new lju(0, 3);
    private Node oYC;
    private NodeList EHp;

    public void a(String string, List list, muw.b b2) {
        jta jta2 = new jta();
        Document document = jta2.dSD();
        Element element = jta2.a(document, "Services", this.paq);
        document.appendChild(element);
        for (int i = 0; i < list.size(); ++i) {
            try {
                Element element2 = document.createElement("ServiceTemplate");
                muy muy2 = (muy)list.get(i);
                String string2 = muy2.EJh.getText();
                String string3 = muy2.EJi.getSelectedItem().toString();
                String string4 = muy2.EJj.getText();
                Element element3 = jta2.a(document, string2, "ServiceName");
                element2.appendChild(element3);
                element3 = jta2.a(document, string3, "ServiceTarget");
                element2.appendChild(element3);
                if (!string4.equals("") && muy2.EJj.isEditable()) {
                    element3 = jta2.a(document, string4, "ServiceCost");
                    element2.appendChild(element3);
                }
                element.appendChild(element2);
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        switch (b2) {
            case EJd: {
                jsz.a(document, new jrw(path + "trainingtemplates/" + string));
            }
        }
    }
}

