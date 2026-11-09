/*
 * Decompiled with CFR.
 */
public class ddw {
    public final float bnT;
    public final float aXs;
    public final float gey;
    public final a gez;

    public ddw(float f2, float f3, float f4, a a2) {
        this.bnT = f2;
        this.aXs = f3;
        this.gey = f4;
        this.gez = a2;
    }

    public boolean gg(float f2) {
        switch (this.gez) {
            case geB: {
                return this.bnT < f2 && f2 < this.aXs;
            }
            case geC: {
                return this.bnT < f2 && f2 <= this.aXs;
            }
            case geD: {
                return this.bnT <= f2 && f2 < this.aXs;
            }
            case geE: {
                return this.bnT <= f2 && f2 <= this.aXs;
            }
        }
        return false;
    }
}

