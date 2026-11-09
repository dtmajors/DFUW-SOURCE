/*
 * Decompiled with CFR.
 */
public final class aye
extends Enum<aye> {
    public static final /* enum */ aye cxk = new aye();
    public static final /* enum */ aye cxl = new aye();
    public static final /* enum */ aye cxm = new aye();
    private static final /* synthetic */ aye[] cxn;

    public static aye[] values() {
        return (aye[])cxn.clone();
    }

    public static aye valueOf(String string) {
        return Enum.valueOf(aye.class, string);
    }

    public boolean a(ayg ayg2, ayf ayf2) {
        return true;
    }

    public boolean a(ayo ayo2, ayf ayf2) {
        int n = this.ordinal();
        switch (ayo2) {
            case czO: {
                switch (ayf2) {
                    case cxq: 
                    case cxr: {
                        return true;
                    }
                    case cxs: {
                        return n > cxl.ordinal();
                    }
                    case cxt: {
                        return true;
                    }
                    case cxu: {
                        return n > cxk.ordinal();
                    }
                    case cxv: {
                        return n > cxl.ordinal();
                    }
                    case cxw: {
                        return true;
                    }
                    case cxx: {
                        return n > cxl.ordinal();
                    }
                    case cxy: {
                        return n > cxl.ordinal();
                    }
                }
                assert (false) : "Unknown operation!";
                return false;
            }
            case czP: {
                switch (ayf2) {
                    case cxq: 
                    case cxr: {
                        return n >= cxk.ordinal();
                    }
                    case cxs: {
                        return n > cxl.ordinal();
                    }
                    case cxt: {
                        return n >= cxk.ordinal();
                    }
                    case cxu: {
                        return n > cxk.ordinal();
                    }
                    case cxv: {
                        return n > cxl.ordinal();
                    }
                    case cxw: {
                        return n >= cxk.ordinal();
                    }
                    case cxx: {
                        return n > cxk.ordinal();
                    }
                    case cxy: {
                        return n > cxl.ordinal();
                    }
                }
                assert (false) : "Unknown operation!";
                return false;
            }
            case czQ: {
                switch (ayf2) {
                    case cxq: 
                    case cxr: {
                        return n > cxk.ordinal();
                    }
                    case cxs: {
                        return n > cxl.ordinal();
                    }
                    case cxt: {
                        return n > cxk.ordinal();
                    }
                    case cxu: {
                        return n > cxk.ordinal();
                    }
                    case cxv: {
                        return n > cxl.ordinal();
                    }
                    case cxw: {
                        return n > cxk.ordinal();
                    }
                    case cxx: {
                        return n > cxk.ordinal();
                    }
                    case cxy: {
                        return n > cxl.ordinal();
                    }
                }
                assert (false) : "Unknown operation!";
                return false;
            }
        }
        assert (false) : "Unknown Forum!";
        return false;
    }

    static {
        cxn = new aye[]{cxk, cxl, cxm};
    }
}

