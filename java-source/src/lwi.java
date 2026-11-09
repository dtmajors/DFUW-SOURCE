/*
 * Decompiled with CFR.
 */
public class lwi
extends lvx {
    private static final lwi tef = new lwi();
    @lok(value="Clan Member Selector")
    @lpl(value="Text to display as the title to the window that is used to display the roster of a single clan to allow the player to select a specific member")
    public static final lox tce = tef.BC("Title");
    @lok(value="Name")
    @lpl(value="Displayed as the column header for the clan member name column in the list of clan members")
    public static final lox teb = tef.BC("MemberNameHeader");
    @lok(value="Kills")
    @lpl(value="Displayed as the column header for the clan member kills column in the list of clan members")
    public static final lox tec = tef.BC("KillsHeader");
    @lok(value="Clan-Points")
    @lpl(value="Displayed as the column header for the clan-points earned column in the list of clan members")
    public static final lox ted = tef.BC("ClanPointsHeader");
    @lok(value="Search...")
    @lpl(value="Displayed in the search filter text input box, when the player has not typed anything in it")
    public static final lox tee = tef.BC("SearchFilterDefaultText");

    protected lwi(String string) {
        super("MemberSelector." + string);
    }

    private lwi() {
        super("MemberSelector");
    }
}

