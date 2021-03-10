package com.chamika.redditClone.service;

import com.chamika.redditClone.exception.SpringRedditException;
import com.chamika.redditClone.model.NotificationEmail;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
class MailService {

    private  final JavaMailSender mailSender;
    private  final MailContentBuilder mailContentBuilder;

    void sendMail(NotificationEmail notificationEmail){
        MimeMessagePreparator messagePreparator = mimeMessage->{
            MimeMessageHelper messageHelper= new MimeMessageHelper(mimeMessage);
            messageHelper.setFrom("Springredditclone@gmail.com");
            messageHelper.setTo(notificationEmail.getRecipient());
        };
        try{
            mailSender.send(messagePreparator);
            log.info("Activation email sent!!");
        }catch(MailException e){
            throw new SpringRedditException("Exception occurred when sending the mails"+notificationEmail.getRecipient());
        }
    }
}
