package se331.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.rest.entity.Organizer;
import se331.rest.repository.OrganizerRepository;

@Component
public class InitOrganizer implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    OrganizerRepository organizerRepository;
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        organizerRepository.save(Organizer.builder()
                .organizerName("Ivana")
                .address("West Des Moines")
                .build());
        organizerRepository.save(Organizer.builder()
                .organizerName("Adria")
                .address("Yonkers")
                .build());
        organizerRepository.save(Organizer.builder()
                .organizerName("Declan")
                .address("Hampton")
                .build());
        organizerRepository.save(Organizer.builder()
                .organizerName("Jakub")
                .address("Absecon")
                .build());
        organizerRepository.save(Organizer.builder()
                .organizerName("Gleb")
                .address("Pembroke Pines")
                .build());
        organizerRepository.save(Organizer.builder()
                .organizerName("Odilia")
                .address("Freehold")
                .build());

    }
}