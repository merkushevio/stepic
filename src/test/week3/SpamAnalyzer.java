package test.week3;


public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer{
    private String keywords;
    public SpamAnalyzer(String keywords) {
        this.keywords = keywords;
    }
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++) {
            analyzers[i].
        }
        return Label.OK;
    }

    @Override
    public Label processText(String text) {
        return null;
    }

    @Override
    protected String[] getKeywords(TextAnalyzer[] analyzers) {
        return (String[])analyzers;
    }

    @Override
    protected Label getLabel() {
        return null;
    }
}