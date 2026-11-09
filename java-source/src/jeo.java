/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class jeo {
    private jes mUL;
    private jep mVu;
    private jeq mVv;
    private jer mVw = jer.mVK;
    private boolean mVx;

    public jes dzC() {
        return this.mUL;
    }

    public jep dzO() {
        return this.mVu;
    }

    public jeq dzP() {
        return this.mVv;
    }

    public jer dzQ() {
        return this.mVw;
    }

    public void a(jer jer2) {
        this.dzC().a(this, jer2);
    }

    public boolean dzR() {
        return this.mVx;
    }

    public void tc(boolean bl) {
        this.mVx = bl;
    }

    public static List<String> a(ckk ckk2) {
        ArrayList<String> arrayList = lcn.emv();
        for (cki cki2 : ckk2.aQU().values()) {
            int n = cki2.BV();
            switch (n) {
                case 5232: {
                    n = 208;
                    break;
                }
                case 2576: {
                    n = 160;
                    break;
                }
                case 3360: {
                    n = 176;
                    break;
                }
                case 5744: {
                    n = 240;
                }
            }
            String string = lvm.sWX.bD(n).exA();
            int n2 = (int)cki2.aQR();
            arrayList.add(string + " +" + n2);
        }
        Object object = new int[]{352, 400, 384, 9056};
        block10: for (int i = 0; i < ((Object)object).length; ++i) {
            float f = cer.aF((int)object[i], ckk2.getID());
            if (!(f > 0.0f)) continue;
            if (object[i] == 9056) {
                f *= 100.0f;
            }
            switch (object[i]) {
                case 9056: {
                    arrayList.add(lxx.tzL.bD(Float.valueOf(f)).exA());
                    continue block10;
                }
                default: {
                    arrayList.add(lvm.sWX.bD((int)object[i]).exA() + " +" + f);
                }
            }
        }
        return arrayList;
    }

    public List<String> dzS() {
        ckk ckk2 = lea.epw().aW(this.mVu.ordinal(), this.mVv.ordinal());
        assert (ckk2 != null);
        return jeo.a(ckk2);
    }

    public int cl() {
        return (int)lea.epw().aX(this.mVv.ordinal(), this.mUL.a(this.mVv));
    }

    public boolean dzG() {
        switch (this.dzQ()) {
            case mVN: {
                return this.mUL.g(this.mVu) != this.mVv;
            }
            case mVM: {
                return this.mUL.g(this.mVu) == this.mVv;
            }
        }
        return false;
    }

    public String getDisplayName() {
        ckk ckk2 = lea.epw().aW(this.mVu.ordinal(), this.mVv.ordinal());
        return ckk2.getDisplayName();
    }

    jeo(jes jes2, jep jep2, jeq jeq2) {
        this.mUL = jes2;
        this.mVu = jep2;
        this.mVv = jeq2;
    }

    void b(jer jer2) {
        if (jer2 == this.mVw) {
            return;
        }
        this.mVw = jer2;
        this.dzC().dzV().dzB().mUP.V(this);
    }
}

