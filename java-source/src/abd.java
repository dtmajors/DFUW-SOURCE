/*
 * Decompiled with CFR.
 */
import java.util.List;

public final class abd
extends aaz
implements zb {
    private List<yy> bdy = lcn.emA();

    public abd(wy wy2, int n) {
        super(wy2, n, abc.bdu);
    }

    public abd(wy wy2, int n, String string) {
        super(wy2, n, abc.bdu, string);
    }

    @Override
    public boolean xP() {
        return false;
    }

    @Override
    public jcl xQ() {
        return null;
    }

    public boolean yB() {
        for (yy yy2 : this.bdy) {
            if (!yy2.xl()) continue;
            return true;
        }
        return false;
    }

    @Override
    public void b(yy yy2) {
        this.bdy.add(yy2);
    }

    @Override
    public void c(yy yy2) {
        if (!this.wF().isPending()) {
            lfn.b(5, this.getClass().getSimpleName(), "conditionChanged() : Start-Node Not Part of Pending Quest!!!... Quest = " + this.wF() + ", Start-Node = " + this);
            assert (false);
            return;
        }
        for (yy yy3 : this.bdy) {
            if (yy3.xl()) continue;
            return;
        }
        this.wF().a(this);
    }

    public void yC() {
        if (!this.wF().isPending()) {
            lfn.b(5, this.getClass().getSimpleName(), "startMonitoringAvailability() : Start-Node Not Part of Pending Quest!!!... Quest = " + this.wF() + ", Start-Node = " + this);
            assert (false);
            return;
        }
        if (this.bdy.isEmpty()) {
            this.wF().a(this);
        } else {
            for (yy yy2 : this.bdy) {
                yy2.at(false);
                if (!yy2.xo() || !yy2.xq()) continue;
                yy2.xr();
            }
        }
    }

    public void yD() {
        for (yy yy2 : this.bdy) {
            yy2.au(false);
        }
    }

    public void yE() {
        if (!this.wF().isPending()) {
            lfn.b(5, this.getClass().getSimpleName(), "stopMonitoringAvailability() : Start-Node Not Part of Pending Quest!!!... Quest = " + this.wF() + ", Start-Node = " + this);
            assert (false);
            return;
        }
        for (yy yy2 : this.bdy) {
            yy2.deactivate();
        }
    }

    public void yF() {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "startQuest() : Start-Node Not Part of Active Quest!!!... Quest = " + this.wF() + ", Start-Node = " + this);
            assert (false);
            return;
        }
        for (Integer n : this.yz()) {
            this.l(n, false);
        }
        this.wF().cj(this.ay(true));
    }

    @Override
    public void a(int n, int n2, boolean bl, boolean bl2) {
        lfn.b(5, this.getClass().getSimpleName(), "receiveInput() : Quest Start-Node Received Input!!!... Quest = " + this.wF() + ", Start-Node = " + this);
        assert (false);
    }

    @Override
    public aaz h(wy wy2) {
        return this.a(wy2, new abd(wy2, this.getID()));
    }

    @Override
    public void b(wy wy2, zb zb2) {
        if (zb2 == null) {
            return;
        }
        for (yy yy2 : this.bdy) {
            zb2.b(yy2.a(wy2, zb2));
        }
    }

    public String toString() {
        return "[" + this.getClass().getSimpleName() + " :: ID = " + this.getID() + ", Conditions = " + this.bdy.size() + "]";
    }
}

