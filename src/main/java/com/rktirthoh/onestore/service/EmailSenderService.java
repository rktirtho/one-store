package com.rktirthoh.onestore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    public void sentSimpleEmail(String toEmail,
                                String subject,
                                String body){


        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("rktirthodiu@gmail.com");
        message.setTo(toEmail);
        message.setSubject(subject);
        message.setText(body);

        mailSender.send(message);
        System.out.println("Mail Sended");

    }

    private void sedEmailWithAttachment(String toEmail,
                                        String subject,
                                        String body,
                                        String attachment) throws MessagingException {

        MimeMessage message = mailSender.createMimeMessage();

        MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
        messageHelper.setFrom("rktirthodiu@gmail.com");
        messageHelper.setTo(toEmail);
        messageHelper.setSubject(subject);
        messageHelper.setText(body);

        FileSystemResource fileSystem =
                new FileSystemResource(new File(attachment));
        messageHelper.addAttachment(fileSystem.getFilename(),fileSystem);

        mailSender.send(message);

        System.out.println("Mail send");


    }

}
