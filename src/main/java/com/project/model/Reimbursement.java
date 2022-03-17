package com.project.model;

public class Reimbursement {
	
	private int employeeId;
	private int amount;
	private String purpose;
	private String status;
	private int requestId;
	
	public Reimbursement() {
		super();
	}

	public Reimbursement(int employeeId, int amount, String purpose, String status, int requestId) {
		super();
		this.employeeId = employeeId;
		this.amount = amount;
		this.purpose = purpose;
		this.status = status;
		this.requestId = requestId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + employeeId;
		result = prime * result + ((purpose == null) ? 0 : purpose.hashCode());
		result = prime * result + requestId;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement other = (Reimbursement) obj;
		if (amount != other.amount)
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (purpose == null) {
			if (other.purpose != null)
				return false;
		} else if (!purpose.equals(other.purpose))
			return false;
		if (requestId != other.requestId)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reimbursement [employeeId=" + employeeId + ", amount=" + amount + ", purpose=" + purpose + ", status="
				+ status + ", requestId=" + requestId + "]";
	}

}
