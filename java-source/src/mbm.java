/*
 * Decompiled with CFR.
 */
public class mbm
extends mbk {
    private static final mbm ujZ = new mbm();
    @lok(value="An error occurred while trying to perform the clan permissions member operation!")
    @lpl(value="Displayed when an unhandled, non-specific, error occurs when attempting to perform an operation on a clan member's permissions")
    public static final lox rXy = ujZ.BC("GenericError");
    @lok(value="A member permissions operation is already being processed, please wait for it to complete before initiating another!")
    @lpl(value="Displayed when a request to perform a permissions operation on a clan member is received while another is still being processed")
    public static final lox uka = ujZ.BC("MemberPermissionsOperationAlreadyBeingProcessed");
    @lok(value="Invalid operation parameters!")
    @lpl(value="Displayed when the parameters of the requested clan member permissions operation are invalid (should not be allowed by the GUI)")
    public static final lox udA = ujZ.BC("InvalidOperation");
    @lok(value="You do not have sufficient permissions to perform this operation!")
    @lpl(value="Displayed when the clan member attempting to perform a clan permissions operation does not have the required permission to do so")
    public static final lox ubr = ujZ.BC("PermissionDenied");
    @lok(value="You cannot perform clan member permission operations as you are not a member of the clan!")
    @lpl(value="Displayed when the clan member attempting to perform a clan permissions operation is not, or is no longer, a member of the clan")
    public static final lox ubl = ujZ.BC("RequestingPlayerNotClanMember");
    @lok(value="You cannot perform clan member permission operations on the indicated player, as they are not a member of the clan!")
    @lpl(value="Displayed when the clan member that permissions operation is targeting is not, or is no longer, a member of the clan")
    public static final lox ukb = ujZ.BC("TargetPlayerNotClanMember");
    @lok(value="Invalid permissions!")
    @lpl(value="Displayed when an attempt to add or remove a permission that cannot be manually added or removed is encountered (should be blocked by the GUI)")
    public static final lox ujW = ujZ.BC("InvalidPermissions");
    @lok(value="You cannot add permissions to, or remove permissions from, yourself!")
    @lpl(value="Displayed when a clan member is attempting to add or remove permissions from themselves (should be blocked by the GUI)")
    public static final lox ukc = ujZ.BC("TargetPlayerIsRequestingPlayer");
    @lok(value="The removal of one or more permissions from the indicated clan member is blocked by a linked permission that was not set for removal!")
    @lpl(value="Displayed when a request to remove a permission from a clan member is blocked because the clan member has a permission that requires the permission to be removed, and the remove request is not also requesting the removal of the other permission")
    public static final lox ujY = ujZ.BC("RemoveBlockedByLinkedPermission");
    @lok(value="The assignment of permissions to trial account members is not allowed!")
    @lpl(value="Displayed when a request to add a permission to a trial account member is encountered")
    public static final lox ukd = ujZ.BC("TargetPlayerIsTrialAccountMember");
    @lok(value="One or more permissions have reached their maximum assignment limit, you must remove the permission from other members before assigning it again!")
    @lpl(value="Displayed when a request to add an assignment-limited permission to a player is encountered for a permission that is already assigned to the maximum number of clan members")
    public static final lox uke = ujZ.BC("MaximumAssignmentsLimitReached");
    @lok(value="The group to add the clan member to does not exist!")
    @lpl(value="Displayed when an operation to add a clan member to a permission group is encountered and the indicated permission group does not exist (could have been renamed by another player during processing!)")
    public static final lox ujT = ujZ.BC("GroupDoesNotExist");
    @lok(value="Operation completed successfully")
    @lpl(value="Displayed when a clan permissions operation is completed successfully")
    public static final lox uex = ujZ.BC("OperationSuccessful");

    protected mbm(String string) {
        super("MemberOperationResults." + string);
    }

    private mbm() {
        super("MemberOperationResults");
    }
}

