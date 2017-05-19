/**
 * Created by kanghonggu on 2017. 5. 19..
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Text >");

        EventSource eventSource = new EventSource();

        ResponseHandler responseHandlerA = new ResponseHandler();
        ResponseHandler responseHandlerB = new ResponseHandler();
        eventSource.addObserver(responseHandlerA);
        eventSource.addObserver(responseHandlerB);

        Thread thread = new Thread(eventSource);
        thread.start();
    }

}
