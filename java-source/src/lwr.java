/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFStringsConquestComponentsDTO;

public class lwr
extends lvn {
    private static final lwr tgm = new lwr();
    @lok(value="-- Free Holding --")
    @lpl(value="Text to display in holding name labels when the holding does not currently have an owner")
    public static final lox tgn = tgm.BC("FreeHoldingText");
    @lok(value="Wager:")
    @lpl(value="Text to display in the wager amount label")
    public static final lox tgo = tgm.BC("WagerText");
    @lok(value="Wager Percentage:")
    @lpl(value="Text to display in the wager percentage label")
    public static final lox tgp = tgm.BC("WagerPercentageText");
    @lok(value="Flat Fee:")
    @lpl(value="Text to display in the flat fee label")
    public static final lox tgq = tgm.BC("FlatFeeText");
    @lok(value="Enter Gold Value")
    @lpl(value="Text to display in the falt fee input before any text has been entered")
    public static final lox tgr = tgm.BC("FlatFeeDefaultText");
    @lok(value="Select a Join Option")
    @lpl(value="Text to display when no initiate/join options are selected")
    public static final lox tgs = tgm.BC("SelectInitiationOptionText");
    @lok(value="Attack Holding")
    @lpl(value="Text to display when the initate/join attackers option is selected")
    public static final lox tgt = tgm.BC("JoinAttackersText");
    @lok(value="Apply to Join Defenders")
    @lpl(value="Text to display when the apply to defenders option is selected")
    public static final lox tgu = tgm.BC("ApplyToDefendersText");
    @lok(value="Walls Left to Destroy:")
    @lpl(value="Prefix text to use when displaying the wall count to attackers")
    public static final lox tgv = tgm.BC("WallsTextAttackers");
    @lok(value="Walls Left to Defend:")
    @lpl(value="Prefix text to use when displaying the wall count to defenders")
    public static final lox tgw = tgm.BC("WallsTextDefenders");
    @lok(value="Holding Vulnerable In")
    @lpl(value="Text to display before the defenders are vulnerable")
    public static final lox tgx = tgm.BC("DefenderVulnerabilityCountdownTextAttackers");
    @lok(value="Holding Vulnerable In")
    @lpl(value="Text to display before the defenders are vulnerable")
    public static final lox tgy = tgm.BC("DefenderVulnerabilityCountdownTextDefenders");
    @lok(value="Attack the Holding Bindstone")
    @lpl(value="Text to display when the defenders are vulnerable")
    public static final lox tgz = tgm.BC("DefenderVulnerableTextAttackers");
    @lok(value="Defend the Holding Bindstone")
    @lpl(value="Text to display when the defenders are vulnerable")
    public static final lox tgA = tgm.BC("DefenderVulnerableTextDefenders");
    @lok(value="Place Siege-Stones")
    @lpl(value="Text to display when the attacker can place siege-stones")
    public static final lox tgB = tgm.BC("SiegeStonePlacementText");
    @lok(value="Siege-Stones Vulnerable In")
    @lpl(value="Text to display to attackers when counting down to attackers' siege-stones vulnerability")
    public static final lox tgC = tgm.BC("AttackerVulnerabilityCountdownTextAttackers");
    @lok(value="Enemy Siege-Stones Vulnerable In")
    @lpl(value="Text to display to defenders when counting down to attackers' siege-stones vulnerability")
    public static final lox tgD = tgm.BC("AttackerVulnerabilityCountdownTextDefenders");
    @lok(value="Defend Siege-Stones")
    @lpl(value="Text to display to attackers when attackers' siege-stones are vulnerable")
    public static final lox tgE = tgm.BC("AttackerVulnerableTextAttackers");
    @lok(value="Attack Enemy Siege-Stones")
    @lpl(value="Text to display to defenders when attackers' siege-stones are vulnerable")
    public static final lox tgF = tgm.BC("AttackerVulnerableTextDefenders");
    @lok(value="Create New Contract")
    @lpl(value="Text to display next to the button used to create a new mercenary contract")
    public static final lox tgG = tgm.BC("CreateNewMercenaryContractText");
    @lok(value="Received Mercenary Contracts")
    @lpl(value="Text to display as the title of the list of received mercenary contracts")
    public static final lox tgH = tgm.BC("ReceivedContractsTitle");
    @lok(value="Sent Mercenary Contracts")
    @lpl(value="Text to display as the title of the list of sent mercenary contracts")
    public static final lox tgI = tgm.BC("SentContractsTitle");

    protected lwr(String string) {
        super("Conquest." + string);
    }

    private lwr() {
        super("Conquest");
    }

    public static SFStringsConquestComponentsDTO exR() {
        SFStringsConquestComponentsDTO sFStringsConquestComponentsDTO = new SFStringsConquestComponentsDTO();
        sFStringsConquestComponentsDTO.freeHoldingText = tgn.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.wagerText = tgo.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.wagerPercentageText = tgp.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.flatFeeText = tgq.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.flatFeeDefaultText = tgr.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.selectInitiationOptionText = tgs.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.joinAttackersText = tgt.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.applyToDefendersText = tgu.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.wallsTextAttackers = tgv.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.wallsTextDefenders = tgw.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.defenderVulnerabilityCountdownTextAttackers = tgx.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.defenderVulnerabilityCountdownTextDefenders = tgy.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.defenderVulnerableTextAttackers = tgz.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.defenderVulnerableTextDefenders = tgA.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.siegeStonePlacementText = tgB.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.attackerVulnerabilityCountdownTextAttackers = tgC.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.attackerVulnerabilityCountdownTextDefenders = tgD.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.attackerVulnerableTextAttackers = tgE.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.attackerVulnerableTextDefenders = tgF.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.createNewMercenaryContractText = tgG.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.receivedContractsTitle = tgH.bD(new Object[0]).exA();
        sFStringsConquestComponentsDTO.sentContractsTitle = tgI.bD(new Object[0]).exA();
        return sFStringsConquestComponentsDTO;
    }
}

