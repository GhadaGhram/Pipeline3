package Page.Object;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import driver.Driver;



public class PageObject extends Driver {
	
	WebDriver driver;
	//PageObject homepage
    private By btn_close= By.xpath("//button[contains(@class,'cls')]");
    private By btn_seconnecter=By.xpath("//label[contains(@class,'trig -df -i-ctr -fs16')]");
    private By btn_compte= By.xpath("//a[contains(@class,'-df -i-ctr -pas -hov-bg-gy05 -hov-m')]");
    //PageObject email
    private By txt_email=By.xpath("//label[contains(@class,'mdc-text-field mdc-text-field--outlined mdc-text-field--with-trailing-icon email-component')]");
	private By btn_Continue=By.xpath("//button[contains(@type,'submit')]");
	//PageObject motpasse
	private By txt_password=By.xpath("//input[contains(@name,'password')]");
	private By btn_connexion=By.xpath("//button[contains(@id,'loginButton')]");
	private By btn_mdpoublie=By.xpath("//span[contains(@class,'mdc-button__touch')]");
	
	//Home Page
	private By logo_jumia=By.xpath("//a[contains(@class,'-df -i-ctr -mra')]");
		
	//PageObject Panier
	private By btn_panier=By.xpath("//a[contains(@class,'-df -i-ctr -gy8 -hov-or5 -phs -fs16')]");
	
	//PageObject search
	private By bar_recherche=By.xpath("//input[contains(@name,'q')]");
	private By btn_rechercher=By.xpath("//button[contains(@class,'btn _prim _md -mls -fsh0')]");
	
	//Filtrer par marque 
	private By bar_marque=By.xpath("//input[contains(@class,'-oh -ban -out0 -fs14 -fh -fw -elli')]");
	//private By case_selectmarque=By.xpath("//*[@id=\"jm\"]/main/div[2]/div[2]/div/article[2]/div/a TEXT SVR");
	private By case_selectmarque=By.xpath("//a[contains(@data-value,'svr')]");
	
	//Filtrer par prix
	private By case_prixmin=By.xpath("//input[contains(@name,'min')]");
	private By case_prixmax=By.xpath("//input[contains(@name,'max')]");
	private By btn_okBy=By.xpath("//button[contains(@class,'btn _def -fsh0')]");
	
	//Sélectionner un produit
	private By select_produit=By.xpath("//img[contains(@class,'img')]");
	
	//Ajouter au panier
	private By btn_jachete=By.xpath("//button[contains(@class,'add btn _prim -pea _i -fw')]");
    private By btn_supprimer=By.xpath("//button[contains(@class,'btn _def _ti -mra')]");
	
	//Deconnexion
	 private By btn_bonjour=By.xpath("//label[contains(@class,'trig -df -i-ctr -fs16')]");
	 private By btn_deconnexion=By.xpath("//button[contains(@class,'btn _def -mvs')]");
	
	public PageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void newsLetter_close() {
	 driver.findElement(btn_close).click();
	}

	public void clickOnSeConnecter() {
		 driver.findElement(btn_seconnecter).click();
		
	}

	public void clickOnVotreCompte() {
		driver.findElement(btn_compte).click();
		
	}
	public void enterEmail(String arg1) {
		driver.findElement(txt_email).sendKeys(arg1);
	}
	
	public void clickOnContinue() {
		driver.findElement(btn_Continue).click();
		
	}
	public void enterPassword(String password) {
		System.out.println(password+"/");
		driver.findElement(txt_password).sendKeys(password);
		
	}

	public void clickOnSeconnecter2() {
		driver.findElement(btn_connexion).click();
		
	}

	public void clickMdpoublie() {
		driver.findElement(btn_mdpoublie).click(); 
	}
	
	public void checkPanierIsDisplayed() {
		driver.findElement(btn_panier).isDisplayed();	
	}
	
	public void allerHomePage() {
		driver.findElement(logo_jumia).click();
	}
	
	//Recherche 
	public void chercherProduit(String product){
		driver.findElement(bar_recherche).sendKeys(product);
	}
	
	public void cher() {
		driver.findElement(btn_rechercher).click();
	}
	
	//Filtrage par marque
	public void filtrerMarque(String marque){
		driver.findElement(bar_marque).sendKeys(marque);	
	}
	
	public void selectMarque() {
	driver.findElement(case_selectmarque).click();
}
	
	//Filtrage par prix
	public void viderPrixMin(){
		driver.findElement(case_prixmin).clear();
		driver.findElement(case_prixmin).sendKeys(Keys.DELETE);
	}
	
	public void enterPrixMin(String min){
		driver.findElement(case_prixmin).sendKeys(min);		
	}
	
	public void viderPrixMax() {
		driver.findElement(case_prixmax).sendKeys(Keys.DELETE);
		driver.findElement(case_prixmax).sendKeys(Keys.DELETE);
		driver.findElement(case_prixmax).sendKeys(Keys.DELETE);
	}
	public void enterPrixMax(String max){	
		driver.findElement(case_prixmax).sendKeys(max);	
	}
	 public void clickOk() {
		 driver.findElement(btn_okBy).click();	
	}
	 
	 //Selectionner un produit
	 public void selectProduit() {
		 driver.findElement(select_produit).click();	
	}
	
   //Ajouter au panier
	 public void ajouterAuPanier() {
		 driver.findElement(btn_jachete).click();
	 }
	 public void checkSupprimerIsDisplayed() {
		 driver.findElement(btn_supprimer).isDisplayed();
	 }
	 public void clickPanier() {
		driver.findElement(btn_panier).click();
			
		}
	 
	 
	 //Déconnexion
	 public void clickBonjour() {
		driver.findElement(btn_bonjour).click();
	 }
	 
	 public void clickDeonnexion() {
		driver.findElement(btn_deconnexion).click();
	 }


	
}
