/*
 * Decompiled with CFR.
 */
public class duj {
    private String Name = null;
    private int heb = 0;
    private int hee = 0;

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public int bBb() {
        return this.heb;
    }

    public void Cp(int n) {
        this.heb = n;
    }

    public int bBf() {
        return this.hee;
    }

    public void Cq(int n) {
        this.hee = n;
    }

    public Class bBg() {
        return duj.Cr(this.heb);
    }

    public static Class Cr(int n) {
        switch (n) {
            case 1: 
            case 4: 
            case 6: {
                return Integer.TYPE;
            }
            case 2: {
                return Boolean.TYPE;
            }
            case 3: {
                return Double.TYPE;
            }
            case 5: {
                return Float.TYPE;
            }
            case 7: {
                return Long.TYPE;
            }
            case 8: {
                return lcq.class;
            }
            case 9: {
                return new ljq().getClass();
            }
            case 11: {
                return new ljp().getClass();
            }
            case 10: {
                return "".getClass();
            }
        }
        return null;
    }

    public String bBd() {
        return duk.Cs(this.heb);
    }

    public String bBh() {
        return duk.Ct(this.hee);
    }

    public String toString() {
        return "SFField: Name='" + this.Name + "' ValueType='" + this.bBd() + "' ConstraintType='" + this.bBh() + "'";
    }
}

