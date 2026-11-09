/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Map;

public class cvg
extends btk
implements bto {
    public static final int fzo = 1;
    public static final int fzp = 2;
    public static final int fzq = 4;
    private static final int fzr = 50;
    private static final int fzs = 60;
    private static final int fzt = 250;
    private static final double fzu = 14400.0;
    private static final double fzv = 6000.0;
    private static final int fzw = 50;
    private static final double fzx = 14400.0;
    private Map<ldv, bsz> fek = null;
    private Map<ldv, a> fzy = lcn.emw();
    private Map<lfs<ldv, Integer>, a> fzz = lcn.emw();

    public cvg() {
        this.fek = lea.epH();
    }

    @Override
    public void doTick(ldz ldz2) {
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 6157: {
                this.a((gfs)dxq2);
                break;
            }
            case 6166: {
                this.a((gfq)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gfq gfq2) {
        gfr gfr2 = (gfr)this.MessageDelegator.h(6167, this.getGUID(), gfq2.aO());
        this.MessageDelegator.b(gfq2, gfr2);
        gfr2.jgo = true;
        if (gfq2.gb == null || gfq2.ResourceType == 0) {
            this.MessageDelegator.F(gfr2);
            return;
        }
        ldv ldv2 = new ldv(0, gfq2.gb.enw(), gfq2.gb.enx());
        gfr2.jgo = this.j(ldv2, gfq2.ResourceType, gfq2.jgn);
        this.MessageDelegator.F(gfr2);
    }

    private void a(gfs gfs2) {
        gft gft2 = (gft)this.MessageDelegator.h(6158, this.getGUID(), gfs2.aO());
        this.MessageDelegator.b(gfs2, gft2);
        gft2.jgo = true;
        if (gfs2.gb == null || gfs2.ResourceType == 0) {
            this.MessageDelegator.F(gft2);
            return;
        }
        ldv ldv2 = new ldv(0, gfs2.gb.enw(), gfs2.gb.enx());
        gft2.jgp = this.a(gfs2, ldv2);
        int n = lea.ei(gfs2.Position);
        gft2.jgo = this.b(ldv2, gfs2.ResourceType, n, gfs2.Position);
        this.MessageDelegator.F(gft2);
    }

    private int a(gfs gfs2, ldv ldv2) {
        float f2;
        int n = -1;
        bsz bsz2 = this.fek.get(ldv2);
        if (bsz2 == null) {
            lfn.b(5, "SFGlobalResourceHarvestingManager", "validateRequest() ResourceGUID : " + ldv2 + " for ResourceType : " + gfs2.ResourceType + " does not exist.");
            return 1;
        }
        if (bsz2.dKu != gfs2.ResourceType) {
            n = 2;
            lfn.b(5, "SFGlobalResourceHarvestingManager", "validateRequest() ResourceGUID : " + ldv2 + " has as a ResourceType : " + gfs2.ResourceType + " but requested resource type is : " + bsz2.dKu);
        }
        if ((f2 = ljq.s(bsz2.Position, gfs2.Position)) > 14.0f) {
            n |= 4;
            lfn.b(5, "SFGlobalResourceHarvestingManager", "validateRequest() ResourceGUID : " + ldv2 + " ResourceType : " + gfs2.ResourceType + " Object Position : " + bsz2.Position);
            lfn.b(5, "SFGlobalResourceHarvestingManager", "validateRequest() Player's Position : " + gfs2.Position + " and distance : " + f2);
        }
        return n;
    }

    private boolean b(ldv ldv2, int n, int n2, ljq ljq2) {
        a a2;
        int n3;
        cuj cuj2 = cxj.bu(n, n2);
        lmf lmf2 = lea.eg(ljq2);
        int n4 = cuj2 == null ? 50 : cuj2.a(lmf2);
        int n5 = n3 = cuj2 == null ? 210 : cuj2.b(lmf2);
        if (n == cug.fkr) {
            n4 = 50;
            n3 = 288;
        }
        if ((a2 = this.fzy.get(ldv2)) == null) {
            a2 = new a(this);
            a2.ResourceType = n;
            a2.fzA = n4;
            this.fzy.put(ldv2, a2);
        }
        double d2 = this.MessageDelegator.arc().rgz - a2.fzB;
        a2.fzA += (int)(d2 / (double)n3);
        if (a2.fzA > n4) {
            a2.fzA = n4;
        }
        if (a2.fzA <= 0) {
            a2.fzA = 0;
            return false;
        }
        --a2.fzA;
        a2.fzB = this.MessageDelegator.arc().rgz;
        return true;
    }

    private boolean j(ldv ldv2, int n, int n2) {
        a a2 = this.fzz.get(new lfs<ldv, Integer>(ldv2, n2));
        if (a2 == null) {
            a2 = new a(this);
            a2.ResourceType = n;
            a2.fzA = 250;
            this.fzz.put(new lfs<ldv, Integer>(ldv2, n2), a2);
        }
        if (a2.fzA <= 0) {
            if (a2.fzB + 14400.0 < this.MessageDelegator.arc().rgz) {
                a2.fzB = this.MessageDelegator.arc().rgz;
                a2.fzA = 250;
                return true;
            }
            return false;
        }
        --a2.fzA;
        double d2 = this.MessageDelegator.arc().rgz - (a2.fzB + 6000.0);
        if (d2 > 0.0) {
            a2.fzA += (int)(d2 / 6000.0);
            if (a2.fzA > 250 || a2.fzA < 0) {
                a2.fzA = 250;
            }
        }
        a2.fzB = this.MessageDelegator.arc().rgz;
        return true;
    }
}

