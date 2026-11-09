/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class dmn
extends dmm
implements hsn {
    private boolean gIz = false;
    private int gIA = 0;
    private Map<Class, Set> gIB = lcn.emw();
    private boolean gIC = false;
    private Set<huy> gID = lcn.emx();
    private Set<huy> gIE = lcn.emx();
    private Map<Integer, dmk> gIF = lcn.emw();
    private Map<Integer, ldv> gIG = lcn.emw();
    private dqi asE = null;
    private ljq asF = null;
    private dmi gIH = null;

    public boolean HT() {
        return this.gIz;
    }

    @Override
    protected boolean bqv() {
        return false;
    }

    @Override
    public bcp AG(int n) {
        ldv ldv2 = this.gIG.get(n);
        if (ldv2 == null) {
            return null;
        }
        ldv ldv3 = null;
        if (this.gIw.containsKey(ldv2)) {
            ldv3 = ((azg)this.gIw.get(ldv2)).iG();
        } else if (this.gIx.containsKey(ldv2)) {
            ldv3 = ((bbh)this.gIx.get(ldv2)).iG();
        } else if (this.dpR.containsKey(ldv2)) {
            ldv3 = ((bbi)this.dpR.get(ldv2)).iG();
        }
        return ldv3 == null ? null : (bcp)this.dih.get(ldv3);
    }

    public void a(huy huy2) {
        if (huy2 == null) {
            return;
        }
        if (this.gIC) {
            if (this.gID == null) {
                this.gID = lcn.emx();
            }
            this.gID.add(huy2);
            if (this.gIE != null) {
                this.gIE.remove(huy2);
            }
        } else {
            Class<?>[] classArray = huy2.getClass().getInterfaces();
            for (int i = 0; i < classArray.length; ++i) {
                this.a(classArray[i], huy2);
            }
        }
    }

    private void a(Class<?> clazz, huy huy2) {
        if (!huy.class.isAssignableFrom(clazz)) {
            return;
        }
        Set<huy> set = this.gIB.get(clazz);
        if (set == null) {
            set = lcn.emx();
            this.gIB.put(clazz, set);
        }
        if (!set.contains(huy2)) {
            set.add(huy2);
        }
        Class<?>[] classArray = clazz.getInterfaces();
        for (int i = 0; i < classArray.length; ++i) {
            this.a(classArray[i], huy2);
        }
    }

    <T> Set<T> c(Class<T> clazz) {
        return this.gIB.containsKey(clazz) ? this.gIB.get(clazz) : new HashSet();
    }

    public void b(huy huy2) {
        if (huy2 == null) {
            return;
        }
        if (this.gIC) {
            if (this.gIE == null) {
                this.gIE = lcn.emx();
            }
            this.gIE.add(huy2);
            if (this.gID != null) {
                this.gID.remove(huy2);
            }
        } else {
            for (Set set : this.gIB.values()) {
                set.remove(huy2);
            }
        }
    }

    void ir(boolean bl) {
        if (bl == this.gIC) {
            return;
        }
        this.gIC = bl;
        if (!this.gIC) {
            if (this.gID != null) {
                for (huy huy2 : this.gID) {
                    this.a(huy2);
                }
            }
            if (this.gIE != null) {
                for (huy huy2 : this.gIE) {
                    this.b(huy2);
                }
            }
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        if (hso.cxK() != null) {
            hso.cxK().a(this);
        }
    }

    @Override
    public void cleanUp() {
        for (Set set : this.gIB.values()) {
            set.clear();
        }
        this.gIB.clear();
        this.gID.clear();
        this.gIE.clear();
        if (hso.cxK() != null) {
            hso.cxK().b(this);
        }
        if (this.asE != null && hso.cxK() != null && hso.cxK().bAn() != null && hso.cxK().bAn().gYY != null) {
            this.h(this.asE.getGUID(), hso.cxK().bAn().gYY);
            this.asE = null;
        }
        super.cleanUp();
    }

    @Override
    protected void m(bcp bcp2) {
        if (bcp2 == null) {
            return;
        }
        Set<huv> set = this.c(huv.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (huv huv2 : set) {
                huv2.v(bcp2);
            }
            this.ir(false);
        }
    }

    @Override
    protected void n(bcp bcp2) {
        Set<huv> set;
        if (bcp2 == null) {
            return;
        }
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czb() != null) {
            hso.cxK().cxP().czb().B(bcp2.iG(), bcp2.iV());
        }
        if (!(set = this.c(huv.class)).isEmpty()) {
            this.ir(true);
            for (huv huv2 : set) {
                huv2.w(bcp2);
            }
            this.ir(false);
        }
    }

    public void bqx() {
        this.bqy();
    }

    private void bqy() {
        if (!this.HT()) {
            return;
        }
        if (this.asF == null) {
            return;
        }
        int n = this.gIt.eR(this.asF);
        dml dml2 = (dml)this.gIu.get(n);
        dmq dmq2 = (dmq)this.gIv.get(n);
        dmf dmf2 = dmf.gHt;
        if (dml2 != null) {
            jng jng2 = null;
            if (hso.cxK() != null && hso.cxK().cxP() != null) {
                jng2 = hso.cxK().cxP().czb();
            }
            if (jng2 == null) {
                return;
            }
            if (jng2.dNh() && dml2.bqi() != null) {
                if (jng2.sz(dml2.bqi())) {
                    dmf2 = dmf.gHu;
                } else {
                    switch (this.Y(dml2.bqi(), jng2.ack())) {
                        case cXi: {
                            dmf2 = dmf.gHv;
                            break;
                        }
                        case cXe: {
                            dmf2 = dmf.gHw;
                        }
                    }
                }
            }
        }
        if (this.gIH == null) {
            this.gIH = new dmi();
        }
        this.gIH.b(dmq2, dmf2);
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyJ() != null && hso.cxK().cxP().cyJ().cIo() != null) {
            hso.cxK().cxP().cyJ().cIo().b(this.gIH);
        }
    }

    @Override
    public void oo() {
        ldv ldv2;
        ldv ldv3 = ldv2 = hso.cxK() != null && hso.cxK().bAn() != null ? hso.cxK().bAn().gYY : null;
        if (ldv2 == null) {
            return;
        }
        this.asE = new dqi();
        this.asE.setGUID(this.MessageDelegator.bzv());
        this.asE.nC(this.GUID);
        this.asE.M(new int[]{1488});
        this.asE.setMessageDelegator(this.MessageDelegator);
        this.a(this.asE, ldv2);
    }

    @Override
    public boolean op() {
        return true;
    }

    @Override
    public void a(jnz jnz2, jnz jnz3) {
    }

    @Override
    public void a(joa joa2) {
    }

    @Override
    public void b(joa joa2) {
    }

    @Override
    public void cB(int n) {
    }

    @Override
    public void X(boolean bl) {
    }

    private void a(dqi dqi2, ldv ldv2) {
        gzo gzo2 = (gzo)this.MessageDelegator.h(8193, this.GUID, ldv2);
        gzo2.jvG = dqi2;
        this.MessageDelegator.F(gzo2);
    }

    private void h(ldv ldv2, ldv ldv3) {
        gzr gzr2 = (gzr)this.MessageDelegator.h(8194, this.GUID, ldv3);
        gzr2.bWM = ldv2;
        this.MessageDelegator.F(gzr2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 32265: {
                this.a((gul)dxq2);
                break;
            }
            case 32269: {
                this.a((gum)dxq2);
                break;
            }
            case 32268: {
                this.a((gun)dxq2);
                break;
            }
            case 32266: {
                this.a((guo)dxq2);
                break;
            }
            case 32267: {
                this.a((gup)dxq2);
                break;
            }
            case 32282: {
                this.a((gvg)dxq2);
                break;
            }
            case 8196: {
                this.a((gzq)dxq2);
                break;
            }
            case 8195: {
                this.a((gzp)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
                return;
            }
        }
    }

    private void a(gul gul2) {
        dml dml2;
        if (this.gIz) {
            lfn.b(5, this.getClass().getSimpleName(), "handleTerritoryClientBulkUpdateMessage() : Bulk Update Message Received, But All Expected Updates Already Received!!!");
            assert (false);
            return;
        }
        for (azg object : gul2.bXN()) {
            this.gIw.put(object.getGUID(), object);
            this.gIG.put(object.acY(), object.getGUID());
            dml2 = this.a(object);
            dml2.mT(object.iG());
            this.b(dml2);
        }
        for (bbh bbh2 : gul2.bXO()) {
            this.gIx.put(bbh2.getGUID(), bbh2);
            this.gIG.put(bbh2.acY(), bbh2.getGUID());
            dml2 = this.a(bbh2);
            dml2.mT(bbh2.iG());
            this.b(dml2);
        }
        for (bbi bbi2 : gul2.bXQ()) {
            this.dpR.put(bbi2.getGUID(), bbi2);
            this.gIG.put(bbi2.acY(), bbi2.getGUID());
            dml2 = this.a(bbi2);
            dml2.mT(bbi2.iG());
            this.b(dml2);
        }
        for (bcp bcp2 : gul2.bXP()) {
            this.dih.put(bcp2.iG(), bcp2);
        }
        for (cmd cmd2 : gul2.bXR()) {
            this.gIy.put(cmd2.getGUID(), cmd2);
        }
        ++this.gIA;
        if (this.gIA == gul2.bIK()) {
            this.gIz = true;
            Set<huy> set = this.c(huy.class);
            if (!set.isEmpty()) {
                this.ir(true);
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                    huy huy2 = (huy)iterator.next();
                    huy2.cyF();
                }
                this.ir(false);
            }
            this.bqy();
            jvq.dTB();
        }
    }

    private void a(gum gum2) {
        this.dih.put(gum2.bXS().iG(), gum2.bXS());
        Set<huv> set = this.c(huv.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (huv huv2 : set) {
                huv2.u(gum2.bXS());
            }
            this.ir(false);
        }
    }

    private void a(gun gun2) {
        bcp bcp2 = (bcp)this.dih.get(gun2.iG());
        if (bcp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleTerritoryClientClanStanceUpdateMessage() : Stance Update Message Received for Unregistered Clan!!!");
            assert (false);
            return;
        }
        bcp2.a(gun2.alD(), gun2.bXT());
        this.bqy();
        Set<huw> set = this.c(huw.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (huw huw2 : set) {
                huw2.c(bcp2, gun2.alD(), gun2.bXT());
            }
            this.ir(false);
        }
    }

    private void a(guo guo2) {
        Object object;
        if (guo2.bXV() != null) {
            object = (bcp)this.dih.get(guo2.bXV());
            if (object == null) {
                lfn.b(4, this.getClass().getSimpleName(), "handleTerritoryClientOwnerUpdateMessage() : Owner Update Message Received for Unregistered Clan!!!... Postponing Message Until Clan is Registered!!!... ClanGUID = " + guo2.bXV());
                this.MessageDelegator.I(guo2);
                return;
            }
            if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czb() != null) {
                hso.cxK().cxP().czb().sJ(((bcp)object).iG());
            }
        }
        if ((object = (azg)this.gIw.get(guo2.bXU())) != null) {
            ldv ldv2 = ((azg)object).iG();
            ((azg)object).ch(guo2.bXV());
            if (ldv2 != null) {
                this.nq(ldv2);
                if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czb() != null) {
                    hso.cxK().cxP().czb().sJ(ldv2);
                }
            }
            dml dml2 = this.a((azg)object);
            dml2.mT(((azg)object).iG());
            this.b(dml2);
            this.bqy();
            hso.cxK().cxT().dJf().dLK();
            Set<hvb> set = this.c(hvb.class);
            if (!set.isEmpty()) {
                this.ir(true);
                for (hvb hvb2 : set) {
                    hvb2.i((azg)object);
                }
                this.ir(false);
            }
            return;
        }
        bbh bbh2 = (bbh)this.gIx.get(guo2.bXU());
        if (bbh2 != null) {
            ldv ldv3 = bbh2.iG();
            bbh2.ch(guo2.bXV());
            if (ldv3 != null) {
                this.nq(ldv3);
                if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czb() != null) {
                    hso.cxK().cxP().czb().sJ(ldv3);
                }
            }
            dml dml3 = this.a(bbh2);
            dml3.mT(bbh2.iG());
            this.b(dml3);
            this.bqy();
            hso.cxK().cxT().dJf().dLK();
            Set<hve> set = this.c(hve.class);
            if (!set.isEmpty()) {
                this.ir(true);
                for (hve hve2 : set) {
                    hve2.g(bbh2);
                }
                this.ir(false);
            }
            return;
        }
        bbi bbi2 = (bbi)this.dpR.get(guo2.bXU());
        if (bbi2 != null) {
            ldv ldv4 = bbi2.iG();
            bbi2.ch(guo2.bXV());
            if (ldv4 != null) {
                this.nq(ldv4);
                if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czb() != null) {
                    hso.cxK().cxP().czb().sJ(ldv4);
                }
            }
            dml dml4 = this.a(bbi2);
            dml4.mT(bbi2.iG());
            this.b(dml4);
            this.bqy();
            hso.cxK().cxT().dJf().dLK();
            Set<huz> set = this.c(huz.class);
            if (!set.isEmpty()) {
                this.ir(true);
                for (huz huz2 : set) {
                    huz2.f(bbi2);
                }
                this.ir(false);
            }
            return;
        }
        lfn.b(5, this.getClass().getSimpleName(), "handleTerritoryClientOwnerUpdateMessage() : Owner Update Received for Unregistered Territorial Object!!!");
        assert (false);
    }

    private void a(gup gup2) {
        azg azg2 = (azg)this.gIw.get(gup2.bXU());
        if (azg2 != null) {
            azg2.cv(gup2.acT());
            azg2.ao(gup2.acU());
            azg2.ap(gup2.acV());
            azg2.aq(gup2.bXW());
            azg2.ar(gup2.acX());
            Set<hvc> set = this.c(hvc.class);
            if (!set.isEmpty()) {
                this.ir(true);
                for (hvc hvc2 : set) {
                    hvc2.j(azg2);
                }
                this.ir(false);
            }
            return;
        }
        bbh bbh2 = (bbh)this.gIx.get(gup2.bXU());
        if (bbh2 != null) {
            bbh2.ao(gup2.acU());
            bbh2.ar(gup2.acX());
            bbh2.aH(gup2.ajT());
            bbh2.aI(gup2.ajU());
            bbh2.cr(gup2.ajV());
            Set<hvf> set = this.c(hvf.class);
            if (!set.isEmpty()) {
                this.ir(true);
                for (hvf hvf2 : set) {
                    hvf2.h(bbh2);
                }
                this.ir(false);
            }
            return;
        }
        bbi bbi2 = (bbi)this.dpR.get(gup2.bXU());
        if (bbi2 != null) {
            bbi2.ao(gup2.acU());
            bbi2.aJ(gup2.acX());
            bbi2.cN(gup2.isDestroyed());
            bbi2.aL(gup2.ajZ());
            bbi2.aK(gup2.ajY());
            Set<hva> set = this.c(hva.class);
            if (!set.isEmpty()) {
                this.ir(true);
                for (hva hva2 : set) {
                    hva2.g(bbi2);
                }
            }
            return;
        }
        cmd cmd2 = (cmd)this.gIy.get(gup2.bXU());
        if (cmd2 != null) {
            cmd2.setDuration(gup2.bXW());
            cmd2.aJ(gup2.acX());
            cmd2.setActive(gup2.isDestroyed());
            cmd2.rH(gup2.aSU());
            cmd2.rI(gup2.aSV());
            cmd2.rJ(gup2.aSX());
            cmd2.go(gup2.aSW());
            Set<hvd> set = this.c(hvd.class);
            if (!set.isEmpty()) {
                this.ir(true);
                for (hvd hvd2 : set) {
                    hvd2.c(cmd2);
                }
            }
            return;
        }
        lfn.b(5, this.getClass().getSimpleName(), "handleTerritoryClientStateUpdateMessage() : Stance Update Received for Unregistered Territorial Object!!!");
        assert (false);
    }

    private void a(gvg gvg2) {
        dml dml2 = (dml)this.gIu.get(gvg2.acY());
        if (dml2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleTerritoryServerCollectorStatusChangedMessage() : Stance Update Received for Unregistered Territorial Object!!!");
            assert (false);
            return;
        }
        azg azg2 = hso.cxK().cxP().czd().AJ(dml2.acY());
        if (azg2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleTerritoryServerCollectorStatusChangedMessage() : Stance Update Received for Territorial Object and there is no holding associated with it!!!");
            assert (false);
            return;
        }
        azg2.ir(gvg2.XC());
        azg2.is(gvg2.XD());
        dml2.ir(gvg2.XC());
        dml2.is(gvg2.XD());
        Set<hux> set = this.c(hux.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (hux hux2 : set) {
                hux2.h(azg2);
            }
        }
    }

    private void a(gzq gzq2) {
        block3: for (ej ej2 : gzq2.DR) {
            switch (ej2.getType()) {
                case 1488: {
                    fc fc2 = (fc)ej2.getValue();
                    this.asF = fc2.Position;
                    this.bqy();
                    continue block3;
                }
                default: {
                    assert (false) : "Recieved wiretap attribute value message for unknown attribute!!!";
                    return;
                }
            }
        }
    }

    private void a(gzp gzp2) {
        switch (gzp2.bhp.getType()) {
            case 1488: {
                fc fc2 = (fc)gzp2.bhp.getValue();
                if (this.asF != null && this.asF.B(fc2.Position, 1.0f)) {
                    return;
                }
                this.asF = fc2.Position;
                this.bqy();
                break;
            }
            default: {
                assert (false) : "Recieved wiretap attribute changed message for unknown attribute!!!";
                return;
            }
        }
    }
}

