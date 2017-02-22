import controller.StartDialogController;
import view.StartDialog;

class Launcher {

    public static void main(String[] args) {
        System.out.println("Hello World");

        StartDialog main = new StartDialog();
        StartDialogController sdc = new StartDialogController(main);


    }
}