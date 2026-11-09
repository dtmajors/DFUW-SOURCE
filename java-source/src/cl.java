/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;
import java.util.Set;

public class cl
extends btk {
    public static final int hI = 2;
    private co hJ;
    private Map<Integer, a> hK = lcn.emw();
    private Set<Integer> hL = lcn.emx();
    private int hM;
    public static final int hN = 1000;
    private int hO = 0;
    private boolean hP = false;

    public cl(co co2) {
        this.hJ = co2;
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 260: {
                this.a((kdk)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private void a(kdk kdk2) {
        lmn lmn2 = kdk2.dVr();
        a a2 = this.hK.remove(new Integer(kdk2.getContext()));
        assert (a2 != null);
        switch (a2.hR) {
            case hU: {
                this.a((cj)a2.hS, lmn2);
                break;
            }
            case hV: {
                this.a(lmn2, (kck)a2.hS);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleSQLResultMessage() : Unknown Case type = " + (Object)((Object)a2.hR));
            }
        }
    }

    private void a(lmn lmn2, kck kck2) {
        if (lmn2.getErrorCode() != 0) {
            String string = "Result = " + lmn2.getErrorCode();
            assert (false) : string;
            return;
        }
        lmo[] lmoArray = lmn2.euT();
        if (lmoArray == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleGetCharEnabledCountForAccountResult() : Error. No Rows returned!");
            return;
        }
        if (lmoArray.length != 1) {
            lfn.b(5, this.getClass().getSimpleName(), "handleGetCharEnabledCountForAccountResult() : Rows should be 1 for Count Result.. wtf");
            return;
        }
        long l = ((lmm)lmoArray[0].euV()[0]).getValue();
        ghw ghw2 = (ghw)this.MessageDelegator.h(7682, this.GUID, lcr.hac);
        ghw2.jhL = kck2;
        ghw2.jhM = (int)l;
        this.MessageDelegator.F(ghw2);
    }

    private void a(cj cj2, lmn lmn2) {
        if (lmn2.getErrorCode() != 0) {
            String string = "Result = " + lmn2.getErrorCode();
            assert (false) : string;
            cj2.g(null);
            this.hJ.a(null);
            return;
        }
        this.hJ.a(cj2);
    }

    public boolean aT() {
        return this.hP;
    }

    public boolean w(int n) {
        return this.hL.contains(n);
    }
}

