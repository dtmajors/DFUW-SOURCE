/*
 * Decompiled with CFR.
 */
public class mcp
extends lzh {
    private static final mcp uwK = new mcp();
    @lok(value="Claiming the $(Resource.NameSingular) has been interrupted.")
    @lpl(value="Message shown to player when he unsuccessfully tries to open a relic chest.")
    public static final lox uwL = uwK.a("UnlockingRelicChestFailed", mcp.Bl("Resource"));
    @lok(value="There is already a $(Resource.NameSingular) placed on this $(Resource.NameSingular).")
    @lpl(value="Message shown to player when he tries to place a relic on an altar which already has one.")
    public static final lox uwM = uwK.a("AltarHasRelic", mcp.Bl("Relic"), mcp.Bl("Resource"));
    @lok(value="There is currently no $(Relic.NameSingular) to steal from this $(Resource.NameSingular).")
    @lpl(value="Message shown to player when he tries to steal a relic from an altar which does not have one.")
    public static final lox uwN = uwK.a("AltarDoesNotHaveRelic", mcp.Bl("Relic"), mcp.Bl("Resource"));
    @lok(value="The $(Resource.NameSingular) is being used already!")
    @lpl(value="Message shown to player when he tries to acquire a lock on an altar which has been already locked from another request.")
    public static final lox uwO = uwK.a("AltarLocked", mcp.Bl("Resource"));
    @lok(value="Stealing from $(Resource.NameSingular) failed as there is no relic to steal!")
    @lpl(value="Message shown to player when he tries to steal a relic from an altar which has none.")
    public static final lox uwP = uwK.a("AltarStealingFailedNoRelic", mcp.Bl("Resource"));
    @lok(value="Stealing from $(Resource.NameSingular) failed as the church is currently under protection.")
    @lpl(value="Message shown to player when he tries to steal a relic from an altar which is protected.")
    public static final lox uwQ = uwK.a("AltarStealingFailedProtected", mcp.Bl("Resource"));
    @lok(value="You need to bring the $(Resource.NameSingular) health, down to 0 before you can steal the relic.")
    @lpl(value="Message shown to player when he tries to steal a relic from an altar which is still enabled.")
    public static final lox uwR = uwK.a("AltarStealingFailedHealth", mcp.Bl("Resource"));
    @lok(value="You can't currently place another relic here as $(Resource.NameSingular) already has a relic.")
    @lpl(value="Message shown to player when he tries to place a relic on an altar which has already one.")
    public static final lox uwS = uwK.a("AltarPlacingFailedHasRelic", mcp.Bl("Resource"));
    @lok(value="You have already initiated an interaction with this $(Resource.NameSingular). Have patience!")
    @lpl(value="Message shown to player when he tries to interact with an altar while there is a pending request.")
    public static final lox uum = uwK.a("PendingRequest", mcp.Bl("Resource"));
    @lok(value="Placement on this $(Resource.NameSingular) has been interrupted.")
    @lpl(value="Message shown to player when he tries to place a relic on an altar while there is a pending request.")
    public static final lox uwT = uwK.a("PlaceInteractionFailed", mcp.Bl("Resource"));
    @lok(value="Stealing from this $(Resource.NameSingular) has been interrupted.")
    @lpl(value="Message shown to player when he tries to steal a relic from an altar while there is a pending request.")
    public static final lox uwU = uwK.a("StealInteractionFailed", mcp.Bl("Resource"));
    @lok(value="Sacrifice of the $(Resource.NameSingular) has been interrupted.")
    @lpl(value="Message shown to player when he tries to sacrifice a relic and fails.")
    public static final lox uwV = uwK.a("SacrificeInteractionFailed", mcp.Bl("Resource"));
    @lok(value="You do not possess a $(Resource.NameSingular) to sacrifice.")
    @lpl(value="Message shown to player when he tries to sacrifice a relic while he has none.")
    public static final lox uwW = uwK.a("PlayerHasNoRelic", mcp.Bl("Resource"));
    @lok(value="You can not pick up this relic while your newbie protection is active.")
    @lpl(value="Message shown to player when he unsuccessfully tries to open a relic chest because newbie protection is active.")
    public static final lox uwX = uwK.BC("NewbieProtectionActive");
    @lok(value="You're already trying to drop the $(Resource.NameSingular).")
    @lpl(value="Message shown to player when he tries to drop a relic while there is a pending request.")
    public static final lox uwY = uwK.a("DropPendingRequest", mcp.Bl("Resource"));
    @lok(value="You cannot ride the $(Mount.NameSingular) while you are carrying the $(Relic.NameSingular).")
    @lpl(value="Message shown to player when he tries to drop a relic while there is a pending request.")
    public static final lox uwZ = uwK.a("CarryRelicNoMount", mcp.Bl("Mount"), mcp.Bl("Relic"));
    @lok(value="Beware! The powers granted to you for your recent sacrifice have now expired.")
    @lpl(value="Message shown to player when he loses the relic buff.")
    public static final lox uxa = uwK.BC("RelicBuffExpired");
    @lok(value="You're unable to steal from the $(Resource.NameSingular) as the church is currently under protection!")
    @lpl(value="Message shown to player when he tries to steal/get a relic from the church while city is under protection.")
    public static final lox uxb = uwK.a("AltarProtected", mcp.Bl("Resource"));
    @lok(value="You're unable to steal from the $(Resource.NameSingular) as there is nothing to steal!")
    @lpl(value="Message shown to player when he tries to get a relic from a church while there is none.")
    public static final lox uxc = uwK.a("AltarNoRelic", mcp.Bl("Resource"));
    @lok(value="You failed for an unfathomable reason. Please try again!")
    @lpl(value="Message shown to player when he tries to get/place a relic in a church and something really wired happen :).")
    public static final lox uxd = uwK.BC("NoPendingRequest");
    @lok(value="Carry the $(Resource.NameSingular) to your clan's church to activate it's power. You may also sacrifice it at an Altar of Immolation to become a Champion of Agon! You cannot use any transport skills apart from Sprint while carrying a relic but you may drop it at any time using the Drop key. (Default L)")
    @lpl(value="Message shown to player when he acquires a relic.")
    public static final lox uxe = uwK.a("RelicInfoMessage", mcp.Bl("Resource"));
    @lok(value="A new champion of Agon has appeared!")
    @lpl(value="Global Message shown to all online players when a new champion appears.")
    public static final lox uxf = uwK.BC("RelicChampionBirth");
    @lok(value="A champion of Agon has died!")
    @lpl(value="Global Message shown to all online players that a champion losts his superpowers.")
    public static final lox uxg = uwK.BC("RelicChampionNoMore");
    @lok(value="A champion of Agon has logged in!")
    @lpl(value="Message shown to all online champions that another champion just logged in.")
    public static final lox uxh = uwK.BC("RelicChampionLoggedIn");
    @lok(value="A champion of Agon has logged out!")
    @lpl(value="Message shown to all online champions that another champion just logged out.")
    public static final lox uxi = uwK.BC("RelicChampionLoggedOut");
    @lok(value="A champion of Agon has lost the love of Gods!")
    @lpl(value="Message shown to all online champions that another champion just logged in.")
    public static final lox uxj = uwK.BC("RelicChampionExpired");

    protected mcp(String string) {
        super("RelicAltars." + string);
    }

    private mcp() {
        super("RelicAltars");
    }
}

