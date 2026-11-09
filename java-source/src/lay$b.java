import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class lay$b extends FilterOutputStream {
   private boolean qvl;
   private int position;
   private byte[] buffer;
   private int qvm;
   private int qvo;
   private boolean qvp;
   private byte[] qvs;
   private boolean qvt;
   private int qvq;
   private byte[] qvr;

   public lay$b(OutputStream var1) {
      this(var1, 1);
   }

   public lay$b(OutputStream var1, int var2) {
      super(var1);
      this.qvp = (var2 & 8) != 0;
      this.qvl = (var2 & 1) != 0;
      this.qvm = this.qvl ? 3 : 4;
      this.buffer = new byte[this.qvm];
      this.position = 0;
      this.qvo = 0;
      this.qvt = false;
      this.qvs = new byte[4];
      this.qvq = var2;
      this.qvr = lay.abD(var2);
   }

   @Override
   public void write(int var1) {
      if (this.qvt) {
         this.out.write(var1);
      } else {
         if (this.qvl) {
            this.buffer[this.position++] = (byte)var1;
            if (this.position >= this.qvm) {
               this.out.write(lay.b(this.qvs, this.buffer, this.qvm, this.qvq));
               this.qvo += 4;
               if (this.qvp && this.qvo >= 76) {
                  this.out.write(10);
                  this.qvo = 0;
               }

               this.position = 0;
            }
         } else if (this.qvr[var1 & 127] > -5) {
            this.buffer[this.position++] = (byte)var1;
            if (this.position >= this.qvm) {
               int var2 = lay.b(this.buffer, 0, this.qvs, 0, this.qvq);
               this.out.write(this.qvs, 0, var2);
               this.position = 0;
            }
         } else if (this.qvr[var1 & 127] != -5) {
            throw new IOException("Invalid character in Base64 data.");
         }
      }
   }

   @Override
   public void write(byte[] var1, int var2, int var3) {
      if (this.qvt) {
         this.out.write(var1, var2, var3);
      } else {
         for (int var4 = 0; var4 < var3; var4++) {
            this.write(var1[var2 + var4]);
         }
      }
   }

   public void elX() {
      if (this.position > 0) {
         if (!this.qvl) {
            throw new IOException("Base64 input not properly padded.");
         }

         this.out.write(lay.b(this.qvs, this.buffer, this.position, this.qvq));
         this.position = 0;
      }
   }

   @Override
   public void close() {
      this.elX();
      super.close();
      this.buffer = null;
      this.out = null;
   }

   public void elY() {
      this.elX();
      this.qvt = true;
   }

   public void elZ() {
      this.qvt = false;
   }
}
