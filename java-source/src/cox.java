/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cph
 */
public class cox
extends cph {
    private ljq eQP = null;
    private lgl eQQ = null;
    protected int eQR = -1;
    protected double eQS = 0.0;
    protected boolean ePI = false;
    private boolean eQT = false;
    protected bwm eQU = null;
    protected double eQV = 0.0;

    public cox(boolean bl) {
        super(bl);
        this.ObjectType = 85;
    }

    public static int hJ(String string) {
        if (string == null) {
            assert (false);
            return -1;
        }
        String string2 = string + " Base";
        return lea.enW().getType(string2);
    }

    public static int ss(int n) {
        String string = lea.enW().getName(n);
        return cox.hJ(string);
    }

    public static int hK(String string) {
        if (!string.toLowerCase().endsWith(" base")) {
            return -1;
        }
        String string2 = string.substring(0, string.length() - 5);
        return lea.enW().getType(string2);
    }

    public static int a(String string, a a2) {
        if (!string.toLowerCase().endsWith(" base")) {
            return -1;
        }
        String string2 = string.substring(0, string.length() - 5) + " " + a2.getName();
        return lea.enW().getType(string2);
    }

    public static int st(int n) {
        String string = lea.enW().getName(n);
        return cox.hK(string);
    }

    public joc aVr() {
        return joc.nGY;
    }

    protected void aIw() {
        super.aIw();
        if (!this.isServerObject()) {
            bwm bwm2 = lea.eok().get(this.az());
            if (bwm2 == null) {
                assert (false) : "No CannonInfo for this: " + this.pa();
                return;
            }
            this.a(bwm2);
        }
    }

    public ljq aWo() {
        return this.eQP;
    }

    public void bs(ljq ljq2) {
        ljq ljq3;
        this.eQP = ljq3 = new ljq(ljq2);
    }

    public lgl aWp() {
        return this.eQQ;
    }

    public void t(lgl lgl2) {
        this.eQQ = lgl2;
    }

    public boolean aWq() {
        return this.eQT;
    }

    public void gB(boolean bl) {
        this.eQT = bl;
    }

    public bwm aWr() {
        return this.eQU;
    }

    public void a(bwm bwm2) {
        this.eQU = bwm2;
        this.eQR = this.eQU.aBF();
        this.eQS = this.eQU.aBJ();
    }

    public ldv aWs() {
        return null;
    }

    public void lq(ldv ldv2) {
    }

    public boolean bt(ljq ljq2) {
        if (this.aAG() == null) {
            return false;
        }
        if (this.aSN() == null) {
            return false;
        }
        bvd bvd2 = (bvd)this.MessageDelegator.bzx().d(this.aSM());
        if (bvd2 == null) {
            return false;
        }
        ljq ljq3 = this.aWo().esF();
        ljq3 = bvd2.aw().eq(ljq3);
        ljq3.es(bvd2.av());
        ljq3.et(ljq2);
        return !(ljq3.eqN() > 2.0f);
    }
}

