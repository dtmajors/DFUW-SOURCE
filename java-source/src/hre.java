/*
 * Decompiled with CFR.
 */
public abstract class hre<ROW, FIELD>
extends hrd<ROW, FIELD> {
    private final ROW[] lab;

    public hre(ROW[] ROWArray) {
        super(1, new hrn(ROWArray.length));
        this.lab = ROWArray;
    }

    @Override
    public ROW LQ(int n) {
        return this.lab[n];
    }

    @Override
    public abstract FIELD a(ROW var1, int var2);
}

