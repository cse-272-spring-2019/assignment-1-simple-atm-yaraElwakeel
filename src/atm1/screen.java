
package atm1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class screen extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        gui logingui=new gui(primaryStage);
        gui2 transction =new gui2(primaryStage);
        
        primaryStage.setTitle("ATM Application");
        
        logingui.preparescene();
        transction.preparescene();
        
        logingui.setTransaction(transction);
        transction.setLoginform(logingui);
        
        primaryStage.setScene(logingui.getScene());
        primaryStage.show();
    }
    
    
}
