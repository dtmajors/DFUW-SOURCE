/*
 * Decompiled with CFR.
 */
public class fxq {
    public fxp Io(int n) {
        fxp fxp2 = null;
        switch (n) {
            case 19731: {
                fxp2 = new fwl();
                break;
            }
            case 19732: {
                fxp2 = new fwm();
                break;
            }
            case 19733: {
                fxp2 = new fxi();
                break;
            }
            case 19734: {
                fxp2 = new fxj();
                break;
            }
            case 19735: {
                fxp2 = new fxg();
                break;
            }
            case 19736: {
                fxp2 = new fxh();
                break;
            }
            default: {
                assert (false) : "Unknown Party Class Type Message [" + n + "]";
                break;
            }
        }
        return fxp2;
    }
}

