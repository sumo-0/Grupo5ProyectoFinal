package grupo5proyectofinal;

import javafx.application.Application;
import javafx.stage.Stage;

public class Grupo5ProyectoFinal extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pantalla obj_pant = new Pantalla();
        obj_pant.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
