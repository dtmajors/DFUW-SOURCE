/*
 * Decompiled with CFR.
 */
import java.util.Random;

public class lhx
extends lhw {
    private double rnY;
    private double rnZ;
    private Random RD = new Random();

    public lhx(double d2, double d3, double d4) {
        this.rnY = d3;
        this.rnZ = d4;
        this.ec(d2);
    }

    @Override
    public void ec(double d2) {
        this.aAh = d2 + this.rnY + this.RD.nextDouble() * this.rnZ;
    }
}

