/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public enum xa {
    bah(mdi.uIx, null),
    bai(mdi.uIy, "novitiate"),
    baj(mdi.uIz, "ventures"),
    bak(mdi.uIA, "rumors"),
    bal(mdi.uIB, "chronicles"),
    bam(mdi.uIC, "novitiate");

    private lox DisplayName = null;
    private String ban = null;

    public lox wp() {
        return this.DisplayName;
    }

    public String cu() {
        return this.DisplayName == null ? null : this.DisplayName.getIdentifier();
    }

    public String wq() {
        return this.ban;
    }

    private xa(lox lox2, String string2) {
        this.DisplayName = lox2;
        this.ban = string2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.DisplayName.bD(new Object[0]).exA() : super.toString();
    }

    public static xa parse(String string) {
        String string2 = string.replace("_", "").toLowerCase();
        for (xa xa2 : xa.values()) {
            if (!xa2.name().toLowerCase().equals(string2)) continue;
            return xa2;
        }
        return bah;
    }
}

