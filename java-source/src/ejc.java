/*
 * Decompiled with CFR.
 */
public class ejc
extends ejm {
    private int isa = azf.cEa.ordinal();

    public azf bHx() {
        return azf.getValueByOrdinal(this.isa);
    }

    public void c(azf azf2) {
        this.isa = azf2 == null ? this.isa : azf2.ordinal();
    }

    ejc() {
        super(18737);
    }
}

