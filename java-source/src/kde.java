/*
 * Decompiled with CFR.
 */
public class kde
extends kcz {
    public int hB;
    public int gOd;
    public String FirstName;
    public String LastName;
    public boolean pgA;
    public static final int pgB = 1;
    public static final int pgC = 2;
    public static final int pgD = 3;

    kde() {
        super(293);
    }

    public String toString() {
        return this.getClass().getSimpleName() + " Operation=" + this.gOd + ", AccountID=" + this.hB + ", FirstName=" + this.FirstName + ", LastName=" + this.LastName + ", FromGUID=" + this.aO().fk() + ", ToGUID=" + this.amk().fk();
    }
}

