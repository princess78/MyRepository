package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddProducts 
{
	@FindBy(how = How.ID,using="userName")
    public static WebElement Username;
	@FindBy(how = How.ID,using="password")
    public static WebElement password;
	@FindBy(how = How.CSS,using="input[value='Login']")
    public static WebElement login;
	
	
	
	  @FindBy(how = How.XPATH,using="/html/body/main/div/div/div/div[2]/button") 
	  public static WebElement AddCName;
	  
	  @FindBy(how = How.ID,using="catgName")
	  public static WebElement CategoryNmae;
	  
	  
	  @FindBy(how = How.ID,using="catgDesc")
	  public static WebElement CategoryNmaeDesc;
	  
	  @FindBy(how = How.CSS,using="input[value='Add']") 
	  public static WebElement add;
	  
	  
	  @FindBy(how = How.XPATH,using="/html/body/main/div/div/div/form/b/i")
	  public static WebElement message;
	  
	  
	  
	  @FindBy(how = How.XPATH,using="/html/body/main/div/div/div/div[3]/button") 
	  public static WebElement AddSubCName;
	  
	  @FindBy(how = How.CSS,using="select[id='subCatgId']")
	  public static WebElement AddCatName;
	  
	  @FindBy(how = How.CSS,using="input[id='subCatgName']")
	  public static WebElement AddSubCatName;
	  
	  @FindBy(how = How.CSS,using="input[id='subCatgDesc']") 
	  public static WebElement AddSubCatDesc;
	  
	  @FindBy(how = How.CSS,using="input[value='Add']") 
	  public static WebElement AddSubCat;
	  
	  @FindBy(how = How.XPATH,using="/html/body/main/div/div/div/form/b/i")                                               
	  public static WebElement ASCmessage;
	 
	
	
	
	@FindBy(how = How.XPATH,using = "/html/body/main/div/div/div/div[1]/button")
	public static WebElement AddProduct;
	@FindBy(how = How.ID,using = "categorydropid")
	public static WebElement Cname;
	@FindBy(how = How.CSS,using = "select[id='subcategorydropid']")
	public static WebElement SCname;
	@FindBy(how = How.CSS,using = "input[id='prodid']")
	public static WebElement Pname;
	@FindBy(how = How.CSS,using = "input[id='priceid']")
	public static WebElement price;
	@FindBy(how = How.CSS,using = "input[id='quantityid']")
	public static WebElement quantity;
	@FindBy(how = How.CSS,using = "input[id='brandid']")
	public static WebElement brand;
	@FindBy(how = How.ID,using="description")
    public static WebElement description;
	@FindBy(how = How.NAME,using="input-file-preview")
    public static WebElement file;
	@FindBy(how = How.XPATH,using = "/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")
	public static WebElement Product;
	@FindBy(how = How.XPATH,using ="/html/body/main/div/div/div/form/b/i")
	public static WebElement AddProductSuccessfully;
	
	
	
	
	
	
	
	
	
	
}
