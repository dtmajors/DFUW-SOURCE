/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  gg
 *  lcr
 */
import java.util.List;

public class gf
extends btk {
    private List<ldv> Uz = lcn.emv();

    public void a(gg gg2) {
        if (gg2 == null) {
            lfn.b(5, "SFGamelogicClanCleanUpManager", "startCleanUpProcess(): GLDistributor is null.");
            assert (false);
            return;
        }
        if (gg2.hR() == null || gg2.hR().length == 0) {
            lfn.b(5, "SFGamelogicClanCleanUpManager", "startCleanUpProcess(): There is no gl nodes");
            assert (false);
            return;
        }
        for (gr gr2 : gg2.hR()) {
            ldv ldv2 = lcr.ak((ldv)lcr.qEd, (int)gr2.di);
            ekq ekq2 = (ekq)this.MessageDelegator.h(13870, this.getGUID(), ldv2);
            ekq2.hsP = true;
            this.MessageDelegator.E(ekq2);
            this.Uz.add(ldv2);
        }
    }

    private void a(ekr ekr2) {
        ldv ldv2 = ekr2.aO();
        if (!this.Uz.remove(ldv2)) {
            lfn.b(5, "SFGamelogicClanCleanUpManager", "handleClanCleanUpResponseMessage(): There is no entry for clan manager guid " + ldv2);
            assert (false);
            return;
        }
        if (this.Uz.isEmpty()) {
            this.hw();
        }
    }

    private void hw() {
        this.Uz = null;
        this.MessageDelegator.hd(this.getGUID());
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 13871: {
                this.a((ekr)dxq2);
                break;
            }
            case 11034: {
                gre gre2 = (gre)dxq2;
                ldv ldv2 = gre2.jqf;
                if (!this.Uz.remove(ldv2)) {
                    lfn.b(5, "SFGamelogicClanCleanUpManager", "receiveMessage(): Could not deliver request message to " + ldv2);
                    assert (false);
                    return;
                }
                if (!this.Uz.isEmpty()) break;
                this.hw();
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

