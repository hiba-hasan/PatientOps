package org.patientops.patientservice.mapper;

import org.patientops.patientservice.dto.PatientResponse;
import org.patientops.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponse toDTO(Patient patient){
        PatientResponse patientResponse=new PatientResponse();
        patientResponse.setId(patient.getId().toString());
        patientResponse.setName(patient.getName());
        patientResponse.setAddress(patient.getAddress());
        patientResponse.setEmail(patient.getEmail());
        patientResponse.setDob(patient.getDob().toString());


        return patientResponse;
    }
}
