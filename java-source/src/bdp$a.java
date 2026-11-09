import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum bdp$a {
   dbt,
   dbu,
   dbv;

   public static final List<bdp$a> ListOfValue = Collections.unmodifiableList(Arrays.asList(bdp$a.class.getEnumConstants()));

   public static final int getValueCount() {
      return ListOfValue.size();
   }

   public static boolean isValidOrdinal(int var0) {
      return var0 >= 0 && var0 < getValueCount();
   }

   public static final bdp$a getValueByOrdinal(int var0) {
      return isValidOrdinal(var0) ? ListOfValue.get(var0) : null;
   }

   public static bdp$a getForgivenessButtonType(int var0) {
      if (var0 < 0) {
         return dbu;
      } else if (var0 >= bdp.dbg.length) {
         lfn.b(5, "ButtonTypes", "getForgivenessButtonType() Ordinal is invalid.");
         assert false;
         return dbu;
      } else {
         return getButtonType(bdp.dbg[var0]);
      }
   }

   public static bdp$a getPartyInviteButtonType(int var0) {
      if (var0 < 0) {
         return dbu;
      } else if (var0 >= bdp.dbh.length) {
         lfn.b(5, "ButtonTypes", "getPartyInviteButtonType() Ordinal is invalid.");
         assert false;
         return dbu;
      } else {
         return getButtonType(bdp.dbh[var0]);
      }
   }

   public static bdp$a getPartyOfferQuestButtonType(int var0) {
      if (var0 < 0) {
         return dbu;
      } else if (var0 >= bdp.dbj.length) {
         lfn.b(5, "ButtonTypes", "getPartyOfferQuestButtonType() Ordinal is invalid.");
         assert false;
         return dbu;
      } else {
         return getButtonType(bdp.dbj[var0]);
      }
   }

   public static bdp$a getRecallButtonType(int var0) {
      if (var0 < 0) {
         return dbu;
      } else if (var0 >= bdp.dbk.length) {
         lfn.b(5, "ButtonTypes", "getRecallButtonType() Ordinal is invalid.");
         assert false;
         return dbu;
      } else {
         return getButtonType(bdp.dbk[var0]);
      }
   }

   public static bdp$a getReviveButtonType(int var0) {
      if (var0 < 0) {
         return dbu;
      } else if (var0 >= bdp.dbl.length) {
         lfn.b(5, "ButtonTypes", "getReviveButtonType() Ordinal is invalid.");
         assert false;
         return dbu;
      } else {
         return getButtonType(bdp.dbl[var0]);
      }
   }

   public static bdp$a getTradingInviteButtonType(int var0) {
      if (var0 < 0) {
         return dbu;
      } else if (var0 >= bdp.dbm.length) {
         lfn.b(5, "ButtonTypes", "getTradingInviteButtonType() Ordinal is invalid.");
         assert false;
         return dbu;
      } else {
         return getButtonType(bdp.dbm[var0]);
      }
   }

   public static bdp$a getHouseUpgradeButtonType(int var0) {
      if (var0 < 0) {
         return dbu;
      } else if (var0 >= bdp.dbn.length) {
         lfn.b(5, "ButtonTypes", "getHouseUpgradeButtonType() Ordinal is invalid.");
         assert false;
         return dbu;
      } else {
         return getButtonType(bdp.dbn[var0]);
      }
   }

   public static bdp$a getTenantAcceptanceButtonType(int var0) {
      if (var0 < 0) {
         return dbu;
      } else if (var0 >= bdp.dbo.length) {
         lfn.b(5, "ButtonTypes", "getTenantAcceptanceButtonType() Ordinal is invalid.");
         assert false;
         return dbu;
      } else {
         return getButtonType(bdp.dbo[var0]);
      }
   }

   public static bdp$a getHouseTransferButtonType(int var0) {
      if (var0 < 0) {
         return dbu;
      } else if (var0 >= bdp.dbp.length) {
         lfn.b(5, "ButtonTypes", "getHouseTransferButtonType() Ordinal is invalid.");
         assert false;
         return dbu;
      } else {
         return getButtonType(bdp.dbp[var0]);
      }
   }

   public static bdp$a getClanApplicationButtonType(int var0) {
      if (var0 < 0) {
         return dbu;
      } else if (var0 >= bdp.dbq.length) {
         lfn.b(5, "ButtonTypes", "getClanApplicationButtonType() Ordinal is invalid.");
         assert false;
         return dbu;
      } else {
         return getButtonType(bdp.dbq[var0]);
      }
   }

   public static bdp$a getPersonalTradeRouteButtonType(int var0) {
      if (var0 < 0) {
         return dbu;
      } else if (var0 >= bdp.dbr.length) {
         lfn.b(5, "ButtonTypes", "getPersonalTradeRouteButtonType() Ordinal is invalid.");
         assert false;
         return dbu;
      } else {
         return getButtonType(bdp.dbr[var0]);
      }
   }

   public static bdp$a getClanInviteButtonType(int var0) {
      if (var0 < 0) {
         return dbu;
      } else if (var0 >= bdp.dbi.length) {
         lfn.b(5, "ButtonTypes", "getClanInviteButtonType() Ordinal is invalid.");
         assert false;
         return dbu;
      } else {
         return getButtonType(bdp.dbi[var0]);
      }
   }

   public static bdp$a getClanConquestCostConfirmationButtonType(int var0) {
      if (var0 < 0) {
         return dbu;
      } else if (var0 >= bdp.dbs.length) {
         lfn.b(5, "ButtonTypes", "getClanConquestCostConfirmationButtonType() : Ordinal is invalid! Ordinal = " + var0);
         assert false;
         return dbu;
      } else {
         return getButtonType(bdp.dbs[var0]);
      }
   }

   private static bdp$a getButtonType(String var0) {
      bdp$a[] var1 = values();
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         if (var1[var2].name().equals(var0)) {
            return var1[var2];
         }
      }

      return null;
   }
}
