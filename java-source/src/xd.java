/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class xd
extends xc {
    protected Map<Integer, String> baF = lcn.emw();
    protected Map<Integer, String> baG = lcn.emw();
    protected Map<Integer, wz> baH = lcn.emw();
    protected Map<Integer, xg> baI = lcn.emw();
    protected Map<Integer, wy> baJ = lcn.emw();
    private Set<acc> baK = null;

    public int qe() {
        return -1;
    }

    @Override
    public boolean dP(int n) {
        return this.baF.containsKey(n);
    }

    @Override
    public boolean cR(int n) {
        return this.baH.containsKey(n);
    }

    @Override
    public boolean dQ(int n) {
        return this.baI.containsKey(n);
    }

    protected xd() {
    }

    public List<jcf> dY(int n) {
        if (this.dP(n)) {
            return ((wy)aza.get(n)).ci(this.baF.get(n));
        }
        if (this.cR(n)) {
            return this.baH.get(n).wi();
        }
        return null;
    }

    public List<jcf> d(wy wy2) {
        return wy2 == null ? null : this.dY(wy2.getID());
    }

    public List<lfs<Integer, List<jcf>>> dZ(int n) {
        return baD.containsKey(n) ? this.c((xb)baD.get(n)) : null;
    }

    public List<lfs<Integer, List<jcf>>> c(xb xb2) {
        return xb2 == null ? null : xb2.a(this);
    }

    public List<jcl> ea(int n) {
        if (this.baH.containsKey(n)) {
            return this.baH.get(n).vX();
        }
        if (this.dP(n)) {
            String string = this.baF.get(n);
            String[] stringArray = string.split(";");
            LinkedList<jcl> linkedList = lcn.emA();
            for (int i = 0; i < stringArray.length; ++i) {
                if (xc.cm(stringArray[i]) != 'N' || xc.co(stringArray[i]) != 'C') continue;
                int n2 = xc.cn(stringArray[i]);
                aaz aaz2 = ((wy)aza.get(n)).dE(n2);
                if (aaz2.yv() == abb.bdn || !aaz2.xP()) continue;
                linkedList.add(aaz2.xQ());
            }
            return linkedList;
        }
        return aza.containsKey(n) ? ((wy)aza.get(n)).vX() : new LinkedList<jcl>();
    }

    public List<ach> eb(int n) {
        if (this.baH.containsKey(n)) {
            return this.baH.get(n).we();
        }
        if (this.dP(n)) {
            Map<Integer, aci> map = lcn.emw();
            for (ach stringArray2 : ((wy)aza.get(n)).we()) {
                map.put(stringArray2.getID(), stringArray2.yP());
            }
            Object object = this.baG.get(n);
            if (object == null) {
                object = "";
            }
            String[] stringArray = ((String)object).split(";");
            for (int i = 0; i < stringArray.length; ++i) {
                int n2;
                aci aci2;
                if (xc.cm(stringArray[i]) != 'I' || (aci2 = (aci)map.get(n2 = xc.cn(stringArray[i]))) == null) continue;
                aci2.cs(stringArray[i]);
            }
            return new LinkedList<ach>(map.values());
        }
        return aza.containsKey(n) ? ((wy)aza.get(n)).we() : new LinkedList<ach>();
    }

    public ach z(int n, int n2) {
        if (this.baH.containsKey(n)) {
            return this.baH.get(n).dK(n2);
        }
        if (this.dP(n)) {
            ach ach2 = ((wy)aza.get(n)).dK(n2);
            if (ach2 == null) {
                return null;
            }
            aci aci2 = ach2.yP();
            String string = this.baG.get(n);
            if (string == null) {
                string = "";
            }
            String[] stringArray = string.split(";");
            for (int i = 0; i < stringArray.length; ++i) {
                if (xc.cm(stringArray[i]) != 'I' || n2 != xc.cn(stringArray[i])) continue;
                aci2.cs(stringArray[i]);
                return aci2;
            }
        }
        return aza.containsKey(n) ? ((wy)aza.get(n)).dK(n2) : null;
    }

    @Override
    public void a(wy wy2, abd abd2) {
        if (wy2 == null || abd2 == null) {
            return;
        }
        if (this.dP(wy2.getID()) || !this.dQ(wy2.getID()) || this.cR(wy2.getID())) {
            return;
        }
        wz wz2 = ((wy)aza.get(wy2.getID())).a((xc)this, abd2);
        this.baH.put(wy2.getID(), wz2);
        this.baI.remove(wy2.getID());
        this.baJ.put(wy2.getID(), wz2);
        this.a(wz2);
        this.ec(wy2.getID());
    }

    protected void a(wz wz2) {
    }

    protected void ww() {
        for (wy wy2 : aza.values()) {
            if (this.dP(wy2.getID()) || this.cR(wy2.getID()) || this.dQ(wy2.getID())) continue;
            xg xg2 = wy2.a(this);
            this.baI.put(wy2.getID(), xg2);
            this.baJ.put(wy2.getID(), xg2);
        }
        for (xg xg3 : new HashSet<xg>(this.baI.values())) {
            xg3.wD();
        }
    }

    @Override
    public void c(wy wy2) {
        if (wy2 == null) {
            return;
        }
        if (!this.cR(wy2.getID()) || this.dP(wy2.getID())) {
            return;
        }
        this.baH.remove(wy2.getID());
        this.baF.put(wy2.getID(), wy2.vZ());
        this.e(wy2);
        this.ed(wy2.getID());
    }

    protected void e(wy wy2) {
    }

    @Override
    public void a(acc acc2) {
        if (acc2 == null) {
            return;
        }
        if (this.baK == null) {
            this.baK = lcn.emx();
        }
        this.baK.add(acc2);
    }

    private void ec(int n) {
        if (this.baK == null) {
            return;
        }
        for (acc acc2 : new HashSet<acc>(this.baK)) {
            acc2.ej(n);
        }
    }

    private void ed(int n) {
        if (this.baK == null) {
            return;
        }
        for (acc acc2 : new HashSet<acc>(this.baK)) {
            acc2.ek(n);
        }
    }

    @Override
    public void b(acc acc2) {
        if (acc2 == null) {
            return;
        }
        if (this.baK == null) {
            return;
        }
        this.baK.remove(acc2);
        if (this.baK.isEmpty()) {
            this.baK = null;
        }
    }

    public ldv wf() {
        return null;
    }

    protected void a(int n, int n2, ldv ldv2) {
        gdv gdv2 = (gdv)this.MessageDelegator.h(34817, this.GUID, ldv2);
        gdv2.Bl(n);
        gdv2.IS(n2);
        this.MessageDelegator.F(gdv2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (!this.l(dxq2)) {
            return;
        }
        switch (dxq2.bEz()) {
            case 34817: {
                this.a((gdv)dxq2);
                break;
            }
            case 34818: {
                this.a((gdw)dxq2);
                break;
            }
            case 34819: {
                this.a((gds)dxq2);
                break;
            }
            case 34820: {
                this.a((gec)dxq2);
                break;
            }
            case 34821: {
                this.a((gdq)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected boolean l(dxq dxq2) {
        return true;
    }

    protected void a(gdv gdv2) {
        assert (false) : "Quest Manager Message Not Handled by Sub-Class !!!";
    }

    private void a(gdw gdw2) {
        wy wy2 = this.baJ.get(gdw2.qS());
        if (wy2 == null) {
            assert (false);
            return;
        }
        wy2.a(gdw2);
    }

    private void a(gds gds2) {
        wy wy2 = this.baJ.get(gds2.qS());
        if (wy2 == null) {
            assert (false);
            return;
        }
        wy2.a(gds2);
    }

    private void a(gec gec2) {
        wy wy2 = this.baJ.get(gec2.qS());
        if (wy2 == null) {
            assert (false);
            return;
        }
        wy2.a(gec2);
    }

    private void a(gdq gdq2) {
        wy wy2 = this.baJ.get(gdq2.qS());
        if (wy2 == null) {
            assert (false);
            return;
        }
        wy2.a(gdq2);
    }
}

