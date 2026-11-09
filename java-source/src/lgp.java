/*
 * Decompiled with CFR.
 */
import java.util.Random;

public class lgp {
    public static final int rmy = 1;
    private static lgp rmz = new lgp();
    private Random rmA = new Random();

    private lgp() {
    }

    public static lgp erA() {
        return rmz;
    }

    public boolean cS(float f) {
        float f2 = this.acI(1);
        return f2 <= f;
    }

    public boolean nn(float f) {
        float f2 = this.acI(1);
        return f2 > f;
    }

    public float nextFloat() {
        return this.acI(1);
    }

    public float acI(int n) {
        float f = 0.0f;
        switch (n) {
            case 1: {
                f = this.rmA.nextFloat();
                break;
            }
            default: {
                lfn.b(5, "SFRandom", "nextFloat() Invalid RandomType provided: " + n);
                assert (false);
                break;
            }
        }
        return f;
    }
}

