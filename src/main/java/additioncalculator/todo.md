## TODO
* "//"와 "\n"를 기준으로 커스텀 구분자를 추가한다
    * "//abc\n" -> abc
    * 커스텀 구분자가 한 개일 경우
    * 커스텀 구분자가 여러 개일 경우
* 구분자를 기준으로 피연산자(숫자)를 나눈다
    * 구분자가 연산식의 양 끝에 있을 경우에 예외처리 해줘야 한다
* 기본 구분자(쉼표와 콜론)로 입력값을 구분한다
    * "1,2,3" -> [1, 2, 3]
    * "1:2:3" -> [1, 2, 3]
    * "1,2:3" -> [1, 2, 3]
* 만들어진 리스트를 덧셈 계산한다.


----
## Done