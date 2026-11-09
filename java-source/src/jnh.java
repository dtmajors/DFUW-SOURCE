/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hzo
 *  jjg
 *  jnk
 *  lcw
 */
import java.util.Map;
import java.util.Set;

public class jnh
extends jnl
implements huu {
    private Map<Integer, bao> nDx = null;
    private int nDy = 0;
    private azz[] nDz = null;
    private Map<ljq, ldv> nDA = null;
    private Map<ldv, azx> nDB = null;

    boolean bJG() {
        return this.nDv.dNI() ? this.nDz != null && this.nDz.length > 0 || !this.nDB.isEmpty() : false;
    }

    int a(ayb ayb2, int n, ldv ldv2, azz azz2) {
        int n2;
        int n3;
        int n4;
        int n5 = n * jnr.itF.ahE();
        switch (ayb2) {
            case cvj: {
                if (n5 >= jnr.itF.ahl()) break;
                n5 = jnr.itF.ahl();
                break;
            }
            case cvk: {
                if (n5 >= jnr.itF.ahm()) break;
                n5 = jnr.itF.ahm();
            }
        }
        boolean bl = false;
        int n6 = 0;
        if (this.nDz != null) {
            for (n4 = 0; n4 < this.nDz.length; ++n4) {
                if (this.nDz[n4].fD(this.nDv.iG()) && this.nDz[n4].a(ldv2, false, false)) {
                    boolean bl2 = bl = ++n6 == 1;
                }
                if (!this.nDz[n4].a(this.nDv.iG(), false, false) || !this.nDz[n4].fD(ldv2)) continue;
                ++n6;
                bl = false;
            }
        }
        if (bl) {
            n5 -= (int)((float)n5 * jnr.itF.ahF());
        }
        n4 = 0;
        int n7 = 0;
        int n8 = 0;
        if (azz2 != null) {
            n3 = (int)((jnr.itF.ahG() - (azz2.afE() - (this.MessageDelegator.arc().rgz - azz2.afJ()))) / 3600.0);
            n4 = n3 * (int)((float)n5 * jnr.itF.ahH());
            n2 = azz2.afC().length + azz2.afD().length;
            n7 = n2 * (int)((float)n5 * jnr.itF.ahh());
        }
        n3 = 0;
        if (this.nDz != null) {
            for (n2 = 0; n2 < this.nDz.length; ++n2) {
                if (this.nDz[n2].fD(this.nDv.iG())) continue;
                ++n3;
            }
        }
        n8 = n3 * (int)((float)n5 * jnr.itF.ahj());
        return n5 + n4 + n7 + n8;
    }

    bao[] f(azz azz2) {
        if (!this.nDv.dNI()) {
            return new bao[0];
        }
        if (this.nDF.abV() == null || this.nDF.abV().length == 0) {
            return new bao[0];
        }
        int n = 0;
        for (bao bao2 : this.nDF.abV()) {
            if (!bao2.aiK().equals(azz2.afl())) continue;
            ++n;
        }
        if (n == 0) {
            return new bao[0];
        }
        bao[] baoArray = new bao[n];
        n = 0;
        for (bao bao3 : this.nDF.abV()) {
            if (!bao3.aiK().equals(azz2.afl())) continue;
            baoArray[n++] = bao3;
        }
        return baoArray;
    }

    bao[] g(azz azz2) {
        if (!this.nDv.dNI()) {
            return new bao[0];
        }
        if (this.nDF.abW() == null || this.nDF.abW().length == 0) {
            return new bao[0];
        }
        int n = 0;
        for (bao bao2 : this.nDF.abW()) {
            if (!bao2.aiK().equals(azz2.afl())) continue;
            ++n;
        }
        if (n == 0) {
            return new bao[0];
        }
        bao[] baoArray = new bao[n];
        n = 0;
        for (bao bao3 : this.nDF.abW()) {
            if (!bao3.aiK().equals(azz2.afl())) continue;
            baoArray[n++] = bao3;
        }
        return baoArray;
    }

    bao C(ldv ldv2, String string) {
        if (ldv2 == null || string == null) {
            return null;
        }
        if (!this.nDv.dNI()) {
            return null;
        }
        for (bao bao2 : this.nDF.abV()) {
            if (!bao2.aiK().equals(ldv2) || bao2.h(bao2.gk(this.nDF.iG()).ajz()).compareToIgnoreCase(string) != 0) continue;
            return bao2;
        }
        return null;
    }

    bao D(ldv ldv2, String string) {
        if (ldv2 == null || string == null) {
            return null;
        }
        if (!this.nDv.dNI()) {
            return null;
        }
        for (bao bao2 : this.nDF.abW()) {
            if (!bao2.aiK().equals(ldv2) || bao2.h(bao2.gk(this.nDF.iG()).ajz()).compareToIgnoreCase(string) != 0) continue;
            return bao2;
        }
        return null;
    }

    boolean S(ldv ldv2, boolean bl) {
        if (ldv2 == null) {
            return false;
        }
        if (!this.nDv.dNI()) {
            return false;
        }
        if (this.nDz != null) {
            for (int j = 0; j < this.nDz.length; ++j) {
                if (!this.nDz[j].q(ldv2, bl)) continue;
                return true;
            }
        }
        return false;
    }

    boolean ap(ldv ldv2, ldv ldv3) {
        if (ldv2 == null) {
            return false;
        }
        if (!this.nDv.dNI()) {
            return false;
        }
        for (bao bao2 : this.nDF.abV()) {
            if (!bao2.g(bao2.gk(this.nDF.iG()).ajz()).equals(ldv2) || !bao2.aiK().equals(ldv3)) continue;
            return true;
        }
        for (bao bao2 : this.nDF.abW()) {
            if (!bao2.g(bao2.gk(this.nDF.iG()).ajz()).equals(ldv2) || !bao2.aiK().equals(ldv3)) continue;
            return true;
        }
        return false;
    }

    int sL(ldv ldv2) {
        if (!this.nDB.containsKey(ldv2)) {
            return 0;
        }
        return this.nDB.get(ldv2).afo();
    }

    float sM(ldv ldv2) {
        if (!this.nDB.containsKey(ldv2)) {
            return 0.0f;
        }
        return this.nDB.get(ldv2).afm();
    }

    float sN(ldv ldv2) {
        if (!this.nDB.containsKey(ldv2)) {
            return 0.0f;
        }
        return this.nDB.get(ldv2).afn();
    }

    int aq(ldv ldv2, ldv ldv3) {
        if (!this.nDB.containsKey(ldv2)) {
            return 0;
        }
        azx azx2 = this.nDB.get(ldv2);
        if (!azx2.fy(ldv3)) {
            return 0;
        }
        azv azv2 = azx2.fz(ldv3);
        double d2 = azv2.D(this.MessageDelegator.arc());
        return d2 <= 0.0 ? -1 : (int)d2;
    }

    azw[] ar(ldv ldv2, ldv ldv3) {
        if (!this.nDB.containsKey(ldv2)) {
            return new azw[0];
        }
        azx azx2 = this.nDB.get(ldv2);
        if (!azx2.fy(ldv3)) {
            return new azw[0];
        }
        azv azv2 = azx2.fz(ldv3);
        return azv2.afh();
    }

    int as(ldv ldv2, ldv ldv3) {
        if (!this.nDB.containsKey(ldv2)) {
            return 0;
        }
        azx azx2 = this.nDB.get(ldv2);
        if (!azx2.fy(ldv3)) {
            return 0;
        }
        azv azv2 = azx2.fz(ldv3);
        return azv2.aer();
    }

    jnh(jng jng2, jnr jnr2, dmn dmn2, jnk jnk2) {
        super(jng2, jnr2, dmn2, jnk2);
        this.nDD.a(this);
        this.nDB = lcn.emw();
    }

    @Override
    public void cyE() {
        Set<hth> set;
        if (!this.nDv.dNI()) {
            return;
        }
        azz[] azzArray = this.nDz;
        this.nDz = this.nDD.sY(this.nDF.iG());
        if (azzArray == null && this.nDz == null) {
            return;
        }
        if (azzArray == null && this.nDz != null || azzArray != null && this.nDz == null || azzArray.length != this.nDz.length) {
            Set<hth> set2 = this.nDC.c(hth.class);
            if (!set2.isEmpty()) {
                this.nDC.ir(true);
                for (hth hth2 : set2) {
                    hth2.cyx();
                }
                this.nDC.ir(false);
            }
        } else if (this.nDz.length > 0 && !(set = this.nDC.c(hth.class)).isEmpty()) {
            this.nDC.ir(true);
            for (int j = 0; j < this.nDz.length; ++j) {
                for (hth hth3 : set) {
                    hth3.b(this.nDz[j]);
                }
            }
            this.nDC.ir(false);
        }
        this.dNG();
        this.nDv.dNQ();
    }

    @Override
    void dND() {
        super.dND();
        if (this.nDF != null && this.nDF.abX() != null && this.nDF.abX().length > 0) {
            for (int j = 0; j < this.nDF.abX().length; ++j) {
                this.nDB.put(this.nDF.abX()[j].afl(), this.nDF.abX()[j]);
            }
        }
        this.cyE();
    }

    @Override
    void dNE() {
        this.nDF = this.nDv.dNJ();
        if (this.nDF != null) {
            this.nDB.clear();
            if (this.nDF.abX() != null && this.nDF.abX().length > 0) {
                for (int j = 0; j < this.nDF.abX().length; ++j) {
                    this.nDB.put(this.nDF.abX()[j].afl(), this.nDF.abX()[j]);
                }
            }
        }
        this.cyE();
    }

    @Override
    void dNF() {
        this.nDF = this.nDv.dNJ();
        this.nDz = this.nDD.sY(this.nDF.iG());
        this.dNG();
    }

    @Override
    void bqx() {
        this.nDF = null;
        this.nDz = null;
        this.dNG();
    }

    private void dNG() {
        jjg jjg2;
        if (hso.cxK() != null && hso.cxK().cxO() != null && hso.cxK().cxO() instanceof hzo && (jjg2 = hso.cxK().cxT()) != null) {
            Map.Entry<ljq, ldv> entry22;
            Map<ljq, azw> map = lcn.emw();
            if (this.nDA == null) {
                this.nDA = lcn.emw();
            }
            if (this.nDz != null && this.nDz.length > 0) {
                for (int j = 0; j < this.nDz.length; ++j) {
                    boolean bl = this.nDz[j].afF() - (this.MessageDelegator.arc().rgz - this.nDz[j].afJ()) <= 0.0;
                    entry22 = this.nDB.get(this.nDz[j].afl());
                    if (entry22 == null) continue;
                    for (azv azv2 : ((azx)((Object)entry22)).afp()) {
                        if (!azv2.getGUID().equals(this.nDF.iG()) && !bl || azv2.afh() == null || azv2.afh().length <= 0) continue;
                        for (azw azw2 : azv2.afh()) {
                            map.put(azw2.av(), azw2);
                        }
                    }
                }
            }
            if (!this.nDA.isEmpty()) {
                Set<Map.Entry<ljq, ldv>> set = lcn.emx();
                for (Map.Entry<ljq, ldv> entry22 : this.nDA.entrySet()) {
                    if (map.containsKey(entry22.getKey())) continue;
                    jjg2.rW(entry22.getValue());
                    set.add((Map.Entry<ljq, ldv>)entry22.getKey());
                }
                if (!set.isEmpty()) {
                    for (Map.Entry<ljq, ldv> entry22 : set) {
                        azv[] azvArray = this.nDA.remove(entry22);
                        this.MessageDelegator.oa((ldv)azvArray);
                    }
                }
            }
            if (!map.isEmpty()) {
                for (azw azw3 : map.values()) {
                    if (!this.nDA.isEmpty() && this.nDA.containsKey(azw3.av())) continue;
                    entry22 = this.MessageDelegator.bzv();
                    jjg2.a(azw3.av(), (ldv)((Object)entry22), azw3.getName());
                    this.nDA.put(azw3.av(), (ldv)((Object)entry22));
                }
            }
        }
    }

    void a(ayp ayp2, int n, hti hti2) {
        if (hti2 == null) {
            return;
        }
        this.nDC.a(hti2);
        this.a(ayp2, n);
    }

    void a(bao bao2, hue hue2) {
        if (hue2 == null) {
            return;
        }
        if (bao2 == null) {
            hue2.b(bao2, baq.cNj.fA().bD(new Object[0]).exA());
            return;
        }
        if (!this.nDv.dNI()) {
            hue2.b(bao2, baq.cNo.fA().bD(new Object[0]).exA());
            return;
        }
        bbc bbc2 = bao2.gk(this.nDF.iG());
        if (bbc2 == null) {
            hue2.b(bao2, baq.cNm.fA().bD(new Object[0]).exA());
            return;
        }
        switch (bbc2) {
            case cPQ: {
                if (this.nDF.b(bca.cUF)) break;
                hue2.b(bao2, baq.cNp.fA().bD(new Object[0]).exA());
                return;
            }
            case cPP: {
                if (this.nDF.b(bca.cUE)) break;
                hue2.b(bao2, baq.cNp.fA().bD(new Object[0]).exA());
                return;
            }
            default: {
                hue2.b(bao2, baq.cNm.fA().bD(new Object[0]).exA());
                return;
            }
        }
        boolean bl = false;
        for (bao bao3 : this.nDF.abW()) {
            if (bao2 != bao3) continue;
            bl = true;
        }
        if (!bl) {
            for (bao bao3 : this.nDF.abV()) {
                if (bao2 != bao3) continue;
                bl = true;
            }
            if (bl) {
                hue2.b(bao2, baq.cNK.fA().bD(new Object[0]).exA());
                return;
            }
            hue2.b(bao2, baq.cNk.fA().bD(new Object[0]).exA());
            return;
        }
        this.nDC.a(hue2);
        this.a(bao2, bap.cNf, 0, 0.0f);
    }

    void b(bao bao2, hue hue2) {
        if (hue2 == null) {
            return;
        }
        if (bao2 == null) {
            hue2.b(bao2, baq.cNj.fA().bD(new Object[0]).exA());
            return;
        }
        if (!this.nDv.dNI()) {
            hue2.b(bao2, baq.cNo.fA().bD(new Object[0]).exA());
            return;
        }
        bbc bbc2 = bao2.gk(this.nDF.iG());
        if (bbc2 == null) {
            hue2.b(bao2, baq.cNm.fA().bD(new Object[0]).exA());
            return;
        }
        switch (bbc2) {
            case cPQ: {
                if (this.nDF.b(bca.cUF)) break;
                hue2.b(bao2, baq.cNp.fA().bD(new Object[0]).exA());
                return;
            }
            case cPP: {
                if (this.nDF.b(bca.cUE)) break;
                hue2.b(bao2, baq.cNp.fA().bD(new Object[0]).exA());
                return;
            }
            default: {
                hue2.b(bao2, baq.cNm.fA().bD(new Object[0]).exA());
                return;
            }
        }
        boolean bl = false;
        for (bao bao3 : this.nDF.abW()) {
            if (bao2 != bao3) continue;
            bl = true;
        }
        if (!bl) {
            for (bao bao3 : this.nDF.abV()) {
                if (bao2 != bao3) continue;
                bl = true;
            }
            if (bl) {
                hue2.b(bao2, baq.cNK.fA().bD(new Object[0]).exA());
                return;
            }
            hue2.b(bao2, baq.cNk.fA().bD(new Object[0]).exA());
            return;
        }
        this.nDC.a(hue2);
        this.a(bao2, bap.cNe, 0, 0.0f);
    }

    void c(bao bao2, hue hue2) {
        if (hue2 == null) {
            return;
        }
        if (bao2 == null) {
            hue2.b(bao2, baq.cNj.fA().bD(new Object[0]).exA());
            return;
        }
        if (!this.nDv.dNI()) {
            hue2.b(bao2, baq.cNo.fA().bD(new Object[0]).exA());
            return;
        }
        bbc bbc2 = bao2.gk(this.nDF.iG());
        if (bbc2 == null) {
            hue2.b(bao2, baq.cNm.fA().bD(new Object[0]).exA());
            return;
        }
        switch (bbc2) {
            case cPQ: {
                if (this.nDF.b(bca.cUF)) break;
                hue2.b(bao2, baq.cNp.fA().bD(new Object[0]).exA());
                return;
            }
            case cPP: {
                if (this.nDF.b(bca.cUE)) break;
                hue2.b(bao2, baq.cNp.fA().bD(new Object[0]).exA());
                return;
            }
            default: {
                hue2.b(bao2, baq.cNm.fA().bD(new Object[0]).exA());
                return;
            }
        }
        boolean bl = false;
        for (bao bao3 : this.nDF.abV()) {
            if (bao2 != bao3) continue;
            bl = true;
        }
        if (!bl) {
            for (bao bao3 : this.nDF.abW()) {
                if (bao2 != bao3) continue;
                bl = true;
            }
            if (bl) {
                hue2.b(bao2, baq.cNK.fA().bD(new Object[0]).exA());
                return;
            }
            hue2.b(bao2, baq.cNk.fA().bD(new Object[0]).exA());
            return;
        }
        this.nDC.a(hue2);
        this.a(bao2, bap.cNd, 0, 0.0f);
    }

    void a(bao bao2, int n, float f2, hue hue2) {
        if (hue2 == null) {
            return;
        }
        if (bao2 == null) {
            hue2.b(bao2, baq.cNj.fA().bD(new Object[0]).exA());
            return;
        }
        if (!this.nDv.dNI()) {
            hue2.b(bao2, baq.cNo.fA().bD(new Object[0]).exA());
            return;
        }
        bbc bbc2 = bao2.gk(this.nDF.iG());
        if (bbc2 == null) {
            hue2.b(bao2, baq.cNm.fA().bD(new Object[0]).exA());
            return;
        }
        switch (bbc2) {
            case cPQ: {
                if (this.nDF.b(bca.cUF)) break;
                hue2.b(bao2, baq.cNp.fA().bD(new Object[0]).exA());
                return;
            }
            case cPP: {
                if (this.nDF.b(bca.cUE)) break;
                hue2.b(bao2, baq.cNp.fA().bD(new Object[0]).exA());
                return;
            }
            default: {
                hue2.b(bao2, baq.cNm.fA().bD(new Object[0]).exA());
                return;
            }
        }
        boolean bl = false;
        for (bao bao3 : this.nDF.abW()) {
            if (bao2 != bao3) continue;
            bl = true;
        }
        if (!bl) {
            for (bao bao3 : this.nDF.abV()) {
                if (bao2 != bao3) continue;
                bl = true;
            }
            if (bl) {
                hue2.b(bao2, baq.cNM.fA().bD(new Object[0]).exA());
                return;
            }
            hue2.b(bao2, baq.cNk.fA().bD(new Object[0]).exA());
            return;
        }
        this.nDC.a(hue2);
        this.a(bao2, bap.cNg, n, f2);
    }

    void a(ldv ldv2, String string, int n, float f2, ldv[] ldvArray, hud hud2) {
        if (hud2 == null) {
            return;
        }
        if (ldv2 == null || ldvArray == null || ldvArray.length == 0) {
            hud2.nI(baq.cNj.fA().bD(new Object[0]).exA());
            return;
        }
        if (!this.nDv.dNI()) {
            hud2.nI(baq.cNo.fA().bD(new Object[0]).exA());
            return;
        }
        if (n <= 0 && (f2 < 0.0f || f2 > 1.0f)) {
            hud2.nI(baq.cNt.fA().bD(new Object[0]).exA());
            return;
        }
        boolean bl = false;
        if (this.nDF.abb() != null) {
            for (ayp ayp2 : this.nDF.abb()) {
                if (!ayp2.getGUID().equals(ldv2)) continue;
                bl = true;
                break;
            }
        }
        if (!this.nDF.b(bl ? bca.cUC : bca.cUD)) {
            hud2.nI(baq.cNp.fA().bD(new Object[0]).exA());
            return;
        }
        if (bl && f2 > 0.0f && f2 * (float)ldvArray.length > 1.0f) {
            hud2.nI(baq.cNu.fA().bD(new Object[0]).exA());
            return;
        }
        this.nDC.a(hud2);
        this.a(ldv2, string, n, f2, ldvArray);
    }

    private void a(ayp ayp2, int n) {
        assert (ayp2 != null);
        assert (this.nDv.dNI());
        eum eum2 = (eum)this.MessageDelegator.h(20027, this.GUID, this.nDF.iG());
        eum2.oS(hso.cxK().bAn().Tr);
        eum2.c(ayp2);
        eum2.Fl(n);
        this.MessageDelegator.F(eum2);
    }

    private void a(bao bao2, bap bap2, int n, float f2) {
        assert (this.nDv.dNI());
        assert (bao2 != null);
        assert (bap2 != null);
        assert (bap2 != bap.cNh);
        assert (bap2 != bap.cNg || n > 0 || f2 > 0.0f && f2 <= 1.0f);
        if (this.nDx == null) {
            this.nDx = lcn.emw();
        }
        this.nDx.put(this.nDy, bao2);
        eua eua2 = (eua)this.MessageDelegator.h(20015, this.GUID, this.nDF.iG());
        eua2.sk(this.nDy++);
        eua2.oS(hso.cxK().bAn().Tr);
        eua2.f(lcw.SC);
        eua2.D(bao2);
        eua2.a(bap2);
        eua2.Fj(n);
        eua2.iO(f2);
        this.MessageDelegator.F(eua2);
    }

    private void a(ldv ldv2, String string, int n, float f2, ldv[] ldvArray) {
        assert (this.nDv.dNI());
        assert (ldv2 != null);
        assert (ldvArray != null);
        etw etw2 = (etw)this.MessageDelegator.h(20009, this.GUID, this.nDF.iG());
        etw2.oS(hso.cxK().bAn().Tr);
        etw2.f(lcw.SC);
        etw2.pd(ldv2);
        etw2.kt(string);
        etw2.Fi(n);
        etw2.iN(f2);
        etw2.A(ldvArray);
        this.MessageDelegator.F(etw2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bED() == 32000) {
            this.a((eqr)dxq2);
            return;
        }
        switch (dxq2.bEz()) {
            case 20028: {
                this.a((eun)dxq2);
                break;
            }
            case 20016: {
                this.a((eub)dxq2);
                break;
            }
            case 20010: {
                this.a((etx)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eqr eqr2) {
        switch (eqr2.bHc()) {
            case 1794: {
                this.a((eqd)eqr2);
                break;
            }
            case 1793: {
                this.a((eqc)eqr2);
                break;
            }
            case 1795: {
                this.a((eqa)eqr2);
                break;
            }
            case 1799: {
                this.a((eot)eqr2);
                break;
            }
            case 1804: {
                this.a((eom)eqr2);
                break;
            }
            case 1797: {
                this.a((eoj)eqr2);
                break;
            }
            case 1798: {
                this.a((eok)eqr2);
                break;
            }
            case 1805: {
                this.a((eol)eqr2);
                break;
            }
            case 1806: {
                this.a((eon)eqr2);
                break;
            }
            case 1796: {
                this.a((eoo)eqr2);
                break;
            }
            case 1802: {
                this.a((eop)eqr2);
                break;
            }
            case 1803: {
                this.a((eoq)eqr2);
                break;
            }
            case 1801: {
                this.a((eor)eqr2);
                break;
            }
            case 1800: {
                this.a((eos)eqr2);
                break;
            }
            case 1807: {
                this.a((eqb)eqr2);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleClanClientUpdateMessage() : Unknown Update Type (" + eqr2.bHc() + ") Received!!!");
                assert (false);
                return;
            }
        }
    }

    private void a(eqd eqd2) {
        this.nDF.a(eqd2.bKL());
        Set<huf> set = this.nDC.c(huf.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (huf huf2 : set) {
                huf2.cyB();
            }
            this.nDC.ir(false);
        }
    }

    private void a(eqc eqc2) {
        this.nDF.b(eqc2.bKK());
        Set<huf> set = this.nDC.c(huf.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (huf huf2 : set) {
                huf2.cyB();
            }
            this.nDC.ir(false);
        }
    }

    private void a(eqa eqa2) {
        this.nDF.o(eqa2.iG(), eqa2.afl());
        Set<huf> set = this.nDC.c(huf.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (huf huf2 : set) {
                huf2.cyB();
            }
            this.nDC.ir(false);
        }
    }

    private void a(eoo eoo2) {
        Set<hth> set;
        if (this.nDB.containsKey(eoo2.bKe().afl())) {
            lfn.b(5, "SFPlayerClanConquestInformationManager", "handleClanClientConquestChallengeStartMessage() : Challenged Holding Already in Client Conquest Values Collection!!!... HoldingGUID = [" + eoo2.bKe().afl().fk() + "]");
            assert (false);
            return;
        }
        this.nDB.put(eoo2.bKe().afl(), eoo2.bKe());
        if (this.nDD.sZ(eoo2.bKe().afl()) && !(set = this.nDC.c(hth.class)).isEmpty()) {
            this.nDC.ir(true);
            for (hth hth2 : set) {
                hth2.cyx();
            }
            this.nDC.ir(false);
        }
        this.nDv.dNQ();
    }

    private void a(eoj eoj2) {
        if (!this.nDB.containsKey(eoj2.aiK())) {
            lfn.b(5, "SFPlayerClanConquestInformationManager", "handleClanClientConquestAttackerJoinedMessage() : Challenged Holding Not Found in Client Conquest Values Collection!!!... HoldingGUID = [" + eoj2.aiK().fk() + "]");
            assert (false);
            return;
        }
        if (!this.nDB.get(eoj2.aiK()).a(eoj2.bKa())) {
            return;
        }
        Set<hth> set = this.nDC.c(hth.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hth hth2 : set) {
                hth2.cyx();
            }
            this.nDC.ir(false);
        }
    }

    private void a(eok eok2) {
        if (!this.nDB.containsKey(eok2.aiK())) {
            lfn.b(5, "SFPlayerClanConquestInformationManager", "handleClanClientConquestAttackerLeftMessage() : Challenged Holding Not Found in Client Conquest Values Collection!!!... HoldingGUID = [" + eok2.aiK().fk() + "]");
            assert (false);
            return;
        }
        if (!this.nDB.get(eok2.aiK()).fA(eok2.bKb())) {
            return;
        }
        this.dNG();
        Set<hth> set = this.nDC.c(hth.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hth hth2 : set) {
                hth2.cyx();
            }
            this.nDC.ir(false);
        }
    }

    private void a(eol eol2) {
        if (!this.nDB.containsKey(eol2.aiK())) {
            lfn.b(5, "SFPlayerClanConquestInformationManager", "handleClanClientConquestAttackerScoreChangedMessage() : Challenged Holding Not Found in Client Conquest Values Collection!!!... HoldingGUID = [" + eol2.aiK().fk() + "]");
            assert (false);
            return;
        }
        if (!this.nDB.get(eol2.aiK()).A(eol2.bKb(), eol2.aer())) {
            return;
        }
        Set<htf> set = this.nDC.c(htf.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (htf htf2 : set) {
                htf2.e(this.nDB.get(eol2.aiK()), this.nDB.get(eol2.aiK()).fz(eol2.bKb()));
            }
            this.nDC.ir(false);
        }
    }

    private void a(eon eon2) {
        if (!this.nDB.containsKey(eon2.aiK())) {
            lfn.b(5, "SFPlayerClanConquestInformationManager", "handleClanClientConquestChallengeEndedMessage() : Challenged Holding Not Found in Client Conquest Values Collection!!!... HoldingGUID = [" + eon2.aiK().fk() + "]");
            return;
        }
        if (this.nDB.remove(eon2.aiK()) == null) {
            return;
        }
        Set<hth> set = this.nDC.c(hth.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hth hth2 : set) {
                hth2.cyx();
            }
            this.nDC.ir(false);
        }
        this.nDv.dNQ();
    }

    private void a(eop eop2) {
        if (!this.nDB.containsKey(eop2.aiK())) {
            lfn.b(5, "SFPlayerClanConquestInformationManager", "handleClanClientConquestAttackerScoreChangedMessage() : Challenged Holding Not Found in Client Conquest Values Collection!!!... HoldingGUID = [" + eop2.aiK().fk() + "]");
            assert (false);
            return;
        }
        if (!this.nDB.get(eop2.aiK()).q(eop2.bKb(), eop2.bKf())) {
            return;
        }
        this.dNG();
        Set<hth> set = this.nDC.c(hth.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hth hth2 : set) {
                hth2.cyx();
            }
            this.nDC.ir(false);
        }
    }

    private void a(eoq eoq2) {
        if (!this.nDB.containsKey(eoq2.aiK())) {
            lfn.b(5, "SFPlayerClanConquestInformationManager", "handleClanClientConquestAttackerScoreChangedMessage() : Challenged Holding Not Found in Client Conquest Values Collection!!!... HoldingGUID = [" + eoq2.aiK().fk() + "]");
            assert (false);
            return;
        }
        if (!this.nDB.get(eoq2.aiK()).a(eoq2.bKb(), eoq2.bKf(), eoq2.bKg())) {
            return;
        }
        Set<hte> set = this.nDC.c(hte.class);
        if (!set.isEmpty()) {
            azv azv2 = this.nDB.get(eoq2.aiK()).fz(eoq2.bKb());
            azw azw2 = azv2.fu(eoq2.bKf());
            this.nDC.ir(true);
            for (hte hte2 : set) {
                hte2.d(this.nDB.get(eoq2.aiK()), azv2, azw2);
            }
            this.nDC.ir(false);
        }
    }

    private void a(eor eor2) {
        if (!this.nDB.containsKey(eor2.aiK())) {
            lfn.b(5, "SFPlayerClanConquestInformationManager", "handleClanClientConquestAttackerScoreChangedMessage() : Challenged Holding Not Found in Client Conquest Values Collection!!!... HoldingGUID = [" + eor2.aiK().fk() + "]");
            assert (false);
            return;
        }
        if (!this.nDB.get(eor2.aiK()).a(eor2.bKb(), eor2.bKh())) {
            return;
        }
        this.dNG();
        Set<hth> set = this.nDC.c(hth.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hth hth2 : set) {
                hth2.cyx();
            }
            this.nDC.ir(false);
        }
    }

    private void a(eos eos2) {
        if (!this.nDB.containsKey(eos2.aiK())) {
            lfn.b(5, "SFPlayerClanConquestInformationManager", "handleClanClientConquestAttackerScoreChangedMessage() : Challenged Holding Not Found in Client Conquest Values Collection!!!... HoldingGUID = [" + eos2.aiK().fk() + "]");
            assert (false);
            return;
        }
        if (!this.nDB.get(eos2.aiK()).a(eos2.bKb(), eos2.aff(), eos2.afg())) {
            return;
        }
        Set<hth> set = this.nDC.c(hth.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hth hth2 : set) {
                hth2.cyx();
            }
            this.nDC.ir(false);
        }
    }

    private void a(eot eot2) {
        if (!this.nDB.containsKey(eot2.aiK())) {
            lfn.b(5, "SFPlayerClanConquestInformationManager", "handleClanClientConquestWallDestructionTargetChanged() : Challenged Holding Not Found in Client Conquest Values Collection!!!... HoldingGUID = [" + eot2.aiK().fk() + "]");
            assert (false);
            return;
        }
        if (!this.nDB.get(eot2.aiK()).jB(eot2.bKi())) {
            return;
        }
        Set<htg> set = this.nDC.c(htg.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (htg htg2 : set) {
                htg2.g(this.nDB.get(eot2.aiK()));
            }
            this.nDC.ir(false);
        }
    }

    private void a(eom eom2) {
        if (!this.nDB.containsKey(eom2.aiK())) {
            lfn.b(5, "SFPlayerClanConquestInformationManager", "handleClanClientConquestBindstoneHealthChangedMessage() : Challenged Holding Not Found in Client Conquest Values Collection!!!... HoldingGUID = [" + eom2.aiK().fk() + "]");
            assert (false);
            return;
        }
        if (!this.nDB.get(eom2.aiK()).n(eom2.bKc(), eom2.bKd())) {
            return;
        }
        Set<hte> set = this.nDC.c(hte.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hte hte2 : set) {
                hte2.f(this.nDB.get(eom2.aiK()));
            }
            this.nDC.ir(false);
        }
    }

    private void a(eun eun2) {
        Set<hti> set = this.nDC.c(hti.class);
        if (set.isEmpty()) {
            return;
        }
        this.nDC.ir(true);
        for (hti hti2 : set) {
            if (eun2.bMk().vA()) {
                hti2.nr(eun2.bIk());
                continue;
            }
            hti2.nq(eun2.bIk());
        }
        this.nDC.ir(false);
    }

    private void a(eub eub2) {
        bao bao2;
        Set<hue> set = this.nDC.c(hue.class);
        if (set.isEmpty()) {
            return;
        }
        bao bao3 = bao2 = this.nDx == null ? null : this.nDx.remove(eub2.aVk());
        if (bao2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestMercenaryContractManagementResponseMessage() : No Contract Found for Received Response!!!");
            assert (false);
            return;
        }
        this.nDC.ir(true);
        for (hue hue2 : set) {
            if (eub2.bLX().vA()) {
                hue2.a(bao2, eub2.bLX().fA().bD(new Object[0]).exA());
                continue;
            }
            hue2.b(bao2, eub2.bLX().fA().bD(new Object[0]).exA());
        }
        this.nDC.ir(false);
    }

    private void a(etx etx2) {
        Set<hud> set = this.nDC.c(hud.class);
        if (set.isEmpty()) {
            return;
        }
        this.nDC.ir(true);
        for (hud hud2 : set) {
            if (etx2.bLX().vA()) {
                hud2.nJ(etx2.bLX().fA().bD(new Object[0]).exA());
                continue;
            }
            hud2.nI(etx2.bLX().fA().bD(new Object[0]).exA());
        }
        this.nDC.ir(false);
    }

    private void a(eqb eqb2) {
        this.nDC.B(eqb2.iG(), eqb2.iV());
        this.nDF.l(eqb2.iG(), eqb2.iV());
        Set<huf> set = this.nDC.c(huf.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (huf huf2 : set) {
                huf2.cyB();
            }
            this.nDC.ir(false);
        }
    }
}

