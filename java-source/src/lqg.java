/*
 * Decompiled with CFR.
 */
public class lqg
extends lqd {
    private static final lqg scx = new lqg();
    @lok(value="Command $(Command) is not handled.")
    @lpl(value="This text appears when the handler for the console command ($Command) is missing. The parameter does not need to be translated.")
    public static final lox scy = scx.a("UnhandledCommand", lqg.Bk("Command"));
    @lok(value="$(Command): $(ItemSpecifier) is not a valid item specifier.")
    @lpl(value="This text appears when an invalid item specifier was passed to an inventory console command.")
    public static final lox scz = scx.a("InvalidItemSpecifier", lqg.Bk("Command"), lqg.Bk("ItemSpecifier"));
    @lok(value="A request to equip $(ItemSpecifier) was sent succesfully.")
    @lpl(value="This text appears to confirm that an inventory console command was executed succesfully.")
    public static final lox scA = scx.a("EquipRequested", lqg.Bk("ItemSpecifier"));
    @lok(value="The request to equip the crafting ingredients for $(ItemSpecifier) has been completed successfully")
    @lol(value="Developer command result")
    public static final lox scB = scx.a("EquipCraftingIngredientsCompleted", lqg.Bk("ItemSpecifier"));
    @lok(value="The resouce $(Resource.IDResourceName) cannot be equipped!")
    @lol(value="Developer command result")
    public static final lox scC = scx.a("EquipItemNotAllowed", lqg.Bl("Resource"));
    @lok(value="No crafting recipe found for $(Resource.IDResourceName)")
    @lol(value="Developer command result")
    public static final lox scD = scx.a("EquipItemNotCraftable", lqg.Bl("Resource"));
    @lok(value="No craftable, or equipable items found from command $(ItemSpecifier), command completed!")
    @lol(value="Developer command result")
    public static final lox scE = scx.a("EquipNoCraftableItemsFound", lqg.Bk("ItemSpecifier"));
    @lok(value="Crafting Recipe for $(CraftedItem.IDResourceName) : $(Quantity) x $(Ingredient.IDResourceName)")
    @lol(value="Developer command result")
    public static final lox scF = scx.a("EquipCraftingIngredients", lqg.Bl("CraftedItem"), lqg.Bh("Quantity"), lqg.Bl("Ingredient"));

    protected lqg(String string) {
        super("Inventory." + string);
    }

    private lqg() {
        super("Inventory");
    }
}

