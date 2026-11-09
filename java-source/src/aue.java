/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.util.TreeMap;

@XStreamAlias(value="ChatEvent")
public class aue {
    @XStreamAlias(value="ChatBucket")
    @XStreamAsAttribute
    public String ChatBucket = "Default";
    @XStreamAlias(value="Effect")
    @XStreamAsAttribute
    public String Effect = "";
    @XStreamAlias(value="ParameterCount")
    @XStreamAsAttribute
    public int ParameterCount = 0;
    @XStreamAlias(value="Strings")
    public auf[] Strings;
    @XStreamAlias(value="Title")
    @XStreamAsAttribute
    public String Title = null;
    @XStreamAlias(value="Children")
    private TreeMap<String, aue> Children = null;

    public void a(aue aue2) {
        this.Strings = aue2.Strings != null ? aue2.Strings : null;
        this.ParameterCount = aue2.ParameterCount;
        this.Title = aue2.Title;
        this.Effect = aue2.Effect;
        this.ChatBucket = aue2.ChatBucket;
        if (aue2.Children == null) {
            this.Children = null;
        } else {
            this.Children = lcn.emG();
            for (String string : aue2.Children.keySet()) {
                aue aue3 = aue2.Children.get(string);
                aue aue4 = new aue();
                aue4.a(aue3);
                this.Children.put(string, aue4);
            }
        }
    }

    public <T> aue j(T t) {
        return this.dW("" + t);
    }

    public <T> aue k(T t) {
        return this.dX("" + t);
    }

    public <T> aue l(T t) {
        if (this.Children == null) {
            return null;
        }
        aue aue2 = this.Children.remove("" + t);
        if (this.Children.size() == 0) {
            this.Children = null;
        }
        return aue2;
    }

    private aue dW(String string) {
        if (this.Children == null) {
            return null;
        }
        return this.Children.get(string);
    }

    private aue dX(String string) {
        aue aue2;
        if (this.Children == null) {
            this.Children = lcn.emG();
        }
        if ((aue2 = this.Children.get(string)) == null) {
            aue2 = new aue();
            this.Children.put(string, aue2);
        }
        return aue2;
    }
}

