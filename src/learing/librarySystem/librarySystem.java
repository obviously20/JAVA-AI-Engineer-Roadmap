package learing.librarySystem;

import java.util.ArrayList;
import java.util.Scanner;

public class librarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("-------------欢迎来到图书管理系统-------------");
            System.out.println("1.添加图书");
            System.out.println("2.显示所有图书");
            System.out.println("3.根据书名查询图书");
            System.out.println("4.删除图书");
            System.out.println("5.修改图书信息");
            System.out.println("6.退出系统");
            System.out.println("请输入您的选择：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addBook(books);
                    break;
                case 2:
                    displayBooks(books);
                    break;
                case 3:
                    queryBook(books);
                    break;
                case 4:
                    deleteBook(books);
                    break;
                case 5:
                    updateBook(books);
                    break;
                case 6:
                    System.out.println("-------------谢谢使用-------------");
                    break loop;
                default:
                    System.out.println("-------------您的输入有误-------------");
                    break;
            }
        }
    }


    private static void addBook(ArrayList<Book> books) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        String id;
        while (true) {
            System.out.println("请输入图书的编号：");
            id = sc.next();
            //判断id是否唯一
            boolean isUnique = idIsUnique(books, id);
            if (isUnique) {
                System.out.println("该id已存在");
            } else {
                break;
            }
        }
        book.setId(id);
        System.out.println("请输入图书的书名：");
        String name = sc.next();
        book.setName(name);
        System.out.println("请输入图书的作者：");
        String author = sc.next();
        book.setAuthor(author);
        System.out.println("请输入图书的价格：");
        double price = sc.nextDouble();
        book.setPrice(price);
        books.add(book);
        System.out.println("添加图书成功");

    }


    public static void displayBooks(ArrayList<Book> books) {
        if (books.size() == 0) {
            System.out.println("当前无图书信息,请添加后查询");
            return;
        }
        System.out.println("图书编号\t图书书名\t图书作者\t图书价格");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getAuthor() + "\t" + book.getPrice());
        }
    }


    public static void queryBook(ArrayList<Book> books) {
        Scanner sc = new Scanner(System.in);
        if (books.size() == 0) {
            System.out.println("当前无图书信息,请添加后查询");
            return;
        }
        System.out.println("请输入要查询的图书书名：");
        String name = sc.next();

        int index = queryBookByName(books, name);
        if(index == -1) {
            System.out.println("该书名不存在");
            return;
        }else if(index >= 0) {
            Book book = books.get(index);
            System.out.println("图书编号\t图书书名\t图书作者\t图书价格");
            System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getAuthor() + "\t" + book.getPrice());
        }
    }

    //可以删除图书，通过编号删除，删除成功后，返回到菜单
    public static void deleteBook(ArrayList<Book> books) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的图书编号：");
        String id = sc.next();
        int index = queryBookById(books, id);
        if(index == -1) {
            System.out.println("该编号不存在");
            return;
        }else if(index >= 0) {
            books.remove(index);
            System.out.println("删除图书成功");
        }
    }

    //可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。
    public static void updateBook(ArrayList<Book> books) {
        //编号不可修改-->那就根据编号来作为修改图书的依据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的图书编号：");
        String id = sc.next();
        int index = queryBookById(books, id);
        if(index == -1) {
            System.out.println("该编号不存在");
            return;
        }else if(index >= 0) {
            System.out.println("请输入图书的书名：");
            String name = sc.next();
            books.get(index).setName(name);

            System.out.println("请输入图书的作者：");
            String author = sc.next();
            books.get(index).setAuthor(author);

            System.out.println("请输入图书的价格：");
            double price = sc.nextDouble();
            books.get(index).setPrice(price);

            System.out.println("修改图书成功");
        }
    }

    //id唯一
    public static boolean idIsUnique(ArrayList<Book> books, String id) {
        /*for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(id)) {
                return false;
            }
        }
        return true;*/
        return queryBookById(books, id) >=0;
    }

    //根据书名查询图书，返回下标
    public static int queryBookByName(ArrayList<Book> books, String name) {
        int index = -1;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(name)) {
                index = i;
                break;
            }
        }
        return index;
    }
    //根据id查询图书，返回下标
    public static int queryBookById(ArrayList<Book> books, String id) {
        int index = -1;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

}

