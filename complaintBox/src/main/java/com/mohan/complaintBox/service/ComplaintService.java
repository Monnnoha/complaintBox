package com.mohan.complaintBox.service;

import com.mohan.complaintBox.models.Complaint;
import com.mohan.complaintBox.repository.ComplaintRepo;
import org.springframework.stereotype.Service;

@Service
public class ComplaintService {
    private final ComplaintRepo complaintRepo;
    public ComplaintService(ComplaintRepo complaintRepo) {
        this.complaintRepo = complaintRepo;
    }

    public void addComplaint(String name, String email, String message) {
            Complaint complaint = new Complaint();
            complaint.setName(name);
            complaint.setEmail(email);
            complaint.setMessage(message);
            complaintRepo.save(complaint);
    }
}
