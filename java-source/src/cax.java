/*
 * Decompiled with CFR.
 */
public class cax
extends cai {
    private cak.g ein = cak.g.ehi;
    private String FileName = null;
    private bzs eet = null;

    public cax() {
        super(cai.a.eeN);
    }

    public final cak.g aHc() {
        return this.ein;
    }

    public final void a(cak.g g2) {
        assert (g2 != null);
        this.ein = g2;
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

    public final boolean aHd() {
        assert (this.FileName != null);
        return !this.FileName.trim().equalsIgnoreCase("NULL");
    }

    @Override
    protected final void a(cai cai2) {
        super.a(cai2);
        cax cax2 = (cax)cai2;
        cax2.a(this.ein);
        cax2.setFileName(this.FileName);
    }
}

