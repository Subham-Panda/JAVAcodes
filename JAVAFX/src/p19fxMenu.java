import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class p19fxMenu extends Application {
	public static void main(String[] args) throws Exception {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		MenuBar main_menu = new MenuBar();

		Menu File = new Menu("File");
		Menu Edit = new Menu("Edit");
		Menu Selection = new Menu("Selection");
		Menu View = new Menu("View");
		main_menu.getMenus().add(File);
		main_menu.getMenus().add(Edit);
		main_menu.getMenus().add(Selection);
		main_menu.getMenus().add(View);

		MenuItem newFile = new MenuItem("New File");
		MenuItem newWindow = new MenuItem("New Window");
		MenuItem openFile = new MenuItem("Open File");
		MenuItem openFolder = new MenuItem("Open Folder");
		Menu preferences = new Menu("Preferences");
		MenuItem settings = new MenuItem("Settings");
		MenuItem extensions = new MenuItem("Extensions");
		MenuItem snippets = new MenuItem("Snippets");
		MenuItem colortheme = new MenuItem("Color Theme");
		preferences.getItems().addAll(settings, extensions, snippets, colortheme);
		File.getItems().addAll(newFile, newWindow, openFile, openFolder, preferences);

		MenuItem undo = new MenuItem("Undo");
		MenuItem redo = new MenuItem("Redo");
		MenuItem cut = new MenuItem("Cut");
		MenuItem copy = new MenuItem("Copy");
		MenuItem paste = new MenuItem("Paste");
		Edit.getItems().addAll(undo, redo, cut, copy, paste);

		MenuItem selectAll = new MenuItem("Select All");
		MenuItem expandAll = new MenuItem("Expand All");
		MenuItem shrinkAll = new MenuItem("shrink All");
		Selection.getItems().addAll(selectAll, expandAll, shrinkAll);

		MenuItem explorer = new MenuItem("Explorer");
		MenuItem search = new MenuItem("Search");
		MenuItem debugConsole = new MenuItem("Debug Console");
		MenuItem terminal = new MenuItem("Terminal");
		View.getItems().addAll(explorer, search, debugConsole, terminal);

		BorderPane root = new BorderPane();
		root.setTop(main_menu);
		Scene scn = new Scene(root);
		primaryStage.setScene(scn);
		primaryStage.setWidth(500);
		primaryStage.setHeight(500);
		primaryStage.setTitle("Subham Panda Menu Stage");
		primaryStage.show();
	}
}
