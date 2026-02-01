package com.mohan.complaintBox.repository;

import com.mohan.complaintBox.models.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface complaintRepo extends JpaRepository<Complaint, Long> {

}
