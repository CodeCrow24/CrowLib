import crowLib.Loader;
public class test{
    public static void main(String[] args) {

        //create Loaders
        Loader loadingTest = new Loader("dot");
        Loader loadingTest2 = new Loader("bar");
        Loader loadingTest3 = new Loader("line");
        Loader loadingTest4 = new Loader("foo");

        //make variable for random speed
        int foo = 0;

        //start first bar
        loadingTest.startBar("Test 1");

        //loop to increase completion
        for (int i = 0; i < 90; i=i) {
            foo = (int) Math.round(Math.random()*10);
            if (foo == 1){
                loadingTest.setCompletion(loadingTest.getCompletion()+1);
                loadingTest.loadBar();
                i++;
            } else {
                loadingTest.loadBar();
            }
            foo = 0;
        }
        loadingTest.setCompletion(100);
        loadingTest.loadBar();

        //start second loader
        loadingTest2.startBar("Test 2");

        //loop to increase completion
        for (int i = 0; i < 75; i=i+0) {
            foo = (int) Math.round(Math.random()*10);
            if (foo == 1){
                loadingTest2.setCompletion(loadingTest2.getCompletion()+1);
                loadingTest2.loadBar();
                i++;
            } else {
                loadingTest2.loadBar();
            }
            foo = 0;
        }

        //start third loader
        loadingTest3.startBar("Test 3");

        //loop to increase completion
        for (int i = 0; i < 33; i=i) {
            foo = (int) Math.round(Math.random()*10);
            if (foo == 1){
                loadingTest3.setCompletion(loadingTest3.getCompletion()+1);
                loadingTest3.loadBar();
                i++;
            } else {
                loadingTest3.loadBar();
            }
            foo = 0;
        }

        //start fourth loader
        loadingTest4.startBar("Test 4");

        //loop to increase completion
        for (int i = 0; i < 50; i=i) {
            foo = (int) Math.round(Math.random()*10);
            if (foo == 1){
                loadingTest4.setCompletion(loadingTest4.getCompletion()+1);
                loadingTest4.loadBar();
                i++;
            } else {
                loadingTest4.loadBar();
            }
            foo = 0;
        }

        Loader spinnerTest = new Loader("spinner");
        spinnerTest.startSpinner("Test 5");
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(ex);
                throw new SecurityException("Interrupted");
            }
            spinnerTest.loadBar();
        }
    }
}