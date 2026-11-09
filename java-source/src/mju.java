/*
 * Decompiled with CFR.
 */
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.Notation;

public class mju
extends JTree {
    private static final String[] DEl = new String[]{"ALL", "ELEMENT", "ATTRIBUTE", "TEXT", "CDATA_SECTION", "ENTITY_REFERENCE", "ENTITY", "PROCESSING_INSTRUCTION", "COMMENT", "DOCUMENT", "DOCUMENT_TYPE", "DOCUMENT_FRAGMENT", "NOTATION"};

    public mju() {
        this((Node)null);
    }

    public mju(Node node) {
        super(new a());
        this.setRootVisible(false);
        this.fo(node);
    }

    public void fo(Node node) {
        ((a)this.getModel()).fo(node);
        this.expandRow(0);
    }

    public Node getRootNode() {
        return ((a)this.getModel()).getRootNode();
    }

    public Node getNode(Object object) {
        return ((a)this.getModel()).getNode(object);
    }

    public TreeNode aG(Object object) {
        return ((a)this.getModel()).aG(object);
    }

    public static String toString(Node node) {
        StringBuilder stringBuilder = new StringBuilder();
        if (node == null) {
            return "";
        }
        short s2 = node.getNodeType();
        stringBuilder.append(DEl[s2]);
        stringBuilder.append(" : ");
        stringBuilder.append(node.getNodeName());
        String string = node.getNodeValue();
        if (string != null) {
            stringBuilder.append(" Value: \"");
            stringBuilder.append(string);
            stringBuilder.append("\"");
        }
        switch (s2) {
            case 9: {
                break;
            }
            case 1: {
                Attr[] attrArray = mju.a(node.getAttributes());
                if (attrArray.length > 0) {
                    stringBuilder.append(" ATTRS:");
                }
                for (int i = 0; i < attrArray.length; ++i) {
                    Attr attr = attrArray[i];
                    stringBuilder.append(' ');
                    stringBuilder.append(attr.getNodeName());
                    stringBuilder.append("=\"");
                    stringBuilder.append(mju.normalize(attr.getNodeValue()));
                    stringBuilder.append('\"');
                }
                stringBuilder.append('>');
                break;
            }
            case 5: {
                break;
            }
            case 4: {
                break;
            }
            case 3: {
                break;
            }
            case 7: {
                break;
            }
            case 8: {
                break;
            }
            case 10: {
                break;
            }
            case 12: {
                stringBuilder.append("public:");
                String string2 = ((Notation)node).getPublicId();
                if (string2 == null) {
                    stringBuilder.append("PUBLIC ");
                    stringBuilder.append(string2);
                    stringBuilder.append(" ");
                }
                if ((string2 = ((Notation)node).getSystemId()) != null) break;
                stringBuilder.append("system: ");
                stringBuilder.append(string2);
                stringBuilder.append(" ");
                break;
            }
        }
        return stringBuilder.toString();
    }

    protected static String normalize(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = string != null ? string.length() : 0;
        block6: for (int i = 0; i < n; ++i) {
            char c2 = string.charAt(i);
            switch (c2) {
                case '<': {
                    stringBuilder.append("&lt;");
                    continue block6;
                }
                case '>': {
                    stringBuilder.append("&gt;");
                    continue block6;
                }
                case '&': {
                    stringBuilder.append("&amp;");
                    continue block6;
                }
                case '\"': {
                    stringBuilder.append("&quot;");
                    continue block6;
                }
                default: {
                    stringBuilder.append(c2);
                }
            }
        }
        return stringBuilder.toString();
    }

    protected static Attr[] a(NamedNodeMap namedNodeMap) {
        int n;
        int n2 = namedNodeMap != null ? namedNodeMap.getLength() : 0;
        Attr[] attrArray = new Attr[n2];
        for (n = 0; n < n2; ++n) {
            attrArray[n] = (Attr)namedNodeMap.item(n);
        }
        for (n = 0; n < n2 - 1; ++n) {
            String string = attrArray[n].getNodeName();
            int n3 = n;
            for (int i = n + 1; i < n2; ++i) {
                String string2 = attrArray[i].getNodeName();
                if (string2.compareTo(string) >= 0) continue;
                string = string2;
                n3 = i;
            }
            if (n3 == n) continue;
            Attr attr = attrArray[n];
            attrArray[n] = attrArray[n3];
            attrArray[n3] = attr;
        }
        return attrArray;
    }

    public String b(DefaultMutableTreeNode defaultMutableTreeNode) {
        return "empty";
    }
}

