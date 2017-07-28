package application;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ComplexNoInterFace {
	
	private Stage stage;
	private Scene scene;
	private GridPane gp;
	private Label lbl1,lbl2,lbl3;
	private TextField real1,real2,real3,img1,img2,img3;
	private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
	
	private Label message ;
	public ComplexNoInterFace(Stage stage1){
		this.stage = stage1;
		
		gp = new GridPane();
		gp.setMaxSize(400,300);
		gp.setMinSize(400,300);
		gp.setHgap(5);
		gp.setVgap(5);
		gp.setPadding(new Insets(20));
		gp.setStyle("-fx-border-style: solid inside;"+
					"-fx-border-color: BLUE;"+
					"-fx-border-insets:5;"+
					"-fx-padding: 10;"+
					"-fx-border-radius: 5;"+
					"-fx-border-width:3;");
		scene = new Scene(gp,400,300);
		
		populateScene();
		
		stage.setScene(scene);
		stage.setTitle("ComplexNo. Operation");
		stage.setResizable(false);
		stage.sizeToScene();
		
		stage.show();
	}
	private void populateScene(){
		
	//label 1 setting
		lbl1 = new Label();
		lbl1.setText("complex No.1:");
		GridPane.setConstraints(lbl1, 0, 0,2,1);
		
	//label 2 setting
		lbl2 = new Label();
		lbl2.setText("complex No.2:");
		GridPane.setConstraints(lbl2, 0, 1,2,1);
	
	//label 3 setting
		lbl3 = new Label();
		lbl3.setText("Result :");
		GridPane.setConstraints(lbl3, 0, 2,2,1);
	
	//TextField 1 setting
		real1 = new TextField();
		real1.setTooltip(new Tooltip("Real part of Complex no."));
		real1.setAlignment(Pos.CENTER);
		GridPane.setConstraints(real1, 2,0,2,1);
		
	
	//TextField 2 setting
		img1 = new TextField();
		img1.setTooltip(new Tooltip("Imaginary part of Complex no."));
		img1.setAlignment(Pos.CENTER);
		GridPane.setConstraints(img1, 4,0,2,1);

	//TextField 3 setting
		real2 = new TextField();
		real2.setTooltip(new Tooltip("Imaginary part of Complex no."));
		real2.setAlignment(Pos.CENTER);
		GridPane.setConstraints(real2, 2,1,2,1);
		
	//TextField 4 setting
		img2 = new TextField();
		img2.setTooltip(new Tooltip("Imaginary part of Complex no."));
		img2.setAlignment(Pos.CENTER);
		GridPane.setConstraints(img2, 4,1,2,1);
		
	//TextField 5 setting
		real3 = new TextField();
		real3.setTooltip(new Tooltip("Imaginary part of Complex no."));
		real3.setAlignment(Pos.CENTER);
		GridPane.setConstraints(real3, 2,2,2,1);
		
	//TextField 6 setting
		img3 = new TextField();
		img3.setTooltip(new Tooltip("Imaginary part of Complex no."));
		img3.setAlignment(Pos.CENTER);
		GridPane.setConstraints(img3, 4,2,2,1);
	
	// message of output label
		message = new Label();
		message.setText("Message Box");
		message.setStyle("-fx-border-style: solid inside;");
		GridPane.setConstraints(message, 0, 5,10,1);
				
	//Button 1 setting
		btn1 = new Button("Add");
		btn1.setText("Add");
		GridPane.setConstraints(btn1, 0, 3,2,1);
/*	btn1.addEventHandler(ActionEvent,eventHandler );
	
//		btn1.setOnAction(new EventHandler<ActionEvent>(){
//
//			@Override
//			public void handle(ActionEvent e) {
//				ComplexNo c1 = new ComplexNo();
//				ComplexNo c2 = new ComplexNo();
//				
//				try{
//					c1.setReal(Double.parseDouble(real1.getText().trim()));
//				}
//				catch(Exception e1){
//					message.setText("Error in data type of real1");
//				}
//				
//			//----------------
//				try{
//					c1.setImg(Double.parseDouble(img1.getText().trim()));
//				}
//				catch(Exception e1){
//					message.setText("Error in data type of img1");
//				}
//			//----------------
//				try{
//					c2.setReal(Double.parseDouble(real2.getText().trim()));
//				}
//				catch(Exception e1){
//					message.setText("Error in data type of real2");
//				}
//			//----------------
//				try{
//					c2.setImg(Double.parseDouble(img2.getText().trim()));
//				}
//				catch(Exception e1){
//					message.setText("Error in data type of real1");
//				}
//				
//			ComplexNo c3 = new ComplexNo(c1.add(c2));
//				real3.setText(""+c3.getReal());
//				img3.setText(""+c3.getImg());
//			}
//			
//		});
//		
	*/	
	//	_______________________________________________
		
		 EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent e) {
				ComplexNo c1 = new ComplexNo();
				ComplexNo c2 = new ComplexNo();
				
				try{
					c1.setReal(Double.parseDouble(real1.getText().trim()));
				}
				catch(Exception exc){
					message.setText("Error in data type of real1");
					e.consume();
				}
				
			//----------------
				try{
					c1.setImg(Double.parseDouble(img1.getText().trim()));
				}
				catch(Exception exc){
					message.setText("Error in data type of img1");
					e.consume();
				}
			//----------------
				try{
					c2.setReal(Double.parseDouble(real2.getText().trim()));
				}
				catch(Exception exc){
					message.setText("Error in data type of real2");
					e.consume();
				}
			//----------------
				try{
					c2.setImg(Double.parseDouble(img2.getText().trim()));
				}
				catch(Exception exc){
					message.setText("Error in data type of real1");
					e.consume();
				}
			
			if(e.getSource() == btn1){
					ComplexNo c3 = new ComplexNo(c1.add(c2));
						real3.setText(""+c3.getReal());
						img3.setText(""+c3.getImg());
					}
			else if(e.getSource() == btn2){
					ComplexNo c3 = new ComplexNo(c1.subtract(c2));
						real3.setText(""+c3.getReal());
						img3.setText(""+c3.getImg());
					}
			else if(e.getSource() == btn3){
					ComplexNo c3 = new ComplexNo(c1.multiply(c2));
						real3.setText(""+c3.getReal());
						img3.setText(""+c3.getImg());
					}
			else if(e.getSource() == btn4){
					ComplexNo c3 = new ComplexNo(c1.division(c2));
						real3.setText(""+c3.getReal());
						img3.setText(""+c3.getImg());
					}
			else if(e.getSource() == btn5){
				double d1 = c1.modulus();
				double d2 = c2.modulus();
				message.setText("Modulus of C1 : "+d1 +" Modulus of C2 : "+d2);
				
				}
			else if(e.getSource() == btn6){
				message.setText("Conjugate of C1 : "+c1.getReal()+" + "+(-c1.getImg())+"i"+"  Conjugate of C2 : "
				+c2.getReal()+" + "+(-c2.getImg())+"i");
				}
			else if(e.getSource() == btn7){
					real1.setText("");
					real2.setText("");
					real3.setText("");
					img1.setText("");
					img2.setText("");
					img3.setText("");
					message.setText("Message Box");
				}
			}	
		};
		
		 
	//_____________________________________________________
	//Button 2 setting
		btn2 = new Button("Subtract");
		GridPane.setConstraints(btn2, 2, 3,2,1);
				
	//Button 3 setting
		btn3 = new Button("Multiply");
		GridPane.setConstraints(btn3, 4, 3,2,1);
			
	//Button 4 setting
		btn4 = new Button("Divide");
		GridPane.setConstraints(btn4, 0, 4,2,1);
			
	//Button 5 setting
		btn5 = new Button("Modulus");
		GridPane.setConstraints(btn5, 2, 4,2,1);
		
	//Button 6 setting
		btn6 = new Button("Conjugate");
		GridPane.setConstraints(btn6, 4, 4,2,1);	
	//Button 7setting
		btn7 = new Button("Reset");
		GridPane.setConstraints(btn7, 6, 4);
		
		
		btn1.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler );
		btn2.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler );
		btn3.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler );
		btn4.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler );
		btn5.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler );
		btn6.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler );
		btn7.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
		
		gp.getChildren().addAll(lbl1,lbl2,lbl3,real1,img1 ,real2,img2,real3 ,img3,
				btn1,btn2,btn3,btn4,btn5,btn6,btn7,message);
		gp.setFocusTraversable(true);
		
	}
	
	
}
