enum jmx$a {
   nCr,
   nCs,
   nCt,
   nCu;

   public static jmx$a effectiveNewParserState(jmx$a var0, jmx$a var1) {
      switch (var0) {
         case nCr:
            return var1;
         case nCs:
            switch (var1) {
               case nCs:
                  return nCr;
               default:
                  return var0;
            }
         case nCt:
            switch (var1) {
               case nCt:
                  return nCr;
               default:
                  return var0;
            }
         case nCu:
            switch (var1) {
               case nCr:
                  return var1;
               default:
                  return var0;
            }
         default:
            assert false;
            return null;
      }
   }

   public static boolean includeCharacter(jmx$a var0, jmx$a var1) {
      switch (var0) {
         case nCs:
         case nCt:
            return var1 != var0;
         case nCu:
            return true;
         default:
            return false;
      }
   }

   public static jmx$a indicatedStateForCharacter(char var0) {
      switch (var0) {
         case '"':
            return nCt;
         case '\'':
            return nCs;
         default:
            return Character.isWhitespace(var0) ? nCr : nCu;
      }
   }

   public static boolean includeEmptyTokens(jmx$a var0) {
      switch (var0) {
         case nCs:
         case nCt:
            return true;
         default:
            return false;
      }
   }
}
