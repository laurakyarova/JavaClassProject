package class15;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chrome=new ChromeDriver();
        chrome.navigate().to("https://www.facebook.com/"); //opens page
        System.out.println(chrome.getTitle());  //gets the title
        Thread.sleep(3000);//keeps it open for 3 seconds
        chrome.navigate().to("https://www.amazon.com/");
        System.out.println(chrome.getTitle());
        Thread.sleep(3000);
        chrome.close();  //closes the page

    }
}
