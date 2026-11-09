/*
 * Decompiled with CFR.
 */
public class ctt {
    public ctm[] Ingredients = null;

    public final boolean a(ctm ctm2) {
        assert (this.Ingredients != null);
        assert (this.Ingredients.length > 0);
        if (ctm2 == null) {
            return false;
        }
        if (this.um(ctm2.ResourceType) >= 0) {
            return false;
        }
        ctm[] ctmArray = new ctm[this.Ingredients.length + 1];
        for (ctm ctmArray[var3_3] : this.Ingredients) {
        }
        ctmArray[ctmArray.length - 1] = ctm2;
        this.Ingredients = ctmArray;
        return true;
    }

    public final ctt bbE() {
        ctt ctt2 = null;
        try {
            Class<?> clazz = this.getClass();
            ctt2 = (ctt)clazz.newInstance();
            this.a(ctt2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return ctt2;
    }

    public final boolean b(ctm ctm2) {
        assert (this.Ingredients != null);
        assert (this.Ingredients.length > 0);
        if (ctm2 == null) {
            return false;
        }
        int n = this.um(ctm2.ResourceType);
        if (n < 0) {
            return false;
        }
        if (this.Ingredients.length == 1) {
            return false;
        }
        ctm[] ctmArray = new ctm[this.Ingredients.length - 1];
        int n2 = 0;
        int n3 = this.Ingredients.length;
        for (int i = 0; i < n3; ++i) {
            if (i == n) continue;
            ctmArray[n2] = this.Ingredients[i];
            ++n2;
        }
        this.Ingredients = ctmArray;
        return true;
    }

    public String toString() {
        assert (this.Ingredients != null);
        StringBuilder stringBuilder = new StringBuilder();
        int n = this.Ingredients.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(this.Ingredients[i].toString());
        }
        return stringBuilder.toString();
    }

    public void validate() {
        if (this.Ingredients == null) {
            throw new bg("Ingredients array is null.");
        }
        if (this.Ingredients.length != 3) {
            throw new bg("Ingredients array has invalid length.");
        }
        int n = this.Ingredients.length;
        for (int i = 0; i < n; ++i) {
            if (this.Ingredients[i] != null) continue;
            throw new bg("Ingredient " + i + " is null.");
        }
    }

    protected void a(ctt ctt2) {
        assert (this.Ingredients != null);
        assert (this.Ingredients.length > 0);
        ctm[] ctmArray = new ctm[this.Ingredients.length];
        int n = ctmArray.length;
        for (int i = 0; i < n; ++i) {
            ctmArray[i] = this.Ingredients[i].bbC();
        }
        ctt2.Ingredients = ctmArray;
    }

    private int um(int n) {
        assert (this.Ingredients != null);
        assert (this.Ingredients.length > 0);
        int n2 = this.Ingredients.length;
        for (int i = 0; i < n2; ++i) {
            if (this.Ingredients[i].ResourceType != n) continue;
            return i;
        }
        return -1;
    }
}

