package io.github.greekromansmythology;

public enum States {
    KY("KY", "Kentucky", "The Bluegrass State"),
    FL("FL", "Florida", "The Sunshine State");

    private final String abbreviation;
    private final String fullName;
    private final String stateMotto;

    States(String abbreviation, String fullName, String stateMotto) {
        this.abbreviation = abbreviation;
        this.fullName = fullName;
        this.stateMotto = stateMotto;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getFullName() {
        return fullName;
    }

    public String getStateMotto() {
        return stateMotto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(abbreviation)
                .append(" (")
                .append(fullName)
                .append(")");
        return sb.toString();
    }
}
