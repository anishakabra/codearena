package com.anisha.codearena.controller;

import com.anisha.codearena.entity.Submission;
import com.anisha.codearena.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/submit")
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    @PostMapping
    public Submission submitSolution(@RequestBody Submission submission) {
        return submissionService.submitSolution(submission);
    }
}