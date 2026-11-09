/*
 * Decompiled with CFR.
 */
public class alw
extends alx {
    private boolean bsX = true;
    private float bsv = 0.0f;

    public boolean Et() {
        return this.bsX;
    }

    public void bd(boolean bl) {
        this.bsX = bl;
    }

    public float DS() {
        return this.bsv;
    }

    public void aq(float f2) {
        this.bsv = f2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" Skill='");
        stringBuilder.append(this.Bu());
        stringBuilder.append("' MinimumSkillLevelModifier=");
        stringBuilder.append(this.bsX);
        stringBuilder.append(" ModifierValue=");
        stringBuilder.append(this.bsv);
        return stringBuilder.toString();
    }

    @Override
    protected void g(alt alt2) {
        super.g(alt2);
        alw alw2 = (alw)alt2;
        alw2.bd(this.bsX);
        alw2.aq(this.bsv);
    }
}

