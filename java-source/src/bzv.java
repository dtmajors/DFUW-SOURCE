/*
 * Decompiled with CFR.
 */
public class bzv
extends caj {
    private cak.a ees = cak.a.efs;
    private String byk = null;
    private String FileName = null;
    private boolean eeu = false;

    public final cak.a aFC() {
        return this.ees;
    }

    public final void a(cak.a a2) {
        assert (a2 != null);
        this.ees = a2;
    }

    public final String getAttachPointName() {
        return this.byk;
    }

    public final void setAttachPointName(String string) {
        this.byk = string;
    }

    public final String getFileName() {
        return this.FileName;
    }

    public final void setFileName(String string) {
        assert (string != null);
        assert (!string.trim().equalsIgnoreCase("NULL"));
        this.FileName = string;
    }

    public final boolean aFE() {
        return this.eeu;
    }

    public final void fp(boolean bl) {
        this.eeu = bl;
    }

    public final bzv aFF() {
        bzv bzv2 = new bzv();
        bzv2.eA(this.aFZ());
        bzv2.a(this.ees);
        bzv2.setAttachPointName(this.byk);
        bzv2.setFileName(this.FileName);
        bzv2.fp(this.eeu);
        cah[] cahArray = new cah[this.aGa().length];
        int n = cahArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            cahArray[i2] = this.aGa()[i2].aFX();
        }
        bzv2.a(cahArray);
        return bzv2;
    }

    @Override
    public final boolean equals(Object object) {
        assert (this.ees != null);
        assert (this.byk != null);
        assert (this.FileName != null);
        if (object instanceof bzv) {
            bzv bzv2 = (bzv)object;
            if (!super.equals(bzv2)) {
                return false;
            }
            if (this.ees != bzv2.aFC()) {
                return false;
            }
            if (!this.byk.equalsIgnoreCase(bzv2.getAttachPointName())) {
                return false;
            }
            return this.FileName.equalsIgnoreCase(bzv2.getFileName());
        }
        assert (false);
        return false;
    }

    @Override
    public final void reset() {
        super.reset();
        this.ees = cak.a.efs;
        this.byk = null;
        this.FileName = null;
        this.eeu = false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" PriorityLevel=");
        stringBuilder.append((Object)this.ees);
        stringBuilder.append(" AttachPointName='");
        stringBuilder.append(this.byk);
        stringBuilder.append("' FileName='");
        stringBuilder.append(this.FileName);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

