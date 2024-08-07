Feature: US1008 kullanici coklu eleman aratir.

  Scenario Outline: TC16 kullanici coklu arama yapabilmeli

    Given kullanici "toUrl" anasayfaya gider
    Then arama kutusuna "<aranacakKelimeler>" yazip aratir
    Then 5 saniye bekler
    And arama sonucunda urun bulunabildigini test eder
    Then 1 saniye bekler
    And sayfayi kapatir

    Examples:
      | aranacakKelimeler |
      | phone             |
      | java              |
      | samsung           |
      | apple             |
      | nutella           |

