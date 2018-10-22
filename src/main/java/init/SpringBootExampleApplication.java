package init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *
 *  Artigo de Referência:
 *  - https://dzone.com/articles/securing-rest-apis-with-client-certificates?edition=407227&utm_source=Weekly%20Digest&utm_medium=email&utm_campaign=Weekly%20Digest%202018-10-17
 *
 *
 *  Como criar certificados com 'openssl'
 *  - https://blog.pavelsklenar.com/how-to-create-pkcs-12-for-your-application/
 *
 *
 */

@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {
	    SpringApplication.run(SpringBootExampleApplication.class, args);
	}

}
