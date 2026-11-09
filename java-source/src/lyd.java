/*
 * Decompiled with CFR.
 */
public class lyd
extends lyb {
    private static final lyd tDb = new lyd();
    @lok(value="Friend List")
    @lpl(value="Used in the header of a social panel. The name of the friend list panel.")
    public static final lox tDc = tDb.BC("FriendList");
    @lok(value="Blocked List")
    @lpl(value="Used in the header of a social panel. The name of the blocked list panel.")
    public static final lox tDd = tDb.BC("BlockedList");
    @lok(value="Friend Requests")
    @lpl(value="Used in the header of a social panel. The name of the friend requests panel.")
    public static final lox tDe = tDb.BC("FriendRequests");
    @lok(value="NAME")
    @lpl(value="Used in the header of all social panels. The name of the player list header.")
    public static final lox tDf = tDb.BC("TableHeaderName");
    @lok(value="Sent Requests")
    @lpl(value="Used in the header of a requests list. The name of the sent requests list.")
    public static final lox tDg = tDb.BC("SentRequests");
    @lok(value="Received Requests")
    @lpl(value="Used in the header of a requests list. The name of the received requests list.")
    public static final lox tDh = tDb.BC("ReceivedRequests");

    protected lyd(String string) {
        super("Panels." + string);
    }

    private lyd() {
        super("Panels");
    }
}

