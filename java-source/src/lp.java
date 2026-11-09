/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.Map;

@XStreamAlias(value="SkillMediation")
public class lp {
    private String SkillResourceName;
    private float SkillMeditationPoints;
    private float TicksPerMinute;
    private float MaxLevel;
    private float AdvancementRate;
    @XStreamAlias(value="Children")
    private Map<String, lp> Children = lcn.emw();

    public void a(String string, int n, int n2, float f, float f2) {
        lp lp2 = new lp();
        lp2.SkillResourceName = string;
        lp2.SkillMeditationPoints = n;
        lp2.TicksPerMinute = n2;
        lp2.MaxLevel = f;
        lp2.AdvancementRate = f2;
        this.Children.put(lp2.SkillResourceName, lp2);
    }

    public void g(Map<String, lp> map) {
        map.putAll(this.Children);
    }

    public String pr() {
        return this.SkillResourceName;
    }

    public void bI(String string) {
        this.SkillResourceName = string;
    }

    public float ps() {
        return this.SkillMeditationPoints;
    }

    public void cE(int n) {
        this.SkillMeditationPoints = n;
    }

    public float pc() {
        return this.TicksPerMinute;
    }

    public void cF(int n) {
        this.TicksPerMinute = n;
    }

    public float pd() {
        return this.MaxLevel;
    }

    public void I(float f) {
        this.MaxLevel = f;
    }

    public float pe() {
        return this.AdvancementRate;
    }

    public void J(float f) {
        this.AdvancementRate = f;
    }
}

