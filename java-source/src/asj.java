/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ash
 */
final class asj
extends ash {
    private int bVy;
    private int bVz;
    private final int bVA;
    private final int bVB;
    private final int bVC;
    private final int bVD;

    protected asj(ljq ljq2, ljq ljq3, float f2, ash.c c2, String string) {
        assert (ljq2 != null && ljq3 != null);
        this.Position = ljq2.esF();
        this.bUt = ljq3.esF();
        this.Radius = f2;
        this.h(this.Position, this.bUt);
        this.c(c2);
        this.FileName = this.o(string, "snm_");
        this.Radius = (float)(Math.floor(this.Radius / this.bUC) * (double)this.bUC);
        float f3 = (float)(Math.floor((this.bUt.rlV - this.Position.rlV) / this.bUC) * (double)this.bUC);
        float f4 = (float)(Math.floor((this.bUt.x - this.Position.x) / this.bUC) * (double)this.bUC);
        float f5 = (float)(Math.floor(15.0f / this.bUC) * (double)this.bUC);
        this.bUI = f5 * 2.0f;
        this.bUo = (int)Math.ceil(this.bUI / this.bUC);
        this.bUp = (int)Math.ceil(this.Radius * 2.0f / this.bUC);
        this.bUq = (int)Math.ceil(this.bUI / this.bUC);
        this.bUr = (int)(this.Position.x - f5);
        this.bUs = (int)(f3 >= 0.0f ? this.Position.rlV - f5 : this.Position.rlV - f5 + f3);
        int n = (int)(f4 + this.bUI);
        int n2 = (int)(Math.abs(f3) + this.bUI);
        this.bUF = (int)((float)(Math.ceil((float)Math.max(n, n2) / this.bUC) * (double)this.bUC) / this.bUC);
        this.bUK = this.bUF * this.bUF;
        this.bVA = (int)((this.Position.x - (float)this.bUr) / this.bUI);
        this.bVB = (int)((this.Position.rlV - (float)this.bUs) / this.bUI);
        this.bVC = (int)((this.bUt.x - (float)this.bUr) / this.bUI);
        this.bVD = (int)((this.bUt.rlV - (float)this.bUs) / this.bUI);
        this.bVy = 0;
        this.bVz = this.bVC - this.bVA;
        if (Math.abs(this.bVD - this.bVB) > this.bVz) {
            this.bVz = Math.abs(this.bVD - this.bVB);
        }
        this.bUE = Integer.MAX_VALUE;
        this.bUy = "[STRIP GENERATION]: ";
        this.bUH = 1;
        this.setActive(false);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.FileName);
        stringBuilder.append(" Strip from: ");
        stringBuilder.append(this.Position);
        stringBuilder.append(" to: ");
        stringBuilder.append(this.bUt);
        stringBuilder.append(" res: ");
        stringBuilder.append(this.bUC);
        stringBuilder.append(" type: ");
        stringBuilder.append((Object)this.bQM);
        return stringBuilder.toString();
    }

    private void h(ljq ljq2, ljq ljq3) {
        if (ljq2.x > ljq3.x) {
            this.Position = ljq3;
            this.bUt = ljq2;
        }
    }

    protected void Ty() {
        throw new UnsupportedOperationException("Do not use!");
    }

    protected void TA() {
        throw new UnsupportedOperationException("Do not use!");
    }

    protected void Tp() {
        if (this.bVy > this.bVz) {
            return;
        }
        int n = this.bUm;
        int n2 = this.bUn;
        this.bUm = this.bVA + this.bVy * (this.bVC - this.bVA) / this.bVz;
        this.bUn = this.bVB + this.bVy * (this.bVD - this.bVB) / this.bVz;
        if (this.bVy > 0 && Math.abs(this.bUm - n) > 0 && Math.abs(this.bUn - n2) > 0) {
            this.bUm = n;
        } else {
            ++this.bVy;
        }
        this.aE(this.Position);
        if (this.bVy > this.bVz) {
            this.bUE = 0;
        }
    }

    protected ash.b Tq() {
        return ash.b.bVa;
    }

    protected boolean g(float f2, float f3, float f4) {
        return true;
    }
}

