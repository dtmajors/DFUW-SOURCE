/*
 * Decompiled with CFR.
 */
public class mbq
extends mbp {
    private static final mbq ulc = new mbq();
    @lok(value="An error occurred while trying to process your request!")
    @lpl(value="Displayed when the request to change the political stance between two clans fails due to a non-specific un-handled error")
    public static final lox rXy = ulc.BC("GenericError");
    @lok(value="A political stance change operation is already in progress... please wait for it to complete before issuing another request")
    @lpl(value="Displayed when the request to change the political stance between two clans fails due to an existing request being in-progress")
    public static final lox uld = ulc.BC("PoliticalStanceChangeInProgress");
    @lok(value="You cannot change the political stance between the clans as you are not a member of the clan!")
    @lpl(value="Displayed when the request to change the political stance between two clans fails due to the requesting player not (or no longer) being a clan member")
    public static final lox ubl = ulc.BC("RequestingPlayerNotClanMember");
    @lok(value="You do not have permission to change the political stance for your clan")
    @lpl(value="Displayed when the request to change the political stance between two clans fails due to the requesting clan member not having the required permission")
    public static final lox ubr = ulc.BC("PermissionDenied");
    @lok(value="A stance of war cannot be set, war must be declared through conquest")
    @lpl(value="Displayed when the request to change the political stance between two clans fails due to the fact that war cannot be set, but must be declared through conquest")
    public static final lox ule = ulc.BC("WarCannotBeSet");
    @lok(value="You cannot end a war, it must expire... the war between your clan and $(ClanName) is due to expire in $(WaitTime)")
    @lpl(value="Displayed when the request to change the political stance between two clans fails due to the fact that wars must expire, they cannot be ended by changing the political stance")
    public static final lox ulf = ulc.a("WarMustExpire", mbq.Bk("ClanName"), mbq.Bi("WaitTime"));
    @lok(value="You cannot change the political stance yet, as it was set too recently... You must wait $(WaitTime) before the stance can be changed again")
    @lpl(value="Displayed when the request to change the political stance between two clans fails due to the stance having been set too recently to change it again")
    public static final lox ulg = ulc.a("TooSoonToChangeStance", mbq.Bi("WaitTime"));
    @lok(value="You cannot change the political stance at this time, due to a conquest initiation request currently being processed")
    @lpl(value="Displayed when the request to change the political stance between two clans fails due to a conquest initiation request being processed")
    public static final lox ulh = ulc.BC("PoliticalStanceLockedDueToConquest");
    @lok(value="The stance of $(Stance) already exists between your two clans")
    @lpl(value="Displayed when the request to change the political stance between two clans fails due to the stance already being set")
    public static final lox uli = ulc.a("StanceAlreadySet", mbq.b("Stance", bcr.class));
    @lok(value="The political stance between your clan and $(ClanName) has been changed to $(Stance)")
    @lpl(value="Displayed when the request to change the political stance between two clans succeeds")
    public static final lox ulj = ulc.a("StanceChanged", mbq.Bk("ClanName"), mbq.b("Stance", bcr.class));

    protected mbq(String string) {
        super("ChangeResults." + string);
    }

    private mbq() {
        super("ChangeResults");
    }
}

