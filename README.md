# java-ladder
사다리타기 미션 저장소

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 기능 구현 목록
#### 입력
* 사용자 이름을 입력받는다.
    * [**예외**] 각 이름이 5글자 이내인지 확인한다.
    * [**예외**] 각 이름이 공백인지 확인한다.
    * [**예외**] 입력값이 Null인지 확인한다.
    * [**예외**] 중복된 이름이 있는지 확인한다.
    * [**예외**] 공백문자로만 이루어진 이름이 있는지 확인한다.
	
* 사다리의 높이를 입력받는다.
    * [**예외**] 입력값이 숫자가 아닐 경우를 확인한다.
    * [**예외**] 높이가 1이상인 자연수인지 확인한다.
	
* 상품의 이름을 입력받는다.
    * [**예외**] 플레이어와 상품의 갯수가 동일한지 확인한다.
	
* 결과를 보고 싶은 플레이어의 이름을 입력받는다.
    * [**예외**] 존재하지 않는 플레이어의 입력값을 받았을 경우를 확인한다.

#### 로직 구현
* 사다리를 생성한다.
    * 가로선을 기준으로 Boolean 값을 갖는 이중 리스트를 생성한다.	

* 사다리 게임을 실행한다.
	* 사다리 정보를 기준으로 플레이어의 위치를 바꿔준다.

#### 출력
* 생성된 사다리 결과를 출력한다.