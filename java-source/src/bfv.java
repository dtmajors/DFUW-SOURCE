/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bfv
extends bfq {
    private final cqa aeT;

    public bfv(cqa cqa2) {
        super(cqa2);
        this.aeT = cqa2;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12548: {
                this.a((fbf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void c(bfn bfn2) {
        assert (bfn2 != null);
        super.c(bfn2);
        if (!bfn2.aYF.equals(lcr.qAC) && !bfn2.aYF.equals(this.aeT.getGUID())) {
            this.a(bfn2.aYF, bfn2);
        }
    }

    private void a(fbf fbf2) {
        if (fbf2.iIb == null) {
            lfn.b(5, "SFEventManagerWildlife", "handleEventOccuredMessage() Event is null.");
            return;
        }
        if (fbf2.Position == null) {
            lfn.b(5, "SFEventManagerWildlife", "handleEventOccuredMessage() Position is null.");
            return;
        }
    }

    @Override
    protected void a(ldv ldv2, bfn bfn2) {
        assert (ldv2 != null);
        assert (bfn2 != null);
        fbf fbf2 = (fbf)this.MessageDelegator.h(12548, this.aeT.getGUID(), ldv2);
        fbf2.iIb = bfn2;
        fbf2.Position = this.aeT.aAG() != null ? this.aeT.aAG().av() : new ljq(cg.gz);
        this.MessageDelegator.F(fbf2);
    }

    public void c(int n, ldv ldv2, int n2) {
        this.a(n, ldv2, n2, true);
    }

    public void a(int n, ldv ldv2, int n2, boolean bl) {
        if (n <= 0) {
            lfn.b(5, "SFEventManagerWildlife", "notifyEventOccured() EventType is invalid.");
            return;
        }
        if (ldv2 == null) {
            lfn.b(5, "SFEventManagerWildlife", "notifyEventOccured() CauseObjectGUID is null.");
            return;
        }
        if (n2 <= 0) {
            lfn.b(5, "SFEventManagerWildlife", "notifyEventOccured() CauseResourceType is invalid.");
            return;
        }
        bfn bfn2 = new bfn();
        bfn2.Type = n;
        bfn2.dhq = this.MessageDelegator.arc().rgz;
        bfn2.aYF = ldv2;
        bfn2.akX = this.aeT.getGUID();
        bfn2.bsG = n2;
        bfn2.dhr = this.aeT.az();
        this.a(bfn2, bl);
    }

    @Override
    protected void a(bfn bfn2, boolean bl) {
        assert (bfn2 != null);
        super.a(bfn2, bl);
        lgz[] lgzArray = (lgz[])lea.eoq().get(bfn2.Type);
        if (lgzArray != null) {
            this.a(lgzArray);
        }
    }

    private void a(lgz[] lgzArray) {
        assert (lgzArray != null);
        int n = lgzArray.length;
        for (int i = 0; i < n; ++i) {
            if (!lea.enW().isDescendant(this.aeT.az(), lgzArray[i].ResourceType)) continue;
            assert (lgzArray[i].bsH != null);
            int[] nArray = lgzArray[i].bsH;
            int n2 = nArray.length;
            for (int j = 0; j < n2; ++j) {
                this.if(nArray[j]);
            }
        }
    }

    private void if(int n) {
        assert (n > 0);
        if (this.aeT.aAG() == null) {
            lfn.b(5, "SFEventManagerWildlife", "sendSpecialEffectStartMessage() MeshObject is null.");
            lfn.b(5, "SFEventManagerWildlife", "sendSpecialEffectStartMessage() Unable to start specialeffect '" + del.zU(n) + "'");
            return;
        }
        ldv ldv2 = lcr.qEb;
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, ldv2);
        glh2.SpecialEffectType = n;
        glh2.akX = this.aeT.aAG().getGUID();
        glh2.aZD = this.aeT.aAG().av();
        this.MessageDelegator.F(glh2);
    }
}

