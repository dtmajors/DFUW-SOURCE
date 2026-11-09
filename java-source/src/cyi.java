/*
 * Decompiled with CFR.
 */
public class cyi
extends cyg {
    public final int aXr;
    public final boolean bhy;

    public cyi(int n2, double d2, double d3, int n3) {
        super(n2, d2, d3);
        this.aXr = n3;
        this.bhy = false;
    }

    public cyi(int n2, double d2, double d3, int n3, boolean bl) {
        super(n2, d2, d3);
        this.aXr = n3;
        this.bhy = bl;
    }

    public String bgK() {
        return lea.enZ().getName(this.aXr);
    }

    @Override
    public boolean yF(int n2) {
        return lea.enZ().isDescendant(n2, this.aXr);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" BlockingSkill='");
        stringBuilder.append(lea.enZ().getName(this.aXr));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

