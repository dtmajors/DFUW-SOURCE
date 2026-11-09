/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  en
 *  ep
 *  ha
 *  lcw
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class cko {
    private static final String TC = "SFPlayerCustomRoleBoosterManager";
    private final ha hF;
    private final Map<Integer, ldv> cDc = lcn.emw();
    private final Map<Integer, ckk> eGP = lea.epw().aRd();
    private final Map<Integer, ckl> eGQ = lcn.emw();
    private final List<Integer> eGY = lcn.abH(4);

    public cko(ha ha2) {
        this.hF = ha2;
        for (Map.Entry<Integer, ckk> entry : this.eGP.entrySet()) {
            int n = entry.getKey();
            ckl ckl2 = new ckl();
            ckl2.hG(n);
            ckl2.gj(false);
            this.eGQ.put(n, ckl2);
        }
    }

    public List<op> aQX() {
        LinkedList<op> linkedList = lcn.emA();
        for (ckl ckl2 : this.eGQ.values()) {
            op op2 = new op();
            op2.aGg = ckl2.getID();
            op2.aFw = ckl2.aQV();
            linkedList.add(op2);
        }
        return linkedList;
    }

    public void a(op[] opArray, int n) {
        if (n == -1) {
            n = 0;
        }
        this.eGY.clear();
        if (n != 0) {
            int n2 = (n & 0x3E0) >> 5;
            int n3 = (n & 0x7C00) >> 10;
            int n4 = (n & 0xF8000) >> 15;
            int n5 = (n & 0x1F00000) >> 20;
            if (n2 >= 0 && n2 < this.eGP.size()) {
                this.eGY.add(n2);
            }
            if (n3 >= 0 && n3 < this.eGP.size()) {
                this.eGY.add(n3);
            }
            if (n4 >= 0 && n4 < this.eGP.size()) {
                this.eGY.add(n4);
            }
            if (n5 >= 0 && n5 < this.eGP.size()) {
                this.eGY.add(n5);
            }
        }
        if (!lea.epw().d(this.eGY, -1)) {
            this.eGY.clear();
        }
        if (opArray == null || opArray.length == 0) {
            return;
        }
        for (op op2 : opArray) {
            ckl ckl2 = this.eGQ.get(op2.aGg);
            if (ckl2 == null) {
                assert (false) : "Probably Booster : " + op2.aGg + " is not valid anymore!!";
                continue;
            }
            ckl2.gj(op2.aFw);
        }
    }

    public void aRf() {
        if (this.eGY.isEmpty()) {
            return;
        }
        for (int n : this.eGY) {
            this.rq(n);
        }
    }

    public boolean E(int[] nArray) {
        assert (nArray == null || nArray.length <= 4);
        boolean bl = lea.epw().D(nArray);
        if (!bl) {
            return true;
        }
        this.aRg();
        if (nArray != null) {
            for (int n : nArray) {
                if (n == -1) continue;
                this.eGY.add(n);
            }
        }
        this.aRf();
        return true;
    }

    private boolean aRg() {
        if (this.eGY.isEmpty()) {
            lfn.b(5, TC, "deActivateBoosters() Player " + this.hF.getGUID() + " With Name " + this.hF.iU() + " Tried to deactivate all boosters although doesn't have one as active.");
            return false;
        }
        for (int n : this.eGY) {
            this.rp(n);
        }
        this.eGY.clear();
        return true;
    }

    private void rp(int n) {
        ckk ckk2 = this.eGP.get(n);
        if (ckk2 == null) {
            assert (false) : "ActiveBoosterName : " + n + " is invalid.";
            return;
        }
        en en2 = this.hF.jf().jm();
        if (en2 == null) {
            assert (false);
            return;
        }
        Map<Integer, cki> map = ckk2.aQU();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                cki cki2 = (cki)entry.getValue();
                int n2 = cki2.BV();
                if (ep.aJ((int)n2)) continue;
                en2.C(this.jg(n2));
            }
        }
        ckj ckj2 = ckk2.aQS();
        switch (ckj2) {
            case eGG: {
                this.hF.jf().jm().c(11584, 0.0f);
                break;
            }
            case eGH: {
                this.hF.jf().jm().c(11600, 0.0f);
                break;
            }
            case eGJ: {
                this.hF.jf().jm().c(11616, 0.0f);
                break;
            }
            case eGI: {
                this.hF.jf().jm().c(11632, 0.0f);
            }
        }
        en2.a(11568, "");
    }

    private boolean rq(int n) {
        float f;
        ckl ckl2 = this.eGQ.get(n);
        if (ckl2 == null) {
            assert (false);
            return false;
        }
        if (!ckl2.aQV()) {
            lfn.b(5, TC, "activateBooster() Player " + this.hF.getGUID() + " With Name " + this.hF.iU() + " tried to activate Booster " + n + " which is not completed!!");
            return false;
        }
        ckk ckk2 = this.eGP.get(n);
        if (ckk2 == null) {
            lfn.b(5, TC, "activateBooster() Player " + this.hF.getGUID() + " With Name " + this.hF.iU() + " tried to activate Booster " + n + " which is not a valid one.");
            assert (false) : "Player booster is not a valid booster!!!";
            return false;
        }
        en en2 = this.hF.jm();
        if (en2 == null) {
            lfn.b(5, TC, "activateBooster() Player " + this.hF.getGUID() + " With Name " + this.hF.iU() + " tried to activate Booster " + n + " but attribute manager is null.");
            assert (false);
            return false;
        }
        en2.a(11568, ckk2.getName());
        Map<Integer, cki> map = ckk2.aQU();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                cki cki2 = (cki)entry.getValue();
                int n2 = cki2.BV();
                f = cki2.aQR();
                this.a(n2, f, false, 6);
            }
        }
        ckj ckj2 = ckk2.aQS();
        switch (ckj2) {
            case eGG: {
                float f2 = ckk2.rf(5232);
                en2.c(11584, f2);
                break;
            }
            case eGH: {
                float f3 = ckk2.rf(2576);
                en2.c(11600, f3);
                break;
            }
            case eGJ: {
                float f4 = ckk2.rf(5744);
                en2.c(11616, f4);
                break;
            }
            case eGI: {
                f = ckk2.rf(3360);
                en2.c(11632, f);
            }
        }
        return true;
    }

    public ckl rh(int n) {
        if (n == -1) {
            assert (false);
            return null;
        }
        ckl ckl2 = this.eGQ.get(n);
        if (ckl2 == null) {
            assert (false);
            return null;
        }
        return ckl2;
    }

    public boolean ri(int n) {
        ckl ckl2 = this.rh(n);
        return ckl2 != null ? !ckl2.aQV() : false;
    }

    public int rj(int n) {
        int n2 = 0;
        for (ckl ckl2 : this.eGQ.values()) {
            int n3;
            ckk ckk2;
            if (!ckl2.aQV() || (ckk2 = this.eGP.get(n3 = ckl2.getID())).getIndex() != n) continue;
            ++n2;
        }
        return n2;
    }

    public boolean rk(int n) {
        ckl ckl2 = this.rh(n);
        if (ckl2 == null) {
            assert (false);
            return false;
        }
        ckk ckk2 = lea.epw().ro(n);
        int n2 = ckk2.aQS().ordinal();
        int n3 = ckk2.getIndex() + 1;
        int n4 = this.hF.jm().ap(11888);
        n4 = ckk.m(n2, n3, n4);
        this.hF.jm().i(11888, n4);
        ckl2.gj(true);
        return true;
    }

    public boolean rl(int n) {
        ckl ckl2 = this.rh(n);
        if (ckl2 == null) {
            assert (false);
            return false;
        }
        if (ckl2.aQV()) {
            return false;
        }
        ckk ckk2 = lea.epw().ro(n);
        if (ckk2 == null) {
            assert (false);
            return false;
        }
        if (ckk2.getIndex() == 0) {
            return true;
        }
        int n2 = ckk2.aQS().ordinal();
        ckk ckk3 = lea.epw().aW(n2, ckk2.getIndex() - 1);
        if (ckk3 == null) {
            return false;
        }
        ckl ckl3 = this.rh(ckk3.getID());
        if (ckl3 == null) {
            assert (false);
            return false;
        }
        return ckl3.aQV();
    }

    private ldv jg(int n) {
        if (this.cDc.containsKey(n)) {
            return this.cDc.get(n);
        }
        ldv ldv2 = this.hF.getMessageDelegator().bzv();
        this.cDc.put(n, ldv2);
        return ldv2;
    }

    private boolean a(int n, float f, boolean bl, int n2) {
        Object object;
        en en2 = this.hF.jf().jm();
        if (en2 == null) {
            return false;
        }
        ldi ldi2 = (ldi)lea.enT().acv(n);
        if (ldi2 == null || ldi2.enl() == null || ldi2.enl().length < 1 || ldi2.enl()[0] == null) {
            lfn.b(5, TC, "addModifier()  Invalid effect for attribute type :" + n);
            assert (false);
            return false;
        }
        float f2 = f;
        if (bl) {
            object = (ez)en2.ah(ldi2.enl()[0].bnM);
            if (object == null) {
                lfn.b(5, TC, "addRoleBonusModifiers()  There is not related attribute for attribute :" + n);
                assert (false);
                return false;
            }
            float f3 = ((et)object).fO();
            float f4 = f3 * f / 100.0f;
            f2 = -(f3 - f4);
        }
        object = this.a(n, f2, ldi2.getType(), ldi2.enl()[0].bnM, n2);
        en2.a((alq)object);
        return true;
    }

    private als a(int n, float f, int n2, int n3, int n4) {
        als als2 = new als();
        als2.setGUID(this.jg(n));
        als2.x(-2.0);
        als2.ga(n4);
        als2.cP(this.hF.getGUID());
        als2.gd(!lcw.enb() ? this.hF.jp() : cug.fhT);
        als2.gf(n);
        als2.gb(2);
        als2.fC(n3);
        als2.aq(f);
        als2.as(f);
        als2.fJ(n2);
        als2.ge(cxd.fJp);
        return als2;
    }

    public final Map<Integer, ckl> aRa() {
        return this.eGQ;
    }

    public final List<Integer> aRh() {
        return this.eGY;
    }

    public ckk rn(int n) {
        return this.eGP.get(n);
    }

    public int km() {
        int n = this.hF.jm().ap(11888);
        int n2 = 0;
        for (int i = 0; i < 4; ++i) {
            for (int j = ckk.aV(i, n); j > 0; --j) {
                int n3 = 0;
                for (int k = i + 1; k < 4; ++k) {
                    if (ckk.aV(k, n) < j) continue;
                    ++n3;
                }
                n2 += (int)lea.epw().aX(j - 1, n3);
            }
        }
        this.aRg();
        for (ckl ckl2 : this.eGQ.values()) {
            ckl2.gj(false);
        }
        this.hF.jm().i(11888, 0);
        return n2;
    }
}

