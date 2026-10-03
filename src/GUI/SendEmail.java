package GUI;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail {

    public boolean sendMailNow(String body, String subject, String to, String filePath) {

        boolean flag = false;
        // SMTP configuration
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(
                        "advancesecsys1@gmail.com",
                        "bpxo vvua wskw rscf"
                    );
                }
            }
        );

        try {
            // Create message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("advancesecsys1@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);

            // Create multipart email
            Multipart multipart = new MimeMultipart();

            // Part 1: message text
            MimeBodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setText(body);
            multipart.addBodyPart(textBodyPart);

            // Part 2: file attachment
            if (filePath != null && !filePath.isEmpty()) {
                MimeBodyPart attachmentPart = new MimeBodyPart();
                DataSource source = new FileDataSource(filePath);
                attachmentPart.setDataHandler(new DataHandler(source));
                attachmentPart.setFileName(source.getName()); // auto use filename
                multipart.addBodyPart(attachmentPart);
            }

            // Set content
            message.setContent(multipart);

            // Send mail
            Transport.send(message);

            System.out.println("Email with attachment sent successfully!");
            flag = true;
        } catch (MessagingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return flag;
    }
}
