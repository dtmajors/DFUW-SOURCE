/*
 * Decompiled with CFR.
 */
import java.util.Set;
import spenefett.hid.gui.serialization.dto.SFCityElementDTO;
import spenefett.hid.gui.serialization.dto.SFClanCityBlueprintDTO;
import spenefett.hid.gui.serialization.dto.SFClanCityBlueprintElementUpdateDTO;

public class idh
extends idw
implements htq,
htr,
htx {
    private static final int lJX = 10;
    private ldv dpx = null;
    private ayp lJY = null;
    private SFClanCityBlueprintDTO lJZ = null;
    private boolean lKa = true;
    private boolean lKb = true;
    private boolean[] lKc = new boolean[10];
    private int lKd = hyy.b.luh.ordinal();
    private boolean lKe = false;

    @Override
    public jnz cOS() {
        return jnz.nFO;
    }

    public ldv iG() {
        return this.dpx;
    }

    public ayp bKm() {
        return this.lJY;
    }

    public void a(ldv ldv2, ayp ayp2) {
        this.dpx = ldv2;
        this.lJY = ayp2;
        this.cOQ();
        this.lLs = true;
        this.lKe = false;
    }

    idh() {
        super("ClanCityBuilding", "clancitybuilding.swf", iee.lMy, jnz.nGo, false);
    }

    @Override
    protected void cON() {
        if (this.isVisible()) {
            this.lLm.a(hyy.a.lrH, this);
            this.lLm.a(hyy.a.lrH, true);
            this.lLm.a(hyy.b.luq, false);
        } else {
            this.lLm.a(hyy.a.lrH, false);
            this.lLm.b(hyy.a.lrH);
            this.dpx = null;
            this.lJY = null;
        }
    }

    @Override
    protected void c(hyy.b b2, int n) {
        switch (b2) {
            case luc: {
                this.lLk.cIh();
                return;
            }
            case lue: {
                this.lKa = !this.lKa;
                this.lLm.a(b2, this.lKa ? 1 : 0);
                this.a("showBuilt", new Object[]{this.lKa});
                break;
            }
            case luf: {
                this.lKb = !this.lKb;
                this.lLm.a(b2, this.lKb ? 1 : 0);
                this.a("showUnbuildable", new Object[]{this.lKb});
                break;
            }
            case luh: 
            case lui: 
            case luj: 
            case luk: 
            case lul: 
            case lum: 
            case lun: 
            case luo: 
            case lup: 
            case luq: {
                int n2 = b2.ordinal() - this.lKd;
                if (n2 < 0 || n2 >= this.lKc.length) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleMenuButton() : Invalid Category Index Encountered!!!... Button = " + (Object)((Object)b2) + ", Category Index = " + n2);
                    assert (false);
                    return;
                }
                this.lKc[n2] = !this.lKc[n2];
                this.lLm.a(b2, this.lKc[n2] ? 1 : 0);
                this.a("setCategoryVisibility", new Object[]{n2, this.lKc[n2]});
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    protected void cOO() {
        int n;
        this.leq.a(this);
        this.lKe = false;
        this.a(hya.lmu, false);
        this.lKa = true;
        this.a("showBuilt", new Object[]{true});
        this.lKb = true;
        this.a("showUnbuildable", new Object[]{true});
        for (n = 0; n < this.lKc.length; ++n) {
            this.lKc[n] = true;
            this.a("setCategoryVisibility", new Object[]{n, true});
        }
        this.lLm.a(hyy.b.lue, this.lKa ? 1 : 0);
        this.lLm.a(hyy.b.luf, this.lKb ? 1 : 0);
        for (n = 0; n < this.lKc.length; ++n) {
            this.lLm.a(hyy.b.getValueByOrdinal(this.lKd + n), this.lKc[n] ? 1 : 0);
        }
        this.cOQ();
        this.lLs = false;
    }

    @Override
    protected void cOP() {
        this.a("setDimensions", new Object[]{this.fb, this.fc});
        if (this.lLs) {
            this.cOQ();
            this.lLs = false;
        }
    }

    @Override
    public void nw(String string) {
        this.a("requestedElementActionSucceeded", new Object[]{string});
    }

    @Override
    public void nx(String string) {
        this.a("requestedElementActionFailed", new Object[]{string});
    }

    @Override
    public void c(aym aym2) {
        if (!aym2.iG().equals(this.dpx)) {
            return;
        }
        for (int j = 0; j < aym2.abb().length; ++j) {
            if (!aym2.abb()[j].getGUID().equals(this.lJY.getGUID())) continue;
            return;
        }
        this.lLk.cIh();
    }

    @Override
    public void a(aym aym2, ayp ayp2, Set<aze> set) {
        if (!aym2.iG().equals(this.dpx)) {
            return;
        }
        if (!ayp2.getGUID().equals(this.lJY.getGUID())) {
            return;
        }
        if (set.isEmpty()) {
            return;
        }
        this.lJY = ayp2;
        if (!this.cEU()) {
            this.lKe = true;
            return;
        }
        SFClanCityBlueprintElementUpdateDTO sFClanCityBlueprintElementUpdateDTO = new SFClanCityBlueprintElementUpdateDTO();
        sFClanCityBlueprintElementUpdateDTO.updatedElements = this.lJY.a(this.lJZ, set);
        this.a("takeUpdatedBlueprintElements", new Object[]{sFClanCityBlueprintElementUpdateDTO});
    }

    @Override
    public void oi() {
        this.lLk.pq(false);
    }

    @Override
    public void cyy() {
        if (!this.leq.i(bca.cUH)) {
            this.lLk.cIh();
        }
    }

    @Override
    public void cBa() {
        super.cBa();
        this.fb = (int)(this.cEN().W - this.lLm.getWidth());
    }

    protected void cEa() {
        super.cEa();
        this.fb = (int)(this.cEN().W - this.lLm.getWidth());
        this.cOP();
    }

    @Override
    public void cEc() {
        super.cEc();
        this.lLs = this.isVisible();
        if (this.cEU() && this.lKe) {
            this.a("takeHoldingBlueprint", new Object[]{this.lJY.abv()});
            this.lKe = false;
        }
    }

    @Override
    protected void cOQ() {
        if (this.lJY == null) {
            return;
        }
        this.lJZ = this.lJY.abv();
        this.a("takeHoldingBlueprint", new Object[]{this.lJZ, this.lLs});
    }

    @Override
    protected void cOR() {
        super.cOR();
    }

    @llk
    public void buildStructure(SFCityElementDTO sFCityElementDTO) {
        for (aze aze2 : this.lJY.abo()) {
            if (aze2.getID() != sFCityElementDTO.id) continue;
            this.leq.a(this.lJY.getGUID(), aze2, aya.cvd, this);
            return;
        }
        this.a("requestedElementActionFailed", new Object[]{mbc.uhP.bD(new Object[0]).exA()});
    }

    @llk
    public void upgradeStructure(SFCityElementDTO sFCityElementDTO) {
        for (aze aze2 : this.lJY.abo()) {
            if (aze2.getID() != sFCityElementDTO.id) continue;
            this.leq.a(this.lJY.getGUID(), aze2, aya.cve, this);
            return;
        }
        this.a("requestedElementActionFailed", new Object[]{mbc.uhP.bD(new Object[0]).exA()});
    }
}

