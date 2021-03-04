# java.util.Scanner 클래스
- [참고사이트](https://www.cs.utexas.edu/users/ndale/Scanner.html)
- 파일, 화면, 문자열 같은 입력 소스로 부터 문자 데이터를 읽어오는데 사용
- 입력 받을 값이 숫자 : nextInt(), nextLong(), nextDouble() ...

### 클래스 생성자

1. InputStream 객체를 파라미터로 하는 생성자
2. FileReader 객체를 파라미터로 하는 생성자
```
Scanner in = new Scanner(System.in);  // System.in is an InputStream

Scanner inFile = new Scanner(new FileReader("myFile"));
```

### java.util.Scanner.nextInt()
```
Returns the next token as an int. If the next token is not an integer, InputMismatchException is thrown.
```


### token?
- Scanner 는 입력에서 token 을 찾는다.
- token : 문자들이 연속된 되어 whitespace 로 끝나는 것
    > whitespace character : 공백, 탭, 캐리지 리턴, eof

- 일련의 숫자들이 공백으로 나뉘어진 한 줄을 읽을 경우 Scanner 는 각 숫자를 별도의 토큰으로 판단한다.

- 각 값의 타입에맞는 메소드가 읽어들인다.

- 숫자 값들이 공백으로 구분된 한줄에 있거나 각 줄별로 구분되어있을 수 있다.

### 숫자 메소드
> nextInt(), nextLong(), nextFloat(), nextDouble()

- whitespace 문자들은 구분자 처럼 작용한다.
- 작은 자료형인 숫자가 큰 자료형인 숫자 메소드의 입력으로 들어오는 것은 괜찮음 
    > 반대는 안됨


### nextLine()
- 한줄의 나머지를 읽는다.
- string 으로 리턴


### Scanner 를 사용해서 숫자, 문자열을 입력받을떄 주의사항 : 개행처리
- 케리지 리턴   : 소비는 되는데 string 에 추가되지않음
- 숫자입력      : whitepsace 를 소비하지 않는다.

>>>>>>> 숫자 값을 읽어이고 입력된 줄의 마지막에 숫자 값을 또 읽어들인 다음에
        nextLine() 을 호출할경우 엔터가 그대로 남아있어 빈문자열을 리턴한다.
   



