/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cex
 *  cug
 *  ha
 *  lcr
 *  mcs
 */
import java.util.Iterator;

public class czr
extends czc {
    private float fXA = 0.0f;
    private float fXB = 0.0f;
    private float fXC = 0.0f;
    private float fXD = 0.0f;
    private float fXE = 0.0f;
    private ctu bpC = null;
    private akf gaB = null;
    private int gaC = 0;
    private ldv gaD = null;

    public float bgq() {
        return this.fXA;
    }

    public void fz(float f2) {
        this.fXA = f2;
    }

    public float bgr() {
        return this.fXB;
    }

    public void fA(float f2) {
        this.fXB = f2;
    }

    public float bgs() {
        return this.fXC;
    }

    public void fB(float f2) {
        this.fXC = f2;
    }

    public float bgt() {
        return this.fXD;
    }

    public void fC(float f2) {
        this.fXD = f2;
    }

    public float bgu() {
        return this.fXE;
    }

    public void fD(float f2) {
        this.fXE = f2;
    }

    @Override
    public float xo(int n2) {
        switch (n2) {
            case 5: {
                return this.fXA;
            }
            case 6: {
                return this.fXB;
            }
            case 20: {
                return this.fXC;
            }
            case 19: {
                return this.fXD;
            }
            case 21: {
                return this.fXE;
            }
        }
        return super.xo(n2);
    }

    @Override
    protected void bex() {
        this.bpC = null;
        this.gaB = null;
        this.gaC = 0;
        this.gaD = null;
        super.bex();
    }

    @Override
    protected void a(czc.a a2) {
        switch (a2) {
            case fZG: {
                assert (this.bpC == null);
                assert (this.gaB == null);
                for (int i2 = 0; i2 < this.fGe.length; ++i2) {
                    if (this.fGe[i2].Cl() != ajb.b.bpq) continue;
                    this.gaB = (akf)this.fGe[i2];
                    break;
                }
                if (this.gaB == null) {
                    lfn.b(5, "SFSalvagingSkillServer", "doPerform(FIRST_TIME) : Crafting Recipe Constraint Not Found!!!");
                    assert (false);
                    this.beQ();
                    return;
                }
                this.bpC = this.gaB.Dk();
                if (this.bpC == null) {
                    lfn.b(5, "SFSalvagingSkillServer", "doPerform(FIRST_TIME) : Recipe Does Not Exist In Crafting Recipe Constraint!!!");
                    assert (false);
                    this.beQ();
                    return;
                }
                cex cex2 = (cex)this.emI.bgQ();
                cvs cvs2 = (cvs)cex2.aMz().b(cwf.b.fEA);
                if (cvs2 == null) {
                    lfn.b(5, "SFSalvagingSkillServer", "doPerform(FIRST_TIME) : No Crafting Session Handler Found for Skill '" + this.getName() + "'");
                    this.beQ();
                    return;
                }
                this.gaC = cvs2.bcb();
                if (this.gaC <= 0) {
                    lfn.b(5, "SFSalvagingSkillServer", "doPerform(FIRST_TIME) : No Crafting Station Resource Type Found for Skill '" + this.getName() + "'");
                    this.beQ();
                    return;
                }
                this.gaD = cvs2.bcE();
                if (!ResourceTree.isDescendant(this.gaC, cug.fpr) || this.gaD != null) break;
                lfn.b(5, "SFSalvagingSkillServer", "doPerform(FIRST_TIME) : No Work Station Physical Object GUID Found for Skill '" + this.getName() + "'");
                this.beQ();
                return;
            }
            case fZH: {
                break;
            }
            case fZI: {
                Object object;
                Object object2;
                Object object3;
                assert (this.bpC != null);
                assert (this.gaB != null);
                float f2 = this.emI.yQ(this.SkillType);
                float f3 = this.fZ(f2);
                if (cug.we((int)this.gaC)) {
                    f3 += 0.05f;
                }
                if (!cug.wm((int)this.fGh.dhr) && (object3 = this.aJz().bgQ().aJC().asf().iF(this.fGh.akX)) instanceof bqs) {
                    bqs bqs2 = (bqs)object3;
                    object2 = bqs2.ah(1232);
                    object = bqs2.ah(1234);
                    if (object2 != null && object != null) {
                        float f4 = ((et)object2).fN() / ((et)object).fN();
                        f3 *= f4;
                    }
                }
                object3 = lcn.emx();
                for (int i3 = 0; i3 < this.bpC.Ingredients.length; ++i3) {
                    if (this.bpC.Ingredients[i3].ResourceType == cug.fkb || !this.cS(f3 * this.bpC.Ingredients[i3].fgb)) continue;
                    object3.add(this.bpC.Ingredients[i3]);
                }
                if (cug.wm((int)this.fGh.dhr)) {
                    this.a(this.fGh.akX, this.gaB.Dn(), 1);
                } else {
                    this.e(this.fGh.akX, this.gaB.Dn());
                }
                if (this.gaB.Dl() > 0) {
                    this.a(cug.fkb, this.gaB.Dl(), this.gaB.Dm());
                }
                ldv ldv2 = lcr.p((ldv)lcr.acL, (int)this.emI.bgR().mA().jr(), (int)this.emI.bgR().mA().getGUID().enw());
                object2 = null;
                if (object3.isEmpty()) {
                    object2 = mcs.uyK.bD(this.fGh.dhr);
                } else {
                    object = new int[object3.size()];
                    int[] nArray = new int[object3.size()];
                    int n2 = 0;
                    Iterator iterator = object3.iterator();
                    while (iterator.hasNext()) {
                        ctm ctm2 = (ctm)iterator.next();
                        int n3 = (int)(lgp.erA().nextFloat() * (float)ctm2.asi) + 1;
                        object[n2] = ctm2.ResourceType;
                        nArray[n2] = n3;
                        ++n2;
                    }
                    this.c((int[])object, nArray);
                    Object object4 = object2 = ((Object)object).length == 1 ? mcs.uyI.bD(1, this.fGh.dhr) : mcs.uyJ.bD(((Object)object).length, this.fGh.dhr);
                }
                if (object2 != null && ldv2 != null) {
                    this.b(ldv2, (loz)object2);
                }
                if (ResourceTree.isDescendant(this.gaC, cug.fpr)) {
                    assert (this.gaD != null);
                    object = (eoc)this.MessageDelegator.h(13862, this.GUID, this.gaD);
                    ((eoc)object).iwc = this.bpC.az();
                    this.MessageDelegator.F((dxq)object);
                }
                if (ResourceTree.isDescendant(this.gaC, cug.fro) && this.jk().bgQ() != null && this.aJz().bgQ() instanceof cex) {
                    assert (this.gaD != null);
                    object = (fip)this.MessageDelegator.h(23853, this.GUID, this.gaD);
                    ((fip)object).GN(this.bpC.az());
                    ((fip)object).pH(((cex)this.jk().bgQ()).mA().getGUID());
                    this.MessageDelegator.F((dxq)object);
                }
                this.fZx = true;
                this.bhq();
                this.bhr();
                object = (cex)this.emI.bgQ();
                ha ha2 = object.mA();
                if (ha2 == null) break;
                fso fso2 = (fso)this.MessageDelegator.h(30220, this.getGUID(), ha2.getGUID());
                fso2.ilu = 0;
                fso2.ResourceType = this.fGh.dhr;
                fso2.SkillType = this.zg();
                this.MessageDelegator.H(fso2);
                break;
            }
        }
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        czr czr2 = (czr)((Object)cxc2);
        czr2.fz(this.fXA);
        czr2.fA(this.fXB);
        czr2.fB(this.fXC);
        czr2.fC(this.fXD);
        czr2.fD(this.fXE);
    }

    private float fZ(float f2) {
        return this.fXD + this.fXE * f2 / 100.0f;
    }

    private void c(int[] nArray, int[] nArray2) {
        fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.GUID, this.emI.bgR().mA().getGUID());
        fmz2.bqd = nArray;
        fmz2.iIY = nArray2;
        fmz2.iQG = null;
        fmz2.iJE = this.fGh.gcw;
        fmz2.b(bqy.dGc);
        this.MessageDelegator.F(fmz2);
    }

    private void a(int n2, int n3, bsa bsa2) {
        assert (n3 > 0);
        assert (bsa2 != null);
        assert (n3 <= bsa2.vf());
        assert (bsa2.avX() != null);
        assert (bsa2.awJ() != null);
        assert (bsa2.avX().length == bsa2.awJ().length);
        bri bri2 = (bri)this.emI.bgQ().aJC().asf();
        brp[] brpArray = bsa2.avX();
        lef[] lefArray = bsa2.awJ();
        for (int i2 = 0; i2 < brpArray.length; ++i2) {
            if (n3 > brpArray[i2].asi) {
                bri2.a(brpArray[i2].GUID, lefArray[i2], brpArray[i2].asi, bqy.dHy);
                n3 -= brpArray[i2].asi;
                continue;
            }
            bri2.a(brpArray[i2].GUID, lefArray[i2], n3, bqy.dHy);
            return;
        }
    }

    private void a(ldv ldv2, lef lef2, int n2) {
        assert (ldv2 != null);
        assert (lef2 != null);
        bri bri2 = (bri)this.emI.bgQ().aJC().asf();
        bri2.a(ldv2, lef2, n2, bqy.dHy);
    }

    private void e(ldv ldv2, lef lef2) {
        assert (ldv2 != null);
        assert (lef2 != null);
        bri bri2 = (bri)this.emI.bgQ().aJC().asf();
        fmv fmv2 = (fmv)this.MessageDelegator.h(7940, this.GUID, bri2.getGUID());
        fmv2.aCK = this.fGh.akX;
        fmv2.dIW = this.gaB.Dn();
        fmv2.gLj = false;
        fmv2.iQC = false;
        fmv2.iQA = true;
        fmv2.b(bqy.dHy);
        bri2.receiveMessage((dxq)fmv2);
    }

    private void b(ldv ldv2, loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 6146: 
            case 7946: 
            case 7956: {
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

