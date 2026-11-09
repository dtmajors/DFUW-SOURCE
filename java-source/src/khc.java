/*
 * Decompiled with CFR.
 */
public class khc
extends lgu {
    private kjy prO = new kjy();
    private khu prP = new khu();
    private kij prQ = new kij();
    private kiu prR = new kiu();
    private kjc prS = new kjc();
    private kkk prT = new kkk();
    private kle prU = new kle();
    private klq prV = new klq();
    private kmo prW = new kmo();
    private knn prX = new knn();
    private knu prY = new knu();
    private kpp prZ = new kpp();
    private kqa psa = new kqa();
    private krq psb = new krq();
    private kql psc = new kql();
    private kqz psd = new kqz();

    public khd ii(int n) {
        khd khd2 = null;
        switch ((n & 0xFFF00) >> 8) {
            case 1: {
                khd2 = this.prY.Xp(n);
                break;
            }
            case 2: {
                khd2 = this.prZ.Xp(n);
                break;
            }
            case 3: {
                khd2 = this.prX.Xp(n);
                break;
            }
            case 4: {
                khd2 = this.prU.Xp(n);
                break;
            }
            case 5: {
                khd2 = this.prQ.Xp(n);
                break;
            }
            case 6: {
                khd2 = this.prT.Xp(n);
                break;
            }
            case 7: {
                khd2 = this.prO.Yr(n);
                break;
            }
            case 8: {
                khd2 = this.prR.Yc(n);
                break;
            }
            case 9: {
                khd2 = this.psb.aay(n);
                break;
            }
            case 10: {
                khd2 = this.prV.YX(n);
                break;
            }
            case 11: {
                khd2 = this.prS.Yf(n);
                break;
            }
            case 12: {
                khd2 = this.prP.Xy(n);
                break;
            }
            case 13: {
                khd2 = this.prW.Zh(n);
                break;
            }
            case 14: {
                khd2 = this.psa.aap(n);
                break;
            }
            case 15: {
                khd2 = this.psc.aaq(n);
                break;
            }
            case 16: {
                khd2 = this.psd.aav(n);
                break;
            }
            default: {
                lfn.b(5, "SFEngineRequestFactory", "createRequest() Unsuported RequestType = " + n);
                assert (false);
                break;
            }
        }
        if (khd2 == null) {
            assert (false);
            lfn.b(5, this.getClass().getSimpleName(), "createRequest() : Request is null for Type = " + n);
            return null;
        }
        ldv ldv2 = this.erH();
        khd2.setGUID(ldv2);
        return khd2;
    }
}

