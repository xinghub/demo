package com.demo.rxactivity;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 2017/1/23.
 */
public class CheeseSearchEngine {
    private final int mCheesesCount;
    private final List<String> mCheess;

    public CheeseSearchEngine(List<String> cheese){
        mCheess = cheese;
        mCheesesCount = cheese.size();
    }
    public List<String> search(String query){
        query = query.toLowerCase();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> result = new LinkedList<>();
        for(int i=0;i<mCheesesCount;i++){
            if(mCheess.get(i).toLowerCase().contains(query)){
                result.add(mCheess.get(i));
            }
        }
        return result;
    }
}
