/*
 * Decompiled with CFR.
 */
public class kmf
extends kmn {
    public static final int pMj = 1;
    public static final int pMk = 2;
    public static final int plP = 4;
    public static final int pMl = 8;
    public static final int pMm = 16;
    public static final int pMn = 32;
    public static final int pMo = 64;
    public int pMp = 0;
    public boolean dsK = false;
    public boolean Active = true;
    public lcv pMq = null;
    public lfh pMr = null;
    public lhl pMs = null;
    public ljq gBw = null;
    public float gBB = 1.0f;
    public float gBC = 1.0f;

    public kmf() {
        this.Jv(3340);
    }

    public void a(kmf kmf2) {
        this.pMp = kmf2.pMp;
        this.dsK = kmf2.dsK;
        this.Active = kmf2.Active;
        this.pMq = kmf2.pMq;
        this.pMr = kmf2.pMr;
        this.pMs = kmf2.pMs;
        this.gBw = kmf2.gBw;
        this.gBB = kmf2.gBB;
        this.gBC = kmf2.gBC;
        super.a(kmf2);
    }
}

