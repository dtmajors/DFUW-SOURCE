/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class avg
extends aul {
    private boolean Initialized = false;
    private ldv Tr = null;

    public avg() {
        super(new amd(avg.class, aul.cdc, "ChatProxyForParty", new cqi[0], null));
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2321: {
                this.a((egk)dxq2);
                break;
            }
            case 17922: {
                this.a((fwp)dxq2);
                break;
            }
            case 17939: {
                this.a((fxm)dxq2);
                break;
            }
            case 19732: {
                this.a((fwm)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        if (this.Tr == null) {
            return;
        }
        a[] aArray = (a[])a.class.getEnumConstants();
        a a2 = aArray[n];
        switch (a2) {
            case cki: {
                this.WJ();
                return;
            }
            case ckj: {
                this.aN(objectArray);
                return;
            }
            case ckk: {
                this.aM(objectArray);
                return;
            }
            case ckl: {
                this.WK();
                return;
            }
            case ckm: {
                this.WL();
                return;
            }
            case ckn: {
                this.aO(objectArray);
                return;
            }
            case ckq: {
                fwi fwi2 = (fwi)this.MessageDelegator.h(17951, this.getGUID(), lcr.qCi);
                this.MessageDelegator.F(fwi2);
                return;
            }
        }
        super.b(n, objectArray, string);
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaz, a.cki, new ljk("create a new party"), new egg[0]);
        this.a(hc.aaz, a.ckj, new ljk("invites a member specified by his psoguid to the party"), new egg[]{new egg("first_name", egg.a.ipq, false, new ljk("first name of the player to invite")), new egg("last_name", egg.a.ipq, false, new ljk("last name of the player to invite"))});
        if (lcw.enb()) {
            this.a(hc.aaP, a.ckk, new ljk("invites a member specified by his name to the party"), new egg[]{new egg("target_player_psoguid", egg.a.ipq, false, new ljk("PSOGUID of the player to invite"))});
        }
        this.a(hc.aaz, a.ckl, new ljk("leaves the party"), new egg[0]);
        this.a(hc.aaz, a.ckm, new ljk("Offer all your quests to party members"), new egg[0]);
        this.a(hc.aaz, a.ckn, new ljk("Offer a quest to the party"), new egg[]{new egg("quest_name", egg.a.ipq, false, new ljk("Offered Quest Name"))});
        this.a(hc.aaz, a.cko, new ljk("removes the party waypoint"), new egg[0]);
        this.a(hc.aaz, a.ckp, new ljk("sets the party waypoint"), new egg[0]);
        this.a(hc.aaz, a.ckq, new ljk("toggle display of party symbols in the world."), new egg[0]);
    }

    private void a(egk egk2) {
        if (egk2.Tr == null) {
            return;
        }
        this.Tr = egk2.Tr;
    }

    private void a(fwm fwm2) {
        lfn.b(5, "SFChatProxyForParty", "handlePartyClientOfferQuestsResponse() MESSAGE RECEIVED.");
        int n = fwm2.getResult();
        if (!fxr.isValidOrdinal(n)) {
            lfn.b(5, "SFChatProxyForParty", "handlePartyClientOfferQuestsResponse() Invalid Result :" + n);
            assert (false);
            this.h(mcj.uvr.bD(new Object[0]));
            return;
        }
        fxr fxr2 = fxr.getValueByOrdinal(n);
        switch (fxr2) {
            case jav: {
                this.h(mcj.uvs.bD(new Object[0]));
                break;
            }
            case jas: {
                this.h(mcj.uvt.bD(new Object[0]));
                break;
            }
            case jar: {
                this.h(mcj.uvu.bD(new Object[0]));
                break;
            }
            case jax: {
                this.h(mcj.uvv.bD(new Object[0]));
                break;
            }
            default: {
                assert (false);
                this.h(mcj.uvr.bD(new Object[0]));
            }
        }
    }

    private void a(fwp fwp2) {
    }

    private void a(fxm fxm2) {
    }

    private void a(hc hc2, a a2, lip lip2, egg[] eggArray) {
        this.a(hc2, a2.ordinal(), a2.name().toLowerCase(), lip2, eggArray);
    }

    private void WJ() {
        fwo fwo2 = (fwo)this.MessageDelegator.h(17921, this.GUID, this.Tr);
        fwo2.jM(true);
        fwo2.hC = this.Tr;
        fwo2.eiE = this.Tr;
        this.a(fwo2);
    }

    private void aM(Object[] objectArray) {
        ldv ldv2 = ldv.zq((String)objectArray[0]);
        if (ldv2 == null) {
            return;
        }
        fwj fwj2 = (fwj)this.MessageDelegator.h(17931, this.GUID, this.Tr);
        fwj2.iZc = this.Tr;
        fwj2.iZd = ldv2;
        this.a(fwj2);
    }

    private void aN(Object[] objectArray) {
        String string = (String)objectArray[0];
        if (string == null) {
            return;
        }
        String string2 = (String)objectArray[1];
        if (string2 == null) {
            return;
        }
        fwt fwt2 = (fwt)this.MessageDelegator.h(17949, this.GUID, this.Tr);
        fwt2.FirstName = string;
        fwt2.LastName = string2;
        this.a(fwt2);
    }

    private void WK() {
        fxl fxl2 = (fxl)this.MessageDelegator.h(17938, this.GUID, this.Tr);
        this.a(fxl2);
    }

    private void WL() {
        fwl fwl2 = (fwl)this.MessageDelegator.h(19731, this.getGUID(), this.Tr);
        fwl2.iZl = true;
        this.MessageDelegator.F(fwl2);
    }

    private void aO(Object[] objectArray) {
    }
}

