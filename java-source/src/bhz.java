/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bhz
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("historicid");
        if (string == null) {
            this.fw("Missing required parameter 'historicid'");
            return;
        }
        int n = 0;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Parameter 'historicid' is not an integer");
            return;
        }
        if (!lcr.abQ((int)n)) {
            this.fw("Parameter 'historicid' is not a valid historic character ID");
            return;
        }
        fzl fzl2 = (fzl)this.MessageDelegator.h(7186, this.getGUID(), lcr.qAV);
        fzl2.FirstName = (String)this.dlm.get("firstname");
        fzl2.LastName = (String)this.dlm.get("lastname");
        fzl2.aMI = n;
        this.MessageDelegator.E(fzl2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7187: {
                this.a((fzm)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fzm fzm2) {
        if (fzm2.aMH == null) {
            lfn.b(3, "SFExternalCommandHandlerRestoreCharacter", "handlePersistenceManagerRestoreCharacterResponse: Got restore response for " + fzm2.aMI + ": New Character ID " + fzm2.SN);
            this.aoV();
        } else {
            lfn.b(5, "SFExternalCommandHandlerRestoreCharacter", "handlePersistenceManagerRestoreCharacterResponse: Got restore response for " + fzm2.aMI + ": " + fzm2.aMH);
            this.fw(fzm2.aMH);
        }
    }
}

