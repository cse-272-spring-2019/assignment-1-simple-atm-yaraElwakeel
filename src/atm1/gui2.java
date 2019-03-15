
package atm1;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class gui2 {
    Scene scene;
    gui loginform;
    Stage stage;
    NewClass class2=new NewClass();
  
    
    public gui2(Stage stage){
        this.stage=stage;
    }
    
    public void preparescene(){
        TextField amountlabel=new TextField();
        Button logoutButton =new Button("logout");
        Button depositButton=new Button("deposit");
        Button withdrawButton=new Button("withdraw");
        Button nextButton=new Button("Next");
        Button previousButton=new  Button("Previoius");
        Button currentButton=new Button("Current Balance");
        Label currentlabel =new Label();
        
        GridPane gridPane=new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(20);
        gridPane.setHgap(20);
        
        gridPane.setAlignment(Pos.TOP_LEFT);
        
        GridPane.setConstraints(depositButton,0,0);
        GridPane.setConstraints(withdrawButton,0,1);
        GridPane.setConstraints(currentButton,0,2);
        GridPane.setConstraints(nextButton,0,3);
        GridPane.setConstraints(previousButton,0,4);
        GridPane.setConstraints(logoutButton,0,5);
        GridPane.setConstraints(amountlabel,1,0);
        GridPane.setConstraints(currentlabel,1,6);
        
        
        
        gridPane.getChildren().addAll(depositButton,withdrawButton,currentButton,nextButton,previousButton,logoutButton,amountlabel,currentlabel);
        
        scene=new Scene(gridPane,500,500);
        logoutButton.setOnAction((ActionEvent event) -> {
            stage.setScene(loginform.getScene());
        });
        depositButton.setOnAction((ActionEvent event) -> {
            String amount= amountlabel.getText();
            class2.deposit(amount);
        });
        withdrawButton.setOnAction((ActionEvent event) -> {
            String amountString=amountlabel.getText();
            double a= Double.parseDouble(amountString);
            if (a>class2.getcurrentbalance()) {
                alertmessage.display("alert", "not enough balance");
            }else
            class2.withdarw(amountString);
        });
        currentButton.setOnAction((ActionEvent event) -> {
            String a=String.valueOf(class2.getcurrentbalance());
            currentlabel.setText(a);
        });
        nextButton.setOnAction((ActionEvent event) -> {
            currentlabel.setText(class2.next());
        });
        previousButton.setOnAction((ActionEvent event) -> {
            currentlabel.setText(class2.prev());
        });
        
        
    }
    
     public Scene getScene(){
        return this.scene;
                
    }

    public void setLoginform(gui loginform) {
        this.loginform = loginform;
    }
    
    
    
}
