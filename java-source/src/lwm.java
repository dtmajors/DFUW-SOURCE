/*
 * Decompiled with CFR.
 */
public class lwm
extends lvx {
    private static final lwm tfj = new lwm();
    @lok(value="Clan-to-Player Politics")
    @lpl(value="Displayed as the title of the window that is used to view/edit a clan's political stance towards individual players")
    public static final lox tce = tfj.BC("Title");
    @lok(value="Player Name")
    @lpl(value="String to display as the header of the player name column")
    public static final lox tfk = tfj.BC("PlayerNameHeader");
    @lok(value="KOS")
    @lpl(value="String to display as the header of the kill-on-sight column")
    public static final lox tfl = tfj.BC("KOSColumnHeader");
    @lok(value="Bind")
    @lpl(value="String to display as the header of the allowed to bind column")
    public static final lox tfm = tfj.BC("BindColumnHeader");
    @lok(value="Banned")
    @lpl(value="String to display as the header of the banned column")
    public static final lox tfn = tfj.BC("BannedColumnHeader");
    @lok(value="(+) Add Player")
    @lpl(value="String to display on the add player button")
    public static final lox tfo = tfj.BC("AddPlayerButtonText");
    @lok(value="Show List")
    @lpl(value="String to display on the show list button")
    public static final lox tfp = tfj.BC("ShowListButtonText");
    @lok(value="Filter")
    @lpl(value="String to display in the search text field when the player has not entered anything, in list view")
    public static final lox tfq = tfj.BC("SearchTextDefaultTextListView");
    @lok(value="Search")
    @lpl(value="String to display in the search text field when the player has not entered anything, in add player view")
    public static final lox tfr = tfj.BC("SearchTextDefaultTextAddPlayerView");
    @lok(value="Update Clan")
    @lpl(value="String to display next to the action button when it will initiate a clan update request with the server")
    public static final lox tfs = tfj.BC("UpdateClanAction");
    @lok(value="Updating Clan... Please Wait...")
    @lpl(value="String to display next to the action button when an update clan request is being processed by the server")
    public static final lox tft = tfj.BC("UpdatingClanAction");

    protected lwm(String string) {
        super("PlayerPolitics." + string);
    }

    private lwm() {
        super("PlayerPolitics");
    }
}

