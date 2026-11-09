/*
 * Decompiled with CFR.
 */
public class cbh {
    public boolean eiH = false;
    public int eiI = -1;
    public int aYa = 0;
    public ldv afF = null;
    public int ResourceType = 0;
    public String FirstName = null;
    public String LastName = null;
    public String add = null;
    public String bnj = null;
    public lhu dMU = null;
    public lcq dMT = null;
    public int Qw = 0;
    public float aGr = 0.0f;
    public float aGA = 0.0f;
    public cbb eiJ = null;
    public boolean dQm = false;
    public alu[] aXY = null;
    public boolean aXX = false;
    public boolean RoundRobinExcluded = false;
    public boolean aYe = false;

    public final boolean aHr() {
        if (this.FirstName == null) {
            return false;
        }
        if (this.LastName == null) {
            return false;
        }
        if (this.dMU == null) {
            return false;
        }
        if (this.dMT == null) {
            return false;
        }
        if (this.aGr <= 0.0f) {
            return false;
        }
        if (this.aGA < this.aGr) {
            return false;
        }
        return this.eiJ.eiq != null;
    }

    public cbi aHs() {
        assert (this.dQm);
        cbi cbi2 = new cbi();
        cbi2.afF = this.afF;
        cbi2.eiq = this.eiJ.eiq;
        if (this.add != null && this.bnj != null) {
            cbi2.eiL = new ljg(this.add);
            cbi2.eiM = new ljg(this.bnj);
        }
        cbi2.aXY = this.aXY;
        cbi2.aYb = this.eiH;
        cbi2.aYc = this.eiI;
        cbi2.eiN = this.dMU;
        cbi2.dMT = this.dMT;
        cbi2.Qw = this.Qw;
        cbi2.aGr = this.aGr;
        cbi2.aGA = this.aGA;
        cbi2.eiK = this.aYa;
        cbi2.aXX = this.aXX;
        cbi2.RoundRobinExcluded = this.RoundRobinExcluded;
        cbi2.aYe = this.aYe;
        return cbi2;
    }
}

