/*
 * Decompiled with CFR.
 */
public class aba {
    private aba() {
    }

    public static aaz a(abc abc2, abo abo2, wy wy2, int n) {
        switch (abc2) {
            case bdu: {
                return new abd(wy2, n);
            }
            case bdv: {
                switch (abo2) {
                    case bdD: {
                        return new abh(wy2, n);
                    }
                    case bdE: {
                        return new abi(wy2, n);
                    }
                    case bdF: {
                        return new abk(wy2, n);
                    }
                    case bdG: {
                        return new abl(wy2, n);
                    }
                    case bdH: {
                        return new abm(wy2, n);
                    }
                    case bdI: {
                        return new abn(wy2, n);
                    }
                    case bdK: {
                        return new abf(wy2, n);
                    }
                    case bdJ: {
                        return new abg(wy2, n);
                    }
                }
                return null;
            }
            case bdw: {
                return new aax(wy2, n);
            }
        }
        return null;
    }

    public static aaz a(abc abc2, abo abo2, wy wy2, int n, String string) {
        return aba.a(abc2, abo2, wy2, n);
    }
}

