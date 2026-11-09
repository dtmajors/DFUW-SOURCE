/*
 * Decompiled with CFR.
 */
public class lzu
extends lzq {
    private static final lzu tYz = new lzu();
    @lok(value="Match $(Count): $(CharacterName)")
    @lpl(value="Displayed as an entry in the player list command results")
    public static final lox tYA = tYz.a("PlayerListEntry", lzu.Bh("Count"), lzu.Bk("CharacterName"));
    @lok(value="There are more players matching $(SearchTerm), be more specific")
    @lpl(value="Displayed when the player list command returns too many results")
    public static final lox tYB = tYz.a("PlayerListEntryTooManyMatches", lzu.Bk("SearchTerm"));
    @lok(value="There are no matches for $(SearchTerm)")
    @lpl(value="Displayed when the player list command returns no results")
    public static final lox tYC = tYz.a("PlayerListNoMatches", lzu.Bk("SearchTerm"));
    @lok(value="End of list for $(SearchTerm)")
    @lpl(value="Displayed when the player list command results have all been displayed")
    public static final lox tYD = tYz.a("PlayerListEnd", lzu.Bk("SearchTerm"));
    @lok(value="Character: $(PlayerName) [ID: $(CharacterID)], Account: $(AccountName) [ID: $(AccountID)] - online: $(IsOnLine)")
    @lpl(value="Displayed to an admin/GM when they request a player look-up")
    public static final lox tYE = tYz.a("PlayerOutput", lzu.Bk("PlayerName"), lzu.Bh("CharacterID"), lzu.Bk("AccountName"), lzu.Bh("AccountID"), lzu.Bk("IsOnLine"));
    @lok(value="No character found with the name $(PlayerName)")
    @lpl(value="Displayed to an admin/GM when they request a player look-up, but no matching player can be found")
    public static final lox PlayerNotFound = tYz.a("PlayerNotFound", lzu.Bk("PlayerName"));
    @lok(value="Account: $(AccountName) [ID: $(AccountID)], Character: $(PlayerName) [ID: $(CharacterID)] - online: $(IsOnLine)")
    @lpl(value="Displayed to an admin/GM when they request an account look-up")
    public static final lox tYF = tYz.a("AccountOutput", lzu.Bk("AccountName"), lzu.Bh("AccountID"), lzu.Bk("PlayerName"), lzu.Bh("CharacterID"), lzu.Bk("IsOnLine"));
    @lok(value="No account found with the name $(AccountName)")
    @lpl(value="Displayed to an admin/GM when they request an account look-up, but no matching account can be found")
    public static final lox tYG = tYz.a("AccountNotFound", lzu.Bk("AccountName"));
    @lok(value="Multiple Players Exist Whose Names Contain '$(PartialCharacterName)'!!!... Be More Specific!!!")
    @lpl(value="Text to display to admins when a player info look-up returns multiple results when a single result is requried")
    public static final lox tYH = tYz.a("TooManyPlayers", lzu.Bk("PartialCharacterName"));

    protected lzu(String string) {
        super("Lookup." + string);
    }

    private lzu() {
        super("Lookup");
    }
}

