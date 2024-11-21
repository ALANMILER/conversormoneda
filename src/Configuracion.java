
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuracion {
    private Properties properties = new Properties();

    // Constructor
    public Configuracion() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                System.out.println("Encontro el archivo application.properties");
                return;
            }

            // Cargar el archivo de propiedades
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
