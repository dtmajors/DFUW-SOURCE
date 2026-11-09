/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public abstract class dnl {
    private final int cZn;
    public ldv gKR;
    public ldv ec = null;
    public int gKS = 0;
    public int gKT = 0;

    public dnl(int n) {
        this.cZn = n;
    }

    public final int brA() {
        return this.cZn;
    }

    public String brB() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": TransactionType='");
        stringBuilder.append(this.brC());
        stringBuilder.append("' TransactionGUID=");
        stringBuilder.append(this.gKR);
        stringBuilder.append(" RequestingObjectGUID=");
        stringBuilder.append(this.ec);
        stringBuilder.append(" ObjectAResourceType='");
        stringBuilder.append(lea.enW().getName(this.gKS));
        stringBuilder.append("' ObjectBResourceType='");
        stringBuilder.append(lea.enW().getName(this.gKT));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    public final String brC() {
        return dng.AV(this.cZn);
    }

    public final boolean AY(int n) {
        assert (n > 0);
        return lea.enW().isDescendant(n, cug.fpc);
    }

    public final boolean brD() {
        assert (this.gKS > 0);
        assert (this.gKT > 0);
        boolean bl = this.AY(this.gKS);
        if (dng.AW(this.cZn)) {
            return bl;
        }
        boolean bl2 = this.AY(this.gKT);
        if (bl == bl2) {
            return false;
        }
        return bl || bl2;
    }

    public boolean validate() {
        assert (this.cZn > 0);
        if (this.gKR == null) {
            lfn.b(5, "SFTransactionInfo", "validate() TransactionGUID is null.");
            return false;
        }
        if (this.ec == null) {
            lfn.b(5, "SFTransactionInfo", "validate() RequestingObjectGUID is null.");
            return false;
        }
        if (this.gKS <= 0) {
            lfn.b(5, "SFTransactionInfo", "validate() ObjectAResourceType is invalid.");
            return false;
        }
        if (this.gKT <= 0) {
            lfn.b(5, "SFTransactionInfo", "validate() ObjectBResourceType is invalid.");
            return false;
        }
        return true;
    }
}

