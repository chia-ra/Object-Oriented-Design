package application;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application {
	public void start(Stage primaryStage) {
		try {
			TilePane root = new TilePane();
			Scene sc = new Scene (root);

			primaryStage.setMinHeight(150);
			primaryStage.setMinWidth(100);
			primaryStage.setScene(sc);
			primaryStage.setTitle("Animation");

			FlowPane one = new FlowPane();
			one.setPadding(new Insets(20, 20, 20, 20));
			one.setHgap(30);
			FlowPane two = new FlowPane();
			two.setPadding(new Insets(20, 20, 20, 20));
			two.setHgap(30);
			FlowPane three = new FlowPane();
			three.setPadding(new Insets(20, 20, 20, 20));
			three.setHgap(30);
			FlowPane four = new FlowPane();
			four.setPadding(new Insets(20, 20, 20, 20));
			four.setHgap(30);

			Sphere  sphere = new Sphere (40);
			Cylinder cylinder = new Cylinder(30, 75);
			Box box = new Box(75, 75, 75);
			Polygon hexagon = new Polygon();
			PhongMaterial sColor = new PhongMaterial();
			sColor.setDiffuseColor(Color.PALETURQUOISE);
			PhongMaterial cColor = new PhongMaterial();
			cColor.setDiffuseColor(Color.PINK);
			PhongMaterial bColor = new PhongMaterial();
			bColor.setDiffuseColor(Color.NAVAJOWHITE);

			sphere.setMaterial(sColor);
			cylinder.setMaterial(cColor);
			box.setMaterial(bColor);
			hexagon.getPoints().addAll(new Double[]{        
					75.0, 25.0, 
					150.0, 25.0, 
					175.0, 75.0,          
					150.0, 125.0, 
					75.0, 125.0,                   
					50.0, 75.0, 
			});
			hexagon.setFill(Color.MEDIUMPURPLE);

			ChoiceBox<String> transitions1 = new ChoiceBox<>();
			transitions1.getItems().addAll("Rotate","Scale", "Sequential");
			ChoiceBox<String> transitions2 = new ChoiceBox<>();
			transitions2.getItems().addAll("Rotate","Scale", "Sequential");
			ChoiceBox<String> transitions3 = new ChoiceBox<>();
			transitions3.getItems().addAll("Rotate","Scale", "Sequential");
			ChoiceBox<String> transitions4 = new ChoiceBox<>();
			transitions4.getItems().addAll("Fade", "Rotate","Scale", "Sequential");

			one.getChildren().addAll(sphere, transitions1);
			two.getChildren().addAll(cylinder, transitions2);
			three.getChildren().addAll(box, transitions3);
			four.getChildren().addAll(hexagon, transitions4);

			EventHandler<ActionEvent> transitionSelect = new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {

					if (event.getSource() == transitions1) {
						RotateTransition rt = new RotateTransition(Duration.millis(2000), sphere);
						rt.setByAngle(180);
						rt.setCycleCount(1);
						ScaleTransition st = new ScaleTransition(Duration.millis(2000), sphere);
						st.setByX(.35f);
						st.setByY(.35f);
						if (transitions1.getValue() == "Rotate") {
							rt.play();
						}
						else if (transitions1.getValue() == "Scale") {
							st.play();
						}
						else {
							SequentialTransition sq = new SequentialTransition(sphere, rt, st);
							sq.play();
						}
					}
					else if (event.getSource() == transitions2) {
						RotateTransition rt = new RotateTransition(Duration.millis(2000), cylinder);
						rt.setByAngle(180);
						rt.setCycleCount(1);
						ScaleTransition st = new ScaleTransition(Duration.millis(2000), cylinder);
						st.setByX(.35f);
						st.setByY(.35f);
						if (transitions2.getValue() == "Rotate") {
							rt.play();
						}
						else if (transitions2.getValue() == "Scale") {
							st.play();
						}
						else {
							SequentialTransition sq = new SequentialTransition(cylinder, rt, st);
							sq.play();
						}
					}
					else if (event.getSource() == transitions3) {
						RotateTransition rt = new RotateTransition(Duration.millis(2000), box);
						rt.setByAngle(180);
						rt.setCycleCount(1);
						ScaleTransition st = new ScaleTransition(Duration.millis(2000), box);
						st.setByX(.35f);
						st.setByY(.35f);
						if (transitions3.getValue() == "Rotate") {
							rt.play();
						}
						else if (transitions3.getValue() == "Scale") {
							st.play();
						}
						else {
							SequentialTransition sq = new SequentialTransition(box, rt, st);
							sq.play();
						}
					}
					else if (event.getSource() == transitions4) {
						FadeTransition ft = new FadeTransition(Duration.millis(2000), hexagon);
						ft.setFromValue(1.0);
						ft.setToValue(0.5);
						RotateTransition rt = new RotateTransition(Duration.millis(2000), hexagon);
						rt.setByAngle(180);
						rt.setCycleCount(1);
						ScaleTransition st = new ScaleTransition(Duration.millis(2000), hexagon);
						st.setByX(.35f);
						st.setByY(.35f);
						if (transitions4.getValue() == "Rotate") {
							rt.play();
						}
						else if (transitions4.getValue() == "Scale") {
							st.play();
						}
						else if (transitions4.getValue() == "Fade"){
							ft.play();
						}
						else { 
							SequentialTransition sq = new SequentialTransition(hexagon, ft, rt, st);
							sq.play(); 
						}
					}

				}

			};

			transitions1.setOnAction(transitionSelect);
			transitions2.setOnAction(transitionSelect);
			transitions3.setOnAction(transitionSelect);
			transitions4.setOnAction(transitionSelect);


			root.setPrefColumns(2);
			root.setVgap(1);
			root.setHgap(1);
			one.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
			two.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
			three.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
			four.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

			root.getChildren().addAll(one, two, three, four);



			primaryStage.show();

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
