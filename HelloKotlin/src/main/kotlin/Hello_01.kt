fun main() {
    var num1 = 10;  // num1 변수를 정수형으로 선언하고 10으로 초기화
    var num2 = 20;  // num2 변수를 정수형으로 선언하고 20으로 초기화
    var sum = num1 + num2;
    // 문자열 Template : 문자열 내에 변수를 직접 사용하여 결과를 출력하는 방법
    println("$num1 + $num2 = $sum")

//    num1 = "String" // 이미 num1 이 정수형을 선언되어 있어서 문자열을 저장하려고 하면 type 오류가 발생

    // 초기화값없이 강제로 num3 변수를 Int형으로 선언
    // Kotlin에서는 이 방법을 별로 권장하지 않는다.
    var num3 : Int;
    num3 = 10;

    var nation : String;
    nation = "대한민국";


    // final, 상수형 변수 선언
    val korea = "대한민국";
    // val로 선언된 변수는 다시 값을 지정할 수 없다.
//    korea = "republic of Korea";

    println("$korea 은 Republic of Korea")

    for(i in 0 .. 10) {
        print("$i")
    }
    println()

    for(i in 0 .. 10 step(2)){
        println("$i")
    }

    for(i in 10 downTo 0){
        println("$i")
    }

    for(i in 10 downTo 0 step(2)){
        println("$i")
    }

    var bYes = true
    if(bYes){
        println("$bYes 는 참")
    } else {
        println("$bYes 는 거짓")
    }

    // 정수형 요소를 포함하는 배열 선언
    val array1 = intArrayOf(10,20,30,40,50,60,70)
    for( ar in array1 ){
        println("$ar")
    }
    for( ar in array1.reversed() ){
        println("$ar")
    }

    // 0부터 배열의 개수 - 1 : until
    for(i in 0 until array1.count()){
        println("${array1[i]}")
    }

    var num4 = 1
    while (num4 < 10){
        print("${num4 ++}, ")
    }
}