import org.w3c.dom.Element;

class mif$a {
   public String DxH;

   public mif$a(String var1) {
      this.DxH = var1;
   }

   public boolean N(Element var1) {
      return var1.getTagName().equalsIgnoreCase(this.DxH);
   }
}
