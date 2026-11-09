/*
 * Decompiled with CFR.
 */
public class wr {
    public final byte aZj;
    public int Uo = -1;

    protected wr() {
        this.aZj = 0;
    }

    protected wr(byte by) {
        this.aZj = by;
    }

    protected void d(uk uk2) {
        uk2.Uo = this.Uo;
    }

    protected void c(uk uk2) {
        this.Uo = uk2.Uo;
    }

    public boolean e(uk uk2) {
        return this.Uo == uk2.Uo;
    }

    public static uk a(wr wr2) {
        uk uk2 = null;
        switch (wr2.aZj) {
            case 1: {
                uk2 = new ty();
                break;
            }
            case 2: {
                uk2 = new ub();
                break;
            }
            case 3: {
                uk2 = new uc();
                break;
            }
            case 4: {
                uk2 = new ut();
                break;
            }
            case 5: {
                uk2 = new va();
                break;
            }
            case 6: {
                uk2 = new uz();
                break;
            }
            case 7: {
                uk2 = new vn();
                break;
            }
            case 8: {
                uk2 = new ve();
                break;
            }
            case 9: {
                uk2 = new vi();
                break;
            }
            case 10: {
                uk2 = new vj();
                break;
            }
            case 11: {
                uk2 = new vk();
                break;
            }
            case 12: {
                uk2 = new vl();
                break;
            }
            case 13: {
                uk2 = new vq();
                break;
            }
            case 14: {
                uk2 = new ui();
                break;
            }
            case 15: {
                uk2 = new uj();
                break;
            }
            case 16: {
                uk2 = new um();
                break;
            }
            case 17: {
                uk2 = new un();
                break;
            }
            default: {
                lfn.print("Unhandled packed property update type!");
                assert (false);
                return null;
            }
        }
        wr2.d(uk2);
        return uk2;
    }

    public static wr f(uk uk2) {
        wr wr2 = null;
        switch (uk2.aWp) {
            case 1: {
                wr2 = new vx();
                break;
            }
            case 10: {
                wr2 = new wb();
                break;
            }
            case 11: {
                wr2 = new wc();
                break;
            }
            case 3: {
                wr2 = new vz();
                break;
            }
            case 13: {
                wr2 = new we();
                break;
            }
            case 12: {
                wr2 = new wd();
                break;
            }
            case 29: {
                wr2 = new wq();
                break;
            }
            case 16: {
                wr2 = new wg();
                break;
            }
            case 24: {
                wr2 = new wh();
                break;
            }
            case 25: {
                wr2 = new wi();
                break;
            }
            case 26: {
                wr2 = new wk();
                break;
            }
            case 27: {
                wr2 = new wn();
                break;
            }
            case 33: {
                wr2 = new wv();
                break;
            }
            case 9: {
                wr2 = new wm();
                break;
            }
            case 28: {
                wr2 = new wp();
                break;
            }
            case 30: {
                wr2 = new wu();
                break;
            }
            case 34: {
                wr2 = new wx();
                break;
            }
            default: {
                return null;
            }
        }
        wr2.c(uk2);
        return wr2;
    }
}

