/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cim
 *  cug
 *  cxd
 *  dta
 *  hvy
 *  hyn
 *  hzo
 *  iba
 *  jps
 *  lcr
 *  lcw
 */
public class jgl
extends btk
implements hyq,
hzq {
    private int Cost = 0;
    private int naa = -1;
    private int ResourceType = 0;
    private boolean jht = false;
    private a nab = a.nax;
    private a nac = a.nax;
    private String YL = null;
    private hzr nad = null;
    private jbp nae = null;
    private iea naf = null;

    protected loz a(a a2, int n) {
        switch (a2) {
            case nah: {
                return lxz.tBl.bD(this.Cost);
            }
            case nam: {
                return lxz.tBm.bD(new Object[0]);
            }
            case naj: {
                Float f = lea.epE().get(n);
                assert (f != null);
                if (f == null) break;
                return lxz.tBn.bD((int)(10.0f * f.floatValue()));
            }
            case nai: {
                return lxz.tBo.bD(cxd.fHc);
            }
            case nak: {
                return lxz.tBq.bD(new Object[0]);
            }
            case nal: {
                return lxz.tBr.bD(this.ResourceType);
            }
            case nan: {
                return lxz.tBt.bD(n);
            }
            case nao: {
                return lxz.tBx.bD(new Object[0]);
            }
            case nap: {
                return lxz.tBC.bD(this.Cost);
            }
            case nav: {
                return lxz.tBs.bD(new Object[0]);
            }
            case nau: {
                civ civ2 = lea.epC().get(cug.fuj);
                int n2 = ldz.dU(civ2.aPE());
                return lxz.tCi.bD(n2, cug.fuj);
            }
            case nat: {
                return lxz.tBG.bD(cim.aPj(), cug.fui);
            }
            case naq: {
                return lxz.tBN.bD(new Object[0]);
            }
            case nas: {
                return lxz.tBI.bD(cug.fuf);
            }
            case nar: {
                return lxz.tBI.bD(cug.fue);
            }
            case naw: {
                return lxz.tBJ.bD(this.ResourceType);
            }
            default: {
                return lxz.tBm.bD(new Object[0]);
            }
        }
        return lxz.tBm.bD(new Object[0]);
    }

    public void dEF() {
        if (this.nad == null) {
            return;
        }
        this.MessageDelegator.hd(this.nad.getGUID());
    }

    public void a(a a2) {
        this.a(a2, -1, -1, false, null, null);
    }

    public void a(a a2, String string, String string2) {
        this.YL = string + " " + string2;
        this.a(a2, -1, -1, true, string, string2);
    }

    public void b(a a2, int n) {
        this.a(a2, n, -1, false, null, null);
    }

    public void a(a a2, int n, int n2) {
        this.a(a2, n, n2, false, null, null);
    }

    public void a(a a2, int n, int n2, boolean bl) {
        this.a(a2, n, n2, bl, null, null);
    }

    private void a(a a2, int n, int n2, boolean bl, String string, String string2) {
        this.nac = this.nab;
        this.naa = n;
        this.ResourceType = n2;
        this.nab = a2;
        this.jht = bl;
        hzr hzr2 = new hzr();
        hzr2.setVisible(true);
        hzr2.setGUID(this.MessageDelegator.bzv());
        switch (a2) {
            case nal: {
                hvy hvy2;
                civ civ2 = lea.epC().get(this.ResourceType);
                if (civ2 != null) {
                    this.Cost = civ2.cl();
                }
                hzr2.oq("SFYesNoDialogSelentinePurchase");
                hzr2.ok(lxf.tof.bD(this.ResourceType).exA());
                hzr2.ol(lxz.tBP.bD(new Object[0]).exA());
                hzr2.om(lxz.tBO.bD(new Object[0]).exA());
                hzr2.on("" + this.Cost);
                hzr2.oo(lxf.tod.bD(this.ResourceType).exA());
                String string3 = "";
                if (this.ResourceType == cug.fua) {
                    int n3;
                    double d2;
                    hvy hvy3 = hso.cxK().cxP().cyZ();
                    if (hvy3 != null && (d2 = hvy3.cAC()) < (double)(n3 = hvy3.cAE())) {
                        double d3 = (double)n3 - d2;
                        int n4 = (int)(d3 / 86400.0);
                        int n5 = (int)((d3 %= 86400.0) / 3600.0);
                        int n6 = (int)((d3 %= 3600.0) / 60.0);
                        string3 = lxz.tCe.bD(n4, n5, n6).exA();
                    }
                } else if (this.ResourceType == cug.fui && (hvy2 = hso.cxK().cxP().cyZ()) != null && hvy2.cAC() < hvy2.cAD()) {
                    string3 = lxz.tBH.bD(hvy2.cAD() - hvy2.cAC()).exA();
                }
                hzr2.or(string3);
                if (civ2 != null) {
                    hzr2.do(civ2.vf());
                }
                hzr2.op("texture/dds/" + ((lgw)lea.enW().acv((int)this.ResourceType)).atw().Name);
                break;
            }
            case nap: {
                if (this.nae == null) {
                    this.nae = new jbp(this);
                    this.nae.setGUID(this.MessageDelegator.bzv());
                    this.MessageDelegator.a((amf)((Object)this.nae));
                    this.nae.R(-3000.0f, -2000.0f);
                }
                this.nae.setVisible(true);
                this.Cost = 0;
                return;
            }
            case nav: {
                hzr2.oq("SFYesNoDialogSelentine");
                hzr2.G(this.a(this.nab, n).exA(), "");
                hzr2.ol(lvm.sXa.bD(cug.fub).exA());
                this.Cost = 0;
                break;
            }
            case nat: {
                boolean bl2 = false;
                if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czb() != null) {
                    bl2 = hso.cxK().cxP().czb().f(hso.cxK().cxP().czb().dNo());
                }
                if (bl2) {
                    if (this.naf == null) {
                        this.naf = new iea(this);
                        this.naf.setGUID(this.MessageDelegator.bzv());
                        this.MessageDelegator.a((amf)((Object)this.naf));
                        this.naf.R(-3000.0f, -2000.0f);
                    }
                    this.naf.setVisible(true);
                } else if (hso.cxK() != null && hso.cxK().cxP() != null) {
                    hso.cxK().cxP().v(mcr.uyf.bD(cug.fui));
                }
                this.Cost = 0;
                return;
            }
            case nau: {
                hzr2.oq("SFYesNoDialogSelentine");
                hzr2.G(this.a(this.nab, n).exA(), "");
                hzr2.ol(lvm.sXa.bD(cug.fuj).exA());
                this.Cost = 0;
                break;
            }
            default: {
                hzr2.oq("SFYesNoDialogSelentine");
                hzr2.G(this.a(this.nab, n).exA(), lxz.tBM.bD(new Object[0]).exA());
                if (a2.cZn == -1) break;
                Integer n7 = lea.epD().get(a2.cZn);
                int n8 = this.Cost = n7 != null ? n7 : 0;
                if (n7 == null) break;
                hzr2.oq("SFYesNoDialogSelentineCost");
                hzr2.om(lxz.tBO.bD(new Object[0]).exA());
                hzr2.on("" + this.Cost);
            }
        }
        hso.cxK().a(jnz.nFI);
        hzr2.a(this);
        this.MessageDelegator.a((amf)((Object)hzr2));
        this.nad = hzr2;
    }

    @Override
    public void oH(boolean bl) {
        assert (this.nad != null);
        if (this.nad != null) {
            this.MessageDelegator.hd(this.nad.getGUID());
        }
        switch (this.nab) {
            case nam: {
                if (!bl) break;
                hzo hzo2 = (hzo)hso.cxK().cxO();
                if (hzo2 != null) {
                    hzo2.cIa().dEJ();
                }
                if (this.nac == a.nax || this.nac == a.nal) break;
                this.a(this.nac, this.naa, this.ResourceType, this.jht);
                break;
            }
            case naq: {
                if (!bl) break;
                ghg ghg2 = (ghg)this.MessageDelegator.h(32513, this.getGUID(), hso.cxK().bAn().gYX);
                ghg2.cZn = cio.eCI.ordinal();
                ghg2.SkillType = -1;
                ghg2.jht = false;
                ghg2.ResourceType = -1;
                ghg2.jhv = false;
                this.MessageDelegator.E(ghg2);
                break;
            }
            case nav: {
                if (!bl) break;
                iba.lDE = true;
                jps jps2 = (jps)this.MessageDelegator.bzx().bzt().d(lcr.qBR);
                if (jps2 != null) {
                    jps2.dPU();
                }
                dta dta2 = new dta();
                dta2.setGUID(lcr.qzF);
                dta2.Ca(2);
                this.MessageDelegator.bzx().bzt().c(dta2);
                edm edm2 = (edm)this.MessageDelegator.h(12856, this.GUID, hso.cxK().bAn().gYY);
                edm2.imB = false;
                this.MessageDelegator.F(edm2);
                bvd bvd2 = (bvd)this.MessageDelegator.bzx().bzt().d(hso.cxK().bAn().gYZ);
                if (bvd2 != null) {
                    ljq ljq2 = bvd2.azb();
                    ljq2.y += 3000.0f;
                    bvd2.c(ljq2);
                }
                hso.cxK().a(jnz.nFB);
                break;
            }
            case nau: {
                if (!bl) break;
                ghg ghg3 = (ghg)this.MessageDelegator.h(32513, this.getGUID(), hso.cxK().bAn().gYX);
                ghg3.cZn = cio.eCM.ordinal();
                ghg3.SkillType = -1;
                ghg3.jht = false;
                ghg3.ResourceType = -1;
                ghg3.jhv = false;
                this.MessageDelegator.E(ghg3);
                break;
            }
            case nao: {
                if (!bl) break;
                ghg ghg4 = (ghg)this.MessageDelegator.h(32513, this.getGUID(), hso.cxK().bAn().gYX);
                ghg4.cZn = cio.eCI.ordinal();
                ghg4.SkillType = -1;
                ghg4.jht = this.jht;
                ghg4.ResourceType = -1;
                ghg4.jhv = bl;
                this.MessageDelegator.E(ghg4);
                break;
            }
            case nas: 
            case nar: {
                if (!bl) break;
                ghg ghg5 = (ghg)this.MessageDelegator.h(32513, this.getGUID(), hso.cxK().bAn().gYX);
                ghg5.cZn = this.nab.cZn;
                ghg5.jht = false;
                this.MessageDelegator.E(ghg5);
                break;
            }
            default: {
                if (!bl) break;
                hvy hvy2 = hso.cxK().cxP().cyZ();
                if (this.Cost > hvy2.cAB()) {
                    this.a(a.nam, this.naa, -1, this.jht);
                    break;
                }
                ghg ghg6 = (ghg)this.MessageDelegator.h(32513, this.getGUID(), hso.cxK().bAn().gYX);
                ghg6.cZn = this.nab.cZn;
                ghg6.SkillType = this.naa;
                ghg6.jht = this.jht;
                ghg6.ResourceType = this.ResourceType;
                ghg6.YL = this.YL;
                this.MessageDelegator.E(ghg6);
                if (this.nab != a.nal) break;
                hso.cxK().cxP().a(hxz.lmk);
                break;
            }
        }
    }

    @Override
    public void s(hyn hyn2) {
        if (hyn2 == this.nae) {
            if (this.nae == null) {
                return;
            }
            this.MessageDelegator.hd(this.nae.getGUID());
            this.nae = null;
        } else if (hyn2 == this.naf) {
            if (this.naf == null) {
                return;
            }
            this.MessageDelegator.hd(this.naf.getGUID());
            this.naf = null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(ghh ghh2) {
        int n = ghh2.cZn;
        cio cio2 = cio.values()[n];
        switch (cio2) {
            case eCA: {
                if (!ghh2.jhy || hso.cxK().cxP() == null || hso.cxK().cxP().cyJ() == null) return;
                if (lcw.aQH()) {
                    jfk jfk2 = hso.cxK().cxP().cyJ().cIO();
                    if (jfk2 == null) return;
                }
                jbq jbq2 = hso.cxK().cxP().cyJ().cHI();
                if (jbq2 == null) return;
                jbq2.kl();
                jbq2.dwL();
                return;
            }
            case eCD: {
                if (hso.cxK().cxP() == null || hso.cxK().cxP().cyJ() == null) return;
                assert (this.nae != null);
                if (this.nae == null) return;
                this.nae.receiveMessage(ghh2);
                return;
            }
            case eCL: {
                if (this.naf == null) return;
                this.naf.a(cin.getValueByOrdinal(ghh2.ew));
            }
        }
    }

    @Override
    public void O(float f, float f2) {
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 32514: {
                this.a((ghh)dxq2);
            }
        }
    }
}

