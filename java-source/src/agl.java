/*
 * Decompiled with CFR.
 */
public class agl
extends agh {
    private int bid = 0;

    public agl() {
        super(9);
        this.bls = ahu.c.bmo;
    }

    public void eZ(int n) {
        this.bid = n;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 8: {
                return "CollisionSchemeID";
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
        if (gym2 instanceof gyg) {
            super.a(gym2, n);
            return;
        }
        if (gym2.bEz() != 12058) {
            lfn.b(5, "SFGroundedMonsterStateObject", "handleUpdateMessage() Invalid UpdateMessage received: " + gym2.getClass().getName());
            return;
        }
        boolean bl = false;
        gyh gyh2 = (gyh)gym2;
        if ((gyh2.ija & 1) > 0) {
            if (gyh2.bid <= 0) {
                lfn.b(5, "SFGroundedMonsterStateObject", "handleUpdateMessage() CollisionSchemeID is invalid.");
                return;
            }
            if (this.bid == gyh2.bid) {
                return;
            }
            this.bid = gyh2.bid;
            this.L(8, n);
            bl = true;
        }
        if (bl) {
            this.BE();
        } else {
            lfn.b(5, "SFGroundedMonsterStateObject", "handleUpdateMessage() Nothing has changed for stateobject " + this.GUID);
        }
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 8: {
                uh uh2 = new uh();
                uh2.Uo = n;
                uh2.PC = this.bid;
                return uh2;
            }
        }
        return super.G(n, n2);
    }
}

