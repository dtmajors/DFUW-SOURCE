/*
 * Decompiled with CFR.
 */
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class mjn
extends JTree {
    protected static final lfn ga = lfn.eqw();

    public mjn() {
        this((Document)null);
    }

    public mjn(Document document) {
        super(new a());
        this.setRootVisible(false);
        this.setDocument(document);
    }

    public void setDocument(Document document) {
        ((a)this.getModel()).setDocument(document);
        this.expandRow(0);
    }

    public Document getDocument() {
        return ((a)this.getModel()).getDocument();
    }

    public Node getNode(Object object) {
        return ((a)this.getModel()).getNode(object);
    }

    public void a(Node node, DefaultMutableTreeNode defaultMutableTreeNode) {
        ((a)this.getModel()).b(node, defaultMutableTreeNode);
        this.treeDidChange();
    }

    public void eCO() {
        ((a)this.getModel()).eCO();
    }
}

