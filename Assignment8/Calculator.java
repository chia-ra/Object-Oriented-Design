package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;


public class Calculator extends Application {
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane(); //lays children out in vert column
			root.setVgap(5);
			root.setHgap(5);
			root.setStyle("-fx-background-color: #E1BFFF;");

			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Calculator");

			Label enterLbl = new Label("");
			enterLbl.setStyle("-fx-background-color: #FFFBBF;");

			Button divis = new Button("/");
			Button mult = new Button("*");
			Button addit = new Button("+");
			Button subtr = new Button("-");
			Button decim = new Button(".");
			Button enter = new Button("=");
			Button allClear = new Button("   AC   ");

			Button zero = new Button("0");
			Button one = new Button("1");
			Button two = new Button("2");
			Button three = new Button("3");
			Button four = new Button("4");
			Button five = new Button("5");
			Button six = new Button("6");
			Button seven = new Button("7");
			Button eight = new Button("8");
			Button nine = new Button("9");



			root.add(enterLbl, 0, 0, 5, 1);
			root.addRow(1, seven, eight, nine, divis);
			root.addRow(2,  four, five, six, mult);
			root.addRow(3,  one, two, three, subtr);
			root.addRow(4, zero, decim, enter, addit);
			root.add(allClear, 1, 5, 2, 1);

			EventHandler<MouseEvent> digitClick = new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {

					String value = ((Button)event.getSource()).getText();
					enterLbl.setText(enterLbl.getText() + value);
				}

			};
			EventHandler<MouseEvent> operatorClick = new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					String value = ((Button)event.getSource()).getText();
					enterLbl.setText(enterLbl.getText() + value);
					divis.setDisable(true);
					mult.setDisable(true);
					addit.setDisable(true);
					subtr.setDisable(true);

				}
			};

			EventHandler<MouseEvent> enterClick = new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					String temp = enterLbl.getText();
					String temp1=temp;
					boolean valid = true;

					double result = 0;
					double op1 = 0;
					double op2 = 0;

					if (temp == "") {
						valid = false;
					}
					else {
						temp1 = temp1.replaceAll("[*/+-]", "x");

						int index = temp1.indexOf('x');
						if (index == -1) { result = Double.parseDouble(temp); }
						else if (index == 0 || index == temp.length()-1) { valid = false; }
						else {
							op1 = Double.parseDouble(temp1.substring(0,index)); 
							op2 = Double.parseDouble(temp1.substring(index+1)); 
							
							char operand = temp.charAt(index);

							if (valid) {
								if (operand == '/') { 
									if (op2 == 0) { valid = false; }
									else 
										result = op1/op2; }
								else if (operand == '*') { result = op1*op2; }
								else if (operand == '+') { result = op1+op2; }
								else result = op1-op2;
							}
						}
					}

					if (valid) {
						enterLbl.setText(enterLbl.getText()+"="+result);
					}
					else
						enterLbl.setText("ERROR");

				}
			};

			EventHandler<MouseEvent> clearClick = new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					enterLbl.setText("");
					divis.setDisable(false);
					mult.setDisable(false);
					addit.setDisable(false);
					subtr.setDisable(false);
				}
			};
			divis.addEventHandler(MouseEvent.MOUSE_CLICKED, operatorClick);
			mult.addEventHandler(MouseEvent.MOUSE_CLICKED, operatorClick);
			addit.addEventHandler(MouseEvent.MOUSE_CLICKED, operatorClick);
			subtr.addEventHandler(MouseEvent.MOUSE_CLICKED, operatorClick);
			decim.addEventHandler(MouseEvent.MOUSE_CLICKED, digitClick);
			enter.addEventHandler(MouseEvent.MOUSE_CLICKED, enterClick);
			allClear.addEventHandler(MouseEvent.MOUSE_CLICKED, clearClick);


			zero.addEventHandler(MouseEvent.MOUSE_CLICKED, digitClick);
			one.addEventHandler(MouseEvent.MOUSE_CLICKED, digitClick);
			two.addEventHandler(MouseEvent.MOUSE_CLICKED, digitClick);
			three.addEventHandler(MouseEvent.MOUSE_CLICKED, digitClick);
			four.addEventHandler(MouseEvent.MOUSE_CLICKED, digitClick);
			five.addEventHandler(MouseEvent.MOUSE_CLICKED, digitClick);
			six.addEventHandler(MouseEvent.MOUSE_CLICKED, digitClick);
			seven.addEventHandler(MouseEvent.MOUSE_CLICKED, digitClick);
			eight.addEventHandler(MouseEvent.MOUSE_CLICKED, digitClick);
			nine.addEventHandler(MouseEvent.MOUSE_CLICKED, digitClick);


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

