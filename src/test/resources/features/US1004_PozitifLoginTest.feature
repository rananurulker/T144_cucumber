Feature: US1004 kullanici gecerli datalarla sisteme girer
  @E2E
  Scenario: TC10 gecerli degerlerle sisteme giris yapabilmeli
    Given kullanici toUrl adresine gider
    Then account butonuna basar
    And email olarak "toGecerliEmail" girer
    And password olarak "toGecerliPassword" girer
    Then signIn butonuna basar
    And basarili giris yapilabildigini test eder
    And 3 saniye bekler
    And sayfayi kapatir