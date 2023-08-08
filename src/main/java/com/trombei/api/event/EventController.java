package com.trombei.api.event;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @GetMapping("/events")
    public List<Event> list() {
        List<Event> events = new ArrayList<Event>();
        events.add(new Event("Niver do theusinho da Bike"));
        return events;
    }
}