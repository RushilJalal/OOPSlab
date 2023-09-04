import java.util.*;

class Book {
    String title, author;
    int edition;

    Book(String t, String auth, int ed)
    {
        title = t;
        author = auth;
        edition = ed;
    }

}

class Q6 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        Book books[] = new Book[6];
        for (int i = 0; i < 6; i++)
        {
            System.out.printf("Enter book %d title: ", i);
            String t = sc.next();
            System.out.printf("Enter book %d author: ", i);
            String a = sc.next();
            System.out.printf("Enter book %d edition: \n", i);
            int e = sc.nextInt();

            books[i] = new Book(t, a, e);
        }

        System.out.println("Enter author name: ");
        name = sc.next();

        boolean found = false;
        for(int i = 0; i< 6; i++)
        {
            if(name.equals(books[i].author))
            {
                found = true;
                System.out.println("i: "+i);
                System.out.println("Book title: "+books[i].title);
                System.out.println("Book edition: "+ books[i].edition);
            }
        }

    }
}
