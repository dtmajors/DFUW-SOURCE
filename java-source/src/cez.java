/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cim
 *  lcr
 */
public class cez
extends btk {
    private static final String TC = "SFPlayerRenameManagerServer";
    public static final double etH = 864000.0;
    private final cim esx;
    private eec etI = null;

    public cez(cim cim2) {
        this.esx = cim2;
    }

    public void a(int n, ldv ldv2, String string, String string2, String string3, String string4, int n2, boolean bl) {
        if (string == null || string2 == null || string3 == null || string4 == null || n == -1) {
            this.esx.a(n2, false, cin.eCf, null);
            return;
        }
        if (this.etI != null) {
            this.esx.a(n2, false, cin.eCg, null);
            return;
        }
        eec eec2 = (eec)this.MessageDelegator.h(12844, this.getGUID(), lcr.hac);
        eec2.jX(string3);
        eec2.jY(string4);
        eec2.jV(string);
        eec2.jW(string2);
        eec2.DP(n);
        eec2.oI(ldv2);
        eec2.DQ(n);
        eec2.oJ(ldv2);
        eec2.sk(n2);
        eec2.jX(bl);
        this.MessageDelegator.F(eec2);
        this.etI = eec2;
    }

    private void a(eed eed2) {
        assert (this.etI != null);
        cin cin2 = cin.getValueByOrdinal(eed2.getResult());
        switch (cin2) {
            case eCf: 
            case eCh: 
            case eCg: 
            case eCe: {
                this.esx.a(eed2.aVk(), false, cin2, null);
                this.etI = null;
                break;
            }
            case eCm: {
                this.esx.qA(this.etI.aVk());
            }
        }
    }

    public void aNc() {
        assert (this.etI != null);
        kde kde2 = (kde)this.MessageDelegator.i(293, this.getGUID(), lcr.abV((int)1));
        kde2.hB = this.etI.bFW();
        kde2.FirstName = this.etI.aNe();
        kde2.LastName = this.etI.aNf();
        kde2.pgA = true;
        kde2.gOd = 2;
        this.MessageDelegator.b(kde2);
    }

    public void aNd() {
        assert (this.etI != null);
        this.etI = null;
    }

    private void a(kdf kdf2) {
        assert (this.etI != null);
        int n = kdf2.ew;
        switch (n) {
            case 7: {
                int n2 = this.etI.bFU();
                int n3 = this.etI.bFW();
                String string = this.etI.aNe() + " " + this.etI.aNf();
                String string2 = this.etI.aNe() + " " + this.etI.aNf();
                lfn.b(5, this.getClass().getSimpleName(), "handleMiddlewareNameReservationResponse() Name release failed[ERROR] Old Name : " + string + " NewName : " + string2 + " RequestAccountID : " + n2 + " TargetAccountID : " + n3);
                assert (false);
                break;
            }
            case 2: {
                int n4 = this.etI.bFU();
                int n5 = this.etI.bFW();
                String string = this.etI.aNe() + " " + this.etI.aNf();
                String string3 = this.etI.aNe() + " " + this.etI.aNf();
                lfn.b(5, this.getClass().getSimpleName(), "handleMiddlewareNameReservationResponse() Name reserved failed[RESULT_NOT_AVAILABLE] Old Name : " + string + " for player : " + this.getGUID().enw() + " is not free anymore. Too bad :)");
                assert (false);
                break;
            }
            case 3: {
                eec eec2 = (eec)this.MessageDelegator.h(12844, this.getGUID(), lcr.hac);
                eec2.jX(this.etI.bFX());
                eec2.jY(this.etI.bFY());
                eec2.jV(this.etI.aNe());
                eec2.jW(this.etI.aNf());
                eec2.DP(this.etI.bFU());
                eec2.oI(this.etI.bFV());
                eec2.DQ(this.etI.bFU());
                eec2.oJ(this.etI.bFV());
                eec2.sk(-1);
                eec2.jX(true);
                this.MessageDelegator.F(eec2);
            }
        }
        this.etI = null;
    }

    private void c(gre gre2) {
        assert (this.etI != null);
        int n = gre2.jqc;
        lfn.b(5, this.getClass().getSimpleName(), "handleSystemMessageSendErrorMessage() Could not deliver message : " + gre2.jqc + " to Object: " + gre2.jqf);
        switch (n) {
            case 12844: {
                this.esx.a(gre2.jqd, false, cin.eCh, null);
                assert (false);
                break;
            }
            default: {
                this.esx.a(gre2.jqd, false, cin.eCh, null);
                assert (false) : "MessageType : " + gre2.jqc;
                break;
            }
        }
        this.etI = null;
    }

    private void b(kcs kcs2) {
        assert (this.etI != null);
        lfn.b(5, this.getClass().getSimpleName(), "handleMiddlewareDeliveryErrorMessage() Could not deliver message [" + kcs2.peo + "] to Object: " + kcs2.hsQ);
        Object object = kcs2.peq;
        assert (object instanceof kde);
        if (object instanceof kde) {
            int n = this.etI.bFU();
            int n2 = this.etI.bFW();
            String string = this.etI.aNe() + " " + this.etI.aNf();
            String string2 = this.etI.aNe() + " " + this.etI.aNf();
            lfn.b(5, this.getClass().getSimpleName(), "handleMiddlewareDeliveryErrorMessage() Name release failed[NOT DELIVERED] Old Name : " + string + " NewName : " + string2 + " RequestAccountID : " + n + " TargetAccountID : " + n2);
        }
        this.etI = null;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 12845: {
                this.a((eed)dxq2);
                break;
            }
            case 11034: {
                this.c((gre)dxq2);
            }
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 270: {
                this.b((kcs)kcz2);
                break;
            }
            case 294: {
                this.a((kdf)kcz2);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "receiveMiddlewareMessage() Unhandled Middlewaremessage received: " + kcz2.getClass().getName());
                super.receiveMiddlewareMessage(kcz2);
                assert (false);
                break;
            }
        }
    }

    public final String cz() {
        return this.etI != null ? this.etI.bFX() : null;
    }

    public final String cA() {
        return this.etI != null ? this.etI.bFY() : null;
    }

    public final String aNe() {
        return this.etI != null ? this.etI.aNe() : null;
    }

    public final String aNf() {
        return this.etI != null ? this.etI.aNf() : null;
    }
}

