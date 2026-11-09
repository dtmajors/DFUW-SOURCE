/*
 * Decompiled with CFR.
 */
public class igu
extends ipx {
    private ign lUf;
    private iwv lUg;
    private isi lNb;

    public igu(ign ign2, int n) {
        this.lUf = ign2;
        this.a(iqo.dmS());
        this.lUg = new iwv();
        this.W(this.lUg);
        this.lNb = new isi();
        this.lNb.a(isf.mwN, n);
        this.lNb.Rk(0xABABAB);
        this.W(ipx.d(this.lNb));
        this.aTg();
    }

    public ign cUF() {
        return this.lUf;
    }

    public isi cUH() {
        return this.lNb;
    }

    public void aTg() {
        lox lox2;
        int n;
        String string;
        if (this.lUf.isCompleted()) {
            string = "goal_state_complete";
            n = 12357465;
            lox2 = lww.tkb;
        } else if (this.lUf.isLocked()) {
            string = "goal_state_lock";
            n = 0x5D5D5D;
            lox2 = lww.tjY;
        } else if (this.lUf.isCancelled()) {
            string = "goal_state_canceled";
            n = 0x5D5D5D;
            lox2 = lww.tka;
        } else {
            string = "goal_state_bullet";
            n = 0xABABAB;
            lox2 = lww.tjX;
        }
        this.lUg.a(string, lox2.bD(new Object[0]));
        this.lNb.setText(this.lUf.getDescription());
        this.lNb.Rk(n);
    }

    @Override
    public void cND() {
        this.aTg();
    }
}

