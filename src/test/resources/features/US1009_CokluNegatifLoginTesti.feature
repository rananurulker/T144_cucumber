
  Feature: US1009 Kullanici, verilen yanlis bilgilerle giris yapamaz.

    Scenario Outline:TC17  kullanici liste olarak verilen gecersiz email ve passwordler ile
                    giris yapilamadigini test eder.

      Given kullanici toUrl adresine gider
      Then account butonuna basar
      When email olarak direkt verilen "<verilenEmail>" girer
      And password olarak direkt verilen "<verilenPassword>" girer
      And signIn butonuna basar
      Then sisteme giris yapilamadigini test eder
      And sayfayi kapatir

      Examples:
      |verilenEmail       |verilenPassword|
      |rana@gmail.com     |1234567        |
      |alperen@gmail.com  |2345678        |
      |huzur@gmail.com    |3456789        |
      |yavuz@gmail.com    |4567890        |