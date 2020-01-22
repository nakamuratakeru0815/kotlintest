package jp.techacademy.takeru.kotlintest

abstract  class  Animal {
    //プロパティ
    var name: String
    var age: Int

    //引数付きコンストラク
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    abstract fun say()
}