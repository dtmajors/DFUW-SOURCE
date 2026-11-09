/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias(value="SFQuestDefinition")
public abstract class dtz
implements Comparable {
    public dud Type;
    public int ID;
    public String Name = "";
    public String QuestStartSourceSpecialEffect = "";
    public String QuestStartTargetSpecialEffect = "";
    public String QuestStartClientSpecialEffect = "";
    public String QuestEndSourceSpecialEffect = "";
    public String QuestEndTargetSpecialEffect = "";
    public String QuestEndClientSpecialEffect = "";
    public String Filename = "";
    public String TileLocation = "";
    @XStreamOmitField
    protected Object[] Parameters = null;
    @XStreamOmitField
    protected lox DisplayName = null;
    public String QuestStartText = null;
    public String QuestEndText = null;
    public String ShortDescription = null;

    public abstract String getDisplayName();

    public abstract Object[] getParameters();

    public int compareTo(Object object) {
        assert (object instanceof dtz);
        return this.Filename.compareTo(((dtz)object).Filename);
    }

    public String toString() {
        return this.Filename + "|, Type [" + this.Type.name() + "], Name [" + this.Name + "]";
    }
}

