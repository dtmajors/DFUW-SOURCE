/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jju
 */
import java.util.Collections;
import java.util.Map;

public class jku
extends jkr {
    private int mbc;
    private int mbd;
    private Map<Integer, jld> lUj = lcn.emw();

    public jku(jju jju2, jks jks2, int n, int n2) {
        super(jju2, jks2);
        this.mbc = n;
        this.mbd = n2;
    }

    public int getWidth() {
        return this.mbc;
    }

    public int getHeight() {
        return this.mbd;
    }

    public float getAlpha() {
        return this.dLu().cDd();
    }

    public Map<Integer, jld> dLv() {
        return Collections.unmodifiableMap(this.lUj);
    }

    public void a(jld jld2) {
        if (jld2.dLC() != null) {
            throw new RuntimeException("invalid child");
        }
        jld2.a(this);
        this.lUj.put(jld2.getId(), jld2);
        jld2.create();
    }

    public void b(jld jld2) {
        if (jld2.dLC() != this) {
            throw new RuntimeException("invalid child");
        }
        this.lUj.remove(jld2.getId());
        this.a("destroyVectorObject", jld2.getId());
        jld2.cleanUp();
    }

    @Override
    public void Vf(int n) {
        this.a("createVectorOverlay", this.getId(), n, this.djL(), this.getWidth(), this.getHeight(), Float.valueOf(this.getAlpha()), ipd.mqA.getValue(), this.dLu().name());
    }
}

