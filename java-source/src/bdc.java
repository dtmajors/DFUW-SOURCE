/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class bdc
implements bdf {
    private ayd cCy = null;
    private bde cYu = null;
    private bcy cZt = null;
    private long cZu = 0L;
    private int cZv = 0;
    private int cZw = 0;
    private int cYx = 0;
    private Map<Long, Long> cZx = null;
    private Map<Long, Long> cZy = null;
    private Map<Integer, Integer> cZz = null;
    private List<env> cZA = null;

    long I(long l) {
        return this.cZy.containsKey(l) ? this.cZy.get(l) : -1L;
    }

    public bdc(ayd ayd2, bde bde2, bcy bcy2) {
        this.cCy = ayd2;
        this.cYu = bde2;
        this.cZt = bcy2;
    }

    public void alQ() {
        this.cZx = lcn.emw();
        this.cZy = lcn.emw();
        this.cZz = lcn.emw();
        this.cZA = lcn.emA();
        this.cYu.a(bcz.ha(this.cCy.getGUID()), this.cYx++, this);
    }

    public void cleanUp() {
        this.cZx.clear();
        this.cZy.clear();
        this.cZz.clear();
        this.cZA.clear();
    }

    public void a(bda bda2, long l) {
        bda2.E(this.cZx.get(l));
        bda2.F(l);
    }

    void b(env env2) {
        bcx bcx2 = this.cYu.d(env2);
        if (bcx2 != bcx.cYi) {
            this.cZt.a(env2, null, bcx2);
            return;
        }
        long[] lArray = this.c(env2);
        if (lArray != null) {
            long l = lArray.length > 0 ? lArray[lArray.length - 1] - 1L : -1L;
            bcx bcx3 = l > 0L ? bcx.cYn : bcx.cYo;
            this.cZt.a(env2, lArray, bcx3);
        } else {
            this.cZA.add(env2);
            this.kk(this.cZw);
        }
    }

    private long[] c(env env2) {
        long l;
        bcx bcx2 = this.cYu.d(env2);
        if (bcx2 != bcx.cYi) {
            return null;
        }
        int n = 30;
        long l2 = (env2.bJL() > 0L ? env2.bJL() : this.cZt.alt() - 1L) - (long)env2.bJN();
        long l3 = l = env2.bJM() > 0L ? env2.bJM() : 0L;
        if (l < l2 - 30L + 1L) {
            l = l2 - 30L + 1L;
        }
        if (l < 0L) {
            l = 0L;
        }
        if ((int)(l2 - l + 1L) < n) {
            n = (int)(l2 - l + 1L);
        }
        long l4 = -1L;
        long l5 = -1L;
        for (long i = l2; i >= l; --i) {
            if (!this.cZy.containsKey(i) && !this.cZt.D(i)) continue;
            if (l4 <= 0L) {
                l4 = i;
            }
            l5 = i;
        }
        if (l5 == l) {
            int n2 = 0;
            long[] lArray = new long[n];
            long l6 = l4;
            while (l6 >= l5 && n2 < n) {
                lArray[n2++] = l6--;
            }
            int n3 = lArray.length - 1;
            boolean bl = false;
            while (!bl) {
                bl = true;
                for (int i = 0; i < n3; ++i) {
                    if (lArray[i] >= lArray[i + 1]) continue;
                    long l7 = lArray[i];
                    lArray[i] = lArray[i + 1];
                    lArray[i + 1] = l7;
                    bl = false;
                }
                --n3;
            }
            return lArray;
        }
        return null;
    }

    @Override
    public void a(int n, lmn lmn2) {
        Integer n2 = this.cZz.remove(n);
        if (n2 != null) {
            this.c(lmn2, n2);
        } else {
            this.b(lmn2);
        }
    }

    @Override
    public void ad(int n, int n2) {
        lfn.b(5, this.getClass().getSimpleName(), "handleSQLQueryError() : SQL Query Failed!!!... ErrorCode = " + n2 + ", Context = " + n);
        assert (false);
        if (!this.cZA.isEmpty()) {
            for (env env2 : this.cZA) {
                this.cZt.a(env2, null, bcx.cYh);
            }
            this.cZA.clear();
        }
    }

    private void kk(int n) {
        if (this.cZz.containsValue(n)) {
            return;
        }
        if (n >= this.cZv) {
            return;
        }
        this.cZz.put(this.cYx, n);
        this.cYu.a(bcz.c(this.cCy.getGUID(), n, (int)(this.cZt.alt() - this.cZu)), this.cYx++, this);
    }

    private void b(lmn lmn2) {
        lmo lmo2 = lmn2.euT()[0];
        lmi lmi2 = lmo2.euV()[0];
        this.cZu = dvx.g(lmi2);
        this.cZt.C(this.cZu);
        if (this.cZu <= 0L) {
            return;
        }
        this.cZv = (int)(this.cZu / 5000L) + (this.cZu % 5000L > 0L ? 1 : 0);
        int n = 2;
        if (n > this.cZv) {
            n = this.cZv;
        }
        for (int i = 0; i < n; ++i) {
            this.kk(i);
        }
    }

    private void c(lmn lmn2, int n) {
        Object object;
        Object object2;
        ++this.cZw;
        long l = this.cZu - 1L - (long)(n * 5000);
        lmo[] lmoArray = lmn2.euT();
        for (int i = 0; i < lmoArray.length; ++i) {
            object2 = dvx.g(lmoArray[i].euV()[0]);
            object = l--;
            this.cZx.put((Long)object2, (Long)object);
            this.cZy.put((Long)object, (Long)object2);
        }
        if (!this.cZA.isEmpty()) {
            Iterator<env> iterator = this.cZA.iterator();
            while (iterator.hasNext()) {
                long[] lArray;
                object2 = iterator.next();
                object = this.cYu.d((env)object2);
                if (object != bcx.cYi) {
                    this.cZt.a((env)object2, null, (bcx)((Object)object));
                    iterator.remove();
                }
                if ((lArray = this.c((env)object2)) != null) {
                    long l2 = lArray.length > 0 ? lArray[lArray.length - 1] - 1L : -1L;
                    bcx bcx2 = l2 > 0L ? bcx.cYn : bcx.cYo;
                    this.cZt.a((env)object2, lArray, bcx2);
                    iterator.remove();
                    continue;
                }
                this.kk(this.cZw);
                break;
            }
        }
    }
}

