import java.util.List;

class iet$1 implements hyk {
   iet$1(iet var1, List var2, hwo var3, hwl var4, int var5) {
      this.lPm = var1;
      this.lra = var2;
      this.lPj = var3;
      this.lPk = var4;
      this.lPl = var5;
   }

   @Override
   public String[] cDR() {
      return this.lra.toArray(new String[this.lra.size()]);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(int var1, String var2, int var3, int var4, int var5, int var6) {
      ies var7 = ies.getValueByName(var2);
      switch (var7) {
         case lOx:
            iet.a(this.lPm, var7, this.lPj);
            break;
         case lOy:
            iet.a(this.lPm, this.lPk, this.lPj, true);
            break;
         case lOE:
            iet.a(this.lPm, this.lPj);
            break;
         case lOF:
         case lOG:
            iet.b(this.lPm, this.lPj);
            break;
         case lOH:
            this.lPm.j(this.lPj);
            iet.cOI().czi();
      }
   }

   @Override
   public void cDU() {
      if (this.lPl != -1) {
         int var1 = iet.cOJ().cyZ().cAs();
         cab var2 = lea.epO().get(var1 & 65535);
         cab var3 = lea.epO().get(var1 >> 16);
         iet.a(this.lPm).a(this.lPl, ies.lOH.getName(), var2 != null ? var2.aFK() : -16777216, var3 != null ? var3.aFK() : -16777216);
      }
   }
}
