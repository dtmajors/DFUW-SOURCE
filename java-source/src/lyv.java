/*
 * Decompiled with CFR.
 */
public class lyv
extends lyi {
    private static final lyv tLc = new lyv();
    @lok(value="Clear")
    @lpl(value="Tooltip text for the clear window button in the left menu bar")
    public static final lox tLd = tLc.BC("ClearWindow");
    @lok(value="Remove Item")
    @lpl(value="Tooltip text for the remove item button in the left menu bar")
    public static final lox tLe = tLc.BC("RemoveItem");
    @lok(value="Next Queued Item")
    @lpl(value="Tooltip text for the next queued item button in the left menu bar")
    public static final lox tLf = tLc.BC("NextItem");
    @lok(value="Previous Queued Item")
    @lpl(value="Tooltip text for the previous queued item button in the left menu bar")
    public static final lox tLg = tLc.BC("PreviousItem");
    @lok(value="Crafting Skill Level Ok")
    @lpl(value="Tooltip title for the icon that indicates the player's crafting skill level is sufficient to perform the salvaging operation")
    public static final lox tLh = tLc.BC("CraftingSkillLevelOkTitle");
    @lok(value="You have the required crafting skill level to salvage the item")
    @lpl(value="Tooltip description for the icon that indicates the player's crafting skill level is sufficient to perform the salvaging operation")
    public static final lox tLi = tLc.BC("CraftingSkillLevelOkDescription");
    @lok(value="Crafting Skill Level Too Low!")
    @lpl(value="Tooltip title for the icon that indicates the player's crafting skill level is insufficient to perform the salvaging operation")
    public static final lox tLj = tLc.BC("CraftingSkillLevelProblemTitle");
    @lok(value="You do not have the required crafting skill level to salvage the item")
    @lpl(value="Tooltip description for the icon that indicates the player's crafting skill level is insufficient to perform the salvaging operation")
    public static final lox tLk = tLc.BC("CraftingSkillLevelProblemDescription");
    @lok(value="Crafting Workstation Ok")
    @lpl(value="Tooltip title for the icon that indicates the player is at the correct crafting station to perform the salvaging operation")
    public static final lox tLl = tLc.BC("WorkstationOkTitle");
    @lok(value="You are at the correct crafting workstation to salvage the item")
    @lpl(value="Tooltip description for the icon that indicates the player is at the correct crafting station to perform the salvaging operation")
    public static final lox tLm = tLc.BC("WorkstationOkDescription");
    @lok(value="Crafting Workstation Incorrect")
    @lpl(value="Tooltip title for the icon that indicates the player is at the incorrect crafting station to perform the salvaging operation")
    public static final lox tLn = tLc.BC("WorkstationProblemTitle");
    @lok(value="You are at the wrong crafting workstation to salvage the item")
    @lpl(value="Tooltip description for the icon that indicates the player is at the incorrect crafting station to perform the salvaging operation")
    public static final lox tLo = tLc.BC("WorkstationProblemDescription");
    @lok(value="Gold Ok")
    @lpl(value="Tooltip title for the icon that indicates the player has enough gold in their back-pack to perform the salvaging operation")
    public static final lox tLp = tLc.BC("CurrentItemGoldOkTitle");
    @lok(value="You have enough gold in your back-pack to salvage the currently displayed salvageable item")
    @lpl(value="Tooltip description for the icon that indicates the player has enough gold in their back-pack to perform the salvaging operation")
    public static final lox tLq = tLc.BC("CurrentItemGoldOkDescription");
    @lok(value="Gold Ok")
    @lpl(value="Tooltip title for the icon that indicates the player has enough gold in their back-pack to perform the salvaging operation")
    public static final lox tLr = tLc.BC("TotalItemsGoldOkTitle");
    @lok(value="You have enough gold in your back-pack to salvage all of the queued salvageable items")
    @lpl(value="Tooltip description for the icon that indicates the player has enough gold in their back-pack to perform the salvaging operation")
    public static final lox tLs = tLc.BC("TotalItemsGoldOkDescription");
    @lok(value="Not Enough Gold!")
    @lpl(value="Tooltip title for the icon that indicates the player does not have enough gold in their back-pack to perform the salvaging operation")
    public static final lox tLt = tLc.BC("CurrentItemGoldProblemTitle");
    @lok(value="You do not have enough gold in your back-pack to salvage the currently displayed salvageable item")
    @lpl(value="Tooltip description for the icon that indicates the player does not have enough gold in their back-pack to perform the salvaging operation")
    public static final lox tLu = tLc.BC("CurrentItemGoldProblemDescription");
    @lok(value="Not Enough Gold!")
    @lpl(value="Tooltip title for the icon that indicates the player does not have enough gold in their back-pack to perform the salvaging operation")
    public static final lox tLv = tLc.BC("TotalItemsGoldProblemTitle");
    @lok(value="You do not have enough gold in your back-pack to salvage all of the queued salvageable items")
    @lpl(value="Tooltip description for the icon that indicates the player does not have enough gold in their back-pack to perform the salvaging operation")
    public static final lox tLw = tLc.BC("TotalItemsGoldProblemDescription");
    @lok(value="Since you are salvaging at a clan workstation you are receiving the following bonuses")
    @lpl(value="Tooltip title for the clan workstation bonuses indicator, when the clan workstation bonuses are active")
    public static final lox tLx = tLc.BC("ClanWorkstationBonusesHeaderActive");
    @lok(value="If you were salvaging at a clan workstation you would receive the following bonuses")
    @lpl(value="Tooltip title for the clan workstation bonuses indicator, when the clan workstation bonuses are not active")
    public static final lox tLy = tLc.BC("ClanWorkstationBonusesHeaderInactive");
    @lok(value="10% gold cost reduction")
    @lpl(value="Tooltip description for the clan workstation bonuses indicator")
    public static final lox tLz = tLc.BC("ClanWorkstationBonusesText1");
    @lok(value="25% operation time reduction")
    @lpl(value="Tooltip description for the clan workstation bonuses indicator")
    public static final lox tLA = tLc.BC("ClanWorkstationBonusesText2");
    @lok(value="5% increased chance of success per salvagable resource")
    @lpl(value="Tooltip description for the clan workstation bonuses indicator")
    public static final lox tLB = tLc.BC("ClanWorkstationBonusesText3");

    protected lyv(String string) {
        super("Salvaging." + string);
    }

    private lyv() {
        super("Salvaging");
    }
}

