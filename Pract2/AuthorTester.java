import java.util.Scanner;

public class AuthorTester {   
    public static	void	main(String[]	args)	
{

        Scanner in = new Scanner(System.in);

        Author author = new Author("Александр Грибоедов",	"non",	'М'); 

        System.out.print("Введите email писателя:\n");
        author.Set_Email(in.next());
        System.out.print("\n");

        System.out.println(author);  
    }
}

    public String toString(){
        return "Имя автора: "	+name+ "\nЕго электронная почта: "	+email+	"\nЕго пол: "
                +gender;
    }
}
