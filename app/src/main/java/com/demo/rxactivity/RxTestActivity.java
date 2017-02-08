/*
package com.demo.rxactivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.demo.R;

import org.reactivestreams.Subscriber;

import java.io.File;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;


public class RxTestActivity extends AppCompatActivity {

    private String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_test);
    }


    //例子1
    private void doObservable1 (){
        Observable<String> observable1 =
                Observable.just
                        ("也许当初忙着微笑和哭泣","忙着追逐天空中的流星","人理所当然的忘记","是谁风里雨里一直默默守护在原地");
        Subscriber subscriber = new Subscriber() {
            @Override
            public void onCompleted() {
                Log.e(TAG,"onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG,"onError:");
            }

            @Override
            public void onNext(Object o) {
                Log.e(TAG,"onNext:"+o);
            }
        };
        observable1.subscribe(subscriber);
    }

    private void doObservable2(){
        Observable<String> observable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("大家好");
                subscriber.onNext("我开始学习RxJava");
                subscriber.onCompleted();
            }
        });
        Subscriber subscriber = new Subscriber() {
            @Override
            public void onCompleted() {
                Log.e(TAG,"onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG,"onError");
            }

            @Override
            public void onNext(Object o) {
                Log.e(TAG,"onNext:"+o);
            }
        };
        observable.subscribe(subscriber);
    }

    private void doObservable3(){
        Integer[] integers = {1,2,3,4};
        Observable<Integer> observable = Observable.from(integers);
        Subscriber subscriber = new Subscriber() {
            @Override
            public void onCompleted() {
                Log.e(TAG,"onCompleted:");
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG,"onError:");
            }

            @Override
            public void onNext(Object o) {
                Log.e(TAG,"onNext:"+o);
            }
        };
        observable.subscribe(subscriber);
    }

    private void doObservable4(){
        Observable.just(1,2,3,4).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Log.e(TAG, "onCompleted: ");
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: ");
            }

            @Override
            public void onNext(Integer integer) {
                Log.e(TAG, "onNext: " + integer);
            }
        });
    }

    private void doObservable5(){
        Integer[] integers = {0,9,6,4,8};
        Observable.from(integers).map(new Func1<Integer, Boolean>() {

            @Override
            public Boolean call(Integer integer) {
                Log.e(TAG, "call: "+integer);
                return (integer >5 );
            }
        }).subscribe(new Subscriber<Boolean>() {
            @Override
            public void onCompleted() {
                Log.e(TAG, "onCompleted: ");
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: ");
            }

            @Override
            public void onNext(Boolean aBoolean) {
                Log.e(TAG, "onNext: "+aBoolean);
            }
        });
    }

    private void doObservable6(){
        String path = Environment.getExternalStorageDirectory()+ File.separator+"aaa.jpg";
        Observable.just(path)
                .subscribeOn(Schedulers.io())
                .map(new Func1<String,Bitmap>() {
                    @Override
                    public Bitmap call(String s) {
                        Bitmap bitmap = BitmapFactory.decodeFile(s);
                        return bitmap;
                    }
                }).map(new Func1<Bitmap,ImageView>() {
            @Override
            public ImageView call(Bitmap bitmap) {

                return null;
            }
        });
    }
}
*/
