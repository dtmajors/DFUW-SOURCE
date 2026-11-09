/*
 * Decompiled with CFR.
 */
public abstract class hrz {
    public static final hbe jzX = hbe.jAM;
    public final hsi jDE;
    public final String laV;
    private final int laW;
    private final int laX;
    private final int laY;
    private ldv dbx;
    private int laZ;
    private boolean lba;
    private boolean lbb;
    private boolean lbc;

    public hrz(hsi hsi2, String string, int n, int n2, int n3) {
        this.jDE = hsi2;
        this.laV = string;
        this.laW = n;
        this.laY = n2;
        this.laX = n3;
        this.dbx = this.jDE.jWH.caL();
        assert (this.dbx != null);
        this.jDE.a(true, this);
        this.Ok(this.laW);
    }

    public final void cleanup() {
        assert (this.dbx != null);
        assert (!this.lbb);
        assert ((this.laZ & this.laY) == 0);
        if ((this.laZ & this.laW) != 0) {
            this.laZ = 0;
            this.u(false, false);
            this.die();
            return;
        }
        if (this.laZ != 0) {
            this.laZ = 0;
            this.u(false, true);
        }
        this.Ok(this.laY);
    }

    public final void a(ktl ktl2, knt knt2) {
        assert (this.dbx != null);
        assert ((ktl2.egT() & 0xFFF00) == 256);
        assert (ktl2.dXh().equals(this.dbx));
        assert (knt2 == null || knt2.dXh() == this.dbx);
        assert (knt2 == null || ktl2.dXg().equals(knt2.getGUID()));
        if (knt2 instanceof knr) {
            assert (this.lbb);
            this.die();
            return;
        }
        this.b(ktl2, knt2);
    }

    public void cxc() {
        assert (this.dbx != null);
        assert (!this.lbb);
        assert (this.laZ != 0);
        if ((this.laZ & this.laY) != 0) {
            assert (this.laZ == this.laY);
            this.cxe();
            this.lbb = true;
        } else {
            this.cxd();
            if ((this.laZ & this.laW) != 0) {
                this.lba = true;
            }
        }
        this.laZ = 0;
    }

    protected boolean isVisible() {
        return true;
    }

    protected abstract void cxd();

    protected void b(ktl ktl2, knt knt2) {
        assert (this.dbx != null);
    }

    public String toString() {
        return super.toString();
    }

    protected final void u(boolean bl, boolean bl2) {
        assert (this.dbx != null);
        assert (!this.lbb);
        this.jDE.a(bl, this, bl2);
    }

    protected final knt Oj(int n) {
        assert (this.dbx != null);
        assert (!this.lbb);
        return this.jDE.I(n, this.dbx);
    }

    protected final void b(knt knt2) {
        assert (this.dbx != null);
        assert (!this.lbb);
        this.jDE.a(this.laV, knt2);
    }

    protected final void cxe() {
        assert (this.dbx != null);
        assert (!this.lbb);
        this.jDE.g(this.laV, this.dbx);
    }

    protected final ldv getGUID() {
        assert (this.dbx != null);
        return this.dbx;
    }

    protected final int cxf() {
        assert (this.dbx != null);
        assert (!this.lbb);
        return this.laZ;
    }

    protected final void cxg() {
        assert (this.dbx != null);
        assert (this.lba);
        this.lba = false;
    }

    protected final void cxh() {
        assert (this.dbx != null);
        assert (this.lba);
        if ((this.laZ & this.laY) != 0) {
            return;
        }
        if (this.lbb) {
            return;
        }
        this.Ok(this.laW);
    }

    protected final void Ok(int n) {
        assert (this.dbx != null);
        assert (n != 0);
        if ((this.laZ & this.laY) != 0) {
            return;
        }
        if (this.lbb) {
            return;
        }
        if ((this.laZ & n) == n) {
            return;
        }
        boolean bl = this.laZ == 0;
        this.laZ |= n;
        if (bl || this.lbc) {
            if (this.isVisible() || (this.laZ & (this.laX | this.laW | this.laY)) != 0) {
                this.u(true, false);
                this.lbc = false;
            } else {
                this.lbc = true;
            }
        }
    }

    private final void die() {
        assert (this.dbx != null);
        this.jDE.a(false, this);
        this.jDE.jWH.qR(this.dbx);
        this.dbx = null;
    }
}

