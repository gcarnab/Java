package gc;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.embed.swing.SwingNode;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.Random;

import javax.swing.*;
import java.awt.*;

public class InterfacciaConJavaFXeSwing extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(50, Color.RED);

        // Creazione di un pannello Swing con il cerchio
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JFXPanel()); // Pannello vuoto per integrare JavaFX

        // Creazione di un nodo Swing per integrare il pannello Swing in JavaFX
        SwingNode swingNode = new SwingNode();
        swingNode.setContent(panel);

        Random rand = new Random();
        Button button = new Button("Cambia Colore");
        /*
         * button.setOnAction(event -> {
         * Color randomColor = getRandomJavaFXColor();
         * circle.setFill(randomColor);
         * });
         */
        button.setOnAction(e -> {
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();

            circle.setFill(Color.color(r, g, b));
        });

        // Titolo centrato
        Text titleText = new Text("Javafx-swing TEST");
        titleText.setFont(Font.font(18));

        // Contenitore centrale
        VBox centerContainer = new VBox(20); // Spaziatura di 20 tra i componenti
        centerContainer.setAlignment(Pos.CENTER);
        centerContainer.getChildren().addAll(titleText, new StackPane(swingNode, circle), button);
        // centerContainer.setPrefSize(400, 400);

        StackPane root = new StackPane(centerContainer);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 400); // Dimensioni aumentate per centrare i componenti

        primaryStage.setTitle(""); // Titolo vuoto per nascondere la finestra del titolo di default
        // primaryStage.setTitle("Cambia Colore Cerchio");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private Color getRandomJavaFXColor() {
        return Color.color(Math.random(), Math.random(), Math.random());
    }

}
