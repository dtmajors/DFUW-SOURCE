/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;

public class bew
extends btk
implements bto {
    protected final boolean bC = false;
    private static boolean dez = false;
    private static boolean deA = false;
    private static boolean deB = false;
    private static boolean deC = false;
    private static boolean deD = false;
    private static boolean deE = false;
    private static boolean deF = false;
    private static boolean deG = false;
    private static boolean deH = false;
    private static boolean deI = false;
    private static boolean deJ = false;
    private static boolean deK = false;
    private static boolean deL = false;
    protected List<ldv> deM = lcn.emv();
    protected double deN = 0.0;
    protected int deO = -1;
    protected int deP = -1;
    protected boolean ddN;

    public static boolean c(bfb bfb2) {
        boolean bl = false;
        switch (bfb2) {
            case dfP: {
                return deE;
            }
            case dfR: {
                return deH;
            }
            case dfQ: {
                return deF;
            }
            case dfL: {
                return deA;
            }
            case dfS: {
                return deC;
            }
            case dfM: {
                return deB;
            }
            case dfN: {
                return dez;
            }
            case dfO: {
                return deD;
            }
            case dfX: {
                return deG;
            }
            case dfT: {
                return deI;
            }
            case dfY: {
                return deJ;
            }
            case dfZ: {
                return deK;
            }
            case dga: {
                return deL;
            }
        }
        assert (false);
        return bl;
    }

    public static void d(bfb bfb2) {
        bew.a(bfb2, true);
    }

    public static void e(bfb bfb2) {
        bew.a(bfb2, false);
    }

    private static void a(bfb bfb2, boolean bl) {
        switch (bfb2) {
            case dfP: {
                deE = bl;
                break;
            }
            case dfR: {
                deH = bl;
                break;
            }
            case dfQ: {
                deF = bl;
                break;
            }
            case dfL: {
                deA = bl;
                break;
            }
            case dfS: {
                deC = bl;
                break;
            }
            case dfM: {
                deB = bl;
                break;
            }
            case dfN: {
                dez = bl;
                break;
            }
            case dfO: {
                deD = bl;
                break;
            }
            case dfX: {
                deG = bl;
                break;
            }
            case dfT: {
                deI = bl;
                break;
            }
            case dfY: {
                deJ = bl;
                break;
            }
            case dfZ: {
                deK = bl;
                break;
            }
            case dga: {
                deL = bl;
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void doTick(ldz ldz2) {
    }

    protected int H(ldz ldz2) {
        double d2 = ldz2.rgz;
        double d3 = 50400.0 + d2 * lcw.qPM;
        double d4 = d3 % 86400.0;
        int n = (int)Math.floor(d3 / 86400.0);
        if (n != this.deO) {
            this.ddN = true;
            this.deO = n;
        }
        return (int)d4;
    }
}

