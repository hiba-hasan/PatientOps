package org.patientops.patientservice.service;

import org.patientops.patientservice.dto.PatientResponse;
import org.patientops.patientservice.mapper.PatientMapper;
import org.patientops.patientservice.model.Patient;
import org.patientops.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    PatientService(PatientRepository patientRepository){
        this.patientRepository=patientRepository;
    }

    //get all patients:
    public List<PatientResponse> getAllPatients(){
        List<Patient> patients=patientRepository.findAll();
        return patients.stream().map(PatientMapper::toDTO).toList();
    }

}
