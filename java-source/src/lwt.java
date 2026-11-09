/*
 * Decompiled with CFR.
 */
public class lwt
extends lvn {
    private static lwt thq = new lwt();
    @lok(value="CRAFTING")
    @lpl(value="Window Title")
    public static final lox thr = thq.BC("TitleWindow");
    @lok(value="SELECT AN ITEM TO CRAFT")
    @lpl(value="Select item label")
    public static final lox ths = thq.BC("LabelSelectItem");
    @lok(value="SKILL NEEDED")
    @lpl(value="Skill needed label")
    public static final lox tht = thq.BC("LabelSkillNeeded");
    @lok(value="CURRENT SKILL LEVEL HOLDS $(Chance) CHANCE OF SUCCESS")
    @lpl(value="Chance of failure label")
    public static final lox thu = thq.a("LabelChanceOfSuccess", lwt.Bk("Chance"));
    @lok(value="NO SKILL PROGRESSION BEYOND $(SkillLevel)")
    @lpl(value="No skill progression label")
    public static final lox thv = thq.a("LabelNoSkillProgression", lwt.Bh("SkillLevel"));
    @lok(value="RESOURCES NEEDED")
    @lpl(value="Resources needed label")
    public static final lox thw = thq.BC("LabelResourcesNeeded");
    @lok(value="CRAFTING STATION NEEDED: $(Resource.NameSingular)")
    @lpl(value="Crafting station needed label")
    public static final lox thx = thq.a("LabelCraftingStationNeeded", lwt.Bl("Resource"));
    @lok(value="SET AMOUNT")
    @lpl(value="Set amount label")
    public static final lox thy = thq.BC("LabelSetAmount");
    @lok(value="TIME REMAINING FOR CRAFTING")
    @lpl(value="Time remaining label")
    public static final lox thz = thq.BC("LabelTimeRequired");
    @lok(value="START CRAFTING")
    @lpl(value="Start crafting label")
    public static final lox thA = thq.BC("LabelStartCrafting");
    @lok(value="CANCEL CRAFTING")
    @lpl(value="Cancel crafting label")
    public static final lox thB = thq.BC("LabelCancelCrafting");
    @lok(value="Rank $(Value)")
    @lpl(value="rank label")
    public static final lox thC = thq.a("LabelRank", lwt.Bh("Value"));
    @lok(value="CRAFTING")
    @lpl(value="Item container top folder name")
    public static final lox thD = thq.BC("TitleTopFolder");
    @lok(value="INCORRECT CRAFTING STATION")
    @lpl(value="Incorrect crafting station message")
    public static final lox thE = thq.BC("MessageIncorrectCraftingStation");
    @lok(value="NOT AT CRAFTING STATION")
    @lpl(value="Not at crafting station message")
    public static final lox thF = thq.BC("MessageNotAtCraftingStation");
    @lok(value="NOT ENOUGH SKILL LEVEL")
    @lpl(value="Not enough skill level message")
    public static final lox thG = thq.BC("MessageNotEnoughSkillLevel");
    @lok(value="NOT ENOUGH $(TRANSLATEDVALUE)")
    @lpl(value="Not enough item message")
    public static final lox thH = thq.a("MessageNotEnoughItem", lwt.Bk("TRANSLATEDVALUE"));
    @lok(value="ITEM TO CRAFT NOT SELECTED")
    @lpl(value="Item to craft not selected")
    public static final lox thI = thq.BC("MessageItemNotSelected");
    @lok(value="SKILL NEEDED")
    @lpl(value="Tooltip header for skills")
    public static final lox thJ = thq.BC("TooltipSkillNeeded");
    @lok(value="RESOURCES NEEDED")
    @lpl(value="Tooltip header for resources")
    public static final lox thK = thq.BC("TooltipResourcesNeeded");
    @lok(value="CRAFTING STATION NEEDED")
    @lpl(value="Tooltip header for crafting station")
    public static final lox thL = thq.BC("TooltipCraftingStationNeeded");
    @lok(value="Clan Workstation Bonuses")
    @lpl(value="Text to display in the label to indicate if clan workstation bonuses are active")
    public static final lox thM = thq.BC("ClanWorkstationBonuses");
    @lok(value="Drop Here")
    @lpl(value="Text to display in the crafting item drop target")
    public static final lox thN = thq.BC("DropHereText");
    @lok(value="Attribute")
    @lpl(value="The word 'Attribute'")
    public static final lox thO = thq.BC("Attribute");
    @lok(value="Minimum")
    @lpl(value="The word 'Minimum'")
    public static final lox thP = thq.BC("Minimum");
    @lok(value="Maximum")
    @lpl(value="The word 'Maximum'")
    public static final lox thQ = thq.BC("Maximum");
    @lok(value="Reduce crafting time with")
    @lpl(value="Text that appears in the crafting window selentine section.")
    public static final lox thR = thq.BC("ReduceCraftingTime");
    @lok(value="You can\u2019t use Selentine cash! $(Time) is the final limitation!")
    @lpl(value="Text that appears on screen when a player is trying to spend selentine gold which will make the total crafting time less than the minimum.")
    public static final lox thS = thq.a("MinCraftingTime", lwt.Bi("Time"));
    @lok(value="SHIELD ATTACHED")
    @lpl(value="Shield attached warning label")
    public static final lox thT = thq.BC("ShieldAttached");
    @lok(value="TOO MANY ITEMS TO CRAFT")
    @lpl(value="Warning label when the amount of items to craft has exceeded the allowed limit")
    public static final lox thU = thq.BC("AmountOfItemsToCraftExceededLimit");
    @lok(value="Orders")
    @lpl(value="Orders Label")
    public static final lox thV = thq.BC("Orders");
    @lok(value="Completed")
    @lpl(value="Completed Orders Label")
    public static final lox thW = thq.BC("CompletedOrders");
    @lok(value="Requested")
    @lpl(value="Requested Orders Label")
    public static final lox thX = thq.BC("RequestedOrders");
    @lok(value="Fulfill Orders")
    @lpl(value="Fulfill Orders Label")
    public static final lox thY = thq.BC("FulfillOrders");

    protected lwt() {
        super("Crafting");
    }
}

