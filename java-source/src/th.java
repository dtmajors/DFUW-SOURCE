/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ha
 */
public class th
extends btk {
    private final ha hF;
    private atf aRW = null;
    private static final int atq = 1;
    private static final int atr = 2;

    public th(ha ha2) {
        this.hF = ha2;
    }

    public void a(ljq ljq2, int n, int n2) {
        if (ljq2 == null) {
            return;
        }
        this.oW();
        eaa eaa2 = (eaa)this.MessageDelegator.h(22785, this.getGUID(), this.hF.getGUID());
        eaa2.Position = ljq2;
        eaa2.aFo = "Last Death";
        eaa2.ResourceType = cug.flZ;
        eaa2.aFp = false;
        eaa2.aqs = 1;
        this.hF.receiveMessage((dxq)eaa2);
    }

    private void oW() {
        if (this.aRW == null) {
            return;
        }
        eae eae2 = (eae)this.MessageDelegator.h(22786, this.getGUID(), this.hF.getGUID());
        eae2.iks = this.aRW.ID;
        eae2.aqs = 2;
        this.hF.receiveMessage((dxq)eae2);
        this.aRW = null;
    }

    private void a(eaf eaf2) {
        if (eaf2.aVk() == 2) {
            if (eaf2.ex != 3) {
                return;
            }
            return;
        }
        if (eaf2.aVk() == 1) {
            this.oW();
            if (eaf2.ex != 2) {
                assert (false);
                return;
            }
            if (eaf2.Zn == null) {
                lfn.b(5, "SFPersonalDeathManager", "handleAnnotationResponseMessage() Annotations == null");
                assert (false);
                return;
            }
            if (eaf2.Zn.length != 1) {
                lfn.b(5, "SFPersonalDeathManager", "handleAnnotationResponseMessage() Annotations.length != 1: " + eaf2.Zn.length);
                assert (false);
                return;
            }
            this.aRW = eaf2.Zn[0];
            return;
        }
        assert (false);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 22788: {
                this.a((eaf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

