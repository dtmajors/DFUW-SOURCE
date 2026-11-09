/*
 * Decompiled with CFR.
 */
public class lon
extends lom {
    private lox rGE;
    private String[] rGF;

    public boolean a(lox lox2, String[] stringArray) {
        int n;
        int n2 = n = stringArray == null ? 0 : stringArray.length;
        if (n != lox2.rHh.length) {
            lfn.b(5, "SFArgumentProviderSimple", "Invalid number of arguments to string '" + lox2.Identifier + "' - Expected " + lox2.rHh.length + ", got " + n);
            assert (false);
            return false;
        }
        this.rGE = lox2;
        this.rGF = stringArray;
        return true;
    }

    @Override
    public String Bc(String string) {
        if (this.rGE.rHh != null) {
            for (int i = 0; i < this.rGE.rHh.length; ++i) {
                if (!this.rGE.rHh[i].Name.equals(string)) continue;
                return this.rGF[i];
            }
        }
        if (string.equals("Me")) {
            // empty if block
        }
        return "[UDV:" + string + "]";
    }

    @Override
    public loo Bd(String string) {
        if (this.rGE.rHh != null) {
            for (int i = 0; i < this.rGE.rHh.length; ++i) {
                if (!this.rGE.rHh[i].Name.equals(string)) continue;
                return this.rGE.rHh[i].rHj;
            }
        }
        if (string.equals("Me")) {
            return loo.rGO;
        }
        assert (false) : "ArgName : " + string;
        return loo.rGI;
    }

    @Override
    public Class<? extends Enum> Be(String string) {
        if (this.rGE.rHh != null) {
            for (int i = 0; i < this.rGE.rHh.length; ++i) {
                if (!this.rGE.rHh[i].Name.equals(string)) continue;
                return this.rGE.rHh[i].rFD;
            }
        }
        assert (false) : "ArgName : " + string;
        return null;
    }
}

