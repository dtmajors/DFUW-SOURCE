/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class anm
extends btk {
    private static final int bGi = 255;
    private bsl bGj;
    private final ldv bCi;
    private final ldv bCj;
    private final ldv bGk;
    private Map<ldv, bsf> bGl = lcn.emw();
    private boolean bGm;
    private final asd bDj;
    private boolean bGn;
    private final Map<a, Integer> bGo = lcn.emw();
    private final Map<Integer, List<bsl>> bGp = lcn.emw();
    private bsl bGq;
    private int bGr = 10;

    public anm(ldv ldv2, ldv ldv3, ldv ldv4, asd asd2) {
        this.bCj = ldv2;
        this.bCi = ldv3;
        this.bGk = ldv4;
        this.bDj = asd2;
    }

    public boolean cR(ldv ldv2) {
        if (!this.bGl.containsKey(ldv2)) {
            return false;
        }
        bsl bsl2 = (bsl)this.bGl.get(ldv2);
        if (bsl2 == null) {
            return false;
        }
        return bsl2.Uu();
    }

    public boolean cS(ldv ldv2) {
        if (!this.bGl.containsKey(ldv2)) {
            return false;
        }
        bsl bsl2 = (bsl)this.bGl.get(ldv2);
        if (bsl2 == null) {
            return false;
        }
        if (bsl2.Uu()) {
            return false;
        }
        return bsl2.awU();
    }

    public boolean cT(ldv ldv2) {
        if (!this.bGl.containsKey(ldv2)) {
            return false;
        }
        bsl bsl2 = (bsl)this.bGl.get(ldv2);
        if (bsl2 == null) {
            return false;
        }
        return bsl2.Uu();
    }

    public boolean cU(ldv ldv2) {
        if (!this.bGl.containsKey(ldv2)) {
            return false;
        }
        bsl bsl2 = (bsl)this.bGl.get(ldv2);
        if (bsl2 == null) {
            return false;
        }
        if (!bsl2.Uu()) {
            return false;
        }
        return !bsl2.AT();
    }

    public boolean cV(ldv ldv2) {
        if (!this.bGl.containsKey(ldv2)) {
            return false;
        }
        bsl bsl2 = (bsl)this.bGl.get(ldv2);
        if (bsl2 == null) {
            return false;
        }
        if (!bsl2.Uu()) {
            return false;
        }
        return bsl2.AT();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.bGo.clear();
        this.bGp.clear();
        this.bGl.clear();
    }

    public void i(int[] nArray) {
        gqh gqh2 = (gqh)this.MessageDelegator.h(11038, this.GUID, this.bCi);
        gqh2.aD(nArray);
        this.MessageDelegator.F(gqh2);
        this.bGm = true;
    }

    public bsl cW(ldv ldv2) {
        if (ldv2 == null) {
            return null;
        }
        return (bsl)this.bGl.get(ldv2);
    }

    public List<bsl> hs(int n) {
        return this.bGp.get(n);
    }

    public float dK(String string) {
        cur cur2 = lea.eos().get(string);
        if (cur2 != null) {
            return cur2.bFz;
        }
        return 0.0f;
    }

    public boolean cX(ldv ldv2) {
        return this.bGq != null && this.bGq.getGUID().equals(ldv2);
    }

    @Override
    public void initialize() {
        super.initialize();
        fvp fvp2 = (fvp)this.MessageDelegator.h(12289, this.GUID, this.bGk);
        fvp2.iTm = 1;
        fvp2.dTe = 255;
        this.MessageDelegator.F(fvp2);
        flr flr2 = (flr)this.MessageDelegator.h(7944, this.GUID, this.bGk);
        this.MessageDelegator.F(flr2);
    }

    public boolean a(ldv ldv2, b b2) {
        if (!this.bGl.containsKey(ldv2)) {
            return false;
        }
        bsl bsl2 = (bsl)this.bGl.get(ldv2);
        a a2 = new a(ldv2, b2);
        if (this.bGo.containsKey(a2)) {
            if (this.bGo.get(a2) >= this.bGr) {
                this.bGo.remove(a2);
            } else {
                this.bGo.put(a2, this.bGo.get(a2) + 1);
                return false;
            }
        }
        switch (b2) {
            case bGu: {
                if (!bsl2.awU()) {
                    return false;
                }
                if (bsl2.Uu()) {
                    return false;
                }
                if (this.cZ(ldv2)) break;
                return false;
            }
            case bGw: {
                if (!bsl2.Uu()) {
                    return false;
                }
                if (this.cZ(ldv2)) break;
                return false;
            }
            case bGA: 
            case bGv: {
                return this.cZ(ldv2);
            }
            case bGy: 
            case bGz: {
                if (this.bGq == null) {
                    return false;
                }
                if (!ldv.au(ldv2, this.bGq.getGUID())) {
                    return false;
                }
                if (this.a(b2)) break;
                return false;
            }
        }
        this.bGo.put(a2, 1);
        return true;
    }

    public boolean HT() {
        return this.bGn;
    }

    public boolean Lk() {
        if (this.bGq == null) {
            return false;
        }
        if (!this.bGq.Uu()) {
            return false;
        }
        return this.bGq.AT();
    }

    public boolean cY(ldv ldv2) {
        if (!this.bGl.containsKey(ldv2)) {
            return false;
        }
        bsl bsl2 = (bsl)this.bGl.get(ldv2);
        if (bsl2 == null) {
            return false;
        }
        return bsl2.AT();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7945: {
                this.a((fls)dxq2);
                break;
            }
            case 12291: {
                this.Ll();
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void terminate() {
        this.bGo.clear();
        this.bGl.clear();
        this.bGp.clear();
        fvv fvv2 = (fvv)this.MessageDelegator.h(12290, this.GUID, this.bGk);
        fvv2.iTm = 1;
        this.MessageDelegator.F(fvv2);
        this.selfDestruct();
        this.MessageDelegator.oa(this.GUID);
    }

    private boolean cZ(ldv ldv2) {
        if (!this.bDj.hR(cxd.fHl)) {
            return false;
        }
        flt flt2 = (flt)this.MessageDelegator.h(7959, this.GUID, this.bCj);
        flt2.aCK = ldv2;
        this.MessageDelegator.F(flt2);
        return true;
    }

    private void a(bsl bsl2) {
        if (this.bGj != null && bsl2.getGUID().equals(this.bGj.getGUID())) {
            if (!this.bGm) {
                this.bGj = bsl2;
            }
            if (this.bGj.vf() < 5) {
                if (!this.bGm) {
                    return;
                }
                this.a(this.bGj, bsl2);
            }
        }
    }

    private void a(fls fls2) {
        if (fls2.iPx.size() == 0) {
            return;
        }
        this.bGl = fls2.iPx;
        this.Lm();
        ArrayList<Object> arrayList = lcn.emv();
        Iterator<Map.Entry<a, Integer>> iterator = this.bGo.entrySet().iterator();
        while (iterator.hasNext()) {
            a a2 = iterator.next().getKey();
            iterator.remove();
            if (a2 == null) continue;
            Object object = (bsl)this.bGl.get(a2.aCK);
            if (object == null) {
                return;
            }
            switch (a2.bGt) {
                case bGu: {
                    if (((bsl)object).Uu()) {
                        if (lea.enW().isDescendant(((bsl)object).az(), cug.fiL)) {
                            this.bGq = object;
                            break;
                        }
                        if (!lea.enW().isDescendant(((bsl)object).az(), cug.fjj)) break;
                        this.bGj = object;
                        break;
                    }
                    arrayList.add(a2);
                    break;
                }
                case bGw: {
                    if (!((bsl)object).Uu()) {
                        if (lea.enW().isDescendant(((bsl)object).az(), cug.fiL)) {
                            if (this.bGq == null || !((bsl)object).c(this.bGq)) break;
                            this.bGq = null;
                            break;
                        }
                        if (!lea.enW().isDescendant(((bsl)object).az(), cug.fjj) || this.bGj == null || !((bsl)object).c(this.bGj)) break;
                        this.bGj = null;
                        break;
                    }
                    arrayList.add(a2);
                    break;
                }
                case bGy: 
                case bGz: {
                    if (!((bsl)object).c(this.bGq)) break;
                    this.bGq = object;
                    break;
                }
            }
        }
        for (Object object : arrayList) {
            this.a(((a)object).aCK, ((a)object).bGt);
        }
        if (this.bGj != null) {
            this.bGj = (bsl)this.bGl.get(this.bGj.getGUID());
        }
        this.bGn = true;
    }

    private void Ll() {
        flr flr2 = (flr)this.MessageDelegator.h(7944, this.GUID, this.bGk);
        this.MessageDelegator.F(flr2);
    }

    private void a(bsl bsl2, bsl bsl3) {
        fme fme2 = (fme)this.MessageDelegator.h(7969, this.GUID, bsl3.avU());
        fme2.ilu = 1;
        fme2.gLy = bsl3.AW();
        fme2.iPE = bsl3.getGUID();
        fme2.gLC = bsl2.vf();
        fme2.iPF = bsl2.avU();
        fme2.gLz = bsl2.AW();
        fme2.iPQ = bsl2.getGUID();
        this.MessageDelegator.F(fme2);
        this.bGm = false;
    }

    private boolean a(b b2) {
        gjt gjt2 = (gjt)this.MessageDelegator.h(4617, this.GUID, this.bCj);
        switch (b2) {
            case bGy: {
                if (this.bGq.AT()) {
                    return false;
                }
                gjt2.SkillType = cxd.fHg;
                break;
            }
            case bGz: {
                if (!this.bGq.AT()) {
                    return false;
                }
                gjt2.SkillType = cxd.fHk;
                break;
            }
            default: {
                assert (false) : "Wrong request [" + (Object)((Object)b2) + "] for sheathe/unsheathe";
                return false;
            }
        }
        if (this.bDj.hR(gjt2.SkillType)) {
            this.MessageDelegator.F(gjt2);
            return true;
        }
        return false;
    }

    private void Lm() {
        this.bGp.clear();
        for (bsl bsl2 : this.bGl.values()) {
            int n;
            int n2 = bsl2.az();
            if (lea.enW().isDescendant(n2, cug.fiD)) {
                n = cug.fiD;
            } else if (lea.enW().isDescendant(n2, cug.fiE)) {
                n = cug.fiE;
            } else if (lea.enW().isDescendant(n2, cug.fiF)) {
                n = cug.fiF;
            } else if (lea.enW().isDescendant(n2, cug.fiB)) {
                n = cug.fiB;
            } else if (lea.enW().isDescendant(n2, cug.fjw)) {
                n = cug.fjw;
                this.a(bsl2);
            } else if (lea.enW().isDescendant(n2, cug.fkh)) {
                n = cug.fkh;
                this.a(bsl2);
            } else if (lea.enW().isDescendant(n2, cug.fiC)) {
                n = cug.fiC;
            } else if (lea.enW().isDescendant(n2, cug.fiu)) {
                n = cug.fiu;
            } else if (lea.enW().isDescendant(n2, cug.fiK)) {
                n = cug.fiK;
            } else if (lea.enW().isDescendant(n2, cug.fkF)) {
                n = cug.fkF;
            } else if (lea.enW().isDescendant(n2, cug.fjl)) {
                n = cug.fjl;
            } else if (lea.enW().isDescendant(n2, cug.fjN)) {
                n = cug.fjN;
            } else if (lea.enW().isDescendant(n2, cug.fmT)) {
                n = cug.fmT;
            } else if (lea.enW().isDescendant(n2, cug.fkk)) {
                n = cug.fkk;
            } else {
                if (!lea.enW().isDescendant(n2, cug.fjZ)) continue;
                n = cug.fjZ;
            }
            Integer n3 = n;
            if (this.bGp.containsKey(n3)) {
                this.bGp.get(n3).add(bsl2);
            } else {
                ArrayList<bsl> arrayList = lcn.emv();
                arrayList.add(bsl2);
                this.bGp.put(n3, arrayList);
            }
            if (this.bGq == null || !bsl2.getGUID().equals(this.bGq.getGUID())) continue;
            this.bGq = bsl2;
        }
    }
}

