package crowLib;
//Include this class in Package CrowLib


public class Loader{

    //Define Attributes
    int completion = 0;//percentage of completion
    String mainType = "";//visuals of loader
    int spinnerState = 0;//visual position of spinner
    String secondaryType = "spinner";//visuals of Spinner


    //class constructor
    public Loader(String type){
        mainType = type;//get the type information
    }

    public void loadBar(){
        
        if (!mainType.toLowerCase().equals("spinner")){//spinners work different from loading bars (duh)

            for (int i = 0; i < 100; i++) {//remove old bar
                System.out.print("\b");
            }

            //print the completed part of the loader
            for (int i = 0; i < completion; i++) {
                switch (mainType.toLowerCase()) {//decides which visual to load
                    case "dot" -> System.out.print("|");
                    case "bar" -> System.out.print("█");
                    case "line" -> System.out.print("═");
                    default -> System.out.print("▓");
                }
            }

            //print the incomplete part of the loader
            for (int i = 0; i < 100 - completion; i++) {
                switch (mainType.toLowerCase()) {//decides which visual to load
                    case "dot" -> System.out.print(".");
                    case "bar" -> System.out.print("░");
                    case "line" -> System.out.print("-");
                    default -> System.out.print("»");
                }
            }


        } else {
            switch(secondaryType){//remove old type
                case "spinner" -> System.out.print("\b");
                case "dots" -> System.out.print("\b\b\b");
            }

            switch (spinnerState) {
                case 0 -> {
                    switch(secondaryType){
                        case "spinner" -> System.out.print("/");
                        case "dots" -> System.out.print(".  ");
                    }
                    spinnerState = 1;
                }
                case 1 -> {
                    switch(secondaryType){
                        case "spinner" -> System.out.print("-");
                        case "dots" -> System.out.print(".. ");
                    }
                    spinnerState = 2;
                }
                case 2 -> {
                    switch(secondaryType){
                        case "spinner" -> System.out.print("\\");
                        case "dots" -> System.out.print("...");
                    }
                    spinnerState = 3;
                }
                case 3 -> {
                    switch(secondaryType){
                        case "spinner" -> System.out.print("|");
                        case "dots" -> System.out.print("   ");
                    }
                    spinnerState = 0;
                }
            }


        }
        
    }

    //sets the amount that the bar is completed (in percent)
    public void setCompletion(int value){
        if (value > 100) completion = 100; else completion = value;
    }

    //returns the percentage of completion
    public int getCompletion(){
        return completion;
    }

    //initializes the loader
    public void startBar(String title){

        //prints title
        System.out.println("\nLoading: " + title.toUpperCase());

        //loads loader
        loadBar();
    }

    public void startSpinner(String title){
        System.out.print("\nLoading: "+title+" ");
        switch(secondaryType){
            case "spinner" -> System.out.print("|");
            case "dots" -> System.out.print(" ");
        }
        loadBar();
    }

    public void setSpinnerType(String type){
        secondaryType = type;
    }

}


