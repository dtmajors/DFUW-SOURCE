/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.ArrayList;
import java.util.Map;

public class iek
extends ihs
implements htc,
htm,
hts,
htx,
hug {
    static final int lNR = 48;
    private boolean lBD;
    private Map<Integer, iej> lNS = lcn.emw();
    private int[] lNT;
    private izm lNU;
    private ist lNV;
    private ios lNW;

    public iek() {
        super("ClanPerksWindow", "J2FWindow.swf");
        this.OQ(jnz.nGi);
        this.qY(true);
        this.U(580.0f, 400.0f);
        this.T(580.0f, 600.0f);
        this.a(ire.mul);
    }

    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().cxP().czb().a(this);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czb() != null) {
            hso.cxK().cxP().czb().b(this);
        }
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13932: {
                this.a((enc)dxq2);
            }
        }
        super.receiveMessage(dxq2);
    }

    @Override
    public boolean isOpen() {
        return this.lBD;
    }

    public void setOpen(boolean bl) {
        if (bl == this.lBD) {
            return;
        }
        this.lBD = bl;
        this.setVisible(bl);
        if (bl) {
            this.cqF();
            this.cFc();
        }
        iek.cyJ().cHx().a(hyy.b.ltA, bl ? 1 : 0);
    }

    @Override
    public void oj() {
        if (this.dhJ() == null) {
            return;
        }
        this.cPW();
    }

    @Override
    public void oi() {
        this.cPW();
        if (!hso.cxK().cxP().czb().dNh()) {
            this.cGR();
        }
    }

    @Override
    public void c(aym aym2) {
        this.cPW();
    }

    @Override
    public void cyy() {
        this.cPW();
    }

    @Override
    public void a(bbx[] bbxArray) {
        this.b(bbxArray);
    }

    @Override
    public void a(int n, Double d2) {
        iej iej2 = this.lNS.get(n);
        iej2.dk(d2);
        iej2.a(this.Qf(n));
    }

    @Override
    public void b(int n, Double d2) {
    }

    @Override
    public void Oo(int n) {
        iej iej2 = this.lNS.get(n);
        iej2.cPA();
        iej2.a(this.Qf(n));
    }

    @Override
    public void cyu() {
    }

    @Override
    public void cyv() {
        this.cPX();
    }

    @Override
    public void cyw() {
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.QT(2);
        this.Rz(48);
        this.RA(100);
        this.cKJ();
        this.cXE().a(irl.dnr());
        this.cXE().W(this.cGT());
        this.cXE().W(this.cGU());
        if (hso.cxK().cxP().czb().HT()) {
            this.cPW();
        }
    }

    @Override
    protected void cGo() {
        super.cGo();
        this.T(580.0f, 600.0f);
    }

    @Override
    protected void cGR() {
        iek.cyJ().ps(false);
    }

    private void cKJ() {
        this.a(new ipb("/dfdata/texture/gui/j2f/clanperks/clan_perk_main.png"), 0, -16, 28, lwl.sXP.bD(new Object[0]));
    }

    private ipf cGT() {
        return ipx.a(this.cXH(), this.cXI(), this.dhN(), this.dhO(), new iqa("/dfdata/texture/gui/j2f/clanperks/perk_main_background.png", 124, 0, 370, 100, iqb.mtp));
    }

    private ipf cGU() {
        return ipx.c(40, 8, 8, 8, this.cKi());
    }

    private ipf cKi() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(ipx.c(this.cPR()));
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(this.cLc());
        return ipx2;
    }

    private ipf cPR() {
        this.lNU = new izm();
        this.lNU.dtS();
        this.a(this.lNU);
        return this.lNU;
    }

    private void a(izm izm2) {
        cid cid2 = lea.epN();
        for (cib cib2 : cib.values()) {
            iej iej2 = new iej(this, cib2.ordinal()){
                final /* synthetic */ iek lNX;
                {
                    this.lNX = iek2;
                    super(n);
                }

                public void cPB() {
                    iek.a(this.lNX);
                }
            };
            this.lNS.put(cib2.ordinal(), iej2);
            izm2.c(iej2);
        }
    }

    private ipf cLc() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(this.cPM());
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 37)));
        ipx2.W(ipx.d(this.cPT()));
        return ipx2;
    }

    private ipf cPM() {
        ipx ipx2 = new ipx(this, iqo.dmS()){
            final /* synthetic */ iek lNX;
            {
                this.lNX = iek2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lwl.tfh.bD(new Object[0]).exA());
            }
        };
        ipx2.W(ipx.d(this.cPN()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 15)));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cPS()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipb("/dfdata/texture/gui/j2f/clanperks/cost_dominion_large_active.png")));
        return ipx2;
    }

    private ipf cPN() {
        return new ist(isf.mwO, 14, 0xABABAB, lwl.teC.bD(new Object[0]));
    }

    private ipf cPS() {
        this.lNV = new ist(isf.mwO, 14, 10770862, "0");
        return this.lNV;
    }

    private ipf cPT() {
        this.lNW = new ius(this){
            final /* synthetic */ iek lNX;
            {
                this.lNX = iek2;
            }

            public void cLq() {
                iek.b(this.lNX);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lwl.tfi.bD(new Object[0]).exA());
            }
        };
        return this.lNW;
    }

    private void cPU() {
        int n = this.cPV();
        this.lNV.setText("" + n);
        this.cPX();
    }

    private iej.a Qf(int n) {
        if (!hso.cxK().cxP().czb().dNh()) {
            return iej.a.lNM;
        }
        String string = lea.epN().qj(n);
        if (!hso.cxK().cxP().czb().sP(string)) {
            return iej.a.lNM;
        }
        if (!hso.cxK().cxP().czb().i(bca.cTK)) {
            return iej.a.lNN;
        }
        return this.lNS.get(n).cPz() ? iej.a.lNP : iej.a.lNO;
    }

    private int cPV() {
        int n = 0;
        for (Map.Entry<Integer, iej> entry : this.lNS.entrySet()) {
            if (!entry.getValue().isSelected()) continue;
            n += cia.aN(entry.getKey(), entry.getValue().cPy());
        }
        return n;
    }

    private void cPW() {
        if (hso.cxK().cxP().czb().dNi() != null) {
            this.b(hso.cxK().cxP().czb().dNi().abY());
        } else {
            for (Map.Entry<Integer, iej> entry : this.lNS.entrySet()) {
                entry.getValue().cPA();
            }
        }
        for (Map.Entry<Integer, iej> entry : this.lNS.entrySet()) {
            int n = entry.getKey();
            iej iej2 = entry.getValue();
            iej2.a(this.Qf(n));
        }
        int n = this.cPV();
        this.lNV.setText("" + n);
        this.cPX();
    }

    private void cPX() {
        int n = this.cPV();
        boolean bl = n > 0 && hso.cxK().cxP().czb().dNi().aaq() >= n;
        this.lNW.rF(bl);
        this.lNW.setActive(bl);
    }

    private void cPY() {
        Map.Entry<Integer, iej> entry2;
        enb enb2 = (enb)this.MessageDelegator.h(13931, this.getGUID(), hso.cxK().cxP().czb().ack());
        ArrayList<Integer> arrayList = lcn.emv();
        ArrayList<Integer> arrayList2 = lcn.emv();
        for (Map.Entry<Integer, iej> entry2 : this.lNS.entrySet()) {
            if (!entry2.getValue().isSelected()) continue;
            arrayList.add(entry2.getKey());
            arrayList2.add(((iej)entry2.getValue()).cPy());
        }
        Object object = new int[arrayList.size()];
        this.lNT = (int[])object;
        entry2 = (Map.Entry<Integer, iej>)new int[arrayList2.size()];
        for (int j = 0; j < arrayList.size(); ++j) {
            object[j] = (Integer)arrayList.get(j);
            entry2[j] = (Integer)arrayList2.get(j);
        }
        enb2.gx(hso.cxK().cxP().czb().dNu().abB());
        enb2.X((int[])object);
        enb2.Y((int[])entry2);
        this.MessageDelegator.F(enb2);
        for (Map.Entry<Integer, iej> entry3 : this.lNS.entrySet()) {
            if (!entry3.getValue().isSelected()) continue;
            entry3.getValue().a(iej.a.lNP);
        }
        this.lNV.setText("0");
        this.lNW.rF(false);
        this.lNW.setActive(false);
        iek.cxP().czx().czN();
    }

    private void b(bbx[] bbxArray) {
        if (bbxArray == null) {
            return;
        }
        for (bbx bbx2 : bbxArray) {
            this.lNS.get(bbx2.akD()).dk(bbx2.akE());
        }
    }

    private void a(enc enc2) {
        int[] nArray = enc2.bIW();
        if (this.lNT == null || this.lNT.length != nArray.length) {
            return;
        }
        block11: for (int j = 0; j < nArray.length; ++j) {
            int n = this.lNT[j];
            switch (nArray[j]) {
                case 0: {
                    this.lNS.get(n).a(iej.a.lNM);
                    continue block11;
                }
                case 1: {
                    this.lNS.get(n).a(iej.a.lNN);
                    continue block11;
                }
                case 2: {
                    this.lNS.get(n).a(iej.a.lNM);
                    continue block11;
                }
                case 3: {
                    this.lNS.get(n).a(iej.a.lNM);
                    continue block11;
                }
                case 4: {
                    this.lNS.get(n).a(iej.a.lNM);
                    continue block11;
                }
                case 5: {
                    this.lNS.get(n).a(iej.a.lNO);
                    continue block11;
                }
                case 6: {
                    this.lNS.get(n).a(iej.a.lNO);
                    continue block11;
                }
                case 7: {
                    this.lNS.get(n).a(iej.a.lNP);
                    continue block11;
                }
                case 8: {
                    this.lNS.get(n).a(iej.a.lNP);
                }
            }
        }
    }

    static /* synthetic */ void a(iek iek2) {
        iek2.cPU();
    }

    static /* synthetic */ void b(iek iek2) {
        iek2.cPY();
    }
}

