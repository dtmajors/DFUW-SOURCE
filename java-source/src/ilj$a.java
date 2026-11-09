class ilj$a extends iqz {
   private ilj$a(ilj var1) {
      this.mic = var1;
   }

   @Override
   public void i(ipf var1) {
      if (ilj.a(this.mic).djL()) {
         if (ilj.b(this.mic).djL()) {
            switch (this.mic.daD()) {
               case mcL:
                  ilj.a(this.mic).ek(ilj.b(this.mic).getX() + ilj.b(this.mic).getWidth() / 2 - 9, ilj.b(this.mic).getY() + ilj.b(this.mic).getHeight() / 3);
                  break;
               case mcM:
                  ilj.a(this.mic).ek(ilj.b(this.mic).getX() + ilj.b(this.mic).getWidth() / 2 - 7, ilj.b(this.mic).getY() + ilj.b(this.mic).getHeight() / 3);
                  break;
               case mcN:
                  ilj.a(this.mic).ek(ilj.b(this.mic).getX() + ilj.b(this.mic).getWidth() / 2 - 5, ilj.b(this.mic).getY() + ilj.b(this.mic).getHeight() / 3);
            }
         } else {
            switch (this.mic.daD()) {
               case mcL:
                  ilj.a(this.mic).ek(25, 18);
                  break;
               case mcM:
                  ilj.a(this.mic).ek(29, 21);
                  break;
               case mcN:
                  ilj.a(this.mic).ek(31, 23);
            }
         }

         if (ilj.c(this.mic).djL()) {
            switch (this.mic.daD()) {
               case mcL:
                  ilj.c(this.mic)
                     .ek(
                        ilj.a(this.mic).getX() + ilj.a(this.mic).getWidth() - 5,
                        ilj.a(this.mic).getY() + ilj.a(this.mic).getHeight() - ilj.c(this.mic).getHeight() - 3
                     );
                  ilj.d(this.mic).ek(ilj.a(this.mic).getX() - 5, ilj.a(this.mic).getY() + (ilj.a(this.mic).getHeight() - ilj.c(this.mic).getHeight() - 6));
                  break;
               case mcM:
                  ilj.c(this.mic)
                     .ek(
                        ilj.a(this.mic).getX() + ilj.a(this.mic).getWidth() - 5,
                        ilj.a(this.mic).getY() + ilj.a(this.mic).getHeight() - ilj.c(this.mic).getHeight() - 2
                     );
                  ilj.d(this.mic).ek(ilj.a(this.mic).getX() - 5, ilj.a(this.mic).getY() + (ilj.a(this.mic).getHeight() - ilj.c(this.mic).getHeight() - 6));
                  break;
               case mcN:
                  ilj.c(this.mic)
                     .ek(
                        ilj.a(this.mic).getX() + ilj.a(this.mic).getWidth() - 5,
                        ilj.a(this.mic).getY() + ilj.a(this.mic).getHeight() - ilj.c(this.mic).getHeight() - 2
                     );
                  ilj.d(this.mic).ek(ilj.a(this.mic).getX() - 5, ilj.a(this.mic).getY() + (ilj.a(this.mic).getHeight() - ilj.c(this.mic).getHeight() - 6));
            }
         }
      }
   }
}
