/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFClanMemberListDTO;
import spenefett.hid.gui.serialization.dto.SFStringsClanMemberSelectorDTO;

public class idq
extends idw
implements hua {
    private ays[] lKG = null;
    private iec lKH = iec.lMb;
    private int lKK = -1;
    private lox lKL = null;

    public void d(lox lox2) {
        boolean bl = this.lKL != null;
        this.lKL = lox2;
        if (bl) {
            this.cOQ();
        }
    }

    public void e(lox lox2) {
        lLj.put("ClanMemberSelectorSelectAction", new lfs<lox, lox>(lyq.tIP, lox2 == null ? null : lox2));
    }

    public ays cOX() {
        return this.lKK >= 0 && this.lKK < this.lKG.length ? this.lKG[this.lKK] : null;
    }

    idq() {
        super("ClanMemberSelector", "clanmemberselector.swf", iee.lME);
    }

    public void c(ays[] aysArray) {
        SFClanMemberListDTO sFClanMemberListDTO = new SFClanMemberListDTO();
        sFClanMemberListDTO.members = lcn.emv();
        if (aysArray != null) {
            for (ays ays2 : aysArray) {
                sFClanMemberListDTO.members.add(ays2.abM());
            }
        }
        this.a("takeBlockSelectionMembers", new Object[]{sFClanMemberListDTO});
    }

    @Override
    public void oi() {
        if (this.lLk.cIj()) {
            this.lLk.pq(false);
        }
    }

    @Override
    public void cyA() {
        if (this.leq != null) {
            this.leq.a(this);
        }
    }

    @Override
    public void b(ays[] aysArray) {
        this.lKG = aysArray;
        SFClanMemberListDTO sFClanMemberListDTO = new SFClanMemberListDTO();
        sFClanMemberListDTO.members = lcn.emv();
        if (this.lKG != null) {
            for (ays ays2 : this.lKG) {
                sFClanMemberListDTO.members.add(ays2.abM());
            }
        }
        this.a("takeMemberList", new Object[]{sFClanMemberListDTO});
    }

    @Override
    protected void cON() {
        super.cON();
        if (this.isVisible()) {
            this.lLm.a(hyy.a.lrF, this);
            this.lLm.a(hyy.a.lrF, true);
            switch (this.lKH) {
                case lMb: 
                case lMc: {
                    this.lLm.a(hyy.b.ltS, this.lKH.cPf());
                    this.lLm.a(hyy.b.ltU, 0);
                    this.lLm.a(hyy.b.ltT, 0);
                    this.lLm.a(hyy.b.ltV, 0);
                    break;
                }
                case lMf: 
                case lMg: {
                    this.lLm.a(hyy.b.ltS, 0);
                    this.lLm.a(hyy.b.ltU, this.lKH.cPf());
                    this.lLm.a(hyy.b.ltT, 0);
                    this.lLm.a(hyy.b.ltV, 0);
                    break;
                }
                case lMd: 
                case lMe: {
                    this.lLm.a(hyy.b.ltS, 0);
                    this.lLm.a(hyy.b.ltU, 0);
                    this.lLm.a(hyy.b.ltT, this.lKH.cPf());
                    this.lLm.a(hyy.b.ltV, 0);
                    break;
                }
                case lMh: 
                case lMi: {
                    this.lLm.a(hyy.b.ltS, 0);
                    this.lLm.a(hyy.b.ltU, 0);
                    this.lLm.a(hyy.b.ltT, 0);
                    this.lLm.a(hyy.b.ltV, this.lKH.cPf());
                }
            }
            if (this.lLp != null) {
                this.lLm.a(new hyy.a[]{this.lLp, hyy.a.lrF}, this.cEF());
            }
        } else {
            this.lLm.a(hyy.a.lrF, false);
            this.lLm.b(hyy.a.lrF);
        }
    }

    @Override
    protected void c(hyy.b b2, int n) {
        switch (b2) {
            case ltR: {
                this.lLk.cIh();
                return;
            }
            case ltS: {
                if (this.lKH.a(iec.lMb)) {
                    this.lKH = this.lKH.cPg();
                    break;
                }
                this.lLm.a(hyy.b.ltU, 0);
                this.lLm.a(hyy.b.ltT, 0);
                this.lLm.a(hyy.b.ltV, 0);
                this.lKH = iec.lMb;
                break;
            }
            case ltU: {
                if (this.lKH.a(iec.lMf)) {
                    this.lKH = this.lKH.cPg();
                    break;
                }
                this.lLm.a(hyy.b.ltS, 0);
                this.lLm.a(hyy.b.ltT, 0);
                this.lLm.a(hyy.b.ltV, 0);
                this.lKH = iec.lMf;
                break;
            }
            case ltT: {
                if (this.lKH.a(iec.lMd)) {
                    this.lKH = this.lKH.cPg();
                    break;
                }
                this.lLm.a(hyy.b.ltS, 0);
                this.lLm.a(hyy.b.ltU, 0);
                this.lLm.a(hyy.b.ltV, 0);
                this.lKH = iec.lMd;
                break;
            }
            case ltV: {
                if (this.lKH.a(iec.lMh)) {
                    this.lKH = this.lKH.cPg();
                    break;
                }
                this.lLm.a(hyy.b.ltS, 0);
                this.lLm.a(hyy.b.ltU, 0);
                this.lLm.a(hyy.b.ltT, 0);
                this.lKH = iec.lMh;
                break;
            }
            default: {
                return;
            }
        }
        this.lLm.a(b2, this.lKH.cPf());
        this.a("setSortOrder", new Object[]{this.lKH.ordinal()});
    }

    @Override
    protected void cOO() {
        if (this.leq != null) {
            this.leq.a(this);
        }
        this.a("setSortOrder", new Object[]{this.lKH.ordinal()});
    }

    @Override
    protected void cOP() {
        this.a("setHeight", new Object[]{this.fc});
    }

    @Override
    public void zO() {
        super.zO();
        this.lKH = iec.lMb;
    }

    @Override
    protected void cOQ() {
        SFStringsClanMemberSelectorDTO sFStringsClanMemberSelectorDTO = new SFStringsClanMemberSelectorDTO();
        sFStringsClanMemberSelectorDTO.title = this.lKL == null ? lwi.tce.bD(new Object[0]).exA() : this.lKL.bD(new Object[0]).exA();
        sFStringsClanMemberSelectorDTO.memberNameHeader = lwi.teb.bD(new Object[0]).exA();
        sFStringsClanMemberSelectorDTO.killsHeader = lwi.tec.bD(new Object[0]).exA();
        sFStringsClanMemberSelectorDTO.clanPointsHeader = lwi.ted.bD(new Object[0]).exA();
        sFStringsClanMemberSelectorDTO.searchFilterDefaultText = lwi.tee.bD(new Object[0]).exA();
        this.a("takeStrings", new Object[]{sFStringsClanMemberSelectorDTO});
        if (this.lKL == null) {
            this.lKL = lwi.tce;
        }
    }

    @Override
    protected void cOR() {
        super.cOR();
        if (!lLj.containsKey("ClanMemberSelectorSelectAction")) {
            lLj.put("ClanMemberSelectorSelectAction", new lfs<lox, Object>(lyq.tIP, null));
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
    public void clanMemberSelected(int n) {
        this.lKK = n;
        this.lLk.cIh();
    }
}

