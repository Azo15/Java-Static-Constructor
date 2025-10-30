🎓 Java Öğrenci Sınıfı (Ogrenci Class) Uygulaması

Bu proje, Java’da sınıf yapısı (class structure), constructor kullanımı, static değişken/metotlar, ve giriş kontrolü (login) mantığını anlamak amacıyla hazırlanmıştır.

📄 İçerik
🧩 Ogrenci.java

Bu sınıf, bir öğrencinin temel bilgilerini tutar:

name (isim)

ogrenciNo

password

loggedIn (giriş durumu)

Ayrıca:

Static değişkenler:

counter → toplam öğrenci sayısını sayar.

college → tüm öğrenciler için ortak bölüm adını tutar.

Metotlar:

login() → öğrenci numarası ve şifre ile giriş kontrolü yapar.

getCounter() ve getCollege() → static bilgilere erişim sağlar.

toString() → öğrenci bilgilerini yazdırır.

🚀 Main.java

Farklı constructor’larla Ogrenci nesneleri oluşturur.

login() metodunu test eder.

Toplam öğrenci sayısı ve bölüm bilgilerini gösterir.

💻 Nasıl Çalıştırılır

Ogrenci.java ve Main.java dosyalarını aynı klasöre koy.

Terminal veya IDE üzerinde:

javac Ogrenci.java Main.java
java Main


Çıktıda öğrencilerin bilgilerini, giriş sonuçlarını ve toplam öğrenci sayısını görebilirsin.

🎯 Amaç

Bu proje, Java’da constructor’lar, static değişkenler/metotlar, ve nesne davranışlarını anlamak için hazırlanmıştır.
Ayrıca login kontrolü üzerinden basit bir uygulama örneği sunar.
