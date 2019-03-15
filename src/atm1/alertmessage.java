     
package atm1;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
public class alertmessage {
    public static void display(String title,String message){
        Stage window=new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(400);
        
        
        Label label=new Label();
        label.setText(message);
        
        Button close=new Button("Exit");
        close.setOnAction((ActionEvent event) -> {window.close();});
       
        VBox layout=new VBox(10);
        layout.getChildren().addAll(label,close);
        layout.setAlignment(Pos.CENTER);
        
        Scene sc=new Scene(layout);
        window.setScene(sc);
        window.showAndWait();
        
    }
    
    
    
}
