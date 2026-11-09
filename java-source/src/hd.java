/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  lcr
 */
public class hd
extends btk
implements bto {
    public final cex aaY;
    private a aaZ;
    private lz aba;
    private ldv abb;

    public hd(cex cex2) {
        this.aaY = cex2;
        this.aaZ = a.abd;
    }

    @Override
    public void doTick(ldz ldz2) {
        boolean bl;
        if (this.aaZ == a.abd) {
            return;
        }
        boolean bl2 = bl = this.aaY.isInitialized() && this.aaY.aIs() && this.aaY.aAG() != null && !this.aaY.mA().iM();
        if (this.aaZ == a.abf) {
            boolean bl3 = false;
            if (this.aaY.aJM() != null) {
                bl3 = ((ceh)this.aaY.aJM()).aEv();
            }
            bl &= !bl3;
        }
        if (!bl) {
            if (this.aaZ == a.abh) {
                if (this.abb == null) {
                    lfn.b(5, "SFPlayerAttachHandler", "doTick(): AttachedPlayerGUID is null");
                    assert (false);
                    return;
                }
                frx frx2 = (frx)this.MessageDelegator.h(26635, this.getGUID(), this.abb);
                frx2.iVa = false;
                frx2.iVb = true;
                this.MessageDelegator.E(frx2);
                this.aaZ = a.abd;
                this.Active = false;
                return;
            }
            if (this.aaZ == a.abf) {
                this.lq();
            }
        } else if (this.aaZ == a.abh && this.aaY.aAG() != null) {
            fry fry2 = (fry)this.MessageDelegator.h(26636, this.getGUID(), this.abb);
            fry2.Position = this.aaY.aAG().av();
            fry2.Rotation = this.aaY.aAG().aw();
            this.MessageDelegator.E(fry2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11034: {
                this.c((gre)dxq2);
                break;
            }
            case 26635: {
                this.b((frx)dxq2);
                break;
            }
            case 26634: {
                this.b((frw)dxq2);
                break;
            }
            case 26636: {
                this.b((fry)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private final void c(gre gre2) {
        switch (gre2.jqc) {
            default: 
        }
        super.handleSystemMessageSendingErrorMessage(gre2);
    }

    private final void b(frw frw2) {
        frx frx2 = (frx)this.MessageDelegator.h(26635, this.getGUID(), frw2.aO());
        frx2.aqs = frw2.aqs;
        frx2.iVa = frw2.iVa;
        if (frw2.iVa) {
            if (this.aaZ == a.abd) {
                this.Active = true;
                frx2.iVb = true;
                this.aaZ = a.abh;
                this.abb = frw2.aO();
            } else {
                frx2.iVb = false;
            }
        } else if (this.aaZ == a.abh && this.abb != null && frw2.aO().equals(this.abb)) {
            this.Active = false;
            frx2.iVb = true;
            this.aaZ = a.abd;
            this.abb = null;
        } else {
            frx2.iVb = false;
        }
        this.MessageDelegator.E(frx2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void b(frx frx2) {
        if (frx2.iVa) {
            if (this.aaZ != a.abe) {
                lfn.b(5, "SFPlayerAttachHandler", "handleMonitorPositionAttachResponse(): Got Attach response but my state is " + (Object)((Object)this.aaZ));
                assert (false);
                return;
            }
            if (this.aba == null) {
                lfn.b(5, "SFPlayerAttachHandler", "handleMonitorPositionAttachResponse(): Got attach response but have no PlayerAttachedTo");
                assert (false);
                return;
            }
            if (frx2.iVb) {
                this.a(lzr.tXV.bD(this.aba.bc));
                this.aaZ = a.abf;
                return;
            }
            this.a(lzr.tXW.bD(this.aba.bc));
            this.aaZ = a.abd;
            this.aba = null;
            return;
        }
        if (this.aba == null) {
            lfn.b(5, "SFPlayerAttachHandler", "handleMonitorPositionAttachResponse(): Got detach response but have no PlayerAttachedTo");
            assert (false);
            return;
        }
        if (this.aaZ == a.abf) {
            if (frx2.iVb) {
                this.a(lzr.tXZ.bD(this.aba.bc));
                this.aaZ = a.abd;
                this.aba = null;
                return;
            }
            lfn.b(5, "SFPlayerAttachHandler", "handleMonitorPositionAttachResponse(): Got unsuccessfull detach but my state is " + (Object)((Object)this.aaZ));
            assert (false);
            return;
        }
        if (this.aaZ != a.abg) {
            lfn.b(5, "SFPlayerAttachHandler", "handleMonitorPositionAttachResponse(): Got Detach response but my state is " + (Object)((Object)this.aaZ));
            assert (false);
            return;
        }
        if (frx2.iVb) {
            this.a(lzr.tXX.bD(this.aba.bc));
            this.aaZ = a.abd;
            this.aba = null;
            return;
        }
        this.a(lzr.tXY.bD(this.aba.bc));
        assert (false);
        return;
    }

    private final void b(fry fry2) {
        ljq ljq2 = new ljq(0.0, 3.0, 4.0);
        ljq2 = fry2.Rotation.eq(ljq2);
        ljq ljq3 = fry2.Position;
        ljq3.es(ljq2);
        if (this.aaY.aAG() != null) {
            this.aaY.aAG().g(ljq3, fry2.Rotation);
        }
        fry2.Position = ljq3;
        fry2.on(lcr.p((ldv)this.aaY.getGUID(), (int)this.aaY.mA().jr(), (int)this.aaY.mA().getGUID().enw()));
        this.MessageDelegator.E(fry2);
    }

    public final void g(lz lz2) {
        switch (this.aaZ) {
            case abd: {
                break;
            }
            case abe: {
                this.a(lzr.tYa.bD(new Object[0]));
                return;
            }
            case abf: {
                this.a(lzr.tYb.bD(new Object[0]));
                return;
            }
            case abg: {
                this.a(lzr.tYc.bD(new Object[0]));
                return;
            }
            case abh: {
                this.a(lzr.tYd.bD(new Object[0]));
                return;
            }
            default: {
                assert (false);
                return;
            }
        }
        if (this.aaY.aJM() != null && ((ceh)this.aaY.aJM()).aEv()) {
            this.a(lzr.tYb.bD(new Object[0]));
            return;
        }
        this.aaZ = a.abe;
        this.aba = lz2;
        frw frw2 = (frw)this.MessageDelegator.h(26634, this.getGUID(), this.aba.Ri);
        frw2.iVa = true;
        this.MessageDelegator.E(frw2);
    }

    public final void lq() {
        switch (this.aaZ) {
            case abd: 
            case abh: {
                this.a(lzr.tYe.bD(new Object[0]));
                return;
            }
            case abe: {
                this.a(lzr.tYf.bD(new Object[0]));
                return;
            }
            case abf: {
                break;
            }
            case abg: {
                this.a(lzr.tYg.bD(new Object[0]));
                return;
            }
            default: {
                assert (false);
                return;
            }
        }
        this.aaZ = a.abg;
        frw frw2 = (frw)this.MessageDelegator.h(26634, this.getGUID(), this.aba.Ri);
        frw2.iVa = false;
        this.MessageDelegator.E(frw2);
    }

    private void a(loz loz2) {
        ldv ldv2 = lcr.ak((ldv)lcr.acL, (int)this.aaY.mA().jr());
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.aaY.getGUID(), ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }
}

