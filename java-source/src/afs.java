/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;

public class afs
extends agx {
    private String bhl = null;
    private List<tx> bhm = lcn.abH(5);
    private List<tx> bhn = lcn.abH(2);

    public afs() {
        super(7);
        this.bls = ahu.c.bmg;
    }

    public final void cx(String string) {
        this.bhl = string;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 5: {
                return "AnimationFileName";
            }
            case 6: {
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
            lfn.b(5, "SFAnimatedMeshStateObject", "handleUpdateMessage() Invalid updatemessage received: " + gym2.getClass().getName());
            return;
        }
        gxz gxz2 = (gxz)gym2;
        boolean bl = false;
        if ((gxz2.ija & 1) > 0) {
            tx tx2 = new tx();
            tx2.aWe = gxz2.aWe;
            tx2.aWf = gxz2.aWf;
            tx2.aWg = n;
            this.bhm.add(tx2);
            this.L(6, n);
            bl = true;
        }
        if (bl) {
            this.BE();
        }
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 5: {
                uo uo2 = new uo();
                uo2.Uo = n;
                uo2.Value = this.bhl;
                return uo2;
            }
            case 6: {
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
        int n2 = this.bhm.size();
        boolean bl = false;
        Iterator<tx> iterator = this.bhm.iterator();
        while (iterator.hasNext()) {
            tx tx2 = iterator.next();
            if (bl) {
                this.bhn.add(tx2.vB());
                continue;
            }
            if (n2 > 3 && tx2.aWg < n - 100) {
                iterator.remove();
                continue;
            }
            if (tx2.aWg <= n) continue;
            bl = true;
            this.bhn.add(tx2.vB());
        }
        return this.bhn.toArray(new tx[this.bhn.size()]);
    }
}

