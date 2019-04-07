# An Information Registration Application

**2018-2019 Bahar Yarıyılı <br>
BLM3520 Mobil Programlamaya Giriş <br>
Ödev 2**
 <br> <br>
## Ders Yürütücüsü
[Dr. Öğr. Üyesi M. Amaç Güvensan][ogr]
 <br> <br>
## Özet
Android’de uygulama geliştirmede kullanılan temel bileşenlerin öğrenilmesi için hazırlanan bir
uygulamadır. Uygulamada şu bileşenler kullanılmıştır: *EditText, TextView, Button, RecyclerView,
TableView; intent, toast, intent.putExtra.*
 <br> <br>
## Aktiviteler
- ## MainActivity
  Uygulama açılır açılmaz gelen aktivitedir. Bu aktivitede kullanıcıdan **kullanıcı adı** *(username)* ve **şifre**
*(password)* girmesi istenilir. Doğru *kullanıcı adı* ve *şifre* girilene kadar sonraki aktiviteye geçmez.
Uygulamada geçerli olan kullanıcı adı **"admin"** ve şifre **"password"** şeklindedir.

- ## FormActivity
  *MainActivity*’deki bilgiler doğru girildikten sonra *FormActivity* açılır. Kullanıcıdan **isim, soyisim, tc
kimlik no, telefon no, eposta adresi** ve **fotoğraf** istenir. **Kaydet** *(save)* tuşuna basıldığında bu bilgiler
**intent**’in içerisine **putExtra** ile yerleştirilir ve bir sonraki aktiviteye gönderilir.
  
- ## ListActivity
  *FormActivity*’den gelen bilgiler üst tarafta gösterilir. Alt tarafta ise **recycler view** ile **ders adı** ve
**notları** gösterilir.
  
- ## CourseActivity
  *ListActivity*’den seçilen dersle ilgili bilgiler yer alır. Gösterilen bilgiler şu şekildedir; *Ders Adı, Ders
Öğrenci Sayısı, Ders Not Ortalaması*
 <br> <br>
## Hazırlayan
A. Bilal Güvenç <br>
16011069 

[ogr]: http://avesis.yildiz.edu.tr/amac/
