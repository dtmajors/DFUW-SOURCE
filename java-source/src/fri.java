/*
 * Decompiled with CFR.
 */
public class fri {
    public frh HK(int n) {
        frh frh2 = null;
        switch (n) {
            case 5377: {
                frh2 = new frg();
                break;
            }
            case 5378: {
                frh2 = new frj();
                break;
            }
            case 5379: {
                frh2 = new frk();
                break;
            }
            case 5380: {
                frh2 = new frl();
                break;
            }
            default: {
                lfn.b(5, "SFModifierMessageFactory", "createModifierMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return frh2;
    }
}

