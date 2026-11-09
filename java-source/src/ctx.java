/*
 * Decompiled with CFR.
 */
public class ctx
extends ctt {
    public int Type = 0;
    public String Name = null;
    public transient ctm fgp = null;
    public String ResourceGroupName = null;
    public int[] IngredientResourceTypes = null;
    public String[] IngredientResourceNames = null;
    public String RareIngredientResourceName = null;

    public int[] fK() {
        if (this.IngredientResourceTypes == null) {
            return null;
        }
        int[] nArray = new int[this.IngredientResourceTypes.length];
        System.arraycopy(this.IngredientResourceTypes, 0, nArray, 0, this.IngredientResourceTypes.length);
        return nArray;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": Name='");
        stringBuilder.append(this.Name);
        stringBuilder.append("' RareIngredient='");
        stringBuilder.append(this.fgp.pa());
        stringBuilder.append("' Ingredients=[");
        int n = this.Ingredients.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(this.Ingredients[i].pa());
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public void validate() {
        super.validate();
        if (this.Type <= 0) {
            throw new bg("Type is invalid.");
        }
        if (this.Name == null || this.Name.trim().equals("")) {
            throw new bg("Name is invalid.");
        }
        if (this.fgp == null) {
            throw new bg("RareIngredient is invalid.");
        }
        if (this.ResourceGroupName == null || this.ResourceGroupName.trim().equals("")) {
            throw new bg("ResourceGroupName is invalid.");
        }
    }
}

