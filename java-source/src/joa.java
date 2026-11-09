/*
 * Decompiled with CFR.
 */
public class joa {
    public final float X;
    public final float Y;
    public final float W;
    public final float H;

    public joa() {
        this.H = 0.0f;
        this.W = 0.0f;
        this.Y = 0.0f;
        this.X = 0.0f;
    }

    public joa(float f2, float f3, float f4, float f5) {
        this.X = f2;
        this.Y = f3;
        this.W = f4;
        this.H = f5;
    }

    public joa(joa joa2) {
        this.X = joa2.X;
        this.Y = joa2.Y;
        this.W = joa2.W;
        this.H = joa2.H;
    }

    public final float dOj() {
        return this.X + this.W;
    }

    public final float TG() {
        return this.Y + this.H;
    }

    public final float dOk() {
        return this.X + this.W / 2.0f;
    }

    public final float dOl() {
        return this.Y + this.H / 2.0f;
    }

    public final String toString() {
        return "[SFRect: X:" + this.X + " Y:" + this.Y + " W:" + this.W + " H:" + this.H + "]";
    }

    public final boolean intersects(float f2, float f3) {
        return f2 >= this.X && f2 < this.dOj() && f3 >= this.Y && f3 < this.TG();
    }

    public boolean o(joa joa2) {
        if (this.X + this.W <= joa2.X) {
            return false;
        }
        if (this.X >= joa2.X + joa2.W) {
            return false;
        }
        if (this.Y + this.H <= joa2.Y) {
            return false;
        }
        return !(this.Y >= joa2.Y + joa2.H);
    }

    public static boolean a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return f2 <= f8 && f3 <= f9 && f4 >= f6 && f5 >= f7;
    }

    public static boolean b(float f2, float f3, float f4, float f5, float f6, float f7) {
        return f6 >= f2 && f6 <= f4 && f7 >= f3 && f7 <= f5;
    }

    public boolean equals(Object object) {
        if (object instanceof joa) {
            joa joa2 = (joa)object;
            return this.X == joa2.X && this.Y == joa2.Y && this.W == joa2.W && this.H == joa2.H;
        }
        return false;
    }
}

