/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Map;

public class jgs {
    private boolean naZ = false;
    private boolean adg = false;
    private boolean aRf = false;
    private boolean nba = false;
    private boolean nbb = false;
    private int acX = 0;
    private float acY = 0.0f;
    private boolean or = false;
    private final Map<ldv, a> dig = lcn.emw();

    public void a(ldv[] ldvArray, String[] stringArray, float[] fArray, boolean[] blArray) {
        if (ldvArray == null || stringArray == null || fArray == null || blArray == null || ldvArray.length != stringArray.length || stringArray.length != fArray.length || fArray.length != blArray.length) {
            assert (false);
            return;
        }
        for (int i = 0; i < ldvArray.length; ++i) {
            this.a(ldvArray[i], stringArray[i], fArray[i], blArray[i]);
        }
    }

    public void a(ldv ldv2, String string, float f, boolean bl) {
        assert (!this.dig.containsKey(ldv2));
        this.dig.put(ldv2, new a(this, ldv2, string, f, bl));
    }

    public void jK(ldv ldv2) {
        assert (this.dig.containsKey(ldv2));
        this.dig.remove(ldv2);
    }

    public a rP(ldv ldv2) {
        return this.dig.get(ldv2);
    }

    public void b(ldv ldv2, String string, float f, boolean bl) {
        assert (this.dig.containsKey(ldv2));
        a a2 = this.dig.get(ldv2);
        a2.a(string, f, bl);
    }

    public Collection<a> dEX() {
        return this.dig.values();
    }

    public int dEY() {
        return this.dig.size();
    }

    public void a(frc frc2) {
        this.adg = frc2.bRy();
        this.naZ = frc2.bRA();
        this.acX = frc2.pU();
        this.acY = frc2.tY();
        this.nba = frc2.isRegistered();
        this.nbb = frc2.pT();
        this.aRf = frc2.tX();
        this.or = frc2.isCanceled();
    }

    public final int pU() {
        return this.acX;
    }

    public final float tY() {
        return this.acY;
    }

    public final boolean isRegistered() {
        return this.nba;
    }

    public final boolean pT() {
        return this.nbb;
    }

    public final boolean bRA() {
        return this.naZ;
    }

    public final boolean tX() {
        return this.aRf;
    }

    public final boolean isCanceled() {
        return this.or;
    }

    public final boolean dEZ() {
        return this.adg;
    }

    public boolean si(String string) {
        if (this.dig == null || this.dig.isEmpty()) {
            return false;
        }
        for (a a2 : this.dig.values()) {
            if (!a2.getName().equals(string)) continue;
            return true;
        }
        return false;
    }
}

