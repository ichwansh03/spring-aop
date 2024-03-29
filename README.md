## Spring Config Properties

* Repo ini membahas bagaimana cara mengkonfigurasi properties pada spring seperti konfigurasi database, view, API dll.
* Pada spring terdapat resource protocol, yakni protocol untuk mengakses file. Pada `getReource()` jika ingin mengambil resource dari classpath gunakan `classpath:/directory/file.name`. Jika file gunakan `file:///Users.directory/file.name` dan jika URL gunakan `www.yoururl.com/file_name`.
* class `Environment` digunakan untuk mengakses resource pada file `application.properties`. Lihat implementasinya di [Class ApplicationPropertiesTest](https://github.com/ichwansh03/spring-config-properties/blob/main/src/test/java/com/ichwan/configproperties/properties/ApplicationPropertiesTest.java) atau akses menggunakan annotation `@Value` pada fieldnya seperti pada class [Class ValueTest](https://github.com/ichwansh03/spring-config-properties/blob/main/src/test/java/com/ichwan/configproperties/values/ValueTest.java)
* Properties file juga dapat dipisah seperti konsep modularization dengan menggunakan annotation `@PropertySource`
* Profile test digunakan ketika ingin mengaktifkan test berdasarkan konfigurasi pada `application.properties` sesuai dengan nama profile yg dibuat. Lihat implementasinya di [Class ProfileTest](https://github.com/ichwansh03/spring-config-properties/blob/main/src/test/java/com/ichwan/configproperties/profile/ProfileTest.java)
* Membuat binding properties dan automation agar tidak lagi menggunakan cara manual seperti pada class [Class ConfigPropertiesTest](https://github.com/ichwansh03/spring-config-properties/blob/main/src/test/java/com/ichwan/configproperties/configproperties/ConfigPropertiesTest.java). Fitur ini sering digunakan pada spring boot.

## Spring AOP

* Aspect Oriented Programming (AOP) merupakan salah satu library dari spring yang mendukung penggunaan sebuah aspect pada banyak method. Contohnya seperti pembuatan spesifikasi log namun cukup dibuat sekali saja dengan anotasi `@Aspect` dan log tersebut nantinya dapat digunakan pada semua method.
* Contoh penerapannya seperti anotasi `@Transactional` yang dapat digunakan pada method yg berhubungan dengan database transaction.
* Dokumentasi resmi dari AspectJ [Docs](https://eclipse.dev/aspectj/doc/released/adk15notebook/index.html)