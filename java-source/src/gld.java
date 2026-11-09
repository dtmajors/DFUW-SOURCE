/*
 * Decompiled with CFR.
 */
public class gld {
    public glc JP(int n) {
        glc glc2 = null;
        switch (n) {
            case 13057: {
                glc2 = new glh();
                break;
            }
            case 13058: {
                glc2 = new glj();
                break;
            }
            case 13065: {
                glc2 = new gla();
                break;
            }
            case 13059: {
                glc2 = new glb();
                break;
            }
            case 13060: {
                glc2 = new glf();
                break;
            }
            case 13061: {
                glc2 = new glg();
                break;
            }
            case 13062: {
                glc2 = new gli();
                break;
            }
            case 13063: {
                glc2 = new gkz();
                break;
            }
            case 13064: {
                glc2 = new gle();
                break;
            }
            default: {
                lfn.b(5, "SFSpecialEffectMessageFactory", "createSpecialEffectMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return glc2;
    }
}

