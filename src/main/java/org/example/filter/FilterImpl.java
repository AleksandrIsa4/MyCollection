package org.example.filter;

public class FilterImpl implements Filter {

    @Override
    public Object apply(Object o){
        if(o instanceof String){
            return o+"+1";
        } else if (o instanceof Integer) {
            return (Object)(((Integer) o).intValue() +1);
        } else{
            return o;
        }
    }
}
