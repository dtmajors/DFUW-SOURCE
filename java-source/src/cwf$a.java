public enum cwf$a {
   fEc,
   fEd,
   fEe,
   fEf,
   fEg,
   fEh,
   fEi,
   fEj,
   fEk,
   fEl,
   fEm,
   fEn,
   fEo,
   fEp,
   fEq,
   fEr,
   fEs,
   fEt,
   fEu,
   fEv,
   fEw;

   public static cwf$a getBankType(int var0) {
      cwf$a[] var1 = values();
      if (var0 >= 0 && var0 < var1.length) {
         return var1[var0];
      }

      lfn.b(5, "BankTypes", "getBankType() Ordinal is invalid.");
      return null;
   }

   public static cwf$a getBankTypeByResourceType(int var0) {
      if (var0 == cug.fkY) {
         return fEl;
      } else if (var0 == cug.fkZ) {
         return fEm;
      } else if (var0 == cug.fla) {
         return fEn;
      } else if (var0 == cug.fkX) {
         return fEk;
      } else if (var0 == cug.fkW) {
         return fEj;
      } else if (var0 == cug.fld) {
         return fEo;
      } else if (var0 == cug.fle) {
         return fEp;
      } else if (var0 == cug.flb) {
         return fEq;
      } else if (var0 == cug.flc) {
         return fEr;
      } else if (var0 == cug.fls) {
         return fEs;
      } else if (var0 == cug.flt) {
         return fEt;
      } else if (var0 == cug.flu) {
         return fEu;
      } else if (var0 == cug.flv) {
         return fEv;
      } else if (var0 == cug.flw) {
         return fEw;
      } else {
         return lea.enW().isDescendant(var0, cug.fqZ) ? fEi : fEi;
      }
   }

   public boolean bdl() {
      switch (this) {
         case fEc:
         case fEd:
         case fEe:
         case fEf:
            return true;
         default:
            return false;
      }
   }

   public boolean bdm() {
      switch (this) {
         case fEc:
         case fEg:
         case fEi:
         case fEl:
         case fEm:
         case fEn:
         case fEj:
         case fEk:
         case fEo:
         case fEp:
         case fEq:
         case fEr:
         case fEs:
         case fEt:
         case fEu:
         case fEv:
         case fEw:
            return true;
         case fEd:
         case fEe:
         case fEf:
         case fEh:
            return false;
         default:
            lfn.b(5, "BankTypes", "isDynamicBank() Invalid banktype found: " + this);
            assert false;
            return false;
      }
   }

   public boolean bdn() {
      switch (this) {
         case fEg:
         case fEh:
            return true;
         default:
            return false;
      }
   }

   public boolean bdo() {
      switch (this) {
         case fEo:
         case fEp:
         case fEq:
         case fEr:
         case fEv:
         case fEw:
            return true;
         case fEs:
         case fEt:
         case fEu:
         default:
            return false;
      }
   }

   public boolean bdp() {
      switch (this) {
         case fEl:
         case fEm:
         case fEn:
         case fEj:
         case fEk:
         case fEs:
         case fEt:
         case fEu:
            return true;
         case fEo:
         case fEp:
         case fEq:
         case fEr:
         default:
            return false;
      }
   }

   public boolean bdq() {
      switch (this) {
         case fEc:
         case fEd:
         case fEe:
         case fEf:
            return true;
         case fEg:
         case fEn:
         case fEo:
         case fEq:
         case fEr:
         case fEs:
         case fEt:
         case fEu:
         case fEv:
         case fEw:
         case fEh:
            return false;
         case fEi:
            return true;
         case fEl:
         case fEm:
         case fEj:
         case fEk:
         case fEp:
            return true;
         default:
            lfn.b(5, "BankTypes", "isRequireAccessCheck() Invalid banktype found: " + this);
            assert false;
            return false;
      }
   }
}
