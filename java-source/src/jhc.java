/*
 * Decompiled with CFR.
 */
import java.util.EnumSet;

public class jhc
extends iyt {
    private jha ndF = null;

    public b dFx() {
        return this.mCp == null ? b.ndM : (b)((Object)((a)this.mCp).dtC());
    }

    public boolean dFy() {
        return this.mCp == null ? false : this.mCp.dtD();
    }

    public String cVT() {
        return this.mCo;
    }

    public jhc(jha jha2) {
        super(EnumSet.of(iyt.h.mCs, iyt.h.mCu, iyt.h.mCv, iyt.h.mCw));
        this.ndF = jha2;
    }

    @Override
    protected void rE(String string) {
        super.rE(string);
        this.ndF.dFq();
    }

    @Override
    protected iyu dtm() {
        return new a(this, this);
    }

    @Override
    protected void dtv() {
        super.dtv();
        this.ndF.dFp();
    }

    static /* synthetic */ jha a(jhc jhc2) {
        return jhc2.ndF;
    }
}

