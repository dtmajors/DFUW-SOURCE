/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class mhz
extends mib
implements mic {
    private List<a> fu = new ArrayList<a>();

    public mhz(mid mid2) {
        super(mid2);
    }

    @Override
    public void aep(int n) {
        while (n < this.fu.size()) {
            this.fu.remove(this.fu.size() - 1);
        }
        while (n > this.fu.size()) {
            a a2 = new a(this, null);
            this.a(a2);
            this.fu.add(a2);
        }
    }

    @Override
    public int ezg() {
        return this.fu.size();
    }

    @Override
    public void b(int n, float f, ljq ljq2) {
        float f2 = f * this.Dxj / (2.0f * this.Dxy);
        a a2 = this.fu.get(n);
        a2.Dxu += f2;
        if (a2.Dxu > 1.0f) {
            a2.Dxu = 0.0f;
            ljq ljq3 = a2.Dxt;
            a2.Dxt = a2.Dxs;
            a2.Dxs = ljq3;
        }
        ljq.a(a2.Dxs, a2.Dxt, a2.Dxu, ljq2);
        ljq2.x = lew.A(16384.0f * ljq2.x, -16383.0f, 16383.0f);
        ljq2.rlV = lew.A(16384.0f * ljq2.rlV, -16383.0f, 16383.0f);
        ljq2.y = this.Dxh.Dxz.au(ljq2.x, ljq2.rlV);
    }

    private void a(a a2) {
        assert (this.Dxh.DxA.size() != 0);
        Random random = new Random();
        int n = random.nextInt(this.Dxh.DxA.size());
        ljq ljq2 = (ljq)this.Dxh.DxA.get((int)n).reX;
        ljq ljq3 = (ljq)this.Dxh.DxA.get((int)n).reY;
        ljq ljq4 = new ljq(ljq3);
        ljq4.et(ljq2);
        ljq ljq5 = new ljq(ljq4);
        ljq5.nm(random.nextFloat());
        ljq5.es(ljq2);
        ljq ljq6 = new ljq(ljq4.rlV, 0.0f, -ljq4.x);
        ljq6.normalize();
        ljq6.nm(this.Dxy / 16384.0f);
        a2.Dxs = new ljq(ljq5);
        a2.Dxs.es(ljq6);
        a2.Dxt = new ljq(ljq5);
        a2.Dxt.et(ljq6);
        a2.Dxu = random.nextFloat();
    }
}

