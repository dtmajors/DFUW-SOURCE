/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mo
 */
import java.sql.Timestamp;

public class ml
extends mi {
    private static final String TC = "SFObjectTimeQuest";
    private boolean ayP;
    private boolean ayQ;
    private long ayR;
    private long ayS;

    public ml(int n, ldv ldv2, ldv ldv3, String string, int n2, int n3, long l, mo mo2, Timestamp timestamp) {
        super(n, ldv2, ldv3, string, n2, n3, mo2, timestamp);
        dty dty2 = lea.eoU().Cf(n2);
        if (dty2 == null) {
            lfn.b(5, TC, "addTimeLimitQuest() There is no complex quest with ID : " + n2);
            assert (false);
            return;
        }
        due due2 = dty2.Ce(this.ayL);
        if (due2 == null) {
            lfn.b(5, TC, "addTimeLimitQuest() There is no simple quest with index : " + this.ayL + " complex quest with ID : " + n2);
            assert (false);
            return;
        }
        this.ayR = (long)mo2.getMessageDelegator().arc().rgz;
        this.ayS = this.ayR + (l == -1L ? due2.bAN() : l);
        if (due2.bAQ() && this.ayS > this.ayR) {
            this.qP();
        }
    }

    @Override
    public void cG(int n) {
        super.cG(n);
        dty dty2 = lea.eoU().Cf(this.ayK);
        if (dty2 == null) {
            assert (false);
            return;
        }
        due due2 = dty2.Ce(this.ayL);
        if (due2 == null) {
            assert (false);
            return;
        }
        this.ayR = (long)this.ZF.getMessageDelegator().arc().rgz;
        this.ayS = this.ayR + due2.bAN();
        if (this.ayP) {
            this.qQ();
        }
        if (due2.bAQ() && this.ayS > this.ayR) {
            this.qP();
        }
    }

    public boolean n(long l) {
        if (!this.ayP) {
            return false;
        }
        this.ayR = l;
        return this.ayS - this.ayR > 0L;
    }

    private void qP() {
        assert (!this.ayP);
        this.ayP = true;
        gdm gdm2 = (gdm)this.ZF.getMessageDelegator().h(10259, this.ZF.hF.getGUID(), this.ZF.rf());
        gdm2.jeN = true;
        gdm2.ayK = this.ayK;
        gdm2.jeO = this.qR();
        gdm2.oV = this.ayR;
        this.ZF.getMessageDelegator().F(gdm2);
    }

    private void qQ() {
        assert (this.ayP);
        this.ayP = false;
        gdm gdm2 = (gdm)this.ZF.getMessageDelegator().h(10259, this.ZF.hF.getGUID(), this.ZF.rf());
        gdm2.jeN = false;
        this.ZF.getMessageDelegator().F(gdm2);
    }

    public void reset() {
        if (this.ayP) {
            this.qQ();
        }
    }

    public int[] qR() {
        int n = (int)(this.ayS - this.ayR);
        int n2 = n / 3600;
        int n3 = n % 3600;
        int n4 = n3 / 60;
        int n5 = n3 % 60;
        return new int[]{n2, n4, n5};
    }

    public boolean cJ(int n) {
        return n == this.ayK;
    }

    public void o(long l) {
        this.ayR = l;
    }

    public int qS() {
        return this.ayK;
    }

    public boolean qT() {
        return this.ayQ;
    }

    public void ag(boolean bl) {
        this.ayQ = bl;
    }

    public String getName() {
        return lea.eoU().Ch(this.ayK);
    }

    public boolean qU() {
        return this.ayC;
    }

    public boolean qV() {
        return this.ayD;
    }

    public boolean qW() {
        return this.RestartIfFailed;
    }

    @Override
    public String toString() {
        return super.toString() + " EndTime : " + this.ayS;
    }

    @Override
    public om qJ() {
        on[] onArray = null;
        if (this.ayG != null && !this.ayG.isEmpty()) {
            onArray = new on[this.ayG.size()];
            int n = 0;
            for (mk mk2 : this.ayG.values()) {
                onArray[n] = new on(mk2.pa(), mk2.ayN);
                ++n;
            }
        }
        om om2 = new om();
        om2.SN = this.SN;
        om2.aGe = this.qN();
        om2.aGa = this.ayJ.name();
        om2.ayK = this.ayK;
        om2.aGb = this.qM();
        om2.aGc = this.ayL;
        om2.ayB = this.ayB;
        om2.aGd = onArray;
        om2.azi = this.ayS - this.ayR;
        return om2;
    }
}

