/*
 * Decompiled with CFR.
 */
public class lyb
extends lvn {
    private static final lyb tCN = new lyb();
    @lok(value="Player is already in your friend list!")
    @lpl(value="Used in the chat system. The message displayed when attempting to send friend request to a player already in our friend list.")
    public static final lox tCO = tCN.BC("MessageInFriendList");
    @lok(value="Player is already in your blocked list!")
    @lpl(value="Used in the chat system. The message displayed when attempting to send friend request to a player already in our blocked list.")
    public static final lox tCP = tCN.BC("MessageInBlockedList");
    @lok(value="Player is already in your sent requests list!")
    @lpl(value="Used in the chat system. The message displayed when attempting to send friend request to a player already in our sent requests list.")
    public static final lox tCQ = tCN.BC("MessageInSentRequests");
    @lok(value="Player is already in your received requests list!")
    @lpl(value="Used in the chat system. The message displayed when attempting to send friend request to a player already in our received requests list.")
    public static final lox tCR = tCN.BC("MessageInReceivedRequests");

    protected lyb(String string) {
        super("Social." + string);
    }

    private lyb() {
        super("Social");
    }
}

