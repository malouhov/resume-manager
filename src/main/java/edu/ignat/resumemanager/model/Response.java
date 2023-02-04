package edu.ignat.resumemanager.model;

import java.time.LocalDateTime;
import java.util.List;

public class Response {

    private long id;

    private Company company;

    private String vacancy;

    private LocalDateTime send;

    private Status status;

    private List<Tag> tags;

    public enum Status {

        SEND,
        TASK_RECEIVED,
        INTERVIEW,
        OFFER,
        REJECT

    }


}
