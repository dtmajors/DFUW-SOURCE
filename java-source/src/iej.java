/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.ArrayList;
import spenefett.hid.gui.serialization.dto.SFTooltipBaseDTO;

public class iej
extends ipz
implements iua {
    private int lNp;
    private int lNk = 1;
    private a lNq = null;
    private lie lNr;
    private ipf lMX;
    private ipf lNs;
    private ipf lNt;
    private iei lNu;
    private ist lNv;
    private ist lNw;
    private ist lNx;
    private ipb lNy;
    private ivf lNz;
    private iox lNA;
    private ist lNB;
    private ipb lNC;
    private ipk lND;
    private ipk lNE;
    private ipk lNF;
    private ipk lNG;
    private ipk lNH;

    public iej(int n) {
        this.lNp = n;
        this.a(new iqx(5, 3, 5, 3));
        this.W(ipx.d(this.cGT()));
        this.W(ipx.d(this.cPC()));
        this.W(ipx.d(this.cPD()));
        this.W(this.cGU());
        this.a(a.lNM);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.cPA();
    }

    @Override
    public boolean getSelected() {
        return false;
    }

    @Override
    public void setSelected(boolean bl) {
    }

    public a cPx() {
        return this.lNq;
    }

    public void a(a a2) {
        if (a2 == this.lNq) {
            return;
        }
        this.lNq = a2;
        switch (a2) {
            case lNM: {
                this.lNs.setVisible(false);
                this.lNu.rF(false);
                this.lNu.setActive(false);
                this.lNv.Rk(0x343434);
                this.lNw.Rk(0x343434);
                this.lNx.setText("-");
                this.lNx.Rk(0x343434);
                this.lNy.qP("/dfdata/texture/gui/j2f/clanperks/timer_indicator_disabled.png");
                this.lNz.rF(false);
                this.lNA.rF(false);
                this.lNA.hX(false);
                this.lNA.hz(0.1f);
                this.lNB.Rk(0x343434);
                this.lNC.qP("/dfdata/texture/gui/j2f/clanperks/cost_dominion_small_disabled.png");
                this.cPA();
                this.lND.setColor(0x1D1D1D);
                this.lNE.setColor(0x1D1D1D);
                this.lNF.setColor(0x1D1D1D);
                this.lNG.setColor(0x1D1D1D);
                this.lNH.setColor(0x1D1D1D);
                break;
            }
            case lNN: {
                this.lNs.setVisible(false);
                this.lNu.rF(true);
                this.lNu.setActive(false);
                this.lNv.Rk(0xABABAB);
                this.lNw.Rk(0xABABAB);
                this.lNx.setText("-");
                this.lNx.Rk(0x343434);
                this.lNy.qP("/dfdata/texture/gui/j2f/clanperks/timer_indicator_disabled.png");
                this.lNz.rF(false);
                this.lNA.rF(false);
                this.lNA.hX(false);
                this.lNA.hz(0.1f);
                this.lNB.Rk(0x343434);
                this.lNC.qP("/dfdata/texture/gui/j2f/clanperks/cost_dominion_small_disabled.png");
                this.cPA();
                this.lND.setColor(0x313131);
                this.lNE.setColor(0x313131);
                this.lNF.setColor(0x313131);
                this.lNG.setColor(0x313131);
                this.lNH.setColor(0x313131);
                break;
            }
            case lNO: {
                this.lNs.setVisible(false);
                this.lNu.rF(true);
                this.lNu.setActive(false);
                this.lNv.Rk(0xABABAB);
                this.lNw.Rk(12357465);
                this.lNx.setText("-");
                this.lNx.Rk(0x343434);
                this.lNy.qP("/dfdata/texture/gui/j2f/clanperks/timer_indicator_disabled.png");
                this.lNz.rF(true);
                this.lNA.rF(true);
                this.lNA.hX(false);
                this.lNA.hz(1.0f);
                this.lNB.Rk(11491809);
                this.lNC.qP("/dfdata/texture/gui/j2f/clanperks/cost_dominion_small_active.png");
                this.cPA();
                this.lND.setColor(0x313131);
                this.lNE.setColor(0x313131);
                this.lNF.setColor(0x313131);
                this.lNG.setColor(0x313131);
                this.lNH.setColor(0x313131);
                break;
            }
            case lNP: {
                this.lNs.setVisible(true);
                this.lNu.rF(true);
                this.lNu.setActive(true);
                this.lNv.Rk(0xABABAB);
                this.lNw.Rk(5746239);
                this.lNx.setText("-");
                this.lNx.Rk(0xABABAB);
                this.lNy.qP("/dfdata/texture/gui/j2f/clanperks/timer_indicator_active.png");
                this.lNz.rF(false);
                this.lNA.rF(false);
                this.lNA.hX(false);
                this.lNA.hz(0.1f);
                this.lNB.Rk(0x343434);
                this.lNC.qP("/dfdata/texture/gui/j2f/clanperks/cost_dominion_small_disabled.png");
                this.lND.setColor(0x313131);
                this.lNE.setColor(0x313131);
                this.lNF.setColor(0x313131);
                this.lNG.setColor(0x1D1D1D);
                this.lNH.setColor(0x1D1D1D);
            }
        }
    }

    public boolean isSelected() {
        return this.lNA.dir();
    }

    public int cPy() {
        return this.lNk;
    }

    public boolean cPz() {
        return this.lNr != null;
    }

    public void dk(double d2) {
        this.cPA();
        this.lNr = new lie(this, 1.0, true, d2){
            final /* synthetic */ double lNI;
            final /* synthetic */ iej lNJ;
            {
                this.lNJ = iej2;
                this.lNI = d3;
                super(d2, bl);
            }

            public void dh(double d2) {
                double d3 = Math.max(this.lNI - this.getMessageDelegator().arc().rgz, 0.0);
                iej.a(this.lNJ).setText(lvm.sWE.bD(d3).exA());
            }
        };
        this.lNr.e(this.djE().getMessageDelegator());
    }

    public void cPA() {
        if (this.lNr == null) {
            return;
        }
        this.lNr.stop();
        this.lNr = null;
        this.lNx.setText("-");
    }

    @Override
    public hyn dd(int n, int n2) {
        hyn hyn2 = super.dd(n, n2);
        if (hyn2 != null) {
            return hyn2;
        }
        String string = null;
        String string2 = null;
        ArrayList<String> arrayList = lcn.emv();
        string = isg.b(isf.mwO, 16, 0xABABAB, lea.epN().qg(this.lNp).exA()) + "\n" + isg.b(isf.mwM, 13, 0xFFFFFF, lea.epN().qh(this.lNp).exA());
        cib cib2 = cib.getValueByOrdinal(this.lNp);
        cia cia2 = lea.epN().a(cib2);
        float f = cia2.aOO() ? cia2.qd(0) * 100.0f : cia2.qd(0);
        switch (cib2) {
            case eAw: {
                arrayList.add(lwl.teI.bD(iej.dl(f)).exA());
                arrayList.add(lwl.teJ.bD(iej.dl(f)).exA());
                break;
            }
            case eAx: {
                arrayList.add(lwl.teK.bD(iej.dl(f)).exA());
                break;
            }
            case eAy: {
                arrayList.add(lwl.teL.bD(iej.dl(-f)).exA());
                break;
            }
            case eAz: {
                arrayList.add(lwl.teM.bD(iej.dl(f)).exA());
                break;
            }
            case eAA: {
                arrayList.add(lwl.teN.bD(iej.dl(f)).exA());
                break;
            }
            case eAB: {
                arrayList.add(lwl.teO.bD(iej.dl(f)).exA());
                break;
            }
            case eAC: {
                arrayList.add(lwl.teP.bD(iej.dl(f)).exA());
                break;
            }
            case eAD: {
                arrayList.add(lwl.teQ.bD(iej.dm(f)).exA());
                break;
            }
            case eAE: {
                arrayList.add(lwl.teR.bD(iej.dm(f)).exA());
                break;
            }
            case eAF: {
                arrayList.add(lwl.teS.bD(iej.dm(f)).exA());
                break;
            }
            case eAG: {
                arrayList.add(lwl.teT.bD(iej.dl(f)).exA());
                break;
            }
            case eAH: {
                arrayList.add(lwl.teU.bD(iej.dl(f)).exA());
                arrayList.add(lwl.teV.bD(iej.dl(f)).exA());
                arrayList.add(lwl.teW.bD(iej.dl(f)).exA());
                break;
            }
            case eAI: {
                arrayList.add(lwl.teX.bD(iej.dl(f)).exA());
                break;
            }
            case eAJ: {
                arrayList.add(lwl.teY.bD(iej.dn(f)).exA());
                break;
            }
            case eAK: {
                arrayList.add(lwl.teZ.bD(iej.dl(f)).exA());
                break;
            }
            case eAL: {
                arrayList.add(lwl.tfa.bD(iej.dm(f)).exA());
                arrayList.add(lwl.tfb.bD(iej.dm(f)).exA());
            }
        }
        for (int j = 0; j < arrayList.size(); ++j) {
            arrayList.set(j, isg.b(isf.mwM, 12, 0xFFFF00, ((String)arrayList.get(j)).toUpperCase()));
        }
        arrayList.add(isg.b(isf.mwM, 14, 0xFF0000, lwl.tfc.bD(lea.epN().qe(this.lNp).cl()).exA()));
        SFTooltipBaseDTO sFTooltipBaseDTO = iae.a(string, string2, arrayList.size(), 1, 0, 0, arrayList.toArray(new String[arrayList.size()]));
        joa joa2 = hso.cxK().cxY();
        this.djE();
        int n3 = (float)ioa.cxP().bpc() < joa2.H / 2.0f ? 40 : -40;
        sFTooltipBaseDTO.autoSizeColumns = true;
        this.djE();
        int n4 = ioa.cxP().bpb();
        this.djE();
        return new iae(sFTooltipBaseDTO, n4, ioa.cxP().bpc() - n3, this.getWidth(), this.getHeight());
    }

    public void cPB() {
    }

    @Override
    public void cND() {
        this.lNt.setVisible(this.dkb());
    }

    private ipf cGT() {
        this.lMX = new ipk(0x181818, 452, 42);
        return this.lMX;
    }

    private ipf cPC() {
        this.lNs = new ipt(0x232323, 452, 42);
        return this.lNs;
    }

    private ipf cPD() {
        this.lNt = ipx.a(480, 42, new iqa("/dfdata/texture/gui/j2f/clanperks/perk_entry_hover_bg.png", 28, 0, 28, 0));
        this.lNt.setVisible(false);
        return this.lNt;
    }

    private ipf cGU() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(11, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cPn()));
        ipx2.W(ipx.a(9, 1, new ipf[0]));
        ipf[] ipfArray = new ipf[1];
        this.lND = new ipk(0x313131, 1, 34);
        ipfArray[0] = this.lND;
        ipx2.W(ipx.d(ipfArray));
        ipx2.W(ipx.a(9, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(164, 42, this.cPE())));
        ipf[] ipfArray2 = new ipf[1];
        this.lNE = new ipk(0x313131, 1, 34);
        ipfArray2[0] = this.lNE;
        ipx2.W(ipx.d(ipfArray2));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(63, 42, ipx.d(this.cPH()))));
        ipx2.W(ipx.a(10, 1, new ipf[0]));
        ipf[] ipfArray3 = new ipf[1];
        this.lNF = new ipk(0x313131, 1, 34);
        ipfArray3[0] = this.lNF;
        ipx2.W(ipx.d(ipfArray3));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(40, 42, ipx.d(this.cPK()))));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        ipf[] ipfArray4 = new ipf[1];
        this.lNG = new ipk(0x313131, 1, 13);
        ipfArray4[0] = this.lNG;
        ipx2.W(ipx.d(ipfArray4));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cPL()));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        ipf[] ipfArray5 = new ipf[1];
        this.lNH = new ipk(0x313131, 1, 13);
        ipfArray5[0] = this.lNH;
        ipx2.W(ipx.d(ipfArray5));
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(48, 42, ipx.d(this.cPM()))));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        return ipx2;
    }

    private ipf cPn() {
        String string = this.lNp < 9 ? "0" : "";
        int n = this.lNp + 1;
        String string2 = "/dfdata/texture/dds/gui/effectsnew/clan_perk_p" + string + n + ".png";
        this.lNu = new iei(string2);
        return this.lNu;
    }

    private ipf cPE() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(this.cPF());
        ipx2.W(ipx.c(0, -5, this.cPG()));
        return ipx2;
    }

    private ipf cPF() {
        String string = lea.epN().qj(this.lNp);
        loz loz2 = string != null ? lvm.sWY.bD(string) : lvn.sXN.bD("Test");
        this.lNv = new ist(isf.mwO, 12, 0xABABAB, loz2);
        return this.lNv;
    }

    private ipf cPG() {
        this.lNw = new ist(isf.mwO, 14, 12357465, lea.epN().qg(this.lNp));
        return this.lNw;
    }

    private ipx cPH() {
        ipx ipx2 = new ipx(this, iqo.dmS()){
            final /* synthetic */ iej lNJ;
            {
                this.lNJ = iej2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lwl.tfd.bD(new Object[0]).exA());
            }
        };
        ipx2.W(ipx.a(44, 42, ipx.l(ipx.c(new ipf[0]), ipx.d(this.cPI()))));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cPJ()));
        return ipx2;
    }

    private ipf cPI() {
        this.lNx = new ist(isf.mwO, 12, 0xABABAB, "-");
        return this.lNx;
    }

    private ipf cPJ() {
        this.lNy = new ipb("/dfdata/texture/gui/j2f/common/timer/timer.png");
        return this.lNy;
    }

    private ipf cPK() {
        this.lNz = new ivf(this, lwl.teD.bD(this.lNk)){
            final /* synthetic */ iej lNJ;
            {
                this.lNJ = iej2;
                super(loz2);
            }

            public boolean du(int n, int n2) {
                iej.b(this.lNJ).hX(true);
                iej.c(this.lNJ);
                return true;
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lwl.tfe.bD(new Object[0]).exA());
            }
        };
        return this.lNz;
    }

    private ipf cPL() {
        this.lNA = new iuy(this){
            final /* synthetic */ iej lNJ;
            {
                this.lNJ = iej2;
            }

            public void pn(boolean bl) {
                this.lNJ.cPB();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lwl.tff.bD(new Object[0]).exA());
            }
        };
        return this.lNA;
    }

    private ipf cPM() {
        ipx ipx2 = new ipx(this, iqo.dmS()){
            final /* synthetic */ iej lNJ;
            {
                this.lNJ = iej2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lwl.tfg.bD(new Object[0]).exA());
            }
        };
        ipx2.W(ipx.d(ipx.a(24, 42, ipx.l(ipx.c(new ipf[0]), ipx.d(this.cPN())))));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cPP()));
        return ipx2;
    }

    private ipf cPN() {
        this.lNB = new ist(isf.mwO, 11, 0xABABAB, this.cPO());
        return this.lNB;
    }

    private String cPO() {
        return jny.dB(cia.aN(this.lNp, this.lNk));
    }

    private ipf cPP() {
        this.lNC = new ipb("/dfdata/texture/gui/j2f/common/currencies/dominion.png");
        return this.lNC;
    }

    private void cPQ() {
        ioc ioc2 = this.lNz.eo(0, 0);
        ieh ieh2 = new ieh(this, this.djE(), new joa(ioc2.cf, ioc2.cg, this.lNz.getWidth(), this.lNz.getHeight()), this.lNk){
            final /* synthetic */ iej lNJ;
            {
                this.lNJ = iej2;
                super(ioa2, joa2, n);
            }

            public void Qd(int n) {
                if (n == iej.d(this.lNJ)) {
                    return;
                }
                iej.a(this.lNJ, n);
                iej.f(this.lNJ).setText(iej.e(this.lNJ));
                iej.b(this.lNJ).o(lwl.teD.bD(n));
                iej.g(this.lNJ).hX(true);
                this.lNJ.cPB();
            }

            public void cGR() {
                super.cGR();
                iej.b(this.lNJ).hX(false);
            }
        };
        ieh2.setGUID(this.djE().getMessageDelegator().bzv());
        this.djE().getMessageDelegator().a((amf)((Object)ieh2));
    }

    private static String dl(double d2) {
        if (d2 == (double)((int)d2)) {
            return ((int)d2 > 0 ? "+" : "") + (int)d2 + "%";
        }
        return (d2 > 0.0 ? "+" : "") + jny.dC(d2) + "%";
    }

    private static String dm(double d2) {
        if (d2 == (double)((int)d2)) {
            return ((int)d2 > 0 ? "+" : "") + (int)d2;
        }
        return (d2 > 0.0 ? "+" : "") + jny.dC(d2);
    }

    private static String dn(double d2) {
        return (d2 > 0.0 ? "+" : "-") + lxg.tog.bD(d2).exA();
    }

    static /* synthetic */ ist a(iej iej2) {
        return iej2.lNx;
    }

    static /* synthetic */ ivf b(iej iej2) {
        return iej2.lNz;
    }

    static /* synthetic */ void c(iej iej2) {
        iej2.cPQ();
    }

    static /* synthetic */ int d(iej iej2) {
        return iej2.lNk;
    }

    static /* synthetic */ int a(iej iej2, int n) {
        iej2.lNk = n;
        return iej2.lNk;
    }

    static /* synthetic */ String e(iej iej2) {
        return iej2.cPO();
    }

    static /* synthetic */ ist f(iej iej2) {
        return iej2.lNB;
    }

    static /* synthetic */ iox g(iej iej2) {
        return iej2.lNA;
    }
}

