public class hnz$e extends hpa {
   public final hnz$e$a kQL;

   public hnz$e(hnc var1, String var2, lgg var3, lhf var4, hnz$e$a var5) {
      super(var1, var2, var3, var4, var5.dzN, var5.kQN);
      this.kQL = var5;
   }

   @Override
   protected void cbM() {
      super.cbM();
      if (this.kLu.csd()) {
         if (this.kQL.kQO == hnz$e$a$a.kQQ) {
            this.ctm().ctb();
         }
      } else {
         switch (this.kQL.kQO) {
            case kQR:
               assert !this.ctm().csS();
               if (this.ctm().a(this.kQL.kQM.ctx())) {
                  assert this.ctm().csS();
                  this.crb();
               }
               break;
            case kQQ:
               this.ctm().ctd();
         }
      }
   }

   @Override
   protected void cbu() {
      if (this.kLu.csc()) {
         switch (this.kQL.kQO) {
            case kQR:
               if (this.crd()) {
                  assert this.ctm().csS();
                  this.ctm().b(this.kQL.kQM.ctx());
               }
         }
      }

      super.cbu();
   }

   @Override
   protected void cbv() {
      switch (this.kQL.kQO) {
         case kQR:
            label20:
            if (this.crd()) {
               assert this.ctm().csS();
               this.ctm().ctc();
               assert !this.ctm().csS();
               this.crc();
            }
         default:
            super.cbv();
      }
   }

   @Override
   protected lcu cfR() {
      switch (this.kQL.kQO) {
         case kQR:
            return this.d(this.kQL.kQM.ctx());
         case kQQ:
            return this.kLu.kNw;
         default:
            return this.kLu.kNj;
      }
   }

   @Override
   protected void cdC() {
      switch (this.kQL.kQO) {
         case kQR:
            assert this.ctm().csS();
            this.ctm().ctc();
            assert !this.ctm().csS();
      }
   }

   private lcu d(hnz$a var1) {
      switch (var1) {
         case kQr:
            return this.kLu.kNo;
         case kQs:
            return this.kLu.kNp;
         case kQt:
            return this.kLu.kNq;
         case kQu:
            return this.kLu.kNr;
         case kQv:
            return this.kLu.kNs;
         case kQw:
            return this.kLu.kNt;
         case kQx:
            return this.kLu.kNu;
         case kQy:
            return this.kLu.kNv;
         default:
            assert false : var1;
            return null;
      }
   }

   private hnz$c ctm() {
      hnz var1 = (hnz)this.cqt();
      return hnz.a(var1);
   }
}
