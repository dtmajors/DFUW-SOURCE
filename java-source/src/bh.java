/*
 * Decompiled with CFR.
 */
public class bh
extends bg {
    private String Filename;

    public bh(String string) {
        this.Filename = string;
    }

    public bh(String string, Throwable throwable) {
        super(null, throwable);
    }

    @Override
    public String getMessage() {
        assert (super.getMessage() == null);
        return "Filename='" + this.Filename + "'";
    }
}

