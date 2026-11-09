import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import spenefett.hid.gui.serialization.dto.SFInputBindingsDTO;

public class jjd$c {
   private jjd$c$a niF;
   public static final String niG = "InputBindings0";
   public static final String niH = "InputBindings1";
   public static final String niI = "InputBindings2";
   public static final String niJ = "InputPresetSlot";
   private boolean niK;
   private boolean niL;
   private boolean niM;
   private boolean niN;
   private String niO;
   private SFInputBindingsDTO niP;
   private Map<String, TreeSet<String>> niQ;

   private void UU(int var1) {
      this.nij.w("InputPresetSlot", var1);
   }

   private int dIp() {
      return this.nij.nh("InputPresetSlot");
   }

   public jjd$c(jjd var1) {
      this.nij = var1;
      this.niF = new jjd$c$a(this, null);
      this.niK = false;
      this.niL = false;
      this.niM = false;
      this.niN = false;
      this.niO = "";
      this.niP = null;
      var1.a("InputBindings0", hsu.ldg, new SFInputBindingsDTO().toString());
      var1.a("InputBindings1", hsu.ldg, new SFInputBindingsDTO().toString());
      var1.a("InputBindings2", hsu.ldg, new SFInputBindingsDTO().toString());
      var1.a("InputPresetSlot", hsu.ldg, 0);
   }

   public void fz(int var1, int var2) {
      if (var2 == 11) {
         this.nij.B("InputBindings0", new SFInputBindingsDTO().toString());
         this.nij.B("InputBindings1", new SFInputBindingsDTO().toString());
         this.nij.B("InputBindings2", new SFInputBindingsDTO().toString());
         this.nij.w("InputPresetSlot", 0);
      }
   }

   private SFInputBindingsDTO dIq() {
      SFInputBindingsDTO var1 = null;
      switch (this.dIp()) {
         case 0:
         default:
            var1 = new SFInputBindingsDTO(this.nij.nj("InputBindings0"));
            break;
         case 1:
            var1 = new SFInputBindingsDTO(this.nij.nj("InputBindings1"));
            break;
         case 2:
            var1 = new SFInputBindingsDTO(this.nij.nj("InputBindings2"));
      }

      return new SFInputBindingsDTO(var1);
   }

   private void a(SFInputBindingsDTO var1) {
      switch (this.dIp()) {
         case 0:
         default:
            this.nij.B("InputBindings0", var1.toString());
            break;
         case 1:
            this.nij.B("InputBindings1", var1.toString());
            break;
         case 2:
            this.nij.B("InputBindings2", var1.toString());
      }
   }

   public void dIl() {
      this.dIu();
      this.dIs();
   }

   private void dIr() {
      SFInputBindingsDTO var1 = this.dIq();
      var1.cDE();

      for (int var2 = 0; var2 < var1.bindings.size(); var2++) {
         var1.bindings.set(var2, var1.bindings.get(var2) + "]");
      }

      this.nij.a("InputBindingsDivision_setPresetSlot", new Object[]{this.dIp()});
      this.nij.a("InputBindingsDivision_fromDTO", new Object[]{var1});
   }

   public void cBa() {
      this.dIr();
   }

   public void cEj() {
      this.nij.a("InputBindingsDivision_stopListening", new Object[0]);
      this.dIt();
   }

   private void dIs() {
      SFInputBindingsDTO var1 = this.dIq();
      assert var1.verify();

      for (int var2 = 0; var2 < var1.actions.size(); var2++) {
         this.Z(var1.actions.get(var2), var1.bindings.get(var2));
      }

      if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyJ() != null && hso.cxK().cxP().cyJ().cHN() != null) {
         hso.cxK().cxP().cyJ().cHN().cKp();
         hso.cxK().cxP().cyJ().cHN().cKq();
      }
   }

   public boolean a(jmf var1) {
      if (!this.niN) {
         return false;
      }

      if (var1.dMr().contains("ESCAPE")) {
         this.niN = false;
         this.niL = true;
         this.nij.a("InputBindingsDivision_stopListening", new Object[0]);
         return false;
      }

      if (!var1.dMo()) {
         return false;
      }

      if (var1.dMr().contains("AXIS")) {
         return false;
      }

      boolean var2 = false;
      if (jjd$c$a.a(this.niF, var1)) {
         var2 = true;
         if (this.niF.cAN() > 2) {
            this.nij.a("InputBindingsDivision_stopListening", new Object[0]);
            this.dIt();
         }

         if (var1.dMt()) {
            return false;
         }
      }

      if (this.niF.dIz() && var1.dMq() == "TAB") {
         this.nij.a("InputBindingsDivision_stopListening", new Object[0]);
         this.dIt();
      }

      if (var1.dMt()) {
         return false;
      }

      SFInputBindingsDTO var3 = this.dIq();
      this.niP = new SFInputBindingsDTO(var3);
      String var4 = "";
      if (var2) {
         var4 = var1.dMr() + ",";
      } else {
         var4 = this.niF.dIy() + var1.dMr() + ",";
      }

      String var5 = "";

      for (int var6 = 0; var6 < var3.actions.size(); var6++) {
         if (var3.actions.get(var6).equals(this.niO)) {
            var5 = var3.bindings.get(var6);
            break;
         }
      }

      int var9 = -1;

      for (int var7 = 0; var7 < var3.bindings.size(); var7++) {
         if (SFInputBindingsDTO.D(var3.bindings.get(var7), var4)) {
            var9 = var7;
            break;
         }
      }

      if (var9 >= 0) {
         var3.bindings.set(var9, var5);
         if (this.nij.cEU()) {
            this.nij.a("InputBindingsDivision_showConfirmationWindow", new Object[]{lxo.tvd.bD().exA()});
         }
      }

      for (int var10 = 0; var10 < var3.actions.size(); var10++) {
         if (var3.actions.get(var10).equals(this.niO)) {
            var3.bindings.set(var10, var4);
            break;
         }
      }

      this.a(var3);
      this.dIr();
      this.dIs();
      this.niN = false;
      this.niL = true;
      return true;
   }

   private boolean sq(String var1) {
      return var1.equals(jmq.nyX.getKey());
   }

   public void sr(String var1) {
      this.niO = var1;
      this.niK = true;
      this.tO(true);
      this.niF = new jjd$c$a(this, null);
   }

   public void dIt() {
      this.tO(false);
      this.niN = false;
   }

   public void clearBinding(String var1) {
      if (var1 != null) {
         SFInputBindingsDTO var2 = this.dIq();
         this.niP = new SFInputBindingsDTO(var2);
         String var3 = "";

         for (int var4 = 0; var4 < var2.actions.size(); var4++) {
            if (var2.actions.get(var4).equals(var1)) {
               var2.bindings.set(var4, "");
               break;
            }
         }

         this.nij.a("InputBindingsDivision_showConfirmationWindow", new Object[]{lxo.tve.bD().exA()});
         this.a(var2);
         this.dIr();
         this.dIs();
      }
   }

   private void tO(boolean var1) {
      if (var1 != this.niM) {
         hyn.cyJ().pp(var1);
         jjd.dIj().cxR().dMa().un(!var1);
         this.niM = var1;
      }
   }

   private String ss(String var1) {
      if (var1 == null) {
         return null;
      }

      String[] var2 = var1.split(",");
      return var2.length == 0 ? null : var2[var2.length - 1];
   }

   private String[] st(String var1) {
      if (var1 == null) {
         return null;
      }

      String[] var2 = var1.split(",");
      if (var2.length <= 1) {
         return null;
      }

      ArrayList var3 = new ArrayList();

      for (int var4 = 0; var4 < var2.length - 1; var4++) {
         var3.add(var2[var4]);
      }

      return var3.toArray(new String[0]);
   }

   private String[] a(String var1, SFInputBindingsDTO var2) {
      String var3 = this.ss(var1);
      TreeSet var4 = new TreeSet();
      String[] var5 = this.st(var1);
      TreeSet var6 = new TreeSet();
      if (var5 != null) {
         for (String var10 : var5) {
            var6.add(var10);
         }
      }

      for (int var13 = 0; var13 < var2.actions.size(); var13++) {
         if (this.ss(var2.bindings.get(var13)) != null && this.ss(var2.bindings.get(var13)).equals(var3) && !var2.bindings.get(var13).equals(var1)) {
            String[] var15 = var2.bindings.get(var13).split(",");

            for (String var12 : var15) {
               if (!var6.contains(var12) && !var12.equals(var3)) {
                  var4.add(var12);
               }
            }
         }
      }

      if (this.niQ.containsKey(var3)) {
         for (String var20 : this.niQ.get(var3).toArray(new String[0])) {
            if (!var20.equals(var3)) {
               var4.add(var20);
            }
         }
      }

      return var4.toArray(new String[0]);
   }

   private boolean su(String var1) {
      return var1.equals("KEYBOARD.LEFT_SHIFT")
         || var1.equals("KEYBOARD.LEFT_ALT")
         || var1.equals("KEYBOARD.LEFT_CTRL")
         || var1.equals("KEYBOARD.RIGHT_SHIFT")
         || var1.equals("KEYBOARD.RIGHT_ALT")
         || var1.equals("KEYBOARD.RIGHT_CTRL");
   }

   private String a(String var1, Set<String> var2) {
      String var3 = "";
      String[] var4 = var1.split(",");

      for (int var5 = 0; var5 < var4.length; var5++) {
         if (this.su(var4[var5])) {
            if (var2 != null) {
               var2.add(var4[var5]);
            }
         } else {
            var3 = var4[var5];
         }
      }

      return var3;
   }

   private void Z(String var1, String var2) {
      fjq var3 = (fjq)jjd.ar(this.nij).h(2844, jjd.aq(this.nij), lcr.qCC);
      var3.iMe = jmq.get(var1);
      jmv$a var4 = SFInputBindingsDTO.b(var3.iMe);
      if (var4 != null) {
         if (var3.iMe.nyJ == jmp.nyU) {
            String[] var5 = var2.split(",");
            Set var6 = lcn.emx();
            String var7 = this.a(var2, (Set<String>)null);
            if (var7 != null && var7.length() > 0) {
               SFInputBindingsDTO var8 = this.dIq();

               for (String var10 : this.dIq().bindings) {
                  if (!var2.equals(var10)) {
                     TreeSet var11 = lcn.emH();
                     String var12 = this.a(var10, var11);
                     if (var7.equals(var12)) {
                        var6.addAll(var11);
                     }
                  }
               }

               for (String var20 : var5) {
                  var6.remove(var20);
               }
            }

            var3.iNW = new jmu(null, var4.iNW.dML(), var5, var6.toArray(new String[0]), var4.iNW.dMO(), var4.iNW.dMP());
         } else {
            if (var3.iMe.nyJ != jmp.nyT) {
               return;
            }

            SFInputBindingsDTO var13 = this.dIq();
            String var14 = this.ss(var2);
            String[] var15 = this.st(var2);
            String[] var16 = this.a(var2, var13);
            var3.iNW = new jmu(var14, var4.iNW.dML(), var15, var16, var4.iNW.dMO(), var4.iNW.dMP());
         }

         hso.cxK().cxR().receiveMessage(var3);
      }
   }

   private void dIu() {
      this.niQ = lcn.emw();
      SFInputBindingsDTO var1 = new SFInputBindingsDTO();
      var1.cDD();
      TreeSet var2 = new TreeSet();

      for (String var4 : var1.actions) {
         var2.add(jmq.get(var4));
      }

      for (jmv$a var6 : jmv.nCe) {
         if (!var2.contains(var6.iMe)) {
            String var7 = jjd.a(var6);
            String var8 = this.ss(var7);
            if (var8 != null) {
               if (!this.niQ.containsKey(var8)) {
                  this.niQ.put(var8, new TreeSet<>());
               }

               String[] var9 = this.st(var7);
               if (var9 != null) {
                  for (String var13 : var9) {
                     this.niQ.get(var8).add(var13);
                  }
               }
            }
         }
      }
   }

   public void dIv() {
      SFInputBindingsDTO var1 = new SFInputBindingsDTO();
      var1.cDD();
      this.a(var1);
      this.dIr();
      this.dIs();
   }

   public void UV(int var1) {
      this.UU(var1);
      this.dIr();
      this.dIs();
   }

   public void czn() {
      if (this.niL) {
         this.tO(false);
         this.niL = false;
      }

      if (this.niK) {
         this.niN = true;
         this.niK = false;
      }
   }

   public void dIw() {
      int var1 = this.dIp();

      for (int var2 = 0; var2 < 3; var2++) {
         this.UU(var2);
         this.a(this.dIq().cDF());
      }

      this.UU(var1);
      this.dIr();
   }

   public void dIx() {
      if (this.niP != null) {
         this.a(this.niP);
         this.dIr();
         this.dIs();
         this.niP = null;
      }
   }
}
