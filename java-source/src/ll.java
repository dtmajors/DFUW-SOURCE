/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.Map;

@XStreamAlias(value="Meditation")
public class ll {
    private int MeditationType;
    private String ResourceName;
    private float MeditationPoints;
    private float TicksPerMinute;
    private float MaxLevel;
    private float AdvancementRate;
    private transient int ResourceType;
    @XStreamAlias(value="Children")
    private Map<String, ll> Children = lcn.emw();

    public void g(Map<String, ll> map) {
        for (ll ll2 : this.Children.values()) {
            ll2.ResourceType = this.f(ll2.pf(), ll2.pa());
        }
        map.putAll(this.Children);
    }

    public String pa() {
        return this.ResourceName;
    }

    private int f(int n, String string) {
        switch (n) {
            case 0: {
                return lea.enZ().getType(string);
            }
            case 1: {
                return ep.as((String)string);
            }
        }
        return -1;
    }

    public float pb() {
        return this.MeditationPoints;
    }

    public float pc() {
        return this.TicksPerMinute;
    }

    public float pd() {
        return this.MaxLevel;
    }

    public float pe() {
        return this.AdvancementRate;
    }

    public final int pf() {
        return this.MeditationType;
    }

    public final int az() {
        return this.ResourceType;
    }
}

