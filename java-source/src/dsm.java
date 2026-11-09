/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcr
 *  lcw
 */
public class dsm
extends dqk {
    private int aYG;
    private ljq aZH;
    private float doT = -2.0f;
    private ldv gYb;
    private ldv aUa;
    private final boolean gYc;
    private int gYd = 0;

    public dsm() {
        this.ObjectType = 46;
        this.gYc = lcw.qHe;
    }

    public void initialize() {
        if (this.Initialized) {
            lfn.b(5, ((Object)((Object)this)).getClass().getName(), "initialize() : Already Initialized." + this.toString());
            assert (false);
            return;
        }
        this.byq();
        if (lcw.qHe) {
            this.ObjectDescriptionFilename = "gizmos\\gizmo_ambienteffect_01.xml";
            this.Rotation = new lgl();
            super.initialize();
            this.ObjectDescriptionFilename = del.zU(this.aYG);
            if (lcw.qHe) {
                // empty if block
            }
        }
        if (!this.gYc) {
            this.MessageDelegator.hd(this.GUID);
        }
        this.Initialized = true;
    }

    private void byq() {
        if (this.aYG <= 0) {
            return;
        }
        assert (this.aYG > 0);
        ldv ldv2 = null;
        ldv2 = lcr.qEa != null ? lcr.qEa : lcr.qEb;
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, ldv2);
        glh2.setDuration(this.doT);
        glh2.setTargetPosition(this.Position);
        glh2.setTargetObjectGUID(this.gYb);
        int n = 8;
        if (this.aZH != null) {
            glh2.setSourcePosition(this.aZH);
            n |= 2;
        }
        glh2.JQ(n);
        glh2.setSpecialEffectType(this.aYG);
        glh2.mk(this.gYc);
        this.MessageDelegator.F(glh2);
    }

    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 13059) {
            this.aUa = ((glb)dxq2).aUa;
            if (this.gYd > 0 && this.gYc) {
                this.aUr();
                --this.gYd;
            }
        } else {
            super.receiveMessage(dxq2);
        }
    }

    protected void a(ftv ftv2) {
        if (ftv2.bRZ() == 32 || ftv2.bRZ() == 33) {
            lfn.b(5, ((Object)((Object)this)).getClass().getName(), "handleObjectMoveMessage() : Axis alignment not supported.");
            return;
        }
        if (ftv2.av().isZero() && ftv2.aw().eqT().isZero()) {
            lfn.b(0, ((Object)((Object)this)).getClass().getName(), "handleObjectMoveMessage() : POS && ROT IS ZERO FOR OBJECT [" + this.ObjectDescriptionFilename + "] \n\n");
            return;
        }
        if (this.dwG) {
            kky kky2 = (kky)this.MessageDelegator.h(1025);
            kky2.ts(this.GUID);
            kky2.hC(this.dJs);
            kky2.pHF = ftv2.bRZ();
            kky2.pHG = ftv2.av().x;
            kky2.pHH = ftv2.av().y;
            kky2.pHI = ftv2.av().rlV;
            kky2.rb = ftv2.aw().x;
            kky2.rc = ftv2.aw().y;
            kky2.rd = ftv2.aw().rlV;
            kky2.pHJ = ftv2.aw().rlW;
            lfn.b(0, ((Object)((Object)this)).getClass().getName(), "handleObjectMoveMessage() : (Server) Obj[" + this.ObjectDescriptionFilename + "].  Sending Req. TickNr[" + this.nx.lpr + "], Type=" + ftv2.bRZ() + ", GUID=" + this.GUID + ", Got from Message: Position=" + ftv2.av() + " and Rotation=" + ftv2.aw());
            this.MessageDelegator.a(kky2);
            this.aUr();
            return;
        }
    }

    protected void a(kuv kuv2) {
        this.aUr();
        super.a(kuv2);
        this.byq();
    }

    protected void a(kwp kwp2) {
        this.aUr();
        super.a(kwp2);
        this.byq();
    }

    public void cleanUp() {
        assert (!this.CleanedUp) : "Already cleaned up!";
        lfn.b(0, ((Object)((Object)this)).getClass().getSimpleName(), "cleanUp() : Removing GUID = " + this.GUID);
        this.aUr();
        if (lcw.qHe) {
            klb klb2 = (klb)this.MessageDelegator.h(1026);
            klb2.ts(this.GUID);
            klb2.HX(klb.iHB);
            klb2.hC(this.GUID);
            this.MessageDelegator.a(klb2);
        }
        this.CleanedUp = true;
    }

    private void aUr() {
        if (this.gYc) {
            if (this.aUa != null) {
                glj glj2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEa);
                glj2.jkV = 1;
                glj2.aUa = this.aUa;
                this.MessageDelegator.F(glj2);
                this.aUa = null;
            } else {
                ++this.gYd;
                lfn.b(5, ((Object)((Object)this)).getClass().getName(), "removeSpecialEffect() : special effect not successfully removed because special effect guid was not available");
            }
        }
    }

    public void b(dqn dqn2) {
        super.b(dqn2);
        dsm dsm2 = (dsm)((Object)dqn2);
        dsm2.fJ(this.aYG);
        dsm2.setDuration(this.doT);
        dsm2.setSourcePosition(this.aZH);
        dsm2.nO(this.gYb);
    }

    public String toString() {
        return "SFSpecialEffectStarterLogic. GUID  " + this.GUID + ", EffectType = " + this.aYG;
    }

    public final double Bw() {
        return this.doT;
    }

    public final void setDuration(float f2) {
        this.doT = f2;
    }

    public final int CD() {
        return this.aYG;
    }

    public final void fJ(int n) {
        this.aYG = n;
    }

    public final ljq getSourcePosition() {
        return this.aZH;
    }

    public final void setSourcePosition(ljq ljq2) {
        this.aZH = ljq2;
    }

    public ldv byr() {
        return this.gYb;
    }

    public void nO(ldv ldv2) {
        this.gYb = ldv2;
    }
}

