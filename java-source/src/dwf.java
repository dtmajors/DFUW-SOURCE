/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class dwf
extends btk
implements dwb,
dwe,
dwy {
    private boolean hit = false;
    private dvh hfD = null;
    private Queue<gnk> hiu = null;
    private Set<dwx> hiv = null;
    private gms hiw = null;
    private Map<String, Integer> hix = null;
    private Map<String, Set<gmw>> hiy = null;
    private Set<String> hiz = null;
    private dww hiA = null;
    private dwr hiB = null;
    private Map<Integer, dwq> hiC = null;
    private Queue<gmu> hiD = null;
    private Map<Integer, Queue<gmu>> hiE = null;
    private int hiF = 0;
    private int hiG = 0;
    private int hiH = 0;
    private int hiI = 0;
    private boolean hiJ = false;
    private dxc hiK = null;
    private Queue<gmy> hiL = null;
    private dwo hiM = null;
    private dwo hiN = null;
    private dwo hiO = null;
    private Map<Integer, dwn> hiP = null;
    private Map<Integer, Queue<dwe>> hiQ = null;
    private Map<Integer, Queue<gmw>> hiR = null;

    public dwf(dvh dvh2) {
        this.hfD = dvh2;
        this.hiv = lcn.emx();
        this.hix = lcn.emw();
        this.hiz = lcn.emx();
        this.hiP = lcn.emw();
        this.hiQ = lcn.emw();
        this.hiR = lcn.emw();
    }

    @Override
    public void initialize() {
        super.initialize();
        this.a((gmu)null);
        if (!dwh.bCC().bCD()) {
            return;
        }
        this.bCz();
    }

    private void bCz() {
        dwu dwu2 = dwu.bDK();
        dwu2.a(this);
        this.hfD.a(dwu2);
    }

    private void a(dwp dwp2) {
        if (dwh.bCC().g(dwp2)) {
            this.c(dwp2);
            return;
        }
        this.hiG = dwh.bCC().h(dwp2);
        this.hiI = dwh.bCC().j(dwp2);
        this.b(dwp2);
    }

    private void b(dwp dwp2) {
        this.hiF = dwp2.bDr();
        this.hiH = dwp2.bDt();
        if (!dwp2.bCV()) {
            this.hfD.a(dwu.l(dwp2));
        }
        this.hit = true;
        if (this.hiu != null) {
            while (!this.hiu.isEmpty()) {
                this.a(this.hiu.poll());
            }
            this.hiu = null;
        }
        this.hiK = new dxc(this.hfD, this);
        this.a(this.hiK);
        if (this.hiw != null) {
            this.a(this.hiw, 0);
            this.hiw = null;
        }
    }

    public void a(int n2, dwe dwe2, dwn.b b2) {
        dwn dwn2 = this.hiP.get(n2);
        if (dwn2 != null && dwn2.a(b2)) {
            dwe2.a(dwn2);
            return;
        }
        Queue<dwe> queue = this.hiQ.get(n2);
        if (queue == null) {
            queue = lcn.emA();
            this.hiQ.put(n2, queue);
            dws dws2 = dwn2 == null ? dws.b(n2, this.hiF, dwn.b.hkY) : dws.a(dwn2, this.hiF, b2);
            dws2.a(this);
            this.hfD.a(dws2);
        }
        if (!queue.contains(dwe2)) {
            queue.add(dwe2);
        }
    }

    private void a(int n2, gmw gmw2, dwn.b b2) {
        Queue<gmw> queue = this.hiR.get(n2);
        if (queue == null) {
            queue = lcn.emA();
            this.hiR.put(n2, queue);
            this.a(n2, this, b2);
        }
        queue.add(gmw2);
    }

    @Override
    public void a(dwn dwn2) {
        Queue<gmw> queue = this.hiR.remove(dwn2.qe());
        if (queue != null) {
            for (gmw gmw2 : queue) {
                this.hfD.receiveMessage(gmw2);
            }
        }
    }

    public int bCA() {
        return this.hiF;
    }

    private void c(dwp dwp2) {
        dxb dxb2 = new dxb(this.hfD, this, dwp2);
        dxb2.a(this);
        this.a(dxb2);
    }

    private void d(dwp dwp2) {
        dwp2.bDv();
        this.hiG = dwh.bCC().bCE();
        if (dwh.bCC().i(dwp2)) {
            this.e(dwp2);
            return;
        }
        this.hiI = dwh.bCC().j(dwp2);
        this.b(dwp2);
    }

    private void a(gne gne2) {
        if (this.hiM == null) {
            if (this.hiK == null) {
                this.hiK = new dxc(this.hfD, this);
                this.a(this.hiK);
            }
            if (gne2 != null) {
                if (this.hiL == null) {
                    this.hiL = lcn.emA();
                }
                this.hiL.add(gne2);
            }
        }
        if (gne2 != null) {
            this.a(gne2, this.hiM.CI(gne2.bWl()));
        }
    }

    private void b(gne gne2) {
        int n2 = gne2.qe();
        if (!lcr.abR((int)n2) && gne2.hl() != null) {
            int n3 = n2 = this.hix.containsKey(gne2.hl().toLowerCase()) ? this.hix.get(gne2.hl().toLowerCase()) : n2;
        }
        if (lcr.abR((int)n2)) {
            dwn dwn2 = this.hiP.get(n2);
            if (dwn2 != null && dwn2.a(dwn.b.hkZ)) {
                this.a(gne2, dwn2);
                return;
            }
            this.a(n2, gne2, dwn.b.hkZ);
            return;
        }
        if (gne2.hl() == null || gne2.hl().isEmpty() || this.hiz.contains(gne2.hl().toLowerCase())) {
            this.a(gne2, 2);
            return;
        }
        this.a((gmw)gne2);
    }

    public int bCB() {
        return this.hiH;
    }

    private void e(dwp dwp2) {
        dxa dxa2 = new dxa(this.hfD, this, dwp2);
        dxa2.a(this);
        this.a(dxa2);
    }

    private void f(dwp dwp2) {
        this.hiI = dwh.bCC().bCE() * dwh.bCC().bCF();
        this.hiJ = true;
        dwp2.bDw();
        this.b(dwp2);
    }

    private void a(gna gna2) {
        if (this.hiN == null) {
            if (this.hiK == null) {
                this.hiK = new dxc(this.hfD, this);
                this.a(this.hiK);
            }
            if (gna2 != null) {
                if (this.hiL == null) {
                    this.hiL = lcn.emA();
                }
                this.hiL.add(gna2);
            }
        }
        if (gna2 != null) {
            this.a(gna2, this.hiN.CI(gna2.bWl()));
        }
    }

    private void b(gna gna2) {
        int n2 = gna2.qe();
        if (!lcr.abR((int)n2) && gna2.hl() != null) {
            int n3 = n2 = this.hix.containsKey(gna2.hl().toLowerCase()) ? this.hix.get(gna2.hl().toLowerCase()) : n2;
        }
        if (lcr.abR((int)n2)) {
            dwn dwn2 = this.hiP.get(n2);
            if (dwn2 != null && dwn2.a(dwn.b.hla)) {
                this.a(gna2, dwn2);
                return;
            }
            this.a(n2, gna2, dwn.b.hla);
            return;
        }
        if (gna2.hl() == null || gna2.hl().isEmpty() || this.hiz.contains(gna2.hl().toLowerCase())) {
            this.a(gna2, 2);
            return;
        }
        this.a((gmw)gna2);
    }

    private void a(gnc gnc2) {
        if (this.hiO == null) {
            if (this.hiK == null) {
                this.hiK = new dxc(this.hfD, this);
                this.a(this.hiK);
            }
            if (gnc2 != null) {
                if (this.hiL == null) {
                    this.hiL = lcn.emA();
                }
                this.hiL.add(gnc2);
            }
        }
        if (gnc2 != null) {
            this.a(gnc2, this.hiO.CI(gnc2.bWl()));
        }
    }

    private void a(gmu gmu2) {
        if (this.hiB == null) {
            if (this.hiA == null) {
                this.hiA = new dww();
                this.hiA.a(this);
                this.hfD.a(this.hiA);
            }
            if (gmu2 != null) {
                if (this.hiD == null) {
                    this.hiD = lcn.emA();
                }
                this.hiD.add(gmu2);
            }
        }
        if (gmu2 != null) {
            this.a(gmu2, this.hiB.CN(gmu2.bWl()));
        }
    }

    private void b(gmu gmu2) {
        int n2 = gmu2.qe();
        if (!lcr.abR((int)n2) && gmu2.hl() != null) {
            int n3 = n2 = this.hix.containsKey(gmu2.hl().toLowerCase()) ? this.hix.get(gmu2.hl().toLowerCase()) : n2;
        }
        if (lcr.abR((int)n2)) {
            Queue<gmu> queue;
            if (this.hiC != null && this.hiC.containsKey(n2)) {
                this.a(gmu2, this.hiC.get(n2));
                return;
            }
            Queue<gmu> queue2 = queue = this.hiE == null ? null : this.hiE.get(n2);
            if (queue == null) {
                queue = lcn.emA();
                if (this.hiE == null) {
                    this.hiE = lcn.emw();
                }
                this.hiE.put(n2, queue);
                dwv dwv2 = new dwv(n2);
                dwv2.a(this);
                this.hfD.a(dwv2);
            }
            queue.add(gmu2);
            return;
        }
        if (gmu2.hl() == null || gmu2.hl().isEmpty() || this.hiz.contains(gmu2.hl().toLowerCase())) {
            this.a(gmu2, 2);
            return;
        }
        this.a((gmw)gmu2);
    }

    private void a(gmw gmw2) {
        Set<gmw> set;
        Set<gmw> set2 = set = this.hiy == null ? null : this.hiy.remove(gmw2.hl().toLowerCase());
        if (set == null) {
            this.jF(gmw2.hl());
            set = lcn.emx();
            if (this.hiy == null) {
                this.hiy = lcn.emw();
            }
            this.hiy.put(gmw2.hl().toLowerCase(), set);
        }
        set.add(gmw2);
    }

    public void a(dwx dwx2) {
        dwx2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(dwx2);
        dwx2.a(this);
        dwx2.sO();
        this.hiv.add(dwx2);
    }

    @Override
    public void b(dwx dwx2) {
        if (dwx2 instanceof dwz) {
            dwz dwz2 = (dwz)dwx2;
            if (!this.hiP.get(dwz2.bDR()).bCV()) {
                this.hfD.a(dws.b(this.hiP.get(dwz2.bDR()), this.hiF, this.hiH));
            }
            if (!this.hiP.get(dwz2.bDS()).bCV()) {
                this.hfD.a(dws.b(this.hiP.get(dwz2.bDS()), this.hiF, this.hiH));
            }
            if (this.hiC.containsKey(dwz2.bDR())) {
                this.hiC.get(dwz2.bDR()).bDD();
            }
            if (this.hiB != null) {
                this.hiB.jG(dwz2.bDT());
            }
            if (this.hiM != null) {
                this.hiM.a(this.hiP.get(dwz2.bDR()), dwz2.bDT());
                this.hiM.a(this.hiP.get(dwz2.bDS()), dwz2.bDU());
            }
        } else if (dwx2 instanceof dxb) {
            this.d(((dxb)dwx2).bDJ());
        } else if (dwx2 instanceof dxa) {
            this.f(((dxa)dwx2).bDJ());
        } else if (dwx2 instanceof dxc) {
            this.hiM = this.hiK.bDY();
            this.hiN = this.hiK.bDZ();
            this.hiO = this.hiK.bEa();
            this.hiK = null;
            if (this.hiO != null && this.hiO.bDl() != null && this.hiJ) {
                for (int i2 = 0; i2 < dwh.bCC().bCI() && i2 < this.hiO.getNames().length; ++i2) {
                    List<lfs<String, Integer>> list = dwh.bCC().CD(i2);
                    if (list.isEmpty()) continue;
                    ldv ldv2 = lcr.abW((int)this.hiO.bDl()[i2]);
                    int[] nArray = dwf.aO(list);
                    int[] nArray2 = dwf.aP(list);
                    if (ldv2 == null || nArray == null || nArray.length == 0 || nArray2 == null || nArray2.length == 0 || nArray.length != nArray2.length) {
                        lfn.b(5, this.getClass().getSimpleName(), "jobComplete() : Failed to Create Message Fields for Season Winner Rewards!!!");
                        assert (false);
                        continue;
                    }
                    this.b(ldv2, nArray, nArray2);
                }
                this.hiJ = false;
            }
        }
        this.hiv.remove(dwx2);
    }

    @Override
    public void c(dwx dwx2) {
        lfn.b(5, this.getClass().getSimpleName(), "jobFailed() : Leader-board job failed to complete its work!!!... Job = " + dwx2);
        assert (false);
    }

    private static int[] aO(List<lfs<String, Integer>> list) {
        int n2 = 0;
        int[] nArray = new int[list.size()];
        for (lfs<String, Integer> lfs2 : list) {
            nArray[n2++] = cug.hV((String)((String)lfs2.reX));
        }
        return nArray;
    }

    private static int[] aP(List<lfs<String, Integer>> list) {
        int n2 = 0;
        int[] nArray = new int[list.size()];
        for (lfs<String, Integer> lfs2 : list) {
            nArray[n2++] = (Integer)lfs2.reY;
        }
        return nArray;
    }

    @Override
    public void c(dvy dvy2) {
        if (dvy2 instanceof dwu) {
            this.a(((dwu)dvy2).bDJ());
        } else if (dvy2 instanceof dws) {
            dwn dwn2 = ((dws)dvy2).bDG();
            this.hiP.put(dwn2.qe(), dwn2);
            Queue<dwe> queue = this.hiQ.remove(dwn2.qe());
            if (queue != null) {
                for (dwe dwe2 : queue) {
                    dwe2.a(dwn2);
                }
            }
        } else if (dvy2 instanceof dwv) {
            Queue<gmu> queue;
            dwq dwq2 = ((dwv)dvy2).bDL();
            if (this.hiC == null) {
                this.hiC = lcn.emw();
            }
            this.hiC.put(dwq2.qe(), dwq2);
            Queue<gmu> queue2 = queue = this.hiE == null ? null : this.hiE.remove(dwq2.qe());
            if (queue != null) {
                for (gmu gmu2 : queue) {
                    this.a(gmu2, dwq2);
                }
            }
        } else if (dvy2 instanceof dww) {
            this.hiB = ((dww)dvy2).bDM();
            if (this.hiD != null) {
                for (gmu gmu3 : this.hiD) {
                    this.a(gmu3, this.hiB.CN(gmu3.bWl()));
                }
                this.hiD.clear();
                this.hiD = null;
            }
            this.hiA = null;
            if (!dwh.bCC().bCD()) {
                this.hit = true;
            }
        }
    }

    @Override
    public void b(dvy dvy2) {
        lfn.b(5, this.getClass().getSimpleName(), "workFailed() : Database worker failed to complete its work!!!... Worker = " + dvy2);
        assert (false);
    }

    private void b(ldv ldv2, int[] nArray, int[] nArray2) {
        fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.GUID, ldv2);
        fmz2.iQH = true;
        fmz2.iJG = true;
        fmz2.aFD = cug.fsH;
        fmz2.bqd = nArray;
        fmz2.iIY = nArray2;
        fmz2.b(bqy.dHk);
        this.MessageDelegator.F(fmz2);
    }

    private void a(gms gms2, int n2) {
        gmt gmt2 = (gmt)this.MessageDelegator.h(3620, this.GUID, gms2.aO());
        this.MessageDelegator.b(gms2, gmt2);
        gmt2.JY(n2);
        this.MessageDelegator.F(gmt2);
    }

    private void jF(String string) {
        ma ma2 = new ma();
        ma2.afj = 3;
        ma2.awJ = string;
        fvc fvc2 = (fvc)this.MessageDelegator.h(26884, this.GUID, lcr.qAN);
        fvc2.Yb = ma2;
        this.MessageDelegator.F(fvc2);
    }

    private void a(gmu gmu2, int n2) {
        gmv gmv2 = (gmv)this.MessageDelegator.h(3612, this.GUID, gmu2.aO());
        this.MessageDelegator.b(gmu2, gmv2);
        gmv2.JY(n2);
        gmv2.Jv(gmu2.bUV());
        gmv2.d(gmu2.hl());
        this.MessageDelegator.F(gmv2);
    }

    private void a(gmu gmu2, dwr dwr2) {
        gmv gmv2 = (gmv)this.MessageDelegator.h(3612, this.GUID, gmu2.aO());
        this.MessageDelegator.b(gmu2, gmv2);
        gmv2.JY(0);
        gmv2.Jv(gmu2.bUV());
        gmv2.F(dwr2.bDE());
        gmv2.ax(dwr2.bDF());
        this.MessageDelegator.F(gmv2);
    }

    private void a(gmu gmu2, dwq dwq2) {
        gmv gmv2 = (gmv)this.MessageDelegator.h(3612, this.GUID, gmu2.aO());
        this.MessageDelegator.b(gmu2, gmv2);
        gmv2.JY(0);
        gmv2.Jv(gmu2.bUV());
        gmv2.d(gmu2.hl());
        gmv2.JZ(dwq2.bDy());
        gmv2.Ka(dwq2.bDz());
        gmv2.Kb(dwq2.bDA());
        gmv2.Kc(dwq2.bDB());
        gmv2.Kd(dwq2.bDC());
        this.MessageDelegator.F(gmv2);
    }

    private void a(gne gne2, int n2) {
        gnf gnf2 = (gnf)this.MessageDelegator.h(3614, this.GUID, gne2.aO());
        this.MessageDelegator.b(gne2, gnf2);
        gnf2.JY(n2);
        gnf2.Jv(gne2.bUV());
        gnf2.d(gne2.hl());
        this.MessageDelegator.F(gnf2);
    }

    private void a(gne gne2, dwo dwo2) {
        gnf gnf2 = (gnf)this.MessageDelegator.h(3614, this.GUID, gne2.aO());
        this.MessageDelegator.b(gne2, gnf2);
        gnf2.JY(0);
        gnf2.Jv(gne2.bUV());
        gnf2.Kj(this.hiG);
        gnf2.F(dwo2.getNames());
        gnf2.aC(dwo2.bDm());
        gnf2.k(dwo2.bDn());
        this.MessageDelegator.F(gnf2);
    }

    private void a(gne gne2, dwn dwn2) {
        gnf gnf2 = (gnf)this.MessageDelegator.h(3614, this.GUID, gne2.aO());
        this.MessageDelegator.b(gne2, gnf2);
        gnf2.JY(0);
        gnf2.Jv(gne2.bUV());
        gnf2.Kj(this.hiG);
        gnf2.d(gne2.hl());
        gnf2.jq(dwn2.bCW());
        gnf2.jr(dwn2.bDe());
        gnf2.js(dwn2.bDf());
        gnf2.Kk(dwn2.bDc());
        gnf2.Kl(dwn2.bDg());
        this.MessageDelegator.F(gnf2);
    }

    private void a(gna gna2, int n2) {
        gnb gnb2 = (gnb)this.MessageDelegator.h(3616, this.GUID, gna2.aO());
        this.MessageDelegator.b(gna2, gnb2);
        gnb2.JY(n2);
        gnb2.Jv(gna2.bUV());
        gnb2.d(gna2.hl());
        this.MessageDelegator.F(gnb2);
    }

    private void a(gna gna2, dwo dwo2) {
        gnb gnb2 = (gnb)this.MessageDelegator.h(3616, this.GUID, gna2.aO());
        this.MessageDelegator.b(gna2, gnb2);
        gnb2.JY(0);
        gnb2.Jv(gna2.bUV());
        gnb2.Kf(this.hiI);
        gnb2.F(dwo2.getNames());
        gnb2.ay(dwo2.bDo());
        gnb2.az(dwo2.bDp());
        gnb2.aA(dwo2.bDq());
        this.MessageDelegator.F(gnb2);
    }

    private void a(gna gna2, dwn dwn2) {
        gnb gnb2 = (gnb)this.MessageDelegator.h(3616, this.GUID, gna2.aO());
        this.MessageDelegator.b(gna2, gnb2);
        gnb2.JY(0);
        gnb2.Jv(gna2.bUV());
        gnb2.Kf(this.hiI);
        gnb2.d(gna2.hl());
        gnb2.Kg(dwn2.bCR());
        gnb2.Kh(dwn2.bDi());
        gnb2.Ki(dwn2.bDj());
        this.MessageDelegator.F(gnb2);
    }

    private void a(gnc gnc2, dwo dwo2) {
        gnd gnd2 = (gnd)this.MessageDelegator.h(3618, this.GUID, gnc2.aO());
        this.MessageDelegator.b(gnc2, gnd2);
        gnd2.G(dwo2.getNames());
        gnd2.aB(dwo2.bDo());
        this.MessageDelegator.F(gnd2);
    }

    public boolean r(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3589: 
            case 3611: 
            case 3613: 
            case 3615: 
            case 3617: 
            case 3619: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3619: {
                this.a((gms)dxq2);
                break;
            }
            case 3589: {
                this.a((gnk)dxq2);
                break;
            }
            case 26885: {
                this.a((fvd)dxq2);
                break;
            }
            case 3611: {
                this.c((gmu)dxq2);
                break;
            }
            case 3613: {
                this.c((gne)dxq2);
                break;
            }
            case 3615: {
                this.c((gna)dxq2);
                break;
            }
            case 3617: {
                this.b((gnc)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gms gms2) {
        if (this.hiw != null) {
            this.a(gms2, 2);
            return;
        }
        switch (gms2.bUV()) {
            case 1: {
                if (!(this.hit && this.hiv.isEmpty() && this.hiy.isEmpty() && this.hiQ.isEmpty() && this.hiR.isEmpty() && this.hiE.isEmpty() && this.hiD.isEmpty() && this.hiL.isEmpty() && this.hiA == null && this.hiK == null)) {
                    this.a(gms2, 3);
                    return;
                }
                this.hit = false;
                this.hiP.clear();
                this.hiC.clear();
                this.hiB = null;
                this.hiM = null;
                this.hiN = null;
                this.hiO = null;
                this.hiw = gms2;
                this.a((gmu)null);
                this.bCz();
                break;
            }
            default: {
                this.a(gms2, 1);
            }
        }
    }

    private void a(gnk gnk2) {
        if (!dwh.bCC().bCD()) {
            if (this.hiB != null) {
                this.hiB.jG(gnk2.jng + " " + gnk2.jnf);
            }
            if (this.hiC != null && this.hiC.containsKey(gnk2.jne.enw())) {
                this.hiC.get(gnk2.jne.enw()).bDD();
            }
            return;
        }
        if (gnk2.jni || gnk2.jnl || gnk2.jnj) {
            return;
        }
        if (!this.hit) {
            if (this.hiu == null) {
                this.hiu = lcn.emA();
            }
            this.hiu.add(gnk2);
            return;
        }
        dwz dwz2 = new dwz(this.hfD, this, gnk2);
        dwz2.a(this);
        this.a(dwz2);
    }

    private void a(fvd fvd2) {
        Set<gmw> set;
        String string = fvd2.Yb.awJ;
        if (fvd2.iXC == null || fvd2.iXC.length != 1) {
            this.hiz.add(string.toLowerCase());
        } else {
            this.hix.put(string.toLowerCase(), fvd2.iXC[0].Ri.enw());
        }
        Set<gmw> set2 = set = this.hiy == null ? null : this.hiy.remove(string.toLowerCase());
        if (set == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleObjectInfoManagerLookupPlayerResponseMessage() : Response Received but No Requests Found!!!");
            assert (false);
            return;
        }
        for (gmw gmw2 : set) {
            this.hfD.receiveMessage(gmw2);
        }
    }

    private void c(gmu gmu2) {
        if (!this.hit) {
            this.a(gmu2, 3);
            return;
        }
        switch (gmu2.bUV()) {
            case 0: {
                this.a(gmu2);
                break;
            }
            case 1: {
                this.b(gmu2);
                break;
            }
            default: {
                this.a(gmu2, 1);
            }
        }
    }

    private void c(gne gne2) {
        if (!this.hit) {
            this.a(gne2, 3);
            return;
        }
        switch (gne2.bUV()) {
            case 0: {
                this.a(gne2);
                break;
            }
            case 1: {
                this.b(gne2);
                break;
            }
            default: {
                this.a(gne2, 1);
            }
        }
    }

    private void c(gna gna2) {
        if (!this.hit) {
            this.a(gna2, 3);
            return;
        }
        switch (gna2.bUV()) {
            case 0: {
                this.a(gna2);
                break;
            }
            case 1: {
                this.b(gna2);
                break;
            }
            default: {
                this.a(gna2, 1);
            }
        }
    }

    private void b(gnc gnc2) {
        this.a(gnc2);
    }
}

