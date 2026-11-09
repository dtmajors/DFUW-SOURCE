/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Iterator;
import java.util.Map;

public class arm
extends btk
implements bto {
    private ljq bQb;
    private final String bQc = "tnm_";
    private asc bIz;
    private final String bb;
    private final ljq Position;
    private int bQd;
    private a bQe;
    private ljq[] es;
    private int bQf;
    private Map<String, Integer> bQg;
    private b[] bQh;
    private float bQi;
    private float bQj;
    private float bQk;
    private float bQl;
    private float bQm;
    private float bQn;
    private float bQo;
    private int bQp;
    private final Map<ldv, ldv> bPk = lcn.emw();

    private void P(int n, int n2) {
        int n3 = this.bQh[n].bQz;
        --this.bQh[n3].bQA;
        this.bQh[n].bQz = n2;
        ++this.bQh[n2].bQA;
    }

    private void hB(int n) {
        int n2 = -1;
        for (int i = 0; i < this.bQp; ++i) {
            if (i == n || this.bQh[i].bQz != n) continue;
            if (n2 < 0) {
                n2 = i;
            }
            this.P(i, n2);
        }
    }

    private int hC(int n) {
        if (this.bQh[n].bQx == null) {
            return n;
        }
        int n2 = this.bQh[n].bQx.az();
        int n3 = this.bQh[n].bQx.KX();
        for (int i = 0; i < this.bQp; ++i) {
            int n4;
            if (i == n || this.bQh[i].bQx == null || this.bQh[i].bQz != i || this.bQh[i].bQA >= n3 || n2 != (n4 = this.bQh[i].bQx.az()) && !this.bQh[n].bQx.ho(n4)) continue;
            return i;
        }
        return n;
    }

    public arm(String string, Map<String, Integer> map, int n, float f, float f2, float f3) {
        this.bb = string;
        this.bQg = map;
        if (f3 > 0.0f) {
            this.bQp = n;
            this.bQk = 15.0f;
            this.bQl = 20.0f;
            this.bQm = 25.0f;
            this.bQn = 20.0f;
            this.bQo = 50.0f;
        } else {
            this.bQp = n;
            this.bQk = 40.0f;
            this.bQl = 60.0f;
            this.bQm = 50.0f;
            this.bQn = 50.0f;
            this.bQo = 250.0f;
        }
        this.bQi = f;
        this.bQj = f2;
        if (this.bQp != 0) {
            this.bQh = new b[this.bQp];
            for (int i = 0; i < this.bQp; ++i) {
                this.bQh[i] = new b(this);
                this.bQh[i].bQx = null;
                this.bQh[i].bQy = -1.0;
                this.bQh[i].bQz = i;
                this.bQh[i].bQA = 1;
            }
        }
        this.bQd = -1;
        ljq ljq2 = lcw.zh((String)string);
        this.Position = new ljq(ljq2.x + lcw.qGD.x / 2.0f, 0.0f, ljq2.rlV + lcw.qGD.rlV / 2.0f);
        this.bQe = this.bQp == 0 ? a.bQt : a.bQr;
    }

    @Override
    public String toString() {
        return this.ObjectDescriptionFilename;
    }

    public arm(String string) {
        this.bb = string.substring(0, string.indexOf(46));
        this.Position = null;
        this.setObjectDescriptionFilename(string);
    }

    @Override
    public void cleanUp() {
        this.bQe = a.bQt;
        this.Rc();
        this.bPk.clear();
        for (int i = 0; i < this.bQp; ++i) {
            if (this.bQh[i].bQx == null) continue;
            this.bQh[i].bQx.Ic();
        }
        super.cleanUp();
    }

    private String RN() {
        Iterator<Map.Entry<String, Integer>> iterator = this.bQg.entrySet().iterator();
        int n = arw.hK(100);
        int n2 = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (n >= (n2 += entry.getValue().intValue())) continue;
            return entry.getKey();
        }
        return null;
    }

    private void RO() {
        arw.ct.warning("SPAWNTILE " + this.bb + " STARTED LOADING!");
        this.bIz = new asc("tnm_" + this.bb);
        arw.ct.warning("SPAWNTILE " + this.bb + " LOADED HEIGHTMAP!");
        if (this.bIz == null || !this.bIz.isLoaded()) {
            this.bQe = a.bQt;
            return;
        }
        ap ap2 = (ap)this.MessageDelegator.BY(7);
        ap2.ec = this.GUID;
        ap2.FileName = "tnm_" + this.bb;
        ap2.ea = false;
        ap2.eb = -1;
        this.MessageDelegator.a(ap2);
        this.bQe = a.bQu;
    }

    private void a(az az2) {
        this.bQe = a.bQt;
        if (az2.ew < 0) {
            return;
        }
        if (az2.dU < 0) {
            return;
        }
        this.bQd = az2.dU;
        an an2 = (an)this.MessageDelegator.BY(6);
        an2.Position = this.Position;
        an2.Radius = 2000.0f;
        an2.dX = 200;
        an2.dY = this.bQd;
        an2.ec = this.GUID;
        this.MessageDelegator.a(an2);
        this.bQe = a.bQv;
    }

    private void Rc() {
        if (this.bQd < 0) {
            return;
        }
        at at2 = (at)this.MessageDelegator.BY(8);
        at2.ec = this.GUID;
        at2.dU = this.bQd;
        this.MessageDelegator.a(at2);
    }

    private void a(ax ax2) {
        this.bQe = a.bQt;
        if (ax2.ew < 0) {
            return;
        }
        if (ax2.es == null) {
            return;
        }
        if (ax2.es.length == 0) {
            return;
        }
        this.es = ax2.es;
        this.bQf = arw.hK(this.es.length);
        arw.ct.info("SPAWNTILE " + this.bb + " READY!");
        this.bQe = a.bQs;
    }

    public void a(ang ang2) {
        if (ang2 == null) {
            return;
        }
        if (this.bQe != a.bQs) {
            return;
        }
        ldv ldv2 = ang2.KY();
        if (ldv2 == null) {
            return;
        }
        ljq ljq2 = ang2.av();
        if (ljq2 == null) {
            return;
        }
        ang2.a(anc.a.bCd, null);
        am am2 = (am)this.MessageDelegator.BY(5);
        am2.ec = this.GUID;
        am2.dU = this.bQd;
        am2.dS = ljq2;
        am2.dW = false;
        this.bPk.put(am2.GUID, ldv2);
        this.MessageDelegator.a(am2);
    }

    public void a(ang ang2, ljq ljq2, float f) {
        if (ljq2 == null) {
            return;
        }
        if (ang2 == null) {
            return;
        }
        if (this.bQe != a.bQs) {
            return;
        }
        ldv ldv2 = ang2.KY();
        if (ldv2 == null) {
            return;
        }
        ljq ljq3 = ang2.av();
        if (ljq3 == null) {
            return;
        }
        ang2.a(anc.a.bCd, null);
        ljq ljq4 = ljq2.esF();
        double d2 = 2.0 * Math.random() * Math.PI;
        ljq4.x += (f *= 0.5f + 0.5f * (float)Math.random()) * (float)Math.cos(d2);
        ljq4.rlV += f * (float)Math.sin(d2);
        al al2 = (al)this.MessageDelegator.BY(4);
        al2.ec = this.GUID;
        al2.dU = this.bQd;
        al2.dS = ljq3;
        al2.dV = ljq4;
        al2.dR = true;
        this.bPk.put(al2.GUID, ldv2);
        this.MessageDelegator.a(al2);
    }

    private void a(ldv ldv2, int n, ljp[] ljpArray, int n2, int n3) {
        anc.a a2;
        ldv ldv3 = this.bPk.remove(ldv2);
        ljp[] ljpArray2 = null;
        if (ldv3 == null) {
            return;
        }
        if (n < 0) {
            a2 = anc.a.bCb;
        } else if (n2 < 0) {
            a2 = anc.a.bCc;
        } else if (n3 < 0) {
            a2 = anc.a.bCa;
        } else if (ljpArray.length == 0) {
            a2 = anc.a.bBZ;
        } else {
            ljpArray2 = ljpArray;
            a2 = anc.a.bCe;
        }
        for (int i = 0; i < this.bQp; ++i) {
            if (!this.b(this.bQh[i].bQx) || !ldv3.equals(this.bQh[i].bQx.KY())) continue;
            this.bQh[i].bQx.a(a2, ljpArray2);
            break;
        }
    }

    private void a(aw aw2) {
        this.a(aw2.ev, aw2.ew, aw2.er, aw2.eq, aw2.ep);
    }

    private void a(av av2) {
        this.a(av2.ev, av2.ew, av2.er, av2.eq, av2.ep);
    }

    @Override
    public void receiveAIResponse(ba ba2) {
        if (ba2 instanceof az) {
            this.a((az)ba2);
        } else if (ba2 instanceof ax) {
            this.a((ax)ba2);
        } else if (ba2 instanceof aw) {
            this.a((aw)ba2);
        } else if (ba2 instanceof av) {
            this.a((av)ba2);
        } else {
            super.receiveAIResponse(ba2);
        }
    }

    private void S(double d2) {
        for (int i = 0; i < this.bQp; ++i) {
            if (this.bQh[i].bQx == null) {
                String string;
                if (this.bQh[i].bQy > d2 || (string = this.RN()) == null) continue;
                this.bQf = (this.bQf + 1) % this.es.length;
                ljq ljq2 = this.bQb != null ? this.bQb : this.es[this.bQf];
                this.bQh[i].bQx = new ang(string, this.MessageDelegator, ljq2, this.bIz);
                this.P(i, this.hC(i));
                continue;
            }
            if (!this.bQh[i].bQx.isTerminated()) continue;
            this.P(i, i);
            this.hB(i);
            this.bQh[i].bQx = null;
            this.bQh[i].bQy = d2 + 60.0 * arw.e(this.bQi, this.bQj);
        }
    }

    private boolean b(ang ang2) {
        if (ang2 == null) {
            return false;
        }
        if (ang2.isTerminated()) {
            return false;
        }
        return ang2.isCreated();
    }

    private boolean hD(int n) {
        if (this.bQh[n].bQx == null) {
            return false;
        }
        if (!this.bQh[n].bQx.KS()) {
            return false;
        }
        if (this.bQh[n].bQz == n) {
            return false;
        }
        if (this.bQh[this.bQh[n].bQz].bQx == null) {
            return false;
        }
        ljq ljq2 = this.bQh[this.bQh[n].bQz].bQx.av();
        float f = ljq2.ez(this.bQh[n].bQx.av());
        if (f > this.bQo || f < this.bQn) {
            return false;
        }
        if (f < (this.bQo + this.bQn) / 2.0f || !this.bQh[n].bQx.KW()) {
            this.bQh[n].bQx.Ld();
        } else {
            this.bQh[n].bQx.Lc();
        }
        this.a(this.bQh[n].bQx, ljq2, 5.0f);
        return true;
    }

    private boolean b(int n, double d2) {
        if (this.bQh[n].bQx == null) {
            return false;
        }
        if (!this.bQh[n].bQx.KS() && !this.bQh[n].bQx.KT()) {
            return false;
        }
        int n2 = arw.hK(this.bQp);
        if (n2 == n) {
            return false;
        }
        if (this.bQh[n2].bQx == null) {
            return false;
        }
        if (!this.bQh[n].bQx.hp(this.bQh[n2].bQx.az())) {
            return false;
        }
        ljq ljq2 = this.bQh[n2].bQx.av();
        if (ljq2.ez(this.bQh[n].bQx.av()) > this.bQk) {
            return false;
        }
        this.bQh[n].bQx.F(d2);
        return true;
    }

    private boolean hE(int n) {
        if (this.bQh[n].bQx == null) {
            return false;
        }
        if (!this.bQh[n].bQx.KS()) {
            return false;
        }
        int n2 = arw.hK(this.bQp);
        if (n2 == n) {
            return false;
        }
        if (this.bQh[n2].bQx == null) {
            return false;
        }
        if (!this.bQh[n2].bQx.hp(this.bQh[n].bQx.az())) {
            return false;
        }
        ljq ljq2 = this.bQh[n2].bQx.av();
        if (ljq2.ez(this.bQh[n].bQx.av()) > this.bQl) {
            return false;
        }
        this.bQh[n].bQx.Lc();
        this.a(this.bQh[n].bQx, ljq2, 5.0f);
        return true;
    }

    private void T(double d2) {
        for (int i = 0; i < this.bQp; ++i) {
            if (!this.b(this.bQh[i].bQx)) continue;
            if (!this.bQh[i].bQx.KZ()) {
                this.a(this.bQh[i].bQx);
                continue;
            }
            if (!this.b(i, d2) && !this.hD(i) && !this.hE(i)) continue;
        }
    }

    private void U(double d2) {
        for (int i = 0; i < this.bQp; ++i) {
            if (!this.b(this.bQh[i].bQx) || !this.bQh[i].bQx.KU()) continue;
            ljq ljq2 = this.bQh[i].bQx.av();
            this.bQh[i].bQx.KV();
            for (int j = 0; j < this.bQp; ++j) {
                if (i == j || !this.b(this.bQh[j].bQx)) continue;
                this.bQh[j].bQx.a(ljq2, d2, this.bQm);
            }
        }
    }

    private void I(double d2) {
        for (int i = 0; i < this.bQp; ++i) {
            if (!this.b(this.bQh[i].bQx)) continue;
            this.bQh[i].bQx.I(d2);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        switch (this.bQe) {
            case bQr: {
                if (Math.random() < 0.05) {
                    this.RO();
                }
                return;
            }
            case bQt: {
                return;
            }
            case bQu: {
                return;
            }
            case bQv: {
                return;
            }
        }
        this.S(ldz2.rgz);
        this.U(ldz2.rgz);
        this.T(ldz2.rgz);
        this.I(ldz2.rgz);
    }

    public void az(ljq ljq2) {
        this.bQb = ljq2;
    }
}

