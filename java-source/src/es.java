/*
 * Decompiled with CFR.
 */
import java.util.StringTokenizer;

public class es
extends ej {
    private static final int[] Pr = new int[0];
    private int Ps;
    private float Pt;
    private int[] IngredientResourceTypes = Pr;
    private ldv Pu;
    private ald Pv;

    public es() {
        super(1);
        this.DP = 3;
    }

    public int fD() {
        return this.Ps;
    }

    public void bf(int n) {
        this.Ps = n;
    }

    public float fE() {
        return this.Pt;
    }

    public void m(float f) {
        this.Pt = f;
        if (this.DQ != null) {
            this.DQ.e(this);
        }
    }

    public int[] fF() {
        return this.IngredientResourceTypes;
    }

    public void a(int[] nArray) {
        this.IngredientResourceTypes = nArray;
    }

    public ldv fG() {
        return this.Pu;
    }

    public void E(ldv ldv2) {
        this.Pu = ldv2;
    }

    public ald fH() {
        if (this.Pv == null && this.Ps > 0) {
            this.Pv = lea.eog().get(this.Ps);
        }
        return this.Pv;
    }

    @Override
    public ej fm() {
        es es2 = new es();
        this.a(es2);
        return es2;
    }

    @Override
    public ej fn() {
        return this.fm();
    }

    public ali[] fI() {
        if (this.IngredientResourceTypes == null) {
            lfn.b(5, "SFEnchantmentAttribute", "getEnchantmentIngredients() IngredientResourceTypes array is null.");
            return null;
        }
        alc.a a2 = null;
        switch (this.Type) {
            case 1584: {
                a2 = alc.a.bru;
                break;
            }
            case 1600: {
                a2 = alc.a.brq;
                break;
            }
            case 1616: {
                a2 = alc.a.brm;
                break;
            }
            default: {
                lfn.b(5, "SFEnchantmentAttribute", "getEnchantmentIngredients() Invalid attributetype found: '" + this.getName() + "'");
                return null;
            }
        }
        int n = a2.ordinal();
        ali[] aliArray = new ali[this.IngredientResourceTypes.length];
        int n2 = aliArray.length;
        for (int i = 0; i < n2; ++i) {
            alc.a a3 = alc.a.getEnchantmentSlotType(n + i);
            aliArray[i] = new ali(this.IngredientResourceTypes[i], a3);
        }
        return aliArray;
    }

    public String fJ() {
        ald ald2 = this.fH();
        if (ald2 == null) {
            assert (this.Type == 1616);
            return "";
        }
        return ald2.Name;
    }

    public int[] fK() {
        if (this.IngredientResourceTypes == null) {
            return null;
        }
        int[] nArray = new int[this.IngredientResourceTypes.length];
        System.arraycopy(this.IngredientResourceTypes, 0, nArray, 0, this.IngredientResourceTypes.length);
        return nArray;
    }

    @Override
    public Object getValue() {
        return null;
    }

    public boolean fL() {
        switch (this.Type) {
            case 1440: 
            case 1456: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setValue(Object object) {
        lfn.b(5, "SFEnchantmentAttribute", "setValue() Not implemented.");
        assert (false);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("'");
        stringBuilder.append(this.getName());
        stringBuilder.append("' Enchantment='");
        stringBuilder.append(this.fJ());
        stringBuilder.append("' Strength=");
        stringBuilder.append(this.Pt);
        return stringBuilder.toString();
    }

    @Override
    protected void a(ej ej2) {
        super.a(ej2);
        es es2 = (es)ej2;
        es2.bf(this.Ps);
        es2.m(this.Pt);
        es2.a(this.fK());
    }

    @Override
    public final String fj() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.fD());
        stringBuilder.append(' ');
        stringBuilder.append(this.fE());
        stringBuilder.append(' ');
        if (this.IngredientResourceTypes == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append("[");
            for (int i = 0; i < this.IngredientResourceTypes.length; ++i) {
                if (i > 0) {
                    stringBuilder.append(',');
                }
                stringBuilder.append(this.IngredientResourceTypes[i]);
            }
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }

    @Override
    public final boolean aq(String string) {
        float f;
        int n;
        String string2 = string;
        int n2 = string.indexOf(32);
        if (n2 < 0) {
            lfn.b(5, "SFEnchantmentAttribute", "setDataAsString(): Data '" + string2 + "' doesn't contain first space");
            return false;
        }
        String string3 = string.substring(0, n2);
        if ((n2 = (string = string.substring(n2 + 1)).indexOf(32)) < 0) {
            lfn.b(5, "SFEnchantmentAttribute", "setDataAsString(): Data '" + string2 + "' doesn't contain second space");
            return false;
        }
        String string4 = string.substring(0, n2);
        String string5 = string.substring(n2 + 1);
        string = string.substring(n2 + 1);
        try {
            n = Integer.parseInt(string3);
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFEnchantmentAttribute", "setDataAsString(): Data '" + string2 + "' contains invalid ETPart integer");
            return false;
        }
        try {
            f = Float.parseFloat(string4);
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFEnchantmentAttribute", "setDataAsString(): Data '" + string2 + "' contains invalid ESPart float");
            return false;
        }
        int[] nArray = null;
        if (!string.equalsIgnoreCase("null")) {
            if (!string.startsWith("[") || !string.endsWith("]")) {
                lfn.b(5, "SFEnchantmentAttribute", "setDataAsString(): Data '" + string2 + "' final part isn't contained in []");
                return false;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(string.substring(1, string.length() - 1), ",");
            nArray = new int[stringTokenizer.countTokens()];
            int n3 = 0;
            try {
                while (stringTokenizer.hasMoreTokens()) {
                    String string6 = stringTokenizer.nextToken();
                    nArray[n3] = Integer.parseInt(string6);
                    ++n3;
                }
            }
            catch (NumberFormatException numberFormatException) {
                lfn.b(5, "SFEnchantmentAttribute", "setDataAsString(): Data '" + string2 + "' final part index " + n3 + " isn't a valid integer");
                return false;
            }
        }
        this.bf(n);
        this.m(f);
        this.a(nArray);
        return true;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof es)) {
            return false;
        }
        es es2 = (es)object;
        if (this.Ps != es2.Ps) {
            return false;
        }
        if (this.Pt != es2.Pt) {
            return false;
        }
        return super.equals(object);
    }
}

