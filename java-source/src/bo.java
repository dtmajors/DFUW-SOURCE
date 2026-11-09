/*
 * Decompiled with CFR.
 */
public class bo
extends bg {
    private String eR;

    public bo(String string) {
        this.eR = string;
    }

    public bo(String string, Throwable throwable) {
        super(null, throwable);
        this.eR = string;
    }

    @Override
    public String getMessage() {
        assert (super.getMessage() == null);
        return "DocumentName='" + this.eR + "'";
    }
}

