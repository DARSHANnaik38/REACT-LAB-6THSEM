// package 17.9.2024;
enum Status{
    Running,Pending,Failed,Success;
}
public class Switch {
    public static void main(String[] args) {
        Status ss=Status.Failed;
        switch (ss) {
            case Running:
                System.out.println("got running");
                break;
            case Pending:
                System.out.println("got pending");
                break;
            case Failed:
                System.out.println("got Failed");
                break;
            // case Success:
            //     System.out.println("success");
            //     break;
            default:
                System.out.println("success");
                break;
        }
    }
}
