/*
 * Decompiled with CFR.
 */
public class mij
extends lgu {
    public mii aeu(int n) {
        mii mii2 = null;
        switch (n) {
            case 2: {
                mii2 = new mig();
                break;
            }
            case 1: {
                mii2 = new mih();
                break;
            }
            case 4: {
                mii2 = new mil();
                break;
            }
            case 3: {
                mii2 = new mim();
                break;
            }
            default: {
                assert (false);
                return null;
            }
        }
        ldv ldv2 = this.erH();
        mii2.qP(ldv2);
        return mii2;
    }
}

