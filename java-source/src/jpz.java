/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cxd
 *  lcw
 */
import java.util.List;
import java.util.Map;

public class jpz
extends jpx {
    public static final float nQS = 0.001f;
    public static final float nQT = (float)Math.PI * 2;
    private jpr nQU = null;
    private jpw nQV = null;
    private jqg nQW = null;
    private final les nOR = lea.enS();
    private Map<Integer, Boolean> nQX = lcn.emG();
    private Map<Integer, Boolean> nQY = lcn.emG();
    private List<a> nQZ = lcn.emA();
    private Thread nRa = null;

    public jpz() {
        this.nQU = new jpr(this);
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.dQN();
        this.nQU.aH(ldz2);
    }

    @Override
    public void initialize() {
        super.initialize();
        if (lcw.qOQ && !lcw.qOR) {
            this.nQV = new jpw();
            this.nQV.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.nQV);
        }
        this.nQW = new jqg(this);
        this.nQW.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.nQW);
        if (lcw.enb() && !lcw.qGW) {
            this.dQe().nRu = true;
        }
    }

    @Override
    public void n(cew cew2) {
        if (lcw.qOQ) {
            this.nQV.cK(cew2.getGUID());
        }
        super.n(cew2);
    }

    @Override
    public void o(cew cew2) {
        if (lcw.qOQ) {
            this.nQV.cK(cew2.getGUID());
        }
        super.o(cew2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (this.dQl()) {
            return;
        }
        if (this.dQg() == jpx.a.nQF) {
            return;
        }
        if (lcw.qOQ && !lcw.qOR && this.nQV.ab(dxq2)) {
            return;
        }
        switch (dxq2.bEz()) {
            case 2818: {
                fir fir2 = (fir)dxq2;
                this.ai(fir2.ixE, fir2.iNk);
                break;
            }
            case 2817: {
                fiq fiq2 = (fiq)dxq2;
                this.Q(fiq2.ixE, fiq2.iNj);
                break;
            }
            case 2820: {
                this.dQn();
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void a(lby lby2, boolean bl) {
        if (this.nOR.isDescendant(lby2.getType(), jpq.nNM)) {
            this.b(lby2, bl);
        } else if (this.nOR.isDescendant(lby2.getType(), jpq.nNN)) {
            this.c(lby2, bl);
        } else if (this.nOR.isDescendant(lby2.getType(), jpq.nNO)) {
            this.Q(lby2.getType(), lby2.emn());
        } else if (this.nOR.isDescendant(lby2.getType(), jpq.nNP)) {
            this.nQW.e(lby2, bl);
        } else {
            this.d(lby2, bl);
        }
    }

    private void Q(int n, float f) {
        if (n == jpq.nOt) {
            this.dQe().my.y += f;
        } else if (n == jpq.nOu) {
            this.dQe().my.x += f;
        } else if (n != jpq.nOv) {
            if (n == jpq.nOw || n == jpq.nOx) {
                this.dQe().my.x = f;
            } else if (n == jpq.nOy || n == jpq.nOz) {
                this.dQe().my.y = f;
            } else if (n == jpq.nNW) {
                this.dQd().lc(f);
                this.dQd().ld(-f / 1000.0f);
            } else {
                lfn.b(5, "SFGamelogicActionHandlerOld", "checkAxisAction() Unhandled action provided: '" + this.nOR.getName(n) + "' AxisValue=" + f);
                assert (false);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void ai(int n, boolean bl) {
        lby lby2;
        block16: {
            lby2 = this.VF(n);
            if (lby2 == null) {
                lfn.b(5, "SFGamelogicActionHandlerOld", "checkBooleanAction() No ActionListItem mapped to ActionType " + n);
                return;
            }
            if (lby2.ems()) {
                if (lby2.emq() > 0.0) {
                    if (bl) {
                        assert (lby2.emo());
                        if (this.nQU.Vz(n)) {
                            return;
                        }
                        this.nQU.a(n, lby2.emq(), lby2.emr());
                        break block16;
                    } else {
                        if (lby2.emr()) {
                            this.nQU.VB(n);
                        }
                        return;
                    }
                }
                if (!(lby2.emq() < 0.0)) {
                    lfn.b(5, "SFGamelogicActionHandlerOld", "checkBooleanAction() Action '" + lby2.getName() + "' has invalid timerlength.");
                    return;
                }
                if (bl) {
                    this.nQU.a(n, lby2.emq(), lby2.emr());
                    if (!lby2.emo()) {
                        return;
                    }
                } else {
                    this.nQU.VA(n);
                    if (!lby2.emp()) {
                        return;
                    }
                }
            } else if (!lby2.emo() || !lby2.emp()) {
                lfn.b(5, "SFGamelogicActionHandlerOld", "checkBooleanAction() Action '" + lby2.getName() + "' should be triggered on both action start and stop.");
                assert (false);
                return;
            }
        }
        this.a(lby2, bl);
    }

    private lby VF(int n) {
        return (lby)this.nOR.acv(n);
    }

    private void b(lby lby2, boolean bl) {
        int n = lby2.getType();
        if (n == jpq.nNQ) {
            this.dQq();
        } else if (n == jpq.nNR) {
            this.dQr();
        } else if (n == jpq.nNS) {
            this.dQs();
        } else if (n == jpq.nNT) {
            this.dQt();
        } else if (n == jpq.nNU) {
            this.dQv();
        } else if (n == jpq.nNV) {
            this.dQu();
        } else if (n == jpq.nNX) {
            this.dQw();
        } else if (n == jpq.nNY) {
            this.dQx();
        } else if (n == jpq.nNZ) {
            this.dQz();
        } else if (n == jpq.nOb) {
            this.dQE();
        } else if (n == jpq.nOc) {
            this.dQF();
        } else if (n == jpq.nOd) {
            if (bl) {
                this.uB(false);
            }
        } else if (n == jpq.nOe) {
            this.U(this.ayp(), bl);
        } else if (n == jpq.nOf) {
            if (bl && this.dQf().aEP().aEG()) {
                this.VD(cxd.fHk);
            }
        } else {
            lfn.b(5, "SFGamelogicActionHandlerOld", "triggerCoordinatorAction() Unhandled action provided: '" + lby2.getName() + "'");
        }
    }

    private void c(lby lby2, boolean bl) {
        int n;
        ler ler2 = this.nOR.i(lby2);
        int n2 = lby2.getType();
        int n3 = n = ler2.getType();
        if (n2 == jpq.nOp || n2 == jpq.nOq || n2 == jpq.nOr || n2 == jpq.nOs) {
            n3 = n2;
        }
        if (!lby2.emp() || !lby2.emo()) {
            a a2 = new a(null);
            a2.nRc = n3;
            a2.iNk = bl;
            this.nQZ.add(a2);
        } else {
            this.nQX.put(n3, bl);
        }
        this.dQN();
    }

    private void dQN() {
        if (this.dQe().nRz.dF(this.MessageDelegator.arc().rgz)) {
            return;
        }
        for (a object : this.nQZ) {
            this.aj(object.nRc, object.iNk);
        }
        this.nQZ.clear();
        for (Integer n : this.nQX.keySet()) {
            Boolean bl = this.nQX.get(n);
            Boolean bl2 = this.nQY.get(n);
            if (bl2 == null) {
                bl2 = Boolean.FALSE;
            }
            if (bl.booleanValue() == bl2.booleanValue()) continue;
            this.aj(n, bl);
            this.nQY.put(n, bl);
        }
    }

    @Override
    public void amX() {
        for (Integer n : this.nQY.keySet()) {
            if (!this.nQY.get(n).booleanValue()) continue;
            this.aj(n, false);
        }
        this.nQY.clear();
    }

    private void aj(int n, boolean bl) {
        if (n == jpq.nOh) {
            if (this.dQg() == jpx.a.nQJ && bl) {
                this.dQp();
                return;
            }
            this.dQe().ecU[0] = bl;
            if (bl) {
                this.dQe().j(0, this.MessageDelegator.arc().rgz);
            }
        } else if (n == jpq.nOi) {
            if (this.dQg() == jpx.a.nQJ && bl) {
                this.dQp();
                return;
            }
            this.dQe().ecU[1] = bl;
            if (bl) {
                this.dQe().j(1, this.MessageDelegator.arc().rgz);
            }
            if (this.dQe().nRs && bl) {
                this.dQe().nRs = false;
            }
        } else if (n == jpq.nOj) {
            if (this.dQg() == jpx.a.nQJ && bl) {
                this.dQp();
                return;
            }
            this.dQe().ecU[2] = bl;
            if (bl) {
                this.dQe().j(2, this.MessageDelegator.arc().rgz);
            }
        } else if (n == jpq.nOk) {
            if (this.dQg() == jpx.a.nQJ && bl) {
                this.dQp();
                return;
            }
            this.dQe().ecU[3] = bl;
            if (bl) {
                this.dQe().j(3, this.MessageDelegator.arc().rgz);
            }
        } else if (n == jpq.nOl) {
            if (this.dQe().nRr && bl) {
                this.dQe().nRr = false;
                this.dQe().ecU[5] = false;
            }
            if (this.dQm()) {
                this.dQe().ecU[4] = bl;
                if (bl && this.dQf().axF().aLU().aEP().aEA()) {
                    this.dQe().j(4, this.MessageDelegator.arc().rgz);
                }
            } else if (this.dQg() == jpx.a.nQH) {
                if (bl && this.dQh().isRunning() && this.dQh().dQQ()) {
                    this.aMF();
                    this.dQh().reset();
                }
            } else if (this.dQg() == jpx.a.nQJ && bl) {
                this.dQp();
            }
        } else if (n == jpq.nOm) {
            this.dQe().ecU[5] = bl;
        } else if (n == jpq.nOn) {
            this.dQe().nRw = bl;
        } else if (n == jpq.nOo) {
            this.dQe().nRx = bl;
        } else if (n == jpq.nOp) {
            this.dQe().nRr = !this.dQe().nRr;
            this.dQe().ecU[5] = this.dQe().nRr;
        } else if (n == jpq.nOq) {
            this.dQe().nRs = !this.dQe().nRs;
        } else if (n == jpq.nOr) {
            if (this.dQf().aEP().Uv() && bl) {
                this.n(this.ayp(), 2, 1);
            }
        } else if (n == jpq.nOs && this.dQf().aEP().Uv() && bl) {
            this.n(this.ayp(), 2, 2);
        }
    }

    private void d(lby lby2, boolean bl) {
        int n = lby2.getType();
        if (n == jpq.nOB) {
            if (bl) {
                this.VD(cxd.fHR);
            } else {
                this.ah(cxd.fHR, false);
            }
        } else if (n == jpq.nOD) {
            if (bl) {
                this.VD(cxd.fJA);
            } else {
                this.ah(cxd.fJA, false);
            }
        } else if (n == jpq.nOE) {
            byv byv2 = this.dQf().aEP();
            if (byv2.Uu() || byv2.Uv()) {
                if (bl) {
                    this.N(cxd.fHm, this.dQf().aKS());
                } else {
                    this.ah(cxd.fHm, false);
                }
            } else if (bl) {
                this.dQk().jR(this.ayp());
            } else {
                this.ah(cxd.fHm, false);
            }
        } else if (n == jpq.nOA) {
            if (bl) {
                this.dQk().jQ(this.ayp());
            }
        } else if (n == jpq.nOC) {
            byv byv3 = this.dQf().aEP();
            if (!byv3.isAlive()) {
                return;
            }
            if (this.dQf() == null) {
                return;
            }
            if (this.dQf().axF() == null) {
                return;
            }
            if (this.dQf().axF().aAG() == null) {
                return;
            }
            if (bl) {
                dsu dsu2 = this.bAn();
                ljq ljq2 = this.dQf().axF().aAG().av();
                this.a(cxd.fJy, this.ayp(), dsu2.gYZ, dsu2.Za, ljq2);
            } else {
                this.ah(cxd.fJy, false);
            }
        } else if (n == jpq.nOF) {
            if (this.dQg() != jpx.a.nQF && this.dQg() != jpx.a.nQG) {
                return;
            }
            byv byv4 = this.dQf().aEP();
            if (byv4.aED() || byv4.Uu() || byv4.aEu() || byv4.aEv() || byv4.aEw() || byv4.aEx() || byv4.aEy() || byv4.aEA() || byv4.Uv() || byv4.Ow() || byv4.aEE()) {
                return;
            }
            if (bl) {
                if (!this.dQf().aEP().aEG()) {
                    this.VD(cxd.fHg);
                    Runnable runnable = new Runnable(this){
                        final /* synthetic */ jpz nRb;
                        {
                            this.nRb = jpz2;
                        }

                        public void run() {
                            try {
                                Thread.sleep(1500L);
                            }
                            catch (InterruptedException interruptedException) {
                                // empty catch block
                            }
                            while (!this.nRb.dQf().aEP().aEG()) {
                            }
                            this.nRb.VD(cxd.fHy);
                            efd efd2 = (efd)jpz.b(this.nRb).h(12809, jpz.a(this.nRb), this.nRb.ayp());
                            efd2.SkillType = cxd.fHy;
                            efd2.ios = 3;
                            efd2.ioe = cdy.eod;
                            jpz.c(this.nRb).F(efd2);
                            jpz.a(this.nRb, null);
                        }
                    };
                    if (this.nRa == null) {
                        this.nRa = new Thread(runnable);
                        this.nRa.start();
                    }
                } else {
                    this.VD(cxd.fHy);
                    efd efd2 = (efd)this.MessageDelegator.h(12809, this.GUID, this.ayp());
                    efd2.SkillType = cxd.fHy;
                    efd2.ios = 3;
                    efd2.ioe = cdy.eod;
                    this.MessageDelegator.F(efd2);
                }
            }
        } else {
            lfn.b(5, "SFGamelogicActionHandlerOld", "triggerSkillAction() Unhandled action provided: '" + lby2.getName() + "'");
            return;
        }
    }

    static /* synthetic */ ldv a(jpz jpz2) {
        return jpz2.GUID;
    }

    static /* synthetic */ dxr b(jpz jpz2) {
        return jpz2.MessageDelegator;
    }

    static /* synthetic */ dxr c(jpz jpz2) {
        return jpz2.MessageDelegator;
    }

    static /* synthetic */ Thread a(jpz jpz2, Thread thread) {
        jpz2.nRa = thread;
        return jpz2.nRa;
    }
}

