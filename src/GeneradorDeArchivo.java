import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;

public class GeneradorDeArchivo {
    public void guardarJson(Pelicula pelicula)throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(pelicula.title()+".json");
        escritura.write(gson.toJson(pelicula));
        escritura.close();
    }
}
