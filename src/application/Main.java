package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			Scene scene = new Scene(root,900,600,Color.AQUA);
			
			primaryStage.setScene(scene);
			
			primaryStage.setTitle("Hello word");
			//primaryStage.setResizable(false);
			
			//1-Rectangle
			Rectangle r = new Rectangle();
			r.setX(100); //Position sur l'axe des X du rep�re
			r.setY(300); //Position sur l'axe des Y du rep�re
			r.setWidth(300); //Longueur du rectangle
			r.setHeight(200); //Largeur du rectangle
			
			//2-Cercle
			//Circle c = new Circle();
			//c.setCenterX(700); //Coordonn�e X du centre du cercle
			//c.setCenterY(300);  //Coordonn�e Y du centre du cercle
		    //c.setRadius(60); //Le rayon du cercle
		    Circle c = new Circle(700, 300, 60);
		    
		  //3-Polygone
		    Polygon p = new Polygon();  
		    p.getPoints().addAll(new Double[]{  
		        0.0, 0.0,  
		        100.0, 200.0,  
		        200.0, 100.0 });
		    
		  //4- Arc
		    Arc arc = new Arc();  
		    arc.setCenterX(400);  //Coordonn�e X du point central
		    arc.setCenterY(200);  //Coordonn�e Y du point central
		    arc.setRadiusX(50);  //Pleine largeur de l'ellipse dont Arc fait partie.
		    arc.setRadiusY(80);  //Pleine hauteur de l'ellipse dont Arc fait partie
		    arc.setStartAngle(45);  //Angle de d�part de l'arc en degr�s
		    arc.setLength(230);  
		    arc.setType(ArcType.ROUND); //Type d'arc: OPEN, CHORD, ROUND
		    //Arc arc = new Arc(600,300,50;80,45,230);
		    
		  //5- Lines 
		    Line line =  new  Line (); // instanciation de la classe Line   
	        line.setStartX (200); // d�finition du point X de d�part de la ligne  
	        line.setStartY (42); // d�finition du point Y de d�part de la ligne   
	        line.setEndX (400); // d�finition du point X de fin de la ligne   
	        line.setEndY (66); // d�finition du point Y de fin de la ligne 
	         // Line line =  new  Line (200,42,400,66);
			
			root.getChildren().addAll(r, c, p,arc,line);
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
