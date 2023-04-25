class NOMATCHEXCP extends Exception {
    private String inputString;

    public NOMATCHEXCP(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String toString() {
        return "NOMATCHEXCP at line " + Thread.currentThread().getStackTrace()[2].getLineNumber() +
                ": Input string \"" + inputString + "\" does not match expected value \"India\"";
    }
}
