package week4_end;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService{
    private static final Logger LOGGER = Logger.getLogger("MailMessage");


    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getFrom().equals("Austin Powers") || mail.getTo().equals("Austin Powers")){
            LOGGER.log(Level.WARNING, "Detected target mail correspondence: from {from} to {to} \"{message}\"", new Object[] {mail.getFrom(), mail.getTo(), mail.getMessage()});
        }
        else {
            LOGGER.log(Level.INFO, "Usual correspondence: from {from} to {to}", new Object[] {mail.getFrom(),mail.getTo()});
        }
            return mail;
    }
}
