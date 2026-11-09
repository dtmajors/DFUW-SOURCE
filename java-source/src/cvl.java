/*
 * Decompiled with CFR.
 */
public class cvl {
    public static cvj wU(int n) {
        cvk.a a2 = cvk.a.getSensorType(n);
        if (a2 == null) {
            return null;
        }
        return cvl.b(a2);
    }

    public static cvj b(cvk.a a2) {
        switch (a2) {
            case fzJ: {
                cvi cvi2 = new cvi(a2);
                cvi2.fK(3);
                return cvi2;
            }
            case fzK: {
                cvh cvh2 = new cvh(a2);
                return cvh2;
            }
            case fzL: {
                cvm cvm2 = new cvm(a2);
                return cvm2;
            }
        }
        return null;
    }
}

