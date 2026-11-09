/*
 * Decompiled with CFR.
 */
public class imh {
    private String mjb = "";
    private String mjc = "";

    public String deb() {
        return this.mjb;
    }

    public String dec() {
        return this.mjc;
    }

    void qy(String string) {
        if (string != null && !string.isEmpty()) {
            this.mjb = string;
            this.mjc = string.toLowerCase();
        } else {
            this.mjb = "";
            this.mjc = "";
        }
    }
}

