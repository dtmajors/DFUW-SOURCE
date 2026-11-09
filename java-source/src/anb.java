/*
 * Decompiled with CFR.
 */
public final class anb {
    public static amy a(ljq ljq2, asb asb2, dxr dxr2, clb clb2) {
        amx amx2 = null;
        switch (asb2.SP()) {
            case bTj: {
                amx2 = new ana(ljq2, asb2, clb2);
                break;
            }
            case bTi: {
                amx2 = new amz(ljq2, asb2, clb2);
                break;
            }
            default: {
                assert (false);
                return null;
            }
        }
        amx2.setMessageDelegator(dxr2);
        amx2.setGUID(dxr2.bzv());
        dxr2.a(amx2);
        return amx2;
    }

    private anb() {
    }
}

