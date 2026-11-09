/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class cuj {
    private int ResourceType = 0;
    private ctk[] fxE = null;
    private int fxF = 50;
    private int fxG = 120;
    private lmc fxH = lmc.rEl;
    private lmc fxI = lmc.rEl;
    private int buy = 0;

    public int az() {
        return this.ResourceType;
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public cuj(int n, ctk[] ctkArray) {
        this.ResourceType = n;
        this.fxE = ctkArray;
    }

    public boolean contains(int n) {
        if (this.fxE == null) {
            return false;
        }
        for (int i = 0; i < this.fxE.length; ++i) {
            if (this.fxE[i].ResourceType != n) continue;
            return true;
        }
        return false;
    }

    public lmc wO(int n) {
        if (!this.contains(n)) {
            return lmc.rEl;
        }
        for (int i = 0; i < this.fxE.length; ++i) {
            if (this.fxE[i].ResourceType != n) continue;
            return this.fxE[i].ffZ;
        }
        return lmc.rEl;
    }

    public ctk eW(float f2) {
        return this.a(f2, null, 1.0f, -1);
    }

    public ctk b(float f2, lmf lmf2) {
        return this.a(f2, lmf2, 1.0f, -1);
    }

    public ctk B(float f2, float f3) {
        return this.a(f2, null, f3, -1);
    }

    public ctk a(float f2, lmf lmf2, float f3, int n) {
        float f4 = 1.0f;
        ctk[] ctkArray = new ctk[this.fxE.length];
        int n2 = cug.wE((int)n);
        for (int i = this.fxE.length - 1; i >= 0; --i) {
            ctkArray[i] = new ctk();
            ctkArray[i].ResourceType = this.fxE[i].ResourceType;
            ctkArray[i].asi = this.fxE[i].asi;
            int n3 = cug.wE((int)ctkArray[i].ResourceType);
            float f5 = 1.0f;
            if (n3 > n2 + 1) {
                f5 = 0.0f;
            } else if (n3 == n2 + 1) {
                f5 = 0.5f;
            }
            float f6 = lmf2 == null ? 1.0f : lmf2.c(this.fxE[i].ffZ);
            float f7 = this.fxE[i].ffZ == lmc.rEn ? f3 : 1.0f;
            ctkArray[i].Probability = this.fxE[i].Probability * f6 * f7 * f5;
            if (i <= 0) continue;
            f4 -= ctkArray[i].Probability;
        }
        if (f4 > 0.0f) {
            ctkArray[0].Probability = f4;
        }
        return this.a(ctkArray, f2);
    }

    private ctk a(ctk[] ctkArray, float f2) {
        if (ctkArray == null) {
            return null;
        }
        float f3 = 0.0f;
        for (int i = 0; i < ctkArray.length; ++i) {
            if (!((f3 += ctkArray[i].Probability) >= f2)) continue;
            return ctkArray[i];
        }
        lfn.b(5, this.getClass().getSimpleName(), "determineSuccessfulItem() : Sum of probability for harvesting items is not 1.0!!!");
        assert (false);
        return null;
    }

    public String toString() {
        assert (this.fxE != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFResourceHarvestingInfo: Resource='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' HarvestingItemCount=");
        stringBuilder.append(this.fxE.length);
        return stringBuilder.toString();
    }

    private int bbV() {
        return this.fxF;
    }

    public int a(lmf lmf2) {
        return Math.round((float)this.fxF * this.fxH.e(lmf2));
    }

    public void wP(int n) {
        this.fxF = n;
    }

    private int bbW() {
        return this.fxG;
    }

    public int b(lmf lmf2) {
        return Math.round((float)this.fxG * this.fxI.f(lmf2));
    }

    public void wQ(int n) {
        this.fxG = n;
    }

    public int FW() {
        return this.buy;
    }

    public void gJ(int n) {
        this.buy = n;
    }

    public lmc bbX() {
        return this.fxH;
    }

    public void a(lmc lmc2) {
        this.fxH = lmc2;
    }

    public lmc bbY() {
        return this.fxI;
    }

    public void b(lmc lmc2) {
        this.fxI = lmc2;
    }
}

