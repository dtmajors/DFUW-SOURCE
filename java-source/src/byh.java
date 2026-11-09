/*
 * Decompiled with CFR.
 */
public class byh
extends bzi {
    private boolean dZd = false;

    public boolean aDT() {
        return this.dZd;
    }

    public void fh(boolean bl) {
        this.dZd = bl;
    }

    public boolean equals(Object object) {
        byh byh2;
        return object instanceof byh && this.edc == (byh2 = (byh)object).aER() && this.dZd == byh2.aDT();
    }

    @Override
    public boolean a(byx byx2) {
        if (this.edc) {
            return this.dZd != byx2.aDT();
        }
        return this.dZd == byx2.aDT();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFEvadeSkillRequirement: ");
        stringBuilder.append(super.toString());
        stringBuilder.append(" EvadeSkillTriggered=");
        stringBuilder.append(this.dZd);
        return stringBuilder.toString();
    }

    @Override
    protected void a(bzi bzi2) {
        super.a(bzi2);
        byh byh2 = (byh)bzi2;
        byh2.fh(this.dZd);
    }
}

