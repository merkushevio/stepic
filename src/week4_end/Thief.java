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
        String from = mail.getFrom();
        String to = mail.getTo();
        if (mail instanceof MailPackage){
            int price = ((MailPackage)mail).getContent().getPrice();
            if (mail.getPrice() >= cast){
                StolenValue += mail.getPrice();
                String content = "stones instead of {content}" + ((MailPackage)mail).getContent().getContent();
                stolen = new MailPackage(from,to,new Package(content,0));
            }
            else this.stolen = (MailPackage) mail;
        }
        return stolen;
    }
}
