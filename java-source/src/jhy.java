/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.Map;

public class jhy {
    private ain ngd;
    private boolean nge;
    private lox ngf;
    private lox ngg;
    private lox ngh;
    private Map<Integer, jhx> ngi = lcn.emw();

    public jhy(ain ain2, boolean bl, lox lox2, lox lox3, lox lox4) {
        this.ngd = ain2;
        this.nge = bl;
        this.ngf = lox2;
        this.ngg = lox3;
        this.ngh = lox4;
        this.dGZ();
    }

    public ain BP() {
        return this.ngd;
    }

    public Map<Integer, jhx> dGV() {
        return Collections.unmodifiableMap(this.ngi);
    }

    public jhx UI(int n) {
        return this.ngi.get(n);
    }

    public loz aND() {
        return lvn.sXN.bD(this.ngd.name());
    }

    public boolean a(jhw jhw2) {
        for (jhx jhx2 : this.ngi.values()) {
            if (!jhx2.a(jhw2)) continue;
            return true;
        }
        return false;
    }

    public boolean a(jib jib2) {
        for (jhx jhx2 : this.ngi.values()) {
            if (!jhx2.a(jib2)) continue;
            return true;
        }
        return false;
    }

    public boolean dGW() {
        return this.nge;
    }

    public boolean dGG() {
        return !this.ngi.isEmpty();
    }

    public loz aNv() {
        return this.ngf.bD(new Object[0]);
    }

    public loz dGX() {
        return this.ngg.bD(new Object[0]);
    }

    public loz dGY() {
        return this.ngh.bD(new Object[0]);
    }

    private void dGZ() {
        Map<Integer, civ> map = lea.epC();
        for (civ civ2 : map.values()) {
            ciw ciw2;
            if (!(civ2 instanceof ciw) || (ciw2 = (ciw)civ2).BP() != this.ngd) continue;
            this.ngi.put(ciw2.az(), new jhx(ciw2, this));
        }
    }
}

