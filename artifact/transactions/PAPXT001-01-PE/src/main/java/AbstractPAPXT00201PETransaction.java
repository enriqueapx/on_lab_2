package com.bbva.papx;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.papx.dto.client.ClientDTO;

public abstract class AbstractPAPXT00201PETransaction extends AbstractTransaction {

    protected ClientDTO getClient() {
        return (ClientDTO) this.getParameter("client");
    }

    protected void setClient(final ClientDTO field) {
        this.addParameter("client", field);
    }
}