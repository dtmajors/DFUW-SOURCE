class iov$a extends ipx {
   ipf mpu;
   ipx mpv;
   ipx mpw;
   ipx mpx;
   isw mpy;
   ipx mpz;
   ipx mpA;
   ipb mpB;

   iov$a() {
      this.a(irl.dnr());
      this.mpv = ipx.c(4, 4, 4, 4);
      this.W(this.mpv);
      this.mpw = ipx.l();
      this.mpv.W(this.mpw);
      this.mpw.W(ipx.c());
      this.mpx = ipx.d();
      this.mpw.W(this.mpx);
      this.mpw.W(ipx.c());
      this.mpA = ipx.d();
      this.mpw.W(this.mpA);
      this.mpw.W(ipx.c());
   }

   void o(loz var1) {
      if (this.mpy != null) {
         this.mpy.o(var1);
      }
   }

   void setText(String var1) {
      if (this.mpy != null) {
         this.mpy.setText(var1);
      }
   }

   void RD(int var1) {
      this.mpv.a(new iqx(var1, var1, var1, var1));
   }

   void RE(int var1) {
      this.mpz.a(new iqu(var1, 1));
   }
}
