/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bz
 *  con
 *  dqx
 *  dta
 *  dtc
 *  eg
 *  lcr
 *  lcw
 *  prn
 */
import java.util.List;
import java.util.Map;

public class ca
extends bz {
    protected kfo fL = null;
    protected prn fM = null;
    private boolean fE = true;

    protected void ah() {
        this.phR.fJ(1, 14);
        this.phR.fJ(1, 7);
        this.phR.fJ(1, 12);
        this.phR.fJ(1, 21);
        this.phR.fJ(1, 22);
        this.phR.fJ(1, 301);
        this.phR.fJ(1, 27);
        this.phR.fJ(1, 28);
        this.phR.fJ(1, 30);
        this.phR.fJ(1, 129);
        this.phR.fJ(1, 224);
        this.phR.fJ(1, 216);
        this.phR.fJ(1, 116);
        this.phR.fJ(1, 123);
        this.phR.fJ(1, 218);
        this.phR.fJ(1, 125);
        this.phR.fJ(1, 220);
    }

    protected void a(List list) {
        this.phS.addAll(list);
        this.fy = new dtc();
        this.fy.a((bz)this);
        this.fy.as(this.fC);
        this.fy.Cb(1);
        this.fz = this.fy;
        this.fM = new prn();
        this.fM.a((bz)this);
        this.ak();
        this.phR.setLevel(1);
        this.phQ = kdw.a.phY;
    }

    private void ai() {
        if (mje.DBP) {
            this.fy.a(lcr.qzs);
            lfn.b(0, ((Object)((Object)this)).getClass().getSimpleName(), "initCommandLineTools() : CommandLine Make Levels");
            con con2 = new con();
            con2.Aw(true);
            con2.Ay(mje.DBT);
            con2.Ax(mje.DBU);
            con2.setGUID(this.fy.oc(lcr.qzs).bzv());
            this.fy.a((amf)con2);
        } else if (mje.DCd) {
            this.fy.a(lcr.qzs);
            lfn.b(0, ((Object)((Object)this)).getClass().getSimpleName(), "initCommandLineTools() : CommandLine Make Levels");
            con con3 = new con();
            con3.AA(true);
            con3.setGUID(this.fy.oc(lcr.qzs).bzv());
            this.fy.a((amf)con3);
        } else if (mje.DBQ) {
            this.fy.a(lcr.qzs);
            lfn.b(0, ((Object)((Object)this)).getClass().getSimpleName(), "initCommandLineTools() : CommandLine Make Levels");
            con con4 = new con();
            con4.x(mje.DCb);
            con4.Ay(mje.DBT);
            con4.Ax(mje.DBU);
            con4.setGUID(this.fy.oc(lcr.qzs).bzv());
            this.fy.a((amf)con4);
        } else if (mje.DBX || mje.DBW) {
            lfn.b(0, ((Object)((Object)this)).getClass().getSimpleName(), "initCommandLineTools() : Command Line Make Spawnpoints");
            this.fy.a(lcr.qzs);
            ec ec2 = new ec();
            ec2.setGUID(this.fy.oc(lcr.qzs).bzv());
            this.fy.a((amf)ec2);
        } else if (mje.DBO) {
            lfn.b(0, ((Object)((Object)this)).getClass().getSimpleName(), "initCommandLineTools() : Command Line Make Cities");
            this.fy.a(lcr.qzs);
            axw axw2 = new axw();
            axw2.setGUID(this.fy.oc(lcr.qzs).bzv());
            this.fy.a((amf)axw2);
        } else if (mje.DBY) {
            lfn.b(0, ((Object)((Object)this)).getClass().getSimpleName(), "initCommandLineTools() : Command Line Make Voxels");
            this.fy.a(lcr.qzs);
            ee ee2 = new ee();
            ee2.setGUID(this.fy.oc(lcr.qzs).bzv());
            this.fy.a((amf)ee2);
        } else if (mje.DCe) {
            lfn.b(0, ((Object)((Object)this)).getClass().getSimpleName(), "initCommandLineTools() : Command Line Make Monster State Sound Index");
            this.fy.a(lcr.qzs);
            ea ea2 = new ea();
            ea2.setGUID(this.fy.oc(lcr.qzs).bzv());
            this.fy.a((amf)ea2);
        }
    }

    public void e(ldz ldz2) {
        this.fy.doTick(ldz2);
        this.fM.doTick(ldz2);
        if (this.fE) {
            dta dta2 = new dta();
            dta2.setGUID(lcr.qzi);
            dta2.Ca(3);
            this.fy.c(dta2);
            ldx.enG().aci(1).lK(lcr.qzi);
            dld dld2 = this.aj();
            this.fy.a((amf)dld2);
            dqx dqx2 = new dqx();
            dqx2.setGUID(new ldv(lcr.qDY.ib(), lcr.qzi.enw(), lcr.qDY.enx()));
            this.fy.a((amf)dqx2);
            eg eg2 = new eg();
            eg2.setGUID(lcr.qAE);
            this.fy.a((amf)eg2);
            geg geg2 = (geg)this.fy.h(769, lcr.qzi, lcr.qzi);
            geg2.blo = lcr.qAE;
            geg2.blp = lcr.rg;
            geg2.gqN = 1025;
            this.fy.K((dxq)geg2);
            fob fob2 = (fob)dta2.h(11521, lcr.qAE, lcr.qAE);
            String string = "xml-files/worlddata/worlddata_wb.xml";
            fob2.cd(string);
            this.a(fob2);
            this.fE = false;
            this.ai();
        }
        this.al();
    }

    protected final dld aj() {
        ljq ljq2 = mje.DBl;
        if (ljq2 == null) {
            ljq2 = new ljq();
        }
        dld dld2 = new dld();
        dld2.setGUID(lcr.rg);
        dld2.gZ(mje.DBo);
        dld2.ha(mje.DBn);
        dld2.As(lcw.qFT);
        dld2.At(lcw.qFU);
        dld2.d(new ljq(0.0f, 0.01f, 0.0f));
        dld2.c(ljq2);
        dld2.setActive(true);
        return dld2;
    }

    public void ak() {
        dta dta2 = new dta();
        dta2.setGUID(lcr.qzp);
        dta2.Ca(2);
        this.fy.c(dta2);
        dta dta3 = new dta();
        dta3.Ca(7);
        dta3.setGUID(lcr.qzx);
        this.fy.c(dta3);
        deq deq2 = new deq();
        deq2.setGUID(lcr.qEb);
        this.fy.a((amf)deq2);
        dta dta4 = new dta();
        dta4.setGUID(lcr.qzD);
        dta4.Ca(2);
        this.fy.c(dta4);
    }

    public void a(hac hac2) {
        this.fM.y(hac2);
    }

    public void a(fof fof2) {
        if (this.fw != null) {
            this.fw.p(fof2);
        } else {
            lfn.b(5, ((Object)((Object)this)).getClass().getName(), "IO Out pipe null!");
        }
    }

    public void b(Map<ldv, dta> map) {
        if (this.fL != null) {
            this.fL.p(map);
        } else {
            lfn.b(5, ((Object)((Object)this)).getClass().getName(), "OS Out pipe null!");
        }
    }

    public void a(kee kee2, int n) {
        super.a(kee2, n);
        if (kee2.dVG() == 301 && !kee2.dVI().equals(kea.piz)) {
            this.fM.c((kfs)kee2);
        }
        if (kee2.dVG() == 301 && kee2.dVI().equals(kea.piz)) {
            this.fM.d((kfs)kee2);
        }
        if (kee2.dVG() == 28 && kee2.dVI().equals(kea.piz)) {
            this.fL = (kfo)kee2;
        } else if (kee2.dVG() == 12 && kee2.dVI().equals(kea.piF) && kee2.dVJ().equals(kea.piz)) {
            this.fy.a(kee2);
        }
    }

    private void al() {
        String string = "";
        eg eg2 = this.an();
        if (eg2 != null) {
            string = string + eg2.dW();
            if (mje.gUd != null) {
                amf amf2 = this.fy.d(mje.gUd);
                if (amf2 != null) {
                    if (amf2 != null && amf2 instanceof bdl) {
                        int n;
                        bdl bdl2 = (bdl)((Object)amf2);
                        String string2 = bdl2.amd();
                        if (string2 != null && (n = string2.lastIndexOf("/")) > 0) {
                            string2 = string2.substring(n + 1);
                        }
                        if (bdl2.alZ()) {
                            string2 = "MultiSel " + bdl2.ame().size() + " objects :";
                            n = 1;
                            for (int i2 = bdl2.ame().size() - 1; i2 >= 0; --i2) {
                                int n2;
                                amf amf3 = bdl2.ame().get(i2);
                                String string3 = amf3.getObjectDescriptionFilename();
                                if (string3 != null && (n2 = string3.lastIndexOf("/")) > 0) {
                                    string3 = string3.substring(n2 + 1);
                                }
                                if (n == 0) {
                                    string2 = string2 + ",";
                                }
                                string2 = string3 != null ? string2 + string3 : string2 + "null";
                                n = 0;
                            }
                        }
                        eg2.aj(string2);
                    } else if (amf2 != null) {
                        int n;
                        String string4 = mwi.y(amf2);
                        if (string4 != null && (n = string4.lastIndexOf("/")) > 0) {
                            string4 = string4.substring(n + 1);
                        }
                        eg2.aj(string4);
                    }
                }
            } else {
                eg2.aj("none");
            }
        }
        mje.BZ(string);
    }

    public void a(amf amf2) {
        this.fy.a(amf2);
    }

    public void a(ldv ldv2) {
        this.fy.a(ldv2);
    }

    public void a(ksl ksl2) {
        this.fy.a(ksl2);
    }

    public void a(khd khd2) {
        this.fy.a(khd2);
    }

    public void b(ldv ldv2) {
        this.fy.hd(ldv2);
    }

    public void c(ldv ldv2) {
        this.fy.oe(ldv2);
    }

    public Map<ldv, dta> am() {
        return this.fy.am();
    }

    public amf d(ldv ldv2) {
        return this.fy.d(ldv2);
    }

    private eg an() {
        return (eg)this.fy.d(lcr.qAE);
    }

    public ksl j(int n) {
        return this.fy.j(n);
    }
}

