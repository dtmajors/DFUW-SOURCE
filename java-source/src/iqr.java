/*
 * Decompiled with CFR.
 */
public class iqr
extends iqv {
    private int mtV;
    private int mtW;
    private int mtX;
    private int mtY;

    public iqr(int n, int n2, int n3, int n4) {
        this.mtV = n;
        this.mtW = n2;
        this.mtX = n3;
        this.mtY = n4;
    }

    @Override
    public void i(ipf ipf2) {
        iph iph2 = (iph)ipf2;
        ira.a(iph2, -this.mtV, -this.mtW, ipf2.getWidth() + this.mtV + this.mtX, ipf2.getHeight() + this.mtW + this.mtY);
    }

    public int dna() {
        return this.mtV;
    }

    public int dnb() {
        return this.mtW;
    }

    public int dnc() {
        return this.mtX;
    }

    public int dnd() {
        return this.mtY;
    }

    public void y(int n, int n2, int n3, int n4) {
        this.mtV = n;
        this.mtW = n2;
        this.mtX = n3;
        this.mtY = n4;
    }
}

