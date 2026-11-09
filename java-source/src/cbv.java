/*
 * Decompiled with CFR.
 */
public class cbv {
    private bve.a dQn = null;
    private ldv GUID = null;
    private String FileName = null;
    private ljq Position = null;
    private lgl Rotation = null;
    private lcq ekx = null;
    private String dBL = null;
    private boolean WorldbuilderSaveable = false;

    public bve.a aza() {
        return this.dQn;
    }

    public void d(bve.a a2) {
        this.dQn = a2;
    }

    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public String getFileName() {
        return this.FileName;
    }

    public void setFileName(String string) {
        this.FileName = string;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public lcq aIf() {
        return this.ekx;
    }

    public void j(lcq lcq2) {
        this.ekx = lcq2;
    }

    public String aHa() {
        return this.dBL;
    }

    public void gW(String string) {
        this.dBL = string;
    }

    public boolean isWorldbuilderSaveable() {
        return this.WorldbuilderSaveable;
    }

    public void setWorldbuilderSaveable(boolean bl) {
        this.WorldbuilderSaveable = bl;
    }

    public cbv aIg() {
        cbv cbv2 = new cbv();
        cbv2.d(this.dQn);
        cbv2.setFileName(this.FileName);
        if (this.ekx != null) {
            cbv2.j(new lcq(this.ekx));
        }
        if (this.dBL != null) {
            cbv2.gW(this.dBL);
        }
        return cbv2;
    }
}

