/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm1;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



/**
 *
 * @author yarae
 */
public class gui {
    
    validation validate;
    Scene scene;
    gui2 transaction;
    Stage stage;
  public gui(Stage stage){
      this.stage=stage;
  }
    
   public void preparescene() {
        validate = new validation();
      
        Label pincode = new Label("Enter pin code:");
        Label name= new Label("Enter name");
        PasswordField labelpin = new PasswordField();
        TextField labelname=new TextField();
        Button EnterButton = new Button("Enter");
        
        GridPane grid = new GridPane();
        grid.setVgap(20);
        grid.setHgap(20);
        
        grid.setAlignment(Pos.CENTER);
        
        grid.add(name, 0,0);
        grid.add(pincode,0,1);
        grid.add(labelname,1, 0);
        grid.add(labelpin,1,1);
        grid.add(EnterButton,2,2);
        
        
        EnterButton.setOnAction((ActionEvent event) -> {
            String username = labelname.getText();
            String pincode1 = labelpin.getText();
            boolean valid = validate.validate(username, pincode1);
            if (valid) {
                stage.setScene(transaction.getScene());
            }else{
                alertmessage.display("alert","user name or pin code is wrong");
            }
        });
       
      scene=new Scene(grid,400,300);
    }
    public Scene getScene(){
        return this.scene;
                
    }

    public void setTransaction(gui2 transaction) {
        this.transaction = transaction;
    }
    
}
