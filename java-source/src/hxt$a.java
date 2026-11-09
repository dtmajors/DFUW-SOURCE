import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

class hxt$a extends AbstractSingleValueConverter {
   private static final String lkV = "LLAFKRAD";

   private hxt$a() {
   }

   @Override
   public boolean canConvert(Class var1) {
      return var1.equals(String.class);
   }

   @Override
   public String toString(Object var1) {
      return var1 == null ? "null" : (!(var1 instanceof String) ? var1.toString() : (String)var1 + "LLAFKRAD");
   }

   @Override
   public Object fromString(String var1) {
      return var1 != null && !var1.toLowerCase().equals("null") ? (var1.isEmpty() ? var1 : var1.substring(0, var1.length() - "LLAFKRAD".length())) : null;
   }
}
