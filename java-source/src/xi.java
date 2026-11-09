/*
 * Decompiled with CFR.
 */
public enum xi {
    baZ,
    bba,
    bbb,
    bbc,
    bbd;


    public boolean a(short s, short s2) {
        switch (this) {
            case baZ: {
                return s < s2;
            }
            case bba: {
                return s <= s2;
            }
            case bbb: {
                return s == s2;
            }
            case bbc: {
                return s >= s2;
            }
            case bbd: {
                return s > s2;
            }
        }
        return false;
    }

    public boolean A(int n, int n2) {
        switch (this) {
            case baZ: {
                return n < n2;
            }
            case bba: {
                return n <= n2;
            }
            case bbb: {
                return n == n2;
            }
            case bbc: {
                return n >= n2;
            }
            case bbd: {
                return n > n2;
            }
        }
        return false;
    }

    public boolean a(long l, long l2) {
        switch (this) {
            case baZ: {
                return l < l2;
            }
            case bba: {
                return l <= l2;
            }
            case bbb: {
                return l == l2;
            }
            case bbc: {
                return l >= l2;
            }
            case bbd: {
                return l > l2;
            }
        }
        return false;
    }

    public boolean d(float f2, float f3) {
        switch (this) {
            case baZ: {
                return f2 < f3;
            }
            case bba: {
                return f2 <= f3;
            }
            case bbb: {
                return f2 == f3;
            }
            case bbc: {
                return f2 >= f3;
            }
            case bbd: {
                return f2 > f3;
            }
        }
        return false;
    }

    public boolean a(double d2, double d3) {
        switch (this) {
            case baZ: {
                return d2 < d3;
            }
            case bba: {
                return d2 <= d3;
            }
            case bbb: {
                return d2 == d3;
            }
            case bbc: {
                return d2 >= d3;
            }
            case bbd: {
                return d2 > d3;
            }
        }
        return false;
    }

    public static xi getValueByOrdinal(int n) {
        return n < 0 || n >= xi.values().length ? null : xi.values()[n];
    }

    public static xi getValueByName(String string) {
        if (string == null) {
            return null;
        }
        for (xi xi2 : xi.values()) {
            if (!xi2.name().toLowerCase().equals(string.toLowerCase())) continue;
            return xi2;
        }
        return null;
    }
}

