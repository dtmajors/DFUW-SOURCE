/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bha
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("id");
        if (string == null) {
            this.fw("Missing required parameter 'id'");
            return;
        }
        int n = 0;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Parameter 'id' is not an integer");
            return;
        }
        if (!lcr.abR((int)n)) {
            this.fw("Parameter 'id' is not a valid character ID");
            return;
        }
        string = (String)this.dlm.get("account");
        if (string == null) {
            this.fw("Missing required parameter 'account'");
            return;
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Parameter 'account' is not an integer");
            return;
        }
        ldv ldv2 = lcr.abW((int)n);
        ldv ldv3 = lcr.ak((ldv)lcr.qAW, (int)ldv2.ib());
        fze fze2 = (fze)this.MessageDelegator.h(7197, this.getGUID(), ldv3);
        fze2.a(px.aJQ);
        fze2.kP("" + n2 + "." + n);
        this.MessageDelegator.E(fze2);
        lfn.b(3, "SFExternalCommandHandlerDeleteCharacter", "initialize: Send delete request for AccountID " + n2 + " CharacterID " + n);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7198: {
                this.e((fzf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void e(fzf fzf2) {
        switch (fzf2.uk()) {
            case aJQ: {
                this.g(fzf2);
                break;
            }
            default: {
                lfn.b(5, "SFExternalCommandHandlerDeleteCharacter", "handlePersistenceManagerOperationResponse: Unhandled operation " + (Object)((Object)fzf2.uk()));
                this.fw("Internal error");
                assert (false);
                break;
            }
        }
    }

    private void g(fzf fzf2) {
        if (fzf2.aMH == null) {
            lfn.b(3, "SFExternalCommandHandlerDeleteCharacter", "handleDeleteCharacterOperationResponse: Got delete response for " + fzf2.bSR() + ": OK");
            this.aoV();
        } else {
            lfn.b(5, "SFExternalCommandHandlerDeleteCharacter", "handleDeleteCharacterOperationResponse: Got delete response for " + fzf2.bSR() + ": " + fzf2.aMH);
            this.fw(fzf2.aMH);
        }
    }
}

