package test.week3;


public class checkLabels {
    public static void main(String[] args) {
        String[] keys = {"first", "second"};
        String text = "this is first test, and it is spam";
        checkLabels checkLabels = new checkLabels();
        TextAnalyzer label = new SpamAnalyzer(keys);
        System.out.println(label);
    }
    Label checkLabels(TextAnalyzer[] analyzers, String text) {
        Label label = Label.OK;
        for (TextAnalyzer analyzer : analyzers) {
            if (analyzer.processText(text) != Label.OK) {
                label = analyzer.processText(text);
                return label;
            }
        }
        return label;
    }
    //abstract class
    abstract class KeywordAnalyzer implements TextAnalyzer {
        protected abstract String[] getKeywords();
        protected abstract Label getLabel();
        public Label processText(String text) {
            for (String keyword : getKeywords()) {
                if (text.contains(keyword))
                    return getLabel();
            }
            return Label.OK;
        }
    }
    interface TextAnalyzer {
        Label processText(String text);
    }
    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }
    //SpamAnalyzer
    class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
        private String[] keywords;
        public SpamAnalyzer(String[] keywords) {
            this.keywords = keywords;
        }
        @Override
        public String[] getKeywords() {
            return keywords;
        }
        @Override
        protected Label getLabel() {
            return Label.SPAM;
        }
    }
    //NegativeTextAnalyzer
    class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    String[] negative = {":(", "=(", ":|"};
    @Override
    protected String[] getKeywords() {
        return negative;
    }
    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    }
    //TooLongTextAnalyzer
    class TooLongTextAnalyzer implements TextAnalyzer {
        private int maxLength;

        public TooLongTextAnalyzer(int maxLength) {
            this.maxLength = maxLength;
        }

        public Label processText(String text) {
            return (text.length() > maxLength) ? Label.TOO_LONG : Label.OK;
        }
    }
}
