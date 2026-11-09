/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class azj {
    private int[] cEC = null;
    private int[] cED = null;
    private int cEt = 0;
    private int[] cEE = null;
    private int[] cEF = null;
    private float cEv = 0.0f;
    private boolean cEw = false;
    private float cEG = 0.0f;

    public int aas() {
        return this.cEt;
    }

    @Deprecated
    public int f(ayb ayb2) {
        return 0;
    }

    public int a(ayb ayb2, azh azh2, boolean bl, int n) {
        int n2;
        jng jng2;
        if (ayb2 == null || azh2 == null) {
            return 0;
        }
        jng jng3 = jng2 = hso.cxK() == null || hso.cxK().cxP() == null || hso.cxK().cxP().czb() == null ? null : hso.cxK().cxP().czb();
        if (jng2 == null) {
            return 0;
        }
        int n3 = 0;
        for (n2 = 0; n2 < this.cEF.length; ++n2) {
            if (this.cEE[n2] != ayb2.ordinal()) continue;
            n3 = this.cEF[n2];
            break;
        }
        if (n3 == 0) {
            return 0;
        }
        n2 = this.cEw ? jng2.m(ayb2) : jng2.dNz();
        int n4 = bl ? (int)(this.cEG * (float)n) : 0;
        int n5 = azh2.getLength();
        return (int)(((float)n2 * this.cEv + 1.0f) * (float)((n3 + n4) * (n5 /= 3600)));
    }

    public void aaV() {
        this.cEt = azi.aas();
        this.cEv = azi.adg();
        this.cEw = azi.adh();
        this.cEG = azi.adi();
        Map<ayb, int[]> map = azi.ade();
        int n = 0;
        for (int[] object2 : map.values()) {
            n += object2.length;
        }
        this.cEC = new int[n];
        this.cED = new int[n];
        int n2 = 0;
        for (Object object : map.entrySet()) {
            for (int entry = 0; entry < object.getValue().length; ++entry) {
                this.cEC[n2] = object.getKey().ordinal();
                this.cED[n2] = ((int[])object.getValue())[entry];
                ++n2;
            }
        }
        Map<ayb, Integer> map2 = azi.adf();
        this.cEE = new int[map2.size()];
        this.cEF = new int[map2.size()];
        n2 = 0;
        for (Map.Entry entry : map2.entrySet()) {
            this.cEE[n2] = ((ayb)((Object)entry.getKey())).ordinal();
            this.cEF[n2] = (Integer)entry.getValue();
            ++n2;
        }
    }
}

