/*
 * Decompiled with CFR.
 */
public class bzu
extends cai {
    private cak.a ees = cak.a.efu;
    private String byk = null;
    private String FileName = null;
    private bzs eet = null;

    public bzu() {
        super(cai.a.eeL);
    }

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
        this.FileName = string;
    }

    public final bzs aFD() {
        return this.eet;
    }

    public final void d(bzs bzs2) {
        this.eet = bzs2;
    }

    @Override
    protected final void a(cai cai2) {
        super.a(cai2);
        bzu bzu2 = (bzu)cai2;
        bzu2.a(this.ees);
        bzu2.setAttachPointName(this.byk);
        bzu2.setFileName(this.FileName);
    }
}

