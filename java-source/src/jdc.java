/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jdc
extends jdd {
    private jci mSI;

    public jdc(jci jci2) {
        this.mSI = jci2;
        this.D(jci2.aND());
        this.cND();
        this.dyq();
    }

    @Override
    public boolean dxi() {
        return this.mSI.dxi();
    }

    @Override
    public jcg dyp() {
        return this.mSI;
    }

    @Override
    public jbx dxe() {
        return this.mSI.dxe();
    }

    @Override
    public void cND() {
        super.cND();
        if (this.getSelected()) {
            if (this.dkb()) {
                this.rZ("/dfdata/texture/gui/j2f/quests/quest_line/quest_state_line_on_hover.png");
            } else if (this.djR()) {
                this.rZ("/dfdata/texture/gui/j2f/quests/quest_line/quest_state_line_on_normal.png");
            } else {
                this.rZ("/dfdata/texture/gui/j2f/quests/quest_line/quest_state_line_on_disabled.png");
            }
        } else if (this.dkb()) {
            this.rZ("/dfdata/texture/gui/j2f/quests/quest_line/quest_state_line_off_hover.png");
        } else if (this.djR()) {
            this.rZ("/dfdata/texture/gui/j2f/quests/quest_line/quest_state_line_off_normal.png");
        } else {
            this.rZ("/dfdata/texture/gui/j2f/quests/quest_line/quest_state_line_off_disabled.png");
        }
    }

    @Override
    public void dyq() {
        this.b(this.mSI.dxe(), this.mSI.dxf());
    }

    @Override
    public hyn dyr() {
        return iae.oJ(lxu.tyq.bD(new Object[0]).exA().toUpperCase());
    }
}

