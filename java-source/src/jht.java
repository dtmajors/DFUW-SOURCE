/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class jht
extends iho {
    public static final int nfv = 10;
    static final String nfw = "Slot";
    static final String nfx = "SlotType";
    static final String nfy = "Opened";
    static final String nfz = "KeepRepeatables";
    static final String nfA = "SuggestionPopup";
    static final String nfB = "ProgressUpdateAudio";
    private ipx nfC;
    private jhk nfD;
    private ipx lWp;
    private Map<ign, jhh> lVM = lcn.emw();
    private ign nfE;
    private ign nfF;
    private Map<jch, jhm> nfG = lcn.emw();
    private jch nfH;
    private boolean nfI = true;
    private static final int nfJ = 4;
    private Map<ign, jhg> nfK = lcn.emw();
    private jhl nfq = new jhl();

    public jht() {
        super("TrackerWindow", "TrackerWindow.swf");
        this.OQ(jnz.nGe | jnz.nGi);
        for (int j = 0; j < 10; ++j) {
            this.a(nfw + j, hsu.ldg, (Integer)-1);
            this.a(nfx + j, hsu.ldg, "");
        }
        this.a(nfy, hsu.ldg, false);
        this.a(nfz, hsu.ldg, true);
        this.a(nfA, hsu.ldg, true);
        this.a(nfB, hsu.ldg, true);
    }

    @Override
    public void initialize() {
        super.initialize();
        igq.lTF.a((jli<List<ign>, List<ign>, List<ign>, Boolean>)new jlu<jht, List<ign>, List<ign>, List<ign>, Boolean>(this, this){
            final /* synthetic */ jht nfL;
            {
                this.nfL = jht2;
                super(jht3);
            }

            public void b(jht jht2, List<ign> list, List<ign> list2, List<ign> list3, Boolean bl) {
                jht.a(jht2, list, list2, list3, bl);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3, Object object4, Object object5) {
                this.b((jht)object, (List)object2, (List)object3, (List)object4, (Boolean)object5);
            }
        });
        igq.lTG.c((jlf<ign>)new jlr<jht, ign>(this, this){
            final /* synthetic */ jht nfL;
            {
                this.nfL = jht2;
                super(jht3);
            }

            public void c(jht jht2, ign ign2) {
                jht.a(jht2, ign2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((jht)object, (ign)object2);
            }
        });
        igq.lTH.c((jlf<ign>)new jlr<jht, ign>(this, this){
            final /* synthetic */ jht nfL;
            {
                this.nfL = jht2;
                super(jht3);
            }

            public void c(jht jht2, ign ign2) {
                jht.b(jht2, ign2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((jht)object, (ign)object2);
            }
        });
        jcc.dwT().mQJ.c((jlf<jch>)new jlr<jht, jch>(this, this){
            final /* synthetic */ jht nfL;
            {
                this.nfL = jht2;
                super(jht3);
            }

            public void b(jht jht2, jch jch2) {
                jht.a(jht2, jch2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((jht)object, (jch)object2);
            }
        });
    }

    @Override
    public boolean isOpen() {
        return this.nk(nfy);
    }

    public void setOpen(boolean bl) {
        if (bl == this.nk(nfy)) {
            return;
        }
        this.q(nfy, bl);
        this.setVisible(bl);
        if (bl) {
            this.cqF();
            this.cFc();
            jht.cyJ().cHw().d(hyc.lmX, false);
        }
    }

    public boolean dGC() {
        return !this.lVM.isEmpty() || !this.nfK.isEmpty() || !this.nfG.isEmpty();
    }

    public int dGD() {
        return this.lVM.size();
    }

    public boolean dGE() {
        return this.dGD() < 10;
    }

    public boolean a(ign ign2, boolean bl) {
        boolean bl2 = false;
        if (bl) {
            if (this.dGE()) {
                ign2.qf(true);
                bl2 = true;
            }
        } else if (ign2.cTZ() && !this.x(ign2)) {
            ign2.qf(false);
            bl2 = true;
        }
        return bl2;
    }

    public boolean x(ign ign2) {
        return ign2 == this.nfF;
    }

    public boolean czO() {
        return this.nfq.nfb;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.cXM().a(0, 0, 0, lyx.sXP.bD(new Object[0]));
        this.f(new ipb("title_header_tracker"));
        ipx ipx2 = ipx.l(new ipf[0]);
        this.cXE().W(ipx2);
        ipx ipx3 = ipx.j(new ipf[0]);
        ipx2.W(ipx3);
        this.nfC = ipx.j(new ipf[0]);
        ipx3.W(this.nfC);
        this.nfD = new jhk(this){
            final /* synthetic */ jht nfL;
            {
                this.nfL = jht2;
            }

            public void sB(boolean bl) {
                jht.a(this.nfL, bl);
            }
        };
        ipx3.W(this.nfD);
        this.lWp = ipx.a(6, 1, new ipf[0]);
        ipx2.W(this.lWp);
        Collection<ign> collection = igq.cUh();
        for (ign object2 : collection) {
            if (object2.cTZ() && !this.lVM.containsKey(object2)) {
                this.u(object2);
            }
            if (!object2.cUb() || this.nfK.containsKey(object2)) continue;
            this.u(object2);
        }
        Collection<jcd> collection2 = jcc.dwT().dwU().values();
        Iterator iterator = collection2.iterator();
        while (iterator.hasNext()) {
            Object object;
            jcd jcd2 = (jcd)iterator.next();
            List<jci> list = jcd2.dxc();
            for (jci jci2 : list) {
                object = jci2.wr();
                Iterator<jch> iterator2 = object.iterator();
                while (iterator2.hasNext()) {
                    jch jch2 = iterator2.next();
                    if (!jch2.dxw() || this.nfG.containsKey(jch2)) continue;
                    this.g(jch2);
                }
            }
            List<jch> list2 = jcd2.wr();
            Iterator iterator3 = list2.iterator();
            while (iterator3.hasNext()) {
                object = (jch)iterator3.next();
                if (!((jch)object).dxw() || this.nfG.containsKey(object)) continue;
                this.g((jch)object);
            }
        }
        this.pack();
    }

    @Override
    protected void cGQ() {
        super.cGQ();
        int n = 0;
        for (int j = 0; j < 10; ++j) {
            Object object;
            int n2 = this.nh(nfw + j);
            if (n2 < 0) continue;
            String string = this.nj(nfx + j);
            if (lhn.equal(string, "Feat")) {
                object = igq.QK(n2);
                if (object == null || ((ign)object).isCompleted() && !((ign)object).cTT()) continue;
                ((ign)object).qf(true);
                ++n;
                continue;
            }
            if (!lhn.equal(string, "Quest") || (object = (jch)jcc.dwT().TO(n2)) == null || ((jch)object).isCompleted()) continue;
            ((jch)object).sX(true);
            ++n;
        }
        if (this.nfE != null) {
            if (this.nfE.cTZ()) {
                this.b(this.nfE, false);
            }
            this.nfE = null;
        }
        if (this.nfH != null) {
            if (this.nfH.dxw()) {
                this.a(this.nfH, false);
            }
            this.nfH = null;
        }
        this.dGF();
        this.nfq.neZ = this.nk(nfz);
        this.nfq.nfa = this.nk(nfA);
        this.nfq.nfb = this.nk(nfB);
        if (hso.cxK().cxP().czx() != null) {
            hso.cxK().cxP().czx().oU(this.nfq.nfb);
        }
        this.nfC.setVisible(this.nfq.nfa);
        this.pack();
        this.nfI = false;
        jht.cyJ().cHw().a(hyc.lmX, this.nk(nfy));
        jht.cyJ().cHw().c(hyc.lmX, this.dGC());
    }

    @Override
    protected void cGo() {
        super.cGo();
        this.qU(true);
        this.Z(this.cEE(), 250.0f);
        this.setOpen(true);
        jht.cyJ().cHw().c(hyc.lmX, this.dGC());
        this.ql(true);
        this.nfI = false;
    }

    @Override
    protected void ku(float f2) {
        super.ku(f2);
        Collection<jhg> collection = this.nfK.values();
        for (jhg jhg2 : collection) {
            jhg2.kh(f2);
        }
        if (this.nfD != null) {
            this.nfD.kh(f2);
        }
    }

    @Override
    protected void cGR() {
        jht.cyJ().cHw().a(hyc.lmX, false);
    }

    @Override
    protected void cds() {
        super.cds();
        this.pack();
    }

    @Override
    protected boolean a(hzk hzk2, ifg ifg2, String string) {
        hwn hwn2;
        ifh ifh2;
        if (super.a(hzk2, ifg2, string)) {
            return true;
        }
        if (!this.dGE()) {
            return false;
        }
        return ifg2 instanceof ifh && (ifh2 = (ifh)ifg2).cQm() instanceof hwn && !(hwn2 = (hwn)ifh2.cQm()).cBm().cTZ() && !hwn2.cBm().isLocked() && !hwn2.cBm().isCompleted();
    }

    @Override
    protected boolean b(hzk hzk2, ifg ifg2, String string) {
        hwn hwn2;
        ifh ifh2;
        if (super.b(hzk2, ifg2, string)) {
            return true;
        }
        if (!this.dGE()) {
            return false;
        }
        if (ifg2 instanceof ifh && (ifh2 = (ifh)ifg2).cQm() instanceof hwn && !(hwn2 = (hwn)ifh2.cQm()).cBm().cTZ() && !hwn2.cBm().isLocked() && !hwn2.cBm().isCompleted()) {
            hwn2.cBm().qf(true);
            igk.cTi();
        }
        return false;
    }

    @Override
    protected void l(joa joa2) {
        jhs jhs2 = new jhs(this, this, joa2, this.nfq){
            final /* synthetic */ jht nfL;
            {
                this.nfL = jht2;
                super(ioa2, joa2, jhl2);
            }

            public void b(jhl jhl2) {
                this.nfL.c(jhl2);
            }
        };
        jhs2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)((Object)jhs2));
    }

    private void a(List<ign> list, List<ign> list2, List<ign> list3, Boolean bl) {
        jhf jhf2;
        for (ign ign2 : list) {
            if (ign2.cTU() == null || (jhf2 = (jhf)this.lVM.get(ign2.cTU())) == null) continue;
            jhf2.m(ign2);
        }
        for (ign ign2 : list2) {
            jhg jhg2;
            if (!ign2.cTM()) continue;
            jhf2 = this.lVM.get(ign2);
            if (jhf2 != null) {
                jhf2.tv(true);
            }
            if (ign2.cTI() == igm.lSL && !ign2.isCompleted()) {
                this.nfF = ign2;
                ign2.qf(true);
            }
            if (!bl.booleanValue() && ign2.cUa() && ign2.cTI() != igm.lSL) {
                ign2.qg(true);
            }
            if ((jhg2 = this.nfK.get(ign2)) == null) continue;
            jhg2.tv(true);
        }
        for (ign ign2 : list3) {
            if (ign2.cTM()) {
                if (!ign2.cTT() || !this.nfq.neZ) {
                    ign2.qf(false);
                } else {
                    jhf2 = this.lVM.get(ign2);
                    if (jhf2 != null) {
                        ((jhh)jhf2).dFS();
                    }
                }
                if (this.x(ign2)) {
                    this.nfF = null;
                }
                ign2.qg(false);
            }
            if (ign2.cTU() == null || (jhf2 = (jhf)this.lVM.get(ign2.cTU())) == null) continue;
            jhf2.m(ign2);
        }
    }

    private void u(ign ign2) {
        if (!ign2.cTM()) {
            return;
        }
        if (ign2.cTZ()) {
            if (this.nfD != null) {
                this.b(ign2, true);
            } else {
                this.nfE = ign2;
            }
            if (!this.nfI) {
                if (!jht.cyJ().cHw().a(hyc.lmX)) {
                    jht.cyJ().cHw().c(hyc.lmX, true);
                    jht.cyJ().cHw().d(hyc.lmX, true);
                }
                if (ign2.cTI() == igm.lSL) {
                    jht.cyJ().cHw().a(hyc.lmX, true);
                }
            }
        } else {
            jhh jhh2 = this.lVM.remove(ign2);
            if (jhh2 == null) {
                return;
            }
            this.nfD.d(jhh2);
            if (this.x(ign2)) {
                this.nfF = null;
            }
            if (!this.dGC()) {
                jht.cyJ().cHw().a(hyc.lmX, false);
                jht.cyJ().cHw().c(hyc.lmX, false);
            }
            this.dGF();
        }
        this.pack();
    }

    private void y(ign ign2) {
        if (this.nfC == null) {
            return;
        }
        if (ign2.cUb()) {
            this.z(ign2);
        } else {
            jhg jhg2 = this.nfK.remove(ign2);
            if (jhg2 != null) {
                jhg2.removeFromParent();
                if (this.nfC.bfn() > 0) {
                    jhg jhg3 = (jhg)this.nfC.RO(this.nfC.bfn() - 1);
                    jhg3.tu(true);
                }
            }
            if (!this.dGC()) {
                jht.cyJ().cHw().a(hyc.lmX, false);
                jht.cyJ().cHw().c(hyc.lmX, false);
            }
        }
        this.pack();
    }

    private void g(jch jch2) {
        if (jch2.dxw()) {
            if (this.nfD != null) {
                this.a(jch2, true);
            } else {
                this.nfH = jch2;
            }
            if (!this.nfI && !jht.cyJ().cHw().a(hyc.lmX)) {
                jht.cyJ().cHw().c(hyc.lmX, true);
                jht.cyJ().cHw().d(hyc.lmX, true);
            }
        } else {
            jhm jhm2 = this.nfG.remove(jch2);
            if (jhm2 == null) {
                return;
            }
            this.nfD.d(jhm2);
            if (!this.dGC()) {
                jht.cyJ().cHw().a(hyc.lmX, false);
                jht.cyJ().cHw().c(hyc.lmX, false);
            }
            this.dGF();
        }
        this.pack();
    }

    private void b(ign ign2, boolean bl) {
        if (ign2 == this.nfE) {
            this.nfE = null;
        }
        boolean bl2 = this.x(ign2);
        jhh jhh2 = new jhh(ign2, bl2);
        this.lVM.put(ign2, jhh2);
        List<iua> list = this.nfD.sU();
        if (!this.x(ign2)) {
            this.nfD.c(jhh2);
        } else {
            if (list.size() == 10) {
                jhj jhj2 = (jhj)list.get(list.size() - 1);
                jhj2.cGR();
            }
            this.nfD.b(jhh2, 0);
            jhh2.setSelected(true);
        }
        jhh2.kh(this.cXR());
        this.nfD.e(jhh2);
        this.pack();
        if (bl) {
            this.dGF();
        }
    }

    private void z(ign ign2) {
        jhg jhg2 = this.nfK.get(ign2);
        if (jhg2 == null) {
            jhg2 = new jhg(ign2);
            jhg2.kh(this.cXR());
            this.nfK.put(ign2, jhg2);
            this.nfC.c(jhg2, 0);
            if (this.nfC.bfn() > 4) {
                jhg jhg3 = (jhg)this.nfC.RO(this.nfC.bfn() - 1);
                jhg3.cUF().qg(false);
            }
            jhg2.tu(true);
        } else {
            jhg2.dFL();
        }
        if (!jht.cyJ().cHw().a(hyc.lmX)) {
            jht.cyJ().cHw().c(hyc.lmX, true);
            jht.cyJ().cHw().d(hyc.lmX, true);
        }
    }

    private void a(jch jch2, boolean bl) {
        jhm jhm2 = new jhm(jch2);
        this.nfG.put(jch2, jhm2);
        List<iua> list = this.nfD.sU();
        this.nfD.c(jhm2);
        jhm2.kh(this.cXR());
        this.nfD.e(jhm2);
        this.pack();
        if (bl) {
            this.dGF();
        }
    }

    private void dGF() {
        if (this.nfI) {
            return;
        }
        List<iua> list = this.nfD.sU();
        int n = 0;
        int n2 = 0;
        for (iua iua2 : list) {
            jhi jhi2;
            if (iua2 instanceof jhf) {
                jhi2 = (jhf)iua2;
                if (n > 0 || ((jhf)jhi2).cUF().cTI() != igm.lSL || ((jhf)jhi2).cUF().isCompleted()) {
                    n2 = this.y(n2, ((jhf)jhi2).dFz(), ((jhf)jhi2).dFA());
                }
            } else if (iua2 instanceof jhm) {
                jhi2 = (jhm)iua2;
                n2 = this.y(n2, ((jhm)jhi2).dFz(), ((jhm)jhi2).dFA());
            }
            ++n;
        }
        while (n2 < 10) {
            n2 = this.y(n2, -1, "");
        }
    }

    private int y(int n, int n2, String string) {
        this.w(nfw + n, n2);
        this.B(nfx + n, string);
        return n + 1;
    }

    private void tw(boolean bl) {
        int n;
        int n2 = n = bl ? 0 : 6;
        if (n != this.dhN()) {
            this.Rz(n);
            this.cEq();
            this.pack();
        }
    }

    protected void c(jhl jhl2) {
        if (this.nfq.a(jhl2)) {
            return;
        }
        this.nfq = jhl2.dGi();
        if (!this.nfq.neZ) {
            ArrayList<ign> arrayList = lcn.emv();
            arrayList.addAll(this.lVM.keySet());
            for (ign ign2 : arrayList) {
                if (!ign2.cTT() || !ign2.isCompleted()) continue;
                ign2.qf(false);
            }
        }
        this.nfC.setVisible(this.nfq.nfa);
        hso.cxK().cxP().czx().oU(jhl2.nfb);
        this.q(nfz, this.nfq.neZ);
        this.q(nfA, this.nfq.nfa);
        this.q(nfB, this.nfq.nfb);
        this.pack();
    }

    static /* synthetic */ void a(jht jht2, List list, List list2, List list3, Boolean bl) {
        jht2.a(list, list2, list3, bl);
    }

    static /* synthetic */ void a(jht jht2, ign ign2) {
        jht2.u(ign2);
    }

    static /* synthetic */ void b(jht jht2, ign ign2) {
        jht2.y(ign2);
    }

    static /* synthetic */ void a(jht jht2, jch jch2) {
        jht2.g(jch2);
    }

    static /* synthetic */ void a(jht jht2, boolean bl) {
        jht2.tw(bl);
    }
}

