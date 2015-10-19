package week4_end;


public class Inspector implements MailService{
    private class IllegalPackageException extends RuntimeException{
        public IllegalPackageException() {
            super();
        }
    }
    private class StolenPackageException extends RuntimeException {
        public StolenPackageException() {
            super();
        }

    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage){
            String content = ((MailPackage)mail).getContent().getContent();
            if (content.contains(WEAPONS) || content.contains(BANNED_SUBSTANCE)){
                throw new IllegalPackageException();
            }
            if (content.contains("stones")){
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
