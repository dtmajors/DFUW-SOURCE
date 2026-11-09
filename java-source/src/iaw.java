/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  iba
 */
import spenefett.hid.gui.serialization.dto.SFCharacterAppearanceOptionSelectionDTO;
import spenefett.hid.gui.serialization.dto.SFCharacterDTO;

public class iaw
extends iax {
    private lie lwo;

    public iaw(iba iba2) {
        super("CharacterCreatorAppearance", "CharacterCreatorAppearance.swf", iba2);
    }

    @Override
    protected void cBa() {
        super.cBa();
        this.a("setRandomizeButtonVisible", new Object[]{true});
        this.pC(true);
        this.a("setHeadSelectorVisible", new Object[]{true});
    }

    @Override
    public void cHn() {
        super.cHn();
        this.a("setRandomizeButtonVisible", new Object[]{true});
        this.pD(iba.lDE);
    }

    protected void cEc() {
        super.cEc();
        this.cEk();
    }

    @Override
    protected void b(int n, int n2, int n3, String string) {
        super.b(n, n2, n3, string);
        if (this.lDa != 0.0f) {
            this.lwn.ky(this.lDa);
        }
    }

    protected void a(int n, int n2, int n3, int n4, String string) {
        if (this.Pz(n)) {
            this.lwn.v(n3 > 0 ? -0.05f : 0.05f, 0.0f, 0.25f);
        }
    }

    private void cLu() {
        this.lwn.pA(false);
        SFCharacterDTO sFCharacterDTO = this.lwn.cLx();
        this.a("setContentData", new Object[]{sFCharacterDTO.appearance});
        this.a("setHeadSelectorLabel", new Object[]{lvq.sZy.bD(new Object[0]).exA()});
    }

    private void pA(boolean bl) {
        this.lwn.pA(bl);
        SFCharacterDTO sFCharacterDTO = this.lwn.cLx();
        this.a("setAppearanceData", new Object[]{sFCharacterDTO.appearance});
    }

    private void startTimer() {
        this.lwo = new lie(this, 1.0, false){
            final /* synthetic */ iaw lCT;
            {
                this.lCT = iaw2;
                super(d2, bl);
            }

            public void dh(double d2) {
                this.lCT.pB(true);
                this.lCT.pC(true);
            }
        };
        this.lwo.e(this.MessageDelegator);
    }

    @llk
    private void changeFeature(SFCharacterAppearanceOptionSelectionDTO sFCharacterAppearanceOptionSelectionDTO) {
        this.lwn.changeFeature(sFCharacterAppearanceOptionSelectionDTO);
    }

    @llk
    private void changeSkinColor(int n) {
        this.lwn.changeSkinColor(n);
    }

    @llk
    private void changeHairColor(int n) {
        this.lwn.changeHairColor(n);
    }

    @llk
    private void randomize() {
        this.pA(true);
        this.startTimer();
    }

    @llk
    private void europeanFeaturesButtonClicked() {
        this.lwn.cMa();
        this.cLu();
    }

    @llk
    private void asianFeaturesButtonClicked() {
        this.lwn.cMb();
        this.cLu();
    }

    @Override
    public iay.a cLv() {
        return iay.a.lDx;
    }

    @Override
    protected void cEk() {
        this.f(lvm.sXh.bD(this.lwn.cLA()).exA(), lvq.sYy.bD(new Object[0]).exA(), lvq.sYE.bD(new Object[0]).exA());
        this.cLu();
        int n = this.lwn.cMc();
        this.a("setSelectedHead", new Object[]{n});
    }
}

