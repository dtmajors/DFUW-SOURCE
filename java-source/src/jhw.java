/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Set;

public class jhw {
    public Set<jhv> nfY;
    public Set<jia> mQq;
    public Set<jhz> nfZ;

    public jhw() {
        this.nfY = lcn.emx();
        this.mQq = lcn.emx();
        this.nfZ = lcn.emx();
    }

    public jhw(Set<jhv> set, Set<jia> set2, Set<jhz> set3) {
        this.nfY = set;
        this.mQq = set2;
        this.nfZ = set3;
    }

    public jhw dGH() {
        return new jhw(this.dGI(), this.dGJ(), this.dGK());
    }

    private Set<jhv> dGI() {
        Set<jhv> set = lcn.emx();
        set.addAll(this.nfY);
        return set;
    }

    private Set<jia> dGJ() {
        Set<jia> set = lcn.emx();
        set.addAll(this.mQq);
        return set;
    }

    private Set<jhz> dGK() {
        Set<jhz> set = lcn.emx();
        set.addAll(this.nfZ);
        return set;
    }

    public String dGL() {
        itt itt2 = new itt("FilterOptions");
        itt2.a(this.dGM());
        itt2.a(this.dGN());
        itt2.a(this.dGO());
        return itt2.cDB();
    }

    public static jhw sl(String string) {
        itt itt2 = (itt)itt.rz(string);
        return new jhw(itt2);
    }

    public static boolean a(Set<jhv> set, ain ain2) {
        for (jhv jhv2 : set) {
            if (!jhv2.b(ain2)) continue;
            return true;
        }
        return false;
    }

    private jhw(itt itt2) {
        this();
        this.c(itt2.rB("Groups"));
        this.d(itt2.rB("States"));
        this.e(itt2.rB("ShopStates"));
    }

    private its dGM() {
        itt itt2 = new itt("Groups");
        for (jhv jhv2 : this.nfY) {
            itt2.M("Group", jhv2.ordinal());
        }
        return itt2;
    }

    private its dGN() {
        itt itt2 = new itt("States");
        for (jia jia2 : this.mQq) {
            itt2.M("State", jia2.ordinal());
        }
        return itt2;
    }

    private its dGO() {
        itt itt2 = new itt("ShopStates");
        for (jhz jhz2 : this.nfZ) {
            itt2.M("State", jhz2.ordinal());
        }
        return itt2;
    }

    private void c(itt itt2) {
        if (itt2 == null) {
            return;
        }
        List<its> list = itt2.getChildren();
        for (its its2 : list) {
            itu itu2 = (itu)its2;
            this.nfY.add(jhv.values()[itu2.getValue()]);
        }
    }

    private void d(itt itt2) {
        if (itt2 == null) {
            return;
        }
        List<its> list = itt2.getChildren();
        for (its its2 : list) {
            itu itu2 = (itu)its2;
            this.mQq.add(jia.values()[itu2.getValue()]);
        }
    }

    private void e(itt itt2) {
        if (itt2 == null) {
            return;
        }
        List<its> list = itt2.getChildren();
        for (its its2 : list) {
            itu itu2 = (itu)its2;
            this.nfZ.add(jhz.values()[itu2.getValue()]);
        }
    }

    public /* synthetic */ Object clone() {
        return this.dGH();
    }
}

