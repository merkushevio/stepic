package test.week3;


public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer{

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        return Label.OK;
    }

    @Override
    public Label processText(String text) {
        return null;
    }

    @Override
    protected String[] getKeywords() {
        return new String[0];
    }

    @Override
    protected Label getLabel() {
        return null;
    }
}
