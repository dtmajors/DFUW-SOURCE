/*
 * Decompiled with CFR.
 */
public class ail {
    private static final String TC = "SFNotificationMessageHandler";

    public void b(fsw fsw2) {
        int n = fsw2.bEz();
        switch (n) {
            case 30211: {
                this.a((fst)fsw2);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    private void a(fst fst2) {
        if (fst2.iVB) {
            lfn.b(5, TC, "handleNotificationHarvestMessage() sharing with party message");
            assert (false);
            return;
        }
        if (fst2.iVC == null || fst2.iVC.length == 0) {
            lfn.b(5, TC, "handleNotificationHarvestMessage() there are no items");
            assert (false);
            return;
        }
    }
}

