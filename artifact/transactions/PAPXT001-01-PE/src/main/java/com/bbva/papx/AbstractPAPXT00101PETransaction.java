package com.bbva.papx;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.papx.dto.client.ClientDTO;

public abstract class AbstractPAPXT00101PETransaction extends AbstractTransaction {

	public AbstractPAPXT00101PETransaction(){
	}


	/**
	 * Return value for input parameter clientId
	 */
	protected String getClientid(){
		return (String)this.getParameter("clientId");
	}

	/**
	 * Set value for ClientDTO output parameter client
	 */
	protected void setClient(final ClientDTO field){
		this.addParameter("client", field);
	}
}
