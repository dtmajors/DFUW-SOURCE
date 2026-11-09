/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;

@XStreamAlias(value="StartingTownConfig")
public class cz {
    public final List<ch> Bindstones;
    public final String MapTexture;

    public cz(List<ch> list, String string) {
        this.Bindstones = list;
        this.MapTexture = string;
    }
}

