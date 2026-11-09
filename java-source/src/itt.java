/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.List;

public class itt
extends its {
    private List<its> lGI = lcn.emv();

    public itt() {
    }

    public itt(String string) {
        super(string);
    }

    public its rA(String string) {
        for (its its2 : this.lGI) {
            if (!its2.getName().equals(string)) continue;
            return its2;
        }
        return null;
    }

    public itt rB(String string) {
        return (itt)this.rA(string);
    }

    public String T(String string, String string2) {
        for (its its2 : this.lGI) {
            if (!its2.getName().equals(string)) continue;
            if (its2 instanceof itx) {
                return ((itx)its2).getValue();
            }
            return string2;
        }
        return string2;
    }

    public int L(String string, int n) {
        for (its its2 : this.lGI) {
            if (!its2.getName().equals(string)) continue;
            if (its2 instanceof itu) {
                return ((itu)its2).getValue();
            }
            return n;
        }
        return n;
    }

    public boolean A(String string, boolean bl) {
        for (its its2 : this.lGI) {
            if (!its2.getName().equals(string)) continue;
            if (its2 instanceof itr) {
                return ((itr)its2).getValue();
            }
            return bl;
        }
        return bl;
    }

    public List<its> getChildren() {
        return Collections.unmodifiableList(this.lGI);
    }

    public void a(its its2) {
        this.lGI.add(its2);
    }

    public void b(its its2) {
        this.lGI.remove(its2);
    }

    public its U(String string, String string2) {
        for (its its2 : this.lGI) {
            String string3;
            if (!(its2 instanceof itt) || (string3 = ((itt)its2).T(string, null)) == null || !string3.equals(string2)) continue;
            return its2;
        }
        return null;
    }

    public itt M(String string, int n) {
        this.a(new itu(string, n));
        return this;
    }

    public itt V(String string, String string2) {
        this.a(new itx(string, string2));
        return this;
    }

    public itt a(String string, Boolean bl) {
        this.a(new itr(string, bl));
        return this;
    }
}

