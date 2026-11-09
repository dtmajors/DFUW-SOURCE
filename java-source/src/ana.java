/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Map;

class ana
extends amx {
    private final Map<Integer, ldv> bBL = lcn.emw();
    private final ljq bBM = new ljq();

    protected ana(ljq ljq2, asb asb2, clb clb2) {
        super(ljq2, asb2, clb2);
        this.bBy = false;
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.getResult() != 0) {
            return;
        }
        switch (ktv2.egT()) {
            case 4870: {
                this.a((kuk)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    public void a(cla cla2) {
        this.HM();
        this.bBz = cla2;
    }

    @Override
    public void a(asm asm2) {
        if (asm2 instanceof arx) {
            arx arx2 = (arx)asm2;
            if (arx2.SC()) {
                this.bBv.remove(arx2.Sq());
            } else {
                this.bBv.add(arx2.Sq());
            }
            return;
        }
        if (asm2 instanceof arv) {
            arv arv2 = (arv)asm2;
            ldv ldv2 = arv2.Sq();
            ast ast2 = (ast)this.bBx.get(ldv2);
            if (arv2.lh()) {
                if (this.bBv.contains(ldv2)) {
                    this.bBv.remove(arv2.Sq());
                    this.cQ(arv2.Sq());
                    if (ast2 != null) {
                        ast2.UV();
                        ast2.TT();
                    }
                }
                return;
            }
            if (this.bBw.dz(arv2.iG())) {
                if (this.bBv.contains(ldv2)) {
                    this.bBv.remove(ldv2);
                }
                this.cQ(arv2.Sq());
                if (ast2 != null) {
                    ast2.UV();
                    ast2.TT();
                }
                return;
            }
            if (this.bBw.dw(arv2.qd())) {
                if (this.bBv.contains(ldv2)) {
                    this.bBv.remove(ldv2);
                    this.cQ(arv2.Sq());
                    if (ast2 != null) {
                        ast2.UV();
                        ast2.TT();
                    }
                }
                return;
            }
            if (this.bBw.dy(arv2.qd())) {
                if (!this.bBv.contains(ldv2)) {
                    this.bBv.add(ldv2);
                    if (ast2 != null) {
                        ast2.UU();
                        ast2.TS();
                    }
                }
                return;
            }
            if (this.bBw.dx(arv2.iG())) {
                if (!this.bBv.contains(ldv2)) {
                    this.bBv.add(ldv2);
                    if (ast2 != null) {
                        ast2.UU();
                        ast2.TS();
                    }
                }
                return;
            }
            if (this.bBw.dv(arv2.iG())) {
                if (this.bBv.contains(ldv2)) {
                    this.bBv.remove(ldv2);
                    this.cQ(arv2.Sq());
                    if (ast2 != null) {
                        ast2.UV();
                        ast2.TT();
                    }
                }
                return;
            }
            switch (this.bBz) {
                case eHl: {
                    if (!this.bBv.contains(ldv2)) {
                        this.bBv.add(ldv2);
                    }
                    if (ast2 != null) {
                        ast2.UU();
                        ast2.TS();
                    }
                    return;
                }
            }
        }
    }

    private void a(kuk kuk2) {
        lcs[] lcsArray = kuk2.egY();
        this.bBA.clear();
        this.bBA.addAll(this.bBv);
        for (lcs lcs2 : lcsArray) {
            ldv ldv2;
            if (this.bBL.isEmpty()) break;
            if (lcs2.jbX.ib() == lcr.qAC.ib()) {
                ldv2 = this.bBL.remove(lcs2.qEI);
                if (ldv2 == null) continue;
                this.bBA.remove(ldv2);
                this.cQ(ldv2);
                continue;
            }
            if (lcw.enb() && lcs2.jbX.ib() != 3 || lcs2.jbX.equals(this.Ui) || lcs2.jbX.equals(this.bBL.get(lcs2.qEI)) || lea.enW().isDescendant(lcs2.ResourceType, cug.fgE) || (ldv2 = this.bBL.remove(lcs2.qEI)) == null) continue;
            this.bBA.remove(ldv2);
            this.cQ(ldv2);
        }
        this.bBL.clear();
    }

    @Override
    protected void HK() {
        Object object2;
        int n = this.bBv.size();
        if (n <= 0) {
            return;
        }
        ArrayList<let> arrayList = lcn.abH(n);
        int n2 = 0;
        for (Object object2 : this.bBv) {
            asw asw2 = (asw)this.bBx.get(object2);
            if (asw2 == null) continue;
            let let2 = new let();
            float f = asw2.i(this.Position, this.bBM);
            if (f < 0.0f) {
                return;
            }
            let2.dum = f;
            float f2 = this.bBM.eqN();
            if (ldq.ai(f2, 0.0f)) continue;
            this.bBM.x /= f2;
            this.bBM.y /= f2;
            this.bBM.rlV /= f2;
            let2.mx = this.bBM.esF();
            let2.mw = this.Position;
            arrayList.add(let2);
            this.bBL.put(n2++, (ldv)object2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        let[] letArray = new let[arrayList.size()];
        arrayList.toArray(letArray);
        object2 = (kjj)this.MessageDelegator.h(2823);
        int n3 = 30;
        ((kjj)object2).a(letArray);
        ((kjj)object2).Yj(30);
        ((khd)object2).ts(this.GUID);
        ((kjb)object2).Ye(0);
        ((kjj)object2).F(new ldv[0]);
        this.MessageDelegator.a((khd)object2);
    }

    @Override
    public void HU() {
        this.HM();
    }

    @Override
    public void HV() {
        this.HM();
    }
}

