public enum Days {
    MONDAY("Duyshombu kunu texnicalyk sabak okuibuz"),
    TUESDAY("Sheishembi kunu practicalyk sabak okuibuz"),
    WEDNESDAY("Sharshembi kunu texnicalyk sabak okuibuz "),
    THURSDAY("Bishembi kunu practicalyk sabak okuibuz"),
    FRIDAY("Juma kunu texnicalyk sabak okuibuz"),
    SATURDAY("Ishembi kunu practicalyk sabak okuibuz"),
    SUNDAY("No lessons")
    ;


    private String schedule;

    Days(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Days: " +
                "Schedule = " + schedule;
    }
}
