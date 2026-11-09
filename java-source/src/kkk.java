/*
 * Decompiled with CFR.
 */
public class kkk
extends khe {
    lfn ga = lfn.eqw();

    @Override
    public khd Xp(int n) {
        kkj kkj2 = null;
        switch (n) {
            case 1537: {
                kkj2 = new kke();
                break;
            }
            case 1538: {
                kkj2 = new kki();
                break;
            }
            case 1540: {
                kkj2 = new kkg();
                break;
            }
            case 1539: {
                kkj2 = new kkl();
                break;
            }
            case 1541: {
                kkj2 = new kkm();
                break;
            }
            case 1543: {
                kkj2 = new kkf();
                break;
            }
            default: {
                lfn.b(4, "SFLightRequestFactory", "createObject() : Cannot create unknown LightRequest: [" + n + "]");
                assert (false) : "Unknown lightrequest. Update factory.";
                break;
            }
        }
        return kkj2;
    }
}

