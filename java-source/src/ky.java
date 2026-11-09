/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class ky
extends btk
implements bto {
    public static final boolean ass = true;
    public static final boolean ast = true;
    private static final float asu = 11.5f;
    private static final float asv = 132.25f;
    private static final double asw = 2.0;
    protected Set<lg> asx = null;
    private static Map<lf, List<ld>> asy = null;
    protected lb asz = new lb();
    private ljq asA = null;
    private double asB = 0.0;
    private Set<Integer> asC = null;

    public void a(lg lg2) {
        if (lg2 != null && !this.asx.contains(lg2)) {
            this.asx.add(lg2);
        }
    }

    public void b(lg lg2) {
        if (lg2 != null) {
            this.asx.remove(lg2);
        }
    }

    public static void a(ld ld2) {
        if (ld2 == null) {
            return;
        }
        if (asy == null) {
            asy = lcn.emw();
        }
        if (ld2.oK() == null) {
            return;
        }
        List<ld> list = asy.get((Object)ld2.oK());
        if (list == null) {
            list = lcn.emA();
            asy.put(ld2.oK(), list);
        }
        list.add(ld2);
    }

    public boolean U(ljq ljq2) {
        return this.asz.U(ljq2);
    }

    public List<lgs> oA() {
        return this.asz.oA();
    }

    protected ky() {
        this.asx = lcn.emx();
        this.asC = lcn.emx();
    }

    @Override
    public final void doTick(ldz ldz2) {
        if (ldz2.rgz - this.asB < 2.0) {
            return;
        }
        ljq ljq2 = this.oB();
        if (ljq2 == null) {
            this.asB = ldz2.rgz + 2.0;
        } else {
            if (ljq2.y <= -1000.0f) {
                return;
            }
            if (this.asA != null && ljq2.eA(this.asA) < 132.25f) {
                this.asB = ldz2.rgz - 1.0;
            } else {
                this.asB = ldz2.rgz;
                this.asA = ljq2;
                this.V(this.asA);
            }
        }
    }

    protected abstract ljq oB();

    protected abstract void V(ljq var1);

    protected void oC() {
        if (asy == null) {
            return;
        }
        block4: for (lf lf2 : lf.values()) {
            List<ld> list = asy.get((Object)lf2);
            if (list == null || list.isEmpty()) continue;
            switch (lf2) {
                case asQ: {
                    for (ld ld2 : list) {
                        if (!this.asz.b(ld2)) continue;
                        this.asz.c(ld2);
                        this.asC.add(ld2.getID());
                    }
                    continue block4;
                }
                case asR: {
                    for (ld ld2 : list) {
                        if (!this.asz.a(ld2, 150.0f)) continue;
                        this.asz.c(ld2);
                        this.asC.add(ld2.getID());
                    }
                    continue block4;
                }
            }
        }
    }

    protected void a(ljq ljq2, float f, List<lgs> list) {
        Object object;
        Object object2;
        if (asy == null) {
            return;
        }
        List<ld> list2 = asy.get((Object)lf.asR);
        if (list2 != null && !list2.isEmpty()) {
            object2 = list2.iterator();
            while (object2.hasNext()) {
                object = (ld)object2.next();
                if (this.asC.contains(((ld)object).getID()) || !((ld)object).U(ljq2)) continue;
                this.asz.a((ld)object, list);
                this.asC.add(((ld)object).getID());
            }
        }
        if ((object2 = asy.get((Object)lf.asQ)) != null && !object2.isEmpty()) {
            object = object2.iterator();
            while (object.hasNext()) {
                ld ld2 = (ld)object.next();
                if (this.asC.contains(ld2.getID()) || !ld2.c(ljq2, f)) continue;
                this.asz.a(ld2, list);
                this.asC.add(ld2.getID());
            }
        }
    }
}

