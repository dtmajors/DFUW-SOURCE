/*
 * Decompiled with CFR.
 */
public class mab
extends lzh {
    private static final mab tZH = new mab();
    @lok(value="Annotation ($(ID)) added with the text '$(Text)'")
    @lpl(value="Displayed to a player when a map annotation is added successfully via a command")
    public static final lox tZI = tZH.a("MapAnnotationAdded", mab.Bh("ID"), mab.Bk("Text"));
    @lok(value="Annotation with ID $(ID) has been removed")
    @lpl(value="Displayed to a player when a map annotation is removed successfully via a command")
    public static final lox tZJ = tZH.a("MapAnnotationRemoved", mab.Bh("ID"));
    @lok(value="Could not remove annotation")
    @lpl(value="Displayed to a player when a request to remove an annotation from their map fails")
    public static final lox tZK = tZH.BC("MapAnnotationRemoveFailed");
    @lok(value="Could not add annotation")
    @lpl(value="Displayed to a player when a request to add an annotation to their map fails")
    public static final lox tZL = tZH.BC("MapAnnotationAddFailed");
    @lok(value="You have $(Count) annotation(s):")
    @lpl(value="Displayed to a player when they request a list of all their map annotations")
    public static final lox tZM = tZH.a("MapAnnotationListHeader", mab.Bh("Count"));
    @lok(value="\tAnnotation ($(ID)): '$(Text)' at $(Location)")
    @lpl(value="Displayed to a player when they request a list of all their map annotations")
    public static final lox tZN = tZH.a("MapAnnotationListEntry", mab.Bh("ID"), mab.Bk("Text"), mab.Br("Location"));
    @lok(value="$(PlayerName) is online")
    @lpl(value="Displayed to a player when a friend comes online")
    public static final lox tZO = tZH.a("FriendOnline", mab.Bk("PlayerName"));
    @lok(value="$(PlayerName) is offline")
    @lpl(value="Displayed to a player when a friend goes offline")
    public static final lox tZP = tZH.a("FriendOffline", mab.Bk("PlayerName"));
    @lok(value="You are already bound to this bindstone")
    @lpl(value="Displayed to a player when they attempt to bind to the bindstone that they are already bound to")
    public static final lox tZQ = tZH.BC("BindstoneAlreadyBound");
    @lok(value="You are now bound to the bindstone in the clan holding of $(Holding)")
    @lpl(value="Displayed to a player when they bind to a bindstone in a clan holding")
    @lpk(value="se_quest_sub_completed")
    public static final lox tZR = tZH.a("BindstoneClanBound", mab.Bp("Holding"));
    @lok(value="You are no longer bound to the bindstone in the clan holding of $(Holding)")
    @lpl(value="Displayed to a player when they unbind from a bindstone in a clan holding")
    public static final lox tZS = tZH.a("BindstoneClanUnbound", mab.Bp("Holding"));
    @lok(value="You were kicked from the bindstone in the clan holding of $(Holding) by $(KickerName)")
    @lpl(value="Displayed to a player when they are kicked from a bindstone in a clan holding")
    public static final lox tZT = tZH.a("BindstoneClanKicked", mab.Bp("Holding"), mab.Bk("KickerName"));
    @lok(value="You were kicked from the bindstone in the clan holding of $(Holding)")
    @lpl(value="Displayed to a player when they are kicked from a bindstone in a clan holding, but the kicker member cannot be determined")
    public static final lox tZU = tZH.a("BindstoneClanKickedKickerUnknown", mab.Bp("Holding"));
    @lok(value="You cannot bind to the bindstone in the clan holding of $(Holding), because $(Reason)")
    @lpl(value="Displayed to a player when they try to bind to a bindstone in a clan holding, but the bind operation fails")
    public static final lox tZV = tZH.a("BindstoneClanUnavialable", mab.Bp("Holding"), mab.b("Reason", ccf.class));
    @lok(value="You are now bound to the siege-stone located in $(Location)")
    @lpl(value="Displayed to a player when they bind to a siege-stone")
    @lpk(value="se_quest_sub_completed")
    public static final lox tZW = tZH.a("BindstoneSiegeBound", mab.Br("Location"));
    @lok(value="You are no longer bound to the siege-stone located in $(Location)")
    @lpl(value="Displayed to a player when they unbind from a siege-stone")
    public static final lox tZX = tZH.a("BindstoneSiegeUnbound", mab.Br("Location"));
    @lok(value="You cannot bind to the siege-stone located in $(Location), because $(Reason)")
    @lpl(value="Displayed to a player when they try to bind to a siege-stone, but the bind operation fails")
    public static final lox tZY = tZH.a("BindstoneSiegeUnavailable", mab.Br("Location"), mab.b("Reason", ccf.class));
    @lok(value="You are now bound to the bindstone located in $(Location)")
    @lpl(value="Displayed to a player when they bind to a bindstone in an NPC city")
    @lpk(value="se_quest_sub_completed")
    public static final lox tZZ = tZH.a("BindstoneGreaterBound", mab.Br("Location"));
    @lok(value="You are no longer bound to the bindstone located in $(Location)")
    @lpl(value="Displayed to a player when they unbind from a bindstone in an NPC city")
    public static final lox uaa = tZH.a("BindstoneGreaterUnbound", mab.Br("Location"));
    @lok(value="You cannot bind to the bindstone located in $(Location), because $(Reason)")
    @lpl(value="Displayed to a player when they try to bind to a bindstone in an NPC city, but the bind operation fails")
    public static final lox uab = tZH.a("BindstoneGreaterUnavailable", mab.Br("Location"), mab.b("Reason", ccf.class));
    @lok(value="You are now bound to the bindstone located in $(Location)")
    @lpl(value="Displayed to a player when they bind to a bindstone in a chaos city")
    @lpk(value="se_quest_sub_completed")
    public static final lox uac = tZH.a("BindstoneChaosBound", mab.Br("Location"));
    @lok(value="You are no longer bound to the bindstone located in $(Location)")
    @lpl(value="Displayed to a player when they unbind from a bindstone in a chaos city")
    public static final lox uad = tZH.a("BindstoneChaosUnbound", mab.Br("Location"));
    @lok(value="You cannot bind to the bindstone located in $(Location), because $(Reason)")
    @lpl(value="Displayed to a player when they try to bind to a bindstone in a chaos city, but the bind operation fails")
    public static final lox uae = tZH.a("BindstoneChaosUnavailable", mab.Br("Location"), mab.b("Reason", ccf.class));
    @lok(value="You must be either standing, or swimming")
    @lpl(value="Displayed to a player when they try to perform an action that they must be standing or swimming to perform")
    public static final lox uaf = tZH.BC("WrongPostureMode");
    @lok(value="Your level of $(Skill.NameSingular) has increased through meditation")
    @lpl(value="Displayed to a player when one of their skills levels has increased through meditation")
    public static final lox uag = tZH.a("MeditationProgressSkill", mab.Bm("Skill"));
    @lok(value="Your $(Attribute) has increased through meditation")
    @lpl(value="Displayed to a player when one of their attributes has increased through meditation")
    public static final lox uah = tZH.a("MeditationProgressAttribute", mab.Bo("Attribute"));
    @lok(value="You are boldly going where you have never gone before! Be wary, or be dead.")
    @lpl(value="Displayed to a player when visits an uprotected tile for the first time")
    public static final lox uai = tZH.BC("VisitedNewTile");
    @lok(value="You have discovered a new area of relative safety! Within these boundaries the laws of the land apply to all!.")
    @lpl(value="Displayed to a player when visits a tile for the first time")
    public static final lox uaj = tZH.BC("VisitedNewTileProtected");
    @lok(value="Be wary, you have discovered one of the deep, dark places of the land. Here, enemies seldom know, show, or even jest about mercy!")
    @lpl(value="Displayed to a player when visits an unprotected dungeon for the first time")
    public static final lox uak = tZH.BC("VisitedNewTileDungeon");
    @lok(value="You have discovered a new deep area of relative safety! Other players can not harm you but beware the dungeon keepers!")
    @lpl(value="Displayed to a player when visits a protected dungeon for the first time")
    public static final lox ual = tZH.BC("VisitedNewTileDungeonProtected");
    @lok(value="Press Spacebar to respawn at your bindstone, or wait to auto-revive.")
    @lpl(value="Text displayed to the player when he enters gank mode to explain what space bar does.")
    public static final lox uam = tZH.BC("TapOutExplanation");
    @lok(value="Use the appropriate revive potion to revive now! When timer runs out or when you press Spacebar you will respawn at your bindstone.")
    @lpl(value="Text displayed to the player when he enters gank mode to explain what space bar does.")
    public static final lox uan = tZH.BC("TapOutExplanationInNonSafeArea");
    @lok(value="You can only place a party waypoint if you are a party leader.")
    @lpl(value="Text displayed to the player to explain that he can only place a party waypoint if he is the leader of a party.")
    public static final lox uao = tZH.BC("WaypointPartyNotInParty");
    @lok(value="You can only place a clan waypoint if you are member of a clan.")
    @lpl(value="Text displayed to the player to explain that he can only place a clan waypoint if he is a member of a clan.")
    public static final lox uap = tZH.BC("WaypointNotInClan");
    @lok(value="You do not have permission to place a clan waypoint.")
    @lpl(value="Text displayed to the player to explain that he needs to have permission to place a clan waypoint.")
    public static final lox uaq = tZH.BC("WaypointClanNoPermissions");

    protected mab(String string) {
        super("Character." + string);
    }

    private mab() {
        super("Character");
    }
}

