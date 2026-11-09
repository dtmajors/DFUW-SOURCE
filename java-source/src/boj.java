/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class boj
extends bnx
implements bto {
    private int dj = 0;
    private boolean dxD = false;
    private ldv dxE = null;
    private ldv dxF = null;
    private double dxG = 0.0;
    private dxq dxH;

    public int aso() {
        return this.dj;
    }

    public void fb(int n) {
        this.dj = n;
    }

    public boolean arY() {
        return this.dxD;
    }

    public void ib(ldv ldv2) {
        this.dxE = ldv2;
        assert (this.dxE != null);
        this.asr();
    }

    public ldv asp() {
        return this.dxF;
    }

    public void ic(ldv ldv2) {
        this.dxF = ldv2;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.dxD) {
            this.aY(ldz2.rgz);
        }
    }

    public ldv id(ldv ldv2) {
        if (this.dj == 0) {
            lfn.b(5, "SFInteractionManagerClient", "getServerGUID() ServerNodeID is 0.");
            assert (false);
            return null;
        }
        return lcr.ak((ldv)ldv2, (int)this.dj);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dxD = false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11033: {
                this.b((gsl)dxq2);
                break;
            }
            case 11779: {
                this.a((fkb)dxq2);
                break;
            }
            case 4878: {
                this.a((gbb)dxq2);
                break;
            }
            case 11804: {
                this.a((fkh)dxq2);
                break;
            }
            case 2305: {
                dxq2.on(lcr.qCM);
                this.MessageDelegator.F(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        if (this.dxE != null) {
            this.ass();
            this.asu();
        }
    }

    @Override
    protected void d(bnp bnp2) {
        switch (bnp2.arW()) {
            case 1: {
                break;
            }
            case 2: {
                break;
            }
            case 4: {
                break;
            }
            case 8: {
                break;
            }
            case 16: {
                break;
            }
            case 32: {
                break;
            }
            case 64: {
                break;
            }
            case 128: {
                if (this.dxH == null) break;
                bnp2.receiveMessage(this.dxH);
                this.dxH = null;
                break;
            }
            default: {
                lfn.b(5, "SFInteractionManagerClient", "handleInteractionLogicAdded() InteractionLogic added has unknown type: " + bnp2.arW());
                return;
            }
        }
    }

    public boolean asq() {
        boe boe2 = (boe)this.lk(128);
        return boe2 == null || boe2.asn();
    }

    private void asr() {
        bnp bnp2;
        fjw fjw2 = (fjw)this.MessageDelegator.h(11778, this.GUID, lcr.acL);
        if (this.dwL != null) {
            fjw2.dAu = this.dwL.getGUID();
        }
        if ((this.bie & 1) > 0) {
            bnp2 = this.lk(1);
            if (bnp2 == null) {
                lfn.b(5, "SFInteractionManagerClient", "activateGUI() InteractionBuyFromPlayerLogic was not found.");
            } else if (this.dxF == null) {
                lfn.b(5, "SFInteractionManagerClient", "activateGUI() DynamicContainerGUID is null.");
            } else {
                fjw2.iOj = bnp2.getGUID();
                fjw2.dxF = this.dxF;
            }
        }
        if ((this.bie & 4) > 0) {
            bnp2 = this.lk(4);
            if (bnp2 == null) {
                lfn.b(5, "SFInteractionManagerClient", "activateGUI() InteractionQuestLogic was not found.");
            } else {
                fjw2.iOl = bnp2.getGUID();
            }
        }
        if ((this.bie & 2) > 0) {
            bnp2 = this.lk(2);
            if (bnp2 == null) {
                lfn.b(5, "SFInteractionManagerClient", "activateGUI() InteractionSellToPlayerLogic was not found.");
            } else {
                fjw2.iOk = bnp2.getGUID();
            }
        }
        if ((this.bie & 8) > 0) {
            bnp2 = this.lk(8);
            if (bnp2 == null) {
                lfn.b(5, "SFInteractionManagerClient", "activateGUI() InteractionTrainingLogic was not found.");
            } else {
                fjw2.iOm = bnp2.getGUID();
            }
        }
        if ((this.bie & 0x10) > 0) {
            bnp2 = this.lk(16);
            if (bnp2 == null) {
                lfn.b(5, "SFInteractionManagerClient", "activateGUI() InteractionChangeWeaponLogic was not found.");
            } else {
                fjw2.iOn = bnp2.getGUID();
            }
        }
        if ((this.bie & 0x20) > 0) {
            bnp2 = this.lk(32);
            if (bnp2 == null) {
                lfn.b(5, "SFInteractionManagerClient", "activateGUI() InteractionSkillExtensionLogic was not found.");
            } else {
                fjw2.iOo = bnp2.getGUID();
            }
        }
        if ((this.bie & 0x40) > 0) {
            bnp2 = this.lk(64);
            if (bnp2 == null) {
                lfn.b(5, "SFInteractionManagerClient", "activateGUI() InteractionBarberLogic was not found.");
            } else {
                fjw2.iOp = bnp2.getGUID();
            }
        }
        if ((this.bie & 0x80) > 0) {
            bnp2 = this.lk(128);
            if (bnp2 == null) {
                lfn.b(5, "SFInteractionManagerClient", "activateGUI() InteractionOwnedVendorLogic was not found.");
            } else {
                fjw2.iOq = bnp2.getGUID();
                fjw2.iOr = ((boe)bnp2).asm();
            }
        }
        this.MessageDelegator.F(fjw2);
    }

    private void aY(double d2) {
        assert (!this.dxD);
        int n = this.ast();
        if (n <= 0) {
            lfn.b(5, "SFInteractionManagerClient", "checkSetupCompleted() NumberOfInteractionLogics = " + n + ". Must be more than Zero! IM SFFile = " + this.ObjectDescriptionFilename);
            return;
        }
        if (this.dwM.size() != n) {
            if (this.dxG == 0.0) {
                this.dxG = d2 + 2.0;
            } else if (d2 >= this.dxG) {
                lfn.b(5, "SFInteractionManagerClient", "checkSetupCompleted() Missing some interactionlogics.");
                lfn.b(5, "SFInteractionManagerClient", "checkSetupCompleted() Expected " + n + " but have " + this.dwM.size() + " IM SFFile=" + this.ObjectDescriptionFilename);
                this.dxG = d2 + 2.0;
            }
            this.dxD = false;
            return;
        }
        bnp bnp2 = null;
        int n2 = this.dwM.size();
        for (int i = 0; i < n2; ++i) {
            bnp2 = (bnp)this.dwM.get(i);
            if (bnp2.arY()) continue;
            this.dxD = false;
            return;
        }
        if (this.dwL == null) {
            this.dxD = false;
            return;
        }
        this.Active = false;
        this.dxD = true;
        this.ask();
    }

    private void ass() {
        fka fka2 = (fka)this.MessageDelegator.h(11780, this.GUID, lcr.acL);
        this.MessageDelegator.F(fka2);
    }

    private int ast() {
        int n = 0;
        int n2 = 1;
        for (int i = 0; i < 31; ++i) {
            if ((n2 & this.bie) == n2) {
                ++n;
            }
            n2 <<= 1;
        }
        return n;
    }

    private void a(fkh fkh2) {
        bnp bnp2 = this.lk(128);
        if (bnp2 != null) {
            bnp2.receiveMessage(fkh2);
        } else {
            this.dxH = fkh2;
        }
    }

    private void a(fkb fkb2) {
        if (this.dxE == null) {
            lfn.b(5, "SFInteractionManagerClient", "handleInteractionGuiDeactivateRequest() VendorSessionHandlerClientGUID is null.");
            return;
        }
        this.asu();
    }

    private void a(gbb gbb2) {
        if (!gbb2.aO().equals(this.dxE)) {
            lfn.b(5, "SFInteractionManagerClient", "handlePlayerSessionEndMessage() Message is not from vendor sessionhandler.");
            return;
        }
        this.ass();
        this.Active = false;
        this.dxD = false;
        this.dxE = null;
    }

    private void a(uk uk2) {
        switch (uk2.Uo) {
            case 1: {
                this.fa(((uh)uk2).PC);
                break;
            }
            case 2: {
                this.Y(((ue)uk2).Pz);
                break;
            }
            case 3: {
                this.fb(((uh)uk2).PC);
                break;
            }
            default: {
                lfn.b(5, "SFInteractionManagerClient", "handlePropertyUpdate() Invalid propertyID provided: " + uk2.Uo);
                return;
            }
        }
    }

    private void b(gsl gsl2) {
        uk[] ukArray = gsl2.joY;
        int n = ukArray.length;
        for (int i = 0; i < n; ++i) {
            if (ukArray[i] == null) {
                lfn.b(5, "SFInteractionManagerClient", "handleSubscriptionEventSystemMessage() PropertyUpdate " + i + " is null for object " + this.GUID);
                continue;
            }
            this.a(ukArray[i]);
        }
    }

    private void asu() {
        assert (this.dxE != null);
        gbc gbc2 = (gbc)this.MessageDelegator.h(4879, this.GUID, this.dxE);
        this.MessageDelegator.F(gbc2);
    }
}

