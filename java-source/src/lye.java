/*
 * Decompiled with CFR.
 */
public class lye
extends lyb {
    private static final lye tDi = new lye();
    @lok(value="ADD")
    @lpl(value="Used in the search section of all social panels. The add button label.")
    public static final lox tDj = tDi.BC("AddButtonLabel");
    @lok(value="Type to find players")
    @lpl(value="Used in the search section of all social panels. The search prompt.")
    public static final lox tDk = tDi.BC("SearchPrompt");
    @lok(value="Send Friend Request(s)")
    @lpl(value="Used in the search section of the friend list panel. The send friend request button label.")
    public static final lox tDl = tDi.BC("SendFriendRequestButtonLabel");
    @lok(value="Block Player(s)")
    @lpl(value="Used in the search section of the blocked list panel. The block player button label.")
    public static final lox tDm = tDi.BC("BlockPlayerButtonLabel");
    @lok(value="Type in at least 3 letters to start the search.")
    @lpl(value="A message displayed in the search section of some social panels.")
    public static final lox tDn = tDi.BC("MessageMinimumLetters");
    @lok(value="Search in progress, please wait.")
    @lpl(value="A message displayed in the search section of some social panels.")
    public static final lox tDo = tDi.BC("MessageInProgress");
    @lok(value="The search didn't return any results.")
    @lpl(value="A message displayed in the search section of some social panels.")
    public static final lox tDp = tDi.BC("MessageEmptyResult");

    protected lye(String string) {
        super("Search." + string);
    }

    private lye() {
        super("Search");
    }
}

