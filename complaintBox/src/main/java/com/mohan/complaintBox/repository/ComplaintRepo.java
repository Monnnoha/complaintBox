package com.mohan.complaintBox.repository;

import com.mohan.complaintBox.models.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepo extends JpaRepository<Complaint, Long> {

}
