package com.example.a16011069_bilgikayituygulamasi;

public class Course
{
    public String cName, cPop, cAvg, cPnt;

    public Course (String name, String population, String gradeAvg, String grade)
    {
        cName = name;
        cPop = population;
        cAvg = gradeAvg;
        cPnt = grade;
    }
}

/*
import java.util.ArrayList;

public class Product {

    private String productName;
    private String productDescription;
    private int imageID;

    public Product() {
    }

    public Product(int imageID, String productName, String productDescription) {
        this.imageID = imageID;
        this.productName = productName;
        this.productDescription = productDescription;
    }


    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public static ArrayList<Product> getData() {
        ArrayList<Product> productList = new ArrayList<Product>();
        String[] productNames = {"Geleceği Yazanlar", "Paycell", "Tv+","Dergilik","Bip","GNC","Hesabım","Sim","LifeBox","Merhaba Umut","Yaani","Hayal Ortağım","Goller Cepte","Piri"};

        for (int i = 0; i < productNames.length; i++) {
            Product temp = new Product();
            temp.setProductName(productNames[i]);
            temp.setProductDescription("Turkcell");

            productList.add(temp);

        }


        return productList;


    }
}
 */