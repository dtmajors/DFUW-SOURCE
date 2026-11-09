/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class jjy
extends btk
implements htj,
huv,
huy,
hvc,
hvf {
    public final jll<ldv> nrG = new jll();
    public final jll<ldv> nrH = new jll();
    public final jll<ldv> nrI = new jll();
    public final jll<ldv> nrJ = new jll();
    public final jll<ldv> nrK = new jll();
    public final jll<ldv> nrL = new jll();
    public final jll<ldv> nrM = new jll();
    private ldv nrN = null;
    private boolean nrO = false;
    private HashMap<ldv, jkh> nrP = new HashMap();
    private HashMap<ldv, jkf> nrQ = new HashMap();

    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().cxP().czd().a(this);
        if (hso.cxK().cxP().czd().HT()) {
            this.cyF();
        }
        hso.cxK().cxP().czb().a(this);
        if (hso.cxK().cxP().czb().HT()) {
            this.dKR();
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czd() != null) {
            hso.cxK().cxP().czd().b(this);
        }
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czb() != null) {
            hso.cxK().cxP().czb().b(this);
        }
    }

    @Override
    public void cyF() {
        this.dKQ();
    }

    @Override
    public void oj() {
        this.dKQ();
        this.dKR();
    }

    @Override
    public void u(bcp bcp2) {
        Object object;
        jjw jjw2 = new jjw(bcp2);
        jjz.dKS().c(jjw2);
        Set<azg> set = hso.cxK().cxP().czd().d(bcp2);
        for (azg object22 : set) {
            object = new jka(jjy.l(object22.abi()), object22.getGUID(), lvm.sWY.bD(object22.getID()).exA(), object22.av());
            jjw2.a((jka)object, this.k(object22));
        }
        Set<bbh> set2 = hso.cxK().cxP().czd().g(bcp2);
        Iterator iterator = set2.iterator();
        while (iterator.hasNext()) {
            object = (bbh)iterator.next();
            jka jka2 = new jka(jkd.nsx, ((bbh)object).getGUID(), lvm.sWZ.bD(((bbh)object).getID()).exA(), ((bbh)object).av());
            jjw2.a(jka2, this.i((bbh)object));
            this.j((bbh)object);
        }
    }

    @Override
    public void v(bcp bcp2) {
        jjw jjw2 = jjz.dKS().dKT().get(bcp2.iG());
        if (jjw2 == null) {
            return;
        }
        ArrayList<jka> arrayList = new ArrayList<jka>();
        for (jka jka2 : jjw2.dKO().values()) {
            arrayList.add(jka2);
        }
        for (jka jka2 : arrayList) {
            jjw2.a(jka2);
        }
        jjz.dKS().d(jjw2);
    }

    @Override
    public void w(bcp bcp2) {
        jjw jjw2 = jjz.dKS().dKT().get(bcp2.iG());
        if (jjw2 == null) {
            return;
        }
        jjw2.setName(bcp2.iV());
    }

    @Override
    public void i(azg azg2) {
        this.a(azg2.iG(), jjy.l(azg2.abi()), azg2.getGUID(), lvm.sWY.bD(azg2.getID()).exA(), azg2.av(), this.k(azg2));
    }

    @Override
    public void j(azg azg2) {
        jka jka2 = jjz.dKS().sn(azg2.getGUID());
        if (jka2 == null) {
            return;
        }
        jka2.a(this.k(azg2));
    }

    @Override
    public void g(bbh bbh2) {
        this.a(bbh2.iG(), jkd.nsx, bbh2.getGUID(), lvm.sWZ.bD(bbh2.getID()).exA(), bbh2.av(), this.i(bbh2));
        this.j(bbh2);
    }

    @Override
    public void h(bbh bbh2) {
        jka jka2 = jjz.dKS().sn(bbh2.getGUID());
        if (jka2 == null) {
            return;
        }
        jka2.a(this.i(bbh2));
        this.j(bbh2);
    }

    public void dKP() {
        Set<bbh> set = hso.cxK().cxP().czd().bqq();
        for (bbh bbh2 : set) {
            jka jka2 = jjz.dKS().sn(bbh2.getGUID());
            if (jka2 == null) continue;
            this.j(bbh2);
        }
    }

    @Override
    public void oi() {
        jjw jjw2;
        if (this.nrN != null && (jjw2 = jjz.dKS().dKT().get(this.nrN)) != null) {
            for (jka jka2 : jjw2.dKO().values()) {
                this.b(jka2);
            }
        }
        this.dKR();
        if (this.nrN != null && (jjw2 = jjz.dKS().dKT().get(this.nrN)) != null) {
            for (jka jka2 : jjw2.dKO().values()) {
                this.b(jka2);
            }
        }
    }

    @Override
    public void d(ayk ayk2) {
        bbh bbh2 = hso.cxK().cxP().czd().ng(ayk2.getGUID());
        this.h(bbh2);
    }

    public jkh si(ldv ldv2) {
        return this.nrP.get(ldv2);
    }

    public jkf sj(ldv ldv2) {
        return this.nrQ.get(ldv2);
    }

    private static jkd l(ayb ayb2) {
        return ayb2 == ayb.cvj ? jkd.nsv : jkd.nsw;
    }

    private void a(ldv ldv2, jkd jkd2, ldv ldv3, String string, ljq ljq2, jkc jkc2) {
        jka jka2 = jjz.dKS().sn(ldv3);
        if (ldv2 != null) {
            jjw jjw2 = jjz.dKS().dKT().get(ldv2);
            if (jjw2 == null) {
                return;
            }
            if (jka2 == null) {
                jka2 = new jka(jkd2, ldv3, string, ljq2);
                jjw2.a(jka2, jkc2);
            } else if (jka2.nrU != jjw2) {
                jka2.nrU.a(jka2);
                jjw2.a(jka2, jkc2);
            }
        } else {
            if (jka2 == null) {
                return;
            }
            jka2.nrU.a(jka2);
        }
    }

    private static boolean sk(ldv ldv2) {
        return hso.cxK().cxP().czb().sz(ldv2);
    }

    private jkc k(azg azg2) {
        double d2;
        double d3;
        double d4;
        jkb jkb2;
        boolean bl = jjy.sk(azg2.iG());
        if (azg2.acV() > 0.0) {
            jkb2 = bl ? jkb.nse : jkb.nsa;
            d4 = azg2.acX();
            d3 = this.MessageDelegator.arc().rgz;
            d2 = azg2.acV();
        } else if (azg2.acU() > 0.0) {
            jkb2 = bl ? jkb.nsf : jkb.nsb;
            d4 = azg2.acX();
            d3 = this.MessageDelegator.arc().rgz;
            d2 = azg2.acU();
        } else if (azg2.acW() > 0.0) {
            jkb2 = bl ? jkb.nsg : jkb.nsc;
            d4 = azg2.acX();
            d3 = this.MessageDelegator.arc().rgz;
            d2 = azg2.acW();
        } else if (azg2.iG() != null) {
            jkb2 = bl ? jkb.nsd : jkb.nrZ;
            d4 = 0.0;
            d3 = 0.0;
            d2 = 0.0;
        } else {
            jkb2 = jkb.nrY;
            d4 = 0.0;
            d3 = 0.0;
            d2 = 0.0;
        }
        return new jkc(jkb2, d4, d3, d2);
    }

    private jkc i(bbh bbh2) {
        double d2;
        double d3;
        double d4;
        jkb jkb2;
        boolean bl = jjy.sk(bbh2.iG());
        boolean bl2 = bbh2.iG() != null && bbh2.ajT() <= this.MessageDelegator.arc().rgz;
        boolean bl3 = hso.cxK().cxP().czb().sI(bbh2.getGUID());
        if (bbh2.iG() == null) {
            jkb2 = jkb.nsh;
            d4 = 0.0;
            d3 = 0.0;
            d2 = 0.0;
        } else if (bbh2.acU() > this.MessageDelegator.arc().rgz) {
            jkb2 = bl ? (bl2 ? jkb.nsn : jkb.nsm) : (bl2 ? jkb.nsj : jkb.nsi);
            d4 = bbh2.acX();
            d3 = this.MessageDelegator.arc().rgz;
            d2 = bbh2.acU();
        } else {
            jkb2 = bl ? (bl2 ? jkb.nsp : jkb.nso) : (bl2 ? jkb.nsl : jkb.nsk);
            d4 = 0.0;
            d3 = 0.0;
            d2 = 0.0;
        }
        return new jkc(jkb2, d4, d3, d2);
    }

    private void b(jka jka2) {
        dmn dmn2 = hso.cxK().cxP().czd();
        switch (jka2.dKU()) {
            case nsv: 
            case nsw: {
                azg azg2 = dmn2.mZ(jka2.getGUID());
                if (azg2 == null) break;
                jka2.a(this.k(azg2));
                break;
            }
            case nsx: {
                bbh bbh2 = dmn2.ng(jka2.getGUID());
                if (bbh2 == null) break;
                jka2.a(this.i(bbh2));
            }
        }
    }

    private void dKQ() {
        if (this.nrO) {
            return;
        }
        boolean bl = hso.cxK().cxP().czd().HT();
        boolean bl2 = hso.cxK().cxP().czb().HT();
        if (bl && bl2) {
            this.nrO = true;
            Set<bbh> set = hso.cxK().cxP().czd().bqp();
            for (bbh object2 : set) {
                hso.cxK().cxT().a(object2.av(), lvm.sWZ.bD(object2.getID()).exA(), object2.getGUID());
            }
            Set<bcp> set2 = hso.cxK().cxP().czd().bqm();
            Iterator iterator = set2.iterator();
            while (iterator.hasNext()) {
                bcp bcp2 = (bcp)iterator.next();
                this.u(bcp2);
            }
        }
    }

    private jkg sl(ldv ldv2) {
        jkh jkh2 = this.nrP.get(ldv2);
        return jkh2 != null ? jkh2.dLb() : jkg.nsF;
    }

    private jke sm(ldv ldv2) {
        jkf jkf2 = this.nrQ.get(ldv2);
        return jkf2 != null ? jkf2.dLa() : jke.nsz;
    }

    private void j(bbh bbh2) {
        jke jke2 = this.sm(bbh2.getGUID());
        if (bbh2.iG() == null) {
            this.nrQ.remove(bbh2.getGUID());
            this.nrK.V(bbh2.getGUID());
        } else if (bbh2.ajT() > this.MessageDelegator.arc().rgz) {
            this.nrQ.put(bbh2.getGUID(), new jkf(jke.nsA, bbh2.ajU(), bbh2.ajT(), bbh2.ajV()));
            this.nrL.V(bbh2.getGUID());
        } else {
            this.nrQ.put(bbh2.getGUID(), new jkf(jke.nsB, 0.0, 0.0, bbh2.ajV()));
            this.nrM.V(bbh2.getGUID());
        }
    }

    private void dKR() {
        this.nrN = hso.cxK().cxP().czb().ack();
    }
}

