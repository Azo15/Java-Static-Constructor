public class Ogrenci {
    private String name;
    private int ogrenciNo;
    private String password;
    private boolean loggedIn;

    private static int counter = 0;
    private static String college = "SOFTWARE";

    // Varsayılan constructor
    public Ogrenci() {
        this.name = "Bilinmiyor";
        this.ogrenciNo = counter;
        this.password = "1234";
        this.loggedIn = false;
        counter++;
    }

    // Parametreli constructor
    public Ogrenci(String name, int ogrenciNo, String password) {
        this.name = name;
        this.ogrenciNo = ogrenciNo;
        this.password = password;
        this.loggedIn = false;
        counter++;
    }

    // Giriş kontrolü
    public boolean login(int enteredNo, String enteredPassword) {
        if (enteredNo == ogrenciNo && enteredPassword.equals(password)) {
            loggedIn = true;
            return true;
        } else {
            return false;
        }
    }

    // Static getter'lar
    public static int getCounter() {
        return counter;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String newCollege) {
        college = newCollege;
    }

    // Bilgi yazdırma
    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", ogrenciNo=" + ogrenciNo +
                ", loggedIn=" + loggedIn +
                '}';
    }
}