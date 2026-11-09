/*
 * Decompiled with CFR.
 */
public class knu
extends khe {
    lfn ga = lfn.eqw();

    @Override
    public khd Xp(int n) {
        knt knt2 = null;
        switch (n) {
            case 257: {
                knt2 = new koe();
                break;
            }
            case 259: {
                knt2 = new kod();
                break;
            }
            case 260: {
                knt2 = new knr();
                break;
            }
            case 261: {
                knt2 = new knq();
                break;
            }
            case 262: {
                knt2 = new koc();
                break;
            }
            case 263: {
                knt2 = new knp();
                break;
            }
            case 258: {
                knt2 = new kob();
                break;
            }
            case 264: {
                knt2 = new kns();
                break;
            }
            case 265: {
                knt2 = new kof();
                break;
            }
            case 266: {
                knt2 = new knz();
                break;
            }
            case 267: {
                knt2 = new knx();
                break;
            }
            case 268: {
                knt2 = new koa();
                break;
            }
            case 269: {
                knt2 = new knw();
                break;
            }
            case 270: {
                knt2 = new kny();
                break;
            }
            case 271: {
                knt2 = new knv();
                break;
            }
            default: {
                lfn.b(4, "SF2DRequestFactory", "create2DRequest() : Cannot create unknown Unknown Request type [" + n + "]");
            }
        }
        return knt2;
    }
}

