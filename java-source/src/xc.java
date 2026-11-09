/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cex
 *  ha
 */
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class xc
extends btk
implements bto {
    public static final char baq = 'Q';
    public static final char bar = 'N';
    public static final char bas = 'C';
    public static final char bat = 'T';
    public static final char bau = 'A';
    public static final char bav = 'I';
    public static final char baw = 'C';
    public static final char bax = 'A';
    public static final char bay = 'P';
    public static final char baz = 'L';
    public static final char baA = 'U';
    public static final char baB = ';';
    public static final char baC = ',';
    protected static Map<Integer, wy> aza = lcn.emw();
    protected static Map<Integer, xb> baD = lcn.emw();
    private Set<xh> baE = null;

    public static void a(wy wy2) {
        if (wy2 == null) {
            return;
        }
        if (aza.containsKey(wy2.getID())) {
            return;
        }
        aza.put(wy2.getID(), wy2);
    }

    public static wy dN(int n) {
        return aza.get(n);
    }

    public static Map<Integer, wy> wu() {
        return Collections.unmodifiableMap(aza);
    }

    public static void b(xb xb2) {
        if (xb2 == null) {
            return;
        }
        if (baD.containsKey(xb2.getID())) {
            return;
        }
        baD.put(xb2.getID(), xb2);
    }

    public static xb dO(int n) {
        return baD.get(n);
    }

    public static Map<Integer, xb> wv() {
        return Collections.unmodifiableMap(baD);
    }

    protected xc() {
    }

    public boolean dP(int n) {
        return false;
    }

    public boolean cR(int n) {
        return false;
    }

    public boolean dQ(int n) {
        return false;
    }

    public void a(wy wy2, abd abd2) {
    }

    public void c(wy wy2) {
    }

    public ha mA() {
        return null;
    }

    public cex nW() {
        return null;
    }

    public cew nY() {
        return null;
    }

    public bex wh() {
        return null;
    }

    public void a(acc acc2) {
    }

    public void b(acc acc2) {
    }

    public void a(wy wy2, aaz aaz2, boolean bl, boolean bl2) {
    }

    public void a(wy wy2, aaz aaz2, boolean bl) {
    }

    public void a(aci aci2) {
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.baE == null) {
            return;
        }
        for (xh xh2 : new HashSet<xh>(this.baE)) {
            xh2.doTick(ldz2);
        }
    }

    public void a(xh xh2) {
        if (xh2 == null) {
            return;
        }
        if (this.baE == null) {
            this.baE = lcn.emx();
        }
        this.baE.add(xh2);
    }

    public void b(xh xh2) {
        if (xh2 == null) {
            return;
        }
        if (this.baE == null) {
            return;
        }
        this.baE.remove(xh2);
        if (this.baE.isEmpty()) {
            this.baE = null;
        }
    }

    public acj a(ack ack2) {
        if (ack2 == null) {
            return null;
        }
        acj acj2 = new acj(ack2);
        acj2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(acj2);
        return acj2;
    }

    public void a(acj acj2) {
        if (acj2 == null) {
            return;
        }
        this.MessageDelegator.hd(acj2.getGUID());
    }

    public gdw cu(ldv ldv2) {
        gdw gdw2 = (gdw)this.MessageDelegator.h(34818, this.getGUID(), ldv2);
        gdw2.aN(this.MessageDelegator.arc().rgz);
        return gdw2;
    }

    public gds cr(ldv ldv2) {
        gds gds2 = (gds)this.MessageDelegator.h(34819, this.getGUID(), ldv2);
        gds2.aN(this.MessageDelegator.arc().rgz);
        return gds2;
    }

    public gec cs(ldv ldv2) {
        gec gec2 = (gec)this.MessageDelegator.h(34820, this.getGUID(), ldv2);
        gec2.aN(this.MessageDelegator.arc().rgz);
        return gec2;
    }

    public gdq ct(ldv ldv2) {
        gdq gdq2 = (gdq)this.MessageDelegator.h(34821, this.getGUID(), ldv2);
        gdq2.aN(this.MessageDelegator.arc().rgz);
        return gdq2;
    }

    public void a(gdt gdt2) {
        if (gdt2 == null) {
            return;
        }
        this.MessageDelegator.F(gdt2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            default: 
        }
        super.receiveMessage(dxq2);
    }

    public static String dR(int n) {
        return 'Q' + Integer.toString(n) + 'A';
    }

    public static String dS(int n) {
        return 'Q' + Integer.toString(n) + 'P';
    }

    public static String dT(int n) {
        return 'Q' + Integer.toString(n) + 'C';
    }

    public static String dU(int n) {
        return 'N' + Integer.toString(n) + 'A';
    }

    public static String dV(int n) {
        return 'N' + Integer.toString(n) + 'C';
    }

    public static String dW(int n) {
        return 'I' + Integer.toString(n) + 'L';
    }

    public static String dX(int n) {
        return 'I' + Integer.toString(n) + 'U';
    }

    public static char cm(String string) {
        if (string == null || string.length() < 3) {
            return '\u0000';
        }
        return string.charAt(0);
    }

    public static int cn(String string) {
        if (string == null || string.length() < 3) {
            return -1;
        }
        int n = 1;
        int n2 = 0;
        for (int i = n; i < string.length() && Character.isDigit(string.charAt(i)); ++i) {
            ++n2;
        }
        String string2 = string.substring(n, n + n2);
        try {
            return Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }

    public static char co(String string) {
        if (string == null || string.length() < 3) {
            return '\u0000';
        }
        for (int i = 1; i < string.length(); ++i) {
            if (!Character.isLetter(string.charAt(i))) continue;
            return string.charAt(i);
        }
        assert (false);
        return '\u0000';
    }
}

