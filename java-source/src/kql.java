/*
 * Decompiled with CFR.
 */
public class kql {
    public khd aaq(int n) {
        kqk kqk2 = null;
        switch (n) {
            case 3841: {
                kqk2 = new kqf();
                break;
            }
            case 3842: {
                kqk2 = new kqg();
                break;
            }
            case 3843: {
                kqk2 = new kqj();
                break;
            }
            case 3844: {
                kqk2 = new kqb();
                break;
            }
            case 3845: {
                kqk2 = new kqc();
                break;
            }
            case 3846: {
                kqk2 = new kqh();
                break;
            }
            case 3847: {
                kqk2 = new kqi();
                break;
            }
            case 3848: {
                kqk2 = new kqe();
                break;
            }
            case 3849: {
                kqk2 = new kqd();
                break;
            }
            case 3850: {
                kqk2 = new kqm();
                break;
            }
            default: {
                lfn.b(5, "SFSystemRequestFactory", "createSystemRequest() Unknown SystemRequestType [" + n + "]");
                assert (false);
                break;
            }
        }
        return kqk2;
    }
}

