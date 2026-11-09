/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ash
 */
import java.util.Arrays;

final class asg
extends ash {
    private static final int bTZ = 4;

    protected asg(ljq ljq2, float f2, ash.c c2, String string) {
        this.Position = ljq2.esF();
        this.c(c2);
        this.FileName = this.o(string, "nm_");
        float f3 = arw.b(c2);
        assert (f3 >= 0.0f);
        this.Radius = f2 > f3 ? f3 : f2;
        float f4 = this.bUC * 4.0f / 2.0f;
        this.Radius = (float)(Math.floor(this.Radius / f4) * (double)f4);
        this.bUI = 2.0f * this.Radius / 4.0f;
        this.bUr = Math.round(this.Position.x - this.Radius);
        this.bUs = Math.round(this.Position.rlV - this.Radius);
        this.bUF = (int)Math.ceil(this.Radius * 2.0f / this.bUC);
        this.bUK = this.bUF * this.bUF;
        this.bUo = this.bUF / 4;
        this.bUp = this.bUF;
        this.bUq = this.bUF / 4;
        this.bUE = 16;
        this.bUy = "[NAVMESH GENERATION]: ";
        this.bUH = 0;
        this.setActive(false);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NavMesh for: ");
        stringBuilder.append(this.FileName);
        stringBuilder.append(" res: ");
        stringBuilder.append(this.bUC);
        stringBuilder.append(" rad: ");
        stringBuilder.append(this.Radius);
        stringBuilder.append(" type: ");
        stringBuilder.append((Object)this.bQM);
        return stringBuilder.toString();
    }

    protected void Tp() {
        if (++this.bUB <= 16) {
            this.bUn = (this.bUB - 1) / 4;
            this.bUm = (this.bUB - 1) % 4;
            this.aE(this.Position);
        }
    }

    protected void init() {
        if (this.bQM == ash.c.bVi || this.bQM == ash.c.bVr) {
            this.bUv = new float[this.bUK];
            Arrays.fill(this.bUv, -3.4028235E38f);
        }
    }

    protected ash.b Tq() {
        if (this.bUv != null) {
            return ash.b.bUZ;
        }
        return ash.b.bVa;
    }

    protected boolean g(float f2, float f3, float f4) {
        return ((f2 - this.Position.x) * (f2 - this.Position.x) + (f3 - this.Position.y) * (f3 - this.Position.y) + (f4 - this.Position.rlV) * (f4 - this.Position.rlV)) / (this.Radius * this.Radius) < 1.0f;
    }
}

