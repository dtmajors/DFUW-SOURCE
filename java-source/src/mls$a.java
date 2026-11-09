import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;

@XStreamAlias("Mapping")
public class mls$a {
   public String TemplateFilename;
   public List<String> AnimationFilenames;

   public mls$a(mls var1) {
      this.this$0 = var1;
      this.AnimationFilenames = lcn.emv();
   }
}
