package com.testTask.service;


import com.testTask.model.EmailModel;
import com.testTask.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EmailServiceImpl implements EmailService{

    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public EmailModel sendEmail(EmailModel emailModel){
        emailModel.setCreationTime(LocalDate.now());

        try {
            SimpleMailMessage msg = new SimpleMailMessage();
            msg.setFrom(emailModel.getEmailFrom());
            msg.setReplyTo(emailModel.getEmailTo());
            msg.setSubject(emailModel.getTheme());
            msg.setText(emailModel.getText());
            javaMailSender.send(msg);

        }catch (RuntimeException e){

        } finally {
            return emailRepository.save(emailModel);
        }
    }

}
