import java.lang.module.Configuration;

import org.hibernate.Session;

public class App {
	public static void main(String [] args) {
	Song song = new Song();
	// craete configuration
	
	Configuration configuration = new Configuration();
	configuration.configure()
	//create session factory ====>
	
	Session session = null;
	
	song.setSongid(1);
	song.setSongname("rhim ghir gire saawan");
	song.setSinger("kishore kumar");
	
	session.save(song);
	
	}

}
