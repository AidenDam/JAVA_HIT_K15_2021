package Bai_3;

import java.util.*;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<News> ArrayNews = new ArrayList();
        int choose;
        while(true) {
            System.out.println("\n---Menu---\n" +
                    "1. Insert news\n" +
                    "2. View list news\n" +
                    "3. Average rate\n" +
                    "4. Exit"
            );

            do{
                System.out.print("Enter your choose: ");
                choose = sc.nextInt();
            } while(choose < 1 && choose > 4);

            switch (choose) {
                case 1:
                    One(ArrayNews);
                    break;
                case 2:
                    Two(ArrayNews);
                    break;
                case 3:
                    Three(ArrayNews);
                    break;
                case 4:
                    System.out.println("End!!");
                    return;
            }
        }
    }

    static void One(ArrayList<News> ArrayNews) {
        News news = new News();
        sc.nextLine();
        System.out.print("Enter the title: ");  news.setTitle(sc.nextLine());
        System.out.print("Enter the publish date: "); news.setPublishDate(sc.nextLine());
        System.out.print("Enter the author: "); news.setAuthor(sc.nextLine());
        System.out.print("Enter the content: "); news.setContent(sc.nextLine());
        news.inputRateList();
        ArrayNews.add(news);
    }

    static void Two(ArrayList<News> ArrayNews) {
        for(News e : ArrayNews) {
            System.out.println("---");
            e.Display();
        }
    }

    static void Three(ArrayList<News> ArrayNews) {
        for(News e: ArrayNews) {
            e.Calculate();
            e.Display();
            System.out.println("---");
        }
    }
}