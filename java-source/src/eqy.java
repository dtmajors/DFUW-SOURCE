/*
 * Decompiled with CFR.
 */
public class eqy {
    public eqx EL(int n) {
        eqx eqx2 = null;
        switch (n) {
            case 9473: {
                lfn.b(5, "SFCollectionMessageFactory", "createMessage() Can't create CollectionCreateMessage.");
                break;
            }
            case 9474: {
                eqx2 = new era();
                break;
            }
            case 9475: {
                eqx2 = new erb();
                break;
            }
            case 9476: {
                eqx2 = new eqz();
                break;
            }
            default: {
                lfn.b(5, "SFCollectionMessageFactory", "createMessage() Unhandled messagetype provided: " + n);
                return null;
            }
        }
        return eqx2;
    }
}

