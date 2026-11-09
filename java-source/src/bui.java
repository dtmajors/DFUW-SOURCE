/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cug
 *  lcr
 *  lcw
 */
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class bui
extends btk {
    private List<cew> dNS = lcn.emv();
    private Map<ldv, buh> dNT = lcn.emw();
    private btv dNU = null;
    private bup dNG = null;
    private bug dNV = null;
    private buc dNW = null;

    public void a(btv btv2) {
        this.dNU = btv2;
    }

    public void a(bup bup2) {
        this.dNG = bup2;
    }

    @Override
    public final void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11009: {
                this.a((gqb)dxq2);
                break;
            }
            case 11065: {
                this.a((gqa)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void h(cew cew2) {
        assert (cew2 != null);
        buo buo2 = this.dNG.jU(cew2.getGUID());
        if (buo2 == null) {
            this.dNS.add(cew2);
            return;
        }
        this.a(cew2, buo2);
    }

    public void i(cew cew2) {
        assert (cew2 != null);
        buo buo2 = this.dNG.jU(cew2.getGUID());
        if (buo2 == null) {
            this.dNS.remove(cew2);
            return;
        }
        buh buh2 = this.dNT.remove(buo2.GUID);
        if (buh2 != null && buh2.dNR) {
            this.dNU.b(buo2.add, buh2.dNQ);
        }
        if (buh2 != null) {
            this.dNV.f(buh2.dNQ);
        }
    }

    public cew jL(ldv ldv2) {
        if (ldv2 == null) {
            return null;
        }
        for (buh buh2 : this.dNT.values()) {
            if (buh2 == null || buh2.dNQ == null || !ldv2.equals(buh2.dNQ.getGUID())) continue;
            return buh2.dNQ;
        }
        return null;
    }

    public void b(buo buo2) {
        assert (buo2 != null);
        if (this.dNS.isEmpty()) {
            return;
        }
        Iterator<cew> iterator = this.dNS.iterator();
        while (iterator.hasNext()) {
            cew cew2 = iterator.next();
            if (!buo2.Rr.tV(cew2.getGUID())) continue;
            this.a(cew2, buo2);
            iterator.remove();
            return;
        }
    }

    public void c(buo buo2) {
        assert (buo2 != null);
        buh buh2 = this.dNT.remove(buo2.GUID);
        if (buh2 == null) {
            return;
        }
        if (buh2.dNR) {
            this.dNU.b(buo2.add, buh2.dNQ);
        }
        this.dNV.f(buh2.dNQ);
    }

    public void d(buo buo2) {
        assert (buo2 != null);
        buh buh2 = this.dNT.get(buo2.GUID);
        if (buh2 == null) {
            return;
        }
        if (buh2.dNR) {
            if (buo2.add == null) {
                buh2.dNR = false;
                this.dNU.c(buh2.dNQ);
            }
        } else if (buo2.add != null) {
            buh2.dNR = true;
            this.dNU.a(buo2.add, buh2.dNQ);
            for (buh buh3 : this.dNT.values()) {
                int n;
                cew cew2 = buh3.dNQ;
                buo buo3 = this.dNG.jU(cew2.getGUID());
                if (buo3.add == null || (n = this.dNU.gn(buo3.add)) == 0) continue;
                ew ew2 = new ew();
                ew2.setType(9760);
                ew2.bi(n);
                cew2.aIj().removeAttribute(9760);
                cew2.aIj().b(ew2);
            }
        }
    }

    private void a(cew cew2, buo buo2) {
        assert (cew2 != null);
        assert (buo2 != null);
        if (this.dNT.containsKey(buo2.GUID)) {
            return;
        }
        buh buh2 = new buh();
        buh2.dNQ = cew2;
        buh2.Zf = buo2.GUID;
        buh2.dNR = buo2.add != null;
        this.dNT.put(buh2.Zf, buh2);
        if (buh2.dNR) {
            this.dNU.a(buo2.add, cew2);
        }
        this.dNV.e(cew2);
    }

    private void a(gqa gqa2) {
        assert (this.Initialized);
        if (this.dNW == null) {
            return;
        }
        this.ayd();
        this.dNW = null;
    }

    private void a(gqb gqb2) {
        assert (this.Initialized);
        if (gqb2.bhL <= 0) {
            return;
        }
        if (gqb2.joY == null) {
            return;
        }
        if (this.dNW == null) {
            this.dNW = new buc();
            this.dNW.dMT = new lcq(Color.pink);
            this.dNW.dMU = new lhu(16, 16, "gui/targeticons/take.dds");
        }
        block7: for (uk uk2 : gqb2.joY) {
            switch (uk2.Uo) {
                case 5: {
                    ljq ljq2;
                    lgj lgj2 = ((uj)uk2).aWo;
                    this.dNW.Position = ljq2 = lgj2.eqI();
                    continue block7;
                }
                case 1: {
                    this.dNW.FirstName = ((uo)uk2).Value;
                    continue block7;
                }
                case 2: {
                    this.dNW.LastName = ((uo)uk2).Value;
                    continue block7;
                }
                case 3: {
                    this.dNW.add = ((uo)uk2).Value;
                    continue block7;
                }
                case 4: {
                    this.dNW.bnj = ((uo)uk2).Value;
                    continue block7;
                }
                default: {
                    return;
                }
            }
        }
        this.aye();
    }

    private void ayd() {
        assert (this.dNW != null);
        assert (this.dNW.GUID != null);
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        ffb2.iKO = ffb.a.iKT;
        ffb2.dbx = this.dNW.GUID;
        this.MessageDelegator.F(ffb2);
        this.MessageDelegator.oa(this.dNW.GUID);
    }

    private void aye() {
        assert (this.dNW != null);
        assert (this.dNW.FirstName != null);
        assert (this.dNW.LastName != null);
        if (!lcw.qFy) {
            return;
        }
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        if (this.dNW.GUID == null) {
            ffb2.iKO = ffb.a.iKR;
            this.dNW.GUID = this.MessageDelegator.bzv();
        } else {
            ffb2.iKO = ffb.a.iKS;
        }
        ffb2.dbx = this.dNW.GUID;
        ffb2.iKP = new ljg(this.dNW.FirstName + " " + this.dNW.LastName + " " + this.dNW.add + " " + this.dNW.bnj);
        ffb2.dzN = this.dNW.dMU;
        ffb2.iKQ = this.dNW.Position;
        ffb2.ResourceType = cug.flX;
        ffb2.eir = 0.0f;
        ffb2.eis = new ljp(1.0f, 1.0f);
        this.MessageDelegator.F(ffb2);
    }

    public final bug ayf() {
        return this.dNV;
    }

    public final void a(bug bug2) {
        assert (bug2 != null);
        this.dNV = bug2;
        this.dNV.a(this);
    }
}

