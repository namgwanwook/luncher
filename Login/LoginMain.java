package Login;

import Login.Service.CommonService;
import Login.Service.CommonServiceImpl;
import javafx.application.Application;
import javafx.stage.Stage;

public class LoginMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		CommonService comSrv = new CommonServiceImpl();
		comSrv.ShowWindow(primaryStage, "../Login.fxml");
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
