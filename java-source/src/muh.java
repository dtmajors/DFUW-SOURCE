/*
 * Decompiled with CFR.
 */
class muh
implements mty.a {
    String lob;

    public muh(String string) {
        this.lob = string.toLowerCase();
    }

    @Override
    public boolean aN(Object object) {
        return object != null && object instanceof String && ((String)object).toLowerCase().contains(this.lob);
    }
}

