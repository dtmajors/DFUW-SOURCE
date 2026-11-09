/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFConfirmationDTO;

@XStreamAlias(value="SFConfirmationListDTO")
public class SFConfirmationListDTO
extends SFXMLSerializable {
    public List<SFConfirmationDTO> list = lcn.emv();
    public int numberOfPendingRequests = 0;
    public String pendingRequestsMessage = null;
}

