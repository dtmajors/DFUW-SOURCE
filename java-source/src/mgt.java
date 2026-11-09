/*
 * Decompiled with CFR.
 */
public enum mgt {
    Dwf,
    Dwg,
    Dwh,
    Dwi,
    Dwj;


    public short b(short s, short s2) {
        switch (this) {
            default: {
                return s;
            }
            case Dwh: 
            case Dwi: 
        }
        return (short)(s + s2 / 2);
    }

    public float ap(float f, float f2) {
        switch (this) {
            default: {
                return f;
            }
            case Dwh: 
            case Dwi: 
        }
        return f + f2 / 2.0f;
    }

    public short c(short s, short s2) {
        switch (this) {
            default: {
                return s;
            }
            case Dwj: 
            case Dwi: 
        }
        return (short)(s + s2 / 2);
    }

    public float aq(float f, float f2) {
        switch (this) {
            default: {
                return f;
            }
            case Dwj: 
            case Dwi: 
        }
        return f + f2 / 2.0f;
    }

    public short k(short s) {
        switch (this) {
            case Dwg: 
            case Dwj: 
            case Dwh: 
            case Dwi: {
                return (short)(s / 2);
            }
        }
        return s;
    }

    public float ol(float f) {
        switch (this) {
            case Dwg: 
            case Dwj: 
            case Dwh: 
            case Dwi: {
                return f / 2.0f;
            }
        }
        return f;
    }
}

