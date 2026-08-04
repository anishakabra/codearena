package com.anisha.codearena.service;

import com.anisha.codearena.entity.Submission;
import com.anisha.codearena.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubmissionService {

    @Autowired
    private SubmissionRepository submissionRepository;

    public Submission submitSolution(Submission submission) {

        // Temporary verdict
        submission.setVerdict("Pending");

        return submissionRepository.save(submission);
    }
}