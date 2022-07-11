package Supermark;
import java.util.ArrayList;

public class Usuario {
		private static int counter = 0;
		  private static ArrayList<Usuario> Usuario = new ArrayList<Usuario>(); 
		  private int id;
		  private String name;
		  private String username;
		  private static String password;
		  
	public static void main(String[] args) {
				System.out.println("USUARIO: + producto");
				Usuario("adolfo", "adolfo");
			}

		  /*public Usuario(String nm, String usernm, String passwd) {
			Usuario.add(this);
		    counter++;
		    setId(counter);
		    setName(nm);
		    setUsername(usernm);
		    setPassword(passwd);  
		  }*/

		  public int getCounter() {
		    return counter;
		  }

		  public static ArrayList<Usuario> getUsuario() {
		    return Usuario;
		  }

		  public void setId(int iden) {
		    id = iden;
		  }

		  public int getId() {
		    return id;
		  }

		  public void setName(String nm) {
		    name = nm;
		  }

		  public String getName() {
		    return name;
		  }

		  public void setUsername(String usernm) {
		    username = usernm;
		  }

		  public String getUsername() {
		    return username;
		  }

		  public static void setPassword(String passwd) {
		    password = passwd;
		  }

		  public String getPassword() {
		    return password;
		  }
		  
		public static void Usuario(String pass1, String pass2) {
			    if (!pass1.equals(pass2)) {
			      setPassword(pass1);
			      System.out.println("Password has been changed.\n\n");
			    } 
			    else {
			      System.out.println("Passwords don't match.\n\n");
	    }
	  }
	}	

