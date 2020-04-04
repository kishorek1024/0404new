package packone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel_Con {

	public static void main(String[] args) throws Exception{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Value");
		int a=s.nextInt();
		System.out.println("Enter B Value");
		int b=s.nextInt();
		System.out.println(a*b);
		
		WebDriver driver=new FirefoxDriver();
		System.out.println("Enter URL");
		String u=s.next();
		driver.get(u);
		driver.manage().window().maximize();
		System.out.println("Enter Email locator");
		String Email_Loc=s.next();
		System.out.println("Enter Email Value");
		String Email_Value=s.next();
		driver.findElement(By.id(Email_Loc)).sendKeys(Email_Value);
		
		
		
		
		
		
		
		
		
		/*FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\WD9March\\0330.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hi This is Kishore");
		bw.newLine();
		bw.append(" This is Selenium");
		bw.close();*/
		
		/*FileReader f=new FileReader("C:\\Users\\DELL\\Desktop\\WD9March\\td.txt");
		BufferedReader b=new BufferedReader(f);
		
		String s;
		
		while((s=b.readLine())!=null)
			System.out.println(s);*/
		
		/*// Identify the location of excel to create
		FileOutputStream fo=new FileOutputStream("C:\\Users\\DELL\\Desktop\\WD9March\\0329.xls");
		// Create excel file
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		// Create Sheet in created workbook
		WritableSheet ws=wwb.createSheet("Result1", 1);
		WritableSheet ws1=wwb.createSheet("Result2", 1);
		
		int a=50;
		int b=60;
		int c=a*b; int d=b-a;
		
		// Creating Cell
		Label l=new Label(0, 0, "C Value is " + c);
		Label l1=new Label(0, 0, "D Value is " + d);
		// Add cell into sheet
		ws.addCell(l); ws1.addCell(l1);
		
		wwb.write();wwb.close();*/
		
		/*// Identify the location of excel
		FileInputStream f=new FileInputStream("C:\\Users\\DELL\\Desktop\\WD9March\\td.xls");
		// Open identified excel
		Workbook wb=Workbook.getWorkbook(f);
		// Open sheet in opened excel
		Sheet s=wb.getSheet("Sheet1");
		
		int cc=s.getColumns();
		int rc=s.getRows();
		
		int i; int j;
		for(i=0; i<cc; i++){
			for(j=0; j<rc; j++){
				//System.out.println(s.getCell(i, j).getContents());
				String val=s.getCell(i, j).getContents();
				if(val.equals("kishore")==true)
					System.out.println(i + "-" + j);
			}
		}
		
		int cc=s.getColumns();
		
		int j;
		for(j=0; j<cc; j++){
			System.out.println(s.getCell(j, 0).getContents());
		}
		
		int rc=s.getRows();
		
		int i;
		for(i=0; i<rc; i++){
			System.out.println(s.getCell(0, i).getContents());
		}
		
		WebDriver driver=new FirefoxDriver();
		driver.get(s.getCell(0, 0).getContents());
		driver.manage().window().maximize();
		
		driver.findElement(By.id(s.getCell(0, 1).getContents())).sendKeys(s.getCell(0,2).getContents());
		driver.findElement(By.id(s.getCell(0, 3).getContents())).sendKeys(s.getCell(0, 4).getContents());
		
		
		
		
		
		
		
		
		
		// Identify cell and read data from identified cell
		System.out.println(s.getCell(0, 0).getContents());
		System.out.println(s.getCell(1, 0).getContents());
		*/
		

	}

}
