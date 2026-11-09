/*
 * Decompiled with CFR.
 */
public enum ijo {
    mee("crosshair_01", ijj.mcX),
    mef("crosshair_02", ijj.mcY),
    meg("crosshair_03", ijj.mcY),
    meh("crosshair_04", ijj.mcZ),
    mei("crosshair_05", ijj.mdf),
    mej("crosshair_06", ijj.mda),
    mek("crosshair_07", ijj.mdb),
    mel("crosshair_08", ijj.mdc),
    mem("crosshair_09", ijj.mdd),
    men("crosshair_10", ijj.mde);

    private String meo;
    private ijj mep = null;

    private ijo(String string2, ijj ijj2) {
        this.meo = string2;
        this.mep = ijj2;
    }

    public String dbv() {
        return this.meo;
    }

    public String dbw() {
        return this.meo + "_normal";
    }

    public String dbx() {
        return this.meo + "_friendly";
    }

    public String dby() {
        return this.meo + "_enemy";
    }

    public String Ri(int n) {
        return this.mep == null ? null : this.mep.Rg(n);
    }
}

