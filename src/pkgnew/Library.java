package pkgnew;

import java.util.*;

public class Library {
    private List<Book>b=new <Book>ArrayList();
    private List<Customer>c=new <Customer>ArrayList();
    void AddBook(Book bb){
        b.add(bb);
    }
    void AddCustomer(Customer cc){
        c.add(cc);
    }
    void deleteBook(int i){
        b.remove(i-1);
    }
    void deleteC(int id){
        int x=-1;
        for (int i = 0; i < c.size(); i++)
            if(c.get(i).getId()==id)
            {
                x=i;
                break;
            }
        if(x==-1)
            System.out.println("sorry but we don't have your id!");
        else
        {
            b.add(c.get(x).getB());
            c.remove(x);
            System.out.println("we hope you like our book\ngood bay and see you soon");
        }
    }

    public List<Book> getB() {
        return b;
    }

    public List<Customer> getC() {
        return c;
    }
}
