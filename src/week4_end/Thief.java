package week4_end;


public class Thief implements MailService{
    private int cast;
    private int StolenValue;
    private MailPackage stolen;

    public int getStolenValue() {
        return StolenValue;
    }


    public Thief(int cast) {
        this.cast = cast;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage){
            if (mail.getPrice() >= cast){
                StolenValue += mail.getPrice();
                stolen = new MailPackage(mail.getFrom(),mail.getTo(),new Package("stones instead of {content}",0));
            }
            else this.stolen = (MailPackage) mail;
        }
        return stolen;
    }
}
