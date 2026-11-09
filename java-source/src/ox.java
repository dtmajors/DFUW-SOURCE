/*
 * Decompiled with CFR.
 */
import java.util.List;

public class ox {
    public int ResourceType;
    public String Name;
    public ljq Position;
    public float aGr;
    public ldv aGs;
    public String aGt;

    public String fk() {
        return pr.b(':', this.ResourceType, this.Name, Float.valueOf(this.Position.x), Float.valueOf(this.Position.y), Float.valueOf(this.Position.rlV), Float.valueOf(this.aGr), this.aGs.fk(), this.aGt);
    }

    public static ox bY(String string) {
        List<String> list = pr.a(':', string);
        if (list.size() != 8) {
            lfn.b(5, "SFStorableSiegeStone", "fromDBString: Unexpected number of elements " + list.size() + " in '" + string + "'");
            return null;
        }
        try {
            ox ox2 = new ox();
            ox2.ResourceType = Integer.parseInt(list.get(0));
            ox2.Name = list.get(1);
            ox2.Position = new ljq(Float.parseFloat(list.get(2)), Float.parseFloat(list.get(3)), Float.parseFloat(list.get(4)));
            ox2.aGr = Float.parseFloat(list.get(5));
            ox2.aGs = ldv.zp(list.get(6));
            if (ox2.aGs == null) {
                lfn.b(5, "SFStorableSiegeStone", "fromDBString: Unable to parse GUID " + list.get(6));
                return null;
            }
            ox2.aGt = list.get(7);
            return ox2;
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFStorableSiegeStone", "fromDBString: Unable to parse '" + string + "'");
            return null;
        }
    }
}

