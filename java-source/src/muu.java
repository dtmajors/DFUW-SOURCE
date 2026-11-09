/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="ServiceSkillItem")
public class muu {
    public String SkillName;

    public String toString() {
        return this.SkillName;
    }

    public boolean equals(Object object) {
        if (!(object instanceof muu)) {
            return false;
        }
        return this.SkillName.equals(((muu)object).SkillName);
    }
}

