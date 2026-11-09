/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ash
 *  cug
 *  lcw
 */
import java.util.Arrays;
import java.util.PriorityQueue;

class ask
extends ash {
    private static final int bTZ = 20;
    private final float bVE;
    private ljq bVF;

    protected ask(ljq ljq2, float f2, ash.c c2, String string) {
        this.Position = ljq2.esF();
        this.c(c2);
        this.FileName = this.o(string, "tnm_");
        this.bVE = f2;
        this.Radius = 500.0f;
        float f3 = this.bUC * 20.0f / 2.0f;
        this.Radius = (float)(Math.floor(this.Radius / f3) * (double)f3);
        this.bUI = 2.0f * this.Radius / 20.0f;
        this.bUr = Math.round(this.Position.x - this.Radius);
        this.bUs = Math.round(this.Position.rlV - this.Radius);
        this.bUF = (int)Math.ceil(this.Radius * 2.0f / this.bUC);
        this.bUK = this.bUF * this.bUF;
        this.bUo = this.bUF / 20;
        this.bUp = this.bUF;
        this.bUq = this.bUF / 20;
        this.bUE = 400;
        this.bUy = "[TILEMESH GENERATION]: ";
        this.bUH = ldq.ai(this.bVE, 500.0f) ? 2 : 0;
        this.setActive(false);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NavMesh for: ");
        stringBuilder.append(this.FileName);
        stringBuilder.append(" res: ");
        stringBuilder.append(this.bUC);
        stringBuilder.append(" rad: ");
        stringBuilder.append(this.bVE);
        stringBuilder.append(" type: ");
        stringBuilder.append((Object)this.bQM);
        return stringBuilder.toString();
    }

    private lfs<Integer, ash.a> TN() {
        lfs<Integer, ash.a> lfs2 = null;
        int n = 0;
        if (this.bVF == null) {
            for (int i = 0; i < this.bUx.length; ++i) {
                ash.a[] aArray = this.bUx[i];
                if (aArray == null) continue;
                for (ash.a a2 : aArray) {
                    lfs<Integer, ash.a> lfs3;
                    int n2;
                    if (a2.TL() || !a2.TI() || n >= (n2 = this.a(lfs3 = new lfs<Integer, ash.a>(i, a2)))) continue;
                    n = n2;
                    lfs2 = lfs3;
                }
            }
        } else {
            int n3 = this.m(this.bVF.x, this.bVF.rlV);
            int n4 = n3 - this.bUF * 20 - 20;
            for (int i = 0; i < 41; ++i) {
                for (int j = 0; j < 41; ++j) {
                    ash.a[] aArray;
                    if (n4 + j < 0 || n4 + j >= this.bUK || (aArray = this.bUx[n4 + j]) == null) continue;
                    for (ash.a a3 : aArray) {
                        lfs<Integer, ash.a> lfs4;
                        int n5;
                        if (a3.TL() || !a3.TI() || n >= (n5 = this.a(lfs4 = new lfs<Integer, ash.a>(n4, a3)))) continue;
                        n = n5;
                        lfs2 = lfs4;
                    }
                }
                n4 += this.bUF;
            }
        }
        return lfs2;
    }

    protected void Tx() {
        lfs<Integer, ash.a> lfs2 = this.TN();
        if (lfs2 == null) {
            arw.ct.error("WTF!!! no seed point!");
            this.Tv();
            return;
        }
        float[] fArray = this.hW((Integer)lfs2.reX);
        this.Position.x = fArray[0];
        this.Position.y = ((ash.a)lfs2.reY).TH();
        this.Position.rlV = fArray[1];
        this.TE();
        this.a(lfs2);
        for (ash.a[] aArray : this.bUx) {
            if (aArray == null) continue;
            for (ash.a a2 : aArray) {
                if (a2.TL()) continue;
                a2.TF();
            }
        }
        for (int i = 0; i < this.bUx.length; ++i) {
            if (this.bUx[i] == null) continue;
            int n3 = 0;
            for (ash.a aArray2 : this.bUx[i]) {
                if (!aArray2.TL()) continue;
                n3 = 1;
                break;
            }
            if (n3 != 0) continue;
            int n4 = i + this.bUF;
            int n5 = i + this.bUF - 1;
            int n6 = i - 1;
            if (i / this.bUF < this.bUF - 1 && this.bUx[n4] != null) {
                for (ash.a a3 : this.bUx[n4]) {
                    if (a3.hX(0) <= -1) continue;
                    n3 = 1;
                    break;
                }
            }
            if (n3 != 0) continue;
            if (i % this.bUF > 0 && i / this.bUF < this.bUF - 1 && this.bUx[n5] != null) {
                for (ash.a a3 : this.bUx[n5]) {
                    if (a3.hX(1) <= -1) continue;
                    n3 = 1;
                    break;
                }
            }
            if (n3 != 0) continue;
            if (i % this.bUF > 0 && this.bUx[n6] != null) {
                for (ash.a a3 : this.bUx[n6]) {
                    if (a3.hX(2) <= -1) continue;
                    n3 = 1;
                    break;
                }
            }
            if (n3 != 0) continue;
            this.bUx[i] = null;
        }
        this.TE();
        this.Tt();
    }

    protected final int a(lfs<Integer, ash.a> lfs2) {
        PriorityQueue<lfs<Integer, ash.a>> priorityQueue = new PriorityQueue<lfs<Integer, ash.a>>();
        priorityQueue.add(lfs2);
        ((ash.a)lfs2.reY).bU(true);
        int n = 0;
        while (!priorityQueue.isEmpty()) {
            float f2;
            float f3;
            Object[] objectArray;
            float f4;
            lfs lfs3 = (lfs)priorityQueue.poll();
            int n2 = (Integer)lfs3.reX;
            ash.a a2 = (ash.a)lfs3.reY;
            if (this.bVF != null && (f4 = this.bVF.x - (objectArray = this.hW(n2))[0]) * f4 + (f3 = this.bVF.y - a2.bUT) * f3 + (f2 = this.bVF.rlV - objectArray[1]) * f2 > this.bVE * this.bVE) continue;
            assert (a2.TI());
            for (int i = 0; i < 3; ++i) {
                ash.a a3;
                byte by;
                if (i != 1 || (by = a2.hX(i)) < 0) continue;
                int n3 = -1;
                switch (i) {
                    case 0: {
                        n3 = n2 - this.bUF;
                        break;
                    }
                    case 1: {
                        n3 = n2 - this.bUF + 1;
                        break;
                    }
                    case 2: {
                        n3 = n2 + 1;
                    }
                }
                if (n3 < 0 || n3 >= this.bUK || this.bUx[n3] == null || this.bUx[n3].length <= by || !(a3 = this.bUx[n3][by]).TI() || a3.TL()) continue;
                a3.bU(true);
                ++n;
                priorityQueue.add(new lfs<Integer, ash.a>(n3, a3));
            }
            objectArray = this.bUx[n2];
            int[] nArray = new int[]{n2 + this.bUF, n2 + this.bUF - 1, n2 - 1};
            block7: for (int i = 0; i < nArray.length; ++i) {
                ash.a[] aArray;
                int n4;
                if (i == 1 || (n4 = nArray[i]) < 0 || n4 >= this.bUK || (aArray = this.bUx[n4]) == null) continue;
                for (ash.a a4 : aArray) {
                    byte by;
                    if (!a4.TI() || !a2.equals(objectArray[by = a4.hX(i)])) continue;
                    lfs<Integer, ash.a> lfs4 = new lfs<Integer, ash.a>(n4, a4);
                    if (a4.TL()) continue;
                    a4.bU(true);
                    ++n;
                    priorityQueue.add(lfs4);
                    continue block7;
                }
            }
        }
        return n;
    }

    protected void Tp() {
        if (++this.bUB <= 400) {
            this.bUn = (this.bUB - 1) / 20;
            this.bUm = (this.bUB - 1) % 20;
            this.aE(this.Position);
        }
    }

    protected void b(kui kui2) {
        ++this.bUD;
        for (leb leb2 : kui2.qdS) {
            ash.a[] aArray;
            boolean bl;
            float f2;
            float f3;
            float f4;
            int n;
            if (!lcw.eng() && lea.enW().isDescendant(leb2.ResourceType, cug.fgE) || (n = this.m(f4 = (float)this.bUr + this.bUI * (float)this.bUm + this.bUC * (float)leb2.riD.cf, f3 = (float)this.bUs + this.bUI * (float)this.bUn + this.bUC * (float)leb2.riD.riS)) >= this.bUK || n < 0 || !this.g(f4, f2 = this.Position.y - this.Radius + this.bUC / 3.0f * (float)leb2.riD.cg, f3)) continue;
            boolean bl2 = cug.vG((int)leb2.ResourceType);
            boolean bl3 = bl = bl2 ? false : bUi.contains(leb2.ResourceType);
            if (!(this.bUv == null || bl2 && this.bQM == ash.c.bVr)) {
                this.bUv[n] = Math.max(this.bUv[n], f2);
                if (Float.compare(this.bUv[n], -3.4028235E38f) != 0) {
                    this.bUw = Math.min(this.bUw, this.bUv[n]);
                    this.bKR = Math.max(this.bKR, this.bUv[n]);
                }
            }
            if (!ldq.ai(this.bVE, 500.0f) && (this.bVF == null && lea.enW().isDescendant(leb2.ResourceType, cug.fpc) || lea.enW().isDescendant(leb2.ResourceType, cug.fnx))) {
                this.bVF = new ljq(f4, f2, f3);
            }
            if ((aArray = this.bUx[n]) == null) {
                aArray = new ash.a[]{new ash.a(this, f2, bl2, bl)};
            } else {
                boolean bl4 = true;
                if (!bl2) {
                    for (ash.a a2 : aArray) {
                        if (!a2.bT(f2)) continue;
                        bl4 = false;
                        break;
                    }
                }
                if (bl4) {
                    ash.a a3 = new ash.a(this, f2, bl2, bl);
                    ash.a[] aArray2 = Arrays.copyOf(aArray, aArray.length + 1);
                    aArray2[aArray.length] = a3;
                    aArray = aArray2;
                }
            }
            this.bUx[n] = aArray;
        }
        kui2.qdS = null;
        if (this.bUD >= this.bUE) {
            this.Tt();
        }
    }

    protected ash.b Tq() {
        return ash.b.bUX;
    }

    protected boolean g(float f2, float f3, float f4) {
        return true;
    }
}

