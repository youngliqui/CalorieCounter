public enum Months {
    JANUARY("ЯНВАРЬ"), FEBRUARY("ФЕВРАЛь"), MARCH("МАРТ"), APRIL("АПРЕЛЬ"),
    MAY("МАЙ"), JUNE("ИЮНЬ"), JULY("ИЮЛЬ"), AUGUST("АВГУСТ"), SEPTEMBER("СЕНТЯБРЬ"),
    OCTOBER("ОКТЯБРЬ"), NOVEMBER("НОЯБРЬ"), DECEMBER("ДЕКАБРЬ");

    private final String translation;
    Months(String translation) {
        this.translation = translation;
    }

    public String getTranslation(){
        return translation;
    }
}
