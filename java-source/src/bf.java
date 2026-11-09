/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Node;

public class bf
extends bg {
    private Node eL;
    private String AttributeName;

    public bf(Node node, String string) {
        this.eL = node;
        this.AttributeName = string;
    }

    public bf(Node node, String string, Throwable throwable) {
        super(null, throwable);
        this.eL = node;
        this.AttributeName = string;
    }

    @Override
    public String getMessage() {
        assert (super.getMessage() == null);
        return "Node='" + this.eL + "', AttributeName='" + this.AttributeName + "'";
    }
}

