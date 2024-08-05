package crowLib;
public class ArrayUtil{
    //Clearing Int array of duplicates
	public int[] arrayClear(int[] array){
		int[] cleared = {};
		for (int i = 0; i < array.length; i++) {
			boolean duplicate = arrayIn(cleared, array[i]);
			if (duplicate == false) {
				cleared = arrayAdd(cleared, array[i]);
			}
		}
		return cleared;
	}
    //Clearing char array of duplicates
	public char[] arrayClear(char[] array){
		char[] cleared = {};
		for (int i = 0; i < array.length; i++) {
			boolean duplicate = arrayIn(cleared, array[i]);
			if (duplicate == false) {
				cleared = arrayAdd(cleared, array[i]);
			}
		}
		return cleared;
	}
	//Clearing String array of duplicates
	public String[] arrayClear(String[] array){
		String[] cleared = {};
            for (String array1 : array) {
                boolean duplicate = arrayIn(cleared, array1);
                if (duplicate == false) {
                    cleared = arrayAdd(cleared, array1);
                }
            }
		return cleared;
	}
	//Clearing Boolean array of duplicates
	public boolean[] arrayClear(boolean[] array){
		boolean[] cleared = {};
		for (int i = 0; i < array.length; i++) {
			boolean duplicate = arrayIn(cleared, array[i]);
			if (duplicate == false) {
				cleared = arrayAdd(cleared, array[i]);
			}
		}
		return cleared;
	}
	//Clearing Double array of duplicates
	public double[] arrayClear(double[] array){
		double[] cleared = {};
		for (int i = 0; i < array.length; i++) {
			boolean duplicate = arrayIn(cleared, array[i]);
			if (duplicate == false) {
				cleared = arrayAdd(cleared, array[i]);
			}
		}
		return cleared;
	}
	//Integer array printing method
    public int[] arrayPrint(int[] array){
		System.out.println(" ");
		for (int i = 0; i < array.length; i++){
			System.out.print(array[i]);
			System.out.print(" ");
		}
		return null;
	}
	//character array printing method
    public char[] arrayPrint(char[] array){
		System.out.println(" "); 
		for (int i = 0; i < array.length; i++){
			System.out.print(array[i]);
			System.out.print(" ");
		}
		return null;
	}
	//String array printing method
	public String[] arrayPrint(String[] array){
		System.out.println(" ");
            for (String array1 : array) {
                System.out.print(array1);
                System.out.print(" ");
            }
		return null;
	}
	//Boolean array printing method
	public boolean[] arrayPrint(boolean[] array){
		System.out.println(" ");
		for (int i = 0; i < array.length; i++){
			System.out.print(array[i]);
			System.out.print(" ");
		}
		return null;
	}
	//Double array printing method
	public double[] arrayPrint(double[] array){
		System.out.println(" ");
		for (int i = 0; i < array.length; i++){
			System.out.print(array[i]);
			System.out.print(" ");
		}
		return null;
	}
	//Adding to Int array
	public int[] arrayAdd(int[] array, int value) {
        int[] newarray = new int[array.length + 1];
        System.arraycopy(array, 0, newarray, 0, array.length);
        newarray[array.length] = value;
        return newarray;
    }
	//Adding to char array
	public char[] arrayAdd(char[] array, char value) {
        char[] newarray = new char[array.length + 1];
        System.arraycopy(array, 0, newarray, 0, array.length);
        newarray[array.length] = value;
        return newarray;
    }
	//Adding to String array
	public String[] arrayAdd(String[] array, String value) {
        String[] newarray = new String[array.length + 1];
        System.arraycopy(array, 0, newarray, 0, array.length);
        newarray[array.length] = value;
        return newarray;
    }
	//Adding to Boolean array
	public boolean[] arrayAdd(boolean[] array, boolean value) {
        boolean[] newarray = new boolean[array.length + 1];
        System.arraycopy(array, 0, newarray, 0, array.length);
        newarray[array.length] = value;
        return newarray;
    }
	//Adding to Double array
	public double[] arrayAdd(double[] array, double value) {
        double[] newarray = new double[array.length + 1];
        System.arraycopy(array, 0, newarray, 0, array.length);
        newarray[array.length] = value;
        return newarray;
    }
    //Checking for Value in Int array 
    public boolean arrayIn(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
    //Checking for Value in char array 
    public boolean arrayIn(char[] array, char value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
	 //Checking for Value in String array 
    public boolean arrayIn(String[] array, String value) {
            for (String array1 : array) {
                if (array1.equals(value)) {
                    return true;
                }
            }
        return false;
    }
	 //Checking for Value in Boolean array 
    public boolean arrayIn(boolean[] array, boolean value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
	 //Checking for Value in Double array 
    public boolean arrayIn(double[] array, double value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}