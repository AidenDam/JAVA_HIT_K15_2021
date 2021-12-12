package Bai_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class News implements INews
{
    static Scanner sc = new Scanner(System.in);
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int[] rateList = new int[3];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title: " + this.title);
        System.out.println("publishDate,: " + this.publishDate);
        System.out.println("Author,: " + this.author);
        System.out.println("Content,: " + this.content);
        System.out.println("averageRate,: " + this.averageRate);
    }

    @Override
    public void Calculate() {
        float sum = 0;
        for(int i=0; i<3; i++) {
            sum += this.rateList[i];
        }
        this.averageRate = sum/3;
    }

    public void inputRateList() {
        for(int i=0; i<3; i++) {
            System.out.print("a[" + (i+1) + "]: ");
            this.rateList[i] = sc.nextInt();
        }
    }

}