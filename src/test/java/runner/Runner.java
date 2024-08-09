package runner;
import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("src/test/java")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME,value = "src/test/resources/features/wip")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME,value = "stepdefinitions")
//@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME,value = "@wip")
@ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME,value = "false")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/HtmlReport.html")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, json:target/json-reports/cucumberRapor.json")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, junit:target/xml-report/cucumber.xml")
public class Runner {
}
/*
Runner classi bos bir classtir, yani bodysinda kod yoktur.
Runner classinda isleri kullandigimiz notasyonlar vardir.

@IncludeEngines("cucumber") bu classin cucumber ile calisacagini belirtir
@SelectClasspathResource("src/test/java") java kodlarini bulacagimiz dosya yolu
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME,value = "src/test/resources/features/wip")
                           feature dosyalarini nerede bulacagini gosteren dosya yolu
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME,value = "stepdefinitions")
                            feature dosyalarini java ile birlestirecek kodlarin oldugu dosya yolu
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME,value = "@wip")
                        features klasoru altinda calismasini istedigimiz feature dosyalarini
                        secebildigimiz Tag yazabiliriz

                        Bu sekilde Tag ile calistirdigimizda calismasini istedigimiz
                        feature veya scenariolari calistirmanin yaninda
                        calistirilmayacak feature senaryolari da yazip onlari skipped olarak isaretler

                        Eger sadece istedgimiz feature calissin isterseniz, feature klasoru altinda
                        yeni bir alt klasor olusturabiliriz bu klasorun icine calismasini isteidimiz klasoru atariz
                         belirlenmis bir feature uzerinde calisirken featurei wip klasoruna tasiyip
                         ONEMLI NOT; eger tum featurelar ile ilgili bir calistirma yapacaksak feature dosya ylunu duzeltmeliyiz


@ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME,value = "false")
                           calistirmak istediginiz butun senaryo featurelari gozden gecirip
                           scenario featurelari calistirmadan eksik stepdefinition varsa bize raporlamasi ve
                           eksik adimlari olusturmasi icin value=true yazmaliyiz

                           buldukten sonra tekrar false yapmaliyiz

 @ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/HtmlReport.html")
                            otomatik olarak HTML rapor olustrulmasini saglar,
                            dosya yolu html:target/cucumber-report/HtmlReport.html secildigi icin
                            Runner her calistiginda HTMLReport isminde dosya olusturup onceki raporun ustune kaydeder
                            eger raporun kaybolmasi ve uzerine kayit yapilmasini istemezseniz
                            yukaridaki parametrede dosya yolunu degistirebilirsiniz


 */
