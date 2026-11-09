/*
 * Decompiled with CFR.
 */
public class dva
extends duy {
    private cxc gcr = null;

    public cxc bjd() {
        return this.gcr;
    }

    public void ci(cxc cxc2) {
        this.gcr = cxc2;
    }

    @Override
    public String toString() {
        return "SFEnchantingSkillFunction:" + super.toString() + " " + this.gcr;
    }

    @Override
    protected void a(dvc dvc2) {
        super.a(dvc2);
        dva dva2 = (dva)dvc2;
        dva2.ci(this.gcr.bfv());
    }
}

