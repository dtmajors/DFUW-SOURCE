/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.window.npcinteraction;

import spenefett.hid.gui.serialization.dto.SFConversationPageDTO;

public class SFNPCInteractionWindow
extends hzk
implements bto {
    private SFConversationPageDTO mMW = null;
    private static final String mMX = ".bulletItem {color:#ffffff;margin-left:20px;text-indent:-25px;}.bulletIcon {color:#beb661;}";

    public SFNPCInteractionWindow() {
        super("NPCInteraction", "NPCInteraction.swf");
        this.OQ(jnz.nGe | jnz.nGi);
        this.a(hya.lmu, false);
        this.a(hya.lmx, true);
        this.a(hyb.lmC);
        this.hz(0.8f);
    }

    @Override
    public void doTick(ldz ldz2) {
    }

    public void a(hxf hxf2) {
        this.mMW = new SFConversationPageDTO();
        this.mMW.title = hxf2.getTitle();
        this.mMW.iconPath = hxf2.cCU();
        this.mMW.htmlContentLeft = hxf2.cCV();
        this.mMW.htmlContentRight = hxf2.cCW();
        this.a("setPage", new Object[]{this.mMW});
    }

    protected void cBa() {
        super.cBa();
        this.a("setStyle", new Object[]{mMX});
        if (this.mMW != null) {
            this.a("setPage", new Object[]{this.mMW});
        }
    }
}

