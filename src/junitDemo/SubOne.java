package junitDemo;


public class SubOne implements Super {
    int internal_variable;
    
    @Override
    public int addOne(int input) {
        return input + 1;
    }

    @Override
    public void saveInput(int input) {
        internal_variable = input;
    }
    
    public int fiveTimesInternal() {
        return 5 * internal_variable;
    }

}
