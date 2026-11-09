/*
 * Decompiled with CFR.
 */
public class hmu
extends how {
    private final a kMp;
    private boolean Initialized;

    public static lhf a(hnc hnc2, a a2, lhu lhu2, hnt[] hntArray, hnt hnt2) {
        int n;
        int n2 = lhu2 == null ? 0 : lhu2.kLY.rmN;
        for (n = 0; n < hntArray.length; ++n) {
            if (hntArray[n].kPF.kPG instanceof hpe.d) {
                if (n2 >= a2.kMq) continue;
                n2 = a2.kMq;
                continue;
            }
            lhf lhf2 = hnc2.a(hntArray[n].kPF.kPG.jFE, hntArray[n].aFo);
            hntArray[n].fc = lhf2.H;
            if (n2 >= lhf2.rmN) continue;
            n2 = lhf2.rmN;
        }
        if (hnt2 != null) {
            if (hnt2.kPF.kPG instanceof hpe.d) {
                if (n2 < a2.kMq) {
                    n2 = a2.kMq;
                }
            } else {
                lhf lhf3 = hnc2.a(hnt2.kPF.kPG.jFE, hnt2.aFo);
                hnt2.fc = lhf3.H;
                if (n2 < lhf3.rmN) {
                    n2 = lhf3.rmN;
                }
            }
        }
        n = lhu2 == null ? 0 : lhu2.kLY.H;
        for (int i = 0; i < hntArray.length; ++i) {
            hntArray[i].fc = hntArray[i].kPF.kPG instanceof hpe.d ? hnc2.a(hntArray[i].kPF.kPG.jFE, hntArray[i].aFo, true, n2, true) : hnc2.a((hnb)hntArray[i].kPF.kPG.jFE, (String)hntArray[i].aFo).H;
            n += hntArray[i].fc;
        }
        if (hnt2 != null) {
            hnt2.fc = hnt2.kPF.kPG instanceof hpe.d ? hnc2.a(hnt2.kPF.kPG.jFE, hnt2.aFo, true, n2, true) : hnc2.a((hnb)hnt2.kPF.kPG.jFE, (String)hnt2.aFo).H;
            n += hnt2.fc;
        }
        return new lhf(a2.kri.rmN + n2 + a2.kri.rmN, a2.kri.H + n + a2.kri.H);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
    }

    @Override
    public void FG() {
        assert (this.Initialized);
        super.FG();
        this.Initialized = false;
    }

    public hmu(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, lhu lhu2, hnt[] hntArray, hnt hnt2) {
        super(hnc2, string, lgg2, lhf2, a2.jGJ);
        hoy hoy2;
        this.kMp = a2;
        int n = this.kMp.kri.H;
        int n2 = this.getWidth() - this.kMp.kri.rmN * 2;
        if (hnt2 != null) {
            hoy2 = new hpe(this.kLu, null, new lgg(this.kMp.kri.rmN, n), new lhf(n2, hnt2.fc), hnt2.kPF.kPG, hnt2.aFo);
            this.j(hoy2);
            n += hnt2.fc;
        }
        if (lhu2 != null) {
            hoy2 = new hpa(this.kLu, (String)null, new lgg(this.kMp.kri.rmN, n), null, lhu2);
            this.j(hoy2);
            n += lhu2.kLY.H;
        }
        for (int i = 0; i < hntArray.length; ++i) {
            hpe hpe2 = new hpe(this.kLu, null, new lgg(this.kMp.kri.rmN, n), new lhf(n2, hntArray[i].fc), hntArray[i].kPF.kPG, hntArray[i].aFo);
            this.j(hpe2);
            n += hntArray[i].fc;
        }
    }
}

