package week4_end;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService{
    private Logger LOGGER;

    public Spy(Logger LOGGER) {
        this.LOGGER = LOGGER;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            if (mail.getFrom().equals(AUSTIN_POWERS) || mail.getTo().equals(AUSTIN_POWERS)) {
                LOGGER.log(Level.WARNING, "Detected target mail correspondence: from {from} to {to} \"{message}\"", new Object[]{mail.getFrom(), mail.getTo(), mail.getMessage()});
            } else {
                LOGGER.log(Level.INFO, "Usual correspondence: from {from} to {to}", new Object[]{mail.getFrom(), mail.getTo()});
            }
        }
            return mail;

    }
}
