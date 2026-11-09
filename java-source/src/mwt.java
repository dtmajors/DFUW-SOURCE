/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.TreeMap;

@XStreamAlias(value="QuestTarget")
public class mwt {
    public String FileName;
    public String DisplayName;
    public ljq Position;
    public String Tile;
    private TreeMap<String, mwt> Children = new TreeMap();

    public void a(mwt mwt2) {
        this.FileName = mwt2.FileName;
        this.DisplayName = mwt2.DisplayName;
        this.Position = mwt2.Position;
        this.Tile = mwt2.Tile;
        if (mwt2.Children == null) {
            this.Children = null;
        } else {
            this.Children = lcn.emG();
            for (String string : mwt2.Children.keySet()) {
                mwt mwt3 = mwt2.Children.get(string);
                mwt mwt4 = new mwt();
                mwt4.a(mwt3);
                this.Children.put(string, mwt4);
            }
        }
    }

    public void b(mwt mwt2) {
        if (!this.Children.containsKey(mwt2.DisplayName)) {
            this.Children.put(mwt2.DisplayName, mwt2);
        }
    }

    public void clear() {
        this.Children.clear();
        this.FileName = null;
        this.DisplayName = null;
        this.Position = null;
        this.Tile = null;
    }

    public TreeMap<String, mwt> eSy() {
        return this.Children;
    }
}

