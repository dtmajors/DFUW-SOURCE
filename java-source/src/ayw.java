/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.EnumSet;
import spenefett.hid.gui.serialization.dto.SFClanTagDTO;
import spenefett.hid.gui.serialization.dto.SFClanTagsDTO;

public enum ayw {
    cCe(lqc.rUn),
    cCf(lqc.rWR),
    cCg(lqc.rWS),
    cCh(lqc.rWT),
    cCi(lqc.rWU),
    cCj(lqc.rUx),
    cCk(lqc.rWV),
    cCl(lqc.rWW),
    cCm(lqc.rWX);

    private lox NameString = null;

    public int acb() {
        return (int)Math.pow(2.0, this.ordinal());
    }

    public lox Zv() {
        return this.NameString;
    }

    public SFClanTagDTO acc() {
        if (!lcw.ena() && !lcw.enb()) {
            return null;
        }
        SFClanTagDTO sFClanTagDTO = new SFClanTagDTO();
        sFClanTagDTO.id = this.acb();
        sFClanTagDTO.name = this.Zv().bD(new Object[0]).exA();
        return sFClanTagDTO;
    }

    private ayw(lox lox2) {
        this.NameString = lox2;
    }

    public static int getTags(EnumSet<ayw> enumSet) {
        int n = 0;
        if (enumSet != null) {
            for (ayw ayw2 : enumSet) {
                n |= ayw2.acb();
            }
        }
        return n;
    }

    public static EnumSet<ayw> getEnumSet(int n) {
        EnumSet<ayw> enumSet = EnumSet.noneOf(ayw.class);
        for (ayw ayw2 : ayw.values()) {
            if ((ayw2.acb() & n) <= 0) continue;
            enumSet.add(ayw2);
        }
        return enumSet;
    }

    public static EnumSet<ayw> fromIDArray(int[] nArray) {
        EnumSet<ayw> enumSet = EnumSet.noneOf(ayw.class);
        for (int n : nArray) {
            enumSet.add(ayw.values()[n]);
        }
        return enumSet;
    }

    public static int[] toIDArray(EnumSet<ayw> enumSet) {
        int n = 0;
        for (ayw ayw2 : ayw.values()) {
            if (!enumSet.contains((Object)ayw2)) continue;
            ++n;
        }
        int[] nArray = new int[n];
        int n2 = 0;
        for (ayw ayw3 : ayw.values()) {
            if (!enumSet.contains((Object)ayw3)) continue;
            nArray[n2++] = ayw3.ordinal();
        }
        return nArray;
    }

    public static SFClanTagsDTO getGUIValues() {
        if (!lcw.ena() && !lcw.enb()) {
            return null;
        }
        SFClanTagsDTO sFClanTagsDTO = new SFClanTagsDTO();
        sFClanTagsDTO.tags = lcn.emv();
        for (ayw ayw2 : ayw.values()) {
            sFClanTagsDTO.tags.add(ayw2.acc());
        }
        return sFClanTagsDTO;
    }

    public static ayw getValueByOrdinal(int n) {
        return n < 0 || n >= ayw.values().length ? cCe : ayw.values()[n];
    }

    public static ayw getValueByID(int n) {
        for (ayw ayw2 : ayw.values()) {
            if (ayw2.acb() != n) continue;
            return ayw2;
        }
        return null;
    }
}

