public class ColHayvanlari extends Animals {
    private String hayvan1 = "deve";
    private String hayvan2 = "kertenkele";
    private String hayvan3 = "yılan";

    public ColHayvanlari(String hayvan1, String hayvan2, String hayvan3) {
        this.hayvan1 = hayvan1;
        this.hayvan2 = hayvan2;
        this.hayvan3 = hayvan3;
    }

    public ColHayvanlari() {

    }

    public String getHayvan1() {
        return hayvan1;
    }

    public void setHayvan1(String hayvan1) {
        this.hayvan1 = hayvan1;
    }

    public String getHayvan2() {
        return hayvan2;
    }

    public void setHayvan2(String hayvan2) {
        this.hayvan2 = hayvan2;
    }

    public String getHayvan3() {
        return hayvan3;
    }

    public void setHayvan3(String hayvan3) {
        this.hayvan3 = hayvan3;
    }
}
