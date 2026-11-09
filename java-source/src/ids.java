/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFClanRecruitListDTO;
import spenefett.hid.gui.serialization.dto.SFClanRecruitsUpdateDTO;
import spenefett.hid.gui.serialization.dto.SFStringsClanRecruitsDTO;

public class ids
extends idw
implements hsz,
htx,
huo {
    private bbo[] cAG = null;
    private ied lKR = ied.lMm;

    ids() {
        super("ClanRecruits", "clanrecruits.swf", iee.lMw);
    }

    @Override
    public void oi() {
        if (this.lLk.cIj()) {
            this.lLk.pq(false);
        }
    }

    @Override
    public void cyA() {
    }

    @Override
    public void b(bbo[] bboArray) {
        this.cAG = bboArray;
        SFClanRecruitListDTO sFClanRecruitListDTO = new SFClanRecruitListDTO();
        sFClanRecruitListDTO.recruits = lcn.emv();
        sFClanRecruitListDTO.playerCanEdit = this.leq.i(bca.cTR);
        if (this.cAG != null) {
            for (bbo bbo2 : this.cAG) {
                sFClanRecruitListDTO.recruits.add(bbo2.akk());
            }
        }
        this.a("takeRecruitsList", new Object[]{sFClanRecruitListDTO});
    }

    @Override
    public void nO(String string) {
        this.lLn = false;
        this.a("updateRecruitsSucceeded", new Object[]{string});
    }

    @Override
    public void nP(String string) {
        this.lLn = false;
        this.a("updateRecruitsFailed", new Object[]{string});
    }

    @Override
    public void cyy() {
        SFClanRecruitListDTO sFClanRecruitListDTO = new SFClanRecruitListDTO();
        sFClanRecruitListDTO.recruits = lcn.emv();
        sFClanRecruitListDTO.playerCanEdit = this.leq.i(bca.cTR);
        if (this.cAG != null) {
            for (bbo bbo2 : this.cAG) {
                sFClanRecruitListDTO.recruits.add(bbo2.akk());
            }
        }
        this.a("takeRecruitsList", new Object[]{sFClanRecruitListDTO});
    }

    @Override
    protected void cON() {
        super.cON();
        if (this.isVisible()) {
            this.lLm.a(hyy.a.lrG, this);
            this.lLm.a(hyy.a.lrG, true);
            switch (this.lKR) {
                case lMm: 
                case lMn: {
                    this.lLm.a(hyy.b.ltX, this.lKR.cPf());
                    this.lLm.a(hyy.b.ltY, 0);
                    this.lLm.a(hyy.b.ltZ, 0);
                    break;
                }
                case lMo: 
                case lMp: {
                    this.lLm.a(hyy.b.ltX, 0);
                    this.lLm.a(hyy.b.ltY, this.lKR.cPf());
                    this.lLm.a(hyy.b.ltZ, 0);
                    break;
                }
                case lMq: 
                case lMr: {
                    this.lLm.a(hyy.b.ltX, 0);
                    this.lLm.a(hyy.b.ltY, 0);
                    this.lLm.a(hyy.b.ltZ, this.lKR.cPf());
                }
            }
            if (this.lLp != null) {
                this.lLm.a(new hyy.a[]{this.lLp, hyy.a.lrG}, this.cEF());
            }
        } else {
            this.lLm.a(hyy.a.lrG, false);
            this.lLm.b(hyy.a.lrG);
        }
        this.lLm.a(hyy.b.ltw, this.isVisible() ? 1 : 0);
    }

    @Override
    protected void c(hyy.b b2, int n) {
        switch (b2) {
            case ltX: {
                if (this.lKR.a(ied.lMm)) {
                    this.lKR = this.lKR.cPh();
                    break;
                }
                this.lLm.a(hyy.b.ltY, 0);
                this.lLm.a(hyy.b.ltZ, 0);
                this.lKR = ied.lMm;
                break;
            }
            case ltY: {
                if (this.lKR.a(ied.lMo)) {
                    this.lKR = this.lKR.cPh();
                    break;
                }
                this.lLm.a(hyy.b.ltX, 0);
                this.lLm.a(hyy.b.ltZ, 0);
                this.lKR = ied.lMo;
                break;
            }
            case ltZ: {
                if (this.lKR.a(ied.lMq)) {
                    this.lKR = this.lKR.cPh();
                    break;
                }
                this.lLm.a(hyy.b.ltX, 0);
                this.lLm.a(hyy.b.ltY, 0);
                this.lKR = ied.lMq;
                break;
            }
            default: {
                return;
            }
        }
        this.lLm.a(b2, this.lKR.cPf());
        this.a("setSortOrder", new Object[]{this.lKR.ordinal()});
    }

    @Override
    protected void cOO() {
        this.leq.a(this);
        this.a("setSortOrder", new Object[]{this.lKR.ordinal()});
        this.lLs = false;
    }

    @Override
    protected void cOP() {
        this.a("setHeight", new Object[]{this.fc});
    }

    @Override
    public void zO() {
        super.zO();
        this.lKR = ied.lMm;
    }

    @Override
    protected void cOQ() {
        SFStringsClanRecruitsDTO sFStringsClanRecruitsDTO = new SFStringsClanRecruitsDTO();
        sFStringsClanRecruitsDTO.title = lwn.tce.bD(new Object[0]).exA();
        sFStringsClanRecruitsDTO.playerNameHeader = lwn.tfk.bD(new Object[0]).exA();
        sFStringsClanRecruitsDTO.raceHeader = lwn.tfv.bD(new Object[0]).exA();
        sFStringsClanRecruitsDTO.playerPointsHeader = lwn.tfw.bD(new Object[0]).exA();
        sFStringsClanRecruitsDTO.searchFilterDefaultText = lwn.tee.bD(new Object[0]).exA();
        sFStringsClanRecruitsDTO.updateClanRecruitsText = lwn.tfx.bD(new Object[0]).exA();
        sFStringsClanRecruitsDTO.updatingClanRecruitsText = lwn.tfy.bD(new Object[0]).exA();
        this.a("takeStrings", new Object[]{sFStringsClanRecruitsDTO});
    }

    @Override
    protected void cOR() {
        super.cOR();
        if (!lLj.containsKey("ClanRecruitsAccept")) {
            lLj.put("ClanRecruitsAccept", new lfs<lox, lox>(lys.tJe, lys.tJf));
            lLj.put("ClanRecruitsReject", new lfs<lox, lox>(lys.tJg, lys.tJh));
        }
    }

    @llk
    public void updateClanRecruits(SFClanRecruitsUpdateDTO sFClanRecruitsUpdateDTO) {
        this.lLn = true;
        bbo[] bboArray = new bbo[sFClanRecruitsUpdateDTO.acceptedRecruits.size()];
        bbo[] bboArray2 = new bbo[sFClanRecruitsUpdateDTO.rejectedRecruits.size()];
        int n = 0;
        for (Integer n2 : sFClanRecruitsUpdateDTO.acceptedRecruits) {
            bboArray[n++] = this.cAG[n2];
        }
        n = 0;
        for (Integer n2 : sFClanRecruitsUpdateDTO.rejectedRecruits) {
            bboArray2[n++] = this.cAG[n2];
        }
        this.leq.a(bboArray, bboArray2, this);
    }
}

