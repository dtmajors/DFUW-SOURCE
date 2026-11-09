/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hzo
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class hxb
extends btk
implements jml {
    private final Map<ldv, hxd> ljd = lcn.emw();
    private final Map<ldv, hxd> lje = lcn.emw();
    private hxd ljf = null;
    private hxd ljg = null;
    protected Map<Integer, Float> ljh = lcn.emw();
    protected Map<Integer, Integer> lji = lcn.emw();
    protected Set<hxc> ljj = lcn.emx();

    @Override
    public void initialize() {
        super.initialize();
        ldv ldv2 = hso.cxK().bAn().gZb;
        this.ljf = new hxd(this, ldv2, ldv2, ldv2, bqm.b.dEn, bqm.b.dEn);
        this.lje.put(ldv2, this.ljf);
        this.ljd.put(ldv2, this.ljf);
        this.ljf.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.ljf);
        ldv ldv3 = hso.cxK().bAn().gZe;
        this.ljg = new hxd(this, ldv2, ldv3, ldv2, bqm.b.dEQ, bqm.b.dEn);
        this.lje.put(ldv3, this.ljg);
        this.ljd.put(ldv3, this.ljg);
        this.ljg.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.ljg);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        for (hxd hxd2 : this.ljd.values()) {
            this.MessageDelegator.hd(hxd2.getGUID());
        }
        for (hxd hxd2 : this.lje.values()) {
            this.MessageDelegator.hd(hxd2.getGUID());
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 9985: {
                this.b((gnx)dxq2);
                break;
            }
            case 9986: {
                this.a((gnv)dxq2);
                break;
            }
            case 8000: {
                this.c((fle)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public hxd aj(ldv ldv2, ldv ldv3) {
        amf amf2 = this.MessageDelegator.bzx().bzt().d(ldv2);
        if (amf2 == null) {
            return null;
        }
        if (!(amf2 instanceof bql)) {
            return null;
        }
        bql bql2 = (bql)((Object)amf2);
        bql2.iO(ldv3);
        ldv ldv4 = bql2.iQ(ldv3);
        if (ldv4 == null) {
            return null;
        }
        hxd hxd2 = new hxd(this, ldv4, ldv3, ldv2, bqm.b.dEO, bqm.b.dEn);
        hxd2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(hxd2);
        return hxd2;
    }

    public void b(hxd hxd2) {
        amf amf2 = this.MessageDelegator.bzx().bzt().d(hxd2.cCQ());
        if (amf2 == null) {
            return;
        }
        if (!(amf2 instanceof bql)) {
            return;
        }
        bql bql2 = (bql)((Object)amf2);
        bql2.iR(hxd2.AW());
        this.MessageDelegator.hd(hxd2.getGUID());
    }

    private void b(gnx gnx2) {
        hzo hzo2;
        hxd hxd2;
        if (gnx2.big == bqm.b.dEo) {
            cfj.a(cfv.ACCESS_PLAYER_BANK, this.MessageDelegator, this.GUID);
        }
        if ((hxd2 = this.ljd.get(gnx2.aXQ)) == null) {
            hxd2 = new hxd(this, gnx2.jnt, gnx2.aXQ, gnx2.dAu, gnx2.big, gnx2.jnu);
            hxd2.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(hxd2);
            this.ljd.put(gnx2.aXQ, hxd2);
            if (hso.cxK().cxO() instanceof hzo) {
                hzo2 = (hzo)hso.cxK().cxO();
                hzo2.a(gnx2.aXQ, hxd2);
            }
        }
        if (hso.cxK().cxO() instanceof hzo) {
            hzo2 = (hzo)hso.cxK().cxO();
            hzo2.a(gnx2, hxd2);
        }
    }

    private void a(gnv gnv2) {
        hxd hxd2 = this.ljd.get(gnv2.aXQ);
        if (hxd2 == null) {
            lfn.b(5, "SFInventoryGUIManager", "handleStorageSessionEndMessage: No inventory view for " + gnv2.aXQ);
            assert (false);
            return;
        }
        if (!this.lje.containsKey(gnv2.aXQ)) {
            this.ljd.remove(gnv2.aXQ);
            this.MessageDelegator.hd(hxd2.getGUID());
            int n = hxd2.cCN().ordinal();
        }
        if (bqm.b.isValidRootInventoryType(hxd2.alX()) && hso.cxK().cxO() instanceof hzo) {
            hzo hzo2 = (hzo)hso.cxK().cxO();
            hzo2.c(gnv2);
        }
    }

    public void cCG() {
        if (this.ljf.isOpen()) {
            this.ljf.hide();
        } else {
            this.ljf.show();
        }
    }

    @Override
    public void a(jmq jmq2) {
    }

    @Override
    public void a(jmq jmq2, int n) {
    }

    @Override
    public void a(jmq jmq2, double d2) {
    }

    public hxd cCH() {
        return this.ljf;
    }

    public hxd cCI() {
        return this.ljg;
    }

    public hxd cCJ() {
        for (hxd hxd2 : this.ljd.values()) {
            if (hxd2.alX() != bqm.b.dEo) continue;
            return hxd2;
        }
        return null;
    }

    public hxd ri(ldv ldv2) {
        return this.ljd.get(ldv2);
    }

    public Map<ldv, hxd> cCK() {
        return this.ljd;
    }

    public List<hxd> cCL() {
        ArrayList<hxd> arrayList = lcn.emv();
        for (hxd hxd2 : this.ljd.values()) {
            if (hxd2.cCN() != bqm.b.dEn) continue;
            arrayList.add(hxd2);
        }
        return arrayList;
    }

    public bsh J(int n, ldv ldv2) {
        assert (n == -1 && ldv2 != null || n != -1 && ldv2 == null);
        List<hxd> list = this.cCL();
        for (hxd hxd2 : list) {
            Map<ldv, bsh> map = hxd2.cCO();
            bsh bsh2 = null;
            if (ldv2 != null) {
                bsh2 = map.get(ldv2);
            } else {
                for (bsh bsh3 : map.values()) {
                    if (bsh3.az() != n) continue;
                    bsh2 = bsh3;
                    break;
                }
            }
            if (bsh2 == null) continue;
            return bsh2;
        }
        return null;
    }

    public bsh K(int n, ldv ldv2) {
        return this.J(n, ldv2);
    }

    public bsh al(long l2) {
        List<hxd> list = this.cCL();
        for (hxd hxd2 : list) {
            Map<ldv, bsh> map = hxd2.cCO();
            for (bsh bsh2 : map.values()) {
                bsl bsl2;
                if (!(bsh2 instanceof bsl) || (bsl2 = (bsl)bsh2).AQ() != l2) continue;
                return bsl2;
            }
        }
        return null;
    }

    public hxd cCM() {
        return this.ljg;
    }

    public void a(hxc hxc2, int n) {
        this.ljj.add(hxc2);
        Float f2 = this.ljh.get(n);
        if (f2 == null) {
            f2 = Float.valueOf(0.0f);
        }
        this.ljh.put(n, f2);
        this.E(n, f2.floatValue());
    }

    public void a(hxc hxc2) {
        this.ljj.remove(hxc2);
    }

    protected hxd A(bsh bsh2) {
        if (!lea.enW().isDescendant(bsh2.az(), cug.fjP)) {
            return null;
        }
        return this.ljd.get(bsh2.getGUID());
    }

    public void a(hxd hxd2, bsh bsh2) {
        int n = hxd2.cCN().ordinal();
        if (bsh2.az() == cug.fkb) {
            Integer n2 = this.lji.get(n);
            if (n2 == null) {
                n2 = 0;
            }
            n2 = n2 + bsh2.vf();
            this.lji.put(n, n2);
            this.cX(n, n2);
        } else if (n == bqm.b.dEn.ordinal() && !lea.enW().isDescendant(bsh2.az(), cug.fjP)) {
            Float f2 = this.ljh.get(n);
            if (f2 == null) {
                f2 = Float.valueOf(0.0f);
            }
            for (ej ej2 : bsh2.arJ()) {
                if (ej2.getType() != 1104) continue;
                f2 = Float.valueOf(f2.floatValue() + ((et)ej2).fN());
                this.ljh.put(n, f2);
                this.E(n, f2.floatValue());
                break;
            }
        }
    }

    public void b(hxd hxd2, bsh bsh2) {
        int n = hxd2.cCN().ordinal();
        if (bsh2.az() == cug.fkb) {
            Integer n2 = this.lji.get(n);
            if (n2 == null) {
                n2 = 0;
            }
            n2 = n2 - bsh2.vf();
            this.lji.put(n, n2);
            this.cX(n, n2);
        } else if (n == bqm.b.dEn.ordinal() && !lea.enW().isDescendant(bsh2.az(), cug.fjP)) {
            Float f2 = this.ljh.get(n);
            if (f2 == null) {
                f2 = Float.valueOf(0.0f);
            }
            for (ej ej2 : bsh2.arJ()) {
                if (ej2.getType() != 1104) continue;
                f2 = Float.valueOf(f2.floatValue() - ((et)ej2).fN());
                this.ljh.put(n, f2);
                this.E(n, f2.floatValue());
                break;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void a(hxd hxd2, bsh bsh2, bsh bsh3) {
        int n = hxd2.cCN().ordinal();
        if (bsh3.az() == cug.fkb) {
            Integer n2 = this.lji.get(n);
            if (n2 == null) {
                n2 = 0;
            }
            n2 = n2 + (bsh3.vf() - bsh2.vf());
            this.lji.put(n, n2);
            this.cX(n, n2);
        } else if (!lea.enW().isDescendant(bsh2.az(), cug.fjP) && n == bqm.b.dEn.ordinal()) {
            void var7_11;
            Float f2 = this.ljh.get(n);
            if (f2 == null) {
                f2 = Float.valueOf(0.0f);
            }
            Float f3 = null;
            for (ej ej2 : bsh3.arJ()) {
                if (ej2.getType() != 1104) continue;
                f3 = Float.valueOf(((et)ej2).fN());
                break;
            }
            Object var7_9 = null;
            for (ej ej3 : bsh2.arJ()) {
                if (ej3.getType() != 1104) continue;
                Float f4 = Float.valueOf(((et)ej3).fN());
                break;
            }
            if (var7_11 != null && f3 != null) {
                f2 = Float.valueOf(f2.floatValue() + (f3.floatValue() - var7_11.floatValue()));
                this.ljh.put(n, f2);
                this.E(n, f2.floatValue());
            }
        }
    }

    public void ki(float f2) {
        for (hxc hxc2 : this.ljj) {
            hxc2.ki(f2);
        }
    }

    protected void cX(int n, int n2) {
        for (hxc hxc2 : this.ljj) {
            hxc2.cY(n, n2);
        }
    }

    protected void E(int n, float f2) {
        for (hxc hxc2 : this.ljj) {
            hxc2.F(n, f2);
        }
    }

    public int OJ(int n) {
        int n2 = 0;
        List<hxd> list = this.cCL();
        for (hxd hxd2 : list) {
            if (hxd2.cCN() != bqm.b.dEn) continue;
            Map<ldv, bsh> map = hxd2.cCO();
            for (bsh bsh2 : map.values()) {
                if (bsh2.az() != n) continue;
                n2 += bsh2.vf();
            }
        }
        return n2;
    }

    public int OK(int n) {
        int n2 = 0;
        les les2 = lea.enW();
        List<hxd> list = this.cCL();
        for (hxd hxd2 : list) {
            if (hxd2.cCN() != bqm.b.dEn) continue;
            Map<ldv, bsh> map = hxd2.cCO();
            for (bsh bsh2 : map.values()) {
                if (!les2.isDescendant(bsh2.az(), n)) continue;
                n2 += bsh2.vf();
            }
        }
        return n2;
    }

    public boolean rj(ldv ldv2) {
        List<hxd> list = this.cCL();
        for (hxd hxd2 : list) {
            if (!hxd2.rr(ldv2)) continue;
            return true;
        }
        return false;
    }

    public bsh rk(ldv ldv2) {
        List<hxd> list = this.cCL();
        for (hxd hxd2 : list) {
            bsh bsh2 = hxd2.ro(ldv2);
            if (bsh2 == null) continue;
            return bsh2;
        }
        return null;
    }

    public hxd d(bqm.b b2) {
        for (hxd hxd2 : this.ljd.values()) {
            if (hxd2.alX() != b2) continue;
            return hxd2;
        }
        for (hxd hxd2 : this.lje.values()) {
            if (hxd2.alX() != b2) continue;
            return hxd2;
        }
        return null;
    }

    public hxd rl(ldv ldv2) {
        hxd hxd2 = this.ljd.get(ldv2);
        if (hxd2 == null) {
            hxd2 = this.lje.get(ldv2);
        }
        return hxd2;
    }

    public void a(bsh bsh2, String string) {
        fld fld2 = (fld)this.MessageDelegator.h(7999, this.getGUID(), bsh2.avU());
        fld2.aCK = bsh2.getGUID();
        fld2.iPm = string;
        this.MessageDelegator.F(fld2);
    }

    private void c(fle fle2) {
        bsh bsh2 = this.rk(fle2.aCK);
        if (bsh2 == null) {
            return;
        }
        ilw.ddy().a(bsh2, fle2.iPn);
    }

    public bsh rm(ldv ldv2) {
        for (hxd hxd2 : this.ljd.values()) {
            bsh bsh2 = hxd2.ro(ldv2);
            if (bsh2 == null) continue;
            return bsh2;
        }
        return null;
    }

    public boolean rn(ldv ldv2) {
        return this.rj(ldv2) || this.ljg.rr(ldv2);
    }
}

