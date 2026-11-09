/*
 * Decompiled with CFR.
 */
public class inq
extends ifg {
    public final ldv aCK;
    public final inr mmO;
    private float mmP;
    private float mmQ;

    public inq(inr inr2, ldv ldv2, float f, float f2) {
        super("SingleItem.swf");
        this.aCK = ldv2;
        this.mmO = inr2;
        this.mmP = f;
        this.mmQ = f2;
    }

    public void initialize() {
        super.initialize();
    }

    @Override
    public void cBa() {
        super.cBa();
        ins ins2 = this.mmO.rF(this.aCK);
        if (ins2 == null) {
            return;
        }
        String string = "texture/dds/" + ins2.dhm().enm();
        this.a("setItem", new Object[]{string});
    }

    @Override
    public void dC(int n, int n2) {
        super.dC(n, n2);
        this.R((float)n - this.mmP, (float)n2 - this.mmQ);
    }
}

