/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public class cnp
extends cbx
implements bto {
    public static final double eOA = 600.0;
    public static final int eOB = 500;
    private String bni = null;

    public cnp(boolean bl) {
        super(bl);
        this.ObjectType = 154;
    }

    public final String aUK() {
        return this.bni;
    }

    public final void cC(String string) {
        this.bni = string;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
    }
}

