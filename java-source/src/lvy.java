/*
 * Decompiled with CFR.
 */
public class lvy
extends lvx {
    private static final lvy tcd = new lvy();
    @lok(value="Clan Browser")
    @lpl(value="Displayed as the title to the clan browser window")
    public static final lox tce = tcd.BC("Title");
    @lok(value="Clan Name")
    @lpl(value="Displayed as the header of the clan name column for the list of clans")
    public static final lox tcf = tcd.BC("ClanNameColumnHeader");
    @lok(value="Members")
    @lpl(value="Displayed as the header of the clan size column for the list of clans")
    public static final lox tcg = tcd.BC("ClanSizeColumnHeader");
    @lok(value="Filters")
    @lpl(value="Title of the filters section")
    public static final lox tch = tcd.BC("FiltersTitle");
    @lok(value="Show only clans that are recruiting new members")
    @lpl(value="Label to display next to the recruiting filter check-box")
    public static final lox tci = tcd.BC("RecruitingFilterText");
    @lok(value="Search...")
    @lpl(value="Default text to display in the clan name search text input box, when nothing has been typed by the player")
    public static final lox tcj = tcd.BC("NameFilterDefaultText");

    protected lvy(String string) {
        super("Browser." + string);
    }

    private lvy() {
        super("Browser");
    }
}

