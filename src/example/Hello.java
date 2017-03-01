
package example;

import org.apache.commons.lang.WordUtils;
import com.methodia.Test;

public class Hello {
    public static void main(String[] args) {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
		Test test = new Test();
		System.out.println("message from nexus downloaded lib: " + test.getText());
    }
}
        