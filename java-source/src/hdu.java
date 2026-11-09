/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public abstract class hdu {
    protected static final hbe jzX = hbe.jAM;
    protected final hel kaV;
    public final ldv dbx;
    public final hdv kaW;
    private final ldl kaX = new ldl();
    private final ldl kaY = new ldl();
    private boolean jLT;
    private bsf kaZ;
    protected float aXV;
    protected boolean kba;
    public int kbb;

    public hdu(hel hel2, ldv ldv2, hdv hdv2) {
        assert (hdv2 != null);
        assert (ldv2 != null);
        this.kaV = hel2;
        this.dbx = ldv2;
        this.kaW = hdv2;
        this.jLT = true;
        this.nb(true);
    }

    public final void dispose() {
        assert (this.jLT);
        this.cbg();
        assert (!this.jLT);
    }

    public final boolean isConstructed() {
        return this.jLT;
    }

    public final boolean a(bsf bsf2) {
        assert (this.jLT);
        boolean bl = this.b(bsf2);
        if (bl) {
            this.cdX();
        }
        return bl;
    }

    protected final void cdX() {
        assert (this.jLT);
        this.kaY.enp();
    }

    public final lip cdY() {
        assert (this.jLT);
        return this.cee();
    }

    public final boolean isEnabled() {
        assert (this.jLT);
        return this.kba;
    }

    public final float Bb() {
        assert (this.jLT);
        return this.aXV;
    }

    public final heh[] cdZ() {
        assert (this.jLT);
        ArrayList<heh> arrayList = new ArrayList<heh>();
        this.aU(arrayList);
        return arrayList.toArray(new heh[arrayList.size()]);
    }

    public final bsf cea() {
        assert (this.jLT);
        return this.kaZ;
    }

    public final lbl<lbn> ceb() {
        return this.kaX;
    }

    public final lbl<lbn> cec() {
        return this.kaY;
    }

    public final boolean b(hdu hdu2) {
        if (!this.kaW.c(hdu2.kaW)) {
            return false;
        }
        return lin.i(this.dbx, hdu2.dbx);
    }

    public abstract List<ej> getAttributes();

    public abstract lip ced();

    public boolean equals(Object object) {
        if (object instanceof hdu) {
            return this.b((hdu)object);
        }
        assert (false);
        return false;
    }

    public int hashCode() {
        return this.dbx.hashCode();
    }

    public String toString() {
        return null;
    }

    protected void cbg() {
        assert (this.jLT);
        this.kaX.enp();
        this.nb(false);
        this.jLT = false;
    }

    protected abstract lip cee();

    protected boolean b(bsf bsf2) {
        float f2;
        boolean bl;
        assert (bsf2.getGUID().equals(this.dbx));
        assert (bsf2.awE().getType() == this.kaW.Type);
        boolean bl2 = false;
        if (!lin.i(bsf2, this.kaZ)) {
            this.kaZ = bsf2;
            bl2 = true;
        }
        if ((bl = bsf2.awD()) != this.kba) {
            this.kba = bl;
            bl2 = true;
        }
        if (!ldq.ai(this.aXV, f2 = bsf2.Bb())) {
            this.aXV = f2;
            bl2 = true;
        }
        return bl2;
    }

    protected abstract void aU(List<heh> var1);

    private void nb(boolean bl) {
        if (this.kaV != null) {
            this.kaV.a(bl, this);
        }
    }
}

