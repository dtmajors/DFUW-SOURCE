/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  iba
 *  lcr
 *  lcw
 */
public class ibb
extends iax {
    public ibb(iba iba2) {
        super("CharacterCreatorName", "CharacterCreatorName.swf", iba2);
    }

    @Override
    protected void cBa() {
        super.cBa();
        this.a("setNextButtonVisible", new Object[]{false});
        this.setCharacterCreationEnabled(false);
    }

    protected void cEc() {
        super.cEc();
        if (this.cEU()) {
            String string = lcw.aQH() ? "" : lvm.sXc.bD(this.lwn.cLL()).exA();
            this.f(lvm.sXh.bD(this.lwn.cLA()) + " - " + string, lvq.sYB.bD(new Object[0]).exA(), lvq.sYJ.bD(new Object[0]).exA());
            this.setCharacterCreationEnabled(false);
            if (!lhn.isEmpty(this.lwn.cAt()) && !lhn.isEmpty(this.lwn.cAu())) {
                this.requestCharacter(this.lwn.cAt(), this.lwn.cAu(), false);
            }
        }
    }

    public void cMh() {
        this.cFc();
        this.a("setFirstNameFocus", new Object[0]);
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
            this.lwn.v(n3 > 0 ? -0.05f : 0.05f, -0.5f, 0.5f);
        }
    }

    @Override
    public hyn s(int n, int n2, String string) {
        if (string == null) {
            return null;
        }
        hyn hyn2 = super.s(n, n2, string);
        if (hyn2 != null) {
            return hyn2;
        }
        String[] stringArray = string.split(";");
        if (stringArray.length < 7 || stringArray[0] == null) {
            return null;
        }
        String string2 = null;
        if (stringArray[0].equals("firstNameQuestionMarkIcon")) {
            string2 = "<font size='12'>" + lyi.tEO.bD(new Object[0]).exA() + "</font>";
        } else if (stringArray[0].equals("lastNameQuestionMarkIcon")) {
            string2 = "<font size='12'>" + lyi.tEP.bD(new Object[0]).exA() + "</font>";
        } else if (stringArray[0].equals("firstNameRandomizeButton")) {
            string2 = "<font size='12'>" + lyi.tEM.bD(new Object[0]).exA() + "</font>";
        } else if (stringArray[0].equals("lastNameRandomizeButton")) {
            string2 = "<font size='12'>" + lyi.tEN.bD(new Object[0]).exA() + "</font>";
        }
        if (string2 != null) {
            float f = Float.valueOf(stringArray[5]).floatValue();
            float f2 = Float.valueOf(stringArray[6]).floatValue();
            iae iae2 = new iae(iae.a(string2, null, 0, 0, 0, 0, new String[0]), n - (int)f, n2 - (int)(f2 += (float)n2 >= ibb.cxO().cHk().H / 2.0f ? -55.0f : 55.0f));
            return iae2;
        }
        return null;
    }

    @llk
    private void randomizeFirstName() {
        this.setCharacterCreationEnabled(false);
        this.P(this.lwn.cLP());
    }

    @llk
    private void randomizeLastName() {
        this.setCharacterCreationEnabled(false);
        this.Q(this.lwn.cLQ());
    }

    @llk
    private void requestCharacter(String string, String string2, boolean bl) {
        if (!this.lwn.cLO()) {
            this.P(string);
            this.Q(string2);
            cu.b b2 = this.cMi();
            if (b2 == cu.b.kX) {
                if (lcw.enb()) {
                    this.d(true, lvq.sZl.bD(new Object[0]).exA());
                } else {
                    this.cMj();
                }
            } else {
                this.d(false, this.b(b2));
            }
        } else if (this.lwn.cAt().equals(string) && this.lwn.cAu().equals(string2)) {
            if (bl) {
                this.lwn.mC();
            }
        } else {
            this.setCharacterCreationEnabled(false);
        }
    }

    @llk
    private void setCharacterCreationEnabled(boolean bl) {
        this.lwn.setCharacterCreationEnabled(bl);
        this.a("setCharacterCreationEnabled", new Object[]{bl});
    }

    private void d(boolean bl, String string) {
        this.lwn.setCharacterCreationEnabled(bl);
        this.a("setCharacterCreationEnabled", new Object[]{bl, string});
    }

    private void P(String string) {
        string = this.oV(string);
        this.lwn.oQ(string);
        this.a("setFirstName", new Object[]{string});
    }

    private void Q(String string) {
        string = this.oV(string);
        this.lwn.oR(string);
        this.a("setLastName", new Object[]{string});
    }

    private String oV(String string) {
        if (string == null) {
            return "";
        }
        if ((string = string.trim()).length() <= 1) {
            return string;
        }
        if (lcw.emW()) {
            return string;
        }
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    private cu.b cMi() {
        return cu.a(this.lwn.cAt(), this.lwn.cAu(), lcw.SC, null);
    }

    private String b(cu.b b2) {
        switch (b2) {
            case kX: {
                return lvq.sZl.bD(new Object[0]).exA();
            }
            case kY: {
                return lvq.sZn.bD(new Object[0]).exA();
            }
            case kZ: {
                return lvq.sZo.bD(new Object[0]).exA();
            }
            case la: {
                return lvq.sZn.bD(new Object[0]).exA();
            }
            case lb: {
                return lvq.sZo.bD(new Object[0]).exA();
            }
            case lc: {
                return lvq.sZm.bD(new Object[0]).exA();
            }
            case ld: {
                return lvq.sZm.bD(new Object[0]).exA();
            }
            case le: {
                return lvq.sZm.bD(new Object[0]).exA();
            }
            case lf: {
                return lvq.sZm.bD(new Object[0]).exA();
            }
            case lg: {
                return lvq.sZm.bD(new Object[0]).exA();
            }
            case lh: {
                return lvq.sZm.bD(new Object[0]).exA();
            }
            case li: {
                return lvq.sZp.bD(new Object[0]).exA();
            }
            case lj: {
                return lvq.sZp.bD(new Object[0]).exA();
            }
            case lk: {
                return lvq.sZr.bD(new Object[0]).exA();
            }
            case ll: {
                return lvq.sZs.bD(new Object[0]).exA();
            }
        }
        assert (false);
        return null;
    }

    private void cMj() {
        efs efs2 = (efs)this.MessageDelegator.h(14343, this.GUID, lcr.hac);
        efs2.ioN = this.lwn.cAt();
        efs2.ioO = this.lwn.cAu();
        this.MessageDelegator.E(efs2);
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 14344: {
                this.a((eft)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eft eft2) {
        if (!this.cEU()) {
            return;
        }
        if (eft2.bGu() == cu.b.kX) {
            this.d(true, lvq.sZl.bD(new Object[0]).exA());
        } else {
            this.d(false, this.b(eft2.bGu()));
        }
    }

    @Override
    public iay.a cLv() {
        return iay.a.lDw;
    }

    @Override
    protected void cEk() {
        this.a("setLabelData", new Object[]{lvq.sZg.bD(new Object[0]).exA(), lvq.sZh.bD(new Object[0]).exA(), lvq.sZj.bD(new Object[0]).exA(), lvq.sZj.bD(new Object[0]).exA()});
    }
}

