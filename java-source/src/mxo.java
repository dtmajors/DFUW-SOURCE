/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mxo
extends mkx {
    private mxm ETW = null;
    private Node ETX = null;

    public mxo(mxm mxm2, Node node) {
        this.ETW = mxm2;
        this.ETX = node;
        this.setTitle("Edit XML Node <" + this.ETX.getNodeName() + ">");
        this.setSize(300, 300);
        lfn.b(0, this.getClass().getName(), "SFXMLNodeEditorDialog created!");
        this.DGa.setLayout(new FlowLayout());
        this.eTa();
    }

    private void eTa() {
        NamedNodeMap namedNodeMap = this.ETX.getAttributes();
        Node node = null;
        mkt mkt2 = null;
        mkt2 = new mkt(this.ETX.getNodeName(), this.ETX.getNodeName());
        this.DGa.add(mkt2);
        for (int i = 0; i < namedNodeMap.getLength(); ++i) {
            node = namedNodeMap.item(i);
            mkt2 = new mkt(node.getNodeName(), node.getNodeValue());
            this.DGa.add(mkt2);
        }
    }

    @Override
    protected void z(ActionEvent actionEvent) {
        this.eDD();
        this.ETW.eSW();
        this.dispose();
    }

    @Override
    protected void E(ActionEvent actionEvent) {
        this.eDD();
        this.ETW.eSW();
        this.dispose();
    }

    @Override
    protected void A(ActionEvent actionEvent) {
        this.ETW.eSW();
        this.dispose();
    }

    @Override
    protected void eDD() {
        Component[] componentArray = this.DGa.getComponents();
        mkt mkt2 = null;
        for (int i = 0; i < componentArray.length; ++i) {
            int n2;
            if (!(componentArray[i] instanceof mkt)) continue;
            mkt2 = (mkt)componentArray[i];
            NamedNodeMap namedNodeMap = this.ETX.getAttributes();
            Node node = null;
            if (mkt2.eCQ().equals(this.ETX.getNodeName())) {
                lfn.b(4, this.getClass().getName(), "Cannot rename Node. Not implemented!");
                lfn.b(0, "SFXMLNodeEditorDialog", "OkButton_actionPerformed() Setting NodeType[" + this.ETX.getNodeType() + "] value!");
                n2 = namedNodeMap.getLength();
                String[] stringArray = new String[n2];
                String[] stringArray2 = new String[n2];
                for (int j = 0; j < n2; ++j) {
                    node = namedNodeMap.item(j);
                    stringArray[i] = node.getNodeName();
                    stringArray2[i] = node.getNodeValue();
                }
                Node node2 = this.a(this.ETX.getOwnerDocument(), mkt2.eCU(), stringArray, stringArray2);
                this.a(this.ETX, node2);
                continue;
            }
            for (n2 = 0; n2 < namedNodeMap.getLength(); ++n2) {
                node = namedNodeMap.item(n2);
                if (!mkt2.eCQ().equals(node.getNodeName())) continue;
                lfn.b(0, this.getClass().getName(), "Found Matching Label!");
                node.setNodeValue(mkt2.eCU());
            }
        }
    }

    private Node a(Document document, String string, String[] stringArray, String[] stringArray2) {
        Element element = document.createElement(string);
        for (int i = 0; i < stringArray.length; ++i) {
            element.setAttribute(stringArray[i], stringArray2[i]);
        }
        return element;
    }

    private void a(Node node, Node node2) {
        Node node3 = node.getParentNode();
        if (node.hasChildNodes()) {
            NodeList nodeList = node.getChildNodes();
            int n2 = nodeList.getLength();
            for (int i = 0; i < n2; ++i) {
                node2.appendChild(nodeList.item(0));
            }
        }
        if (node3 != null) {
            node3.replaceChild(node2, node);
        }
    }
}

