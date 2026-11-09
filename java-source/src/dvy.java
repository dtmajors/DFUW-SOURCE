/*
 * Decompiled with CFR.
 */
import java.util.Set;

public abstract class dvy
extends btk
implements dwb {
    protected static final int hib = -1;
    protected static final int hic = 0;
    private Set<dwb> Uh = lcn.emx();
    private String hid = null;
    private dvy hie = null;
    private Enum[] hif = null;
    private int hig = -1;

    public String bCq() {
        return this.hid;
    }

    protected void jE(String string) {
        this.hid = string;
    }

    protected void a(Enum[] enumArray) {
        this.hif = enumArray;
    }

    protected Enum bCr() {
        return this.hif == null || this.hif.length == 0 || this.hig < 0 || this.hig >= this.hif.length ? null : this.hif[this.hig];
    }

    public void a(dwb dwb2) {
        if (!this.Uh.contains(dwb2)) {
            this.Uh.add(dwb2);
        }
    }

    public void b(dwb dwb2) {
        this.Uh.remove(dwb2);
    }

    protected dvy() {
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 260: {
                this.d((kdk)kcz2);
                break;
            }
            case 270: {
                lfn.b(5, this.getClass().getSimpleName(), "receiveMiddlewareMessage() : Error Delivering Message!!!... Message = " + ((kcs)kcz2).peo + "... Original To-GUID = " + ((kcs)kcz2).hsQ);
                assert (false);
                this.bCv();
            }
        }
    }

    protected void b(String string, int n, String string2) {
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "sendMiddlewareSQLMessage() : SQL query string is null!!!");
            assert (false);
            this.bCv();
            return;
        }
        if (string2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "sendMiddlewareSQLMessage() : Database connection name string is null!!!");
            assert (false);
            this.bCv();
            return;
        }
        kdj kdj2 = (kdj)this.MessageDelegator.i(259, this.GUID, dxm.hpA);
        kdj2.wB(string);
        kdj2.setContext(n);
        kdj2.wA(string2);
        this.MessageDelegator.b(kdj2);
        this.hid = string;
    }

    private void d(kdk kdk2) {
        lmn lmn2 = kdk2.dVr();
        if (lmn2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleMiddlewareSQLResultMessage() : Result is null!!!... Context = " + kdk2.getContext());
            assert (false);
            this.bCv();
            return;
        }
        if (lmn2.getErrorCode() != 0) {
            lfn.b(5, this.getClass().getSimpleName(), "handleMiddlewareSQLResultMessage() : Query " + kdk2.getContext() + " failed!!!... Error Code = " + lmn2.getErrorCode());
            assert (false);
            this.bCv();
            return;
        }
        if (kdk2.getContext() == -1) {
            this.bCu();
            return;
        }
        lmg[] lmgArray = lmn2.euS();
        if (lmgArray == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleSQLResultForConquestHistory() : SQL query returned no, or not enough, valid columns!!!... SQL = '" + this.hid + "'");
            assert (false);
            this.bCv();
            return;
        }
        this.e(lmn2, kdk2.getContext());
    }

    protected void e(lmn lmn2, int n) {
        this.bCu();
    }

    protected boolean bCs() {
        if (this.hif == null || this.hif.length == 0 || this.hig >= 0) {
            return false;
        }
        this.hig = 0;
        return this.a(this.hif[this.hig]);
    }

    protected void bCt() {
        if (this.hif == null || this.hif.length == 0 || this.hig < 0) {
            this.bCv();
            return;
        }
        if (this.hig < this.hif.length - 1) {
            ++this.hig;
            if (!this.a(this.hif[this.hig])) {
                this.bCv();
                return;
            }
        } else {
            this.bCu();
        }
    }

    protected boolean a(Enum enum_) {
        return false;
    }

    protected void bCu() {
        this.bCx();
        if (!this.Uh.isEmpty()) {
            for (dwb dwb2 : this.Uh) {
                dwb2.c(this);
            }
        }
        this.Uh.clear();
    }

    protected void bCv() {
        lfn.b(5, this.getClass().getSimpleName(), "workFailed() : Work failed to be completed!... SQL = " + this.hid);
        assert (false);
        this.bCx();
        if (!this.Uh.isEmpty()) {
            for (dwb dwb2 : this.Uh) {
                dwb2.b(this);
            }
        }
        this.Uh.clear();
    }

    protected void d(dvy dvy2) {
        if (this.hie != null) {
            this.bCx();
        }
        this.hie = dvy2;
        if (this.hie != null) {
            this.hie.a(this);
            this.hie.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.hie);
        }
    }

    protected boolean bCw() {
        if (this.hie == null) {
            return false;
        }
        if (!this.hie.bCh()) {
            lfn.b(5, this.getClass().getSimpleName(), "startWork() : Sub-Worker failed to start work!... Sub-Worker = " + this.hie);
            assert (false);
            this.bCx();
            return false;
        }
        return true;
    }

    @Override
    public void c(dvy dvy2) {
        lfn.b(5, this.getClass().getSimpleName(), "workComplete() : Sub-worker reports that work is complete, but no sub-class specific handling exists!");
        assert (false);
        this.bCv();
    }

    @Override
    public void b(dvy dvy2) {
        lfn.b(5, this.getClass().getSimpleName(), "workFailed() : Database sub-worker failed!... Sub-Worker = " + this.hie);
        assert (false);
        this.bCv();
    }

    protected void bCx() {
        if (this.hie != null) {
            this.MessageDelegator.hd(this.hie.getGUID());
            this.hie = null;
        }
    }

    public abstract boolean bCh();

    @Override
    public abstract String toString();
}

