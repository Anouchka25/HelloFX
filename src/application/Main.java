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
			r.setX(100); //Position sur l'axe des X du repère
			r.setY(300); //Position sur l'axe des Y du repère
			r.setWidth(300); //Longueur du rectangle
			r.setHeight(200); //Largeur du rectangle
			
			//2-Cercle
			//Circle c = new Circle();
			//c.setCenterX(700); //Coordonnée X du centre du cercle
			//c.setCenterY(300);  //Coordonnée Y du centre du cercle
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
		    arc.setCenterX(400);  //Coordonnée X du point central
		    arc.setCenterY(200);  //Coordonnée Y du point central
		    arc.setRadiusX(50);  //Pleine largeur de l'ellipse dont Arc fait partie.
		    arc.setRadiusY(80);  //Pleine hauteur de l'ellipse dont Arc fait partie
		    arc.setStartAngle(45);  //Angle de départ de l'arc en degrés
		    arc.setLength(230);  
		    arc.setType(ArcType.ROUND); //Type d'arc: OPEN, CHORD, ROUND
		    //Arc arc = new Arc(600,300,50;80,45,230);
		    
		  //5- Lines 
		    Line line =  new  Line (); // instanciation de la classe Line   
	        line.setStartX (200); // définition du point X de départ de la ligne  
	        line.setStartY (42); // définition du point Y de départ de la ligne   
	        line.setEndX (400); // définition du point X de fin de la ligne   
	        line.setEndY (66); // définition du point Y de fin de la ligne 
	         // Line line =  new  Line (200,42,400,66);
			
			root.getChildren().addAll(r, c, p,arc,line);
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
