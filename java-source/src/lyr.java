/*
 * Decompiled with CFR.
 */
public class lyr
extends lyk {
    private static final lyr tIS = new lyr();
    @lok(value="Kill-on-Sight")
    @lpl(value="Title to display in the tooltip for the player politics 'kill-on-sight' indicator")
    public static final lox tIT = tIS.BC("KOSTitle");
    @lok(value="Select to add the player to the clan's kill-on-sight list")
    @lpl(value="Description to display in the tooltip for the player politics 'kill-on-sight' indicator")
    public static final lox tIU = tIS.BC("KOSDescription");
    @lok(value="Banned")
    @lpl(value="Title to display in the tooltip for the player politics 'banned' indicator")
    public static final lox tIV = tIS.BC("BannedTitle");
    @lok(value="Select to add the player to the clan's banned players list")
    @lpl(value="Description to display in the tooltip for the player politics 'banned' indicator")
    public static final lox tIW = tIS.BC("BannedDescription");
    @lok(value="Allowed to Bind")
    @lpl(value="Title to display in the tooltip for the player politics 'allowed to bind' indicator")
    public static final lox tIX = tIS.BC("BindTitle");
    @lok(value="Select to allow the player to bind to bind-stones in the clan's holdings")
    @lpl(value="Description to display in the tooltip for the player politics 'allowed to bind' indicator")
    public static final lox tIY = tIS.BC("BindDescription");
    @lok(value="Add Player")
    @lpl(value="Tooltip for the add player button")
    public static final lox tIZ = tIS.BC("AddPlayerTitle");
    @lok(value="Switches the list to/from the search mode, where new players can be added to the player-politics lists")
    @lpl(value="Tooltip for the add player button")
    public static final lox tJa = tIS.BC("AddPlayerDescription");
    @lok(value="Search for Player")
    @lpl(value="Tooltip for the search for player button")
    public static final lox tJb = tIS.BC("SearchForPlayerTitle");
    @lok(value="Issues the search for the player with the entered name")
    @lpl(value="Tooltip for the search for player button")
    public static final lox tJc = tIS.BC("SearchForPlayerDescription");

    protected lyr(String string) {
        super("PlayerPolitics." + string);
    }

    private lyr() {
        super("PlayerPolitics");
    }
}

