/*
 * Decompiled with CFR.
 */
public class mfq
extends lpa {
    private static final mfq CMU = new mfq();
    @lok(value="Prowess Gains")
    @lpl(value="Display name of the 'ProwessGainIncrease' territorial bonus")
    public static final lox CMV = CMU.BC("ProwessGainIncrease");
    @lok(value="Harvesting Speed")
    @lpl(value="Display name of the 'HarvestingSpeedDecrease' territorial bonus")
    public static final lox CMW = CMU.BC("HarvestingSpeedDecrease");
    @lok(value="Rare Harvesting Loot")
    @lpl(value="Display name of the 'RareHarvestingLootProabilityIncrease' territorial bonus")
    public static final lox CMX = CMU.BC("RareHarvestingLootProabilityIncrease");
    @lok(value="Rare Monster Loot")
    @lpl(value="Display name of the 'RareMonsterLootProabilityIncrease' territorial bonus")
    public static final lox CMY = CMU.BC("RareMonsterLootProabilityIncrease");
    @lok(value="Gold From Monster Loot")
    @lpl(value="Display name of the 'GoldFromMonsterLootIncrease' territorial bonus")
    public static final lox CMZ = CMU.BC("GoldFromMonsterLootIncrease");

    protected mfq(String string) {
        super("TerritorialBonusTypes." + string);
    }

    private mfq() {
        super("TerritorialBonusTypes");
    }
}

