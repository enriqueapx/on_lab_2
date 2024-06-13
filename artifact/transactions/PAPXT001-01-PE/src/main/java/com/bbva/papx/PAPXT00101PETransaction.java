package com.bbva.papx;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.papx.dto.client.ClientDTO;
import com.bbva.papx.lib.r001.PAPXR001;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PAPXT00101PETransaction extends AbstractPAPXT00101PETransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(PAPXT00101PETransaction.class);

	@Override
	public void execute() {
		PAPXR001 papxR001 = getServiceLibrary(PAPXR001.class);

		String clientId = this.getClientid();

		ClientDTO clientBD = papxR001.executeGetClient(clientId);

		if(clientBD == null){
			this.setSeverity(Severity.ENR);
		}else{
			this.setSeverity(Severity.OK);
			this.setClient(clientBD);
		}
	}

}
