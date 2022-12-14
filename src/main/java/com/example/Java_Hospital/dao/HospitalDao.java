package com.example.Java_Hospital.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class HospitalDao {
    private final JdbcTemplate jdbcTemplate;

    public HospitalDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getCount() {
        String sql = "select count(id) from from nation_wide_hospitals;";
        return this.jdbcTemplate.queryForObject(sql, Integer.class);
    }

    public void add(Hospital hospital) {
        String sql = "INSERT INTO 'likelion-db'.'nation_wide_hospitals' ('id', 'open_service_name', 'open_local_government_code', 'management_number', 'license_date', 'business_status', 'business_status_code', 'phone', 'full_address', 'road_name_address', 'hospital_name', 'business_type_name', 'healthcare_provider_count', 'patient_room_count', 'total_number_of_beds', 'total_area_size')" +
                "VALUES (?, ?, ?, " +
                "?, ?, ?, " +
                "?, ?, ?, " +
                "?, ?, ?, " +
                "?, ?, ?, " +
                "?);"; // 총 16개 column

        this.jdbcTemplate.update(sql, hospital.getId(), hospital.getOpenServiceName(), hospital.getOpenLocalGovernmentCode(),
                                hospital.getManagementNumber(), hospital.getLicenseDate(), hospital.getBusinessStatusCode(),
                                hospital.getBusinessStatusCode(), hospital.getPhone(), hospital.getFullAddress(),
                                hospital.getBusinessTypeName(), hospital.getHealthcareProviderCount(), hospital.getPatientRoomCount(),
                                hospital.getTotalAreaSize());


    }

}
