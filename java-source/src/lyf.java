/*
 * Decompiled with CFR.
 */
public class lyf
extends lyb {
    private static final lyf tDq = new lyf();
    @lok(value="Friend List")
    @lpl(value="Used in the left menu bar. The tooltip for the friend list panel button.")
    public static final lox tDc = tDq.BC("FriendList");
    @lok(value="Blocked List")
    @lpl(value="Used in the left menu bar. The tooltip for the blocked list panel button.")
    public static final lox tDd = tDq.BC("BlockedList");
    @lok(value="Friend Requests")
    @lpl(value="Used in the left menu bar. The tooltip for the friend requests panel button.")
    public static final lox tDe = tDq.BC("FriendRequests");
    @lok(value="Block Toggle")
    @lpl(value="Used in the left menu bar. The tooltip for the block toggle button.")
    public static final lox tDr = tDq.BC("BlockToggle");
    @lok(value="Remove Toggle")
    @lpl(value="Used in the left menu bar. The tooltip for the remove toggle button.")
    public static final lox tDs = tDq.BC("RemoveToggle");
    @lok(value="Remove")
    @lpl(value="Used in the social window. The tooltip for the remove button.")
    public static final lox tgZ = tDq.BC("Remove");
    @lok(value="Block Player")
    @lpl(value="Used in the social window. The tooltip for the block player button.")
    public static final lox tDt = tDq.BC("BlockPlayer");
    @lok(value="Summon Player")
    @lpl(value="Used in the social window. The tooltip header for the summon player button.")
    public static final lox tDu = tDq.BC("SummonPlayerHeader");
    @lok(value="Summoning a player will cost 1 Portal Shard and can only be done once an hour")
    @lpl(value="Used in the social window. The tooltip contents for the enabled summon player button.")
    public static final lox tDv = tDq.BC("SummonPlayerEnabled");
    @lok(value="Player is currently offline")
    @lpl(value="Used in the social window. The tooltip contents for the offline summon player button.")
    public static final lox tDw = tDq.BC("SummonPlayerOffline");
    @lok(value="Portal Shard is required to be able to summon players")
    @lpl(value="Used in the social window. The tooltip contents for the summon player button when portal shard is missing.")
    public static final lox tDx = tDq.BC("SummonPlayerNoItem");
    @lok(value="You will be able to summon a player in: $(Time)")
    @lpl(value="Used in the social window. The tooltip contents for the summon player button when on cooldown.")
    public static final lox tDy = tDq.a("SummonPlayerCooldown", lyf.Bi("Time"));
    @lok(value="Whisper Player")
    @lpl(value="Used in the social window. The tooltip header for the whisper player button.")
    public static final lox tDz = tDq.BC("WhisperPlayerHeader");
    @lok(value="Click to send a private message to the player")
    @lpl(value="Used in the social window. The tooltip contents for the enabled whisper player button.")
    public static final lox tDA = tDq.BC("WhisperPlayerEnabled");
    @lok(value="Player is currently offline")
    @lpl(value="Used in the social window. The tooltip contents for the disabled whisper player button.")
    public static final lox tDB = tDq.BC("WhisperPlayerDisabled");
    @lok(value="Search Toggle")
    @lpl(value="Used in the social window. The tooltip header for the search toggle button.")
    public static final lox tDC = tDq.BC("SearchToggleHeader");
    @lok(value="Click to switch between filtering the player list and searching for players to add to the list")
    @lpl(value="Used in the social window. The tooltip contents for the search toggle button.")
    public static final lox tDD = tDq.BC("SearchToggleContents");
    @lok(value="Clear Search")
    @lpl(value="Used in the social window. The tooltip header for the clear search button.")
    public static final lox tDE = tDq.BC("ClearSearchHeader");
    @lok(value="Click to clear the current search")
    @lpl(value="Used in the social window. The tooltip contents for the clear search button.")
    public static final lox tDF = tDq.BC("ClearSearchContents");
    @lok(value="Player Selection")
    @lpl(value="Used in the social window. The tooltip header for the select player button.")
    public static final lox tDG = tDq.BC("PlayerSelectionHeader");
    @lok(value="Click to select or unselect the player")
    @lpl(value="Used in the social window. The tooltip contents for the select player button.")
    public static final lox tDH = tDq.BC("PlayerSelectionContents");
    @lok(value="Send Friend Request(s)")
    @lpl(value="Used in the social window. The tooltip header for the send requests button.")
    public static final lox tDI = tDq.BC("SendRequestsHeader");
    @lok(value="Click to send friend requests to the selected players")
    @lpl(value="Used in the social window. The tooltip contents for the send requests button.")
    public static final lox tDJ = tDq.BC("SendRequestsContents");
    @lok(value="Accept Friend Request")
    @lpl(value="Used in the social window. The tooltip header for the accept request button.")
    public static final lox tDK = tDq.BC("AcceptRequestHeader");
    @lok(value="Click to accept the friend request and add this player to your friends list")
    @lpl(value="Used in the social window. The tooltip contents for the accept request button.")
    public static final lox tDL = tDq.BC("AcceptRequestContents");
    @lok(value="Unblock Player")
    @lpl(value="Used in the social window. The tooltip header for the unblock player button.")
    public static final lox tDM = tDq.BC("UnblockPlayerHeader");
    @lok(value="Click to remove this player from your blocked list")
    @lpl(value="Used in the social window. The tooltip contents for the unblock player button.")
    public static final lox tDN = tDq.BC("UnblockPlayerContents");
    @lok(value="Block Player(s)")
    @lpl(value="Used in the social window. The tooltip header for the block players button.")
    public static final lox tDO = tDq.BC("BlockPlayersHeader");
    @lok(value="Click to block the selected players")
    @lpl(value="Used in the social window. The tooltip contents for the block players button.")
    public static final lox tDP = tDq.BC("BlockPlayersContents");
    @lok(value="Mentoring")
    @lpl(value="Used in the left menu bar. The tooltip for the mentors list panel button.")
    public static final lox tDQ = tDq.BC("MentorsList");

    protected lyf(String string) {
        super("Tooltips." + string);
    }

    private lyf() {
        super("Tooltips");
    }
}

