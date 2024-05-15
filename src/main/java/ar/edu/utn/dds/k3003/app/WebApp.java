package ar.edu.utn.dds.k3003.app;

import ar.edu.utn.dds.k3003.Controller.*;
import io.javalin.Javalin;

public class WebApp {
    public static void main(String[] args) {
        Integer port = Integer.parseInt(System.getProperty("port","8080"));
        Javalin app = Javalin.create().start(port);
        var fachada= new Fachada();
        //fachada.setViandasProxy(fachadaViandas);
        app.get("/", ctx -> ctx.result("Hola"));
        // Cada vez que reciba un post en HTTP va a ejecutar el handle. CTX: Interactua con el request y el response  (DOCU)

        app.post("/heladeras", new AltaHeladeraController(fachada));
        app.get("/heladeras/{idHeladera}", new SearchHeladeraController(fachada));
        app.get("/heladeras", new ListaHeladerasController(fachada));
        app.post("/temperaturas", new RegistrarTemperaturasController(fachada));
        app.get("/heladeras/{idHeladera}/temperaturas", new ObtenerTemperaturasController(fachada));
    }

}
