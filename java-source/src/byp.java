/*
 * Decompiled with CFR.
 */
public class byp
extends bzi {
    private boolean dZm = false;

    public boolean aEc() {
        return this.dZm;
    }

    public void fi(boolean bl) {
        this.dZm = bl;
    }

    public boolean equals(Object object) {
        byp byp2;
        return object instanceof byp && this.edc == (byp2 = (byp)object).aER() && this.dZm == byp2.aEc();
    }

    @Override
    public boolean a(byx byx2) {
        if (this.edc) {
            return this.dZm != byx2.aEc();
        }
        return this.dZm == byx2.aEc();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFJumpSkillRequirement: ");
        stringBuilder.append(super.toString());
        stringBuilder.append(" JumpSkillTriggered=");
        stringBuilder.append(this.dZm);
        return stringBuilder.toString();
    }

    @Override
    protected void a(bzi bzi2) {
        super.a(bzi2);
        byp byp2 = (byp)bzi2;
        byp2.fi(this.dZm);
    }
}

