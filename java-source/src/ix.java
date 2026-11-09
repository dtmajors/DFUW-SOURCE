/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  is
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ix
extends btk
implements bto,
dsy {
    public static final double aiy = 5.0;
    public static final double aiz = 1.0;
    public static final int aiA = 1;
    public static final int aiB = 3;
    private final fq aiC;
    private final fw aiD;
    private final ahv aiE;
    private final ig aiF;
    private is Xb = null;
    private Map<ldv, List> aiG = lcn.emw();
    private Map<ldv, List<gd>> aiH = lcn.emw();
    private List<gd> aiI = lcn.abH(20);
    private List<amf> aiJ = lcn.emv();
    private List<ldv> aiK = lcn.emv();
    private LinkedList<a> aiL = lcn.emA();
    private List<age> aiM = lcn.emv();
    private List<amf> aiN = lcn.emv();
    private static int agv = 1;

    public ix() {
        this.aiC = new fq(this);
        this.aiD = new fw(this);
        this.aiE = new ahv(this);
        this.aiF = new ig();
    }

    public final fw nK() {
        return this.aiD;
    }

    public final ig nL() {
        return this.aiF;
    }

    public final is nM() {
        return this.Xb;
    }

    public final void a(is is2) {
        this.Xb = is2;
    }

    public final void cx(int n) {
        agv = n;
    }

    public final int nN() {
        return agv;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.aiL.isEmpty()) {
            Iterator iterator = this.aiL.iterator();
            while (iterator.hasNext()) {
                a a2 = (a)iterator.next();
                ldv ldv2 = a2.aiP.aO();
                if (this.bd(ldv2) != null || this.bB(ldv2)) {
                    iterator.remove();
                    this.receiveMessage(a2.aiP);
                    continue;
                }
                ++a2.aiO;
                if (a2.aiO <= 50) continue;
                lfn.b(5, "SFWorldStateManager", "doTick() Expiring " + a2.aiP);
                iterator.remove();
            }
        }
        this.nO();
        this.nP();
        this.k(ldz2.rgz);
        this.nQ();
    }

    public aht bd(ldv ldv2) {
        return this.aiF.bd(ldv2);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aiD.setMessageDelegator(this.MessageDelegator);
        this.aiC.setGUID(lcr.qAQ);
        this.MessageDelegator.a(this.aiC);
    }

    public final boolean bB(ldv ldv2) {
        if (this.aiJ.isEmpty()) {
            return false;
        }
        int n = this.aiJ.size();
        for (int i = 0; i < n; ++i) {
            amf amf2 = this.aiJ.get(i);
            if (!amf2.getGUID().equals(ldv2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        block0 : switch (dxq2.bED()) {
            case 768: {
                geh geh2 = (geh)dxq2;
                if (geh2.bBj() != 1280) {
                    return;
                }
                this.a(geh2);
                break;
            }
            case 12032: {
                this.a((gym)dxq2);
                break;
            }
            case 20992: {
                this.aiD.a((esc)dxq2);
                break;
            }
            default: {
                switch (dxq2.bEz()) {
                    case 13063: {
                        this.a((gkz)dxq2);
                        break block0;
                    }
                    case 13064: {
                        this.a((gle)dxq2);
                        break block0;
                    }
                    case 16652: {
                        this.a((ery)dxq2);
                        break block0;
                    }
                    case 21249: {
                        this.a((gls)dxq2);
                        break block0;
                    }
                }
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 270: {
                kcs kcs2 = (kcs)kcz2;
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        switch (gre2.jqc) {
            case 11065: {
                break;
            }
            case 11009: {
                break;
            }
        }
    }

    private void a(geh geh2) {
        switch (geh2.bEz()) {
            case 770: {
                gem gem2 = (gem)geh2;
                ahl ahl2 = this.bi(gem2.doP);
                if (ahl2 != null) {
                    this.bC(ahl2.getGUID());
                    break;
                }
                if (this.aiC.ac(gem2.doP)) {
                    this.aiC.ad(gem2.doP);
                    break;
                }
                Iterator<age> iterator = this.aiM.iterator();
                while (iterator.hasNext()) {
                    age age2 = iterator.next();
                    if (!age2.getGUID().equals(gem2.doP)) continue;
                    iterator.remove();
                    return;
                }
                break;
            }
            case 774: {
                gee gee2 = (gee)geh2;
                afr afr2 = (afr)this.aiE.a(ahu.c.bmf, gee2.aSO());
                afr2.setObjectType(37);
                afr2.fn(gee2.gqN);
                afr2.cM(gee2.bUk());
                afr2.cN(gee2.bUl());
                afr2.aH(gee2.bUn());
                afr2.eA(gee2.aFZ());
                afr2.setFrameName(gee2.getFrameName());
                afr2.aj(gee2.bUp());
                afr2.ak(gee2.bUq());
                afr2.aE(gee2.bUr());
                this.aiM.add(afr2);
                break;
            }
            case 775: {
                gef gef2 = (gef)geh2;
                ahb ahb2 = (ahb)this.aiE.a(ahu.c.bmx, gef2.aSO());
                ahb2.setObjectType(37);
                ahb2.fn(gef2.gqN);
                ahb2.cM(gef2.bUk());
                ahb2.cN(gef2.bUl());
                ahb2.aH(gef2.bUn());
                ahb2.fg(gef2.bUs());
                ahb2.fh(gef2.bUt());
                ahb2.aO(gef2.bmv());
                ahb2.setDeltaPos(gef2.getDeltaPos());
                ahb2.setDeltaRot(gef2.getDeltaRot());
                this.aiM.add(ahb2);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(ery ery2) {
        if (ery2.ilu <= 0) {
            return;
        }
        switch (ery2.ilu) {
            case 3: {
                this.aiF.bb(ery2.Rs);
                break;
            }
            case 7: {
                this.aiF.ne();
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(gkz gkz2) {
        if (gkz2.aUa == null) {
            return;
        }
        if (gkz2.jkO == null) {
            return;
        }
        if (this.aiF.bc(gkz2.aUa)) {
            aht aht2 = this.aiF.bd(gkz2.aUa);
            return;
        }
        dek dek2 = gkz2.jkO;
        if (!this.aiF.bc(dek2.akX)) {
            if (this.bB(dek2.akX)) {
                this.c(dek2.akX, gkz2);
            }
            return;
        }
        ahs ahs2 = this.aiE.a(gkz2.aUa, gkz2.jkO);
        if (ahs2 == null) {
            return;
        }
        ahs2.a(this);
        ahs2.fp(0);
        boolean bl = this.aiF.a(ahs2);
        if (!bl) {
            return;
        }
        this.Xb.b(ahs2);
    }

    private void a(gle gle2) {
        if (gle2.aUa == null) {
            return;
        }
        aht aht2 = this.aiF.bf(gle2.aUa);
        if (aht2 == null) {
            return;
        }
        this.Xb.g(aht2);
    }

    private void a(gls gls2) {
        if (gls2.Rs == null) {
            return;
        }
        aht aht2 = this.aiF.bd(gls2.Rs);
        if (aht2 == null) {
            if (this.bB(gls2.Rs)) {
                this.c(gls2.Rs, gls2);
                return;
            }
            return;
        }
        switch (gls2.ija) {
            case 1: {
                if (aht2.BA() == gls2.blv) {
                    return;
                }
                aht2.aU(gls2.blv);
                break;
            }
            case 2: {
                if (gls2.jlj == null || gls2.jlj.length == 0) {
                    return;
                }
                int[] nArray = gls2.jlj;
                for (int i = 0; i < nArray.length; ++i) {
                    aht2.fq(nArray[i]);
                }
                break;
            }
            case 3: {
                if (gls2.jlj == null || gls2.jlj.length == 0) {
                    return;
                }
                int[] nArray = gls2.jlj;
                for (int i = 0; i < nArray.length; ++i) {
                    aht2.fs(nArray[i]);
                }
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(gym gym2) {
        if (gym2.bEz() == 12047) {
            gyv gyv2 = (gyv)gym2;
            ahl ahl2 = this.aiF.bi(gyv2.doP);
            if (ahl2 == null) {
                return;
            }
            ahl2.a(gym2, agv);
        } else {
            aht aht2 = this.aiF.bd(gym2.aO());
            if (aht2 == null) {
                if (this.bB(gym2.aO())) {
                    this.c(gym2.aO(), gym2);
                } else {
                    if (!(gym2 instanceof gyj) && !(gym2 instanceof gyt)) {
                        lfn.b(4, "SFWorldStateManager", "handleUpdateMessage() Received a message from object " + gym2.aO() + " without a stateobject.");
                        lfn.b(4, "SFWorldStateManager", "handleUpdateMessage() Postponing " + gym2);
                    }
                    a a2 = new a(this, null);
                    a2.aiO = 0;
                    a2.aiP = gym2;
                    this.aiL.add(a2);
                }
            } else {
                aht2.a(gym2, agv);
            }
        }
    }

    private void nO() {
        if (this.aiJ.isEmpty()) {
            return;
        }
        Iterator<amf> iterator = this.aiJ.iterator();
        while (iterator.hasNext()) {
            amf amf2 = iterator.next();
            if (amf2.isCleanedUp()) {
                iterator.remove();
                continue;
            }
            boolean bl = true;
            if (amf2 instanceof bdl) {
                bl = false;
            } else if (amf2 instanceof dsm) {
                bl = false;
            } else if (amf2 instanceof bvd) {
                bvd bvd2 = (bvd)amf2;
                if (bvd2.isReadyToRun()) {
                    if (this.aiK.contains(bvd2.getGUID())) {
                        this.aiK.remove(bvd2.getGUID());
                    }
                } else {
                    if (this.aiK.contains(bvd2.getGUID())) continue;
                    this.aiK.add(bvd2.getGUID());
                    continue;
                }
            }
            iterator.remove();
            if (!bl) continue;
            if (amf2 instanceof dul) {
                this.a((dul)amf2);
                continue;
            }
            this.g(amf2);
        }
    }

    private void nP() {
        if (this.aiM.isEmpty()) {
            return;
        }
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        Iterator<age> iterator = this.aiM.iterator();
        while (iterator.hasNext()) {
            age age2 = iterator.next();
            if (this.GUID.ib() != age2.Bq().ib()) {
                iterator.remove();
                continue;
            }
            aht aht2 = this.bd(age2.Bq());
            if (aht2 == null) {
                bl = false;
                bl2 = this.bB(age2.Bq());
            } else {
                if (!(aht2 instanceof agx)) {
                    iterator.remove();
                    continue;
                }
                bl = true;
                bl2 = true;
            }
            aht2 = this.bd(age2.Br());
            if (aht2 == null) {
                bl3 = false;
                bl4 = this.GUID.ib() != age2.Br().ib() ? false : this.bB(age2.Br());
            } else {
                if (!(aht2 instanceof agx)) {
                    iterator.remove();
                    continue;
                }
                bl3 = true;
            }
            if (bl && bl3) {
                this.c(age2);
                iterator.remove();
                continue;
            }
            if (bl2 && bl4) continue;
            this.aiC.a(age2, !bl2, !bl4);
            iterator.remove();
        }
    }

    private void nQ() {
        if (this.aiN.isEmpty()) {
            return;
        }
        int n = this.aiN.size();
        for (int i = 0; i < n; ++i) {
            amf amf2 = this.aiN.get(i);
            if (amf2 instanceof dul) {
                if (!this.aiF.bg(amf2.getGUID())) continue;
                this.bC(amf2.getGUID());
                continue;
            }
            if (this.aiF.bc(amf2.getGUID())) {
                this.h(amf2);
                continue;
            }
            if (!this.aiK.contains(amf2.getGUID())) continue;
            this.aiK.remove(amf2.getGUID());
        }
        this.aiN.clear();
    }

    public final void a(age age2) {
        if (age2 == null) {
            return;
        }
        this.c(age2);
    }

    public void a(aht aht2, int n) {
        if (!this.i(aht2.getGUID(), n)) {
            return;
        }
        this.k(aht2.getGUID(), n);
    }

    public void b(aht aht2, int n) {
        if (this.i(aht2.getGUID(), n)) {
            return;
        }
        this.j(aht2.getGUID(), n);
    }

    public final void a(ldv ldv2, ago ago2) {
        assert (ldv2 != null);
        assert (ago2 != null);
        Set<ik> set = ago2.BG().keySet();
        if (set.isEmpty()) {
            return;
        }
        for (ik ik2 : set) {
            ldv ldv3 = lcr.ak((ldv)lcr.qAJ, (int)ldv2.ib());
            goa goa2 = (goa)this.MessageDelegator.h(21762, this.GUID, ldv3);
            goa2.adA = ik2.GUID;
            goa2.jnv = new ldv[]{ldv2};
            goa2.adB = null;
            goa2.adG = true;
            this.MessageDelegator.F(goa2);
        }
    }

    public final void b(ldv ldv2, ago ago2) {
        assert (ldv2 != null);
        assert (ago2 != null);
        Set<ik> set = ago2.BG().keySet();
        if (set.isEmpty()) {
            return;
        }
        for (ik ik2 : set) {
            ldv ldv3 = lcr.ak((ldv)lcr.qAJ, (int)ldv2.ib());
            goh goh2 = (goh)this.MessageDelegator.h(21764, this.GUID, ldv3);
            goh2.adA = ik2.GUID;
            goh2.jnv = new ldv[]{ldv2};
            goh2.jnQ = null;
            goh2.adG = true;
            goh2.dAu = ago2.getGUID();
            this.MessageDelegator.F(goh2);
        }
    }

    public final void h(aht aht2) {
        if (aht2.BA()) {
            return;
        }
        this.Xb.h(aht2);
    }

    private void c(ldv ldv2, dxq dxq2) {
        assert (ldv2 != null);
        assert (dxq2 != null);
        ArrayList<dxq> arrayList = this.aiG.get(ldv2);
        if (arrayList == null) {
            arrayList = lcn.abH(2);
            this.aiG.put(ldv2, arrayList);
        }
        arrayList.add(dxq2);
    }

    private void i(aht aht2) {
        assert (aht2 != null);
        List list = this.aiG.get(aht2.getGUID());
        if (list == null) {
            return;
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            dxq dxq2 = (dxq)iterator.next();
            if (dxq2 instanceof gym) {
                this.a((gym)dxq2);
            } else if (dxq2 instanceof gls) {
                this.a((gls)dxq2);
            } else if (dxq2 instanceof gkz) {
                this.a((gkz)dxq2);
            }
            iterator.remove();
        }
        this.aiG.remove(aht2.getGUID());
    }

    private void g(amf amf2) {
        assert (amf2 != null);
        aht aht2 = this.aiE.i(amf2);
        if (aht2 == null) {
            return;
        }
        aht2.a(this);
        aht2.fp(0);
        boolean bl = this.aiF.a(aht2);
        if (!bl) {
            return;
        }
        this.i(aht2);
        this.Xb.f(aht2);
    }

    private void h(amf amf2) {
        assert (amf2 != null);
        aht aht2 = this.aiF.bf(amf2.getGUID());
        if (aht2 == null) {
            return;
        }
        this.j(aht2);
        this.bD(aht2.getGUID());
        this.aiG.remove(aht2.getGUID());
        this.Xb.g(aht2);
    }

    public final ahl bi(ldv ldv2) {
        return this.aiF.bi(ldv2);
    }

    public final List<ldv> bh(ldv ldv2) {
        return this.aiF.bh(ldv2);
    }

    public final List<ldv> bk(ldv ldv2) {
        return this.aiF.bk(ldv2);
    }

    private void c(ahl ahl2) {
        assert (ahl2 != null);
        ahl2.a(this);
        ahl2.fp(0);
        boolean bl = this.aiF.a(ahl2);
        if (!bl) {
            return;
        }
        this.i(ahl2);
        this.Xb.f((aht)ahl2);
    }

    private void a(int n, ldv ldv2, ldv ldv3, ldv ldv4) {
        ahl ahl2 = this.aiE.b(n, ldv2, ldv3, ldv4);
        assert (ahl2 != null);
        this.c(ahl2);
    }

    private void a(dul dul2) {
        assert (dul2 != null);
        ahl ahl2 = (ahl)this.aiE.i(dul2);
        if (ahl2 == null) {
            return;
        }
        this.c(ahl2);
    }

    private void j(aht aht2) {
        ahl ahl2;
        ldv ldv2;
        int n;
        List<ldv> list = this.bk(aht2.getGUID());
        if (list != null && !list.isEmpty()) {
            n = 0;
            while (n < list.size()) {
                ldv2 = list.get(n);
                ahl2 = this.bi(ldv2);
                if (ahl2 instanceof age) {
                    this.bC(ldv2);
                    continue;
                }
                ++n;
            }
        }
        if ((list = this.bh(aht2.getGUID())) != null && !list.isEmpty()) {
            n = 0;
            while (n < list.size()) {
                ldv2 = list.get(n);
                ahl2 = this.bi(ldv2);
                if (ahl2 instanceof age) {
                    this.bC(ldv2);
                    continue;
                }
                ++n;
            }
        }
    }

    private void bC(ldv ldv2) {
        ahl ahl2 = this.aiF.bi(ldv2);
        if (ahl2 == null) {
            return;
        }
        this.aiF.b(ahl2);
        this.aiG.remove(ahl2.getGUID());
        this.Xb.g((aht)ahl2);
    }

    public boolean i(ldv ldv2, int n) {
        List<gd> list = this.aiH.get(ldv2);
        if (list == null) {
            return false;
        }
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            gd gd2 = list.get(i);
            if (gd2.Uo != n) continue;
            return true;
        }
        return false;
    }

    private void j(ldv ldv2, int n) {
        gd gd2 = null;
        if (this.aiI.size() > 0) {
            gd2 = this.aiI.remove(0);
            gd2.reset();
        } else {
            gd2 = new gd();
            this.aiI.add(new gd());
        }
        List<gd> list = this.aiH.get(ldv2);
        if (list == null) {
            list = lcn.abH(2);
            this.aiH.put(ldv2, list);
        }
        gd2.Uo = n;
        gd2.Up = this.MessageDelegator.arc().rgz + 5.0;
        list.add(gd2);
    }

    private void k(double d2) {
        if (this.aiH.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<ldv, List<gd>>> iterator = this.aiH.entrySet().iterator();
        if (iterator.hasNext()) {
            Map.Entry<ldv, List<gd>> entry = iterator.next();
            ldv ldv2 = entry.getKey();
            List<gd> list = entry.getValue();
            assert (!list.isEmpty());
            this.a(ldv2, list, d2);
            if (list.isEmpty()) {
                iterator.remove();
            }
            return;
        }
    }

    private void a(ldv ldv2, List list, double d2) {
        if (this.aiH.isEmpty()) {
            return;
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            gd gd2 = (gd)iterator.next();
            if (!(gd2.Up <= d2)) continue;
            iterator.remove();
            aht aht2 = this.bd(ldv2);
            if (aht2 != null) {
                aht2.eE(gd2.Uo);
            }
            gd2.reset();
            this.aiI.add(gd2);
        }
    }

    private void k(ldv ldv2, int n) {
        List<gd> list = this.aiH.get(ldv2);
        if (list == null) {
            return;
        }
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            gd gd2 = list.get(i);
            if (gd2.Uo != n) continue;
            list.remove(i);
            gd2.reset();
            this.aiI.add(gd2);
            if (list.isEmpty()) {
                this.aiH.remove(ldv2);
            }
            return;
        }
    }

    private void bD(ldv ldv2) {
        List<gd> list = this.aiH.remove(ldv2);
        if (list == null) {
            return;
        }
        Iterator<gd> iterator = list.iterator();
        while (iterator.hasNext()) {
            gd gd2 = iterator.next();
            iterator.remove();
            gd2.reset();
            this.aiI.add(gd2);
        }
    }

    @Override
    public dxq g(dxq dxq2) {
        return dxq2;
    }

    @Override
    public dxq h(dxq dxq2) {
        return dxq2;
    }

    @Override
    public boolean c(amf amf2) {
        return true;
    }

    @Override
    public void d(amf amf2) {
        int n;
        assert (amf2 != null);
        assert (amf2.getGUID() != null);
        if (!amf2.isInitialized()) {
            // empty if block
        }
        if (amf2.getObjectType() < 0) {
            return;
        }
        if (amf2 instanceof dul) {
            if (this.aiF.bg(amf2.getGUID())) {
                ahl ahl2 = this.aiF.bi(amf2.getGUID());
                return;
            }
        } else if (this.aiF.bc(amf2.getGUID())) {
            aht aht2 = this.aiF.bd(amf2.getGUID());
            return;
        }
        if (this.bB(amf2.getGUID())) {
            aht aht3 = this.aiF.bd(amf2.getGUID());
            return;
        }
        if (lcw.enb() && !lcw.abY((int)(n = amf2.getGUID().ib()))) {
            return;
        }
        this.aiJ.add(amf2);
    }

    @Override
    public void e(amf amf2) {
        if (lcw.enb() && amf2.getGUID().ib() != this.GUID.ib()) {
            return;
        }
        this.aiN.add(amf2);
    }

    @Override
    public boolean f(amf amf2) {
        return true;
    }

    @Override
    public void b(dta dta2) {
    }
}

