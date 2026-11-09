/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Random;

public class ded {
    private static final float geY = 0.05f;
    private static final float geZ = 10000.0f;
    private static final double gfa = 1.0E-4;
    private static final float gfb = 10000.0f;
    private static final float gfc = 100000.0f;
    private int gfd;
    private float gfe = 0.0f;
    private static Random eNu;

    public ded() {
        eNu = new Random();
    }

    public void zN(int n2) {
        this.gfe += (float)n2 * 0.05f;
    }

    public String bku() {
        return lea.enW().getName(this.gfd);
    }

    public float bkv() {
        if (this.gfd == cug.frb) {
            return 10000.0f;
        }
        if (this.gfd == cug.frc) {
            return 100000.0f;
        }
        return 10000.0f;
    }

    public boolean bkw() {
        if (this.gfe < this.bkv()) {
            return false;
        }
        return eNu.nextDouble() < 1.0E-4;
    }

    public final int bkx() {
        return this.gfd;
    }

    public final void zO(int n2) {
        this.gfd = n2;
    }

    public final int bky() {
        int n2 = (int)this.gfe;
        this.gfe = 0.0f;
        return n2;
    }

    public final int bkz() {
        return (int)this.gfe;
    }

    public final void gi(float f2) {
        this.gfe = f2;
        if (this.gfe < 0.0f) {
            assert (false);
            this.gfe = 0.0f;
        }
    }
}

