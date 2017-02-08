package com.demo.rxactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.demo.R;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 2017/1/22.
 */
public abstract class BaseSearchAtivity extends AppCompatActivity{

    protected CheeseSearchEngine mCheeseSearchEngine;
    protected CheeseAdapter mAdapter;
    protected Button mSearchButton;
    protected EditText mQueryEditext;
    protected ProgressBar mProgressBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheeses);
        RecyclerView list = (RecyclerView)findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(mAdapter = new CheeseAdapter());
        mQueryEditext = (EditText)findViewById(R.id.query_edit_text);
        mSearchButton = (Button)findViewById(R.id.search_button);
        mProgressBar = (ProgressBar)findViewById(R.id.progress_bar);
        List<String> cheeses = Arrays.asList(getResources().getStringArray(R.array.cheeses));
        mCheeseSearchEngine = new CheeseSearchEngine(cheeses);
    }
    protected void showProgressBar(){
        mProgressBar.setVisibility(View.VISIBLE);
    }
    protected void hidProgressBar(){
        mProgressBar.setVisibility(View.GONE);
    }

    protected void showResult(List<String> result){
        if(result.isEmpty()){
            Toast.makeText(this,"没有发现",Toast.LENGTH_SHORT).show();
            mAdapter.setCheeses(Collections.<String>emptyList());
        }else{
            mAdapter.setCheeses(result);
        }
    }

}
