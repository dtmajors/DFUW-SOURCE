/*
 * Decompiled with CFR.
 */
public class frf
extends frd {
    public static final int iUN = 1;
    public static final int iUO = 2;
    public static final int iUP = 3;
    public int ipI = 0;
    public int biq = 0;
    public int aYH = 0;
    public ljq aZH = null;
    public ldv dtj = null;
    public ldv Ui = null;
    public int ResourceType = 0;
    public ljq aZD = null;
    public float biu = 0.0f;
    public float duq = 0.0f;
    private int iJx = 0;
    private float dus = 0.0f;
    public boolean geu = true;

    frf() {
        super(14081);
    }

    public cxd.f aCD() {
        return cxd.f.getHitLocationType(this.iJx);
    }

    public void a(cxd.f f2) {
        this.iJx = f2.ordinal();
    }

    public final float bOo() {
        return this.dus;
    }

    public final void iV(float f2) {
        this.dus = f2;
    }
}

