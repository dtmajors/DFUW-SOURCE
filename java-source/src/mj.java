/*
 * Decompiled with CFR.
 */
import java.sql.Timestamp;

public class mj {
    protected int SN;
    protected mq ayJ;
    protected int ayK;
    protected int ayL;
    private long ayM;

    public mj(int n, int n2, int n3, mq mq2, Timestamp timestamp) {
        this.SN = n;
        this.ayJ = mq2;
        this.ayK = n2;
        this.ayL = n3;
        this.ayM = timestamp.getTime();
    }

    public String qK() {
        return lea.eoU().Cf((int)this.ayK).Ce((int)this.ayL).Name;
    }

    public void a(mq mq2, Timestamp timestamp) {
        this.ayJ = mq2;
        this.ayM = timestamp.getTime();
    }

    public mq qL() {
        return this.ayJ;
    }

    public String qM() {
        return lea.eoU().Ch(this.ayK);
    }

    public om qJ() {
        om om2 = new om();
        om2.SN = this.SN;
        om2.aGe = this.qN();
        om2.aGa = this.ayJ.name();
        om2.ayK = this.ayK;
        om2.aGb = this.qM();
        om2.aGc = this.ayL;
        om2.ayB = null;
        om2.aGd = null;
        om2.azi = 0L;
        return om2;
    }

    public String toString() {
        return "UpdatedTime : " + this.ayM + " State : " + (Object)((Object)this.ayJ) + " ID : " + this.ayK + " ActiveSimpleQuestIndex : " + this.ayL + " Name : " + this.qM();
    }

    public final Timestamp qN() {
        return new Timestamp(this.ayM);
    }

    public final void m(long l) {
        this.ayM = l;
    }
}

