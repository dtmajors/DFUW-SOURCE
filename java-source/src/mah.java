/*
 * Decompiled with CFR.
 */
public class mah
extends lzh {
    private static final mah ubc = new mah();
    @lok(value="Congratulations! You successfully emptied the $(Resource.NameSingular)!")
    @lpl(value="Displayed when the player successfully opens a chest.")
    @lpk(value="se_pe_chest_opened")
    public static final lox ubd = ubc.a("WasOpened", mah.Bl("Resource"));
    @lok(value="The chest could not be opened")
    @lol(value="Not in use")
    public static final lox ube = ubc.BC("CouldNotBeOpened");
    @lok(value="The $(Resource.NameSingular) is empty.")
    @lpl(value="Displayed when the player tries to open an already emptied from another player chest.")
    public static final lox ubf = ubc.a("IsEmpty", mah.Bl("Resource"));
    @lok(value="You need $(ResourceKey.NameSingular) to open $(Resource.NameSingular)")
    @lpl(value="Displayed when the player tries to open a chest without having the appropriate key.")
    public static final lox ubg = ubc.a("KeyNotFound", mah.Bl("ResourceKey"), mah.Bl("Resource"));
    @lok(value="You found a $(Resource.NameSingular)!")
    @lpl(value="Displayed when the player finds an epic item by emptying a chest.")
    @lpk(value="se_pe_chest_opened")
    public static final lox ubh = ubc.a("EpicItem", mah.Bl("Resource"));
    @lok(value="You can not obtain another $(Resource.NameSingular)!")
    @lpl(value="Displayed when the player finds a relic item and tries to acquire while he has another one.")
    public static final lox ubi = ubc.a("PlayerHasAnotherRelic", mah.Bl("Resource"));

    protected mah(String string) {
        super("Chests." + string);
    }

    private mah() {
        super("Chests");
    }
}

