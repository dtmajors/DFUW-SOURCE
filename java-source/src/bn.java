/*
 * Decompiled with CFR.
 */
public class bn
extends bg {
    private String eQ;

    public bn(String string) {
        this.eQ = string;
    }

    public bn(String string, Throwable throwable) {
        super(null, throwable);
        this.eQ = string;
    }

    @Override
    public String getMessage() {
        assert (super.getMessage() == null);
        return "NodeName='" + this.eQ + "'";
    }
}

