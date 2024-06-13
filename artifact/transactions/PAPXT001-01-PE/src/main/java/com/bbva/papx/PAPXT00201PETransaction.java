package com.bbva.papx;

import com.bbva.papx.dto.client.ClientDTO;
import com.bbva.papx.lib.r001.PAPXR001;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PAPXT00201PETransaction extends AbstractPAPXT00201PETransaction {

    private static final Logger LOGGER = LoggerFactory.getLogger(PAPXT00201PETransaction.class);

    @Override
    public void execute() {
        PAPXR001 papxR001 = getServiceLibrary(PAPXR001.class);

        ClientDTO clientToUpdate = this.getClient();

        boolean isUpdated = papxR001.executeUpdateClient(clientToUpdate);

        if (!isUpdated) {
            this.setSeverity(Severity.ENR);
        } else {
            this.setSeverity(Severity.OK);
        }
    }
}