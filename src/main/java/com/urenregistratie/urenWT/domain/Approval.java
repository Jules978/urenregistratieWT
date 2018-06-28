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
    @NotNull
    private enum approvedByAdminWT {UNKNOWN, APPROVED, DISMISSED}
    @NotNull
    private enum approvedByManagerExternal {UNKNOWN, APPROVED, DISMISSED}

    public long getApprovalID() {
        return approvalID;
    }

    public void setApprovalID(long approvalID) {
        this.approvalID = approvalID;
    }
}
