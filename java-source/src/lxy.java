/*
 * Decompiled with CFR.
 */
public class lxy
extends lvn {
    private static final lxy tAT = new lxy();
    @lok(value="Salvaging")
    @lpl(value="Text to display as the title of the salvaging window")
    public static final lox tce = tAT.BC("Title");
    @lok(value="Select item, or container of items, to salvage")
    @lpl(value="Instructions to display to the player at the top of the salvaging window")
    public static final lox tdE = tAT.BC("Instructions");
    @lok(value="Drop Here")
    @lpl(value="Text to display in the salvage item drop-target")
    public static final lox thN = tAT.BC("DropHereText");
    @lok(value="Durability: $(DurabilityValue) ($(DurabilityPercentage)%)")
    @lpl(value="Text to display the durability of a non-broken salvageable item")
    public static final lox tAU = tAT.a("SalvageItemDurability", lxy.ah("DurabilityValue", 2), lxy.Bh("DurabilityPercentage"));
    @lok(value="Quantity: $(Quantity)")
    @lpl(value="Text to display the quantity in a broken salvageable item stack")
    public static final lox tAV = tAT.a("SalvageItemQuantity", lxy.Bh("Quantity"));
    @lok(value="Required Crafting Skill")
    @lpl(value="Text to display as the title of the required crafting skill section")
    public static final lox tAW = tAT.BC("RequiredCraftingSkillTitle");
    @lok(value="Salvageable Items")
    @lpl(value="Text to display as the title of the salvageable items section")
    public static final lox tAX = tAT.BC("SalvageableItemsTitle");
    @lok(value="Salvage Amount")
    @lpl(value="Text to display as the title of the quantity section")
    public static final lox tAY = tAT.BC("QuantityTitle");
    @lok(value="Crafting Station Needed:")
    @lpl(value="Text to display to indicate to the player the current workstation restriction")
    public static final lox tAZ = tAT.BC("WorkstationRestrictionText");
    @lok(value="Current Item Gold Cost:")
    @lpl(value="Text to indicate the current item's gold cost")
    public static final lox tBa = tAT.BC("CurrentItemGoldCost");
    @lok(value="Total Gold Cost:")
    @lpl(value="Text to indicate the total gold cost")
    public static final lox tBb = tAT.BC("TotalGoldCost");
    @lok(value="Current Item Time:")
    @lpl(value="Text to indicate how long the current item's salvage operation will take to perform")
    public static final lox tBc = tAT.BC("CurrentItemOperationTime");
    @lok(value="Total Time:")
    @lpl(value="Text to indicate how long the total salvage operation will take to perform")
    public static final lox tBd = tAT.BC("TotalOperationTime");
    @lok(value="Cannot Perform Salvage!")
    @lpl(value="Text to dispaly next to the action button, when it is not possible to begin a salvaging operation")
    public static final lox tBe = tAT.BC("CannotSalvage");
    @lok(value="Begin Salvaging")
    @lpl(value="Text to display next to the action button, when clicking it will begin a salvaging operation")
    public static final lox tBf = tAT.BC("BeginSalvaging");
    @lok(value="Cancel Salvaging")
    @lpl(value="Text to display next to the action button, when clicking it will cancel the in-progress salvaging operation")
    public static final lox tBg = tAT.BC("CancelSalvaging");
    @lok(value="$(Resource.Name$(Quantity.Plurality))")
    @lol(value="Nothing to translate!... Utility StringID")
    public static final lox tod = tAT.a("ResourceDisplayName", lxy.Bl("Resource"), lxy.Bh("Quantity"));
    @lok(value="$(Skill.NameSingular)")
    @lol(value="Nothing to translate!... Utility StringID")
    public static final lox tBh = tAT.a("SkillDisplayName", lxy.Bm("Skill"));
    @lok(value="$(Time)")
    @lol(value="Nothing to translate!... Utility StringID")
    public static final lox tBi = tAT.a("TimeDisplay", lxy.Bi("Time"));
    @lok(value="Clan Workstation Bonuses")
    @lpl(value="Text indicate if clan workstation bonuses are active or not")
    public static final lox thM = tAT.BC("ClanWorkstationBonuses");
    @lok(value="Reduce Salvaging Time With")
    @lpl(value="Text for selentine area in salvaging about speeding up the process by spending selentine gold")
    public static final lox tBj = tAT.BC("SalvagingTimeReduce");

    protected lxy(String string) {
        super("Salvaging." + string);
    }

    private lxy() {
        super("Salvaging");
    }
}

