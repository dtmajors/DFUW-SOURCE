/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import spenefett.hid.gui.serialization.dto.SFClanCreationValuesDTO;
import spenefett.hid.gui.serialization.dto.SFStringsClanCreatorDTO;

public class idn
extends idw
implements htk {
    idn() {
        super("ClanCreator", "ClanCreator.swf", iee.lMu);
    }

    @Override
    public void ns(String string) {
        this.lLn = false;
        this.a("clanCreationSucceeded", new Object[]{string});
    }

    @Override
    public void nt(String string) {
        this.lLn = false;
        this.a("clanCreationFailed", new Object[]{string});
    }

    @Override
    protected void cON() {
        super.cON();
        this.lLm.a(hyy.b.ltn, this.isVisible() ? 1 : 0);
    }

    @Override
    protected void cOO() {
        if (hso.cxK() != null && hso.cxK().cxP() != null) {
            this.a("setPlayerRace", new Object[]{cg.s(hso.cxK().bAn().Za)});
        }
        this.a("setInputBounds", new Object[]{3, ayi.aaK(), 0, 100, 0, 200});
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
            this.a("setTrialAccount", new Object[]{hso.cxK().cxP().cyZ().kv()});
        }
    }

    @Override
    protected void cOP() {
        this.a("setHeight", new Object[]{this.fc});
    }

    @Override
    @llk
    public void closeWindow() {
        if (this.leq.dNh()) {
            idr idr2 = (idr)idx.a(iee.lMw);
            idr2.t(this.leq.dNi());
            this.lLk.a(iee.lMw, false);
        } else if (!this.lLn) {
            this.lLk.pq(false);
        }
    }

    @Override
    protected void cOQ() {
        SFStringsClanCreatorDTO sFStringsClanCreatorDTO = new SFStringsClanCreatorDTO();
        sFStringsClanCreatorDTO.title = lwf.tce.bD(new Object[0]).exA();
        sFStringsClanCreatorDTO.instructions = lwf.tdE.bD(2000, cug.fkb).exA();
        sFStringsClanCreatorDTO.clanNameTitle = lwf.tcY.bD(ayi.aaK()).exA();
        sFStringsClanCreatorDTO.defaultClanNameText = lwf.tdF.bD(new Object[0]).exA();
        sFStringsClanCreatorDTO.clanMottoTitle = lwf.tcZ.bD(100).exA();
        sFStringsClanCreatorDTO.defaultClanMottoText = lwf.tdk.bD(new Object[0]).exA();
        sFStringsClanCreatorDTO.clanCharterTitle = lwf.tda.bD(200).exA();
        sFStringsClanCreatorDTO.defaultClanCharterText = lwf.tdl.bD(new Object[0]).exA();
        sFStringsClanCreatorDTO.membershipRestrictionsTitle = lwf.tdb.bD(new Object[0]).exA();
        sFStringsClanCreatorDTO.membershipRestrictionsInfo = lwf.tdc.bD(new Object[0]).exA();
        sFStringsClanCreatorDTO.humanRaceName = lvm.sXh.bD(3).exA();
        sFStringsClanCreatorDTO.mirdainRaceName = lvm.sXh.bD(5).exA();
        sFStringsClanCreatorDTO.dwarfRaceName = lvm.sXh.bD(2).exA();
        sFStringsClanCreatorDTO.orkRaceName = lvm.sXh.bD(6).exA();
        sFStringsClanCreatorDTO.alfarRaceName = lvm.sXh.bD(1).exA();
        sFStringsClanCreatorDTO.mahirimRaceName = lvm.sXh.bD(4).exA();
        sFStringsClanCreatorDTO.acceptingNewMembers = lwf.tdd.bD(new Object[0]).exA();
        sFStringsClanCreatorDTO.clanTagsTitle = lwf.tde.bD(new Object[0]).exA();
        sFStringsClanCreatorDTO.clanTagsInfo = lwf.tdf.bD(new Object[0]).exA();
        sFStringsClanCreatorDTO.createClanText = lwf.tdG.bD(new Object[0]).exA();
        sFStringsClanCreatorDTO.creatingClanText = lwf.tdH.bD(new Object[0]).exA();
        sFStringsClanCreatorDTO.clanTags = ayw.getGUIValues();
        sFStringsClanCreatorDTO.trialAccountRestriction = lwf.tdI.bD(new Object[0]).exA();
        this.a("takeStrings", new Object[]{sFStringsClanCreatorDTO});
    }

    @llk
    public void beginClanCreation(SFClanCreationValuesDTO sFClanCreationValuesDTO) {
        this.lLn = true;
        this.leq.a(this, sFClanCreationValuesDTO);
    }
}

