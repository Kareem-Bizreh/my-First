package pkgnew;
import java.util.*;
public class New {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Library l=new Library();
        System.out.println("First!\twelcome to my library");
        while(true)
        {
            System.out.println("Please chose who you are:");
            System.out.println("1_The manegar\n2_the customer");
            int t=in.nextInt();
            while(t!=1 && t!=2)
            {
                System.out.println("wrong option!");
                System.out.println("Please chose who you are:");
                System.out.println("1_The manegar\n2_the customer");
                t=in.nextInt();
            }
            if(t==1)
            {
                System.out.println("hello ser!\nwhat do you want to do?");
                System.out.println("1_add book\n2_delete book");
                t=in.nextInt();
                while(t!=1 && t!=2)
                {
                    System.out.println("wrong option!");
                    System.out.println("what do you want to do?\n1_add book\n2_delete book");
                    t=in.nextInt();
                }
                if(t==1)
                    while(true)
                    {
                        System.out.println("please Enter the title and the name of the book:");
                        l.AddBook(new Book(in.next(),in.next()));
                        System.out.println("added done successfuly!\ndo you want to add more?");
                        System.out.println("1_Yes\n2_No");
                        t=in.nextInt();
                        while(t!=2 && t!=1)
                        {
                            System.out.println("wrong option!");
                            System.out.println("do you want to add more?");
                            System.out.println("1_Yes\n2_No");
                            t=in.nextInt();
                        }
                        if(t==2)
                            break;
                    }
                else
                    if(!l.getB().isEmpty())
                        while(true)
                        {
                            System.out.println("please chose the number of book you want to delete or click zero to out");
                            System.out.println("\ttitle\tauthor");
                            for (int i = 0; i < l.getB().size(); i++) {
                                System.out.println((i+1)+"\t"+l.getB().get(i).getTitle()+"\t"+l.getB().get(i).getAuthor());
                            }
                            int n=in.nextInt();
                            while(n>l.getB().size() || n<0)
                            {
                                System.out.println("wrong number!");
                                System.out.println("please chose the number of book you want to delete or click zero to out");
                                n=in.nextInt();
                            }
                            if(n!=0)
                            {
                                l.deleteBook(n);
                                System.out.println("deleted done successfuly!");
                            }
                            else
                                break;
                            System.out.println("do you want to delete more?\n1_Yes\n2_No");
                            t=in.nextInt();
                            while(t!=1 && t!=2)
                            {
                                System.out.println("wrong option!");
                                System.out.println("do you want to delete more?\n1_Yes\n2_No");
                                t=in.nextInt();
                            }
                            if(t==2)
                                break;
                            else
                                if(l.getB().isEmpty())
                                {
                                    System.out.println("oh! sorry there is no book to delete");
                                    break;
                                }
                        }
                    else
                        System.out.println("there is no book to delete");
            }
            else
            {
                System.out.println("hello ser!\nwhat do you want to do?");
                System.out.println("1_return a book\n2_take a book\n3_sell a book");
                t=in.nextInt();
                while(t!=1 && t!=2 && t!=3)
                {
                    System.out.println("wrong option!");
                    System.out.println("hello ser!\nwhat do you want to do?");
                    System.out.println("1_return a book\n2_take a book\n3_sell a book");
                    t=in.nextInt();
                }
                if(t==1)
                {
                    System.out.println("please give me your id");
                    int x=l.getC().size();
                    l.deleteC(in.nextInt());
                    while(l.getC().size()==x)
                    {
                        System.out.println("if you want to try another id click your id or click -1 to out");
                        int y=in.nextInt();
                        if(y==-1)
                            break;
                        l.deleteC(y);
                    }
                }
                else if(t==2)
                {
                    if(l.getB().isEmpty())
                        System.out.println("sorry we don't have any book at this moment");
                    else
                    {
                        System.out.println("please chose the number of book you want to take:");
                        System.out.println("\ttitle\tauthor");
                        for (int i = 0; i < l.getB().size(); i++) {
                           System.out.println((i+1)+"\t"+l.getB().get(i).getTitle()+"\t"+l.getB().get(i).getAuthor());
                        }
                        int n=in.nextInt();
                        while(n>l.getB().size() || n<0)
                        {
                            System.out.println("wrong number!");
                            System.out.println("please chose the number of book you want to take or click zero to out");
                            n=in.nextInt();
                        }
                        if(n!=0)
                        {
                            int s=l.getC().size();
                            l.AddCustomer(new Customer(l.getB().get(n-1)));
                            l.deleteBook(n);
                            System.out.println("thanks for taking from us and your id is: "+l.getC().get(s).getId());
                        }
                    }
                }
                else
                {
                    while(true)
                    {
                        System.out.println("give me the title and author of the book you want to sell");
                        l.AddBook(new Book(in.next(),in.next()));
                        System.out.println("good deel thanks\ndo you want to sell more?");
                        System.out.println("1_Yes\n2_No");
                        t=in.nextInt();
                        while(t!=1 && t!=2)
                        {
                            System.out.println("wrong option!");
                            System.out.println("do you want to sell more?");
                            System.out.println("1_Yes\n2_No");
                            t=in.nextInt();
                        }
                        if(t==2)
                            break;
                    }
                }
            }
            System.out.println();
            System.out.println("do you want to stay in the library?");
            System.out.println("1_Yes\n2_No");
            t=in.nextInt();
            while(t!=1 && t!=2)
            {
                System.out.println("wrong option!");
                System.out.println("do you want to stay in the library?");
                System.out.println("1_Yes\n2_No");
                t=in.nextInt();
            }
            if(t==2)
                break;
        }
        System.out.println("Thanks for using my library\ngood bay");
    }
}