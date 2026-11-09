/*
 * Decompiled with CFR.
 */
public class aha
extends ahc {
    private boolean biA = false;

    public aha() {
        super(4);
        this.bls = ahu.c.bmw;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 3: {
                return "MountDied";
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
        if (!(gym2 instanceof gyo)) {
            lfn.b(5, "SFMountObjectStateObject", "handleUpdateMessage() Invalid UpdateMessage received: " + gym2.getClass().getName());
            return;
        }
        boolean bl = false;
        gyo gyo2 = (gyo)gym2;
        if ((gyo2.ija & 1) > 0) {
            if (this.biA == gyo2.biA) {
                return;
            }
            this.biA = gyo2.biA;
            this.L(3, n);
            bl = true;
        }
        if (bl) {
            this.BE();
        } else {
            lfn.b(5, "SFMountObjectStateObject", "handleUpdateMessage() Nothing has changed for stateobject " + this.GUID);
        }
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 3: {
                tz tz2 = new tz();
                tz2.Uo = n;
                tz2.Pp = this.biA;
                return tz2;
            }
        }
        return super.G(n, n2);
    }
}

