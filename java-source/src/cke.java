/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum cke {
    eFD("Battle BrandChampion", 0),
    eFE("ChampionBattle Brand", 1),
    eFF("ChampionSlayer", 2),
    eFG("SlayerChampion", 3),
    eFH("Battle BrandBaresark", 4),
    eFI("BaresarkBattle Brand", 5),
    eFJ("BaresarkSlayer", 6),
    eFK("SlayerBaresark", 7),
    eFL("DeadeyeBrawler", 0),
    eFM("BrawlerDeadeye", 1),
    eFN("DuelistBlackguard", 2),
    eFO("BlackguardDuelist", 3),
    eFP("DeadeyeBlackguard", 4),
    eFQ("BlackguardDeadeye", 5),
    eFR("DuelistBrawler", 6),
    eFS("BrawlerDuelist", 7),
    eFT("FireEarth", 0),
    eFU("EarthFire", 1),
    eFV("WaterEarth", 2),
    eFW("EarthWater", 3),
    eFX("FireAir", 4),
    eFY("AirFire", 5),
    eFZ("WaterAir", 6),
    eGa("AirWater", 7),
    eGb("PainLaw", 0),
    eGc("LawPain", 1),
    eGd("PainChaos", 2),
    eGe("ChaosPain", 3),
    eGf("LifeLaw", 4),
    eGg("LawLife", 5),
    eGh("LifeChaos", 6),
    eGi("ChaosLife", 7),
    eGj("Common", 0);

    private String Name;
    private int eyG;
    public static final List<cke> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static final cke[] getValues() {
        return ListOfValue.toArray(new cke[ListOfValue.size()]);
    }

    public static cke getValueByOrdinal(int n) {
        if (n >= cke.getValueCount() || n < 0) {
            return null;
        }
        return ListOfValue.get(n);
    }

    public static cke getValueByName(String string) {
        for (cke cke2 : ListOfValue) {
            if (!cke2.Name.equalsIgnoreCase(string)) continue;
            return cke2;
        }
        return null;
    }

    private cke(String string2, int n2) {
        this.Name = string2;
        this.eyG = n2;
    }

    public final int aOK() {
        return this.eyG;
    }

    public String getName() {
        return this.Name;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(cke.class.getEnumConstants()));
    }
}

