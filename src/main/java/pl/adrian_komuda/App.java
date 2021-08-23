package pl.adrian_komuda;

import javafx.application.Application;
import javafx.stage.Stage;
import pl.adrian_komuda.view.ViewFactory;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ViewFactory viewFactory = new ViewFactory(new EmailManager());
        viewFactory.showOptionsWindow();
        viewFactory.updateStyles();
    }
}
