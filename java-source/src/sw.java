/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class sw
extends qe {
    private int hB;
    private boolean aNC;
    public long aND;
    public long aNE;
    private String ZQ;
    private int ff;

    public sw(md md2) {
        super(md2, me.ayo);
    }

    public void v(int n) {
        if (this.sR()) {
            assert (false);
            lfn.b(5, "SFPersistenceWorkerFetchCharacterAccountInfo", "setAccountID: Can't change account ID while working");
            return;
        }
        this.hB = n;
    }

    @Override
    protected void sO() {
        kbz kbz2 = (kbz)this.MessageDelegator.i(285, this.getGUID(), lcr.abV((int)1));
        kbz2.hB = this.hB;
        this.MessageDelegator.b(kbz2);
    }

    @Override
    protected void sP() {
        this.ZQ = null;
        this.aNC = true;
        this.aND = 0L;
        this.aNE = 0L;
        this.ff = 0;
    }

    private void b(kca kca2) {
        if (kca2.hB != this.hB) {
            lfn.b(5, "SFPersistenceWorkerFetchCharacterAccountInfo", "handleMiddlewareAccountInfoResponse: Incorrect AccountID in response: " + kca2.hB + " != " + this.hB);
            this.ca("Incorrect AccountID in response");
            return;
        }
        if (kca2.hE == null || kca2.hE.isEmpty()) {
            lfn.b(5, "SFPersistenceWorkerFetchCharacterAccountInfo", "handleMiddlewareAccountInfoResponse: Invalid AccountName in response");
            this.ca("Invalid AccountName in response");
            return;
        }
        this.aNC = kca2.pdV;
        this.aND = kca2.aND;
        this.aNE = kca2.aNE;
        this.ZQ = kca2.hE;
        this.ff = kca2.ff;
        this.ca(null);
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 286: {
                this.b((kca)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    public final String getUserName() {
        return this.ZQ;
    }

    public final int ug() {
        return this.ff;
    }

    public final int aN() {
        return this.hB;
    }

    public final boolean uh() {
        return this.aNC;
    }

    public long ui() {
        return this.aND;
    }

    public long uj() {
        return this.aNE;
    }
}

