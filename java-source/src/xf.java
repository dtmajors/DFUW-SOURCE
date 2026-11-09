/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  ha
 *  lcr
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class xf
extends xd {
    private cex baW = null;
    private boolean baX = false;
    private List<dxq> baY = null;

    @Override
    public int qe() {
        return this.mA() == null ? -1 : this.mA().getGUID().enw();
    }

    public xf(cex cex2) {
        this.baW = cex2;
    }

    public List<ng> wB() {
        Object object;
        Object object2;
        LinkedList<ng> linkedList = lcn.emA();
        for (Map.Entry object3 : this.baF.entrySet()) {
            object2 = new ng();
            ((ng)object2).SN = this.qe();
            ((ng)object2).aDf = (Integer)object3.getKey();
            ((ng)object2).aDg = true;
            ((ng)object2).aDh = (String)object3.getValue();
            linkedList.add((ng)object2);
            if (!this.baG.containsKey(object3.getKey())) continue;
            ((ng)object2).aDi = (String)this.baG.get(object3.getKey());
        }
        for (wz wz2 : this.baH.values()) {
            object2 = new ng();
            ((ng)object2).SN = this.qe();
            ((ng)object2).aDf = wz2.getID();
            ((ng)object2).aDg = false;
            ((ng)object2).aDh = wz2.vZ();
            linkedList.add((ng)object2);
            object = wz2.wj();
            if (object == null || ((String)object).isEmpty()) continue;
            ((ng)object2).aDi = object;
        }
        for (xg xg2 : this.baI.values()) {
            object2 = xg2.vZ();
            if (object2 == null) continue;
            object = new ng();
            ((ng)object).SN = this.qe();
            ((ng)object).aDf = xg2.getID();
            ((ng)object).aDg = false;
            ((ng)object).aDh = object2;
            linkedList.add((ng)object);
        }
        return linkedList;
    }

    public void H(List<ng> list) {
        if (list != null && !list.isEmpty()) {
            block5: for (ng ng2 : list) {
                wy wy2 = (wy)aza.get(ng2.aDf);
                if (wy2 == null || ng2.aDh == null || ng2.aDh.isEmpty() || xc.cm(ng2.aDh) != 'Q') continue;
                char c2 = xc.co(ng2.aDh);
                switch (c2) {
                    case 'C': {
                        this.baF.put(ng2.aDf, ng2.aDh);
                        if (ng2.aDi == null || ng2.aDi.isEmpty()) continue block5;
                        this.baG.put(ng2.aDf, ng2.aDi);
                        continue block5;
                    }
                    case 'A': {
                        wy wy3 = wy2.a(this, ng2.aDh, ng2.aDi);
                        if (wy3 == null) {
                            assert (false) : "WTF!!!";
                            continue block5;
                        }
                        this.baH.put(ng2.aDf, wy3);
                        this.baJ.put(ng2.aDf, wy3);
                        continue block5;
                    }
                    case 'P': {
                        wy wy3 = wy2.a((xc)this, ng2.aDh);
                        if (wy3 == null) {
                            assert (false) : "WTF!!!";
                            continue block5;
                        }
                        this.baI.put(ng2.aDf, wy3);
                        this.baJ.put(ng2.aDf, wy3);
                        continue block5;
                    }
                }
                assert (false) : "WTF!!!";
            }
        }
        this.I(list);
    }

    private void I(List<ng> list) {
        int[] nArray = null;
        boolean[] blArray = null;
        String[] stringArray = null;
        String[] stringArray2 = null;
        int n = 0;
        int n2 = 1;
        if (list != null && !list.isEmpty()) {
            nArray = new int[list.size()];
            blArray = new boolean[list.size()];
            stringArray = new String[list.size()];
            stringArray2 = new String[list.size()];
            for (int i = 0; i < list.size(); ++i) {
                nArray[i] = list.get((int)i).aDf;
                blArray[i] = list.get((int)i).aDg;
                stringArray[i] = list.get((int)i).aDh;
                stringArray2[i] = list.get((int)i).aDi == null ? "" : list.get((int)i).aDi;
            }
        }
        this.a(this.wf(), nArray, blArray, stringArray, stringArray2, n, n2);
    }

    public void wC() {
        for (wz object : this.baH.values()) {
            object.wk();
        }
        this.ww();
        this.baX = true;
        if (this.baY != null) {
            for (dxq dxq2 : this.baY) {
                this.receiveMessage(dxq2);
            }
            this.baY.clear();
            this.baY = null;
        }
    }

    @Override
    protected boolean l(dxq dxq2) {
        if (this.baX) {
            return true;
        }
        if (this.baY == null) {
            this.baY = lcn.emA();
        }
        this.baY.add(dxq2);
        return false;
    }

    @Override
    public ldv wf() {
        if (this.mA() == null || !this.mA().iN()) {
            return null;
        }
        return lcr.p((ldv)lcr.qDz, (int)this.mA().jr(), (int)this.mA().getGUID().enw());
    }

    private void a(ldv ldv2, int[] nArray, boolean[] blArray, String[] stringArray, String[] stringArray2, int n, int n2) {
        gdr gdr2 = (gdr)this.MessageDelegator.h(34822, this.GUID, ldv2);
        gdr2.qh(this.GUID);
        gdr2.aq(nArray);
        gdr2.l(blArray);
        gdr2.D(stringArray);
        gdr2.E(stringArray2);
        gdr2.Er(n);
        gdr2.Es(n2);
        this.MessageDelegator.F(gdr2);
    }

    @Override
    protected void a(gdv gdv2) {
        switch (gdv2.btc()) {
            case 1: {
                wy wy2;
                wy wy3 = (wy)aza.get(gdv2.qS());
                if (wy3 == null) {
                    return;
                }
                if (this.cR(gdv2.qS())) {
                    wy2 = (wz)this.baH.remove(gdv2.qS());
                    this.baJ.remove(gdv2.qS());
                    ((wz)wy2).reset();
                } else if (this.dP(gdv2.qS())) {
                    this.baF.remove(gdv2.qS());
                    this.baG.remove(gdv2.qS());
                } else {
                    return;
                }
                wy2 = wy3.a(this);
                this.baI.put(gdv2.qS(), wy2);
                this.baJ.put(gdv2.qS(), wy2);
                ((xg)wy2).wD();
                break;
            }
            default: {
                super.a(gdv2);
            }
        }
    }

    @Override
    public ha mA() {
        return this.baW.mA();
    }

    @Override
    public cex nW() {
        return this.baW;
    }
}

