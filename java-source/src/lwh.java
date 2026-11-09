/*
 * Decompiled with CFR.
 */
public class lwh
extends lvx {
    private static final lwh tea = new lwh();
    @lok(value="Clan Member Roster")
    @lpl(value="Text to display as the title to the window that is used to display the view/edit the membership roster of a single clan")
    public static final lox tce = tea.BC("Title");
    @lok(value="Name")
    @lpl(value="Displayed as the column header for the clan member name column in the list of clan members")
    public static final lox teb = tea.BC("MemberNameHeader");
    @lok(value="Kills")
    @lpl(value="Displayed as the column header for the clan member kills column in the list of clan members")
    public static final lox tec = tea.BC("KillsHeader");
    @lok(value="Clan-Points")
    @lpl(value="Displayed as the column header for the clan-points earned column in the list of clan members")
    public static final lox ted = tea.BC("ClanPointsHeader");
    @lok(value="Search...")
    @lpl(value="Displayed in the search filter text input box, when the player has not typed anything in it")
    public static final lox tee = tea.BC("SearchFilterDefaultText");

    protected lwh(String string) {
        super("MemberRoster." + string);
    }

    private lwh() {
        super("MemberRoster");
    }
}

