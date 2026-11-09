/*
 * Decompiled with CFR.
 */
public class mbi
extends mai {
    private static final mbi ujz = new mbi();
    @lok(value="An error occurred while processing the clan name change request!")
    @lpl(value="Displayed when an unhandled, non-specific, error is encountered while processing a clan name change request")
    public static final lox rXy = ujz.BC("GenericError");
    @lok(value="You cannot change the name of your clan... only the clan leader is allowed to change the clan name!")
    @lpl(value="Displayed when a request to change a clan's name is received but the requesting player is not the clan leader")
    public static final lox ubr = ujz.BC("PermissionDenied");
    @lok(value="A clan name change request is already being processed... please wait and try again in a while")
    @lpl(value="Displayed when a request to change a clan's name is received while another request is already being processed")
    public static final lox ujA = ujz.BC("NameChangeRequestAlreadyBeingProcessed");
    @lok(value="The clan name you entered is too short!... Minimum length of a clan name is $(MinClanNameLength) character(s)")
    @lpl(value="Displayed when a request to change a clan's name is received and the new name does not meet the minimum character length for a clan name")
    public static final lox ujB = ujz.a("NameTooShort", mbi.Bh("MinClanNameLength"));
    @lok(value="The clan name you entered is too long!... Maximum length of a clan name is $(MaxClanNameLength) characters")
    @lpl(value="Displayed when a request to change a clan's name is received and the new name exceeds the maximum character length for a clan name")
    public static final lox ujC = ujz.a("NameTooLong", mbi.Bh("MaxClanNameLength"));
    @lok(value="Clan names can contain only letters, numbers, spaces and under-scores!")
    @lpl(value="Displayed when a request to change a clan's name is received and the new name contains characters that are not allowed")
    public static final lox ujD = ujz.BC("NameInvalid");
    @lok(value="Clan name cannot start or end with a space")
    @lpl(value="Displayed when a request to change a clan's name is received and the new name starts or ends with white-space")
    public static final lox uft = ujz.BC("NameStartsEndsWithWhitespace");
    @lok(value="Clan names cannot contain multiple consecutive spaces")
    @lpl(value="Displayed when a request to change a clan's name is received and the new name contains multiple consecutive spaces")
    public static final lox ufu = ujz.BC("NameContainsMultipleConsecutiveSpaces");
    @lok(value="The entered clan name contains black-listed words!!!")
    @lpl(value="Displayed when a request to change a clan's name is received and the new name is blacklisted")
    public static final lox ufs = ujz.BC("NameBlacklisted");
    @lok(value="The clan name you entered, '$(ClanName)', is already in use!")
    @lpl(value="Displayed when a request to change a clan's name is received and the new name is not unique")
    public static final lox tYU = ujz.a("NameInUse", mbi.Bk("ClanName"));
    @lok(value="Clan Name Changed Successfully!")
    @lpl(value="Displayed when a request to change a clan's name completes successfully")
    public static final lox ujE = ujz.BC("NameChanged");
    @lok(value="Your clan leader, $(ChangerName), has changed the name of your clan to $(NewClanName)")
    @lpl(value="Displayed to all clan members when the name of their clan has been changed")
    public static final lox ujF = ujz.a("ClanNameChangedMembers", mbi.Bk("ChangerName"), mbi.Bk("NewClanName"));
    @lok(value="The clan $(OldClanName) is now called $(NewClanName)")
    @lpl(value="Displayed to all on-line players when the name of a clan is changed")
    public static final lox ujG = ujz.a("ClanNameChangedGlobal", mbi.Bk("OldClanName"), mbi.Bk("NewClanName"));

    protected mbi(String string) {
        super("NameChangeResults." + string);
    }

    private mbi() {
        super("NameChangeResults");
    }
}

