/*
 * Decompiled with CFR.
 */
public class ms {
    private int azZ = -2147483647;
    private int aAa = -2147483647;
    private int aAb = -2147483647;
    private StringBuffer aAc;
    private String Name;
    private int ID;
    private int[] aAd;
    private int[] aAe;
    private boolean aAf;
    private boolean Active;
    private boolean ayQ;
    private boolean aAg;
    private boolean RestartIfFailed;
    private double oV = 0.0;
    private double aAh = 0.0;

    public boolean a(int n, int n2, int[] nArray) {
        assert (this.rJ());
        dty dty2 = lea.eoU().Cf(n);
        if (dty2 == null) {
            lfn.b(5, "SFTimeQuest", "addTimeLimitQuest() There is no complex quest with ID : " + n);
            assert (false);
            return false;
        }
        due due2 = dty2.Ce(n2);
        if (due2 == null) {
            lfn.b(5, "SFTimeQuest", "addTimeLimitQuest() There is no simple quest with index : " + n2 + " complex quest with ID : " + n);
            assert (false);
            return false;
        }
        if (!due2.bAQ()) {
            lfn.b(5, "SFTimeQuest", "addTimeLimitQuest() Simple quest : " + due2.Name + " in complex quest with ID : " + n + " is not a time quest.");
            assert (false);
            return false;
        }
        this.Active = true;
        this.ID = n;
        this.Name = dty2.Name;
        this.aAc = new StringBuffer();
        this.aAf = dty2.HighScoreRecording;
        this.aAg = due2.SurvivalMode;
        this.RestartIfFailed = dty2.RestartIfFailed;
        return true;
    }

    public boolean m(double d2) {
        if (!this.Active) {
            return false;
        }
        if (this.aAh == 0.0) {
            this.aAh = this.oV + (double)((int)((double)this.aAe[0] * 3600.0 + (double)this.aAe[1] * 60.0 + (double)this.aAe[2]));
        }
        return this.n(d2);
    }

    private boolean n(double d2) {
        double d3 = this.aAh - d2;
        int n = ldz.dV(d3);
        int n2 = ldz.dW(d3 -= (double)n * 3600.0);
        int n3 = (int)(d3 -= (double)n2 * 60.0);
        if (n == this.azZ && n2 == this.aAa && n3 == this.aAb) {
            this.Active = false;
            return false;
        }
        if (n <= 0 && n2 <= 0 && n3 <= 0) {
            this.Active = false;
            return false;
        }
        this.azZ = n;
        this.aAa = n2;
        this.aAb = n3;
        this.aAe[0] = this.azZ;
        this.aAe[1] = this.aAa;
        this.aAe[2] = this.aAb;
        this.rI();
        return true;
    }

    private void rI() {
    }

    public void reset() {
        this.Name = null;
        this.ID = 0;
        this.aAe = null;
        this.aAd = null;
        this.aAf = false;
        this.Active = false;
        this.aAc = null;
        this.ayQ = false;
        this.aAg = false;
        this.RestartIfFailed = false;
        this.oV = 0.0;
        this.aAh = 0.0;
        this.azZ = -2147483647;
        this.aAa = -2147483647;
        this.aAb = -2147483647;
    }

    public boolean rJ() {
        return this.Name == null && this.ID == 0 && this.aAd == null && !this.aAf && this.aAe == null && this.oV == 0.0 && this.aAh == 0.0 && !this.Active && this.aAc == null;
    }

    public boolean cJ(int n) {
        return n == this.ID;
    }

    public boolean isActive() {
        return this.Active;
    }

    public int[] qR() {
        return (int[])this.aAe.clone();
    }

    public int qS() {
        return this.ID;
    }

    public void setActive(boolean bl) {
        this.Active = bl;
    }

    public boolean qT() {
        return this.ayQ;
    }

    public void ag(boolean bl) {
        this.ayQ = bl;
    }

    public String getName() {
        return this.Name;
    }

    public boolean qU() {
        return this.aAf;
    }

    public boolean qV() {
        return this.aAg;
    }

    public boolean qW() {
        return this.RestartIfFailed;
    }

    public int[] rK() {
        return (int[])this.aAd.clone();
    }

    public void o(double d2) {
        this.oV = d2;
    }
}

