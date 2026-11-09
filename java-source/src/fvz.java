/*
 * Decompiled with CFR.
 */
public class fvz {
    public fvy If(int n) {
        fvy fvy2 = null;
        switch (n) {
            case 20737: {
                fvy2 = new fvx();
                break;
            }
            case 20738: {
                fvy2 = new fwa();
                break;
            }
            case 20739: {
                fvy2 = new fwb();
                break;
            }
            default: {
                lfn.b(5, "SFPaperdollMessageFactory", "createPaperdollMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return fvy2;
    }
}

