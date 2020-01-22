package jp.techacademy.takeru.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log //ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("中村", 29)   //　名前を中村、年齢29歳で、Humanのインスタンスを作る

        human.say()
        Log.d(("kotlintest", "私の名前は" + human.name + "です。")
        Log.d("kotlintest", "歳は" + human.age + "です。")
    }
}
