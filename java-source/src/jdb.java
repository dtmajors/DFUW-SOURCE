/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jdb
extends jdd {
    private jch mSc;

    public jdb(jch jch2) {
        this.mSc = jch2;
        this.D(jch2.aND());
        this.cND();
        this.dyq();
    }

    @Override
    public boolean dxi() {
        return this.mSc.dxi();
    }

    @Override
    public jcg dyp() {
        return this.mSc;
    }

    @Override
    public jbx dxe() {
        return this.mSc.dxe();
    }

    @Override
    public void cND() {
        super.cND();
        if (this.getSelected()) {
            if (this.dkb()) {
                this.rZ("/dfdata/texture/gui/j2f/quests/quest_simple/quest_state_simple_on_hover.png");
            } else if (this.djR()) {
                this.rZ("/dfdata/texture/gui/j2f/quests/quest_simple/quest_state_simple_on_normal.png");
            } else {
                this.rZ("/dfdata/texture/gui/j2f/quests/quest_simple/quest_state_simple_on_disabled.png");
            }
        } else if (this.dkb()) {
            this.rZ("/dfdata/texture/gui/j2f/quests/quest_simple/quest_state_simple_off_hover.png");
        } else if (this.djR()) {
            this.rZ("/dfdata/texture/gui/j2f/quests/quest_simple/quest_state_simple_off_normal.png");
        } else {
            this.rZ("/dfdata/texture/gui/j2f/quests/quest_simple/quest_state_simple_off_disabled.png");
        }
    }

    @Override
    public void dyq() {
        this.b(this.mSc.dxe(), this.mSc.dxf());
    }

    @Override
    public hyn dyr() {
        return iae.oJ(lxu.tyr.bD(new Object[0]).exA().toUpperCase());
    }
}

