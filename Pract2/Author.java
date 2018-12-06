public class Author 
{
    String name;
    String email;
    char gender;

    public void Set_Email(String e)
   {
        this.email = e;
    }

    public	String	get_Name()	
   {
        return name;
    }
    public	String	get_Email()	
   {
        return	email;
    }
    public	char get_Gender()
   {
        return	gender;
    }

    Author (String name, String email, char gender){  
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString()
   {
        return "Имя автора: "	+name+ "\nЕго электронная почта: "	+email+	"\nЕго пол: "
                +gender;
    }
}
