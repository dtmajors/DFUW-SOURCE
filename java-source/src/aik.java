/*
 * Decompiled with CFR.
 */
public class aik
extends ahh {
    private int bno = 1;

    public aik() {
        super(4);
        this.bls = ahu.c.bmO;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 3: {
                return "LifeMode";
            }
        }
        return super.eB(n);
    }

    @Override
    public void a(gym gym2, int n) {
        if (gym2 instanceof gyt) {
            super.a(gym2, n);
            return;
        }
        if (!(gym2 instanceof gza)) {
            lfn.b(5, "SFWildlifeObjectStateObject", "handleUpdateMessage() Invalid UpdateMessage received: " + gym2.getClass().getName());
            return;
        }
        boolean bl = false;
        gza gza2 = (gza)gym2;
        if ((gza2.ija & 1) > 0) {
            if (gza2.bno < 0) {
                lfn.b(5, "SFWildlifeObjectStateObject", "handleUpdateMessage() LifeMode is invalid.");
                return;
            }
            if (this.bno == gza2.bno) {
                return;
            }
            this.bno = gza2.bno;
            this.L(3, n);
            bl = true;
        }
        if (bl) {
            this.BE();
        } else {
            lfn.b(5, "SFWildlifeObjectStateObject", "handleUpdateMessage() Nothing has changed for stateobject " + this.GUID);
        }
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 3: {
                uh uh2 = new uh();
                uh2.Uo = n;
                uh2.PC = this.bno;
                return uh2;
            }
        }
        return super.G(n, n2);
    }
}

