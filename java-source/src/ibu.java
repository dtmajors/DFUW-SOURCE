/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.Set;

public class ibu
extends ibs {
    private final String lGp;
    private final aud.a lGq;
    private final Set<aud.a> lGr = lcn.emx();

    public ibu(lox lox2, ics ics2, int n, String string, aud.a a2, aud.a a3, aud.a ... aArray) {
        super(lox2, ics2, n);
        this.lGp = string != null ? "/" + string : null;
        this.lGq = a2;
        this.lGr.add(a3);
        for (aud.a a4 : aArray) {
            this.lGr.add(a4);
        }
    }

    public String cNw() {
        return this.lGp;
    }

    public aud.a cNx() {
        return this.lGq;
    }

    public Set<aud.a> cNy() {
        return Collections.unmodifiableSet(this.lGr);
    }

    @Override
    public boolean d(jmz jmz2) {
        if (jmz2 instanceof jnc) {
            return this.lGr.contains((Object)((jnc)jmz2).dMZ());
        }
        return false;
    }

    @Override
    public boolean cNv() {
        int n = hso.cxK().cxP().cyZ().cAv();
        for (aud.a a2 : this.lGr) {
            if (ibu.a(a2, n)) continue;
            return false;
        }
        return ibu.a(this.lGq, n);
    }

    public boolean cNz() {
        return true;
    }

    public String toString() {
        return "SFInputChatChannel [" + this.cNq().bD(new Object[0]).exA() + "]";
    }

    private static boolean a(aud.a a2, int n) {
        switch (a2) {
            case caw: {
                return n >= hc.aaB.ordinal();
            }
            case caz: {
                return n >= hc.aaP.ordinal();
            }
        }
        return true;
    }
}

