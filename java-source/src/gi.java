/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class gi
extends btk
implements bto {
    private static final double WF = 1800.0;
    private double WG = 0.0;
    private Map<ldv, a> WH = lcn.emw();
    private int WI = 0;

    private void a(gbu gbu2) {
        int n = gbu2.WJ;
        int n2 = gbu2.WK;
        ldv ldv2 = gbu2.aO();
        this.WH.put(ldv2, new a(this, n, n2));
    }

    @Override
    public void doTick(ldz ldz2) {
        if (ldz2.rgz > this.WG + 1800.0) {
            this.WG = ldz2.rgz;
            if (this.WH.isEmpty()) {
                return;
            }
            for (Map.Entry<ldv, a> entry : this.WH.entrySet()) {
                a a2 = entry.getValue();
                if (this.WI > a2.WJ && a2.WL > a2.WJ) continue;
                if (a2.WL == 0 && this.WI == 0) {
                    return;
                }
                if (a2.WL != 0 && Math.abs(this.WI - a2.WL) < a2.WK) continue;
                a2.WL = this.WI;
                gbw gbw2 = (gbw)this.MessageDelegator.h(28675, this.getGUID(), entry.getKey());
                gbw2.jcX = this.WI;
                this.MessageDelegator.F(gbw2);
            }
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 28674: {
                this.a((gbu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public final void bG(int n) {
        this.WI = n;
    }

    static /* synthetic */ int b(gi gi2) {
        return gi2.WI;
    }
}

