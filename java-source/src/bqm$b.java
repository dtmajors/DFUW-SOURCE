public enum bqm$b {
   dEm,
   dEn,
   dEo,
   dEp,
   dEq,
   dEr,
   dEs,
   dEt,
   dEu,
   dEv,
   dEw,
   dEx,
   dEy,
   dEz,
   dEA,
   dEB,
   dEC,
   dED,
   dEE,
   dEF,
   dEG,
   dEH,
   dEI,
   dEJ,
   dEK,
   dEL,
   dEM,
   dEN,
   dEO,
   dEP,
   dEQ,
   dER,
   dES;

   public boolean auG() {
      switch (this) {
         case dEp:
         case dER:
         case dES:
            return true;
         default:
            return false;
      }
   }

   public static boolean isLootableType(bqm$b var0) {
      switch (var0) {
         case dEq:
         case dEr:
         case dEH:
         case dEB:
         case dEA:
         case dEC:
         case dED:
         case dEE:
         case dEF:
         case dEG:
            return true;
         default:
            return false;
      }
   }

   public boolean mf(int var1) {
      switch (this) {
         case dEn:
         case dEo:
         case dEP:
            return true;
         case dEJ:
            return var1 == cug.fuj;
         default:
            return false;
      }
   }

   public boolean auH() {
      if (lcw.emW() && lcw.emX()) {
         switch (this) {
            case dEq:
            case dEr:
               return true;
         }
      }

      return false;
   }

   public static bqm$b getInventoryType(int var0) {
      bqm$b[] var1 = values();
      if (var0 > 0 && var0 < var1.length) {
         return var1[var0];
      }

      lfn.b(5, "InventoryTypes", "getInventoryType() Ordinal is invalid.");
      return null;
   }

   public static bqm$b getInventoryType(String var0) {
      if (var0 == null) {
         lfn.b(5, "InventoryTypes", "getInventoryType() InventoryName is null.");
         return null;
      }

      bqm$b[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equalsIgnoreCase(var0)) {
            return var1[var2];
         }
      }

      lfn.b(5, "InventoryTypes", "getInventoryType() InventoryName '" + var0 + "' is invalid.");
      return null;
   }

   public static bqm$b getInventoryTypeByResourceType(int var0) {
      if (lea.enW().isDescendant(var0, cug.fqZ)) {
         return dEs;
      } else if (cug.fkW == var0) {
         return dEt;
      } else if (cug.fkZ == var0) {
         return dEw;
      } else if (cug.fla == var0) {
         return dEx;
      } else if (cug.fkX == var0) {
         return dEu;
      } else if (cug.fkY == var0) {
         return dEv;
      } else if (cug.fls == var0) {
         return dEC;
      } else if (cug.flt == var0) {
         return dED;
      } else if (cug.flu == var0) {
         return dEE;
      } else if (cug.fld == var0) {
         return dEy;
      } else if (cug.fle == var0) {
         return dEz;
      } else if (cug.flb == var0) {
         return dEA;
      } else if (cug.flc == var0) {
         return dEB;
      } else if (cug.flv == var0) {
         return dEF;
      } else {
         return cug.flw == var0 ? dEG : null;
      }
   }

   public static lox getInventoryTitleStringID(bqm$b var0) {
      switch (var0) {
         case dEp:
            return lxg.tpj;
         case dER:
            return lxg.tpk;
         case dES:
            return lxg.tpl;
         case dEq:
            return lxg.tpi;
         case dEr:
            return lxg.tpi;
         case dEH:
            return lxg.tpu;
         case dEB:
            return lxg.tpw;
         case dEA:
            return lxg.tpv;
         case dEC:
            return lxg.tpn;
         case dED:
            return lxg.tpo;
         case dEE:
            return lxg.tpp;
         case dEF:
            return lxg.tps;
         case dEG:
            return lxg.tpt;
         case dEn:
            return lxg.tph;
         case dEo:
            return lxg.tpg;
         case dEP:
            return null;
         case dEJ:
            return lxg.tpz;
         case dEs:
            return lxg.tpm;
         case dEt:
            return lxg.tpn;
         case dEu:
            return lxg.tpo;
         case dEv:
            return lxg.tpp;
         case dEw:
            return lxg.tpq;
         case dEx:
            return lxg.tpr;
         case dEy:
            return lxg.tps;
         case dEz:
            return lxg.tpt;
         case dEI:
            return lxg.tpy;
         case dEK:
            return null;
         case dEL:
            return null;
         case dEN:
            return null;
         case dEO:
            return null;
         case dEQ:
            return null;
         default:
            lfn.b(5, "InventoryTypes", "getInventoryUtterance() Unhandled inventorytype provided: " + var0);
            return null;
      }
   }

   public static lip getInventoryUtterance(bqm$b var0) {
      if (var0 == null) {
         lfn.b(5, "InventoryTypes", "getInventoryUtterance() InventoryType is null.");
         return null;
      }

      switch (var0) {
         case dEp:
            return lcy.rbn;
         case dER:
         case dES:
         case dEB:
         default:
            lfn.b(5, "InventoryTypes", "getInventoryUtterance() Unhandled inventorytype provided: " + var0);
            return null;
         case dEq:
            return lcy.rbp;
         case dEr:
            return lcy.rbq;
         case dEH:
            return lcy.rbH;
         case dEA:
            return lcy.rbB;
         case dEC:
            return lcy.rbu;
         case dED:
            return lcy.rbv;
         case dEE:
            return lcy.rbw;
         case dEF:
            return lcy.rbF;
         case dEG:
            return lcy.rbG;
         case dEn:
            return lcy.rbl;
         case dEo:
            return lcy.rbm;
         case dEP:
            return lcy.rbo;
         case dEJ:
            return null;
         case dEs:
            return lcy.rbs;
         case dEt:
            return lcy.rbu;
         case dEu:
            return lcy.rbv;
         case dEv:
            return lcy.rbw;
         case dEw:
            return lcy.rbx;
         case dEx:
            return lcy.rby;
         case dEy:
            return lcy.rbz;
         case dEz:
            return lcy.rbA;
         case dEI:
            return null;
         case dEK:
            return null;
         case dEL:
            return lcy.rbt;
         case dEN:
            return null;
         case dEO:
            return null;
         case dEQ:
            return lcy.rbr;
      }
   }

   public static boolean isValidRootInventoryType(bqm$b var0) {
      switch (var0) {
         case dEp:
         case dER:
         case dES:
         case dEq:
         case dEr:
         case dEH:
         case dEB:
         case dEA:
         case dEC:
         case dED:
         case dEE:
         case dEF:
         case dEG:
         case dEn:
         case dEo:
         case dEJ:
         case dEs:
         case dEt:
         case dEu:
         case dEv:
         case dEw:
         case dEx:
         case dEy:
         case dEz:
         case dEI:
         case dEK:
         case dEL:
         case dEm:
            return true;
         case dEP:
         case dEN:
         case dEO:
         case dEQ:
            return false;
         default:
            lfn.b(5, "InventoryTypes", "isValidRootInventoryType() Invalid inventorytype provided: " + var0);
            return false;
      }
   }

   private static boolean isWithinBackpack(bqm$b var0) {
      switch (var0) {
         case dEp:
         case dER:
         case dES:
         case dEq:
         case dEr:
         case dEH:
         case dEB:
         case dEA:
         case dEC:
         case dED:
         case dEE:
         case dEF:
         case dEG:
         case dEo:
         case dEJ:
         case dEs:
         case dEt:
         case dEu:
         case dEv:
         case dEw:
         case dEx:
         case dEy:
         case dEz:
         case dEI:
         case dEK:
         case dEL:
         case dEm:
            return false;
         case dEn:
         case dEP:
         case dEN:
         case dEO:
         case dEQ:
            return true;
         default:
            lfn.b(5, "InventoryTypes", "isWithinBackpack() Invalid inventorytype provided: " + var0);
            return false;
      }
   }
}
