/*
 * Decompiled with CFR.
 */
public class lyt
extends lyi {
    private static final lyt tJi = new lyt();
    @lok(value="Join Attackers")
    @lpl(value="Displayed as the tooltip for the join attackers selection in the conquest initiator component")
    public static final lox tJj = tJi.BC("JoinAttackersTitle");
    @lok(value="Select this option to join the attackers in the challenge, only attackers can win ownership of the holding from the defenders!")
    @lpl(value="Displayed as the tooltip for the join attackers selection in the conquest initiator component")
    public static final lox tJk = tJi.BC("JoinAttackersDescription");
    @lok(value="Issue Mercenary Contract")
    @lpl(value="Displayed as the tooltip for the issue mercenary contract, for a wager percentage reward, in the conquest initiator component")
    public static final lox tJl = tJi.BC("IssueMercenaryContractWagerPercentageTitle");
    @lok(value="Select this option to issue a mercenary contract, for the selected percentage of the challenge wager... the wager percentage will be paid upon successful completion of the contract")
    @lpl(value="Displayed as the tooltip for the issue mercenary contract, for a wager percentage reward, in the conquest initiator component")
    public static final lox tJm = tJi.BC("IssueMercenaryContractWagerPercentageDescription");
    @lok(value="Issue Mercenary Contract")
    @lpl(value="Displayed as the tooltip for the issue mercenary contract, for a flat fee reward, in the conquest initiator component")
    public static final lox tJn = tJi.BC("IssueMercenaryContractFlatFeeTitle");
    @lok(value="Select this option to issue a mercenary contract, for the entered fee... the fee will be paid upon successful completion of the contract")
    @lpl(value="Displayed as the tooltip for the issue mercenary contract, for a flat fee reward, in the conquest initiator component")
    public static final lox tJo = tJi.BC("IssueMercenaryContractFlatFeeDescription");
    @lok(value="Unplaced Siege-Stone")
    @lpl(value="Displayed as the tooltip for a siege-stone icon, show to the owner attacker clan, that represents a siege-stone that can be, but has not yet been, placed")
    public static final lox tJp = tJi.BC("SiegeStoneLargeUnplacedTitle");
    @lok(value="Activate a siege-stone item near the challenged holding to place this siege-stone")
    @lpl(value="Displayed as the tooltip for a siege-stone icon, show to the owner attacker clan, that represents a siege-stone that can be, but has not yet been, placed")
    public static final lox tJq = tJi.BC("SiegeStoneLargeUnplacedDescription");
    @lok(value="Placed Siege-Stone")
    @lpl(value="Displayed as the tooltip for a siege-stone icon, show to the owner attacker clan, that represents a siege-stone that has been placed")
    public static final lox tJr = tJi.BC("SiegeStoneLargePlacedTitle");
    @lok(value="This siege-stone has been placed, but is not yet vulnerable to attack")
    @lpl(value="Displayed as the tooltip for a siege-stone icon, show to the owner attacker clan, that represents a siege-stone that has been placed")
    public static final lox tJs = tJi.BC("SiegeStoneLargePlacedDescription");
    @lok(value="Vulnerable Siege-Stone")
    @lpl(value="Displayed as the tooltip for a siege-stone icon, show to the owner attacker clan, that represents a siege-stone that has been placed, and is vulnerable to attack")
    public static final lox tJt = tJi.BC("SiegeStoneLargeVulnerableTitle");
    @lok(value="This siege-stone is vulnerable to attack, defend it!")
    @lpl(value="Displayed as the tooltip for a siege-stone icon, show to the owner attacker clan, that represents a siege-stone that has been placed, and is vulnerable to attack")
    public static final lox tJu = tJi.BC("SiegeStoneLargeVulnerableDescription");
    @lok(value="Unplaced Siege-Stone")
    @lpl(value="Displayed as the tooltip for a siege-stone icon, shown in the attacker's list, that represents a siege-stone that can be, but has not yet been, placed")
    public static final lox tJv = tJi.BC("SiegeStoneSmallUnplacedTitle");
    @lok(value="The attacker has not placed this siege-stone")
    @lpl(value="Displayed as the tooltip for a siege-stone icon, shown in the attacker's list, that represents a siege-stone that can be, but has not yet been, placed")
    public static final lox tJw = tJi.BC("SiegeStoneSmallUnplacedDescription");
    @lok(value="Placed Siege-Stone")
    @lpl(value="Displayed as the tooltip for a siege-stone icon, shown in the attacker's list, that represents a siege-stone that has been placed")
    public static final lox tJx = tJi.BC("SiegeStoneSmallPlacedTitle");
    @lok(value="The attacker has placed this siege-stone somewhere around the challenged holding!")
    @lpl(value="Displayed as the tooltip for a siege-stone icon, shown in the attacker's list, that represents a siege-stone that has been placed")
    public static final lox tJy = tJi.BC("SiegeStoneSmallPlacedDescription");
    @lok(value="Current Score")
    @lpl(value="Displayed as the tooltip for the icon displayed next to the attacker's current score")
    public static final lox tJz = tJi.BC("AttackerScoreTitle");
    @lok(value="Increase your score by doing more damage to the challenged holding's bind-stone!")
    @lpl(value="Displayed as the tooltip for the icon displayed next to the attacker's current score")
    public static final lox tJA = tJi.BC("AttackerScoreDescription");
    @lok(value="Winning Score")
    @lpl(value="Displayed as the tooltip for the icon displayed next to the currently winning attacker's score")
    public static final lox tJB = tJi.BC("WinningScoreTitle");
    @lok(value="The highest score currently achieved by an attacker... the attacker with the winning score will receive the holding, if the bind-stone is destroyed!")
    @lpl(value="Displayed as the tooltip for the icon displayed next to the currently winning attacker's score")
    public static final lox tJC = tJi.BC("WinningScoreDescription");
    @lok(value="The challenged holding's bind-stone")
    @lpl(value="Displayed as the tooltip for the icon that represents the challenged holding's bindstone")
    public static final lox tJD = tJi.BC("BindstoneIconTitle");
    @lok(value="If the bind-stone is destroyed, the defenders will lose and the attacker with the highest score will take ownership of the holding!")
    @lpl(value="Displayed as the tooltip for the icon that represents the challenged holding's bindstone")
    public static final lox tJE = tJi.BC("BindstoneIconDescription");
    @lok(value="Show In Game-Mode")
    @lpl(value="Displayed as the tooltip for the show in game-mode toggle button")
    public static final lox tJF = tJi.BC("ShowInGameModeTitle");
    @lok(value="Shows/hides the conquest challenge window, that displays the progress of this challenge while in game-mode")
    @lpl(value="Displayed as the tooltip for the show in game-mode toggle button")
    public static final lox tJG = tJi.BC("ShowInGameModeDescription");
    @lok(value="Challenge Details")
    @lpl(value="Displayed as the tooltip for the conquest information button")
    public static final lox tJH = tJi.BC("InformationTitle");
    @lok(value="Displays all information about this conquest challenge")
    @lpl(value="Displayed as the tooltip for the conquest information button")
    public static final lox tJI = tJi.BC("InformationDescription");
    @lok(value="Accept Contract")
    @lpl(value="Displayed as the tooltip for the accept mercenary contract button")
    public static final lox tJJ = tJi.BC("ContractAcceptTitle");
    @lok(value="Accepts the mercenary contract terms and begins the mercenary challenge")
    @lpl(value="Displayed as the tooltip for the accept mercenary contract button")
    public static final lox tJK = tJi.BC("ContractAcceptDescription");
    @lok(value="Counter-Offer Contract")
    @lpl(value="Displayed as the tooltip for the counter-offer mercenary contract button")
    public static final lox tJL = tJi.BC("ContractCounterOfferTitle");
    @lok(value="Rejects the current mercenary contract terms and issues a counter-offer with new termms")
    @lpl(value="Displayed as the tooltip for the counter-offer mercenary contract button")
    public static final lox tJM = tJi.BC("ContractCounterOfferDescription");
    @lok(value="Reject Contract")
    @lpl(value="Displayed as the tooltip for the reject mercenary contract button")
    public static final lox tJN = tJi.BC("ContractRejectTitle");
    @lok(value="Rejects the mercenary contract terms")
    @lpl(value="Displayed as the tooltip for the reject mercenary contract button")
    public static final lox tJO = tJi.BC("ContractRejectDescription");
    @lok(value="Create Mercenary Contract")
    @lpl(value="Displayed as the tooltip for the create mercenary contract button")
    public static final lox tJP = tJi.BC("ContractCreateTitle");
    @lok(value="Allows you to select terms for a merenary contract, and issue it to mercenary clans for their approval")
    @lpl(value="Displayed as the tooltip for the create mercenary contract button")
    public static final lox tJQ = tJi.BC("ContractCreateDescription");
    @lok(value="Clan Information")
    @lpl(value="Tooltip of the clan overview button")
    public static final lox tGb = tJi.BC("ClanInformationTitle");
    @lok(value="Displays more information about the clan")
    @lpl(value="Tooltip of the clan overview button")
    public static final lox tGc = tJi.BC("ClanInformationDescription");
    @lok(value="Select Clan")
    @lpl(value="Displayed as the tooltip for the select check-box button displayed next to each clan in the clan list in the create mercenary contract window")
    public static final lox tJR = tJi.BC("SelectMercenaryClanTitle");
    @lok(value="Selects the clan for issuing the mercenary contract to... if your selected contract terms allow for it, you can issue a contract to multiple clans at the same time")
    @lpl(value="Displayed as the tooltip for the select check-box button displayed next to each clan in the clan list in the create mercenary contract window")
    public static final lox tJS = tJi.BC("SelectMercenaryClanDescription");

    protected lyt(String string) {
        super("ConquestComponents." + string);
    }

    private lyt() {
        super("ConquestComponents");
    }
}

