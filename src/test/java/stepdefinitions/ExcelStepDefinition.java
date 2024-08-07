package stepdefinitions;

import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestOtomasyonuPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepDefinition {
    String satirdakiUrunIsmi;
    double satirdakiMinUrunSayisi;
    Sheet urunlerSayfasi;
    double toSayfasindaBulunanUrunSayisi;

    @Then("urun excelindeki {string} daki urunun min. miktarini ve urun ismini kaydeder")
    public void urun_excelindeki_daki_urunun_min_miktarini_ve_urun_ismini_kaydeder(String satirNoStr) throws IOException {
    String dosyaYolu="src/test/resources/urunler.xlsx";
    FileInputStream fis=new FileInputStream(dosyaYolu);
    Workbook workbook= WorkbookFactory.create(fis);
    urunlerSayfasi= workbook.getSheet("Sheet1");
    int satirNo=Integer.parseInt(satirNoStr);
    satirdakiUrunIsmi=urunlerSayfasi
            .getRow(satirNo-1)
            .getCell(0)
            .toString();

    satirdakiMinUrunSayisi=urunlerSayfasi
            .getRow(satirNo-1)
            .getCell(1)
            .getNumericCellValue();

    }

    @Then("urun ismini testotomasyonu sayfasinda aratir ve sonuc sayisini kaydeder")
    public void urun_ismini_testotomasyonu_sayfasinda_aratir_ve_sonuc_sayisini_kaydeder() {
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        testOtomasyonuPage.aramaKutusu.sendKeys(satirdakiUrunIsmi+ Keys.ENTER);

        String bulunanSonucYazisi=testOtomasyonuPage.aramaSonucuElementi.getText();
        bulunanSonucYazisi=bulunanSonucYazisi.replaceAll("\\D","");
        //bulunan sonuc sayisini nasil kaydederim
        toSayfasindaBulunanUrunSayisi=Double.parseDouble(bulunanSonucYazisi);


    }
    @Then("bulunan urun sayisinin {string} da verilen min. miktardan fazla oldugunu test eder")
    public void bulunan_urun_sayisinin_da_verilen_min_miktardan_fazla_oldugunu_test_eder(String string) {
        Assertions.assertTrue(toSayfasindaBulunanUrunSayisi>=satirdakiMinUrunSayisi);

    }
}
