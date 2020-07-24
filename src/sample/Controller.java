package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class Controller {
     @FXML
    private Button solve;
    @FXML
    private Button clear;
    @FXML
    private Button close;
    @FXML
    private TextField x;
    @FXML
    private TextField a;
    @FXML
    private TextField b;
    @FXML
    private TextField y;
    
     @FXML
    void initialize(){

       close.setOnAction(event -> {
           Stage stage = (Stage) close.getScene().getWindow();
           stage.close();});
       clear.setOnAction(event -> {
          x.setText("");a.setText("");b.setText("");y.setText("");
       });
     solve.setOnAction(event -> {
         double xx = Double.parseDouble(x.getText());
         double aa = Double.parseDouble(a.getText());
         double bb = Double.parseDouble(b.getText());
         double yy=0;
         if (xx<=7 && aa!=0  && bb!=0) yy = (xx+4)/(Math.pow(aa,2)+Math.pow(bb,2));
         else yy=xx*Math.pow(aa+bb,2);
         y.setText(Double.toString(yy));
        }); 
    }
}
