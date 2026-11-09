/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bgh
extends btk
implements bto {
    private bgi diV = new bgi();
    private ldv diW = null;
    private bgf diX = null;
    private Map<ldv, bgg> diY = lcn.emw();
    private Map<String, ldv> diZ = lcn.emw();
    private Map<String, ldv> dja = lcn.emw();
    private Map<Integer, b> djb = lcn.emw();
    private Map<Integer, b> djc = lcn.emw();
    private Map<Integer, b> djd = lcn.emw();
    private Map<Integer, b> dje = lcn.emw();
    private Map<Integer, b> djf = lcn.emw();
    private Map<Integer, b> djg = lcn.emw();
    private Map<Integer, b> djh = lcn.emw();
    private Map<Integer, b> dji = lcn.emw();
    private static final int djj = 10;
    private static final int djk = 20;
    private List<Set<ldv>> djl = lcn.abH(20);
    private List<a> djm = lcn.abH(20);
    private Set<ldv> djn = lcn.emx();
    private Set<Integer> djo = lcn.emx();
    private int djp = 0;
    public boolean djq = false;
    public boolean djr = false;
    public double djs = 60.0;
    private boolean djt = false;

    public bgh() {
        this.diX = new bgf();
        for (int i = 0; i < 20; ++i) {
            Set set = lcn.emx();
            this.djl.add(set);
            a a2 = new a(this);
            a2.Pq = -1.0;
            this.djm.add(a2);
        }
    }

    public void hi(ldv ldv2) {
        this.djn.add(ldv2);
    }

    public void hj(ldv ldv2) {
        this.djn.remove(ldv2);
    }

    public Map<ldv, bgg> aoF() {
        return this.diY;
    }

    public Set<ldv> aoG() {
        return this.djn;
    }

    public Set<Integer> aoH() {
        return this.djo;
    }

    public ldv fu(String string) {
        return this.diZ.get(string);
    }

    public ldv fv(String string) {
        return this.dja.get(string.toLowerCase());
    }

    public int hk(ldv ldv2) {
        bgg bgg2 = this.diY.get(ldv2);
        if (bgg2 == null) {
            return 0;
        }
        return bgg2.ib();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.djn.size() == 0) {
            return;
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aoI();
        this.diX.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.diX);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.aoJ();
    }

    private void kK(int n) {
        assert (this.djm.get(n) != null);
        if (this.djm.get((int)n).Pq > this.MessageDelegator.arc().rgz) {
            return;
        }
        a a2 = this.djm.get(n);
        a2.Pq = this.MessageDelegator.arc().rgz + this.djs + Math.random() * this.djs;
        assert (this.djl.get(n) != null);
        if (this.djl.get(n).isEmpty()) {
            return;
        }
        Set<ldv> set = this.djl.get(n);
        for (ldv ldv2 : set) {
            this.hl(ldv2);
        }
    }

    private void hl(ldv ldv2) {
        Object object;
        if (this.djt) {
            object = this.diY.get(ldv2);
            assert (object != null);
            if (((bgg)object).aoD()) {
                return;
            }
            ((bgg)object).dh(true);
        }
        object = (gpe)this.MessageDelegator.h(11076, this.getGUID(), ldv2);
        ((gpe)object).hsP = true;
        this.MessageDelegator.F((dxq)object);
    }

    private void a(gpf gpf2) {
        bgg bgg2 = this.diY.get(gpf2.aO());
        if (bgg2 == null) {
            return;
        }
        bgg2.dh(false);
        if (gpf2.Position != null && !gpf2.Position.equals(bgg2.oB())) {
            bgg2.aP(gpf2.Position);
            this.a(bgg2);
        }
    }

    private void a(bgg bgg2) {
        Iterator<ldv> iterator = this.djn.iterator();
        while (iterator.hasNext()) {
            amf amf2 = this.MessageDelegator.d(iterator.next());
            if (amf2 == null || !(amf2 instanceof bik)) continue;
            ((bik)amf2).e(bgg2);
        }
    }

    private void b(bgg bgg2) {
        if (bgg2 == null) {
            return;
        }
        Iterator<ldv> iterator = this.djn.iterator();
        while (iterator.hasNext()) {
            amf amf2 = this.MessageDelegator.d(iterator.next());
            if (amf2 == null || !(amf2 instanceof bik)) continue;
            ((bik)amf2).f(bgg2);
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        if (kcz2.getMessageType() == 270) {
            return;
        }
        super.receiveMiddlewareMessage(kcz2);
    }

    void e(gre gre2) {
        this.hm(gre2.jqf);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11075: {
                this.a((gpz)dxq2);
                break;
            }
            case 11077: {
                this.a((gpf)dxq2);
                break;
            }
            case 11059: {
                this.b((gpo)dxq2);
                break;
            }
            case 11034: {
                this.e((gre)dxq2);
                break;
            }
            case 12812: {
                this.d((eeg)dxq2);
                break;
            }
            case 6159: {
                this.a((gga)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void b(gpo gpo2) {
        if (gpo2.joL) {
            this.djo.add(gpo2.joK.di);
        } else {
            Map.Entry<ldv, bgg> entry2;
            this.djo.remove(gpo2.joK.di);
            Set<ldv> set = lcn.emx();
            for (Map.Entry<ldv, bgg> entry2 : this.diY.entrySet()) {
                ldv ldv2 = (ldv)entry2.getKey();
                if (ldv2.ib() != gpo2.joK.di) continue;
                set.add(ldv2);
            }
            entry2 = set.iterator();
            while (entry2.hasNext()) {
                this.hm((ldv)entry2.next());
            }
        }
    }

    private void aoI() {
        this.diW = this.getGUID();
        gpy gpy2 = (gpy)this.MessageDelegator.h(11074, this.getGUID(), lcr.hac);
        gpy2.joS = true;
        gpy2.Ud = this.diW;
        this.MessageDelegator.F(gpy2);
    }

    private void aoJ() {
        if (this.diW == null) {
            return;
        }
        gpy gpy2 = (gpy)this.MessageDelegator.h(11074, this.getGUID(), lcr.hac);
        gpy2.joS = false;
        gpy2.Ud = this.diW;
        this.MessageDelegator.F(gpy2);
        this.diW = null;
    }

    private void c(bgg bgg2) {
        if (bgg2 == null) {
            return;
        }
        if (bgg2.getType() != 0) {
            return;
        }
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), bgg2.aoC());
        eef2.jM(false);
        this.MessageDelegator.F(eef2);
    }

    private void d(eeg eeg2) {
        bgg bgg2 = this.diY.get(eeg2.aO());
        if (bgg2 == null) {
            return;
        }
        bgg2.setInfo(cg.n(eeg2.js()) + " " + cg.u(eeg2.jt()));
        bgg2.P(eeg2.js());
        bgg2.kJ(eeg2.jt());
        bgg2.bN(eeg2.jr());
    }

    private void a(gga gga2) {
        if (lea.enW().isDescendant(gga2.ResourceType, cug.fgH)) {
            if (gga2.ResourceType == cug.foU) {
                this.diV.dkb = gga2.jgt ? ++this.diV.dkb : --this.diV.dkb;
            } else if (gga2.ResourceType == cug.foX) {
                this.diV.djZ = gga2.jgt ? ++this.diV.djZ : --this.diV.djZ;
            } else if (gga2.ResourceType == cug.foV) {
                this.diV.djX = gga2.jgt ? ++this.diV.djX : --this.diV.djX;
            } else if (gga2.ResourceType == cug.foW) {
                this.diV.djY = gga2.jgt ? ++this.diV.djY : --this.diV.djY;
            } else if (gga2.ResourceType == cug.foY) {
                this.diV.dka = gga2.jgt ? ++this.diV.dka : --this.diV.dka;
            } else {
                this.diV.dkc = gga2.jgt ? ++this.diV.dkc : --this.diV.dkc;
            }
            b b2 = this.djg.get(gga2.aO().ib());
            if (b2 == null) {
                b2 = new b(this);
                this.djg.put(gga2.aO().ib(), b2);
            }
            if (gga2.jgt) {
                ++b2.djw;
                ++b2.djv;
            } else {
                --b2.djw;
            }
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fnH)) {
            if (gga2.ResourceType == cug.fou) {
                this.diV.djS = gga2.jgt ? ++this.diV.djS : --this.diV.djS;
            } else if (gga2.ResourceType == cug.fow) {
                this.diV.djT = gga2.jgt ? ++this.diV.djT : --this.diV.djT;
            } else if (gga2.ResourceType == cug.foy) {
                this.diV.djU = gga2.jgt ? ++this.diV.djU : --this.diV.djU;
            } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fnB)) {
                this.diV.djV = gga2.jgt ? ++this.diV.djV : --this.diV.djV;
            } else {
                this.diV.djW = gga2.jgt ? ++this.diV.djW : --this.diV.djW;
            }
            b b3 = this.djh.get(gga2.aO().ib());
            if (b3 == null) {
                b3 = new b(this);
                this.djh.put(gga2.aO().ib(), b3);
            }
            if (gga2.jgt) {
                ++b3.djw;
                ++b3.djv;
            } else {
                --b3.djw;
            }
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fnD)) {
            if (gga2.ResourceType == cug.foz) {
                this.diV.djN = gga2.jgt ? ++this.diV.djN : --this.diV.djN;
            } else if (gga2.ResourceType == cug.foA) {
                this.diV.djO = gga2.jgt ? ++this.diV.djO : --this.diV.djO;
            } else if (gga2.ResourceType == cug.foB) {
                this.diV.djP = gga2.jgt ? ++this.diV.djP : --this.diV.djP;
            } else if (gga2.ResourceType == cug.foC) {
                this.diV.djQ = gga2.jgt ? ++this.diV.djQ : --this.diV.djQ;
            } else {
                this.diV.djR = gga2.jgt ? ++this.diV.djR : --this.diV.djR;
            }
            b b4 = this.dje.get(gga2.aO().ib());
            if (b4 == null) {
                b4 = new b(this);
                this.dje.put(gga2.aO().ib(), b4);
            }
            if (gga2.jgt) {
                ++b4.djw;
                ++b4.djv;
            } else {
                --b4.djw;
            }
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fnO)) {
            this.b(gga2);
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fia)) {
            if (lea.enW().isDescendant(gga2.ResourceType, cug.fib)) {
                this.diV.dkd = gga2.jgt ? ++this.diV.dkd : --this.diV.dkd;
            } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fic)) {
                this.diV.dke = gga2.jgt ? ++this.diV.dke : --this.diV.dke;
            } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fid)) {
                this.diV.dkf = gga2.jgt ? ++this.diV.dkf : --this.diV.dkf;
            } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fie)) {
                this.diV.dkg = gga2.jgt ? ++this.diV.dkg : --this.diV.dkg;
            } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fif)) {
                this.diV.dkh = gga2.jgt ? ++this.diV.dkh : --this.diV.dkh;
            } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fig)) {
                this.diV.dki = gga2.jgt ? ++this.diV.dki : --this.diV.dki;
            } else {
                this.diV.dkj = gga2.jgt ? ++this.diV.dkj : --this.diV.dkj;
            }
            b b5 = this.dji.get(gga2.aO().ib());
            if (b5 == null) {
                b5 = new b(this);
                this.dji.put(gga2.aO().ib(), b5);
            }
            if (gga2.jgt) {
                ++b5.djw;
                ++b5.djv;
            } else {
                --b5.djw;
            }
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.frl)) {
            if (gga2.ResourceType == cug.frs) {
                this.diV.dkp = gga2.jgt ? ++this.diV.dkp : --this.diV.dkp;
            } else if (gga2.ResourceType == cug.frt) {
                this.diV.dkq = gga2.jgt ? ++this.diV.dkq : --this.diV.dkq;
            } else if (gga2.ResourceType == cug.fru) {
                this.diV.dkr = gga2.jgt ? ++this.diV.dkr : --this.diV.dkr;
            } else if (gga2.ResourceType == cug.frv) {
                this.diV.dks = gga2.jgt ? ++this.diV.dks : --this.diV.dks;
            } else if (gga2.ResourceType == cug.frw) {
                this.diV.dkt = gga2.jgt ? ++this.diV.dkt : --this.diV.dkt;
            } else {
                this.diV.dku = gga2.jgt ? ++this.diV.dku : --this.diV.dku;
            }
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.frm)) {
            if (gga2.ResourceType == cug.frC) {
                this.diV.dkk = gga2.jgt ? ++this.diV.dkk : --this.diV.dkk;
            } else if (gga2.ResourceType == cug.frD) {
                this.diV.dkl = gga2.jgt ? ++this.diV.dkl : --this.diV.dkl;
            } else if (gga2.ResourceType == cug.frE) {
                this.diV.dkm = gga2.jgt ? ++this.diV.dkm : --this.diV.dkm;
            } else if (gga2.ResourceType == cug.frF) {
                this.diV.dkn = gga2.jgt ? ++this.diV.dkn : --this.diV.dkn;
            } else {
                this.diV.dko = gga2.jgt ? ++this.diV.dko : --this.diV.dko;
            }
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fqO)) {
            if (gga2.ResourceType == cug.frH) {
                this.diV.dkv = gga2.jgt ? ++this.diV.dkv : --this.diV.dkv;
            } else {
                this.diV.dkw = gga2.jgt ? ++this.diV.dkw : --this.diV.dkw;
            }
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fmZ)) {
            if (lea.enW().isDescendant(gga2.ResourceType, cug.fnf)) {
                this.diV.dky = gga2.jgt ? ++this.diV.dky : --this.diV.dky;
            } else if (gga2.ResourceType == cug.fnb) {
                this.diV.dkx = gga2.jgt ? ++this.diV.dkx : --this.diV.dkx;
            } else if (gga2.ResourceType == cug.fnd) {
                this.diV.dkz = gga2.jgt ? ++this.diV.dkz : --this.diV.dkz;
            } else if (gga2.ResourceType == cug.fne) {
                this.diV.dkA = gga2.jgt ? ++this.diV.dkA : --this.diV.dkA;
            } else {
                this.diV.dkB = gga2.jgt ? ++this.diV.dkB : --this.diV.dkB;
            }
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fph)) {
            this.diV.dkD = gga2.jgt ? ++this.diV.dkD : --this.diV.dkD;
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fsg)) {
            this.diV.dkC = gga2.jgt ? ++this.diV.dkC : --this.diV.dkC;
        }
        if (lea.enW().isDescendant(gga2.ResourceType, cug.fjJ)) {
            if (gga2.ResourceType == cug.fjM) {
                this.diV.dkF = gga2.jgt ? ++this.diV.dkF : --this.diV.dkF;
            }
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.frn)) {
            if (gga2.ResourceType == cug.fqS || gga2.ResourceType == cug.fqS) {
                this.diV.dkG = gga2.jgt ? ++this.diV.dkG : --this.diV.dkG;
            }
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fqX)) {
            this.diV.dkH = gga2.jgt ? ++this.diV.dkH : --this.diV.dkH;
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fqY)) {
            this.diV.dkI = gga2.jgt ? ++this.diV.dkI : --this.diV.dkI;
        } else if (gga2.ResourceType == cug.frj) {
            this.diV.dkJ = gga2.jgt ? ++this.diV.dkJ : --this.diV.dkJ;
        } else if (gga2.ResourceType == cug.frk) {
            this.diV.dkK = gga2.jgt ? ++this.diV.dkK : --this.diV.dkK;
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fro)) {
            this.diV.dkL = gga2.jgt ? ++this.diV.dkL : --this.diV.dkL;
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.frT)) {
            this.diV.dkM = gga2.jgt ? ++this.diV.dkM : --this.diV.dkM;
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.frS)) {
            this.diV.dkN = gga2.jgt ? ++this.diV.dkN : --this.diV.dkN;
        } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fpm)) {
            if (lea.enW().isDescendant(gga2.ResourceType, cug.fpl)) {
                this.diV.dkP = gga2.jgt ? ++this.diV.dkP : --this.diV.dkP;
            } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fpi)) {
                this.diV.dkO = gga2.jgt ? ++this.diV.dkO : --this.diV.dkO;
            } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fpp)) {
                this.diV.dkQ = gga2.jgt ? ++this.diV.dkQ : --this.diV.dkQ;
            } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fpq)) {
                this.diV.dkR = gga2.jgt ? ++this.diV.dkR : --this.diV.dkR;
            } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fpr)) {
                this.diV.dkS = gga2.jgt ? ++this.diV.dkS : --this.diV.dkS;
            } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fpg)) {
                this.diV.dkT = gga2.jgt ? ++this.diV.dkT : --this.diV.dkT;
            } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fpk)) {
                this.diV.dkU = gga2.jgt ? ++this.diV.dkU : --this.diV.dkU;
            } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fpc)) {
                this.diV.dkV = gga2.jgt ? ++this.diV.dkV : --this.diV.dkV;
            } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fnV)) {
                this.diV.dkW = gga2.jgt ? ++this.diV.dkW : --this.diV.dkW;
            } else if (lea.enW().isDescendant(gga2.ResourceType, cug.fkV)) {
                this.c(gga2);
            }
        } else {
            this.diV.dlg = gga2.jgt ? ++this.diV.dlg : --this.diV.dlg;
        }
    }

    private void b(gga gga2) {
        b b2 = this.djf.get(gga2.aO().ib());
        if (b2 == null) {
            b2 = new b(this);
            this.djf.put(gga2.aO().ib(), b2);
        }
        if (gga2.jgt) {
            ++b2.djw;
            ++b2.djv;
        } else {
            --b2.djw;
        }
        if (gga2.ResourceType == cug.foD) {
            this.diV.djx = gga2.jgt ? this.diV.djx + 1 : this.diV.djx - 1;
            return;
        }
        if (gga2.ResourceType == cug.foI) {
            this.diV.djy = gga2.jgt ? this.diV.djy + 1 : this.diV.djy - 1;
            return;
        }
        if (gga2.ResourceType == cug.foE) {
            this.diV.djz = gga2.jgt ? this.diV.djz + 1 : this.diV.djz - 1;
            return;
        }
        if (gga2.ResourceType == cug.foH) {
            this.diV.djB = gga2.jgt ? this.diV.djB + 1 : this.diV.djB - 1;
            return;
        }
        if (gga2.ResourceType == cug.foG) {
            this.diV.djA = gga2.jgt ? this.diV.djA + 1 : this.diV.djA - 1;
            return;
        }
        if (gga2.ResourceType == cug.foF) {
            this.diV.djC = gga2.jgt ? this.diV.djC + 1 : this.diV.djC - 1;
            return;
        }
        if (gga2.ResourceType == cug.foJ) {
            this.diV.djD = gga2.jgt ? this.diV.djD + 1 : this.diV.djD - 1;
            return;
        }
        if (gga2.ResourceType == cug.foK) {
            this.diV.djE = gga2.jgt ? this.diV.djE + 1 : this.diV.djE - 1;
            return;
        }
        if (gga2.ResourceType == cug.foL) {
            this.diV.djF = gga2.jgt ? this.diV.djF + 1 : this.diV.djF - 1;
            return;
        }
        if (gga2.ResourceType == cug.foM) {
            this.diV.djG = gga2.jgt ? this.diV.djG + 1 : this.diV.djG - 1;
            return;
        }
        if (gga2.ResourceType == cug.foN) {
            this.diV.djH = gga2.jgt ? this.diV.djH + 1 : this.diV.djH - 1;
            return;
        }
        if (gga2.ResourceType == cug.foO) {
            this.diV.djI = gga2.jgt ? this.diV.djI + 1 : this.diV.djI - 1;
            return;
        }
        if (gga2.ResourceType == cug.foP) {
            this.diV.djJ = gga2.jgt ? this.diV.djJ + 1 : this.diV.djJ - 1;
            return;
        }
        if (gga2.ResourceType == cug.foQ) {
            this.diV.djK = gga2.jgt ? this.diV.djK + 1 : this.diV.djK - 1;
            return;
        }
        this.diV.djM = gga2.jgt ? this.diV.djM + 1 : this.diV.djM - 1;
    }

    private void c(gga gga2) {
        if (gga2.ResourceType == cug.fkW) {
            this.diV.dkX = gga2.jgt ? this.diV.dkX + 1 : this.diV.dkX - 1;
            return;
        }
        if (gga2.ResourceType == cug.fkX) {
            this.diV.dkY = gga2.jgt ? this.diV.dkY + 1 : this.diV.dkY - 1;
            return;
        }
        if (gga2.ResourceType == cug.fkY) {
            this.diV.dkZ = gga2.jgt ? this.diV.dkZ + 1 : this.diV.dkZ - 1;
            return;
        }
        if (gga2.ResourceType == cug.fkZ) {
            this.diV.dla = gga2.jgt ? this.diV.dla + 1 : this.diV.dla - 1;
            return;
        }
        if (gga2.ResourceType == cug.fla) {
            this.diV.dlb = gga2.jgt ? this.diV.dlb + 1 : this.diV.dlb - 1;
            return;
        }
        if (gga2.ResourceType == cug.fld) {
            this.diV.dlc = gga2.jgt ? this.diV.dlc + 1 : this.diV.dlc - 1;
            return;
        }
        if (gga2.ResourceType == cug.fle) {
            this.diV.dld = gga2.jgt ? this.diV.dld + 1 : this.diV.dld - 1;
            return;
        }
        if (gga2.ResourceType == cug.flb) {
            this.diV.dle = gga2.jgt ? this.diV.dle + 1 : this.diV.dle - 1;
            return;
        }
        if (gga2.ResourceType == cug.flc) {
            this.diV.dlf = gga2.jgt ? this.diV.dlf + 1 : this.diV.dlf - 1;
            return;
        }
        assert (false) : "Unknown deployable strongbox : " + gga2.ResourceType;
    }

    private bgg hm(ldv ldv2) {
        bgg bgg2 = this.diY.remove(ldv2);
        if (bgg2 == null) {
            return null;
        }
        if (bgg2.getType() == 0) {
            this.hq(bgg2.aoC());
        } else if (bgg2.getType() == 1) {
            this.hr(bgg2.aoC());
        } else if (bgg2.getType() == 2) {
            this.hs(bgg2.aoC());
        }
        this.diZ.remove(bgg2.aR());
        if (bgg2.iU() != null) {
            this.dja.remove(bgg2.iU().toLowerCase());
        }
        for (int i = 0; i < 20 && !this.djl.get(i).remove(bgg2.aoC()); ++i) {
        }
        this.b(bgg2);
        return bgg2;
    }

    private void d(bgg bgg2) {
        if (bgg2 == null) {
            lfn.b(5, "SFPlayerInfoSensorManager", "addPlayer() Sensor = null");
            return;
        }
        this.diY.put(bgg2.aoC(), bgg2);
        this.diZ.put(bgg2.aR(), bgg2.aoC());
        if (bgg2.iU() != null) {
            this.dja.put(bgg2.iU().toLowerCase(), bgg2.aoC());
        }
        this.c(bgg2);
        if (bgg2.getType() == 0) {
            this.hn(bgg2.aoC());
        } else if (bgg2.getType() == 1) {
            this.ho(bgg2.aoC());
        } else if (bgg2.getType() == 2) {
            this.hp(bgg2.aoC());
        }
        int n = -1;
        if (bgg2.getType() == 0) {
            n = 0;
        }
        if (bgg2.getType() == 1) {
            n = 10;
        }
        if (n < 0) {
            return;
        }
        this.djl.get(n + this.djp).add(bgg2.aoC());
        ++this.djp;
        if (this.djp == 10) {
            this.djp = 0;
        }
    }

    private void hn(ldv ldv2) {
        b b2 = this.djb.get(ldv2.ib());
        if (b2 == null) {
            b2 = new b(this);
            this.djb.put(ldv2.ib(), b2);
        }
        ++b2.djw;
        ++b2.djv;
    }

    private void ho(ldv ldv2) {
        b b2 = this.djc.get(ldv2.ib());
        if (b2 == null) {
            b2 = new b(this);
            this.djc.put(ldv2.ib(), b2);
        }
        ++b2.djw;
        ++b2.djv;
    }

    private void hp(ldv ldv2) {
        b b2 = this.djd.get(ldv2.ib());
        if (b2 == null) {
            b2 = new b(this);
            this.djc.put(ldv2.ib(), b2);
        }
        ++b2.djw;
        ++b2.djv;
    }

    private void hq(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFPlayerInfoSensorManager", "removePlayerFromNodeList() PSOGUID == null");
            return;
        }
        b b2 = this.djb.get(ldv2.ib());
        if (b2 == null) {
            lfn.b(5, "SFPlayerInfoSensorManager", "removePlayerFromNodeList() Can't find the node: " + ldv2);
            return;
        }
        --b2.djw;
    }

    private void hr(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFPlayerInfoSensorManager", "removeAIFromNodeList() PSOGUID == null");
            return;
        }
        b b2 = this.djc.get(ldv2.ib());
        if (b2 == null) {
            lfn.b(5, "SFPlayerInfoSensorManager", "removeAIFromNodeList() Can't find the node: " + ldv2);
            return;
        }
        --b2.djw;
    }

    private void hs(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFPlayerInfoSensorManager", "removeSpawnFromNodeList() PSOGUID == null");
            return;
        }
        b b2 = this.djd.get(ldv2.ib());
        if (b2 == null) {
            lfn.b(5, "SFPlayerInfoSensorManager", "removeSpawnFromNodeList() Can't find the node: " + ldv2);
            return;
        }
        --b2.djw;
    }

    private void a(gpz gpz2) {
        if (gpz2.joT) {
            assert (gpz2.joW != null);
            assert (gpz2.joV != null);
            assert (gpz2.joU != null);
            assert (gpz2.joW.length == gpz2.joV.length);
            assert (gpz2.joW.length == gpz2.joU.length);
            for (int i = 0; i < gpz2.joV.length; ++i) {
                bgg bgg2 = new bgg();
                bgg2.G(gpz2.joW[i]);
                bgg2.fm(gpz2.joV[i]);
                bgg2.setInfo(gpz2.joX[i]);
                bgg2.hh(gpz2.joU[i]);
                bgg2.aP(new ljq());
                bgg2.setType(gpz2.Type);
                this.d(bgg2);
                this.diX.i(gpz2.joW[i], gpz2.joU[i].enw());
            }
        } else {
            assert (gpz2.joU != null);
            for (int i = 0; i < gpz2.joU.length; ++i) {
                bgg bgg3 = this.hm(gpz2.joU[i]);
                if (bgg3 != null) continue;
            }
        }
    }

    public final bgi aoK() {
        return this.diV;
    }

    public final Map<Integer, b> aoL() {
        return this.djb;
    }

    public final Map<Integer, b> aoM() {
        return this.djc;
    }

    public final Map<Integer, b> aoN() {
        return this.djd;
    }

    public final Map<Integer, b> aoO() {
        return this.dje;
    }

    public final Map<Integer, b> aoP() {
        return this.djf;
    }

    public final Map<Integer, b> aoQ() {
        return this.djg;
    }

    public final Map<Integer, b> aoR() {
        return this.djh;
    }

    public final Map<Integer, b> aoS() {
        return this.dji;
    }
}

