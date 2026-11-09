/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFClanMemberOverviewValuesDTO;
import spenefett.hid.gui.serialization.dto.SFClanMemberPermissionsUpdateDTO;
import spenefett.hid.gui.serialization.dto.SFStringsClanMemberOverviewDTO;

public class ido
extends idw
implements bto,
htt,
htu,
htw,
hty,
huh {
    private ays lKF = null;
    private double lKf = 0.0;

    public ays cOU() {
        return this.lKF;
    }

    public void e(ays ays2) {
        this.lKF = ays2;
    }

    ido() {
        super("ClanMemberOverview", "clanmemberoverview.swf", iee.lMB);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.lKF == null) {
            return;
        }
        if (!this.lKF.abI()) {
            return;
        }
        if (!this.leq.f(this.lKF)) {
            return;
        }
        this.lKf += ldz2.qwh;
        if (this.lKf >= 1.0) {
            this.lKf = 0.0;
            this.a("updateClanLeaveMessage", new Object[]{lwg.tdS.bD(this.cOV()).exA()});
        }
    }

    @Override
    protected void cON() {
        super.cON();
        if (this.lLk.cIi()) {
            if (this.isVisible()) {
                this.lLm.a(hyy.a.lrE, this);
                this.lLm.a(hyy.a.lrE, true);
                if (this.lLp != null) {
                    this.lLm.a(new hyy.a[]{this.lLp, hyy.a.lrE}, this.cEF());
                }
            } else {
                this.lLm.a(hyy.a.lrE, false);
                this.lLm.b(hyy.a.lrE);
                this.lLm.a(hyy.b.lts, 0);
            }
        } else {
            this.lLm.a(hyy.b.lts, this.isVisible() ? 1 : 0);
        }
    }

    @Override
    protected void c(hyy.b b2, int n) {
        switch (b2) {
            case ltP: {
                this.lLk.cIh();
                return;
            }
        }
    }

    @Override
    protected void cOO() {
        this.leq.a((htm)this);
        if (this.lKF == null) {
            return;
        }
        SFClanMemberOverviewValuesDTO sFClanMemberOverviewValuesDTO = new SFClanMemberOverviewValuesDTO();
        sFClanMemberOverviewValuesDTO.isPlayerMember = this.leq.f(this.lKF);
        sFClanMemberOverviewValuesDTO.memberName = this.lKF.getName();
        sFClanMemberOverviewValuesDTO.memberPlayerPoints = this.lKF.abF();
        sFClanMemberOverviewValuesDTO.memberClanPoints = this.lKF.abE();
        sFClanMemberOverviewValuesDTO.memberKills = this.lKF.abD();
        sFClanMemberOverviewValuesDTO.memberRank = this.lKF.abC().ordinal();
        sFClanMemberOverviewValuesDTO.memberPermissions = this.lKF.abG().akU();
        sFClanMemberOverviewValuesDTO.playerPermissions = this.leq.dNt().akU();
        sFClanMemberOverviewValuesDTO.isOnline = this.lKF.qf();
        sFClanMemberOverviewValuesDTO.isLeavingClan = this.lKF.abI();
        this.a("setMemberOverviewValues", new Object[]{sFClanMemberOverviewValuesDTO, this.lLs});
    }

    @Override
    protected void cOP() {
        this.a("setHeight", new Object[]{this.fc});
    }

    @Override
    public void cyA() {
        if (!this.isVisible()) {
            return;
        }
        if (!this.leq.sC(this.lKF.abB())) {
            this.lLk.cIh();
        }
    }

    @Override
    public void nA(String string) {
        this.lLn = false;
        this.a("leaveClanRequestSucceeded", new Object[]{string});
    }

    @Override
    public void nB(String string) {
        this.lLn = false;
        this.a("leaveClanRequestFailed", new Object[]{string});
    }

    @Override
    public void nC(String string) {
        this.lLn = false;
        this.a("cancelLeaveClanRequestSucceeded", new Object[]{string});
        this.a("updateLeaveClanMessage", new Object[]{lwg.tdS.bD(jng.itE.aaR()).exA()});
    }

    @Override
    public void nD(String string) {
        this.lLn = false;
        this.a("cancelLeaveClanRequestFailed", new Object[]{string});
    }

    @Override
    public void ny(String string) {
        this.lLn = false;
        this.a("kickClanMemberSucceeded", new Object[]{string});
    }

    @Override
    public void nz(String string) {
        this.lLn = false;
        this.a("kickClanMemberFailed", new Object[]{string});
    }

    @Override
    public void nE(String string) {
        this.lLn = false;
        this.a("memberPermissionsUpdateSucceeded", new Object[]{string});
    }

    @Override
    public void nF(String string) {
        this.lLn = false;
        this.a("memberPermissionsUpdateFailed", new Object[]{string});
    }

    @Override
    public void a(ays ays2, htw.a a2) {
        if (this.lKF.abB().equals(ays2.abB())) {
            this.lKF = ays2;
            SFClanMemberOverviewValuesDTO sFClanMemberOverviewValuesDTO = new SFClanMemberOverviewValuesDTO();
            sFClanMemberOverviewValuesDTO.isPlayerMember = this.leq.f(this.lKF);
            sFClanMemberOverviewValuesDTO.memberName = this.lKF.getName();
            sFClanMemberOverviewValuesDTO.memberPlayerPoints = this.lKF.abF();
            sFClanMemberOverviewValuesDTO.memberClanPoints = this.lKF.abE();
            sFClanMemberOverviewValuesDTO.memberKills = this.lKF.abD();
            sFClanMemberOverviewValuesDTO.memberRank = this.lKF.abC().ordinal();
            sFClanMemberOverviewValuesDTO.memberPermissions = this.lKF.abG().akU();
            sFClanMemberOverviewValuesDTO.playerPermissions = this.leq.dNt().akU();
            sFClanMemberOverviewValuesDTO.isOnline = this.lKF.qf();
            sFClanMemberOverviewValuesDTO.isLeavingClan = this.lKF.abI();
            this.a("setMemberOverviewValues", new Object[]{sFClanMemberOverviewValuesDTO, Boolean.FALSE});
        }
    }

    @Override
    public void oi() {
        if (!this.isVisible()) {
            return;
        }
        this.lLk.pq(false);
    }

    private double cOV() {
        double d2 = 60.0;
        if (this.lKF != null) {
            if (this.lKF.abI()) {
                d2 = jng.itE.aaR() - (double)(this.MessageDelegator.bzy().getTimeInMillis() - this.lKF.abH()) / 1000.0;
            }
            if (d2 < 0.0) {
                d2 = 0.0;
            }
        }
        return d2;
    }

    @Override
    protected void cOQ() {
        SFStringsClanMemberOverviewDTO sFStringsClanMemberOverviewDTO = new SFStringsClanMemberOverviewDTO();
        sFStringsClanMemberOverviewDTO.titleClanMember = lwg.tdK.bD(new Object[0]).exA();
        sFStringsClanMemberOverviewDTO.titlePlayerMember = lwg.tdL.bD(new Object[0]).exA();
        sFStringsClanMemberOverviewDTO.playerPointsTitle = lwg.tdM.bD(new Object[0]).exA();
        sFStringsClanMemberOverviewDTO.clanPointsTitle = lwg.tdN.bD(new Object[0]).exA();
        sFStringsClanMemberOverviewDTO.killsTitle = lwg.tdO.bD(new Object[0]).exA();
        sFStringsClanMemberOverviewDTO.permissionsTitle = lwg.tdP.bD(new Object[0]).exA();
        sFStringsClanMemberOverviewDTO.permissionCategoryNames = bbz.getCategoryNames();
        sFStringsClanMemberOverviewDTO.permissionNames = bca.getPermissionNames();
        sFStringsClanMemberOverviewDTO.leaveClanButtonAction = lwg.tdQ.bD(new Object[0]).exA();
        sFStringsClanMemberOverviewDTO.leaveClanMessage = lwg.tdR.bD(jng.itE.aaR()).exA();
        sFStringsClanMemberOverviewDTO.leavingClanButtonAction = lwg.tdS.bD(this.cOV()).exA();
        sFStringsClanMemberOverviewDTO.leavingClanMessage = lwg.tdT.bD(new Object[0]).exA();
        sFStringsClanMemberOverviewDTO.savePermissionsButtonAction = lwg.tdU.bD(new Object[0]).exA();
        sFStringsClanMemberOverviewDTO.savingPermissionsButtonAction = lwg.tdV.bD(new Object[0]).exA();
        sFStringsClanMemberOverviewDTO.kickPlayerButtonAction = lwg.tdW.bD(new Object[0]).exA();
        sFStringsClanMemberOverviewDTO.kickingPlayerButtonAction = lwg.tdX.bD(new Object[0]).exA();
        sFStringsClanMemberOverviewDTO.banPlayerButtonAction = lwg.tdY.bD(new Object[0]).exA();
        sFStringsClanMemberOverviewDTO.banningPlayerButtonAction = lwg.tdZ.bD(new Object[0]).exA();
        this.a("takeStrings", new Object[]{sFStringsClanMemberOverviewDTO});
    }

    @Override
    protected void cOR() {
        super.cOR();
        if (!lLj.containsKey("ClanMemberOverviewKickMember")) {
            lLj.put("ClanMemberOverviewKickMember", new lfs<lox, lox>(lyo.tIF, lyo.tIG));
            lLj.put("ClanMemberOverviewBanMember", new lfs<lox, lox>(lyo.tIH, lyo.tII));
        }
    }

    @Override
    protected loz a(String string, lox lox2) {
        if (lox2 == null) {
            return super.a(string, lox2);
        }
        if (string.startsWith("OnlineIndicatorOffline")) {
            String string2 = string.substring(string.indexOf(":") + 1);
            ays ays2 = this.leq.sN(string2);
            if (ays2 == null) {
                return super.a(string, lox2);
            }
            return lyn.tHt.bD(this.ao(ays2.B(this.MessageDelegator.arc())));
        }
        return super.a(string, lox2);
    }

    @llk
    public void updatePermissions(SFClanMemberPermissionsUpdateDTO sFClanMemberPermissionsUpdateDTO) {
        this.lLn = true;
        bcb bcb2 = new bcb();
        for (Integer object : sFClanMemberPermissionsUpdateDTO.assignedPermissions) {
            bca bca2 = bca.getPermissionByID(object);
            if (bca2 == null) continue;
            bcb2.e(bca2);
        }
        bcb bcb3 = new bcb();
        for (Integer n : sFClanMemberPermissionsUpdateDTO.removedPermissions) {
            bca bca3 = bca.getPermissionByID(n);
            if (bca3 == null) continue;
            bcb3.e(bca3);
        }
        this.leq.a(this.lKF.abB(), bcb2, bcb3, this);
    }

    @llk
    public void leaveClan() {
        this.lLn = true;
        this.leq.a(this);
    }

    @llk
    public void cancelLeaveClan() {
        this.lLn = true;
        this.leq.b(this);
    }

    @llk
    public void kickMember(boolean bl) {
        this.lLn = true;
        this.leq.a(this.lKF.abB(), bl, this);
    }

    @llk
    public void openChatWhisper() {
        if (this.leq.f(this.lKF)) {
            return;
        }
        ido.cyJ().oh(this.lKF.getName());
    }
}

