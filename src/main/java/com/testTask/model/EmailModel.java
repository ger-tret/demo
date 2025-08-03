package com.testTask.model;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Table()
public class EmailModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;

    private String emailFrom;
    private String emailTo;
    private String theme;
    private String text;

    @CreationTimestamp
    private LocalDate creationTime;

    public EmailModel(Long emailId, String emailFrom, String emailTo, String theme, String text, LocalDate creationTime) {
        this.emailId = emailId;
        this.emailFrom = emailFrom;
        this.emailTo = emailTo;
        this.theme = theme;
        this.text = text;
        this.creationTime = creationTime;
    }

    public Long getEmailId() {
        return emailId;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public String getTheme() {
        return theme;
    }

    public String getText() {
        return text;
    }

    public LocalDate getCreationTime() {
        return creationTime;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCreationTime(LocalDate creationTime) {
        this.creationTime = creationTime;
    }
}
