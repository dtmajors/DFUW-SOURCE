/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public abstract class fz
extends btk {
    private final int TX = -1;
    private final int TY = -77841;
    private final int TZ = -1974465;
    private final int Ua = -2044113;
    private Map<ldv, Integer> Ub = lcn.emw();
    private Set<ldv> Uc = lcn.emx();
    protected ldv Ud = null;
    private final float Ue;
    private float Uf = 0.0f;
    private kpo Ug = null;
    private final Set<a> Uh = lcn.emx();

    protected fz(float f2) {
        this.Ue = f2;
        this.Uf = f2;
    }

    public float getOuterRadius() {
        return this.Ue;
    }

    public float getInnerRadius() {
        return this.Uf;
    }

    public void a(a a2) {
        this.Uh.add(a2);
    }

    public void hr() {
        LinkedList<ldv> linkedList = lcn.emA();
        linkedList.addAll(this.Ub.keySet());
        for (ldv ldv2 : linkedList) {
            this.ao(ldv2);
        }
    }

    public void hs() {
        LinkedList<ldv> linkedList = lcn.emA();
        linkedList.addAll(this.Uc);
        for (ldv ldv2 : linkedList) {
            this.ao(ldv2);
        }
    }

    public void b(a a2) {
        this.Uh.remove(a2);
    }

    public boolean ak(ldv ldv2) {
        return this.Ub.containsKey(ldv2);
    }

    public boolean al(ldv ldv2) {
        return this.Uc.contains(ldv2);
    }

    public int am(ldv ldv2) {
        Integer n = this.Ub.get(ldv2);
        return n == null ? -1 : n;
    }

    public Map<ldv, Integer> ht() {
        return this.Ub;
    }

    @Override
    public void cleanUp() {
        if (this.Ud != null) {
            this.hu();
            this.Ud = null;
        }
        super.cleanUp();
    }

    private void hu() {
        kov kov2 = (kov)this.MessageDelegator.h(535);
        kov2.ts(this.GUID);
        kov2.wD(false);
        kov2.sy(this.Ud);
        this.MessageDelegator.a(kov2);
    }

    public final void q(float f2) {
        if (this.Ud == null) {
            lfn.b(5, "SFEngineAOI", "changeInnerRadius(): " + this.getGUID() + ": No sensor guid");
            return;
        }
        assert (this.Ug != null);
        if ((double)Math.abs(f2 - this.Uf) < 0.1) {
            return;
        }
        this.Uf = f2;
        kpc kpc2 = (kpc)this.MessageDelegator.h(540);
        kpc2.ts(this.GUID);
        kpc2.jM(false);
        kpc2.wD(false);
        kpc2.lQ(false);
        kpc2.xt(false);
        kpc2.sy(this.Ud);
        kpc2.pTb = -1;
        kpc2.pTc = -1974465;
        kpc2.Uf = this.Uf;
        kpc2.Ue = this.Ue;
        this.MessageDelegator.a(kpc2);
    }

    public final void r(float f2) {
        if (this.Ud == null) {
            lfn.b(5, "SFEngineAOI", "changeInnerRadius(): " + this.getGUID() + ": No sensor guid");
            return;
        }
        assert (this.Ug != null);
        if ((double)Math.abs(f2 - this.Uf) < 0.1) {
            return;
        }
        this.Uf = f2;
        kpc kpc2 = (kpc)this.MessageDelegator.h(540);
        kpc2.ts(this.GUID);
        kpc2.jM(false);
        kpc2.wD(false);
        kpc2.lQ(false);
        kpc2.xt(false);
        kpc2.sy(this.Ud);
        kpc2.pTb = -1;
        kpc2.pTc = -1974465;
        kpc2.Uf = this.Uf;
        kpc2.Ue = this.Uf;
        this.MessageDelegator.a(kpc2);
    }

    protected final void M(ljq ljq2) {
        assert (this.Ud == null);
        assert (this.Ug == null);
        kos kos2 = (kos)this.MessageDelegator.h(532);
        kos2.pTa = true;
        kos2.ts(this.GUID);
        kos2.wD(true);
        kos2.lQ(true);
        kos2.xt(false);
        kos2.sy(lcr.qzb);
        kos2.pTb = -77841;
        kos2.pTc = -2044113;
        kos2.Uf = this.Uf;
        kos2.Ue = this.Ue;
        kos2.pTs = ljq2;
        this.MessageDelegator.a(kos2);
        this.Ug = kos2;
    }

    protected final void an(ldv ldv2) {
        assert (this.Ud == null);
        assert (this.Ug == null);
        koo koo2 = (koo)this.MessageDelegator.h(531);
        koo2.pTa = true;
        koo2.ec = this.GUID;
        koo2.iBr = true;
        koo2.dsK = true;
        koo2.pUK = false;
        koo2.Ud = lcr.qzb;
        koo2.Ue = this.Ue;
        koo2.Uf = this.Uf;
        koo2.pTc = -1974465;
        koo2.pTb = -1;
        koo2.dsZ = ldv2;
        this.MessageDelegator.a(koo2);
        this.Ug = koo2;
    }

    private boolean bz(int n) {
        return n == cug.fos;
    }

    private void f(ldv ldv2, int n) {
        if (this.bz(n)) {
            return;
        }
        if (this.Ub.containsKey(ldv2)) {
            return;
        }
        this.Ub.put(ldv2, n);
        for (a a2 : this.Uh) {
            a2.a(this, ldv2, n);
        }
    }

    private void ao(ldv ldv2) {
        Integer n = this.Ub.get(ldv2);
        if (n == null) {
            return;
        }
        this.Ub.remove(ldv2);
        for (a a2 : this.Uh) {
            a2.b(this, ldv2, n);
        }
    }

    private void ap(ldv ldv2) {
        if (this.Uc.contains(ldv2)) {
            return;
        }
        this.Uc.add(ldv2);
        for (a a2 : this.Uh) {
            a2.a(this, ldv2);
        }
    }

    private void aq(ldv ldv2) {
        if (!this.Uc.contains(ldv2)) {
            return;
        }
        this.Uc.remove(ldv2);
        for (a a2 : this.Uh) {
            a2.b(this, ldv2);
        }
    }

    private void a(kwr kwr2) {
        if (this.Ug == null) {
            return;
        }
        if (!this.Ug.getGUID().equals(kwr2.dXg())) {
            return;
        }
        if (kwr2.getResult() != 0) {
            return;
        }
        if (this.Ud != null) {
            return;
        }
        this.Ud = kwr2.axa();
        assert (this.Ud != null);
    }

    private void a(kvx kvx2) {
        int n;
        ldv[] ldvArray;
        if (kvx2.qfb != null) {
            ldvArray = kvx2.qfb;
            int[] nArray = kvx2.qfc;
            if (nArray == null) {
                return;
            }
            if (ldvArray.length != nArray.length) {
                return;
            }
            int n2 = ldvArray.length;
            for (n = 0; n < n2; ++n) {
                this.f(ldvArray[n], nArray[n]);
            }
        }
        if (kvx2.qfe != null) {
            ldvArray = kvx2.qfe;
            n = ldvArray.length;
            for (int i = 0; i < n; ++i) {
                this.ao(ldvArray[i]);
            }
        }
    }

    private void a(kvy kvy2) {
        int n;
        int n2;
        ldv[] ldvArray;
        if (kvy2.qff != null) {
            ldvArray = kvy2.qff;
            n2 = ldvArray.length;
            for (n = 0; n < n2; ++n) {
                this.ap(ldvArray[n]);
            }
        }
        if (kvy2.qfg != null) {
            ldvArray = kvy2.qfg;
            n2 = ldvArray.length;
            for (n = 0; n < n2; ++n) {
                this.aq(ldvArray[n]);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 512: {
                this.a((kwr)ktv2);
                break;
            }
            case 530: {
                this.a((kvx)ktv2);
                break;
            }
            case 531: {
                this.a((kvy)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }
}

