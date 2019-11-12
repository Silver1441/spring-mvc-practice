package com.kishkan.epam.repository.impl;

import com.kishkan.epam.repository.AppointmentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AppointmentRepositoryImpl implements AppointmentRepository {
    private List<String> appointments = new ArrayList<>();

    public AppointmentRepositoryImpl() {
        appointments.add("back-end developer");
        appointments.add("front-end developer");
        appointments.add("web designer");
        appointments.add("project manager");
    }

    @Override
    public List<String> getAppointments() {
        return appointments;
    }
}
