import aud.a;
import java.util.Map;
import java.util.Set;

class fo$a {
   public static final int Su = 0;
   public static final int Sv = 1;
   public static final int Sw = 2;
   public int hB;
   public cg.b Sx;
   public ldv Sy;
   public ldv Sz;
   public ldv SA;
   public ldv Ri;
   public String SB;
   public hc SC;
   public int SD;
   public int Qw;
   public boolean SE;
   public Set<ldv> SF;
   public Map<ldv, aug> SG;

   fo$a(fo var1) {
      this.SH = var1;
      this.Sx = null;
      this.Sy = null;
      this.Sz = null;
      this.SA = null;
      this.Ri = null;
      this.SB = null;
      this.SC = null;
      this.Qw = 0;
      this.SE = false;
      this.SF = lcn.emx();
      this.SG = lcn.emw();
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SystemOSGUID = ");
      var1.append(this.Sy);
      var1.append(" ChatClientGUID = ");
      var1.append(this.Sz);
      var1.append(" CharacterObjectGUID = ");
      var1.append(this.SA);
      var1.append(" PSOGUID = ");
      var1.append(this.Ri);
      var1.append(" " + this.SG.size() + " ignores");
      var1.append(" Nick = ");
      var1.append(this.SB);
      return var1.toString();
   }

   public boolean a(a var1) {
      return this.SE ? iw.c(var1) : true;
   }

   public boolean b(a var1) {
      return this.SE ? iw.d(var1) : true;
   }
}
