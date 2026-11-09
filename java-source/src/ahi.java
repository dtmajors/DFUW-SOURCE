/*
 * Decompiled with CFR.
 */
public class ahi
extends agh {
    private int bid = 0;
    private float biJ = 0.0f;

    public ahi() {
        super(10);
        this.bls = ahu.c.bmC;
    }

    public void eZ(int n) {
        this.bid = n;
    }

    public void af(float f) {
        this.biJ = f;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 8: {
                return "CollisionSchemeID";
            }
            case 9: {
                return "ViewUpDownRotation";
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
        if (gym2.bEz() != 12046) {
            lfn.b(5, "SFPlayerObjectStateObject", "handleUpdateMessage() Invalid UpdateMessage received: " + gym2.getClass().getName());
            return;
        }
        boolean bl = false;
        gyu gyu2 = (gyu)gym2;
        if ((gyu2.ija & 1) > 0) {
            if (gyu2.bid < 0) {
                lfn.b(5, "SFPlayerObjectStateObject", "handleUpdateMessage() CollisionSchemeID is invalid.");
                return;
            }
            if (this.bid == gyu2.bid) {
                return;
            }
            this.bid = gyu2.bid;
            this.L(8, n);
            bl = true;
        }
        if ((gyu2.ija & 2) > 0) {
            if (gyu2.biJ == this.biJ) {
                return;
            }
            this.biJ = gyu2.biJ;
            this.L(9, n);
            bl = true;
        }
        if (bl) {
            this.BE();
        } else {
            lfn.b(5, "SFPlayerObjectStateObject", "handleUpdateMessage() Nothing has changed for stateobject " + this.GUID);
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
            case 9: {
                ua ua2 = new ua();
                ua2.Uo = n;
                ua2.aWj = (byte)(lew.A(this.biJ, 0.0f, 1.0f) * 255.0f - 128.0f);
                return ua2;
            }
        }
        return super.G(n, n2);
    }
}

