import java.util.List;

public class iin extends ijd {
   private List<Integer> mbq = lcn.emv();
   private iio mbr;
   private iil mbh;

   public iin() {
      super("AdvisoryPrompt");
      this.a(irl.dnr());
      this.mbr = new iin$1(this, true);
      this.W(this.mbr);
      hso.cxK().cxP().cyJ().cJp().euB.a(new iin$2(this, this));
      hso.cxK().cxP().cyJ().cJp().euC.c(new iin$3(this, this));
      this.dac();
   }

   @Override
   public boolean cZX() {
      return true;
   }

   @Override
   public ijc cZY() {
      return new iip();
   }

   @Override
   public Integer dO(int var1, int var2) {
      return var1 - 150;
   }

   @Override
   public Integer dP(int var1, int var2) {
      return 210;
   }

   @Override
   public void cZZ() {
      super.cZZ();
      this.mbr.a(this.daD());
   }

   @Override
   public void daa() {
      this.mbr.kI(this.daE());
   }

   public void update() {
      this.dac();
   }

   private void a(Integer var1, Boolean var2) {
      if (!var2) {
         this.dac();
         this.mbq.add(var1);
         this.dab();
      }
   }

   private void dab() {
      if (!this.mbq.isEmpty() && this.mbh == null) {
         if (this.djL()) {
            int var1 = this.mbq.remove(0);
            this.cqF();
            boolean var2 = this.getX() >= this.djJ().getWidth() / 2;
            iin$4 var3 = new iin$4(this, var2, this.daD(), cfj.euv.get(var1).aNA(), this.daE());
            this.mbh = var3;
            int var4 = 27 - this.daD().ordinal();
            var3.r(this.getX() + (var2 ? 8 : this.getWidth() - 8), this.getY() + this.getHeight() / 2 - var4 / 2, 1, var4);
            this.djJ().c(var3, this.getIndexInParent());
         }
      }
   }

   private void o(Integer var1) {
      this.dac();
      this.mbq.remove(var1);
   }

   private void dac() {
      int var2;
      boolean var10000;
      label19: {
         List var1 = hso.cxK().cxP().cyJ().cJp().aNs();
         var2 = var1.size();
         if (var2 > 0) {
            this.djE();
            if (ioa.cyJ().cHH().dIh()) {
               var10000 = true;
               break label19;
            }
         }

         var10000 = false;
      }

      boolean var3 = var10000;
      this.setVisible(var3);
      this.mbr.JR(var2);
      if (var3) {
         this.mbr.cKG();
      } else {
         this.mbr.cKH();
         if (this.mbh != null) {
            this.mbh.removeFromParent();
            this.mbh = null;
         }
      }

      this.pack();
   }
}
