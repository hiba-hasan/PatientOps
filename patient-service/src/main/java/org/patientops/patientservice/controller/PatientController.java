package org.patientops.patientservice.controller;

import org.apache.coyote.Response;
import org.patientops.patientservice.dto.PatientResponse;
import org.patientops.patientservice.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    PatientService patientService;
    PatientController(PatientService patientService){
        this.patientService=patientService;
    }

    @GetMapping
    public ResponseEntity<List<PatientResponse>> getAllPatients(){
        List<PatientResponse> patients=patientService.getAllPatients();
        return ResponseEntity.ok().body(patients);
    }

}
