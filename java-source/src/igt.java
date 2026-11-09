/*
 * Decompiled with CFR.
 */
public class igt
extends ipx {
    private ign lUf;
    private iwv lUg;
    private isi lNb;

    public igt(ign ign2) {
        this.lUf = ign2;
        this.a(iqo.dmS());
        this.lUg = new iwv();
        this.W(this.lUg);
        this.lNb = new ism(this){
            final /* synthetic */ igt lUh;
            {
                this.lUh = igt2;
            }

            public boolean du(int n, int n2) {
                this.lUh.cUG();
                return true;
            }
        };
        this.lNb.a(isf.mwN, 14);
        this.lNb.Rk(0xABABAB);
        this.W(ipx.d(this.lNb));
        this.aTg();
    }

    public ign cUF() {
        return this.lUf;
    }

    public void aTg() {
        lox lox2;
        int n;
        String string;
        if (this.lUf.isCompleted()) {
            string = "goal_state_complete";
            n = 12357465;
            lox2 = lww.tkb;
        } else if (this.lUf.isCancelled()) {
            string = "goal_state_canceled";
            n = 0x5D5D5D;
            lox2 = lww.tka;
        } else if (this.lUf.isLocked()) {
            string = "goal_state_lock";
            n = 0x5D5D5D;
            lox2 = lww.tjY;
        } else if (this.lUf.cTW()) {
            string = "goal_state_optional";
            n = 0xABABAB;
            lox2 = lww.tjZ;
        } else {
            string = "goal_state_bullet";
            lox2 = lww.tjX;
            n = 0xABABAB;
        }
        this.lUg.a(string, lox2.bD(new Object[0]));
        this.lNb.setText(this.lUf.getTitle());
        this.lNb.Rk(n);
    }

    @Override
    public void cND() {
        this.aTg();
    }

    public void cUG() {
    }
}

