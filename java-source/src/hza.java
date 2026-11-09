/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class hza
extends iho {
    private static final String lvz = "Maximized";
    private boolean lvA = false;
    private ipf lvB;
    private ipf lvC;
    private ipf lvD;
    private ipf lvE;
    private ipx lvF;
    private ipx lvG;
    private iox lvH;
    private jlf<lhe<hyn>> lvI;
    private jle lvJ;
    private jlf<lhe<hyn>> lvK;

    public hza() {
        super("MediaPlayerWindow", "TrackerWindow.swf");
        this.OQ(jnz.nGi | jnz.nGe);
        this.a(lvz, hsu.ldg, this.lvA);
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    public boolean cGI() {
        return this.lvA;
    }

    public void pm(boolean bl) {
        if (bl == this.lvA) {
            return;
        }
        this.lvA = bl;
        this.q(lvz, this.lvA);
        this.cGY();
    }

    public ipf cGJ() {
        return this.lvB;
    }

    public void a(ipf ipf2) {
        if (ipf2 == this.lvB) {
            return;
        }
        if (this.lvB != null) {
            this.lvB.removeFromParent();
        }
        this.lvB = ipf2;
        this.cGY();
    }

    public ipf cGK() {
        return this.lvC;
    }

    public void b(ipf ipf2) {
        if (ipf2 == this.lvC) {
            return;
        }
        if (this.lvC != null) {
            this.lvC.removeFromParent();
        }
        this.lvC = ipf2;
        this.cGY();
    }

    public ipf cGL() {
        return this.lvD;
    }

    public void c(ipf ipf2) {
        if (ipf2 == this.lvD) {
            return;
        }
        if (this.lvD != null) {
            this.lvD.removeFromParent();
        }
        this.lvD = ipf2;
        this.cGY();
    }

    public ipf cGM() {
        return this.lvE;
    }

    public void d(ipf ipf2) {
        if (ipf2 == this.lvE) {
            return;
        }
        if (this.lvE != null) {
            this.lvE.removeFromParent();
        }
        this.lvE = ipf2;
        this.cGY();
    }

    public jle cGN() {
        return this.lvJ;
    }

    public void a(jle jle2) {
        this.lvJ = jle2;
    }

    public jlf<lhe<hyn>> cGO() {
        return this.lvI;
    }

    public void a(jlf<lhe<hyn>> jlf2) {
        this.lvI = jlf2;
    }

    public jlf<lhe<hyn>> cGP() {
        return this.lvK;
    }

    public void b(jlf<lhe<hyn>> jlf2) {
        this.lvK = jlf2;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.cXE().a(irl.dnr());
        this.cXE().W(this.cGT());
        this.cXE().W(ipx.c(4, 4, 4, 4, this.cGU()));
        this.cXM().a(this.cGZ(), 0);
        this.cGY();
    }

    @Override
    protected void cGQ() {
        super.cGQ();
        this.pm(this.nk(lvz));
    }

    @Override
    protected void cGR() {
        if (this.lvJ != null) {
            this.lvJ.dwQ();
        }
    }

    @Override
    protected ios cGS() {
        return null;
    }

    @Override
    protected hyn dc(int n, int n2) {
        if (this.lvK == null) {
            return null;
        }
        lhe lhe2 = new lhe();
        this.lvK.T(lhe2);
        return (hyn)lhe2.rnu;
    }

    private ipf cGT() {
        return new iqa("/dfdata/texture/gui/j2f/media_player/media_player_bg.png", 8, 1, 8, 8, iqb.mtp);
    }

    private ipf cGU() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(this.cGV());
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(this.cGX());
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(this.cGW());
        return ipx2;
    }

    private ipf cGV() {
        this.lvF = ipx.d(new ipf[0]);
        return this.lvF;
    }

    private ipf cGW() {
        this.lvG = ipx.d(new ipf[0]);
        return this.lvG;
    }

    private ipf cGX() {
        return ipx.j(ipx.a(1, 2, new ipf[0]), ipx.c(new ipk(0x313131)), ipx.a(1, 2, new ipf[0]));
    }

    private void cGY() {
        if (this.lvF == null) {
            return;
        }
        if (this.lvB != null) {
            if (this.lvB.djJ() == null) {
                this.lvF.W(this.lvB);
            }
            this.lvB.setVisible(!this.lvA);
        }
        if (this.lvD != null) {
            if (this.lvD.djJ() == null) {
                this.lvG.W(this.lvD);
            }
            this.lvD.setVisible(!this.lvA);
        }
        if (this.lvC != null) {
            if (this.lvC.djJ() == null) {
                this.lvF.W(this.lvC);
            }
            this.lvC.setVisible(this.lvA);
        }
        if (this.lvE != null) {
            if (this.lvE.djJ() == null) {
                this.lvG.W(this.lvE);
            }
            this.lvE.setVisible(this.lvA);
        }
        this.lvH.hX(this.lvA);
        this.pack();
    }

    private ioo cGZ() {
        iwl iwl2 = new iwl(this){
            final /* synthetic */ hza lvL;
            {
                this.lvL = hza2;
            }

            public void pn(boolean bl) {
                this.lvL.pm(bl);
            }

            public hyn dd(int n, int n2) {
                if (hza.a(this.lvL) == null) {
                    return null;
                }
                lhe<T> lhe2 = new lhe<T>();
                hza.a(this.lvL).T(lhe2);
                return (hyn)lhe2.rnu;
            }
        };
        this.lvH = iwl2;
        iwl2.hX(this.lvA);
        return iwl2;
    }

    static /* synthetic */ jlf a(hza hza2) {
        return hza2.lvI;
    }
}

