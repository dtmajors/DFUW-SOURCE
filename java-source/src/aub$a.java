enum aub$a {
   cad,
   cae,
   caf,
   cag;

   public static aub$a effectiveNewParserState(aub$a var0, aub$a var1) {
      switch (var0) {
         case cad:
            return var1;
         case cae:
            switch (var1) {
               case cae:
                  return cad;
               default:
                  return var0;
            }
         case caf:
            switch (var1) {
               case caf:
                  return cad;
               default:
                  return var0;
            }
         case cag:
            switch (var1) {
               case cad:
                  return var1;
               default:
                  return var0;
            }
         default:
            assert false;
            return null;
      }
   }

   public static boolean includeCharacter(aub$a var0, aub$a var1) {
      switch (var0) {
         case cae:
         case caf:
            return var1 != var0;
         default:
            return true;
      }
   }

   public static aub$a indicatedStateForCharacter(char var0) {
      switch (var0) {
         case '"':
            return caf;
         case '\'':
            return cae;
         default:
            return Character.isWhitespace(var0) ? cad : cag;
      }
   }

   public static boolean includeEmptyTokens(aub$a var0) {
      switch (var0) {
         case cae:
         case caf:
            return true;
         default:
            return false;
      }
   }
}
