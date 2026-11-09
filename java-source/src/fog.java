/*
 * Decompiled with CFR.
 */
public class fog {
    private lfn ga = lfn.eqw();

    public dxq Hb(int n) {
        fof fof2 = null;
        switch (n) {
            case 11521: {
                fof2 = new fob();
                break;
            }
            case 11522: {
                fof2 = new foi();
                break;
            }
            case 11523: {
                fof2 = new fnx();
                break;
            }
            case 11526: {
                fof2 = new foo();
                break;
            }
            case 11527: {
                fof2 = new fon();
                break;
            }
            case 11528: {
                fof2 = new fol();
                break;
            }
            case 11529: {
                fof2 = new fom();
                break;
            }
            case 11530: {
                fof2 = new foa();
                break;
            }
            case 11531: {
                fof2 = new foh();
                break;
            }
            case 11532: {
                fof2 = new fod();
                break;
            }
            case 11533: {
                fof2 = new foe();
                break;
            }
            case 11534: {
                fof2 = new fny();
                break;
            }
            case 11535: {
                fof2 = new fnz();
                break;
            }
            case 11536: {
                fof2 = new foj();
                break;
            }
            case 11537: {
                fof2 = new fok();
                break;
            }
            case 11538: {
                fof2 = new foc();
                break;
            }
            default: {
                lfn.b(5, "SFIOMessageFactory", "createIOMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return fof2;
    }
}

