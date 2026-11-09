/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 */
import java.util.List;
import java.util.Map;
import java.util.Set;

public class cfk
extends cfj
implements bsq,
bto {
    private bsr euz = null;
    private dsu alW = null;
    private Map<Integer, List<Integer>> euA = lcn.emw();
    private boolean bqw = false;
    public final jlm<Integer, Boolean> euB = new jlm();
    public final jll<Integer> euC = new jll();
    Set<bsx> euD = lcn.emx();
    private double euE = 0.0;
    private ljq euF = new ljq(0.0f, 0.0f, 0.0f);

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.euz != null) {
            this.MessageDelegator.hd(this.euz.getGUID());
        }
    }

    public void g(dsu dsu2) {
        this.alW = dsu2;
        if (this.euz != null) {
            for (bsp bsp2 : this.euz.axd().values()) {
                this.a(bsp2, true);
            }
        }
        this.h(dsu2);
    }

    private void h(dsu dsu2) {
        cew cew2 = (cew)this.MessageDelegator.bzx().bzt().d(dsu2.gYY);
        for (Map.Entry entry : euv.entrySet()) {
            if (this.pI((Integer)entry.getKey())) continue;
            int n = (Integer)entry.getKey();
            for (cfu cfu2 : ((cfn)entry.getValue()).aNx()) {
                if (cfu2.aNF() != cfv.PROXIMITY) continue;
                cfs cfs2 = (cfs)cfu2;
                aca aca2 = new aca(this, cew2, cfs2, n){
                    public cew baO;
                    public int ResourceType;
                    final /* synthetic */ cew euG;
                    final /* synthetic */ cfs euH;
                    final /* synthetic */ int euI;
                    final /* synthetic */ cfk euJ;
                    {
                        this.euJ = cfk2;
                        this.euG = cew2;
                        this.euH = cfs2;
                        this.euI = n;
                        this.baO = this.euG;
                        this.ResourceType = this.euH.az();
                    }

                    public void a(int n, float f2, ldv ldv2, ljq ljq2) {
                        if (f2 <= this.euH.getRadius()) {
                            this.euJ.pJ(this.euI);
                            this.baO.b((aca)this, n);
                        }
                    }
                };
                cew2.a(aca2, cfs2.az());
            }
        }
    }

    public void pJ(int n) {
        cfn cfn2 = (cfn)euv.get(n);
        if (cfn2 == null) {
            assert (false);
            return;
        }
        if (!cfn2.aNy()) {
            this.pH(n);
            this.w(n, false);
        }
        this.euB.k(n, cfn2.aNy());
    }

    protected void w(int n, boolean bl) {
        ldv ldv2 = hso.cxK().bAn().gYX;
        dxv dxv2 = (dxv)this.MessageDelegator.h(35586, this.GUID, ldv2);
        dxv2.CY(n);
        dxv2.jN(bl);
        this.MessageDelegator.E(dxv2);
    }

    public void pK(int n) {
        if (this.aNr().indexOf(n) == -1 && this.aNs().indexOf(n) != -1) {
            this.w(n, true);
            this.pG(n);
            this.euC.V(n);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 35585) {
            this.a((dxz)dxq2);
        } else if (dxq2.bEz() == 35587) {
            this.a((dxy)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    protected void a(dxy dxy2) {
        List<Integer> list = this.euA.remove(dxy2.bEI());
        if (list == null) {
            return;
        }
        for (Integer n : list) {
            this.pJ(n);
        }
    }

    protected void a(dxz dxz2) {
        this.eux.clear();
        this.euy.clear();
        for (int n : dxz2.bEJ()) {
            this.pG(n);
        }
        for (int n : dxz2.bEK()) {
            this.pH(n);
        }
        Object object = euv.entrySet().iterator();
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            if (this.pI((Integer)entry.getKey())) continue;
            int n = (Integer)entry.getKey();
            for (cfu cfu2 : ((cfn)entry.getValue()).aNx()) {
                if (cfu2.aNF() == cfv.PROXIMITY) continue;
                List<Integer> list = this.euA.get(cfu2.aNF().ordinal());
                if (list == null) {
                    list = lcn.emv();
                    this.euA.put(cfu2.aNF().ordinal(), list);
                }
                list.add(n);
            }
        }
    }

    private void a(bsp bsp2, boolean bl) {
        if (this.alW == null) {
            return;
        }
        if (bsp2.axa().ib() != 0) {
            return;
        }
        cew cew2 = (cew)this.MessageDelegator.bzx().bzt().d(this.alW.gYY);
        if (cew2 == null) {
            return;
        }
        cey cey2 = cew2.aMu();
        if (cey2 == null) {
            return;
        }
        if (bl) {
            cey2.c(bsp2.az(), bsp2.axa(), bsp2.av());
        } else {
            cey2.t(bsp2.az(), bsp2.axa());
        }
    }

    @Override
    public void a(bsp bsp2) {
        if (this.alW == null) {
            return;
        }
        this.a(bsp2, true);
    }

    @Override
    public void b(bsp bsp2) {
        if (this.alW == null) {
            return;
        }
        this.a(bsp2, false);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.isInitialized()) {
            return;
        }
        if (!this.bqw) {
            this.bqw = true;
            this.euz = new bsr();
            this.euz.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.euz);
            this.euz.a(this);
            for (Map.Entry entry : euv.entrySet()) {
                if (this.pI((Integer)entry.getKey())) continue;
                int n = (Integer)entry.getKey();
                for (cfu cfu2 : ((cfn)entry.getValue()).aNx()) {
                    if (cfu2.aNF() != cfv.PROXIMITY) continue;
                    cfs cfs2 = (cfs)cfu2;
                    this.euz.mP(cfs2.az());
                }
            }
        }
        this.aNt();
    }

    public void mZ(int n) {
        List<bsx> list = fy.TN.get(fy.a.TR.ordinal()).get(n);
        if (list != null) {
            list.addAll(list);
        }
    }

    public void pL(int n) {
        List<bsx> list = fy.TN.get(fy.a.TR.ordinal()).get(n);
        if (list != null) {
            list.removeAll(list);
        }
    }

    private void aNt() {
        if (this.alW == null) {
            return;
        }
        if (this.MessageDelegator.arc().rgz - this.euE < 1.5) {
            return;
        }
        this.euE = this.MessageDelegator.arc().rgz;
        bvd bvd2 = (bvd)this.MessageDelegator.bzx().bzt().d(this.alW.gYZ);
        if (bvd2 == null) {
            return;
        }
        ljq ljq2 = bvd2.av();
        ljq ljq3 = ljq2.esF();
        ljq3.et(this.euF);
        if ((double)ljq3.eqF() < 1.5) {
            return;
        }
        this.euF = ljq2.esF();
        List<Integer> list = this.euA.get(cfv.SPHERES.ordinal());
        if (list == null) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); ++i2) {
            Integer n = list.get(i2);
            cfn cfn2 = (cfn)euv.get(n);
            for (cfu cfu2 : cfn2.aNx()) {
                if (cfu2.aNF() != cfv.SPHERES) continue;
                cft cft2 = (cft)cfu2;
                for (bsx bsx2 : this.euD) {
                    int n2 = (Integer)bsx2.getValue("SensorID");
                    if (cft2.aNE().indexOf(n2) == -1) continue;
                    float f2 = ((Float)bsx2.getValue("Radius")).floatValue();
                    ljq ljq4 = (ljq)bsx2.getValue("Position");
                    ljq ljq5 = ljq2.esF();
                    ljq5.et(ljq4);
                    if (!(ljq5.eqN() < f2)) continue;
                    this.pJ(n);
                    list.remove(i2);
                    return;
                }
            }
        }
    }
}

