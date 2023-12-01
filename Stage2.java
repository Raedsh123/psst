package com.example.demo4;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Stage2 extends Application {
    private Label nameLB=new Label("Enter first name:");
    private Label surNameLB = new Label("Enter last name:");
    private Label emailLB = new Label ("Enter E-mail: ");
    private Label passLB = new Label ("Create a password: ");
    private Label passConLB = new Label ("Confirm password: ");
    private Label mainaddress = new Label ("Main Address ");
    private Label cityLB = new Label ("City: ");
    private Label countryLB = new Label ("Country: ");
    private Label StreetLB = new Label ("Street: ");

    private Label postalcodeLB = new Label ("Postal Code: ");


    private TextField fNameTF = new TextField();
    private TextField lNameTF = new TextField();
    private TextField emailTF = new TextField();
    private PasswordField passPF = new PasswordField();
    private PasswordField passConPF = new PasswordField();
    private TextField countryTF = new TextField();
    private TextField cityTF = new TextField();
    private TextField streetTF = new TextField();
    private TextField postalcodeTF = new TextField();
    private   Button SignIn = new Button("Sign in");
    private VBox Body=new VBox();
    private HBox fname=new HBox();
    private HBox lname=new HBox();
    private HBox email=new HBox();
    private HBox address=new HBox();
    private HBox password=new HBox();
    private HBox Conpassword=new HBox();
    private VBox AddressVb = new VBox();
    private HBox country = new HBox();
    private HBox city = new HBox();
    private HBox street = new HBox();
    private HBox postCode = new HBox();







    @Override
    public void start(Stage primaryStage) {

        fname.getChildren().addAll(nameLB,fNameTF);
        lname.getChildren().addAll(surNameLB,lNameTF);
        email.getChildren().addAll(emailLB,emailTF);
        address.getChildren().addAll(AddressVb);
        password.getChildren().addAll(passLB,passPF);
        Conpassword.getChildren().addAll(passConLB,passConPF);

        country.getChildren().addAll(countryLB,countryTF);
        city.getChildren().addAll(cityLB,cityTF);
        postCode.getChildren().addAll(postalcodeLB,postalcodeTF);
        street.getChildren().addAll(StreetLB,streetTF);

        AddressVb.getChildren().addAll(country,city,street,postCode);

        Body.getChildren().addAll(fname,lname,address,email,password,Conpassword,SignIn);

        Scene scene=new Scene(Body,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}


