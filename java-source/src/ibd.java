/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  iba
 */
import spenefett.hid.gui.serialization.dto.SFCharacterRoleDTO;
import spenefett.hid.gui.serialization.dto.SFCharacterRoleListDTO;
import spenefett.hid.gui.serialization.dto.SFCharacterSchoolDTO;

public class ibd
extends iax {
    public ibd(iba iba2) {
        super("CharacterCreatorRole", "CharacterCreatorRole.swf", iba2);
    }

    @Override
    protected void cBa() {
        super.cBa();
        this.cLu();
    }

    protected void cEc() {
        super.cEc();
        if (this.cEU()) {
            this.f(lvm.sXh.bD(this.lwn.cLA()).exA(), lvq.sYz.bD(new Object[0]).exA(), lvq.sYH.bD(new Object[0]).exA());
            this.cLu();
            this.cMk();
        }
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
        int n3 = this.lwn.cLL();
        SFCharacterRoleListDTO sFCharacterRoleListDTO = this.lwn.cLS();
        if (sFCharacterRoleListDTO == null || n3 < 0 || n3 >= sFCharacterRoleListDTO.list.size()) {
            return null;
        }
        hwl hwl2 = new hwl(string);
        SFCharacterRoleDTO sFCharacterRoleDTO = sFCharacterRoleListDTO.list.get(n3);
        if (sFCharacterRoleDTO == null || hwl2.cck < 0 || hwl2.cck >= sFCharacterRoleDTO.schools.list.size()) {
            return null;
        }
        SFCharacterSchoolDTO sFCharacterSchoolDTO = sFCharacterRoleDTO.schools.list.get(hwl2.cck);
        if (sFCharacterSchoolDTO == null) {
            return null;
        }
        int n4 = lea.enZ().getType(sFCharacterSchoolDTO.name);
        return new iag(n4, n, n2, true);
    }

    @llk
    private void setSelectedRoleByIndex(int n) {
        this.lwn.setSelectedRoleByIndex(n);
        this.cMk();
    }

    private void cLu() {
        this.a("setContentData", new Object[]{this.lwn.cLS()});
    }

    private void cMk() {
        this.a("setNextButtonVisible", new Object[]{this.lwn.cLL() >= 0});
    }

    @Override
    public iay.a cLv() {
        return iay.a.lDw;
    }

    @Override
    protected void cEk() {
        this.lwn.cLR();
        this.f(lvm.sXh.bD(this.lwn.cLA()).exA(), lvq.sYz.bD(new Object[0]).exA(), lvq.sYH.bD(new Object[0]).exA());
        this.cLu();
    }
}

