/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;

public abstract class zu
extends yy {
    private int Gender = 0;

    public int cC() {
        return this.Gender;
    }

    protected zu(wy wy2, zb zb2, int n, int n2) {
        super(wy2, zb2, zc.bcf, n, n2);
    }

    @Override
    public boolean xp() {
        return false;
    }

    @Override
    public boolean i(Element element) {
        if (element == null) {
            return false;
        }
        String string = element.getAttribute("gender");
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            this.Gender = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return this.Gender == 1 || this.Gender == 2;
    }

    protected zu a(zu zu2) {
        if (zu2 != null) {
            zu2.Gender = this.Gender;
        }
        return zu2;
    }
}

