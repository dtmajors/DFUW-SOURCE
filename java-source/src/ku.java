/*
 * Decompiled with CFR.
 */
public class ku
extends jk {
    @Override
    public void nU() {
        for (a a2 : a.values()) {
            this.a(a2.getCommand(), a2.om(), a2.hf(), a2.ok(), a2.ol());
        }
    }

    private loz a(dml dml2, boolean bl) {
        if (dml2 == null) {
            return lqj.sdl.bD(new Object[0]);
        }
        switch (dml2.bqf()) {
            case gIg: {
                if (!bl) {
                    return lqj.sdr.bD(new Object[]{dml2.acY(), ayb.cvj, dml2.bqg()});
                }
                if (dml2.bqi() == null) {
                    return lqj.sdq.bD(new Object[]{dml2.acY(), ayb.cvj, dml2.bqg()});
                }
                return lqj.sdp.bD(new Object[]{dml2.acY(), ayb.cvj, dml2.bqg(), lea.ua(dml2.bqi())});
            }
            case gIh: {
                if (!bl) {
                    return lqj.sdr.bD(new Object[]{dml2.acY(), ayb.cvk, dml2.bqg()});
                }
                if (dml2.bqi() == null) {
                    return lqj.sdq.bD(new Object[]{dml2.acY(), ayb.cvk, dml2.bqg()});
                }
                return lqj.sdp.bD(new Object[]{dml2.acY(), ayb.cvk, dml2.bqg(), lea.ua(dml2.bqi())});
            }
            case gIi: {
                if (!bl) {
                    return lqj.sdu.bD(dml2.acY(), dml2.bqg());
                }
                if (dml2.bqi() == null) {
                    return lqj.sdt.bD(dml2.acY(), dml2.bqg());
                }
                return lqj.sds.bD(dml2.acY(), dml2.bqg(), lea.ua(dml2.bqi()));
            }
            case gIj: {
                char[] cArray = dml2.bqg().toCharArray();
                boolean bl2 = true;
                for (int i = 0; i < cArray.length; ++i) {
                    if (bl2) {
                        cArray[i] = Character.toTitleCase(cArray[i]);
                    }
                    if (cArray[i] == '_') {
                        cArray[i] = 32;
                    }
                    bl2 = cArray[i] == ' ';
                }
                String string = new String(cArray);
                if (!bl) {
                    return lqj.sdx.bD(dml2.acY(), string);
                }
                if (dml2.bqi() == null) {
                    return lqj.sdw.bD(dml2.acY(), string);
                }
                return lqj.sdv.bD(dml2.acY(), string, lea.ua(dml2.bqi()));
            }
        }
        return null;
    }

    private loz a(dml dml2) {
        if (dml2 == null) {
            return null;
        }
        if (!dml2.bqj()) {
            return lqj.sdm.bD(new Object[0]);
        }
        return lqj.sdz.bD(dml2.XD(), dml2.XC());
    }

    private loz a(dmq dmq2) {
        if (dmq2 == null) {
            return lqj.sdn.bD(new Object[0]);
        }
        return lqj.sdy.bD(dmq2.bqC(), dmq2.d(dmj.gIg), dmq2.d(dmj.gIh), dmq2.d(dmj.gIi), dmq2.d(dmj.gIj), lea.ua(dmq2.bqi()));
    }

    @Override
    public void a(jj jj2) {
        a a2 = a.findCommand(jj2.akV);
        if (a2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleCommand() : Unrecognised Command Encountered!!!... CommandText = " + jj2.akV);
            assert (false);
            jj2.b(lqd.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case arW: {
                this.bA(jj2);
                break;
            }
            case arX: {
                this.bB(jj2);
                break;
            }
            case arY: {
                this.bC(jj2);
                break;
            }
            case arZ: {
                this.bD(jj2);
                break;
            }
            case asa: {
                this.bE(jj2);
                break;
            }
            case asb: {
                this.bF(jj2);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleCommand() : Unhandled Command Encountered!!!... CommandText = " + jj2.akV);
                assert (false);
                jj2.b(lqd.rXd.bD(jj2.akV), true);
                return;
            }
        }
    }

    private void bA(jj jj2) {
        dml dml2 = null;
        if (jj2.getArgCount() > 0) {
            int n = ((mho)jj2.cA((int)0)).PC;
            dml2 = lea.AE(n);
        } else {
            if (!this.b(jj2)) {
                return;
            }
            ljq ljq2 = this.aQ().jf().aAG().azb();
            dml2 = lea.ch(ljq2);
        }
        loz loz2 = this.a(dml2, true);
        if (loz2 != null) {
            jj2.a(loz2, false);
        }
        jj2.nT();
    }

    private void bB(jj jj2) {
        dmq dmq2 = null;
        if (jj2.getArgCount() > 0) {
            int n = ((mho)jj2.cA((int)0)).PC;
            dmq2 = lea.AF(n);
        } else {
            if (!this.b(jj2)) {
                return;
            }
            ljq ljq2 = this.aQ().jf().aAG().azb();
            dmq2 = lea.ci(ljq2);
        }
        jj2.a(this.a(dmq2), false);
        if (dmq2 == null) {
            jj2.nT();
            return;
        }
        dmj[] dmjArray = new dmj[]{dmj.gIg, dmj.gIh, dmj.gIi, dmj.gIj};
        for (int i = 0; i < dmjArray.length; ++i) {
            for (dml dml2 : dmq2.c(dmjArray[i])) {
                loz loz2 = this.a(dml2, false);
                if (loz2 == null) continue;
                jj2.a(loz2, false);
            }
        }
        jj2.nT();
    }

    private void bC(jj jj2) {
        int n = 0;
        dml dml2 = null;
        do {
            loz loz2;
            if ((dml2 = lea.AE(++n)) == null || (loz2 = this.a(dml2, true)) == null) continue;
            jj2.a(loz2, false);
        } while (dml2 != null);
        jj2.nT();
    }

    private void bD(jj jj2) {
        dml dml2 = null;
        if (jj2.getArgCount() > 0) {
            int n = ((mho)jj2.cA((int)0)).PC;
            dml2 = lea.AE(n);
        } else {
            if (!this.b(jj2)) {
                return;
            }
            ljq ljq2 = this.aQ().jf().aAG().azb();
            dml2 = lea.ch(ljq2);
        }
        loz loz2 = this.a(dml2, true);
        if (loz2 != null) {
            jj2.a(loz2, false);
        }
        if ((loz2 = this.a(dml2)) != null) {
            jj2.a(loz2, false);
        }
        jj2.nT();
    }

    private void bE(jj jj2) {
        dmq dmq2 = null;
        if (jj2.getArgCount() > 0) {
            int n = ((mho)jj2.cA((int)0)).PC;
            dmq2 = lea.AF(n);
        } else {
            if (!this.b(jj2)) {
                return;
            }
            ljq ljq2 = this.aQ().jf().aAG().azb();
            dmq2 = lea.ci(ljq2);
        }
        jj2.a(this.a(dmq2), false);
        if (dmq2 == null) {
            jj2.nT();
            return;
        }
        dmj[] dmjArray = new dmj[]{dmj.gIg, dmj.gIh, dmj.gIi, dmj.gIj};
        for (int i = 0; i < dmjArray.length; ++i) {
            for (dml dml2 : dmq2.c(dmjArray[i])) {
                if (!dml2.bqj()) continue;
                loz loz2 = this.a(dml2, false);
                if (loz2 != null) {
                    jj2.a(loz2, false);
                }
                if ((loz2 = this.a(dml2)) == null) continue;
                jj2.a(loz2, false);
            }
        }
        jj2.nT();
    }

    private void bF(jj jj2) {
        int n = 0;
        dml dml2 = null;
        boolean bl = false;
        do {
            if ((dml2 = lea.AE(++n)) == null || !dml2.bqj()) continue;
            loz loz2 = this.a(dml2, true);
            if (loz2 != null) {
                jj2.a(loz2, false);
            }
            if ((loz2 = this.a(dml2)) != null) {
                jj2.a(loz2, false);
            }
            bl = true;
        } while (dml2 != null);
        if (!bl) {
            jj2.a(lqj.sdo.bD(new Object[0]), false);
        }
        jj2.nT();
    }
}

