/*
 * Decompiled with CFR.
 */
public class glk
extends glo {
    public static final int jkW = 0;
    public static final int jkX = 1;
    public static final int jkY = 2;
    public static final int jkZ = 3;
    public static final int jla = 4;
    private int ija = -1;
    private String jlb = null;
    private int jlc = -1;
    private int ayN = 0;

    glk() {
        super(35330);
    }

    public String CJ() {
        return this.jlb;
    }

    public void kZ(String string) {
        this.jlb = string;
    }

    public int qO() {
        return this.ayN;
    }

    public void JR(int n) {
        this.ayN = n;
    }

    public final int bVN() {
        return this.jlc;
    }

    public final void JS(int n) {
        this.jlc = n;
    }

    public final int bHc() {
        return this.ija;
    }

    public final void Eh(int n) {
        this.ija = n;
    }
}

