/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Node;

public class jso
extends bg {
    private Node nVp;

    public jso(Node node) {
        this.nVp = node;
    }

    @Override
    public String getMessage() {
        assert (super.getMessage() == null);
        return this.nVp.getNodeName();
    }
}

