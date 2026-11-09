/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="MinimapGenerationConfig")
public class dy {
    public String[] MinimapsToGenerate;
    public boolean TakeISOScreens;
    public boolean TakeWireframScreens;
    public boolean OnlyTerrain = false;
    public boolean LoadNeighbours = false;
    public boolean ReplaceWaterShaders = false;
    public int Size = 768;
}

