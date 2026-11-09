import spenefett.hid.gui.serialization.dto.SFAudioOptionsDTO;

class jjd$a {
   public static final String nid = "AO.MasterVolume";
   public static final String nie = "AO.MusicVolume";
   public static final String nif = "AO.EnvironmentalVolume";
   public static final String nig = "AO.whisperSoundEnabled";
   public static final String nih = "AO.friendOnlineSoundEnabled";
   public static final String nii = "AO.friendOfflineSoundEnabled";

   public jjd$a(jjd var1) {
      this.nij = var1;
      SFAudioOptionsDTO var2 = new SFAudioOptionsDTO();
      var1.a("AO.MasterVolume", hsu.ldg, var2.MasterVolume);
      var1.a("AO.MusicVolume", hsu.ldg, var2.MusicVolume);
      var1.a("AO.EnvironmentalVolume", hsu.ldg, var2.EnvironmentalVolume);
      var1.a("AO.whisperSoundEnabled", hsu.ldg, var2.Whisper);
      var1.a("AO.friendOnlineSoundEnabled", hsu.ldg, var2.FriendOnline);
      var1.a("AO.friendOfflineSoundEnabled", hsu.ldg, var2.FriendOffline);
   }

   public void fz(int var1, int var2) {
   }

   public void dIl() {
   }

   SFAudioOptionsDTO dIm() {
      SFAudioOptionsDTO var1 = new SFAudioOptionsDTO();
      var1.MasterVolume = this.nij.ni("AO.MasterVolume");
      var1.MusicVolume = this.nij.ni("AO.MusicVolume");
      var1.EnvironmentalVolume = this.nij.ni("AO.EnvironmentalVolume");
      var1.Whisper = this.nij.nk("AO.whisperSoundEnabled");
      var1.FriendOnline = this.nij.nk("AO.friendOnlineSoundEnabled");
      var1.FriendOffline = this.nij.nk("AO.friendOfflineSoundEnabled");
      return var1;
   }

   void a(SFAudioOptionsDTO var1) {
      this.nij.d("AO.MasterVolume", var1.MasterVolume);
      this.nij.d("AO.MusicVolume", var1.MusicVolume);
      this.nij.d("AO.EnvironmentalVolume", var1.EnvironmentalVolume);
      this.nij.q("AO.whisperSoundEnabled", var1.Whisper);
      this.nij.q("AO.friendOnlineSoundEnabled", var1.FriendOnline);
      this.nij.q("AO.friendOfflineSoundEnabled", var1.FriendOffline);
   }

   public void cBa() {
      SFAudioOptionsDTO var1 = this.dIm();
      this.b(var1);
      this.nij.a("AudioOptionsDivision_fromDTO", new Object[]{var1});
   }

   public void b(SFAudioOptionsDTO var1) {
      kil var2 = (kil)jjd.as(this.nij).h(1284);
      var2.ts(this.nij.getGUID());
      var2.wD(false);
      var2.jM(false);
      var2.tB(lcr.qBT);
      var2.XS(5120);
      var2.md(var1.MasterVolume);
      var2.me(var1.EnvironmentalVolume);
      jjd.at(this.nij).a(var2);
      faq var3 = (faq)jjd.av(this.nij).h(1808, jjd.au(this.nij), lcr.qDY);
      var3.MusicVolume = var1.MasterVolume * var1.MusicVolume;
      jjd.aw(this.nij).I(var3);
      if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czx() != null) {
         hso.cxK().cxP().czx().oR(var1.Whisper);
         hso.cxK().cxP().czx().oS(var1.FriendOnline);
         hso.cxK().cxP().czx().oT(var1.FriendOffline);
      }

      this.a(var1);
   }

   public void cEj() {
   }
}
