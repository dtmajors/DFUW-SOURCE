/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bgq
extends bgk {
    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("characterid");
        if (string == null) {
            this.fw("Missing required parameter 'characterid'");
            return;
        }
        int n = 0;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Parameter 'characterid' is not an integer");
            return;
        }
        if (!lcr.abR((int)n)) {
            this.fw("Parameter 'characterid' is not a valid character ID");
            return;
        }
        string = (String)this.dlm.get("newaccountid");
        if (string == null) {
            this.fw("Missing required parameter 'newaccountid'");
            return;
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Parameter 'newaccountid' is not an integer");
            return;
        }
        ldv ldv2 = lcr.abW((int)n);
        gow gow2 = (gow)this.MessageDelegator.h(11117, this.getGUID(), ldv2);
        gow2.iXz = n2;
        this.MessageDelegator.E(gow2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11118: {
                this.a((gox)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gox gox2) {
        if (gox2.ew == 0) {
            this.aoV();
        } else {
            switch (gox2.ew) {
                case 3: {
                    this.fw("Already processing account change");
                    break;
                }
                case 2: {
                    this.fw("Invalid account");
                    break;
                }
                case 1: {
                    this.fw("Player online");
                    break;
                }
                case 4: {
                    this.fw("Same account");
                    break;
                }
                default: {
                    this.fw("" + gox2.ew);
                }
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
            this.aoV();
        } else {
            this.fw(fzf2.aMH);
        }
    }
}

