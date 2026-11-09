/*
 * Decompiled with CFR.
 */
public class mbl
extends mbk {
    private static final mbl ujS = new mbl();
    @lok(value="An error occurred while trying to perform the clan permissions group operation!")
    @lpl(value="Displayed when an unhandled, non-specific, error occurs while attempting to perform an operation on a permissions group")
    public static final lox rXy = ujS.BC("GenericError");
    @lok(value="Invalid operation parameters!")
    @lpl(value="Displayed when the parameters of the group operation request are invalid (should be blocked by the GUI)")
    public static final lox udA = ujS.BC("InvalidOperation");
    @lok(value="You cannot perform clan permission group operations for this clan, as you are not a member!")
    @lpl(value="Displayed when the player requesting the permission group operation is not, or is no longer, a member of the clan")
    public static final lox ued = ujS.BC("PlayerNotClanMember");
    @lok(value="You do not have sufficient permissions to perform clan permission group operations!")
    @lpl(value="Displayed when the clan member requesting the permission group operation does not have the required permission to perform the operation")
    public static final lox ubr = ujS.BC("PermissionDenied");
    @lok(value="No group exists with the supplied name!")
    @lpl(value="Displayed when a clan permission group operation is encountered that targets a permission group that does not exist")
    public static final lox ujT = ujS.BC("GroupDoesNotExist");
    @lok(value="You cannot make any more permission groups, your clan already has the maximum number of groups allowed per clan!")
    @lpl(value="Displayed when a clan member attempts to create a new permission group, but the clan already has the maximum allowed number of permission groups")
    public static final lox ujU = ujS.BC("MaximumNumberOfGroupsAlreadyExist");
    @lok(value="A group with that name already exists!... Group names must be unique!")
    @lpl(value="Displayed when a clan member attempts to create a new permission group with a name that is already in use by another of the clan's permission groups (Group names must be unique)")
    public static final lox ujV = ujS.BC("GroupAlreadyExistsWithSuppliedName");
    @lok(value="Invalid permissions!")
    @lpl(value="Displayed when a request to add or remove permissions from a group contains permissions that cannot be manually assigned is encountered (should be blocked by GUI)")
    public static final lox ujW = ujS.BC("InvalidPermissions");
    @lok(value="One or more of the supplied permissions cannot be added to groups!")
    @lpl(value="Displayed when a request to add or remove permissions from a group contains permissions that cannot be manually assigned to, or removed from, groups is encountered (should be blocked by GUI)")
    public static final lox ujX = ujS.BC("IndicatedPermissionsCannotBeAddedToGroups");
    @lok(value="The removal of one or more permissions from the group is blocked by a linked permission that was not set for removal!")
    @lpl(value="Displayed when one or more of the permissions, that the removal from the group is being requested for, cannot be removed because the group contains other permissions that require the permissions that the removal of is being requested, and the request does not contain the other permissions")
    public static final lox ujY = ujS.BC("RemoveBlockedByLinkedPermission");
    @lok(value="Operation completed successfully")
    @lpl(value="Displayed when a request to perform an operation on a permission group is successfully completed")
    public static final lox uex = ujS.BC("OperationSuccessful");

    protected mbl(String string) {
        super("GroupOperationResults." + string);
    }

    private mbl() {
        super("GroupOperationResults");
    }
}

