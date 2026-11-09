/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.List;
import java.util.Map;

public class dnd
extends dmy
implements btn {
    private dnc gJE;
    private dna gJF;
    private dnf gJG;
    private static final int gJH = 1;
    private static final int gJI = 2;
    private static final int gJJ = 3;
    private static final int gJK = 4;
    private static final int gJL = 5;
    private ljq gJM = new ljq();
    private ljq gJN = new ljq();
    private lgl gJO = new lgl();
    private lgl gJP = new lgl();
    ckx gJQ = null;
    ckx gJR = null;
    ckx gJS = null;
    ckx gJT = null;
    ckx gJU = null;
    private double gJV = 0.0;
    private double gJW = 0.0;
    private double gJX = 0.0;
    private int gJY = 0;

    @Override
    public void initialize() {
        super.initialize();
    }

    public boolean isOpen() {
        return this.gJW > 0.0;
    }

    public boolean bqY() {
        return this.gJY + this.gJG.brm() <= this.gJG.brl();
    }

    public boolean AP(int n) {
        if (this.gJY + n > this.gJG.brl()) {
            return false;
        }
        this.gJY += n;
        return true;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.gJF == null) {
            return;
        }
        if (this.gJX > 0.0) {
            this.gJX -= ldz2.qwh;
            if (this.gJX <= 0.0) {
                this.bra();
            }
        } else {
            assert (this.gJW > 0.0);
            this.gJW -= ldz2.qwh;
            if (this.gJW <= 0.0) {
                this.brb();
            }
        }
    }

    public void bqZ() {
        if (this.gJU == null) {
            return;
        }
        assert (this.gJU.aAG() != null);
        if (this.gJU.aAG() == null) {
            return;
        }
        if (this.isOpen()) {
            this.gJU.aAG().c(this.gJM);
            this.gJU.aAG().a(this.gJO);
            this.gJU.aAG().azm();
        } else {
            this.gJU.aAG().c(this.gJN);
            this.gJU.aAG().a(this.gJP);
            this.gJU.aAG().azm();
        }
    }

    private void bra() {
        this.gJX = 0.0;
        this.gJY = 0;
        this.gJW = this.gJG.brr();
        this.q(mda.uEu.bD(this.gJG.bri()));
        this.bqZ();
    }

    private void brb() {
        this.gJW = 0.0;
        this.gJX = this.gJG.brs();
        this.bP(this.gJX);
        this.q(mda.uEv.bD(this.gJG.bri()));
        this.bqZ();
    }

    private void brc() {
        this.gJW = 0.0;
        this.gJX = this.gJG.brs();
        this.bP(this.gJX);
        this.q(mda.uEw.bD(this.gJG.bri()));
        this.bqZ();
    }

    private void bP(double d2) {
        assert (this.gJQ != null);
        if (this.gJQ == null) {
            return;
        }
    }

    public double brd() {
        if (this.gJX > 0.0) {
            return this.gJX;
        }
        return 0.0;
    }

    public void a(dna dna2) {
        this.gJF = dna2;
        assert (dna2.bqS());
        assert (dna2.bqR());
        this.gJG = lea.epd().get(dna2.bqX());
        assert (this.gJG != null);
        this.gJG.brh();
        this.gJX = lew.f(this.gJG.brt(), this.gJG.brs(), Math.random());
        if (this.gJX < this.gJG.brt()) {
            this.gJX = this.gJG.brt();
        }
        this.gJW = 0.0;
        dmz dmz2 = this.gJF.bqP();
        assert (dmz2 != null);
        fem fem2 = (fem)this.MessageDelegator.h(25345, this.getGUID(), lcr.qBI);
        fem2.Position = dmz2.apU();
        fem2.Rotation = dmz2.apV();
        fem2.ResourceType = dmz2.az();
        fem2.ikP = true;
        fem2.oF(this.getGUID());
        fem2.sk(1);
        this.MessageDelegator.F(fem2);
        dmz2 = this.gJF.bqQ();
        assert (dmz2 != null);
        fem2 = (fem)this.MessageDelegator.h(25345, this.getGUID(), lcr.qBI);
        fem2.Position = dmz2.apU();
        fem2.Rotation = dmz2.apV();
        fem2.ResourceType = dmz2.az();
        fem2.ikP = true;
        fem2.oF(this.getGUID());
        fem2.sk(2);
        this.MessageDelegator.F(fem2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 25346: {
                this.a((fen)dxq2);
                break;
            }
            case 25607: {
                this.a((gwk)dxq2);
                break;
            }
            case 25609: {
                this.a((gwo)dxq2);
                break;
            }
            case 25612: {
                this.a((gwt)dxq2);
                break;
            }
            case 25610: {
                this.a((gwr)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fen fen2) {
        assert (fen2.iKB != null);
        assert (fen2.iKC != null);
        ckx ckx2 = fen2.iKC;
        this.MessageDelegator.a((amf)((Object)ckx2));
        ckx2.c(this);
        switch (fen2.aVk()) {
            case 1: {
                this.gJQ = ckx2;
                this.bP(this.gJX);
                this.a(ckx2, 3);
                this.c(ckx2);
                break;
            }
            case 2: {
                this.gJR = ckx2;
                this.a(ckx2, 4);
                break;
            }
            case 3: {
                this.gJS = ckx2;
                break;
            }
            case 4: {
                this.gJT = ckx2;
                break;
            }
            case 5: {
                this.gJU = ckx2;
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    private void bre() {
    }

    private void brf() {
    }

    private void brg() {
    }

    private void a(gwo gwo2) {
        this.brf();
    }

    private void a(gwk gwk2) {
        gwl gwl2 = (gwl)this.MessageDelegator.h(25608, this.getGUID(), gwk2.aO());
        this.MessageDelegator.b(gwk2, gwl2);
        if (!this.isOpen()) {
            gwl2.ew = 1;
            this.MessageDelegator.F(gwl2);
            return;
        }
        if (!this.bqY()) {
            gwl2.ew = 2;
            this.MessageDelegator.F(gwl2);
            return;
        }
        if (gwk2.jjU < this.gJG.brm()) {
            gwl2.ew = 1;
            this.MessageDelegator.F(gwl2);
            return;
        }
        if (!this.AP(gwk2.jjU)) {
            gwl2.ew = 2;
            this.MessageDelegator.F(gwl2);
            this.brc();
            return;
        }
        this.bre();
        gwl2.asi = gwk2.jjU;
        gwl2.ew = 3;
        gwl2.dyW = lcw.ea((ljq)this.gJT.aAG().azb());
        gwl2.aZD = this.gJT.aAG().av();
        this.MessageDelegator.F(gwl2);
    }

    private void a(gwr gwr2) {
        gws gws2 = (gws)this.MessageDelegator.h(25611, this.getGUID(), gwr2.aO());
        this.MessageDelegator.b(gwr2, gws2);
        if (gwr2.aUF + this.gJG.bru() > this.MessageDelegator.arc().rgz) {
            gws2.ew = 2;
            this.MessageDelegator.F(gws2);
            return;
        }
        if (gwr2.aUF + this.gJG.brv() < this.MessageDelegator.arc().rgz) {
            gws2.ew = 3;
            this.MessageDelegator.F(gws2);
            return;
        }
        this.brg();
        gws2.ew = 5;
        double d2 = this.MessageDelegator.arc().rgz - gwr2.aUF;
        assert (d2 > 0.0);
        if (d2 <= 0.0) {
            d2 = this.gJG.brx() + 1.0;
        }
        List<lfs<Integer, Integer>> list = this.gJG.f(gwr2.asi, d2);
        int[] nArray = new int[list.size()];
        int[] nArray2 = new int[list.size()];
        int n = 0;
        for (lfs<Integer, Integer> lfs2 : list) {
            nArray[n] = (Integer)lfs2.reX;
            nArray2[n] = (Integer)lfs2.reY;
            ++n;
        }
        gws2.bqd = nArray;
        gws2.iIY = nArray2;
        gws2.jsS = this.gJG.bR(d2);
        this.MessageDelegator.F(gws2);
    }

    private void a(ckx ckx2, int n) {
        assert (ckx2 != null);
        String string = ckx2.pa() + " Vendor";
        int n2 = lea.enW().getType(string);
        assert (n2 > 0);
        Map<String, eh> map = ei.ao(ckx2.aAG().getFileName());
        if (map == null) {
            assert (false);
            return;
        }
        eh eh2 = map.get("AttachPoint_Structure Vendor 01");
        ljq ljq2 = new ljq();
        lgl lgl2 = new lgl();
        if (eh2 == null) {
            assert (false);
        } else {
            eh2.a(ckx2.aAG().azb(), ckx2.aAG().azc(), ljq2, lgl2);
        }
        fem fem2 = (fem)this.MessageDelegator.h(25345, this.getGUID(), lcr.qBI);
        fem2.Position = ljq2;
        fem2.Rotation = lgl2;
        fem2.ResourceType = n2;
        fem2.ikP = true;
        fem2.oF(this.getGUID());
        fem2.sk(n);
        this.MessageDelegator.F(fem2);
    }

    private void c(ckx ckx2) {
        lgl lgl2;
        ljq ljq2;
        assert (ckx2 != null);
        String string = ckx2.pa();
        string = string.replace(" Start", " Window");
        int n = lea.enW().getType(string);
        assert (n > 0);
        Map<String, eh> map = ei.ao(ckx2.aAG().getFileName());
        if (map == null) {
            assert (false);
            return;
        }
        eh eh2 = map.get("AttachPoint TradeRoute Window Open");
        eh eh3 = map.get("AttachPoint TradeRoute Window Closed");
        if (eh2 == null) {
            assert (false);
        } else {
            eh2.a(ckx2.aAG().azb(), ckx2.aAG().azc(), this.gJM, this.gJO);
        }
        if (eh3 == null) {
            assert (false);
        } else {
            eh3.a(ckx2.aAG().azb(), ckx2.aAG().azc(), this.gJN, this.gJP);
        }
        if (this.isOpen()) {
            ljq2 = this.gJM;
            lgl2 = this.gJO;
        } else {
            ljq2 = this.gJN;
            lgl2 = this.gJP;
        }
        fem fem2 = (fem)this.MessageDelegator.h(25345, this.getGUID(), lcr.qBI);
        fem2.Position = ljq2;
        fem2.Rotation = lgl2;
        fem2.ResourceType = n;
        fem2.ikP = true;
        fem2.oF(this.getGUID());
        fem2.sk(5);
        this.MessageDelegator.F(fem2);
    }

    @Override
    public boolean a(dxq dxq2, btk btk2) {
        if (btk2 == this.gJS) {
            switch (dxq2.bEz()) {
                case 25604: {
                    this.a((gwm)dxq2);
                    return true;
                }
                case 25612: {
                    this.a((gwt)dxq2);
                    return true;
                }
            }
            return false;
        }
        if (btk2 == this.gJT) {
            switch (dxq2.bEz()) {
                case 25612: {
                    this.a((gwt)dxq2);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private void a(gwt gwt2) {
        gwu gwu2 = (gwu)this.MessageDelegator.h(25613, this.getGUID(), gwt2.aO());
        gwu2.gJy = this.getGUID();
        this.MessageDelegator.F(gwu2);
    }

    private void a(gwm gwm2) {
        assert (gwm2.diQ != null);
        gwn gwn2 = (gwn)this.MessageDelegator.h(25605, this.getGUID(), gwm2.aO());
        this.MessageDelegator.b(gwm2, gwn2);
        gwn2.aUD = this.gJG.bri();
        gwn2.jsM = this.brd();
        gwn2.aUy = this.gJG.vi();
        gwn2.aUz = this.gJG.vp();
        gwn2.aUA = this.gJG.vn();
        gwn2.aUB = this.gJG.vq();
        gwn2.gKh = this.gJG.brk();
        gwn2.aUw = this.getGUID();
        gwn2.aUG = this.gJQ.az();
        gwn2.gKg = this.gJG.brm();
        if (!this.isOpen() || gwm2.diQ == null) {
            gwn2.ew = 1;
            this.MessageDelegator.F(gwn2);
            return;
        }
        if (!this.bqY()) {
            gwn2.ew = 3;
            this.MessageDelegator.F(gwn2);
            return;
        }
        gwn2.ew = 2;
        this.MessageDelegator.F(gwn2);
    }

    private void q(loz loz2) {
        fgo fgo2 = (fgo)this.MessageDelegator.h(29447, this.GUID, lcr.qAL);
        fgo2.r(loz2);
        this.MessageDelegator.F(fgo2);
    }
}

