package week4_end;

public class UntrustworthyMailWorker implements MailService {
        private MailService[] untrust;
        private RealMailService realMailService;

        public UntrustworthyMailWorker(MailService[] mail) {
            this.untrust = mail;
            realMailService = new RealMailService();
        }

        public RealMailService getRealMailService() {
            return realMailService;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            Sendable buff = null;
            for (int i = 0; i < this.untrust.length; i++) {

                if (i == 0) {
                    buff = this.untrust[0].processMail(mail);
                    continue;
                }

                buff = this.untrust[i].processMail(buff);
            }
            return getRealMailService().processMail(buff);
        }
}
