/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFClanInformationListDTO;
import spenefett.hid.gui.serialization.dto.SFStringsClanBrowserDTO;

public class idg
extends idw
implements htv,
huh,
hul {
    private ayq[] lJT = null;
    private SFClanInformationListDTO lJU = null;
    private ieb lJV = ieb.lLW;

    idg() {
        super("ClanBrowser", "ClanBrowser.swf", iee.lMv);
    }

    @Override
    public void b(ayq[] ayqArray) {
        this.lJT = ayqArray;
        this.lJU = new SFClanInformationListDTO();
        this.lJU.playerRaceIndex = cg.s(hso.cxK().bAn().Za);
        this.lJU.clanInformationList = lcn.emv();
        for (int j = 0; j < this.lJT.length; ++j) {
            this.lJU.clanInformationList.add(this.lJT[j].a(this.leq.u(this.lJT[j]), hso.cxK().bAn().Tr));
        }
        this.a("takeClanList", new Object[]{this.lJU});
    }

    @Override
    public void rc(ldv ldv2) {
        this.leq.a(this);
    }

    @Override
    public void rd(ldv ldv2) {
        this.leq.a(this);
    }

    @Override
    public void oi() {
        this.cON();
    }

    @Override
    protected void cON() {
        super.cON();
        if (this.isVisible()) {
            this.lLm.a(hyy.a.lrB, this);
            this.lLm.a(hyy.a.lrB, true);
            switch (this.lJV) {
                case lLW: 
                case lLX: {
                    this.lLm.a(hyy.b.ltE, this.lJV.cPf());
                    this.lLm.a(hyy.b.ltF, 0);
                    break;
                }
                case lLY: 
                case lLZ: {
                    this.lLm.a(hyy.b.ltE, 0);
                    this.lLm.a(hyy.b.ltF, this.lJV.cPf());
                }
            }
            if (this.lLp != null) {
                this.lLm.a(new hyy.a[]{this.lLp, hyy.a.lrB}, this.cEF());
            }
        } else {
            this.lLm.a(hyy.a.lrB, false);
            this.lLm.b(hyy.a.lrB);
        }
        this.lLm.a(this.leq.dNh() ? hyy.b.ltz : hyy.b.lto, this.isVisible() ? 1 : 0);
    }

    @Override
    protected void c(hyy.b b2, int n) {
        switch (b2) {
            case ltD: {
                this.leq.a(this);
                return;
            }
            case ltE: {
                if (this.lJV.a(ieb.lLW)) {
                    this.lJV = this.lJV.cPe();
                    break;
                }
                this.lLm.a(hyy.b.ltF, 0);
                this.lJV = ieb.lLW;
                break;
            }
            case ltF: {
                if (this.lJV.a(ieb.lLY)) {
                    this.lJV = this.lJV.cPe();
                    break;
                }
                this.lLm.a(hyy.b.ltE, 0);
                this.lJV = ieb.lLY;
                break;
            }
            default: {
                return;
            }
        }
        this.lLm.a(b2, this.lJV.cPf());
        this.a("setSortOrder", new Object[]{this.lJV.ordinal()});
    }

    @Override
    protected void cOO() {
        if (this.leq != null) {
            this.leq.a(this);
        }
        this.a("setSortOrder", new Object[]{this.lJV.ordinal()});
        this.lLs = false;
    }

    @Override
    protected void cOP() {
        this.a("setHeight", new Object[]{this.fc});
    }

    @Override
    public void zO() {
        super.zO();
        this.lJV = ieb.lLW;
        this.a("scrollListToTop", new Object[0]);
    }

    @Override
    protected void cOQ() {
        SFStringsClanBrowserDTO sFStringsClanBrowserDTO = new SFStringsClanBrowserDTO();
        sFStringsClanBrowserDTO.pageTitle = lvy.tce.bD(new Object[0]).exA();
        sFStringsClanBrowserDTO.clanNameHeader = lvy.tcf.bD(new Object[0]).exA();
        sFStringsClanBrowserDTO.clanSizeHeader = lvy.tcg.bD(new Object[0]).exA();
        sFStringsClanBrowserDTO.filtersTitle = lvy.tch.bD(new Object[0]).exA();
        sFStringsClanBrowserDTO.recruitingFilterText = lvy.tci.bD(new Object[0]).exA();
        sFStringsClanBrowserDTO.textFilterDefaultText = lvy.tcj.bD(new Object[0]).exA();
        this.a("takeStrings", new Object[]{sFStringsClanBrowserDTO});
    }

    @Override
    protected void cOR() {
        super.cOR();
        if (!lLj.containsKey("ClanBrowserClanInformation")) {
            lLj.put("ClanBrowserClanInformation", new lfs<lox, lox>(lyl.tGb, lyl.tGc));
            lLj.put("ClanBrowserStanceToPlayerKOS", new lfs<lox, lox>(lyl.tGd, lyl.tGe));
            lLj.put("ClanBrowserStanceToPlayerBanned", new lfs<lox, lox>(lyl.tGf, lyl.tGg));
            lLj.put("ClanBrowserStanceToPlayerBind", new lfs<lox, lox>(lyl.tGh, lyl.tGi));
            lLj.put("ClanBrowserRecruitingFilter", new lfs<lox, lox>(lyl.tGj, lyl.tGk));
        }
    }

    @llk
    public void showClanOverview(int n) {
        if (this.lJT == null || n < 0 || n >= this.lJT.length || this.lJT[n] == null) {
            return;
        }
        idr idr2 = (idr)idx.a(iee.lMw);
        idr2.t(this.lJT[n]);
        this.lLk.a(iee.lMw, true);
    }

    @llk
    public void fetchClanList() {
        if (this.leq != null) {
            this.leq.a(this);
        }
    }
}

