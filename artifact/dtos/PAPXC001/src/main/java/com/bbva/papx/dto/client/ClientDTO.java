package com.bbva.papx.dto.client;

import com.bbva.apx.dto.AbstractDTO;

/**
 * Class Name: ClientDTO
 * Description: Initial class to develop the DTO
 */

public class ClientDTO extends AbstractDTO {
	private static final long serialVersionUID = 2931699728946643245L;

	private String clientId;
	private String firstName;
	private String lastName;
	private String documentType;
	private String documentNumber;

	public ClientDTO() {
		super();
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ClientDTO{");
		sb.append("clientId='").append("*****").append('\'');
		sb.append(", firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", documentType='").append(documentType).append('\'');
		sb.append(", documentNumber='").append(documentNumber).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
