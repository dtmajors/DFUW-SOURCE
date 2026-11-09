/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import java.util.Map;

@XStreamAlias(value="MonsterStateSoundIndex")
@llc
public class jsw {
    final Map<Long, List<Integer>> stateToSounds = lcn.emw();
    final Map<Integer, String> idsToSounds = lcn.emw();

    public Map<Integer, String> dSx() {
        return this.idsToSounds;
    }

    public Map<Long, List<Integer>> dSy() {
        return this.stateToSounds;
    }
}

