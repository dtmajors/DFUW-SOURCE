/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jin
extends jio {
    private jhv ngS;
    private iox mAG;
    private ios mGO;

    public jin(jhv jhv2) {
        this.ngS = jhv2;
        this.rG(false);
        this.a(iqo.dmS());
        this.W(ipx.d(new ipk(0x202020, 13, 1)));
        this.W(ipx.d(this.dHx()));
        this.W(ipx.d(new ipk(0x202020, 168, 1)));
        this.W(ipx.d(ipx.a(26, 26, this.cUs())));
        this.W(ipx.d(new ipk(0x202020, 5, 1)));
    }

    public boolean dHw() {
        return this.mAG.dir();
    }

    @Override
    public boolean a(jhw jhw2) {
        return this.ngS.a(jhw2);
    }

    @Override
    public boolean a(jib jib2) {
        return this.ngS.a(jib2);
    }

    @Override
    public void cND() {
        this.mAG.ri(this.dkb());
        this.mGO.ri(this.dkb());
    }

    @Override
    public boolean du(int n, int n2) {
        this.mAG.hX(!this.mAG.dir());
        this.pn(this.mAG.dir());
        return true;
    }

    public void pn(boolean bl) {
    }

    @Override
    public hyn dd(int n, int n2) {
        return iae.oJ(this.ngS.nfT.bD(new Object[0]).exA().toUpperCase());
    }

    private ipf dHx() {
        this.mAG = new ion("/dfdata/texture/gui/j2f/gearguise/button_arrow_close/button_arrow_close_disabled.png", "/dfdata/texture/gui/j2f/gearguise/button_arrow_close/button_arrow_close_normal.png", "/dfdata/texture/gui/j2f/gearguise/button_arrow_close/button_arrow_close_hover.png", "/dfdata/texture/gui/j2f/gearguise/button_arrow_close/button_arrow_close_pushing.png", "/dfdata/texture/gui/j2f/gearguise/button_arrow_open/button_arrow_open_disabled.png", "/dfdata/texture/gui/j2f/gearguise/button_arrow_open/button_arrow_open_normal.png", "/dfdata/texture/gui/j2f/gearguise/button_arrow_open/button_arrow_open_hover.png", "/dfdata/texture/gui/j2f/gearguise/button_arrow_open/button_arrow_open_pushing.png");
        this.mAG.hX(true);
        return this.mAG;
    }

    private ipf cUs() {
        String string = "";
        String string2 = "";
        String string3 = "";
        String string4 = "";
        switch (this.ngS) {
            case nfP: {
                string = "/dfdata/texture/gui/j2f/gearguise/button_category_mounts/button_category_mounts_on_disabled.png";
                string2 = "/dfdata/texture/gui/j2f/gearguise/button_category_mounts/button_category_mounts_on_normal.png";
                string3 = "/dfdata/texture/gui/j2f/gearguise/button_category_mounts/button_category_mounts_on_hover.png";
                string4 = "/dfdata/texture/gui/j2f/gearguise/button_category_mounts/button_category_mounts_on_pushing.png";
                break;
            }
            case nfQ: {
                string = "/dfdata/texture/gui/j2f/gearguise/button_category_weapons/button_category_weapons_on_disabled.png";
                string2 = "/dfdata/texture/gui/j2f/gearguise/button_category_weapons/button_category_weapons_on_normal.png";
                string3 = "/dfdata/texture/gui/j2f/gearguise/button_category_weapons/button_category_weapons_on_hover.png";
                string4 = "/dfdata/texture/gui/j2f/gearguise/button_category_weapons/button_category_weapons_on_pushing.png";
                break;
            }
            case nfR: {
                string = "/dfdata/texture/gui/j2f/gearguise/button_category_shields/button_category_shields_on_disabled.png";
                string2 = "/dfdata/texture/gui/j2f/gearguise/button_category_shields/button_category_shields_on_normal.png";
                string3 = "/dfdata/texture/gui/j2f/gearguise/button_category_shields/button_category_shields_on_hover.png";
                string4 = "/dfdata/texture/gui/j2f/gearguise/button_category_shields/button_category_shields_on_pushing.png";
            }
        }
        this.mGO = new iok(string, string2, string3, string4);
        return this.mGO;
    }
}

