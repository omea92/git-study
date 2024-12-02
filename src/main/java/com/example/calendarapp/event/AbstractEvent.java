package com.example.calendarapp.event;

import java.time.ZonedDateTime;

public abstract class AbstractEvent implements Event {
    private String title;
    private ZonedDateTime startAt;
    private ZonedDateTime endAt;
}
