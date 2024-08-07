
@smoke
Feature: US1005 kullanici gecersiz datalarla sisteme giris yapamaz

  Scenario: TC11 Gecersiz email ile sisteme giris yapilmaz
    Given kullanici toUrl adresine gider
    Then account butonuna basar
    And email olarak "toGecersizEmail" girer
    And password olarak "toGecerliPassword" girer
    When signIn butonuna basar
    Then sisteme giris yapilamadigini test eder
    And sayfayi kapatir

  Scenario: TC12 Gecerli email ile sisteme giris yapilmaz
    Given kullanici toUrl adresine gider
    Then account butonuna basar
    And email olarak "toGecerliEmail" girer
    And password olarak "toGecersizPassword" girer
    When signIn butonuna basar
    Then sisteme giris yapilamadigini test eder
    And sayfayi kapatir

  Scenario: TC13 Gecersiz email ile sisteme giris yapilmaz
    Given kullanici toUrl adresine gider
    Then account butonuna basar
    And email olarak "toGecersizEmail" girer
    And password olarak "toGecersizPassword" girer
    When signIn butonuna basar
    Then sisteme giris yapilamadigini test eder
    And sayfayi kapatir