/*
 * Decompiled with CFR.
 */
public class bu
extends bg {
    private String eO;
    private String AttributeName;

    public bu(String string, String string2) {
        this.eO = string;
        this.AttributeName = string2;
    }

    @Override
    public String getMessage() {
        assert (super.getMessage() == null);
        return "NodeType='" + this.eO + "', AttributeName='" + this.AttributeName + "'";
    }
}

