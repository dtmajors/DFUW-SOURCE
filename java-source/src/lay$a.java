import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class lay$a extends FilterInputStream {
   private boolean qvl;
   private int position;
   private byte[] buffer;
   private int qvm;
   private int qvn;
   private int qvo;
   private boolean qvp;
   private int qvq;
   private byte[] qvr;

   public lay$a(InputStream var1) {
      this(var1, 0);
   }

   public lay$a(InputStream var1, int var2) {
      super(var1);
      this.qvq = var2;
      this.qvp = (var2 & 8) > 0;
      this.qvl = (var2 & 1) > 0;
      this.qvm = this.qvl ? 4 : 3;
      this.buffer = new byte[this.qvm];
      this.position = -1;
      this.qvo = 0;
      this.qvr = lay.abD(var2);
   }

   @Override
   public int read() {
      if (this.position < 0) {
         if (this.qvl) {
            byte[] var1 = new byte[3];
            int var2 = 0;

            for (int var3 = 0; var3 < 3; var3++) {
               int var4 = this.in.read();
               if (var4 < 0) {
                  break;
               }

               var1[var3] = (byte)var4;
               var2++;
            }

            if (var2 <= 0) {
               return -1;
            }

            lay.b(var1, 0, var2, this.buffer, 0, this.qvq);
            this.position = 0;
            this.qvn = 4;
         } else {
            byte[] var5 = new byte[4];
            int var7 = 0;

            for (var7 = 0; var7 < 4; var7++) {
               int var9 = 0;

               do {
                  var9 = this.in.read();
               } while (var9 >= 0 && this.qvr[var9 & 127] <= -5);

               if (var9 < 0) {
                  break;
               }

               var5[var7] = (byte)var9;
            }

            if (var7 != 4) {
               if (var7 == 0) {
                  return -1;
               }

               throw new IOException("Improperly padded Base64 input.");
            }

            this.qvn = lay.b(var5, 0, this.buffer, 0, this.qvq);
            this.position = 0;
         }
      }

      if (this.position >= 0) {
         if (this.position >= this.qvn) {
            return -1;
         }

         if (this.qvl && this.qvp && this.qvo >= 76) {
            this.qvo = 0;
            return 10;
         }

         this.qvo++;
         byte var6 = this.buffer[this.position++];
         if (this.position >= this.qvm) {
            this.position = -1;
         }

         return var6 & 0xFF;
      } else {
         throw new IOException("Error in Base64 code reading stream.");
      }
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      int var4;
      for (var4 = 0; var4 < var3; var4++) {
         int var5 = this.read();
         if (var5 < 0) {
            if (var4 == 0) {
               return -1;
            }
            break;
         }

         var1[var2 + var4] = (byte)var5;
      }

      return var4;
   }
}
