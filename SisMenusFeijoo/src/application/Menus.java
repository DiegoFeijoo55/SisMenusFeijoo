package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Menus extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 300);

        MenuBar menuBar = new MenuBar();

        Menu menuArchivo = new Menu("Archivo");
        MenuItem menuItemNuevo = new MenuItem("Nuevo");
        MenuItem menuItemAbrir = new MenuItem("Abrir");
        MenuItem menuItemGuardar = new MenuItem("Guardar");
        MenuItem menuItemSalir = new MenuItem("Salir");
        menuArchivo.getItems().addAll(menuItemNuevo, menuItemAbrir, menuItemGuardar, new SeparatorMenuItem(), menuItemSalir);

        Menu menuEditar = new Menu("Editar");
        MenuItem menuItemCopiar = new MenuItem("Copiar");
        MenuItem menuItemPegar = new MenuItem("Pegar");
        menuEditar.getItems().addAll(menuItemCopiar, menuItemPegar);

        Menu menuAyuda = new Menu("Ayuda");
        MenuItem menuItemAcercaDe = new MenuItem("Acerca de...");
        menuAyuda.getItems().add(menuItemAcercaDe);

        menuBar.getMenus().addAll(menuArchivo, menuEditar, menuAyuda);

        root.setTop(menuBar);

        
        menuItemNuevo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Nuevo");
            }
        });

        menuItemAbrir.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abrir");
            }
        });

        menuItemGuardar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guardar");
            }
        });

        menuItemSalir.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Salir");
            }
        });

        menuItemCopiar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Copiar");
            }
        });

        menuItemPegar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Pegar");
            }
        });

        menuItemAcercaDe.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Acerca de...");
            }
        });

        primaryStage.setTitle("Menú");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
