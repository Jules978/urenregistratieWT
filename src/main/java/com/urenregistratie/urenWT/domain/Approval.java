package com.urenregistratie.urenWT.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Approval")
public class Approval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "approvalID", updatable = false, nullable = false)
    private long approvalID;
    //@NotNull
    private enum approvedByEmployeeWTAdmin {UNKNOWN, APPROVED, DISMISSED}
    //@NotNull
    private enum approvedByManagerExternal {UNKNOWN, APPROVED, DISMISSED}
    
    private String commentEmployeeWTAdmin;
    private String commentManagerExternal;

    public long getApprovalID() {
        return approvalID;
    }

    public String getCommentEmployeeWTAdmin() {
		return commentEmployeeWTAdmin;
	}

	public void setCommentEmployeeWTAdmin(String commentEmployeeWTAdmin) {
		this.commentEmployeeWTAdmin = commentEmployeeWTAdmin;
	}

	public String getCommentManagerExternal() {
		return commentManagerExternal;
	}

	public void setCommentManagerExternal(String commentManagerExternal) {
		this.commentManagerExternal = commentManagerExternal;
	}

	public void setApprovalID(long approvalID) {
        this.approvalID = approvalID;
    }
}
