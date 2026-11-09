/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 */
import java.util.List;

public class brk
extends bri {
    public brk() {
        this(72);
    }

    public brk(int n) {
        super(n);
        this.setObjectType(95);
    }

    protected void a(fmm fmm2) {
        switch (fmm2.bEz()) {
            case 7973: {
                this.a((fmi)fmm2);
                break;
            }
            default: {
                super.a(fmm2);
            }
        }
    }

    protected void aut() {
        assert (this.dBP != null);
        assert (this.dBP.az() > 0);
        super.aut();
        brs brs2 = this.dBQ.awe();
        this.dBQ.reset();
        this.a(brs2, this.dBQ.awe(), bqy.dFM);
    }

    private void a(brs brs2, brs brs3, bqy bqy2) {
        assert (brs2 != null);
        assert (brs3 != null);
        if (!brs2.Ba()) {
            return;
        }
        List<brs> list = brs2.AY();
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            brs brs4 = list.get(i);
            if (brs4.awo() instanceof bpy) continue;
            if (brs4.awo() instanceof bqs) {
                bqs bqs2 = (bqs)brs4.awo();
                this.a(bqs2, brs3, false, bqy2);
                if (!bqs2.auU()) continue;
                brs brs5 = this.dBQ.iZ(bqs2.getGUID());
                this.a(brs4, brs5, bqy2);
                continue;
            }
            this.b(brs4.awo(), brs3);
        }
    }

    private void a(fmi fmi2) {
        assert (this.Initialized);
        boolean bl2 = true;
        if (fmi2.gLy == null) {
            bl2 = false;
        } else if (fmi2.gLz == null) {
            bl2 = false;
        } else if (fmi2.aCK == null) {
            bl2 = false;
        } else if (!this.iE(fmi2.gLy)) {
            bl2 = false;
        } else if (!this.iE(fmi2.gLz)) {
            bl2 = false;
        } else if (!this.iE(fmi2.aCK)) {
            bl2 = false;
        }
        if (!bl2) {
            this.a(fmi2.aO(), 12, false, fmi2.aVk());
            return;
        }
        brs brs2 = this.dBQ.iZ(fmi2.gLy);
        assert (brs2 != null);
        brs brs3 = this.dBQ.iZ(fmi2.gLz);
        assert (brs3 != null);
        bqs bqs2 = this.iK(fmi2.aCK);
        assert (bqs2 != null);
        if (!bqs2.avT().awn().equals(brs2)) {
            this.a(fmi2.aO(), 12, false, fmi2.aVk());
            return;
        }
        if (!brs2.equals(bqs2.avT().awn())) {
            this.a(fmi2.aO(), 12, false, fmi2.aVk());
            return;
        }
        this.a(bqs2, brs3);
        this.a(fmi2.aO(), 12, true, fmi2.aVk());
    }
}

