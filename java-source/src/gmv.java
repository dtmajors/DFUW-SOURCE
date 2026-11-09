/*
 * Decompiled with CFR.
 */
public class gmv
extends gmx {
    private int jmp = 0;
    private int jmq = 0;
    private int jmr = 0;
    private int jms = 0;
    private int jmt = 0;
    private String[] jmu = null;
    private int[] jmv = null;

    public int bWe() {
        return this.jmp;
    }

    public void JZ(int n) {
        this.jmp = n;
    }

    public int bWf() {
        return this.jmq;
    }

    public void Ka(int n) {
        this.jmq = n;
    }

    public int bWg() {
        return this.jmr;
    }

    public void Kb(int n) {
        this.jmr = n;
    }

    public int bWh() {
        return this.jms;
    }

    public void Kc(int n) {
        this.jms = n;
    }

    public int bWi() {
        return this.jmt;
    }

    public void Kd(int n) {
        this.jmt = n;
    }

    public String[] bWj() {
        return this.jmu;
    }

    public void F(String[] stringArray) {
        this.jmu = stringArray;
    }

    public int[] bWk() {
        return this.jmv;
    }

    public void ax(int[] nArray) {
        this.jmv = nArray;
    }

    gmv() {
        super(3612);
    }
}

