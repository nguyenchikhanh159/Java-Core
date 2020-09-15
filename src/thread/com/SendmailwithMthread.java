package thread.com;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import javax.mail.Transport;
import javax.mail.MessagingException;

public class SendmailwithMthread  {

//    private  String threadname;
//    private int value;
    private String mailer="nguyenchikhanh159@gmail.com";
    private String recipent="16520582@gmail.com";
    private String host="localhost";

//    SendmailwithMthread(String threadname, int value){
//        this.threadname=threadname;
//        this.value=value;
//        System.out.println("Create Thread" + threadname );
//    }

//    @Override
//    public void run()
//    {
//
//    }
    public void SendMail(){
        String myAccount="khanhnc@scommerce.asia";
        String myPassword="";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(myAccount, myPassword);
                    }
                });


        try {

            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress());
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(recipent));
            message.setSubject("Testing Subject");
            message.setText("Dear Mail Crawler,"
                    + "\n\n No spam to my email, please!");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

//        for (int i = 0; i < count; i++) {
//
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(from));
//            InternetAddress[] address = {new InternetAddress(to)};
//            message.setRecipients(Message.RecipientType.TO, address);
//
//            message.setSubject(subject + "JavaMail API");
//            message.setSentDate(new Date());
//
//            setHTMLContent(message);
//            message.saveChanges();
//            transport.sendMessage(message, address);
//
//        }

    }
    public static void main(String[] args) {

        SendmailwithMthread obj= new SendmailwithMthread();
        obj.SendMail();
    }
}
