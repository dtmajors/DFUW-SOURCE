/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  azn
 *  lcr
 */
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class bct
extends btk {
    private static final int cXv = -1;
    private static final boolean cXw = true;
    private ayd cCy = null;
    private azn cwP = null;
    private Map<ldv, bcq> cXx = null;
    private Map<ldv, String> cXy = null;
    private Map<ldv, String> cXz = null;
    private Set<ldv> cXA = null;
    private boolean cXB = false;
    private int Qs = 0;
    private Map<ldv, enl> cXC = null;

    public bcr gO(ldv ldv2) {
        return this.cXx.containsKey(ldv2) ? this.cXx.get(ldv2).ali() : bcr.cXg;
    }

    public bcr gP(ldv ldv2) {
        return this.cXx.containsKey(ldv2) ? this.cXx.get(ldv2).alj() : bcr.cXg;
    }

    public boolean gQ(ldv ldv2) {
        return this.cXy.containsKey(ldv2);
    }

    public Set<ldv> aad() {
        return this.cXy.keySet();
    }

    public boolean gR(ldv ldv2) {
        return this.cXz.containsKey(ldv2);
    }

    public Set<ldv> aae() {
        return this.cXz.keySet();
    }

    public bcq[] aac() {
        int n = 0;
        for (bcq object : this.cXx.values()) {
            if (object.iV() == null) continue;
            ++n;
        }
        bcq[] bcqArray = new bcq[n];
        n = 0;
        for (bcq bcq2 : this.cXx.values()) {
            if (bcq2.iV() == null) continue;
            bcqArray[n++] = bcq2.alp();
        }
        return bcqArray;
    }

    public boolean gS(ldv ldv2) {
        if (ldv.au(this.cCy.getGUID(), ldv2)) {
            return true;
        }
        if (this.cXy.containsKey(ldv2)) {
            return true;
        }
        return this.cXx.containsKey(ldv2) ? this.cXx.get(ldv2).ali() == bcr.cXi : false;
    }

    public bcq gT(ldv ldv2) {
        bcq bcq2 = this.cXx.get(ldv2);
        if (bcq2 == null) {
            bcq2 = new bcq(ldv2, "", bcr.cXg, bcr.cXg, this.MessageDelegator.bzy().getTimeInMillis());
            return bcq2;
        }
        return bcq2.alp();
    }

    public bct(ayd ayd2, azn azn2) {
        this.cCy = ayd2;
        this.cwP = azn2;
        this.cXx = lcn.emw();
        this.cXy = lcn.emw();
        this.cXz = lcn.emw();
    }

    public boolean ZR() {
        return this.cXy.isEmpty() && this.cXz.isEmpty() && this.cXx.isEmpty();
    }

    public void g(bbr bbr2) {
        if (bbr2.qf() && bbr2.jr() > 0) {
            this.a(this.kh(bbr2.jr()), 3, this.cXy.values().toArray(new String[this.cXy.size()]));
            this.a(this.kh(bbr2.jr()), 1, this.cXz.values().toArray(new String[this.cXz.size()]));
            this.kg(bbr2.jr());
        }
    }

    public void acA() {
        for (bcq bcq2 : this.cXx.values()) {
            this.gX(bcq2.iG());
        }
        this.alr();
    }

    private void kg(int n) {
        ArrayList<String> arrayList = lcn.emv();
        ArrayList<String> arrayList2 = lcn.emv();
        for (Map.Entry<ldv, bcq> entry : this.cXx.entrySet()) {
            bcq bcq2 = entry.getValue();
            switch (bcq2.ali()) {
                case cXf: {
                    arrayList.add(bcq2.iV());
                    break;
                }
                case cXh: {
                    arrayList2.add(bcq2.iV());
                }
            }
            if (!arrayList.isEmpty()) {
                this.a(this.kh(n), 5, arrayList.toArray(new String[arrayList.size()]));
            }
            if (arrayList2.isEmpty()) continue;
            this.a(this.kh(n), 7, arrayList2.toArray(new String[arrayList2.size()]));
        }
    }

    public void c(bbr bbr2) {
        if (bbr2.qf() && bbr2.jr() > 0) {
            this.a(this.kh(bbr2.jr()), 9, null);
        }
    }

    public void a(bbr bbr2) {
        if (bbr2.qf() && bbr2.jr() > 0) {
            this.a(this.kh(bbr2.jr()), 3, this.cXy.values().toArray(new String[this.cXy.size()]));
            this.a(this.kh(bbr2.jr()), 1, this.cXz.values().toArray(new String[this.cXz.size()]));
            this.kg(bbr2.jr());
        }
    }

    public void acz() {
        for (ldv ldv2 : this.cXx.keySet()) {
            this.gW(ldv2);
        }
    }

    public void doTick(ldz ldz2) {
        if (this.MessageDelegator.bzx().bzt().dVA() != kdw.a.phY) {
            return;
        }
        if (this.cXB) {
            this.cXB = false;
            for (ldv ldv2 : this.cXy.keySet()) {
                this.F(ldv2, -1);
            }
            for (ldv ldv2 : this.cXz.keySet()) {
                this.F(ldv2, -1);
            }
        }
        this.alq();
    }

    public void gU(ldv ldv2) {
        if (this.cXA == null) {
            this.cXA = lcn.emx();
        }
        this.cXA.add(ldv2);
    }

    public void gV(ldv ldv2) {
        if (this.cXA == null) {
            return;
        }
        this.cXA.remove(ldv2);
    }

    public void b(ldv ldv2, String string, bbr bbr2) {
        bcq bcq2 = this.cXx.get(ldv2);
        if (bcq2 != null && bcq2.ali() == bcr.cXi) {
            this.cXy.remove(ldv2);
            if (string != null) {
                this.a(null, 4, new String[]{string});
            }
            this.cCy.dM(ldv2);
        }
        if (string == null) {
            this.F(ldv2, -1);
        } else {
            this.cXz.put(ldv2, string);
            this.cCy.dN(ldv2);
        }
        boolean bl = false;
        if (bcq2 == null) {
            bcq2 = new bcq();
            bcq2.ch(ldv2);
            this.cXx.put(ldv2, bcq2);
            bl = true;
        } else if (string != null) {
            if (bcq2.ali() == bcr.cXf) {
                this.a(null, 6, new String[]{string});
            } else if (bcq2.ali() == bcr.cXh) {
                this.a(null, 8, new String[]{string});
            }
        }
        if (bcq2.alm()) {
            return;
        }
        bcq2.c(bcr.cXe);
        bcq2.setTimeStamp(this.MessageDelegator.bzy().getTimeInMillis());
        bcq2.aO(this.MessageDelegator.arc().rgz + 259200.0);
        if (bcq2.iV() == null && string != null) {
            bcq2.cD(string);
        }
        if (bcq2.iV() != null) {
            this.cXz.put(bcq2.iG(), bcq2.iV());
            this.a(null, 1, new String[]{bcq2.iV()});
        }
        this.g(bcq2);
        this.a(bcq2.iG(), bbr2 == null ? lcr.qAC : bbr2.abB(), bcq2.ali());
        if (string != null) {
            if (bbr2 == null) {
                this.cCy.i(mbp.ukX.bD(string));
            } else {
                this.cCy.i(mbp.ukW.bD(bbr2.akp(), string));
            }
            this.cwP.a(bl ? 1537 : 1539, bcq2);
        }
        if (this.cCy.aaC() > 0 || this.cCy.aal() > 0) {
            this.b(bcq2.iG(), bcq2.ali());
        }
    }

    private void alq() {
        Set<ldv> set = lcn.emx();
        for (ldv ldv2 : this.cXz.keySet()) {
            if (this.cCy.eg(ldv2)) continue;
            bcq bcq2 = this.cXx.get(ldv2);
            if (bcq2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "checkForWarExpirations() : Cannot Find Stance for Enemy!!!... ClanGUID = " + ldv2);
                assert (false);
                set.add(ldv2);
                continue;
            }
            if (!(this.MessageDelegator.arc().rgz > bcq2.aln())) continue;
            set.add(ldv2);
            bcq2.c(bcr.cXf);
            this.a(bcq2.iG(), lcr.qAC, bcq2.ali());
            this.cCy.dO(ldv2);
            this.cCy.i(mbp.ukY.bD(bcq2.iV()));
            this.cwP.a(1539, bcq2);
            this.a(null, 2, new String[]{bcq2.iV()});
            this.a(null, 5, new String[]{bcq2.iV()});
            if (this.cCy.aaC() <= 0 && this.cCy.aal() <= 0) continue;
            this.b(bcq2.iG(), bcq2.ali());
        }
        if (!set.isEmpty()) {
            for (ldv ldv2 : set) {
                this.cXz.remove(ldv2);
            }
        }
    }

    private ldv kh(int n) {
        return new ldv(n, lcr.qBX.enw(), lcr.qBX.enx());
    }

    public void s(dxq dxq2) {
        for (ldv ldv2 : this.cXy.keySet()) {
            dxq dxq3 = (dxq)dxq2.clone();
            dxq3.on(ldv2);
            this.MessageDelegator.F(dxq3);
        }
    }

    private void F(ldv ldv2, int n) {
        assert (ldv2 != null);
        eln eln2 = (eln)this.MessageDelegator.h(13825, this.GUID, ldv2);
        eln2.sk(n);
        this.MessageDelegator.F(eln2);
    }

    private void a(enl enl2, bcs bcs2, bcq bcq2, String string, long l) {
        assert (enl2 != null);
        assert (bcs2 != null);
        enm enm2 = (enm)this.MessageDelegator.h(13897, this.cCy.getGUID(), enl2.aO());
        this.MessageDelegator.b(enl2, enm2);
        enm2.a(bcs2);
        enm2.h(bcq2);
        enm2.aa(l);
        enm2.ki(string);
        this.MessageDelegator.F(enm2);
    }

    private void g(bcq bcq2) {
        assert (bcq2 != null);
        enp enp2 = (enp)this.MessageDelegator.h(13898, this.cCy.getGUID(), bcq2.iG());
        enp2.ch(this.cCy.getGUID());
        enp2.d(bcq2.ali());
        this.MessageDelegator.F(enp2);
    }

    private void a(ldv ldv2, int n, String[] stringArray) {
        ekv ekv2 = (ekv)this.MessageDelegator.h(13861, this.GUID, ldv2 == null ? lcr.qBX : ldv2);
        ekv2.ija = n;
        ekv2.isd = stringArray;
        if (ldv2 == null) {
            this.cCy.a((dxq)ekv2, true);
        } else {
            this.MessageDelegator.F(ekv2);
        }
    }

    private void alr() {
        ekt ekt2 = (ekt)this.MessageDelegator.h(13929, this.GUID, lcr.qBX);
        ekt2.cD(this.cCy.iV());
        this.cCy.a((dxq)ekt2, true);
    }

    private void t(String string, String string2) {
        eku eku2 = (eku)this.MessageDelegator.h(13930, this.GUID, lcr.qBX);
        eku2.kb(string);
        eku2.kc(string2);
        this.cCy.a((dxq)eku2, true);
    }

    private void gW(ldv ldv2) {
        assert (ldv2 != null);
        eno eno2 = (eno)this.MessageDelegator.h(13863, this.GUID, ldv2);
        eno2.ade = this.cCy.getGUID();
        this.MessageDelegator.F(eno2);
    }

    private void a(ldv ldv2, ldv ldv3, bcr bcr2) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (bcr2 != null);
        gmk gmk2 = (gmk)this.MessageDelegator.h(3587, this.GUID, lcr.qEl);
        gmk2.jlT = this.cCy.getGUID();
        gmk2.aES = ldv2;
        gmk2.jlU = ldv3;
        gmk2.jlV = bcr2.ordinal();
        this.MessageDelegator.F(gmk2);
    }

    private void b(ldv ldv2, bcr bcr2) {
        guj guj2 = (guj)this.MessageDelegator.h(32264, this.cCy.getGUID(), lcr.qEx);
        guj2.ch(this.cCy.getGUID());
        guj2.pk(ldv2);
        guj2.d(bcr2);
        this.MessageDelegator.F(guj2);
    }

    private void gX(ldv ldv2) {
        enn enn2 = (enn)this.MessageDelegator.h(13928, this.cCy.getGUID(), ldv2);
        enn2.ch(this.cCy.getGUID());
        enn2.cD(this.cCy.iV());
        this.MessageDelegator.F(enn2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13826: {
                this.a((elo)dxq2);
                break;
            }
            case 13896: {
                this.a((enl)dxq2);
                break;
            }
            case 13898: {
                this.a((enp)dxq2);
                break;
            }
            case 13863: {
                this.a((eno)dxq2);
                break;
            }
            case 13928: {
                this.a((enn)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(elo elo2) {
        if (elo2.aVk() == -1) {
            bcq bcq2 = this.cXx.get(elo2.iG());
            if (bcq2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "handleClanInfoResponseMessage() : No Stance Found for Clan!!!... ClanGUID = " + elo2.iG());
                assert (false);
                return;
            }
            bcq2.cD(elo2.iV());
            if (bcq2.all()) {
                this.cXy.put(bcq2.iG(), bcq2.iV());
                this.a(null, 3, new String[]{bcq2.iV()});
                this.cCy.i(mbp.ukT.bD(bcq2.iV()));
                this.cCy.dL(bcq2.iG());
            } else if (bcq2.alm()) {
                this.cXz.put(bcq2.iG(), bcq2.iV());
                this.a(null, 1, new String[]{bcq2.iV()});
                this.cCy.i(mbp.ukX.bD(bcq2.iV()));
                this.cCy.dN(bcq2.iG());
            } else if (bcq2.ali() != bcr.cXg) {
                this.cCy.i(mbp.ula.bD(new Object[]{bcq2.iV(), bcq2.ali()}));
                if (bcq2.ali() == bcr.cXf) {
                    this.a(null, 5, new String[]{bcq2.iV()});
                } else if (bcq2.ali() == bcr.cXh) {
                    this.a(null, 7, new String[]{bcq2.iV()});
                }
            } else {
                this.cCy.i(mbp.ulb.bD(new Object[]{bcq2.iV(), bcq2.alj()}));
            }
            if (this.cXC != null && !this.cXC.isEmpty() && this.cXC.containsKey(elo2.iG())) {
                enl enl2 = this.cXC.remove(elo2.iG());
                this.a(enl2, bcs.cXt, bcq2, bcq2.iV(), 0L);
            }
            this.cwP.a(1537, bcq2);
        }
    }

    private void a(enl enl2) {
        boolean bl = enl2.bEN().ordinal() >= ayi.cyE.ordinal();
        bbr bbr2 = this.cCy.dR(enl2.bHL());
        if (!bl && bbr2 == null) {
            this.a(enl2, bcs.cXm, null, null, 0L);
            return;
        }
        if (!bl && !bbr2.b(bca.cUk)) {
            this.a(enl2, bcs.cXn, null, null, 0L);
            return;
        }
        if (this.cXC != null && this.cXC.containsKey(enl2.iG())) {
            this.a(enl2, bcs.cXl, null, null, 0L);
            return;
        }
        boolean bl2 = false;
        bcq bcq2 = this.cXx.get(enl2.iG());
        if (bcq2 == null) {
            bcq2 = new bcq();
            bcq2.ch(enl2.iG());
            bcq2.c(bcr.cXg);
            this.cXx.put(enl2.iG(), bcq2);
            bl2 = true;
            this.F(enl2.iG(), -1);
        }
        if (bcq2.ali() == enl2.bJA()) {
            this.a(enl2, bcs.cXs, bcq2.alp(), null, 0L);
            return;
        }
        if (enl2.bJA() == bcr.cXe) {
            this.a(enl2, bcs.cXo, bcq2.alp(), null, 0L);
            return;
        }
        long l = this.MessageDelegator.bzy().getTimeInMillis() - bcq2.alo();
        if (l < 1800000L) {
            this.a(enl2, bcs.cXq, bcq2.alp(), null, (1800000L - l) / 1000L);
            return;
        }
        if (this.cXA != null && this.cXA.contains(enl2.iG())) {
            this.a(enl2, bcs.cXr, bcq2.alp(), null, 0L);
            return;
        }
        switch (bcq2.ali()) {
            case cXi: {
                if (!bcq2.alk()) break;
                this.cXy.remove(bcq2.iG());
                if (bcq2.iV() != null) {
                    this.a(null, 4, new String[]{bcq2.iV()});
                }
                this.cCy.a(enl2.iG(), ccf.elD);
                this.cCy.dM(bcq2.iG());
                break;
            }
            case cXe: {
                long l2;
                long l3 = 259200000L - (this.MessageDelegator.bzy().getTimeInMillis() - bcq2.getTimeStamp());
                if (l3 < 0L) {
                    l3 = 0L;
                }
                if (this.cCy.eg(bcq2.iG()) && l3 < (l2 = this.cCy.eh(bcq2.iG()))) {
                    l3 = l2;
                }
                this.a(enl2, bcs.cXp, bcq2.alp(), bcq2.iV(), l3);
                return;
            }
            case cXf: {
                if (bcq2.iV() == null) break;
                this.a(null, 6, new String[]{bcq2.iV()});
                break;
            }
            case cXh: {
                if (bcq2.iV() == null) break;
                this.a(null, 8, new String[]{bcq2.iV()});
            }
        }
        bcq2.a(enl2.bJA());
        bcq2.setTimeStamp(this.MessageDelegator.bzy().getTimeInMillis());
        bcq2.B(bcq2.getTimeStamp());
        if (bcq2.all() && bcq2.iV() != null) {
            this.cXy.put(bcq2.iG(), bcq2.iV());
            this.a(null, 3, new String[]{bcq2.iV()});
            this.cCy.dL(bcq2.iG());
        }
        boolean bl3 = false;
        if (bcq2.alk() && bcq2.ali() == bcr.cXg) {
            this.cXx.remove(bcq2.iG());
            bl3 = true;
        }
        if (bcq2.ali() == bcr.cXf) {
            if (bcq2.iV() != null) {
                this.a(null, 5, new String[]{bcq2.iV()});
            }
        } else if (bcq2.ali() == bcr.cXh && bcq2.iV() != null) {
            this.a(null, 7, new String[]{bcq2.iV()});
        }
        this.g(bcq2);
        this.a(bcq2.iG(), bbr2.abB(), bcq2.ali());
        if (bcq2.iV() != null) {
            this.cCy.i(mbp.ukZ.bD(new Object[]{bbr2.akp(), bcq2.iV(), bcq2.ali()}));
        }
        if (bcq2.iV() != null) {
            this.a(enl2, bcs.cXt, bcq2.alp(), bcq2.iV(), 0L);
            this.cwP.a(bl2 ? 1537 : (bl3 ? 1538 : 1539), bcq2);
        } else {
            if (this.cXC == null) {
                this.cXC = lcn.emw();
            }
            this.cXC.put(bcq2.iG(), enl2);
        }
        if (this.cCy.aaC() > 0 || this.cCy.aal() > 0) {
            this.b(bcq2.iG(), bcq2.ali());
        }
    }

    private void a(enp enp2) {
        boolean bl = false;
        bcq bcq2 = this.cXx.get(enp2.iG());
        if (bcq2 == null) {
            bcq2 = new bcq();
            bcq2.ch(enp2.iG());
            bcq2.c(bcr.cXg);
            this.cXx.put(enp2.iG(), bcq2);
            bl = true;
            this.F(enp2.iG(), -1);
        }
        if (bcq2.alj() == enp2.bJA()) {
            return;
        }
        bcq2.setTimeStamp(this.MessageDelegator.bzy().getTimeInMillis());
        if (bcq2.all()) {
            this.cXy.remove(bcq2.iG());
            if (bcq2.iV() != null) {
                this.a(null, 4, new String[]{bcq2.iV()});
            }
            this.cCy.dM(bcq2.iG());
        }
        boolean bl2 = false;
        if (enp2.bJA() == bcr.cXe) {
            bcq2.c(enp2.bJA());
            bl2 = true;
        } else {
            bcq2.b(enp2.bJA());
            bl2 = false;
        }
        if (bcq2.all()) {
            if (bcq2.iV() != null) {
                this.cXy.put(bcq2.iG(), bcq2.iV());
                this.a(null, 3, new String[]{bcq2.iV()});
                this.cCy.dL(bcq2.iG());
            }
        } else if (bcq2.alm()) {
            if (bcq2.iV() != null) {
                this.cXz.put(bcq2.iG(), bcq2.iV());
                this.a(null, 1, new String[]{bcq2.iV()});
                this.cCy.dN(bcq2.iG());
            }
            bcq2.aO(this.MessageDelegator.arc().rgz + 259200.0);
        }
        boolean bl3 = false;
        if (bcq2.alk() && bcq2.ali() == bcr.cXg) {
            this.cXx.remove(bcq2.iG());
            bl3 = true;
        }
        if (bl2) {
            this.a(bcq2.iG(), lcr.qAC, bcq2.ali());
            if (bcq2.ali() == bcr.cXf) {
                if (bcq2.iV() != null) {
                    this.a(null, 6, new String[]{bcq2.iV()});
                }
            } else if (bcq2.ali() == bcr.cXh && bcq2.iV() != null) {
                this.a(null, 8, new String[]{bcq2.iV()});
            }
            if (this.cCy.aaC() > 0 || this.cCy.aal() > 0) {
                this.b(bcq2.iG(), bcq2.ali());
            }
        }
        if (bcq2.iV() != null) {
            this.cCy.i(mbp.ulb.bD(new Object[]{bcq2.iV(), bcq2.alj()}));
            this.cwP.a(bl ? 1537 : (bl3 ? 1538 : 1539), bcq2);
        }
    }

    private void a(eno eno2) {
        bcq bcq2 = this.cXx.remove(eno2.ade);
        if (bcq2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanPoliticsRemoveMessage() : No Stance Found for Clan to Remove!!!... ClanGUID = " + eno2.ade);
            assert (false);
            return;
        }
        if (this.cXy.remove(eno2.ade) != null) {
            if (bcq2.iV() != null) {
                this.a(null, 4, new String[]{bcq2.iV()});
            }
            this.cCy.dM(eno2.ade);
        } else if (this.cXz.remove(eno2.ade) != null) {
            if (bcq2.iV() != null) {
                this.a(null, 2, new String[]{bcq2.iV()});
            }
            this.cCy.dO(eno2.ade);
        }
        if (bcq2.ali() == bcr.cXf) {
            if (bcq2.iV() != null) {
                this.a(null, 6, new String[]{bcq2.iV()});
            }
        } else if (bcq2.ali() == bcr.cXh && bcq2.iV() != null) {
            this.a(null, 8, new String[]{bcq2.iV()});
        }
        if (this.cXA != null) {
            this.cXA.remove(eno2.ade);
        }
        if (bcq2.iV() != null) {
            this.cCy.i(mbp.ula.bD(new Object[]{bcq2.iV(), bcr.cXg}));
        }
        this.a(bcq2.iG(), lcr.qAC, bcr.cXg);
        if (this.cCy.aaC() > 0 || this.cCy.aal() > 0) {
            this.b(bcq2.iG(), bcq2.ali());
        }
    }

    public void c(nm nm2) {
        if (this.cXx != null) {
            nm2.aDC = lcn.abH(this.cXx.size());
            for (bcq bcq2 : this.cXx.values()) {
                nt nt2 = new nt();
                nt2.ade = this.cCy.getGUID();
                nt2.aES = bcq2.iG();
                nt2.aET = bcq2.iV();
                nt2.aEU = bcq2.ali().ordinal();
                nt2.aEV = bcq2.alj().ordinal();
                nt2.aEW = bcq2.getTimeStamp();
                nm2.aDC.add(nt2);
            }
        }
    }

    public void a(nm nm2) {
        if (nm2.aDC != null) {
            for (nt nt2 : nm2.aDC) {
                bcq bcq2 = new bcq(nt2.aES, nt2.aET, bcr.getValueByOrdinal(nt2.aEU), bcr.getValueByOrdinal(nt2.aEV), nt2.aEW);
                this.cXx.put(bcq2.iG(), bcq2);
                if (bcq2.all()) {
                    this.cXy.put(bcq2.iG(), bcq2.iV());
                }
                if (!bcq2.alm()) continue;
                long l = this.MessageDelegator.bzy().getTimeInMillis() - bcq2.getTimeStamp();
                bcq2.aO(this.MessageDelegator.arc().rgz + (double)((259200000L - l) / 1000L));
                this.cXz.put(bcq2.iG(), bcq2.iV());
            }
        }
    }

    private void a(enn enn2) {
        bcq bcq2 = this.cXx.get(enn2.iG());
        if (bcq2 == null) {
            return;
        }
        String string = bcq2.iV();
        bcq2.cD(enn2.iV());
        if (this.cXy.containsKey(enn2.iG())) {
            this.cXy.put(enn2.iG(), enn2.iV());
        }
        if (this.cXz.containsKey(enn2.iG())) {
            this.cXz.put(enn2.iG(), enn2.iV());
        }
        this.t(string, enn2.iV());
        this.cwP.a(1546, bcq2);
    }
}

