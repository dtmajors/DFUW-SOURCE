/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public final class jpb
extends Enum<jpb> {
    public static final /* enum */ jpb nLe = new jpb("LEFT_ALT", jpn.nLx, 164, 56);
    public static final /* enum */ jpb nLf = new jpb("RIGHT_ALT", jpn.nLx, 165, 184);
    public static final /* enum */ jpb nLg = new jpb("LEFT_CTRL", jpn.nLw, 162, 29);
    public static final /* enum */ jpb nLh = new jpb("RIGHT_CTRL", jpn.nLw, 163, 157);
    public static final /* enum */ jpb nLi = new jpb("LEFT_SHIFT", jpn.nLv, 160, 42);
    public static final /* enum */ jpb nLj = new jpb("RIGHT_SHIFT", jpn.nLv, 161, 54);
    public static final /* enum */ jpb nLk = new jpb("LEFT_WIN", jpn.nLy, 91, 219);
    public static final /* enum */ jpb nLl = new jpb("RIGHT_WIN", jpn.nLy, 92, 220);
    public static final Set<jpb> nLm;
    public static final List<jpb> ListOfValue;
    public final String Name;
    public final jpn nLn;
    public final int kNW;
    public final int nvH;
    protected static final joi nHy;
    private static final /* synthetic */ jpb[] nLo;

    public static jpb[] values() {
        return (jpb[])nLo.clone();
    }

    public static jpb valueOf(String string) {
        return Enum.valueOf(jpb.class, string);
    }

    public static jpb fromVirtualKey(int n) {
        assert (n != 16);
        assert (n != 17);
        assert (n != 18);
        for (jpb jpb2 : ListOfValue) {
            if (jpb2.kNW != n) continue;
            return jpb2;
        }
        return null;
    }

    private jpb(String string2, jpn jpn2, int n2, int n3) {
        this.Name = string2;
        this.nLn = jpn2;
        this.kNW = n2;
        this.nvH = n3;
    }

    public String toString() {
        return null;
    }

    static {
        nLo = new jpb[]{nLe, nLf, nLg, nLh, nLi, nLj, nLk, nLl};
        nLm = Collections.unmodifiableSet(EnumSet.noneOf(jpb.class));
        ListOfValue = Collections.unmodifiableList(Arrays.asList(jpb.class.getEnumConstants()));
        nHy = joi.nHV;
    }
}

