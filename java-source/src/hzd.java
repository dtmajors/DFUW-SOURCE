/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class hzd
extends hzk
implements btp,
hsn {
    private String YU = null;
    private String YV = null;
    protected boolean iTA = true;

    public hzd() {
        super("PlayerName", "playername.swf");
        this.a(hya.lmp, true);
        this.OQ(jnz.nGe | jnz.nGy | jnz.nGi);
        this.a(hyb.lmC);
    }

    public void initialize() {
        super.initialize();
        hso.cxK().a(this);
    }

    public void cBa() {
        super.cBa();
        this.cHb();
    }

    public boolean bQR() {
        return this.iTA;
    }

    public void lo(boolean bl) {
        this.iTA = bl;
        this.cHb();
    }

    public lfs<String, String> cHa() {
        buo buo2;
        bup bup2 = (bup)this.MessageDelegator.bzx().bzt().d(lcr.qBW);
        if (bup2 != null && (buo2 = bup2.jU(hso.cxK().bAn().gYY)) != null) {
            return new lfs<String, String>(buo2.FirstName, buo2.LastName);
        }
        return null;
    }

    public String iU() {
        lfs<String, String> lfs2 = this.cHa();
        return lfs2 != null ? (String)lfs2.reX + ' ' + (String)lfs2.reY : null;
    }

    protected void cHb() {
        if (this.iTA) {
            lfs<String, String> lfs2 = this.cHa();
            if (lfs2 != null) {
                this.YU = (String)lfs2.reX;
                this.YV = (String)lfs2.reY;
            }
            this.a("setPlayerName", new Object[]{this.YU + " " + this.YV});
        } else {
            this.a("setPlayerName", new Object[]{""});
        }
    }

    public void cleanUp() {
        super.cleanUp();
        hso.cxK().b(this);
        bup bup2 = (bup)this.MessageDelegator.bzx().bzt().d(lcr.qBW);
        if (bup2 != null) {
            bup2.a(this);
        }
    }

    public final String iP() {
        return this.YU;
    }

    public final String iR() {
        return this.YV;
    }

    @Override
    public void axE() {
        this.cHb();
    }

    @Override
    public void oo() {
        bup bup2 = (bup)this.MessageDelegator.bzx().bzt().d(lcr.qBW);
        assert (bup2 != null);
        bup2.a(hso.cxK().bAn().gYY, this);
    }

    @Override
    public void a(jnz jnz2, jnz jnz3) {
    }

    @Override
    public void a(joa joa2) {
    }

    @Override
    public void b(joa joa2) {
    }

    @Override
    public void cB(int n) {
    }

    @Override
    public void X(boolean bl) {
    }

    @Override
    public boolean op() {
        return true;
    }
}

