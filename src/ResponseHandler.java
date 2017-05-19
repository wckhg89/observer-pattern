import java.util.Observable;
import java.util.Observer;

public class ResponseHandler implements Observer {
    private String response;

    // Observable 의 notifyObservers() 에 의해서 호출
    public void update(Observable obj, Object arg) {
        if (arg instanceof String) {
            response = (String) arg;
            System.out.print("this.hashCode :" + this.hashCode());
            System.out.println(", Received Response: " + response );
        }
    }
}