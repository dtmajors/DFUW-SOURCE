/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class mhv
extends btk
implements bto {
    private mid DwY = null;
    private Random DwZ = new Random();
    private mhz Dxa = null;
    private double Dxb = -1.0;
    private boolean Dxc = false;
    private float eUj = 200.0f;
    private float eRm = 0.1f;
    private int Dxd = 0;
    private int jpH = 0;
    private List<mhw> Dxe = new ArrayList<mhw>();

    public void yV(boolean bl) {
        this.Dxc = bl;
    }

    public void om(float f) {
        this.eRm = f;
    }

    public void aek(int n) {
        this.Dxd = n;
    }

    public void ael(int n) {
        this.jpH = n;
    }

    public void on(float f) {
        this.eUj = f;
    }

    @Override
    public void doTick(ldz ldz2) {
        int n;
        if (ldz2.rgz < this.Dxb) {
            return;
        }
        float f = (float)(ldz2.rgz - this.Dxb);
        if (f < this.eRm) {
            return;
        }
        this.Dxb = ldz2.rgz;
        if (this.Dxa == null) {
            return;
        }
        if (this.Dxe.size() == 0) {
            return;
        }
        assert (this.Dxe.size() == this.Dxa.ezg());
        if (!this.eza()) {
            return;
        }
        for (n = 0; n < this.Dxe.size(); ++n) {
            ljq ljq2 = new ljq();
            this.Dxa.b(n, f, ljq2);
            this.Dxe.get(n).eS(ljq2);
        }
        this.Dxe.get(0).aeo(this.jpH);
        n = (int)(f * (float)this.Dxd);
        if (n > this.Dxd) {
            n = this.Dxd;
        }
        for (int i = 0; i < n; ++i) {
            int n2 = Math.abs(this.DwZ.nextInt()) % this.Dxe.size();
            this.Dxe.get(n2).ezd();
        }
    }

    @Override
    public void initialize() {
        String string = lcw.qLb + "system/heightmap.txt";
        String string2 = "testing/distributor/asdf.txt";
        this.DwY = new mid(string, string2);
        this.Dxa = new mhz(this.DwY);
        super.initialize();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.ezb();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            default: 
        }
        super.receiveMessage(dxq2);
    }

    public void oo(float f) {
        if (this.Dxa == null) {
            return;
        }
        this.Dxa.oo(f);
    }

    public void op(float f) {
        if (this.Dxa == null) {
            return;
        }
        this.Dxa.oq(f);
    }

    public boolean aem(int n) {
        lfn.b(3, "SFEngineDistributorTesterManager", "setNumSimulatedObjects(" + n + ") CurrentNumObjects(" + this.Dxe.size() + ")");
        if (!this.eza()) {
            lfn.b(5, "SFEngineDistributorTesterManager", "Cant change the number of objects since all the objects havent been created yet!");
            return false;
        }
        this.ezb();
        this.aen(n);
        return true;
    }

    private boolean eza() {
        for (int i = 0; i < this.Dxe.size(); ++i) {
            mhw mhw2 = this.Dxe.get(i);
            if (mhw2.ezc()) continue;
            return false;
        }
        return true;
    }

    private void ezb() {
        for (mhw mhw2 : this.Dxe) {
            mhw2.shutdown();
            this.MessageDelegator.hd(mhw2.getGUID());
        }
        this.Dxe.clear();
    }

    private void aen(int n) {
        this.Dxa.aep(n);
        for (int i = 0; i < n; ++i) {
            ljq ljq2 = new ljq();
            this.Dxa.b(i, 0.0f, ljq2);
            mhw mhw2 = new mhw(ljq2, this.Dxc, this.eUj);
            mhw2.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(mhw2);
            this.Dxe.add(mhw2);
        }
    }
}

