/*
 * Decompiled with CFR.
 */
public class cbi {
    public int eiK = -1;
    public ldv afF = null;
    public lip eiq = null;
    public lip eiL = null;
    public lip eiM = null;
    public lhu eiN = null;
    public boolean aYb = false;
    public int aYc = -1;
    public lcq dMT = null;
    public int Qw = 0;
    public float aGr = 0.0f;
    public float aGA = 0.0f;
    public alu[] aXY = null;
    public boolean aXX = false;
    public boolean RoundRobinExcluded = false;
    public boolean aYe = false;

    public boolean a(cbi cbi2) {
        if (cbi2.aYb != this.aYb) {
            return true;
        }
        if (cbi2.aGr != this.aGr) {
            return true;
        }
        if (cbi2.aYc != this.aYc) {
            return true;
        }
        if (cbi2.aGA != this.aGA) {
            return true;
        }
        if (cbi2.aXX) {
            return true;
        }
        if (cbi2.RoundRobinExcluded != this.RoundRobinExcluded) {
            return true;
        }
        if (cbi2.aYe != this.aYe) {
            return true;
        }
        return !cbi2.eiq.i(this.eiq);
    }

    public boolean b(cbi cbi2) {
        return cbi2.aGr != this.aGr || cbi2.aGA != this.aGA;
    }

    public boolean c(cbi cbi2) {
        if (cbi2.aYb != this.aYb) {
            return true;
        }
        if (cbi2.aYc != this.aYc) {
            return true;
        }
        if (cbi2.RoundRobinExcluded != this.RoundRobinExcluded) {
            return true;
        }
        return !cbi2.eiq.i(this.eiq);
    }

    public boolean d(cbi cbi2) {
        return cbi2.RoundRobinExcluded != this.RoundRobinExcluded;
    }
}

