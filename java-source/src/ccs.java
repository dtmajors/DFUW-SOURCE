/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  axx
 *  cug
 */
public class ccs
extends cco {
    private cbq elf = null;
    private bfu elg = null;
    private ccr elR = null;
    private btn elh = null;
    private bwc elc = new bwc(true);
    private dlk elS = null;

    public ccs() {
        super(true);
        this.elg = new bfu(this);
    }

    public final bfq aIv() {
        return this.elg;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.elg.doTick(ldz2);
        if (this.elR != null) {
            this.elR.doTick(ldz2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (this.elh == null || !this.elh.a(dxq2, (btk)((Object)this))) {
            switch (dxq2.bEz()) {
                case 19460: {
                    this.a((ecv)dxq2, true);
                    break;
                }
                default: {
                    super.receiveMessage(dxq2);
                }
            }
        }
    }

    public boolean a(ecv ecv2, boolean bl) {
        if (!bl) {
            ecw ecw2 = (ecw)this.MessageDelegator.h(19461, this.getGUID(), ecv2.aO());
            this.MessageDelegator.b(ecv2, ecw2);
            this.MessageDelegator.F(ecw2);
            return false;
        }
        if (this.elR == null) {
            ecw ecw3 = (ecw)this.MessageDelegator.h(19461, this.getGUID(), ecv2.aO());
            this.MessageDelegator.b(ecv2, ecw3);
            this.MessageDelegator.F(ecw3);
            return false;
        }
        this.elR.a(ecv2);
        return true;
    }

    public cbq aIL() {
        return this.elf;
    }

    public void a(cbq cbq2) {
        this.elf = cbq2;
    }

    public void f(et et2) {
        if (this.elf != null && !this.elf.b(this, et2)) {
            return;
        }
        if (et2.getType() == 352) {
            bfl bfl2 = (bfl)this.elg.aof();
            if (bfl2 != null) {
                int n;
                axy axy2;
                axx axx2;
                boolean bl = true;
                if (this.elS != null && lea.enW().isDescendant(this.az(), cug.fpm) && (axx2 = this.elS.XQ()) != null && axy.cuy != (axy2 = axx2.a((dlo)this.elS, n = this.elS.XS()))) {
                    bl = false;
                }
                if (bl) {
                    this.elg.a(5, bfl2);
                }
            }
            if (this.elf != null) {
                this.elf.b(this);
            }
        }
        super.f(et2);
    }

    public void d(et et2, float f2) {
        super.d(et2, f2);
        if (this.elf != null) {
            this.elf.a(this, et2);
        }
    }

    @Override
    protected void aIw() {
        super.aIw();
        if (this.elb == null) {
            return;
        }
        assert (this.elb != null);
        this.aIX();
        if (this.elb != null) {
            this.elc.setMessageDelegator(this.MessageDelegator);
            this.elc.d(this.aAG());
            this.elc.e("AttachPoint_Structure Kill 01", 20, this.elb.GC());
        }
    }

    private void aIX() {
        if (!this.elb.GA()) {
            return;
        }
        ljq ljq2 = this.aAG().av();
        int n = lea.ei(ljq2);
        if (n == 0) {
            lfn.b(5, this.getClass().getSimpleName(), "setupMine: invalid resource area for position " + ljq2);
        }
        int n2 = this.az();
        ame ame2 = lea.acn(n).get(n2);
        if (ame2 == null) {
            ame2 = lea.acn(0).get(n2);
        }
        if (ame2 == null) {
            assert (false);
            return;
        }
        this.elR = new ccr();
        this.elR.ku(this.getGUID());
        this.elR.setMessageDelegator(this.MessageDelegator);
        this.elR.a(ame2);
    }

    public void Hy() {
        this.aIw();
    }

    public btn aIO() {
        return this.elh;
    }

    public void a(btn btn2) {
        this.elh = btn2;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.elc != null) {
            this.elc.cleanUp();
            this.elc = null;
        }
    }

    public void a(dlk dlk2) {
        this.elS = dlk2;
    }

    public ldv aIY() {
        if (this.elS == null) {
            return null;
        }
        if (this.elS.bpz() == null) {
            return null;
        }
        if (this.elS.bpz().XQ() == null) {
            return null;
        }
        return this.elS.bpz().XQ().Xw();
    }

    public ldv acm() {
        if (this.elS == null) {
            return null;
        }
        if (this.elS.bpz() == null) {
            return null;
        }
        if (this.elS.bpz().XQ() == null) {
            return null;
        }
        return this.elS.bpz().XQ().getGUID();
    }

    public boolean aIp() {
        return true;
    }
}

