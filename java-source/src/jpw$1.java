class jpw$1 implements jor {
   jpw$1(jpw var1) {
      this.nQs = var1;
   }

   @Override
   public void a(jov var1, boolean var2) {
      if (var2) {
         btk var3 = (btk)((dta)jpw.a(this.nQs)).bzt().d(lcr.rg);
         if (var3 == null || !(var3 instanceof dld)) {
            lfn.b(5, this.getClass().getSimpleName(), "handleAction() : Found no camera Object. Obj = " + var3);
            return;
         }

         ljq var4 = ((dld)var3).av();
         jpw.a(this.nQs, "say \".Camera Pos = " + var4 + ". Result also in console for Copy&Paste. \"");
         lfn.print("\n CamPos = " + var4 + ",  For XML :  <SFVector3 X=\"" + var4.x + "\" Y=\"" + var4.y + "\" Z=\"" + var4.rlV + "\"/> \n");
      }
   }
}
