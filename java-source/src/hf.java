/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 *  lcw
 */
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class hf
extends btk {
    private static double abn = 1.0;
    private final ha hF;
    private double abo = 0.0;
    private lmf abp = null;
    private String abq = null;
    private boolean abr = false;
    private boolean QF = false;
    private boolean QE = false;
    private boolean abs = true;
    private dml abt = null;
    private ldv abu = null;
    private bcr abv = bcr.cXg;
    private ldv abw = null;
    private dmq abx = null;
    private dmf aby = dmf.gHt;
    private int abz = -1;
    private Map<lfs<String, Boolean>, Integer> abA = lcn.emw();
    private Set<acb> abB = null;

    public int lt() {
        return this.abz;
    }

    public boolean lu() {
        return this.abp == lmf.rEz;
    }

    public hf(ha ha2) {
        this.hF = ha2;
        this.abo = 0.0;
    }

    public void c(oc oc2) {
        this.abA.clear();
        if (oc2.aFl.aFP != null && oc2.aFl.aFP.length > 0) {
            for (ow ow2 : oc2.aFl.aFP) {
                int n = ow2.aGn.indexOf(46);
                if (n < 0) {
                    lfn.b(5, "SFPlayerPositionManager", "restoreFromPersistenceData: Unable to parse visted tile '" + ow2.aGn + "'");
                    continue;
                }
                String string = ow2.aGn.substring(0, n);
                boolean bl = Boolean.parseBoolean(ow2.aGn.substring(n + 1));
                lfs<String, Boolean> lfs2 = new lfs<String, Boolean>(string, bl);
                this.abA.put(lfs2, ow2.aGm);
            }
        }
    }

    public void d(oc oc2) {
        if (this.abA.isEmpty()) {
            return;
        }
        oc2.aFl.aFP = new ow[this.abA.size()];
        int n = 0;
        for (Map.Entry<lfs<String, Boolean>, Integer> entry : this.abA.entrySet()) {
            oc2.aFl.aFP[n++] = new ow((String)entry.getKey().reX + "." + entry.getKey().reY, entry.getValue());
        }
    }

    public void gG() {
        this.QE = true;
    }

    public void gH() {
        this.abs = true;
        this.QE = false;
        this.abt = null;
        this.abx = null;
        this.aby = dmf.gHt;
        this.abu = null;
        this.abv = bcr.cXg;
        this.hF.jf().a(null, dmf.gHt);
    }

    public void lv() {
        this.QF = true;
    }

    public void gJ() {
        this.QF = false;
        this.abs = true;
        this.abt = null;
        this.abx = null;
        this.aby = dmf.gHt;
        this.abu = null;
        this.abv = bcr.cXg;
        this.hF.jf().a(null, dmf.gHt);
    }

    public void doTick(ldz ldz2) {
        if (!this.hF.iY()) {
            return;
        }
        if (this.QE || this.QF) {
            return;
        }
        if (this.hF.jf() == null) {
            return;
        }
        if (this.hF.jf().aAG() == null) {
            return;
        }
        if (this.hF.jf().aAG().azb() == null) {
            return;
        }
        ljq ljq2 = this.hF.jf().aAG().azb();
        this.abo -= ldz2.qwh;
        if (this.abo > 0.0) {
            return;
        }
        this.abo = abn;
        this.P(ljq2);
    }

    private void P(ljq ljq2) {
        boolean bl;
        lmf lmf2;
        boolean bl2;
        if (ljq2 == null) {
            lfn.b(5, "SFPlayerPositionManager", "checkPosition() TileID POSITION IS NULL!");
            assert (false);
            return;
        }
        if (ly.Z(ljq2)) {
            if (!this.hF.kI().qj()) {
                this.hF.kI().qh();
            }
            this.abr = true;
            this.abs = false;
            return;
        }
        String string = lcw.dZ((ljq)ljq2);
        if (string == null) {
            lfn.b(5, "SFPlayerPositionManager", "checkPosition() TileID == null for this position: " + ljq2);
            return;
        }
        this.Q(ljq2);
        int n = this.abz;
        this.abz = lea.eh(ljq2);
        if (n != this.abz) {
            if (n >= 0) {
                this.bZ(n);
            }
            if (this.abz >= 0) {
                this.bY(this.abz);
            }
        }
        boolean bl3 = bl2 = (lmf2 = lea.eg(ljq2)) != null && lmf2 == lmf.rEz;
        if (!bl2) {
            this.hF.kI().ad(this.abs);
            this.abs = false;
        } else {
            this.hF.kI().ae(this.abs);
            this.abs = false;
        }
        boolean bl4 = lmf.rEz.equals((Object)lmf2);
        boolean bl5 = lmf.rEz.equals((Object)this.abp);
        if (bl4 != bl5 && this.abp != null) {
            dxy dxy2 = (dxy)this.hF.getMessageDelegator().h(35587, this.hF.getGUID(), this.hF.aP());
            dxy2.Da(bl4 ? cfv.SAFE_ZONE_ENTER.ordinal() : cfv.SAFE_ZONE_LEAVE.ordinal());
            this.hF.getMessageDelegator().I(dxy2);
        }
        this.abp = lmf2;
        boolean bl6 = bl = ljq2.y <= -1000.0f;
        if (string.equals(this.abq) && this.abr == bl) {
            return;
        }
        this.abq = string;
        this.abr = bl;
        lfs<String, Boolean> lfs2 = new lfs<String, Boolean>(this.abq, bl);
        Integer n2 = this.abA.get(lfs2);
        if (n2 == null) {
            if (lcw.bcB == 2) {
                if (this.abr) {
                    if (lmf2 == lmf.rEz) {
                        this.hF.c(mab.ual.bD(new Object[0]));
                    } else {
                        this.hF.c(mab.uak.bD(new Object[0]));
                    }
                } else if (lmf2 == lmf.rEz) {
                    this.hF.c(mab.uaj.bD(new Object[0]));
                } else {
                    this.hF.c(mab.uai.bD(new Object[0]));
                }
            }
            this.abA.put(lfs2, 1);
            fsr fsr2 = (fsr)this.hF.getMessageDelegator().h(30235, this.hF.getGUID(), this.hF.getGUID());
            fsr2.TileID = this.abq;
            fsr2.iVz = bl;
            this.hF.receiveMessage((dxq)fsr2);
        } else {
            Integer n3 = n2 + 1;
            this.abA.put(lfs2, n3);
        }
    }

    private void Q(ljq ljq2) {
        dml dml2 = lea.ch(ljq2);
        ldv ldv2 = dml2 == null ? null : dml2.bqi();
        bcr bcr2 = ldv2 == null || this.hF.iG() == null ? bcr.cXg : lea.av(ldv2, this.hF.iG());
        ldv ldv3 = this.hF.iG();
        dmq dmq2 = lea.ci(ljq2);
        dmf dmf2 = this.aby;
        if (dml2 != this.abt) {
            if (dml2 == null) {
                dmf2 = dmf.gHt;
            } else if (ldv2 == null) {
                this.hF.c(this.hF.iG() == null ? mcy.uDf.bD(new Object[0]) : mcy.uDe.bD(new Object[0]));
                dmf2 = dmf.gHt;
            } else if (!ldv.au(ldv2, this.abu)) {
                if (ldv.au(this.hF.iG(), ldv2)) {
                    this.hF.c(mcy.uDd.bD(new Object[0]));
                    dmf2 = dmf.gHu;
                } else if (bcr2 == bcr.cXi) {
                    this.hF.c(mcy.uDc.bD(lea.ua(ldv2)));
                    dmf2 = dmf.gHv;
                } else if (bcr2 == bcr.cXe) {
                    this.hF.c(mcy.uDb.bD(lea.ua(ldv2)));
                    dmf2 = dmf.gHw;
                } else {
                    this.hF.c(mcy.uDa.bD(lea.ua(ldv2)));
                    dmf2 = dmf.gHt;
                }
            }
            this.abt = dml2;
            this.abu = ldv2;
            this.abv = bcr2;
            this.abw = ldv3;
        } else if (!ldv.au(ldv2, this.abu)) {
            if (ldv2 == null) {
                this.hF.c(this.hF.iG() == null ? mcy.uDl.bD(new Object[0]) : mcy.uDk.bD(new Object[0]));
                dmf2 = dmf.gHt;
            } else if (ldv.au(this.hF.iG(), ldv2)) {
                this.hF.c(mcy.uDj.bD(new Object[0]));
                dmf2 = dmf.gHu;
            } else if (bcr2 == bcr.cXi) {
                this.hF.c(mcy.uDi.bD(lea.ua(ldv2)));
                dmf2 = dmf.gHv;
            } else if (bcr2 == bcr.cXe) {
                this.hF.c(mcy.uDh.bD(lea.ua(ldv2)));
                dmf2 = dmf.gHw;
            } else {
                this.hF.c(mcy.uDg.bD(lea.ua(ldv2)));
                dmf2 = dmf.gHt;
            }
            this.abu = ldv2;
            this.abv = bcr2;
            this.abw = ldv3;
        } else if (this.abv != bcr2) {
            switch (bcr2) {
                case cXi: {
                    this.hF.c(mcy.uDn.bD(new Object[0]));
                    dmf2 = dmf.gHv;
                    break;
                }
                case cXe: {
                    this.hF.c(mcy.uDm.bD(new Object[0]));
                    dmf2 = dmf.gHw;
                }
            }
            this.abv = bcr2;
            this.abw = ldv3;
        } else if (!ldv.au(ldv3, this.abw)) {
            if (this.abt != null) {
                if (this.abu == null) {
                    this.hF.c(ldv3 == null ? mcy.uDp.bD(new Object[0]) : mcy.uDo.bD(new Object[0]));
                    dmf2 = dmf.gHt;
                } else if (ldv.au(this.hF.iG(), ldv2)) {
                    this.hF.c(mcy.uDt.bD(new Object[0]));
                    dmf2 = dmf.gHu;
                } else if (bcr2 == bcr.cXi) {
                    this.hF.c(mcy.uDs.bD(lea.ua(ldv2)));
                    dmf2 = dmf.gHv;
                } else if (bcr2 == bcr.cXe) {
                    this.hF.c(mcy.uDr.bD(lea.ua(ldv2)));
                    dmf2 = dmf.gHw;
                } else {
                    this.hF.c(mcy.uDq.bD(lea.ua(ldv2)));
                    dmf2 = dmf.gHt;
                }
            }
            this.abw = ldv3;
        }
        if (dmq2 != this.abx || dmf2 != this.aby) {
            this.hF.jf().a(dmq2, dmf2);
            if (dmq2 == null) {
                this.hF.c(mcy.uDw.bD(new Object[0]));
            } else {
                if (this.abx == dmq2 && ldv.au(this.abu, ldv2) && this.abx != dmq2) {
                    if (dmf2 == dmf.gHu) {
                        this.hF.c(mcy.uDA.bD(new Object[0]));
                    } else if (dmf2 == dmf.gHv) {
                        this.hF.c(mcy.uDB.bD(new Object[0]));
                    }
                }
                if (this.hF.jf().aMN()) {
                    for (dmh dmh2 : dmh.values()) {
                        if (dmh2.bpY()) {
                            this.hF.c(mcy.uDu.bD(new Object[]{Float.valueOf(this.hF.jf().a(dmh2) * 100.0f), dmh2}));
                            continue;
                        }
                        this.hF.c(mcy.uDv.bD(new Object[]{Float.valueOf(this.hF.jf().a(dmh2) * 100.0f), dmh2}));
                    }
                } else if (ldv3 == null) {
                    this.hF.c(mcy.uDz.bD(new Object[0]));
                } else {
                    this.hF.c(mcy.uDy.bD(new Object[0]));
                }
            }
            this.abx = dmq2;
            this.aby = dmf2;
        }
    }

    public void lw() {
        this.abt = null;
        this.abx = null;
        this.aby = dmf.gHt;
        this.abu = null;
        this.abv = bcr.cXg;
        this.hF.jf().a(null, dmf.gHt);
    }

    public void lx() {
        this.abq = null;
        this.abr = false;
        this.QF = false;
        this.QE = false;
        this.abs = true;
    }

    public final Map<lfs<String, Boolean>, Integer> ly() {
        return this.abA;
    }

    public void a(acb acb2) {
        if (acb2 == null) {
            return;
        }
        if (this.abB == null) {
            this.abB = lcn.emx();
        }
        this.abB.add(acb2);
    }

    public void b(acb acb2) {
        if (acb2 == null) {
            return;
        }
        if (this.abB == null) {
            return;
        }
        this.abB.remove(acb2);
        if (this.abB.isEmpty()) {
            this.abB = null;
        }
    }

    private void bY(int n) {
        if (this.abB == null) {
            return;
        }
        for (acb acb2 : new HashSet<acb>(this.abB)) {
            acb2.eh(n);
        }
    }

    private void bZ(int n) {
        if (this.abB == null) {
            return;
        }
        for (acb acb2 : new HashSet<acb>(this.abB)) {
            acb2.ei(n);
        }
    }

    public lmf lz() {
        return this.abp;
    }
}

