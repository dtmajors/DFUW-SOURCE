/*
 * Decompiled with CFR.
 */
public class glp {
    public glo JT(int n) {
        glo glo2 = null;
        switch (n) {
            case 35329: {
                glo2 = new gll();
                break;
            }
            case 35330: {
                glo2 = new glk();
                break;
            }
            case 35331: {
                glo2 = new glm();
                break;
            }
            case 35332: {
                glo2 = new gln();
                break;
            }
            default: {
                lfn.b(5, "SFSpecialEventMessageFactory", "createSpecialEventMessage() Invalid messagetype provided: " + n);
                assert (false);
                break;
            }
        }
        return glo2;
    }
}

