/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bfs
extends bfr {
    private final cdw dhO;

    public bfs(cdw cdw2) {
        super(cdw2);
        this.dhO = cdw2;
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
        if (!bfn2.aYF.equals(lcr.qAC) && !bfn2.aYF.equals(this.dhO.getGUID())) {
            this.a(bfn2.aYF, bfn2);
        }
    }

    private void a(fbf fbf2) {
        if (fbf2.iIb == null) {
            lfn.b(5, "SFEventManagerMonster", "handleEventOccuredMessage() Event is null.");
            return;
        }
        if (fbf2.Position == null) {
            lfn.b(5, "SFEventManagerMonster", "handleEventOccuredMessage() Position is null.");
            return;
        }
    }

    @Override
    protected void a(ldv ldv2, bfn bfn2) {
        assert (ldv2 != null);
        assert (bfn2 != null);
        fbf fbf2 = (fbf)this.MessageDelegator.h(12548, this.dhO.getGUID(), ldv2);
        fbf2.iIb = bfn2;
        fbf2.Position = this.dhO.aAG() != null ? this.dhO.aAG().av() : new ljq(cg.gz);
        this.MessageDelegator.F(fbf2);
    }

    @Override
    protected void a(bfn bfn2, boolean bl) {
        assert (bfn2 != null);
        super.a(bfn2, bl);
        this.d(bfn2);
        lgz[] lgzArray = (lgz[])lea.eoq().get(bfn2.Type);
        if (lgzArray != null) {
            this.a(lgzArray);
        }
    }

    private void a(lgz[] lgzArray) {
        assert (lgzArray != null);
        int n = lgzArray.length;
        for (int i = 0; i < n; ++i) {
            if (!lea.enW().isDescendant(this.dhO.az(), lgzArray[i].ResourceType)) continue;
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
        if (this.dhO.aAG() == null) {
            lfn.b(5, "SFEventManagerMonster", "sendSpecialEffectStartMessage() MeshObject is null.");
            lfn.b(5, "SFEventManagerMonster", "sendSpecialEffectStartMessage() Unable to start specialeffect '" + del.zU(n) + "'");
            return;
        }
        ldv ldv2 = lcr.qEb;
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, ldv2);
        glh2.SpecialEffectType = n;
        glh2.akX = this.dhO.aAG().getGUID();
        glh2.aZD = this.dhO.aAG().av();
        this.MessageDelegator.F(glh2);
    }
}

