public enum Weekday{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public boolean isWeekend(){
        return this == SATURDAY || this == SUNDAY;
    }
}
Weekday currentDay = ...
if (currentDay.isWeekend()){...}