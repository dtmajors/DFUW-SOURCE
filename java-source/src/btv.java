/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cug
 *  lcr
 *  lcw
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class btv
extends btk
implements bto {
    public static final int dLV = 0;
    public static final int dLW = 1;
    public static final int dLX = 2;
    public static final int dLY = 3;
    public static final int dLZ = 4;
    public static final int dMa = 5;
    private Map<String, btu> dMb = lcn.emw();
    private btu dMc = null;
    private Map<cew, ldv> dMd = lcn.emw();
    private Map<cew, ldv> dMe = lcn.emw();
    private Set<cew> dMf = lcn.emx();
    private Set<cew> dMg = lcn.emx();
    private Set<cew> dMh = lcn.emx();
    private Set<String> dMi = lcn.emx();
    private Set<String> dMj = lcn.emx();
    private Set<String> dMk = lcn.emx();
    private Set<String> dMl = lcn.emx();
    private double dMm = 0.1;
    private double Ec = Double.MIN_VALUE;
    private static final boolean dMn = true;
    private boolean dMo = true;
    private boolean dMp = true;
    private boolean dMq = true;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13858: {
                this.a((eks)dxq2);
                break;
            }
            case 13861: {
                this.a((ekv)dxq2);
                break;
            }
            case 13929: {
                this.a((ekt)dxq2);
                break;
            }
            case 13930: {
                this.a((eku)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eks eks2) {
        if (eks2.itj) {
            this.eh(!this.dMp);
            this.ej(!this.dMq);
            return;
        }
        this.eh(eks2.itk);
        this.ej(eks2.itl);
    }

    private void eh(boolean bl2) {
        if (bl2 == this.dMp) {
            return;
        }
        boolean bl3 = this.dMp;
        this.dMp = bl2;
        Map<cew, ldv> map = lcn.emw();
        for (Map.Entry<cew, ldv> entry : this.dMd.entrySet()) {
            if (bl3) {
                if (entry.getValue() != null) {
                    this.jG(entry.getValue());
                }
                map.put(entry.getKey(), null);
                continue;
            }
            if (entry.getValue() != null) continue;
            ldv ldv2 = this.a(entry.getKey(), del.gja);
            map.put(entry.getKey(), ldv2);
        }
        this.dMd = map;
    }

    private void ei(boolean bl2) {
    }

    private void ej(boolean bl2) {
        if (bl2 == this.dMq) {
            return;
        }
        boolean bl3 = this.dMq;
        this.dMq = bl2;
        Map<cew, ldv> map = lcn.emw();
        for (Map.Entry<cew, ldv> entry : this.dMe.entrySet()) {
            if (bl3) {
                if (entry.getValue() != null) {
                    this.jG(entry.getValue());
                }
                map.put(entry.getKey(), null);
                continue;
            }
            if (entry.getValue() != null) continue;
            ldv ldv2 = this.a(entry.getKey(), del.gjb);
            map.put(entry.getKey(), ldv2);
        }
        this.dMe = map;
    }

    private void a(ekv ekv2) {
        if (ekv2.ija == 9) {
            this.dMj.clear();
            this.dMi.clear();
            this.dMl.clear();
            this.dMk.clear();
            return;
        }
        if (ekv2.isd == null) {
            return;
        }
        if (ekv2.isd.length == 0) {
            return;
        }
        switch (ekv2.ija) {
            case 3: {
                for (int i = 0; i < ekv2.isd.length; ++i) {
                    this.dMj.add(ekv2.isd[i]);
                    this.j(ekv2.isd[i], false);
                }
                break;
            }
            case 4: {
                for (int i = 0; i < ekv2.isd.length; ++i) {
                    this.dMj.remove(ekv2.isd[i]);
                    this.j(ekv2.isd[i], true);
                }
                break;
            }
            case 1: {
                for (int i = 0; i < ekv2.isd.length; ++i) {
                    this.dMi.add(ekv2.isd[i]);
                    this.i(ekv2.isd[i], false);
                }
                break;
            }
            case 2: {
                for (int i = 0; i < ekv2.isd.length; ++i) {
                    this.dMi.remove(ekv2.isd[i]);
                    this.i(ekv2.isd[i], true);
                }
                break;
            }
            case 5: {
                for (int i = 0; i < ekv2.isd.length; ++i) {
                    this.dMk.add(ekv2.isd[i]);
                }
                break;
            }
            case 6: {
                for (int i = 0; i < ekv2.isd.length; ++i) {
                    this.dMk.remove(ekv2.isd[i]);
                }
                break;
            }
            case 7: {
                for (int i = 0; i < ekv2.isd.length; ++i) {
                    this.dMl.add(ekv2.isd[i]);
                }
                break;
            }
            case 8: {
                for (int i = 0; i < ekv2.isd.length; ++i) {
                    this.dMl.remove(ekv2.isd[i]);
                }
                break;
            }
        }
    }

    public int gn(String string) {
        if (this.dMi.contains(string)) {
            return 1;
        }
        if (this.dMj.contains(string)) {
            return 2;
        }
        if (this.dMk.contains(string)) {
            return 4;
        }
        if (this.dMl.contains(string)) {
            return 5;
        }
        if (this.dMc != null && string.equals(this.dMc.add)) {
            return 3;
        }
        return 0;
    }

    @Override
    public void doTick(ldz ldz2) {
        ldv ldv2;
        Iterator<cew> iterator;
        cew cew22;
        if (!lcw.qFy && !lcw.qOR) {
            return;
        }
        if (this.dMo && this.Ec < this.MessageDelegator.arc().rgz) {
            this.Ec = this.MessageDelegator.arc().rgz + this.dMm;
            if (!this.dMf.isEmpty()) {
                for (cew cew22 : this.dMf) {
                    if (cew22 == null || cew22.aAG() == null) continue;
                    this.h(cew22.getGUID(), cew22.aAG().av());
                }
            }
        }
        if (!this.dMg.isEmpty()) {
            iterator = this.dMg.iterator();
            while (iterator.hasNext()) {
                cew22 = iterator.next();
                if (cew22.aAG() == null || !cew22.aAG().ayZ() || cew22.aAG().axa() == null || cew22.aAG().azb() == null) continue;
                iterator.remove();
                assert (!this.dMd.containsKey(cew22));
                if (this.dMp) {
                    ldv2 = this.a(cew22, del.gja);
                    this.dMd.put(cew22, ldv2);
                } else {
                    this.dMd.put(cew22, null);
                }
                if (!this.dMo) continue;
                this.g(cew22.getGUID(), cew22.aAG().av());
                this.dMf.add(cew22);
            }
        }
        if (!this.dMh.isEmpty()) {
            iterator = this.dMh.iterator();
            while (iterator.hasNext()) {
                cew22 = iterator.next();
                if (cew22.aAG() == null || !cew22.aAG().ayZ() || cew22.aAG().axa() == null || cew22.aAG().azb() == null) continue;
                iterator.remove();
                assert (!this.dMe.containsKey(cew22));
                if (this.dMq) {
                    ldv2 = this.a(cew22, del.gjb);
                    this.dMe.put(cew22, ldv2);
                    continue;
                }
                this.dMe.put(cew22, null);
            }
        }
    }

    public void i(String string, boolean bl2) {
        btu btu2 = this.dMb.get(string);
        if (btu2 == null) {
            return;
        }
    }

    public void j(String string, boolean bl2) {
        btu btu2 = this.dMb.get(string);
        if (btu2 == null) {
            return;
        }
        for (cew cew2 : btu2.dLU) {
            ldv ldv2;
            if (bl2) {
                ldv2 = this.dMe.remove(cew2);
                if (ldv2 == null) continue;
                this.jG(ldv2);
                continue;
            }
            ldv2 = this.a(cew2, del.gjb);
            this.dMe.put(cew2, ldv2);
        }
    }

    public void a(String string, cew cew2) {
        assert (string != null);
        assert (cew2 != null);
        btu btu2 = this.dMb.get(string);
        if (btu2 == null) {
            btu2 = new btu();
            btu2.add = string;
            this.dMb.put(string, btu2);
        }
        if (cew2.aJI()) {
            assert (this.dMc == null);
            this.dMc = btu2;
            for (cew object : this.dMc.dLU) {
                this.dMg.add(object);
            }
            for (btu btu3 : this.dMb.values()) {
                if (this.gn(btu3.add) != 2) continue;
                for (cew cew3 : btu3.dLU) {
                    if (this.dMh.contains(cew3) || this.dMe.containsKey(cew3)) continue;
                    this.dMh.add(cew3);
                }
            }
        } else if (this.dMc == btu2) {
            this.dMg.add(cew2);
        } else if (this.gn(string) == 2) {
            this.dMh.add(cew2);
        }
        if (btu2.dLU.contains(cew2)) {
            return;
        }
        btu2.dLU.add(cew2);
    }

    public void b(String string, cew cew2) {
        btu btu2;
        assert (string != null);
        assert (cew2 != null);
        ldv ldv2 = this.dMd.remove(cew2);
        if (ldv2 == null) {
            ldv2 = this.dMe.remove(cew2);
        }
        if (ldv2 != null) {
            this.jG(ldv2);
        }
        if (this.dMf.remove(cew2)) {
            this.jE(cew2.getGUID());
        }
        this.dMg.remove(cew2);
        this.dMh.remove(cew2);
        if (cew2.aJI()) {
            this.d(cew2);
        }
        if ((btu2 = this.dMb.get(string)) == null) {
            return;
        }
        if (!btu2.dLU.contains(cew2)) {
            return;
        }
        btu2.dLU.remove(cew2);
        if (btu2.dLU.isEmpty()) {
            this.dMb.remove(string);
        }
    }

    public void c(cew cew2) {
        ldv ldv2 = this.dMd.remove(cew2);
        if (ldv2 == null) {
            ldv2 = this.dMe.remove(cew2);
        }
        if (ldv2 != null) {
            this.jG(ldv2);
        }
        this.dMg.remove(cew2);
        this.dMh.remove(cew2);
        if (this.dMf.remove(cew2)) {
            this.jE(cew2.getGUID());
        }
        if (cew2.aJI()) {
            this.d(cew2);
        }
        for (btu btu2 : this.dMb.values()) {
            if (!btu2.dLU.contains(cew2)) continue;
            if (!btu2.dLU.remove(cew2)) {
                return;
            }
            if (btu2.dLU.isEmpty()) {
                this.dMb.remove(btu2.add);
            }
            return;
        }
    }

    private ldv a(cew cew2, int n) {
        ldv ldv2 = this.MessageDelegator.lL(lcr.qEa);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
        glh2.SpecialEffectType = n;
        glh2.aUa = ldv2;
        glh2.mj(false);
        glh2.mk(false);
        glh2.akX = cew2.aAG().getGUID();
        glh2.aZD = cew2.aAG().av();
        this.MessageDelegator.F(glh2);
        return ldv2;
    }

    private void jG(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEa);
        glj2.jkV = 1;
        glj2.aUa = ldv2;
        this.MessageDelegator.F(glj2);
    }

    private void d(cew cew2) {
        if (cew2.aJI()) {
            for (Map.Entry<cew, ldv> object : this.dMd.entrySet()) {
                if (object.getValue() == null) continue;
                this.jG(object.getValue());
            }
            this.dMd.clear();
            for (Map.Entry<cew, ldv> entry : this.dMe.entrySet()) {
                if (entry.getValue() == null) continue;
                this.jG(entry.getValue());
            }
            this.dMe.clear();
            this.dMc = null;
            this.dMg.clear();
            this.dMh.clear();
            for (cew cew3 : this.dMf) {
                this.jE(cew3.getGUID());
            }
            this.dMf.clear();
        }
    }

    private void axG() {
    }

    private void axH() {
        for (Map.Entry<cew, ldv> entry : this.dMe.entrySet()) {
            if (entry.getValue() != null) {
                this.jG(entry.getValue());
            }
            entry.setValue(null);
        }
    }

    private void g(ldv ldv2, ljq ljq2) {
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        ffb2.iKO = ffb.a.iKR;
        ffb2.dbx = ldv2;
        ffb2.iKP = new ljg("");
        ffb2.dzN = new lhu(16, 16, "gui/targeticons/take.dds");
        ffb2.ResourceType = cug.fmk;
        ffb2.iKQ = ljq2;
        ffb2.eir = 0.0f;
        ffb2.eis = new ljp(1.0f, 1.0f);
        this.MessageDelegator.F(ffb2);
    }

    private void h(ldv ldv2, ljq ljq2) {
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        ffb2.iKO = ffb.a.iKS;
        ffb2.dbx = ldv2;
        ffb2.iKP = new ljg("");
        ffb2.dzN = new lhu(16, 16, "gui/targeticons/take.dds");
        ffb2.ResourceType = cug.fmk;
        ffb2.iKQ = ljq2;
        ffb2.eir = 0.0f;
        ffb2.eis = new ljp(1.0f, 1.0f);
        this.MessageDelegator.F(ffb2);
    }

    private void jE(ldv ldv2) {
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        ffb2.iKO = ffb.a.iKT;
        ffb2.dbx = ldv2;
        this.MessageDelegator.F(ffb2);
    }

    private void a(ekt ekt2) {
        if (this.dMc != null) {
            this.dMc.add = ekt2.iV();
        }
    }

    private void a(eku eku2) {
        btu btu2;
        if (this.dMj.remove(eku2.bIl())) {
            this.dMj.add(eku2.bIm());
        }
        if (this.dMl.remove(eku2.bIl())) {
            this.dMl.add(eku2.bIm());
        }
        if (this.dMk.remove(eku2.bIl())) {
            this.dMk.add(eku2.bIm());
        }
        if (this.dMi.remove(eku2.bIl())) {
            this.dMi.add(eku2.bIm());
        }
        if ((btu2 = this.dMb.remove(eku2.bIl())) != null) {
            btu2.add = eku2.bIm();
            this.dMb.put(eku2.bIm(), btu2);
            for (cew cew2 : new HashSet<cew>(btu2.dLU)) {
                this.b(eku2.bIm(), cew2);
                this.a(eku2.bIm(), cew2);
            }
        }
    }
}

