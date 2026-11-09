/*
 * Decompiled with CFR.
 */
import java.util.List;

public class aex {
    private final String aEN;
    private final String Name;
    public final lox DisplayName;
    public final lox bfJ;
    private final String aXn;
    private final boolean bfK;
    private final List<aez> bfL;
    private final boolean avz;

    public aex(String string, String string2, lox lox2, lox lox3, String string3, boolean bl, List<aez> list, boolean bl2) {
        this.aEN = string;
        this.Name = string2;
        this.DisplayName = lox2;
        this.bfJ = lox3;
        this.aXn = string3;
        this.bfK = bl;
        this.bfL = list;
        this.avz = bl2;
    }

    public boolean isPersistent() {
        return this.bfK;
    }

    public String getName() {
        return this.Name;
    }

    public lox wp() {
        return this.DisplayName;
    }

    public lox zl() {
        return this.bfJ;
    }

    public String zm() {
        return this.aXn;
    }

    public List<aez> zn() {
        return this.bfL;
    }

    public lox es(int n) {
        if (n < 0 || n >= this.bfL.size()) {
            return null;
        }
        aez aez2 = this.bfL.get(n);
        return aez2.zl();
    }

    public final boolean isEnabled() {
        return this.avz;
    }

    public final String zo() {
        return this.aEN;
    }
}

