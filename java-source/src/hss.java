/*
 * Decompiled with CFR.
 */
public class hss
implements hst {
    private String ldc;
    private final hsp ldd = new hsp();
    private hsw lde = null;

    public hss(String string) {
        this.ldc = string;
    }

    public void initialize() {
        this.lde = hso.cxK().cxQ().a(this);
    }

    public void cleanUp() {
        if (hso.cxK() != null) {
            hso.cxK().cxQ().b(this);
        }
    }

    @Override
    public String cyg() {
        return this.ldc;
    }

    @Override
    public hsp cyh() {
        return this.ldd;
    }

    @Override
    public void ng(String string) {
    }

    @Override
    public void oI(boolean bl) {
    }

    @Override
    public void cyi() {
    }

    @Override
    public void cyj() {
    }

    public void a(String string, hsu hsu2, Integer n) {
        this.ldd.a(new hsq(hsu2, string, n));
    }

    public void a(String string, hsu hsu2, String string2) {
        this.ldd.a(new hsq(hsu2, string, string2));
    }

    public void a(String string, hsu hsu2, Float f2) {
        this.ldd.a(new hsq(hsu2, string, f2));
    }

    public void a(String string, hsu hsu2, Boolean bl) {
        this.ldd.a(new hsq(hsu2, string, bl));
    }

    public final Integer nh(String string) {
        return this.lde != null ? this.lde.getInteger(string) : null;
    }

    public final Float ni(String string) {
        return this.lde != null ? this.lde.getFloat(string) : null;
    }

    public final String nj(String string) {
        return this.lde != null ? this.lde.getString(string) : null;
    }

    public final Boolean nk(String string) {
        return this.lde != null ? this.lde.getBoolean(string) : null;
    }

    public final boolean b(String string, mhs mhs2) {
        return this.ldd.a(string, mhs2);
    }

    public final void w(String string, int n) {
        this.lde.a(string, n, this.lde.nm(string));
    }

    public final void d(String string, float f2) {
        this.lde.a(string, f2, this.lde.nm(string));
    }

    public final void q(String string, boolean bl) {
        this.lde.a(string, bl, this.lde.nm(string));
    }

    public final void B(String string, String string2) {
        this.lde.a(string, string2, this.lde.nm(string));
    }

    public final void nl(String string) {
        this.lde.nn(string);
    }
}

