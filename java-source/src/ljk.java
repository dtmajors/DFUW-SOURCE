/*
 * Decompiled with CFR.
 */
public class ljk
extends lip {
    private final String rkd;

    protected ljk() {
        this.rkd = null;
    }

    public ljk(String string) {
        assert (string != null);
        this.rkd = string;
    }

    @Override
    public String esy() {
        return hbd.jAL.translate(this.rkd);
    }

    public boolean a(ljk ljk2) {
        return this.rkd.equals(ljk2.rkd);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ljk) {
            return this.a((ljk)object);
        }
        return super.equals(object);
    }
}

