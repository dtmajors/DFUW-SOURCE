/*
 * Decompiled with CFR.
 */
import java.util.List;

public class aic
extends aid {
    private String bhl = null;
    private List<tx> bhm = lcn.abH(5);
    private List<tx> bhn = lcn.abH(2);
    private static final int bnc = 3;

    public aic() {
        super(8);
        this.bls = ahu.c.bmK;
    }

    public final void cx(String string) {
        this.bhl = string;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 6: {
                return "AnimationFileName";
            }
            case 7: {
                return "AnimationData";
            }
        }
        return super.eB(n);
    }

    @Override
    public void a(gym gym2, int n) {
        if (gym2.bEz() == 12041) {
            super.a(gym2, n);
            return;
        }
        if (gym2.bEz() != 12033) {
            lfn.b(5, "SFStreamingAnimatedMeshStateObject", "handleUpdateMessage() Invalid updatemessage received: " + gym2.getClass().getName());
            return;
        }
        gxz gxz2 = (gxz)gym2;
        boolean bl = false;
        if ((gxz2.ija & 1) > 0) {
            tx tx2 = new tx();
            tx2.aWe = gxz2.aWe;
            tx2.aWf = gxz2.aWf;
            tx2.aWg = n;
            tx2.aWh = gxz2.aWh;
            this.bhm.add(tx2);
            while (this.bhm.size() > 3) {
                this.bhm.remove(0);
            }
            this.L(7, n);
            bl = true;
        }
        if (bl) {
            this.BE();
        }
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 6: {
                uo uo2 = new uo();
                uo2.Uo = n;
                uo2.Value = this.bhl;
                return uo2;
            }
            case 7: {
                ty ty2 = new ty();
                ty2.Uo = n;
                ty2.aWi = this.eC(n2);
                return ty2;
            }
        }
        return super.G(n, n2);
    }

    private tx[] eC(int n) {
        this.bhn.clear();
        boolean bl = false;
        int n2 = this.bhm.size();
        for (int i = 0; i < n2; ++i) {
            tx tx2 = this.bhm.get(i);
            if (bl) {
                this.bhn.add(tx2.vB());
                continue;
            }
            if (tx2.aWg <= n) continue;
            bl = true;
            this.bhn.add(tx2.vB());
        }
        return this.bhn.toArray(new tx[this.bhn.size()]);
    }
}

