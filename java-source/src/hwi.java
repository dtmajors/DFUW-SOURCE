/*
 * Decompiled with CFR.
 */
public class hwi {
    private int lij;
    private int lik;
    private String lil;

    public hwi(String string, int n, int n2) {
        assert (string != null);
        this.lil = string;
        this.lij = n;
        this.lik = n2;
    }

    public String pa() {
        return this.lil;
    }

    public int cBc() {
        return this.lij;
    }

    public int cBd() {
        return this.lik;
    }

    public static boolean a(hwi hwi2, hwi hwi3) {
        if (hwi2 == hwi3) {
            return true;
        }
        if (hwi2 == null || hwi3 == null) {
            return false;
        }
        return hwi2.lil.equals(hwi3.lil) && hwi2.lij == hwi3.lij && hwi2.lik == hwi3.lik;
    }
}

