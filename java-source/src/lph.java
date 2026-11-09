/*
 * Decompiled with CFR.
 */
public class lph
extends lpe {
    public final lpe rHQ;

    public lph(lpe lpe2) {
        super(lpi.rHU);
        this.rHQ = lpe2;
    }

    @Override
    public String a(lom lom2) {
        String string = this.rHQ.a(lom2);
        String string2 = string.contains(".") ? lpd.rHs.b(string, lom2) : lpd.rHs.a(string, lom2);
        return string2;
    }

    public String toString() {
        return "ID{" + this.rHQ.toString() + "}";
    }
}

