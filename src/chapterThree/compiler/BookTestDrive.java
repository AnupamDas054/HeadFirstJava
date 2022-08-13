package chapterThree.compiler;

import chapterThree.compiler.Book;

public class BookTestDrive {
    public static void main(String[] args)
    {
        Book[] myBook = new Book[3];
        int x=0;
        myBook[0]=new Book();
        myBook[1]=new Book();
        myBook[2]=new Book();

        myBook[0].title = "The Grapes of Java";
        myBook[1].title = "The Java Gatsby";
        myBook[2].title = "The Java Cookbook";
        myBook[0].author = "bob";
        myBook[1].author = "sue";
        myBook[2].author = "ian";
        while (x < 3) {
            System.out.print(myBook[x].title);
            System.out.print(" by ");
            System.out.println(myBook[x].author);
            x = x + 1;
        }
    }
}
