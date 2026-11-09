/*
 * Decompiled with CFR.
 */
public class bp
extends bg {
    private String eQ;

    public bp(String string) {
        this.eQ = string;
    }

    public bp(String string, Throwable throwable) {
        super(null, throwable);
        this.eQ = string;
    }

    @Override
    public String getMessage() {
        assert (super.getMessage() == null);
        return this.eQ;
    }
}

