/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  iba
 *  lcw
 */
import java.util.List;
import java.util.Locale;
import spenefett.hid.gui.serialization.dto.SFCharacterAppearanceOptionSelectionDTO;
import spenefett.hid.gui.serialization.dto.SFCharacterRaceDTO;
import spenefett.hid.gui.serialization.dto.SFCharacterRaceListDTO;

public class ibc
extends iax {
    private static final boolean lEe = true;
    private cg.b lEf = cg.b.hc;
    private cg.b lEg = cg.b.hc;
    private SFCharacterRaceListDTO lEh = new SFCharacterRaceListDTO();
    private int lEi = -1;

    public ibc(iba iba2) {
        super("CharacterCreatorRace", "CharacterCreatorRace.swf", iba2);
    }

    @Override
    protected void cBa() {
        super.cBa();
        if (lcw.bcB == 2) {
            this.lEf = cg.b.Find(this.lwn.cLF());
            if (this.lEf != cg.b.hc) {
                this.a("setSelectedNationality", new Object[]{this.lEf.aF()});
            }
        }
    }

    @llk
    private void quickstart() {
        this.lwn.quickstart();
    }

    @llk
    public void setSelectedNationality(String string) {
        this.lEf = cg.b.Find(string);
        this.lwn.PB(this.lEf.aE());
        this.cMk();
        List<Locale> list = lpd.rHs.exJ();
        block4: for (int j = 0; j < list.size(); ++j) {
            switch (this.lEf) {
                case he: {
                    if (!list.get(j).getLanguage().startsWith("ko")) continue block4;
                    lpd.rHs.adW(j);
                    return;
                }
                case hd: {
                    if (!list.get(j).getLanguage().startsWith("ja")) continue block4;
                    lpd.rHs.adW(j);
                    return;
                }
                default: {
                    if (!list.get(j).getLanguage().startsWith("en")) continue block4;
                    lpd.rHs.adW(j);
                    return;
                }
            }
        }
    }

    @llk
    private void setSelectedRaceAndGender(String string, int n) {
        SFCharacterRaceDTO sFCharacterRaceDTO;
        if (string == null || string.length() == 0) {
            return;
        }
        for (int j = 0; j < this.lEh.list.size(); ++j) {
            if (!string.equals(this.lEh.list.get((int)j).name)) continue;
            this.lEi = j;
            break;
        }
        this.lwn.dw((sFCharacterRaceDTO = this.cMn()) != null ? cg.A(sFCharacterRaceDTO.name) : -1, n + 1);
    }

    private void cMk() {
        boolean bl = true;
        if (lcw.bcB == 2) {
            bl = this.lEf != cg.b.hc;
        }
        this.a("setNextButtonVisible", new Object[]{bl});
    }

    protected void cEc() {
        super.cEc();
        this.cMk();
    }

    private void cMl() {
        List<String> list = cg.aB();
        this.lEh.list.clear();
        for (int j = 0; j < list.size(); ++j) {
            this.lEh.list.add(this.b(list.get(j), lvm.sXh.bD(list.get(j)).exA(), lvm.sXj.bD(list.get(j)).exA(), "texture/gui/runtime/character_creator/banner_" + list.get(j) + ".png"));
        }
    }

    private void cMm() {
        this.a("setContentData", new Object[]{this.lEh});
    }

    private SFCharacterRaceDTO cMn() {
        if (this.lEi >= 0 && this.lEi < this.lEh.list.size()) {
            return this.lEh.list.get(this.lEi);
        }
        return null;
    }

    private SFCharacterRaceDTO b(String string, String string2, String string3, String string4) {
        SFCharacterRaceDTO sFCharacterRaceDTO = new SFCharacterRaceDTO();
        sFCharacterRaceDTO.name = string;
        sFCharacterRaceDTO.title = string2;
        sFCharacterRaceDTO.description = string3;
        sFCharacterRaceDTO.iconName = string4;
        sFCharacterRaceDTO.sex = new SFCharacterAppearanceOptionSelectionDTO();
        sFCharacterRaceDTO.sex.text = lvq.sYK.bD(new Object[0]).exA();
        sFCharacterRaceDTO.sex.value = 0;
        sFCharacterRaceDTO.sex.availableChoices = 0;
        return sFCharacterRaceDTO;
    }

    @Override
    public iay.a cLv() {
        return iay.a.lDv;
    }

    @Override
    protected void cEk() {
        this.cMl();
        this.cMm();
        switch (lcw.bcB) {
            case 1: {
                this.f(lvq.sYC.bD(new Object[0]).exA(), lvq.sYw.bD(new Object[0]).exA(), lvq.sYD.bD(new Object[0]).exA());
                break;
            }
            case 2: {
                this.f(lvq.sYF.bD(new Object[0]).exA(), lvq.sYx.bD(new Object[0]).exA(), lvq.sYG.bD(new Object[0]).exA());
            }
        }
        this.a("setTextSelectNationality", new Object[]{lvq.sZv.bD(new Object[0]).exA()});
        this.a("setTextSelectNationalityDescription", new Object[]{lvq.sZt.bD(new Object[0]).exA() + "\n" + lvq.sZu.bD(new Object[0]).exA()});
        for (cg.b b2 : cg.b.values()) {
            if (b2 == cg.b.hc) continue;
            this.a("setNationalityName", new Object[]{b2.aF(), b2.aG().bD(new Object[0]).exA()});
        }
    }
}

