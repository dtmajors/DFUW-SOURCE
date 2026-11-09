/*
 * Decompiled with CFR.
 */
public class lwn
extends lvx {
    private static final lwn tfu = new lwn();
    @lok(value="Clan Recruits")
    @lpl(value="Text to display as the title to the window that is used to display the view/edit the recruits of a single clan")
    public static final lox tce = tfu.BC("Title");
    @lok(value="Name")
    @lpl(value="Displayed as the column header for the player name column in the list of clan recruits")
    public static final lox tfk = tfu.BC("PlayerNameHeader");
    @lok(value="Race")
    @lpl(value="Displayed as the column header for the player race column in the list of clan recruits")
    public static final lox tfv = tfu.BC("RaceHeader");
    @lok(value="Player-Points")
    @lpl(value="Displayed as the column header for the player-points earned column in the list of clan recruits")
    public static final lox tfw = tfu.BC("PlayerPointsHeader");
    @lok(value="Search...")
    @lpl(value="Displayed in the search filter text input box, when the player has not typed anything in it")
    public static final lox tee = tfu.BC("SearchFilterDefaultText");
    @lok(value="Update Clan Recruits")
    @lpl(value="Displayed next to the update button before an update request is sent to the server for processing")
    public static final lox tfx = tfu.BC("UpdateClanRecruitsText");
    @lok(value="Updating Clan Recruits... Please Wait...")
    @lpl(value="Displayed next to the update button when an update request is being processed by the server")
    public static final lox tfy = tfu.BC("UpdatingClanRecruitsText");

    protected lwn(String string) {
        super("Recruits." + string);
    }

    private lwn() {
        super("Recruits");
    }
}

