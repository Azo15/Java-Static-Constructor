public class Main {
    public static void main(String[] args) {
        Ogrenci og1 = new Ogrenci("Azo", 123, "mypassword");
        Ogrenci og2 = new Ogrenci("Ayşe", 124, "abc123");
        Ogrenci og3 = new Ogrenci(); // default constructor

        System.out.println(og1.toString());
        System.out.println(og2.toString());
        System.out.println(og3.toString());

        System.out.println("\nGiriş denemesi:");
        System.out.println("og1 giriş başarılı mı? " + og1.login(123, "mypassword"));
        System.out.println("og2 giriş başarılı mı? " + og2.login(124, "yanlisSifre"));
        System.out.println("og3 giriş başarılı mı? " + og3.login(2, "123456")); // numara 2 çünkü counter 0'dan başlıyor

        System.out.println("\nToplam öğrenci sayısı: " + Ogrenci.getCounter());
        System.out.println("Bölüm: " + Ogrenci.getCollege());
    }
}