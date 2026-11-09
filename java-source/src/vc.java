/*
 * Decompiled with CFR.
 */
public class vc
extends uu {
    public int Ps = 0;
    public float Pt = 0.0f;
    public int[] IngredientResourceTypes = null;

    public vc() {
        super(15);
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        vc vc2 = (vc)uk2;
        vc2.Ps = this.Ps;
        vc2.Pt = this.Pt;
        if (this.IngredientResourceTypes != null) {
            int[] nArray = new int[this.IngredientResourceTypes.length];
            System.arraycopy(this.IngredientResourceTypes, 0, nArray, 0, this.IngredientResourceTypes.length);
            vc2.IngredientResourceTypes = nArray;
        }
    }
}

