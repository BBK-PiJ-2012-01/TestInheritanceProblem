package junitDemo;


public class SubTwo implements Super {
    int some_other_internal_value;
    
    @Override
    public int addOne(int input) {
        return 1 + input;
    }

    @Override
    public void saveInput(int input) {
        some_other_internal_value = input;
    }
    
    public int tenTimesInternal() {
        return 10 * some_other_internal_value;
    }

}
