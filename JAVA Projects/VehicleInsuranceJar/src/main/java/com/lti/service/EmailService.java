package com.lti.service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import com.lti.dto.StatusDto;
import com.lti.dto.StatusDto.StatusType;

@Component
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;
    
	@Autowired
	private Configuration config;
    
    public StatusDto sendEmailForNewRegistration(String email,String text,String subject) {
    	StatusDto dto = new StatusDto();
    	dto.setStatus(StatusType.FAILED);
        try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom("lti.generalinsurance.group5@outlook.com");
			message.setTo(email);
			message.setSubject(subject);
			message.setText(text);
			mailSender.send(message);
			dto.setStatus(StatusType.SUCCESS);
			dto.setMessage("Email sent!");
			return dto;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			dto.setMessage(e.getMessage());
		}
        return dto;
    }
    
	public StatusDto sendEmail(String email,String subject, Map<String, Object> model, String template) {
		StatusDto response = new StatusDto();
		MimeMessage message = mailSender.createMimeMessage();
		try {
			// set mediaType
			MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
					StandardCharsets.UTF_8.name());
			// add attachment
			helper.addAttachment("logo.png", new ClassPathResource("logo.png"));

			Template t = config.getTemplate(template);
			String html = FreeMarkerTemplateUtils.processTemplateIntoString(t, model);

			helper.setTo(email);
			helper.setText(html, true);
			helper.setSubject(subject);
			helper.setFrom("lti.generalinsurance.group5@outlook.com");
			mailSender.send(message);

			response.setMessage("mail send to : " + email);
			response.setStatus(StatusType.SUCCESS);

		} catch (MessagingException | IOException | TemplateException e) {
			response.setMessage("Mail Sending failure : "+e.getMessage());
			response.setStatus(StatusType.FAILED);
		}

		return response;
	}
}