/*
 * Decompiled with CFR.
 */
public class bq
extends bg {
    private String eS = null;

    public bq(String string) {
        this.eS = string;
    }

    public bq(String string, Throwable throwable) {
        super(null, throwable);
        this.eS = string;
    }

    @Override
    public String getMessage() {
        assert (super.getMessage() == null);
        return this.eS;
    }
}

