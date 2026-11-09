/*
 * Decompiled with CFR.
 */
public class afu
extends aia {
    public afu() {
        super(0);
        this.bls = ahu.c.bmh;
    }

    @Override
    public void a(gym gym2, int n) {
        switch (gym2.bEz()) {
            case 12052: {
                this.a((gya)gym2, n);
                break;
            }
            default: {
                lfn.b(5, "SFAnnotationManagerStateObject", "handleUpdateMessage() Invalid updatemessage provided: " + gym2.getClass().getName());
                return;
            }
        }
    }

    @Override
    public void eE(int n) {
        agj agj2 = this.fw(n);
        if (agj2 == null) {
            lfn.b(5, "SFAnnotationManagerStateObject", "notifyEventPropertyTimerTimedOut() EventProperty " + n + " was not found.");
            return;
        }
        this.b(agj2);
        this.d(n);
    }

    private boolean a(int n, ljq ljq2, String string, int n2, boolean bl, String string2, int n3) {
        assert (n > 0);
        assert (ljq2 != null);
        assert (string != null);
        assert (n2 > 0);
        aft aft2 = this.eF(n);
        if (aft2 != null) {
            aft2.Position = ljq2;
            aft2.aFo = string;
            aft2.ResourceType = n2;
            aft2.aFp = bl;
            aft2.aXn = string2;
            aft2.J(2, this.nN());
            this.a(aft2.AK(), (Integer)n3);
            if (this.SW.i(this.getGUID(), aft2.AJ())) {
                this.SW.a(this, aft2.AJ());
            } else {
                lfn.b(5, "SFAnnotationManagerStateObject", "createAnnotationProperty() Could not find eventpropertytimer for annotation " + aft2.ID);
                assert (false);
            }
            return true;
        }
        aft2 = new aft();
        aft2.eS(this.BK());
        aft2.ID = n;
        aft2.Position = ljq2;
        aft2.aFo = string;
        aft2.aXn = string2;
        aft2.ResourceType = n2;
        aft2.aFp = bl;
        aft2.J(1, this.nN());
        this.a(aft2);
        this.a(aft2.AK(), (Integer)n3);
        return true;
    }

    private aft eF(int n) {
        for (agj agj2 : this.bmY.values()) {
            if (!(agj2 instanceof aft)) continue;
            aft aft2 = (aft)agj2;
            if (aft2.ID != n) continue;
            return aft2;
        }
        return null;
    }

    private boolean H(int n, int n2) {
        assert (n > 0);
        aft aft2 = this.eF(n);
        if (aft2 == null) {
            lfn.b(5, "SFAnnotationManagerStateObject", "removeAnnotationProperty() Annotationproperty for annotation " + n + " was not found.");
            return false;
        }
        aft2.J(4, this.nN());
        this.a(aft2.AK(), (Integer)n2);
        this.SW.b(this, aft2.AJ());
        return true;
    }

    private void a(gya gya2, int n) {
        boolean bl = false;
        if ((gya2.aXP & 1) != 0) {
            bl = this.a(gya2.iks, gya2.Position, gya2.aFo, gya2.ResourceType, gya2.aFp, gya2.aXn, n);
        }
        if ((gya2.aXP & 4) != 0) {
            bl = this.H(gya2.iks, n);
        }
        if (bl) {
            this.BE();
        }
    }
}

