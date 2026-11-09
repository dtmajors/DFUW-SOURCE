/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Map;
import java.util.SortedMap;

public class tt {
    private boolean aUY = true;
    private Map<Integer, Integer> aVe = lcn.emw();
    private Map<Integer, Float> aVf = lcn.emw();
    private Map<Integer, Float> aVg = lcn.emw();
    private Map<Integer, Float> aVh = lcn.emw();
    private Map<Integer, Float> aVi = lcn.emw();
    private Map<tw, Float> aVj = lcn.emw();
    private SortedMap<Integer, Float> aVk = lcn.emD();

    public void as(boolean bl) {
        this.aUY = bl;
    }

    public boolean vw() {
        return this.aUY;
    }

    public void e(int n, float f2) {
        this.aVi.put(n, Float.valueOf(f2));
    }

    public void f(int n, float f2) {
        this.aVf.put(n, Float.valueOf(f2));
    }

    public void g(int n, float f2) {
        this.aVg.put(n, Float.valueOf(f2));
    }

    public void h(int n, float f2) {
        this.aVh.put(n, Float.valueOf(f2));
    }

    public void x(int n, int n2) {
        this.aVe.put(n, n2);
    }

    public int dt(int n) {
        Integer n2 = this.aVe.get(n);
        return n2 != null ? n2 : -1;
    }

    public void b(String string, float f2) {
        tw tw2 = tw.getValueByName(string);
        if (tw2 == null) {
            assert (false) : "Invalid Type : " + string;
            return;
        }
        this.aVj.put(tw2, Float.valueOf(f2));
    }

    public void i(int n, float f2) {
        this.aVk.put(n, Float.valueOf(f2));
    }

    public float a(tw tw2) {
        Float f2 = this.aVj.get((Object)tw2);
        return f2 != null ? f2.floatValue() : 1.0f;
    }

    public float a(float f2, lmf lmf2) {
        float f3 = 0.0f;
        for (Map.Entry<Integer, Float> entry : this.aVk.entrySet()) {
            f3 = entry.getValue().floatValue();
            if (!(f2 <= (float)entry.getKey().intValue())) continue;
            break;
        }
        if (f3 == 0.0f) {
            lfn.b(5, this.getClass().getSimpleName(), "getDiminishingReturnMultiplier: empty Ranges; using multiplier = 1");
            f3 = 1.0f;
        }
        if (lmf2 != null) {
            switch (lmf2) {
                case rEz: {
                    if (f2 <= 30000.0f) {
                        f3 *= 1.0f;
                        break;
                    }
                    if (f2 <= 50000.0f) {
                        f3 = (float)((double)f3 * 0.1);
                        break;
                    }
                    f3 = (float)((double)f3 * 0.01);
                    break;
                }
                case rEu: {
                    f3 = (float)((double)f3 * 1.05);
                    break;
                }
                case rEv: {
                    f3 = (float)((double)f3 * 1.1);
                    break;
                }
                case rEw: {
                    f3 = (float)((double)f3 * 1.15);
                    break;
                }
                case rEx: {
                    f3 = (float)((double)f3 * 1.2);
                    break;
                }
                case rEy: {
                    f3 = (float)((double)f3 * 1.25);
                }
            }
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "getDiminishingReturnMultiplier: danger level is null");
        }
        return f3;
    }

    public float a(tw tw2, int n, int n2) {
        Float f2 = this.aVj.get((Object)tw2);
        float f3 = f2 != null ? f2.floatValue() : 0.0f;
        Float f4 = null;
        if (cug.wg((int)n)) {
            lgw lgw2 = (lgw)lea.enW().acv(n);
            f4 = lgw2 == null ? null : Float.valueOf(lgw2.erL());
        } else {
            switch (tw2) {
                case aVW: 
                case aVV: {
                    f4 = this.aVg.get(n);
                    break;
                }
                case aVU: {
                    f4 = this.aVh.get(n);
                    break;
                }
                default: {
                    f4 = this.aVf.get(n);
                }
            }
        }
        float f5 = f4 != null ? f4.floatValue() : 0.0f;
        return f3 * f5 * (float)n2;
    }

    public float du(int n) {
        float f2;
        Float f3 = this.aVi.get(n);
        float f4 = f2 = f3 != null ? f3.floatValue() : 1.0f;
        if (f3 == null) {
            // empty if block
        }
        return f2;
    }

    public float vx() {
        Float f2 = this.aVj.get((Object)tw.aVX);
        float f3 = f2 != null ? f2.floatValue() : 0.0f;
        return f3;
    }

    public float vy() {
        Float f2 = this.aVj.get((Object)tw.aWa);
        float f3 = f2 != null ? f2.floatValue() : 0.0f;
        return f3;
    }

    public float vz() {
        Float f2 = this.aVj.get((Object)tw.aWc);
        float f3 = f2 != null ? f2.floatValue() : 0.0f;
        return f3;
    }
}

