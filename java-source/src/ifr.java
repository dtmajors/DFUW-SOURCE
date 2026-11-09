/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ifr
extends hzk
implements hvx,
hwf,
hyy.c,
jjf {
    private ifo lRN = ifo.lRC;
    private HashMap<hyy.b, ifp> lRO = new HashMap();
    private int loG = 0;
    private int loH = 0;
    private boolean lRP = false;
    private boolean lRQ = false;
    private ljq lRR = new ljq(Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE);
    private String lRS = "";
    private ign lRT = null;
    private ArrayList<ifu> lRU = new ArrayList();
    private ArrayList<ift> lRV = new ArrayList();
    private float lRW = -100.0f;
    private float lRX = 0.0f;
    private int lRY = 0;

    public ifr() {
        super("feats", "feats.swf");
        this.OQ(jnz.nGt);
        this.a(hyb.lmC);
        for (igm igm2 : igm.values()) {
            hyy.b b2 = igm2.cTj();
            if (b2 == null) continue;
            this.lRO.put(b2, new ifp(igm2.ym()));
        }
        this.cST();
    }

    public void initialize() {
        super.initialize();
        ifr.cyJ().cHx().a(hyy.a.lru, this);
        ifr.cyJ().cHx().a(hyy.b.lsn, 1);
        hso.cxK().cxT().a((jjf)this);
        hso.cxK().cxP().cyZ().a((hwf)this);
        hso.cxK().cxP().cyZ().a((hvx)this);
        igq.lTF.a((jli<List<ign>, List<ign>, List<ign>, Boolean>)new jlu<ifr, List<ign>, List<ign>, List<ign>, Boolean>(this, this){
            final /* synthetic */ ifr lRZ;
            {
                this.lRZ = ifr2;
                super(ifr3);
            }

            public void b(ifr ifr2, List<ign> list, List<ign> list2, List<ign> list3, Boolean bl) {
                ifr.a(this.lRZ, list, list2, list3, bl);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3, Object object4, Object object5) {
                this.b((ifr)object, (List)object2, (List)object3, (List)object4, (Boolean)object5);
            }
        });
    }

    public void cleanUp() {
        super.cleanUp();
        if (ifr.cyJ() != null && ifr.cyJ().cHx() != null) {
            ifr.cyJ().cHx().b(hyy.a.lru);
        }
        if (hso.cxK() != null && hso.cxK().cxT() != null) {
            hso.cxK().cxT().b((jjf)this);
        }
        if (ifr.cxP() != null && ifr.cxP().cyZ() != null) {
            ifr.cxP().cyZ().b((hwf)this);
            ifr.cxP().cyZ().b((hvx)this);
        }
    }

    @Override
    public boolean cGG() {
        return true;
    }

    @Override
    public boolean cGH() {
        return true;
    }

    public ign QK(int n) {
        return igq.QK(n);
    }

    @Override
    public void b(hyy.b b2, int n) {
        switch (b2) {
            case lsk: {
                ifr.cyJ().cHw().a(hyc.lmQ, false);
                return;
            }
            case lsm: {
                ifr.cyJ().cHx().c(b2, false);
                ifr.cyJ().cHw().d(hyc.lmQ, this.cSV());
                this.lRN = ifo.lRC;
                this.cSQ();
                this.cSP();
                break;
            }
            case lsn: {
                this.lRN = ifo.lRD;
                this.cSQ();
                this.cSP();
                break;
            }
            case lso: {
                ifr.cyJ().cHx().c(b2, false);
                ifr.cyJ().cHw().d(hyc.lmQ, this.cSV());
                this.lRN = ifo.lRE;
                this.cSQ();
                this.cSP();
                break;
            }
            case lsq: 
            case lsr: 
            case lss: 
            case lst: 
            case lsu: 
            case lsv: 
            case lsw: 
            case lsx: 
            case lsy: 
            case lsz: {
                ifp ifp2 = this.lRO.get((Object)b2);
                ifp2.setActive(n != 0);
                this.cSP();
            }
        }
    }

    @Override
    public void a(jjj jjj2) {
    }

    @Override
    public void a(jjh jjh2) {
    }

    @Override
    public void b(jjh jjh2) {
    }

    @Override
    public void c(jjh jjh2) {
    }

    @Override
    public void d(jjh jjh2) {
    }

    @Override
    public void e(jjh jjh2) {
    }

    @Override
    public void f(jjh jjh2) {
    }

    @Override
    public void g(jjh jjh2) {
    }

    @Override
    public void h(jjh jjh2) {
    }

    @Override
    public void a(jjh jjh2, jko jko2) {
    }

    @Override
    public void b(jjh jjh2, jko jko2) {
    }

    @Override
    public void cSL() {
        this.cSP();
    }

    @Override
    public void cSM() {
        this.cSP();
    }

    @Override
    public void cSN() {
    }

    @Override
    public void cSO() {
    }

    @Override
    public void a(jjh jjh2, String string, String string2) {
    }

    @Override
    public void cf(cxc cxc2) {
    }

    @Override
    public void ck(cxc cxc2) {
    }

    @Override
    public void cl(cxc cxc2) {
        float f = this.cSU();
        if (Math.abs(f - this.lRW) >= this.lRX) {
            this.lRW = f;
        }
    }

    @Override
    public void a(cxc cxc2, float f, double d2) {
    }

    @Override
    public void c(cxc cxc2, boolean bl) {
    }

    @Override
    public void a(bsh bsh2, cxc cxc2) {
    }

    @Override
    public void czV() {
    }

    @Override
    public void q(ej ej2) {
        switch (ej2.getType()) {
            default: 
        }
    }

    public hyn s(int n, int n2, String string) {
        hwk hwk2 = new hwk(string);
        if (hwk2.getPrefix().equals("playerpoints") && hwk2.getId() >= 0) {
            int n3 = (int)((double)this.cEE() + hwk2.cBe()) - 4;
            int n4 = (int)((double)this.cEF() + hwk2.cBf()) + 1;
            int n5 = (int)hwk2.getX();
            int n6 = (int)hwk2.getY();
            String string2 = lww.sYh.bD(new Object[0]).exA().toUpperCase();
            return new hzz(n3, n4, n5, n6, true, string2);
        }
        return null;
    }

    public void cSP() {
        if (!this.cDj()) {
            return;
        }
        if (!this.cEU()) {
            return;
        }
        this.cSS();
        ArrayList<ign> arrayList = new ArrayList<ign>();
        List list = null;
        switch (this.lRN) {
            case lRC: {
                for (ign ign2 : igq.cUh()) {
                    if (ign2.isCompleted() || ign2.isLocked() || !ign2.cTM() || !ign2.cTN() || !this.f(ign2)) continue;
                    arrayList.add(ign2);
                }
                Collections.sort(arrayList, new Comparator<ign>(this){
                    final /* synthetic */ ifr lRZ;
                    {
                        this.lRZ = ifr2;
                    }

                    public int a(ign ign2, ign ign3) {
                        return ign2.cTx() > ign3.cTx() ? -1 : (ign2.cTx() < ign3.cTx() ? 1 : 0);
                    }

                    public /* synthetic */ int compare(Object object, Object object2) {
                        return this.a((ign)object, (ign)object2);
                    }
                });
                list = arrayList.subList(0, arrayList.size());
                break;
            }
            case lRD: {
                for (ign ign2 : igq.cUh()) {
                    if (ign2.isCompleted() || !ign2.cTM() || !ign2.cTN() || ign2.isLocked() && ign2.cTy() || !this.f(ign2)) continue;
                    arrayList.add(ign2);
                }
                Collections.sort(arrayList, new Comparator<ign>(this){
                    final /* synthetic */ ifr lRZ;
                    {
                        this.lRZ = ifr2;
                    }

                    public int a(ign ign2, ign ign3) {
                        if (ign2.cTq().eyG < ign3.cTq().eyG) {
                            return -1;
                        }
                        if (ign2.cTq().eyG > ign3.cTq().eyG) {
                            return 1;
                        }
                        if (ign2.cTq().eyL < ign3.cTq().eyL) {
                            return -1;
                        }
                        if (ign2.cTq().eyL > ign3.cTq().eyL) {
                            return 1;
                        }
                        if (ign2.cTq().adk < ign3.cTq().adk) {
                            return -1;
                        }
                        if (ign2.cTq().adk > ign3.cTq().adk) {
                            return 1;
                        }
                        return 0;
                    }

                    public /* synthetic */ int compare(Object object, Object object2) {
                        return this.a((ign)object, (ign)object2);
                    }
                });
                list = arrayList.subList(0, arrayList.size());
                break;
            }
            case lRE: {
                for (ign ign2 : igq.cUh()) {
                    if (!ign2.isCompleted() || !ign2.cTM() || !this.f(ign2)) continue;
                    arrayList.add(ign2);
                }
                Collections.sort(arrayList, new Comparator<ign>(this){
                    final /* synthetic */ ifr lRZ;
                    {
                        this.lRZ = ifr2;
                    }

                    public int a(ign ign2, ign ign3) {
                        if (ign2.qc() < ign3.qc()) {
                            return 1;
                        }
                        if (ign2.qc() > ign3.qc()) {
                            return -1;
                        }
                        return 0;
                    }

                    public /* synthetic */ int compare(Object object, Object object2) {
                        return this.a((ign)object, (ign)object2);
                    }
                });
                list = arrayList.subList(0, arrayList.size());
                break;
            }
            default: {
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = false;
        for (ign ign3 : list) {
            if (bl) {
                stringBuilder.append(';');
            }
            stringBuilder.append(ign3.getId());
            bl = true;
        }
        String string = stringBuilder.toString();
        if (string.equals(this.lRS)) {
            return;
        }
        this.lRS = string;
        this.h((ign)null);
        this.a("setFeatItemList", new Object[]{string});
    }

    protected void cBa() {
        super.cBa();
        for (Map.Entry<hyy.b, ifp> object : this.lRO.entrySet()) {
            ifr.cyJ().cHx().a(object.getKey(), object.getValue().isActive() ? 1 : 0);
        }
        switch (this.lRN) {
            case lRC: {
                ifr.cyJ().cHx().a(hyy.b.lsm, 1);
                break;
            }
            case lRD: {
                ifr.cyJ().cHx().a(hyy.b.lsn, 1);
                break;
            }
            case lRE: {
                ifr.cyJ().cHx().a(hyy.b.lso, 1);
            }
        }
        for (Map.Entry<hyy.b, ifp> entry : this.lRO.entrySet()) {
            ifr.cyJ().cHx().a(entry.getKey(), entry.getValue().isActive() ? 1 : 0);
        }
        this.cSQ();
        this.h(this.lRT);
        this.cSR();
        for (ign ign2 : igq.cUh()) {
            this.a("addFeat", new Object[]{ign2.getId(), ign2.cTt(), ign2.cTF(), ign2.getTitle().toUpperCase(), ign2.getDescription().toUpperCase(), ign2.isLocked(), ign2.cTy(), ign2.cBj()});
        }
        for (ign ign3 : igq.cUh()) {
            for (ign ign4 : ign3.cTz()) {
                this.a("addChildFeat", new Object[]{ign3.getId(), ign4.getId()});
            }
            for (ign ign4 : ign3.cTC()) {
                if (!ign4.cTM()) continue;
                this.a("addUnlocksFeat", new Object[]{ign3.getId(), ign4.getId()});
            }
        }
        for (ign ign5 : igq.cUh()) {
            if (ign5.isLocked()) continue;
            this.i(ign5);
        }
        for (ign ign6 : igq.cUh()) {
            this.a("setFeatExpandable", new Object[]{ign6.getId(), ign6.cTL()});
            if (!ign6.isExpanded()) continue;
            this.a("setFeatExpanded", new Object[]{ign6.getId(), true});
        }
        this.cSP();
    }

    @Override
    protected boolean og(String string) {
        hwl hwl2 = new hwl(string);
        ign ign2 = this.QK(hwl2.cck);
        return ign2 != null && !ign2.isLocked() && !ign2.isCompleted();
    }

    @Override
    protected ifg of(String string) {
        hwl hwl2 = new hwl(string);
        ign ign2 = this.QK(hwl2.cck);
        if (ign2 == null || ign2.isLocked() || ign2.isCompleted()) {
            return null;
        }
        ifh ifh2 = new ifh(ign2.cTs(), hwl2.lir, hwl2.lis);
        this.lRP = true;
        return ifh2;
    }

    @Override
    protected void d(ifg ifg2) {
        this.lRP = false;
    }

    @Override
    protected void a(ifg ifg2, hzk hzk2) {
        this.lRP = false;
    }

    protected void i(int n, int n2, String string) {
        hwl hwl2 = new hwl(string);
        ign ign2 = this.QK(hwl2.cck);
        if (ign2 == null) {
            return;
        }
        ifr.cyJ().cHS().QG(hwl2.cck);
    }

    protected void g(int n, int n2, String string) {
        this.loG = n;
        this.loH = n2;
    }

    protected void e(int n, int n2, String string) {
        if (this.lRP) {
            return;
        }
        if (Math.abs(this.loG - n) > 5) {
            return;
        }
        if (Math.abs(this.loH - n2) > 5) {
            return;
        }
        if (string == null) {
            return;
        }
        if (!string.startsWith("feat")) {
            return;
        }
        string = string.substring(5);
        hwl hwl2 = new hwl(string);
        ign ign2 = this.QK(hwl2.cck);
        if (ign2 == null) {
            return;
        }
        this.h(ign2);
        if (!ign2.cTL()) {
            return;
        }
        ign2.setExpanded(!ign2.isExpanded());
        this.a("setFeatExpanded", new Object[]{ign2.getId(), ign2.isExpanded()});
    }

    private void cSQ() {
        switch (this.lRN) {
            case lRC: {
                this.a("setTitle", new Object[]{lww.tiI.bD(new Object[0]).exA()});
                break;
            }
            case lRD: {
                this.a("setTitle", new Object[]{lww.tiJ.bD(new Object[0]).exA()});
                break;
            }
            case lRE: {
                this.a("setTitle", new Object[]{lww.tiK.bD(new Object[0]).exA()});
            }
        }
    }

    private boolean f(ign ign2) {
        for (ifp ifp2 : this.lRO.values()) {
            if (!ifp2.e(ign2)) continue;
            return true;
        }
        return false;
    }

    private void g(ign ign2) {
        ign2.cTJ();
        for (ifp ifp2 : this.lRO.values()) {
            if (!ifp2.e(ign2)) continue;
            ign2.kD(ifp2.getWeight());
        }
    }

    private void cSR() {
        if (this.lRQ) {
            return;
        }
        this.lRQ = true;
        les les2 = lea.enW();
        for (int n : igj.lSw) {
            for (igh igh2 : igj.lSv) {
                for (int n2 : igh2.cTf()) {
                    HashSet<igh> hashSet;
                    if (!les2.isDescendant(n2, n)) continue;
                    if (!igh2.cTd()) {
                        hashSet = igj.lSx.get(n);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            igj.lSx.put(n, hashSet);
                        }
                        hashSet.add(igh2);
                        continue;
                    }
                    hashSet = igj.lSy.get(n);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        igj.lSy.put(n, hashSet);
                    }
                    hashSet.add(igh2);
                }
            }
        }
    }

    private void cSS() {
        ljq ljq2 = hso.cxK().cxT().oB();
        boolean bl = hso.cxK().cxT().dIU().cTd();
        ljq ljq3 = new ljq();
        ifk.cSn();
        for (ign ign2 : igq.cUh()) {
            float f = ifk.a(ljq2, bl, ign2.cTq(), ljq3);
            if (f >= 0.0f) {
                boolean bl2 = !ign2.av().equals(ljq3);
                ign2.kE(f);
                ign2.c(ljq3);
                ljq3 = new ljq();
                if (!bl2) continue;
                hso.cxK().cxT().A(ign2);
                continue;
            }
            ign2.kE(-1.0f);
            ign2.c(new ljq(65536.0f, 65536.0f, 65536.0f));
        }
    }

    private void h(ign ign2) {
        if (ign2 == this.lRT) {
            return;
        }
        if (this.lRT != null) {
            this.a("setFeatItemSelected", new Object[]{this.lRT.getId(), false});
        }
        this.lRT = ign2;
        if (this.lRT != null) {
            this.a("setFeatItemSelected", new Object[]{this.lRT.getId(), true});
        }
    }

    private void i(ign ign2) {
        this.a("setFeatProgress", new Object[]{ign2.getId(), ign2.cTu(), ign2.cBj()});
    }

    /*
     * WARNING - void declaration
     */
    private void cST() {
        void var5_10;
        ifs ifs2;
        void var5_8;
        String string = "dfdata/xml-files/client/feat_sorting.xml";
        Document document = mie.BW("dfdata/xml-files/client/feat_sorting.xml");
        if (document == null) {
            return;
        }
        ArrayList<Element> arrayList = mie.BX("feat_sorting").BX("skill_average").BX("entry").v(document);
        for (Element object22 : arrayList) {
            this.p(object22);
        }
        ArrayList<Element> arrayList2 = mie.BX("feat_sorting").BX("prowess_total").BX("entry").v(document);
        Iterator n = arrayList2.iterator();
        while (n.hasNext()) {
            Element element = (Element)n.next();
            this.q(element);
        }
        Collections.sort(this.lRU, new Comparator<ifu>(this){
            final /* synthetic */ ifr lRZ;
            {
                this.lRZ = ifr2;
            }

            public int a(ifu ifu2, ifu ifu3) {
                return (int)(ifu2.cTb() - ifu3.cTb());
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((ifu)object, (ifu)object2);
            }
        });
        boolean bl = true;
        while (var5_8 < this.lRU.size()) {
            ifu ifu2 = this.lRU.get((int)(var5_8 - true));
            ifs2 = this.lRU.get((int)var5_8);
            if (ifu2.cTc() > ((ifu)ifs2).cTb()) {
                // empty if block
            }
            ++var5_8;
        }
        Collections.sort(this.lRV, new Comparator<ift>(this){
            final /* synthetic */ ifr lRZ;
            {
                this.lRZ = ifr2;
            }

            public int a(ift ift2, ift ift3) {
                return (int)(ift2.cSZ() - ift3.cSZ());
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((ift)object, (ift)object2);
            }
        });
        boolean bl2 = true;
        while (var5_10 < this.lRV.size()) {
            ift ift2 = this.lRV.get((int)(var5_10 - true));
            ifs2 = this.lRV.get((int)var5_10);
            if (ift2.cTa() > ((ift)ifs2).cSZ()) {
                // empty if block
            }
            ++var5_10;
        }
        this.lRX = 0.0f;
        for (ifu ifu3 : this.lRU) {
            this.lRX += ifu3.cTc() - ifu3.cTb();
        }
        this.lRX /= (float)this.lRU.size();
    }

    private void p(Element element) {
        float f = mie.a(element, "min_skill_average", 0.0f, 0.0f, 100.0f);
        float f2 = mie.a(element, "max_skill_average", 0.0f, 0.0f, 100.0f);
        float f3 = mie.a(element, "min_player_points", 0.0f, 0.0f, Float.MAX_VALUE);
        float f4 = mie.a(element, "max_player_points", 0.0f, 0.0f, Float.MAX_VALUE);
        if (f > f2) {
            // empty if block
        }
        if (f3 > f4) {
            // empty if block
        }
        ifu ifu2 = new ifu(f, f2, f3, f4);
        this.lRU.add(ifu2);
    }

    private void q(Element element) {
        float f = mie.a(element, "min_prowess_total", 0.0f, 0.0f, Float.MAX_VALUE);
        float f2 = mie.a(element, "max_prowess_total", 0.0f, 0.0f, Float.MAX_VALUE);
        float f3 = mie.a(element, "min_player_points", 0.0f, 0.0f, Float.MAX_VALUE);
        float f4 = mie.a(element, "max_player_points", 0.0f, 0.0f, Float.MAX_VALUE);
        if (f > f2) {
            // empty if block
        }
        if (f3 > f4) {
            // empty if block
        }
        ift ift2 = new ift(f, f2, f3, f4);
        this.lRV.add(ift2);
    }

    private float cSU() {
        float f = 0.0f;
        int n = 0;
        if (ifr.cxP() == null) {
            return 0.0f;
        }
        if (ifr.cxP().cyZ() == null) {
            return 0.0f;
        }
        ckb ckb2 = lea.epx();
        if (ckb2 == null) {
            return 0.0f;
        }
        cjx cjx2 = ifr.cxP().cyZ().ki();
        if (cjx2 == null) {
            return 0.0f;
        }
        Collection<ckf> collection = lea.epx().qR(cjx2.getIndex());
        for (ckf ckf2 : collection) {
            cxc cxc2;
            int n2 = ckf2.aQO();
            dcw dcw2 = cxj.yq(n2);
            if (dcw2 == null) continue;
            int n3 = dcw2.a(cxd.l.fRP);
            lhg lhg2 = (lhg)lea.enZ().acv(n3);
            if (lhg2 == null || (cxc2 = ifr.cxP().cyZ().ht(lhg2.getType())) == null) continue;
            f += cxc2.Bt();
            ++n;
        }
        if (n == 0) {
            return 0.0f;
        }
        return f / (float)n;
    }

    private boolean a(ign ign2, float f) {
        for (ifu ifu2 : this.lRU) {
            if (!ifu2.c(ign2, f)) continue;
            return true;
        }
        return false;
    }

    private boolean b(ign ign2, float f) {
        for (ift ift2 : this.lRV) {
            if (!ift2.c(ign2, f)) continue;
            return true;
        }
        return false;
    }

    private boolean cSV() {
        return ifr.cyJ().cHx().a(hyy.b.lsm) || ifr.cyJ().cHx().a(hyy.b.lso);
    }

    @Override
    public void i(cxc cxc2, int n) {
    }

    protected void cEk() {
        this.a("setRendererStrings", new Object[]{lww.tiU.bD(new Object[0]).exA(), lww.tiT.bD(new Object[0]).exA()});
    }

    private void a(ign ign2, Boolean bl) {
        if (this.cDj()) {
            this.i(ign2);
        }
    }

    private void a(Integer n, Integer n2, Boolean bl) {
        this.cSP();
    }

    private void b(List<ign> list, List<ign> list2, List<ign> list3, Boolean bl) {
        for (ign ign2 : list2) {
            this.a(ign2, bl);
        }
        this.a(list.size(), (Integer)list3.size(), bl);
    }

    @Override
    public void i(jjh jjh2) {
    }

    @Override
    public void do(double d2) {
    }

    @Override
    public void cSW() {
    }

    static /* synthetic */ void a(ifr ifr2, List list, List list2, List list3, Boolean bl) {
        ifr2.b(list, list2, list3, bl);
    }
}

