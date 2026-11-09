import java.util.LinkedList;
import java.util.List;

class hfs$a extends hpa {
   public hdw kkQ;

   public hfs$a(hfs var1, hnc var2, String var3, lgg var4, lhf var5, lhu var6) {
      super(var2, var3, var4, var5, var6);
      this.kkP = var1;
   }

   @Override
   protected void ccc() {
      if (this.kkQ == null) {
         super.ccc();
      } else {
         LinkedList var1 = new LinkedList();
         Object var2 = null;
         this.kkP.cbO().a(null, this.kkQ, var1);
         List var3 = hfs.a(this.kkP, this.kkQ);
         var3.add(new lfs<>("", ""));
         var2 = new lfs<>("Requirements:", "");
         var3.add(var2);
         var3.addAll(hfs.b(this.kkP, this.kkQ));

         for (lfs var5 : var3) {
            var1.add(new hnt(this.kkP.cbO().kKr, (String)var5.reX + "  " + (String)var5.reY));
         }

         this.kLu.a(this.kkQ.atw(), var1);
      }
   }
}
