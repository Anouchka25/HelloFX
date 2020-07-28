package application;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.paint.Color;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class Composant extends Application {

	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
     try {
    	 Group root = new Group();
		 Scene scene = new Scene(root,400,400,Color.AQUAMARINE);
		 
		 primaryStage.setScene(scene);
		 primaryStage.setTitle("Les composants");
		
		//1-Label
		Label la = new Label("Ceci est une �tiquette");
		
		//2-Button
		Button bu = new Button("boutton");
		bu.setLayoutX(50);  //Placer sur le rep�re � 140 pixels sur l'axe X
		
		//3-RadioButton
		RadioButton ra1 = new RadioButton("radio 1"); //"radio 1" le texte qui s'affichera � cot� du bouton radio
		ra1.setLayoutX(140);
		RadioButton ra2 = new RadioButton("radio 2");
		ra2.setLayoutX(240);
		/**
		 * Pour faire fonctionner les butons radio, 
		 * rajoutez l'objet ToggleGroup et 
		 * l'associer tous les bouton radio du group.
		 * 
		 */
		ToggleGroup tg = new ToggleGroup();
		ra1.setToggleGroup(tg);
		ra2.setToggleGroup(tg);
		ra1.setSelected(true); //Pour indiquer le buton qui sera s�lectionn� par d�faut
		//System.out.println(tg.getSelectedToggle()); //permet d'afficher le bouton qui est s�lectionn�
		
		//4- CheckBox
		CheckBox ch = new CheckBox("checkbox");
		
		//5-ChoiceBox
		/**
		 * <Object> parametre g�n�rique
		 * Mettez en param�tre une FXCollections.observableArrayList 
		 * qui elle-m�me prend en param�tre tout ce qui sera s�lectionnable dans ChoiceBox
		 * Exemple j'ai 3 elements : First, A, B 
		 * Et Separator qui permet de cr�er une ligne horizontale
		 */
		ChoiceBox<Object> cb = 
				new ChoiceBox<Object>(FXCollections.observableArrayList("First", new Separator(), "A", "B"));
		cb.setLayoutX(340);
		cb.setTooltip(new Tooltip("c'est un CB")); //Utilisable par tous les composants, 
		                                            //permet d'afficher un message informatif au passage
		                                            //de la souris sur un composant
        
		//6- TextField
		TextField te = new TextField();
		te.setLayoutX(200);
		te.setLayoutY(200);
		te.setText("blablabla"); //permet de d�finir un texte initial
		//existe : clear(), getText(), copy(), cut(), paste(), selectAll()
		
		//7- PasswordField
		PasswordField pa = new PasswordField();
		pa.setLayoutX(200);
		pa.setLayoutY(300);
		pa.setPromptText("saisir"); //permet de mettre un texte peu visible en arri�re plan
		
		//8- ScrollBar
		ScrollBar sc = new ScrollBar();
		sc.setLayoutX(150);
		sc.setLayoutY(150);
		sc.setOrientation(Orientation.VERTICAL);
		sc.setMin(0); //ScrollBar fonctionne avec des valeurs num�riques, vous pouvez donc d�finir le minimum 
		              //et le maximum
		sc.setMax(2000);
		
		//9- ComboBox
		ComboBox<String> cmb = 
				new ComboBox(FXCollections.observableArrayList("First", new Separator(), "A", "B"));
		cmb.getItems().addAll("C"); //Ajouter un �l�ment � notre ComboBox
		cmb.setVisibleRowCount(2); //Nous permet d'afficher (2) �l�ments dans notre combobox
		
		//10- Slider
		Slider s = new Slider();
		s.setMin(0);
		s.setMax(100);
		s.setShowTickLabels(true);
		s.setMinorTickCount(5);//Interval entre les graduations
		s.setBlockIncrement(10); //Indique combien (10) va augmenter les graduations en cliquant sur la fl�che avanc�e
		s.setLayoutY(100);
		
		//11- PrgressBar
		ProgressBar pr = new ProgressBar(0.3);
		pr.setProgress(0.75);
		
		//12 - ProgressIndicator
		ProgressIndicator pi = new ProgressIndicator();
		
		//13- Hyperlink
		Hyperlink hl = new Hyperlink("Wikipedia");
		
		//14- HTMLEditor
		HTMLEditor htmleditor = new HTMLEditor();
		htmleditor.setHtmlText("<html><head><title>Coucou</title></head><body>Cette page est une page toute simple</body></html>");
		System.out.println(htmleditor.getHtmlText()); //Retourne un code HTML, tr�s pratique pour �diter des pages web 
		
		
		
		
		
		root.getChildren().addAll(htmleditor);
		
		//root.getChildren().addAll(bu,ra1,ra2,cb,te,pa,sc);
    	 
    	 
         primaryStage.show();
     } catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
