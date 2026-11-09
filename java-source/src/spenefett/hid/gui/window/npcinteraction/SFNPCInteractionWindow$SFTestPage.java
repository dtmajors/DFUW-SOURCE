package spenefett.hid.gui.window.npcinteraction;

import spenefett.hid.gui.serialization.dto.SFConversationPageDTO;

class SFNPCInteractionWindow$SFTestPage extends SFConversationPageDTO implements hxf {
   private SFNPCInteractionWindow$SFTestPage(SFNPCInteractionWindow var1) {
      this.this$0 = var1;
   }

   @Override
   public String getTitle() {
      return this.title;
   }

   @Override
   public String cCU() {
      return this.iconPath;
   }

   @Override
   public String cCV() {
      return this.htmlContentLeft;
   }

   @Override
   public String cCW() {
      return this.htmlContentRight;
   }

   @Override
   public void OL(int var1) {
   }
}
