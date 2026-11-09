/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  clg
 *  cug
 *  lcr
 */
import java.util.Map;

public class clh
extends btk {
    private clg eIo = null;
    public static final int eIp = 10;
    public static final long eIq = 259200000L;
    public static final long eIr = 1123200000L;
    public static final double eIs = 3600.0;
    public static final long eIt = 21600000L;
    public static final float eIu = 1.1f;
    private double eIv = 0.0;
    private long eIw = 0L;
    private ljq eIx = null;
    private lgl eIy = null;
    private ccs eIz = null;
    private ccs eIA = null;
    private static final int eIB = 1;
    private static final int eIC = 2;
    private boolean eID = false;
    private boolean eIE = false;
    private fhv eIF = null;
    private String eIG = null;
    private int eIH = 0;

    public clh(clg clg2) {
        assert (clg2 != null);
        this.eIo = clg2;
        this.eIw = System.currentTimeMillis();
        this.aqR();
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dm(this.eIo.aRK() ? 1 : 2);
        this.eIv = this.MessageDelegator.arc().rgz - 3600.0;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.eIz != null) {
            this.a(this.eIz);
            this.eIz = null;
        }
        if (this.eIA != null) {
            this.a(this.eIA);
            this.eIA = null;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 19458: {
                this.a((ecs)dxq2);
                break;
            }
            case 23825: {
                this.a((fhr)dxq2);
                break;
            }
            case 23823: {
                this.a((fhv)dxq2);
                break;
            }
            case 7982: {
                this.a((fnf)dxq2);
                break;
            }
            case 23849: {
                this.a((fht)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void doTick(ldz ldz2) {
        if (this.eIo.aRK() && !this.eID) {
            this.aRX();
        }
    }

    private void a(String string, String string2, ldv ldv2, int n) {
        this.eIv = this.MessageDelegator.arc().rgz;
        this.eIw = System.currentTimeMillis();
        assert (this.eIA != null);
        if (this.eIA != null) {
            this.a(this.eIA);
            this.eIA = null;
        }
        assert (this.eIz == null);
        if (this.eIz == null) {
            this.dm(1);
        }
        this.eIG = string + " " + string2;
        if (this.eIo.aRU() == null) {
            return;
        }
        this.eIo.p(mbx.uoP.bD(this.eIG, n, cug.fkb));
    }

    protected void aRW() {
        this.eIv = this.MessageDelegator.arc().rgz - 3600.0;
        this.eIw = System.currentTimeMillis();
        this.eIG = null;
    }

    private void aRX() {
        boolean bl;
        if (this.eIv + 3600.0 > this.MessageDelegator.arc().rgz) {
            return;
        }
        this.eIv = this.MessageDelegator.arc().rgz;
        long l = System.currentTimeMillis() - this.eIw;
        boolean bl2 = bl = l < 259200000L;
        if (bl) {
            if (this.eIA != null) {
                this.a(this.eIA);
                this.eIA = null;
                assert (this.eIz == null);
                this.dm(1);
            } else if (this.eIz == null) {
                // empty if block
            }
        } else {
            if (this.eIz != null) {
                this.a(this.eIz);
                this.eIz = null;
                assert (this.eIA == null);
                this.dm(2);
            } else if (this.eIA == null) {
                // empty if block
            }
            if (this.eIw + 1123200000L > System.currentTimeMillis()) {
                double d2 = this.aSa();
                int n = this.aRZ();
                this.eIo.p(mbx.uoO.bD(n, cug.fkb));
                this.eIo.b(n, (long)(d2 * 1000.0));
                if (this.eIA != null) {
                    this.eIA.jm().f(12464, true);
                    this.eIA.jm().i(12480, n);
                    this.eIA.jm().a(12384, this.MessageDelegator.arc().rgz + d2);
                }
            } else {
                this.aRJ();
                if (this.eIA != null) {
                    this.eIA.jm().f(12464, false);
                    this.eIA.jm().i(12480, 0);
                    this.eIA.jm().a(12384, 0.0);
                }
            }
        }
    }

    private void aRJ() {
        this.eIo.aRJ();
        this.aRW();
        if (this.eIA == null) {
            if (this.eIz != null) {
                this.a(this.eIz);
            }
            this.dm(2);
        }
    }

    public void aRY() {
        this.aRW();
        if (this.eIA == null) {
            if (this.eIz != null) {
                this.a(this.eIz);
            }
            this.dm(2);
        }
    }

    private boolean aRI() {
        if (this.eIz == null && this.eIA == null && !this.eID) {
            return true;
        }
        return this.eIz != null;
    }

    public int aRZ() {
        if (this.aRI()) {
            return 0;
        }
        if (System.currentTimeMillis() < this.eIw + 259200000L) {
            return this.eIH;
        }
        long l = System.currentTimeMillis() - (this.eIw + 259200000L);
        if (l < 0L) {
            // empty if block
        }
        assert (l >= 0L);
        if (l <= 0L) {
            l = 1L;
        }
        long l2 = 259200000L;
        assert (l2 > 0L);
        if (l2 <= 0L) {
            l2 = 1L;
        }
        l /= 1000L;
        l2 /= 1000L;
        l /= 60L;
        l2 /= 60L;
        int n = (int)(l2 /= 60L) * 10;
        int n2 = (int)((float)((int)(l /= 60L) * 10) * 1.1f);
        if (n <= 0) {
            n = 1;
        }
        assert (n > 0);
        assert (n2 >= 0);
        int n3 = n + n2;
        if (n3 <= 0) {
            n3 = 1;
        }
        this.eIH = n3;
        return n3;
    }

    private double aSa() {
        return (this.eIw + 1123200000L - System.currentTimeMillis()) / 1000L;
    }

    private void aqR() {
        this.eIx = new ljq();
        this.eIy = new lgl();
        assert (this.eIo.aAG() != null);
        if (this.eIo.aAG() == null) {
            return;
        }
        Map<String, eh> map = ei.ao(this.eIo.aAG().getFileName());
        if (map == null) {
            assert (false);
            return;
        }
        eh eh2 = map.get("AttachPoint House Flag");
        if (eh2 == null) {
            assert (false);
        } else {
            this.eIx = new ljq(eh2.fb());
            this.eIy = new lgl(eh2.getRotation());
        }
    }

    private void dm(int n) {
        this.eID = true;
        ljq ljq2 = new ljq(this.eIo.aAG().azb());
        lgl lgl2 = new lgl(this.eIo.aAG().azc());
        ljq2.es(lgl2.eq(this.eIx));
        lgl2.Y(this.eIy);
        ecr ecr2 = (ecr)this.MessageDelegator.h(19457, this.getGUID(), lcr.qBq);
        ecr2.sk(n);
        if (n == 1) {
            ecr2.l(cug.frj);
        } else {
            ecr2.l(cug.frk);
        }
        ecr2.c(ljq2);
        ecr2.a(lgl2);
        ecr2.jS(true);
        ecr2.oF(this.getGUID());
        this.MessageDelegator.F(ecr2);
    }

    private void a(ccs ccs2) {
        assert (ccs2 != null);
        ecx ecx2 = (ecx)this.MessageDelegator.h(19459, this.getGUID(), lcr.qBq);
        ecx2.jV(true);
        ecx2.ku(ccs2.getGUID());
        this.MessageDelegator.F(ecx2);
        this.MessageDelegator.hd(ccs2.getGUID());
    }

    private void a(ecs ecs2) {
        this.eID = false;
        if (ecs2.aVk() == 1) {
            if (this.eIA != null) {
                this.a(this.eIA);
                this.eIA = null;
            }
            if (this.eIz != null) {
                assert (false);
                this.a(this.eIz);
                this.eIz = null;
            }
            this.eIz = ecs2.bFA();
            this.eIz.fi().b(12496, this.eIG);
            this.eIz.fi().f(12464, this.eIo.aRK());
        } else if (ecs2.aVk() == 2) {
            if (this.eIz != null) {
                this.a(this.eIz);
                this.eIz = null;
            }
            if (this.eIA != null) {
                assert (false);
                this.a(this.eIA);
                this.eIA = null;
            }
            this.eIA = ecs2.bFA();
            this.eIA.fi().f(12464, this.eIo.aRK());
            this.eIA.fi().i(12480, this.aRZ());
            this.eIA.fi().a(12384, this.MessageDelegator.arc().rgz + this.aSa());
        } else assert (false);
        this.MessageDelegator.a((amf)((Object)ecs2.bFA()));
        ecs2.bFA().Hy();
    }

    private void a(fhr fhr2) {
        fhs fhs2 = (fhs)this.MessageDelegator.h(23826, this.eIo.getGUID(), fhr2.aO());
        this.MessageDelegator.b(fhr2, fhs2);
        if (!this.eIo.aRK()) {
            fhs2.iMB = 0;
        }
        fhs2.iMB = this.eIE || this.aRI() ? 0 : this.aRZ();
        this.MessageDelegator.F(fhs2);
    }

    private void a(fht fht2) {
        fhu fhu2 = (fhu)this.MessageDelegator.h(23850, this.eIo.getGUID(), fht2.aO());
        this.MessageDelegator.b(fht2, fhu2);
        if (!this.eIo.aRK()) {
            fhu2.iMB = 0;
            fhu2.iMC = 0L;
        } else {
            long l = this.eIw + 1123200000L - System.currentTimeMillis();
            if (l <= 0L) {
                l = 1L;
            }
            if (this.eIE || this.aRI()) {
                fhu2.iMB = 0;
                fhu2.iMC = l;
            } else {
                fhu2.iMB = this.aRZ();
                fhu2.iMC = l;
            }
        }
        this.MessageDelegator.F(fhu2);
    }

    private void a(fhv fhv2) {
        if (!this.eIo.aRK()) {
            fhw fhw2 = (fhw)this.MessageDelegator.h(23824, this.eIo.getGUID(), fhv2.aO());
            this.MessageDelegator.b(fhv2, fhw2);
            fhw2.a(cli.eIM);
            this.MessageDelegator.F(fhw2);
            return;
        }
        if (this.eIE || this.aRI()) {
            fhw fhw3 = (fhw)this.MessageDelegator.h(23824, this.eIo.getGUID(), fhv2.aO());
            this.MessageDelegator.b(fhv2, fhw3);
            fhw3.a(cli.eIJ);
            this.MessageDelegator.F(fhw3);
            return;
        }
        if (!hc.getAccessLevelType(fhv2.ccY).lk() && !this.eIo.kQ(fhv2.diQ)) {
            fhw fhw4 = (fhw)this.MessageDelegator.h(23824, this.eIo.getGUID(), fhv2.aO());
            this.MessageDelegator.b(fhv2, fhw4);
            fhw4.a(cli.eIN);
            this.MessageDelegator.F(fhw4);
            return;
        }
        assert (this.aRZ() > 0);
        this.eIF = fhv2;
        this.eIE = true;
        fne fne2 = (fne)this.MessageDelegator.h(7981, this.getGUID(), fhv2.diQ);
        fne2.hsP = true;
        fne2.ResourceType = cug.fkb;
        fne2.asi = this.aRZ();
        fne2.b(bqy.dHY);
        this.MessageDelegator.F(fne2);
    }

    private void a(fnf fnf2) {
        assert (this.eIE);
        assert (this.eIF != null);
        fhw fhw2 = (fhw)this.MessageDelegator.h(23824, this.eIo.getGUID(), this.eIF.aO());
        this.MessageDelegator.b(fnf2, fhw2);
        if (!fnf2.iQM) {
            fhw2.a(cli.eIK);
            fhw2.GM(this.aRZ());
        } else {
            fhw2.a(cli.eIO);
            fhw2.GM(this.aRZ());
            this.a(this.eIF.YU, this.eIF.YV, this.eIF.diQ, fhw2.bPG());
            this.eIo.b(0, 0L);
        }
        this.MessageDelegator.F(fhw2);
        this.eIE = false;
        this.eIF = null;
    }

    public final long aSb() {
        return this.eIw;
    }

    public final void V(long l) {
        this.eIw = l;
        long l2 = System.currentTimeMillis() - this.eIw;
        if (l2 <= 0L) {
            this.eIw = System.currentTimeMillis();
        } else {
            long l3 = 1123200000L - l2;
            if (l3 < 21600000L) {
                this.eIw += 21600000L - l3;
            }
        }
        this.eIv = -3600.0;
    }
}

